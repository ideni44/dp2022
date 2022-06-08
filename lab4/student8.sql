create database student8;
create user ilya_denisov with password '111';
grant all on database student8 to ilya_denisov;

CREATE TABLE "sneakers" (
  "id" serial PRIMARY KEY,
  "title" varchar,
  "img" varchar,
  "description" varchar
);
