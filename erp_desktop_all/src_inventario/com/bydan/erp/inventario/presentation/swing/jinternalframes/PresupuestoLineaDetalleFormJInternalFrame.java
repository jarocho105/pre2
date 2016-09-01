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


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.inventario.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.inventario.util.PresupuestoLineaConstantesFunciones;

import com.bydan.erp.inventario.business.logic.*;
import com.bydan.framework.erp.business.entity.DatoGeneral;
import com.bydan.framework.erp.business.entity.OrderBy;
import com.bydan.framework.erp.business.entity.Mensajes;
import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverter;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverterFromDate;
import com.bydan.framework.erp.presentation.desktop.swing.FuncionesSwing;
import com.bydan.framework.erp.presentation.desktop.swing.JInternalFrameBase;
import com.bydan.framework.erp.presentation.desktop.swing.*;
import com.bydan.framework.erp.util.*;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.sql.*;


import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRRuntimeException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.engine.export.JRHtmlExporter;
import net.sf.jasperreports.j2ee.servlets.BaseHttpServlet;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.data.JRBeanArrayDataSource;


import javax.swing.*;
import java.awt.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.table.TableColumn;

import com.toedter.calendar.JDateChooser;


@SuppressWarnings("unused")
public class PresupuestoLineaDetalleFormJInternalFrame extends PresupuestoLineaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetallePresupuestoLinea;
	
	protected JMenuBar jmenuBarDetallePresupuestoLinea;
	
	protected JMenu jmenuDetallePresupuestoLinea;
	protected JMenu jmenuDetalleArchivoPresupuestoLinea;
	protected JMenu jmenuDetalleAccionesPresupuestoLinea;
	protected JMenu jmenuDetalleDatosPresupuestoLinea;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetallePresupuestoLinea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPresupuestoLinea;	
	protected GridBagConstraints gridBagConstraintsPresupuestoLinea;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected PresupuestoLineaBeanSwingJInternalFrameAdditional jInternalFrameDetallePresupuestoLinea;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_linea="";
	
	public PresupuestoLineaSessionBean presupuestolineaSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public LineaSessionBean lineaSessionBean;	
	
	public PresupuestoLineaLogic presupuestolineaLogic;
	
	public JScrollPane jScrollPanelDatosPresupuestoLinea;
	public JScrollPane jScrollPanelDatosEdicionPresupuestoLinea;
	public JScrollPane jScrollPanelDatosGeneralPresupuestoLinea;
	
	protected JPanel jPanelCamposPresupuestoLinea;    
	protected JPanel jPanelCamposOcultosPresupuestoLinea;    	
	protected JPanel jPanelAccionesPresupuestoLinea;
	protected JPanel jPanelAccionesFormularioPresupuestoLinea;
    
	
	
	protected Integer iXPanelCamposPresupuestoLinea=0;
	protected Integer iYPanelCamposPresupuestoLinea=0;
	
	protected Integer iXPanelCamposOcultosPresupuestoLinea=0;
	protected Integer iYPanelCamposOcultosPresupuestoLinea=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoPresupuestoLinea;
	public JButton jButtonModificarPresupuestoLinea;
	public JButton jButtonActualizarPresupuestoLinea;
    public JButton jButtonEliminarPresupuestoLinea;
	public JButton jButtonCancelarPresupuestoLinea;
    public JButton jButtonGuardarCambiosPresupuestoLinea;
	public JButton jButtonGuardarCambiosTablaPresupuestoLinea;
	protected JButton jButtonCerrarPresupuestoLinea;
	
	
	protected JButton jButtonProcesarInformacionPresupuestoLinea;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoPresupuestoLinea;
	protected JCheckBox jCheckBoxPostAccionSinCerrarPresupuestoLinea;
	protected JCheckBox jCheckBoxPostAccionSinMensajePresupuestoLinea;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPresupuestoLinea;
	protected JButton jButtonModificarToolBarPresupuestoLinea;
	protected JButton jButtonActualizarToolBarPresupuestoLinea;
    protected JButton jButtonEliminarToolBarPresupuestoLinea;
	protected JButton jButtonCancelarToolBarPresupuestoLinea;
    protected JButton jButtonGuardarCambiosToolBarPresupuestoLinea;
	protected JButton jButtonGuardarCambiosTablaToolBarPresupuestoLinea;
	protected JButton jButtonMostrarOcultarTablaToolBarPresupuestoLinea;
	protected JButton jButtonCerrarToolBarPresupuestoLinea;
	
	protected JButton jButtonProcesarInformacionToolBarPresupuestoLinea;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPresupuestoLinea;
	protected JMenuItem jMenuItemModificarPresupuestoLinea;
	protected JMenuItem jMenuItemActualizarPresupuestoLinea;
    protected JMenuItem jMenuItemEliminarPresupuestoLinea;
	protected JMenuItem jMenuItemCancelarPresupuestoLinea;
    protected JMenuItem jMenuItemGuardarCambiosPresupuestoLinea;
	protected JMenuItem jMenuItemGuardarCambiosTablaPresupuestoLinea;
	protected JMenuItem jMenuItemCerrarPresupuestoLinea;
	protected JMenuItem jMenuItemDetalleCerrarPresupuestoLinea;
	protected JMenuItem jMenuItemDetalleMostarOcultarPresupuestoLinea;
	
	protected JMenuItem jMenuItemProcesarInformacionPresupuestoLinea;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPresupuestoLinea;
	protected JMenuItem jMenuItemMostrarOcultarPresupuestoLinea;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPresupuestoLinea;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPresupuestoLinea;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPresupuestoLinea;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioPresupuestoLinea;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidPresupuestoLinea;
	public JLabel jLabelIdPresupuestoLinea;
	public JLabel jLabelidPresupuestoLinea;
	public JButton jButtonidPresupuestoLineaBusqueda= new JButtonMe();

	public JPanel jPanelmargenPresupuestoLinea;
	public JLabel jLabelmargenPresupuestoLinea;
	public JTextField jTextFieldmargenPresupuestoLinea;
	public JButton jButtonmargenPresupuestoLineaBusqueda= new JButtonMe();

	public JPanel jPaneldescuentoPresupuestoLinea;
	public JLabel jLabeldescuentoPresupuestoLinea;
	public JTextField jTextFielddescuentoPresupuestoLinea;
	public JButton jButtondescuentoPresupuestoLineaBusqueda= new JButtonMe();

	public JPanel jPaneles_para_presupuestoPresupuestoLinea;
	public JLabel jLabeles_para_presupuestoPresupuestoLinea;
	public JCheckBox jCheckBoxes_para_presupuestoPresupuestoLinea;
	public JButton jButtones_para_presupuestoPresupuestoLineaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaPresupuestoLinea;
	public JLabel jLabelid_empresaPresupuestoLinea;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaPresupuestoLinea;
	public JButton jButtonid_empresaPresupuestoLinea= new JButtonMe();
	public JButton jButtonid_empresaPresupuestoLineaUpdate= new JButtonMe();
	public JButton jButtonid_empresaPresupuestoLineaBusqueda= new JButtonMe();

	public JPanel jPanelid_lineaPresupuestoLinea;
	public JLabel jLabelid_lineaPresupuestoLinea;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_lineaPresupuestoLinea;
	public JButton jButtonid_lineaPresupuestoLinea= new JButtonMe();
	public JButton jButtonid_lineaPresupuestoLineaUpdate= new JButtonMe();
	public JButton jButtonid_lineaPresupuestoLineaBusqueda= new JButtonMe();
	public JButton jButtonid_lineaPresupuestoLineaArbol= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesPresupuestoLinea;
	
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	//LOS DATOS DE NUEVO Y EDICION ACTUAL APARECEN EN OTRA VENTANA(true) O NO(false)
	public static Boolean CON_DATOS_FRAME=true;
	
	public static Boolean ISBINDING_MANUAL=true;
	public static Boolean ISLOAD_FKLOTE=true;
	public static Boolean ISBINDING_MANUAL_TABLA=true;
	public static Boolean CON_CARGAR_MEMORIA_INICIAL=true;
	
	//Al final no se utilizan, se inicializan desde JInternalFrameBase, desde ParametroGeneralUsuario
	public static String STIPO_TAMANIO_GENERAL="NORMAL";
	public static String STIPO_TAMANIO_GENERAL_TABLA="NORMAL";
	public static Boolean CONTIPO_TAMANIO_MANUAL=false;
	public static Boolean CON_LLAMADA_SIMPLE=true;
	public static Boolean CON_LLAMADA_SIMPLE_TOTAL=true;
	public static Boolean ESTA_CARGADO_PORPARTE=false;
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	public int iWidthFormulario=515;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightFormulario=330;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public PresupuestoLineaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposPresupuestoLinea=new JPanel();
				this.jPanelAccionesFormularioPresupuestoLinea=new JPanel();
				this.jmenuBarDetallePresupuestoLinea=new JMenuBar();
				this.jTtoolBarDetallePresupuestoLinea=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresupuestoLineaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("PresupuestoLinea No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public PresupuestoLineaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("PresupuestoLinea No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresupuestoLineaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PresupuestoLinea No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresupuestoLineaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PresupuestoLinea No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresupuestoLineaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PresupuestoLinea No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			
			long start_time=0;
			long end_time=0;
			
			if(Constantes2.ISDEVELOPING2) {
				start_time = System.currentTimeMillis();
			}

			this.initialize(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Clase Padre Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }		

	public JInternalFrameBase getJInternalFrameParent() {
		return jInternalFrameParent;
	}

	public void setJInternalFrameParent(JInternalFrameBase internalFrameParent)	{
		jInternalFrameParent = internalFrameParent;
	}
	
	
	public JButton getjButtonActualizarToolBarPresupuestoLinea() {
		return this.jButtonActualizarToolBarPresupuestoLinea;
	}
	
	public JButton getjButtonEliminarToolBarPresupuestoLinea() {
		return this.jButtonEliminarToolBarPresupuestoLinea;
	}
	
	public JButton getjButtonCancelarToolBarPresupuestoLinea() {
		return this.jButtonCancelarToolBarPresupuestoLinea;
	}		
	
	public JButton getjButtonProcesarInformacionPresupuestoLinea() {
		return this.jButtonProcesarInformacionPresupuestoLinea;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPresupuestoLinea)	{
		this.jButtonProcesarInformacionPresupuestoLinea = jButtonProcesarInformacionPresupuestoLinea;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPresupuestoLinea() {
		return this.jComboBoxTiposAccionesPresupuestoLinea;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPresupuestoLinea(
			JComboBox jComboBoxTiposRelacionesPresupuestoLinea) {
		this.jComboBoxTiposRelacionesPresupuestoLinea = jComboBoxTiposRelacionesPresupuestoLinea;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPresupuestoLinea(
			JComboBox jComboBoxTiposAccionesPresupuestoLinea) {
		this.jComboBoxTiposAccionesPresupuestoLinea = jComboBoxTiposAccionesPresupuestoLinea;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioPresupuestoLinea() {
		return this.jComboBoxTiposAccionesFormularioPresupuestoLinea;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioPresupuestoLinea(
			JComboBox jComboBoxTiposAccionesFormularioPresupuestoLinea) {
		this.jComboBoxTiposAccionesFormularioPresupuestoLinea = jComboBoxTiposAccionesFormularioPresupuestoLinea;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.presupuestolineaSessionBean=new PresupuestoLineaSessionBean();
		
		this.presupuestolineaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.presupuestolineaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.presupuestolineaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PresupuestoLineaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PresupuestoLineaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PresupuestoLineaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Presupuesto Linea MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.presupuestolineaSessionBean.getEsGuardarRelacionado()) {
			this.setResizable(true);
			this.setClosable(true);
			this.setMaximizable(true);
			this.iconable=true;
			
			setLocation(xOffset*openFrameCount, yOffset*openFrameCount);
			
			if(Constantes.CON_VARIAS_VENTANAS) {
				openFrameCount++;
				
				if(openFrameCount==Constantes.INUM_MAX_VENTANAS) {
					openFrameCount=0;
				}
			}
		}				
	
		PresupuestoLineaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetallePresupuestoLinea= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarPresupuestoLinea=new JButtonMe();
				this.jButtonModificarToolBarPresupuestoLinea=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarPresupuestoLinea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarPresupuestoLinea,this.jTtoolBarDetallePresupuestoLinea,
							"actualizar","actualizar","Actualizar"+" "+PresupuestoLineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarPresupuestoLinea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarPresupuestoLinea,this.jTtoolBarDetallePresupuestoLinea,
							"eliminar","eliminar","Eliminar"+" "+PresupuestoLineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarPresupuestoLinea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarPresupuestoLinea,this.jTtoolBarDetallePresupuestoLinea,
							"cancelar","cancelar","Cancelar"+" "+PresupuestoLineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarPresupuestoLinea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarPresupuestoLinea,this.jTtoolBarDetallePresupuestoLinea,
							"guardarcambios","guardarcambios","Guardar"+" "+PresupuestoLineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarPresupuestoLinea,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarPresupuestoLinea,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarPresupuestoLinea,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetallePresupuestoLinea=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetallePresupuestoLinea=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoPresupuestoLinea=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesPresupuestoLinea=new JMenuMe("Acciones");
		this.jmenuDetalleDatosPresupuestoLinea=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPresupuestoLinea= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPresupuestoLinea.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPresupuestoLinea,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPresupuestoLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarPresupuestoLinea= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarPresupuestoLinea.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarPresupuestoLinea,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarPresupuestoLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarPresupuestoLinea= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarPresupuestoLinea.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarPresupuestoLinea,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarPresupuestoLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarPresupuestoLinea= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarPresupuestoLinea.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarPresupuestoLinea,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarPresupuestoLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarPresupuestoLinea= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarPresupuestoLinea.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarPresupuestoLinea,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarPresupuestoLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosPresupuestoLinea= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPresupuestoLinea.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPresupuestoLinea,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPresupuestoLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPresupuestoLinea= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPresupuestoLinea.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPresupuestoLinea,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPresupuestoLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarPresupuestoLinea= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarPresupuestoLinea.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarPresupuestoLinea,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarPresupuestoLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPresupuestoLinea= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPresupuestoLinea.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPresupuestoLinea,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPresupuestoLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPresupuestoLinea= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPresupuestoLinea.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPresupuestoLinea,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPresupuestoLinea, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoPresupuestoLinea.add(this.jMenuItemDetalleCerrarPresupuestoLinea);
		
		this.jmenuDetalleAccionesPresupuestoLinea.add(this.jMenuItemActualizarPresupuestoLinea);
		this.jmenuDetalleAccionesPresupuestoLinea.add(this.jMenuItemEliminarPresupuestoLinea);
		this.jmenuDetalleAccionesPresupuestoLinea.add(this.jMenuItemCancelarPresupuestoLinea);		
		
		//this.jmenuDetalleDatosPresupuestoLinea.add(this.jMenuItemDetalleAbrirOrderByPresupuestoLinea);				
		this.jmenuDetalleDatosPresupuestoLinea.add(this.jMenuItemDetalleMostarOcultarPresupuestoLinea);				
				
		//this.jmenuDetalleAccionesPresupuestoLinea.add(this.jMenuItemGuardarCambiosPresupuestoLinea);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoPresupuestoLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesPresupuestoLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosPresupuestoLinea, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetallePresupuestoLinea.add(this.jmenuDetalleArchivoPresupuestoLinea);		
		this.jmenuBarDetallePresupuestoLinea.add(this.jmenuDetalleAccionesPresupuestoLinea);		
		this.jmenuBarDetallePresupuestoLinea.add(this.jmenuDetalleDatosPresupuestoLinea);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetallePresupuestoLinea);				
	}
	
	
	public void inicializarElementosCamposPresupuestoLinea() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdPresupuestoLinea = new JLabelMe();
		jLabelIdPresupuestoLinea.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdPresupuestoLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPresupuestoLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPresupuestoLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdPresupuestoLinea,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidPresupuestoLinea = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidPresupuestoLinea.setToolTipText(PresupuestoLineaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutPresupuestoLinea= new GridBagLayout();

		this.jPanelidPresupuestoLinea.setLayout(this.gridaBagLayoutPresupuestoLinea);

		jLabelidPresupuestoLinea = new JLabel();
		jLabelidPresupuestoLinea.setText("Id");

		jLabelidPresupuestoLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPresupuestoLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPresupuestoLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelmargenPresupuestoLinea = new JLabelMe();
		this.jLabelmargenPresupuestoLinea.setText(""+PresupuestoLineaConstantesFunciones.LABEL_MARGEN+" : *");
		this.jLabelmargenPresupuestoLinea.setToolTipText("Margen");
		this.jLabelmargenPresupuestoLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmargenPresupuestoLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmargenPresupuestoLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelmargenPresupuestoLinea,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelmargenPresupuestoLinea=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelmargenPresupuestoLinea.setToolTipText(PresupuestoLineaConstantesFunciones.LABEL_MARGEN);
		this.gridaBagLayoutPresupuestoLinea = new GridBagLayout();
		this.jPanelmargenPresupuestoLinea.setLayout(this.gridaBagLayoutPresupuestoLinea);


		jTextFieldmargenPresupuestoLinea= new JTextFieldMe();
		jTextFieldmargenPresupuestoLinea.setEnabled(false);
		jTextFieldmargenPresupuestoLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmargenPresupuestoLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmargenPresupuestoLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldmargenPresupuestoLinea,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldmargenPresupuestoLinea.setText("0.0");

		this.jButtonmargenPresupuestoLineaBusqueda= new JButtonMe();
		this.jButtonmargenPresupuestoLineaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmargenPresupuestoLineaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmargenPresupuestoLineaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonmargenPresupuestoLineaBusqueda.setText("U");
		this.jButtonmargenPresupuestoLineaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonmargenPresupuestoLineaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonmargenPresupuestoLineaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldmargenPresupuestoLinea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldmargenPresupuestoLinea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"margenPresupuestoLineaBusqueda"));

		if(this.presupuestolineaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonmargenPresupuestoLineaBusqueda.setVisible(false);		}


					
		this.jLabeldescuentoPresupuestoLinea = new JLabelMe();
		this.jLabeldescuentoPresupuestoLinea.setText(""+PresupuestoLineaConstantesFunciones.LABEL_DESCUENTO+" : *");
		this.jLabeldescuentoPresupuestoLinea.setToolTipText("Descuento");
		this.jLabeldescuentoPresupuestoLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuentoPresupuestoLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuentoPresupuestoLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescuentoPresupuestoLinea,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescuentoPresupuestoLinea=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescuentoPresupuestoLinea.setToolTipText(PresupuestoLineaConstantesFunciones.LABEL_DESCUENTO);
		this.gridaBagLayoutPresupuestoLinea = new GridBagLayout();
		this.jPaneldescuentoPresupuestoLinea.setLayout(this.gridaBagLayoutPresupuestoLinea);


		jTextFielddescuentoPresupuestoLinea= new JTextFieldMe();
		jTextFielddescuentoPresupuestoLinea.setEnabled(false);
		jTextFielddescuentoPresupuestoLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuentoPresupuestoLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuentoPresupuestoLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddescuentoPresupuestoLinea,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddescuentoPresupuestoLinea.setText("0.0");

		this.jButtondescuentoPresupuestoLineaBusqueda= new JButtonMe();
		this.jButtondescuentoPresupuestoLineaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuentoPresupuestoLineaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuentoPresupuestoLineaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescuentoPresupuestoLineaBusqueda.setText("U");
		this.jButtondescuentoPresupuestoLineaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescuentoPresupuestoLineaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescuentoPresupuestoLineaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddescuentoPresupuestoLinea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddescuentoPresupuestoLinea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descuentoPresupuestoLineaBusqueda"));

		if(this.presupuestolineaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescuentoPresupuestoLineaBusqueda.setVisible(false);		}


					
		this.jLabeles_para_presupuestoPresupuestoLinea = new JLabelMe();
		this.jLabeles_para_presupuestoPresupuestoLinea.setText(""+PresupuestoLineaConstantesFunciones.LABEL_ESPARAPRESUPUESTO+" : *");
		this.jLabeles_para_presupuestoPresupuestoLinea.setToolTipText("Para Presupuesto");
		this.jLabeles_para_presupuestoPresupuestoLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeles_para_presupuestoPresupuestoLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeles_para_presupuestoPresupuestoLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeles_para_presupuestoPresupuestoLinea,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_para_presupuestoPresupuestoLinea=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_para_presupuestoPresupuestoLinea.setToolTipText(PresupuestoLineaConstantesFunciones.LABEL_ESPARAPRESUPUESTO);
		this.gridaBagLayoutPresupuestoLinea = new GridBagLayout();
		this.jPaneles_para_presupuestoPresupuestoLinea.setLayout(this.gridaBagLayoutPresupuestoLinea);


		jCheckBoxes_para_presupuestoPresupuestoLinea= new JCheckBoxMe();
		jCheckBoxes_para_presupuestoPresupuestoLinea.setEnabled(false);

		jCheckBoxes_para_presupuestoPresupuestoLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_para_presupuestoPresupuestoLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_para_presupuestoPresupuestoLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_para_presupuestoPresupuestoLinea,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_para_presupuestoPresupuestoLineaBusqueda= new JButtonMe();
		this.jButtones_para_presupuestoPresupuestoLineaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_para_presupuestoPresupuestoLineaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_para_presupuestoPresupuestoLineaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_para_presupuestoPresupuestoLineaBusqueda.setText("U");
		this.jButtones_para_presupuestoPresupuestoLineaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_para_presupuestoPresupuestoLineaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_para_presupuestoPresupuestoLineaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_para_presupuestoPresupuestoLinea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_para_presupuestoPresupuestoLinea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_para_presupuestoPresupuestoLineaBusqueda"));

		if(this.presupuestolineaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_para_presupuestoPresupuestoLineaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysPresupuestoLinea() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaPresupuestoLinea = new JLabelMe();
		this.jLabelid_empresaPresupuestoLinea.setText(""+PresupuestoLineaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaPresupuestoLinea.setToolTipText("Empresa");
		this.jLabelid_empresaPresupuestoLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaPresupuestoLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaPresupuestoLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaPresupuestoLinea,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaPresupuestoLinea=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaPresupuestoLinea.setToolTipText(PresupuestoLineaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutPresupuestoLinea = new GridBagLayout();
		this.jPanelid_empresaPresupuestoLinea.setLayout(this.gridaBagLayoutPresupuestoLinea);


		jComboBoxid_empresaPresupuestoLinea= new JComboBoxMe();
		jComboBoxid_empresaPresupuestoLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaPresupuestoLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaPresupuestoLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaPresupuestoLinea,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaPresupuestoLinea.setEnabled(false);

		this.jButtonid_empresaPresupuestoLinea= new JButtonMe();
		this.jButtonid_empresaPresupuestoLinea.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPresupuestoLinea.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPresupuestoLinea.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPresupuestoLinea.setText("Buscar");
		this.jButtonid_empresaPresupuestoLinea.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaPresupuestoLinea.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPresupuestoLinea,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaPresupuestoLinea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPresupuestoLinea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPresupuestoLinea"));

		this.jButtonid_empresaPresupuestoLineaBusqueda= new JButtonMe();
		this.jButtonid_empresaPresupuestoLineaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPresupuestoLineaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPresupuestoLineaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaPresupuestoLineaBusqueda.setText("U");
		this.jButtonid_empresaPresupuestoLineaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaPresupuestoLineaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPresupuestoLineaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaPresupuestoLinea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPresupuestoLinea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPresupuestoLineaBusqueda"));

		if(this.presupuestolineaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaPresupuestoLineaBusqueda.setVisible(false);		}

		this.jButtonid_empresaPresupuestoLineaUpdate= new JButtonMe();
		this.jButtonid_empresaPresupuestoLineaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPresupuestoLineaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPresupuestoLineaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaPresupuestoLineaUpdate.setText("U");
		this.jButtonid_empresaPresupuestoLineaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaPresupuestoLineaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPresupuestoLineaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaPresupuestoLinea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPresupuestoLinea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPresupuestoLineaUpdate"));



					
		this.jLabelid_lineaPresupuestoLinea = new JLabelMe();
		this.jLabelid_lineaPresupuestoLinea.setText(""+PresupuestoLineaConstantesFunciones.LABEL_IDLINEA+" : *");
		this.jLabelid_lineaPresupuestoLinea.setToolTipText("Linea");
		this.jLabelid_lineaPresupuestoLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_lineaPresupuestoLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_lineaPresupuestoLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_lineaPresupuestoLinea,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_lineaPresupuestoLinea=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_lineaPresupuestoLinea.setToolTipText(PresupuestoLineaConstantesFunciones.LABEL_IDLINEA);
		this.gridaBagLayoutPresupuestoLinea = new GridBagLayout();
		this.jPanelid_lineaPresupuestoLinea.setLayout(this.gridaBagLayoutPresupuestoLinea);


		jComboBoxid_lineaPresupuestoLinea= new JComboBoxMe();
		jComboBoxid_lineaPresupuestoLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaPresupuestoLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaPresupuestoLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_lineaPresupuestoLinea,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_lineaPresupuestoLinea= new JButtonMe();
		this.jButtonid_lineaPresupuestoLinea.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaPresupuestoLinea.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaPresupuestoLinea.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaPresupuestoLinea.setText("Buscar");
		this.jButtonid_lineaPresupuestoLinea.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_lineaPresupuestoLinea.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaPresupuestoLinea,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_lineaPresupuestoLinea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaPresupuestoLinea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaPresupuestoLinea"));

		this.jButtonid_lineaPresupuestoLineaBusqueda= new JButtonMe();
		this.jButtonid_lineaPresupuestoLineaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaPresupuestoLineaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaPresupuestoLineaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_lineaPresupuestoLineaBusqueda.setText("U");
		this.jButtonid_lineaPresupuestoLineaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_lineaPresupuestoLineaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaPresupuestoLineaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_lineaPresupuestoLinea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaPresupuestoLinea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaPresupuestoLineaBusqueda"));

		if(this.presupuestolineaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_lineaPresupuestoLineaBusqueda.setVisible(false);		}

		this.jButtonid_lineaPresupuestoLineaUpdate= new JButtonMe();
		this.jButtonid_lineaPresupuestoLineaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaPresupuestoLineaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaPresupuestoLineaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_lineaPresupuestoLineaUpdate.setText("U");
		this.jButtonid_lineaPresupuestoLineaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_lineaPresupuestoLineaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaPresupuestoLineaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_lineaPresupuestoLinea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaPresupuestoLinea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaPresupuestoLineaUpdate"));


		jButtonid_lineaPresupuestoLineaArbol= new JButtonMe();
		jButtonid_lineaPresupuestoLineaArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_lineaPresupuestoLineaArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_lineaPresupuestoLineaArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_lineaPresupuestoLineaArbol.setText("Arbol");
		jButtonid_lineaPresupuestoLineaArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_lineaPresupuestoLineaArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaPresupuestoLineaArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_lineaPresupuestoLinea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaPresupuestoLinea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaPresupuestoLineaArbol"));



	}
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) {
		//System.out.println("TRANSFIERE EL MANEJO AL PADRE O FORM PRINCIPAL");
		
		jInternalFrameParent.jButtonActionPerformedTecladoGeneral(sTipo,evt);
	}
	
	//JPanel
	//@SuppressWarnings({"unchecked" })//"rawtypes"
	public JScrollPane getJContentPane(int iWidth,int iHeight,JDesktopPane jDesktopPane,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {	
		//PARA TABLA PARAMETROS
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		this.jContentPane = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
				
		this.usuarioActual=usuarioActual;
		this.resumenUsuarioActual=resumenUsuarioActual;
		this.opcionActual=opcionActual;
		
		this.moduloActual=moduloActual;		
		this.parametroGeneralSg=parametroGeneralSg;		
		this.parametroGeneralUsuario=parametroGeneralUsuario;	
		
		this.jDesktopPane=jDesktopPane;
				
		this.conFuncionalidadRelaciones=parametroGeneralUsuario.getcon_guardar_relaciones();
		
		
		int iGridyPrincipal=0;
		
		
		this.inicializarToolBar();		
		
		
		//CARGAR MENUS
		//this.jInternalFrameDetallePresupuestoLinea = new PresupuestoLineaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Presupuesto Linea DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPresupuestoLinea= new GridBagLayout();
		

		
		String sToolTipPresupuestoLinea="";
		sToolTipPresupuestoLinea=PresupuestoLineaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPresupuestoLinea+="(Inventario.PresupuestoLinea)";
		}
		
		if(!this.presupuestolineaSessionBean.getEsGuardarRelacionado()) {
			sToolTipPresupuestoLinea+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoPresupuestoLinea = new JButtonMe();
		this.jButtonModificarPresupuestoLinea = new JButtonMe();
        this.jButtonActualizarPresupuestoLinea = new JButtonMe();
        this.jButtonEliminarPresupuestoLinea = new JButtonMe();
        this.jButtonCancelarPresupuestoLinea = new JButtonMe();
        this.jButtonGuardarCambiosPresupuestoLinea = new JButtonMe();
		this.jButtonGuardarCambiosTablaPresupuestoLinea = new JButtonMe();
		this.jButtonCerrarPresupuestoLinea = new JButtonMe();
		
		this.jScrollPanelDatosPresupuestoLinea = new JScrollPane();   
        this.jScrollPanelDatosEdicionPresupuestoLinea = new JScrollPane();
		this.jScrollPanelDatosGeneralPresupuestoLinea = new JScrollPane();
				
		
		
		this.jPanelCamposPresupuestoLinea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosPresupuestoLinea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesPresupuestoLinea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioPresupuestoLinea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Presupuesto Linea";
		
		if(!this.presupuestolineaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPresupuestoLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Presupuesto Lineaes" + this.sPath));
		} else {
			this.jScrollPanelDatosPresupuestoLinea.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionPresupuestoLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralPresupuestoLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposPresupuestoLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposPresupuestoLinea.setName("jPanelCamposPresupuestoLinea"); 

		this.jPanelCamposOcultosPresupuestoLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosPresupuestoLinea.setName("jPanelCamposOcultosPresupuestoLinea"); 

        this.jPanelAccionesPresupuestoLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPresupuestoLinea.setToolTipText("Acciones");
        this.jPanelAccionesPresupuestoLinea.setName("Acciones"); 

		this.jPanelAccionesFormularioPresupuestoLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioPresupuestoLinea.setToolTipText("Acciones");
        this.jPanelAccionesFormularioPresupuestoLinea.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionPresupuestoLinea, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPresupuestoLinea, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPresupuestoLinea, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposPresupuestoLinea, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosPresupuestoLinea, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioPresupuestoLinea, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoPresupuestoLinea.setText("Nuevo");
		this.jButtonModificarPresupuestoLinea.setText("Editar");
        this.jButtonActualizarPresupuestoLinea.setText("Actualizar");
        this.jButtonEliminarPresupuestoLinea.setText("Eliminar");
        this.jButtonCancelarPresupuestoLinea.setText("Cancelar");
        this.jButtonGuardarCambiosPresupuestoLinea.setText("Guardar");
		this.jButtonGuardarCambiosTablaPresupuestoLinea.setText("Guardar");
		this.jButtonCerrarPresupuestoLinea.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPresupuestoLinea,"nuevo_button","Nuevo",this.presupuestolineaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarPresupuestoLinea,"modificar_button","Editar",this.presupuestolineaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarPresupuestoLinea,"actualizar_button","Actualizar",this.presupuestolineaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarPresupuestoLinea,"eliminar_button","Eliminar",this.presupuestolineaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarPresupuestoLinea,"cancelar_button","Cancelar",this.presupuestolineaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosPresupuestoLinea,"guardarcambios_button","Guardar",this.presupuestolineaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPresupuestoLinea,"guardarcambiostabla_button","Guardar",this.presupuestolineaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPresupuestoLinea,"cerrar_button","Salir",this.presupuestolineaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPresupuestoLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarPresupuestoLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosPresupuestoLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPresupuestoLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPresupuestoLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarPresupuestoLinea, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarPresupuestoLinea, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarPresupuestoLinea, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoPresupuestoLinea.setToolTipText("Nuevo"+" "+PresupuestoLineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarPresupuestoLinea.setToolTipText("Editar"+" "+PresupuestoLineaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarPresupuestoLinea.setToolTipText("Actualizar"+" "+PresupuestoLineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarPresupuestoLinea.setToolTipText("Eliminar)"+" "+PresupuestoLineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarPresupuestoLinea.setToolTipText("Cancelar"+" "+PresupuestoLineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosPresupuestoLinea.setToolTipText("Guardar"+" "+PresupuestoLineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaPresupuestoLinea.setToolTipText("Guardar"+" "+PresupuestoLineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPresupuestoLinea.setToolTipText("Salir"+" "+PresupuestoLineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
		//HOT KEYS
		/*
		N->Nuevo
		N->Alt + Nuevo Relaciones (ANTES R)
		A->Actualizar
		E->Eliminar
		S->Cerrar
		C->->Mayus + Cancelar (ANTES Q->Quit)
		G->Guardar Cambios
		D->Duplicar
		C->Alt + Cop?ar
		O->Orden
		N->Nuevo Tabla
		R->Recargar Informacion Inicial (ANTES I)
		Alt + Pag.Down->Siguientes
		Alt + Pag.Up->Anteriores
		
		NO UTILIZADOS
		M->Modificar
		
		*/
		String sMapKey = "";
		InputMap inputMap =null;
		
		//NUEVO
		sMapKey = "NuevoPresupuestoLinea";
		inputMap = this.jButtonNuevoPresupuestoLinea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPresupuestoLinea.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPresupuestoLinea"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarPresupuestoLinea";
		inputMap = this.jButtonActualizarPresupuestoLinea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarPresupuestoLinea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarPresupuestoLinea"));
		
		//ELIMINAR
		sMapKey = "EliminarPresupuestoLinea";
		inputMap = this.jButtonEliminarPresupuestoLinea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarPresupuestoLinea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarPresupuestoLinea"));
		
		//CANCELAR	
		sMapKey = "CancelarPresupuestoLinea";
		inputMap = this.jButtonCancelarPresupuestoLinea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarPresupuestoLinea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarPresupuestoLinea"));
		
		//CERRAR		
		sMapKey = "CerrarPresupuestoLinea";
		inputMap = this.jButtonCerrarPresupuestoLinea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPresupuestoLinea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPresupuestoLinea"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPresupuestoLinea";
		inputMap = this.jButtonGuardarCambiosTablaPresupuestoLinea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPresupuestoLinea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPresupuestoLinea"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoPresupuestoLinea = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoPresupuestoLinea.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoPresupuestoLinea.setToolTipText("Nuevo PresupuestoLinea");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoPresupuestoLinea, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarPresupuestoLinea = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarPresupuestoLinea.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarPresupuestoLinea.setToolTipText("Sin Cerrar Ventana PresupuestoLinea");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarPresupuestoLinea, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajePresupuestoLinea = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajePresupuestoLinea.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajePresupuestoLinea.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajePresupuestoLinea, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesPresupuestoLinea = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPresupuestoLinea.setText("Accion");
		this.jComboBoxTiposAccionesPresupuestoLinea.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioPresupuestoLinea = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioPresupuestoLinea.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioPresupuestoLinea.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesPresupuestoLinea = new JLabelMe();
		
		this.jLabelAccionesPresupuestoLinea.setText("Acciones");		
		this.jLabelAccionesPresupuestoLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPresupuestoLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPresupuestoLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposPresupuestoLinea();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysPresupuestoLinea();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesPresupuestoLinea=new JTabbedPane();
		this.jTabbedPaneRelacionesPresupuestoLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesPresupuestoLinea,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesPresupuestoLinea.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPresupuestoLinea.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPresupuestoLinea.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPresupuestoLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioPresupuestoLinea.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPresupuestoLinea.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPresupuestoLinea.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioPresupuestoLinea, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposPresupuestoLinea = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosPresupuestoLinea = new GridBagLayout();
		
		this.jPanelCamposPresupuestoLinea.setLayout(gridaBagLayoutCamposPresupuestoLinea);
		this.jPanelCamposOcultosPresupuestoLinea.setLayout(gridaBagLayoutCamposOcultosPresupuestoLinea);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoLinea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoLinea.gridy = 0;
	this.gridBagConstraintsPresupuestoLinea.gridx = 0;
	this.gridBagConstraintsPresupuestoLinea.ipadx = 0;
	this.gridBagConstraintsPresupuestoLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidPresupuestoLinea.add(jLabelIdPresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);



	this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoLinea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoLinea.gridy = 0;
	this.gridBagConstraintsPresupuestoLinea.gridx = 1;
	this.gridBagConstraintsPresupuestoLinea.ipadx = 0;
	this.gridBagConstraintsPresupuestoLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidPresupuestoLinea.add(jLabelidPresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);


	this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoLinea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoLinea.gridy = 0;
	this.gridBagConstraintsPresupuestoLinea.gridx = 0;
	this.gridBagConstraintsPresupuestoLinea.ipadx = 0;
	this.gridBagConstraintsPresupuestoLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaPresupuestoLinea.add(jLabelid_empresaPresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoLinea.gridy = 0;
		this.gridBagConstraintsPresupuestoLinea.gridx = 2;
		this.gridBagConstraintsPresupuestoLinea.ipadx = 0;
		this.gridBagConstraintsPresupuestoLinea.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaPresupuestoLinea.add(jButtonid_empresaPresupuestoLineaBusqueda, this.gridBagConstraintsPresupuestoLinea);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoLinea.gridy = 0;
		this.gridBagConstraintsPresupuestoLinea.gridx = 3;
		this.gridBagConstraintsPresupuestoLinea.ipadx = 0;
		this.gridBagConstraintsPresupuestoLinea.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaPresupuestoLinea.add(jButtonid_empresaPresupuestoLineaUpdate, this.gridBagConstraintsPresupuestoLinea);
	}

	this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoLinea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoLinea.gridy = 0;
	this.gridBagConstraintsPresupuestoLinea.gridx = 1;
	this.gridBagConstraintsPresupuestoLinea.ipadx = 0;
	this.gridBagConstraintsPresupuestoLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaPresupuestoLinea.add(jComboBoxid_empresaPresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);


	this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoLinea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoLinea.gridy = 0;
	this.gridBagConstraintsPresupuestoLinea.gridx = 0;
	this.gridBagConstraintsPresupuestoLinea.ipadx = 0;
	this.gridBagConstraintsPresupuestoLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_lineaPresupuestoLinea.add(jLabelid_lineaPresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoLinea.gridy = 0;
		this.gridBagConstraintsPresupuestoLinea.gridx = 2;
		this.gridBagConstraintsPresupuestoLinea.ipadx = 0;
		this.gridBagConstraintsPresupuestoLinea.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_lineaPresupuestoLinea.add(jButtonid_lineaPresupuestoLineaBusqueda, this.gridBagConstraintsPresupuestoLinea);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoLinea.gridy = 0;
		this.gridBagConstraintsPresupuestoLinea.gridx = 3;
		this.gridBagConstraintsPresupuestoLinea.ipadx = 0;
		this.gridBagConstraintsPresupuestoLinea.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_lineaPresupuestoLinea.add(jButtonid_lineaPresupuestoLineaUpdate, this.gridBagConstraintsPresupuestoLinea);
	}

	this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoLinea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoLinea.gridy = 0;
	this.gridBagConstraintsPresupuestoLinea.gridx = 1;
	this.gridBagConstraintsPresupuestoLinea.ipadx = 0;
	this.gridBagConstraintsPresupuestoLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_lineaPresupuestoLinea.add(jComboBoxid_lineaPresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);


	this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoLinea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoLinea.gridy = 0;
	this.gridBagConstraintsPresupuestoLinea.gridx = 0;
	this.gridBagConstraintsPresupuestoLinea.ipadx = 0;
	this.gridBagConstraintsPresupuestoLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelmargenPresupuestoLinea.add(jLabelmargenPresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoLinea.gridy = 0;
		this.gridBagConstraintsPresupuestoLinea.gridx = 2;
		this.gridBagConstraintsPresupuestoLinea.ipadx = 0;
		this.gridBagConstraintsPresupuestoLinea.insets = new Insets(0, 0, 0, 0);
		this.jPanelmargenPresupuestoLinea.add(jButtonmargenPresupuestoLineaBusqueda, this.gridBagConstraintsPresupuestoLinea);
	}

	this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoLinea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoLinea.gridy = 0;
	this.gridBagConstraintsPresupuestoLinea.gridx = 1;
	this.gridBagConstraintsPresupuestoLinea.ipadx = 0;
	this.gridBagConstraintsPresupuestoLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelmargenPresupuestoLinea.add(jTextFieldmargenPresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);


	this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoLinea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoLinea.gridy = 0;
	this.gridBagConstraintsPresupuestoLinea.gridx = 0;
	this.gridBagConstraintsPresupuestoLinea.ipadx = 0;
	this.gridBagConstraintsPresupuestoLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescuentoPresupuestoLinea.add(jLabeldescuentoPresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoLinea.gridy = 0;
		this.gridBagConstraintsPresupuestoLinea.gridx = 2;
		this.gridBagConstraintsPresupuestoLinea.ipadx = 0;
		this.gridBagConstraintsPresupuestoLinea.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescuentoPresupuestoLinea.add(jButtondescuentoPresupuestoLineaBusqueda, this.gridBagConstraintsPresupuestoLinea);
	}

	this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoLinea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoLinea.gridy = 0;
	this.gridBagConstraintsPresupuestoLinea.gridx = 1;
	this.gridBagConstraintsPresupuestoLinea.ipadx = 0;
	this.gridBagConstraintsPresupuestoLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescuentoPresupuestoLinea.add(jTextFielddescuentoPresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);


	this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoLinea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoLinea.gridy = 0;
	this.gridBagConstraintsPresupuestoLinea.gridx = 0;
	this.gridBagConstraintsPresupuestoLinea.ipadx = 0;
	this.gridBagConstraintsPresupuestoLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_para_presupuestoPresupuestoLinea.add(jLabeles_para_presupuestoPresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoLinea.gridy = 0;
		this.gridBagConstraintsPresupuestoLinea.gridx = 2;
		this.gridBagConstraintsPresupuestoLinea.ipadx = 0;
		this.gridBagConstraintsPresupuestoLinea.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_para_presupuestoPresupuestoLinea.add(jButtones_para_presupuestoPresupuestoLineaBusqueda, this.gridBagConstraintsPresupuestoLinea);
	}

	this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoLinea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoLinea.gridy = 0;
	this.gridBagConstraintsPresupuestoLinea.gridx = 1;
	this.gridBagConstraintsPresupuestoLinea.ipadx = 0;
	this.gridBagConstraintsPresupuestoLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_para_presupuestoPresupuestoLinea.add(jCheckBoxes_para_presupuestoPresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoLinea.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestoLinea.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestoLinea.gridy = iYPanelCamposPresupuestoLinea;
	this.gridBagConstraintsPresupuestoLinea.gridx = iXPanelCamposPresupuestoLinea++;
	this.gridBagConstraintsPresupuestoLinea.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestoLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresupuestoLinea.add(this.jPanelidPresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);



	if(iXPanelCamposPresupuestoLinea % 1==0) {
		iXPanelCamposPresupuestoLinea=0;
		iYPanelCamposPresupuestoLinea++;
	}
	this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoLinea.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestoLinea.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestoLinea.gridy = iYPanelCamposPresupuestoLinea;
	this.gridBagConstraintsPresupuestoLinea.gridx = iXPanelCamposPresupuestoLinea++;
	this.gridBagConstraintsPresupuestoLinea.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestoLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresupuestoLinea.add(this.jPanelid_lineaPresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);



	if(iXPanelCamposPresupuestoLinea % 1==0) {
		iXPanelCamposPresupuestoLinea=0;
		iYPanelCamposPresupuestoLinea++;
	}
	this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoLinea.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestoLinea.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestoLinea.gridy = iYPanelCamposPresupuestoLinea;
	this.gridBagConstraintsPresupuestoLinea.gridx = iXPanelCamposPresupuestoLinea++;
	this.gridBagConstraintsPresupuestoLinea.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestoLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresupuestoLinea.add(this.jPanelmargenPresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);



	if(iXPanelCamposPresupuestoLinea % 1==0) {
		iXPanelCamposPresupuestoLinea=0;
		iYPanelCamposPresupuestoLinea++;
	}
	this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoLinea.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestoLinea.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestoLinea.gridy = iYPanelCamposPresupuestoLinea;
	this.gridBagConstraintsPresupuestoLinea.gridx = iXPanelCamposPresupuestoLinea++;
	this.gridBagConstraintsPresupuestoLinea.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestoLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresupuestoLinea.add(this.jPaneldescuentoPresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);



	if(iXPanelCamposPresupuestoLinea % 1==0) {
		iXPanelCamposPresupuestoLinea=0;
		iYPanelCamposPresupuestoLinea++;
	}
	this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoLinea.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestoLinea.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestoLinea.gridy = iYPanelCamposPresupuestoLinea;
	this.gridBagConstraintsPresupuestoLinea.gridx = iXPanelCamposPresupuestoLinea++;
	this.gridBagConstraintsPresupuestoLinea.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestoLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresupuestoLinea.add(this.jPaneles_para_presupuestoPresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);



	if(iXPanelCamposPresupuestoLinea % 1==0) {
		iXPanelCamposPresupuestoLinea=0;
		iYPanelCamposPresupuestoLinea++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoLinea.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestoLinea.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestoLinea.gridy = iYPanelCamposOcultosPresupuestoLinea;
	this.gridBagConstraintsPresupuestoLinea.gridx = iXPanelCamposOcultosPresupuestoLinea++;
	this.gridBagConstraintsPresupuestoLinea.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestoLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPresupuestoLinea.add(this.jPanelid_empresaPresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);



	if(iXPanelCamposOcultosPresupuestoLinea % 1==0) {
		iXPanelCamposOcultosPresupuestoLinea=0;
		iYPanelCamposOcultosPresupuestoLinea++;
	}
		
		//SUBPANELES EN PANEL CAMPOS INICIO				
		
		
		//SUBPANELES EN PANEL CAMPOS FIN				
		
				
		//SUBPANELES EN PANEL
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
			 		
			
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesPresupuestoLinea= new GridBagLayout();
		this.jPanelAccionesPresupuestoLinea.setLayout(gridaBagLayoutAccionesPresupuestoLinea);
		
		GridBagLayout gridaBagLayoutAccionesFormularioPresupuestoLinea= new GridBagLayout();
		this.jPanelAccionesFormularioPresupuestoLinea.setLayout(gridaBagLayoutAccionesFormularioPresupuestoLinea);
		
		this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoLinea.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPresupuestoLinea.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPresupuestoLinea.add(this.jComboBoxTiposAccionesFormularioPresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);

		this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoLinea.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPresupuestoLinea.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPresupuestoLinea.add(this.jCheckBoxPostAccionNuevoPresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.presupuestolineaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoLinea.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsPresupuestoLinea.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioPresupuestoLinea.add(this.jCheckBoxPostAccionSinCerrarPresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.presupuestolineaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.presupuestolineaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoLinea.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsPresupuestoLinea.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioPresupuestoLinea.add(this.jCheckBoxPostAccionSinMensajePresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoLinea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresupuestoLinea.gridy = 0;
		this.gridBagConstraintsPresupuestoLinea.gridx = iPosXAccion++;
			
		this.jPanelAccionesPresupuestoLinea.add(this.jButtonModificarPresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);							

		this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoLinea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresupuestoLinea.gridy = 0;
		this.gridBagConstraintsPresupuestoLinea.gridx =iPosXAccion++;
			
		this.jPanelAccionesPresupuestoLinea.add(this.jButtonEliminarPresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);
		
			
		this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoLinea.gridy = 0;		
		this.gridBagConstraintsPresupuestoLinea.gridx = iPosXAccion++;
		
		this.jPanelAccionesPresupuestoLinea.add(this.jButtonActualizarPresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);


		this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoLinea.gridy = 0;		
		this.gridBagConstraintsPresupuestoLinea.gridx = iPosXAccion++;
		
		this.jPanelAccionesPresupuestoLinea.add(this.jButtonGuardarCambiosPresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);	
		
		this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoLinea.gridy = 0;		
		this.gridBagConstraintsPresupuestoLinea.gridx =iPosXAccion++;
		
		this.jPanelAccionesPresupuestoLinea.add(this.jButtonCancelarPresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPresupuestoLinea = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPresupuestoLinea);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.presupuestolineaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();						
			this.gridBagConstraintsPresupuestoLinea.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPresupuestoLinea.gridx = 0;		
			//this.gridBagConstraintsPresupuestoLinea.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoLinea.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPresupuestoLinea.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoLinea.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPresupuestoLinea.gridx =0;
		this.gridBagConstraintsPresupuestoLinea.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPresupuestoLinea.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(PresupuestoLineaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetallePresupuestoLinea = new PresupuestoLineaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Presupuesto Linea DATOS");
			
			this.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	        //this.setjInternalFrameParent(this);
	        
			iHeightFormularioMaximo=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	        
	        if(iHeightFormulario>iHeightFormularioMaximo) {
	        	iHeightFormulario=iHeightFormularioMaximo;
	        }
			
			iWidthFormularioMaximo=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
	        
			if(iWidthFormulario>iWidthFormularioMaximo) {
	        	iWidthFormulario=iWidthFormularioMaximo;
	        }
			
	        //this.setTitle("[FOR] - Presupuesto Linea DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Presupuesto Linea Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			PresupuestoLineaModel presupuestolineaModel=new PresupuestoLineaModel(this);
			
			//SI USARA CLASE INTERNA
			//PresupuestoLineaModel.PresupuestoLineaFocusTraversalPolicy presupuestolineaFocusTraversalPolicy = presupuestolineaModel.new PresupuestoLineaFocusTraversalPolicy(this);
			
			//presupuestolineaFocusTraversalPolicy.setpresupuestolineaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(presupuestolineaModel);
			
			
			this.jContentPaneDetallePresupuestoLinea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetallePresupuestoLinea = new GridBagLayout();	
			this.jContentPaneDetallePresupuestoLinea.setLayout(gridaBagLayoutDetallePresupuestoLinea);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPresupuestoLinea = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
				this.gridBagConstraintsPresupuestoLinea.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsPresupuestoLinea.gridx = 0;
					
				
				this.jContentPaneDetallePresupuestoLinea.add(jTtoolBarDetallePresupuestoLinea, gridBagConstraintsPresupuestoLinea);								
				
}
			
			this.jScrollPanelDatosEdicionPresupuestoLinea=   new JScrollPane(jContentPaneDetallePresupuestoLinea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPresupuestoLinea.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPresupuestoLinea.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPresupuestoLinea.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralPresupuestoLinea=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPresupuestoLinea.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPresupuestoLinea.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPresupuestoLinea.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
			
			
	        this.gridBagConstraintsPresupuestoLinea.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsPresupuestoLinea.gridx = 0;
	        
			this.jContentPaneDetallePresupuestoLinea.add(jPanelCamposPresupuestoLinea, gridBagConstraintsPresupuestoLinea);
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			
			;
			//}
						
			this.conMaximoRelaciones=true;
			
			if(this.parametroGeneralUsuario.getcon_cargar_por_parte()) {
				
			}									
			
			//CARGA O NO CARGA RELACIONADOS(MAESTRO DETALLE)
									  // ABAJO VIENE DE PARAMETRO GENERAL USUARIO
			if(conMaximoRelaciones) { // && this.conFuncionalidadRelaciones) {
				if(!this.conCargarMinimo) {
					if(cargarRelaciones 
						&& presupuestolineaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.presupuestolineaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsPresupuestoLinea= new GridBagConstraints();
						this.gridBagConstraintsPresupuestoLinea.gridy = iGridyRelaciones++;
						this.gridBagConstraintsPresupuestoLinea.gridx = 0;
						this.jContentPaneDetallePresupuestoLinea.add(this.jTabbedPaneRelacionesPresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesPresupuestoLinea.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosPresupuestoLinea.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
					this.gridBagConstraintsPresupuestoLinea.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsPresupuestoLinea.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsPresupuestoLinea.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsPresupuestoLinea.gridx = 0;
					
				
					this.jContentPaneDetallePresupuestoLinea.add(jPanelCamposOcultosPresupuestoLinea, gridBagConstraintsPresupuestoLinea);
				
					this.jPanelCamposOcultosPresupuestoLinea.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoLinea.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsPresupuestoLinea.gridx = 0;
	        this.gridBagConstraintsPresupuestoLinea.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetallePresupuestoLinea.add(this.jPanelAccionesFormularioPresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);							
			
			
			
			this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
	        this.gridBagConstraintsPresupuestoLinea.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsPresupuestoLinea.gridx = 0;
	        
			
			this.jContentPaneDetallePresupuestoLinea.add(this.jPanelAccionesPresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionPresupuestoLinea);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionPresupuestoLinea=   new JScrollPane(this.jPanelCamposPresupuestoLinea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPresupuestoLinea.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPresupuestoLinea.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPresupuestoLinea.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoLinea.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsPresupuestoLinea.gridx = 0;
			this.gridBagConstraintsPresupuestoLinea.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsPresupuestoLinea.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsPresupuestoLinea.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionPresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoLinea.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPresupuestoLinea.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioPresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);			
			
			this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoLinea.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPresupuestoLinea.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesPresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoLinea.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresupuestoLinea.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);
			
			
		this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoLinea.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresupuestoLinea.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);
		
			
		this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoLinea.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPresupuestoLinea.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralPresupuestoLinea;//jContentPane;
		
		return jScrollPanelDatosEdicionPresupuestoLinea;
    } 
	
		
	
	
	
	
	
	
	
	
	/*
	case "CONTROL_BUSQUEDA":
		sKeyName="F3";
	case "CONTROL_BUSCAR":
		sKeyName="F4";
	case "CONTROL_ARBOL":
		sKeyName="F5";
	case "CONTROL_ACTUALIZAR":
		sKeyName="F6";
	sKeyName="N";					
	*/
}
