CREATE TABLE Machine (
    id INTEGER PRIMARY KEY NOT NULL AUTO_INCREMENT,
    caption VARCHAR(64) NOT NULL
    );


CREATE TABLE Detail(
    id INTEGER PRIMARY KEY NOT NULL AUTO_INCREMENT,
    caption VARCHAR(64) NOT NULL
);


CREATE TABLE MD (
    machine_id INTEGER NOT NULL,
    detail_id INTEGER NOT NULL,
    PRIMARY KEY(machine_id, detail_id),
    FOREIGN KEY(machine_id)
        REFERENCES Machine(id),
    FOREIGN KEY(detail_id)
        REFERENCES Detail(id)
    );