INSERT INTO COUNTRY(ID,NAME) VALUES(nextval('country_seq'),'COLOMBIA');

INSERT INTO STATE(ID,NAME,COUNTRY_ID) VALUES(nextval('state_seq'),'ANTIOQUIA',(select id from COUNTRY where NAME = 'COLOMBIA'));

INSERT INTO CITY(ID,NAME,STATE_ID) VALUES(nextval('city_seq'),'MEDELLIN',(select id from STATE where NAME = 'ANTIOQUIA'));
INSERT INTO CITY(ID,NAME,STATE_ID) VALUES(nextval('city_seq'),'RIONEGRO',(select id from STATE where NAME = 'ANTIOQUIA'));
INSERT INTO CITY(ID,NAME,STATE_ID) VALUES(nextval('city_seq'),'REMEDIOS',(select id from STATE where NAME = 'ANTIOQUIA'));
INSERT INTO CITY(ID,NAME,STATE_ID) VALUES(nextval('city_seq'),'ITAGUI',(select id from STATE where NAME = 'ANTIOQUIA'));
INSERT INTO CITY(ID,NAME,STATE_ID) VALUES(nextval('city_seq'),'BELLO',(select id from STATE where NAME = 'ANTIOQUIA'));
INSERT INTO CITY(ID,NAME,STATE_ID) VALUES(nextval('city_seq'),'ENVIGADO',(select id from STATE where NAME = 'ANTIOQUIA'));
INSERT INTO CITY(ID,NAME,STATE_ID) VALUES(nextval('city_seq'),'MARINILLA',(select id from STATE where NAME = 'ANTIOQUIA'));
INSERT INTO CITY(ID,NAME,STATE_ID) VALUES(nextval('city_seq'),'LA CEJA',(select id from STATE where NAME = 'ANTIOQUIA'));
INSERT INTO CITY(ID,NAME,STATE_ID) VALUES(nextval('city_seq'),'SABANETA',(select id from STATE where NAME = 'ANTIOQUIA'));
INSERT INTO CITY(ID,NAME,STATE_ID) VALUES(nextval('city_seq'),'BARBOSA',(select id from STATE where NAME = 'ANTIOQUIA'));
INSERT INTO CITY(ID,NAME,STATE_ID) VALUES(nextval('city_seq'),'SAN JERONIMO',(select id from STATE where NAME = 'ANTIOQUIA'));
INSERT INTO CITY(ID,NAME,STATE_ID) VALUES(nextval('city_seq'),'SAN RAFAEL',(select id from STATE where NAME = 'ANTIOQUIA'));
INSERT INTO CITY(ID,NAME,STATE_ID) VALUES(nextval('city_seq'),'GUATAPE',(select id from STATE where NAME = 'ANTIOQUIA'));