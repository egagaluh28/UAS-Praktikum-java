toc.dat                                                                                             0000600 0004000 0002000 00000003136 14442604203 0014441 0                                                                                                    ustar 00postgres                        postgres                        0000000 0000000                                                                                                                                                                        PGDMP           0                {         	   tblProduk    15.2    15.2     �           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false         �           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false         �           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false         �           1262    16649 	   tblProduk    DATABASE     �   CREATE DATABASE "tblProduk" WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'English_United States.1252';
    DROP DATABASE "tblProduk";
                postgres    false         �            1259    16650 	   tblproduk    TABLE     �   CREATE TABLE public.tblproduk (
    kode character varying(255) NOT NULL,
    nama character varying(255),
    harga integer
);
    DROP TABLE public.tblproduk;
       public         heap    postgres    false         �          0    16650 	   tblproduk 
   TABLE DATA           6   COPY public.tblproduk (kode, nama, harga) FROM stdin;
    public          postgres    false    214       3315.dat d           2606    16656    tblproduk nama_tabel_pkey 
   CONSTRAINT     Y   ALTER TABLE ONLY public.tblproduk
    ADD CONSTRAINT nama_tabel_pkey PRIMARY KEY (kode);
 C   ALTER TABLE ONLY public.tblproduk DROP CONSTRAINT nama_tabel_pkey;
       public            postgres    false    214                                                                                                                                                                                                                                                                                                                                                                                                                                          3315.dat                                                                                            0000600 0004000 0002000 00000000070 14442604203 0014241 0                                                                                                    ustar 00postgres                        postgres                        0000000 0000000                                                                                                                                                                        A001	hp	200000
A002	laptop	1200000
A003	lcd	200000
\.


                                                                                                                                                                                                                                                                                                                                                                                                                                                                        restore.sql                                                                                         0000600 0004000 0002000 00000003727 14442604203 0015374 0                                                                                                    ustar 00postgres                        postgres                        0000000 0000000                                                                                                                                                                        --
-- NOTE:
--
-- File paths need to be edited. Search for $$PATH$$ and
-- replace it with the path to the directory containing
-- the extracted data files.
--
--
-- PostgreSQL database dump
--

-- Dumped from database version 15.2
-- Dumped by pg_dump version 15.2

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

DROP DATABASE "tblProduk";
--
-- Name: tblProduk; Type: DATABASE; Schema: -; Owner: postgres
--

CREATE DATABASE "tblProduk" WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'English_United States.1252';


ALTER DATABASE "tblProduk" OWNER TO postgres;

\connect "tblProduk"

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- Name: tblproduk; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.tblproduk (
    kode character varying(255) NOT NULL,
    nama character varying(255),
    harga integer
);


ALTER TABLE public.tblproduk OWNER TO postgres;

--
-- Data for Name: tblproduk; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.tblproduk (kode, nama, harga) FROM stdin;
\.
COPY public.tblproduk (kode, nama, harga) FROM '$$PATH$$/3315.dat';

--
-- Name: tblproduk nama_tabel_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tblproduk
    ADD CONSTRAINT nama_tabel_pkey PRIMARY KEY (kode);


--
-- PostgreSQL database dump complete
--

                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         