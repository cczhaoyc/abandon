--用户表
CREATE TABLE `idb`.`sys_user` (
  `id` INT NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` VARCHAR(64) NOT NULL COMMENT '用户名',
  `password` VARCHAR(64) NOT NULL COMMENT '密码',
  `phone` VARCHAR(32) NULL COMMENT '电话号码',
  PRIMARY KEY (`id`))
COMMENT = '用户表';
