class DrumKitTestDrive{
    public static void main(String[] args) {
        DrumKit drum = new DrumKit();

        if(drum.snare == true){
            drum.playSnare();
        }

        drum.playTopHat();

        // drum.snare = false;
    }
}