create database signup
use signup

create table login(
First_Name varchar(50),
Last_Name varchar(50),
User_Name varchar(50) primary key,
User_Password varchar(50),
image image
)
drop table login_user
insert into login values('Putra','Utama','putrautama007','1sampai10','')
drop table login
create table login_user(
User_First_Name varchar(50),
User_Last_Name varchar(50),
User_User_Name varchar(50) primary key,
User_User_Password varchar(50),
image image
)
select*from login_user

---------------------------------
--difa
CREATE TABLE supplier(
id_supplier int not null,
PRIMARY KEY(id_supplier),
nama_supplier varchar(50),
alamat_supplier varchar(50),
no_tlp_supplier varchar(18)
)

--difa
CREATE TABLE cabang(
no_cabang int not null,
PRIMARY KEY (no_cabang),
nama_cabang varchar(50),
alamat varchar(50)
)

--wildan
CREATE TABLE karyawan(
id_karyawan varchar(10),
PRIMARY KEY(id_karyawan),
nama_karyawan varchar(50),
JK varchar(2),
alamat_karyawan varchar(50),
tanggal_lahir date,
kota_lahir varchar(15),
no_tlp_karyawan varchar(18),
no_cabang int foreign key references cabang(no_cabang)
)

--wildan
CREATE TABLE obat(
kode_obat varchar(5) PRIMARY KEY,
nama_obat varchar(50),
dosis varchar(50),
kadaluarsa date,
harga int,
id_supplier int FOREIGN KEY REFERENCES supplier(id_supplier),
id_apoteker varchar(10),
constraint id_apt foreign key (id_apoteker) references karyawan(id_karyawan)
)

--difa
CREATE TABLE resep_dokter(
no_resep varchar(5) not null,
PRIMARY KEY(no_resep),
nama_dokter varchar(50),
kode_obat varchar(5) foreign key references obat(kode_obat),
aturan_minum varchar(100)
) 

select * from resep_dokter

--prisil
CREATE TABLE konsumen(
no_antre int not null, 
PRIMARY KEY(no_antre),
nama_konsumen varchar(50),
alamat_konsumen varchar(50),
no_resep varchar(5) foreign key references resep_dokter(no_resep),
no_cabang int foreign key references cabang(no_cabang),
)

--prisil
CREATE TABLE jabatan(
id_krw varchar(10) foreign key references karyawan(id_karyawan),
jabatan varchar(50),
)

--wildan

CREATE TABLE faktur_penjualan(
kode_obat varchar(5) FOREIGN KEY REFERENCES obat(kode_obat),
jml_obat int,
tgl_jual date,
id_supplier int FOREIGN KEY REFERENCES supplier(id_supplier),
) 

select * from faktur_penjualan

--prisil
CREATE TABLE gaji(
nama varchar(50),
jabatan varchar(50),
gaji_pokok int,
tunjangan int,
id_karyawan varchar(10) FOREIGN KEY REFERENCES karyawan(id_karyawan),
)

--prisil
CREATE TABLE tanggungan(
nama varchar(50),
ttl date,
JK varchar(10),
hubungan varchar(50),
id_karyawan varchar(10) FOREIGN KEY REFERENCES karyawan(id_karyawan),
)

 select * from tanggungan
drop table resep_dokter
drop table konsumen
drop table cabang
drop table karyawan
drop table obat
drop table supplier
drop table jabatan
drop table gaji
drop table tanggungan
drop table faktur_penjualan

insert into supplier values (111,'Cahaya Abadi Pharmacy', 'Jl. Kenanga no. 16, Pasuruan', '087123456110');
insert into supplier values (122,'Graha Sari Medika', 'Jl. Soekarno Hatta no. 42, Bangkalan', '081822946110');
insert into supplier values (061,'Kimia Farma Surabaya', 'Jl. Mayjend Sungkono no. 31, Surabaya', '081234321708');
insert into supplier values (337,'Rahma pharmacy', 'Jl. Dahlia no. 321, Lawang', '087123457702');
insert into supplier values (465,'Gani Farmasi', 'Jl. Handayani B/13, Blitar', '088145672811');
insert into supplier values (980,'Koperasi Farmasi UB', 'Jl. Veteran, Malang', '(0341)661829');
insert into supplier values (112,'KUD Jaya', 'Jl. Sumbersari A/152, Malang', '089765432111');
insert into supplier values (113,'PT MEDDICA', 'Jl. Ijen no. 72, Malang', '082141707787');
insert into supplier values (241,'PT Antar Mitra Sembada', 'Jl. Buring no. 6, Oro-Oro Dowo, Malang', '(0341)352254');
insert into supplier values (156,'PT Balatif', 'Jl. Tenaha Tengah no. 5, Blimbing, Malang', '(0341)485165');
insert into supplier values (738,'PT Anugrah Pharmindo Lestari', 'Jl. Taman tenaga kav. 6, Malang', '(0341)417345');
insert into supplier values (002,'PT Meiji Indonesia', 'Jl. Mojoparon, Latek, Bangil, Pasuruan', '(0343)741102');
insert into supplier values (081,'Ps Sinar Abadi', 'Jl. Landungsari no. 16, Batu', '082345610076');
insert into supplier values (052,'PT INFION', 'Tawang Rejo, Pandaan, Pasuruan', '(0343)221572');
insert into supplier values (129,'Afi Farma', 'Jl. Mauni, Kediri', '085208880174');
insert into supplier values (318,'PT Medhion Ardika Bhakti', 'Jl. Raya Singosari no. 166, Lawang', '(0341)450303');
insert into supplier values (317,'SOHO Indursti Pharmasi', 'Jl. Soekarno Hatta no. 80, Malang', '(0341)410421');

insert into cabang values(01,'Apotek Lima Jaya', 'Jl. Soekarno Hatta no. 213, Malang');
insert into cabang values(02,'Apotek Lima Jaya', 'Jl. Piranha Atas  no. 17, Polowijen, Malang');
insert into cabang values(03,'Apotek Lima Jaya', 'Jl. Rungkut Industri no. 40, Surabaya');
insert into cabang values(04,'Apotek Lima Jaya', 'Jl. Soekarno Hatta no. 68, Bangkalan, Madura');
insert into cabang values(05,'Apotek Lima Jaya', 'Jl. Tambak Rejo A/52, Sidoarjo');

insert into karyawan values ('k001','AINUN','PR','PERUMAHAN A BLOK I2 MALANG','1989-11-01','SIDOARJO','089726482736',01)
insert into karyawan values ('k002','RIZAL','LK','PERUMAHAN B BLOK K1 MALANG','1987-06-02','JEMBER','081334281837',02)
insert into karyawan values ('k003','ANDRE','LK','PERUMAHAN C BLOK B1 SURABAYA','1987-09-08','SURABAYA','089677718273',03)
insert into karyawan values ('k004','ZAENAB','PR','PERUMAHAN D BLOK A2 MALANG','1987-06-02','SURABAYA','08111111111',02)
insert into karyawan values ('k005','DIAH','PR','PERUMAHAN E BLOK V3 MALANG','1986-07-12','SIDOARJO','081332133345',01)
insert into karyawan values ('k006','TUKUL','LK','PERUMAHAN F BLOK L1 MALANG','1987-07-14','JEMBER','089763628176',02)
insert into karyawan values ('k007','DIO','LK','PERUMAHAN G BLOK J8 MALANG','1985-11-01','MALANG','0838273644678',02)
insert into karyawan values ('k008','SITI','PR','PERUMAHAN H BLOK F3 MALANG','1984-05-15','BANYUWANGI','083816263367',01)
insert into karyawan values ('k009','RAMZI','LK','PERUMAHAN I BLOK B5 SIDOARJO','1987-10-17','BANDUNG','081332342342',04)
insert into karyawan values ('k010','ANDI','LK','PERUMAHAN J BLOK M2 SIDOARJO','1990-12-20','LUMAJANG','081220893746',05)
insert into karyawan values ('k011','MAINUNAH','PR','PERUMAHAN K BLOK Z2 SIDOARJO','1989-07-18','MADIUN','089678472673',05)
insert into karyawan values ('k012','AISYAH','PR','PERUMAHAN L BLOK N3 MADURA','1988-03-19','SURABAYA','081112937463',04)
insert into karyawan values ('k013','NANDA','PR','PERUMAHAN M BLOK M5 MADURA','1988-05-11','MALANG','081224567890',04)
insert into karyawan values ('k014','NISA','PR','PERUMAHAN N BLOK U3 MADURA','1987-04-29','MADURA','083865527738',04)
insert into karyawan values ('k015','NINDI','PR','PERUMAHAN O BLOK E2 MADURA','1989-01-02','MADURA','081330097635',04)
insert into karyawan values ('k016','SANIA','PR','PERUMAHAN P BLOK M12 SURABAYA','1987-06-02','SURABAYA','0813877878827',03)
insert into karyawan values ('k017','SUKIJAN','LK','PERUMAHAN Q BLOK K11 SURABAYA','1983-12-12','MAGELANG','083872648892',03)
insert into karyawan values ('k018','DANDI','LK','PERUMAHAN R BLOK H15 SURABAYA','1987-07-07','MALANG','089899374658',03)
insert into karyawan values ('k019','NAIRA','PR','PERUMAHAN S BLOK L2 SURABAYA','1987-07-06','SURABAYA','088987263758',03)
insert into karyawan values ('k020','FATHUR','LK','PERUMAHAN T BLOK P1 SIDOARJO','1986-11-18','SIDOARJO','081382736648',03)

insert into obat values ('0001','sanmol','500 – 1000 mg','2019-10-01',21000,111,'k001')
insert into obat values ('0002','bodrex','500 – 1000 mg','2020-11-13',25000,122,'k002')
insert into obat values ('0003','simetidin','400 – 800 mg ','2019-05-02',15000,061,'k005')
insert into obat values ('0004','Aspirin','300 – 900 mg','2019-10-01',25000,465,'k003')
insert into obat values ('0005','salbutamol','2-4 mg','2023-11-05',11000,337,'k002')
insert into obat values ('0006','TERBUTALIN (sulfat)','2,5 mg','2019-10-01',25000,980,'k004')
insert into obat values ('0007','AMINOFILIN','100-300 mg','2022-07-01',15000,112,'k015')
insert into obat values ('0008','TEOFILIN','130 – 150 mg','2025-06-01',14000,113,'k011')
insert into obat values ('0009','BROMHEKSIN','4-8 mg','2024-04-03',18000,241,'k011')
insert into obat values ('0010','ASETILSISTEIN','200mg','2021-09-01',16000,156,'k001')
insert into obat values ('0011','KARBOSISTEIN','750 mg','2019-10-01',21000,738,'k003')
insert into obat values ('0012','AMBROKSOL','15 – 30 mg ','2019-10-01',17000,002,'k012')
insert into obat values ('0013','IBUPROFEN',' 1,2 – 1,8 g','2019-10-01',25000,081,'k014')
insert into obat values ('0014','FENOPROFEN','200 – 600 mg','2022-07-01',22000,052,'k012')
insert into obat values ('0015','NATRIUM DIKLOFENAK','75 – 150 mg','2019-10-01',30000,129,'k011')
insert into obat values ('0016','INDOMETASIN','50 – 200 mg','2021-09-01',27000,318,'k005')
insert into obat values ('0017','KLORFENIRAMIN MALEAT (CTM)',' 4 mg','2020-07-15',5000,129,'k004')
insert into obat values ('0030','DIFENHIDRAMIN KLORIDA','25 – 50 mg','2023-10-01',12000,112,'k003')
insert into obat values ('0019','DEKSKLORFENIRAMIN MALEAT','2 mg','2024-10-01',21000,111,'k002')
insert into obat values ('0020','LORATADIN','10 mg','2023-06-20',25000,980,'k001')

insert into resep_dokter values ('0011A','Agus Salim','0001','2x sehari sebelum makan');
insert into resep_dokter values ('0012A','Adinda Rahmatanti','0002','2x sehari sebelum makan');
insert into resep_dokter values ('0013A', 'Ester Devina G.','0003','1x sehari sebelum sarapan, 2 sendok teh');
insert into resep_dokter values ('0014A', 'Adinda Rahmatanti','0004','2x sehari sesudah makan 2 sendok takar');
insert into resep_dokter values ('0011B', 'Dewi Prasetyo','0005','2x sehari sebelum makan');
insert into resep_dokter values ('0016B', 'Lathif Aziz','0006', '1x sehari, 1 jam sesudah sarapan');
insert into resep_dokter values ('0026C', 'Riskha Nur Ramadhani','0010','3x sehari sesudah makan, 1 sendok takar');
insert into resep_dokter values ('0018A', 'Naura Nadifa','0020','3x sehari, boleh sebelum/sesudah makan');
insert into resep_dokter values ('0019B', 'Naura Nadifa','0019','4x sehari ');
insert into resep_dokter values ('0020A', 'Adinda Rahmatanti','0013','3x sehari, 1 jam sebelum makan');

insert into konsumen values (1, 'Dian Sastro', 'Jl. Kuningan no 56, Surabaya','0011B',03);
insert into konsumen values (2, 'Annisa Dwi Lestari', 'Jl. Bunga Kopi no 16, Malang','0012A',01);
insert into konsumen values (3, 'M. Sadiqin', 'Jl. Rungkut Menanggal no 41, Surabaya','0011B',03);
insert into konsumen values (4, 'riana denisa', 'Jl. Buring no 723, Malang','0014A',01);
insert into konsumen values (5, 'Agung Laksana', 'Jl. Lembah Biru no 33, Surabaya','0026C',03);
insert into konsumen values (6, 'Nurida Fitriansyah', 'Jl. Raya Singosari no 28, Malang','0018A',02);
insert into konsumen values (7, 'Leeta L.', 'Jl. Asin no 59, Surabaya','0020A',03);
insert into konsumen values (8, 'Dimas Candra S.', 'Jl. Majapahit no 98, Sidoarjo','0019B',05);
insert into konsumen values (9, 'Alifiya R.L', 'Jl. Pajagan A/178, Bangkalan','0013A',03);
insert into konsumen values (10, 'Rieky A.R', 'Jl. Halim Perdana no 01, Bangkalan','0018A',04);
insert into konsumen values (11, 'Jefry A.R', 'Jl. Bunga Andong no 37, Malang','0019B',01);
insert into konsumen values (12, 'Wulan Dwi', 'Jl. Kumis Kucing no 29, Malang','0026C',01);
insert into konsumen values (13, 'Duta Raidanu', 'Jl. Sepanjang no 16, Sidoarjo','0011A',05);
insert into konsumen values (14, 'Mareta', 'Jl. Piranha Atas no 112, Malang','0020A',02);
insert into konsumen values (15, 'Ardine Yuniar', 'Jl. Masangan Kulon h5/16, Sidoarjo','0026C',05);
insert into konsumen values (16, 'Dwita Pratiwi', 'Jl. Bunga Anggrek no 02, Surabaya','0018A',03);
insert into konsumen values (17, 'Suci Fariandani', 'Jl. Dewandaru Dalam no 28, Malang','0011B',01);

--!!!!!!!!!!!!!!konsumen yang ga pake resep dokter!!!!!!!!!!!!!!!!!!!!!!
insert into konsumen (no_antre, nama_konsumen, alamat_konsumen,no_cabang) values 
(18, 'Nabila Fariandani', 'Jl. Dewandaru Dalam no 28, Malang',01); 


insert into faktur_penjualan values('0002',1,'2017-10-10',122);
insert into faktur_penjualan values('0012',2,'2017-10-01',002)
insert into faktur_penjualan values('0011',3,'2017-10-04',738)
insert into faktur_penjualan values('0003',1,'2017-10-22',061)
insert into faktur_penjualan values('0001',3,'2017-10-09',111)
insert into faktur_penjualan values('0005',2,'2017-09-11',337)
insert into faktur_penjualan values('0006',1,'2017-09-08',980)
insert into faktur_penjualan values('0006',3,'2017-09-05',980)
insert into faktur_penjualan values('0012',5,'2017-09-16',002)
insert into faktur_penjualan values('0019',2,'2017-09-14',111)
insert into faktur_penjualan values('0020',2,'2017-09-10',980)
insert into faktur_penjualan values('0011',3,'2017-09-02',738)
insert into faktur_penjualan values('0016',5,'2017-09-01',318)
insert into faktur_penjualan values('0004',1,'2017-08-11',465)
insert into faktur_penjualan values('0009',2,'2017-08-16',241)
insert into faktur_penjualan values('0010',3,'2017-08-05',156)
insert into faktur_penjualan values('0015',1,'2017-07-11',129)
insert into faktur_penjualan values('0013',1,'2017-07-12',081)
insert into faktur_penjualan values('0012',2,'2017-08-19',002)

insert into tanggungan values ('Azka','2000-12-12','Perempuan','anak','k001')
insert into tanggungan values ('Arynda','1989-01-26','Perempuan','istri','k002')
insert into tanggungan values ('Andhini','1988-08-17','Perempuan','istri','k003')
insert into tanggungan values ('Queen','2016-11-11','Perempuan','anak','k004')
insert into tanggungan values ('Brandon','2015-07-12','Laki-laki','anak','k005')
insert into tanggungan values ('inas Hakimah','1987-02-14','Perempuan','istri','k006')
insert into tanggungan values ('Nur Difa','1989-04-20','Perempuan','istri','k007')
insert into tanggungan values ('Rafardan','2008-07-02','Laki-laki','anak','k008')
insert into tanggungan values ('Shafira','1895-03-03','Perempuan','istri','k009')
insert into tanggungan values ('Rita','2001-12-10','Perempuan','anak','k010')
insert into tanggungan values ('Princess','2017-01-01','Perempuan','anak','k011')
insert into tanggungan values ('Rapunzel','2008-04-11','Perempuan','anak','k012')
insert into tanggungan values ('Prince','2014-09-30','Laki-laki','anak','k013')
insert into tanggungan values ('Aditya','2009-06-20','Laki-laki','anak','k014')
insert into tanggungan values ('Deni','2016-09-12','Laki-laki','anak','k015')
insert into tanggungan values ('Rizky','2010-12-06','Laki-laki','anak','k016')
insert into tanggungan values ('Nindy AJ','1988-05-05','Perempuan','istri','k017')
insert into tanggungan values ('Delfia','1989-04-01','Perempuan','istri','k018')
insert into tanggungan values ('Dimas','2010-10-02','Laki-laki','anak','k019')
insert into tanggungan values ('Annisa','1990-09-11','Perempuan','istri','k020')

insert into jabatan values('k001','apoteker')
insert into jabatan values('k002','apoteker')
insert into jabatan values('k003','apoteker')
insert into jabatan values('k004','apoteker')
insert into jabatan values('k005','apoteker')
insert into jabatan values('k006','karyawan')
insert into jabatan values('k007','karyawan')
insert into jabatan values('k008','karyawan')
insert into jabatan values('k009','karyawan')
insert into jabatan values('k010','karyawan')
insert into jabatan values('k011','apoteker')
insert into jabatan values('k012','apoteker')
insert into jabatan values('k013','apoteker')
insert into jabatan values('k014','apoteker')
insert into jabatan values('k015','apoteker')
insert into jabatan values('k016','karyawan')
insert into jabatan values('k017','karyawan')
insert into jabatan values('k018','karyawan')
insert into jabatan values('k019','karyawan')
insert into jabatan values('k020','karyawan')

insert into gaji values ('AINUN','apoteker',1500000,250000,'k001')
insert into gaji values ('RIZAL','apoteker',1500000,300000,'k002')
insert into gaji values ('ANDRE','apoteker',1500000,300000,'k003')
insert into gaji values ('ZAENAB','apoteker',1500000,350000,'k004')
insert into gaji values ('DIAH','apoteker',1500000,250000,'k005')
insert into gaji values ('TUKUL','karyawan',1500000,150000,'k006')
insert into gaji values ('DIO','karyawan',1500000,150000,'k007')
insert into gaji values ('SITI','karyawan',1500000,200000,'k008')
insert into gaji values ('RAMZI','karyawan',1500000,1750000,'k009')
insert into gaji values ('ANDI','karyawan',1500000,200000,'k010')
insert into gaji values ('MAIMUNAH','apoteker',1500000,250000,'k011')
insert into gaji values ('AISYAH','apoteker',1500000,300000,'k012')
insert into gaji values ('NANDA','apoteker',1500000,220000,'k013')
insert into gaji values ('NISA','apoteker',1500000,275000,'k014')
insert into gaji values ('NINDI','apoteker',1500000,250000,'k015')
insert into gaji values ('SANIA','karyawan',1500000,150000,'k016')
insert into gaji values ('SUKIJAN','karyawan',1500000,150000,'k017')
insert into gaji values ('DANDI','karyawan',1500000,175000,'k018')
insert into gaji values ('NAIRA','karyawan',1500000,200000,'k019')
insert into gaji values ('FATHUR','karyawan',1500000,200000,'k020')