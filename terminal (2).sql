-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 30-03-2020 a las 16:26:01
-- Versión del servidor: 10.4.11-MariaDB
-- Versión de PHP: 7.4.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `terminal`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `asiento`
--

CREATE TABLE `asiento` (
  `id` int(10) NOT NULL,
  `numero_Asiento` int(10) DEFAULT NULL,
  `estado` int(1) DEFAULT NULL,
  `id_Bus` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `asiento`
--

INSERT INTO `asiento` (`id`, `numero_Asiento`, `estado`, `id_Bus`) VALUES
(1, 1, 0, 1),
(2, 2, 0, 1),
(3, 3, 0, 1),
(4, 4, 0, 1),
(5, 5, 0, 1),
(6, 6, 0, 1),
(7, 7, 0, 1),
(8, 8, 0, 1),
(9, 9, 0, 1),
(10, 10, 0, 1),
(11, 11, 0, 1),
(12, 12, 0, 1),
(13, 13, 0, 1),
(14, 14, 0, 1),
(15, 15, 0, 1),
(16, 16, 0, 1),
(17, 17, 0, 1),
(18, 18, 0, 1),
(19, 19, 0, 1),
(20, 20, 0, 1),
(21, 21, 0, 1),
(22, 22, 0, 1),
(23, 23, 0, 1),
(24, 24, 0, 1),
(25, 25, 0, 1),
(26, 26, 0, 1),
(27, 27, 0, 1),
(28, 28, 0, 1),
(29, 29, 0, 1),
(30, 30, 0, 1),
(31, 31, 0, 1),
(32, 32, 0, 1),
(33, 33, 0, 1),
(34, 34, 0, 1),
(35, 35, 0, 1),
(36, 36, 0, 1),
(1153, 1, 0, 36),
(1154, 2, 0, 36),
(1155, 3, 0, 36),
(1156, 4, 0, 36),
(1157, 5, 0, 36),
(1158, 6, 0, 36),
(1159, 7, 0, 36),
(1160, 8, 2, 36),
(1161, 9, 0, 36),
(1162, 10, 0, 36),
(1163, 11, 0, 36),
(1164, 12, 0, 36),
(1165, 13, 0, 36),
(1166, 14, 0, 36),
(1167, 15, 0, 36),
(1168, 16, 0, 36),
(1169, 17, 0, 36),
(1170, 18, 0, 36),
(1171, 19, 0, 36),
(1172, 20, 0, 36),
(1173, 21, 0, 36),
(1174, 22, 0, 36),
(1175, 23, 0, 36),
(1176, 24, 0, 36),
(1177, 25, 0, 36),
(1178, 26, 0, 36),
(1179, 27, 0, 36),
(1180, 28, 0, 36),
(1181, 29, 0, 36),
(1182, 30, 0, 36),
(1183, 31, 0, 36),
(1184, 32, 0, 36),
(1185, 33, 0, 36),
(1186, 34, 0, 36),
(1187, 35, 0, 36),
(1188, 36, 0, 36),
(1225, 1, 0, 38),
(1226, 2, 0, 38),
(1227, 3, 0, 38),
(1228, 4, 0, 38),
(1229, 5, 0, 38),
(1230, 6, 0, 38),
(1231, 7, 0, 38),
(1232, 8, 0, 38),
(1233, 9, 0, 38),
(1234, 10, 0, 38),
(1235, 11, 0, 38),
(1236, 12, 0, 38),
(1237, 13, 0, 38),
(1238, 14, 0, 38),
(1239, 15, 0, 38),
(1240, 16, 0, 38),
(1241, 17, 0, 38),
(1242, 18, 0, 38),
(1243, 19, 0, 38),
(1244, 20, 2, 38),
(1245, 21, 0, 38),
(1246, 22, 0, 38),
(1247, 23, 0, 38),
(1248, 24, 0, 38),
(1249, 25, 0, 38),
(1250, 26, 0, 38),
(1251, 27, 0, 38),
(1252, 28, 0, 38),
(1253, 29, 0, 38),
(1254, 30, 0, 38),
(1255, 31, 0, 38),
(1256, 32, 0, 38),
(1257, 33, 0, 38),
(1258, 34, 0, 38),
(1259, 35, 0, 38),
(1260, 36, 0, 38),
(1261, 1, 0, 39),
(1262, 2, 0, 39),
(1263, 3, 0, 39),
(1264, 4, 0, 39),
(1265, 5, 0, 39),
(1266, 6, 2, 39),
(1267, 7, 0, 39),
(1268, 8, 0, 39),
(1269, 9, 0, 39),
(1270, 10, 0, 39),
(1271, 11, 0, 39),
(1272, 12, 0, 39),
(1273, 13, 0, 39),
(1274, 14, 0, 39),
(1275, 15, 0, 39),
(1276, 16, 0, 39),
(1277, 17, 0, 39),
(1278, 18, 0, 39),
(1279, 19, 0, 39),
(1280, 20, 0, 39),
(1281, 21, 0, 39),
(1282, 22, 0, 39),
(1283, 23, 0, 39),
(1284, 24, 0, 39),
(1285, 25, 0, 39),
(1286, 26, 0, 39),
(1287, 27, 0, 39),
(1288, 28, 0, 39),
(1289, 29, 0, 39),
(1290, 30, 0, 39),
(1291, 31, 0, 39),
(1292, 32, 0, 39),
(1293, 33, 0, 39),
(1294, 34, 0, 39),
(1295, 35, 0, 39),
(1296, 36, 0, 39);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `bus`
--

CREATE TABLE `bus` (
  `id` int(10) NOT NULL,
  `id_Viaje` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `bus`
--

INSERT INTO `bus` (`id`, `id_Viaje`) VALUES
(1, 1),
(36, 44),
(38, 46),
(39, 47);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ciudad`
--

CREATE TABLE `ciudad` (
  `id` int(11) NOT NULL,
  `nombre` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `ciudad`
--

INSERT INTO `ciudad` (`id`, `nombre`) VALUES
(1, 'Iquique'),
(2, 'Antofagasta'),
(3, 'Copiapo'),
(4, 'La Serena'),
(5, 'Valparaiso'),
(6, 'Santiago'),
(7, 'Rancagua'),
(8, 'Talca'),
(9, 'Concepcion'),
(10, 'Temuco'),
(11, 'Valdivia'),
(12, 'Puerto montt');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `viaje`
--

CREATE TABLE `viaje` (
  `id` int(10) NOT NULL,
  `origen` varchar(255) DEFAULT NULL,
  `destino` varchar(255) DEFAULT NULL,
  `fecha` varchar(255) DEFAULT NULL,
  `hora_Salida` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `viaje`
--

INSERT INTO `viaje` (`id`, `origen`, `destino`, `fecha`, `hora_Salida`) VALUES
(1, 'Santiago', 'Temuco', '12-03-2020', '13:00'),
(44, 'Antofagasta', 'La Serena', '2020-03-27', '16:00'),
(46, 'Iquique', 'Puerto montt', '2020-03-14', '13:00'),
(47, 'La Serena', 'Rancagua', '2020-03-20', '20:00');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `asiento`
--
ALTER TABLE `asiento`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKcgdyvmv4iobqv2no968aeq74l` (`id_Bus`);

--
-- Indices de la tabla `bus`
--
ALTER TABLE `bus`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKi2y8nf0yko1jrt51m4ck6jsqo` (`id_Viaje`);

--
-- Indices de la tabla `ciudad`
--
ALTER TABLE `ciudad`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `viaje`
--
ALTER TABLE `viaje`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `asiento`
--
ALTER TABLE `asiento`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1297;

--
-- AUTO_INCREMENT de la tabla `bus`
--
ALTER TABLE `bus`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=40;

--
-- AUTO_INCREMENT de la tabla `ciudad`
--
ALTER TABLE `ciudad`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=40;

--
-- AUTO_INCREMENT de la tabla `viaje`
--
ALTER TABLE `viaje`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=48;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `asiento`
--
ALTER TABLE `asiento`
  ADD CONSTRAINT `FKasiento573441` FOREIGN KEY (`id_Bus`) REFERENCES `bus` (`id`),
  ADD CONSTRAINT `FKcgdyvmv4iobqv2no968aeq74l` FOREIGN KEY (`id_Bus`) REFERENCES `bus` (`id`);

--
-- Filtros para la tabla `bus`
--
ALTER TABLE `bus`
  ADD CONSTRAINT `FKbus735664` FOREIGN KEY (`id_Viaje`) REFERENCES `viaje` (`id`),
  ADD CONSTRAINT `FKi2y8nf0yko1jrt51m4ck6jsqo` FOREIGN KEY (`id_Viaje`) REFERENCES `viaje` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
