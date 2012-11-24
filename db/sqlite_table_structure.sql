CREATE TABLE "spells" (
  "ID" integer NOT NULL PRIMARY KEY AUTOINCREMENT
  ,"name" TEXT
  ,"school" TEXT
  ,"subschool" TEXT
  ,"descriptor" TEXT
  ,"casting_time" TEXT
  ,"components" TEXT
  ,"costly_components" INTEGER
  ,"range" TEXT
  ,"area" TEXT
  ,"effect" TEXT
  ,"targets" TEXT
  ,"duration" TEXT
  ,"dismissible" INTEGER
  ,"shapeable" INTEGER
  ,"saving_throw" TEXT
  ,"spell_resistence" TEXT
  ,"description" TEXT
  ,"description_formated" TEXT
  ,"source" TEXT
  ,"full_text" TEXT
  ,"verbal" INTEGER
  ,"somatic" INTEGER
  ,"material" INTEGER
  ,"focus" INTEGER
  ,"divine_focus" INTEGER
  ,"sor" INTEGER
  ,"wiz" INTEGER
  ,"cleric" INTEGER
  ,"druid" INTEGER
  ,"ranger" INTEGER
  ,"bard" INTEGER
  ,"paladin" INTEGER
  ,"alchemist" INTEGER
  ,"summoner" INTEGER
  ,"witch" INTEGER
  ,"inquisitor" INTEGER
  ,"oracle" INTEGER
  ,"antipaladin" INTEGER
  ,"magus" INTEGER
  ,"deity" TEXT
  ,"domain" TEXT
  ,"short_description" TEXT
  ,"material_cost" REAL
  ,"URL" TEXT
);
