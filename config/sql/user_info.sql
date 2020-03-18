CREATE TABLE `user_info` (
  `user_id` int(11) DEFAULT NULL,
  `user_name` varchar(500) DEFAULT NULL,
  `user_pwd` varchar(500) DEFAULT NULL,
  `user_email` varchar(500) DEFAULT NULL,
  `user_phone` int(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8

INSERT INTO user_info(user_id,user_name, user_pwd, user_email, user_phone) VALUES (1, 'user0', 'abc000', 'user0@insurance.com',88880000);
INSERT INTO user_info(user_id,user_name, user_pwd, user_email, user_phone) VALUES (2, 'user1', 'abc001', 'user1@insurance.com',88881111);