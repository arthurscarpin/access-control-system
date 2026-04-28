-- Create the "access_rule" table to define the access rules for vehicles, with a foreign key reference to the "vehicle" table
CREATE TABLE access_rule (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    vehicle_id UUID NOT NULL,
    allowed BOOLEAN NOT NULL DEFAULT TRUE,

    CONSTRAINT fk_rule_vehicle
        FOREIGN KEY (vehicle_id)
        REFERENCES vehicle(id)
);