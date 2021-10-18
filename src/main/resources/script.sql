create table Receipe (id integer not null auto_increment, 
name varchar(255), 
image varchar(255), 
category varchar(255), 
label varchar(255), 
price DOUBLE(10, 4),
description varchar(255),
primary key (id)) ENGINE=InnoDB;

	
INSERT INTO Receipe(name,image,category,label,price,description)
VALUES ('Uthappizza','https://i.imgur.com/tDnjTXf.jpg','mains','Hot', 4.99, 'A unique combination of Indian Uthappam (pancake) and Italian pizza');

INSERT INTO Receipe(name,image,category,label,price,description)
VALUES ('Zucchipakoda','https://i.imgur.com/xkUElXq.jpg','appetizer','', 1.99, 'Deep fried Zucchini coated with mildly spiced Chickpea flour batter accompanied with a sweet-tangy tamarind sauce');

INSERT INTO Receipe(name,image,category,label,price,description)
VALUES ('Vadonut','https://i.imgur.com/anUAlqF.jpg','appetizer','New', 1.99, 'A quintessential ConFusion experience, is it a vada or is it a donut?');

INSERT INTO Receipe(name,image,category,label,price,description)
VALUES ('ElaiCheese Cake','https://i.imgur.com/c5hBTEW.jpg','dessert','', 2.99, 'A delectable, semi-sweet New York Style Cheese Cake, with Graham cracker crust and spiced with Indian cardamoms');

INSERT INTO Receipe(name,image,category,label,price,description)
VALUES ('Guntur chillies','https://i.imgur.com/Vc9JIXP.jpg','appetizer','Spicy', 0.99, 'Assorted chillies from Guntur');

INSERT INTO Receipe(name,image,category,label,price,description)
VALUES ('Buffalo Paneer','https://i.imgur.com/pH2tkgk.jpg','appetizer','', 5.99, 'A special type of Paneer made from Buffalo milk');