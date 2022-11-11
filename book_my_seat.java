import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

@SuppressWarnings({" CStyleArrayDeclaration", "SwitchStatementWithTooFewBranches", "EnhancedSwitchMigration"})
public class book_my_seat
{
    static book_my_seat obj=new book_my_seat();

    BufferedReader en = new BufferedReader(new InputStreamReader(System.in));
    double total = 0, amt = 0, Amt = 0, gst, AMT = 0;
    int qty = 0, sna = 0, samt = 0, sqty = 0, stotal = 0, pay = 0;
    String loop, tre, description, name, snam, snak, snc, CITY;
    Random random = new Random();
    int x = random.nextInt(900) + 100;
    int x1 = random.nextInt(900) + 100;
    int x2 = random.nextInt(900) + 100;
    int x3 = random.nextInt(900) + 100;
    int x4 = random.nextInt(900) + 100;
    int x5 = random.nextInt(900) + 100;
    int x6 = random.nextInt(900) + 100;
    int x7 = random.nextInt(900) + 100;
    int x8 = random.nextInt(900) + 100;
    int x9 = random.nextInt(900) + 100;
    double[] Cost = {x,x1,x2,x3,x4,x5,x6,x7,x8,x9};
    String[] Type = {"2D", "3D", "IMAX 3D", "IMAX 2D", "2D", "3D", "IMAX 3D", "IMAX 2D", "2D", "3D", "IMAX 3D", "IMAX 2D"};
    String[] Theaters;
    String[] Eng;
    String[] tam;
    String[] hin;
    String[] kan;
    String[] tel;
    static int T=1;
    public static void main (String args[]) throws IOException {
        String again;
        do {
            BufferedReader kk = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Categories:");
            String [] categories = {"Movies", "Stream", "Music Shows", "Comedy Shows", "Sports", "Plays", "Amusement Park", "Workshop", "Kid Zone", "Unique Tours", "Performance", "Gaming", "Laughter Therapy","Outdoor Events" ,"Explore More."};
            for (int cat = 0; cat < categories.length; cat++){
                System.out.printf("%2d %2s%n", cat+1, categories[cat]);
            }
            System.out.println("Select category:");
            int ct = Integer.parseInt(kk.readLine());
            if(ct == 1)
                obj.structure();
            if(ct == 2)
                obj.Stream();
            if(ct == 3)
                obj.Music_Shows();
            if(ct == 4)
                obj.Comedy_Shows();
            if(ct == 5)
                obj.Sports();
            T+=1;
            System.out.println("do you want to book again ? (yes/no)");
            again = kk.readLine();
        }while(again.equals("yes"));
    }
    public void structure() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Calendar aa = Calendar.getInstance();
        System.out.println("\fDate and time: " + aa.getTime());
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println(" ");
        System.out.println("                            BBBBBB      OOOO      OOOO    KK  KK            MMM      MMM  YY    YY             SSSSSSS  EEEEEEEE      AA      TTTTTTTTTT   ");
        System.out.println("                            BB   BB   OO    OO  OO    OO  KK KK             MM MM  MM MM   YY  YY             SS        EE           AA AA        TT       ");
        System.out.println("                            BBBBBB    OO    OO  OO    OO  KKKK              MM  MM MM MM    YYYY               SSSSSSS  EEEEEEE     AA   AA       TT       ");
        System.out.println("                            BB   BB   OO    OO  OO    OO  KK KK             MM    M   MM     YY                      SS EE         AAAAAAAAA      TT       ");
        System.out.println("                            BBBBBB      OOOO      OOOO    KK  KK            MM        MM     YY                SSSSSSS  EEEEEEEE  AA       AA     TT       ");
        System.out.println("                                                                                THINK IT SEE IT");
        System.out.println("                                                                        FIND BEST PRICES ON MOVIE TICKETS");
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
        String pass;
        String user;
        System.out.println("Enter Username");
        user = br.readLine();
        System.out.println("Enter Password:");
        pass = br.readLine();
        System.out.println("     Choose the Movie Language of your Choice\n");
        String[] lang = {"English","Hindi","Tamil","Kannada","Telugu"};
        int i;
        for (i=0;i<lang.length;i++){
            System.out.println(i+1 + ". " + lang[i]);
        }
        System.out.println("\nTo select a language, type the sl.number of the language");
        int l = Integer.parseInt(br.readLine());
        switch (l) {
            case 1:
                obj.English();
                break;
            case 2:
                obj.Hindi();
                break;
            case 3:
                obj.Tamil();
                break;
            case 4:
                obj.Kannada();
                break;
            case 5:
                obj.Telugu();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + l);
        }
        obj.City();
        obj.Date$Time();
        obj.Tre$Snacks();
        obj.Billing();
        obj.Payments();
        obj.Thanking();
    }
    public void City (){
        System.out.println("Select city:");
        String[] City = {"Mumbai", "Thiruvananthapuram", "Delhi", "Kolkata", "Chennai", "Bangalore", "Hyderabad", "Ahmedabad", "Pune", "Surat", "Jaipur", "Kanpur", "Lucknow", "Nagpur", "Indore", "Patna", "Bhopal", "Thane", "Vadodara", "Visakhapatnam"};
        int city;
        for (city = 0; city< City.length; city++){
            System.out.printf("%2d. %1s%n", city+1, City[city]);
        }
        Scanner cit = new Scanner(System.in);
        int ci = cit.nextInt();
        CITY = City[ci-1];
        String[] city_description = {"Mumbai is the centre of the Mumbai Metropolitan Region, the sixth most populous metropolitan area in the world with a population of over 2.3 crore (23 million).", "Thiruvananthapuram (or Trivandrum) is the capital of the southern Indian state of Kerala. It's distinguished by its British colonial architecture and many art galleries. It’s also home to Kuthira Malika (or Puthen Malika) Palace, adorned with carved horses and displaying collections related to the Travancore royal family, whose regional capital was here from the 18th–20th centuries.", "Delhi, India’s capital territory, is a massive metropolitan area in the country’s north. In Old Delhi, a neighborhood dating to the 1600s, stands the imposing Mughal-era Red Fort, a symbol of India, and the sprawling Jama Masjid mosque, whose courtyard accommodates 25,000 people. Nearby is Chandni Chowk, a vibrant bazaar filled with food carts, sweets shops and spice stalls.", "Kolkata (formerly Calcutta) is the capital of India's West Bengal state. Founded as an East India Company trading post, it was India's capital under the British Raj from 1773–1911. Today it’s known for its grand colonial architecture, art galleries and cultural festivals. It’s also home to Mother House, headquarters of the Missionaries of Charity, founded by Mother Teresa, whose tomb is on site.", "Chennai, on the Bay of Bengal in eastern India, is the capital of the state of Tamil Nadu. The city is home to Fort St. George, built in 1644 and now a museum showcasing the city’s roots as a British military garrison and East India Company trading outpost, when it was called Madras. Religious sites include Kapaleeshwarar Temple, adorned with carved and painted gods, and St. Mary’s, a 17th-century Anglican church.", "Bengaluru (also called Bangalore) is the capital of India's southern Karnataka state. The center of India's high-tech industry, the city is also known for its parks and nightlife. By Cubbon Park, Vidhana Soudha is a Neo-Dravidian legislative building. Former royal residences include 19th-century Bangalore Palace, modeled after England’s Windsor Castle, and Tipu Sultan’s Summer Palace, an 18th-century teak structure.", "Hyderabad is the capital of southern India's Telangana state. A major center for the technology industry, it's home to many upscale restaurants and shops. Its historic sites include Golconda Fort, a former diamond-trading center that was once the Qutb Shahi dynastic capital. The Charminar, a 16th-century mosque whose 4 arches support towering minarets, is an old city landmark near the long-standing Laad Bazaar.", "Ahmedabad, in western India, is the largest city in the state of Gujarat. The Sabarmati River runs through its center. On the western bank is the Gandhi Ashram at Sabarmati, which displays the spiritual leader’s living quarters and artifacts. Across the river, the Calico Museum of Textiles, once a cloth merchant's mansion, has a significant collection of antique and modern fabrics.", "Pune is a sprawling city in the western Indian state of Maharashtra. It was once the base of the Peshwas (prime ministers) of the Maratha Empire, which lasted from 1674 to 1818. It's known for the grand Aga Khan Palace, built in 1892 and now a memorial to Mahatma Gandhi, whose ashes are preserved in the garden. The 8th-century Pataleshwar Cave Temple is dedicated to the Hindu god Shiva.", "Surat is a large city beside the Tapi River in the west Indian state of Gujarat. Once known for silk weaving, Surat remains a commercial center for textiles, and the New Textile Market area is lined with fabric shops. Overlooking the river, Surat Castle was built in the 1500s to defend the city against Portuguese colonists. Nearby, the Dutch, Armenian and English cemeteries contain elaborate colonial-era tombs.", "Jaipur is the capital of India’s Rajasthan state. It evokes the royal family that once ruled the region and that, in 1727, founded what is now called the Old City, or “Pink City�? for its trademark building color. At the center of its stately street grid (notable in India) stands the opulent, colonnaded City Palace complex. With gardens, courtyards and museums, part of it is still a royal residence", "Kanpur or Cawnpore is an industrial city in the central-western part of the state of Uttar Pradesh, India. Founded in 1803, Kanpur became one of the most important commercial and military stations of British India. Kanpur is also the financial capital of Uttar Pradesh.", "Lucknow, a large city in northern India, is the capital of the state of Uttar Pradesh. Toward its center is Rumi Darwaza, a Mughal gateway. Nearby, the 18th-century Bara Imambara shrine has a huge arched hall. Upstairs, Bhool Bhulaiya is a maze of narrow tunnels with city views from its upper balconies. Close by, the grand Victorian Husainabad Clock Tower was built as a victory column in 1881.", "Nagpur is a large city in the central Indian state of Maharashtra. The 19th-century Nagpur Central Museum displays items found locally, including fossils, sarcophagi and Mughal weaponry. The Raman Science Centre has hands-on exhibits and a planetarium. Sitabuldi Fort, in the Sitabuldi Hills, was the site of an 1817 battle. To the southwest, the immense, domed Deekshabhoomi is a Buddhist monument and pilgrimage site.", "Indore is a city in west-central India. It’s known for the 7-story Rajwada Palace and the Lal Baag Palace, which date back to Indore’s 19th-century Holkar dynasty. The Holkar rulers are honored by a cluster of tombs and cenotaphs at Chhatri Baag. The night market Sarafa Bazar sells street food. East is the Indo-Gothic Gandhi Hall and clock tower. The Jain temple Kanch Mandir has a mirrored mosaic interior.", "Patna is an ancient city that sprawls along the south bank of the Ganges River in Bihar, northeast India. The state capital, it’s home to Bihar Museum, a contemporary landmark exhibiting bronze sculptures and old coins from the region. Nearby, Indo-Saracenic–style Patna Museum displays a casket believed to contain the Buddha’s ashes. Close to the river, the Golghar is a domed colonial granary overlooking the city.", "Bhopal is a city in the central Indian state of Madhya Pradesh. It's one of India’s greenest cities. There are two main lakes, the Upper Lake and the Lower Lake. On the banks of the Upper Lake is Van Vihar National Park, home to tigers, lions and leopards. The State Museum has fossils, paintings and rare Jain sculptures. Taj-ul-Masjid is one of Asia’s largest mosques, with white domes, minarets and a huge courtyard.", "Thane is a city just outside Mumbai, in the western Indian state of Maharashtra. It’s known as the ‘City of Lakes’, and its more than 30 lakes include tree-lined Upvan Lake, a popular recreational spot. Beside Talao Pali Lake, Kopineshwar Mandir is an old, domed Hindu temple dedicated to Lord Shiva. To the west, leopards, monkeys and parakeets inhabit the teak forest and bamboo groves of Sanjay Gandhi National Park.", "Vadodara, also known as Baroda, is the second largest city in the Indian state of Gujarat. It serves as the administrative headquarters of the Vadodara district and is situated on the banks of the Vishwamitri River, 141 kilometres from the state capital of Gandhinagar.", "Visakhapatnam is a port city and industrial center in the Indian state of Andhra Pradesh, on the Bay of Bengal. It's known for its many beaches, including Ramakrishna Beach, home to a preserved submarine at the Kursura Submarine Museum. Nearby are the elaborate Kali Temple and the Visakha Museum, an old Dutch bungalow housing local maritime and historical exhibits."};
        String desx = city_description[ci - 1];
        System.out.println(desx+ " Enjoy watching " +name+ " in " +CITY);
        String[] Mumbai_Theaters ={"Maratha Mandir Theatre","Carnival Cinemas Liberty","Regal Cinema","Eros Cinema","Prithvi Theatre"};
        String[] Thiruvananthapuram_Theaters ={"Aries Plex SL Cinemas","Carnival Cinemas(Mall of Travancore)","PVR Kripa","Carnival Cinemas","Kairali Theatre"};
        String[] Delhi_Theaters ={"PVR Anupam (Saket)","INOX Cinema","PVR Cinemas (Pacific Mall)","PVR Cinemas (East Delhi Mall)","PVR Cinemas (Mahagun Metro Mall)"};
        String[] Kolkata_Theaters ={"PVR Cinemas (Diamond Plaza)","Nandan Cinema Hall","INOX Cinemas (South City Mall)","INOX Cinemas","Navina Cinema"};
        String[] Chennai_Theaters ={"AGS Cinemas","Jazz Cinemas LUXE","Sathyam Cinemas","Janatha Theatre","Jothi Theatre"};
        String[] Bangalore_Theaters ={"PVR Cinemas (Orient Mall)","PVR Cinemas (Nexus Mall)","Innovative Multiplex","Urvashi Theatre","INOX Cinemas"};
        String[] Hyderabad_Theaters ={"Prasads","AMB Cinemas","PVR Forum Sujana Mall","PVR Cinemas","RK Cineplex"};
        String[] Ahmedabad_Theaters ={"PVR Cinemas (Acropolis Mall)","City Gold Cinemas","Shree Balaji Multiplex (Shree Balaji Agora Mall))","Wide Angle Multiplex","Cinepolis Nexus (Ahmedabad One)"};
        String[] Pune_Theaters ={"E Square Multiplex","Mangala Multiplex","City Pride Multiplex","Rahul Talkies","PVR Cinemas Viman Nagar"};
        String[] Surat_Theaters ={"Triveni Cinema","PVR Cinemas (Rahul Raj Mall)","INOX Cinemas (VR Surat)","Cinepolis Cinemas (Imperial Square Mall)","Rajhans Multiplex"};
        String[] Jaipur_Theaters ={"Raj Mandir Cinema","Cinepolis Cinemas","Carnival Cinemas","INOX Cinemas (Sunny Trade Center)","First Cinema"};
        String[] Kanpur_Theaters ={"INOX Cinemas (Z Square Mall)","Miraj Cinemas","Carnival Cinemas (Rave Moti Mall)","Carnival Cinemas (Rave 3 Mall)","Carnival Cinemas"};
        String[] Lucknow_Theaters ={"Cinepolis Cinemas (One Awadh Center)","Fun Cinemas","PVR Cinemas (Singapore Mall)","PVR Cinemas (Sahara Ganj Mall)","Novelty Cinema"};
        String[] Nagur_Theaters ={"PVR Cinemas (Empress Mall)","INOX Cinema (Jaswant Tuli Mall)","Carnival Cinemas","Moviemax Cinemas (Eternity Mall)","Cinemax Cinemas (Eternity Mall)"};
        String[] Indore_Theaters ={"INOX Cinemas (Sapna Sangeet Mall)","PVR Cinemas (Treasure Island)","Carnival Cinemas (Mangal City Mall)","Carnival Cinemas (Malhar Mega Mall)","INOX Cinemas (C 21 Mall)"};
        String[] Patna_Theaters ={"Krishna Talkies","Prem Chand Rangshaala","Regent Fun Cinemas","Mona 70 Mm","The Premiere Square"};
        String[] Bhopal_Theaters ={"Jyoti Cineplex","Cinepolis Cinema (Aashima The Lake City Mall)","Inox Cinemas (Capital Mall)","Rang Mahal Cinema","DDX Cinema"};
        String[] Thane_Theaters ={"Cinepolis Cinema (Vivana Mall)","Cinepolis Cinema Vip (Vivana Mall)","Moviemax Cinemas (Wonder Mall)","INOX Cinemas (Korum Mall)","Moviemax Cinemas (Eternity Mall)"};
        String[] Vadodara_Theaters ={"INOX Cinemas","PVR Cinemas","Cinemarc Vihar Cinemas (Pacific Mall)","Cinepolis Cinemas (Inorbit Mall)","Cinemarc Cinemas (Galleria Mall)"};
        String[] Visakhapatnam_Theaters ={"INOX Chitralaya Mall","INOX","INOC Cmr Central Mall","Melody Cinema Hall","Mukta A2 Cinemas Vizag Central Mall"};
        switch (ci) {
            case 1:
                Theaters = Mumbai_Theaters;
            case 2:
                Theaters = Thiruvananthapuram_Theaters;
            case 3:
                Theaters = Delhi_Theaters;
            case 4:
                Theaters = Kolkata_Theaters;
            case 5:
            Theaters = Chennai_Theaters;
            case 6:
                Theaters = Bangalore_Theaters;
            case 7:
                Theaters = Hyderabad_Theaters;
            case 8:
                Theaters = Ahmedabad_Theaters;
            case 9:
                Theaters = Pune_Theaters;
            case 10:
                Theaters = Surat_Theaters;
            case 11:
                Theaters = Jaipur_Theaters;
            case 12:
                Theaters = Kanpur_Theaters;
            case 13:
                Theaters = Lucknow_Theaters;
            case 14:
                Theaters = Nagur_Theaters;
            case 15:
                Theaters = Indore_Theaters;
            case 16:
                Theaters = Patna_Theaters;
            case 17:
                Theaters = Bhopal_Theaters;
            case 18:
                Theaters = Thane_Theaters;
            case 19:
                Theaters = Vadodara_Theaters;
            case 20:
                Theaters = Visakhapatnam_Theaters;
        }
    }
    public void Date$Time () throws IOException {
        LocalDate today = LocalDate.now();
        System.out.println("\nSelect Date:");
        for (int dt = 1; dt <= 10; dt++){
            System.out.println(dt+ ". " +today.plusDays(dt));
        }
        int dte = Integer.parseInt(en.readLine());
        LocalDate Date = today.plusDays(dte);
        System.out.println("\nSelect Time on Date:\n1. 5 AM - 8 AM\n2. 9 AM - 12 PM\n3. 1 PM - 4 PM\n4.5 PM- 8 PM\n5. 9 PM - 12 AM");
        int time = Integer.parseInt(en.readLine());
        String tme;
        if(time == 1)
            tme = "5 AM - 8 AM";
        if(time == 2)
            tme = "9 AM - 12 PM";
        if(time == 3)
            tme = "1 PM - 4 PM";
        if(time == 4)
            tme = "5 PM- 8 PM";
        if(time == 5)
            tme = "9 PM - 12 AM";
    }
    public void English ()throws IOException {
        do {
            System.out.println("             Choose from the Movies below\n");
            Eng = new String[]{"Fantastic Beasts: The Secrets of Dumbledore", "Doctor Strange in the Multiverse of Madness", "Avatar 2", "Thor: Love and Thunder", "Jurassic World Dominion", "Morbius", "Uncharted", "Black Adam", "The Batman", "Black Panther: Wakanda Forever"};
            int E;
            for(E=0;E<Eng.length;E++){
             System.out.printf("%2d %2s%n", E+1, Eng[E]);
            }
            System.out.println("To select a movie, type the sl.number of the movie.");
            int a = Integer.parseInt(en.readLine());
            String[] En_desc = { "Professor Albus Dumbledore knows the powerful, dark wizard Gellert Grindelwald is moving to seize control of the wizarding world. Unable to stop him alone, he entrusts magizoologist Newt Scamander to lead an intrepid team of wizards and witches. They soon encounter an array of old and new beasts as they clash with Grindelwald's growing legion of followers.","Dr Stephen Strange casts a forbidden spell that opens a portal to the multiverse. However, a threat emerges that may be too big for his team to handle.","Jake Sully and Ney'tiri have formed a family and are doing everything to stay together. However, they must leave their home and explore the regions of Pandora. When an ancient threat resurfaces, Jake must fight a difficult war against the humans.","Thor: Love and Thunder is an upcoming American superhero film based on the Marvel Comics character Thor, produced by Marvel Studios and distributed by Walt Disney Studios Motion Pictures. It is intended to be the direct sequel to Thor: Ragnarok and the 29th film in the Marvel Cinematic Universe.","The future of mankind hangs in the balance as humans and dinosaurs coexist following the destruction of Isla Nublar.", "Dangerously ill with a rare blood disorder and determined to save others from the same fate, Dr. Morbius attempts a desperate gamble. While at first it seems to be a radical success, a darkness inside of him is soon unleashed.", "Treasure hunter Victor \"Sully\" Sullivan recruits street-smart Nathan Drake to help him recover a 500-year-old lost fortune amassed by explorer Ferdinand Magellan. What starts out as a heist soon becomes a globe-trotting, white-knuckle race to reach the prize before the ruthless Santiago Moncada can get his hands on it. If Sully and Nate can decipher the clues and solve one of the world's oldest mysteries, they stand to find $5 billion in treasure -- but only if they can learn to work together.", "Black Adam is an upcoming American superhero film based on the DC Comics character of the same name. Produced by New Line Cinema, DC Films, Seven Bucks Productions, and FlynnPictureCo., and set for distribution by Warner Bros.","Batman ventures into Gotham City's underworld when a sadistic killer leaves behind a trail of cryptic clues. As the evidence begins to lead closer to home and the scale of the perpetrator's plans become clear, he must forge new relationships, unmask the culprit and bring justice to the abuse of power and corruption that has long plagued the metropolis.", "Black Panther: Wakanda Forever is an upcoming American superhero film based on the Marvel Comics character Black Panther. Produced by Marvel Studios and distributed by Walt Disney Studios Motion Pictures, it is intended to be the sequel to Black Panther and the 30th film in the Marvel Cinematic Universe."};
            System.out.println("Enter the number of tickets you want to buy.");
            qty = Integer.parseInt(en.readLine());
            name = Eng[a-1];
            description = En_desc[a-1];
            System.out.println("To cancel the movie " +name+ " and choose another movie, enter 'no'.");
            System.out.println("To continue to payments page, Enter any key.");
            loop = en.readLine();
        } while (loop.equals("no"));
    }
    public void Hindi ()throws IOException {
        do {
            System.out.println("             Choose from the Movies below\n");
            hin = new String[]{"K.G.F: Chapter 2 (Hindi)", "Attack: Part 1", "Brahmastra", "Prithviraj", "Gehraiyaan", "Heropanti 2", "Gangubai Kathiawadi", "Bhool Bhulayaa 2", "Bacchan Pandey", "The Kashmir Files"};
            int h;
            for(h=0;h<hin.length;h++){
                System.out.printf("%2d %2s%n", h+1, hin[h]);
            }
            System.out.println("To select a movie, type the sl.number of the movie.");
            int a = Integer.parseInt(en.readLine());
            String[] hin_des = {"The blood-soaked land of Kolar Gold Fields has a new overlord now, Rocky, whose name strikes fear in the heart of his foes. His allies look up to him as their Savior, the government sees him as a threat, and his enemies are clamouring for revenge.", "A cyber soldier who has lost everything puts his life on the line to serve his nation.", "Brahm�?stra Part One: Shiva, also known as Brahm�?stra, is an upcoming Indian Hindi-language fantasy adventure film written and directed by Ayan Mukerji, and produced by Karan Johar. It stars Amitabh Bachchan, Ranbir Kapoor, Alia Bhatt, Mouni Roy and Nagarjuna Akkineni.", "The heroism of the fearless King Prithviraj Chauhan as he faces off against Muhammad of Ghor.", "Alisha runs her own yoga studio while seeking investors to back her yoga phone app. Flashbacks reveal a wealthy and idyllic childhood with extended family. For reasons she can't understand, her father dragged her and her mother away from that happiness into a life of isolation and need, which somehow led to her mother's suicide. All of that is the backdrop to an affair Alisa begins with her cousin Tia's fiancé, who is a go-getter real estate whiz kid who seems to have money to burn.", "A vigilante is sent on a mission by the government to kill enemy troops. However, things go wrong when he's mistaken for the leader of the troops.", "Young Ganga is tricked by her boyfriend with the promise of a film career and persuaded to leave the countryside for Mumbai. In Mumbai her dreams of a film career come crashing down and she is lured to the underworld.", "Bhool Bhulaiyaa 2 is an upcoming Indian Hindi-language comedy horror film directed by Anees Bazmee and produced by Bhushan Kumar. It is a standalone sequel to Priyadarshan's 2007 iconic horror comedy Bhool Bhulaiyaa. Bhool Bhulaiyaa 2 stars Kartik Aaryan, Tabu and Kiara Advani. The filming began on 9 October 2019.", "A budding director tries to research a merciless gangster to make a film on gangster life, but his secret attempts to conduct the research fail when he gets caught for snooping.", "The Kashmir Files is a heart wrenching narrative of the pain, suffering, struggle & trauma of Kashmiri Pandits, seen through the eyes of Krishna, the protagonist. The film questions eye-opening facts about democracy, religion, politics and humanity."};
            System.out.println("Enter the number of tickets you want to buy.");
            qty = Integer.parseInt(en.readLine());
            name = hin[a-1];
            description = hin_des[a-1];
            System.out.println("To cancel the movie " +name+ " and choose another movie, enter 'no'.");
            System.out.println("To continue to payments page, Enter any key.");
            loop = en.readLine();
        } while (loop.equals("no"));
    }
    public void Tamil ()throws IOException {
        do {
            System.out.println("             Choose from the Movies below\n");
            tam = new String[]{"Beast", "Don", "Valimai", "Veeramae Vagai Soodum", "Kaathu Vaakula Rendu Kadhal", "Maaran", "Idiot", "Hey Sinamika", "Mahaan", "Vikram"};
            int t;
            for(t=0;t< tam.length;t++){
                System.out.printf("%2d %2s%n", t+1, tam[t]);
            }
            System.out.println("\nTo select a movie, type the sl.number of the movie.");
            int a = Integer.parseInt(en.readLine());
            String[] tam_des = {"Beast is a 2022 Indian Tamil-language action comedy film written and directed by Nelson and produced by Sun Pictures. The film stars Vijay and Pooja Hegde, while Selvaraghavan, Shine Tom Chacko, Yogi Babu and Redin Kingsley play supporting roles.", "Don is an upcoming Indian Tamil-language action comedy film written and directed by Cibi Chakaravarthi in his directorial debut, and produced by Allirajah Subaskaran of Lyca Productions.", "A city witnesses a spike in its crime rate due to the nefarious activities of a notorious motorcycle club. When things get out of hand, it is up to Arjun, a police officer, to restore law and order.", "When Porus' sister gets killed for witnessing a murder by a business tycoon, a passionate Porus sets off on a mission to avenge her death.", "Kaathuvaakula Rendu Kaadhal is an upcoming Indian Tamil-language romantic comedy film written and directed by Vignesh Shivan and produced by Shivan and Nayanthara's banner Rowdy Pictures with Seven Screen Studios and is distributed by Udhayanidhi Stalin under his banner Red Giant Movies.", "Maaran is a 2022 Indian Tamil-language action thriller film written and directed by Karthick Naren, with the screenplay and dialogues were co-written by Suhas–Sharfu and Vivek. Produced by T. G.", "Idiot is a 2022 Indian Tamil-language parody comedy horror film directed by Rambhala and produced by Screen Scene Media Entertainment Pvt Ltd. The film stars Shiva and Nikki Galrani. The film was initially planned for release in theatres in September 2021 but has since been postponed. ", "Weather scientist Mouna falls in love with quirky and loving Yaazhan, but their relationship takes an unexpected turn when psychologist Dr. Malarvizhi arrives in town.", "A middle-aged school teacher, Gandhi Mahaan, embarks on a journey of self-discovery after getting abandoned by his family. He soon becomes a pride billionaire but faces many challenges.", "Vikram is an upcoming Indian action thriller film written and directed by Lokesh Kanagaraj and produced by Raaj Kamal Films International."};
            System.out.println("Enter the number of tickets you want to buy.");
            qty = Integer.parseInt(en.readLine());
            name = tam[a-1];
            description = tam_des[a-1];
            System.out.println("To cancel the movie " +name+ " and choose another movie, enter \"no\".");
            System.out.println("To continue to payments enter any key.");
            loop = en.readLine();
        } while (loop.equals("no"));
    }
    public void Kannada ()throws IOException {
        do {
            System.out.println("             Choose from the Movies below\n");
            kan = new String[]{"K.G.F: Chapter 2","James","Love Mocktail 2","By Two Love","Ek Love Ya","Rider","Home Minister","777 Charlie","Roberrt","Yuvarathnaa"};
            int k;
            for(k=0;k<kan.length;k++){
                System.out.printf("%2d %2s%n", k+1, kan[k]);
            }
            System.out.println("\nTo select a movie, type the sl.number of the movie.");
            int a = Integer.parseInt(en.readLine());
            String[] kan_des={"The blood-soaked land of Kolar Gold Fields has a new overlord now, Rocky, whose name strikes fear in the heart of his foes. His allies look up to him as their Savior, the government sees him as a threat, and his enemies are clamouring for revenge.", "James is a 2022 Indian Kannada-language action thriller film written and directed by Chethan Kumar. It stars late Puneeth Rajkumar and Priya Anand. This is Puneeth's posthumous appearance following his death on 29 October 2021.", "Fate brings new love and some complications into Adi's life after his wife, Nidhi, dies. It is up to him whether he wants embrace what lies ahead or remain hung up on his past.", "By Two Love is a 2022 Indian Kannada-language romantic comedy film written and directed by Hari Santhosh. Produced by KVN Productions, it stars Dhaveerrah and Sree Leela.", "Ek Love Ya is a Kannada movie starring Raanna and Rachita Ram in prominent roles. It is a drama directed by Prem, with Arjun Janya as the musician, forming part of the crew.", "As love blossoms between orphans Chinnu and Kitty, fate separates them as children. They grow up yearning to find each other, despite many difficulties.", "Home Minister is a Kannada movie, directed by Sujay K Srihari. The film is a family drama with a political backdrop, which stars Upendra and Vedhika in lead roles. Supporting roles include Sadhu Kokila and Avinash. It is produced by Poorna Naidu.", "777 Charlie is an upcoming Indian Kannada-language adventure comedy-drama film directed by Kiranraj K. It features Rakshit Shetty, Sangeetha Sringeri and Raj B. Shetty in prominent roles. The film is being produced by Rakshit Shetty and GS Gupta under the banner of Paramvah Studios.", "Raghava, the head cook in a catering unit, leads a peaceful life with his son Arjun. However, their bliss is short-lived as Raghava's past comes back to haunt him", "Due to the privatisation of the education sector, RK College is on the verge of closing. However, the principal and a student join hands to prevent it from happening."};
            System.out.println("Enter the number of tickets you want to buy.");
            qty = Integer.parseInt(en.readLine());
            name = kan[a-1];
            description = kan_des[a-1];
            System.out.println("To cancel the movie " +name+ " and choose another movie, enter 'no'.");
            System.out.println("To continue to payments enter any key.");
            loop = en.readLine();
        } while (loop.equals("no"));
    }
    public void Telugu ()throws IOException {
        do {
            System.out.println("             Choose from the Movies below\n");
            tel = new String[]{"RRR","Radhe Shyam","DJ Tillu","Bheemla Nayak","F3","Acharya","Sarkaru Vaari Paata","Bangarraju","Pushpa: The Rise","Shyam Singha Roy"};
            int T;
            for(T=0;T< tel.length;T++){
                System.out.printf("%2d %2s%n", T+1, tel[T]);
            }
            System.out.println("\nTo select a movie, type the sl.number of the movie.");
            int a = Integer.parseInt(en.readLine());
            String[] tel_des = {"A tale of two legendary revolutionaries and their journey far away from home. After their journey they return home to start fighting back against British colonialists in the 1920s.", "Infamous palmist Vikramaditya finds love when he meets Prerana, a doctor. However, their relationship is threatened when he refuses to marry her and she gets diagnosed with a terminal disease.", "Bala Gangadhar Tilak, also known as DJ Tillu, is a young man who wishes to become a disc jockey someday. However, his life changes after he falls in love with Radhika.", "Things change when the egos of an upright police officer and a retired army havildar clash.", "F3: Fun and Frustration is an upcoming Indian Telugu-language romantic comedy film written and directed by Anil Ravipudi. Produced by Sri Venkateswara Creations, it is a standalone sequel to the 2019 film F2: Fun and Frustration, and the second film in the Fun and Frustration series.", "Acharya is an upcoming Indian Telugu-language action drama film written and directed by Koratala Siva. It is produced by Matinee Entertainment and Konidela Production Company. The film stars Chiranjeevi, Ram Charan, and Pooja Hegde. It features music composed by Mani Sharma with cinematography by Tirru.", "Sarkaru Vaari Paata is an upcoming Indian Telugu-language action comedy film written and directed by Parasuram. Produced by Mythri Movie Makers, 14 Reels Plus and G. Mahesh Babu Entertainment, the film stars Mahesh Babu and Keerthy Suresh while Samuthirakani, Vennela Kishore and Subbaraju play supporting roles.", "Chinna Bangarraju is a charming man who ends up taking his grandfather's divine help when familial issues overpower him.", "A labourer named Pushpa makes enemies as he rises in the world of red sandalwood smuggling. However, violence erupts when the police attempt to bring down his illegal business.", "A director accused of plagiarism finds a transcendental connection to his past life when he digs deeper into his subconscious mind."};
            System.out.println("Enter the number of tickets you want to buy.");
            qty = Integer.parseInt(en.readLine());
            name = tel[a-1];
            description = tel_des[a-1];
            System.out.println("To cancel the movie "+name+" and choose another movie, enter 'no'.");
            System.out.println("To continue to payments enter any key.");
            loop = en.readLine();
        } while (loop.equals("no"));
    }
    public void Tre$Snacks ()throws IOException {
        int E;
        System.out.println("                          Select Theatre\n");
        for(E=0;E<Theaters.length;E++){
            System.out.printf("%2d %22s %22s %10s%n", E+1, Theaters[E], Type[E], "Rs."+Cost[E]);
        }
        System.out.println("\n*Note: Prices may vary after every run.");
        int theatre = Integer.parseInt(en.readLine());
        String theatr;
        System.out.println("Choose row:\n1. Front(f)\n2. Middle(m)\n3. Back(b)\n4. Balcony(B)");
        theatr = en.readLine();
        System.out.println("Movie Name:" + name);
        System.out.println("Description: \n" + description);
        switch (theatr) {
            case "f":
                amt = Cost[theatre - 1];
            case "m":
                amt = Cost[theatre - 1];
            case "b":
                amt = Cost[theatre - 1];
            case "B":
                amt = Cost[theatre - 1];
        }
        tre = Theaters[theatre-1];
        total = amt * qty;
        System.out.println("Would you like to order snacks to eat while you are watching the movie, " + name + "?");
        System.out.println("To order, enter \"y\".\nTo continue without ordering, enter any key");
        snc = en.readLine();
        switch (snc) {
            case "y":
                System.out.println("           Welcome to Snacks Menu\n");
                String[] Cat = {"Common Snacks","Pizza and Burger","Sandwich","Beverage and Desserts"};
                int c;
                for(c=0;c< Cat.length;c++){
                    System.out.println(c+1 + ". " + Cat[c]);
                }
                System.out.println("\nKindly enter the numbers as given in the menu.");
                int snk = Integer.parseInt(en.readLine());
                switch (snk) {
                    case 1:
                        int[] samt1 = {100,110,80,50,70,60,20,20,40,120,150};
                        int[] num = {1,2,3,4,5,6,7,8,9,10,11};
                        String[] snack = {"Finger Chips","Popcorn","Popcorn","Popcorn","Sweet Corn","Sweet Corn","Cream Roll","Samosa","Vada Pav","Spring Roll","Cheese Balls"};
                        String[] sqty1 = {"1 unit","50 gm","35 gm","20 gm","Large","Small","1 unit","1 unit","1 unit","1 unit","1 unit"};
                        System.out.println("                          Common Snacks\n");
                        int S;
                        for(S=0;S<snack.length;S++){
                            System.out.printf("%2d. %20s  %10s  %15s%n", num[S], snack[S], sqty1[S], "Rs."+samt1[S]);
                        }
                        System.out.println("\nChoose the snack according to the number in the menu.");
                        sna = Integer.parseInt(en.readLine());
                        samt = samt1[sna-1];
                        snam = snack[sna-1]+"("+sqty1[sna-1]+")";
                        System.out.println("Enter the amount of " + snam + " you want");
                        sqty = Integer.parseInt(en.readLine());
                        System.out.println("You have ordered " + sqty + " " + snam + ".");
                        break;
                    case 2:
                        int[] pizza$ = {190,180,160,160,180,130,110};
                        int[] pi = {1,2,3,4,5,6,7};
                        String[] pizza = {"Paneer Pizza","Double Cheese Pizza","Ratlami Pizza","Cheese Pizza","Veg Pizza","Veg Cheese Burger","Veg Burger"};
                        System.out.println("                  Pizza & Burger\n");
                        int p;
                        for(p=0;p< pizza.length;p++){
                            System.out.printf("%2s. %22s %10s%n", pi[p], pizza[p],"Rs."+pizza$[p]);
                        }
                        System.out.println("\nChoose the snack according to the number in the menu.");
                        sna = Integer.parseInt(en.readLine());
                        samt = pizza$[sna-1];
                        snam = pizza[sna-1];
                        System.out.println("Enter the amount of " + snam + " you want");
                        sqty = Integer.parseInt(en.readLine());
                        System.out.println("You have ordered " + sqty + " " + snam + ".");
                        break;
                    case 3:
                        int[] sand$ = {90,110,110,110,120,120};
                        int[] s_num = {1,2,3,4,5,6};
                        String[] sand = {"Veg Grill Sandwich","Indorie Sandwich","Onion Sev Sandwich","Cheese Grill Sandwich","Club Sandwich","Veg Grill + Cheese"};
                        System.out.println("                      Sandwich");
                        int san;
                        for(san=0;san<sand.length;san++){
                            System.out.printf("%2d. %22s %10s%n", s_num[san],sand[san], "Rs."+sand$[san]);
                        }
                        System.out.println("\nChoose the snack according to the number in the menu.");
                        sna = Integer.parseInt(en.readLine());
                        samt = sand$[sna-1];
                        snam = sand[sna-1];
                        System.out.println("Enter the amount of " + snam + " you want");
                        sqty = Integer.parseInt(en.readLine());
                        System.out.println("You have ordered " + sqty + " " + snam + ".");
                        break;
                    case 4:
                        System.out.println("                   Beverage and Desserts\n");
                        int[] b_num = {1,2,3,4,5,6,7,8};
                        String[] bev = {"Cold Coffee","Cold Coffee + Ice Cream","Pepsi","Pepsi","Pepsi","Mineral Water","Hot Coffee","Frappe + Ice Cream"};
                        String[] bev_qty = {"300 ml","300 ml","600 ml","450 ml","300 ml","Each","Each","Each"};
                        int[] bev$ = {70,80,80,60,40,20,30,100};
                        int b;
                        for(b=0;b< bev.length;b++){
                            System.out.printf("%2d %22s %10s %10s%n", b_num[b], bev[b], bev_qty[b], "Rs."+bev$[b]);
                        }
                        System.out.println("\nChoose the snack according to the number in the menu.");
                        sna = Integer.parseInt(en.readLine());
                        samt = bev$[sna-1];
                        snam = bev[sna-1]+" ("+bev_qty[sna-1]+")";
                        System.out.println("Enter the amount of " + snam + " you want");
                        sqty = Integer.parseInt(en.readLine());
                        System.out.println("You have ordered " + sqty + " " + snam + ".");
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + snk);
                }
                System.out.println("*Note: The Snacks will be delivered to your seat at the time of show.");
                stotal = samt * sqty;
            default:
                System.out.println(" ");
        }
        snak = snc;
    }
    public void Billing (){
        Calendar aa = Calendar.getInstance();
        System.out.println("Date and time: " + aa.getTime());
        System.out.println("                        Movie Bill");
        System.out.println("-------------------------------------------------------------");
        System.out.println("Movie Name:" + name);
        System.out.println("Number of tickets: " + qty);
        System.out.println("Amount per ticket: Rs." + amt);
        System.out.println("Theatre: " + tre);
        System.out.println("Total Amount to be paid for Movie tickets: Rs." + total);
        System.out.println(" ");
        System.out.println("                       Snacks Bill");
        System.out.println("-----------------------------------------------------------");
        System.out.println("Snack Name: " + snam);
        System.out.println("Quantity: " + sqty);
        System.out.println("Amount per item: Rs." + samt);
        System.out.println("Total amount to be paid for Snacks: Rs." + stotal);
        System.out.println(" ");
        Amt = total + stotal;
        double dis = 0;
        double amt_to_pay;
        if (T==2) {
            dis = (20 * Amt) / 100;
        }
        amt_to_pay = Amt - dis;
        gst = (18 * amt_to_pay) / 100;
        AMT = gst + amt_to_pay;
        System.out.println("Total amount to be paid including Snacks and Movie: Rs." + Amt);
        System.out.println("Discount : Rs."+ dis);
        System.out.println("Amount after Discount: Rs."+ amt_to_pay);
        System.out.println("GST Rate: 18%");
        System.out.println("Total amount including GST: Rs." + AMT + "\n\n");
    }
    public void Payments () throws IOException {
        System.out.println("                   PAYMENTS");
        System.out.println("******************************************f****");
        System.out.println("Choose a payment option:");
        System.out.println("1.Debit/Credit Card");
        System.out.println("2.Pay in Theatre");
        System.out.println("3.Net-banking");
        System.out.println("4.UPI");
        System.out.println("5.Wallets");
        pay = Integer.parseInt(en.readLine());
        switch (pay) {
            case 1:
                long card;
                int cvv;
                int otp;
                System.out.println("You have chosen payment through Debit/Credit card");
                do {
                    System.out.println("Please enter the 12 digits card number");
                    card = Long.parseLong(en.readLine());
                } while (100000000000L >= card || card >= 999999999999L);
                do {
                    System.out.println("Please enter the 3 digit cvv number");
                    cvv = Integer.parseInt(en.readLine());
                } while (100 >= cvv || cvv >= 999);
                do {
                    System.out.println("Please enter the 4 digit OTP which has been sent to your phone.");
                    otp = Integer.parseInt(en.readLine());
                } while (1000 >= otp || otp >= 9999);
                System.out.println("Verifying>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                System.out.println("Verified");
                System.out.println(" ");
                System.out.println("Payment through Card no. " + card);
                System.out.println("You have successfully paid Rs." + AMT + " through Credit/Debit Card");
                int id = (int) Math.round(Math.random() * 1000);
                int id1 = (int) Math.round(Math.random() * 100);
                System.out.println("Ticket ID :CRD" + id + "DB" + id1 + "CD");
                break;
            case 2:
                System.out.println("You have to pay Rs." + AMT + " in the premises of " + tre + " theatre before entering the theatre.");
                System.out.println("You will get your Ticket ID after payment.");
                break;
            case 3:
                String user;
                String pass;
                System.out.println("You have chosen payment through Net Banking");
                do {
                    System.out.println("Please enter your username");
                    user = en.readLine();
                } while (user == null);
                do {
                    System.out.println("Please enter your password");
                    pass = en.readLine();
                } while (pass == null);
                do {
                    System.out.println("Please enter the 4 digit OTP which has been sent to your phone.");
                    otp = Integer.parseInt(en.readLine());
                } while (1000 >= otp || otp >= 9999);
                System.out.println("Verifying>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                System.out.println("Verified");
                System.out.println(" ");
                System.out.println("Payment through " + user);
                System.out.println("You have successfully paid Rs." + AMT + " through Net Banking");
                int id2 = (int) Math.round(Math.random() * 1000);
                int id3 = (int) Math.round(Math.random() * 100);
                System.out.println("Ticket ID :NT" + id2 + "BNK" + id3 + "UP");
                break;
            case 4:
                String upi;
                long pin;
                System.out.println("You have chosen payment through UPI\n");
                do {
                    System.out.println("Please enter your UPI ID\nYour UPI ID should be in the format of **********@upi\n");
                    upi = en.readLine();
                } while (upi == null);
                do {
                    System.out.println("Please enter your 6 digit UPI pin");
                    pin = Long.parseLong(en.readLine());
                } while (100000 >= pin || pin >= 999999);
                System.out.println("Verifying>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                System.out.println("Verified");
                System.out.println(" ");
                System.out.println("Payment through " + upi);
                System.out.println("You have successfully paid Rs." + AMT + " through UPI");
                int id4 = (int) Math.round(Math.random() * 1000);
                int id5 = (int) Math.round(Math.random() * 100);
                System.out.println("Ticket ID :UPI" + id4 + "@" + id5 + "/y");
                break;
            case 5:
                int wallet;
                String Wallet;
                long phone;
                System.out.println("You have chosen payment through Digital Wallets.");
                System.out.println("Choose the wallet of your choice.");
                System.out.println(" ");
                System.out.println("                    WALLETS");
                System.out.println("**********************************************");
                System.out.println("Choose a Digital Wallet:");
                System.out.println("1.PhonePe");
                System.out.println("2.G Pay(Google Pay)");
                System.out.println("3.PayTM");
                System.out.println("4.BharatPe");
                System.out.println("5.Amazon Pay");
                wallet = Integer.parseInt(en.readLine());
                switch (wallet) {
                    case 1:
                        Wallet = "PhonePe";
                        break;
                    case 2:
                        Wallet = "G Pay(Google Pay)";
                        break;
                    case 3:
                        Wallet = "PayTM";
                        break;
                    case 4:
                        Wallet = "BharatPe";
                        break;
                    case 5:
                        Wallet = "Amazon Pay";
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + wallet);
                }
                System.out.println("You have chosen " + Wallet + " Wallet");
                System.out.println("Enter the phone number from which you have registered in " + Wallet);
                do {
                    System.out.println("Please enter your phone number");
                    phone = Long.parseLong(en.readLine());
                } while (1000000000 >= phone || phone >= 9999999999L);
                do {
                    System.out.println("Please enter the 4 digit OTP which has been sent to your phone. ");
                    otp = Integer.parseInt(en.readLine());
                } while (1000 >= otp || otp >= 9999);
                System.out.println("Verifying>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                System.out.println("Verified");
                System.out.println(" ");
                System.out.println("Payment through " + Wallet);
                System.out.println("You have successfully paid Rs." + AMT + " through Digital Wallet");
                int id6 = (int) Math.round(Math.random() * 1000);
                int id7 = (int) Math.round(Math.random() * 100);
                System.out.println("Ticket ID :DGT" + id6 + "WLT" + id7 + "Pec");
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + pay);
        }
    }
    public void Stream () throws IOException {
        Calendar aa = Calendar.getInstance();
        System.out.println("\fDate and time: " + aa.getTime());
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println(" ");
        System.out.println("                            BBBBBB      OOOO      OOOO    KK  KK            MMM      MMM  YY    YY             SSSSSSS  EEEEEEEE      AA      TTTTTTTTTT   ");
        System.out.println("                            BB   BB   OO    OO  OO    OO  KK KK             MM MM  MM MM   YY  YY             SS        EE           AA AA        TT       ");
        System.out.println("                            BBBBBB    OO    OO  OO    OO  KKKK              MM  MM MM MM    YYYY               SSSSSSS  EEEEEEE     AA   AA       TT       ");
        System.out.println("                            BB   BB   OO    OO  OO    OO  KK KK             MM    M   MM     YY                      SS EE         AAAAAAAAA      TT       ");
        System.out.println("                            BBBBBB      OOOO      OOOO    KK  KK            MM        MM     YY                SSSSSSS  EEEEEEEE  AA       AA     TT       ");
        System.out.println("                                                                                THINK IT SEE IT");
        System.out.println("                                                                        FIND BEST PRICES ON MOVIE TICKETS");
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
        String pass;
        String user;
        System.out.println("Enter Username");
        user = en.readLine();
        System.out.println("Enter Password:");
        pass = en.readLine();
        System.out.println("  Choose the Stream of your Choice\n");
        String[] Stream = {"Top Gun: Maverick", "Fantastic Beasts: The Secrets Of Dumbledore", "Orphan: First Kill (2022)", "Ragdoll (TV Series)", "Unforgotten: Series 1", "Angel", "Memory", "Sherwood: TV Series", "Spider-Man: No Way Home (Movie + Special Extra Content)", "Jurassic World: Dominion","The Hulk","Fantastic Beasts: The Secrets of Dumbledore", "Doctor Strange in the Multiverse of Madness", "Avatar 2", "Thor: Love and Thunder", "Jurassic World Dominion", "Morbius", "Uncharted", "Black Adam", "The Batman", "Black Panther: Wakanda Forever","K.G.F: Chapter 2 (Hindi)", "Attack: Part 1", "Brahmastra", "Prithviraj", "Gehraiyaan", "Heropanti 2", "Gangubai Kathiawadi", "Bhool Bhulayaa 2", "Bacchan Pandey", "The Kashmir Files"};
        String[] Dess = {"Set 30 years after the events of `Top Gun` (1986), the sequel hinges on Captain Pete Mitchell`s (Tom Cruise) attempts to come to terms with his past, while training his friend`s son (Miles Teller) for a dangerous mission.", "Albus Dumbledore gathers a ragtag group of wizards and witches to stand against the growing might of his one-time friend, the dark wizard Gellert Grindelwald.", "After escaping from the psychiatric facility she was being held in, Esther poses as the daughter of a wealthy family to continue her reign of terror.", "The police is on the hunt for the Ragdoll killer, who sews victims up in the form of a doll after murdering them.", "Each season of this British crime series tackles a new case, from the death of a 17-year-old who disappeared in 1976 to the murder of a school girl, who vanished in 1999.", "After finding a wish-granting watch, a young, unpopular girl named Angel grapples with her desires and attempts to stay true to herself.", "A veteran assassin struggling with memory loss is forced to go on the run when he stumbles across delicate information that could destroy his wealthy clients.", "Based on real events that took place in the UK in 2004, this crime series follows killings that take place in a small community that`s already suffering from a choppy past.", "Here we present the movie + special extra content, exclusively available with the purchase of SPIDER-MAN NO WAY HOME.", "In a world where dinosaurs and humans share an uneasy coexistence, Owen Grady must put together a crew of daredevils to rescue a baby raptor and his adoptive daughter, while escaping the clutches of a sadistic billionaire.","When scientist Bruce Banner is transformed into a giant, super-human mutant, he will have to fight the forces of evil - while fighting the evil within himself.","Professor Albus Dumbledore knows the powerful, dark wizard Gellert Grindelwald is moving to seize control of the wizarding world. Unable to stop him alone, he entrusts magizoologist Newt Scamander to lead an intrepid team of wizards and witches. They soon encounter an array of old and new beasts as they clash with Grindelwald's growing legion of followers.","Dr Stephen Strange casts a forbidden spell that opens a portal to the multiverse. However, a threat emerges that may be too big for his team to handle.","Jake Sully and Ney'tiri have formed a family and are doing everything to stay together. However, they must leave their home and explore the regions of Pandora. When an ancient threat resurfaces, Jake must fight a difficult war against the humans.","Thor: Love and Thunder is an upcoming American superhero film based on the Marvel Comics character Thor, produced by Marvel Studios and distributed by Walt Disney Studios Motion Pictures. It is intended to be the direct sequel to Thor: Ragnarok and the 29th film in the Marvel Cinematic Universe.","The future of mankind hangs in the balance as humans and dinosaurs coexist following the destruction of Isla Nublar.", "Dangerously ill with a rare blood disorder and determined to save others from the same fate, Dr. Morbius attempts a desperate gamble. While at first it seems to be a radical success, a darkness inside of him is soon unleashed.", "Treasure hunter Victor \"Sully\" Sullivan recruits street-smart Nathan Drake to help him recover a 500-year-old lost fortune amassed by explorer Ferdinand Magellan. What starts out as a heist soon becomes a globe-trotting, white-knuckle race to reach the prize before the ruthless Santiago Moncada can get his hands on it. If Sully and Nate can decipher the clues and solve one of the world's oldest mysteries, they stand to find $5 billion in treasure -- but only if they can learn to work together.", "Black Adam is an upcoming American superhero film based on the DC Comics character of the same name. Produced by New Line Cinema, DC Films, Seven Bucks Productions, and FlynnPictureCo., and set for distribution by Warner Bros.","Batman ventures into Gotham City's underworld when a sadistic killer leaves behind a trail of cryptic clues. As the evidence begins to lead closer to home and the scale of the perpetrator's plans become clear, he must forge new relationships, unmask the culprit and bring justice to the abuse of power and corruption that has long plagued the metropolis.", "Black Panther: Wakanda Forever is an upcoming American superhero film based on the Marvel Comics character Black Panther. Produced by Marvel Studios and distributed by Walt Disney Studios Motion Pictures, it is intended to be the sequel to Black Panther and the 30th film in the Marvel Cinematic Universe.","The blood-soaked land of Kolar Gold Fields has a new overlord now, Rocky, whose name strikes fear in the heart of his foes. His allies look up to him as their Savior, the government sees him as a threat, and his enemies are clamouring for revenge.", "A cyber soldier who has lost everything puts his life on the line to serve his nation.", "Brahm�?stra Part One: Shiva, also known as Brahm�?stra, is an upcoming Indian Hindi-language fantasy adventure film written and directed by Ayan Mukerji, and produced by Karan Johar. It stars Amitabh Bachchan, Ranbir Kapoor, Alia Bhatt, Mouni Roy and Nagarjuna Akkineni.", "The heroism of the fearless King Prithviraj Chauhan as he faces off against Muhammad of Ghor.", "Alisha runs her own yoga studio while seeking investors to back her yoga phone app. Flashbacks reveal a wealthy and idyllic childhood with extended family. For reasons she can't understand, her father dragged her and her mother away from that happiness into a life of isolation and need, which somehow led to her mother's suicide. All of that is the backdrop to an affair Alisa begins with her cousin Tia's fiancé, who is a go-getter real estate whiz kid who seems to have money to burn.", "A vigilante is sent on a mission by the government to kill enemy troops. However, things go wrong when he's mistaken for the leader of the troops.", "Young Ganga is tricked by her boyfriend with the promise of a film career and persuaded to leave the countryside for Mumbai. In Mumbai her dreams of a film career come crashing down and she is lured to the underworld.", "Bhool Bhulaiyaa 2 is an upcoming Indian Hindi-language comedy horror film directed by Anees Bazmee and produced by Bhushan Kumar. It is a standalone sequel to Priyadarshan's 2007 iconic horror comedy Bhool Bhulaiyaa. Bhool Bhulaiyaa 2 stars Kartik Aaryan, Tabu and Kiara Advani. The filming began on 9 October 2019.", "A budding director tries to research a merciless gangster to make a film on gangster life, but his secret attempts to conduct the research fail when he gets caught for snooping.", "The Kashmir Files is a heart wrenching narrative of the pain, suffering, struggle & trauma of Kashmiri Pandits, seen through the eyes of Krishna, the protagonist. The film questions eye-opening facts about democracy, religion, politics and humanity."};
        int stream;
        for (stream = 0; stream < Stream.length; stream++) {
            System.out.printf("%2d. %1s%n", stream + 1, Stream[stream]);
        }
        System.out.println("Select the movie according to the sl. no.");
        int stre = Integer.parseInt(en.readLine());
        double str = (int) (Math.random()*1000);
        System.out.println("Date and time: " + aa.getTime());
        System.out.println("                Book my Seat Streams");
        System.out.println("-------------------------------------------------------------");
        System.out.println("Stream Name: " + Stream[stre-1]);
        System.out.println("Description: " + Dess[stre-1]);
        System.out.println("Cost: Rs." + str);
        System.out.println("                   PAYMENTS");
        System.out.println("***********************************************");
        System.out.println("Choose a payment option:");
        System.out.println("1.Debit/Credit Card");
        System.out.println("2.Net-banking");
        System.out.println("3.UPI");
        System.out.println("4.Wallets");
        pay = Integer.parseInt(en.readLine());
        switch (pay) {
            case 1:
                long card;
                int cvv;
                int otp;
                System.out.println("You have chosen payment through Debit/Credit card");
                do {
                    System.out.println("Please enter the 16 digits card number");
                    card = Long.parseLong(en.readLine());
                } while (1000000000000000L >= card || card >= 9999999999999999L);
                do {
                    System.out.println("Please enter the 3 digit cvv number");
                    cvv = Integer.parseInt(en.readLine());
                } while (100 >= cvv || cvv >= 999);
                do {
                    System.out.println("Please enter the 4 digit OTP which has been sent to your phone.");
                    otp = Integer.parseInt(en.readLine());
                } while (1000 >= otp || otp >= 9999);
                System.out.println("Verifying>>>>>>>>>>>>>>>>>>>>");
                System.out.println("Verified");
                System.out.println(" ");
                System.out.println("Payment through Card no. " + card);
                System.out.println("You have successfully paid Rs." + str + " through Credit/Debit Card");
                int id = (int) Math.round(Math.random() * 1000);
                int id1 = (int) Math.round(Math.random() * 100);
                System.out.println("Payment reference no :CRD" + id + "DB" + id1 + "CD");
                break;
            case 2:
                String users;
                String passs;
                System.out.println("You have chosen payment through Net Banking");
                do {
                    System.out.println("Please enter your username");
                    user = en.readLine();
                } while (user == null);
                do {
                    System.out.println("Please enter your password");
                    pass = en.readLine();
                } while (pass == null);
                do {
                    System.out.println("Please enter the 4 digit OTP which has been sent to your phone.");
                    otp = Integer.parseInt(en.readLine());
                } while (1000 >= otp || otp >= 9999);
                System.out.println("Verifying>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                System.out.println("Verified");
                System.out.println(" ");
                System.out.println("Payment through " + user);
                System.out.println("You have successfully paid Rs." + str + " through Net Banking");
                int id2 = (int) Math.round(Math.random() * 1000);
                int id3 = (int) Math.round(Math.random() * 100);
                System.out.println("Payment reference no :NT" + id2 + "BNK" + id3 + "UP");
                break;
            case 3:
                String upi;
                long pin;
                System.out.println("You have chosen payment through UPI\n");
                do {
                    System.out.println("Please enter your UPI ID\nYour UPI ID should be in the format of **********@upi\n");
                    upi = en.readLine();
                } while (upi == null);
                do {
                    System.out.println("Please enter your 6 digit UPI pin");
                    pin = Long.parseLong(en.readLine());
                } while (100000 >= pin || pin >= 999999);
                System.out.println("Verifying>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                System.out.println("Verified");
                System.out.println(" ");
                System.out.println("Payment through " + upi);
                System.out.println("You have successfully paid Rs." + str + " through UPI");
                int id4 = (int) Math.round(Math.random() * 1000);
                int id5 = (int) Math.round(Math.random() * 100);
                System.out.println("Payment reference no :UPI" + id4 + "@" + id5 + "/y");
                break;
            case 4:
                int wallet;
                String Wallet;
                long phone;
                System.out.println("You have chosen payment through Digital Wallets.");
                System.out.println("Choose the wallet of your choice.");
                System.out.println(" ");
                System.out.println("                    WALLETS");
                System.out.println("**********************************************");
                System.out.println("Choose a Digital Wallet:");
                System.out.println("1.PhonePe");
                System.out.println("2.G Pay(Google Pay)");
                System.out.println("3.PayTM");
                System.out.println("4.BharatPe");
                System.out.println("5.Amazon Pay");
                wallet = Integer.parseInt(en.readLine());
                switch (wallet) {
                    case 1:
                        Wallet = "PhonePe";
                        break;
                    case 2:
                        Wallet = "G Pay(Google Pay)";
                        break;
                    case 3:
                        Wallet = "PayTM";
                        break;
                    case 4:
                        Wallet = "BharatPe";
                        break;
                    case 5:
                        Wallet = "Amazon Pay";
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + wallet);
                }
                System.out.println("You have chosen " + Wallet + " Wallet");
                System.out.println("Enter the phone number from which you have registered in " + Wallet);
                do {
                    System.out.println("Please enter your phone number");
                    phone = Long.parseLong(en.readLine());
                } while (1000000000 >= phone || phone >= 9999999999L);
                do {
                    System.out.println("Please enter the 4 digit OTP which has been sent to your phone.");
                    otp = Integer.parseInt(en.readLine());
                } while (1000 >= otp || otp >= 9999);
                System.out.println("Verifying>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                System.out.println("Verified");
                System.out.println(" ");
                System.out.println("Payment through " + Wallet);
                System.out.println("You have successfully paid Rs." + str + " through Digital Wallet");
                int id6 = (int) Math.round(Math.random() * 1000);
                int id7 = (int) Math.round(Math.random() * 100);
                System.out.println("Payment reference no :DGT" + id6 + "WLT" + id7 + "Pec");
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + pay);
        }
    }
     public void Music_Shows () throws IOException{
         Calendar aa = Calendar.getInstance();
         System.out.println("\fDate and time: " + aa.getTime());
         System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
         System.out.println(" ");
         System.out.println("                            BBBBBB      OOOO      OOOO    KK  KK            MMM      MMM  YY    YY             SSSSSSS  EEEEEEEE      AA      TTTTTTTTTT   ");
         System.out.println("                            BB   BB   OO    OO  OO    OO  KK KK             MM MM  MM MM   YY  YY             SS        EE           AA AA        TT       ");
         System.out.println("                            BBBBBB    OO    OO  OO    OO  KKKK              MM  MM MM MM    YYYY               SSSSSSS  EEEEEEE     AA   AA       TT       ");
         System.out.println("                            BB   BB   OO    OO  OO    OO  KK KK             MM    M   MM     YY                      SS EE         AAAAAAAAA      TT       ");
         System.out.println("                            BBBBBB      OOOO      OOOO    KK  KK            MM        MM     YY                SSSSSSS  EEEEEEEE  AA       AA     TT       ");
         System.out.println("                                                                                THINK IT SEE IT");
         System.out.println("                                                                        FIND BEST PRICES ON MOVIE TICKETS");
         System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
         String pass;
         String user;
         System.out.println("Enter Username");
         user = en.readLine();
         System.out.println("Enter Password:");
         pass = en.readLine();
         String[] Music = {"Sunburn Arena ft. DJ SNAKE", "Echoes of Earth Music Festival", "Stebin Ben Live In Concert", "Soundsworth Presents Thaikkudam Bridge at GYLT!", "KOROLOVA", "Morning Ragas-Morning Melodies","Avataran 2022", "Avalon Live in Bangalore", "Justin Bieber Justice World Tour", "Indian Dirt Fest", "OKTOBERFEST Bhartiya Mall of Bengaluru", "Avalon Live in Bangalore", "Tribute to Lucky Ali ft. ECHOS", "Tasnneem (Qilla Records) live at Kitty Ko", "Supermoon ft B Praak King of Hearts Tour- BLR", "Bangalore Open Air 2022", "GOLDEN EVENING", "Tribute to Ed Sheeran & Coldplay ft. Nikhil Vai"};
         String[] venue = {"Venue to be announced", "Venue to be announced", "Phoenix Marketcity, Whitefield", "GYLT:Bengaluru", "GYLT:Bengaluru", "Chowdiyah Memorial Hall", "Nimhans Convention Center", "Sutra: The Lalit Ashok", "Jawaharlal Nehru Stadium, Delhi", "Tribal Adventure Cafe, Bengaluru", "Bhartiya Mall, Bengaluru", "Sutra: The Lalit Ashok", "Hard Rock Cafe, Bengaluru", "Kitty Ko, The Lalit Ashok, Bengaluru", "Venue to Announced", "Ramada by Wyndham, Yelahanka", "Chowdiah Memorial Hall, Bengaluru", "Hard Rock Cafe, Whitefield"};
         int[] costm$ = {999, 2360, 499, 499, 999, 399, 450, 1000, 4000, 1499, 499, 1000, 750, 499, 999, 2499, 350, 750};
         int shows;
         for (shows = 0; shows < Music.length; shows++) {
             System.out.printf("%2d. %1s%n", shows + 1, Music[shows]);
         }
         System.out.println("Select the movie according to the sl. no.");
         int misc = Integer.parseInt(en.readLine());
         double msc = (int) (Math.random()*1000);
         System.out.println("Date and time: " + aa.getTime());
         System.out.println("                Book my Seat Streams");
         System.out.println("-------------------------------------------------------------");
         System.out.println("Music Show Name: " + Music[misc-1]);
         System.out.println("Venue: " + venue[misc-1]);
         System.out.println("Cost: Rs." + costm$);
         System.out.println("                   PAYMENTS");
         System.out.println("***********************************************");
         System.out.println("Choose a payment option:");
         System.out.println("1.Debit/Credit Card");
         System.out.println("2.Net-banking");
         System.out.println("3.UPI");
         System.out.println("4.Wallets");
         pay = Integer.parseInt(en.readLine());
         switch (pay) {
             case 1:
                 long card;
                 int cvv;
                 int otp;
                 System.out.println("You have chosen payment through Debit/Credit card");
                 do {
                     System.out.println("Please enter the 16 digits card number");
                     card = Long.parseLong(en.readLine());
                 } while (1000000000000000L >= card || card >= 9999999999999999L);
                 do {
                     System.out.println("Please enter the 3 digit cvv number");
                     cvv = Integer.parseInt(en.readLine());
                 } while (100 >= cvv || cvv >= 999);
                 do {
                     System.out.println("Please enter the 4 digit OTP which has been sent to your phone.");
                     otp = Integer.parseInt(en.readLine());
                 } while (1000 >= otp || otp >= 9999);
                 System.out.println("Verifying>>>>>>>>>>>>>>>>>>>>");
                 System.out.println("Verified");
                 System.out.println(" ");
                 System.out.println("Payment through Card no. " + card);
                 System.out.println("You have successfully paid Rs." + msc + " through Credit/Debit Card");
                 int id = (int) Math.round(Math.random() * 1000);
                 int id1 = (int) Math.round(Math.random() * 100);
                 System.out.println("Payment reference no :CRD" + id + "DB" + id1 + "CD");
                 break;
             case 2:
                 String users;
                 String passs;
                 System.out.println("You have chosen payment through Net Banking");
                 do {
                     System.out.println("Please enter your username");
                     user = en.readLine();
                 } while (user == null);
                 do {
                     System.out.println("Please enter your password");
                     pass = en.readLine();
                 } while (pass == null);
                 do {
                     System.out.println("Please enter the 4 digit OTP which has been sent to your phone.");
                     otp = Integer.parseInt(en.readLine());
                 } while (1000 >= otp || otp >= 9999);
                 System.out.println("Verifying>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                 System.out.println("Verified");
                 System.out.println(" ");
                 System.out.println("Payment through " + user);
                 System.out.println("You have successfully paid Rs." + msc + " through Net Banking");
                 int id2 = (int) Math.round(Math.random() * 1000);
                 int id3 = (int) Math.round(Math.random() * 100);
                 System.out.println("Payment reference no :NT" + id2 + "BNK" + id3 + "UP");
                 break;
             case 3:
                 String upi;
                 long pin;
                 System.out.println("You have chosen payment through UPI\n");
                 do {
                     System.out.println("Please enter your UPI ID\nYour UPI ID should be in the format of **********@upi\n");
                     upi = en.readLine();
                 } while (upi == null);
                 do {
                     System.out.println("Please enter your 6 digit UPI pin");
                     pin = Long.parseLong(en.readLine());
                 } while (100000 >= pin || pin >= 999999);
                 System.out.println("Verifying>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                 System.out.println("Verified");
                 System.out.println(" ");
                 System.out.println("Payment through " + upi);
                 System.out.println("You have successfully paid Rs." + msc + " through UPI");
                 int id4 = (int) Math.round(Math.random() * 1000);
                 int id5 = (int) Math.round(Math.random() * 100);
                 System.out.println("Payment reference no :UPI" + id4 + "@" + id5 + "/y");
                 break;
             case 4:
                 int wallet;
                 String Wallet;
                 long phone;
                 System.out.println("You have chosen payment through Digital Wallets.");
                 System.out.println("Choose the wallet of your choice.");
                 System.out.println(" ");
                 System.out.println("                    WALLETS");
                 System.out.println("**********************************************");
                 System.out.println("Choose a Digital Wallet:");
                 System.out.println("1.PhonePe");
                 System.out.println("2.G Pay(Google Pay)");
                 System.out.println("3.PayTM");
                 System.out.println("4.BharatPe");
                 System.out.println("5.Amazon Pay");
                 wallet = Integer.parseInt(en.readLine());
                 switch (wallet) {
                     case 1:
                         Wallet = "PhonePe";
                         break;
                     case 2:
                         Wallet = "G Pay(Google Pay)";
                         break;
                     case 3:
                         Wallet = "PayTM";
                         break;
                     case 4:
                         Wallet = "BharatPe";
                         break;
                     case 5:
                         Wallet = "Amazon Pay";
                         break;
                     default:
                         throw new IllegalStateException("Unexpected value: " + wallet);
                 }
                 System.out.println("You have chosen " + Wallet + " Wallet");
                 System.out.println("Enter the phone number from which you have registered in " + Wallet);
                 do {
                     System.out.println("Please enter your phone number");
                     phone = Long.parseLong(en.readLine());
                 } while (1000000000 >= phone || phone >= 9999999999L);
                 do {
                     System.out.println("Please enter the 4 digit OTP which has been sent to your phone.");
                     otp = Integer.parseInt(en.readLine());
                 } while (1000 >= otp || otp >= 9999);
                 System.out.println("Verifying>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                 System.out.println("Verified");
                 System.out.println(" ");
                 System.out.println("Payment through " + Wallet);
                 System.out.println("You have successfully paid Rs." + msc + " through Digital Wallet");
                 int id6 = (int) Math.round(Math.random() * 1000);
                 int id7 = (int) Math.round(Math.random() * 100);
                 System.out.println("Payment reference no :DGT" + id6 + "WLT" + id7 + "Pec");
                 break;
             default:
             throw new IllegalStateException("Unexpected value: " + pay);
         }
     }
    public void Comedy_Shows () throws IOException{
        Calendar aa = Calendar.getInstance();
        System.out.println("\fDate and time: " + aa.getTime());
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println(" ");
        System.out.println("                            BBBBBB      OOOO      OOOO    KK  KK            MMM      MMM  YY    YY             SSSSSSS  EEEEEEEE      AA      TTTTTTTTTT   ");
        System.out.println("                            BB   BB   OO    OO  OO    OO  KK KK             MM MM  MM MM   YY  YY             SS        EE           AA AA        TT       ");
        System.out.println("                            BBBBBB    OO    OO  OO    OO  KKKK              MM  MM MM MM    YYYY               SSSSSSS  EEEEEEE     AA   AA       TT       ");
        System.out.println("                            BB   BB   OO    OO  OO    OO  KK KK             MM    M   MM     YY                      SS EE         AAAAAAAAA      TT       ");
        System.out.println("                            BBBBBB      OOOO      OOOO    KK  KK            MM        MM     YY                SSSSSSS  EEEEEEEE  AA       AA     TT       ");
        System.out.println("                                                                                THINK IT SEE IT");
        System.out.println("                                                                        FIND BEST PRICES ON MOVIE TICKETS");
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
        String pass;
        String user;
        System.out.println("Enter Username");
        user = en.readLine();
        System.out.println("Enter Password:");
        pass = en.readLine();
        String[] Comedy = {"", "", "", "", "", "","", "", "", ""};
        String[] venue = {"Phoenix Marketcity, Whitefield", "GYLT:Bengaluru", "GYLT:Bengaluru", "Chowdiyah Memorial Hall", "Nimhans Convention Center", "Sutra: The Lalit Ashok","Tribal Adventure Cafe, Bengaluru", "Bhartiya Mall, Bengaluru", "Sutra: The Lalit Ashok", "Hard Rock Cafe, Bengaluru"};
        int[] costc$ = {199, 260, 149, 209, 179, 139, 150, 190, 200, 140};
        int shows;
        for (shows = 0; shows < Comedy.length; shows++) {
            System.out.printf("%2d. %1s%n", shows + 1,Comedy[shows]);
        }
        System.out.println("Select the movie according to the sl. no.");
        int comdy = Integer.parseInt(en.readLine());
        double cmd = (int) (Math.random()*1000);
        System.out.println("Date and time: " + aa.getTime());
        System.out.println("                Book my Seat Streams");
        System.out.println("------------------------------------------------------------");
        System.out.println("Comedy Show Name: " + Comedy[comdy-1]);
        System.out.println("Venue: " + venue[comdy-1]);
        System.out.println("Cost: Rs." + costc$);
        System.out.println("                   PAYMENTS");
        System.out.println("***********************************************");
        System.out.println("Choose a payment option:");
        System.out.println("1.Debit/Credit Card");
        System.out.println("2.Net-banking");
        System.out.println("3.UPI");
        System.out.println("4.Wallets");
        pay = Integer.parseInt(en.readLine());
        switch (pay) {
            case 1:
                long card;
                int cvv;
                int otp;
                System.out.println("You have chosen payment through Debit/Credit card");
                do {
                    System.out.println("Please enter the 16 digits card number");
                    card = Long.parseLong(en.readLine());
                } while (1000000000000000L >= card || card >= 9999999999999999L);
                do {
                    System.out.println("Please enter the 3 digit cvv number");
                    cvv = Integer.parseInt(en.readLine());
                } while (100 >= cvv || cvv >= 999);
                do {
                    System.out.println("Please enter the 4 digit OTP which has been sent to your phone.");
                    otp = Integer.parseInt(en.readLine());
                } while (1000 >= otp || otp >= 9999);
                System.out.println("Verifying>>>>>>>>>>>>>>>>>>>>");
                System.out.println("Verified");
                System.out.println(" ");
                System.out.println("Payment through Card no. " + card);
                System.out.println("You have successfully paid Rs." + cmd + " through Credit/Debit Card");
                int id = (int) Math.round(Math.random() * 1000);
                int id1 = (int) Math.round(Math.random() * 100);
                System.out.println("Payment reference no :CRD" + id + "DB" + id1 + "CD");
                break;
            case 2:
                String users;
                String passs;
                System.out.println("You have chosen payment through Net Banking");
                do {
                    System.out.println("Please enter your username");
                    user = en.readLine();
                } while (user == null);
                do {
                    System.out.println("Please enter your password");
                    pass = en.readLine();
                } while (pass == null);
                do {
                    System.out.println("Please enter the 4 digit OTP which has been sent to your phone.");
                    otp = Integer.parseInt(en.readLine());
                } while (1000 >= otp || otp >= 9999);
                System.out.println("Verifying>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                System.out.println("Verified");
                System.out.println(" ");
                System.out.println("Payment through " + user);
                System.out.println("You have successfully paid Rs." + cmd + " through Net Banking");
                int id2 = (int) Math.round(Math.random() * 1000);
                int id3 = (int) Math.round(Math.random() * 100);
                System.out.println("Payment reference no :NT" + id2 + "BNK" + id3 + "UP");
                break;
            case 3:
                String upi;
                long pin;
                System.out.println("You have chosen payment through UPI\n");
                do {
                    System.out.println("Please enter your UPI ID\nYour UPI ID should be in the format of **********@upi\n");
                    upi = en.readLine();
                } while (upi == null);
                do {
                    System.out.println("Please enter your 6 digit UPI pin");
                    pin = Long.parseLong(en.readLine());
                } while (100000 >= pin || pin >= 999999);
                System.out.println("Verifying>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                System.out.println("Verified");
                System.out.println(" ");
                System.out.println("Payment through " + upi);
                System.out.println("You have successfully paid Rs." + cmd + " through UPI");
                int id4 = (int) Math.round(Math.random() * 1000);
                int id5 = (int) Math.round(Math.random() * 100);
                System.out.println("Payment reference no :UPI" + id4 + "@" + id5 + "/y");
                break;
            case 4:
                int wallet;
                String Wallet;
                long phone;
                System.out.println("You have chosen payment through Digital Wallets.");
                System.out.println("Choose the wallet of your choice.");
                System.out.println(" ");
                System.out.println("                    WALLETS");
                System.out.println("**********************************************");
                System.out.println("Choose a Digital Wallet:");
                System.out.println("1.PhonePe");
                System.out.println("2.G Pay(Google Pay)");
                System.out.println("3.PayTM");
                System.out.println("4.BharatPe");
                System.out.println("5.Amazon Pay");
                wallet = Integer.parseInt(en.readLine());
                switch (wallet) {
                    case 1:
                        Wallet = "PhonePe";
                        break;
                    case 2:
                        Wallet = "G Pay(Google Pay)";
                        break;
                    case 3:
                        Wallet = "PayTM";
                        break;
                    case 4:
                        Wallet = "BharatPe";
                        break;
                    case 5:
                        Wallet = "Amazon Pay";
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + wallet);
                }
                System.out.println("You have chosen " + Wallet + " Wallet");
                System.out.println("Enter the phone number from which you have registered in " + Wallet);
                do {
                    System.out.println("Please enter your phone number");
                    phone = Long.parseLong(en.readLine());
                } while (1000000000 >= phone || phone >= 9999999999L);
                do {
                    System.out.println("Please enter the 4 digit OTP which has been sent to your phone.");
                    otp = Integer.parseInt(en.readLine());
                } while (1000 >= otp || otp >= 9999);
                System.out.println("Verifying>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                System.out.println("Verified");
                System.out.println(" ");
                System.out.println("Payment through " + Wallet);
                System.out.println("You have successfully paid Rs." + cmd + " through Digital Wallet");
                int id6 = (int) Math.round(Math.random() * 1000);
                int id7 = (int) Math.round(Math.random() * 100);
                System.out.println("Payment reference no :DGT" + id6 + "WLT" + id7 + "Pec");
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + pay);
        }
    }
    public void Sports () throws IOException
    {
        Calendar aa = Calendar.getInstance();
        System.out.println("\fDate and time: " + aa.getTime());
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println(" ");
        System.out.println("                          BBBBBB      OOOO      OOOO    KK  KK            MMM      MMM  YY    YY             SSSSSSS  EEEEEEEE      AA      TTTTTTTTTT   ");
        System.out.println("                          BB   BB   OO    OO  OO    OO  KK KK             MM MM  MM MM   YY  YY             SS        EE           AA AA        TT       ");
        System.out.println("                          BBBBBB    OO    OO  OO    OO  KKKK              MM  MM MM MM    YYYY               SSSSSSS  EEEEEEE     AA   AA       TT       ");
        System.out.println("                          BB   BB   OO    OO  OO    OO  KK KK             MM    M   MM     YY                      SS EE         AAAAAAAAA      TT       ");
        System.out.println("                          BBBBBB      OOOO      OOOO    KK  KK            MM        MM     YY                SSSSSSS  EEEEEEEE  AA       AA     TT       ");
        System.out.println("                                                                              THINK IT SEE IT");
        System.out.println("                                                                      FIND BEST PRICES ON MOVIE TICKETS");
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
        String pass;
        String user;
        System.out.println("Enter Username");
        user = en.readLine();
        System.out.println("Enter Password:");
        pass = en.readLine();
        System.out.println("Select the sports you want to watch");
        int[] od = {1,2,3,4,5,6};
        String[] Sports = {"E-Sports","Football","Cricket","Archery","Badminton","Basketball"};
        int sp;
        for(sp=0;sp< Sports.length;sp++){
            System.out.printf("%2s %2s%n", od[sp], Sports[sp]);
          }
        int chosse = Integer.parseInt(en.readLine());
        switch (chosse){
            case 1:
                System.out.println("E-Sports");
                int[] Es = {1,2,3,4,5,6,7};
                System.out.println("Select the E-Sports you want to watch");
                String[] ESports = { "Free Fire Solo And Squad (Bermuda)", "Call of Duty Mobile Tournament", "Online Game - Lost Treasure of Sundarban", "Online Game - Flight 9032 Murder Mystery", "The Covid Lab - An Online Escape Rooms Experience", "Who`s the Killer - An Online Murder Mystery", "Johnson Call Of Duty Mobile Tournament", "Indian Chess League 2022"};
                for (int es = 0; es < ESports.length; es++){
                    System.out.printf("%2s %2s%n", es + 1, ESports[es] );
                    }
                    int ec = Integer.parseInt(en.readLine());
                if (ec == 1){
                    System.out.println("you have chosen - 'Free Fire Solo And Squad (Bermuda)'");
                    System.out.println();
                } else if (ec == 2){
                    System.out.println("you have chosen - 'Call of Duty Mobile Tournament'");
                    System.out.println();
                } else if (ec == 3){
                    System.out.println("you have chosen - 'COnline Game - Lost Treasure of Sundarban'");
                    System.out.println();
                } else if (ec == 4){
                    System.out.println("you have chosen - 'Online Game - Flight 9032 Murder Mystery'");
                    System.out.println();
                } else if (ec == 5){
                    System.out.println("you have chosen - 'The Covid Lab - An Online Escape Rooms Experience'");
                    System.out.println();
                } else if (ec == 6){
                    System.out.println("you have chosen - 'Who`s the Killer - An Online Murder Mystery'");
                    System.out.println();
                } else if (ec == 7){
                    System.out.println("you have chosen - 'Johnson Call Of Duty Mobile Tournament'");
                    System.out.println();
                } else if (ec == 8){
                    System.out.println("you have chosen - 'Indian Chess League 2022'");
                    System.out.println();
                   }
            break;
            case 2:
                System.out.println("Football");
                int[] fb = {1,2,3,4,5,6,7};
                System.out.println("Select the Football match you want to watch");
                String[] Football = {"Bologna |vs| Monza","Barcelona |vs| Viktoria PLazen","Napoli |vs| Liverpool","Manchester city |vs| Milan","Manchester united |vs| Aston villa","Argentina |vs| Italy","Germany |vs| Brazil","Russia (USSR) |vs| England"};
                for (int es = 0; es < Football.length; es++){
                    System.out.printf("%2s %2s%n",es + 1, Football[es]);
                   }
                 int fc = Integer.parseInt(en.readLine() );
                if (fc == 1){
                    System.out.println("you have chosen - 'Bologna |vs| Monza'");
                    System.out.println();
                } else if (fc == 2){
                    System.out.println("you have chosen - 'Barcelona |vs| Viktoria PLazen'");
                    System.out.println();
                } else if (fc == 3){
                    System.out.println("you have chosen - 'Napoli |vs| Liverpool'");
                    System.out.println();
                } else if (fc == 4){
                    System.out.println("you have chosen - 'Manchester city |vs| Milan'");
                    System.out.println();
                } else if (fc == 5){
                    System.out.println("you have chosen - 'Manchester united |vs| Aston villa'");
                    System.out.println();
                } else if (fc == 6){
                    System.out.println("you have chosen - 'Argentina |vs| Italy'");
                    System.out.println();
                } else if (fc == 7){
                    System.out.println("you have chosen - 'Germany |vs| Brazil'");
                    System.out.println();
                } else if (fc == 8){
                    System.out.println("you have chosen - 'Russia |vs| England'");
                    System.out.println();
                   }
            break;
            case 3:
                System.out.println("Cricket");
                int[] ck = {1, 2, 3, 4, 5, 6, 7};
                System.out.println("Select the Cricket match you want to watch");
                String[] Cricket = {"Ireland |vs| Sri Lanka", "Pakistan |vs| India", "Bangladesh |vs| Netherlands", "Zimbabwe |vs| South Africa", "Sri lanka |vs| Australia", "Ireland |vs| England", "South Africa |vs| Bangladesh", "India |vs| Netherlands"};
                for (int es = 0; es < Cricket.length; es++) {
                    System.out.printf("%2s %2s%n", es + 1, Cricket[es]);
                }
                int ckt = Integer.parseInt(en.readLine());
                if (ckt == 1) {
                    System.out.println("you have chosen - 'Ireland |vs| Sri Lanka'");
                    System.out.println();
                } else if (ckt == 2) {
                    System.out.println("you have chosen - 'India |vs| Pakistan'");
                    System.out.println();
                } else if (ckt == 3) {
                    System.out.println("you have chosen - 'Bangladesh |vs| Netherlands'");
                    System.out.println();
                } else if (ckt == 4) {
                    System.out.println("you have chosen - 'Zimbabwe |vs| South Africa'");
                    System.out.println();
                } else if (ckt == 5) {
                    System.out.println("you have chosen - 'Sri lanka |vs| Australia'");
                    System.out.println();
                } else if (ckt == 6) {
                    System.out.println("you have chosen - 'Ireland |vs| England'");
                    System.out.println();
                } else if (ckt == 7) {
                    System.out.println("you have chosen - 'South Africa |vs| Bangladesh'");
                    System.out.println();
                } else if (ckt == 8) {
                    System.out.println("you have chosen - 'India |vs| Netherlands'");
                     System.out.println();
                }
            break;
            case 4:
                System.out.println("Badminton");
                int[] bd = {1, 2, 3, 4, 5, 6, 7};
                System.out.println("Select the Badminton match you want to watch");
                String[] Badminton = {"", "", "", "", "", "", "", ""};
                for (int es = 0; es < Badminton.length; es++) {
                    System.out.printf("%2s %2s%n", es + 1, Badminton[es]);
                }
                int badt = Integer.parseInt(en.readLine());
                if (badt == 1) {
                    System.out.println("you have chosen - 'India |vs| Japan'");
                    System.out.println();
                } else if (badt == 2) {
                    System.out.println("you have chosen - 'Indonesia |vs| Denmark'");
                    System.out.println();
                } else if (badt == 3) {
                    System.out.println("you have chosen - 'Malaysia |vs| Cannada'");
                    System.out.println();
                } else if (badt == 4) {
                    System.out.println("you have chosen - 'China |vs| Singapore'");
                    System.out.println();
                } else if (badt == 5) {
                    System.out.println("you have chosen - 'South korea |vs| Thailand'");
                    System.out.println();
                } else if (badt == 6) {
                    System.out.println("you have chosen - 'Hong Kong |vs| Ierland'");
                    System.out.println();
                } else if (badt == 7) {
                    System.out.println("you have chosen - 'Russia |vs| Uganda'");
                    System.out.println();
                } else if (badt == 8) {
                    System.out.println("you have chosen - 'Bulgaria |vs| Wales'");
                    System.out.println();
                }
            break;
            case 5:
                System.out.println("Basketball");
                int[] bb = {1, 2, 3, 4, 5, 6, 7};
                System.out.println("Select the Basketball match you want to watch");
                String[] Basketball = {"Nets |vs| Bulls", "Magic |vs| Warriors", "Thunder |vs| Nuggets", "Pistons |vs| Cavaliers", "76ers |vs| Knicks", "Wizards |vs| Nets", "Timberwolves |vs| Bucks", "Magic |vs| Kings"};
                for (int es = 0; es < Basketball.length; es++) {
                    System.out.printf("%2s %2s%n", es + 1, Basketball[es]);
                }
                int bskt = Integer.parseInt(en.readLine());
                if (bskt == 1) {
                    System.out.println("you have chosen - 'Nets |vs| Bulls'");
                    System.out.println();
                } else if (bskt == 2) {
                    System.out.println("you have chosen - 'Magic |vs| Warriors'");
                    System.out.println();
                } else if (bskt == 3) {
                    System.out.println("you have chosen - 'Thunder |vs| Nuggets'");
                    System.out.println();
                } else if (bskt == 4) {
                    System.out.println("you have chosen - 'Pistons |vs| Cavaliers'");
                    System.out.println();
                } else if (bskt == 5) {
                    System.out.println("you have chosen - '76ers |vs| Knicks'");
                    System.out.println();
                } else if (bskt == 6) {
                    System.out.println("you have chosen - 'Wizards |vs| Nets'");
                    System.out.println();
                } else if (bskt == 7) {
                    System.out.println("you have chosen - 'Timberwolves |vs| Bucks'");
                    System.out.println();
                } else if (bskt == 8) {
                    System.out.println("you have chosen - 'Magic |vs| Kings'");
                    System.out.println();
                }
            break;
        }
        double spr = (int) (Math.random()*1000);
        System.out.println("Date and time: " + aa.getTime());
        System.out.println("                Book my Seat Sports");
        System.out.println("Cost: Rs." + spr);
        System.out.println("                   PAYMENTS");
        System.out.println("***********************************************");
        System.out.println("Choose a payment option:");
        System.out.println("1.Debit/Credit Card");
        System.out.println("2.Net-banking");
        System.out.println("3.UPI");
        System.out.println("4.Wallets");
        System.out.println("***********************************************");
        System.out.println("enter the sl. number of the payment method you want to pay with ");
        pay = Integer.parseInt(en.readLine());
        switch (pay) {
            case 1:
                long card;
                int cvv;
                int otp;
                System.out.println("You have chosen payment through Debit/Credit card");
                do {
                    System.out.println("Please enter the 16 digits card number");
                    card = Long.parseLong(en.readLine());
                } while (1000000000000000L >= card || card >= 9999999999999999L);
                do {
                    System.out.println("Please enter the 3 digit cvv number");
                    cvv = Integer.parseInt(en.readLine());
                } while (100 >= cvv || cvv >= 999);
                do {
                    System.out.println("Please enter the 4 digit OTP which has been sent to your phone.");
                    otp = Integer.parseInt(en.readLine());
                } while (1000 >= otp || otp >= 9999);
                System.out.println("Verifying>>>>>>>>>>>>>>>>>>>>");
                System.out.println("Verified");
                System.out.println(" ");
                System.out.println("Payment through Card no. " + card);
                System.out.println("You have successfully paid Rs." + spr + " through Credit/Debit Card");
                int id = (int) Math.round(Math.random() * 1000);
                int id1 = (int) Math.round(Math.random() * 100);
                System.out.println("Payment reference no :CRD" + id + "DB" + id1 + "CD");
                break;
            case 2:
                String users;
                String passs;
                System.out.println("You have chosen payment through Net Banking");
                do {
                    System.out.println("Please enter your username");
                    user = en.readLine();
                } while (user == null);
                do {
                    System.out.println("Please enter your password");
                    pass = en.readLine();
                } while (pass == null);
                do {
                    System.out.println("Please enter the 4 digit OTP which has been sent to your phone.");
                    otp = Integer.parseInt(en.readLine());
                } while (1000 >= otp || otp >= 9999);
                System.out.println("Verifying>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                System.out.println("Verified");
                System.out.println(" ");
                System.out.println("Payment through " + user);
                System.out.println("You have successfully paid Rs." + spr + " through Net Banking");
                int id2 = (int) Math.round(Math.random() * 1000);
                int id3 = (int) Math.round(Math.random() * 100);
                System.out.println("Payment reference no :NT" + id2 + "BNK" + id3 + "UP");
                break;
            case 3:
                String upi;
                long pin;
                System.out.println("You have chosen payment through UPI\n");
                do {
                    System.out.println("Please enter your UPI ID\nYour UPI ID should be in the format of **********@upi\n");
                    upi = en.readLine();
                } while (upi == null);
                do {
                    System.out.println("Please enter your 6 digit UPI pin");
                    pin = Long.parseLong(en.readLine());
                } while (100000 >= pin || pin >= 999999);
                System.out.println("Verifying>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                System.out.println("Verified");
                System.out.println(" ");
                System.out.println("Payment through " + upi);
                System.out.println("You have successfully paid Rs." + spr + " through UPI");
                int id4 = (int) Math.round(Math.random() * 1000);
                int id5 = (int) Math.round(Math.random() * 100);
                System.out.println("Payment reference no :UPI" + id4 + "@" + id5 + "/y");
                break;
            case 4:
                int wallet;
                String Wallet;
                long phone;
                System.out.println("You have chosen payment through Digital Wallets.");
                System.out.println("Choose the wallet of your choice.");
                System.out.println(" ");
                System.out.println("                    WALLETS");
                System.out.println("**********************************************");
                System.out.println("Choose a Digital Wallet:");
                System.out.println("1.PhonePe");
                System.out.println("2.G Pay(Google Pay)");
                System.out.println("3.PayTM");
                System.out.println("4.BharatPe");
                System.out.println("5.Amazon Pay");
                wallet = Integer.parseInt(en.readLine());
                switch (wallet) {
                    case 1:
                        Wallet = "PhonePe";
                        break;
                    case 2:
                        Wallet = "G Pay(Google Pay)";
                        break;
                    case 3:
                        Wallet = "PayTM";
                        break;
                    case 4:
                        Wallet = "BharatPe";
                        break;
                    case 5:
                        Wallet = "Amazon Pay";
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + wallet);
                }
                System.out.println("You have chosen " + Wallet + " Wallet");
                System.out.println("Enter the phone number from which you have registered in " + Wallet);
                do {
                    System.out.println("Please enter your phone number");
                    phone = Long.parseLong(en.readLine());
                } while (1000000000 >= phone || phone >= 9999999999L);
                do {
                    System.out.println("Please enter the 4 digit OTP which has been sent to your phone.");
                    otp = Integer.parseInt(en.readLine());
                } while (1000 >= otp || otp >= 9999);
                System.out.println("Verifying>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                System.out.println("Verified");
                System.out.println(" ");
                System.out.println("Payment through " + Wallet);
                System.out.println("You have successfully paid Rs." + spr + " through Digital Wallet");
                int id6 = (int) Math.round(Math.random() * 1000);
                int id7 = (int) Math.round(Math.random() * 100);
                System.out.println("Payment reference no :DGT" + id6 + "WLT" + id7 + "Pec");
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + pay);
        }
    }
     public void Thanking (){
        System.out.println("\f");
        System.out.println("            THANK YOU FOR BOOKING TICKETS ON BOOK MY SEAT               ");
        System.out.println("                          THINK IT SEE IT                               ");
        System.out.println("                  FIND BEST PRICES ON MOVIE TICKETS                      ");
        System.out.println(" ");
        System.out.println(" |||||||  ||          /\\     ||||||||          |||||    ||||         //    ");
        System.out.println(" ||       ||         // \\       ||            ||   // ||    ||  00  //     ");
        System.out.println(" |||||||  ||        //   \\      ||               //   ||    ||     //      ");
        System.out.println(" ||       ||       //|||||\\     ||             //     ||    ||    //  00   ");
        System.out.println(" ||       ||||||| //       \\    ||            |||||||   ||||     //       ");
        System.out.println(" ");
        System.out.println("                         ON YOUR SECOND PURCHASE                          ");
        System.out.println(" ");
         Calendar aa = Calendar.getInstance();
        System.out.println("Date and time:" + aa.getTime());
     }
 }