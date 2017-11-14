CREATE TABLE USER(
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR (100)
);

CREATE TABLE HIGHWAY(
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR (100) UNIQUE NOT NULL,
    distance INT
);

CREATE TABLE INCIDENT(
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR (100),
    type VARCHAR (100),
    distance INT,
    highway_id INT,
    CONSTRAINT FK_HighwayId FOREIGN KEY (highway_id) REFERENCES HIGHWAY(id)
);

CREATE TABLE USER_INCIDENT(
    id INT PRIMARY KEY AUTO_INCREMENT,
    user_id INT,
    incident_id INT,
    CONSTRAINT FK_UserId FOREIGN KEY (user_id) REFERENCES USER(id),
    CONSTRAINT FK_incidentId FOREIGN KEY (incident_id) REFERENCES INCIDENT(id)

);