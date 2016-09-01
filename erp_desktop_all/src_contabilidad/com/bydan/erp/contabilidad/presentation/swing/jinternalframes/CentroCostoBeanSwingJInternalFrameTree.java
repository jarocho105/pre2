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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes;

import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.PerfilOpcion;
import com.bydan.erp.seguridad.business.entity.PerfilCampo;
import com.bydan.erp.seguridad.business.entity.PerfilAccion;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;
import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;

import com.bydan.framework.erp.util.*;
import com.bydan.erp.contabilidad.util.CentroCostoConstantesFunciones;
import com.bydan.erp.contabilidad.business.entity.CentroCosto;

import com.bydan.erp.contabilidad.business.logic.*;


//import com.bydan.erp.contabilidad.business.entity.*;
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
public class CentroCostoBeanSwingJInternalFrameTree extends JInternalFrameBase implements TreeSelectionListener,TreeModelListener  //CentroCostoBeanSwingJInternalFrame
{
	private static final long serialVersionUID = 1L;
	
	
	//CONTROL_INICIO
	protected JPanel jPanelTreeCentroCosto;
	public JScrollPane jScrollPaneDatosGeneralCentroCosto;
	public JScrollPane jScrollPaneTreeCentroCosto;
	private JTree treeCentroCosto;
	protected GridBagConstraints gridBagConstraintsCentroCosto;	
	protected DefaultMutableTreeNode defaultMutableTreeNode;
	protected DefaultTreeModel defaultTreeModel;
	
	protected List<CentroCosto> centrocostos;	
	CentroCostoLogic centrocostoLogic;
	CentroCostoLogicAdditional centrocostoLogicAdditional;
	Mensaje mensaje;
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	
	public  CentroCostoBeanSwingJInternalFrameTree(PaginaTipo paginaTipo) throws Exception
	{
		super(paginaTipo);
		try 
		{			
			this.centrocostos= new ArrayList<CentroCosto>();
			
			centrocostoLogic=new CentroCostoLogic();
			centrocostoLogicAdditional=new CentroCostoLogicAdditional();
			
			this.initialize();
		} 		
		catch(Exception e)
		{
			throw e;
		}
    } 	
	
	//CONTROL_FUNCION1
	
	public List<CentroCosto> getCentroCostos() throws Exception {			
		return this.centrocostos;
	}
	
	public void setCentroCostos(List<CentroCosto> newCentroCostos) {
		this.centrocostos = newCentroCostos;
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
        //this.CargarTreeCentroCosto(defaultMutableTreeNode);
 
		this.defaultTreeModel = new DefaultTreeModel(this.defaultMutableTreeNode);
		this.defaultTreeModel.addTreeModelListener(this);
	
        //Create a tree that allows one selection at a time.
        this.treeCentroCosto = new JTree(defaultTreeModel);//(defaultMutableTreeNode);
		
		this.treeCentroCosto.setMinimumSize(new Dimension(iWidth,iHeight));
		this.treeCentroCosto.setMaximumSize(new Dimension(iWidth,iHeight));
		this.treeCentroCosto.setPreferredSize(new Dimension(iWidth,iHeight));
		
        this.treeCentroCosto.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
 
        //Listen for when the selection changes.
        this.treeCentroCosto.addTreeSelectionListener(this);
		
		this.jScrollPaneTreeCentroCosto = new JScrollPane(this.treeCentroCosto);
		
		this.jScrollPaneTreeCentroCosto.setMinimumSize(new Dimension(iWidth,iHeight));
		this.jScrollPaneTreeCentroCosto.setMaximumSize(new Dimension(iWidth,iHeight));
		this.jScrollPaneTreeCentroCosto.setPreferredSize(new Dimension(iWidth,iHeight));
		
		this.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jPanelTreeCentroCosto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jScrollPaneDatosGeneralCentroCosto = new JScrollPane();		                 
						       	
		//MUCHOS TITULOS
		//this.jPanelTreeCentroCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("ARBOL"));
        this.jPanelTreeCentroCosto.setToolTipText("ARBOL");
        this.jPanelTreeCentroCosto.setName("ARBOL"); 
		
		GridBagLayout gridaBagLayoutPrincipalCentroCosto = new GridBagLayout();		
		this.getContentPane().setLayout(gridaBagLayoutPrincipalCentroCosto);
		
		GridBagLayout gridaBagLayoutTreeCentroCosto= new GridBagLayout();
		this.jPanelTreeCentroCosto.setLayout(gridaBagLayoutTreeCentroCosto);
		
		this.gridBagConstraintsCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsCentroCosto.gridy = 0;		
		this.gridBagConstraintsCentroCosto.gridx =0;
		
		this.jPanelTreeCentroCosto.add(this.jScrollPaneTreeCentroCosto, this.gridBagConstraintsCentroCosto);
		
		
		this.gridBagConstraintsCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsCentroCosto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCentroCosto.gridx = 0;
		//this.gridBagConstraintsCentroCosto.fill =GridBagConstraints.BOTH;
		//this.gridBagConstraintsCentroCosto.anchor=GridBagConstraints.NORTH;
		
		this.getContentPane().add(this.jPanelTreeCentroCosto, this.gridBagConstraintsCentroCosto);
		
		
		this.jScrollPaneDatosGeneralCentroCosto=   new JScrollPane(this.getContentPane(),JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
		this.jScrollPaneTreeCentroCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("ARBOL Centro Costos"));		
		//MUCHOS TITULOS
		//this.jScrollPaneDatosGeneralCentroCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("DATOS"));
		
		this.jScrollPaneDatosGeneralCentroCosto.setMinimumSize(new Dimension(iWidth,iHeight));
		this.jScrollPaneDatosGeneralCentroCosto.setMaximumSize(new Dimension(iWidth,iHeight));
		this.jScrollPaneDatosGeneralCentroCosto.setPreferredSize(new Dimension(iWidth,iHeight));
			
		return this.jScrollPaneDatosGeneralCentroCosto;
	}
		
	public void CargarTreeCentroCosto() {
		//this.defaultMutableTreeNode = new DefaultMutableTreeNode("Arbol");
		
		//INICIALIZA
		this.defaultMutableTreeNode.removeAllChildren();
		
		this.CargarTreeCentroCosto(this.defaultMutableTreeNode);
	}
	
	public void CargarTreeCentroCosto(DefaultMutableTreeNode defaultMutableTreeNodeTree) {
		DefaultMutableTreeNode defaultMutableTreeNodeRootCentroCosto = null;
        DefaultMutableTreeNode defaultMutableTreeNodeCentroCosto = null;
 
        defaultMutableTreeNodeRootCentroCosto = new DefaultMutableTreeNode("Centro CostoS");
        defaultMutableTreeNodeTree.add(defaultMutableTreeNodeRootCentroCosto);
		
		ArrayList<CentroCosto> centrocostosPrimerNivel=this.getPrimerNivelCentroCostos();
		ArrayList<CentroCosto> centrocostosHijos=new ArrayList<CentroCosto>();
		
		for(CentroCosto centrocosto:centrocostosPrimerNivel){//centrocostos) {
			defaultMutableTreeNodeCentroCosto = new DefaultMutableTreeNode(centrocosto);
			
			centrocostosHijos=this.getHijosCentroCosto(centrocosto);
			
			if(centrocostosHijos.size()>0) {
				this.setHijosArbolCentroCosto(centrocostosHijos,defaultMutableTreeNodeCentroCosto);
			}
			
			defaultMutableTreeNodeRootCentroCosto.add(defaultMutableTreeNodeCentroCosto);
		}
	}	
	
	public void setHijosArbolCentroCosto(ArrayList<CentroCosto> centrocostosAux,DefaultMutableTreeNode defaultMutableTreeNodeCentroCostoPadre) {
		ArrayList<CentroCosto> centrocostosHijos=new ArrayList<CentroCosto>();
		DefaultMutableTreeNode defaultMutableTreeNodeCentroCosto = null;
				 
		for(CentroCosto centrocosto:centrocostosAux) {
			defaultMutableTreeNodeCentroCosto = new DefaultMutableTreeNode(centrocosto);
			
			centrocostosHijos=this.getHijosCentroCosto(centrocosto);
			
			if(centrocostosHijos.size()>0) {
				this.setHijosArbolCentroCosto(centrocostosHijos,defaultMutableTreeNodeCentroCosto);
			}
			
			defaultMutableTreeNodeCentroCostoPadre.add(defaultMutableTreeNodeCentroCosto);
		}
	}
	
	public ArrayList<CentroCosto> getHijosCentroCosto(CentroCosto centrocostoPadre) {
		ArrayList<CentroCosto> centrocostosAux=new ArrayList<CentroCosto>();
		
		for(CentroCosto centrocosto:centrocostos) {
			if(centrocosto.getid_centro_costo()!=null && centrocosto.getid_centro_costo().equals(centrocostoPadre.getId())) {
				centrocostosAux.add(centrocosto);
			}
		}
		return centrocostosAux;
	}
	
	public ArrayList<CentroCosto> getPrimerNivelCentroCostos() {
		ArrayList<CentroCosto> centrocostosAux=new ArrayList<CentroCosto>();
		
		for(CentroCosto centrocosto:centrocostos) {
			if(centrocosto.getid_centro_costo()==null || centrocosto.getid_centro_costo()<=0) {
				centrocostosAux.add(centrocosto);
			}
		}
		return centrocostosAux;
	}
	
	public void CargarTreeCentroCostoTest(DefaultMutableTreeNode defaultMutableTreeNodeTree) {
		DefaultMutableTreeNode defaultMutableTreeNodeRootCentroCosto = null;
        DefaultMutableTreeNode defaultMutableTreeNodeCentroCosto = null;
 
        defaultMutableTreeNodeRootCentroCosto = new DefaultMutableTreeNode("Root Arbol");
        defaultMutableTreeNodeTree.add(defaultMutableTreeNodeRootCentroCosto);
		
		for(int i=0;i<10;i++) {
			defaultMutableTreeNodeCentroCosto = new DefaultMutableTreeNode(i);
				
			defaultMutableTreeNodeRootCentroCosto.add(defaultMutableTreeNodeCentroCosto);
		}
		
		//NO NECESARIO
		//this.defaultTreeModel.reload();
	}	
	
	public void valueChanged(TreeSelectionEvent e) {
        DefaultMutableTreeNode defaultMutableTreeNode = (DefaultMutableTreeNode)this.treeCentroCosto.getLastSelectedPathComponent();
 
        if (defaultMutableTreeNode == null) return;
 
        Object userObject = defaultMutableTreeNode.getUserObject();
		
		CentroCosto centrocosto = (CentroCosto)userObject;
           
        if (defaultMutableTreeNode.isLeaf()) {
            //displayURL(book.bookURL);
            System.out.print(centrocosto.getId() + ":  \n    ");            
        } else {
            
        }
        
		//this.jInternalFrameParent.setIdActual(centrocosto.getId());
		
		try {
			//this.jInternalFrameParent.procesarBusqueda("PorId");
			if(this.getsTipoProceso().equals("BUSQUEDA_NORMAL")) {
				this.jInternalFrameParent.buscarPorId(centrocosto.getId());			
			} else if(this.getsTipoProceso().equals("BUSQUEDA_FK")) {
				this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(centrocosto.getId(),this.sTipoBusqueda);			
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
        TreePath currentSelection = this.treeCentroCosto.getSelectionPath();
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
        TreePath parentPath = this.treeCentroCosto.getSelectionPath();

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
            this.treeCentroCosto.scrollPathToVisible(new TreePath(childNode.getPath()));
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

