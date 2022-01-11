package com.example.bluecalmmarket

import android.graphics.drawable.Drawable

class SpData {
    private var name = arrayOf(
            "Samsung Galaxy S21",
            "IPhone 12 Pro Max",
            "Xiaomi Mi 11",
            "Oppo Reno 5 Pro 5G",
            "Vivo X60 Pro",
            "Realme Narzo 30",
            "Xiaomi Poco M3",
            "Infinix Zero 8i",
            "Xiaomi Poco X3 NFC",
            "Realme X9 Pro"
    )

    fun getName(i : Int) : String {
        return name[i]
    }

    private var price = arrayOf(
            "Rp. 16.399.000",
            "Rp. 18.999.000",
            "Rp. 5.999.000",
            "Rp. 7.445.000",
            "Rp. 10.990.000",
            "Rp. 2.299.000",
            "Rp. 2.285.000",
            "Rp. 2.650.000",
            "Rp. 3.399.000",
            "Rp. 4.599.000"
    )

    fun getPrice(i : Int) : String {
        return price[i]
    }

    private var detail = arrayOf(
            "•\tLayar : Type Dynamic AMOLED 2X, 120Hz, HDR10+, 1500 nits (peak)\n" +
                    "•\tUkuran : 6.8 inches, 112.1 cm2 (~89.8% screen-to-body ratio)\n" +
                    "•\tResolusi : 1440 x 3200 pixels, 20:9 ratio (~515 ppi density)\n" +
                    "•\tOS : Android 11, One UI 3.1\n" +
                    "•\tChipset : Exynos 2100 (5 nm) – International\n" +
                    "•\tCPU : Octa-core (1×2.9 GHz Cortex-X1 & 3×2.80 GHz Cortex-A78 & 4×2.2 GHz Cortex-A55)\n" +
                    "•\tGPU : Mali-G78 MP14\n" +
                    "•\tRAM/ROM : 12 GB, 16 GB / 128GB, 256GB, 512GB\n" +
                    "•\tMemori Eksternal: No\n" +
                    "•\tKamera Utama : Quad 108 MP, f/1.8, 24mm (wide), 1/1.33″, 0.8µm, PDAF, Laser AF, OIS\n" +
                    "o\t10 MP, f/4.9, 240mm (periscope telephoto), 1/3.24″, 1.22µm,\n" +
                    "o\t10 MP, f/2.4, 70mm (telephoto), 1/3.24″, 1.22µm,\n" +
                    "o\t12 MP, f/2.2, 13mm (ultrawide), 1/2.55″, 1.4µm, dual pixel PDAF, Super Steady video\n" +
                    "•\tFeatures LED flash, auto-HDR, panorama\n" +
                    "•\tVideo : 8K@24fps, 4K@30/60fps, 1080p@30/60/240fps, 720p@960fps, HDR10+,gyro-EIS\n" +
                    "•\tKamera Selfie : 40 MP, f/2.2, 26mm (wide), 1/2.8″, 0.7µm, PDAF\n" +
                    "•\tUSB : USB Type-C 3.2, USB On-The-Go\n" +
                    "•\tBaterai : Li-Ion 5000 mAh, non-removable + Fast charging 25W + wireless charging 15W\n" +
                    "•\tWarna : Phantom Black, Phantom Silver, Phantom Titanium, Phantom Navy, Phantom Brown\n" +
                    "•\tAnTuTu : 657150 (v8)\n",
            "•\tDimensi : 146.7 x 71.5 x 7.4 mm (5.78 x 2.81 x 0.29 in)\n" +
                    "•\tBerat : 189 gr\n" +
                    "•\tLayar : Super Retina XDR OLED, HDR10, 800 nits (typ), 1200 nits (peak)\n" +
                    "•\tUkuran : 6.1 inches, 90.2 cm2 (~86.0% screen-to-body ratio)\n" +
                    "•\tResolusi : 1170 x 2532 pixels, 19.5:9 ratio (~460 ppi density)\n" +
                    "•\tOS : iOS 14.1, upgradable to iOS 14.2\n" +
                    "•\tChipset : Apple A14 Bionic (5 nm)\n" +
                    "•\tCPU : Hexa-core (2×3.1 GHz Firestorm + 4×1.8 GHz Icestorm)\n" +
                    "•\tGPU : Apple GPU (4-core graphics)\n" +
                    "•\tRAM : 6GB\n" +
                    "•\tInternal : 128GB/256GB/512GB\n" +
                    "•\tKamera : Triple Kamera 12 MP, f/1.6, 26mm (wide), 1.4µm, dual pixel PDAF, OIS\n" +
                    "o\t12 MP, f/2.0, 52mm (telephoto), 1/3.4″, 1.0µm, PDAF, OIS, 2x optical zoom\n" +
                    "o\t12 MP, f/2.4, 120?, 13mm (ultrawide), 1/3.6″\n" +
                    "o\tSelfie : Singel Kamera 12 MP, f/2.2, 23mm (wide), 1/3.6″\n" +
                    "•\tWLAN : Wi-Fi 802.11 a/b/g/n/ac, dual-band, Wi-Fi Direct, hotspot\n" +
                    "•\tBluetooth : 5.0, A2DP, LE\n" +
                    "•\tNFC : Unspecified\n" +
                    "•\tUSB : Lightning, USB 2.0\n" +
                    "•\tType : Li-Ion 2815 mAh, non-removable (10.78 Wh)\n" +
                    "•\tCharging : Fast charging 20W, 50% in 30 min (advertised)\n",
            "•\tLayar : Type AMOLED, 1B colors, 120Hz, HDR10+, 1500 nits (peak)\n" +
                    "•\tResolusi : 1440 x 3200 pixels, 20:9 ratio (~515 ppi density)\n" +
                    "•\tOS : Android 11, MIUI 12.5\n" +
                    "•\tChipset : Qualcomm SM8350 Snapdragon 888 (5 nm)\n" +
                    "•\tCPU : Octa-core (1×2.84 GHz Kryo 680 & 3×2.42 GHz Kryo 680 & 4×1.80 GHz Kryo 680\n" +
                    "•\tGPU : Adreno 660\n" +
                    "•\tRAM/ROM : 8GB, 12 GB / 128GB, 256GB\n" +
                    "•\tMemori Eksternal: No\n" +
                    "•\tKamera Utama : 108 MP, f/1.9, 26mm (wide), 1/1.33″, 0.8µm, PDAF, OIS\n" +
                    "o\t13 MP, f/2.4, 123? (ultrawide), 1/3.06″, 1.12µm\n" +
                    "o\t5 MP, f/2.4, (macro), 1/5.0″, 1.12µm\n" +
                    "•\tDual-LED dual-tone flash, HDR, panorama\n" +
                    "•\tVideo : 8K@24/30fps, 4K@30/60fps, 1080p@30/60/120/240fps; gyro-EIS, HDR10+\n" +
                    "•\tKamera Selfie : 20 MP, 27mm (wide), 1/3.4″, 0.8µm\n" +
                    "•\tNFC : Yes\n" +
                    "•\tUSB : microUSB 2.0, USB On-The-Go\n" +
                    "•\tBaterai : Type Li-Po 4600 mAh, non-removable + Fast charging 55W, 100% in 45 min\n" +
                    "•\tWarna : Horizon Blue, Cloud White, Midnight Gray, Special Edition Blue, Gold, Violet\n",
            "•\tLayar : Type Super AMOLED, 90Hz, HDR10+, 800 nits (typ), 1100 nits (peak)\n" +
                    "•\tUkuran : 6.55 inches, 103.6 cm2 (~88.6% screen-to-body ratio)\n" +
                    "•\tResolusi : 1080 x 2400 pixels, 20:9 ratio (~402 ppi density)\n" +
                    "•\tOS : Android 11, ColorOS 11.1\n" +
                    "•\tChipset : Mediatek MT6889Z Dimensity 1000+ (7nm)\n" +
                    "•\tCPU : Octa-core (4×2.6 GHz Cortex-A77 & 4×2.0 GHz Cortex-A55)\n" +
                    "•\tGPU : Mali-G77 MC9\n" +
                    "•\tRAM/ROM : 8 GB, 12 GB / 128GB, 256GB\n" +
                    "•\tMemori Eksternal: No\n" +
                    "•\tKamera Utama : Quad 64 MP, f/1.7, 26mm (wide), 1/1.73″, 0.8µm, PDAF\n" +
                    "o\t8 MP, f/2.2, 115? (ultrawide), 1/4.0″, 1.12µm\n" +
                    "o\t2 MP, f/2.4, (macro)\n" +
                    "o\t2 MP, f/2.4, (depth)\n" +
                    "•\tFeatures LED flash, HDR, panorama\n" +
                    "•\tVideo : 4K@30fps, 1080p@30/60/120fps; gyro-EIS, HDR\n" +
                    "•\tKamera Selfie : 32 MP, f/2.4, 26mm (wide), 1/2.8″, 0.8µm\n" +
                    "•\tUSB : USB Type-C 3.2, USB On-The-Go\n" +
                    "•\tBaterai : Li-Ion 4350 mAh, non-removable + Fast charging 65W SuperVOOC 2.0\n" +
                    "•\tWarna : Astral Blue, Starry Black, Starry Dream, Star Wish Red\n" +
                    "\n" +
                    "Rp7.445.000\n" +
                    "5. Spesifikasi Kunci Vivo X60 Pro\n" +
                    "•\tLayar : Type AMOLED, 120Hz, HDR10+, 1300 nits (peak)\n" +
                    "•\tUkuran : 6.56 inches, 104.6 cm2 (~89.8% screen-to-body ratio)\n" +
                    "•\tResolusi : 1080 x 2376 pixels (~398 ppi density)\n" +
                    "•\tOS : Android 11, OriginOS 1.0\n" +
                    "•\tChipset : Qualcomm SM8350 Snapdragon 888 (5 nm)\n" +
                    "•\tCPU : Octa-core (1×2.84 GHz Kryo 680 & 3×2.42 GHz Kryo 680 & 4×1.80 GHz Kryo 680\n" +
                    "•\tGPU : Adreno 660\n" +
                    "•\tEksternal : Yes\n" +
                    "•\tRAM/ROM : 8GB, 12GB RAM/128GB, 256GB\n" +
                    "•\tKamera Utama : Quad 50 MP, f/1.6, (wide), 1/1.31″, 1.2µm, dual pixel PDAF, Laser AF, OIS\n" +
                    "o\t8 MP, f/3.4, 125mm (periscope telephoto), 1/4.0″, PDAF, OIS, 5x optical zoom\n" +
                    "o\t32 MP, f/2.1, 50mm (telephoto), 1/2.8″, 0.8µm, PDAF, 2x optical zoom\n" +
                    "o\t48 MP, 114? (ultrawide), 1/2.0″, 0.8µm, gimbal stabilization\n" +
                    "•\tFitur : Zeiss optics, dual-LED dual-tone flash, HDR, panorama\n" +
                    "•\tVideo : 1080p@30fps\n" +
                    "•\tKamera Depan : Single 32 MP, f/2.5, 26mm (wide), 1/2.8″, 0.8µm\n" +
                    "•\tNFC : Yes\n" +
                    "•\tUSB : microUSB 2.0, USB On-The-Go\n" +
                    "•\tBaterai : Type Li-Po 4200 mAh, non-removable + Fast charging 55W\n" +
                    "•\tWarna : Orange, Dark Blue\n",
            "•\tLayar : Type AMOLED, 120Hz, HDR10+, 1300 nits (peak)\n" +
                    "•\tUkuran : 6.56 inches, 104.6 cm2 (~89.8% screen-to-body ratio)\n" +
                    "•\tResolusi : 1080 x 2376 pixels (~398 ppi density)\n" +
                    "•\tOS : Android 11, OriginOS 1.0\n" +
                    "•\tChipset : Qualcomm SM8350 Snapdragon 888 (5 nm)\n" +
                    "•\tCPU : Octa-core (1×2.84 GHz Kryo 680 & 3×2.42 GHz Kryo 680 & 4×1.80 GHz Kryo 680\n" +
                    "•\tGPU : Adreno 660\n" +
                    "•\tEksternal : Yes\n" +
                    "•\tRAM/ROM : 8GB, 12GB RAM/128GB, 256GB\n" +
                    "•\tKamera Utama : Quad 50 MP, f/1.6, (wide), 1/1.31″, 1.2µm, dual pixel PDAF, Laser AF, OIS\n" +
                    "o\t8 MP, f/3.4, 125mm (periscope telephoto), 1/4.0″, PDAF, OIS, 5x optical zoom\n" +
                    "o\t32 MP, f/2.1, 50mm (telephoto), 1/2.8″, 0.8µm, PDAF, 2x optical zoom\n" +
                    "o\t48 MP, 114? (ultrawide), 1/2.0″, 0.8µm, gimbal stabilization\n" +
                    "•\tFitur : Zeiss optics, dual-LED dual-tone flash, HDR, panorama\n" +
                    "•\tVideo : 1080p@30fps\n" +
                    "•\tKamera Depan : Single 32 MP, f/2.5, 26mm (wide), 1/2.8″, 0.8µm\n" +
                    "•\tNFC : Yes\n" +
                    "•\tUSB : microUSB 2.0, USB On-The-Go\n" +
                    "•\tBaterai : Type Li-Po 4200 mAh, non-removable + Fast charging 55W\n" +
                    "•\tWarna : Orange, Dark Blue\n",
            "•\tLayar : Type IPS LCD, 120Hz , 480 nits (typ), 600 nits (peak)\n" +
                    "•\tUkuran : 6.5 inches, 102.0 cm2 (~83.7% screen-to-body ratio)\n" +
                    "•\tResolusi : 1080 x 2400 pixels, 20:9 ratio (~405 ppi density)\n" +
                    "•\tOS : Android 10, Realme UI\n" +
                    "•\tChipset : MediaTek MT6853 Dimensity 800U 5G (7 nm)\n" +
                    "•\tCPU : Octa-core (2×2.4 GHz Cortex-A76 & 6×2.0 GHz Cortex-A55)\n" +
                    "•\tGPU : Mali-G57 MC3\n" +
                    "•\tRAM/ROM : 6 GB, 8 GB / 128GB, 256GB\n" +
                    "•\tMemori Eksternal: No\n" +
                    "•\tKamera Utama : Triple 48 MP, f/1.8, 26mm (wide), 1/2.0″, 0.8µm, PDAF\n" +
                    "o\t8 MP, f/2.3, 119? (ultrawide), 1/4.0″, 1.12µm\n" +
                    "o\t2 MP, f/2.4, (macro)\n" +
                    "•\tFeatures LED flash, HDR, panorama\n" +
                    "•\tVideo : 4K@30fps, 1080p@30/60/120fps, gyro-EIS\n" +
                    "•\tKamera Selfie : Single 16 MP, f/2.1, 26mm (wide), 1/3.09″, 1.0µm\n" +
                    "•\tUSB : Type-C 2.0, USB On-The-Go\n" +
                    "•\tBaterai : Li-Ion 5000 mAh, non-removable + Fast charging 30W, 50% in 25 min, 100% in 65 min\n" +
                    "•\tWarna : Sword Black, Blade Silver\n",
            "•\tLayar : Type IPS LCD, 400 nits (typ)\n" +
                    "•\tUkuran : 6.53 inches, 104.7 cm2 (~83.4% screen-to-body ratio)\n" +
                    "•\tResolusi : 1080 x 2340 pixels, 19.5:9 ratio (~395 ppi density)\n" +
                    "•\tOS : OS Android 10, MIUI 12\n" +
                    "•\tChipset : Qualcomm SM6115 Snapdragon 662 (11 nm)\n" +
                    "•\tCPU : Octa-core (4×2.0 GHz Kryo 260 Gold & 4×1.8 GHz Kryo 260 Silver)\n" +
                    "•\tGPU : Adreno 610\n" +
                    "•\tRAM : 4GB\n" +
                    "•\tInternal : 64GB/128GB\n" +
                    "•\tKamera : Triple 48 MP, f/1.8, (wide), 1/2.0″, 0.8µm, PDAF\n" +
                    "o\t2 MP, f/2.4, (macro)\n" +
                    "o\t2 MP, f/2.4, (depth)\n" +
                    "•\tSelfie : Single 8 MP, f/2.1, (wide), 1/4.0″, 1.12µm\n" +
                    "•\tWLAN : Wi-Fi 802.11 a/b/g/n/ac, dual-band, Wi-Fi Direct, hotspot\n" +
                    "•\tBluetooth : Bluetooth 5.0, A2DP, LE\n" +
                    "•\tUSB : USB Type-C 2.0, USB On-The-Go\n" +
                    "•\tSensor : Fingerprint (side-mounted), accelerometer, proximity, compass\n" +
                    "•\tBaterai : Type Li-Po 6000 mAh, non-removable + Fast charging 18W\n" +
                    "•\tWarna : Cool Blue, Poco Yellow, Power Black\n",
            "•\tLayar : IPS LCD, 90Hz, 480 nits (typ)\n" +
                    "•\tUkuran : 6.85 inches, 111.4 cm2 (~86.8% screen-to-body ratio)\n" +
                    "•\tResolusi : 1080 x 2460 pixels (~392 ppi density)\n" +
                    "•\tOS : Android 10\n" +
                    "•\tChipset : Mediatek MT6785 Helio G90T (12 nm)\n" +
                    "•\tCPU : Octa-core (2×2.05 GHz Cortex-A76 & 6×2.0 GHz Cortex-A55)\n" +
                    "•\tGPU : Mali-G76 MC4\n" +
                    "•\tRAM/ROM : 8 GB / 128GB\n" +
                    "•\tMemori Eksternal: No\n" +
                    "•\tKamera Utama : Quad 48 MP, f/1.8, (wide), PDAF\n" +
                    "o\t8 MP, 119? (ultrawide), 1/4.0″, 1.12µm\n" +
                    "o\t2 MP, (depth)\n" +
                    "o\t4th unknown camera\n" +
                    "•\tFeatures Quad-LED flash, HDR, panorama\n" +
                    "•\tVideo : 4K@30fps, 1080p@30/60fps, gyro-EIS\n" +
                    "•\tKamera Selfie : Dual 16 MP, f/2.0, (wide)\n" +
                    "•\t8 MP, f/2.2, 105? (ultrawide), 1/4.0″, 1.12µm\n" +
                    "•\tUSB : Type-C 2.0, USB On-The-Go\n" +
                    "•\tBaterai : Li-Ion 4500 mAh, non-removable + Fast charging 33W\n" +
                    "•\tWarna : Silver Diamond, Black Diamond\n",
            "•\tLayar : IPS LCD, 120Hz, HDR10, 450 nits (typ)\n" +
                    "•\tUkuran : 6.67 inches, 107.4 cm2 (~84.6% screen-to-body ratio)\n" +
                    "•\tResolusi : 1080 x 2400 pixels, 20:9 ratio (~395 ppi density)\n" +
                    "•\tOS : Android 10, MIUI 12\n" +
                    "•\tChipset : Qualcomm SM7150-AC Snapdragon 732G (8 nm)\n" +
                    "•\tCPU : Octa-core (2×2.3 GHz Kryo 470 Gold & 6×1.8 GHz Kryo 470 Silver)\n" +
                    "•\tGPU : Adreno 618\n" +
                    "•\tRAM : 6GB/8GB\n" +
                    "•\tInternal : 64GB/128GB\n" +
                    "•\tKamera : Quad Kamera 64 MP, f/1.9, (wide), 1/1.73″, 0.8µm, PDAF\n" +
                    "o\t13 MP, f/2.2, 119? (ultrawide), 1.0µm\n" +
                    "o\t2 MP, f/2.4, (macro)\n" +
                    "o\t2 MP, f/2.4, (depth)\n" +
                    "•\tSelfie : Singel Kamera 20 MP, f/2.2, (wide), 1/3.4″, 0.8µm\n" +
                    "•\tWLAN : Wi-Fi 802.11 a/b/g/n/ac, dual-band, Wi-Fi Direct, hotspot\n" +
                    "•\tBluetooth : 5.0, A2DP, LE\n" +
                    "•\tNFC : Unspecified\n" +
                    "•\tUSB : USB Type-C 2.0\n" +
                    "•\tType : Li-Po 5160 mAh, non-removable\n" +
                    "•\tCharging : Fast charging 33W, 62% in 30 min, 100% in 65 min (advertised)\n",
            "•\tLayar : Type OLED, HDR10, 120Hz\n" +
                    "•\tResolusi : 1080 x 2400 pixels, 20:9 ratio (~411 ppi density)\n" +
                    "•\tOS : Android 11, Realme UI 2\n" +
                    "•\tChipset : MediaTek Dimensity 1200 5G (6 nm)\n" +
                    "•\tCPU : Octa-core (1×3.0 GHz Cortex-A78 & 3×2.6 GHz Cortex-A78 & 4×2.0 GHz Cortex-A55)\n" +
                    "•\tGPU : Mali-G77 MC9\n" +
                    "•\tRAM/ROM : 8GB, 12 GB / 128GB, 256GB\n" +
                    "•\tMemori Eksternal: No\n" +
                    "•\tKamera Utama : Triple 108 MP, (wide), PDAF\n" +
                    "o\t13 MP, (telephoto)\n" +
                    "o\t13 MP, (ultrawide)\n" +
                    "•\tLED flash, HDR, panorama\n" +
                    "•\tVideo : 4K@30fps, 1080p@30/60/120fps, gyro-EIS\n" +
                    "•\tKamera Selfie : 20 MP, 27mm (wide), 1/3.4″, 0.8µm\n" +
                    "•\tNFC : Yes\n" +
                    "•\tUSB : microUSB 2.0, USB On-The-Go\n" +
                    "•\tBaterai : Type Li-Po 4500 mAh, non-removable + Fast charging 65W\n" +
                    "•\tWarna : Black; other colors\n"
    )

    fun getDetail(i : Int) : String {
        return detail[i]
    }

    private var img = arrayOf(
            R.drawable.sp3,
            R.drawable.sp4,
            R.drawable.sp1,
            R.drawable.sp2,
            R.drawable.sp5,
            R.drawable.sp6,
            R.drawable.sp7,
            R.drawable.sp8,
            R.drawable.sp9,
            R.drawable.sp10
    )

    fun getImg(i : Int): Int {
        return img[i]
    }

    fun listdata() : ArrayList<Smarthphone> {
        var list = arrayListOf<Smarthphone>()
        for (position in name.indices) {
            val sp = Smarthphone()
            sp.name = name[position]
            sp.price = price[position]
            sp.detail = detail[position]
            sp.img = img[position]
            list.add(sp)
        }
        return list
    }
}