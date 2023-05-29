package com.epac.Press.NotEntities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class Job {


        private  String id;
        private  int sheetWidth;
        private int sheetHeight;
        private String numColors;
        private  String numSheets;

        public Job() {
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public int getSheetWidth() {
            return sheetWidth;
        }

        public void setSheetWidth(int sheetWidth) {
            this.sheetWidth = sheetWidth;
        }

        public int getSheetHeight() {
            return sheetHeight;
        }

        public void setSheetHeight(int sheetHeight) {
            this.sheetHeight = sheetHeight;
        }

        public String getNumColors() {
            return numColors;
        }

        public void setNumColors(String numColors) {
            this.numColors = numColors;
        }

        public String getNumSheets() {
            return numSheets;
        }

        public void setNumSheets(String numSheets) {
            this.numSheets = numSheets;
        }
    }


