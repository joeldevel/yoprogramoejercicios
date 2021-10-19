-- Listar las publicaciones
SELECT * FROM publicacion;
-- Mostrar la publicación con menos visitas
SELECT * FROM publicacion ORDER BY visitas ASC LIMIT 1;
-- Mostrar la publicación con mas visitas
SELECT * FROM publicacion ORDER BY visitas DESC LIMIT 1;
-- Mostrar la cantidad de favoritos
SELECT COUNT(*) FROM favoritos;
-- Listar los id de las publicaciones que fueron agregadas a favoritos
SELECT p_id FROM favoritos;
-- Listar los alias de los usuarios que agregaron a favoritos
SELECT DISTINCT u_nombre FROM favoritos;
-- Listar los usuarios formateando las fechas a formato DIA-MES-ANIO
SELECT alias, nombre, genero, f_nacimiento, STRFTIME('%d-%m-%Y', f_registro) FROM usuario;
-- Listar las publicaciones que tengan mas de 100 visitas, mostrando primero las mas recientes
SELECT * FROM publicacion where visitas > 100 ORDER BY f_publicacion DESC;
-- Listar las publicaciones que tengan mas de 100 visitas y sean del ultimo año, mostrando primero las mas recientes
-- Listar las publicaciones que tengan mas de 100 visitas y sean de los últimos 6 meses, mostrando primero las mas recientes
-- Mostrar la cantidad de visitas de las publicaciones de los últimos 6 meses
-- Listar el alias, fecha de nacimiento y edad de los usuarios
SELECT alias, f_nacimiento from usuario;
-- Mostrar el promedio de edades de los usuarios
-- Listar los usuarios mayores de edad, ordenándolos de menor a mayor edad
-- Listar los 10 usuarios mas chicos(en edad), ordenados por genero, y si su genero es el mismo por su nombre
-- Listar los usuarios llamados 'Juan'
-- Listar los usuarios que hayan creado una publicación y su alias comience con 'a', el alias debe mostrarse en mayúscula
-- Listar las publicaciones con un contenido de menos de 20 caracteres
-- Listar las publicaciones recortando el contenido a 20 caracteres
