package by.epam.java_intro.module4.aggregationAndComposition_task_3;


public class DataBase {


    static City brest = new City("Brest", 146.12, 340000, true, false);
    static City pinsk = new City("Pinsk", 47.36, 126000, false, false);
    static City baranovichi = new City("Baranovichi", 84.96, 175000, false, false);

    static City vitebsk = new City("Vitebsk", 134.6, 365000, true, false);
    static City braslav = new City("Braslav", 2.28, 10000, false, false);
    static City lepel = new City("Lepel", 17.2, 18000, false, false);

    static City gomel = new City("Gомель", 139.77, 510000, true, false);
    static City mozyr = new City("Mozyr", 44.18, 111000, false, false);
    static City svetlogorsk = new City("Svetlogorsk", 25.86, 65000, false, false);

    static City grodno = new City("Grodno", 142.11, 357000, true, false);
    static City lida = new City("Lida", 45.79, 103000, false, false);
    static City shchuchin = new City("Shchuchin", 15.45, 16000, false, false);

    static City minsk = new City("Minsk", 348.84, 2000000, true, true);
    static City smolevichi = new City("Smolevichi", 16.45, 17000, false, false);
    static City borisov = new City("Borisov", 46.0, 130000, false, false);
    static City logoisk = new City("Logoisk", 15.13, 15000, false, false);

    static City mogilev = new City("Mogilev", 118.5, 357000, true, false);
    static City bobruisk = new City("Bobruisk", 96.4, 212000, false, false);
    static City osipovichi = new City("Osipovichi", 20.32, 30000, false, false);


    static District brestDistr = new District("Brest District", 1544.11, 383000, brest);
    static District pinskDistr = new District("Pinsk District", 3252.77, 172000, pinsk);
    static District baranovichiDistr = new District("Baranovichi District", 2171.88, 205000, baranovichi);

    static District vitebskDistr = new District("Vitebsk District", 2737, 402000, vitebsk);
    static District braslavDistr = new District("Braslav District", 2270.07, 35000, braslav);
    static District lepelDistr = new District("Lepel District", 1822.22, 51000, lepel);

    static District gomelDistr = new District("Gomel District", 1951.4, 578000, gomel);
    static District mozyrDiste = new District("Mozyr District", 1603.47, 133000, mozyr);
    static District svetlogorskDistr = new District("Svetlogors District", 1899.91, 83000, svetlogorsk);

    static District grodnoDistr = new District("Grodno District", 2594.05, 407000, grodno);
    static District lidaDistr = new District("Lida District", 1566.74, 132000, lida);
    static District shchuchinDaistr = new District("Shchuchin District", 1911.54, 40000, shchuchin);

    static District minskDistr = new District("Minsk District", 2251.5, 2215000, minsk);
    static District smolevichiDistr = new District("Smolevichi District", 1394.14, 46000, smolevichi);
    static District logoiskDistr = new District("Logoisk District", 2365.02, 35000, logoisk);
    static District borisovDistr = new District("Borisov District", 2987.63, 180000, borisov);

    static District mogilevDistr = new District("Mogilev District", 1895.4, 397000, mogilev);
    static District bobruiskDistr = new District("Bobruisk District", 1599.05, 228000, bobruisk);
    static District osipovichiDistr = new District("Osipovichi District", 1947.21, 48000, osipovichi);


    static Region brestRegion = new Region("Brest Region", "Brest", brestDistr, baranovichiDistr, pinskDistr);
    static Region vitebskRegion = new Region("Vitebsk Region","Vitebsk", vitebskDistr, brestDistr, lepelDistr, braslavDistr);
    static Region gomelRegion = new Region("Gomel Region","Gomel", gomelDistr, mozyrDiste, svetlogorskDistr);
    static Region grodnoRegion = new Region("Grodno Region","Grodno", grodnoDistr, lidaDistr, shchuchinDaistr);
    static Region minskRegion = new Region("Minsk Region","Minsk", minskDistr, smolevichiDistr, borisovDistr, logoiskDistr);
    static Region mogilevRegion = new Region("Mogilev Region","Mogilev", mogilevDistr, bobruiskDistr, osipovichiDistr);


    static Region [] allRegions  = {brestRegion, vitebskRegion, gomelRegion, grodnoRegion,minskRegion, mogilevRegion};
}

