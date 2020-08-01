INSERT INTO shopitems (id, name, price, duration, pricelist_item_id) VALUES
 (0,'Masaż Relaksacyjny Pleców',
60,40, 0),
 (1,'Masaż klasyczny: Segmentarny',
60,30, 1),
 (2,'Masaż klasyczny: Całościowy',
120,60, 1),
 (3,'Masaż Głowy',
20,15, 2),
 (4,'Masaż karku i szyi',
30,20, 3),
 (5,'Likwidacja haluksów',
20,20, 4),
 (6,'Masaż Relaksacyjny Całościowy',
120,60, 5),

 (7,'Masaż leczniczy pleców',
60,45, 6),
 (8,'Masaż leczniczy segmentarny',
40,30, 6),
 (9,'Shantala (niemowląt, małych dzieci)',
50,30, 7),
 (10,'Izometryczny',
50,30, 8),
 (11,'Drenaż limfatyczny segmentarny',
60,40, 9),
 (12,'Drenaż limfatyczny całościowy',
120,90, 9),
 (13,'Sportowy całościowy',
120,60, 10),
 (14,'Sportowy segmentarny',
70,30, 10),
 (15,'Likwidacja haluksów',
20,20, 11),

 (16,'Modelująco-ujędrniający całościowy',
120,60, 12),
 (17,'Modelująco-ujędrniający segmentarny',
60,40, 12),
 (18,'Wyszczuplający z ekstraktem chilli całościowy',
100,60, 13),
 (19,'Wyszczuplający z ekstraktem chilli segmentarny (pośladki, uda, ramiona)',
 60,30, 13),

 (20,'Masaż Gorącymi Kamieniami całościowy',
120,60, 14),
 (21,'Masaż Gorącymi Kamieniami pleców',
60,40, 14),
 (22,'Masaż Bańkami chińskimi',
60,30, 15),
 (23,'Miodowy pleców',
60,30, 16),
 (24,'Miodowy twarzy',
30,15, 16),
 (25,'Masaż Tajski całościowy',
160,90, 17),
 (26,'Masaż świecą pleców',
60,40, 18),
 (27,'Masaż świecą całego ciała',
120,90, 18),

 (28,'Rehabilitacja ruchowa',
60,45, 19),
 (29,'Gimnastyka korekcyjna, instruktażowa',
50,45, 20),
 (30,'Terapia manualna, usprawnianie manualne',
60,30, 21),
 (31,'Taping rehabilitacyjny:(kinesjology taping, plastry kinezjologiczne)',
200,0, 22),
 (32,'Rehabilitacja neurologiczna:(noworodki, niemowlęta, dorośli)',
40,30, 23),
 (33,'Pętla Glissona',
20,15, 24),
 (34,'Okłady Borowinowe',
100,0, 25),
 (35,'Lampa Sollux',
20,15, 26),
 (36,'Świecowanie uszu',
30,0, 27);

INSERT INTO pricelist_items (id, description, image_link, type) VALUES
(
    0,
    'Te techniki masażu dają niezwykłe uczucie odprężenia, dodatkowo spotęgowane poprzez dobór zapachu w zależności od nastroju, stanu zdrowia oraz samopoczucia w jakim się znajdujemy.',
    '','BASIC'
),
(
    1,
    'Przyspiesza krążenie krwi i limfy, zmniejsza napięcie mięśni, przywraca jędrność skóry i poprawia nastrój.',
    '','BASIC'
),
(
    2,
    'Masaż głowy to cudowny sposób na relaks. Odpręża, rozluźnia, pozbawia stresu, sprawia, że odpływa z nas całe nagromadzone napięcie. Dobra alternatywa dla tabletki przeciwbólowej. Masaż głowy przyniesie ulgę i upragnione odprężenie.',
    '','BASIC'
),
(
    3,
    'Masaż karku i szyi posiada wspaniałe właściwości rozluźniające i relaksacyjne. Łagodzi ból szyi i karku oraz mięśni obręczy barkowej. Znosi napięcia twarzy i głowy. Działa odprężająco, redukuje stres.',
    '','BASIC'
),
(
    4,
    'Poprzez masaż i ćwiczenia można pozbyć się bólu i w znacznym stopniu, bez skalpela pozbyć się zwyrodnień.Systematyczne ćwiczenia zmniejszają ból i opóźniają rozwój wady. Codziennie poświęć stopom chwilę, a wzmocnisz mięśnie i poprawisz ruchomość dużego palca stopy!',
    '', 'BASIC'
),
(
    5,
    'Te techniki masażu dają niezwykłe uczucie odprężenia, dodatkowo spotęgowane poprzez dobór zapachu w zależności od nastroju, stanu zdrowia oraz samopoczucia w jakim się znajdujemy.',
    '', 'BASIC'
),

(
    6,
    'Masaż oddziałuje na spięte mięśnie, powięzi, tkanki łączne oraz stawy. Łączy w sobie klasyczną metodę masażu pleców z różnymi terapiami pobocznymi typu np: oddziaływanie na powięzi. Jego celem jej poprawa samopoczucia w kontekście działania przeciwbólowego i zniwelowania napięcia w obrębie kręgosłupa, barków i szyi',
    '', 'SPECIAL'
),
(
    7,
    'Uspokaja, wycisza, w efekcie pomaga też w uregulowaniu snu korzystnie wpływa na stan skóry, na krążenie poprawia naturalną odporność dziecka dzięki pobudzaniu układu limfatycznego dzieciom mającym kolki może pomóc w oddawaniu gazów, trawieniu.',
    '', 'SPECIAL'
),
(
    8,
    'Odbuduje masę mięśniową i poprawi kondycję mięśni całego ciała, zredukuje tkankę tłuszczową na nogach, udach, pośladkach, ramionach i brzuchu zredukuje cellulit i poprawi ogólną kondycję skóry poprzez jej lepsze ujędrnienie.',
    '', 'SPECIAL'
),
(
    9,
    'Do głównych zadań masażu należy: przeciwdziałanie lub likwidacja obrzęków zapalnych, chłonnych, zastoinowych czy onkotycznych oraz przyspieszenie usunięcia z organizmu produktów przemiany materii.',
    '', 'SPECIAL'
),
(
    10,
    'Przyspiesza regeneracje mięśni i stawów po intensywnym treningu, oddziałuje pobudzająco na ośrodkowy układ nerwowy, przyspiesza proces przemiany materii w tkankach, tym samym wpływa na lepsze ich odżywianie. Masaż wykonuje się również na przyrost masy mięśniowej, wzrost siły i wytrzymałości, doskonale wpływa na krążenie, elastyczność oraz napięcie mięśniowe.',
    '', 'SPECIAL'
),
(
    11,
    'Systematyczne ćwiczenia zmniejszają ból i opóźniają rozwój wady. Codziennie poświęć stopom chwilę, a wzmocnisz mięśnie i poprawisz ruchomość dużego palca stopy! Masaż stóp pomaga w znacznym stopniu zmniejszyć haluksy.',
    '', 'SPECIAL'
),
(
    12,
    'Cel: terapia nadwagi. Redukcja tkanki tłuszczowej, modelowanie sylwetki po ciąży, redukcja cellulitu',
    '', 'CONDITIONING'
),
(
    13,
    'Wyjątkowa receptura kremu usprawnia krążenie, przyśpiesza spalanie depozytów tłuszczu oraz poprawia kondycję i koloryt skóry. Powoduje silną stymulację skóry na brzuchu, biodrach i udach, wywołując rozgrzanie, lekkie zaczerwienienie i mrowienie.',
    '', 'CONDITIONING'
),
(
    14,
    'Połączenie ciepłych kamieni z odpowiednimi technikami masażu jest zbawienne dla zmęczonego, zestresowanego ciała i umysłu współczesnego człowieka, relaksuje i regeneruje całe ciało.',
    '', 'ORIENTAL'
),
(
    15,
    'Pobudza krążenie krwi i płynów ustrojowych, pomaga pozbyć się zbędnych produktów przemiany materii oraz toksyn z organizmu. W wyniku przyspieszenia przemiany materii następuje redukcja tkanki tłuszczowej. Ma nieocenioną moc w zastosowaniu w kuracji antycellulitowej lub jako drenaż limfatyczny. uelastycznia i wygładza skórę, rozbija tkankę tłuszczową, zwiększa ukrwienie tkanek, dzięki czemu ułatwia penetrację preparatów wyszczuplających w głąb skóry stosowanych po zabiegu. Efektem jest wyraźna poprawa jakości skóry, znacznie zmniejszony, a w niektórych przypadkach zlikwidowany cellulit oraz zmniejszony obwód części ciała, które były poddane masażowi.',
    '', 'ORIENTAL'
),
(
    16,
    'Podstawowym efektem masażu ciepłym miodem jest zwiększenie wydzielania gruczołów potowych, co umożliwia intensywną detoksykację organizmu poprzez skórę. Ponadto naprzemienne naciski i odrywanie lepkich dłoni terapeuty od ciała pobudzają krążenie krwi, wzmacniają naczynia krwionośne, łagodzą bóle reumatyczne i ujędrniają skórę. Z tej ostatniej przyczyny ta terapia bywa zalecana kobietom narzekającym na rozstępy po ciąży lub odchudzaniu. Ponadto masaż miodowy, działając odżywczo na całą skórę, pomaga pozbyć się blizn pozostałych po wypadkach i operacjach. ',
    '', 'ORIENTAL'
),
(
    17,
    'Masaż usuwa napięcia z mięśni i stawów jednocześnie je wzmacniając, w efekcie czego poprawia ich elastyczność i uwalnia od bólu głowę, plecy, ramiona, kark czy nogi. Poprawia jakość snu, przynosi ulgę w psychicznym zmęczeniu oraz w stanach depresji. Zbawiennie wpływa na problemy czynnościowe narządów wewnętrznych, poprawia perystaltykę jelit i przemianę materii, wspomaga odtruwanie organizmu z nagromadzonych toksyn, a także pobudza krążenie krwi i limfy wzmacniając odporność.',
    '', 'ORIENTAL'
),
(
    18,
    'Zapewnia skórze długotrwałą miękkość i nawilżenie, odżywiona i bardziej elastyczna skóra, neutralizacja wolnych rodników, głęboki relaks, Poprawa stanu skóry w miejscach dotkniętych cellulitem.',
    '', 'ORIENTAL'
),
(
    19,
    'Ćwiczenia ruchowe zarówno czynne, bierne, prowadzone z pomocą terapeuty czy oddechowe. Terapeuta wykorzystuje terapię ruchem do odtworzenia: siły mięśniowej, zakresu ruchu, stabilizacji stawowej i korekcji postawy, prawidłowych  wzorców ruchowych.',
    '', 'PHYSIOTHERAPY'
),
(
    20,
    'Korygowanie istniejących zaburzeń statyki ciała i doprowadzenie jej, o ile jest to możliwe, do stanu  prawidłowego. Wzmacnianie mięśni posturalnych odpowiedzialnych za prawidłową postawę - głównie mięśnie grzbietu i brzucha, stabilizujące kręgosłup. Profilaktyka występowania wad kończyn dolnych, głównie płaskostopia poprzez wzmacnianie mięśni podeszwowych stopy.',
    '', 'PHYSIOTHERAPY'
),
(
    21,
    '(urazy, zwyrodnienia, bóle kręgosłupa, kończyn, migreny)',
    '', 'PHYSIOTHERAPY'
),
(
    22,
    'Ma znaczący wpływ na wspieranie procesów leczniczych i wydolnościowych. Kinesiology taping rekomendowany jest jako metoda zmniejszania bólu i nienaturalnych odczuć skóry i mięśni. Taping redukuje obrzęki i zastoje limfatyczne, wspomaga naturalną pracę mięśni.',
    '', 'PHYSIOTHERAPY'
),
(
    23,
    'Zespół działań rehabilitacyjnych ukierunkowanych na poprawę stanu pacjentów dotkniętych udarem, urazem czaszkowo-mózgowym i innymi schorzeniami neurologicznymi, takimi jak stwardnienie rozsiane czy choroba Parkinsona.

Ideą neurorehabilitacji jest przywrócenie pacjentowi wszystkich funkcji, które zostały utracone w wyniku choroby.',
    '', 'PHYSIOTHERAPY'
),
(
    24,
    'Zmniejszenie zespołów bólowych w odcinku szyjnym.',
    '', 'PHYSIOTHERAPY'
),
(
    25,
    'Łagodzi dolegliwości układu pokarmowego: przewlekłe zapalenia jelit, chorobę wrzodową żołądka, stany kurczowe jelita grubego. Z kolei tampony borowinowe doodbytnicze stosuje się w przypadku stanów zapalnych odbytu, przerostu hemoroidów i szczelin odbytu.
WSKAZANIA DO ZABIEGÓW BOROWINOWYCH
Rwa kulszowa, okres zdrowienia po urazie lub operacji, zwyrodnienia stawów , zesztywniające zapalenie stawów, porażenia, zapalenia przydatków, macicy, zrosty jajników , nerwobóle, choroby zapalne wątroby, choroby żołądka, chorobach skóry, chorobach ginekologicznych, schorzeniach kręgosłupa, chorobach narządu ruchu, w czasie leczenia zwichnięć, złamań, niedokrwieniu kończyn, zrostach otrzewnej, nieżycie żołądka.
Okłady borowinowe rozszerzają naczynia krwionośne, rozgrzewają i rozluźniają tkanki, leczą bóle zatok i stany zapalne, ułatwiając usunięcie wydzieliny.',
    '', 'PHYSIOTHERAPY'
),
(
    26,
    'Głównymi wskazaniami do stosowania lampy sollux w przypadku filtra czerwonego są: stany wysiękowe, uszkodzenia skóry, trudno gojące się rany, trądzik pospolity, czyraki, odleżyny, zapalenie zatok czołowych, szczękowych, nosowych, porażenie nerwu twarzowego, blizny, stany po peracjach/zabiegach chirurgicznych, zapalenie przymacic, oparzenia fotochemiczne.
    Wskazaniami do stosowania lampy sollux w przypadku filtra niebieskiego są: łagodzenie podrażnień, skóra sucha i wrażliwa, złuszczanie naskórka, odmrożenia, rozszerzone naczynia krwionośne, nerwoból nerwu trójdzielnego, nerwoból nerwów potylicznych, rwa kulszowa, świerzb, łuszczyca, miesiączka (po ustąpieniu krwawienia), rozszerzone naczynka, choroba Raynauda.',
    '', 'PHYSIOTHERAPY'
),
(
    27,
    'Świecowanie uszu można wykonać nie tylko w przypadku nadmiaru woskowiny w uszach. Medycyna alternatywna zaleca świecowanie uszu także w przebiegu różnych schorzeń uszu, gardła, nosa. Polecane jest np. w przebiegu zapalenia zatok czy przeziębienia. Ponadto na świecowanie uszu mogą się zdecydować osoby zmagające się z szumami w uszach różnego pochodzenia, a nawet niedosłuchem. Również bóle i zawroty głowy, migreny i zespół przewlekłego zmęczenia są wskazaniem do konchowania uszu.',
    '', 'PHYSIOTHERAPY'
);


