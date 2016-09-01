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
import com.bydan.erp.inventario.util.LineaConstantesFunciones;
import com.bydan.erp.inventario.business.entity.Linea;

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
public class LineaBeanSwingJInternalFrameTree extends JInternalFrameBase implements TreeSelectionListener,TreeModelListener  //LineaBeanSwingJInternalFrame
{
	private static final long serialVersionUID = 1L;
	
	
	//CONTROL_INICIO
	protected JPanel jPanelTreeLinea;
	public JScrollPane jScrollPaneDatosGeneralLinea;
	public JScrollPane jScrollPaneTreeLinea;
	private JTree treeLinea;
	protected GridBagConstraints gridBagConstraintsLinea;	
	protected DefaultMutableTreeNode defaultMutableTreeNode;
	protected DefaultTreeModel defaultTreeModel;
	
	protected List<Linea> lineas;	
	LineaLogic lineaLogic;
	LineaLogicAdditional lineaLogicAdditional;
	Mensaje mensaje;
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	
	public  LineaBeanSwingJInternalFrameTree(PaginaTipo paginaTipo) throws Exception
	{
		super(paginaTipo);
		try 
		{			
			this.lineas= new ArrayList<Linea>();
			
			lineaLogic=new LineaLogic();
			lineaLogicAdditional=new LineaLogicAdditional();
			
			this.initialize();
		} 		
		catch(Exception e)
		{
			throw e;
		}
    } 	
	
	//CONTROL_FUNCION1
	
	public List<Linea> getLineas() throws Exception {			
		return this.lineas;
	}
	
	public void setLineas(List<Linea> newLineas) {
		this.lineas = newLineas;
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
        //this.CargarTreeLinea(defaultMutableTreeNode);
 
		this.defaultTreeModel = new DefaultTreeModel(this.defaultMutableTreeNode);
		this.defaultTreeModel.addTreeModelListener(this);
	
        //Create a tree that allows one selection at a time.
        this.treeLinea = new JTree(defaultTreeModel);//(defaultMutableTreeNode);
		
		this.treeLinea.setMinimumSize(new Dimension(iWidth,iHeight));
		this.treeLinea.setMaximumSize(new Dimension(iWidth,iHeight));
		this.treeLinea.setPreferredSize(new Dimension(iWidth,iHeight));
		
        this.treeLinea.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
 
        //Listen for when the selection changes.
        this.treeLinea.addTreeSelectionListener(this);
		
		this.jScrollPaneTreeLinea = new JScrollPane(this.treeLinea);
		
		this.jScrollPaneTreeLinea.setMinimumSize(new Dimension(iWidth,iHeight));
		this.jScrollPaneTreeLinea.setMaximumSize(new Dimension(iWidth,iHeight));
		this.jScrollPaneTreeLinea.setPreferredSize(new Dimension(iWidth,iHeight));
		
		this.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jPanelTreeLinea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jScrollPaneDatosGeneralLinea = new JScrollPane();		                 
						       	
		//MUCHOS TITULOS
		//this.jPanelTreeLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("ARBOL"));
        this.jPanelTreeLinea.setToolTipText("ARBOL");
        this.jPanelTreeLinea.setName("ARBOL"); 
		
		GridBagLayout gridaBagLayoutPrincipalLinea = new GridBagLayout();		
		this.getContentPane().setLayout(gridaBagLayoutPrincipalLinea);
		
		GridBagLayout gridaBagLayoutTreeLinea= new GridBagLayout();
		this.jPanelTreeLinea.setLayout(gridaBagLayoutTreeLinea);
		
		this.gridBagConstraintsLinea = new GridBagConstraints();
		this.gridBagConstraintsLinea.gridy = 0;		
		this.gridBagConstraintsLinea.gridx =0;
		
		this.jPanelTreeLinea.add(this.jScrollPaneTreeLinea, this.gridBagConstraintsLinea);
		
		
		this.gridBagConstraintsLinea = new GridBagConstraints();
		this.gridBagConstraintsLinea.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsLinea.gridx = 0;
		//this.gridBagConstraintsLinea.fill =GridBagConstraints.BOTH;
		//this.gridBagConstraintsLinea.anchor=GridBagConstraints.NORTH;
		
		this.getContentPane().add(this.jPanelTreeLinea, this.gridBagConstraintsLinea);
		
		
		this.jScrollPaneDatosGeneralLinea=   new JScrollPane(this.getContentPane(),JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
		this.jScrollPaneTreeLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("ARBOL Lineas"));		
		//MUCHOS TITULOS
		//this.jScrollPaneDatosGeneralLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("DATOS"));
		
		this.jScrollPaneDatosGeneralLinea.setMinimumSize(new Dimension(iWidth,iHeight));
		this.jScrollPaneDatosGeneralLinea.setMaximumSize(new Dimension(iWidth,iHeight));
		this.jScrollPaneDatosGeneralLinea.setPreferredSize(new Dimension(iWidth,iHeight));
			
		return this.jScrollPaneDatosGeneralLinea;
	}
		
	public void CargarTreeLinea() {
		//this.defaultMutableTreeNode = new DefaultMutableTreeNode("Arbol");
		
		//INICIALIZA
		this.defaultMutableTreeNode.removeAllChildren();
		
		this.CargarTreeLinea(this.defaultMutableTreeNode);
	}
	
	public void CargarTreeLinea(DefaultMutableTreeNode defaultMutableTreeNodeTree) {
		DefaultMutableTreeNode defaultMutableTreeNodeRootLinea = null;
        DefaultMutableTreeNode defaultMutableTreeNodeLinea = null;
 
        defaultMutableTreeNodeRootLinea = new DefaultMutableTreeNode("LineaS");
        defaultMutableTreeNodeTree.add(defaultMutableTreeNodeRootLinea);
		
		ArrayList<Linea> lineasPrimerNivel=this.getPrimerNivelLineas();
		ArrayList<Linea> lineasHijos=new ArrayList<Linea>();
		
		for(Linea linea:lineasPrimerNivel){//lineas) {
			defaultMutableTreeNodeLinea = new DefaultMutableTreeNode(linea);
			
			lineasHijos=this.getHijosLinea(linea);
			
			if(lineasHijos.size()>0) {
				this.setHijosArbolLinea(lineasHijos,defaultMutableTreeNodeLinea);
			}
			
			defaultMutableTreeNodeRootLinea.add(defaultMutableTreeNodeLinea);
		}
	}	
	
	public void setHijosArbolLinea(ArrayList<Linea> lineasAux,DefaultMutableTreeNode defaultMutableTreeNodeLineaPadre) {
		ArrayList<Linea> lineasHijos=new ArrayList<Linea>();
		DefaultMutableTreeNode defaultMutableTreeNodeLinea = null;
				 
		for(Linea linea:lineasAux) {
			defaultMutableTreeNodeLinea = new DefaultMutableTreeNode(linea);
			
			lineasHijos=this.getHijosLinea(linea);
			
			if(lineasHijos.size()>0) {
				this.setHijosArbolLinea(lineasHijos,defaultMutableTreeNodeLinea);
			}
			
			defaultMutableTreeNodeLineaPadre.add(defaultMutableTreeNodeLinea);
		}
	}
	
	public ArrayList<Linea> getHijosLinea(Linea lineaPadre) {
		ArrayList<Linea> lineasAux=new ArrayList<Linea>();
		
		for(Linea linea:lineas) {
			if(linea.getid_linea()!=null && linea.getid_linea().equals(lineaPadre.getId())) {
				lineasAux.add(linea);
			}
		}
		return lineasAux;
	}
	
	public ArrayList<Linea> getPrimerNivelLineas() {
		ArrayList<Linea> lineasAux=new ArrayList<Linea>();
		
		for(Linea linea:lineas) {
			if(linea.getid_linea()==null || linea.getid_linea()<=0) {
				lineasAux.add(linea);
			}
		}
		return lineasAux;
	}
	
	public void CargarTreeLineaTest(DefaultMutableTreeNode defaultMutableTreeNodeTree) {
		DefaultMutableTreeNode defaultMutableTreeNodeRootLinea = null;
        DefaultMutableTreeNode defaultMutableTreeNodeLinea = null;
 
        defaultMutableTreeNodeRootLinea = new DefaultMutableTreeNode("Root Arbol");
        defaultMutableTreeNodeTree.add(defaultMutableTreeNodeRootLinea);
		
		for(int i=0;i<10;i++) {
			defaultMutableTreeNodeLinea = new DefaultMutableTreeNode(i);
				
			defaultMutableTreeNodeRootLinea.add(defaultMutableTreeNodeLinea);
		}
		
		//NO NECESARIO
		//this.defaultTreeModel.reload();
	}	
	
	public void valueChanged(TreeSelectionEvent e) {
        DefaultMutableTreeNode defaultMutableTreeNode = (DefaultMutableTreeNode)this.treeLinea.getLastSelectedPathComponent();
 
        if (defaultMutableTreeNode == null) return;
 
        Object userObject = defaultMutableTreeNode.getUserObject();
		
		Linea linea = (Linea)userObject;
           
        if (defaultMutableTreeNode.isLeaf()) {
            //displayURL(book.bookURL);
            System.out.print(linea.getId() + ":  \n    ");            
        } else {
            
        }
        
		//this.jInternalFrameParent.setIdActual(linea.getId());
		
		try {
			//this.jInternalFrameParent.procesarBusqueda("PorId");
			if(this.getsTipoProceso().equals("BUSQUEDA_NORMAL")) {
				this.jInternalFrameParent.buscarPorId(linea.getId());			
			} else if(this.getsTipoProceso().equals("BUSQUEDA_FK")) {
				this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(linea.getId(),this.sTipoBusqueda);			
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
        TreePath currentSelection = this.treeLinea.getSelectionPath();
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
        TreePath parentPath = this.treeLinea.getSelectionPath();

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
            this.treeLinea.scrollPathToVisible(new TreePath(childNode.getPath()));
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

