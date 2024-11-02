use backend;
create table usuario(
id int not null primary key auto_increment,
documento varchar (100),
nombre  varchar (150),
correo varchar (150),
contraseña varchar(30)
);

create table evento (
id int not null primary key auto_increment,
nombre varchar (100),
lugar  varchar (150),
descripcion varchar (150),
fecha date,
disponibilidad int,
hora datetime
)