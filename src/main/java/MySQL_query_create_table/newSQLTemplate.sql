/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  camil
 * Created: Feb 18, 2024
 */

DROP DATABASE IF EXISTS bookvault;

CREATE DATABASE bookvault;

USE bookvault;

CREATE TABLE IF NOT EXISTS events (
    event_id INT PRIMARY KEY AUTO_INCREMENT,
    event_name VARCHAR(255) NOT NULL,
    event_description TEXT NOT NULL,
    event_activities TEXT NOT NULL,
    admission_fees DECIMAL(4, 2) NOT NULL
    
);