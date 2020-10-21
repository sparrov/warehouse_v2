INSERT INTO vendors(id, name, country) VALUES
(1, 'Ubiquiti', 'USA'),
(2, 'Mikrotik', 'LATVIA'),
(3, 'TP-Link', 'CHINA')
;
INSERT INTO models(id, type, vendor_id, model) VALUES
(1, 'CPE', 1, 'NS5AC Loco'),
(2, 'ROUTER', 2, 'TL-WR850N'),
(3, 'CPE', 1, 'LB23')
;
INSERT INTO products(id, type, vendor_id, model_id, serial_number) VALUES
(1, 'CPE', 1, 1, 'AAABBBCCCDDD')
;

