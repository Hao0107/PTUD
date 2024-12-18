USE [master]
GO
/****** Object:  Database [QuanLyDatBan]    Script Date: 12/1/2024 7:26:34 PM ******/
CREATE DATABASE [QuanLyDatBan]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'QuanLyDatBan2', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL11.SQLEXPRESS\MSSQL\DATA\QuanLyDatBan2.mdf' , SIZE = 4096KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'QuanLyDatBan2_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL11.SQLEXPRESS\MSSQL\DATA\QuanLyDatBan2_log.ldf' , SIZE = 1024KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [QuanLyDatBan] SET COMPATIBILITY_LEVEL = 110
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [QuanLyDatBan].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [QuanLyDatBan] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [QuanLyDatBan] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [QuanLyDatBan] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [QuanLyDatBan] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [QuanLyDatBan] SET ARITHABORT OFF 
GO
ALTER DATABASE [QuanLyDatBan] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [QuanLyDatBan] SET AUTO_CREATE_STATISTICS ON 
GO
ALTER DATABASE [QuanLyDatBan] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [QuanLyDatBan] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [QuanLyDatBan] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [QuanLyDatBan] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [QuanLyDatBan] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [QuanLyDatBan] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [QuanLyDatBan] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [QuanLyDatBan] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [QuanLyDatBan] SET  DISABLE_BROKER 
GO
ALTER DATABASE [QuanLyDatBan] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [QuanLyDatBan] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [QuanLyDatBan] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [QuanLyDatBan] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [QuanLyDatBan] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [QuanLyDatBan] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [QuanLyDatBan] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [QuanLyDatBan] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [QuanLyDatBan] SET  MULTI_USER 
GO
ALTER DATABASE [QuanLyDatBan] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [QuanLyDatBan] SET DB_CHAINING OFF 
GO
ALTER DATABASE [QuanLyDatBan] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [QuanLyDatBan] SET TARGET_RECOVERY_TIME = 0 SECONDS 
GO
USE [QuanLyDatBan]
GO
/****** Object:  Table [dbo].[Ban]    Script Date: 12/1/2024 7:26:35 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Ban](
	[maBan] [nchar](10) NOT NULL,
	[maLoai] [nchar](10) NOT NULL,
	[trangThaiBan] [nvarchar](50) NOT NULL,
	[soLuongGhe] [int] NULL,
	[viTri] [nvarchar](50) NULL,
 CONSTRAINT [PK_Ban] PRIMARY KEY CLUSTERED 
(
	[maBan] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[CaLamViec]    Script Date: 12/1/2024 7:26:35 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[CaLamViec](
	[maCa] [nchar](10) NOT NULL,
	[buoiLam] [nchar](10) NOT NULL,
	[gioBatDau] [time](7) NOT NULL,
	[gioKetThuc] [time](7) NOT NULL,
 CONSTRAINT [PK_CaLamViec] PRIMARY KEY CLUSTERED 
(
	[maCa] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[ChiTietYeuCau]    Script Date: 12/1/2024 7:26:35 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ChiTietYeuCau](
	[maYeuCau] [nchar](10) NOT NULL,
	[maMonAn] [nchar](10) NULL,
	[soLuong] [int] NULL,
	[ghiChu] [nvarchar](max) NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  Table [dbo].[HoaDon]    Script Date: 12/1/2024 7:26:35 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HoaDon](
	[maHD] [nchar](20) NOT NULL,
	[maYeuCau] [nchar](10) NOT NULL,
	[maNV] [nchar](10) NOT NULL,
	[maBan] [nchar](10) NOT NULL,
	[soLuongKhach] [int] NOT NULL,
	[thoiGianTao] [date] NOT NULL,
	[ngayDatBan] [date] NOT NULL,
	[trangThaiHoaDon] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_HoaDon] PRIMARY KEY CLUSTERED 
(
	[maHD] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[KhachHang]    Script Date: 12/1/2024 7:26:35 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[KhachHang](
	[maKH] [nchar](10) NOT NULL,
	[tenKH] [nvarchar](50) NOT NULL,
	[sDT] [nvarchar](15) NOT NULL,
	[gioiTinh] [nvarchar](10) NOT NULL,
	[diaChi] [nvarchar](50) NULL,
 CONSTRAINT [PK_KhachHang] PRIMARY KEY CLUSTERED 
(
	[maKH] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[LoaiBan]    Script Date: 12/1/2024 7:26:35 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[LoaiBan](
	[maLoai] [nchar](10) NOT NULL,
	[tenLoai] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_LoaiBan] PRIMARY KEY CLUSTERED 
(
	[maLoai] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[LoaiMon]    Script Date: 12/1/2024 7:26:35 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[LoaiMon](
	[maLoai] [nchar](10) NOT NULL,
	[tenLoai] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_LoaiMon] PRIMARY KEY CLUSTERED 
(
	[maLoai] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[MonAn]    Script Date: 12/1/2024 7:26:35 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[MonAn](
	[maMonAn] [nchar](10) NOT NULL,
	[tenMonAn] [nvarchar](50) NOT NULL,
	[giaTien] [real] NOT NULL,
	[thongTinMon] [nvarchar](max) NULL,
	[trangThaiMonAn] [nvarchar](25) NOT NULL,
	[maLoai] [nchar](10) NOT NULL,
 CONSTRAINT [PK_MonAn] PRIMARY KEY CLUSTERED 
(
	[maMonAn] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  Table [dbo].[NhanVien]    Script Date: 12/1/2024 7:26:35 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NhanVien](
	[maNV] [nchar](10) NOT NULL,
	[maTK] [nchar](10) NOT NULL,
	[maCa] [nchar](10) NOT NULL,
	[tenNV] [nvarchar](50) NOT NULL,
	[sDT] [nvarchar](15) NOT NULL,
	[email] [nvarchar](50) NOT NULL,
	[ngayVaoLam] [date] NOT NULL,
 CONSTRAINT [PK_NhanVien] PRIMARY KEY CLUSTERED 
(
	[maNV] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[TaiKhoan]    Script Date: 12/1/2024 7:26:35 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[TaiKhoan](
	[maTK] [nchar](10) NOT NULL,
	[tenTK] [nvarchar](50) NOT NULL,
	[chucVu] [nvarchar](50) NOT NULL,
	[matKhau] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_TaiKhoan] PRIMARY KEY CLUSTERED 
(
	[maTK] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[YeuCauKhachHang]    Script Date: 12/1/2024 7:26:35 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[YeuCauKhachHang](
	[maYeuCau] [nchar](10) NOT NULL,
	[maKH] [nchar](10) NOT NULL,
 CONSTRAINT [PK_YeuCauKhachHang] PRIMARY KEY CLUSTERED 
(
	[maYeuCau] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
INSERT [dbo].[Ban] ([maBan], [maLoai], [trangThaiBan], [soLuongGhe], [viTri]) VALUES (N'B001      ', N'L001      ', N'Trống', 4, N'Tầng 1')
INSERT [dbo].[Ban] ([maBan], [maLoai], [trangThaiBan], [soLuongGhe], [viTri]) VALUES (N'B002      ', N'L001      ', N'Trống', 4, N'Tầng 1')
INSERT [dbo].[Ban] ([maBan], [maLoai], [trangThaiBan], [soLuongGhe], [viTri]) VALUES (N'B003      ', N'L002      ', N'Trống', 6, N'Tầng 2')
INSERT [dbo].[Ban] ([maBan], [maLoai], [trangThaiBan], [soLuongGhe], [viTri]) VALUES (N'B004      ', N'L002      ', N'Trống', 6, N'Tầng 2')
INSERT [dbo].[Ban] ([maBan], [maLoai], [trangThaiBan], [soLuongGhe], [viTri]) VALUES (N'B005      ', N'L003      ', N'Đặt trước', 8, N'Tầng 1')
INSERT [dbo].[Ban] ([maBan], [maLoai], [trangThaiBan], [soLuongGhe], [viTri]) VALUES (N'B006      ', N'L003      ', N'Đặt trước', 8, N'Tầng 1')
INSERT [dbo].[Ban] ([maBan], [maLoai], [trangThaiBan], [soLuongGhe], [viTri]) VALUES (N'B007      ', N'L001      ', N'Trống', 4, N'Tầng 1')
INSERT [dbo].[Ban] ([maBan], [maLoai], [trangThaiBan], [soLuongGhe], [viTri]) VALUES (N'B008      ', N'L001      ', N'Trống', 4, N'Tầng 1')
INSERT [dbo].[Ban] ([maBan], [maLoai], [trangThaiBan], [soLuongGhe], [viTri]) VALUES (N'B009      ', N'L002      ', N'Trống', 6, N'Tầng 2')
INSERT [dbo].[Ban] ([maBan], [maLoai], [trangThaiBan], [soLuongGhe], [viTri]) VALUES (N'B010      ', N'L002      ', N'Trống', 6, N'Tầng 2')
INSERT [dbo].[Ban] ([maBan], [maLoai], [trangThaiBan], [soLuongGhe], [viTri]) VALUES (N'B011      ', N'L003      ', N'Trống', 8, N'Tầng 3')
INSERT [dbo].[Ban] ([maBan], [maLoai], [trangThaiBan], [soLuongGhe], [viTri]) VALUES (N'B012      ', N'L003      ', N'Trống', 8, N'Tầng 3')
INSERT [dbo].[Ban] ([maBan], [maLoai], [trangThaiBan], [soLuongGhe], [viTri]) VALUES (N'B013      ', N'L001      ', N'Trống', 4, N'Tầng 1')
INSERT [dbo].[Ban] ([maBan], [maLoai], [trangThaiBan], [soLuongGhe], [viTri]) VALUES (N'B014      ', N'L001      ', N'Trống', 4, N'Tầng 1')
INSERT [dbo].[Ban] ([maBan], [maLoai], [trangThaiBan], [soLuongGhe], [viTri]) VALUES (N'B015      ', N'L002      ', N'Trống', 6, N'Tầng 2')
INSERT [dbo].[Ban] ([maBan], [maLoai], [trangThaiBan], [soLuongGhe], [viTri]) VALUES (N'B016      ', N'L002      ', N'Trống', 6, N'Tầng 2')
INSERT [dbo].[Ban] ([maBan], [maLoai], [trangThaiBan], [soLuongGhe], [viTri]) VALUES (N'B017      ', N'L003      ', N'Trống', 8, N'Tầng 1')
INSERT [dbo].[Ban] ([maBan], [maLoai], [trangThaiBan], [soLuongGhe], [viTri]) VALUES (N'B018      ', N'L003      ', N'Trống', 8, N'Tầng 1')
INSERT [dbo].[Ban] ([maBan], [maLoai], [trangThaiBan], [soLuongGhe], [viTri]) VALUES (N'B019      ', N'L001      ', N'Trống', 4, N'Tầng 3')
INSERT [dbo].[Ban] ([maBan], [maLoai], [trangThaiBan], [soLuongGhe], [viTri]) VALUES (N'B020      ', N'L001      ', N'Trống', 4, N'Tầng 3')
INSERT [dbo].[CaLamViec] ([maCa], [buoiLam], [gioBatDau], [gioKetThuc]) VALUES (N'C001      ', N'Sáng      ', CAST(N'08:00:00' AS Time), CAST(N'16:00:00' AS Time))
INSERT [dbo].[CaLamViec] ([maCa], [buoiLam], [gioBatDau], [gioKetThuc]) VALUES (N'C002      ', N'Gãy       ', CAST(N'16:00:00' AS Time), CAST(N'00:00:00' AS Time))
INSERT [dbo].[CaLamViec] ([maCa], [buoiLam], [gioBatDau], [gioKetThuc]) VALUES (N'C003      ', N'Tối       ', CAST(N'00:00:00' AS Time), CAST(N'08:00:00' AS Time))
INSERT [dbo].[ChiTietYeuCau] ([maYeuCau], [maMonAn], [soLuong], [ghiChu]) VALUES (N'YC001     ', N'M001      ', 2, N'')
INSERT [dbo].[ChiTietYeuCau] ([maYeuCau], [maMonAn], [soLuong], [ghiChu]) VALUES (N'YC001     ', N'M002      ', 2, N'')
INSERT [dbo].[ChiTietYeuCau] ([maYeuCau], [maMonAn], [soLuong], [ghiChu]) VALUES (N'YC001     ', N'M003      ', 2, N'')
INSERT [dbo].[ChiTietYeuCau] ([maYeuCau], [maMonAn], [soLuong], [ghiChu]) VALUES (N'YC001     ', N'M018      ', 2, N'')
INSERT [dbo].[ChiTietYeuCau] ([maYeuCau], [maMonAn], [soLuong], [ghiChu]) VALUES (N'YC001     ', N'M017      ', 2, N'')
INSERT [dbo].[ChiTietYeuCau] ([maYeuCau], [maMonAn], [soLuong], [ghiChu]) VALUES (N'YC001     ', N'M016      ', 2, N'')
INSERT [dbo].[ChiTietYeuCau] ([maYeuCau], [maMonAn], [soLuong], [ghiChu]) VALUES (N'YC001     ', N'M019      ', 2, N'')
INSERT [dbo].[ChiTietYeuCau] ([maYeuCau], [maMonAn], [soLuong], [ghiChu]) VALUES (N'YC001     ', N'M020      ', 2, N'')
INSERT [dbo].[ChiTietYeuCau] ([maYeuCau], [maMonAn], [soLuong], [ghiChu]) VALUES (N'YC001     ', N'M021      ', 2, N'')
INSERT [dbo].[ChiTietYeuCau] ([maYeuCau], [maMonAn], [soLuong], [ghiChu]) VALUES (N'YC001     ', N'M027      ', 4, N'')
INSERT [dbo].[ChiTietYeuCau] ([maYeuCau], [maMonAn], [soLuong], [ghiChu]) VALUES (N'YC001     ', N'M013      ', 2, N'')
INSERT [dbo].[ChiTietYeuCau] ([maYeuCau], [maMonAn], [soLuong], [ghiChu]) VALUES (N'YC002     ', N'M011      ', 1, N'')
INSERT [dbo].[ChiTietYeuCau] ([maYeuCau], [maMonAn], [soLuong], [ghiChu]) VALUES (N'YC002     ', N'M012      ', 1, N'')
INSERT [dbo].[ChiTietYeuCau] ([maYeuCau], [maMonAn], [soLuong], [ghiChu]) VALUES (N'YC002     ', N'M010      ', 1, N'')
INSERT [dbo].[ChiTietYeuCau] ([maYeuCau], [maMonAn], [soLuong], [ghiChu]) VALUES (N'YC002     ', N'M008      ', 1, N'')
INSERT [dbo].[ChiTietYeuCau] ([maYeuCau], [maMonAn], [soLuong], [ghiChu]) VALUES (N'YC002     ', N'M007      ', 1, N'')
INSERT [dbo].[ChiTietYeuCau] ([maYeuCau], [maMonAn], [soLuong], [ghiChu]) VALUES (N'YC002     ', N'M009      ', 1, N'')
INSERT [dbo].[ChiTietYeuCau] ([maYeuCau], [maMonAn], [soLuong], [ghiChu]) VALUES (N'YC002     ', N'M003      ', 5, N'')
INSERT [dbo].[HoaDon] ([maHD], [maYeuCau], [maNV], [maBan], [soLuongKhach], [thoiGianTao], [ngayDatBan], [trangThaiHoaDon]) VALUES (N'HD0001T2711001      ', N'YC001     ', N'NV001     ', N'B005      ', 8, CAST(N'2024-11-27' AS Date), CAST(N'2024-11-28' AS Date), N'Chờ xử lý')
INSERT [dbo].[HoaDon] ([maHD], [maYeuCau], [maNV], [maBan], [soLuongKhach], [thoiGianTao], [ngayDatBan], [trangThaiHoaDon]) VALUES (N'HD0002T2711001      ', N'YC002     ', N'NV001     ', N'B006      ', 4, CAST(N'2024-11-27' AS Date), CAST(N'2024-11-28' AS Date), N'Chờ xử lý')
INSERT [dbo].[KhachHang] ([maKH], [tenKH], [sDT], [gioiTinh], [diaChi]) VALUES (N'KH000     ', N'Chưa có tên', N'0123456789', N'Nam', N'Không')
INSERT [dbo].[KhachHang] ([maKH], [tenKH], [sDT], [gioiTinh], [diaChi]) VALUES (N'KH001     ', N'Trần Anh Hào', N'0386810184', N'Nam', N'123 Lê Lợi, Q.1, TP.HCM')
INSERT [dbo].[KhachHang] ([maKH], [tenKH], [sDT], [gioiTinh], [diaChi]) VALUES (N'KH002     ', N'Trần Thị Bình', N'0987654321', N'Nữ', N'456 Hai Bà Trưng, Q.3, TP.HCM')
INSERT [dbo].[KhachHang] ([maKH], [tenKH], [sDT], [gioiTinh], [diaChi]) VALUES (N'KH003     ', N'Phạm Minh Công', N'0912345678', N'Nam', N'789 Nguyễn Huệ, Q.1, TP.HCM')
INSERT [dbo].[KhachHang] ([maKH], [tenKH], [sDT], [gioiTinh], [diaChi]) VALUES (N'KH004     ', N'Lê Thị Dung', N'0908765432', N'Nữ', N'321 Lý Thường Kiệt, Q.10, TP.HCM')
INSERT [dbo].[KhachHang] ([maKH], [tenKH], [sDT], [gioiTinh], [diaChi]) VALUES (N'KH005     ', N'Võ Văn Kiệt', N'0386810188', N'Nam', N'654 Trần Hưng Đạo, Q.5, TP.HCM')
INSERT [dbo].[KhachHang] ([maKH], [tenKH], [sDT], [gioiTinh], [diaChi]) VALUES (N'KH006     ', N'Huỳnh Thị Như', N'0921123344', N'Nữ', N'567 Nguyễn Tri Phương, Q.10, TP.HCM')
INSERT [dbo].[KhachHang] ([maKH], [tenKH], [sDT], [gioiTinh], [diaChi]) VALUES (N'KH007     ', N'Trương Minh Quang', N'0918765432', N'Nam', N'123 Phan Đăng Lưu, Q. Phú Nhuận, TP.HCM')
INSERT [dbo].[KhachHang] ([maKH], [tenKH], [sDT], [gioiTinh], [diaChi]) VALUES (N'KH008     ', N'Bùi Văn Hiển', N'0932987655', N'Nam', N'789 Cách Mạng Tháng 8, Q. Tân Bình, TP.HCM')
INSERT [dbo].[KhachHang] ([maKH], [tenKH], [sDT], [gioiTinh], [diaChi]) VALUES (N'KH009     ', N'Ngô Thị Lan', N'0967876543', N'Nữ', N'456 Pasteur, Q.1, TP.HCM')
INSERT [dbo].[KhachHang] ([maKH], [tenKH], [sDT], [gioiTinh], [diaChi]) VALUES (N'KH010     ', N'Đoàn Văn Sơn', N'0945123890', N'Nam', N'1010 Điện Biên Phủ, Q. Bình Thạnh, TP.HCM')
INSERT [dbo].[LoaiBan] ([maLoai], [tenLoai]) VALUES (N'L001      ', N'bàn thường')
INSERT [dbo].[LoaiBan] ([maLoai], [tenLoai]) VALUES (N'L002      ', N'bàn vip')
INSERT [dbo].[LoaiBan] ([maLoai], [tenLoai]) VALUES (N'L003      ', N'bàn')
INSERT [dbo].[LoaiMon] ([maLoai], [tenLoai]) VALUES (N'LM001     ', N'Đồ uống')
INSERT [dbo].[LoaiMon] ([maLoai], [tenLoai]) VALUES (N'LM002     ', N'Món khô')
INSERT [dbo].[LoaiMon] ([maLoai], [tenLoai]) VALUES (N'LM003     ', N'Món nước')
INSERT [dbo].[MonAn] ([maMonAn], [tenMonAn], [giaTien], [thongTinMon], [trangThaiMonAn], [maLoai]) VALUES (N'M001      ', N'Trà sữa', 30000, N'Trà sữa thơm ngon với nhiều vị.', N'Có sẵn', N'LM001     ')
INSERT [dbo].[MonAn] ([maMonAn], [tenMonAn], [giaTien], [thongTinMon], [trangThaiMonAn], [maLoai]) VALUES (N'M002      ', N'Cà phê đen', 25000, N'Cà phê đen nguyên chất.', N'Có sẵn', N'LM001     ')
INSERT [dbo].[MonAn] ([maMonAn], [tenMonAn], [giaTien], [thongTinMon], [trangThaiMonAn], [maLoai]) VALUES (N'M003      ', N'Nước cam', 20000, N'Nước cam tươi mát.', N'Có sẵn', N'LM001     ')
INSERT [dbo].[MonAn] ([maMonAn], [tenMonAn], [giaTien], [thongTinMon], [trangThaiMonAn], [maLoai]) VALUES (N'M004      ', N'Bún bò Huế', 50000, N'Món bún bò đặc trưng miền Trung.', N'Có sẵn', N'LM003     ')
INSERT [dbo].[MonAn] ([maMonAn], [tenMonAn], [giaTien], [thongTinMon], [trangThaiMonAn], [maLoai]) VALUES (N'M005      ', N'Phở bò', 60000, N'Phở bò với nước dùng thơm ngon.', N'Có sẵn', N'LM003     ')
INSERT [dbo].[MonAn] ([maMonAn], [tenMonAn], [giaTien], [thongTinMon], [trangThaiMonAn], [maLoai]) VALUES (N'M006      ', N'Canh chua cá', 55000, N'Canh chua với cá tươi.', N'Có sẵn', N'LM003     ')
INSERT [dbo].[MonAn] ([maMonAn], [tenMonAn], [giaTien], [thongTinMon], [trangThaiMonAn], [maLoai]) VALUES (N'M007      ', N'Cơm chiên Dương Châu', 45000, N'Cơm chiên với nhiều loại nguyên liệu.', N'Có sẵn', N'LM002     ')
INSERT [dbo].[MonAn] ([maMonAn], [tenMonAn], [giaTien], [thongTinMon], [trangThaiMonAn], [maLoai]) VALUES (N'M008      ', N'Gà rán', 70000, N'Gà rán giòn rụm.', N'Có sẵn', N'LM002     ')
INSERT [dbo].[MonAn] ([maMonAn], [tenMonAn], [giaTien], [thongTinMon], [trangThaiMonAn], [maLoai]) VALUES (N'M009      ', N'Bánh mì thịt', 25000, N'Bánh mì với nhân thịt đầy đặn.', N'Có sẵn', N'LM002     ')
INSERT [dbo].[MonAn] ([maMonAn], [tenMonAn], [giaTien], [thongTinMon], [trangThaiMonAn], [maLoai]) VALUES (N'M010      ', N'Mì xào thập cẩm', 40000, N'Mì xào với nhiều loại rau củ và thịt.', N'Có sẵn', N'LM002     ')
INSERT [dbo].[MonAn] ([maMonAn], [tenMonAn], [giaTien], [thongTinMon], [trangThaiMonAn], [maLoai]) VALUES (N'M011      ', N'Pizza Margherita', 120000, N'Pizza truyền thống với phô mai và sốt cà chua.', N'Có sẵn', N'LM002     ')
INSERT [dbo].[MonAn] ([maMonAn], [tenMonAn], [giaTien], [thongTinMon], [trangThaiMonAn], [maLoai]) VALUES (N'M012      ', N'Burger bò', 90000, N'Burger với thịt bò tươi, phô mai và rau.', N'Có sẵn', N'LM002     ')
INSERT [dbo].[MonAn] ([maMonAn], [tenMonAn], [giaTien], [thongTinMon], [trangThaiMonAn], [maLoai]) VALUES (N'M013      ', N'Salad trái cây', 35000, N'Salad với các loại trái cây tươi mát.', N'Có sẵn', N'LM002     ')
INSERT [dbo].[MonAn] ([maMonAn], [tenMonAn], [giaTien], [thongTinMon], [trangThaiMonAn], [maLoai]) VALUES (N'M014      ', N'Sushi cá hồi', 120000, N'Sushi với cá hồi tươi và cơm dẻo.', N'Có sẵn', N'LM002     ')
INSERT [dbo].[MonAn] ([maMonAn], [tenMonAn], [giaTien], [thongTinMon], [trangThaiMonAn], [maLoai]) VALUES (N'M015      ', N'Gỏi cuốn', 40000, N'Gỏi cuốn tươi ngon với rau và tôm.', N'Có sẵn', N'LM002     ')
INSERT [dbo].[MonAn] ([maMonAn], [tenMonAn], [giaTien], [thongTinMon], [trangThaiMonAn], [maLoai]) VALUES (N'M016      ', N'Tempura', 60000, N'Món chiên giòn với hải sản và rau củ.', N'Có sẵn', N'LM002     ')
INSERT [dbo].[MonAn] ([maMonAn], [tenMonAn], [giaTien], [thongTinMon], [trangThaiMonAn], [maLoai]) VALUES (N'M017      ', N'Bánh xèo', 50000, N'Bánh xèo giòn rụm với nhân tôm và thịt.', N'Có sẵn', N'LM002     ')
INSERT [dbo].[MonAn] ([maMonAn], [tenMonAn], [giaTien], [thongTinMon], [trangThaiMonAn], [maLoai]) VALUES (N'M018      ', N'Nem rán', 30000, N'Nem rán giòn ngon, nhân thịt đầy đặn.', N'Có sẵn', N'LM002     ')
INSERT [dbo].[MonAn] ([maMonAn], [tenMonAn], [giaTien], [thongTinMon], [trangThaiMonAn], [maLoai]) VALUES (N'M019      ', N'Canh bí đỏ', 35000, N'Canh bí đỏ thơm ngon, bổ dưỡng.', N'Có sẵn', N'LM003     ')
INSERT [dbo].[MonAn] ([maMonAn], [tenMonAn], [giaTien], [thongTinMon], [trangThaiMonAn], [maLoai]) VALUES (N'M020      ', N'Xôi xéo', 25000, N'Xôi với đậu xanh và hành phi thơm ngon.', N'Có sẵn', N'LM002     ')
INSERT [dbo].[MonAn] ([maMonAn], [tenMonAn], [giaTien], [thongTinMon], [trangThaiMonAn], [maLoai]) VALUES (N'M021      ', N'Cơm gà Hội An', 70000, N'Cơm gà Hội An đặc trưng với thịt gà mềm và gia vị đậm đà.', N'Có sẵn', N'LM002     ')
INSERT [dbo].[MonAn] ([maMonAn], [tenMonAn], [giaTien], [thongTinMon], [trangThaiMonAn], [maLoai]) VALUES (N'M022      ', N'Bánh canh cua', 55000, N'Bánh canh cua với nước dùng ngọt thanh, cua tươi.', N'Có sẵn', N'LM003     ')
INSERT [dbo].[MonAn] ([maMonAn], [tenMonAn], [giaTien], [thongTinMon], [trangThaiMonAn], [maLoai]) VALUES (N'M023      ', N'Tàu hủ kỷ', 30000, N'Tàu hủ kỷ giòn và thơm, ăn kèm với sốt đặc biệt.', N'Có sẵn', N'LM002     ')
INSERT [dbo].[MonAn] ([maMonAn], [tenMonAn], [giaTien], [thongTinMon], [trangThaiMonAn], [maLoai]) VALUES (N'M024      ', N'Cháo lòng', 35000, N'Cháo lòng với huyết, thịt lòng heo và gia vị thơm ngon.', N'Có sẵn', N'LM003     ')
INSERT [dbo].[MonAn] ([maMonAn], [tenMonAn], [giaTien], [thongTinMon], [trangThaiMonAn], [maLoai]) VALUES (N'M025      ', N'Bánh bao', 20000, N'Bánh bao nhân thịt với hương vị đậm đà.', N'Có sẵn', N'LM002     ')
INSERT [dbo].[MonAn] ([maMonAn], [tenMonAn], [giaTien], [thongTinMon], [trangThaiMonAn], [maLoai]) VALUES (N'M026      ', N'Pizza hải sản', 150000, N'Pizza với các loại hải sản tươi ngon.', N'Có sẵn', N'LM002     ')
INSERT [dbo].[MonAn] ([maMonAn], [tenMonAn], [giaTien], [thongTinMon], [trangThaiMonAn], [maLoai]) VALUES (N'M027      ', N'Phở gà', 55000, N'Phở gà với nước dùng thanh ngọt và thịt gà thơm ngon.', N'Có sẵn', N'LM003     ')
INSERT [dbo].[MonAn] ([maMonAn], [tenMonAn], [giaTien], [thongTinMon], [trangThaiMonAn], [maLoai]) VALUES (N'M028      ', N'Mì Quảng', 60000, N'Mì Quảng đặc trưng miền Trung với thịt gà, tôm, rau sống.', N'Có sẵn', N'LM003     ')
INSERT [dbo].[MonAn] ([maMonAn], [tenMonAn], [giaTien], [thongTinMon], [trangThaiMonAn], [maLoai]) VALUES (N'M029      ', N'Ốc luộc', 70000, N'Ốc luộc với lá chanh, thơm ngon và bổ dưỡng.', N'Có sẵn', N'LM002     ')
INSERT [dbo].[MonAn] ([maMonAn], [tenMonAn], [giaTien], [thongTinMon], [trangThaiMonAn], [maLoai]) VALUES (N'M030      ', N'Tom rang muối', 80000, N'Tôm rang muối giòn ngon, đậm đà hương vị.', N'Có sẵn', N'LM002     ')
INSERT [dbo].[NhanVien] ([maNV], [maTK], [maCa], [tenNV], [sDT], [email], [ngayVaoLam]) VALUES (N'NV001     ', N'TK001     ', N'C001      ', N'Trần Anh Hào', N'0386810184', N'anhhaopyke@gmail.com', CAST(N'2024-01-10' AS Date))
INSERT [dbo].[NhanVien] ([maNV], [maTK], [maCa], [tenNV], [sDT], [email], [ngayVaoLam]) VALUES (N'NV002     ', N'TK002     ', N'C003      ', N'Trần Haof Anh', N'0987654321', N'b.tran@student.iuh.edu.vn.com', CAST(N'2024-02-15' AS Date))
INSERT [dbo].[TaiKhoan] ([maTK], [tenTK], [chucVu], [matKhau]) VALUES (N'TK000     ', N'hao', N'nhân viên', N'1234567Aa')
INSERT [dbo].[TaiKhoan] ([maTK], [tenTK], [chucVu], [matKhau]) VALUES (N'TK001     ', N'hao123A', N'nhân viên', N'1234567Aa')
INSERT [dbo].[TaiKhoan] ([maTK], [tenTK], [chucVu], [matKhau]) VALUES (N'TK002     ', N'haoql1', N'quản lý', N'1234567Aa')
INSERT [dbo].[TaiKhoan] ([maTK], [tenTK], [chucVu], [matKhau]) VALUES (N'TK003     ', N'hao12', N'nhân viên', N'1234567Aa')
INSERT [dbo].[YeuCauKhachHang] ([maYeuCau], [maKH]) VALUES (N'YC001     ', N'KH004     ')
INSERT [dbo].[YeuCauKhachHang] ([maYeuCau], [maKH]) VALUES (N'YC002     ', N'KH001     ')
ALTER TABLE [dbo].[Ban]  WITH CHECK ADD  CONSTRAINT [FK_Ban_LoaiBan] FOREIGN KEY([maLoai])
REFERENCES [dbo].[LoaiBan] ([maLoai])
GO
ALTER TABLE [dbo].[Ban] CHECK CONSTRAINT [FK_Ban_LoaiBan]
GO
ALTER TABLE [dbo].[ChiTietYeuCau]  WITH CHECK ADD  CONSTRAINT [FK_ChiTietYeuCau_MonAn] FOREIGN KEY([maMonAn])
REFERENCES [dbo].[MonAn] ([maMonAn])
GO
ALTER TABLE [dbo].[ChiTietYeuCau] CHECK CONSTRAINT [FK_ChiTietYeuCau_MonAn]
GO
ALTER TABLE [dbo].[ChiTietYeuCau]  WITH CHECK ADD  CONSTRAINT [FK_ChiTietYeuCau_YeuCauKhachHang] FOREIGN KEY([maYeuCau])
REFERENCES [dbo].[YeuCauKhachHang] ([maYeuCau])
GO
ALTER TABLE [dbo].[ChiTietYeuCau] CHECK CONSTRAINT [FK_ChiTietYeuCau_YeuCauKhachHang]
GO
ALTER TABLE [dbo].[HoaDon]  WITH CHECK ADD  CONSTRAINT [FK_HoaDon_Ban] FOREIGN KEY([maBan])
REFERENCES [dbo].[Ban] ([maBan])
GO
ALTER TABLE [dbo].[HoaDon] CHECK CONSTRAINT [FK_HoaDon_Ban]
GO
ALTER TABLE [dbo].[HoaDon]  WITH CHECK ADD  CONSTRAINT [FK_HoaDon_NhanVien] FOREIGN KEY([maNV])
REFERENCES [dbo].[NhanVien] ([maNV])
GO
ALTER TABLE [dbo].[HoaDon] CHECK CONSTRAINT [FK_HoaDon_NhanVien]
GO
ALTER TABLE [dbo].[HoaDon]  WITH CHECK ADD  CONSTRAINT [FK_HoaDon_YeuCauKhachHang1] FOREIGN KEY([maYeuCau])
REFERENCES [dbo].[YeuCauKhachHang] ([maYeuCau])
GO
ALTER TABLE [dbo].[HoaDon] CHECK CONSTRAINT [FK_HoaDon_YeuCauKhachHang1]
GO
ALTER TABLE [dbo].[MonAn]  WITH CHECK ADD  CONSTRAINT [FK_MonAn_LoaiMon] FOREIGN KEY([maLoai])
REFERENCES [dbo].[LoaiMon] ([maLoai])
GO
ALTER TABLE [dbo].[MonAn] CHECK CONSTRAINT [FK_MonAn_LoaiMon]
GO
ALTER TABLE [dbo].[NhanVien]  WITH CHECK ADD  CONSTRAINT [FK_NhanVien_CaLamViec] FOREIGN KEY([maCa])
REFERENCES [dbo].[CaLamViec] ([maCa])
GO
ALTER TABLE [dbo].[NhanVien] CHECK CONSTRAINT [FK_NhanVien_CaLamViec]
GO
ALTER TABLE [dbo].[NhanVien]  WITH CHECK ADD  CONSTRAINT [FK_NhanVien_TaiKhoan] FOREIGN KEY([maTK])
REFERENCES [dbo].[TaiKhoan] ([maTK])
GO
ALTER TABLE [dbo].[NhanVien] CHECK CONSTRAINT [FK_NhanVien_TaiKhoan]
GO
ALTER TABLE [dbo].[YeuCauKhachHang]  WITH CHECK ADD  CONSTRAINT [FK_YeuCauKhachHang_KhachHang] FOREIGN KEY([maKH])
REFERENCES [dbo].[KhachHang] ([maKH])
GO
ALTER TABLE [dbo].[YeuCauKhachHang] CHECK CONSTRAINT [FK_YeuCauKhachHang_KhachHang]
GO
USE [master]
GO
ALTER DATABASE [QuanLyDatBan] SET  READ_WRITE 
GO
