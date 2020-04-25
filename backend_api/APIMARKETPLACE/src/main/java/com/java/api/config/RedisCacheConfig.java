package com.java.api.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisClientConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericToStringSerializer;
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@Configuration
@EnableCaching
public class RedisCacheConfig extends CachingConfigurerSupport {
	@Autowired
	private Environment env;

	@Bean
	public JedisConnectionFactory jedisConnectionFactory() {
		String redisHost = env.getProperty("spring.redis.host");
		int redisPort = Integer.parseInt(env.getProperty("spring.redis.port"));
		System.out.println("Redis port--" + redisPort);
		RedisStandaloneConfiguration configuration = new RedisStandaloneConfiguration(redisHost, redisPort);
		JedisClientConfiguration jedisClientConfiguration = JedisClientConfiguration.builder().usePooling().build();
		JedisConnectionFactory factory = new JedisConnectionFactory(configuration, jedisClientConfiguration);
		factory.afterPropertiesSet();
		return factory;
	}

	@Bean
	public RedisTemplate<String,Object> redisTemplate(RedisConnectionFactory cf) {
		 final RedisTemplate<String,Object> redisTemplate = new RedisTemplate<>();
	        redisTemplate.setKeySerializer(new StringRedisSerializer());
	        redisTemplate.setHashKeySerializer(new GenericToStringSerializer<Object>(Object.class));
	        redisTemplate.setHashValueSerializer(new JdkSerializationRedisSerializer());
	        redisTemplate.setValueSerializer(new JdkSerializationRedisSerializer());
	        redisTemplate.setConnectionFactory(jedisConnectionFactory());
	        return redisTemplate;
	}

//    @Bean
//    @Primary
//    public CacheManager cacheManager2(RedisTemplate redisTemplate) {
//        RedisCacheManager cacheManager = new RedisCacheManager(redisTemplate);
//        // Number of seconds before expiration. Defaults to unlimited (0)
//        cacheManager.setDefaultExpiration(20);
//        cacheManager.setUsePrefix(true);
//        return cacheManager;
//    }
//
//
//    @Bean
//    public CacheManager cacheManager1(RedisTemplate redisTemplate) {
//        RedisCacheManager cacheManager = new RedisCacheManager(redisTemplate);
//        // Number of seconds before expiration. Defaults to unlimited (0)
//        cacheManager.setDefaultExpiration(60);
//        cacheManager.setUsePrefix(true);
//        return cacheManager;
//    }

}
