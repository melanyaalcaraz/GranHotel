-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 21-06-2022 a las 20:23:48
-- Versión del servidor: 10.4.19-MariaDB
-- Versión de PHP: 8.0.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `granhotel`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `categoria`
--

CREATE TABLE `categoria` (
  `idCategoria` int(11) NOT NULL,
  `cantPersonas` int(11) NOT NULL,
  `cantCamas` int(11) NOT NULL,
  `tipoCamas` varchar(15) NOT NULL,
  `tipoHabitacion` varchar(11) NOT NULL,
  `precio` double NOT NULL,
  `activo` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `categoria`
--

INSERT INTO `categoria` (`idCategoria`, `cantPersonas`, `cantCamas`, `tipoCamas`, `tipoHabitacion`, `precio`, `activo`) VALUES
(1, 5, 5, 'single', 'quintuple', 0, 0),
(5, 4, 4, ' queen', 'cuadruple', 100, 1),
(6, 2, 1, 'king', 'doble', 100, 1),
(7, 3, 3, 'single', 'triple', 1500, 1),
(8, 1, 1, 'single', 'single', 100, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `habitacion`
--

CREATE TABLE `habitacion` (
  `idHabitacion` int(11) NOT NULL,
  `idCategoria` int(1) NOT NULL,
  `nmroHabitacion` int(11) NOT NULL,
  `piso` int(11) NOT NULL,
  `refaccion` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `habitacion`
--

INSERT INTO `habitacion` (`idHabitacion`, `idCategoria`, `nmroHabitacion`, `piso`, `refaccion`) VALUES
(1, 1, 111, 1, 1),
(2, 1, 112, 1, 0),
(3, 1, 113, 1, 1),
(4, 1, 114, 1, 0),
(5, 7, 115, 1, 1),
(6, 6, 116, 2, 0),
(19, 5, 117, 1, 0),
(21, 8, 118, 2, 0),
(22, 5, 119, 2, 1),
(23, 6, 120, 1, 0),
(24, 6, 121, 2, 1),
(25, 8, 122, 1, 1),
(26, 5, 123, 1, 1),
(27, 7, 124, 1, 1),
(28, 7, 125, 1, 1),
(29, 6, 126, 1, 1),
(30, 5, 127, 1, 1),
(32, 1, 128, 3, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `huesped`
--

CREATE TABLE `huesped` (
  `idHuesped` int(11) NOT NULL,
  `nombre` char(25) NOT NULL,
  `apellido` char(25) NOT NULL,
  `dni` int(20) NOT NULL,
  `domicilio` char(30) NOT NULL,
  `correo` char(30) NOT NULL,
  `celular` varchar(30) NOT NULL,
  `activo` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `huesped`
--

INSERT INTO `huesped` (`idHuesped`, `nombre`, `apellido`, `dni`, `domicilio`, `correo`, `celular`, `activo`) VALUES
(101, 'Rocio', 'Amaya', 123, 'asd', 'asd@', '123123', 1),
(102, 'Melina', 'Lopez', 456, 'qwe', 'asd@', '123123', 1),
(103, 'Marta', 'Juarez', 789, 'xzc', 'asd@', '123123', 1),
(104, 'Luciano', 'Moreira', 101112, 'qwe', 'asd@', '123123', 1),
(105, 'Maria', 'Perez', 12, 'abejas', '@correo', '1234', 1),
(106, 'Lucia', 'Celi', 415, 'luciernagas', '@correo1', '4321', 1),
(107, 'Benjamin', 'Bilotta', 784, 'mariposas', '@correo3', '741258', 1),
(109, 'Julian', 'Becerra', 759, 'sjsj', '@correo5', '747458', 1),
(110, 'Julia', 'Cerra', 758, 'sjsj', '@correo7', '765458', 1),
(113, 'Marcos', 'Rosalez', 358, 'sisj', '@correo8', '795458', 1),
(114, 'Kira', 'Yukimura', 12345, 'Beacon Hills', 'correito@', '45693', 0),
(116, 'Micaela', 'Alcaraz', 1274, 'Los Parairsos', 'micaal@gmail.com', '45612', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reserva`
--

CREATE TABLE `reserva` (
  `idReserva` int(11) NOT NULL,
  `idHabitacion` int(11) NOT NULL,
  `idHuesped` int(11) NOT NULL,
  `fechaInicio` date NOT NULL,
  `fechaFin` date NOT NULL,
  `precioTotal` double NOT NULL,
  `cantPersonas` int(11) NOT NULL,
  `activo` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `reserva`
--

INSERT INTO `reserva` (`idReserva`, `idHabitacion`, `idHuesped`, `fechaInicio`, `fechaFin`, `precioTotal`, `cantPersonas`, `activo`) VALUES
(1, 1, 102, '0000-00-00', '0000-00-00', 4000, 2, 1),
(3, 3, 103, '2022-06-27', '2022-06-29', 7000, 2, 1),
(4, 4, 104, '2022-06-27', '2022-06-29', 7000, 2, 1),
(5, 19, 103, '2022-06-17', '2022-06-19', 1500, 2, 1),
(6, 6, 102, '2022-06-17', '2022-06-19', 5000, 2, 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `categoria`
--
ALTER TABLE `categoria`
  ADD PRIMARY KEY (`idCategoria`);

--
-- Indices de la tabla `habitacion`
--
ALTER TABLE `habitacion`
  ADD PRIMARY KEY (`idHabitacion`),
  ADD KEY `idCategoria` (`idCategoria`);

--
-- Indices de la tabla `huesped`
--
ALTER TABLE `huesped`
  ADD PRIMARY KEY (`idHuesped`),
  ADD UNIQUE KEY `dni` (`dni`);

--
-- Indices de la tabla `reserva`
--
ALTER TABLE `reserva`
  ADD PRIMARY KEY (`idReserva`),
  ADD KEY `reserva_ibfk_1` (`idHabitacion`),
  ADD KEY `idHuesped` (`idHuesped`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `categoria`
--
ALTER TABLE `categoria`
  MODIFY `idCategoria` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de la tabla `habitacion`
--
ALTER TABLE `habitacion`
  MODIFY `idHabitacion` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=33;

--
-- AUTO_INCREMENT de la tabla `huesped`
--
ALTER TABLE `huesped`
  MODIFY `idHuesped` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=117;

--
-- AUTO_INCREMENT de la tabla `reserva`
--
ALTER TABLE `reserva`
  MODIFY `idReserva` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `habitacion`
--
ALTER TABLE `habitacion`
  ADD CONSTRAINT `habitacion_ibfk_1` FOREIGN KEY (`idCategoria`) REFERENCES `categoria` (`idCategoria`);

--
-- Filtros para la tabla `reserva`
--
ALTER TABLE `reserva`
  ADD CONSTRAINT `reserva_ibfk_1` FOREIGN KEY (`idHabitacion`) REFERENCES `habitacion` (`idHabitacion`),
  ADD CONSTRAINT `reserva_ibfk_2` FOREIGN KEY (`idHuesped`) REFERENCES `huesped` (`idHuesped`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
