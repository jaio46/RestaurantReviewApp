# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

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

create table franchise (
  id                        bigint auto_increment not null,
  franchise_title           varchar(255),
  email                     varchar(255),
  phone                     varchar(255),
  address                   varchar(255),
  constraint pk_franchise primary key (id))
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

create table restaurant_food (
  id                        bigint auto_increment not null,
  price                     integer,
  rating                    double,
  details                   varchar(255),
  restaurant_id             bigint,
  food_item_id              bigint,
  constraint pk_restaurant_food primary key (id))
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
alter table restaurant_food add constraint fk_restaurant_food_restaurant_4 foreign key (restaurant_id) references restaurant (id) on delete restrict on update restrict;
create index ix_restaurant_food_restaurant_4 on restaurant_food (restaurant_id);
alter table restaurant_food add constraint fk_restaurant_food_foodItem_5 foreign key (food_item_id) references food_item (id) on delete restrict on update restrict;
create index ix_restaurant_food_foodItem_5 on restaurant_food (food_item_id);



# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table area;

drop table food_item;

drop table franchise;

drop table restaurant;

drop table restaurant_food;

drop table visitor;

SET FOREIGN_KEY_CHECKS=1;

