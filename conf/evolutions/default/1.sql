# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table area (
  id                        bigint auto_increment not null,
  area_name                 varchar(255),
  constraint pk_area primary key (id))
;

create table area (
  id                        bigint auto_increment not null,
  area_name                 varchar(255),
  constraint pk_area primary key (id))
;

create table food_item (
  id                        bigint auto_increment not null,
  category                  varchar(255),
  item_title                varchar(255),
  constraint pk_food_item primary key (id))
;

create table food_item (
  id                        integer auto_increment not null,
  item_name                 varchar(255),
  item_category             varchar(255),
  constraint pk_food_item primary key (id))
;

create table franchise (
  id                        bigint auto_increment not null,
  franchise_title           varchar(255),
  email                     varchar(255),
  phone                     varchar(255),
  address                   varchar(255),
  constraint pk_franchise primary key (id))
;

create table franchise (
  id                        integer auto_increment not null,
  franchise_name            varchar(255),
  franchise_email           varchar(255),
  francise_address          varchar(255),
  franchise_phone           varchar(255),
  constraint pk_franchise primary key (id))
;

create table friends (
  id                        integer auto_increment not null,
  friend_user_id            integer,
  constraint pk_friends primary key (id))
;

create table restaurant (
  id                        bigint auto_increment not null,
  name                      varchar(255),
  overall_rating            double,
  email                     varchar(255),
  phone                     varchar(255),
  address                   varchar(255),
  franchise_id              bigint,
  creator_visitor_id        varchar(255),
  area_id                   bigint,
  constraint pk_restaurant primary key (id))
;

create table restaurant (
  id                        integer auto_increment not null,
  restaurant_name           varchar(255),
  restaurant_email          varchar(255),
  restaurant_address        varchar(255),
  restaurant_phone          varchar(255),
  rating                    double,
  restaurant_area_id        bigint,
  franchise_id              integer,
  constraint pk_restaurant primary key (id))
;

create table restaurant_food (
  id                        bigint auto_increment not null,
  price                     integer,
  rating                    double,
  details                   varchar(255),
  restaurant_id             bigint,
  food_item_id              bigint,
  constraint pk_restaurant_food primary key (id))
;

create table restaurant_food (
  id                        integer auto_increment not null,
  restaurant_id             integer,
  food_id                   integer,
  file_link                 varchar(255),
  rating                    double,
  constraint pk_restaurant_food primary key (id))
;

create table user (
  id                        integer auto_increment not null,
  first_name                varchar(255),
  last_name                 varchar(255),
  address                   varchar(255),
  email                     varchar(255),
  constraint pk_user primary key (id))
;

create table visitor (
  visitor_id                varchar(255) not null,
  password                  varchar(255),
  first_name                varchar(255),
  last_name                 varchar(255),
  dateof_birth              datetime,
  gender                    varchar(255),
  address                   varchar(255),
  occupation                varchar(255),
  apartment_no              varchar(255),
  street_no                 varchar(255),
  locality                  varchar(255),
  city                      varchar(255),
  post_box_no               varchar(255),
  constraint pk_visitor primary key (visitor_id))
;

alter table restaurant add constraint fk_restaurant_franchise_1 foreign key (franchise_id) references franchise (id) on delete restrict on update restrict;
create index ix_restaurant_franchise_1 on restaurant (franchise_id);
alter table restaurant add constraint fk_restaurant_creator_2 foreign key (creator_visitor_id) references visitor (visitor_id) on delete restrict on update restrict;
create index ix_restaurant_creator_2 on restaurant (creator_visitor_id);
alter table restaurant add constraint fk_restaurant_area_3 foreign key (area_id) references area (id) on delete restrict on update restrict;
create index ix_restaurant_area_3 on restaurant (area_id);
alter table restaurant add constraint fk_restaurant_restaurantArea_4 foreign key (restaurant_area_id) references area (id) on delete restrict on update restrict;
create index ix_restaurant_restaurantArea_4 on restaurant (restaurant_area_id);
alter table restaurant add constraint fk_restaurant_franchise_5 foreign key (franchise_id) references franchise (id) on delete restrict on update restrict;
create index ix_restaurant_franchise_5 on restaurant (franchise_id);
alter table restaurant_food add constraint fk_restaurant_food_restaurant_6 foreign key (restaurant_id) references restaurant (id) on delete restrict on update restrict;
create index ix_restaurant_food_restaurant_6 on restaurant_food (restaurant_id);
alter table restaurant_food add constraint fk_restaurant_food_foodItem_7 foreign key (food_item_id) references food_item (id) on delete restrict on update restrict;
create index ix_restaurant_food_foodItem_7 on restaurant_food (food_item_id);
alter table restaurant_food add constraint fk_restaurant_food_restaurant_8 foreign key (restaurant_id) references restaurant (id) on delete restrict on update restrict;
create index ix_restaurant_food_restaurant_8 on restaurant_food (restaurant_id);
alter table restaurant_food add constraint fk_restaurant_food_food_9 foreign key (food_id) references food_item (id) on delete restrict on update restrict;
create index ix_restaurant_food_food_9 on restaurant_food (food_id);



# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table area;

drop table area;

drop table food_item;

drop table food_item;

drop table franchise;

drop table franchise;

drop table friends;

drop table restaurant;

drop table restaurant;

drop table restaurant_food;

drop table restaurant_food;

drop table user;

drop table visitor;

SET FOREIGN_KEY_CHECKS=1;

