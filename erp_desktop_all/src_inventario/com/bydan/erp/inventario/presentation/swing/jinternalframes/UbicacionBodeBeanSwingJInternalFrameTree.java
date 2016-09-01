/*
*AVISO LEGAL
© Copyright
*Este programa esta protegido por la ley de derechos de autor.
*La reproduccion o distribucion ilicita de este programa o de cualquiera de
*sus partes esta penado por la ley con severas sanciones civiles y penales,
*y seran objeto de todas las sanciones legales que correspondan.

*Su contenido no puede copiarse para fines comerciales o de otras,
*ni puede mostrarse, incluso en una version modificada, en otros sitios Web.
Solo esta permitido colocar hipervinculos al sitio web.
*/
package com.bydan.erp.inventario.presentation.swing.jinternalframes;

import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.PerfilOpcion;
import com.bydan.erp.seguridad.business.entity.PerfilCampo;
import com.bydan.erp.seguridad.business.entity.PerfilAccion;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;
import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;

import com.bydan.framework.erp.util.*;
import com.bydan.erp.inventario.util.UbicacionBodeConstantesFunciones;
import com.bydan.erp.inventario.business.entity.UbicacionBode;

import com.bydan.erp.inventario.business.logic.*;


//import com.bydan.erp.inventario.business.entity.*;
//import com.bydan.framework.erp.business.logic.QueryWhereSelectParameters;
//import com.bydan.framework.erp.business.logic.*;

//import java.util.ArrayList;

import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.GroupLayout.Alignment;

//import org.hibernate.collection.PersistentBag;

import com.bydan.framework.erp.presentation.desktop.swing.JInternalFrameBase;
import com.bydan.framework.erp.presentation.desktop.swing.FuncionesSwing;
import com.bydan.framework.erp.presentation.desktop.swing.*;

import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeModel;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeSelectionModel;
import javax.swing.tree.TreePath;
import javax.swing.tree.MutableTreeNode;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;


import com.bydan.framework.erp.business.entity.DatoGeneral;
import com.bydan.framework.erp.business.entity.GeneralEntityParameterGeneral;
import com.bydan.framework.erp.business.entity.GeneralEntityReturnGeneral;


//import javax.servlet.http.HttpSession;
//import javax.servlet.ServletConfig;

//CONTROL_INCLUDE

@SuppressWarnings("unused")
public class UbicacionBodeBeanSwingJInternalFrameTree extends JInternalFrameBase implements TreeSelectionListener,TreeModelListener  //UbicacionBodeBeanSwingJInternalFrame
{
	private static final long serialVersionUID = 1L;
	
	
	//CONTROL_INICIO
	protected JPanel jPanelTreeUbicacionBode;
	public JScrollPane jScrollPaneDatosGeneralUbicacionBode;
	public JScrollPane jScrollPaneTreeUbicacionBode;
	private JTree treeUbicacionBode;
	protected GridBagConstraints gridBagConstraintsUbicacionBode;	
	protected DefaultMutableTreeNode defaultMutableTreeNode;
	protected DefaultTreeModel defaultTreeModel;
	
	protected List<UbicacionBode> ubicacionbodes;	
	UbicacionBodeLogic ubicacionbodeLogic;
	UbicacionBodeLogicAdditional ubicacionbodeLogicAdditional;
	Mensaje mensaje;
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	
	public  UbicacionBodeBeanSwingJInternalFrameTree(PaginaTipo paginaTipo) throws Exception
	{
		super(paginaTipo);
		try 
		{			
			this.ubicacionbodes= new ArrayList<UbicacionBode>();
			
			ubicacionbodeLogic=new UbicacionBodeLogic();
			ubicacionbodeLogicAdditional=new UbicacionBodeLogicAdditional();
			
			this.initialize();
		} 		
		catch(Exception e)
		{
			throw e;
		}
    } 	
	
	//CONTROL_FUNCION1
	
	public List<UbicacionBode> getUbicacionBodes() throws Exception {			
		return this.ubicacionbodes;
	}
	
	public void setUbicacionBodes(List<UbicacionBode> newUbicacionBodes) {
		this.ubicacionbodes = newUbicacionBodes;
	}
	
	private void initialize() throws Exception {	
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
			
		int iWidth=(screenSize.width-screenSize.width/3);
		int iHeight=(screenSize.height-screenSize.height/2);		
		
		this.setSize(iWidth,iHeight);
		
		this.setContentPane(this.getJContentPane(iWidth,iHeight));
	
		this.setResizable(true);
	    this.setClosable(true);
	    this.setMaximizable(true);
	    this.iconable=true;
		
		this.setLocation(xOffset*openFrameCount, yOffset*openFrameCount);
		
		if(Constantes.CON_VARIAS_VENTANAS) {
			openFrameCount++;
			
			if(openFrameCount==Constantes.INUM_MAX_VENTANAS) {
				openFrameCount=0;
			}
		}
	
	}
	
	public JScrollPane getJContentPane(int iWidth,int iHeight) throws Exception {	
		int iGridyPrincipal=0;
		
		this.defaultMutableTreeNode = new DefaultMutableTreeNode("ARBOL");
        //this.CargarTreeUbicacionBode(defaultMutableTreeNode);
 
		this.defaultTreeModel = new DefaultTreeModel(this.defaultMutableTreeNode);
		this.defaultTreeModel.addTreeModelListener(this);
	
        //Create a tree that allows one selection at a time.
        this.treeUbicacionBode = new JTree(defaultTreeModel);//(defaultMutableTreeNode);
		
		this.treeUbicacionBode.setMinimumSize(new Dimension(iWidth,iHeight));
		this.treeUbicacionBode.setMaximumSize(new Dimension(iWidth,iHeight));
		this.treeUbicacionBode.setPreferredSize(new Dimension(iWidth,iHeight));
		
        this.treeUbicacionBode.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
 
        //Listen for when the selection changes.
        this.treeUbicacionBode.addTreeSelectionListener(this);
		
		this.jScrollPaneTreeUbicacionBode = new JScrollPane(this.treeUbicacionBode);
		
		this.jScrollPaneTreeUbicacionBode.setMinimumSize(new Dimension(iWidth,iHeight));
		this.jScrollPaneTreeUbicacionBode.setMaximumSize(new Dimension(iWidth,iHeight));
		this.jScrollPaneTreeUbicacionBode.setPreferredSize(new Dimension(iWidth,iHeight));
		
		this.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jPanelTreeUbicacionBode = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jScrollPaneDatosGeneralUbicacionBode = new JScrollPane();		                 
						       	
		//MUCHOS TITULOS
		//this.jPanelTreeUbicacionBode.setBorder(javax.swing.BorderFactory.createTitledBorder("ARBOL"));
        this.jPanelTreeUbicacionBode.setToolTipText("ARBOL");
        this.jPanelTreeUbicacionBode.setName("ARBOL"); 
		
		GridBagLayout gridaBagLayoutPrincipalUbicacionBode = new GridBagLayout();		
		this.getContentPane().setLayout(gridaBagLayoutPrincipalUbicacionBode);
		
		GridBagLayout gridaBagLayoutTreeUbicacionBode= new GridBagLayout();
		this.jPanelTreeUbicacionBode.setLayout(gridaBagLayoutTreeUbicacionBode);
		
		this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
		this.gridBagConstraintsUbicacionBode.gridy = 0;		
		this.gridBagConstraintsUbicacionBode.gridx =0;
		
		this.jPanelTreeUbicacionBode.add(this.jScrollPaneTreeUbicacionBode, this.gridBagConstraintsUbicacionBode);
		
		
		this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
		this.gridBagConstraintsUbicacionBode.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsUbicacionBode.gridx = 0;
		//this.gridBagConstraintsUbicacionBode.fill =GridBagConstraints.BOTH;
		//this.gridBagConstraintsUbicacionBode.anchor=GridBagConstraints.NORTH;
		
		this.getContentPane().add(this.jPanelTreeUbicacionBode, this.gridBagConstraintsUbicacionBode);
		
		
		this.jScrollPaneDatosGeneralUbicacionBode=   new JScrollPane(this.getContentPane(),JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
		this.jScrollPaneTreeUbicacionBode.setBorder(javax.swing.BorderFactory.createTitledBorder("ARBOL Ubicacion Bodes"));		
		//MUCHOS TITULOS
		//this.jScrollPaneDatosGeneralUbicacionBode.setBorder(javax.swing.BorderFactory.createTitledBorder("DATOS"));
		
		this.jScrollPaneDatosGeneralUbicacionBode.setMinimumSize(new Dimension(iWidth,iHeight));
		this.jScrollPaneDatosGeneralUbicacionBode.setMaximumSize(new Dimension(iWidth,iHeight));
		this.jScrollPaneDatosGeneralUbicacionBode.setPreferredSize(new Dimension(iWidth,iHeight));
			
		return this.jScrollPaneDatosGeneralUbicacionBode;
	}
		
	public void CargarTreeUbicacionBode() {
		//this.defaultMutableTreeNode = new DefaultMutableTreeNode("Arbol");
		
		//INICIALIZA
		this.defaultMutableTreeNode.removeAllChildren();
		
		this.CargarTreeUbicacionBode(this.defaultMutableTreeNode);
	}
	
	public void CargarTreeUbicacionBode(DefaultMutableTreeNode defaultMutableTreeNodeTree) {
		DefaultMutableTreeNode defaultMutableTreeNodeRootUbicacionBode = null;
        DefaultMutableTreeNode defaultMutableTreeNodeUbicacionBode = null;
 
        defaultMutableTreeNodeRootUbicacionBode = new DefaultMutableTreeNode("Ubicacion BodeS");
        defaultMutableTreeNodeTree.add(defaultMutableTreeNodeRootUbicacionBode);
		
		ArrayList<UbicacionBode> ubicacionbodesPrimerNivel=this.getPrimerNivelUbicacionBodes();
		ArrayList<UbicacionBode> ubicacionbodesHijos=new ArrayList<UbicacionBode>();
		
		for(UbicacionBode ubicacionbode:ubicacionbodesPrimerNivel){//ubicacionbodes) {
			defaultMutableTreeNodeUbicacionBode = new DefaultMutableTreeNode(ubicacionbode);
			
			ubicacionbodesHijos=this.getHijosUbicacionBode(ubicacionbode);
			
			if(ubicacionbodesHijos.size()>0) {
				this.setHijosArbolUbicacionBode(ubicacionbodesHijos,defaultMutableTreeNodeUbicacionBode);
			}
			
			defaultMutableTreeNodeRootUbicacionBode.add(defaultMutableTreeNodeUbicacionBode);
		}
	}	
	
	public void setHijosArbolUbicacionBode(ArrayList<UbicacionBode> ubicacionbodesAux,DefaultMutableTreeNode defaultMutableTreeNodeUbicacionBodePadre) {
		ArrayList<UbicacionBode> ubicacionbodesHijos=new ArrayList<UbicacionBode>();
		DefaultMutableTreeNode defaultMutableTreeNodeUbicacionBode = null;
				 
		for(UbicacionBode ubicacionbode:ubicacionbodesAux) {
			defaultMutableTreeNodeUbicacionBode = new DefaultMutableTreeNode(ubicacionbode);
			
			ubicacionbodesHijos=this.getHijosUbicacionBode(ubicacionbode);
			
			if(ubicacionbodesHijos.size()>0) {
				this.setHijosArbolUbicacionBode(ubicacionbodesHijos,defaultMutableTreeNodeUbicacionBode);
			}
			
			defaultMutableTreeNodeUbicacionBodePadre.add(defaultMutableTreeNodeUbicacionBode);
		}
	}
	
	public ArrayList<UbicacionBode> getHijosUbicacionBode(UbicacionBode ubicacionbodePadre) {
		ArrayList<UbicacionBode> ubicacionbodesAux=new ArrayList<UbicacionBode>();
		
		for(UbicacionBode ubicacionbode:ubicacionbodes) {
			if(ubicacionbode.getid_ubicacion_bode()!=null && ubicacionbode.getid_ubicacion_bode().equals(ubicacionbodePadre.getId())) {
				ubicacionbodesAux.add(ubicacionbode);
			}
		}
		return ubicacionbodesAux;
	}
	
	public ArrayList<UbicacionBode> getPrimerNivelUbicacionBodes() {
		ArrayList<UbicacionBode> ubicacionbodesAux=new ArrayList<UbicacionBode>();
		
		for(UbicacionBode ubicacionbode:ubicacionbodes) {
			if(ubicacionbode.getid_ubicacion_bode()==null || ubicacionbode.getid_ubicacion_bode()<=0) {
				ubicacionbodesAux.add(ubicacionbode);
			}
		}
		return ubicacionbodesAux;
	}
	
	public void CargarTreeUbicacionBodeTest(DefaultMutableTreeNode defaultMutableTreeNodeTree) {
		DefaultMutableTreeNode defaultMutableTreeNodeRootUbicacionBode = null;
        DefaultMutableTreeNode defaultMutableTreeNodeUbicacionBode = null;
 
        defaultMutableTreeNodeRootUbicacionBode = new DefaultMutableTreeNode("Root Arbol");
        defaultMutableTreeNodeTree.add(defaultMutableTreeNodeRootUbicacionBode);
		
		for(int i=0;i<10;i++) {
			defaultMutableTreeNodeUbicacionBode = new DefaultMutableTreeNode(i);
				
			defaultMutableTreeNodeRootUbicacionBode.add(defaultMutableTreeNodeUbicacionBode);
		}
		
		//NO NECESARIO
		//this.defaultTreeModel.reload();
	}	
	
	public void valueChanged(TreeSelectionEvent e) {
        DefaultMutableTreeNode defaultMutableTreeNode = (DefaultMutableTreeNode)this.treeUbicacionBode.getLastSelectedPathComponent();
 
        if (defaultMutableTreeNode == null) return;
 
        Object userObject = defaultMutableTreeNode.getUserObject();
		
		UbicacionBode ubicacionbode = (UbicacionBode)userObject;
           
        if (defaultMutableTreeNode.isLeaf()) {
            //displayURL(book.bookURL);
            System.out.print(ubicacionbode.getId() + ":  \n    ");            
        } else {
            
        }
        
		//this.jInternalFrameParent.setIdActual(ubicacionbode.getId());
		
		try {
			//this.jInternalFrameParent.procesarBusqueda("PorId");
			if(this.getsTipoProceso().equals("BUSQUEDA_NORMAL")) {
				this.jInternalFrameParent.buscarPorId(ubicacionbode.getId());			
			} else if(this.getsTipoProceso().equals("BUSQUEDA_FK")) {
				this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(ubicacionbode.getId(),this.sTipoBusqueda);			
			}
			
			//CERRAR VENTANA
			//this.jDesktopPane.add(this);			
	       	this.setVisible(false);
	        this.setSelected(false);			
			//this.dispose();
			//this=null;
			
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		System.out.println(userObject.toString());        
    }
	
	 public void clear() {
        this.defaultMutableTreeNode.removeAllChildren();
        this.defaultTreeModel.reload();
    }

	/** Remove the currently selected node. */
    public void removeCurrentNode() {
        TreePath currentSelection = this.treeUbicacionBode.getSelectionPath();
        if (currentSelection != null) {
            DefaultMutableTreeNode currentNode = (DefaultMutableTreeNode)
                         (currentSelection.getLastPathComponent());
            MutableTreeNode parent = (MutableTreeNode)(currentNode.getParent());
            if (parent != null) {
                this.defaultTreeModel.removeNodeFromParent(currentNode);
                return;
            }
        } 

        // Either there was no selection, or the root was selected.
        //toolkit.beep();
    }

    /** Add child to the currently selected node. */
    public DefaultMutableTreeNode addObject(Object child) {
        DefaultMutableTreeNode parentNode = null;
        TreePath parentPath = this.treeUbicacionBode.getSelectionPath();

        if (parentPath == null) {
            parentNode = this.defaultMutableTreeNode;
        } else {
            parentNode = (DefaultMutableTreeNode)
                         (parentPath.getLastPathComponent());
        }

        return addObject(parentNode, child, true);
    }

    public DefaultMutableTreeNode addObject(DefaultMutableTreeNode parent,
                                            Object child) {
        return addObject(parent, child, false);
    }

    public DefaultMutableTreeNode addObject(DefaultMutableTreeNode parent,
                                            Object child, 
                                            boolean shouldBeVisible) {
        DefaultMutableTreeNode childNode = 
                new DefaultMutableTreeNode(child);

        if (parent == null) {
            parent = this.defaultMutableTreeNode;
        }
	
	//It is key to invoke this on the TreeModel, and NOT DefaultMutableTreeNode
        this.defaultTreeModel.insertNodeInto(childNode, parent, 
                                 parent.getChildCount());

        //Make sure the user can see the lovely new node.
        if (shouldBeVisible) {
            this.treeUbicacionBode.scrollPathToVisible(new TreePath(childNode.getPath()));
        }
        return childNode;
    }
	
	 public void treeNodesChanged(TreeModelEvent e) {
            DefaultMutableTreeNode node;
            node = (DefaultMutableTreeNode)(e.getTreePath().getLastPathComponent());

            /*
             * If the event lists children, then the changed
             * node is the child of the node we've already
             * gotten.  Otherwise, the changed node and the
             * specified node are the same.
             */

                int index = e.getChildIndices()[0];
                node = (DefaultMutableTreeNode)(node.getChildAt(index));

            System.out.println("The user has finished editing the node.");
            System.out.println("New value: " + node.getUserObject());
        }
        public void treeNodesInserted(TreeModelEvent e) {
        }
        public void treeNodesRemoved(TreeModelEvent e) {
        }
        public void treeStructureChanged(TreeModelEvent e) {
        }
		
	//CONTROL_FUNCION2
}

