package mp3player;

import Objects.MP3;
import Objects.MP3Work;
import Utils.FileUtils;
import Utils.MP3PlayerFileFilter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.ArrayList;
import javafx.scene.Parent;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.ListModel;
import javax.swing.filechooser.FileFilter;

public class MP3Player extends javax.swing.JFrame {

    private static final String MP3_FILE_EXTENSION = "mp3";
    private static final String MP3_FILE_DESCRIPTION = "Файлы mp3";
    private static final String PLAYLIST_FILE_EXTENSION = "pls";
    private static final String PLAYLIST_FILE_DESCRIPTION = "Файлы плейлиста";

    private static final FileFilter mp3FileFilter = new MP3PlayerFileFilter(MP3_FILE_EXTENSION, MP3_FILE_DESCRIPTION);
    private static final FileFilter playListFileFilter = new MP3PlayerFileFilter(PLAYLIST_FILE_EXTENSION, PLAYLIST_FILE_DESCRIPTION);
    private static DefaultListModel mp3DefaultListModel = new DefaultListModel();
    private MP3Work player = new MP3Work();
    private int currentVolumeValue;
    

    public MP3Player() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileChooser = new javax.swing.JFileChooser();
        popmenuPlayList = new javax.swing.JPopupMenu();
        popupItemAddSong = new javax.swing.JMenuItem();
        popupItemDeleteSong = new javax.swing.JMenuItem();
        popupSeparator1 = new javax.swing.JPopupMenu.Separator();
        popupItemPlaySong = new javax.swing.JMenuItem();
        popupItemStopSong = new javax.swing.JMenuItem();
        popupItemPauseSong = new javax.swing.JMenuItem();
        panelSearch = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        panelMain = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstPlayList = new javax.swing.JList();
        btnAddSong = new javax.swing.JButton();
        btnDeleteSong = new javax.swing.JButton();
        btnSelectPrev = new javax.swing.JButton();
        btnSelectNext = new javax.swing.JButton();
        jSeparator = new javax.swing.JSeparator();
        tglbtnVolume = new javax.swing.JToggleButton();
        sliderVolume = new javax.swing.JSlider();
        btnPauseSong = new javax.swing.JButton();
        btnPlaySong = new javax.swing.JButton();
        btnNextSong = new javax.swing.JButton();
        btnStopSong = new javax.swing.JButton();
        btnPrevSong = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        menuOpenPlaylist = new javax.swing.JMenuItem();
        menuSavePlaylist = new javax.swing.JMenuItem();
        menuSeparator = new javax.swing.JPopupMenu.Separator();
        menuExit = new javax.swing.JMenuItem();
        menuService = new javax.swing.JMenu();
        menuChangeSkin = new javax.swing.JMenu();
        menuSkin1 = new javax.swing.JMenuItem();
        menuSkin2 = new javax.swing.JMenuItem();
        menuSkin3 = new javax.swing.JMenuItem();
        menuSkin4 = new javax.swing.JMenuItem();

        fileChooser.setAcceptAllFileFilterUsed(false);
        fileChooser.setMultiSelectionEnabled(true);

        popupItemAddSong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/plus_16.png"))); // NOI18N
        popupItemAddSong.setText("Add song");
        popupItemAddSong.setToolTipText("");
        popupItemAddSong.setActionCommand("jMenuItem1");
        popupItemAddSong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popupItemAddSongActionPerformed(evt);
            }
        });
        popmenuPlayList.add(popupItemAddSong);

        popupItemDeleteSong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/remove_icon.png"))); // NOI18N
        popupItemDeleteSong.setText("Delete song");
        popupItemDeleteSong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popupItemDeleteSongActionPerformed(evt);
            }
        });
        popmenuPlayList.add(popupItemDeleteSong);
        popmenuPlayList.add(popupSeparator1);

        popupItemPlaySong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Play.png"))); // NOI18N
        popupItemPlaySong.setText("Play song");
        popupItemPlaySong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popupItemPlaySongActionPerformed(evt);
            }
        });
        popmenuPlayList.add(popupItemPlaySong);

        popupItemStopSong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/stop-red-icon.png"))); // NOI18N
        popupItemStopSong.setText("Stop song");
        popupItemStopSong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popupItemStopSongActionPerformed(evt);
            }
        });
        popmenuPlayList.add(popupItemStopSong);

        popupItemPauseSong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Pause-icon.png"))); // NOI18N
        popupItemPauseSong.setText("Pause song");
        popupItemPauseSong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popupItemPauseSongActionPerformed(evt);
            }
        });
        popmenuPlayList.add(popupItemPauseSong);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MP3");
        setName("frame"); // NOI18N
        setResizable(false);

        panelSearch.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search_16.png"))); // NOI18N
        btnSearch.setText("Find");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelSearchLayout = new javax.swing.GroupLayout(panelSearch);
        panelSearch.setLayout(panelSearchLayout);
        panelSearchLayout.setHorizontalGroup(
            panelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSearchLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(btnSearch)
                .addContainerGap())
        );
        panelSearchLayout.setVerticalGroup(
            panelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSearchLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSearch)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(16, 16, 16))
        );

        panelMain.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lstPlayList.setModel(mp3DefaultListModel);
        lstPlayList.setAutoscrolls(false);
        lstPlayList.setComponentPopupMenu(popmenuPlayList);
        lstPlayList.setName(""); // NOI18N
        lstPlayList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstPlayListMouseClicked(evt);
            }
        });
        lstPlayList.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lstPlayListKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(lstPlayList);
        lstPlayList.getAccessibleContext().setAccessibleDescription("");

        btnAddSong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/plus_16.png"))); // NOI18N
        btnAddSong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddSongActionPerformed(evt);
            }
        });

        btnDeleteSong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/remove_icon.png"))); // NOI18N
        btnDeleteSong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteSongActionPerformed(evt);
            }
        });

        btnSelectPrev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/arrow-up-icon.png"))); // NOI18N
        btnSelectPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectPrevActionPerformed(evt);
            }
        });

        btnSelectNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/arrow-down-icon.png"))); // NOI18N
        btnSelectNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectNextActionPerformed(evt);
            }
        });

        jSeparator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        tglbtnVolume.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/speaker.png"))); // NOI18N
        tglbtnVolume.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mute.png"))); // NOI18N
        tglbtnVolume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tglbtnVolumeActionPerformed(evt);
            }
        });

        sliderVolume.setMinorTickSpacing(5);
        sliderVolume.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderVolumeStateChanged(evt);
            }
        });

        btnPauseSong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Pause-icon.png"))); // NOI18N
        btnPauseSong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPauseSongActionPerformed(evt);
            }
        });

        btnPlaySong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Play.png"))); // NOI18N
        btnPlaySong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaySongActionPerformed(evt);
            }
        });

        btnNextSong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/next-icon.png"))); // NOI18N
        btnNextSong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextSongActionPerformed(evt);
            }
        });

        btnStopSong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/stop-red-icon.png"))); // NOI18N
        btnStopSong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStopSongActionPerformed(evt);
            }
        });

        btnPrevSong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/prev-icon.png"))); // NOI18N
        btnPrevSong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevSongActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMainLayout = new javax.swing.GroupLayout(panelMain);
        panelMain.setLayout(panelMainLayout);
        panelMainLayout.setHorizontalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addComponent(btnAddSong, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDeleteSong, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(btnSelectNext, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSelectPrev, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addComponent(tglbtnVolume, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelMainLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(btnPrevSong, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPlaySong, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPauseSong, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnStopSong, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNextSong, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(sliderVolume, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        panelMainLayout.setVerticalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAddSong, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSelectPrev, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSelectNext, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDeleteSong, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tglbtnVolume)
                    .addComponent(sliderVolume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNextSong, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(btnStopSong, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(btnPauseSong, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(btnPlaySong, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(btnPrevSong, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addContainerGap())
        );

        menuFile.setText("File");

        menuOpenPlaylist.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/open-icon.png"))); // NOI18N
        menuOpenPlaylist.setText("Open playlist...");
        menuOpenPlaylist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuOpenPlaylistActionPerformed(evt);
            }
        });
        menuFile.add(menuOpenPlaylist);

        menuSavePlaylist.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save_16.png"))); // NOI18N
        menuSavePlaylist.setText("Save playlist...");
        menuSavePlaylist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSavePlaylistActionPerformed(evt);
            }
        });
        menuFile.add(menuSavePlaylist);
        menuFile.add(menuSeparator);

        menuExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        menuExit.setText("Exit");
        menuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExitActionPerformed(evt);
            }
        });
        menuFile.add(menuExit);

        jMenuBar1.add(menuFile);

        menuService.setText("Service");

        menuChangeSkin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gear_16.png"))); // NOI18N
        menuChangeSkin.setText("Change skin");

        menuSkin1.setText("Skin1");
        menuSkin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSkin1ActionPerformed(evt);
            }
        });
        menuChangeSkin.add(menuSkin1);

        menuSkin2.setText("Skin2");
        menuSkin2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSkin2ActionPerformed(evt);
            }
        });
        menuChangeSkin.add(menuSkin2);

        menuSkin3.setText("Skin3");
        menuSkin3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSkin3ActionPerformed(evt);
            }
        });
        menuChangeSkin.add(menuSkin3);

        menuSkin4.setText("Skin4");
        menuSkin4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSkin4ActionPerformed(evt);
            }
        });
        menuChangeSkin.add(menuSkin4);

        menuService.add(menuChangeSkin);

        jMenuBar1.add(menuService);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuSkin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSkin1ActionPerformed
        Utils.SkinsWork.processingSkins("com.jtattoo.plaf.acryl.AcrylLookAndFeel", this);
    }//GEN-LAST:event_menuSkin1ActionPerformed

    private void menuSkin2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSkin2ActionPerformed
        Utils.SkinsWork.processingSkins("com.jtattoo.plaf.aero.AeroLookAndFeel", this);
    }//GEN-LAST:event_menuSkin2ActionPerformed

    private void menuSkin3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSkin3ActionPerformed
        Utils.SkinsWork.processingSkins("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel", this);
    }//GEN-LAST:event_menuSkin3ActionPerformed

    private void menuSkin4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSkin4ActionPerformed
        Utils.SkinsWork.processingSkins("com.jtattoo.plaf.graphite.GraphiteLookAndFeel", this);
    }//GEN-LAST:event_menuSkin4ActionPerformed

    private void btnAddSongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddSongActionPerformed
        FileUtils.addFileFilter(fileChooser, mp3FileFilter);
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File[] selectedfiles = fileChooser.getSelectedFiles();
            for (File file : selectedfiles) {
                MP3 mp3 = new MP3(file.getName(), file.getPath());
                mp3DefaultListModel.addElement(mp3);
            }
        }
    }//GEN-LAST:event_btnAddSongActionPerformed

    private void btnDeleteSongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteSongActionPerformed
        int[] selectedIndices = lstPlayList.getSelectedIndices();
        if (selectedIndices.length > 0) {
            ArrayList<MP3> remotePosition = new ArrayList<MP3>();
            for (int i = 0; i < selectedIndices.length; i++) {
                Object obj = mp3DefaultListModel.elementAt(selectedIndices[i]);
                if (!(obj instanceof MP3)) {
                    continue;
                }
                MP3 mp3 = (MP3) mp3DefaultListModel.elementAt(selectedIndices[i]);
                remotePosition.add(mp3);
            }

            for (MP3 mp3 : remotePosition) {
                mp3DefaultListModel.removeElement(mp3);
            }

        }
    }//GEN-LAST:event_btnDeleteSongActionPerformed

    private void btnSelectNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectNextActionPerformed
        int selectedIndex = lstPlayList.getSelectedIndex();
        int listSize = lstPlayList.getModel().getSize();
        if (selectedIndex < 0 || listSize <= 0) {
            return;
        }
        selectedIndex++;
        if (selectedIndex < listSize) {
            lstPlayList.setSelectedIndex(selectedIndex);
        }
        else if (selectedIndex >= listSize) {
            lstPlayList.setSelectedIndex(0);
        }
    }//GEN-LAST:event_btnSelectNextActionPerformed

    private void btnSelectPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectPrevActionPerformed
        int selectedIndex = lstPlayList.getSelectedIndex();
        int listSize = lstPlayList.getModel().getSize();
        if (selectedIndex < 0 || listSize <= 0) {
            return;
        }
        selectedIndex--;
        if (selectedIndex >= 0) {
            lstPlayList.setSelectedIndex(selectedIndex);
        }
        else if (selectedIndex < 0) {
            lstPlayList.setSelectedIndex(listSize - 1);
        }
    }//GEN-LAST:event_btnSelectPrevActionPerformed

    private void btnPlaySongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaySongActionPerformed
        int selectedIndex = lstPlayList.getSelectedIndex();
        if (selectedIndex < 0) {
            return;
        }
        Object object = lstPlayList.getModel().getElementAt(selectedIndex);
        if ((object instanceof MP3)) {
            MP3 mp3 = (MP3) object;
            player.play(mp3, this);
        }
    }//GEN-LAST:event_btnPlaySongActionPerformed

    private void menuSavePlaylistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSavePlaylistActionPerformed

        FileUtils.addFileFilter(fileChooser, playListFileFilter);
        int result = fileChooser.showSaveDialog(this);
        if (result != JFileChooser.APPROVE_OPTION) {
            return;
        }
        File file = fileChooser.getSelectedFile();
        if (file.exists()) {
            int confirmResult = JOptionPane.showConfirmDialog(this, "File exist", "Continue?", JOptionPane.YES_NO_CANCEL_OPTION);
            switch (confirmResult) {
                case JOptionPane.NO_OPTION:
                    menuSavePlaylistActionPerformed(evt);
                    return;
                case JOptionPane.CANCEL_OPTION:
                    fileChooser.cancelSelection();
                    return;
            }
            fileChooser.approveSelection();
        }
        String fileExtention = FileUtils.getFileExtension(file);
        String fileNameForSave = (fileExtention != null && PLAYLIST_FILE_EXTENSION.equals(fileExtention)) ? file.getPath() : file.getPath() + "." + PLAYLIST_FILE_EXTENSION;
        FileUtils.Serializable(mp3DefaultListModel, fileNameForSave);

    }//GEN-LAST:event_menuSavePlaylistActionPerformed

    private void menuOpenPlaylistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuOpenPlaylistActionPerformed

        FileUtils.addFileFilter(fileChooser, playListFileFilter);
        int result = fileChooser.showOpenDialog(this);
        if (result != JFileChooser.APPROVE_OPTION) {
            return;
        }
        File file = fileChooser.getSelectedFile();
        if (!file.exists()) {
            return;
        }
        Object object = FileUtils.Deserializable(file.getPath());
        if (object instanceof DefaultListModel) {
            MP3Player.mp3DefaultListModel = (DefaultListModel) object;
            lstPlayList.setModel(mp3DefaultListModel);
        }
    }//GEN-LAST:event_menuOpenPlaylistActionPerformed

    private void menuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuExitActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String searchText = txtSearch.getText();
        if (searchText.isEmpty()) {
            return;
        }
        ArrayList<Integer> selectedIndices = new ArrayList<Integer>();
        for (int i = 0; i < mp3DefaultListModel.size(); i++) {
            Object object = mp3DefaultListModel.getElementAt(i);
            if (!(object instanceof MP3)) {
                continue;
            }
            MP3 mp3 = (MP3) mp3DefaultListModel.getElementAt(i);
            String fileName = mp3.getName();

            if (fileName.toLowerCase().contains(searchText.toLowerCase())) {
                selectedIndices.add(i);
            }

        }
        if (selectedIndices.size() <= 0) {
            txtSearch.requestFocus();
            txtSearch.selectAll();
        }
        int[] arr = new int[selectedIndices.size()];
        for (int i = 0; i < selectedIndices.size(); i++) {
            arr[i] = selectedIndices.get(i);
        }
        lstPlayList.setSelectedIndices(arr);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void sliderVolumeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderVolumeStateChanged
        if (sliderVolume.getValue() == 0) {
            tglbtnVolume.setSelected(true);
        }
        else {
            tglbtnVolume.setSelected(false);
        }
        player.setVolume(sliderVolume.getValue(), sliderVolume.getMaximum());
    }//GEN-LAST:event_sliderVolumeStateChanged

    private void tglbtnVolumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tglbtnVolumeActionPerformed
        if (tglbtnVolume.isSelected()) {
            currentVolumeValue = sliderVolume.getValue();
            sliderVolume.setValue(0);
        }
        else {
            sliderVolume.setValue(currentVolumeValue);
        }
    }//GEN-LAST:event_tglbtnVolumeActionPerformed

    private void btnPauseSongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPauseSongActionPerformed
        player.pause();
    }//GEN-LAST:event_btnPauseSongActionPerformed

    private void btnPrevSongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevSongActionPerformed
        btnSelectPrevActionPerformed(evt);
        btnPlaySongActionPerformed(evt);
    }//GEN-LAST:event_btnPrevSongActionPerformed

    private void btnNextSongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextSongActionPerformed
        btnSelectNextActionPerformed(evt);
        btnPlaySongActionPerformed(evt);
    }//GEN-LAST:event_btnNextSongActionPerformed

    private void btnStopSongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStopSongActionPerformed
        player.stop();
    }//GEN-LAST:event_btnStopSongActionPerformed

    private void lstPlayListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstPlayListMouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1 && evt.getClickCount() == 2) {
            btnPlaySongActionPerformed(null);
        }
        
    }//GEN-LAST:event_lstPlayListMouseClicked

    private void lstPlayListKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lstPlayListKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnPlaySongActionPerformed(null);
        }
    }//GEN-LAST:event_lstPlayListKeyPressed

    private void popupItemAddSongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popupItemAddSongActionPerformed
        btnAddSongActionPerformed(evt);
    }//GEN-LAST:event_popupItemAddSongActionPerformed

    private void popupItemDeleteSongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popupItemDeleteSongActionPerformed
        btnDeleteSongActionPerformed(evt);
    }//GEN-LAST:event_popupItemDeleteSongActionPerformed

    private void popupItemPlaySongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popupItemPlaySongActionPerformed
        btnPlaySongActionPerformed(evt);
    }//GEN-LAST:event_popupItemPlaySongActionPerformed

    private void popupItemStopSongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popupItemStopSongActionPerformed
        btnStopSongActionPerformed(evt);
    }//GEN-LAST:event_popupItemStopSongActionPerformed

    private void popupItemPauseSongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popupItemPauseSongActionPerformed
        btnPauseSongActionPerformed(evt);
    }//GEN-LAST:event_popupItemPauseSongActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MP3Player.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MP3Player.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MP3Player.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MP3Player.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MP3Player().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddSong;
    private javax.swing.JButton btnDeleteSong;
    private javax.swing.JButton btnNextSong;
    private javax.swing.JButton btnPauseSong;
    private javax.swing.JButton btnPlaySong;
    private javax.swing.JButton btnPrevSong;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSelectNext;
    private javax.swing.JButton btnSelectPrev;
    private javax.swing.JButton btnStopSong;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator;
    private javax.swing.JList lstPlayList;
    private javax.swing.JMenu menuChangeSkin;
    private javax.swing.JMenuItem menuExit;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenuItem menuOpenPlaylist;
    private javax.swing.JMenuItem menuSavePlaylist;
    private javax.swing.JPopupMenu.Separator menuSeparator;
    private javax.swing.JMenu menuService;
    private javax.swing.JMenuItem menuSkin1;
    private javax.swing.JMenuItem menuSkin2;
    private javax.swing.JMenuItem menuSkin3;
    private javax.swing.JMenuItem menuSkin4;
    private javax.swing.JPanel panelMain;
    private javax.swing.JPanel panelSearch;
    private javax.swing.JPopupMenu popmenuPlayList;
    private javax.swing.JMenuItem popupItemAddSong;
    private javax.swing.JMenuItem popupItemDeleteSong;
    private javax.swing.JMenuItem popupItemPauseSong;
    private javax.swing.JMenuItem popupItemPlaySong;
    private javax.swing.JMenuItem popupItemStopSong;
    private javax.swing.JPopupMenu.Separator popupSeparator1;
    private javax.swing.JSlider sliderVolume;
    private javax.swing.JToggleButton tglbtnVolume;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
