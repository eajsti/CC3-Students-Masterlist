DROP TABLE IF EXISTS tbl_repositorydb;

CREATE TABLE tbl_repositorydb (
    StudentID   INTEGER PRIMARY KEY AUTOINCREMENT,
    Firstname   TEXT,
    Surname     TEXT,
    Age         INTEGER,
    Gender      TEXT,
    Year        INTEGER,
    Section     TEXT,
    Address     TEXT,
    Phonenumber INTEGER,
    Bloodtype   TEXT
);
