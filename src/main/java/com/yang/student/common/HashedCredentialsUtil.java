package com.yang.student.common;

import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;

public class HashedCredentialsUtil {
	
	public static String getSimpleHash(String source, String salt) {
		ByteSource byteSource = ByteSource.Util.bytes(salt);
		SimpleHash hash = new SimpleHash(HashedCredentialsConstant.HASH_ALGORITHM_NAME, source, byteSource, HashedCredentialsConstant.HASH_ITERATIONS);
		return hash.toString();
	}
	
	public static String getSimpleHash(String algorithmName, String source, String salt, int hashIterations) {
		ByteSource byteSource = ByteSource.Util.bytes(salt);
		SimpleHash hash = new SimpleHash(algorithmName, source, byteSource, hashIterations);
		return hash.toString();
	}
	
	public static void main(String[] args) {
		String hash = HashedCredentialsUtil.getSimpleHash("1", "yang");
		System.out.println(hash);
	}
}
