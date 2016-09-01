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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.cartera.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.cartera.util.RepresentanteLegalConstantesFunciones;

import com.bydan.erp.cartera.business.logic.*;
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
public class RepresentanteLegalDetalleFormJInternalFrame extends RepresentanteLegalBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleRepresentanteLegal;
	
	protected JMenuBar jmenuBarDetalleRepresentanteLegal;
	
	protected JMenu jmenuDetalleRepresentanteLegal;
	protected JMenu jmenuDetalleArchivoRepresentanteLegal;
	protected JMenu jmenuDetalleAccionesRepresentanteLegal;
	protected JMenu jmenuDetalleDatosRepresentanteLegal;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleRepresentanteLegal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutRepresentanteLegal;	
	protected GridBagConstraints gridBagConstraintsRepresentanteLegal;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected RepresentanteLegalBeanSwingJInternalFrameAdditional jInternalFrameDetalleRepresentanteLegal;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected TipoIdentificacionBeanSwingJInternalFrame tipoidentificacionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoidentificacion="";

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";

	protected CiudadBeanSwingJInternalFrame ciudadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ciudad="";
	
	public RepresentanteLegalSessionBean representantelegalSessionBean;
	
	
	
	
	public ClienteSessionBean clienteSessionBean;
	public TipoIdentificacionSessionBean tipoidentificacionSessionBean;
	public PaisSessionBean paisSessionBean;
	public CiudadSessionBean ciudadSessionBean;	
	
	public RepresentanteLegalLogic representantelegalLogic;
	
	public JScrollPane jScrollPanelDatosRepresentanteLegal;
	public JScrollPane jScrollPanelDatosEdicionRepresentanteLegal;
	public JScrollPane jScrollPanelDatosGeneralRepresentanteLegal;
	
	protected JPanel jPanelCamposRepresentanteLegal;    
	protected JPanel jPanelCamposOcultosRepresentanteLegal;    	
	protected JPanel jPanelAccionesRepresentanteLegal;
	protected JPanel jPanelAccionesFormularioRepresentanteLegal;
    
	
	
	protected Integer iXPanelCamposRepresentanteLegal=0;
	protected Integer iYPanelCamposRepresentanteLegal=0;
	
	protected Integer iXPanelCamposOcultosRepresentanteLegal=0;
	protected Integer iYPanelCamposOcultosRepresentanteLegal=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoRepresentanteLegal;
	public JButton jButtonModificarRepresentanteLegal;
	public JButton jButtonActualizarRepresentanteLegal;
    public JButton jButtonEliminarRepresentanteLegal;
	public JButton jButtonCancelarRepresentanteLegal;
    public JButton jButtonGuardarCambiosRepresentanteLegal;
	public JButton jButtonGuardarCambiosTablaRepresentanteLegal;
	protected JButton jButtonCerrarRepresentanteLegal;
	
	
	protected JButton jButtonProcesarInformacionRepresentanteLegal;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoRepresentanteLegal;
	protected JCheckBox jCheckBoxPostAccionSinCerrarRepresentanteLegal;
	protected JCheckBox jCheckBoxPostAccionSinMensajeRepresentanteLegal;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarRepresentanteLegal;
	protected JButton jButtonModificarToolBarRepresentanteLegal;
	protected JButton jButtonActualizarToolBarRepresentanteLegal;
    protected JButton jButtonEliminarToolBarRepresentanteLegal;
	protected JButton jButtonCancelarToolBarRepresentanteLegal;
    protected JButton jButtonGuardarCambiosToolBarRepresentanteLegal;
	protected JButton jButtonGuardarCambiosTablaToolBarRepresentanteLegal;
	protected JButton jButtonMostrarOcultarTablaToolBarRepresentanteLegal;
	protected JButton jButtonCerrarToolBarRepresentanteLegal;
	
	protected JButton jButtonProcesarInformacionToolBarRepresentanteLegal;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoRepresentanteLegal;
	protected JMenuItem jMenuItemModificarRepresentanteLegal;
	protected JMenuItem jMenuItemActualizarRepresentanteLegal;
    protected JMenuItem jMenuItemEliminarRepresentanteLegal;
	protected JMenuItem jMenuItemCancelarRepresentanteLegal;
    protected JMenuItem jMenuItemGuardarCambiosRepresentanteLegal;
	protected JMenuItem jMenuItemGuardarCambiosTablaRepresentanteLegal;
	protected JMenuItem jMenuItemCerrarRepresentanteLegal;
	protected JMenuItem jMenuItemDetalleCerrarRepresentanteLegal;
	protected JMenuItem jMenuItemDetalleMostarOcultarRepresentanteLegal;
	
	protected JMenuItem jMenuItemProcesarInformacionRepresentanteLegal;
	protected JMenuItem jMenuItemNuevoGuardarCambiosRepresentanteLegal;
	protected JMenuItem jMenuItemMostrarOcultarRepresentanteLegal;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesRepresentanteLegal;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesRepresentanteLegal;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesRepresentanteLegal;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioRepresentanteLegal;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidRepresentanteLegal;
	public JLabel jLabelIdRepresentanteLegal;
	public JLabel jLabelidRepresentanteLegal;
	public JButton jButtonidRepresentanteLegalBusqueda= new JButtonMe();

	public JPanel jPanelidentificacionRepresentanteLegal;
	public JLabel jLabelidentificacionRepresentanteLegal;
	public JTextField jTextFieldidentificacionRepresentanteLegal;
	public JButton jButtonidentificacionRepresentanteLegalBusqueda= new JButtonMe();

	public JPanel jPanelapellidopaternoRepresentanteLegal;
	public JLabel jLabelapellidopaternoRepresentanteLegal;
	public JTextArea jTextAreaapellidopaternoRepresentanteLegal;
	public JScrollPane jscrollPaneapellidopaternoRepresentanteLegal;
	public JButton jButtonapellidopaternoRepresentanteLegalBusqueda= new JButtonMe();

	public JPanel jPanelapellidomaternoRepresentanteLegal;
	public JLabel jLabelapellidomaternoRepresentanteLegal;
	public JTextArea jTextAreaapellidomaternoRepresentanteLegal;
	public JScrollPane jscrollPaneapellidomaternoRepresentanteLegal;
	public JButton jButtonapellidomaternoRepresentanteLegalBusqueda= new JButtonMe();

	public JPanel jPanelprimernombreRepresentanteLegal;
	public JLabel jLabelprimernombreRepresentanteLegal;
	public JTextArea jTextAreaprimernombreRepresentanteLegal;
	public JScrollPane jscrollPaneprimernombreRepresentanteLegal;
	public JButton jButtonprimernombreRepresentanteLegalBusqueda= new JButtonMe();

	public JPanel jPanelsegundonombreRepresentanteLegal;
	public JLabel jLabelsegundonombreRepresentanteLegal;
	public JTextArea jTextAreasegundonombreRepresentanteLegal;
	public JScrollPane jscrollPanesegundonombreRepresentanteLegal;
	public JButton jButtonsegundonombreRepresentanteLegalBusqueda= new JButtonMe();

	public JPanel jPaneldireccionRepresentanteLegal;
	public JLabel jLabeldireccionRepresentanteLegal;
	public JTextArea jTextAreadireccionRepresentanteLegal;
	public JScrollPane jscrollPanedireccionRepresentanteLegal;
	public JButton jButtondireccionRepresentanteLegalBusqueda= new JButtonMe();

	public JPanel jPaneltelefonoRepresentanteLegal;
	public JLabel jLabeltelefonoRepresentanteLegal;
	public JTextArea jTextAreatelefonoRepresentanteLegal;
	public JScrollPane jscrollPanetelefonoRepresentanteLegal;
	public JButton jButtontelefonoRepresentanteLegalBusqueda= new JButtonMe();

	public JPanel jPaneltelefonocodigoareaRepresentanteLegal;
	public JLabel jLabeltelefonocodigoareaRepresentanteLegal;
	public JTextField jTextFieldtelefonocodigoareaRepresentanteLegal;
	public JButton jButtontelefonocodigoareaRepresentanteLegalBusqueda= new JButtonMe();

	public JPanel jPanelextensionRepresentanteLegal;
	public JLabel jLabelextensionRepresentanteLegal;
	public JTextField jTextFieldextensionRepresentanteLegal;
	public JButton jButtonextensionRepresentanteLegalBusqueda= new JButtonMe();

	public JPanel jPaneltelefonomovilRepresentanteLegal;
	public JLabel jLabeltelefonomovilRepresentanteLegal;
	public JTextArea jTextAreatelefonomovilRepresentanteLegal;
	public JScrollPane jscrollPanetelefonomovilRepresentanteLegal;
	public JButton jButtontelefonomovilRepresentanteLegalBusqueda= new JButtonMe();

	public JPanel jPanelmontoaurorizadoRepresentanteLegal;
	public JLabel jLabelmontoaurorizadoRepresentanteLegal;
	public JTextField jTextFieldmontoaurorizadoRepresentanteLegal;
	public JButton jButtonmontoaurorizadoRepresentanteLegalBusqueda= new JButtonMe();

	public JPanel jPanelemailRepresentanteLegal;
	public JLabel jLabelemailRepresentanteLegal;
	public JTextArea jTextAreaemailRepresentanteLegal;
	public JScrollPane jscrollPaneemailRepresentanteLegal;
	public JButton jButtonemailRepresentanteLegalBusqueda= new JButtonMe();

	public JPanel jPanelestaactivoRepresentanteLegal;
	public JLabel jLabelestaactivoRepresentanteLegal;
	public JCheckBox jCheckBoxestaactivoRepresentanteLegal;
	public JButton jButtonestaactivoRepresentanteLegalBusqueda= new JButtonMe();

	
	public JPanel jPanelidclienteRepresentanteLegal;
	public JLabel jLabelidclienteRepresentanteLegal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxidclienteRepresentanteLegal;
	public JButton jButtonidclienteRepresentanteLegal= new JButtonMe();
	public JButton jButtonidclienteRepresentanteLegalUpdate= new JButtonMe();
	public JButton jButtonidclienteRepresentanteLegalBusqueda= new JButtonMe();

	public JPanel jPanelidvalorclientedocumentoRepresentanteLegal;
	public JLabel jLabelidvalorclientedocumentoRepresentanteLegal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxidvalorclientedocumentoRepresentanteLegal;
	public JButton jButtonidvalorclientedocumentoRepresentanteLegal= new JButtonMe();
	public JButton jButtonidvalorclientedocumentoRepresentanteLegalUpdate= new JButtonMe();
	public JButton jButtonidvalorclientedocumentoRepresentanteLegalBusqueda= new JButtonMe();

	public JPanel jPanelid_paisRepresentanteLegal;
	public JLabel jLabelid_paisRepresentanteLegal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisRepresentanteLegal;
	public JButton jButtonid_paisRepresentanteLegal= new JButtonMe();
	public JButton jButtonid_paisRepresentanteLegalUpdate= new JButtonMe();
	public JButton jButtonid_paisRepresentanteLegalBusqueda= new JButtonMe();

	public JPanel jPanelidciudadRepresentanteLegal;
	public JLabel jLabelidciudadRepresentanteLegal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxidciudadRepresentanteLegal;
	public JButton jButtonidciudadRepresentanteLegal= new JButtonMe();
	public JButton jButtonidciudadRepresentanteLegalUpdate= new JButtonMe();
	public JButton jButtonidciudadRepresentanteLegalBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesRepresentanteLegal;
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	public int iWidthFormulario=750;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightFormulario=990;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public RepresentanteLegalDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposRepresentanteLegal=new JPanel();
				this.jPanelAccionesFormularioRepresentanteLegal=new JPanel();
				this.jmenuBarDetalleRepresentanteLegal=new JMenuBar();
				this.jTtoolBarDetalleRepresentanteLegal=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RepresentanteLegalDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("RepresentanteLegal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public RepresentanteLegalDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("RepresentanteLegal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RepresentanteLegalDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("RepresentanteLegal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RepresentanteLegalDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("RepresentanteLegal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RepresentanteLegalDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("RepresentanteLegal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarRepresentanteLegal() {
		return this.jButtonActualizarToolBarRepresentanteLegal;
	}
	
	public JButton getjButtonEliminarToolBarRepresentanteLegal() {
		return this.jButtonEliminarToolBarRepresentanteLegal;
	}
	
	public JButton getjButtonCancelarToolBarRepresentanteLegal() {
		return this.jButtonCancelarToolBarRepresentanteLegal;
	}		
	
	public JButton getjButtonProcesarInformacionRepresentanteLegal() {
		return this.jButtonProcesarInformacionRepresentanteLegal;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionRepresentanteLegal)	{
		this.jButtonProcesarInformacionRepresentanteLegal = jButtonProcesarInformacionRepresentanteLegal;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesRepresentanteLegal() {
		return this.jComboBoxTiposAccionesRepresentanteLegal;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesRepresentanteLegal(
			JComboBox jComboBoxTiposRelacionesRepresentanteLegal) {
		this.jComboBoxTiposRelacionesRepresentanteLegal = jComboBoxTiposRelacionesRepresentanteLegal;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesRepresentanteLegal(
			JComboBox jComboBoxTiposAccionesRepresentanteLegal) {
		this.jComboBoxTiposAccionesRepresentanteLegal = jComboBoxTiposAccionesRepresentanteLegal;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioRepresentanteLegal() {
		return this.jComboBoxTiposAccionesFormularioRepresentanteLegal;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioRepresentanteLegal(
			JComboBox jComboBoxTiposAccionesFormularioRepresentanteLegal) {
		this.jComboBoxTiposAccionesFormularioRepresentanteLegal = jComboBoxTiposAccionesFormularioRepresentanteLegal;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.representantelegalSessionBean=new RepresentanteLegalSessionBean();
		
		this.representantelegalSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.representantelegalSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.representantelegalSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		RepresentanteLegalJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		RepresentanteLegalJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		RepresentanteLegalJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Representante Legal MANTENIMIENTO"));
		
		
		if(iWidth > 1950) {
			iWidth=1950;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.representantelegalSessionBean.getEsGuardarRelacionado()) {
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
	
		RepresentanteLegalJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleRepresentanteLegal= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarRepresentanteLegal=new JButtonMe();
				this.jButtonModificarToolBarRepresentanteLegal=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarRepresentanteLegal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarRepresentanteLegal,this.jTtoolBarDetalleRepresentanteLegal,
							"actualizar","actualizar","Actualizar"+" "+RepresentanteLegalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarRepresentanteLegal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarRepresentanteLegal,this.jTtoolBarDetalleRepresentanteLegal,
							"eliminar","eliminar","Eliminar"+" "+RepresentanteLegalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarRepresentanteLegal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarRepresentanteLegal,this.jTtoolBarDetalleRepresentanteLegal,
							"cancelar","cancelar","Cancelar"+" "+RepresentanteLegalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarRepresentanteLegal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarRepresentanteLegal,this.jTtoolBarDetalleRepresentanteLegal,
							"guardarcambios","guardarcambios","Guardar"+" "+RepresentanteLegalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarRepresentanteLegal,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarRepresentanteLegal,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarRepresentanteLegal,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleRepresentanteLegal=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleRepresentanteLegal=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoRepresentanteLegal=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesRepresentanteLegal=new JMenuMe("Acciones");
		this.jmenuDetalleDatosRepresentanteLegal=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoRepresentanteLegal= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoRepresentanteLegal.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRepresentanteLegal,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRepresentanteLegal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarRepresentanteLegal= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarRepresentanteLegal.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarRepresentanteLegal,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarRepresentanteLegal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarRepresentanteLegal= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarRepresentanteLegal.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarRepresentanteLegal,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarRepresentanteLegal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarRepresentanteLegal= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarRepresentanteLegal.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarRepresentanteLegal,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarRepresentanteLegal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarRepresentanteLegal= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarRepresentanteLegal.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarRepresentanteLegal,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarRepresentanteLegal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosRepresentanteLegal= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosRepresentanteLegal.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosRepresentanteLegal,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosRepresentanteLegal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarRepresentanteLegal= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarRepresentanteLegal.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarRepresentanteLegal,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarRepresentanteLegal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarRepresentanteLegal= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarRepresentanteLegal.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarRepresentanteLegal,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarRepresentanteLegal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarRepresentanteLegal= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarRepresentanteLegal.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarRepresentanteLegal,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarRepresentanteLegal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarRepresentanteLegal= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarRepresentanteLegal.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarRepresentanteLegal,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarRepresentanteLegal, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoRepresentanteLegal.add(this.jMenuItemDetalleCerrarRepresentanteLegal);
		
		this.jmenuDetalleAccionesRepresentanteLegal.add(this.jMenuItemActualizarRepresentanteLegal);
		this.jmenuDetalleAccionesRepresentanteLegal.add(this.jMenuItemEliminarRepresentanteLegal);
		this.jmenuDetalleAccionesRepresentanteLegal.add(this.jMenuItemCancelarRepresentanteLegal);		
		
		//this.jmenuDetalleDatosRepresentanteLegal.add(this.jMenuItemDetalleAbrirOrderByRepresentanteLegal);				
		this.jmenuDetalleDatosRepresentanteLegal.add(this.jMenuItemDetalleMostarOcultarRepresentanteLegal);				
				
		//this.jmenuDetalleAccionesRepresentanteLegal.add(this.jMenuItemGuardarCambiosRepresentanteLegal);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoRepresentanteLegal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesRepresentanteLegal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosRepresentanteLegal, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleRepresentanteLegal.add(this.jmenuDetalleArchivoRepresentanteLegal);		
		this.jmenuBarDetalleRepresentanteLegal.add(this.jmenuDetalleAccionesRepresentanteLegal);		
		this.jmenuBarDetalleRepresentanteLegal.add(this.jmenuDetalleDatosRepresentanteLegal);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleRepresentanteLegal);				
	}
	
	
	public void inicializarElementosCamposRepresentanteLegal() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdRepresentanteLegal = new JLabelMe();
		jLabelIdRepresentanteLegal.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdRepresentanteLegal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdRepresentanteLegal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdRepresentanteLegal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdRepresentanteLegal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidRepresentanteLegal = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidRepresentanteLegal.setToolTipText(RepresentanteLegalConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutRepresentanteLegal= new GridBagLayout();

		this.jPanelidRepresentanteLegal.setLayout(this.gridaBagLayoutRepresentanteLegal);

		jLabelidRepresentanteLegal = new JLabel();
		jLabelidRepresentanteLegal.setText("Id");

		jLabelidRepresentanteLegal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidRepresentanteLegal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidRepresentanteLegal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelidentificacionRepresentanteLegal = new JLabelMe();
		this.jLabelidentificacionRepresentanteLegal.setText(""+RepresentanteLegalConstantesFunciones.LABEL_IDENTIFICACION+" : *");
		this.jLabelidentificacionRepresentanteLegal.setToolTipText("Identificacion");
		this.jLabelidentificacionRepresentanteLegal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelidentificacionRepresentanteLegal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelidentificacionRepresentanteLegal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelidentificacionRepresentanteLegal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelidentificacionRepresentanteLegal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidentificacionRepresentanteLegal.setToolTipText(RepresentanteLegalConstantesFunciones.LABEL_IDENTIFICACION);
		this.gridaBagLayoutRepresentanteLegal = new GridBagLayout();
		this.jPanelidentificacionRepresentanteLegal.setLayout(this.gridaBagLayoutRepresentanteLegal);


		jTextFieldidentificacionRepresentanteLegal= new JTextFieldMe();

		jTextFieldidentificacionRepresentanteLegal.setEnabled(false);
		jTextFieldidentificacionRepresentanteLegal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldidentificacionRepresentanteLegal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldidentificacionRepresentanteLegal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldidentificacionRepresentanteLegal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonidentificacionRepresentanteLegalBusqueda= new JButtonMe();
		this.jButtonidentificacionRepresentanteLegalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidentificacionRepresentanteLegalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidentificacionRepresentanteLegalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonidentificacionRepresentanteLegalBusqueda.setText("U");
		this.jButtonidentificacionRepresentanteLegalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonidentificacionRepresentanteLegalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonidentificacionRepresentanteLegalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldidentificacionRepresentanteLegal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldidentificacionRepresentanteLegal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"identificacionRepresentanteLegalBusqueda"));

		if(this.representantelegalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonidentificacionRepresentanteLegalBusqueda.setVisible(false);		}


					
		this.jLabelapellidopaternoRepresentanteLegal = new JLabelMe();
		this.jLabelapellidopaternoRepresentanteLegal.setText(""+RepresentanteLegalConstantesFunciones.LABEL_APELLIDOPATERNO+" : *");
		this.jLabelapellidopaternoRepresentanteLegal.setToolTipText("Apellido Paterno");
		this.jLabelapellidopaternoRepresentanteLegal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelapellidopaternoRepresentanteLegal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelapellidopaternoRepresentanteLegal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelapellidopaternoRepresentanteLegal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelapellidopaternoRepresentanteLegal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelapellidopaternoRepresentanteLegal.setToolTipText(RepresentanteLegalConstantesFunciones.LABEL_APELLIDOPATERNO);
		this.gridaBagLayoutRepresentanteLegal = new GridBagLayout();
		this.jPanelapellidopaternoRepresentanteLegal.setLayout(this.gridaBagLayoutRepresentanteLegal);


		jTextAreaapellidopaternoRepresentanteLegal= new JTextAreaMe();
		jTextAreaapellidopaternoRepresentanteLegal.setEnabled(false);
		jTextAreaapellidopaternoRepresentanteLegal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaapellidopaternoRepresentanteLegal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaapellidopaternoRepresentanteLegal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaapellidopaternoRepresentanteLegal.setLineWrap(true);
		jTextAreaapellidopaternoRepresentanteLegal.setWrapStyleWord(true);
		jTextAreaapellidopaternoRepresentanteLegal.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaapellidopaternoRepresentanteLegal.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreaapellidopaternoRepresentanteLegal,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneapellidopaternoRepresentanteLegal = new JScrollPane(jTextAreaapellidopaternoRepresentanteLegal);
		jscrollPaneapellidopaternoRepresentanteLegal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneapellidopaternoRepresentanteLegal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneapellidopaternoRepresentanteLegal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonapellidopaternoRepresentanteLegalBusqueda= new JButtonMe();
		this.jButtonapellidopaternoRepresentanteLegalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonapellidopaternoRepresentanteLegalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonapellidopaternoRepresentanteLegalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonapellidopaternoRepresentanteLegalBusqueda.setText("U");
		this.jButtonapellidopaternoRepresentanteLegalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonapellidopaternoRepresentanteLegalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonapellidopaternoRepresentanteLegalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaapellidopaternoRepresentanteLegal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaapellidopaternoRepresentanteLegal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"apellidopaternoRepresentanteLegalBusqueda"));

		if(this.representantelegalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonapellidopaternoRepresentanteLegalBusqueda.setVisible(false);		}


					
		this.jLabelapellidomaternoRepresentanteLegal = new JLabelMe();
		this.jLabelapellidomaternoRepresentanteLegal.setText(""+RepresentanteLegalConstantesFunciones.LABEL_APELLIDOMATERNO+" : *");
		this.jLabelapellidomaternoRepresentanteLegal.setToolTipText("Apellido Materno");
		this.jLabelapellidomaternoRepresentanteLegal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelapellidomaternoRepresentanteLegal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelapellidomaternoRepresentanteLegal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelapellidomaternoRepresentanteLegal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelapellidomaternoRepresentanteLegal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelapellidomaternoRepresentanteLegal.setToolTipText(RepresentanteLegalConstantesFunciones.LABEL_APELLIDOMATERNO);
		this.gridaBagLayoutRepresentanteLegal = new GridBagLayout();
		this.jPanelapellidomaternoRepresentanteLegal.setLayout(this.gridaBagLayoutRepresentanteLegal);


		jTextAreaapellidomaternoRepresentanteLegal= new JTextAreaMe();
		jTextAreaapellidomaternoRepresentanteLegal.setEnabled(false);
		jTextAreaapellidomaternoRepresentanteLegal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaapellidomaternoRepresentanteLegal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaapellidomaternoRepresentanteLegal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaapellidomaternoRepresentanteLegal.setLineWrap(true);
		jTextAreaapellidomaternoRepresentanteLegal.setWrapStyleWord(true);
		jTextAreaapellidomaternoRepresentanteLegal.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaapellidomaternoRepresentanteLegal.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreaapellidomaternoRepresentanteLegal,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneapellidomaternoRepresentanteLegal = new JScrollPane(jTextAreaapellidomaternoRepresentanteLegal);
		jscrollPaneapellidomaternoRepresentanteLegal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneapellidomaternoRepresentanteLegal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneapellidomaternoRepresentanteLegal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonapellidomaternoRepresentanteLegalBusqueda= new JButtonMe();
		this.jButtonapellidomaternoRepresentanteLegalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonapellidomaternoRepresentanteLegalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonapellidomaternoRepresentanteLegalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonapellidomaternoRepresentanteLegalBusqueda.setText("U");
		this.jButtonapellidomaternoRepresentanteLegalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonapellidomaternoRepresentanteLegalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonapellidomaternoRepresentanteLegalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaapellidomaternoRepresentanteLegal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaapellidomaternoRepresentanteLegal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"apellidomaternoRepresentanteLegalBusqueda"));

		if(this.representantelegalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonapellidomaternoRepresentanteLegalBusqueda.setVisible(false);		}


					
		this.jLabelprimernombreRepresentanteLegal = new JLabelMe();
		this.jLabelprimernombreRepresentanteLegal.setText(""+RepresentanteLegalConstantesFunciones.LABEL_PRIMERNOMBRE+" : *");
		this.jLabelprimernombreRepresentanteLegal.setToolTipText("Primer Nombre");
		this.jLabelprimernombreRepresentanteLegal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprimernombreRepresentanteLegal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprimernombreRepresentanteLegal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelprimernombreRepresentanteLegal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelprimernombreRepresentanteLegal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelprimernombreRepresentanteLegal.setToolTipText(RepresentanteLegalConstantesFunciones.LABEL_PRIMERNOMBRE);
		this.gridaBagLayoutRepresentanteLegal = new GridBagLayout();
		this.jPanelprimernombreRepresentanteLegal.setLayout(this.gridaBagLayoutRepresentanteLegal);


		jTextAreaprimernombreRepresentanteLegal= new JTextAreaMe();
		jTextAreaprimernombreRepresentanteLegal.setEnabled(false);
		jTextAreaprimernombreRepresentanteLegal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaprimernombreRepresentanteLegal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaprimernombreRepresentanteLegal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaprimernombreRepresentanteLegal.setLineWrap(true);
		jTextAreaprimernombreRepresentanteLegal.setWrapStyleWord(true);
		jTextAreaprimernombreRepresentanteLegal.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaprimernombreRepresentanteLegal.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreaprimernombreRepresentanteLegal,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneprimernombreRepresentanteLegal = new JScrollPane(jTextAreaprimernombreRepresentanteLegal);
		jscrollPaneprimernombreRepresentanteLegal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneprimernombreRepresentanteLegal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneprimernombreRepresentanteLegal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonprimernombreRepresentanteLegalBusqueda= new JButtonMe();
		this.jButtonprimernombreRepresentanteLegalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprimernombreRepresentanteLegalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprimernombreRepresentanteLegalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonprimernombreRepresentanteLegalBusqueda.setText("U");
		this.jButtonprimernombreRepresentanteLegalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonprimernombreRepresentanteLegalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonprimernombreRepresentanteLegalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaprimernombreRepresentanteLegal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaprimernombreRepresentanteLegal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"primernombreRepresentanteLegalBusqueda"));

		if(this.representantelegalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonprimernombreRepresentanteLegalBusqueda.setVisible(false);		}


					
		this.jLabelsegundonombreRepresentanteLegal = new JLabelMe();
		this.jLabelsegundonombreRepresentanteLegal.setText(""+RepresentanteLegalConstantesFunciones.LABEL_SEGUNDONOMBRE+" : *");
		this.jLabelsegundonombreRepresentanteLegal.setToolTipText("Segundo Nombre");
		this.jLabelsegundonombreRepresentanteLegal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsegundonombreRepresentanteLegal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsegundonombreRepresentanteLegal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsegundonombreRepresentanteLegal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsegundonombreRepresentanteLegal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsegundonombreRepresentanteLegal.setToolTipText(RepresentanteLegalConstantesFunciones.LABEL_SEGUNDONOMBRE);
		this.gridaBagLayoutRepresentanteLegal = new GridBagLayout();
		this.jPanelsegundonombreRepresentanteLegal.setLayout(this.gridaBagLayoutRepresentanteLegal);


		jTextAreasegundonombreRepresentanteLegal= new JTextAreaMe();
		jTextAreasegundonombreRepresentanteLegal.setEnabled(false);
		jTextAreasegundonombreRepresentanteLegal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreasegundonombreRepresentanteLegal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreasegundonombreRepresentanteLegal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreasegundonombreRepresentanteLegal.setLineWrap(true);
		jTextAreasegundonombreRepresentanteLegal.setWrapStyleWord(true);
		jTextAreasegundonombreRepresentanteLegal.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreasegundonombreRepresentanteLegal.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreasegundonombreRepresentanteLegal,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanesegundonombreRepresentanteLegal = new JScrollPane(jTextAreasegundonombreRepresentanteLegal);
		jscrollPanesegundonombreRepresentanteLegal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanesegundonombreRepresentanteLegal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanesegundonombreRepresentanteLegal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonsegundonombreRepresentanteLegalBusqueda= new JButtonMe();
		this.jButtonsegundonombreRepresentanteLegalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsegundonombreRepresentanteLegalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsegundonombreRepresentanteLegalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsegundonombreRepresentanteLegalBusqueda.setText("U");
		this.jButtonsegundonombreRepresentanteLegalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsegundonombreRepresentanteLegalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsegundonombreRepresentanteLegalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreasegundonombreRepresentanteLegal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreasegundonombreRepresentanteLegal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"segundonombreRepresentanteLegalBusqueda"));

		if(this.representantelegalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsegundonombreRepresentanteLegalBusqueda.setVisible(false);		}


					
		this.jLabeldireccionRepresentanteLegal = new JLabelMe();
		this.jLabeldireccionRepresentanteLegal.setText(""+RepresentanteLegalConstantesFunciones.LABEL_DIRECCION+" : *");
		this.jLabeldireccionRepresentanteLegal.setToolTipText("Direccion");
		this.jLabeldireccionRepresentanteLegal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldireccionRepresentanteLegal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldireccionRepresentanteLegal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldireccionRepresentanteLegal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldireccionRepresentanteLegal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldireccionRepresentanteLegal.setToolTipText(RepresentanteLegalConstantesFunciones.LABEL_DIRECCION);
		this.gridaBagLayoutRepresentanteLegal = new GridBagLayout();
		this.jPaneldireccionRepresentanteLegal.setLayout(this.gridaBagLayoutRepresentanteLegal);


		jTextAreadireccionRepresentanteLegal= new JTextAreaMe();
		jTextAreadireccionRepresentanteLegal.setEnabled(false);
		jTextAreadireccionRepresentanteLegal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionRepresentanteLegal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionRepresentanteLegal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionRepresentanteLegal.setLineWrap(true);
		jTextAreadireccionRepresentanteLegal.setWrapStyleWord(true);
		jTextAreadireccionRepresentanteLegal.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadireccionRepresentanteLegal.setRows(9);

		FuncionesSwing.setBoldTextArea(jTextAreadireccionRepresentanteLegal,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedireccionRepresentanteLegal = new JScrollPane(jTextAreadireccionRepresentanteLegal);
		jscrollPanedireccionRepresentanteLegal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedireccionRepresentanteLegal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedireccionRepresentanteLegal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondireccionRepresentanteLegalBusqueda= new JButtonMe();
		this.jButtondireccionRepresentanteLegalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccionRepresentanteLegalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccionRepresentanteLegalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondireccionRepresentanteLegalBusqueda.setText("U");
		this.jButtondireccionRepresentanteLegalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondireccionRepresentanteLegalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondireccionRepresentanteLegalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadireccionRepresentanteLegal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadireccionRepresentanteLegal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"direccionRepresentanteLegalBusqueda"));

		if(this.representantelegalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondireccionRepresentanteLegalBusqueda.setVisible(false);		}


					
		this.jLabeltelefonoRepresentanteLegal = new JLabelMe();
		this.jLabeltelefonoRepresentanteLegal.setText(""+RepresentanteLegalConstantesFunciones.LABEL_TELEFONO+" : *");
		this.jLabeltelefonoRepresentanteLegal.setToolTipText("Telefono");
		this.jLabeltelefonoRepresentanteLegal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltelefonoRepresentanteLegal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltelefonoRepresentanteLegal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltelefonoRepresentanteLegal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltelefonoRepresentanteLegal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltelefonoRepresentanteLegal.setToolTipText(RepresentanteLegalConstantesFunciones.LABEL_TELEFONO);
		this.gridaBagLayoutRepresentanteLegal = new GridBagLayout();
		this.jPaneltelefonoRepresentanteLegal.setLayout(this.gridaBagLayoutRepresentanteLegal);


		jTextAreatelefonoRepresentanteLegal= new JTextAreaMe();
		jTextAreatelefonoRepresentanteLegal.setEnabled(false);
		jTextAreatelefonoRepresentanteLegal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefonoRepresentanteLegal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefonoRepresentanteLegal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefonoRepresentanteLegal.setLineWrap(true);
		jTextAreatelefonoRepresentanteLegal.setWrapStyleWord(true);
		jTextAreatelefonoRepresentanteLegal.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreatelefonoRepresentanteLegal.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreatelefonoRepresentanteLegal,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanetelefonoRepresentanteLegal = new JScrollPane(jTextAreatelefonoRepresentanteLegal);
		jscrollPanetelefonoRepresentanteLegal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanetelefonoRepresentanteLegal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanetelefonoRepresentanteLegal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtontelefonoRepresentanteLegalBusqueda= new JButtonMe();
		this.jButtontelefonoRepresentanteLegalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefonoRepresentanteLegalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefonoRepresentanteLegalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontelefonoRepresentanteLegalBusqueda.setText("U");
		this.jButtontelefonoRepresentanteLegalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontelefonoRepresentanteLegalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontelefonoRepresentanteLegalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreatelefonoRepresentanteLegal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreatelefonoRepresentanteLegal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"telefonoRepresentanteLegalBusqueda"));

		if(this.representantelegalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontelefonoRepresentanteLegalBusqueda.setVisible(false);		}


					
		this.jLabeltelefonocodigoareaRepresentanteLegal = new JLabelMe();
		this.jLabeltelefonocodigoareaRepresentanteLegal.setText(""+RepresentanteLegalConstantesFunciones.LABEL_TELEFONOCODIGOAREA+" : *");
		this.jLabeltelefonocodigoareaRepresentanteLegal.setToolTipText("Telefono Codigo Area");
		this.jLabeltelefonocodigoareaRepresentanteLegal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabeltelefonocodigoareaRepresentanteLegal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabeltelefonocodigoareaRepresentanteLegal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabeltelefonocodigoareaRepresentanteLegal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltelefonocodigoareaRepresentanteLegal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltelefonocodigoareaRepresentanteLegal.setToolTipText(RepresentanteLegalConstantesFunciones.LABEL_TELEFONOCODIGOAREA);
		this.gridaBagLayoutRepresentanteLegal = new GridBagLayout();
		this.jPaneltelefonocodigoareaRepresentanteLegal.setLayout(this.gridaBagLayoutRepresentanteLegal);


		jTextFieldtelefonocodigoareaRepresentanteLegal= new JTextFieldMe();

		jTextFieldtelefonocodigoareaRepresentanteLegal.setEnabled(false);
		jTextFieldtelefonocodigoareaRepresentanteLegal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtelefonocodigoareaRepresentanteLegal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtelefonocodigoareaRepresentanteLegal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtelefonocodigoareaRepresentanteLegal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtontelefonocodigoareaRepresentanteLegalBusqueda= new JButtonMe();
		this.jButtontelefonocodigoareaRepresentanteLegalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefonocodigoareaRepresentanteLegalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefonocodigoareaRepresentanteLegalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontelefonocodigoareaRepresentanteLegalBusqueda.setText("U");
		this.jButtontelefonocodigoareaRepresentanteLegalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontelefonocodigoareaRepresentanteLegalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontelefonocodigoareaRepresentanteLegalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtelefonocodigoareaRepresentanteLegal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtelefonocodigoareaRepresentanteLegal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"telefonocodigoareaRepresentanteLegalBusqueda"));

		if(this.representantelegalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontelefonocodigoareaRepresentanteLegalBusqueda.setVisible(false);		}


					
		this.jLabelextensionRepresentanteLegal = new JLabelMe();
		this.jLabelextensionRepresentanteLegal.setText(""+RepresentanteLegalConstantesFunciones.LABEL_EXTENSION+" : *");
		this.jLabelextensionRepresentanteLegal.setToolTipText("Extension");
		this.jLabelextensionRepresentanteLegal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelextensionRepresentanteLegal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelextensionRepresentanteLegal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelextensionRepresentanteLegal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelextensionRepresentanteLegal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelextensionRepresentanteLegal.setToolTipText(RepresentanteLegalConstantesFunciones.LABEL_EXTENSION);
		this.gridaBagLayoutRepresentanteLegal = new GridBagLayout();
		this.jPanelextensionRepresentanteLegal.setLayout(this.gridaBagLayoutRepresentanteLegal);


		jTextFieldextensionRepresentanteLegal= new JTextFieldMe();

		jTextFieldextensionRepresentanteLegal.setEnabled(false);
		jTextFieldextensionRepresentanteLegal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldextensionRepresentanteLegal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldextensionRepresentanteLegal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldextensionRepresentanteLegal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonextensionRepresentanteLegalBusqueda= new JButtonMe();
		this.jButtonextensionRepresentanteLegalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonextensionRepresentanteLegalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonextensionRepresentanteLegalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonextensionRepresentanteLegalBusqueda.setText("U");
		this.jButtonextensionRepresentanteLegalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonextensionRepresentanteLegalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonextensionRepresentanteLegalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldextensionRepresentanteLegal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldextensionRepresentanteLegal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"extensionRepresentanteLegalBusqueda"));

		if(this.representantelegalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonextensionRepresentanteLegalBusqueda.setVisible(false);		}


					
		this.jLabeltelefonomovilRepresentanteLegal = new JLabelMe();
		this.jLabeltelefonomovilRepresentanteLegal.setText(""+RepresentanteLegalConstantesFunciones.LABEL_TELEFONOMOVIL+" : *");
		this.jLabeltelefonomovilRepresentanteLegal.setToolTipText("Telefono Movil");
		this.jLabeltelefonomovilRepresentanteLegal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltelefonomovilRepresentanteLegal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltelefonomovilRepresentanteLegal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltelefonomovilRepresentanteLegal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltelefonomovilRepresentanteLegal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltelefonomovilRepresentanteLegal.setToolTipText(RepresentanteLegalConstantesFunciones.LABEL_TELEFONOMOVIL);
		this.gridaBagLayoutRepresentanteLegal = new GridBagLayout();
		this.jPaneltelefonomovilRepresentanteLegal.setLayout(this.gridaBagLayoutRepresentanteLegal);


		jTextAreatelefonomovilRepresentanteLegal= new JTextAreaMe();
		jTextAreatelefonomovilRepresentanteLegal.setEnabled(false);
		jTextAreatelefonomovilRepresentanteLegal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefonomovilRepresentanteLegal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefonomovilRepresentanteLegal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefonomovilRepresentanteLegal.setLineWrap(true);
		jTextAreatelefonomovilRepresentanteLegal.setWrapStyleWord(true);
		jTextAreatelefonomovilRepresentanteLegal.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreatelefonomovilRepresentanteLegal.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreatelefonomovilRepresentanteLegal,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanetelefonomovilRepresentanteLegal = new JScrollPane(jTextAreatelefonomovilRepresentanteLegal);
		jscrollPanetelefonomovilRepresentanteLegal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanetelefonomovilRepresentanteLegal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanetelefonomovilRepresentanteLegal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtontelefonomovilRepresentanteLegalBusqueda= new JButtonMe();
		this.jButtontelefonomovilRepresentanteLegalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefonomovilRepresentanteLegalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefonomovilRepresentanteLegalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontelefonomovilRepresentanteLegalBusqueda.setText("U");
		this.jButtontelefonomovilRepresentanteLegalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontelefonomovilRepresentanteLegalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontelefonomovilRepresentanteLegalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreatelefonomovilRepresentanteLegal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreatelefonomovilRepresentanteLegal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"telefonomovilRepresentanteLegalBusqueda"));

		if(this.representantelegalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontelefonomovilRepresentanteLegalBusqueda.setVisible(false);		}


					
		this.jLabelmontoaurorizadoRepresentanteLegal = new JLabelMe();
		this.jLabelmontoaurorizadoRepresentanteLegal.setText(""+RepresentanteLegalConstantesFunciones.LABEL_MONTOAURORIZADO+" : *");
		this.jLabelmontoaurorizadoRepresentanteLegal.setToolTipText("Monto Aurorizado");
		this.jLabelmontoaurorizadoRepresentanteLegal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelmontoaurorizadoRepresentanteLegal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelmontoaurorizadoRepresentanteLegal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelmontoaurorizadoRepresentanteLegal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelmontoaurorizadoRepresentanteLegal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelmontoaurorizadoRepresentanteLegal.setToolTipText(RepresentanteLegalConstantesFunciones.LABEL_MONTOAURORIZADO);
		this.gridaBagLayoutRepresentanteLegal = new GridBagLayout();
		this.jPanelmontoaurorizadoRepresentanteLegal.setLayout(this.gridaBagLayoutRepresentanteLegal);


		jTextFieldmontoaurorizadoRepresentanteLegal= new JTextFieldMe();
		jTextFieldmontoaurorizadoRepresentanteLegal.setEnabled(false);
		jTextFieldmontoaurorizadoRepresentanteLegal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmontoaurorizadoRepresentanteLegal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmontoaurorizadoRepresentanteLegal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldmontoaurorizadoRepresentanteLegal,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldmontoaurorizadoRepresentanteLegal.setText("0.0");

		this.jButtonmontoaurorizadoRepresentanteLegalBusqueda= new JButtonMe();
		this.jButtonmontoaurorizadoRepresentanteLegalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmontoaurorizadoRepresentanteLegalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmontoaurorizadoRepresentanteLegalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonmontoaurorizadoRepresentanteLegalBusqueda.setText("U");
		this.jButtonmontoaurorizadoRepresentanteLegalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonmontoaurorizadoRepresentanteLegalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonmontoaurorizadoRepresentanteLegalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldmontoaurorizadoRepresentanteLegal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldmontoaurorizadoRepresentanteLegal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"montoaurorizadoRepresentanteLegalBusqueda"));

		if(this.representantelegalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonmontoaurorizadoRepresentanteLegalBusqueda.setVisible(false);		}


					
		this.jLabelemailRepresentanteLegal = new JLabelMe();
		this.jLabelemailRepresentanteLegal.setText(""+RepresentanteLegalConstantesFunciones.LABEL_EMAIL+" : *");
		this.jLabelemailRepresentanteLegal.setToolTipText("Email");
		this.jLabelemailRepresentanteLegal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelemailRepresentanteLegal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelemailRepresentanteLegal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelemailRepresentanteLegal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelemailRepresentanteLegal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelemailRepresentanteLegal.setToolTipText(RepresentanteLegalConstantesFunciones.LABEL_EMAIL);
		this.gridaBagLayoutRepresentanteLegal = new GridBagLayout();
		this.jPanelemailRepresentanteLegal.setLayout(this.gridaBagLayoutRepresentanteLegal);


		jTextAreaemailRepresentanteLegal= new JTextAreaMe();
		jTextAreaemailRepresentanteLegal.setEnabled(false);
		jTextAreaemailRepresentanteLegal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaemailRepresentanteLegal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaemailRepresentanteLegal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaemailRepresentanteLegal.setLineWrap(true);
		jTextAreaemailRepresentanteLegal.setWrapStyleWord(true);
		jTextAreaemailRepresentanteLegal.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaemailRepresentanteLegal.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreaemailRepresentanteLegal,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneemailRepresentanteLegal = new JScrollPane(jTextAreaemailRepresentanteLegal);
		jscrollPaneemailRepresentanteLegal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPaneemailRepresentanteLegal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPaneemailRepresentanteLegal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtonemailRepresentanteLegalBusqueda= new JButtonMe();
		this.jButtonemailRepresentanteLegalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonemailRepresentanteLegalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonemailRepresentanteLegalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonemailRepresentanteLegalBusqueda.setText("U");
		this.jButtonemailRepresentanteLegalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonemailRepresentanteLegalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonemailRepresentanteLegalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaemailRepresentanteLegal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaemailRepresentanteLegal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"emailRepresentanteLegalBusqueda"));

		if(this.representantelegalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonemailRepresentanteLegalBusqueda.setVisible(false);		}


					
		this.jLabelestaactivoRepresentanteLegal = new JLabelMe();
		this.jLabelestaactivoRepresentanteLegal.setText(""+RepresentanteLegalConstantesFunciones.LABEL_ESTAACTIVO+" : *");
		this.jLabelestaactivoRepresentanteLegal.setToolTipText("Esta Activo");
		this.jLabelestaactivoRepresentanteLegal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelestaactivoRepresentanteLegal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelestaactivoRepresentanteLegal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelestaactivoRepresentanteLegal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelestaactivoRepresentanteLegal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelestaactivoRepresentanteLegal.setToolTipText(RepresentanteLegalConstantesFunciones.LABEL_ESTAACTIVO);
		this.gridaBagLayoutRepresentanteLegal = new GridBagLayout();
		this.jPanelestaactivoRepresentanteLegal.setLayout(this.gridaBagLayoutRepresentanteLegal);


		jCheckBoxestaactivoRepresentanteLegal= new JCheckBoxMe();
		jCheckBoxestaactivoRepresentanteLegal.setEnabled(false);

		jCheckBoxestaactivoRepresentanteLegal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxestaactivoRepresentanteLegal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxestaactivoRepresentanteLegal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxestaactivoRepresentanteLegal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonestaactivoRepresentanteLegalBusqueda= new JButtonMe();
		this.jButtonestaactivoRepresentanteLegalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonestaactivoRepresentanteLegalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonestaactivoRepresentanteLegalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonestaactivoRepresentanteLegalBusqueda.setText("U");
		this.jButtonestaactivoRepresentanteLegalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonestaactivoRepresentanteLegalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonestaactivoRepresentanteLegalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxestaactivoRepresentanteLegal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxestaactivoRepresentanteLegal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"estaactivoRepresentanteLegalBusqueda"));

		if(this.representantelegalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonestaactivoRepresentanteLegalBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysRepresentanteLegal() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelidclienteRepresentanteLegal = new JLabelMe();
		this.jLabelidclienteRepresentanteLegal.setText(""+RepresentanteLegalConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelidclienteRepresentanteLegal.setToolTipText("Cliente");
		this.jLabelidclienteRepresentanteLegal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelidclienteRepresentanteLegal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelidclienteRepresentanteLegal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelidclienteRepresentanteLegal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelidclienteRepresentanteLegal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidclienteRepresentanteLegal.setToolTipText(RepresentanteLegalConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutRepresentanteLegal = new GridBagLayout();
		this.jPanelidclienteRepresentanteLegal.setLayout(this.gridaBagLayoutRepresentanteLegal);


		jComboBoxidclienteRepresentanteLegal= new JComboBoxMe();
		jComboBoxidclienteRepresentanteLegal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidclienteRepresentanteLegal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidclienteRepresentanteLegal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxidclienteRepresentanteLegal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonidclienteRepresentanteLegal= new JButtonMe();
		this.jButtonidclienteRepresentanteLegal.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonidclienteRepresentanteLegal.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonidclienteRepresentanteLegal.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonidclienteRepresentanteLegal.setText("Buscar");
		this.jButtonidclienteRepresentanteLegal.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonidclienteRepresentanteLegal.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonidclienteRepresentanteLegal,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxidclienteRepresentanteLegal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxidclienteRepresentanteLegal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"idclienteRepresentanteLegal"));

		this.jButtonidclienteRepresentanteLegalBusqueda= new JButtonMe();
		this.jButtonidclienteRepresentanteLegalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidclienteRepresentanteLegalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidclienteRepresentanteLegalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonidclienteRepresentanteLegalBusqueda.setText("U");
		this.jButtonidclienteRepresentanteLegalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonidclienteRepresentanteLegalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonidclienteRepresentanteLegalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxidclienteRepresentanteLegal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxidclienteRepresentanteLegal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"idclienteRepresentanteLegalBusqueda"));

		if(this.representantelegalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonidclienteRepresentanteLegalBusqueda.setVisible(false);		}

		this.jButtonidclienteRepresentanteLegalUpdate= new JButtonMe();
		this.jButtonidclienteRepresentanteLegalUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidclienteRepresentanteLegalUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidclienteRepresentanteLegalUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonidclienteRepresentanteLegalUpdate.setText("U");
		this.jButtonidclienteRepresentanteLegalUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonidclienteRepresentanteLegalUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonidclienteRepresentanteLegalUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxidclienteRepresentanteLegal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxidclienteRepresentanteLegal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"idclienteRepresentanteLegalUpdate"));



					
		this.jLabelidvalorclientedocumentoRepresentanteLegal = new JLabelMe();
		this.jLabelidvalorclientedocumentoRepresentanteLegal.setText(""+RepresentanteLegalConstantesFunciones.LABEL_IDTIPOIDENTIFICACION+" : *");
		this.jLabelidvalorclientedocumentoRepresentanteLegal.setToolTipText("Tipo Identificacion");
		this.jLabelidvalorclientedocumentoRepresentanteLegal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelidvalorclientedocumentoRepresentanteLegal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelidvalorclientedocumentoRepresentanteLegal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelidvalorclientedocumentoRepresentanteLegal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelidvalorclientedocumentoRepresentanteLegal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidvalorclientedocumentoRepresentanteLegal.setToolTipText(RepresentanteLegalConstantesFunciones.LABEL_IDTIPOIDENTIFICACION);
		this.gridaBagLayoutRepresentanteLegal = new GridBagLayout();
		this.jPanelidvalorclientedocumentoRepresentanteLegal.setLayout(this.gridaBagLayoutRepresentanteLegal);


		jComboBoxidvalorclientedocumentoRepresentanteLegal= new JComboBoxMe();
		jComboBoxidvalorclientedocumentoRepresentanteLegal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidvalorclientedocumentoRepresentanteLegal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidvalorclientedocumentoRepresentanteLegal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxidvalorclientedocumentoRepresentanteLegal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonidvalorclientedocumentoRepresentanteLegal= new JButtonMe();
		this.jButtonidvalorclientedocumentoRepresentanteLegal.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonidvalorclientedocumentoRepresentanteLegal.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonidvalorclientedocumentoRepresentanteLegal.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonidvalorclientedocumentoRepresentanteLegal.setText("Buscar");
		this.jButtonidvalorclientedocumentoRepresentanteLegal.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonidvalorclientedocumentoRepresentanteLegal.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonidvalorclientedocumentoRepresentanteLegal,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxidvalorclientedocumentoRepresentanteLegal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxidvalorclientedocumentoRepresentanteLegal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"idvalorclientedocumentoRepresentanteLegal"));

		this.jButtonidvalorclientedocumentoRepresentanteLegalBusqueda= new JButtonMe();
		this.jButtonidvalorclientedocumentoRepresentanteLegalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidvalorclientedocumentoRepresentanteLegalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidvalorclientedocumentoRepresentanteLegalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonidvalorclientedocumentoRepresentanteLegalBusqueda.setText("U");
		this.jButtonidvalorclientedocumentoRepresentanteLegalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonidvalorclientedocumentoRepresentanteLegalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonidvalorclientedocumentoRepresentanteLegalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxidvalorclientedocumentoRepresentanteLegal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxidvalorclientedocumentoRepresentanteLegal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"idvalorclientedocumentoRepresentanteLegalBusqueda"));

		if(this.representantelegalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonidvalorclientedocumentoRepresentanteLegalBusqueda.setVisible(false);		}

		this.jButtonidvalorclientedocumentoRepresentanteLegalUpdate= new JButtonMe();
		this.jButtonidvalorclientedocumentoRepresentanteLegalUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidvalorclientedocumentoRepresentanteLegalUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidvalorclientedocumentoRepresentanteLegalUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonidvalorclientedocumentoRepresentanteLegalUpdate.setText("U");
		this.jButtonidvalorclientedocumentoRepresentanteLegalUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonidvalorclientedocumentoRepresentanteLegalUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonidvalorclientedocumentoRepresentanteLegalUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxidvalorclientedocumentoRepresentanteLegal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxidvalorclientedocumentoRepresentanteLegal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"idvalorclientedocumentoRepresentanteLegalUpdate"));



					
		this.jLabelid_paisRepresentanteLegal = new JLabelMe();
		this.jLabelid_paisRepresentanteLegal.setText(""+RepresentanteLegalConstantesFunciones.LABEL_IDPAIS+" : *");
		this.jLabelid_paisRepresentanteLegal.setToolTipText("Pais");
		this.jLabelid_paisRepresentanteLegal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisRepresentanteLegal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisRepresentanteLegal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_paisRepresentanteLegal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_paisRepresentanteLegal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_paisRepresentanteLegal.setToolTipText(RepresentanteLegalConstantesFunciones.LABEL_IDPAIS);
		this.gridaBagLayoutRepresentanteLegal = new GridBagLayout();
		this.jPanelid_paisRepresentanteLegal.setLayout(this.gridaBagLayoutRepresentanteLegal);


		jComboBoxid_paisRepresentanteLegal= new JComboBoxMe();
		jComboBoxid_paisRepresentanteLegal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisRepresentanteLegal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisRepresentanteLegal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisRepresentanteLegal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_paisRepresentanteLegal= new JButtonMe();
		this.jButtonid_paisRepresentanteLegal.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisRepresentanteLegal.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisRepresentanteLegal.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisRepresentanteLegal.setText("Buscar");
		this.jButtonid_paisRepresentanteLegal.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_paisRepresentanteLegal.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisRepresentanteLegal,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_paisRepresentanteLegal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisRepresentanteLegal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisRepresentanteLegal"));

		this.jButtonid_paisRepresentanteLegalBusqueda= new JButtonMe();
		this.jButtonid_paisRepresentanteLegalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisRepresentanteLegalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisRepresentanteLegalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisRepresentanteLegalBusqueda.setText("U");
		this.jButtonid_paisRepresentanteLegalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_paisRepresentanteLegalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisRepresentanteLegalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_paisRepresentanteLegal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisRepresentanteLegal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisRepresentanteLegalBusqueda"));

		if(this.representantelegalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_paisRepresentanteLegalBusqueda.setVisible(false);		}

		this.jButtonid_paisRepresentanteLegalUpdate= new JButtonMe();
		this.jButtonid_paisRepresentanteLegalUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisRepresentanteLegalUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisRepresentanteLegalUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisRepresentanteLegalUpdate.setText("U");
		this.jButtonid_paisRepresentanteLegalUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_paisRepresentanteLegalUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisRepresentanteLegalUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_paisRepresentanteLegal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisRepresentanteLegal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisRepresentanteLegalUpdate"));



					
		this.jLabelidciudadRepresentanteLegal = new JLabelMe();
		this.jLabelidciudadRepresentanteLegal.setText(""+RepresentanteLegalConstantesFunciones.LABEL_IDCIUDAD+" : *");
		this.jLabelidciudadRepresentanteLegal.setToolTipText("Ciudad");
		this.jLabelidciudadRepresentanteLegal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelidciudadRepresentanteLegal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelidciudadRepresentanteLegal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelidciudadRepresentanteLegal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelidciudadRepresentanteLegal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidciudadRepresentanteLegal.setToolTipText(RepresentanteLegalConstantesFunciones.LABEL_IDCIUDAD);
		this.gridaBagLayoutRepresentanteLegal = new GridBagLayout();
		this.jPanelidciudadRepresentanteLegal.setLayout(this.gridaBagLayoutRepresentanteLegal);


		jComboBoxidciudadRepresentanteLegal= new JComboBoxMe();
		jComboBoxidciudadRepresentanteLegal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidciudadRepresentanteLegal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidciudadRepresentanteLegal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxidciudadRepresentanteLegal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonidciudadRepresentanteLegal= new JButtonMe();
		this.jButtonidciudadRepresentanteLegal.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonidciudadRepresentanteLegal.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonidciudadRepresentanteLegal.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonidciudadRepresentanteLegal.setText("Buscar");
		this.jButtonidciudadRepresentanteLegal.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonidciudadRepresentanteLegal.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonidciudadRepresentanteLegal,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxidciudadRepresentanteLegal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxidciudadRepresentanteLegal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"idciudadRepresentanteLegal"));

		this.jButtonidciudadRepresentanteLegalBusqueda= new JButtonMe();
		this.jButtonidciudadRepresentanteLegalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidciudadRepresentanteLegalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidciudadRepresentanteLegalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonidciudadRepresentanteLegalBusqueda.setText("U");
		this.jButtonidciudadRepresentanteLegalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonidciudadRepresentanteLegalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonidciudadRepresentanteLegalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxidciudadRepresentanteLegal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxidciudadRepresentanteLegal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"idciudadRepresentanteLegalBusqueda"));

		if(this.representantelegalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonidciudadRepresentanteLegalBusqueda.setVisible(false);		}

		this.jButtonidciudadRepresentanteLegalUpdate= new JButtonMe();
		this.jButtonidciudadRepresentanteLegalUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidciudadRepresentanteLegalUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidciudadRepresentanteLegalUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonidciudadRepresentanteLegalUpdate.setText("U");
		this.jButtonidciudadRepresentanteLegalUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonidciudadRepresentanteLegalUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonidciudadRepresentanteLegalUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxidciudadRepresentanteLegal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxidciudadRepresentanteLegal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"idciudadRepresentanteLegalUpdate"));



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
		//this.jInternalFrameDetalleRepresentanteLegal = new RepresentanteLegalBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Representante Legal DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutRepresentanteLegal= new GridBagLayout();
		

		
		String sToolTipRepresentanteLegal="";
		sToolTipRepresentanteLegal=RepresentanteLegalConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipRepresentanteLegal+="(Cartera.RepresentanteLegal)";
		}
		
		if(!this.representantelegalSessionBean.getEsGuardarRelacionado()) {
			sToolTipRepresentanteLegal+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoRepresentanteLegal = new JButtonMe();
		this.jButtonModificarRepresentanteLegal = new JButtonMe();
        this.jButtonActualizarRepresentanteLegal = new JButtonMe();
        this.jButtonEliminarRepresentanteLegal = new JButtonMe();
        this.jButtonCancelarRepresentanteLegal = new JButtonMe();
        this.jButtonGuardarCambiosRepresentanteLegal = new JButtonMe();
		this.jButtonGuardarCambiosTablaRepresentanteLegal = new JButtonMe();
		this.jButtonCerrarRepresentanteLegal = new JButtonMe();
		
		this.jScrollPanelDatosRepresentanteLegal = new JScrollPane();   
        this.jScrollPanelDatosEdicionRepresentanteLegal = new JScrollPane();
		this.jScrollPanelDatosGeneralRepresentanteLegal = new JScrollPane();
				
		
		
		this.jPanelCamposRepresentanteLegal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosRepresentanteLegal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesRepresentanteLegal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioRepresentanteLegal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Representante Legal";
		
		if(!this.representantelegalSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosRepresentanteLegal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Representante Legales" + this.sPath));
		} else {
			this.jScrollPanelDatosRepresentanteLegal.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionRepresentanteLegal.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralRepresentanteLegal.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposRepresentanteLegal.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposRepresentanteLegal.setName("jPanelCamposRepresentanteLegal"); 

		this.jPanelCamposOcultosRepresentanteLegal.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosRepresentanteLegal.setName("jPanelCamposOcultosRepresentanteLegal"); 

        this.jPanelAccionesRepresentanteLegal.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesRepresentanteLegal.setToolTipText("Acciones");
        this.jPanelAccionesRepresentanteLegal.setName("Acciones"); 

		this.jPanelAccionesFormularioRepresentanteLegal.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioRepresentanteLegal.setToolTipText("Acciones");
        this.jPanelAccionesFormularioRepresentanteLegal.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionRepresentanteLegal, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralRepresentanteLegal, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosRepresentanteLegal, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposRepresentanteLegal, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosRepresentanteLegal, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioRepresentanteLegal, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoRepresentanteLegal.setText("Nuevo");
		this.jButtonModificarRepresentanteLegal.setText("Editar");
        this.jButtonActualizarRepresentanteLegal.setText("Actualizar");
        this.jButtonEliminarRepresentanteLegal.setText("Eliminar");
        this.jButtonCancelarRepresentanteLegal.setText("Cancelar");
        this.jButtonGuardarCambiosRepresentanteLegal.setText("Guardar");
		this.jButtonGuardarCambiosTablaRepresentanteLegal.setText("Guardar");
		this.jButtonCerrarRepresentanteLegal.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRepresentanteLegal,"nuevo_button","Nuevo",this.representantelegalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarRepresentanteLegal,"modificar_button","Editar",this.representantelegalSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarRepresentanteLegal,"actualizar_button","Actualizar",this.representantelegalSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarRepresentanteLegal,"eliminar_button","Eliminar",this.representantelegalSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarRepresentanteLegal,"cancelar_button","Cancelar",this.representantelegalSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosRepresentanteLegal,"guardarcambios_button","Guardar",this.representantelegalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaRepresentanteLegal,"guardarcambiostabla_button","Guardar",this.representantelegalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarRepresentanteLegal,"cerrar_button","Salir",this.representantelegalSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoRepresentanteLegal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarRepresentanteLegal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosRepresentanteLegal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaRepresentanteLegal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarRepresentanteLegal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarRepresentanteLegal, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarRepresentanteLegal, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarRepresentanteLegal, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoRepresentanteLegal.setToolTipText("Nuevo"+" "+RepresentanteLegalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarRepresentanteLegal.setToolTipText("Editar"+" "+RepresentanteLegalConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarRepresentanteLegal.setToolTipText("Actualizar"+" "+RepresentanteLegalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarRepresentanteLegal.setToolTipText("Eliminar)"+" "+RepresentanteLegalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarRepresentanteLegal.setToolTipText("Cancelar"+" "+RepresentanteLegalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosRepresentanteLegal.setToolTipText("Guardar"+" "+RepresentanteLegalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaRepresentanteLegal.setToolTipText("Guardar"+" "+RepresentanteLegalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarRepresentanteLegal.setToolTipText("Salir"+" "+RepresentanteLegalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoRepresentanteLegal";
		inputMap = this.jButtonNuevoRepresentanteLegal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoRepresentanteLegal.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoRepresentanteLegal"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarRepresentanteLegal";
		inputMap = this.jButtonActualizarRepresentanteLegal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarRepresentanteLegal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarRepresentanteLegal"));
		
		//ELIMINAR
		sMapKey = "EliminarRepresentanteLegal";
		inputMap = this.jButtonEliminarRepresentanteLegal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarRepresentanteLegal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarRepresentanteLegal"));
		
		//CANCELAR	
		sMapKey = "CancelarRepresentanteLegal";
		inputMap = this.jButtonCancelarRepresentanteLegal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarRepresentanteLegal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarRepresentanteLegal"));
		
		//CERRAR		
		sMapKey = "CerrarRepresentanteLegal";
		inputMap = this.jButtonCerrarRepresentanteLegal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarRepresentanteLegal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarRepresentanteLegal"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaRepresentanteLegal";
		inputMap = this.jButtonGuardarCambiosTablaRepresentanteLegal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaRepresentanteLegal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaRepresentanteLegal"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoRepresentanteLegal = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoRepresentanteLegal.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoRepresentanteLegal.setToolTipText("Nuevo RepresentanteLegal");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoRepresentanteLegal, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarRepresentanteLegal = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarRepresentanteLegal.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarRepresentanteLegal.setToolTipText("Sin Cerrar Ventana RepresentanteLegal");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarRepresentanteLegal, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeRepresentanteLegal = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeRepresentanteLegal.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeRepresentanteLegal.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeRepresentanteLegal, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesRepresentanteLegal = new JComboBoxMe();
		//this.jComboBoxTiposAccionesRepresentanteLegal.setText("Accion");
		this.jComboBoxTiposAccionesRepresentanteLegal.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioRepresentanteLegal = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioRepresentanteLegal.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioRepresentanteLegal.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesRepresentanteLegal = new JLabelMe();
		
		this.jLabelAccionesRepresentanteLegal.setText("Acciones");		
		this.jLabelAccionesRepresentanteLegal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesRepresentanteLegal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesRepresentanteLegal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposRepresentanteLegal();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysRepresentanteLegal();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesRepresentanteLegal=new JTabbedPane();
		this.jTabbedPaneRelacionesRepresentanteLegal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesRepresentanteLegal,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesRepresentanteLegal.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesRepresentanteLegal.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesRepresentanteLegal.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesRepresentanteLegal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioRepresentanteLegal.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioRepresentanteLegal.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioRepresentanteLegal.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioRepresentanteLegal, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposRepresentanteLegal = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosRepresentanteLegal = new GridBagLayout();
		
		this.jPanelCamposRepresentanteLegal.setLayout(gridaBagLayoutCamposRepresentanteLegal);
		this.jPanelCamposOcultosRepresentanteLegal.setLayout(gridaBagLayoutCamposOcultosRepresentanteLegal);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
	this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRepresentanteLegal.gridy = 0;
	this.gridBagConstraintsRepresentanteLegal.gridx = 0;
	this.gridBagConstraintsRepresentanteLegal.ipadx = 0;
	this.gridBagConstraintsRepresentanteLegal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidRepresentanteLegal.add(jLabelIdRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);



	this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
	this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRepresentanteLegal.gridy = 0;
	this.gridBagConstraintsRepresentanteLegal.gridx = 1;
	this.gridBagConstraintsRepresentanteLegal.ipadx = 0;
	this.gridBagConstraintsRepresentanteLegal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidRepresentanteLegal.add(jLabelidRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);


	this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
	this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRepresentanteLegal.gridy = 0;
	this.gridBagConstraintsRepresentanteLegal.gridx = 0;
	this.gridBagConstraintsRepresentanteLegal.ipadx = 0;
	this.gridBagConstraintsRepresentanteLegal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidclienteRepresentanteLegal.add(jLabelidclienteRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
	//this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRepresentanteLegal.gridy = 0;
	this.gridBagConstraintsRepresentanteLegal.gridx = 2;
	this.gridBagConstraintsRepresentanteLegal.ipadx = 0;
	this.gridBagConstraintsRepresentanteLegal.insets = new Insets(0, 0, 0, 0);
	this.jPanelidclienteRepresentanteLegal.add(jButtonidclienteRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
		//this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRepresentanteLegal.gridy = 0;
		this.gridBagConstraintsRepresentanteLegal.gridx = 3;
		this.gridBagConstraintsRepresentanteLegal.ipadx = 0;
		this.gridBagConstraintsRepresentanteLegal.insets = new Insets(0, 0, 0, 0);
		this.jPanelidclienteRepresentanteLegal.add(jButtonidclienteRepresentanteLegalBusqueda, this.gridBagConstraintsRepresentanteLegal);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
		//this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRepresentanteLegal.gridy = 0;
		this.gridBagConstraintsRepresentanteLegal.gridx = 4;
		this.gridBagConstraintsRepresentanteLegal.ipadx = 0;
		this.gridBagConstraintsRepresentanteLegal.insets = new Insets(0, 0, 0, 0);
		this.jPanelidclienteRepresentanteLegal.add(jButtonidclienteRepresentanteLegalUpdate, this.gridBagConstraintsRepresentanteLegal);
	}

	this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
	this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRepresentanteLegal.gridy = 0;
	this.gridBagConstraintsRepresentanteLegal.gridx = 1;
	this.gridBagConstraintsRepresentanteLegal.ipadx = 0;
	this.gridBagConstraintsRepresentanteLegal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidclienteRepresentanteLegal.add(jComboBoxidclienteRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);


	this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
	this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRepresentanteLegal.gridy = 0;
	this.gridBagConstraintsRepresentanteLegal.gridx = 0;
	this.gridBagConstraintsRepresentanteLegal.ipadx = 0;
	this.gridBagConstraintsRepresentanteLegal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidvalorclientedocumentoRepresentanteLegal.add(jLabelidvalorclientedocumentoRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
		//this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRepresentanteLegal.gridy = 0;
		this.gridBagConstraintsRepresentanteLegal.gridx = 2;
		this.gridBagConstraintsRepresentanteLegal.ipadx = 0;
		this.gridBagConstraintsRepresentanteLegal.insets = new Insets(0, 0, 0, 0);
		this.jPanelidvalorclientedocumentoRepresentanteLegal.add(jButtonidvalorclientedocumentoRepresentanteLegalBusqueda, this.gridBagConstraintsRepresentanteLegal);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
		//this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRepresentanteLegal.gridy = 0;
		this.gridBagConstraintsRepresentanteLegal.gridx = 3;
		this.gridBagConstraintsRepresentanteLegal.ipadx = 0;
		this.gridBagConstraintsRepresentanteLegal.insets = new Insets(0, 0, 0, 0);
		this.jPanelidvalorclientedocumentoRepresentanteLegal.add(jButtonidvalorclientedocumentoRepresentanteLegalUpdate, this.gridBagConstraintsRepresentanteLegal);
	}

	this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
	this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRepresentanteLegal.gridy = 0;
	this.gridBagConstraintsRepresentanteLegal.gridx = 1;
	this.gridBagConstraintsRepresentanteLegal.ipadx = 0;
	this.gridBagConstraintsRepresentanteLegal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidvalorclientedocumentoRepresentanteLegal.add(jComboBoxidvalorclientedocumentoRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);


	this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
	this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRepresentanteLegal.gridy = 0;
	this.gridBagConstraintsRepresentanteLegal.gridx = 0;
	this.gridBagConstraintsRepresentanteLegal.ipadx = 0;
	this.gridBagConstraintsRepresentanteLegal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_paisRepresentanteLegal.add(jLabelid_paisRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
		//this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRepresentanteLegal.gridy = 0;
		this.gridBagConstraintsRepresentanteLegal.gridx = 2;
		this.gridBagConstraintsRepresentanteLegal.ipadx = 0;
		this.gridBagConstraintsRepresentanteLegal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisRepresentanteLegal.add(jButtonid_paisRepresentanteLegalBusqueda, this.gridBagConstraintsRepresentanteLegal);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
		//this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRepresentanteLegal.gridy = 0;
		this.gridBagConstraintsRepresentanteLegal.gridx = 3;
		this.gridBagConstraintsRepresentanteLegal.ipadx = 0;
		this.gridBagConstraintsRepresentanteLegal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisRepresentanteLegal.add(jButtonid_paisRepresentanteLegalUpdate, this.gridBagConstraintsRepresentanteLegal);
	}

	this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
	this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRepresentanteLegal.gridy = 0;
	this.gridBagConstraintsRepresentanteLegal.gridx = 1;
	this.gridBagConstraintsRepresentanteLegal.ipadx = 0;
	this.gridBagConstraintsRepresentanteLegal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_paisRepresentanteLegal.add(jComboBoxid_paisRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);


	this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
	this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRepresentanteLegal.gridy = 0;
	this.gridBagConstraintsRepresentanteLegal.gridx = 0;
	this.gridBagConstraintsRepresentanteLegal.ipadx = 0;
	this.gridBagConstraintsRepresentanteLegal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidciudadRepresentanteLegal.add(jLabelidciudadRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
		//this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRepresentanteLegal.gridy = 0;
		this.gridBagConstraintsRepresentanteLegal.gridx = 2;
		this.gridBagConstraintsRepresentanteLegal.ipadx = 0;
		this.gridBagConstraintsRepresentanteLegal.insets = new Insets(0, 0, 0, 0);
		this.jPanelidciudadRepresentanteLegal.add(jButtonidciudadRepresentanteLegalBusqueda, this.gridBagConstraintsRepresentanteLegal);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
		//this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRepresentanteLegal.gridy = 0;
		this.gridBagConstraintsRepresentanteLegal.gridx = 3;
		this.gridBagConstraintsRepresentanteLegal.ipadx = 0;
		this.gridBagConstraintsRepresentanteLegal.insets = new Insets(0, 0, 0, 0);
		this.jPanelidciudadRepresentanteLegal.add(jButtonidciudadRepresentanteLegalUpdate, this.gridBagConstraintsRepresentanteLegal);
	}

	this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
	this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRepresentanteLegal.gridy = 0;
	this.gridBagConstraintsRepresentanteLegal.gridx = 1;
	this.gridBagConstraintsRepresentanteLegal.ipadx = 0;
	this.gridBagConstraintsRepresentanteLegal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidciudadRepresentanteLegal.add(jComboBoxidciudadRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);


	this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
	this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRepresentanteLegal.gridy = 0;
	this.gridBagConstraintsRepresentanteLegal.gridx = 0;
	this.gridBagConstraintsRepresentanteLegal.ipadx = 0;
	this.gridBagConstraintsRepresentanteLegal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidentificacionRepresentanteLegal.add(jLabelidentificacionRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
		//this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRepresentanteLegal.gridy = 0;
		this.gridBagConstraintsRepresentanteLegal.gridx = 2;
		this.gridBagConstraintsRepresentanteLegal.ipadx = 0;
		this.gridBagConstraintsRepresentanteLegal.insets = new Insets(0, 0, 0, 0);
		this.jPanelidentificacionRepresentanteLegal.add(jButtonidentificacionRepresentanteLegalBusqueda, this.gridBagConstraintsRepresentanteLegal);
	}

	this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
	this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRepresentanteLegal.gridy = 0;
	this.gridBagConstraintsRepresentanteLegal.gridx = 1;
	this.gridBagConstraintsRepresentanteLegal.ipadx = 0;
	this.gridBagConstraintsRepresentanteLegal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidentificacionRepresentanteLegal.add(jTextFieldidentificacionRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);


	this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
	this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRepresentanteLegal.gridy = 0;
	this.gridBagConstraintsRepresentanteLegal.gridx = 0;
	this.gridBagConstraintsRepresentanteLegal.ipadx = 0;
	this.gridBagConstraintsRepresentanteLegal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelapellidopaternoRepresentanteLegal.add(jLabelapellidopaternoRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
		//this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRepresentanteLegal.gridy = 0;
		this.gridBagConstraintsRepresentanteLegal.gridx = 2;
		this.gridBagConstraintsRepresentanteLegal.ipadx = 0;
		this.gridBagConstraintsRepresentanteLegal.insets = new Insets(0, 0, 0, 0);
		this.jPanelapellidopaternoRepresentanteLegal.add(jButtonapellidopaternoRepresentanteLegalBusqueda, this.gridBagConstraintsRepresentanteLegal);
	}

	this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
	this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRepresentanteLegal.gridy = 0;
	this.gridBagConstraintsRepresentanteLegal.gridx = 1;
	this.gridBagConstraintsRepresentanteLegal.ipadx = 0;
	this.gridBagConstraintsRepresentanteLegal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelapellidopaternoRepresentanteLegal.add(jscrollPaneapellidopaternoRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);


	this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
	this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRepresentanteLegal.gridy = 0;
	this.gridBagConstraintsRepresentanteLegal.gridx = 0;
	this.gridBagConstraintsRepresentanteLegal.ipadx = 0;
	this.gridBagConstraintsRepresentanteLegal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelapellidomaternoRepresentanteLegal.add(jLabelapellidomaternoRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
		//this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRepresentanteLegal.gridy = 0;
		this.gridBagConstraintsRepresentanteLegal.gridx = 2;
		this.gridBagConstraintsRepresentanteLegal.ipadx = 0;
		this.gridBagConstraintsRepresentanteLegal.insets = new Insets(0, 0, 0, 0);
		this.jPanelapellidomaternoRepresentanteLegal.add(jButtonapellidomaternoRepresentanteLegalBusqueda, this.gridBagConstraintsRepresentanteLegal);
	}

	this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
	this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRepresentanteLegal.gridy = 0;
	this.gridBagConstraintsRepresentanteLegal.gridx = 1;
	this.gridBagConstraintsRepresentanteLegal.ipadx = 0;
	this.gridBagConstraintsRepresentanteLegal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelapellidomaternoRepresentanteLegal.add(jscrollPaneapellidomaternoRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);


	this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
	this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRepresentanteLegal.gridy = 0;
	this.gridBagConstraintsRepresentanteLegal.gridx = 0;
	this.gridBagConstraintsRepresentanteLegal.ipadx = 0;
	this.gridBagConstraintsRepresentanteLegal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelprimernombreRepresentanteLegal.add(jLabelprimernombreRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
		//this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRepresentanteLegal.gridy = 0;
		this.gridBagConstraintsRepresentanteLegal.gridx = 2;
		this.gridBagConstraintsRepresentanteLegal.ipadx = 0;
		this.gridBagConstraintsRepresentanteLegal.insets = new Insets(0, 0, 0, 0);
		this.jPanelprimernombreRepresentanteLegal.add(jButtonprimernombreRepresentanteLegalBusqueda, this.gridBagConstraintsRepresentanteLegal);
	}

	this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
	this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRepresentanteLegal.gridy = 0;
	this.gridBagConstraintsRepresentanteLegal.gridx = 1;
	this.gridBagConstraintsRepresentanteLegal.ipadx = 0;
	this.gridBagConstraintsRepresentanteLegal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelprimernombreRepresentanteLegal.add(jscrollPaneprimernombreRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);


	this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
	this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRepresentanteLegal.gridy = 0;
	this.gridBagConstraintsRepresentanteLegal.gridx = 0;
	this.gridBagConstraintsRepresentanteLegal.ipadx = 0;
	this.gridBagConstraintsRepresentanteLegal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsegundonombreRepresentanteLegal.add(jLabelsegundonombreRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
		//this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRepresentanteLegal.gridy = 0;
		this.gridBagConstraintsRepresentanteLegal.gridx = 2;
		this.gridBagConstraintsRepresentanteLegal.ipadx = 0;
		this.gridBagConstraintsRepresentanteLegal.insets = new Insets(0, 0, 0, 0);
		this.jPanelsegundonombreRepresentanteLegal.add(jButtonsegundonombreRepresentanteLegalBusqueda, this.gridBagConstraintsRepresentanteLegal);
	}

	this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
	this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRepresentanteLegal.gridy = 0;
	this.gridBagConstraintsRepresentanteLegal.gridx = 1;
	this.gridBagConstraintsRepresentanteLegal.ipadx = 0;
	this.gridBagConstraintsRepresentanteLegal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsegundonombreRepresentanteLegal.add(jscrollPanesegundonombreRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);


	this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
	this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRepresentanteLegal.gridy = 0;
	this.gridBagConstraintsRepresentanteLegal.gridx = 0;
	this.gridBagConstraintsRepresentanteLegal.ipadx = 0;
	this.gridBagConstraintsRepresentanteLegal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldireccionRepresentanteLegal.add(jLabeldireccionRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
		//this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRepresentanteLegal.gridy = 0;
		this.gridBagConstraintsRepresentanteLegal.gridx = 2;
		this.gridBagConstraintsRepresentanteLegal.ipadx = 0;
		this.gridBagConstraintsRepresentanteLegal.insets = new Insets(0, 0, 0, 0);
		this.jPaneldireccionRepresentanteLegal.add(jButtondireccionRepresentanteLegalBusqueda, this.gridBagConstraintsRepresentanteLegal);
	}

	this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
	this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRepresentanteLegal.gridy = 0;
	this.gridBagConstraintsRepresentanteLegal.gridx = 1;
	this.gridBagConstraintsRepresentanteLegal.ipadx = 0;
	this.gridBagConstraintsRepresentanteLegal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldireccionRepresentanteLegal.add(jscrollPanedireccionRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);


	this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
	this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRepresentanteLegal.gridy = 0;
	this.gridBagConstraintsRepresentanteLegal.gridx = 0;
	this.gridBagConstraintsRepresentanteLegal.ipadx = 0;
	this.gridBagConstraintsRepresentanteLegal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltelefonoRepresentanteLegal.add(jLabeltelefonoRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
		//this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRepresentanteLegal.gridy = 0;
		this.gridBagConstraintsRepresentanteLegal.gridx = 2;
		this.gridBagConstraintsRepresentanteLegal.ipadx = 0;
		this.gridBagConstraintsRepresentanteLegal.insets = new Insets(0, 0, 0, 0);
		this.jPaneltelefonoRepresentanteLegal.add(jButtontelefonoRepresentanteLegalBusqueda, this.gridBagConstraintsRepresentanteLegal);
	}

	this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
	this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRepresentanteLegal.gridy = 0;
	this.gridBagConstraintsRepresentanteLegal.gridx = 1;
	this.gridBagConstraintsRepresentanteLegal.ipadx = 0;
	this.gridBagConstraintsRepresentanteLegal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltelefonoRepresentanteLegal.add(jscrollPanetelefonoRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);


	this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
	this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRepresentanteLegal.gridy = 0;
	this.gridBagConstraintsRepresentanteLegal.gridx = 0;
	this.gridBagConstraintsRepresentanteLegal.ipadx = 0;
	this.gridBagConstraintsRepresentanteLegal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltelefonocodigoareaRepresentanteLegal.add(jLabeltelefonocodigoareaRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
		//this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRepresentanteLegal.gridy = 0;
		this.gridBagConstraintsRepresentanteLegal.gridx = 2;
		this.gridBagConstraintsRepresentanteLegal.ipadx = 0;
		this.gridBagConstraintsRepresentanteLegal.insets = new Insets(0, 0, 0, 0);
		this.jPaneltelefonocodigoareaRepresentanteLegal.add(jButtontelefonocodigoareaRepresentanteLegalBusqueda, this.gridBagConstraintsRepresentanteLegal);
	}

	this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
	this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRepresentanteLegal.gridy = 0;
	this.gridBagConstraintsRepresentanteLegal.gridx = 1;
	this.gridBagConstraintsRepresentanteLegal.ipadx = 0;
	this.gridBagConstraintsRepresentanteLegal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltelefonocodigoareaRepresentanteLegal.add(jTextFieldtelefonocodigoareaRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);


	this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
	this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRepresentanteLegal.gridy = 0;
	this.gridBagConstraintsRepresentanteLegal.gridx = 0;
	this.gridBagConstraintsRepresentanteLegal.ipadx = 0;
	this.gridBagConstraintsRepresentanteLegal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelextensionRepresentanteLegal.add(jLabelextensionRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
		//this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRepresentanteLegal.gridy = 0;
		this.gridBagConstraintsRepresentanteLegal.gridx = 2;
		this.gridBagConstraintsRepresentanteLegal.ipadx = 0;
		this.gridBagConstraintsRepresentanteLegal.insets = new Insets(0, 0, 0, 0);
		this.jPanelextensionRepresentanteLegal.add(jButtonextensionRepresentanteLegalBusqueda, this.gridBagConstraintsRepresentanteLegal);
	}

	this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
	this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRepresentanteLegal.gridy = 0;
	this.gridBagConstraintsRepresentanteLegal.gridx = 1;
	this.gridBagConstraintsRepresentanteLegal.ipadx = 0;
	this.gridBagConstraintsRepresentanteLegal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelextensionRepresentanteLegal.add(jTextFieldextensionRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);


	this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
	this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRepresentanteLegal.gridy = 0;
	this.gridBagConstraintsRepresentanteLegal.gridx = 0;
	this.gridBagConstraintsRepresentanteLegal.ipadx = 0;
	this.gridBagConstraintsRepresentanteLegal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltelefonomovilRepresentanteLegal.add(jLabeltelefonomovilRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
		//this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRepresentanteLegal.gridy = 0;
		this.gridBagConstraintsRepresentanteLegal.gridx = 2;
		this.gridBagConstraintsRepresentanteLegal.ipadx = 0;
		this.gridBagConstraintsRepresentanteLegal.insets = new Insets(0, 0, 0, 0);
		this.jPaneltelefonomovilRepresentanteLegal.add(jButtontelefonomovilRepresentanteLegalBusqueda, this.gridBagConstraintsRepresentanteLegal);
	}

	this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
	this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRepresentanteLegal.gridy = 0;
	this.gridBagConstraintsRepresentanteLegal.gridx = 1;
	this.gridBagConstraintsRepresentanteLegal.ipadx = 0;
	this.gridBagConstraintsRepresentanteLegal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltelefonomovilRepresentanteLegal.add(jscrollPanetelefonomovilRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);


	this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
	this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRepresentanteLegal.gridy = 0;
	this.gridBagConstraintsRepresentanteLegal.gridx = 0;
	this.gridBagConstraintsRepresentanteLegal.ipadx = 0;
	this.gridBagConstraintsRepresentanteLegal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelmontoaurorizadoRepresentanteLegal.add(jLabelmontoaurorizadoRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
		//this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRepresentanteLegal.gridy = 0;
		this.gridBagConstraintsRepresentanteLegal.gridx = 2;
		this.gridBagConstraintsRepresentanteLegal.ipadx = 0;
		this.gridBagConstraintsRepresentanteLegal.insets = new Insets(0, 0, 0, 0);
		this.jPanelmontoaurorizadoRepresentanteLegal.add(jButtonmontoaurorizadoRepresentanteLegalBusqueda, this.gridBagConstraintsRepresentanteLegal);
	}

	this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
	this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRepresentanteLegal.gridy = 0;
	this.gridBagConstraintsRepresentanteLegal.gridx = 1;
	this.gridBagConstraintsRepresentanteLegal.ipadx = 0;
	this.gridBagConstraintsRepresentanteLegal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelmontoaurorizadoRepresentanteLegal.add(jTextFieldmontoaurorizadoRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);


	this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
	this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRepresentanteLegal.gridy = 0;
	this.gridBagConstraintsRepresentanteLegal.gridx = 0;
	this.gridBagConstraintsRepresentanteLegal.ipadx = 0;
	this.gridBagConstraintsRepresentanteLegal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelemailRepresentanteLegal.add(jLabelemailRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
		//this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRepresentanteLegal.gridy = 0;
		this.gridBagConstraintsRepresentanteLegal.gridx = 2;
		this.gridBagConstraintsRepresentanteLegal.ipadx = 0;
		this.gridBagConstraintsRepresentanteLegal.insets = new Insets(0, 0, 0, 0);
		this.jPanelemailRepresentanteLegal.add(jButtonemailRepresentanteLegalBusqueda, this.gridBagConstraintsRepresentanteLegal);
	}

	this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
	this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRepresentanteLegal.gridy = 0;
	this.gridBagConstraintsRepresentanteLegal.gridx = 1;
	this.gridBagConstraintsRepresentanteLegal.ipadx = 0;
	this.gridBagConstraintsRepresentanteLegal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelemailRepresentanteLegal.add(jscrollPaneemailRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);


	this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
	this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRepresentanteLegal.gridy = 0;
	this.gridBagConstraintsRepresentanteLegal.gridx = 0;
	this.gridBagConstraintsRepresentanteLegal.ipadx = 0;
	this.gridBagConstraintsRepresentanteLegal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelestaactivoRepresentanteLegal.add(jLabelestaactivoRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
		//this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRepresentanteLegal.gridy = 0;
		this.gridBagConstraintsRepresentanteLegal.gridx = 2;
		this.gridBagConstraintsRepresentanteLegal.ipadx = 0;
		this.gridBagConstraintsRepresentanteLegal.insets = new Insets(0, 0, 0, 0);
		this.jPanelestaactivoRepresentanteLegal.add(jButtonestaactivoRepresentanteLegalBusqueda, this.gridBagConstraintsRepresentanteLegal);
	}

	this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
	this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRepresentanteLegal.gridy = 0;
	this.gridBagConstraintsRepresentanteLegal.gridx = 1;
	this.gridBagConstraintsRepresentanteLegal.ipadx = 0;
	this.gridBagConstraintsRepresentanteLegal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelestaactivoRepresentanteLegal.add(jCheckBoxestaactivoRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
	this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRepresentanteLegal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRepresentanteLegal.gridy = iYPanelCamposRepresentanteLegal;
	this.gridBagConstraintsRepresentanteLegal.gridx = iXPanelCamposRepresentanteLegal++;
	this.gridBagConstraintsRepresentanteLegal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRepresentanteLegal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRepresentanteLegal.add(this.jPanelidRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);



	if(iXPanelCamposRepresentanteLegal % 2==0) {
		iXPanelCamposRepresentanteLegal=0;
		iYPanelCamposRepresentanteLegal++;
	}
	this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
	this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRepresentanteLegal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRepresentanteLegal.gridy = iYPanelCamposRepresentanteLegal;
	this.gridBagConstraintsRepresentanteLegal.gridx = iXPanelCamposRepresentanteLegal++;
	this.gridBagConstraintsRepresentanteLegal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRepresentanteLegal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRepresentanteLegal.add(this.jPanelidclienteRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);



	if(iXPanelCamposRepresentanteLegal % 2==0) {
		iXPanelCamposRepresentanteLegal=0;
		iYPanelCamposRepresentanteLegal++;
	}
	this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
	this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRepresentanteLegal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRepresentanteLegal.gridy = iYPanelCamposRepresentanteLegal;
	this.gridBagConstraintsRepresentanteLegal.gridx = iXPanelCamposRepresentanteLegal++;
	this.gridBagConstraintsRepresentanteLegal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRepresentanteLegal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRepresentanteLegal.add(this.jPanelidvalorclientedocumentoRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);



	if(iXPanelCamposRepresentanteLegal % 2==0) {
		iXPanelCamposRepresentanteLegal=0;
		iYPanelCamposRepresentanteLegal++;
	}
	this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
	this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRepresentanteLegal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRepresentanteLegal.gridy = iYPanelCamposRepresentanteLegal;
	this.gridBagConstraintsRepresentanteLegal.gridx = iXPanelCamposRepresentanteLegal++;
	this.gridBagConstraintsRepresentanteLegal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRepresentanteLegal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRepresentanteLegal.add(this.jPanelid_paisRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);



	if(iXPanelCamposRepresentanteLegal % 2==0) {
		iXPanelCamposRepresentanteLegal=0;
		iYPanelCamposRepresentanteLegal++;
	}
	this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
	this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRepresentanteLegal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRepresentanteLegal.gridy = iYPanelCamposRepresentanteLegal;
	this.gridBagConstraintsRepresentanteLegal.gridx = iXPanelCamposRepresentanteLegal++;
	this.gridBagConstraintsRepresentanteLegal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRepresentanteLegal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRepresentanteLegal.add(this.jPanelidciudadRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);



	if(iXPanelCamposRepresentanteLegal % 2==0) {
		iXPanelCamposRepresentanteLegal=0;
		iYPanelCamposRepresentanteLegal++;
	}
	this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
	this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRepresentanteLegal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRepresentanteLegal.gridy = iYPanelCamposRepresentanteLegal;
	this.gridBagConstraintsRepresentanteLegal.gridx = iXPanelCamposRepresentanteLegal++;
	this.gridBagConstraintsRepresentanteLegal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRepresentanteLegal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRepresentanteLegal.add(this.jPanelidentificacionRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);



	if(iXPanelCamposRepresentanteLegal % 2==0) {
		iXPanelCamposRepresentanteLegal=0;
		iYPanelCamposRepresentanteLegal++;
	}
	this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
	this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRepresentanteLegal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRepresentanteLegal.gridy = iYPanelCamposRepresentanteLegal;
	this.gridBagConstraintsRepresentanteLegal.gridx = iXPanelCamposRepresentanteLegal++;
	this.gridBagConstraintsRepresentanteLegal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRepresentanteLegal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRepresentanteLegal.add(this.jPanelapellidopaternoRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);



	if(iXPanelCamposRepresentanteLegal % 2==0) {
		iXPanelCamposRepresentanteLegal=0;
		iYPanelCamposRepresentanteLegal++;
	}
	this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
	this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRepresentanteLegal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRepresentanteLegal.gridy = iYPanelCamposRepresentanteLegal;
	this.gridBagConstraintsRepresentanteLegal.gridx = iXPanelCamposRepresentanteLegal++;
	this.gridBagConstraintsRepresentanteLegal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRepresentanteLegal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRepresentanteLegal.add(this.jPanelapellidomaternoRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);



	if(iXPanelCamposRepresentanteLegal % 2==0) {
		iXPanelCamposRepresentanteLegal=0;
		iYPanelCamposRepresentanteLegal++;
	}
	this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
	this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRepresentanteLegal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRepresentanteLegal.gridy = iYPanelCamposRepresentanteLegal;
	this.gridBagConstraintsRepresentanteLegal.gridx = iXPanelCamposRepresentanteLegal++;
	this.gridBagConstraintsRepresentanteLegal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRepresentanteLegal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRepresentanteLegal.add(this.jPanelprimernombreRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);



	if(iXPanelCamposRepresentanteLegal % 2==0) {
		iXPanelCamposRepresentanteLegal=0;
		iYPanelCamposRepresentanteLegal++;
	}
	this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
	this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRepresentanteLegal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRepresentanteLegal.gridy = iYPanelCamposRepresentanteLegal;
	this.gridBagConstraintsRepresentanteLegal.gridx = iXPanelCamposRepresentanteLegal++;
	this.gridBagConstraintsRepresentanteLegal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRepresentanteLegal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRepresentanteLegal.add(this.jPanelsegundonombreRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);



	if(iXPanelCamposRepresentanteLegal % 2==0) {
		iXPanelCamposRepresentanteLegal=0;
		iYPanelCamposRepresentanteLegal++;
	}
	this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
	this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRepresentanteLegal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRepresentanteLegal.gridy = iYPanelCamposRepresentanteLegal;
	this.gridBagConstraintsRepresentanteLegal.gridx = iXPanelCamposRepresentanteLegal++;
	this.gridBagConstraintsRepresentanteLegal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRepresentanteLegal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRepresentanteLegal.add(this.jPaneldireccionRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);



	if(iXPanelCamposRepresentanteLegal % 2==0) {
		iXPanelCamposRepresentanteLegal=0;
		iYPanelCamposRepresentanteLegal++;
	}
	this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
	this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRepresentanteLegal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRepresentanteLegal.gridy = iYPanelCamposRepresentanteLegal;
	this.gridBagConstraintsRepresentanteLegal.gridx = iXPanelCamposRepresentanteLegal++;
	this.gridBagConstraintsRepresentanteLegal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRepresentanteLegal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRepresentanteLegal.add(this.jPaneltelefonoRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);



	if(iXPanelCamposRepresentanteLegal % 2==0) {
		iXPanelCamposRepresentanteLegal=0;
		iYPanelCamposRepresentanteLegal++;
	}
	this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
	this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRepresentanteLegal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRepresentanteLegal.gridy = iYPanelCamposRepresentanteLegal;
	this.gridBagConstraintsRepresentanteLegal.gridx = iXPanelCamposRepresentanteLegal++;
	this.gridBagConstraintsRepresentanteLegal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRepresentanteLegal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRepresentanteLegal.add(this.jPaneltelefonocodigoareaRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);



	if(iXPanelCamposRepresentanteLegal % 2==0) {
		iXPanelCamposRepresentanteLegal=0;
		iYPanelCamposRepresentanteLegal++;
	}
	this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
	this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRepresentanteLegal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRepresentanteLegal.gridy = iYPanelCamposRepresentanteLegal;
	this.gridBagConstraintsRepresentanteLegal.gridx = iXPanelCamposRepresentanteLegal++;
	this.gridBagConstraintsRepresentanteLegal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRepresentanteLegal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRepresentanteLegal.add(this.jPanelextensionRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);



	if(iXPanelCamposRepresentanteLegal % 2==0) {
		iXPanelCamposRepresentanteLegal=0;
		iYPanelCamposRepresentanteLegal++;
	}
	this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
	this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRepresentanteLegal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRepresentanteLegal.gridy = iYPanelCamposRepresentanteLegal;
	this.gridBagConstraintsRepresentanteLegal.gridx = iXPanelCamposRepresentanteLegal++;
	this.gridBagConstraintsRepresentanteLegal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRepresentanteLegal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRepresentanteLegal.add(this.jPaneltelefonomovilRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);



	if(iXPanelCamposRepresentanteLegal % 2==0) {
		iXPanelCamposRepresentanteLegal=0;
		iYPanelCamposRepresentanteLegal++;
	}
	this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
	this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRepresentanteLegal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRepresentanteLegal.gridy = iYPanelCamposRepresentanteLegal;
	this.gridBagConstraintsRepresentanteLegal.gridx = iXPanelCamposRepresentanteLegal++;
	this.gridBagConstraintsRepresentanteLegal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRepresentanteLegal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRepresentanteLegal.add(this.jPanelmontoaurorizadoRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);



	if(iXPanelCamposRepresentanteLegal % 2==0) {
		iXPanelCamposRepresentanteLegal=0;
		iYPanelCamposRepresentanteLegal++;
	}
	this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
	this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRepresentanteLegal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRepresentanteLegal.gridy = iYPanelCamposRepresentanteLegal;
	this.gridBagConstraintsRepresentanteLegal.gridx = iXPanelCamposRepresentanteLegal++;
	this.gridBagConstraintsRepresentanteLegal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRepresentanteLegal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRepresentanteLegal.add(this.jPanelemailRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);



	if(iXPanelCamposRepresentanteLegal % 2==0) {
		iXPanelCamposRepresentanteLegal=0;
		iYPanelCamposRepresentanteLegal++;
	}
	this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
	this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRepresentanteLegal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRepresentanteLegal.gridy = iYPanelCamposRepresentanteLegal;
	this.gridBagConstraintsRepresentanteLegal.gridx = iXPanelCamposRepresentanteLegal++;
	this.gridBagConstraintsRepresentanteLegal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRepresentanteLegal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRepresentanteLegal.add(this.jPanelestaactivoRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);



	if(iXPanelCamposRepresentanteLegal % 2==0) {
		iXPanelCamposRepresentanteLegal=0;
		iYPanelCamposRepresentanteLegal++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
		
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
			
		GridBagLayout gridaBagLayoutAccionesRepresentanteLegal= new GridBagLayout();
		this.jPanelAccionesRepresentanteLegal.setLayout(gridaBagLayoutAccionesRepresentanteLegal);
		
		GridBagLayout gridaBagLayoutAccionesFormularioRepresentanteLegal= new GridBagLayout();
		this.jPanelAccionesFormularioRepresentanteLegal.setLayout(gridaBagLayoutAccionesFormularioRepresentanteLegal);
		
		this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
		this.gridBagConstraintsRepresentanteLegal.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsRepresentanteLegal.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioRepresentanteLegal.add(this.jComboBoxTiposAccionesFormularioRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);

		this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
		this.gridBagConstraintsRepresentanteLegal.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsRepresentanteLegal.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioRepresentanteLegal.add(this.jCheckBoxPostAccionNuevoRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.representantelegalSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
			this.gridBagConstraintsRepresentanteLegal.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsRepresentanteLegal.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioRepresentanteLegal.add(this.jCheckBoxPostAccionSinCerrarRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.representantelegalSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.representantelegalSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
			this.gridBagConstraintsRepresentanteLegal.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsRepresentanteLegal.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioRepresentanteLegal.add(this.jCheckBoxPostAccionSinMensajeRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
		this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRepresentanteLegal.gridy = 0;
		this.gridBagConstraintsRepresentanteLegal.gridx = iPosXAccion++;
			
		this.jPanelAccionesRepresentanteLegal.add(this.jButtonModificarRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);							

		this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
		this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRepresentanteLegal.gridy = 0;
		this.gridBagConstraintsRepresentanteLegal.gridx =iPosXAccion++;
			
		this.jPanelAccionesRepresentanteLegal.add(this.jButtonEliminarRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);
		
			
		this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
		this.gridBagConstraintsRepresentanteLegal.gridy = 0;		
		this.gridBagConstraintsRepresentanteLegal.gridx = iPosXAccion++;
		
		this.jPanelAccionesRepresentanteLegal.add(this.jButtonActualizarRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);


		this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
		this.gridBagConstraintsRepresentanteLegal.gridy = 0;		
		this.gridBagConstraintsRepresentanteLegal.gridx = iPosXAccion++;
		
		this.jPanelAccionesRepresentanteLegal.add(this.jButtonGuardarCambiosRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);	
		
		this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
		this.gridBagConstraintsRepresentanteLegal.gridy = 0;		
		this.gridBagConstraintsRepresentanteLegal.gridx =iPosXAccion++;
		
		this.jPanelAccionesRepresentanteLegal.add(this.jButtonCancelarRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutRepresentanteLegal = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutRepresentanteLegal);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.representantelegalSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();						
			this.gridBagConstraintsRepresentanteLegal.gridy = iGridyPrincipal++;
			this.gridBagConstraintsRepresentanteLegal.gridx = 0;		
			//this.gridBagConstraintsRepresentanteLegal.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRepresentanteLegal.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsRepresentanteLegal.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
		this.gridBagConstraintsRepresentanteLegal.gridy =iGridyPrincipal++;
		this.gridBagConstraintsRepresentanteLegal.gridx =0;
		this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsRepresentanteLegal.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(RepresentanteLegalJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleRepresentanteLegal = new RepresentanteLegalBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Representante Legal DATOS");
			
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
			
	        //this.setTitle("[FOR] - Representante Legal DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Representante Legal Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			RepresentanteLegalModel representantelegalModel=new RepresentanteLegalModel(this);
			
			//SI USARA CLASE INTERNA
			//RepresentanteLegalModel.RepresentanteLegalFocusTraversalPolicy representantelegalFocusTraversalPolicy = representantelegalModel.new RepresentanteLegalFocusTraversalPolicy(this);
			
			//representantelegalFocusTraversalPolicy.setrepresentantelegalJInternalFrame(this);
			
			this.setFocusTraversalPolicy(representantelegalModel);
			
			
			this.jContentPaneDetalleRepresentanteLegal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleRepresentanteLegal = new GridBagLayout();	
			this.jContentPaneDetalleRepresentanteLegal.setLayout(gridaBagLayoutDetalleRepresentanteLegal);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosRepresentanteLegal = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
				this.gridBagConstraintsRepresentanteLegal.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsRepresentanteLegal.gridx = 0;
					
				
				this.jContentPaneDetalleRepresentanteLegal.add(jTtoolBarDetalleRepresentanteLegal, gridBagConstraintsRepresentanteLegal);								
				
}
			
			this.jScrollPanelDatosEdicionRepresentanteLegal=   new JScrollPane(jContentPaneDetalleRepresentanteLegal,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionRepresentanteLegal.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionRepresentanteLegal.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionRepresentanteLegal.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralRepresentanteLegal=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralRepresentanteLegal.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralRepresentanteLegal.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralRepresentanteLegal.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
			
			
	        this.gridBagConstraintsRepresentanteLegal.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsRepresentanteLegal.gridx = 0;
	        
			this.jContentPaneDetalleRepresentanteLegal.add(jPanelCamposRepresentanteLegal, gridBagConstraintsRepresentanteLegal);
			
			
			
			
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
						&& representantelegalSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.representantelegalSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsRepresentanteLegal= new GridBagConstraints();
						this.gridBagConstraintsRepresentanteLegal.gridy = iGridyRelaciones++;
						this.gridBagConstraintsRepresentanteLegal.gridx = 0;
						this.jContentPaneDetalleRepresentanteLegal.add(this.jTabbedPaneRelacionesRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesRepresentanteLegal.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosRepresentanteLegal.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
					this.gridBagConstraintsRepresentanteLegal.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsRepresentanteLegal.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsRepresentanteLegal.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsRepresentanteLegal.gridx = 0;
					
				
					this.jContentPaneDetalleRepresentanteLegal.add(jPanelCamposOcultosRepresentanteLegal, gridBagConstraintsRepresentanteLegal);
				
					this.jPanelCamposOcultosRepresentanteLegal.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
			this.gridBagConstraintsRepresentanteLegal.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsRepresentanteLegal.gridx = 0;
	        this.gridBagConstraintsRepresentanteLegal.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleRepresentanteLegal.add(this.jPanelAccionesFormularioRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);							
			
			
			
			this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
	        this.gridBagConstraintsRepresentanteLegal.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsRepresentanteLegal.gridx = 0;
	        
			
			this.jContentPaneDetalleRepresentanteLegal.add(this.jPanelAccionesRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionRepresentanteLegal);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionRepresentanteLegal=   new JScrollPane(this.jPanelCamposRepresentanteLegal,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionRepresentanteLegal.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionRepresentanteLegal.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionRepresentanteLegal.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
			this.gridBagConstraintsRepresentanteLegal.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsRepresentanteLegal.gridx = 0;
			this.gridBagConstraintsRepresentanteLegal.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsRepresentanteLegal.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsRepresentanteLegal.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
			this.gridBagConstraintsRepresentanteLegal.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsRepresentanteLegal.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);			
			
			this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
			this.gridBagConstraintsRepresentanteLegal.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsRepresentanteLegal.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
		this.gridBagConstraintsRepresentanteLegal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRepresentanteLegal.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);
			
			
		this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
		this.gridBagConstraintsRepresentanteLegal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRepresentanteLegal.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);
		
			
		this.gridBagConstraintsRepresentanteLegal = new GridBagConstraints();
		this.gridBagConstraintsRepresentanteLegal.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsRepresentanteLegal.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesRepresentanteLegal, this.gridBagConstraintsRepresentanteLegal);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralRepresentanteLegal;//jContentPane;
		
		return jScrollPanelDatosEdicionRepresentanteLegal;
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
