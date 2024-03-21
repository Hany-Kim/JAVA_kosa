package DAY_03_21.movieManager;

import java.util.*;

public class MovieManager {
    private static final String[] menuArr = {" ",
            "영화 생성",
            "영화 정보 수정",
            "영화 삭제",
            "장르로 영화 조회",
            "전체 영화 목록 출력",
            "끝내기"};
    private static final String[] updateMenuArr = {" ",
            "장르",
            "감독",
            "주연",
            "개봉일",
            "수정 완료"};
    static List<Movie> movieList = new ArrayList<>(); // 영화 모음
    static Set<String> genreSet = new HashSet<>(); // 장르 모음
    static Scanner scanner = new Scanner(System.in);

    private static void insertMovie(){
        System.out.println("영화 생성 모드 ==============================================");
        System.out.print("영화 제목 : ");
//        String title = scanner.next();
        String title = scanner.nextLine();

        System.out.print("장르 : ");
//        String genre = scanner.next();
        String genre = scanner.nextLine();

        System.out.print("감독 : ");
//        String director = scanner.next();
        String director = scanner.nextLine();

        System.out.print("주연 : ");
//        String mainActor = scanner.next();
        String mainActor = scanner.nextLine();

        System.out.print("개봉일 : ");
//        String releaseDate = scanner.next();
        String releaseDate = scanner.nextLine();

        movieList.add(new Movie(title, genre, director, mainActor, releaseDate));
        genreSet.add(genre);
    }

    private static void updateMovie(){
        if(movieList.size() > 0){ // 등록된 영화가 있다면
            printAllMovie(); // 영화 목록을 보여주고
            System.out.println();

            System.out.print("수정할 영화 이름을 입력하세요 : ");
            String movieTitle = scanner.next();

            for(Movie movie : movieList){
                if(movie.getTitle().equals(movieTitle)){
                    System.out.println("수정 모드 ==============================================");
                    while(true){
                        System.out.println("다음 메뉴 중에서 수정할 메뉴를 선택해 주세요...");
                        for(int i = 1; i < updateMenuArr.length; i++){
                            if(i == 1) { System.out.print("[" + i + "] " + updateMenuArr[i]); }
                            else if(i == (updateMenuArr.length - 1)){ System.out.println(" | [" + i + "] " + updateMenuArr[i]); }
                            else { System.out.print(" | [" + i + "] " + updateMenuArr[i]); }
                        }
                        scanner.nextLine();
                        int menu = scanner.nextInt();

                        switch (menu){
                            case 1:
                                System.out.println(updateMenuArr[menu] + " ----------------------");
                                System.out.println("변경 전 " + updateMenuArr[menu] + " : " + movie.getGenre());

                                System.out.print("변경할 [" + updateMenuArr[menu] + "]명을 입력해주세요 : ");
                                String updateGenre = scanner.next();
                                movie.setGenre(updateGenre);
                                System.out.println("변경 후 " + updateMenuArr[menu] + " : " + movie.getGenre());
                                break;
                            case 2:
                                System.out.println(updateMenuArr[menu] + " ----------------------");
                                System.out.println("변경 전 " + updateMenuArr[menu] + " : " + movie.getDirector());

                                System.out.print("변경할 [" + updateMenuArr[menu] + "]명을 입력해주세요 : ");
                                String updateDirector = scanner.next();
                                movie.setGenre(updateDirector);
                                System.out.println("변경 후 " + updateMenuArr[menu] + " : " + movie.getDirector());
                                break;
                            case 3:
                                System.out.println(updateMenuArr[menu] + " ----------------------");
                                System.out.println("변경 전 " + updateMenuArr[menu] + " : " + movie.getMainActor());

                                System.out.print("변경할 [" + updateMenuArr[menu] + "]명을 입력해주세요 : ");
                                String updateMainActor = scanner.next();
                                movie.setGenre(updateMainActor);
                                System.out.println("변경 후 " + updateMenuArr[menu] + " : " + movie.getMainActor());
                                break;
                            case 4:
                                System.out.println(updateMenuArr[menu] + " ----------------------");
                                System.out.println("변경 전 " + updateMenuArr[menu] + " : " + movie.getReleaseDate());

                                System.out.print("변경할 [" + updateMenuArr[menu] + "]을 입력해주세요 : ");
                                String updateReleaseDate = scanner.next();
                                movie.setGenre(updateReleaseDate);
                                System.out.println("변경 후 " + updateMenuArr[menu] + " : " + movie.getReleaseDate());
                                break;
                            case 5:
                                System.out.println("<=== 수정을 종료하겠습니다. ===>");
                                return;
                            default:
                                System.out.println("입력하신 메뉴는 없는 메뉴입니다.");
                                break;
                        }
                        System.out.println("---------------------------");
                    }
                }
            }
            System.out.println("영화 [" + movieTitle + "]가 목록에 없습니다.");
        }
        else {
            System.out.println("수정할 영화가 없습니다.");
        }
        System.out.println("<=== 수정을 종료하겠습니다. ===>");
    }
    
    private static void deleteMovie(){
        if(movieList.size() > 0){ // 등록된 영화가 있다면
            printAllMovie(); // 영화 목록을 보여주고
            System.out.println();

            System.out.print("삭제할 영화 이름을 입력하세요 : ");
            String movieTitle = scanner.next();
    
            for(Movie movie : movieList){
                if(movie.getTitle().equals(movieTitle)){
                    System.out.println("삭제 모드 ==============================================");
                    System.out.println("영화 [" + movie.getTitle() + "]를 삭제하시겠습니까?");
                    System.out.println("[1] : 예 | [2] : 아니오");
                    String menu = scanner.next();
    
                    switch (menu){
                        case "1":
                            movieList.remove(movie);
                            System.out.println("영화 [" + movie.getTitle() + "]를 삭제했습니다.");
                            System.out.println("<=== 삭제를 종료하겠습니다. ===>");
                            return;
                        case "2":
                            System.out.println("영화 [" + movie.getTitle() + "] 삭제를 취소했습니다.");
                            System.out.println("<=== 삭제를 종료하겠습니다. ===>");
                            return;
                    }
                }
            }
            System.out.println("영화 [" + movieTitle + "]가 목록에 없습니다.");
        }
        else { // 등록된 영화가 없다.
            System.out.println("삭제할 영화가 없습니다.");
        }
        System.out.println("<=== 삭제를 종료하겠습니다. ===>");
    }

    private static void findGenre(){
        if(genreSet.size() > 0){
            int cnt = 1;
            System.out.println("다음 장르를 보유 중입니다. ----");
            for(String genre : genreSet){
                System.out.println(cnt++ + ". " + genre);
            }
            System.out.println("---------------------------");

            System.out.print("찾으시려는 장르명을 입력해주세요 : ");
            String movieGenre = scanner.next();
            for(String genre : genreSet){
                if(genre.equals(movieGenre)){ // 장르 셋에 등록된적 있는 장르인지 확인
                    cnt = 1;
                    for(Movie movie : movieList){
                        if(movie.getGenre().equals(movieGenre)){ // 입력된 장르와 같은 영화 목록을 출력
                            System.out.print("[" + cnt++ + "] ");
                            printMovie(movie);
                        }
                    }
                    System.out.println();
                    System.out.println("The END.");
                    System.out.println("<=== 장르 찾기를 종료하겠습니다. ===>");
                    System.out.println();
                    return;
                }
            }
            System.out.println("입력하신 장르는 등록되지 않은 장르입니다.");
        }
        else {
            System.out.println("이전에 등록된 장르가 없습니다.");
        }
        System.out.println("<=== 장르 찾기를 종료하겠습니다. ===>");
    }

    private static void printAllMovie(){
        if(movieList.size() > 0){ // 등록된 영화가 있어야함
            int cnt = 1;
            System.out.println("다음 영화를 보유 중 입니다.");
            for(Movie movie : movieList){
                System.out.print("[" + cnt++ + "] ");
                printMovie(movie);
            }
            System.out.println("The END.");
        }
        else {
            System.out.println("등록된 영화가 없습니다.");
        }
        System.out.println("<=== 영화 목록 출력을 종료하겠습니다. ===>");
    }

    private static void printMovie(Movie movie){
        System.out.println("영화 : " + movie.getTitle() + " | "
                + "장르 : " + movie.getGenre() + " | "
        + "감독 : " + movie.getDirector() + " | "
        + "주연 : " + movie.getMainActor() + " | "
        + "개봉일 : " + movie.getReleaseDate());
    }

    public static void main(String[] args) {
        System.out.println("Han's 영화 관리 시스템에 오신걸 환영합니다.");
        System.out.println();
        while(true){
            System.out.println();
            System.out.println("수행하실 메뉴를 선택해주세요.");
            System.out.println("[1] " + menuArr[1] + " | [2] " + menuArr[2]
                    + " | [3] " + menuArr[3] + " | [4] " + menuArr[4]
                    + " | [5] " + menuArr[5] + " | [6] " + menuArr[6]);
            System.out.print("메뉴 번호를 입력해주세요 : ");
            int menu = scanner.nextInt();
            scanner.nextLine();

            switch (menu){
                case 1:
                    System.out.println(menuArr[menu] + "을 선택하셨습니다.");
                    System.out.println();
                    insertMovie();
                    break;
                case 2:
                    System.out.println(menuArr[menu] + "을 선택하셨습니다.");
                    System.out.println();
                    updateMovie();
                    break;
                case 3:
                    System.out.println(menuArr[menu] + "를 선택하셨습니다.");
                    System.out.println();
                    deleteMovie();
                    break;
                case 4:
                    System.out.println(menuArr[menu] + "를 선택하셨습니다.");
                    System.out.println();
                    findGenre();
                    break;
                case 5:
                    System.out.println(menuArr[menu] + "을 선택하셨습니다.");
                    System.out.println();
                    printAllMovie();
                    break;
                case 6:
                    System.out.println("Han's 영화 관리 시스템을 종료합니다.");
                    System.out.println("BYE......");
                    System.exit(0);
                default:
                    System.out.println("입력하신 메뉴는 없는 메뉴입니다.");
                    break;
            }
        }
    }
}
