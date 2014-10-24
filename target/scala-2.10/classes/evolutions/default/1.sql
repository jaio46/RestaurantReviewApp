# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table area (
  id                        bigint auto_increment not null,
  area_name                 varchar(255),
  constraint pk_area primary key (id))
;

create table feed_on_food_item (
  id                        integer auto_increment not null,
  feeder_id                 bigint,
  item_id                   integer,
  rating                    double,
  constraint pk_feed_on_food_item primary key (id))
;

create table feed_on_restaurant (
  id                        integer auto_increment not null,
  feeder_id                 bigint,
  rating                    double,
  restaurnat_id             integer,
  constraint pk_feed_on_restaurant primary key (id))
;

create table food_item (
  id                        integer auto_increment not null,
  item_name                 varchar(255),
  item_category             varchar(255),
  restaurant_id             integer,
  rating                    double,
  rated_by                  integer,
  constraint pk_food_item primary key (id))
;

create table franchise (
  id                        integer auto_increment not null,
  franchise_name            varchar(255),
  franchise_email           varchar(255),
  francise_address          varchar(255),
  franchise_phone           varchar(255),
  created_by_id             bigint,
  constraint pk_franchise primary key (id))
;

create table friends (
  id                        integer auto_increment not null,
  user_id                   bigint,
  friend_user_id            integer,
  constraint pk_friends primary key (id))
;

create table restaurant (
  id                        integer auto_increment not null,
  restaurant_name           varchar(255),
  restaurant_email          varchar(255),
  restaurant_address        varchar(255),
  restaurant_phone          varchar(255),
  rating                    double,
  rated_by                  integer,
  restaurant_area_id        bigint,
  franchise_id              integer,
  constraint pk_restaurant primary key (id))
;

create table restaurant_food (
  id                        integer auto_increment not null,
  restaurant_id             integer,
  food_id                   integer,
  file_link                 varchar(255),
  rating                    double,
  constraint pk_restaurant_food primary key (id))
;

create table tags (
  id                        integer auto_increment not null,
  key_words                 varchar(255),
  constraint pk_tags primary key (id))
;

create table user (
  id                        bigint auto_increment not null,
  name                      varchar(255),
  email                     varchar(255),
  user_name                 varchar(255),
  constraint pk_user primary key (id))
;

alter table feed_on_food_item add constraint fk_feed_on_food_item_feeder_1 foreign key (feeder_id) references user (id) on delete restrict on update restrict;
create index ix_feed_on_food_item_feeder_1 on feed_on_food_item (feeder_id);
alter table feed_on_food_item add constraint fk_feed_on_food_item_item_2 foreign key (item_id) references food_item (id) on delete restrict on update restrict;
create index ix_feed_on_food_item_item_2 on feed_on_food_item (item_id);
alter table feed_on_restaurant add constraint fk_feed_on_restaurant_feeder_3 foreign key (feeder_id) references user (id) on delete restrict on update restrict;
create index ix_feed_on_restaurant_feeder_3 on feed_on_restaurant (feeder_id);
alter table feed_on_restaurant add constraint fk_feed_on_restaurant_restaurnat_4 foreign key (restaurnat_id) references restaurant (id) on delete restrict on update restrict;
create index ix_feed_on_restaurant_restaurnat_4 on feed_on_restaurant (restaurnat_id);
alter table food_item add constraint fk_food_item_restaurant_5 foreign key (restaurant_id) references restaurant (id) on delete restrict on update restrict;
create index ix_food_item_restaurant_5 on food_item (restaurant_id);
alter table franchise add constraint fk_franchise_createdBy_6 foreign key (created_by_id) references user (id) on delete restrict on update restrict;
create index ix_franchise_createdBy_6 on franchise (created_by_id);
alter table friends add constraint fk_friends_user_7 foreign key (user_id) references user (id) on delete restrict on update restrict;
create index ix_friends_user_7 on friends (user_id);
alter table restaurant add constraint fk_restaurant_restaurantArea_8 foreign key (restaurant_area_id) references area (id) on delete restrict on update restrict;
create index ix_restaurant_restaurantArea_8 on restaurant (restaurant_area_id);
alter table restaurant add constraint fk_restaurant_franchise_9 foreign key (franchise_id) references franchise (id) on delete restrict on update restrict;
create index ix_restaurant_franchise_9 on restaurant (franchise_id);
alter table restaurant_food add constraint fk_restaurant_food_restaurant_10 foreign key (restaurant_id) references restaurant (id) on delete restrict on update restrict;
create index ix_restaurant_food_restaurant_10 on restaurant_food (restaurant_id);
alter table restaurant_food add constraint fk_restaurant_food_food_11 foreign key (food_id) references food_item (id) on delete restrict on update restrict;
create index ix_restaurant_food_food_11 on restaurant_food (food_id);



# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table area;

drop table feed_on_food_item;

drop table feed_on_restaurant;

drop table food_item;

drop table franchise;

drop table friends;

drop table restaurant;

drop table restaurant_food;

drop table tags;

drop table user;

SET FOREIGN_KEY_CHECKS=1;

