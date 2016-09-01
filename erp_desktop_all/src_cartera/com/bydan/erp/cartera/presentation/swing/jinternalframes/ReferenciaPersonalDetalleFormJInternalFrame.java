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
import com.bydan.erp.cartera.util.ReferenciaPersonalConstantesFunciones;

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
public class ReferenciaPersonalDetalleFormJInternalFrame extends ReferenciaPersonalBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleReferenciaPersonal;
	
	protected JMenuBar jmenuBarDetalleReferenciaPersonal;
	
	protected JMenu jmenuDetalleReferenciaPersonal;
	protected JMenu jmenuDetalleArchivoReferenciaPersonal;
	protected JMenu jmenuDetalleAccionesReferenciaPersonal;
	protected JMenu jmenuDetalleDatosReferenciaPersonal;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleReferenciaPersonal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutReferenciaPersonal;	
	protected GridBagConstraints gridBagConstraintsReferenciaPersonal;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ReferenciaPersonalBeanSwingJInternalFrameAdditional jInternalFrameDetalleReferenciaPersonal;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected TipoRefePersoBeanSwingJInternalFrame tiporefepersoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiporefeperso="";

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";

	protected CiudadBeanSwingJInternalFrame ciudadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ciudad="";
	
	public ReferenciaPersonalSessionBean referenciapersonalSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public TipoRefePersoSessionBean tiporefepersoSessionBean;
	public PaisSessionBean paisSessionBean;
	public CiudadSessionBean ciudadSessionBean;	
	
	public ReferenciaPersonalLogic referenciapersonalLogic;
	
	public JScrollPane jScrollPanelDatosReferenciaPersonal;
	public JScrollPane jScrollPanelDatosEdicionReferenciaPersonal;
	public JScrollPane jScrollPanelDatosGeneralReferenciaPersonal;
	
	protected JPanel jPanelCamposReferenciaPersonal;    
	protected JPanel jPanelCamposOcultosReferenciaPersonal;    	
	protected JPanel jPanelAccionesReferenciaPersonal;
	protected JPanel jPanelAccionesFormularioReferenciaPersonal;
    
	
	
	protected Integer iXPanelCamposReferenciaPersonal=0;
	protected Integer iYPanelCamposReferenciaPersonal=0;
	
	protected Integer iXPanelCamposOcultosReferenciaPersonal=0;
	protected Integer iYPanelCamposOcultosReferenciaPersonal=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoReferenciaPersonal;
	public JButton jButtonModificarReferenciaPersonal;
	public JButton jButtonActualizarReferenciaPersonal;
    public JButton jButtonEliminarReferenciaPersonal;
	public JButton jButtonCancelarReferenciaPersonal;
    public JButton jButtonGuardarCambiosReferenciaPersonal;
	public JButton jButtonGuardarCambiosTablaReferenciaPersonal;
	protected JButton jButtonCerrarReferenciaPersonal;
	
	
	protected JButton jButtonProcesarInformacionReferenciaPersonal;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoReferenciaPersonal;
	protected JCheckBox jCheckBoxPostAccionSinCerrarReferenciaPersonal;
	protected JCheckBox jCheckBoxPostAccionSinMensajeReferenciaPersonal;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarReferenciaPersonal;
	protected JButton jButtonModificarToolBarReferenciaPersonal;
	protected JButton jButtonActualizarToolBarReferenciaPersonal;
    protected JButton jButtonEliminarToolBarReferenciaPersonal;
	protected JButton jButtonCancelarToolBarReferenciaPersonal;
    protected JButton jButtonGuardarCambiosToolBarReferenciaPersonal;
	protected JButton jButtonGuardarCambiosTablaToolBarReferenciaPersonal;
	protected JButton jButtonMostrarOcultarTablaToolBarReferenciaPersonal;
	protected JButton jButtonCerrarToolBarReferenciaPersonal;
	
	protected JButton jButtonProcesarInformacionToolBarReferenciaPersonal;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoReferenciaPersonal;
	protected JMenuItem jMenuItemModificarReferenciaPersonal;
	protected JMenuItem jMenuItemActualizarReferenciaPersonal;
    protected JMenuItem jMenuItemEliminarReferenciaPersonal;
	protected JMenuItem jMenuItemCancelarReferenciaPersonal;
    protected JMenuItem jMenuItemGuardarCambiosReferenciaPersonal;
	protected JMenuItem jMenuItemGuardarCambiosTablaReferenciaPersonal;
	protected JMenuItem jMenuItemCerrarReferenciaPersonal;
	protected JMenuItem jMenuItemDetalleCerrarReferenciaPersonal;
	protected JMenuItem jMenuItemDetalleMostarOcultarReferenciaPersonal;
	
	protected JMenuItem jMenuItemProcesarInformacionReferenciaPersonal;
	protected JMenuItem jMenuItemNuevoGuardarCambiosReferenciaPersonal;
	protected JMenuItem jMenuItemMostrarOcultarReferenciaPersonal;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesReferenciaPersonal;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesReferenciaPersonal;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesReferenciaPersonal;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioReferenciaPersonal;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidReferenciaPersonal;
	public JLabel jLabelIdReferenciaPersonal;
	public JLabel jLabelidReferenciaPersonal;
	public JButton jButtonidReferenciaPersonalBusqueda= new JButtonMe();

	public JPanel jPanelnombreReferenciaPersonal;
	public JLabel jLabelnombreReferenciaPersonal;
	public JTextArea jTextAreanombreReferenciaPersonal;
	public JScrollPane jscrollPanenombreReferenciaPersonal;
	public JButton jButtonnombreReferenciaPersonalBusqueda= new JButtonMe();

	public JPanel jPanelidentificacionReferenciaPersonal;
	public JLabel jLabelidentificacionReferenciaPersonal;
	public JTextField jTextFieldidentificacionReferenciaPersonal;
	public JButton jButtonidentificacionReferenciaPersonalBusqueda= new JButtonMe();

	public JPanel jPanelfecha_nacimientoReferenciaPersonal;
	public JLabel jLabelfecha_nacimientoReferenciaPersonal;
	//public JFormattedTextField jDateChooserfecha_nacimientoReferenciaPersonal;

	public JDateChooser jDateChooserfecha_nacimientoReferenciaPersonal;
	public JButton jButtonfecha_nacimientoReferenciaPersonalBusqueda= new JButtonMe();

	public JPanel jPaneldireccionReferenciaPersonal;
	public JLabel jLabeldireccionReferenciaPersonal;
	public JTextArea jTextAreadireccionReferenciaPersonal;
	public JScrollPane jscrollPanedireccionReferenciaPersonal;
	public JButton jButtondireccionReferenciaPersonalBusqueda= new JButtonMe();

	public JPanel jPaneltelefonoReferenciaPersonal;
	public JLabel jLabeltelefonoReferenciaPersonal;
	public JTextArea jTextAreatelefonoReferenciaPersonal;
	public JScrollPane jscrollPanetelefonoReferenciaPersonal;
	public JButton jButtontelefonoReferenciaPersonalBusqueda= new JButtonMe();

	public JPanel jPaneltelefonomovilReferenciaPersonal;
	public JLabel jLabeltelefonomovilReferenciaPersonal;
	public JTextArea jTextAreatelefonomovilReferenciaPersonal;
	public JScrollPane jscrollPanetelefonomovilReferenciaPersonal;
	public JButton jButtontelefonomovilReferenciaPersonalBusqueda= new JButtonMe();

	public JPanel jPaneltelefonocodigoareaReferenciaPersonal;
	public JLabel jLabeltelefonocodigoareaReferenciaPersonal;
	public JTextField jTextFieldtelefonocodigoareaReferenciaPersonal;
	public JButton jButtontelefonocodigoareaReferenciaPersonalBusqueda= new JButtonMe();

	public JPanel jPanelpreferenciaReferenciaPersonal;
	public JLabel jLabelpreferenciaReferenciaPersonal;
	public JTextArea jTextAreapreferenciaReferenciaPersonal;
	public JScrollPane jscrollPanepreferenciaReferenciaPersonal;
	public JButton jButtonpreferenciaReferenciaPersonalBusqueda= new JButtonMe();

	public JPanel jPanelemailReferenciaPersonal;
	public JLabel jLabelemailReferenciaPersonal;
	public JTextArea jTextAreaemailReferenciaPersonal;
	public JScrollPane jscrollPaneemailReferenciaPersonal;
	public JButton jButtonemailReferenciaPersonalBusqueda= new JButtonMe();

	public JPanel jPanelobservacionReferenciaPersonal;
	public JLabel jLabelobservacionReferenciaPersonal;
	public JTextArea jTextAreaobservacionReferenciaPersonal;
	public JScrollPane jscrollPaneobservacionReferenciaPersonal;
	public JButton jButtonobservacionReferenciaPersonalBusqueda= new JButtonMe();

	public JPanel jPanelesta_trabajandoReferenciaPersonal;
	public JLabel jLabelesta_trabajandoReferenciaPersonal;
	public JCheckBox jCheckBoxesta_trabajandoReferenciaPersonal;
	public JButton jButtonesta_trabajandoReferenciaPersonalBusqueda= new JButtonMe();

	public JPanel jPanelempresa_trabajoReferenciaPersonal;
	public JLabel jLabelempresa_trabajoReferenciaPersonal;
	public JTextArea jTextAreaempresa_trabajoReferenciaPersonal;
	public JScrollPane jscrollPaneempresa_trabajoReferenciaPersonal;
	public JButton jButtonempresa_trabajoReferenciaPersonalBusqueda= new JButtonMe();

	public JPanel jPaneldireccion_trabajoReferenciaPersonal;
	public JLabel jLabeldireccion_trabajoReferenciaPersonal;
	public JTextArea jTextAreadireccion_trabajoReferenciaPersonal;
	public JScrollPane jscrollPanedireccion_trabajoReferenciaPersonal;
	public JButton jButtondireccion_trabajoReferenciaPersonalBusqueda= new JButtonMe();

	public JPanel jPaneltelefono_trabajoReferenciaPersonal;
	public JLabel jLabeltelefono_trabajoReferenciaPersonal;
	public JTextArea jTextAreatelefono_trabajoReferenciaPersonal;
	public JScrollPane jscrollPanetelefono_trabajoReferenciaPersonal;
	public JButton jButtontelefono_trabajoReferenciaPersonalBusqueda= new JButtonMe();

	public JPanel jPanelesactivoReferenciaPersonal;
	public JLabel jLabelesactivoReferenciaPersonal;
	public JCheckBox jCheckBoxesactivoReferenciaPersonal;
	public JButton jButtonesactivoReferenciaPersonalBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaReferenciaPersonal;
	public JLabel jLabelid_empresaReferenciaPersonal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaReferenciaPersonal;
	public JButton jButtonid_empresaReferenciaPersonal= new JButtonMe();
	public JButton jButtonid_empresaReferenciaPersonalUpdate= new JButtonMe();
	public JButton jButtonid_empresaReferenciaPersonalBusqueda= new JButtonMe();

	public JPanel jPanelidclienteReferenciaPersonal;
	public JLabel jLabelidclienteReferenciaPersonal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxidclienteReferenciaPersonal;
	public JButton jButtonidclienteReferenciaPersonal= new JButtonMe();
	public JButton jButtonidclienteReferenciaPersonalUpdate= new JButtonMe();
	public JButton jButtonidclienteReferenciaPersonalBusqueda= new JButtonMe();

	public JPanel jPanelidvalorclientereferenciapersonalReferenciaPersonal;
	public JLabel jLabelidvalorclientereferenciapersonalReferenciaPersonal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxidvalorclientereferenciapersonalReferenciaPersonal;
	public JButton jButtonidvalorclientereferenciapersonalReferenciaPersonal= new JButtonMe();
	public JButton jButtonidvalorclientereferenciapersonalReferenciaPersonalUpdate= new JButtonMe();
	public JButton jButtonidvalorclientereferenciapersonalReferenciaPersonalBusqueda= new JButtonMe();

	public JPanel jPanelid_paisReferenciaPersonal;
	public JLabel jLabelid_paisReferenciaPersonal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisReferenciaPersonal;
	public JButton jButtonid_paisReferenciaPersonal= new JButtonMe();
	public JButton jButtonid_paisReferenciaPersonalUpdate= new JButtonMe();
	public JButton jButtonid_paisReferenciaPersonalBusqueda= new JButtonMe();

	public JPanel jPanelidciudadReferenciaPersonal;
	public JLabel jLabelidciudadReferenciaPersonal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxidciudadReferenciaPersonal;
	public JButton jButtonidciudadReferenciaPersonal= new JButtonMe();
	public JButton jButtonidciudadReferenciaPersonalUpdate= new JButtonMe();
	public JButton jButtonidciudadReferenciaPersonalBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesReferenciaPersonal;
	
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
	public int iHeightFormulario=1078;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ReferenciaPersonalDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposReferenciaPersonal=new JPanel();
				this.jPanelAccionesFormularioReferenciaPersonal=new JPanel();
				this.jmenuBarDetalleReferenciaPersonal=new JMenuBar();
				this.jTtoolBarDetalleReferenciaPersonal=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ReferenciaPersonalDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ReferenciaPersonal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ReferenciaPersonalDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ReferenciaPersonal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ReferenciaPersonalDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ReferenciaPersonal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ReferenciaPersonalDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ReferenciaPersonal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ReferenciaPersonalDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ReferenciaPersonal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarReferenciaPersonal() {
		return this.jButtonActualizarToolBarReferenciaPersonal;
	}
	
	public JButton getjButtonEliminarToolBarReferenciaPersonal() {
		return this.jButtonEliminarToolBarReferenciaPersonal;
	}
	
	public JButton getjButtonCancelarToolBarReferenciaPersonal() {
		return this.jButtonCancelarToolBarReferenciaPersonal;
	}		
	
	public JButton getjButtonProcesarInformacionReferenciaPersonal() {
		return this.jButtonProcesarInformacionReferenciaPersonal;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionReferenciaPersonal)	{
		this.jButtonProcesarInformacionReferenciaPersonal = jButtonProcesarInformacionReferenciaPersonal;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesReferenciaPersonal() {
		return this.jComboBoxTiposAccionesReferenciaPersonal;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesReferenciaPersonal(
			JComboBox jComboBoxTiposRelacionesReferenciaPersonal) {
		this.jComboBoxTiposRelacionesReferenciaPersonal = jComboBoxTiposRelacionesReferenciaPersonal;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesReferenciaPersonal(
			JComboBox jComboBoxTiposAccionesReferenciaPersonal) {
		this.jComboBoxTiposAccionesReferenciaPersonal = jComboBoxTiposAccionesReferenciaPersonal;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioReferenciaPersonal() {
		return this.jComboBoxTiposAccionesFormularioReferenciaPersonal;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioReferenciaPersonal(
			JComboBox jComboBoxTiposAccionesFormularioReferenciaPersonal) {
		this.jComboBoxTiposAccionesFormularioReferenciaPersonal = jComboBoxTiposAccionesFormularioReferenciaPersonal;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.referenciapersonalSessionBean=new ReferenciaPersonalSessionBean();
		
		this.referenciapersonalSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.referenciapersonalSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.referenciapersonalSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ReferenciaPersonalJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ReferenciaPersonalJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ReferenciaPersonalJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Referencia Personal MANTENIMIENTO"));
		
		
		if(iWidth > 2150) {
			iWidth=2150;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.referenciapersonalSessionBean.getEsGuardarRelacionado()) {
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
	
		ReferenciaPersonalJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleReferenciaPersonal= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarReferenciaPersonal=new JButtonMe();
				this.jButtonModificarToolBarReferenciaPersonal=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarReferenciaPersonal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarReferenciaPersonal,this.jTtoolBarDetalleReferenciaPersonal,
							"actualizar","actualizar","Actualizar"+" "+ReferenciaPersonalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarReferenciaPersonal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarReferenciaPersonal,this.jTtoolBarDetalleReferenciaPersonal,
							"eliminar","eliminar","Eliminar"+" "+ReferenciaPersonalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarReferenciaPersonal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarReferenciaPersonal,this.jTtoolBarDetalleReferenciaPersonal,
							"cancelar","cancelar","Cancelar"+" "+ReferenciaPersonalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarReferenciaPersonal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarReferenciaPersonal,this.jTtoolBarDetalleReferenciaPersonal,
							"guardarcambios","guardarcambios","Guardar"+" "+ReferenciaPersonalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarReferenciaPersonal,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarReferenciaPersonal,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarReferenciaPersonal,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleReferenciaPersonal=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleReferenciaPersonal=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoReferenciaPersonal=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesReferenciaPersonal=new JMenuMe("Acciones");
		this.jmenuDetalleDatosReferenciaPersonal=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoReferenciaPersonal= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoReferenciaPersonal.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoReferenciaPersonal,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoReferenciaPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarReferenciaPersonal= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarReferenciaPersonal.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarReferenciaPersonal,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarReferenciaPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarReferenciaPersonal= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarReferenciaPersonal.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarReferenciaPersonal,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarReferenciaPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarReferenciaPersonal= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarReferenciaPersonal.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarReferenciaPersonal,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarReferenciaPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarReferenciaPersonal= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarReferenciaPersonal.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarReferenciaPersonal,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarReferenciaPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosReferenciaPersonal= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosReferenciaPersonal.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosReferenciaPersonal,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosReferenciaPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarReferenciaPersonal= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarReferenciaPersonal.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarReferenciaPersonal,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarReferenciaPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarReferenciaPersonal= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarReferenciaPersonal.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarReferenciaPersonal,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarReferenciaPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarReferenciaPersonal= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarReferenciaPersonal.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarReferenciaPersonal,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarReferenciaPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarReferenciaPersonal= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarReferenciaPersonal.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarReferenciaPersonal,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarReferenciaPersonal, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoReferenciaPersonal.add(this.jMenuItemDetalleCerrarReferenciaPersonal);
		
		this.jmenuDetalleAccionesReferenciaPersonal.add(this.jMenuItemActualizarReferenciaPersonal);
		this.jmenuDetalleAccionesReferenciaPersonal.add(this.jMenuItemEliminarReferenciaPersonal);
		this.jmenuDetalleAccionesReferenciaPersonal.add(this.jMenuItemCancelarReferenciaPersonal);		
		
		//this.jmenuDetalleDatosReferenciaPersonal.add(this.jMenuItemDetalleAbrirOrderByReferenciaPersonal);				
		this.jmenuDetalleDatosReferenciaPersonal.add(this.jMenuItemDetalleMostarOcultarReferenciaPersonal);				
				
		//this.jmenuDetalleAccionesReferenciaPersonal.add(this.jMenuItemGuardarCambiosReferenciaPersonal);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoReferenciaPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesReferenciaPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosReferenciaPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleReferenciaPersonal.add(this.jmenuDetalleArchivoReferenciaPersonal);		
		this.jmenuBarDetalleReferenciaPersonal.add(this.jmenuDetalleAccionesReferenciaPersonal);		
		this.jmenuBarDetalleReferenciaPersonal.add(this.jmenuDetalleDatosReferenciaPersonal);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleReferenciaPersonal);				
	}
	
	
	public void inicializarElementosCamposReferenciaPersonal() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdReferenciaPersonal = new JLabelMe();
		jLabelIdReferenciaPersonal.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdReferenciaPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdReferenciaPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdReferenciaPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdReferenciaPersonal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidReferenciaPersonal = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidReferenciaPersonal.setToolTipText(ReferenciaPersonalConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutReferenciaPersonal= new GridBagLayout();

		this.jPanelidReferenciaPersonal.setLayout(this.gridaBagLayoutReferenciaPersonal);

		jLabelidReferenciaPersonal = new JLabel();
		jLabelidReferenciaPersonal.setText("Id");

		jLabelidReferenciaPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidReferenciaPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidReferenciaPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreReferenciaPersonal = new JLabelMe();
		this.jLabelnombreReferenciaPersonal.setText(""+ReferenciaPersonalConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreReferenciaPersonal.setToolTipText("Nombre");
		this.jLabelnombreReferenciaPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreReferenciaPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreReferenciaPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreReferenciaPersonal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreReferenciaPersonal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreReferenciaPersonal.setToolTipText(ReferenciaPersonalConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutReferenciaPersonal = new GridBagLayout();
		this.jPanelnombreReferenciaPersonal.setLayout(this.gridaBagLayoutReferenciaPersonal);


		jTextAreanombreReferenciaPersonal= new JTextAreaMe();
		jTextAreanombreReferenciaPersonal.setEnabled(false);
		jTextAreanombreReferenciaPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreReferenciaPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreReferenciaPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreReferenciaPersonal.setLineWrap(true);
		jTextAreanombreReferenciaPersonal.setWrapStyleWord(true);
		jTextAreanombreReferenciaPersonal.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreReferenciaPersonal.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreanombreReferenciaPersonal,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreReferenciaPersonal = new JScrollPane(jTextAreanombreReferenciaPersonal);
		jscrollPanenombreReferenciaPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanenombreReferenciaPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanenombreReferenciaPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtonnombreReferenciaPersonalBusqueda= new JButtonMe();
		this.jButtonnombreReferenciaPersonalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreReferenciaPersonalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreReferenciaPersonalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreReferenciaPersonalBusqueda.setText("U");
		this.jButtonnombreReferenciaPersonalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreReferenciaPersonalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreReferenciaPersonalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreReferenciaPersonal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreReferenciaPersonal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreReferenciaPersonalBusqueda"));

		if(this.referenciapersonalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreReferenciaPersonalBusqueda.setVisible(false);		}


					
		this.jLabelidentificacionReferenciaPersonal = new JLabelMe();
		this.jLabelidentificacionReferenciaPersonal.setText(""+ReferenciaPersonalConstantesFunciones.LABEL_IDENTIFICACION+" : *");
		this.jLabelidentificacionReferenciaPersonal.setToolTipText("Identificacion");
		this.jLabelidentificacionReferenciaPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelidentificacionReferenciaPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelidentificacionReferenciaPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelidentificacionReferenciaPersonal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelidentificacionReferenciaPersonal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidentificacionReferenciaPersonal.setToolTipText(ReferenciaPersonalConstantesFunciones.LABEL_IDENTIFICACION);
		this.gridaBagLayoutReferenciaPersonal = new GridBagLayout();
		this.jPanelidentificacionReferenciaPersonal.setLayout(this.gridaBagLayoutReferenciaPersonal);


		jTextFieldidentificacionReferenciaPersonal= new JTextFieldMe();

		jTextFieldidentificacionReferenciaPersonal.setEnabled(false);
		jTextFieldidentificacionReferenciaPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldidentificacionReferenciaPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldidentificacionReferenciaPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldidentificacionReferenciaPersonal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonidentificacionReferenciaPersonalBusqueda= new JButtonMe();
		this.jButtonidentificacionReferenciaPersonalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidentificacionReferenciaPersonalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidentificacionReferenciaPersonalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonidentificacionReferenciaPersonalBusqueda.setText("U");
		this.jButtonidentificacionReferenciaPersonalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonidentificacionReferenciaPersonalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonidentificacionReferenciaPersonalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldidentificacionReferenciaPersonal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldidentificacionReferenciaPersonal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"identificacionReferenciaPersonalBusqueda"));

		if(this.referenciapersonalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonidentificacionReferenciaPersonalBusqueda.setVisible(false);		}


					
		this.jLabelfecha_nacimientoReferenciaPersonal = new JLabelMe();
		this.jLabelfecha_nacimientoReferenciaPersonal.setText(""+ReferenciaPersonalConstantesFunciones.LABEL_FECHANACIMIENTO+" : *");
		this.jLabelfecha_nacimientoReferenciaPersonal.setToolTipText("Fecha Nacimiento");
		this.jLabelfecha_nacimientoReferenciaPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_nacimientoReferenciaPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_nacimientoReferenciaPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_nacimientoReferenciaPersonal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_nacimientoReferenciaPersonal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_nacimientoReferenciaPersonal.setToolTipText(ReferenciaPersonalConstantesFunciones.LABEL_FECHANACIMIENTO);
		this.gridaBagLayoutReferenciaPersonal = new GridBagLayout();
		this.jPanelfecha_nacimientoReferenciaPersonal.setLayout(this.gridaBagLayoutReferenciaPersonal);


		//jFormattedTextFieldfecha_nacimientoReferenciaPersonal= new JFormattedTextFieldMe();

		jDateChooserfecha_nacimientoReferenciaPersonal= new JDateChooser();
		jDateChooserfecha_nacimientoReferenciaPersonal.setEnabled(false);
		jDateChooserfecha_nacimientoReferenciaPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_nacimientoReferenciaPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_nacimientoReferenciaPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_nacimientoReferenciaPersonal,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_nacimientoReferenciaPersonal.setDate(new Date());
		jDateChooserfecha_nacimientoReferenciaPersonal.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_nacimientoReferenciaPersonal.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_nacimientoReferenciaPersonalBusqueda= new JButtonMe();
		this.jButtonfecha_nacimientoReferenciaPersonalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_nacimientoReferenciaPersonalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_nacimientoReferenciaPersonalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_nacimientoReferenciaPersonalBusqueda.setText("U");
		this.jButtonfecha_nacimientoReferenciaPersonalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_nacimientoReferenciaPersonalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_nacimientoReferenciaPersonalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_nacimientoReferenciaPersonal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_nacimientoReferenciaPersonal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_nacimientoReferenciaPersonalBusqueda"));

		if(this.referenciapersonalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_nacimientoReferenciaPersonalBusqueda.setVisible(false);		}


					
		this.jLabeldireccionReferenciaPersonal = new JLabelMe();
		this.jLabeldireccionReferenciaPersonal.setText(""+ReferenciaPersonalConstantesFunciones.LABEL_DIRECCION+" : *");
		this.jLabeldireccionReferenciaPersonal.setToolTipText("Direccion");
		this.jLabeldireccionReferenciaPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldireccionReferenciaPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldireccionReferenciaPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldireccionReferenciaPersonal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldireccionReferenciaPersonal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldireccionReferenciaPersonal.setToolTipText(ReferenciaPersonalConstantesFunciones.LABEL_DIRECCION);
		this.gridaBagLayoutReferenciaPersonal = new GridBagLayout();
		this.jPaneldireccionReferenciaPersonal.setLayout(this.gridaBagLayoutReferenciaPersonal);


		jTextAreadireccionReferenciaPersonal= new JTextAreaMe();
		jTextAreadireccionReferenciaPersonal.setEnabled(false);
		jTextAreadireccionReferenciaPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionReferenciaPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionReferenciaPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionReferenciaPersonal.setLineWrap(true);
		jTextAreadireccionReferenciaPersonal.setWrapStyleWord(true);
		jTextAreadireccionReferenciaPersonal.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadireccionReferenciaPersonal.setRows(9);

		FuncionesSwing.setBoldTextArea(jTextAreadireccionReferenciaPersonal,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedireccionReferenciaPersonal = new JScrollPane(jTextAreadireccionReferenciaPersonal);
		jscrollPanedireccionReferenciaPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedireccionReferenciaPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedireccionReferenciaPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondireccionReferenciaPersonalBusqueda= new JButtonMe();
		this.jButtondireccionReferenciaPersonalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccionReferenciaPersonalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccionReferenciaPersonalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondireccionReferenciaPersonalBusqueda.setText("U");
		this.jButtondireccionReferenciaPersonalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondireccionReferenciaPersonalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondireccionReferenciaPersonalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadireccionReferenciaPersonal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadireccionReferenciaPersonal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"direccionReferenciaPersonalBusqueda"));

		if(this.referenciapersonalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondireccionReferenciaPersonalBusqueda.setVisible(false);		}


					
		this.jLabeltelefonoReferenciaPersonal = new JLabelMe();
		this.jLabeltelefonoReferenciaPersonal.setText(""+ReferenciaPersonalConstantesFunciones.LABEL_TELEFONO+" : *");
		this.jLabeltelefonoReferenciaPersonal.setToolTipText("Telefono");
		this.jLabeltelefonoReferenciaPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltelefonoReferenciaPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltelefonoReferenciaPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltelefonoReferenciaPersonal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltelefonoReferenciaPersonal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltelefonoReferenciaPersonal.setToolTipText(ReferenciaPersonalConstantesFunciones.LABEL_TELEFONO);
		this.gridaBagLayoutReferenciaPersonal = new GridBagLayout();
		this.jPaneltelefonoReferenciaPersonal.setLayout(this.gridaBagLayoutReferenciaPersonal);


		jTextAreatelefonoReferenciaPersonal= new JTextAreaMe();
		jTextAreatelefonoReferenciaPersonal.setEnabled(false);
		jTextAreatelefonoReferenciaPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefonoReferenciaPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefonoReferenciaPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefonoReferenciaPersonal.setLineWrap(true);
		jTextAreatelefonoReferenciaPersonal.setWrapStyleWord(true);
		jTextAreatelefonoReferenciaPersonal.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreatelefonoReferenciaPersonal.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreatelefonoReferenciaPersonal,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanetelefonoReferenciaPersonal = new JScrollPane(jTextAreatelefonoReferenciaPersonal);
		jscrollPanetelefonoReferenciaPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanetelefonoReferenciaPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanetelefonoReferenciaPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtontelefonoReferenciaPersonalBusqueda= new JButtonMe();
		this.jButtontelefonoReferenciaPersonalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefonoReferenciaPersonalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefonoReferenciaPersonalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontelefonoReferenciaPersonalBusqueda.setText("U");
		this.jButtontelefonoReferenciaPersonalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontelefonoReferenciaPersonalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontelefonoReferenciaPersonalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreatelefonoReferenciaPersonal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreatelefonoReferenciaPersonal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"telefonoReferenciaPersonalBusqueda"));

		if(this.referenciapersonalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontelefonoReferenciaPersonalBusqueda.setVisible(false);		}


					
		this.jLabeltelefonomovilReferenciaPersonal = new JLabelMe();
		this.jLabeltelefonomovilReferenciaPersonal.setText(""+ReferenciaPersonalConstantesFunciones.LABEL_TELEFONOMOVIL+" : *");
		this.jLabeltelefonomovilReferenciaPersonal.setToolTipText("Telefono Movil");
		this.jLabeltelefonomovilReferenciaPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltelefonomovilReferenciaPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltelefonomovilReferenciaPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltelefonomovilReferenciaPersonal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltelefonomovilReferenciaPersonal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltelefonomovilReferenciaPersonal.setToolTipText(ReferenciaPersonalConstantesFunciones.LABEL_TELEFONOMOVIL);
		this.gridaBagLayoutReferenciaPersonal = new GridBagLayout();
		this.jPaneltelefonomovilReferenciaPersonal.setLayout(this.gridaBagLayoutReferenciaPersonal);


		jTextAreatelefonomovilReferenciaPersonal= new JTextAreaMe();
		jTextAreatelefonomovilReferenciaPersonal.setEnabled(false);
		jTextAreatelefonomovilReferenciaPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefonomovilReferenciaPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefonomovilReferenciaPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefonomovilReferenciaPersonal.setLineWrap(true);
		jTextAreatelefonomovilReferenciaPersonal.setWrapStyleWord(true);
		jTextAreatelefonomovilReferenciaPersonal.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreatelefonomovilReferenciaPersonal.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreatelefonomovilReferenciaPersonal,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanetelefonomovilReferenciaPersonal = new JScrollPane(jTextAreatelefonomovilReferenciaPersonal);
		jscrollPanetelefonomovilReferenciaPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanetelefonomovilReferenciaPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanetelefonomovilReferenciaPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtontelefonomovilReferenciaPersonalBusqueda= new JButtonMe();
		this.jButtontelefonomovilReferenciaPersonalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefonomovilReferenciaPersonalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefonomovilReferenciaPersonalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontelefonomovilReferenciaPersonalBusqueda.setText("U");
		this.jButtontelefonomovilReferenciaPersonalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontelefonomovilReferenciaPersonalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontelefonomovilReferenciaPersonalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreatelefonomovilReferenciaPersonal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreatelefonomovilReferenciaPersonal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"telefonomovilReferenciaPersonalBusqueda"));

		if(this.referenciapersonalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontelefonomovilReferenciaPersonalBusqueda.setVisible(false);		}


					
		this.jLabeltelefonocodigoareaReferenciaPersonal = new JLabelMe();
		this.jLabeltelefonocodigoareaReferenciaPersonal.setText(""+ReferenciaPersonalConstantesFunciones.LABEL_TELEFONOCODIGOAREA+" : *");
		this.jLabeltelefonocodigoareaReferenciaPersonal.setToolTipText("Telefono Codigo Area");
		this.jLabeltelefonocodigoareaReferenciaPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabeltelefonocodigoareaReferenciaPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabeltelefonocodigoareaReferenciaPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabeltelefonocodigoareaReferenciaPersonal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltelefonocodigoareaReferenciaPersonal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltelefonocodigoareaReferenciaPersonal.setToolTipText(ReferenciaPersonalConstantesFunciones.LABEL_TELEFONOCODIGOAREA);
		this.gridaBagLayoutReferenciaPersonal = new GridBagLayout();
		this.jPaneltelefonocodigoareaReferenciaPersonal.setLayout(this.gridaBagLayoutReferenciaPersonal);


		jTextFieldtelefonocodigoareaReferenciaPersonal= new JTextFieldMe();

		jTextFieldtelefonocodigoareaReferenciaPersonal.setEnabled(false);
		jTextFieldtelefonocodigoareaReferenciaPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtelefonocodigoareaReferenciaPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtelefonocodigoareaReferenciaPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtelefonocodigoareaReferenciaPersonal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtontelefonocodigoareaReferenciaPersonalBusqueda= new JButtonMe();
		this.jButtontelefonocodigoareaReferenciaPersonalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefonocodigoareaReferenciaPersonalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefonocodigoareaReferenciaPersonalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontelefonocodigoareaReferenciaPersonalBusqueda.setText("U");
		this.jButtontelefonocodigoareaReferenciaPersonalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontelefonocodigoareaReferenciaPersonalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontelefonocodigoareaReferenciaPersonalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtelefonocodigoareaReferenciaPersonal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtelefonocodigoareaReferenciaPersonal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"telefonocodigoareaReferenciaPersonalBusqueda"));

		if(this.referenciapersonalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontelefonocodigoareaReferenciaPersonalBusqueda.setVisible(false);		}


					
		this.jLabelpreferenciaReferenciaPersonal = new JLabelMe();
		this.jLabelpreferenciaReferenciaPersonal.setText(""+ReferenciaPersonalConstantesFunciones.LABEL_PREFERENCIA+" : *");
		this.jLabelpreferenciaReferenciaPersonal.setToolTipText("Preferencia");
		this.jLabelpreferenciaReferenciaPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelpreferenciaReferenciaPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelpreferenciaReferenciaPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelpreferenciaReferenciaPersonal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelpreferenciaReferenciaPersonal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelpreferenciaReferenciaPersonal.setToolTipText(ReferenciaPersonalConstantesFunciones.LABEL_PREFERENCIA);
		this.gridaBagLayoutReferenciaPersonal = new GridBagLayout();
		this.jPanelpreferenciaReferenciaPersonal.setLayout(this.gridaBagLayoutReferenciaPersonal);


		jTextAreapreferenciaReferenciaPersonal= new JTextAreaMe();
		jTextAreapreferenciaReferenciaPersonal.setEnabled(false);
		jTextAreapreferenciaReferenciaPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreapreferenciaReferenciaPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreapreferenciaReferenciaPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreapreferenciaReferenciaPersonal.setLineWrap(true);
		jTextAreapreferenciaReferenciaPersonal.setWrapStyleWord(true);
		jTextAreapreferenciaReferenciaPersonal.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreapreferenciaReferenciaPersonal.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreapreferenciaReferenciaPersonal,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanepreferenciaReferenciaPersonal = new JScrollPane(jTextAreapreferenciaReferenciaPersonal);
		jscrollPanepreferenciaReferenciaPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanepreferenciaReferenciaPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanepreferenciaReferenciaPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonpreferenciaReferenciaPersonalBusqueda= new JButtonMe();
		this.jButtonpreferenciaReferenciaPersonalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpreferenciaReferenciaPersonalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpreferenciaReferenciaPersonalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonpreferenciaReferenciaPersonalBusqueda.setText("U");
		this.jButtonpreferenciaReferenciaPersonalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonpreferenciaReferenciaPersonalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonpreferenciaReferenciaPersonalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreapreferenciaReferenciaPersonal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreapreferenciaReferenciaPersonal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"preferenciaReferenciaPersonalBusqueda"));

		if(this.referenciapersonalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonpreferenciaReferenciaPersonalBusqueda.setVisible(false);		}


					
		this.jLabelemailReferenciaPersonal = new JLabelMe();
		this.jLabelemailReferenciaPersonal.setText(""+ReferenciaPersonalConstantesFunciones.LABEL_EMAIL+" : *");
		this.jLabelemailReferenciaPersonal.setToolTipText("Email");
		this.jLabelemailReferenciaPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelemailReferenciaPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelemailReferenciaPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelemailReferenciaPersonal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelemailReferenciaPersonal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelemailReferenciaPersonal.setToolTipText(ReferenciaPersonalConstantesFunciones.LABEL_EMAIL);
		this.gridaBagLayoutReferenciaPersonal = new GridBagLayout();
		this.jPanelemailReferenciaPersonal.setLayout(this.gridaBagLayoutReferenciaPersonal);


		jTextAreaemailReferenciaPersonal= new JTextAreaMe();
		jTextAreaemailReferenciaPersonal.setEnabled(false);
		jTextAreaemailReferenciaPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaemailReferenciaPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaemailReferenciaPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaemailReferenciaPersonal.setLineWrap(true);
		jTextAreaemailReferenciaPersonal.setWrapStyleWord(true);
		jTextAreaemailReferenciaPersonal.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaemailReferenciaPersonal.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreaemailReferenciaPersonal,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneemailReferenciaPersonal = new JScrollPane(jTextAreaemailReferenciaPersonal);
		jscrollPaneemailReferenciaPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPaneemailReferenciaPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPaneemailReferenciaPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtonemailReferenciaPersonalBusqueda= new JButtonMe();
		this.jButtonemailReferenciaPersonalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonemailReferenciaPersonalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonemailReferenciaPersonalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonemailReferenciaPersonalBusqueda.setText("U");
		this.jButtonemailReferenciaPersonalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonemailReferenciaPersonalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonemailReferenciaPersonalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaemailReferenciaPersonal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaemailReferenciaPersonal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"emailReferenciaPersonalBusqueda"));

		if(this.referenciapersonalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonemailReferenciaPersonalBusqueda.setVisible(false);		}


					
		this.jLabelobservacionReferenciaPersonal = new JLabelMe();
		this.jLabelobservacionReferenciaPersonal.setText(""+ReferenciaPersonalConstantesFunciones.LABEL_OBSERVACION+" : *");
		this.jLabelobservacionReferenciaPersonal.setToolTipText("Observacion");
		this.jLabelobservacionReferenciaPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelobservacionReferenciaPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelobservacionReferenciaPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelobservacionReferenciaPersonal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelobservacionReferenciaPersonal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelobservacionReferenciaPersonal.setToolTipText(ReferenciaPersonalConstantesFunciones.LABEL_OBSERVACION);
		this.gridaBagLayoutReferenciaPersonal = new GridBagLayout();
		this.jPanelobservacionReferenciaPersonal.setLayout(this.gridaBagLayoutReferenciaPersonal);


		jTextAreaobservacionReferenciaPersonal= new JTextAreaMe();
		jTextAreaobservacionReferenciaPersonal.setEnabled(false);
		jTextAreaobservacionReferenciaPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaobservacionReferenciaPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaobservacionReferenciaPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaobservacionReferenciaPersonal.setLineWrap(true);
		jTextAreaobservacionReferenciaPersonal.setWrapStyleWord(true);
		jTextAreaobservacionReferenciaPersonal.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaobservacionReferenciaPersonal.setRows(12);

		FuncionesSwing.setBoldTextArea(jTextAreaobservacionReferenciaPersonal,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneobservacionReferenciaPersonal = new JScrollPane(jTextAreaobservacionReferenciaPersonal);
		jscrollPaneobservacionReferenciaPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPaneobservacionReferenciaPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPaneobservacionReferenciaPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtonobservacionReferenciaPersonalBusqueda= new JButtonMe();
		this.jButtonobservacionReferenciaPersonalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonobservacionReferenciaPersonalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonobservacionReferenciaPersonalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonobservacionReferenciaPersonalBusqueda.setText("U");
		this.jButtonobservacionReferenciaPersonalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonobservacionReferenciaPersonalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonobservacionReferenciaPersonalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaobservacionReferenciaPersonal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaobservacionReferenciaPersonal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"observacionReferenciaPersonalBusqueda"));

		if(this.referenciapersonalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonobservacionReferenciaPersonalBusqueda.setVisible(false);		}


					
		this.jLabelesta_trabajandoReferenciaPersonal = new JLabelMe();
		this.jLabelesta_trabajandoReferenciaPersonal.setText(""+ReferenciaPersonalConstantesFunciones.LABEL_ESTATRABAJANDO+" : *");
		this.jLabelesta_trabajandoReferenciaPersonal.setToolTipText("Esta Trabajando");
		this.jLabelesta_trabajandoReferenciaPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelesta_trabajandoReferenciaPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelesta_trabajandoReferenciaPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelesta_trabajandoReferenciaPersonal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelesta_trabajandoReferenciaPersonal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelesta_trabajandoReferenciaPersonal.setToolTipText(ReferenciaPersonalConstantesFunciones.LABEL_ESTATRABAJANDO);
		this.gridaBagLayoutReferenciaPersonal = new GridBagLayout();
		this.jPanelesta_trabajandoReferenciaPersonal.setLayout(this.gridaBagLayoutReferenciaPersonal);


		jCheckBoxesta_trabajandoReferenciaPersonal= new JCheckBoxMe();
		jCheckBoxesta_trabajandoReferenciaPersonal.setEnabled(false);

		jCheckBoxesta_trabajandoReferenciaPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesta_trabajandoReferenciaPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesta_trabajandoReferenciaPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxesta_trabajandoReferenciaPersonal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonesta_trabajandoReferenciaPersonalBusqueda= new JButtonMe();
		this.jButtonesta_trabajandoReferenciaPersonalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesta_trabajandoReferenciaPersonalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesta_trabajandoReferenciaPersonalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonesta_trabajandoReferenciaPersonalBusqueda.setText("U");
		this.jButtonesta_trabajandoReferenciaPersonalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonesta_trabajandoReferenciaPersonalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonesta_trabajandoReferenciaPersonalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxesta_trabajandoReferenciaPersonal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxesta_trabajandoReferenciaPersonal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"esta_trabajandoReferenciaPersonalBusqueda"));

		if(this.referenciapersonalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonesta_trabajandoReferenciaPersonalBusqueda.setVisible(false);		}


					
		this.jLabelempresa_trabajoReferenciaPersonal = new JLabelMe();
		this.jLabelempresa_trabajoReferenciaPersonal.setText(""+ReferenciaPersonalConstantesFunciones.LABEL_EMPRESATRABAJO+" : *");
		this.jLabelempresa_trabajoReferenciaPersonal.setToolTipText("Empresa Trabajo");
		this.jLabelempresa_trabajoReferenciaPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelempresa_trabajoReferenciaPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelempresa_trabajoReferenciaPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelempresa_trabajoReferenciaPersonal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelempresa_trabajoReferenciaPersonal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelempresa_trabajoReferenciaPersonal.setToolTipText(ReferenciaPersonalConstantesFunciones.LABEL_EMPRESATRABAJO);
		this.gridaBagLayoutReferenciaPersonal = new GridBagLayout();
		this.jPanelempresa_trabajoReferenciaPersonal.setLayout(this.gridaBagLayoutReferenciaPersonal);


		jTextAreaempresa_trabajoReferenciaPersonal= new JTextAreaMe();
		jTextAreaempresa_trabajoReferenciaPersonal.setEnabled(false);
		jTextAreaempresa_trabajoReferenciaPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaempresa_trabajoReferenciaPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaempresa_trabajoReferenciaPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaempresa_trabajoReferenciaPersonal.setLineWrap(true);
		jTextAreaempresa_trabajoReferenciaPersonal.setWrapStyleWord(true);
		jTextAreaempresa_trabajoReferenciaPersonal.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaempresa_trabajoReferenciaPersonal.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreaempresa_trabajoReferenciaPersonal,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneempresa_trabajoReferenciaPersonal = new JScrollPane(jTextAreaempresa_trabajoReferenciaPersonal);
		jscrollPaneempresa_trabajoReferenciaPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneempresa_trabajoReferenciaPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneempresa_trabajoReferenciaPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonempresa_trabajoReferenciaPersonalBusqueda= new JButtonMe();
		this.jButtonempresa_trabajoReferenciaPersonalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonempresa_trabajoReferenciaPersonalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonempresa_trabajoReferenciaPersonalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonempresa_trabajoReferenciaPersonalBusqueda.setText("U");
		this.jButtonempresa_trabajoReferenciaPersonalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonempresa_trabajoReferenciaPersonalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonempresa_trabajoReferenciaPersonalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaempresa_trabajoReferenciaPersonal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaempresa_trabajoReferenciaPersonal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"empresa_trabajoReferenciaPersonalBusqueda"));

		if(this.referenciapersonalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonempresa_trabajoReferenciaPersonalBusqueda.setVisible(false);		}


					
		this.jLabeldireccion_trabajoReferenciaPersonal = new JLabelMe();
		this.jLabeldireccion_trabajoReferenciaPersonal.setText(""+ReferenciaPersonalConstantesFunciones.LABEL_DIRECCIONTRABAJO+" : *");
		this.jLabeldireccion_trabajoReferenciaPersonal.setToolTipText("Direccion Trabajo");
		this.jLabeldireccion_trabajoReferenciaPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldireccion_trabajoReferenciaPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldireccion_trabajoReferenciaPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeldireccion_trabajoReferenciaPersonal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldireccion_trabajoReferenciaPersonal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldireccion_trabajoReferenciaPersonal.setToolTipText(ReferenciaPersonalConstantesFunciones.LABEL_DIRECCIONTRABAJO);
		this.gridaBagLayoutReferenciaPersonal = new GridBagLayout();
		this.jPaneldireccion_trabajoReferenciaPersonal.setLayout(this.gridaBagLayoutReferenciaPersonal);


		jTextAreadireccion_trabajoReferenciaPersonal= new JTextAreaMe();
		jTextAreadireccion_trabajoReferenciaPersonal.setEnabled(false);
		jTextAreadireccion_trabajoReferenciaPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccion_trabajoReferenciaPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccion_trabajoReferenciaPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccion_trabajoReferenciaPersonal.setLineWrap(true);
		jTextAreadireccion_trabajoReferenciaPersonal.setWrapStyleWord(true);
		jTextAreadireccion_trabajoReferenciaPersonal.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadireccion_trabajoReferenciaPersonal.setRows(9);

		FuncionesSwing.setBoldTextArea(jTextAreadireccion_trabajoReferenciaPersonal,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedireccion_trabajoReferenciaPersonal = new JScrollPane(jTextAreadireccion_trabajoReferenciaPersonal);
		jscrollPanedireccion_trabajoReferenciaPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedireccion_trabajoReferenciaPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedireccion_trabajoReferenciaPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondireccion_trabajoReferenciaPersonalBusqueda= new JButtonMe();
		this.jButtondireccion_trabajoReferenciaPersonalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccion_trabajoReferenciaPersonalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccion_trabajoReferenciaPersonalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondireccion_trabajoReferenciaPersonalBusqueda.setText("U");
		this.jButtondireccion_trabajoReferenciaPersonalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondireccion_trabajoReferenciaPersonalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondireccion_trabajoReferenciaPersonalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadireccion_trabajoReferenciaPersonal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadireccion_trabajoReferenciaPersonal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"direccion_trabajoReferenciaPersonalBusqueda"));

		if(this.referenciapersonalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondireccion_trabajoReferenciaPersonalBusqueda.setVisible(false);		}


					
		this.jLabeltelefono_trabajoReferenciaPersonal = new JLabelMe();
		this.jLabeltelefono_trabajoReferenciaPersonal.setText(""+ReferenciaPersonalConstantesFunciones.LABEL_TELEFONOTRABAJO+" : *");
		this.jLabeltelefono_trabajoReferenciaPersonal.setToolTipText("Telefono Trabajo");
		this.jLabeltelefono_trabajoReferenciaPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltelefono_trabajoReferenciaPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltelefono_trabajoReferenciaPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeltelefono_trabajoReferenciaPersonal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltelefono_trabajoReferenciaPersonal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltelefono_trabajoReferenciaPersonal.setToolTipText(ReferenciaPersonalConstantesFunciones.LABEL_TELEFONOTRABAJO);
		this.gridaBagLayoutReferenciaPersonal = new GridBagLayout();
		this.jPaneltelefono_trabajoReferenciaPersonal.setLayout(this.gridaBagLayoutReferenciaPersonal);


		jTextAreatelefono_trabajoReferenciaPersonal= new JTextAreaMe();
		jTextAreatelefono_trabajoReferenciaPersonal.setEnabled(false);
		jTextAreatelefono_trabajoReferenciaPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefono_trabajoReferenciaPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefono_trabajoReferenciaPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefono_trabajoReferenciaPersonal.setLineWrap(true);
		jTextAreatelefono_trabajoReferenciaPersonal.setWrapStyleWord(true);
		jTextAreatelefono_trabajoReferenciaPersonal.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreatelefono_trabajoReferenciaPersonal.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreatelefono_trabajoReferenciaPersonal,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanetelefono_trabajoReferenciaPersonal = new JScrollPane(jTextAreatelefono_trabajoReferenciaPersonal);
		jscrollPanetelefono_trabajoReferenciaPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanetelefono_trabajoReferenciaPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanetelefono_trabajoReferenciaPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtontelefono_trabajoReferenciaPersonalBusqueda= new JButtonMe();
		this.jButtontelefono_trabajoReferenciaPersonalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefono_trabajoReferenciaPersonalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefono_trabajoReferenciaPersonalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontelefono_trabajoReferenciaPersonalBusqueda.setText("U");
		this.jButtontelefono_trabajoReferenciaPersonalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontelefono_trabajoReferenciaPersonalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontelefono_trabajoReferenciaPersonalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreatelefono_trabajoReferenciaPersonal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreatelefono_trabajoReferenciaPersonal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"telefono_trabajoReferenciaPersonalBusqueda"));

		if(this.referenciapersonalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontelefono_trabajoReferenciaPersonalBusqueda.setVisible(false);		}


					
		this.jLabelesactivoReferenciaPersonal = new JLabelMe();
		this.jLabelesactivoReferenciaPersonal.setText(""+ReferenciaPersonalConstantesFunciones.LABEL_ESACTIVO+" : *");
		this.jLabelesactivoReferenciaPersonal.setToolTipText("Es Activo");
		this.jLabelesactivoReferenciaPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelesactivoReferenciaPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelesactivoReferenciaPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelesactivoReferenciaPersonal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelesactivoReferenciaPersonal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelesactivoReferenciaPersonal.setToolTipText(ReferenciaPersonalConstantesFunciones.LABEL_ESACTIVO);
		this.gridaBagLayoutReferenciaPersonal = new GridBagLayout();
		this.jPanelesactivoReferenciaPersonal.setLayout(this.gridaBagLayoutReferenciaPersonal);


		jCheckBoxesactivoReferenciaPersonal= new JCheckBoxMe();
		jCheckBoxesactivoReferenciaPersonal.setEnabled(false);

		jCheckBoxesactivoReferenciaPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesactivoReferenciaPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesactivoReferenciaPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxesactivoReferenciaPersonal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonesactivoReferenciaPersonalBusqueda= new JButtonMe();
		this.jButtonesactivoReferenciaPersonalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesactivoReferenciaPersonalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesactivoReferenciaPersonalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonesactivoReferenciaPersonalBusqueda.setText("U");
		this.jButtonesactivoReferenciaPersonalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonesactivoReferenciaPersonalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonesactivoReferenciaPersonalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxesactivoReferenciaPersonal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxesactivoReferenciaPersonal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"esactivoReferenciaPersonalBusqueda"));

		if(this.referenciapersonalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonesactivoReferenciaPersonalBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysReferenciaPersonal() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaReferenciaPersonal = new JLabelMe();
		this.jLabelid_empresaReferenciaPersonal.setText(""+ReferenciaPersonalConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaReferenciaPersonal.setToolTipText("Empresa");
		this.jLabelid_empresaReferenciaPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaReferenciaPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaReferenciaPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaReferenciaPersonal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaReferenciaPersonal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaReferenciaPersonal.setToolTipText(ReferenciaPersonalConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutReferenciaPersonal = new GridBagLayout();
		this.jPanelid_empresaReferenciaPersonal.setLayout(this.gridaBagLayoutReferenciaPersonal);


		jComboBoxid_empresaReferenciaPersonal= new JComboBoxMe();
		jComboBoxid_empresaReferenciaPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaReferenciaPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaReferenciaPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaReferenciaPersonal,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaReferenciaPersonal.setEnabled(false);

		this.jButtonid_empresaReferenciaPersonal= new JButtonMe();
		this.jButtonid_empresaReferenciaPersonal.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaReferenciaPersonal.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaReferenciaPersonal.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaReferenciaPersonal.setText("Buscar");
		this.jButtonid_empresaReferenciaPersonal.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaReferenciaPersonal.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaReferenciaPersonal,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaReferenciaPersonal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaReferenciaPersonal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaReferenciaPersonal"));

		this.jButtonid_empresaReferenciaPersonalBusqueda= new JButtonMe();
		this.jButtonid_empresaReferenciaPersonalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaReferenciaPersonalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaReferenciaPersonalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaReferenciaPersonalBusqueda.setText("U");
		this.jButtonid_empresaReferenciaPersonalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaReferenciaPersonalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaReferenciaPersonalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaReferenciaPersonal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaReferenciaPersonal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaReferenciaPersonalBusqueda"));

		if(this.referenciapersonalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaReferenciaPersonalBusqueda.setVisible(false);		}

		this.jButtonid_empresaReferenciaPersonalUpdate= new JButtonMe();
		this.jButtonid_empresaReferenciaPersonalUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaReferenciaPersonalUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaReferenciaPersonalUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaReferenciaPersonalUpdate.setText("U");
		this.jButtonid_empresaReferenciaPersonalUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaReferenciaPersonalUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaReferenciaPersonalUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaReferenciaPersonal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaReferenciaPersonal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaReferenciaPersonalUpdate"));



					
		this.jLabelidclienteReferenciaPersonal = new JLabelMe();
		this.jLabelidclienteReferenciaPersonal.setText(""+ReferenciaPersonalConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelidclienteReferenciaPersonal.setToolTipText("Cliente");
		this.jLabelidclienteReferenciaPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelidclienteReferenciaPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelidclienteReferenciaPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelidclienteReferenciaPersonal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelidclienteReferenciaPersonal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidclienteReferenciaPersonal.setToolTipText(ReferenciaPersonalConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutReferenciaPersonal = new GridBagLayout();
		this.jPanelidclienteReferenciaPersonal.setLayout(this.gridaBagLayoutReferenciaPersonal);


		jComboBoxidclienteReferenciaPersonal= new JComboBoxMe();
		jComboBoxidclienteReferenciaPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidclienteReferenciaPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidclienteReferenciaPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxidclienteReferenciaPersonal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonidclienteReferenciaPersonal= new JButtonMe();
		this.jButtonidclienteReferenciaPersonal.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonidclienteReferenciaPersonal.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonidclienteReferenciaPersonal.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonidclienteReferenciaPersonal.setText("Buscar");
		this.jButtonidclienteReferenciaPersonal.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonidclienteReferenciaPersonal.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonidclienteReferenciaPersonal,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxidclienteReferenciaPersonal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxidclienteReferenciaPersonal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"idclienteReferenciaPersonal"));

		this.jButtonidclienteReferenciaPersonalBusqueda= new JButtonMe();
		this.jButtonidclienteReferenciaPersonalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidclienteReferenciaPersonalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidclienteReferenciaPersonalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonidclienteReferenciaPersonalBusqueda.setText("U");
		this.jButtonidclienteReferenciaPersonalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonidclienteReferenciaPersonalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonidclienteReferenciaPersonalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxidclienteReferenciaPersonal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxidclienteReferenciaPersonal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"idclienteReferenciaPersonalBusqueda"));

		if(this.referenciapersonalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonidclienteReferenciaPersonalBusqueda.setVisible(false);		}

		this.jButtonidclienteReferenciaPersonalUpdate= new JButtonMe();
		this.jButtonidclienteReferenciaPersonalUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidclienteReferenciaPersonalUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidclienteReferenciaPersonalUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonidclienteReferenciaPersonalUpdate.setText("U");
		this.jButtonidclienteReferenciaPersonalUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonidclienteReferenciaPersonalUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonidclienteReferenciaPersonalUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxidclienteReferenciaPersonal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxidclienteReferenciaPersonal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"idclienteReferenciaPersonalUpdate"));



					
		this.jLabelidvalorclientereferenciapersonalReferenciaPersonal = new JLabelMe();
		this.jLabelidvalorclientereferenciapersonalReferenciaPersonal.setText(""+ReferenciaPersonalConstantesFunciones.LABEL_IDTIPOREFEPERSO+" : *");
		this.jLabelidvalorclientereferenciapersonalReferenciaPersonal.setToolTipText("Tipo Refe Perso");
		this.jLabelidvalorclientereferenciapersonalReferenciaPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelidvalorclientereferenciapersonalReferenciaPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelidvalorclientereferenciapersonalReferenciaPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelidvalorclientereferenciapersonalReferenciaPersonal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelidvalorclientereferenciapersonalReferenciaPersonal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidvalorclientereferenciapersonalReferenciaPersonal.setToolTipText(ReferenciaPersonalConstantesFunciones.LABEL_IDTIPOREFEPERSO);
		this.gridaBagLayoutReferenciaPersonal = new GridBagLayout();
		this.jPanelidvalorclientereferenciapersonalReferenciaPersonal.setLayout(this.gridaBagLayoutReferenciaPersonal);


		jComboBoxidvalorclientereferenciapersonalReferenciaPersonal= new JComboBoxMe();
		jComboBoxidvalorclientereferenciapersonalReferenciaPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidvalorclientereferenciapersonalReferenciaPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidvalorclientereferenciapersonalReferenciaPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxidvalorclientereferenciapersonalReferenciaPersonal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonidvalorclientereferenciapersonalReferenciaPersonal= new JButtonMe();
		this.jButtonidvalorclientereferenciapersonalReferenciaPersonal.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonidvalorclientereferenciapersonalReferenciaPersonal.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonidvalorclientereferenciapersonalReferenciaPersonal.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonidvalorclientereferenciapersonalReferenciaPersonal.setText("Buscar");
		this.jButtonidvalorclientereferenciapersonalReferenciaPersonal.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonidvalorclientereferenciapersonalReferenciaPersonal.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonidvalorclientereferenciapersonalReferenciaPersonal,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxidvalorclientereferenciapersonalReferenciaPersonal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxidvalorclientereferenciapersonalReferenciaPersonal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"idvalorclientereferenciapersonalReferenciaPersonal"));

		this.jButtonidvalorclientereferenciapersonalReferenciaPersonalBusqueda= new JButtonMe();
		this.jButtonidvalorclientereferenciapersonalReferenciaPersonalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidvalorclientereferenciapersonalReferenciaPersonalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidvalorclientereferenciapersonalReferenciaPersonalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonidvalorclientereferenciapersonalReferenciaPersonalBusqueda.setText("U");
		this.jButtonidvalorclientereferenciapersonalReferenciaPersonalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonidvalorclientereferenciapersonalReferenciaPersonalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonidvalorclientereferenciapersonalReferenciaPersonalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxidvalorclientereferenciapersonalReferenciaPersonal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxidvalorclientereferenciapersonalReferenciaPersonal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"idvalorclientereferenciapersonalReferenciaPersonalBusqueda"));

		if(this.referenciapersonalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonidvalorclientereferenciapersonalReferenciaPersonalBusqueda.setVisible(false);		}

		this.jButtonidvalorclientereferenciapersonalReferenciaPersonalUpdate= new JButtonMe();
		this.jButtonidvalorclientereferenciapersonalReferenciaPersonalUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidvalorclientereferenciapersonalReferenciaPersonalUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidvalorclientereferenciapersonalReferenciaPersonalUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonidvalorclientereferenciapersonalReferenciaPersonalUpdate.setText("U");
		this.jButtonidvalorclientereferenciapersonalReferenciaPersonalUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonidvalorclientereferenciapersonalReferenciaPersonalUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonidvalorclientereferenciapersonalReferenciaPersonalUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxidvalorclientereferenciapersonalReferenciaPersonal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxidvalorclientereferenciapersonalReferenciaPersonal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"idvalorclientereferenciapersonalReferenciaPersonalUpdate"));



					
		this.jLabelid_paisReferenciaPersonal = new JLabelMe();
		this.jLabelid_paisReferenciaPersonal.setText(""+ReferenciaPersonalConstantesFunciones.LABEL_IDPAIS+" : *");
		this.jLabelid_paisReferenciaPersonal.setToolTipText("Pais");
		this.jLabelid_paisReferenciaPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisReferenciaPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisReferenciaPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_paisReferenciaPersonal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_paisReferenciaPersonal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_paisReferenciaPersonal.setToolTipText(ReferenciaPersonalConstantesFunciones.LABEL_IDPAIS);
		this.gridaBagLayoutReferenciaPersonal = new GridBagLayout();
		this.jPanelid_paisReferenciaPersonal.setLayout(this.gridaBagLayoutReferenciaPersonal);


		jComboBoxid_paisReferenciaPersonal= new JComboBoxMe();
		jComboBoxid_paisReferenciaPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisReferenciaPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisReferenciaPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisReferenciaPersonal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_paisReferenciaPersonal= new JButtonMe();
		this.jButtonid_paisReferenciaPersonal.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisReferenciaPersonal.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisReferenciaPersonal.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisReferenciaPersonal.setText("Buscar");
		this.jButtonid_paisReferenciaPersonal.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_paisReferenciaPersonal.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisReferenciaPersonal,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_paisReferenciaPersonal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisReferenciaPersonal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisReferenciaPersonal"));

		this.jButtonid_paisReferenciaPersonalBusqueda= new JButtonMe();
		this.jButtonid_paisReferenciaPersonalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisReferenciaPersonalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisReferenciaPersonalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisReferenciaPersonalBusqueda.setText("U");
		this.jButtonid_paisReferenciaPersonalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_paisReferenciaPersonalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisReferenciaPersonalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_paisReferenciaPersonal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisReferenciaPersonal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisReferenciaPersonalBusqueda"));

		if(this.referenciapersonalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_paisReferenciaPersonalBusqueda.setVisible(false);		}

		this.jButtonid_paisReferenciaPersonalUpdate= new JButtonMe();
		this.jButtonid_paisReferenciaPersonalUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisReferenciaPersonalUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisReferenciaPersonalUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisReferenciaPersonalUpdate.setText("U");
		this.jButtonid_paisReferenciaPersonalUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_paisReferenciaPersonalUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisReferenciaPersonalUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_paisReferenciaPersonal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisReferenciaPersonal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisReferenciaPersonalUpdate"));



					
		this.jLabelidciudadReferenciaPersonal = new JLabelMe();
		this.jLabelidciudadReferenciaPersonal.setText(""+ReferenciaPersonalConstantesFunciones.LABEL_IDCIUDAD+" : *");
		this.jLabelidciudadReferenciaPersonal.setToolTipText("Ciudad");
		this.jLabelidciudadReferenciaPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelidciudadReferenciaPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelidciudadReferenciaPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelidciudadReferenciaPersonal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelidciudadReferenciaPersonal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidciudadReferenciaPersonal.setToolTipText(ReferenciaPersonalConstantesFunciones.LABEL_IDCIUDAD);
		this.gridaBagLayoutReferenciaPersonal = new GridBagLayout();
		this.jPanelidciudadReferenciaPersonal.setLayout(this.gridaBagLayoutReferenciaPersonal);


		jComboBoxidciudadReferenciaPersonal= new JComboBoxMe();
		jComboBoxidciudadReferenciaPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidciudadReferenciaPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidciudadReferenciaPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxidciudadReferenciaPersonal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonidciudadReferenciaPersonal= new JButtonMe();
		this.jButtonidciudadReferenciaPersonal.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonidciudadReferenciaPersonal.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonidciudadReferenciaPersonal.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonidciudadReferenciaPersonal.setText("Buscar");
		this.jButtonidciudadReferenciaPersonal.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonidciudadReferenciaPersonal.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonidciudadReferenciaPersonal,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxidciudadReferenciaPersonal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxidciudadReferenciaPersonal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"idciudadReferenciaPersonal"));

		this.jButtonidciudadReferenciaPersonalBusqueda= new JButtonMe();
		this.jButtonidciudadReferenciaPersonalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidciudadReferenciaPersonalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidciudadReferenciaPersonalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonidciudadReferenciaPersonalBusqueda.setText("U");
		this.jButtonidciudadReferenciaPersonalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonidciudadReferenciaPersonalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonidciudadReferenciaPersonalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxidciudadReferenciaPersonal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxidciudadReferenciaPersonal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"idciudadReferenciaPersonalBusqueda"));

		if(this.referenciapersonalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonidciudadReferenciaPersonalBusqueda.setVisible(false);		}

		this.jButtonidciudadReferenciaPersonalUpdate= new JButtonMe();
		this.jButtonidciudadReferenciaPersonalUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidciudadReferenciaPersonalUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidciudadReferenciaPersonalUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonidciudadReferenciaPersonalUpdate.setText("U");
		this.jButtonidciudadReferenciaPersonalUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonidciudadReferenciaPersonalUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonidciudadReferenciaPersonalUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxidciudadReferenciaPersonal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxidciudadReferenciaPersonal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"idciudadReferenciaPersonalUpdate"));



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
		//this.jInternalFrameDetalleReferenciaPersonal = new ReferenciaPersonalBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Referencia Personal DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutReferenciaPersonal= new GridBagLayout();
		

		
		String sToolTipReferenciaPersonal="";
		sToolTipReferenciaPersonal=ReferenciaPersonalConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipReferenciaPersonal+="(Cartera.ReferenciaPersonal)";
		}
		
		if(!this.referenciapersonalSessionBean.getEsGuardarRelacionado()) {
			sToolTipReferenciaPersonal+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoReferenciaPersonal = new JButtonMe();
		this.jButtonModificarReferenciaPersonal = new JButtonMe();
        this.jButtonActualizarReferenciaPersonal = new JButtonMe();
        this.jButtonEliminarReferenciaPersonal = new JButtonMe();
        this.jButtonCancelarReferenciaPersonal = new JButtonMe();
        this.jButtonGuardarCambiosReferenciaPersonal = new JButtonMe();
		this.jButtonGuardarCambiosTablaReferenciaPersonal = new JButtonMe();
		this.jButtonCerrarReferenciaPersonal = new JButtonMe();
		
		this.jScrollPanelDatosReferenciaPersonal = new JScrollPane();   
        this.jScrollPanelDatosEdicionReferenciaPersonal = new JScrollPane();
		this.jScrollPanelDatosGeneralReferenciaPersonal = new JScrollPane();
				
		
		
		this.jPanelCamposReferenciaPersonal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosReferenciaPersonal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesReferenciaPersonal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioReferenciaPersonal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Referencia Personal";
		
		if(!this.referenciapersonalSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosReferenciaPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Referencia Personales" + this.sPath));
		} else {
			this.jScrollPanelDatosReferenciaPersonal.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionReferenciaPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralReferenciaPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposReferenciaPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposReferenciaPersonal.setName("jPanelCamposReferenciaPersonal"); 

		this.jPanelCamposOcultosReferenciaPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosReferenciaPersonal.setName("jPanelCamposOcultosReferenciaPersonal"); 

        this.jPanelAccionesReferenciaPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesReferenciaPersonal.setToolTipText("Acciones");
        this.jPanelAccionesReferenciaPersonal.setName("Acciones"); 

		this.jPanelAccionesFormularioReferenciaPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioReferenciaPersonal.setToolTipText("Acciones");
        this.jPanelAccionesFormularioReferenciaPersonal.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionReferenciaPersonal, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralReferenciaPersonal, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosReferenciaPersonal, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposReferenciaPersonal, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosReferenciaPersonal, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioReferenciaPersonal, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoReferenciaPersonal.setText("Nuevo");
		this.jButtonModificarReferenciaPersonal.setText("Editar");
        this.jButtonActualizarReferenciaPersonal.setText("Actualizar");
        this.jButtonEliminarReferenciaPersonal.setText("Eliminar");
        this.jButtonCancelarReferenciaPersonal.setText("Cancelar");
        this.jButtonGuardarCambiosReferenciaPersonal.setText("Guardar");
		this.jButtonGuardarCambiosTablaReferenciaPersonal.setText("Guardar");
		this.jButtonCerrarReferenciaPersonal.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoReferenciaPersonal,"nuevo_button","Nuevo",this.referenciapersonalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarReferenciaPersonal,"modificar_button","Editar",this.referenciapersonalSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarReferenciaPersonal,"actualizar_button","Actualizar",this.referenciapersonalSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarReferenciaPersonal,"eliminar_button","Eliminar",this.referenciapersonalSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarReferenciaPersonal,"cancelar_button","Cancelar",this.referenciapersonalSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosReferenciaPersonal,"guardarcambios_button","Guardar",this.referenciapersonalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaReferenciaPersonal,"guardarcambiostabla_button","Guardar",this.referenciapersonalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReferenciaPersonal,"cerrar_button","Salir",this.referenciapersonalSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoReferenciaPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarReferenciaPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosReferenciaPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaReferenciaPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarReferenciaPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarReferenciaPersonal, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarReferenciaPersonal, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarReferenciaPersonal, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoReferenciaPersonal.setToolTipText("Nuevo"+" "+ReferenciaPersonalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarReferenciaPersonal.setToolTipText("Editar"+" "+ReferenciaPersonalConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarReferenciaPersonal.setToolTipText("Actualizar"+" "+ReferenciaPersonalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarReferenciaPersonal.setToolTipText("Eliminar)"+" "+ReferenciaPersonalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarReferenciaPersonal.setToolTipText("Cancelar"+" "+ReferenciaPersonalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosReferenciaPersonal.setToolTipText("Guardar"+" "+ReferenciaPersonalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaReferenciaPersonal.setToolTipText("Guardar"+" "+ReferenciaPersonalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarReferenciaPersonal.setToolTipText("Salir"+" "+ReferenciaPersonalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoReferenciaPersonal";
		inputMap = this.jButtonNuevoReferenciaPersonal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoReferenciaPersonal.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoReferenciaPersonal"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarReferenciaPersonal";
		inputMap = this.jButtonActualizarReferenciaPersonal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarReferenciaPersonal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarReferenciaPersonal"));
		
		//ELIMINAR
		sMapKey = "EliminarReferenciaPersonal";
		inputMap = this.jButtonEliminarReferenciaPersonal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarReferenciaPersonal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarReferenciaPersonal"));
		
		//CANCELAR	
		sMapKey = "CancelarReferenciaPersonal";
		inputMap = this.jButtonCancelarReferenciaPersonal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarReferenciaPersonal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarReferenciaPersonal"));
		
		//CERRAR		
		sMapKey = "CerrarReferenciaPersonal";
		inputMap = this.jButtonCerrarReferenciaPersonal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarReferenciaPersonal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarReferenciaPersonal"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaReferenciaPersonal";
		inputMap = this.jButtonGuardarCambiosTablaReferenciaPersonal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaReferenciaPersonal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaReferenciaPersonal"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoReferenciaPersonal = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoReferenciaPersonal.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoReferenciaPersonal.setToolTipText("Nuevo ReferenciaPersonal");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoReferenciaPersonal, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarReferenciaPersonal = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarReferenciaPersonal.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarReferenciaPersonal.setToolTipText("Sin Cerrar Ventana ReferenciaPersonal");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarReferenciaPersonal, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeReferenciaPersonal = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeReferenciaPersonal.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeReferenciaPersonal.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeReferenciaPersonal, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesReferenciaPersonal = new JComboBoxMe();
		//this.jComboBoxTiposAccionesReferenciaPersonal.setText("Accion");
		this.jComboBoxTiposAccionesReferenciaPersonal.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioReferenciaPersonal = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioReferenciaPersonal.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioReferenciaPersonal.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesReferenciaPersonal = new JLabelMe();
		
		this.jLabelAccionesReferenciaPersonal.setText("Acciones");		
		this.jLabelAccionesReferenciaPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesReferenciaPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesReferenciaPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposReferenciaPersonal();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysReferenciaPersonal();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesReferenciaPersonal=new JTabbedPane();
		this.jTabbedPaneRelacionesReferenciaPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesReferenciaPersonal,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesReferenciaPersonal.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesReferenciaPersonal.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesReferenciaPersonal.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesReferenciaPersonal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioReferenciaPersonal.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioReferenciaPersonal.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioReferenciaPersonal.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioReferenciaPersonal, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposReferenciaPersonal = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosReferenciaPersonal = new GridBagLayout();
		
		this.jPanelCamposReferenciaPersonal.setLayout(gridaBagLayoutCamposReferenciaPersonal);
		this.jPanelCamposOcultosReferenciaPersonal.setLayout(gridaBagLayoutCamposOcultosReferenciaPersonal);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
	this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaPersonal.gridy = 0;
	this.gridBagConstraintsReferenciaPersonal.gridx = 0;
	this.gridBagConstraintsReferenciaPersonal.ipadx = 0;
	this.gridBagConstraintsReferenciaPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidReferenciaPersonal.add(jLabelIdReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);



	this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
	this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaPersonal.gridy = 0;
	this.gridBagConstraintsReferenciaPersonal.gridx = 1;
	this.gridBagConstraintsReferenciaPersonal.ipadx = 0;
	this.gridBagConstraintsReferenciaPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidReferenciaPersonal.add(jLabelidReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);


	this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
	this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaPersonal.gridy = 0;
	this.gridBagConstraintsReferenciaPersonal.gridx = 0;
	this.gridBagConstraintsReferenciaPersonal.ipadx = 0;
	this.gridBagConstraintsReferenciaPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaReferenciaPersonal.add(jLabelid_empresaReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
		//this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaPersonal.gridy = 0;
		this.gridBagConstraintsReferenciaPersonal.gridx = 2;
		this.gridBagConstraintsReferenciaPersonal.ipadx = 0;
		this.gridBagConstraintsReferenciaPersonal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaReferenciaPersonal.add(jButtonid_empresaReferenciaPersonalBusqueda, this.gridBagConstraintsReferenciaPersonal);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
		//this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaPersonal.gridy = 0;
		this.gridBagConstraintsReferenciaPersonal.gridx = 3;
		this.gridBagConstraintsReferenciaPersonal.ipadx = 0;
		this.gridBagConstraintsReferenciaPersonal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaReferenciaPersonal.add(jButtonid_empresaReferenciaPersonalUpdate, this.gridBagConstraintsReferenciaPersonal);
	}

	this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
	this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaPersonal.gridy = 0;
	this.gridBagConstraintsReferenciaPersonal.gridx = 1;
	this.gridBagConstraintsReferenciaPersonal.ipadx = 0;
	this.gridBagConstraintsReferenciaPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaReferenciaPersonal.add(jComboBoxid_empresaReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);


	this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
	this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaPersonal.gridy = 0;
	this.gridBagConstraintsReferenciaPersonal.gridx = 0;
	this.gridBagConstraintsReferenciaPersonal.ipadx = 0;
	this.gridBagConstraintsReferenciaPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidclienteReferenciaPersonal.add(jLabelidclienteReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
	//this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaPersonal.gridy = 0;
	this.gridBagConstraintsReferenciaPersonal.gridx = 2;
	this.gridBagConstraintsReferenciaPersonal.ipadx = 0;
	this.gridBagConstraintsReferenciaPersonal.insets = new Insets(0, 0, 0, 0);
	this.jPanelidclienteReferenciaPersonal.add(jButtonidclienteReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
		//this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaPersonal.gridy = 0;
		this.gridBagConstraintsReferenciaPersonal.gridx = 3;
		this.gridBagConstraintsReferenciaPersonal.ipadx = 0;
		this.gridBagConstraintsReferenciaPersonal.insets = new Insets(0, 0, 0, 0);
		this.jPanelidclienteReferenciaPersonal.add(jButtonidclienteReferenciaPersonalBusqueda, this.gridBagConstraintsReferenciaPersonal);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
		//this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaPersonal.gridy = 0;
		this.gridBagConstraintsReferenciaPersonal.gridx = 4;
		this.gridBagConstraintsReferenciaPersonal.ipadx = 0;
		this.gridBagConstraintsReferenciaPersonal.insets = new Insets(0, 0, 0, 0);
		this.jPanelidclienteReferenciaPersonal.add(jButtonidclienteReferenciaPersonalUpdate, this.gridBagConstraintsReferenciaPersonal);
	}

	this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
	this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaPersonal.gridy = 0;
	this.gridBagConstraintsReferenciaPersonal.gridx = 1;
	this.gridBagConstraintsReferenciaPersonal.ipadx = 0;
	this.gridBagConstraintsReferenciaPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidclienteReferenciaPersonal.add(jComboBoxidclienteReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);


	this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
	this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaPersonal.gridy = 0;
	this.gridBagConstraintsReferenciaPersonal.gridx = 0;
	this.gridBagConstraintsReferenciaPersonal.ipadx = 0;
	this.gridBagConstraintsReferenciaPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidvalorclientereferenciapersonalReferenciaPersonal.add(jLabelidvalorclientereferenciapersonalReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
		//this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaPersonal.gridy = 0;
		this.gridBagConstraintsReferenciaPersonal.gridx = 2;
		this.gridBagConstraintsReferenciaPersonal.ipadx = 0;
		this.gridBagConstraintsReferenciaPersonal.insets = new Insets(0, 0, 0, 0);
		this.jPanelidvalorclientereferenciapersonalReferenciaPersonal.add(jButtonidvalorclientereferenciapersonalReferenciaPersonalBusqueda, this.gridBagConstraintsReferenciaPersonal);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
		//this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaPersonal.gridy = 0;
		this.gridBagConstraintsReferenciaPersonal.gridx = 3;
		this.gridBagConstraintsReferenciaPersonal.ipadx = 0;
		this.gridBagConstraintsReferenciaPersonal.insets = new Insets(0, 0, 0, 0);
		this.jPanelidvalorclientereferenciapersonalReferenciaPersonal.add(jButtonidvalorclientereferenciapersonalReferenciaPersonalUpdate, this.gridBagConstraintsReferenciaPersonal);
	}

	this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
	this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaPersonal.gridy = 0;
	this.gridBagConstraintsReferenciaPersonal.gridx = 1;
	this.gridBagConstraintsReferenciaPersonal.ipadx = 0;
	this.gridBagConstraintsReferenciaPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidvalorclientereferenciapersonalReferenciaPersonal.add(jComboBoxidvalorclientereferenciapersonalReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);


	this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
	this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaPersonal.gridy = 0;
	this.gridBagConstraintsReferenciaPersonal.gridx = 0;
	this.gridBagConstraintsReferenciaPersonal.ipadx = 0;
	this.gridBagConstraintsReferenciaPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_paisReferenciaPersonal.add(jLabelid_paisReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
		//this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaPersonal.gridy = 0;
		this.gridBagConstraintsReferenciaPersonal.gridx = 2;
		this.gridBagConstraintsReferenciaPersonal.ipadx = 0;
		this.gridBagConstraintsReferenciaPersonal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisReferenciaPersonal.add(jButtonid_paisReferenciaPersonalBusqueda, this.gridBagConstraintsReferenciaPersonal);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
		//this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaPersonal.gridy = 0;
		this.gridBagConstraintsReferenciaPersonal.gridx = 3;
		this.gridBagConstraintsReferenciaPersonal.ipadx = 0;
		this.gridBagConstraintsReferenciaPersonal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisReferenciaPersonal.add(jButtonid_paisReferenciaPersonalUpdate, this.gridBagConstraintsReferenciaPersonal);
	}

	this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
	this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaPersonal.gridy = 0;
	this.gridBagConstraintsReferenciaPersonal.gridx = 1;
	this.gridBagConstraintsReferenciaPersonal.ipadx = 0;
	this.gridBagConstraintsReferenciaPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_paisReferenciaPersonal.add(jComboBoxid_paisReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);


	this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
	this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaPersonal.gridy = 0;
	this.gridBagConstraintsReferenciaPersonal.gridx = 0;
	this.gridBagConstraintsReferenciaPersonal.ipadx = 0;
	this.gridBagConstraintsReferenciaPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidciudadReferenciaPersonal.add(jLabelidciudadReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
		//this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaPersonal.gridy = 0;
		this.gridBagConstraintsReferenciaPersonal.gridx = 2;
		this.gridBagConstraintsReferenciaPersonal.ipadx = 0;
		this.gridBagConstraintsReferenciaPersonal.insets = new Insets(0, 0, 0, 0);
		this.jPanelidciudadReferenciaPersonal.add(jButtonidciudadReferenciaPersonalBusqueda, this.gridBagConstraintsReferenciaPersonal);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
		//this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaPersonal.gridy = 0;
		this.gridBagConstraintsReferenciaPersonal.gridx = 3;
		this.gridBagConstraintsReferenciaPersonal.ipadx = 0;
		this.gridBagConstraintsReferenciaPersonal.insets = new Insets(0, 0, 0, 0);
		this.jPanelidciudadReferenciaPersonal.add(jButtonidciudadReferenciaPersonalUpdate, this.gridBagConstraintsReferenciaPersonal);
	}

	this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
	this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaPersonal.gridy = 0;
	this.gridBagConstraintsReferenciaPersonal.gridx = 1;
	this.gridBagConstraintsReferenciaPersonal.ipadx = 0;
	this.gridBagConstraintsReferenciaPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidciudadReferenciaPersonal.add(jComboBoxidciudadReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);


	this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
	this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaPersonal.gridy = 0;
	this.gridBagConstraintsReferenciaPersonal.gridx = 0;
	this.gridBagConstraintsReferenciaPersonal.ipadx = 0;
	this.gridBagConstraintsReferenciaPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreReferenciaPersonal.add(jLabelnombreReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
		//this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaPersonal.gridy = 0;
		this.gridBagConstraintsReferenciaPersonal.gridx = 2;
		this.gridBagConstraintsReferenciaPersonal.ipadx = 0;
		this.gridBagConstraintsReferenciaPersonal.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreReferenciaPersonal.add(jButtonnombreReferenciaPersonalBusqueda, this.gridBagConstraintsReferenciaPersonal);
	}

	this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
	this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaPersonal.gridy = 0;
	this.gridBagConstraintsReferenciaPersonal.gridx = 1;
	this.gridBagConstraintsReferenciaPersonal.ipadx = 0;
	this.gridBagConstraintsReferenciaPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreReferenciaPersonal.add(jscrollPanenombreReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);


	this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
	this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaPersonal.gridy = 0;
	this.gridBagConstraintsReferenciaPersonal.gridx = 0;
	this.gridBagConstraintsReferenciaPersonal.ipadx = 0;
	this.gridBagConstraintsReferenciaPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidentificacionReferenciaPersonal.add(jLabelidentificacionReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
		//this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaPersonal.gridy = 0;
		this.gridBagConstraintsReferenciaPersonal.gridx = 2;
		this.gridBagConstraintsReferenciaPersonal.ipadx = 0;
		this.gridBagConstraintsReferenciaPersonal.insets = new Insets(0, 0, 0, 0);
		this.jPanelidentificacionReferenciaPersonal.add(jButtonidentificacionReferenciaPersonalBusqueda, this.gridBagConstraintsReferenciaPersonal);
	}

	this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
	this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaPersonal.gridy = 0;
	this.gridBagConstraintsReferenciaPersonal.gridx = 1;
	this.gridBagConstraintsReferenciaPersonal.ipadx = 0;
	this.gridBagConstraintsReferenciaPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidentificacionReferenciaPersonal.add(jTextFieldidentificacionReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);


	this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
	this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaPersonal.gridy = 0;
	this.gridBagConstraintsReferenciaPersonal.gridx = 0;
	this.gridBagConstraintsReferenciaPersonal.ipadx = 0;
	this.gridBagConstraintsReferenciaPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_nacimientoReferenciaPersonal.add(jLabelfecha_nacimientoReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
		//this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaPersonal.gridy = 0;
		this.gridBagConstraintsReferenciaPersonal.gridx = 2;
		this.gridBagConstraintsReferenciaPersonal.ipadx = 0;
		this.gridBagConstraintsReferenciaPersonal.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_nacimientoReferenciaPersonal.add(jButtonfecha_nacimientoReferenciaPersonalBusqueda, this.gridBagConstraintsReferenciaPersonal);
	}

	this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
	this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaPersonal.gridy = 0;
	this.gridBagConstraintsReferenciaPersonal.gridx = 1;
	this.gridBagConstraintsReferenciaPersonal.ipadx = 0;
	this.gridBagConstraintsReferenciaPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_nacimientoReferenciaPersonal.add(jDateChooserfecha_nacimientoReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);


	this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
	this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaPersonal.gridy = 0;
	this.gridBagConstraintsReferenciaPersonal.gridx = 0;
	this.gridBagConstraintsReferenciaPersonal.ipadx = 0;
	this.gridBagConstraintsReferenciaPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldireccionReferenciaPersonal.add(jLabeldireccionReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
		//this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaPersonal.gridy = 0;
		this.gridBagConstraintsReferenciaPersonal.gridx = 2;
		this.gridBagConstraintsReferenciaPersonal.ipadx = 0;
		this.gridBagConstraintsReferenciaPersonal.insets = new Insets(0, 0, 0, 0);
		this.jPaneldireccionReferenciaPersonal.add(jButtondireccionReferenciaPersonalBusqueda, this.gridBagConstraintsReferenciaPersonal);
	}

	this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
	this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaPersonal.gridy = 0;
	this.gridBagConstraintsReferenciaPersonal.gridx = 1;
	this.gridBagConstraintsReferenciaPersonal.ipadx = 0;
	this.gridBagConstraintsReferenciaPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldireccionReferenciaPersonal.add(jscrollPanedireccionReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);


	this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
	this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaPersonal.gridy = 0;
	this.gridBagConstraintsReferenciaPersonal.gridx = 0;
	this.gridBagConstraintsReferenciaPersonal.ipadx = 0;
	this.gridBagConstraintsReferenciaPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltelefonoReferenciaPersonal.add(jLabeltelefonoReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
		//this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaPersonal.gridy = 0;
		this.gridBagConstraintsReferenciaPersonal.gridx = 2;
		this.gridBagConstraintsReferenciaPersonal.ipadx = 0;
		this.gridBagConstraintsReferenciaPersonal.insets = new Insets(0, 0, 0, 0);
		this.jPaneltelefonoReferenciaPersonal.add(jButtontelefonoReferenciaPersonalBusqueda, this.gridBagConstraintsReferenciaPersonal);
	}

	this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
	this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaPersonal.gridy = 0;
	this.gridBagConstraintsReferenciaPersonal.gridx = 1;
	this.gridBagConstraintsReferenciaPersonal.ipadx = 0;
	this.gridBagConstraintsReferenciaPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltelefonoReferenciaPersonal.add(jscrollPanetelefonoReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);


	this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
	this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaPersonal.gridy = 0;
	this.gridBagConstraintsReferenciaPersonal.gridx = 0;
	this.gridBagConstraintsReferenciaPersonal.ipadx = 0;
	this.gridBagConstraintsReferenciaPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltelefonomovilReferenciaPersonal.add(jLabeltelefonomovilReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
		//this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaPersonal.gridy = 0;
		this.gridBagConstraintsReferenciaPersonal.gridx = 2;
		this.gridBagConstraintsReferenciaPersonal.ipadx = 0;
		this.gridBagConstraintsReferenciaPersonal.insets = new Insets(0, 0, 0, 0);
		this.jPaneltelefonomovilReferenciaPersonal.add(jButtontelefonomovilReferenciaPersonalBusqueda, this.gridBagConstraintsReferenciaPersonal);
	}

	this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
	this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaPersonal.gridy = 0;
	this.gridBagConstraintsReferenciaPersonal.gridx = 1;
	this.gridBagConstraintsReferenciaPersonal.ipadx = 0;
	this.gridBagConstraintsReferenciaPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltelefonomovilReferenciaPersonal.add(jscrollPanetelefonomovilReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);


	this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
	this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaPersonal.gridy = 0;
	this.gridBagConstraintsReferenciaPersonal.gridx = 0;
	this.gridBagConstraintsReferenciaPersonal.ipadx = 0;
	this.gridBagConstraintsReferenciaPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltelefonocodigoareaReferenciaPersonal.add(jLabeltelefonocodigoareaReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
		//this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaPersonal.gridy = 0;
		this.gridBagConstraintsReferenciaPersonal.gridx = 2;
		this.gridBagConstraintsReferenciaPersonal.ipadx = 0;
		this.gridBagConstraintsReferenciaPersonal.insets = new Insets(0, 0, 0, 0);
		this.jPaneltelefonocodigoareaReferenciaPersonal.add(jButtontelefonocodigoareaReferenciaPersonalBusqueda, this.gridBagConstraintsReferenciaPersonal);
	}

	this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
	this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaPersonal.gridy = 0;
	this.gridBagConstraintsReferenciaPersonal.gridx = 1;
	this.gridBagConstraintsReferenciaPersonal.ipadx = 0;
	this.gridBagConstraintsReferenciaPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltelefonocodigoareaReferenciaPersonal.add(jTextFieldtelefonocodigoareaReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);


	this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
	this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaPersonal.gridy = 0;
	this.gridBagConstraintsReferenciaPersonal.gridx = 0;
	this.gridBagConstraintsReferenciaPersonal.ipadx = 0;
	this.gridBagConstraintsReferenciaPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelpreferenciaReferenciaPersonal.add(jLabelpreferenciaReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
		//this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaPersonal.gridy = 0;
		this.gridBagConstraintsReferenciaPersonal.gridx = 2;
		this.gridBagConstraintsReferenciaPersonal.ipadx = 0;
		this.gridBagConstraintsReferenciaPersonal.insets = new Insets(0, 0, 0, 0);
		this.jPanelpreferenciaReferenciaPersonal.add(jButtonpreferenciaReferenciaPersonalBusqueda, this.gridBagConstraintsReferenciaPersonal);
	}

	this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
	this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaPersonal.gridy = 0;
	this.gridBagConstraintsReferenciaPersonal.gridx = 1;
	this.gridBagConstraintsReferenciaPersonal.ipadx = 0;
	this.gridBagConstraintsReferenciaPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelpreferenciaReferenciaPersonal.add(jscrollPanepreferenciaReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);


	this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
	this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaPersonal.gridy = 0;
	this.gridBagConstraintsReferenciaPersonal.gridx = 0;
	this.gridBagConstraintsReferenciaPersonal.ipadx = 0;
	this.gridBagConstraintsReferenciaPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelemailReferenciaPersonal.add(jLabelemailReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
		//this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaPersonal.gridy = 0;
		this.gridBagConstraintsReferenciaPersonal.gridx = 2;
		this.gridBagConstraintsReferenciaPersonal.ipadx = 0;
		this.gridBagConstraintsReferenciaPersonal.insets = new Insets(0, 0, 0, 0);
		this.jPanelemailReferenciaPersonal.add(jButtonemailReferenciaPersonalBusqueda, this.gridBagConstraintsReferenciaPersonal);
	}

	this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
	this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaPersonal.gridy = 0;
	this.gridBagConstraintsReferenciaPersonal.gridx = 1;
	this.gridBagConstraintsReferenciaPersonal.ipadx = 0;
	this.gridBagConstraintsReferenciaPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelemailReferenciaPersonal.add(jscrollPaneemailReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);


	this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
	this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaPersonal.gridy = 0;
	this.gridBagConstraintsReferenciaPersonal.gridx = 0;
	this.gridBagConstraintsReferenciaPersonal.ipadx = 0;
	this.gridBagConstraintsReferenciaPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelobservacionReferenciaPersonal.add(jLabelobservacionReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
		//this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaPersonal.gridy = 0;
		this.gridBagConstraintsReferenciaPersonal.gridx = 2;
		this.gridBagConstraintsReferenciaPersonal.ipadx = 0;
		this.gridBagConstraintsReferenciaPersonal.insets = new Insets(0, 0, 0, 0);
		this.jPanelobservacionReferenciaPersonal.add(jButtonobservacionReferenciaPersonalBusqueda, this.gridBagConstraintsReferenciaPersonal);
	}

	this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
	this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaPersonal.gridy = 0;
	this.gridBagConstraintsReferenciaPersonal.gridx = 1;
	this.gridBagConstraintsReferenciaPersonal.ipadx = 0;
	this.gridBagConstraintsReferenciaPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelobservacionReferenciaPersonal.add(jscrollPaneobservacionReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);


	this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
	this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaPersonal.gridy = 0;
	this.gridBagConstraintsReferenciaPersonal.gridx = 0;
	this.gridBagConstraintsReferenciaPersonal.ipadx = 0;
	this.gridBagConstraintsReferenciaPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelesta_trabajandoReferenciaPersonal.add(jLabelesta_trabajandoReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
		//this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaPersonal.gridy = 0;
		this.gridBagConstraintsReferenciaPersonal.gridx = 2;
		this.gridBagConstraintsReferenciaPersonal.ipadx = 0;
		this.gridBagConstraintsReferenciaPersonal.insets = new Insets(0, 0, 0, 0);
		this.jPanelesta_trabajandoReferenciaPersonal.add(jButtonesta_trabajandoReferenciaPersonalBusqueda, this.gridBagConstraintsReferenciaPersonal);
	}

	this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
	this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaPersonal.gridy = 0;
	this.gridBagConstraintsReferenciaPersonal.gridx = 1;
	this.gridBagConstraintsReferenciaPersonal.ipadx = 0;
	this.gridBagConstraintsReferenciaPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelesta_trabajandoReferenciaPersonal.add(jCheckBoxesta_trabajandoReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);


	this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
	this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaPersonal.gridy = 0;
	this.gridBagConstraintsReferenciaPersonal.gridx = 0;
	this.gridBagConstraintsReferenciaPersonal.ipadx = 0;
	this.gridBagConstraintsReferenciaPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelempresa_trabajoReferenciaPersonal.add(jLabelempresa_trabajoReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
		//this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaPersonal.gridy = 0;
		this.gridBagConstraintsReferenciaPersonal.gridx = 2;
		this.gridBagConstraintsReferenciaPersonal.ipadx = 0;
		this.gridBagConstraintsReferenciaPersonal.insets = new Insets(0, 0, 0, 0);
		this.jPanelempresa_trabajoReferenciaPersonal.add(jButtonempresa_trabajoReferenciaPersonalBusqueda, this.gridBagConstraintsReferenciaPersonal);
	}

	this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
	this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaPersonal.gridy = 0;
	this.gridBagConstraintsReferenciaPersonal.gridx = 1;
	this.gridBagConstraintsReferenciaPersonal.ipadx = 0;
	this.gridBagConstraintsReferenciaPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelempresa_trabajoReferenciaPersonal.add(jscrollPaneempresa_trabajoReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);


	this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
	this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaPersonal.gridy = 0;
	this.gridBagConstraintsReferenciaPersonal.gridx = 0;
	this.gridBagConstraintsReferenciaPersonal.ipadx = 0;
	this.gridBagConstraintsReferenciaPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldireccion_trabajoReferenciaPersonal.add(jLabeldireccion_trabajoReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
		//this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaPersonal.gridy = 0;
		this.gridBagConstraintsReferenciaPersonal.gridx = 2;
		this.gridBagConstraintsReferenciaPersonal.ipadx = 0;
		this.gridBagConstraintsReferenciaPersonal.insets = new Insets(0, 0, 0, 0);
		this.jPaneldireccion_trabajoReferenciaPersonal.add(jButtondireccion_trabajoReferenciaPersonalBusqueda, this.gridBagConstraintsReferenciaPersonal);
	}

	this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
	this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaPersonal.gridy = 0;
	this.gridBagConstraintsReferenciaPersonal.gridx = 1;
	this.gridBagConstraintsReferenciaPersonal.ipadx = 0;
	this.gridBagConstraintsReferenciaPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldireccion_trabajoReferenciaPersonal.add(jscrollPanedireccion_trabajoReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);


	this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
	this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaPersonal.gridy = 0;
	this.gridBagConstraintsReferenciaPersonal.gridx = 0;
	this.gridBagConstraintsReferenciaPersonal.ipadx = 0;
	this.gridBagConstraintsReferenciaPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltelefono_trabajoReferenciaPersonal.add(jLabeltelefono_trabajoReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
		//this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaPersonal.gridy = 0;
		this.gridBagConstraintsReferenciaPersonal.gridx = 2;
		this.gridBagConstraintsReferenciaPersonal.ipadx = 0;
		this.gridBagConstraintsReferenciaPersonal.insets = new Insets(0, 0, 0, 0);
		this.jPaneltelefono_trabajoReferenciaPersonal.add(jButtontelefono_trabajoReferenciaPersonalBusqueda, this.gridBagConstraintsReferenciaPersonal);
	}

	this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
	this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaPersonal.gridy = 0;
	this.gridBagConstraintsReferenciaPersonal.gridx = 1;
	this.gridBagConstraintsReferenciaPersonal.ipadx = 0;
	this.gridBagConstraintsReferenciaPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltelefono_trabajoReferenciaPersonal.add(jscrollPanetelefono_trabajoReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);


	this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
	this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaPersonal.gridy = 0;
	this.gridBagConstraintsReferenciaPersonal.gridx = 0;
	this.gridBagConstraintsReferenciaPersonal.ipadx = 0;
	this.gridBagConstraintsReferenciaPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelesactivoReferenciaPersonal.add(jLabelesactivoReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
		//this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaPersonal.gridy = 0;
		this.gridBagConstraintsReferenciaPersonal.gridx = 2;
		this.gridBagConstraintsReferenciaPersonal.ipadx = 0;
		this.gridBagConstraintsReferenciaPersonal.insets = new Insets(0, 0, 0, 0);
		this.jPanelesactivoReferenciaPersonal.add(jButtonesactivoReferenciaPersonalBusqueda, this.gridBagConstraintsReferenciaPersonal);
	}

	this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
	this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaPersonal.gridy = 0;
	this.gridBagConstraintsReferenciaPersonal.gridx = 1;
	this.gridBagConstraintsReferenciaPersonal.ipadx = 0;
	this.gridBagConstraintsReferenciaPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelesactivoReferenciaPersonal.add(jCheckBoxesactivoReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
	this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsReferenciaPersonal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsReferenciaPersonal.gridy = iYPanelCamposReferenciaPersonal;
	this.gridBagConstraintsReferenciaPersonal.gridx = iXPanelCamposReferenciaPersonal++;
	this.gridBagConstraintsReferenciaPersonal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsReferenciaPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposReferenciaPersonal.add(this.jPanelidReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);



	if(iXPanelCamposReferenciaPersonal % 2==0) {
		iXPanelCamposReferenciaPersonal=0;
		iYPanelCamposReferenciaPersonal++;
	}
	this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
	this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsReferenciaPersonal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsReferenciaPersonal.gridy = iYPanelCamposReferenciaPersonal;
	this.gridBagConstraintsReferenciaPersonal.gridx = iXPanelCamposReferenciaPersonal++;
	this.gridBagConstraintsReferenciaPersonal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsReferenciaPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposReferenciaPersonal.add(this.jPanelidclienteReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);



	if(iXPanelCamposReferenciaPersonal % 2==0) {
		iXPanelCamposReferenciaPersonal=0;
		iYPanelCamposReferenciaPersonal++;
	}
	this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
	this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsReferenciaPersonal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsReferenciaPersonal.gridy = iYPanelCamposReferenciaPersonal;
	this.gridBagConstraintsReferenciaPersonal.gridx = iXPanelCamposReferenciaPersonal++;
	this.gridBagConstraintsReferenciaPersonal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsReferenciaPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposReferenciaPersonal.add(this.jPanelidvalorclientereferenciapersonalReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);



	if(iXPanelCamposReferenciaPersonal % 2==0) {
		iXPanelCamposReferenciaPersonal=0;
		iYPanelCamposReferenciaPersonal++;
	}
	this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
	this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsReferenciaPersonal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsReferenciaPersonal.gridy = iYPanelCamposReferenciaPersonal;
	this.gridBagConstraintsReferenciaPersonal.gridx = iXPanelCamposReferenciaPersonal++;
	this.gridBagConstraintsReferenciaPersonal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsReferenciaPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposReferenciaPersonal.add(this.jPanelid_paisReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);



	if(iXPanelCamposReferenciaPersonal % 2==0) {
		iXPanelCamposReferenciaPersonal=0;
		iYPanelCamposReferenciaPersonal++;
	}
	this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
	this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsReferenciaPersonal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsReferenciaPersonal.gridy = iYPanelCamposReferenciaPersonal;
	this.gridBagConstraintsReferenciaPersonal.gridx = iXPanelCamposReferenciaPersonal++;
	this.gridBagConstraintsReferenciaPersonal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsReferenciaPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposReferenciaPersonal.add(this.jPanelidciudadReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);



	if(iXPanelCamposReferenciaPersonal % 2==0) {
		iXPanelCamposReferenciaPersonal=0;
		iYPanelCamposReferenciaPersonal++;
	}
	this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
	this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsReferenciaPersonal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsReferenciaPersonal.gridy = iYPanelCamposReferenciaPersonal;
	this.gridBagConstraintsReferenciaPersonal.gridx = iXPanelCamposReferenciaPersonal++;
	this.gridBagConstraintsReferenciaPersonal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsReferenciaPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposReferenciaPersonal.add(this.jPanelnombreReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);



	if(iXPanelCamposReferenciaPersonal % 2==0) {
		iXPanelCamposReferenciaPersonal=0;
		iYPanelCamposReferenciaPersonal++;
	}
	this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
	this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsReferenciaPersonal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsReferenciaPersonal.gridy = iYPanelCamposReferenciaPersonal;
	this.gridBagConstraintsReferenciaPersonal.gridx = iXPanelCamposReferenciaPersonal++;
	this.gridBagConstraintsReferenciaPersonal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsReferenciaPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposReferenciaPersonal.add(this.jPanelidentificacionReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);



	if(iXPanelCamposReferenciaPersonal % 2==0) {
		iXPanelCamposReferenciaPersonal=0;
		iYPanelCamposReferenciaPersonal++;
	}
	this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
	this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsReferenciaPersonal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsReferenciaPersonal.gridy = iYPanelCamposReferenciaPersonal;
	this.gridBagConstraintsReferenciaPersonal.gridx = iXPanelCamposReferenciaPersonal++;
	this.gridBagConstraintsReferenciaPersonal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsReferenciaPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposReferenciaPersonal.add(this.jPanelfecha_nacimientoReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);



	if(iXPanelCamposReferenciaPersonal % 2==0) {
		iXPanelCamposReferenciaPersonal=0;
		iYPanelCamposReferenciaPersonal++;
	}
	this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
	this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsReferenciaPersonal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsReferenciaPersonal.gridy = iYPanelCamposReferenciaPersonal;
	this.gridBagConstraintsReferenciaPersonal.gridx = iXPanelCamposReferenciaPersonal++;
	this.gridBagConstraintsReferenciaPersonal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsReferenciaPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposReferenciaPersonal.add(this.jPaneldireccionReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);



	if(iXPanelCamposReferenciaPersonal % 2==0) {
		iXPanelCamposReferenciaPersonal=0;
		iYPanelCamposReferenciaPersonal++;
	}
	this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
	this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsReferenciaPersonal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsReferenciaPersonal.gridy = iYPanelCamposReferenciaPersonal;
	this.gridBagConstraintsReferenciaPersonal.gridx = iXPanelCamposReferenciaPersonal++;
	this.gridBagConstraintsReferenciaPersonal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsReferenciaPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposReferenciaPersonal.add(this.jPaneltelefonoReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);



	if(iXPanelCamposReferenciaPersonal % 2==0) {
		iXPanelCamposReferenciaPersonal=0;
		iYPanelCamposReferenciaPersonal++;
	}
	this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
	this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsReferenciaPersonal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsReferenciaPersonal.gridy = iYPanelCamposReferenciaPersonal;
	this.gridBagConstraintsReferenciaPersonal.gridx = iXPanelCamposReferenciaPersonal++;
	this.gridBagConstraintsReferenciaPersonal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsReferenciaPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposReferenciaPersonal.add(this.jPaneltelefonomovilReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);



	if(iXPanelCamposReferenciaPersonal % 2==0) {
		iXPanelCamposReferenciaPersonal=0;
		iYPanelCamposReferenciaPersonal++;
	}
	this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
	this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsReferenciaPersonal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsReferenciaPersonal.gridy = iYPanelCamposReferenciaPersonal;
	this.gridBagConstraintsReferenciaPersonal.gridx = iXPanelCamposReferenciaPersonal++;
	this.gridBagConstraintsReferenciaPersonal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsReferenciaPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposReferenciaPersonal.add(this.jPaneltelefonocodigoareaReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);



	if(iXPanelCamposReferenciaPersonal % 2==0) {
		iXPanelCamposReferenciaPersonal=0;
		iYPanelCamposReferenciaPersonal++;
	}
	this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
	this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsReferenciaPersonal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsReferenciaPersonal.gridy = iYPanelCamposReferenciaPersonal;
	this.gridBagConstraintsReferenciaPersonal.gridx = iXPanelCamposReferenciaPersonal++;
	this.gridBagConstraintsReferenciaPersonal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsReferenciaPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposReferenciaPersonal.add(this.jPanelpreferenciaReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);



	if(iXPanelCamposReferenciaPersonal % 2==0) {
		iXPanelCamposReferenciaPersonal=0;
		iYPanelCamposReferenciaPersonal++;
	}
	this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
	this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsReferenciaPersonal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsReferenciaPersonal.gridy = iYPanelCamposReferenciaPersonal;
	this.gridBagConstraintsReferenciaPersonal.gridx = iXPanelCamposReferenciaPersonal++;
	this.gridBagConstraintsReferenciaPersonal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsReferenciaPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposReferenciaPersonal.add(this.jPanelemailReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);



	if(iXPanelCamposReferenciaPersonal % 2==0) {
		iXPanelCamposReferenciaPersonal=0;
		iYPanelCamposReferenciaPersonal++;
	}
	this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
	this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsReferenciaPersonal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsReferenciaPersonal.gridy = iYPanelCamposReferenciaPersonal;
	this.gridBagConstraintsReferenciaPersonal.gridx = iXPanelCamposReferenciaPersonal++;
	this.gridBagConstraintsReferenciaPersonal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsReferenciaPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposReferenciaPersonal.add(this.jPanelobservacionReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);



	if(iXPanelCamposReferenciaPersonal % 2==0) {
		iXPanelCamposReferenciaPersonal=0;
		iYPanelCamposReferenciaPersonal++;
	}
	this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
	this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsReferenciaPersonal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsReferenciaPersonal.gridy = iYPanelCamposReferenciaPersonal;
	this.gridBagConstraintsReferenciaPersonal.gridx = iXPanelCamposReferenciaPersonal++;
	this.gridBagConstraintsReferenciaPersonal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsReferenciaPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposReferenciaPersonal.add(this.jPanelesta_trabajandoReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);



	if(iXPanelCamposReferenciaPersonal % 2==0) {
		iXPanelCamposReferenciaPersonal=0;
		iYPanelCamposReferenciaPersonal++;
	}
	this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
	this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsReferenciaPersonal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsReferenciaPersonal.gridy = iYPanelCamposReferenciaPersonal;
	this.gridBagConstraintsReferenciaPersonal.gridx = iXPanelCamposReferenciaPersonal++;
	this.gridBagConstraintsReferenciaPersonal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsReferenciaPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposReferenciaPersonal.add(this.jPanelempresa_trabajoReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);



	if(iXPanelCamposReferenciaPersonal % 2==0) {
		iXPanelCamposReferenciaPersonal=0;
		iYPanelCamposReferenciaPersonal++;
	}
	this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
	this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsReferenciaPersonal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsReferenciaPersonal.gridy = iYPanelCamposReferenciaPersonal;
	this.gridBagConstraintsReferenciaPersonal.gridx = iXPanelCamposReferenciaPersonal++;
	this.gridBagConstraintsReferenciaPersonal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsReferenciaPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposReferenciaPersonal.add(this.jPaneldireccion_trabajoReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);



	if(iXPanelCamposReferenciaPersonal % 2==0) {
		iXPanelCamposReferenciaPersonal=0;
		iYPanelCamposReferenciaPersonal++;
	}
	this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
	this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsReferenciaPersonal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsReferenciaPersonal.gridy = iYPanelCamposReferenciaPersonal;
	this.gridBagConstraintsReferenciaPersonal.gridx = iXPanelCamposReferenciaPersonal++;
	this.gridBagConstraintsReferenciaPersonal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsReferenciaPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposReferenciaPersonal.add(this.jPaneltelefono_trabajoReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);



	if(iXPanelCamposReferenciaPersonal % 2==0) {
		iXPanelCamposReferenciaPersonal=0;
		iYPanelCamposReferenciaPersonal++;
	}
	this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
	this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsReferenciaPersonal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsReferenciaPersonal.gridy = iYPanelCamposReferenciaPersonal;
	this.gridBagConstraintsReferenciaPersonal.gridx = iXPanelCamposReferenciaPersonal++;
	this.gridBagConstraintsReferenciaPersonal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsReferenciaPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposReferenciaPersonal.add(this.jPanelesactivoReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);



	if(iXPanelCamposReferenciaPersonal % 2==0) {
		iXPanelCamposReferenciaPersonal=0;
		iYPanelCamposReferenciaPersonal++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
	this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsReferenciaPersonal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsReferenciaPersonal.gridy = iYPanelCamposOcultosReferenciaPersonal;
	this.gridBagConstraintsReferenciaPersonal.gridx = iXPanelCamposOcultosReferenciaPersonal++;
	this.gridBagConstraintsReferenciaPersonal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsReferenciaPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosReferenciaPersonal.add(this.jPanelid_empresaReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);



	if(iXPanelCamposOcultosReferenciaPersonal % 2==0) {
		iXPanelCamposOcultosReferenciaPersonal=0;
		iYPanelCamposOcultosReferenciaPersonal++;
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
			
		GridBagLayout gridaBagLayoutAccionesReferenciaPersonal= new GridBagLayout();
		this.jPanelAccionesReferenciaPersonal.setLayout(gridaBagLayoutAccionesReferenciaPersonal);
		
		GridBagLayout gridaBagLayoutAccionesFormularioReferenciaPersonal= new GridBagLayout();
		this.jPanelAccionesFormularioReferenciaPersonal.setLayout(gridaBagLayoutAccionesFormularioReferenciaPersonal);
		
		this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
		this.gridBagConstraintsReferenciaPersonal.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsReferenciaPersonal.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioReferenciaPersonal.add(this.jComboBoxTiposAccionesFormularioReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);

		this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
		this.gridBagConstraintsReferenciaPersonal.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsReferenciaPersonal.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioReferenciaPersonal.add(this.jCheckBoxPostAccionNuevoReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.referenciapersonalSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
			this.gridBagConstraintsReferenciaPersonal.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsReferenciaPersonal.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioReferenciaPersonal.add(this.jCheckBoxPostAccionSinCerrarReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.referenciapersonalSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.referenciapersonalSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
			this.gridBagConstraintsReferenciaPersonal.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsReferenciaPersonal.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioReferenciaPersonal.add(this.jCheckBoxPostAccionSinMensajeReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
		this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsReferenciaPersonal.gridy = 0;
		this.gridBagConstraintsReferenciaPersonal.gridx = iPosXAccion++;
			
		this.jPanelAccionesReferenciaPersonal.add(this.jButtonModificarReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);							

		this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
		this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsReferenciaPersonal.gridy = 0;
		this.gridBagConstraintsReferenciaPersonal.gridx =iPosXAccion++;
			
		this.jPanelAccionesReferenciaPersonal.add(this.jButtonEliminarReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);
		
			
		this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
		this.gridBagConstraintsReferenciaPersonal.gridy = 0;		
		this.gridBagConstraintsReferenciaPersonal.gridx = iPosXAccion++;
		
		this.jPanelAccionesReferenciaPersonal.add(this.jButtonActualizarReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);


		this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
		this.gridBagConstraintsReferenciaPersonal.gridy = 0;		
		this.gridBagConstraintsReferenciaPersonal.gridx = iPosXAccion++;
		
		this.jPanelAccionesReferenciaPersonal.add(this.jButtonGuardarCambiosReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);	
		
		this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
		this.gridBagConstraintsReferenciaPersonal.gridy = 0;		
		this.gridBagConstraintsReferenciaPersonal.gridx =iPosXAccion++;
		
		this.jPanelAccionesReferenciaPersonal.add(this.jButtonCancelarReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutReferenciaPersonal = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutReferenciaPersonal);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.referenciapersonalSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();						
			this.gridBagConstraintsReferenciaPersonal.gridy = iGridyPrincipal++;
			this.gridBagConstraintsReferenciaPersonal.gridx = 0;		
			//this.gridBagConstraintsReferenciaPersonal.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReferenciaPersonal.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsReferenciaPersonal.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
		this.gridBagConstraintsReferenciaPersonal.gridy =iGridyPrincipal++;
		this.gridBagConstraintsReferenciaPersonal.gridx =0;
		this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsReferenciaPersonal.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ReferenciaPersonalJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleReferenciaPersonal = new ReferenciaPersonalBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Referencia Personal DATOS");
			
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
			
	        //this.setTitle("[FOR] - Referencia Personal DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Referencia Personal Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ReferenciaPersonalModel referenciapersonalModel=new ReferenciaPersonalModel(this);
			
			//SI USARA CLASE INTERNA
			//ReferenciaPersonalModel.ReferenciaPersonalFocusTraversalPolicy referenciapersonalFocusTraversalPolicy = referenciapersonalModel.new ReferenciaPersonalFocusTraversalPolicy(this);
			
			//referenciapersonalFocusTraversalPolicy.setreferenciapersonalJInternalFrame(this);
			
			this.setFocusTraversalPolicy(referenciapersonalModel);
			
			
			this.jContentPaneDetalleReferenciaPersonal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleReferenciaPersonal = new GridBagLayout();	
			this.jContentPaneDetalleReferenciaPersonal.setLayout(gridaBagLayoutDetalleReferenciaPersonal);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosReferenciaPersonal = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
				this.gridBagConstraintsReferenciaPersonal.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsReferenciaPersonal.gridx = 0;
					
				
				this.jContentPaneDetalleReferenciaPersonal.add(jTtoolBarDetalleReferenciaPersonal, gridBagConstraintsReferenciaPersonal);								
				
}
			
			this.jScrollPanelDatosEdicionReferenciaPersonal=   new JScrollPane(jContentPaneDetalleReferenciaPersonal,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionReferenciaPersonal.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionReferenciaPersonal.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionReferenciaPersonal.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralReferenciaPersonal=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralReferenciaPersonal.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralReferenciaPersonal.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralReferenciaPersonal.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
			
			
	        this.gridBagConstraintsReferenciaPersonal.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsReferenciaPersonal.gridx = 0;
	        
			this.jContentPaneDetalleReferenciaPersonal.add(jPanelCamposReferenciaPersonal, gridBagConstraintsReferenciaPersonal);
			
			
			
			
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
						&& referenciapersonalSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.referenciapersonalSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsReferenciaPersonal= new GridBagConstraints();
						this.gridBagConstraintsReferenciaPersonal.gridy = iGridyRelaciones++;
						this.gridBagConstraintsReferenciaPersonal.gridx = 0;
						this.jContentPaneDetalleReferenciaPersonal.add(this.jTabbedPaneRelacionesReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesReferenciaPersonal.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosReferenciaPersonal.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
					this.gridBagConstraintsReferenciaPersonal.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsReferenciaPersonal.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsReferenciaPersonal.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsReferenciaPersonal.gridx = 0;
					
				
					this.jContentPaneDetalleReferenciaPersonal.add(jPanelCamposOcultosReferenciaPersonal, gridBagConstraintsReferenciaPersonal);
				
					this.jPanelCamposOcultosReferenciaPersonal.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
			this.gridBagConstraintsReferenciaPersonal.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsReferenciaPersonal.gridx = 0;
	        this.gridBagConstraintsReferenciaPersonal.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleReferenciaPersonal.add(this.jPanelAccionesFormularioReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);							
			
			
			
			this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
	        this.gridBagConstraintsReferenciaPersonal.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsReferenciaPersonal.gridx = 0;
	        
			
			this.jContentPaneDetalleReferenciaPersonal.add(this.jPanelAccionesReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionReferenciaPersonal);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionReferenciaPersonal=   new JScrollPane(this.jPanelCamposReferenciaPersonal,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionReferenciaPersonal.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionReferenciaPersonal.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionReferenciaPersonal.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
			this.gridBagConstraintsReferenciaPersonal.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsReferenciaPersonal.gridx = 0;
			this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsReferenciaPersonal.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsReferenciaPersonal.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
			this.gridBagConstraintsReferenciaPersonal.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsReferenciaPersonal.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);			
			
			this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
			this.gridBagConstraintsReferenciaPersonal.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsReferenciaPersonal.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
		this.gridBagConstraintsReferenciaPersonal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsReferenciaPersonal.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);
			
			
		this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
		this.gridBagConstraintsReferenciaPersonal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsReferenciaPersonal.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);
		
			
		this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
		this.gridBagConstraintsReferenciaPersonal.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsReferenciaPersonal.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralReferenciaPersonal;//jContentPane;
		
		return jScrollPanelDatosEdicionReferenciaPersonal;
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
