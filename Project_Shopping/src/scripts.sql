CREATE TABLE `product_new`(`id` int(11) NOT NULL auto_increment,`product_name` varchar(20) default NULL,`category` varchar(20) default NULL,`price` double default NULL,`stock` int(11) default NULL,`remark` varchar(100) default NULL,PRIMARY KEY  (`id`) ) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1 ;
insert into product (product_name, category,price,stock,remark) values('MotoG4','mobile',12000.00,30,'3GB RAM 32GB Memory');
insert into product (product_name, category,price,stock,remark) values('MotoG4 Plus','mobile',13000.00,20,'4GB RAM 64GB Memory');
insert into product (product_name, category,price,stock,remark) values('MotoG5','mobile',14000.00,40,'3GB RAM 32GB Memory');
insert into product (product_name, category,price,stock,remark) values('MotoG5 Plus','mobile',14000.00,30,'4GB RAM 64GB Memory');

insert into product (product_name, category,price,stock,remark) values('HP X1 Laptop','laptop',40000,10,'i3 4GB RAM 250GB HDD');
insert into product (product_name, category,price,stock,remark) values('HP X2 Laptop','laptop',45000,15,'i5 4GB RAM 250GB HDD');
insert into product (product_name, category,price,stock,remark) values('HP G1 Laptop','laptop',55000,15,'i5 8GB RAM 250GB SDD');
insert into product (product_name, category,price,stock,remark) values('HP G2 Laptop','laptop',70000,10,'i7 8GB RAM 500GB SDD');

insert into product (product_name, category,price,stock,remark) values('LG 32 Inch','television',15000,10,'HD Ready');
insert into product (product_name, category,price,stock,remark) values('LG 32 Inch','television',20000,10,'Full HD ');
insert into product (product_name, category,price,stock,remark) values('Samsung 32 Inch','television',17000,8,'HD Ready');
insert into product (product_name, category,price,stock,remark) values('Samsung 32 Inch','television',21000,15,'Full HD');