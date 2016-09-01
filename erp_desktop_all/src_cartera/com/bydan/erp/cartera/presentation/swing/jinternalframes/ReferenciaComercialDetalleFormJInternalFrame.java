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
import com.bydan.erp.cartera.util.ReferenciaComercialConstantesFunciones;

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
public class ReferenciaComercialDetalleFormJInternalFrame extends ReferenciaComercialBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleReferenciaComercial;
	
	protected JMenuBar jmenuBarDetalleReferenciaComercial;
	
	protected JMenu jmenuDetalleReferenciaComercial;
	protected JMenu jmenuDetalleArchivoReferenciaComercial;
	protected JMenu jmenuDetalleAccionesReferenciaComercial;
	protected JMenu jmenuDetalleDatosReferenciaComercial;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleReferenciaComercial = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutReferenciaComercial;	
	protected GridBagConstraints gridBagConstraintsReferenciaComercial;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ReferenciaComercialBeanSwingJInternalFrameAdditional jInternalFrameDetalleReferenciaComercial;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected TipoSectorEconoBeanSwingJInternalFrame tiposectoreconoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiposectorecono="";

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";

	protected CiudadBeanSwingJInternalFrame ciudadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ciudad="";

	protected TipoValoracionBeanSwingJInternalFrame tipovaloracionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipovaloracion="";
	
	public ReferenciaComercialSessionBean referenciacomercialSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public TipoSectorEconoSessionBean tiposectoreconoSessionBean;
	public PaisSessionBean paisSessionBean;
	public CiudadSessionBean ciudadSessionBean;
	public TipoValoracionSessionBean tipovaloracionSessionBean;	
	
	public ReferenciaComercialLogic referenciacomercialLogic;
	
	public JScrollPane jScrollPanelDatosReferenciaComercial;
	public JScrollPane jScrollPanelDatosEdicionReferenciaComercial;
	public JScrollPane jScrollPanelDatosGeneralReferenciaComercial;
	
	protected JPanel jPanelCamposReferenciaComercial;    
	protected JPanel jPanelCamposOcultosReferenciaComercial;    	
	protected JPanel jPanelAccionesReferenciaComercial;
	protected JPanel jPanelAccionesFormularioReferenciaComercial;
    
	
	
	protected Integer iXPanelCamposReferenciaComercial=0;
	protected Integer iYPanelCamposReferenciaComercial=0;
	
	protected Integer iXPanelCamposOcultosReferenciaComercial=0;
	protected Integer iYPanelCamposOcultosReferenciaComercial=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoReferenciaComercial;
	public JButton jButtonModificarReferenciaComercial;
	public JButton jButtonActualizarReferenciaComercial;
    public JButton jButtonEliminarReferenciaComercial;
	public JButton jButtonCancelarReferenciaComercial;
    public JButton jButtonGuardarCambiosReferenciaComercial;
	public JButton jButtonGuardarCambiosTablaReferenciaComercial;
	protected JButton jButtonCerrarReferenciaComercial;
	
	
	protected JButton jButtonProcesarInformacionReferenciaComercial;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoReferenciaComercial;
	protected JCheckBox jCheckBoxPostAccionSinCerrarReferenciaComercial;
	protected JCheckBox jCheckBoxPostAccionSinMensajeReferenciaComercial;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarReferenciaComercial;
	protected JButton jButtonModificarToolBarReferenciaComercial;
	protected JButton jButtonActualizarToolBarReferenciaComercial;
    protected JButton jButtonEliminarToolBarReferenciaComercial;
	protected JButton jButtonCancelarToolBarReferenciaComercial;
    protected JButton jButtonGuardarCambiosToolBarReferenciaComercial;
	protected JButton jButtonGuardarCambiosTablaToolBarReferenciaComercial;
	protected JButton jButtonMostrarOcultarTablaToolBarReferenciaComercial;
	protected JButton jButtonCerrarToolBarReferenciaComercial;
	
	protected JButton jButtonProcesarInformacionToolBarReferenciaComercial;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoReferenciaComercial;
	protected JMenuItem jMenuItemModificarReferenciaComercial;
	protected JMenuItem jMenuItemActualizarReferenciaComercial;
    protected JMenuItem jMenuItemEliminarReferenciaComercial;
	protected JMenuItem jMenuItemCancelarReferenciaComercial;
    protected JMenuItem jMenuItemGuardarCambiosReferenciaComercial;
	protected JMenuItem jMenuItemGuardarCambiosTablaReferenciaComercial;
	protected JMenuItem jMenuItemCerrarReferenciaComercial;
	protected JMenuItem jMenuItemDetalleCerrarReferenciaComercial;
	protected JMenuItem jMenuItemDetalleMostarOcultarReferenciaComercial;
	
	protected JMenuItem jMenuItemProcesarInformacionReferenciaComercial;
	protected JMenuItem jMenuItemNuevoGuardarCambiosReferenciaComercial;
	protected JMenuItem jMenuItemMostrarOcultarReferenciaComercial;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesReferenciaComercial;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesReferenciaComercial;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesReferenciaComercial;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioReferenciaComercial;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidReferenciaComercial;
	public JLabel jLabelIdReferenciaComercial;
	public JLabel jLabelidReferenciaComercial;
	public JButton jButtonidReferenciaComercialBusqueda= new JButtonMe();

	public JPanel jPanelnombreempresaReferenciaComercial;
	public JLabel jLabelnombreempresaReferenciaComercial;
	public JTextArea jTextAreanombreempresaReferenciaComercial;
	public JScrollPane jscrollPanenombreempresaReferenciaComercial;
	public JButton jButtonnombreempresaReferenciaComercialBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_clienteReferenciaComercial;
	public JLabel jLabelcodigo_clienteReferenciaComercial;
	public JTextField jTextFieldcodigo_clienteReferenciaComercial;
	public JButton jButtoncodigo_clienteReferenciaComercialBusqueda= new JButtonMe();

	public JPanel jPanelcontactoReferenciaComercial;
	public JLabel jLabelcontactoReferenciaComercial;
	public JTextArea jTextAreacontactoReferenciaComercial;
	public JScrollPane jscrollPanecontactoReferenciaComercial;
	public JButton jButtoncontactoReferenciaComercialBusqueda= new JButtonMe();

	public JPanel jPanelarticulo_compraReferenciaComercial;
	public JLabel jLabelarticulo_compraReferenciaComercial;
	public JTextArea jTextAreaarticulo_compraReferenciaComercial;
	public JScrollPane jscrollPanearticulo_compraReferenciaComercial;
	public JButton jButtonarticulo_compraReferenciaComercialBusqueda= new JButtonMe();

	public JPanel jPanelnumero_aniosReferenciaComercial;
	public JLabel jLabelnumero_aniosReferenciaComercial;
	public JTextField jTextFieldnumero_aniosReferenciaComercial;
	public JButton jButtonnumero_aniosReferenciaComercialBusqueda= new JButtonMe();

	public JPanel jPanelnumero_mesesReferenciaComercial;
	public JLabel jLabelnumero_mesesReferenciaComercial;
	public JTextField jTextFieldnumero_mesesReferenciaComercial;
	public JButton jButtonnumero_mesesReferenciaComercialBusqueda= new JButtonMe();

	public JPanel jPaneldireccionReferenciaComercial;
	public JLabel jLabeldireccionReferenciaComercial;
	public JTextArea jTextAreadireccionReferenciaComercial;
	public JScrollPane jscrollPanedireccionReferenciaComercial;
	public JButton jButtondireccionReferenciaComercialBusqueda= new JButtonMe();

	public JPanel jPaneltelefonoReferenciaComercial;
	public JLabel jLabeltelefonoReferenciaComercial;
	public JTextArea jTextAreatelefonoReferenciaComercial;
	public JScrollPane jscrollPanetelefonoReferenciaComercial;
	public JButton jButtontelefonoReferenciaComercialBusqueda= new JButtonMe();

	public JPanel jPaneltelefonomovilReferenciaComercial;
	public JLabel jLabeltelefonomovilReferenciaComercial;
	public JTextArea jTextAreatelefonomovilReferenciaComercial;
	public JScrollPane jscrollPanetelefonomovilReferenciaComercial;
	public JButton jButtontelefonomovilReferenciaComercialBusqueda= new JButtonMe();

	public JPanel jPaneltelefonocodigoareaReferenciaComercial;
	public JLabel jLabeltelefonocodigoareaReferenciaComercial;
	public JTextField jTextFieldtelefonocodigoareaReferenciaComercial;
	public JButton jButtontelefonocodigoareaReferenciaComercialBusqueda= new JButtonMe();

	public JPanel jPanelemailReferenciaComercial;
	public JLabel jLabelemailReferenciaComercial;
	public JTextArea jTextAreaemailReferenciaComercial;
	public JScrollPane jscrollPaneemailReferenciaComercial;
	public JButton jButtonemailReferenciaComercialBusqueda= new JButtonMe();

	public JPanel jPanelmontoReferenciaComercial;
	public JLabel jLabelmontoReferenciaComercial;
	public JTextField jTextFieldmontoReferenciaComercial;
	public JButton jButtonmontoReferenciaComercialBusqueda= new JButtonMe();

	public JPanel jPanelesactivoReferenciaComercial;
	public JLabel jLabelesactivoReferenciaComercial;
	public JCheckBox jCheckBoxesactivoReferenciaComercial;
	public JButton jButtonesactivoReferenciaComercialBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaReferenciaComercial;
	public JLabel jLabelid_empresaReferenciaComercial;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaReferenciaComercial;
	public JButton jButtonid_empresaReferenciaComercial= new JButtonMe();
	public JButton jButtonid_empresaReferenciaComercialUpdate= new JButtonMe();
	public JButton jButtonid_empresaReferenciaComercialBusqueda= new JButtonMe();

	public JPanel jPanelidclienteReferenciaComercial;
	public JLabel jLabelidclienteReferenciaComercial;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxidclienteReferenciaComercial;
	public JButton jButtonidclienteReferenciaComercial= new JButtonMe();
	public JButton jButtonidclienteReferenciaComercialUpdate= new JButtonMe();
	public JButton jButtonidclienteReferenciaComercialBusqueda= new JButtonMe();

	public JPanel jPanelidvalorclientesectoreconomicoReferenciaComercial;
	public JLabel jLabelidvalorclientesectoreconomicoReferenciaComercial;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxidvalorclientesectoreconomicoReferenciaComercial;
	public JButton jButtonidvalorclientesectoreconomicoReferenciaComercial= new JButtonMe();
	public JButton jButtonidvalorclientesectoreconomicoReferenciaComercialUpdate= new JButtonMe();
	public JButton jButtonidvalorclientesectoreconomicoReferenciaComercialBusqueda= new JButtonMe();

	public JPanel jPanelid_paisReferenciaComercial;
	public JLabel jLabelid_paisReferenciaComercial;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisReferenciaComercial;
	public JButton jButtonid_paisReferenciaComercial= new JButtonMe();
	public JButton jButtonid_paisReferenciaComercialUpdate= new JButtonMe();
	public JButton jButtonid_paisReferenciaComercialBusqueda= new JButtonMe();

	public JPanel jPanelidciudadReferenciaComercial;
	public JLabel jLabelidciudadReferenciaComercial;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxidciudadReferenciaComercial;
	public JButton jButtonidciudadReferenciaComercial= new JButtonMe();
	public JButton jButtonidciudadReferenciaComercialUpdate= new JButtonMe();
	public JButton jButtonidciudadReferenciaComercialBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_valoracionReferenciaComercial;
	public JLabel jLabelid_tipo_valoracionReferenciaComercial;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_valoracionReferenciaComercial;
	public JButton jButtonid_tipo_valoracionReferenciaComercial= new JButtonMe();
	public JButton jButtonid_tipo_valoracionReferenciaComercialUpdate= new JButtonMe();
	public JButton jButtonid_tipo_valoracionReferenciaComercialBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesReferenciaComercial;
	
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
	public int iHeightFormulario=924;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ReferenciaComercialDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposReferenciaComercial=new JPanel();
				this.jPanelAccionesFormularioReferenciaComercial=new JPanel();
				this.jmenuBarDetalleReferenciaComercial=new JMenuBar();
				this.jTtoolBarDetalleReferenciaComercial=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ReferenciaComercialDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ReferenciaComercial No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ReferenciaComercialDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ReferenciaComercial No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ReferenciaComercialDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ReferenciaComercial No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ReferenciaComercialDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ReferenciaComercial No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ReferenciaComercialDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ReferenciaComercial No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarReferenciaComercial() {
		return this.jButtonActualizarToolBarReferenciaComercial;
	}
	
	public JButton getjButtonEliminarToolBarReferenciaComercial() {
		return this.jButtonEliminarToolBarReferenciaComercial;
	}
	
	public JButton getjButtonCancelarToolBarReferenciaComercial() {
		return this.jButtonCancelarToolBarReferenciaComercial;
	}		
	
	public JButton getjButtonProcesarInformacionReferenciaComercial() {
		return this.jButtonProcesarInformacionReferenciaComercial;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionReferenciaComercial)	{
		this.jButtonProcesarInformacionReferenciaComercial = jButtonProcesarInformacionReferenciaComercial;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesReferenciaComercial() {
		return this.jComboBoxTiposAccionesReferenciaComercial;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesReferenciaComercial(
			JComboBox jComboBoxTiposRelacionesReferenciaComercial) {
		this.jComboBoxTiposRelacionesReferenciaComercial = jComboBoxTiposRelacionesReferenciaComercial;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesReferenciaComercial(
			JComboBox jComboBoxTiposAccionesReferenciaComercial) {
		this.jComboBoxTiposAccionesReferenciaComercial = jComboBoxTiposAccionesReferenciaComercial;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioReferenciaComercial() {
		return this.jComboBoxTiposAccionesFormularioReferenciaComercial;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioReferenciaComercial(
			JComboBox jComboBoxTiposAccionesFormularioReferenciaComercial) {
		this.jComboBoxTiposAccionesFormularioReferenciaComercial = jComboBoxTiposAccionesFormularioReferenciaComercial;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.referenciacomercialSessionBean=new ReferenciaComercialSessionBean();
		
		this.referenciacomercialSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.referenciacomercialSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.referenciacomercialSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ReferenciaComercialJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ReferenciaComercialJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ReferenciaComercialJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Referencia Comercial MANTENIMIENTO"));
		
		
		if(iWidth > 2050) {
			iWidth=2050;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.referenciacomercialSessionBean.getEsGuardarRelacionado()) {
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
	
		ReferenciaComercialJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleReferenciaComercial= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarReferenciaComercial=new JButtonMe();
				this.jButtonModificarToolBarReferenciaComercial=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarReferenciaComercial=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarReferenciaComercial,this.jTtoolBarDetalleReferenciaComercial,
							"actualizar","actualizar","Actualizar"+" "+ReferenciaComercialConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarReferenciaComercial=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarReferenciaComercial,this.jTtoolBarDetalleReferenciaComercial,
							"eliminar","eliminar","Eliminar"+" "+ReferenciaComercialConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarReferenciaComercial=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarReferenciaComercial,this.jTtoolBarDetalleReferenciaComercial,
							"cancelar","cancelar","Cancelar"+" "+ReferenciaComercialConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarReferenciaComercial=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarReferenciaComercial,this.jTtoolBarDetalleReferenciaComercial,
							"guardarcambios","guardarcambios","Guardar"+" "+ReferenciaComercialConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarReferenciaComercial,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarReferenciaComercial,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarReferenciaComercial,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleReferenciaComercial=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleReferenciaComercial=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoReferenciaComercial=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesReferenciaComercial=new JMenuMe("Acciones");
		this.jmenuDetalleDatosReferenciaComercial=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoReferenciaComercial= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoReferenciaComercial.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoReferenciaComercial,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoReferenciaComercial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarReferenciaComercial= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarReferenciaComercial.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarReferenciaComercial,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarReferenciaComercial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarReferenciaComercial= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarReferenciaComercial.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarReferenciaComercial,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarReferenciaComercial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarReferenciaComercial= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarReferenciaComercial.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarReferenciaComercial,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarReferenciaComercial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarReferenciaComercial= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarReferenciaComercial.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarReferenciaComercial,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarReferenciaComercial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosReferenciaComercial= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosReferenciaComercial.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosReferenciaComercial,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosReferenciaComercial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarReferenciaComercial= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarReferenciaComercial.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarReferenciaComercial,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarReferenciaComercial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarReferenciaComercial= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarReferenciaComercial.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarReferenciaComercial,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarReferenciaComercial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarReferenciaComercial= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarReferenciaComercial.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarReferenciaComercial,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarReferenciaComercial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarReferenciaComercial= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarReferenciaComercial.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarReferenciaComercial,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarReferenciaComercial, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoReferenciaComercial.add(this.jMenuItemDetalleCerrarReferenciaComercial);
		
		this.jmenuDetalleAccionesReferenciaComercial.add(this.jMenuItemActualizarReferenciaComercial);
		this.jmenuDetalleAccionesReferenciaComercial.add(this.jMenuItemEliminarReferenciaComercial);
		this.jmenuDetalleAccionesReferenciaComercial.add(this.jMenuItemCancelarReferenciaComercial);		
		
		//this.jmenuDetalleDatosReferenciaComercial.add(this.jMenuItemDetalleAbrirOrderByReferenciaComercial);				
		this.jmenuDetalleDatosReferenciaComercial.add(this.jMenuItemDetalleMostarOcultarReferenciaComercial);				
				
		//this.jmenuDetalleAccionesReferenciaComercial.add(this.jMenuItemGuardarCambiosReferenciaComercial);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoReferenciaComercial, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesReferenciaComercial, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosReferenciaComercial, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleReferenciaComercial.add(this.jmenuDetalleArchivoReferenciaComercial);		
		this.jmenuBarDetalleReferenciaComercial.add(this.jmenuDetalleAccionesReferenciaComercial);		
		this.jmenuBarDetalleReferenciaComercial.add(this.jmenuDetalleDatosReferenciaComercial);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleReferenciaComercial);				
	}
	
	
	public void inicializarElementosCamposReferenciaComercial() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdReferenciaComercial = new JLabelMe();
		jLabelIdReferenciaComercial.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdReferenciaComercial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdReferenciaComercial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdReferenciaComercial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdReferenciaComercial,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidReferenciaComercial = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidReferenciaComercial.setToolTipText(ReferenciaComercialConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutReferenciaComercial= new GridBagLayout();

		this.jPanelidReferenciaComercial.setLayout(this.gridaBagLayoutReferenciaComercial);

		jLabelidReferenciaComercial = new JLabel();
		jLabelidReferenciaComercial.setText("Id");

		jLabelidReferenciaComercial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidReferenciaComercial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidReferenciaComercial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreempresaReferenciaComercial = new JLabelMe();
		this.jLabelnombreempresaReferenciaComercial.setText(""+ReferenciaComercialConstantesFunciones.LABEL_NOMBREEMPRESA+" : *");
		this.jLabelnombreempresaReferenciaComercial.setToolTipText("Nombre Empresa");
		this.jLabelnombreempresaReferenciaComercial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreempresaReferenciaComercial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreempresaReferenciaComercial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreempresaReferenciaComercial,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreempresaReferenciaComercial=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreempresaReferenciaComercial.setToolTipText(ReferenciaComercialConstantesFunciones.LABEL_NOMBREEMPRESA);
		this.gridaBagLayoutReferenciaComercial = new GridBagLayout();
		this.jPanelnombreempresaReferenciaComercial.setLayout(this.gridaBagLayoutReferenciaComercial);


		jTextAreanombreempresaReferenciaComercial= new JTextAreaMe();
		jTextAreanombreempresaReferenciaComercial.setEnabled(false);
		jTextAreanombreempresaReferenciaComercial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreempresaReferenciaComercial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreempresaReferenciaComercial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreempresaReferenciaComercial.setLineWrap(true);
		jTextAreanombreempresaReferenciaComercial.setWrapStyleWord(true);
		jTextAreanombreempresaReferenciaComercial.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreempresaReferenciaComercial.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreanombreempresaReferenciaComercial,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreempresaReferenciaComercial = new JScrollPane(jTextAreanombreempresaReferenciaComercial);
		jscrollPanenombreempresaReferenciaComercial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanenombreempresaReferenciaComercial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanenombreempresaReferenciaComercial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtonnombreempresaReferenciaComercialBusqueda= new JButtonMe();
		this.jButtonnombreempresaReferenciaComercialBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreempresaReferenciaComercialBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreempresaReferenciaComercialBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreempresaReferenciaComercialBusqueda.setText("U");
		this.jButtonnombreempresaReferenciaComercialBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreempresaReferenciaComercialBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreempresaReferenciaComercialBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreempresaReferenciaComercial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreempresaReferenciaComercial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreempresaReferenciaComercialBusqueda"));

		if(this.referenciacomercialSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreempresaReferenciaComercialBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_clienteReferenciaComercial = new JLabelMe();
		this.jLabelcodigo_clienteReferenciaComercial.setText(""+ReferenciaComercialConstantesFunciones.LABEL_CODIGOCLIENTE+" : *");
		this.jLabelcodigo_clienteReferenciaComercial.setToolTipText("Codigo Cliente");
		this.jLabelcodigo_clienteReferenciaComercial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigo_clienteReferenciaComercial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigo_clienteReferenciaComercial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_clienteReferenciaComercial,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_clienteReferenciaComercial=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_clienteReferenciaComercial.setToolTipText(ReferenciaComercialConstantesFunciones.LABEL_CODIGOCLIENTE);
		this.gridaBagLayoutReferenciaComercial = new GridBagLayout();
		this.jPanelcodigo_clienteReferenciaComercial.setLayout(this.gridaBagLayoutReferenciaComercial);


		jTextFieldcodigo_clienteReferenciaComercial= new JTextFieldMe();

		jTextFieldcodigo_clienteReferenciaComercial.setEnabled(false);
		jTextFieldcodigo_clienteReferenciaComercial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_clienteReferenciaComercial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_clienteReferenciaComercial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_clienteReferenciaComercial,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_clienteReferenciaComercialBusqueda= new JButtonMe();
		this.jButtoncodigo_clienteReferenciaComercialBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_clienteReferenciaComercialBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_clienteReferenciaComercialBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_clienteReferenciaComercialBusqueda.setText("U");
		this.jButtoncodigo_clienteReferenciaComercialBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_clienteReferenciaComercialBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_clienteReferenciaComercialBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_clienteReferenciaComercial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_clienteReferenciaComercial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_clienteReferenciaComercialBusqueda"));

		if(this.referenciacomercialSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_clienteReferenciaComercialBusqueda.setVisible(false);		}


					
		this.jLabelcontactoReferenciaComercial = new JLabelMe();
		this.jLabelcontactoReferenciaComercial.setText(""+ReferenciaComercialConstantesFunciones.LABEL_CONTACTO+" : *");
		this.jLabelcontactoReferenciaComercial.setToolTipText("Contacto");
		this.jLabelcontactoReferenciaComercial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcontactoReferenciaComercial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcontactoReferenciaComercial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcontactoReferenciaComercial,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcontactoReferenciaComercial=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcontactoReferenciaComercial.setToolTipText(ReferenciaComercialConstantesFunciones.LABEL_CONTACTO);
		this.gridaBagLayoutReferenciaComercial = new GridBagLayout();
		this.jPanelcontactoReferenciaComercial.setLayout(this.gridaBagLayoutReferenciaComercial);


		jTextAreacontactoReferenciaComercial= new JTextAreaMe();
		jTextAreacontactoReferenciaComercial.setEnabled(false);
		jTextAreacontactoReferenciaComercial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacontactoReferenciaComercial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacontactoReferenciaComercial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacontactoReferenciaComercial.setLineWrap(true);
		jTextAreacontactoReferenciaComercial.setWrapStyleWord(true);
		jTextAreacontactoReferenciaComercial.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreacontactoReferenciaComercial.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreacontactoReferenciaComercial,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanecontactoReferenciaComercial = new JScrollPane(jTextAreacontactoReferenciaComercial);
		jscrollPanecontactoReferenciaComercial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanecontactoReferenciaComercial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanecontactoReferenciaComercial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtoncontactoReferenciaComercialBusqueda= new JButtonMe();
		this.jButtoncontactoReferenciaComercialBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncontactoReferenciaComercialBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncontactoReferenciaComercialBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncontactoReferenciaComercialBusqueda.setText("U");
		this.jButtoncontactoReferenciaComercialBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncontactoReferenciaComercialBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncontactoReferenciaComercialBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreacontactoReferenciaComercial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreacontactoReferenciaComercial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"contactoReferenciaComercialBusqueda"));

		if(this.referenciacomercialSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncontactoReferenciaComercialBusqueda.setVisible(false);		}


					
		this.jLabelarticulo_compraReferenciaComercial = new JLabelMe();
		this.jLabelarticulo_compraReferenciaComercial.setText(""+ReferenciaComercialConstantesFunciones.LABEL_ARTICULOCOMPRA+" : *");
		this.jLabelarticulo_compraReferenciaComercial.setToolTipText("Articulo Compra");
		this.jLabelarticulo_compraReferenciaComercial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelarticulo_compraReferenciaComercial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelarticulo_compraReferenciaComercial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelarticulo_compraReferenciaComercial,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelarticulo_compraReferenciaComercial=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelarticulo_compraReferenciaComercial.setToolTipText(ReferenciaComercialConstantesFunciones.LABEL_ARTICULOCOMPRA);
		this.gridaBagLayoutReferenciaComercial = new GridBagLayout();
		this.jPanelarticulo_compraReferenciaComercial.setLayout(this.gridaBagLayoutReferenciaComercial);


		jTextAreaarticulo_compraReferenciaComercial= new JTextAreaMe();
		jTextAreaarticulo_compraReferenciaComercial.setEnabled(false);
		jTextAreaarticulo_compraReferenciaComercial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaarticulo_compraReferenciaComercial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaarticulo_compraReferenciaComercial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaarticulo_compraReferenciaComercial.setLineWrap(true);
		jTextAreaarticulo_compraReferenciaComercial.setWrapStyleWord(true);
		jTextAreaarticulo_compraReferenciaComercial.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaarticulo_compraReferenciaComercial.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreaarticulo_compraReferenciaComercial,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanearticulo_compraReferenciaComercial = new JScrollPane(jTextAreaarticulo_compraReferenciaComercial);
		jscrollPanearticulo_compraReferenciaComercial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanearticulo_compraReferenciaComercial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanearticulo_compraReferenciaComercial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonarticulo_compraReferenciaComercialBusqueda= new JButtonMe();
		this.jButtonarticulo_compraReferenciaComercialBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonarticulo_compraReferenciaComercialBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonarticulo_compraReferenciaComercialBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonarticulo_compraReferenciaComercialBusqueda.setText("U");
		this.jButtonarticulo_compraReferenciaComercialBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonarticulo_compraReferenciaComercialBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonarticulo_compraReferenciaComercialBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaarticulo_compraReferenciaComercial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaarticulo_compraReferenciaComercial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"articulo_compraReferenciaComercialBusqueda"));

		if(this.referenciacomercialSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonarticulo_compraReferenciaComercialBusqueda.setVisible(false);		}


					
		this.jLabelnumero_aniosReferenciaComercial = new JLabelMe();
		this.jLabelnumero_aniosReferenciaComercial.setText(""+ReferenciaComercialConstantesFunciones.LABEL_NUMEROANIOS+" : *");
		this.jLabelnumero_aniosReferenciaComercial.setToolTipText("Numero Anios");
		this.jLabelnumero_aniosReferenciaComercial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_aniosReferenciaComercial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_aniosReferenciaComercial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_aniosReferenciaComercial,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_aniosReferenciaComercial=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_aniosReferenciaComercial.setToolTipText(ReferenciaComercialConstantesFunciones.LABEL_NUMEROANIOS);
		this.gridaBagLayoutReferenciaComercial = new GridBagLayout();
		this.jPanelnumero_aniosReferenciaComercial.setLayout(this.gridaBagLayoutReferenciaComercial);


		jTextFieldnumero_aniosReferenciaComercial= new JTextFieldMe();
		jTextFieldnumero_aniosReferenciaComercial.setEnabled(false);
		jTextFieldnumero_aniosReferenciaComercial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_aniosReferenciaComercial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_aniosReferenciaComercial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_aniosReferenciaComercial,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_aniosReferenciaComercial.setText("0");

		this.jButtonnumero_aniosReferenciaComercialBusqueda= new JButtonMe();
		this.jButtonnumero_aniosReferenciaComercialBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_aniosReferenciaComercialBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_aniosReferenciaComercialBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_aniosReferenciaComercialBusqueda.setText("U");
		this.jButtonnumero_aniosReferenciaComercialBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_aniosReferenciaComercialBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_aniosReferenciaComercialBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_aniosReferenciaComercial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_aniosReferenciaComercial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_aniosReferenciaComercialBusqueda"));

		if(this.referenciacomercialSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_aniosReferenciaComercialBusqueda.setVisible(false);		}


					
		this.jLabelnumero_mesesReferenciaComercial = new JLabelMe();
		this.jLabelnumero_mesesReferenciaComercial.setText(""+ReferenciaComercialConstantesFunciones.LABEL_NUMEROMESES+" : *");
		this.jLabelnumero_mesesReferenciaComercial.setToolTipText("Numero Meses");
		this.jLabelnumero_mesesReferenciaComercial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_mesesReferenciaComercial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_mesesReferenciaComercial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_mesesReferenciaComercial,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_mesesReferenciaComercial=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_mesesReferenciaComercial.setToolTipText(ReferenciaComercialConstantesFunciones.LABEL_NUMEROMESES);
		this.gridaBagLayoutReferenciaComercial = new GridBagLayout();
		this.jPanelnumero_mesesReferenciaComercial.setLayout(this.gridaBagLayoutReferenciaComercial);


		jTextFieldnumero_mesesReferenciaComercial= new JTextFieldMe();
		jTextFieldnumero_mesesReferenciaComercial.setEnabled(false);
		jTextFieldnumero_mesesReferenciaComercial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_mesesReferenciaComercial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_mesesReferenciaComercial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_mesesReferenciaComercial,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_mesesReferenciaComercial.setText("0");

		this.jButtonnumero_mesesReferenciaComercialBusqueda= new JButtonMe();
		this.jButtonnumero_mesesReferenciaComercialBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_mesesReferenciaComercialBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_mesesReferenciaComercialBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_mesesReferenciaComercialBusqueda.setText("U");
		this.jButtonnumero_mesesReferenciaComercialBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_mesesReferenciaComercialBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_mesesReferenciaComercialBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_mesesReferenciaComercial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_mesesReferenciaComercial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_mesesReferenciaComercialBusqueda"));

		if(this.referenciacomercialSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_mesesReferenciaComercialBusqueda.setVisible(false);		}


					
		this.jLabeldireccionReferenciaComercial = new JLabelMe();
		this.jLabeldireccionReferenciaComercial.setText(""+ReferenciaComercialConstantesFunciones.LABEL_DIRECCION+" : *");
		this.jLabeldireccionReferenciaComercial.setToolTipText("Direccion");
		this.jLabeldireccionReferenciaComercial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldireccionReferenciaComercial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldireccionReferenciaComercial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldireccionReferenciaComercial,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldireccionReferenciaComercial=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldireccionReferenciaComercial.setToolTipText(ReferenciaComercialConstantesFunciones.LABEL_DIRECCION);
		this.gridaBagLayoutReferenciaComercial = new GridBagLayout();
		this.jPaneldireccionReferenciaComercial.setLayout(this.gridaBagLayoutReferenciaComercial);


		jTextAreadireccionReferenciaComercial= new JTextAreaMe();
		jTextAreadireccionReferenciaComercial.setEnabled(false);
		jTextAreadireccionReferenciaComercial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionReferenciaComercial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionReferenciaComercial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionReferenciaComercial.setLineWrap(true);
		jTextAreadireccionReferenciaComercial.setWrapStyleWord(true);
		jTextAreadireccionReferenciaComercial.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadireccionReferenciaComercial.setRows(9);

		FuncionesSwing.setBoldTextArea(jTextAreadireccionReferenciaComercial,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedireccionReferenciaComercial = new JScrollPane(jTextAreadireccionReferenciaComercial);
		jscrollPanedireccionReferenciaComercial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedireccionReferenciaComercial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedireccionReferenciaComercial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondireccionReferenciaComercialBusqueda= new JButtonMe();
		this.jButtondireccionReferenciaComercialBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccionReferenciaComercialBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccionReferenciaComercialBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondireccionReferenciaComercialBusqueda.setText("U");
		this.jButtondireccionReferenciaComercialBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondireccionReferenciaComercialBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondireccionReferenciaComercialBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadireccionReferenciaComercial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadireccionReferenciaComercial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"direccionReferenciaComercialBusqueda"));

		if(this.referenciacomercialSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondireccionReferenciaComercialBusqueda.setVisible(false);		}


					
		this.jLabeltelefonoReferenciaComercial = new JLabelMe();
		this.jLabeltelefonoReferenciaComercial.setText(""+ReferenciaComercialConstantesFunciones.LABEL_TELEFONO+" : *");
		this.jLabeltelefonoReferenciaComercial.setToolTipText("Telefono");
		this.jLabeltelefonoReferenciaComercial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltelefonoReferenciaComercial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltelefonoReferenciaComercial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltelefonoReferenciaComercial,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltelefonoReferenciaComercial=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltelefonoReferenciaComercial.setToolTipText(ReferenciaComercialConstantesFunciones.LABEL_TELEFONO);
		this.gridaBagLayoutReferenciaComercial = new GridBagLayout();
		this.jPaneltelefonoReferenciaComercial.setLayout(this.gridaBagLayoutReferenciaComercial);


		jTextAreatelefonoReferenciaComercial= new JTextAreaMe();
		jTextAreatelefonoReferenciaComercial.setEnabled(false);
		jTextAreatelefonoReferenciaComercial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefonoReferenciaComercial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefonoReferenciaComercial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefonoReferenciaComercial.setLineWrap(true);
		jTextAreatelefonoReferenciaComercial.setWrapStyleWord(true);
		jTextAreatelefonoReferenciaComercial.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreatelefonoReferenciaComercial.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreatelefonoReferenciaComercial,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanetelefonoReferenciaComercial = new JScrollPane(jTextAreatelefonoReferenciaComercial);
		jscrollPanetelefonoReferenciaComercial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanetelefonoReferenciaComercial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanetelefonoReferenciaComercial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtontelefonoReferenciaComercialBusqueda= new JButtonMe();
		this.jButtontelefonoReferenciaComercialBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefonoReferenciaComercialBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefonoReferenciaComercialBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontelefonoReferenciaComercialBusqueda.setText("U");
		this.jButtontelefonoReferenciaComercialBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontelefonoReferenciaComercialBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontelefonoReferenciaComercialBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreatelefonoReferenciaComercial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreatelefonoReferenciaComercial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"telefonoReferenciaComercialBusqueda"));

		if(this.referenciacomercialSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontelefonoReferenciaComercialBusqueda.setVisible(false);		}


					
		this.jLabeltelefonomovilReferenciaComercial = new JLabelMe();
		this.jLabeltelefonomovilReferenciaComercial.setText(""+ReferenciaComercialConstantesFunciones.LABEL_TELEFONOMOVIL+" : *");
		this.jLabeltelefonomovilReferenciaComercial.setToolTipText("Telefono Movil");
		this.jLabeltelefonomovilReferenciaComercial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltelefonomovilReferenciaComercial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltelefonomovilReferenciaComercial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltelefonomovilReferenciaComercial,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltelefonomovilReferenciaComercial=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltelefonomovilReferenciaComercial.setToolTipText(ReferenciaComercialConstantesFunciones.LABEL_TELEFONOMOVIL);
		this.gridaBagLayoutReferenciaComercial = new GridBagLayout();
		this.jPaneltelefonomovilReferenciaComercial.setLayout(this.gridaBagLayoutReferenciaComercial);


		jTextAreatelefonomovilReferenciaComercial= new JTextAreaMe();
		jTextAreatelefonomovilReferenciaComercial.setEnabled(false);
		jTextAreatelefonomovilReferenciaComercial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefonomovilReferenciaComercial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefonomovilReferenciaComercial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefonomovilReferenciaComercial.setLineWrap(true);
		jTextAreatelefonomovilReferenciaComercial.setWrapStyleWord(true);
		jTextAreatelefonomovilReferenciaComercial.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreatelefonomovilReferenciaComercial.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreatelefonomovilReferenciaComercial,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanetelefonomovilReferenciaComercial = new JScrollPane(jTextAreatelefonomovilReferenciaComercial);
		jscrollPanetelefonomovilReferenciaComercial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanetelefonomovilReferenciaComercial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanetelefonomovilReferenciaComercial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtontelefonomovilReferenciaComercialBusqueda= new JButtonMe();
		this.jButtontelefonomovilReferenciaComercialBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefonomovilReferenciaComercialBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefonomovilReferenciaComercialBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontelefonomovilReferenciaComercialBusqueda.setText("U");
		this.jButtontelefonomovilReferenciaComercialBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontelefonomovilReferenciaComercialBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontelefonomovilReferenciaComercialBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreatelefonomovilReferenciaComercial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreatelefonomovilReferenciaComercial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"telefonomovilReferenciaComercialBusqueda"));

		if(this.referenciacomercialSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontelefonomovilReferenciaComercialBusqueda.setVisible(false);		}


					
		this.jLabeltelefonocodigoareaReferenciaComercial = new JLabelMe();
		this.jLabeltelefonocodigoareaReferenciaComercial.setText(""+ReferenciaComercialConstantesFunciones.LABEL_TELEFONOCODIGOAREA+" : *");
		this.jLabeltelefonocodigoareaReferenciaComercial.setToolTipText("Telefono Codigo Area");
		this.jLabeltelefonocodigoareaReferenciaComercial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabeltelefonocodigoareaReferenciaComercial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabeltelefonocodigoareaReferenciaComercial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabeltelefonocodigoareaReferenciaComercial,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltelefonocodigoareaReferenciaComercial=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltelefonocodigoareaReferenciaComercial.setToolTipText(ReferenciaComercialConstantesFunciones.LABEL_TELEFONOCODIGOAREA);
		this.gridaBagLayoutReferenciaComercial = new GridBagLayout();
		this.jPaneltelefonocodigoareaReferenciaComercial.setLayout(this.gridaBagLayoutReferenciaComercial);


		jTextFieldtelefonocodigoareaReferenciaComercial= new JTextFieldMe();

		jTextFieldtelefonocodigoareaReferenciaComercial.setEnabled(false);
		jTextFieldtelefonocodigoareaReferenciaComercial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtelefonocodigoareaReferenciaComercial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtelefonocodigoareaReferenciaComercial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtelefonocodigoareaReferenciaComercial,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtontelefonocodigoareaReferenciaComercialBusqueda= new JButtonMe();
		this.jButtontelefonocodigoareaReferenciaComercialBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefonocodigoareaReferenciaComercialBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefonocodigoareaReferenciaComercialBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontelefonocodigoareaReferenciaComercialBusqueda.setText("U");
		this.jButtontelefonocodigoareaReferenciaComercialBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontelefonocodigoareaReferenciaComercialBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontelefonocodigoareaReferenciaComercialBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtelefonocodigoareaReferenciaComercial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtelefonocodigoareaReferenciaComercial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"telefonocodigoareaReferenciaComercialBusqueda"));

		if(this.referenciacomercialSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontelefonocodigoareaReferenciaComercialBusqueda.setVisible(false);		}


					
		this.jLabelemailReferenciaComercial = new JLabelMe();
		this.jLabelemailReferenciaComercial.setText(""+ReferenciaComercialConstantesFunciones.LABEL_EMAIL+" : *");
		this.jLabelemailReferenciaComercial.setToolTipText("Email");
		this.jLabelemailReferenciaComercial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelemailReferenciaComercial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelemailReferenciaComercial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelemailReferenciaComercial,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelemailReferenciaComercial=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelemailReferenciaComercial.setToolTipText(ReferenciaComercialConstantesFunciones.LABEL_EMAIL);
		this.gridaBagLayoutReferenciaComercial = new GridBagLayout();
		this.jPanelemailReferenciaComercial.setLayout(this.gridaBagLayoutReferenciaComercial);


		jTextAreaemailReferenciaComercial= new JTextAreaMe();
		jTextAreaemailReferenciaComercial.setEnabled(false);
		jTextAreaemailReferenciaComercial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaemailReferenciaComercial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaemailReferenciaComercial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaemailReferenciaComercial.setLineWrap(true);
		jTextAreaemailReferenciaComercial.setWrapStyleWord(true);
		jTextAreaemailReferenciaComercial.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaemailReferenciaComercial.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreaemailReferenciaComercial,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneemailReferenciaComercial = new JScrollPane(jTextAreaemailReferenciaComercial);
		jscrollPaneemailReferenciaComercial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPaneemailReferenciaComercial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPaneemailReferenciaComercial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtonemailReferenciaComercialBusqueda= new JButtonMe();
		this.jButtonemailReferenciaComercialBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonemailReferenciaComercialBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonemailReferenciaComercialBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonemailReferenciaComercialBusqueda.setText("U");
		this.jButtonemailReferenciaComercialBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonemailReferenciaComercialBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonemailReferenciaComercialBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaemailReferenciaComercial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaemailReferenciaComercial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"emailReferenciaComercialBusqueda"));

		if(this.referenciacomercialSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonemailReferenciaComercialBusqueda.setVisible(false);		}


					
		this.jLabelmontoReferenciaComercial = new JLabelMe();
		this.jLabelmontoReferenciaComercial.setText(""+ReferenciaComercialConstantesFunciones.LABEL_MONTO+" : *");
		this.jLabelmontoReferenciaComercial.setToolTipText("Monto");
		this.jLabelmontoReferenciaComercial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmontoReferenciaComercial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmontoReferenciaComercial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelmontoReferenciaComercial,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelmontoReferenciaComercial=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelmontoReferenciaComercial.setToolTipText(ReferenciaComercialConstantesFunciones.LABEL_MONTO);
		this.gridaBagLayoutReferenciaComercial = new GridBagLayout();
		this.jPanelmontoReferenciaComercial.setLayout(this.gridaBagLayoutReferenciaComercial);


		jTextFieldmontoReferenciaComercial= new JTextFieldMe();
		jTextFieldmontoReferenciaComercial.setEnabled(false);
		jTextFieldmontoReferenciaComercial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmontoReferenciaComercial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmontoReferenciaComercial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldmontoReferenciaComercial,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldmontoReferenciaComercial.setText("0.0");

		this.jButtonmontoReferenciaComercialBusqueda= new JButtonMe();
		this.jButtonmontoReferenciaComercialBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmontoReferenciaComercialBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmontoReferenciaComercialBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonmontoReferenciaComercialBusqueda.setText("U");
		this.jButtonmontoReferenciaComercialBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonmontoReferenciaComercialBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonmontoReferenciaComercialBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldmontoReferenciaComercial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldmontoReferenciaComercial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"montoReferenciaComercialBusqueda"));

		if(this.referenciacomercialSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonmontoReferenciaComercialBusqueda.setVisible(false);		}


					
		this.jLabelesactivoReferenciaComercial = new JLabelMe();
		this.jLabelesactivoReferenciaComercial.setText(""+ReferenciaComercialConstantesFunciones.LABEL_ESACTIVO+" : *");
		this.jLabelesactivoReferenciaComercial.setToolTipText("Es Activo");
		this.jLabelesactivoReferenciaComercial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelesactivoReferenciaComercial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelesactivoReferenciaComercial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelesactivoReferenciaComercial,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelesactivoReferenciaComercial=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelesactivoReferenciaComercial.setToolTipText(ReferenciaComercialConstantesFunciones.LABEL_ESACTIVO);
		this.gridaBagLayoutReferenciaComercial = new GridBagLayout();
		this.jPanelesactivoReferenciaComercial.setLayout(this.gridaBagLayoutReferenciaComercial);


		jCheckBoxesactivoReferenciaComercial= new JCheckBoxMe();
		jCheckBoxesactivoReferenciaComercial.setEnabled(false);

		jCheckBoxesactivoReferenciaComercial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesactivoReferenciaComercial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesactivoReferenciaComercial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxesactivoReferenciaComercial,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonesactivoReferenciaComercialBusqueda= new JButtonMe();
		this.jButtonesactivoReferenciaComercialBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesactivoReferenciaComercialBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesactivoReferenciaComercialBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonesactivoReferenciaComercialBusqueda.setText("U");
		this.jButtonesactivoReferenciaComercialBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonesactivoReferenciaComercialBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonesactivoReferenciaComercialBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxesactivoReferenciaComercial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxesactivoReferenciaComercial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"esactivoReferenciaComercialBusqueda"));

		if(this.referenciacomercialSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonesactivoReferenciaComercialBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysReferenciaComercial() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaReferenciaComercial = new JLabelMe();
		this.jLabelid_empresaReferenciaComercial.setText(""+ReferenciaComercialConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaReferenciaComercial.setToolTipText("Empresa");
		this.jLabelid_empresaReferenciaComercial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaReferenciaComercial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaReferenciaComercial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaReferenciaComercial,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaReferenciaComercial=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaReferenciaComercial.setToolTipText(ReferenciaComercialConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutReferenciaComercial = new GridBagLayout();
		this.jPanelid_empresaReferenciaComercial.setLayout(this.gridaBagLayoutReferenciaComercial);


		jComboBoxid_empresaReferenciaComercial= new JComboBoxMe();
		jComboBoxid_empresaReferenciaComercial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaReferenciaComercial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaReferenciaComercial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaReferenciaComercial,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaReferenciaComercial.setEnabled(false);

		this.jButtonid_empresaReferenciaComercial= new JButtonMe();
		this.jButtonid_empresaReferenciaComercial.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaReferenciaComercial.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaReferenciaComercial.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaReferenciaComercial.setText("Buscar");
		this.jButtonid_empresaReferenciaComercial.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaReferenciaComercial.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaReferenciaComercial,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaReferenciaComercial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaReferenciaComercial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaReferenciaComercial"));

		this.jButtonid_empresaReferenciaComercialBusqueda= new JButtonMe();
		this.jButtonid_empresaReferenciaComercialBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaReferenciaComercialBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaReferenciaComercialBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaReferenciaComercialBusqueda.setText("U");
		this.jButtonid_empresaReferenciaComercialBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaReferenciaComercialBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaReferenciaComercialBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaReferenciaComercial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaReferenciaComercial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaReferenciaComercialBusqueda"));

		if(this.referenciacomercialSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaReferenciaComercialBusqueda.setVisible(false);		}

		this.jButtonid_empresaReferenciaComercialUpdate= new JButtonMe();
		this.jButtonid_empresaReferenciaComercialUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaReferenciaComercialUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaReferenciaComercialUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaReferenciaComercialUpdate.setText("U");
		this.jButtonid_empresaReferenciaComercialUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaReferenciaComercialUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaReferenciaComercialUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaReferenciaComercial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaReferenciaComercial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaReferenciaComercialUpdate"));



					
		this.jLabelidclienteReferenciaComercial = new JLabelMe();
		this.jLabelidclienteReferenciaComercial.setText(""+ReferenciaComercialConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelidclienteReferenciaComercial.setToolTipText("Cliente");
		this.jLabelidclienteReferenciaComercial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelidclienteReferenciaComercial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelidclienteReferenciaComercial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelidclienteReferenciaComercial,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelidclienteReferenciaComercial=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidclienteReferenciaComercial.setToolTipText(ReferenciaComercialConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutReferenciaComercial = new GridBagLayout();
		this.jPanelidclienteReferenciaComercial.setLayout(this.gridaBagLayoutReferenciaComercial);


		jComboBoxidclienteReferenciaComercial= new JComboBoxMe();
		jComboBoxidclienteReferenciaComercial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidclienteReferenciaComercial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidclienteReferenciaComercial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxidclienteReferenciaComercial,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonidclienteReferenciaComercial= new JButtonMe();
		this.jButtonidclienteReferenciaComercial.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonidclienteReferenciaComercial.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonidclienteReferenciaComercial.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonidclienteReferenciaComercial.setText("Buscar");
		this.jButtonidclienteReferenciaComercial.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonidclienteReferenciaComercial.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonidclienteReferenciaComercial,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxidclienteReferenciaComercial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxidclienteReferenciaComercial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"idclienteReferenciaComercial"));

		this.jButtonidclienteReferenciaComercialBusqueda= new JButtonMe();
		this.jButtonidclienteReferenciaComercialBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidclienteReferenciaComercialBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidclienteReferenciaComercialBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonidclienteReferenciaComercialBusqueda.setText("U");
		this.jButtonidclienteReferenciaComercialBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonidclienteReferenciaComercialBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonidclienteReferenciaComercialBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxidclienteReferenciaComercial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxidclienteReferenciaComercial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"idclienteReferenciaComercialBusqueda"));

		if(this.referenciacomercialSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonidclienteReferenciaComercialBusqueda.setVisible(false);		}

		this.jButtonidclienteReferenciaComercialUpdate= new JButtonMe();
		this.jButtonidclienteReferenciaComercialUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidclienteReferenciaComercialUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidclienteReferenciaComercialUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonidclienteReferenciaComercialUpdate.setText("U");
		this.jButtonidclienteReferenciaComercialUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonidclienteReferenciaComercialUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonidclienteReferenciaComercialUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxidclienteReferenciaComercial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxidclienteReferenciaComercial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"idclienteReferenciaComercialUpdate"));



					
		this.jLabelidvalorclientesectoreconomicoReferenciaComercial = new JLabelMe();
		this.jLabelidvalorclientesectoreconomicoReferenciaComercial.setText(""+ReferenciaComercialConstantesFunciones.LABEL_IDTIPOSECTORECONO+" : *");
		this.jLabelidvalorclientesectoreconomicoReferenciaComercial.setToolTipText("Tipo Sector Econo");
		this.jLabelidvalorclientesectoreconomicoReferenciaComercial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelidvalorclientesectoreconomicoReferenciaComercial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelidvalorclientesectoreconomicoReferenciaComercial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelidvalorclientesectoreconomicoReferenciaComercial,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelidvalorclientesectoreconomicoReferenciaComercial=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidvalorclientesectoreconomicoReferenciaComercial.setToolTipText(ReferenciaComercialConstantesFunciones.LABEL_IDTIPOSECTORECONO);
		this.gridaBagLayoutReferenciaComercial = new GridBagLayout();
		this.jPanelidvalorclientesectoreconomicoReferenciaComercial.setLayout(this.gridaBagLayoutReferenciaComercial);


		jComboBoxidvalorclientesectoreconomicoReferenciaComercial= new JComboBoxMe();
		jComboBoxidvalorclientesectoreconomicoReferenciaComercial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidvalorclientesectoreconomicoReferenciaComercial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidvalorclientesectoreconomicoReferenciaComercial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxidvalorclientesectoreconomicoReferenciaComercial,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonidvalorclientesectoreconomicoReferenciaComercial= new JButtonMe();
		this.jButtonidvalorclientesectoreconomicoReferenciaComercial.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonidvalorclientesectoreconomicoReferenciaComercial.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonidvalorclientesectoreconomicoReferenciaComercial.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonidvalorclientesectoreconomicoReferenciaComercial.setText("Buscar");
		this.jButtonidvalorclientesectoreconomicoReferenciaComercial.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonidvalorclientesectoreconomicoReferenciaComercial.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonidvalorclientesectoreconomicoReferenciaComercial,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxidvalorclientesectoreconomicoReferenciaComercial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxidvalorclientesectoreconomicoReferenciaComercial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"idvalorclientesectoreconomicoReferenciaComercial"));

		this.jButtonidvalorclientesectoreconomicoReferenciaComercialBusqueda= new JButtonMe();
		this.jButtonidvalorclientesectoreconomicoReferenciaComercialBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidvalorclientesectoreconomicoReferenciaComercialBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidvalorclientesectoreconomicoReferenciaComercialBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonidvalorclientesectoreconomicoReferenciaComercialBusqueda.setText("U");
		this.jButtonidvalorclientesectoreconomicoReferenciaComercialBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonidvalorclientesectoreconomicoReferenciaComercialBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonidvalorclientesectoreconomicoReferenciaComercialBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxidvalorclientesectoreconomicoReferenciaComercial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxidvalorclientesectoreconomicoReferenciaComercial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"idvalorclientesectoreconomicoReferenciaComercialBusqueda"));

		if(this.referenciacomercialSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonidvalorclientesectoreconomicoReferenciaComercialBusqueda.setVisible(false);		}

		this.jButtonidvalorclientesectoreconomicoReferenciaComercialUpdate= new JButtonMe();
		this.jButtonidvalorclientesectoreconomicoReferenciaComercialUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidvalorclientesectoreconomicoReferenciaComercialUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidvalorclientesectoreconomicoReferenciaComercialUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonidvalorclientesectoreconomicoReferenciaComercialUpdate.setText("U");
		this.jButtonidvalorclientesectoreconomicoReferenciaComercialUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonidvalorclientesectoreconomicoReferenciaComercialUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonidvalorclientesectoreconomicoReferenciaComercialUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxidvalorclientesectoreconomicoReferenciaComercial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxidvalorclientesectoreconomicoReferenciaComercial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"idvalorclientesectoreconomicoReferenciaComercialUpdate"));



					
		this.jLabelid_paisReferenciaComercial = new JLabelMe();
		this.jLabelid_paisReferenciaComercial.setText(""+ReferenciaComercialConstantesFunciones.LABEL_IDPAIS+" : *");
		this.jLabelid_paisReferenciaComercial.setToolTipText("Pais");
		this.jLabelid_paisReferenciaComercial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisReferenciaComercial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisReferenciaComercial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_paisReferenciaComercial,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_paisReferenciaComercial=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_paisReferenciaComercial.setToolTipText(ReferenciaComercialConstantesFunciones.LABEL_IDPAIS);
		this.gridaBagLayoutReferenciaComercial = new GridBagLayout();
		this.jPanelid_paisReferenciaComercial.setLayout(this.gridaBagLayoutReferenciaComercial);


		jComboBoxid_paisReferenciaComercial= new JComboBoxMe();
		jComboBoxid_paisReferenciaComercial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisReferenciaComercial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisReferenciaComercial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisReferenciaComercial,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_paisReferenciaComercial= new JButtonMe();
		this.jButtonid_paisReferenciaComercial.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisReferenciaComercial.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisReferenciaComercial.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisReferenciaComercial.setText("Buscar");
		this.jButtonid_paisReferenciaComercial.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_paisReferenciaComercial.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisReferenciaComercial,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_paisReferenciaComercial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisReferenciaComercial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisReferenciaComercial"));

		this.jButtonid_paisReferenciaComercialBusqueda= new JButtonMe();
		this.jButtonid_paisReferenciaComercialBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisReferenciaComercialBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisReferenciaComercialBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisReferenciaComercialBusqueda.setText("U");
		this.jButtonid_paisReferenciaComercialBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_paisReferenciaComercialBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisReferenciaComercialBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_paisReferenciaComercial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisReferenciaComercial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisReferenciaComercialBusqueda"));

		if(this.referenciacomercialSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_paisReferenciaComercialBusqueda.setVisible(false);		}

		this.jButtonid_paisReferenciaComercialUpdate= new JButtonMe();
		this.jButtonid_paisReferenciaComercialUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisReferenciaComercialUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisReferenciaComercialUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisReferenciaComercialUpdate.setText("U");
		this.jButtonid_paisReferenciaComercialUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_paisReferenciaComercialUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisReferenciaComercialUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_paisReferenciaComercial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisReferenciaComercial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisReferenciaComercialUpdate"));



					
		this.jLabelidciudadReferenciaComercial = new JLabelMe();
		this.jLabelidciudadReferenciaComercial.setText(""+ReferenciaComercialConstantesFunciones.LABEL_IDCIUDAD+" : *");
		this.jLabelidciudadReferenciaComercial.setToolTipText("Ciudad");
		this.jLabelidciudadReferenciaComercial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelidciudadReferenciaComercial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelidciudadReferenciaComercial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelidciudadReferenciaComercial,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelidciudadReferenciaComercial=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidciudadReferenciaComercial.setToolTipText(ReferenciaComercialConstantesFunciones.LABEL_IDCIUDAD);
		this.gridaBagLayoutReferenciaComercial = new GridBagLayout();
		this.jPanelidciudadReferenciaComercial.setLayout(this.gridaBagLayoutReferenciaComercial);


		jComboBoxidciudadReferenciaComercial= new JComboBoxMe();
		jComboBoxidciudadReferenciaComercial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidciudadReferenciaComercial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidciudadReferenciaComercial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxidciudadReferenciaComercial,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonidciudadReferenciaComercial= new JButtonMe();
		this.jButtonidciudadReferenciaComercial.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonidciudadReferenciaComercial.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonidciudadReferenciaComercial.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonidciudadReferenciaComercial.setText("Buscar");
		this.jButtonidciudadReferenciaComercial.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonidciudadReferenciaComercial.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonidciudadReferenciaComercial,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxidciudadReferenciaComercial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxidciudadReferenciaComercial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"idciudadReferenciaComercial"));

		this.jButtonidciudadReferenciaComercialBusqueda= new JButtonMe();
		this.jButtonidciudadReferenciaComercialBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidciudadReferenciaComercialBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidciudadReferenciaComercialBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonidciudadReferenciaComercialBusqueda.setText("U");
		this.jButtonidciudadReferenciaComercialBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonidciudadReferenciaComercialBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonidciudadReferenciaComercialBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxidciudadReferenciaComercial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxidciudadReferenciaComercial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"idciudadReferenciaComercialBusqueda"));

		if(this.referenciacomercialSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonidciudadReferenciaComercialBusqueda.setVisible(false);		}

		this.jButtonidciudadReferenciaComercialUpdate= new JButtonMe();
		this.jButtonidciudadReferenciaComercialUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidciudadReferenciaComercialUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidciudadReferenciaComercialUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonidciudadReferenciaComercialUpdate.setText("U");
		this.jButtonidciudadReferenciaComercialUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonidciudadReferenciaComercialUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonidciudadReferenciaComercialUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxidciudadReferenciaComercial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxidciudadReferenciaComercial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"idciudadReferenciaComercialUpdate"));



					
		this.jLabelid_tipo_valoracionReferenciaComercial = new JLabelMe();
		this.jLabelid_tipo_valoracionReferenciaComercial.setText(""+ReferenciaComercialConstantesFunciones.LABEL_IDTIPOVALORACION+" : *");
		this.jLabelid_tipo_valoracionReferenciaComercial.setToolTipText("Tipo Valoracion");
		this.jLabelid_tipo_valoracionReferenciaComercial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_valoracionReferenciaComercial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_valoracionReferenciaComercial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_valoracionReferenciaComercial,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_valoracionReferenciaComercial=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_valoracionReferenciaComercial.setToolTipText(ReferenciaComercialConstantesFunciones.LABEL_IDTIPOVALORACION);
		this.gridaBagLayoutReferenciaComercial = new GridBagLayout();
		this.jPanelid_tipo_valoracionReferenciaComercial.setLayout(this.gridaBagLayoutReferenciaComercial);


		jComboBoxid_tipo_valoracionReferenciaComercial= new JComboBoxMe();
		jComboBoxid_tipo_valoracionReferenciaComercial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_valoracionReferenciaComercial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_valoracionReferenciaComercial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_valoracionReferenciaComercial,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_valoracionReferenciaComercial= new JButtonMe();
		this.jButtonid_tipo_valoracionReferenciaComercial.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_valoracionReferenciaComercial.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_valoracionReferenciaComercial.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_valoracionReferenciaComercial.setText("Buscar");
		this.jButtonid_tipo_valoracionReferenciaComercial.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_valoracionReferenciaComercial.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_valoracionReferenciaComercial,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_valoracionReferenciaComercial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_valoracionReferenciaComercial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_valoracionReferenciaComercial"));

		this.jButtonid_tipo_valoracionReferenciaComercialBusqueda= new JButtonMe();
		this.jButtonid_tipo_valoracionReferenciaComercialBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_valoracionReferenciaComercialBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_valoracionReferenciaComercialBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_valoracionReferenciaComercialBusqueda.setText("U");
		this.jButtonid_tipo_valoracionReferenciaComercialBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_valoracionReferenciaComercialBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_valoracionReferenciaComercialBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_valoracionReferenciaComercial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_valoracionReferenciaComercial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_valoracionReferenciaComercialBusqueda"));

		if(this.referenciacomercialSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_valoracionReferenciaComercialBusqueda.setVisible(false);		}

		this.jButtonid_tipo_valoracionReferenciaComercialUpdate= new JButtonMe();
		this.jButtonid_tipo_valoracionReferenciaComercialUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_valoracionReferenciaComercialUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_valoracionReferenciaComercialUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_valoracionReferenciaComercialUpdate.setText("U");
		this.jButtonid_tipo_valoracionReferenciaComercialUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_valoracionReferenciaComercialUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_valoracionReferenciaComercialUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_valoracionReferenciaComercial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_valoracionReferenciaComercial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_valoracionReferenciaComercialUpdate"));



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
		//this.jInternalFrameDetalleReferenciaComercial = new ReferenciaComercialBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Referencia Comercial DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutReferenciaComercial= new GridBagLayout();
		

		
		String sToolTipReferenciaComercial="";
		sToolTipReferenciaComercial=ReferenciaComercialConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipReferenciaComercial+="(Cartera.ReferenciaComercial)";
		}
		
		if(!this.referenciacomercialSessionBean.getEsGuardarRelacionado()) {
			sToolTipReferenciaComercial+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoReferenciaComercial = new JButtonMe();
		this.jButtonModificarReferenciaComercial = new JButtonMe();
        this.jButtonActualizarReferenciaComercial = new JButtonMe();
        this.jButtonEliminarReferenciaComercial = new JButtonMe();
        this.jButtonCancelarReferenciaComercial = new JButtonMe();
        this.jButtonGuardarCambiosReferenciaComercial = new JButtonMe();
		this.jButtonGuardarCambiosTablaReferenciaComercial = new JButtonMe();
		this.jButtonCerrarReferenciaComercial = new JButtonMe();
		
		this.jScrollPanelDatosReferenciaComercial = new JScrollPane();   
        this.jScrollPanelDatosEdicionReferenciaComercial = new JScrollPane();
		this.jScrollPanelDatosGeneralReferenciaComercial = new JScrollPane();
				
		
		
		this.jPanelCamposReferenciaComercial = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosReferenciaComercial = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesReferenciaComercial = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioReferenciaComercial = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Referencia Comercial";
		
		if(!this.referenciacomercialSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosReferenciaComercial.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Referencia Comerciales" + this.sPath));
		} else {
			this.jScrollPanelDatosReferenciaComercial.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionReferenciaComercial.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralReferenciaComercial.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposReferenciaComercial.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposReferenciaComercial.setName("jPanelCamposReferenciaComercial"); 

		this.jPanelCamposOcultosReferenciaComercial.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosReferenciaComercial.setName("jPanelCamposOcultosReferenciaComercial"); 

        this.jPanelAccionesReferenciaComercial.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesReferenciaComercial.setToolTipText("Acciones");
        this.jPanelAccionesReferenciaComercial.setName("Acciones"); 

		this.jPanelAccionesFormularioReferenciaComercial.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioReferenciaComercial.setToolTipText("Acciones");
        this.jPanelAccionesFormularioReferenciaComercial.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionReferenciaComercial, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralReferenciaComercial, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosReferenciaComercial, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposReferenciaComercial, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosReferenciaComercial, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioReferenciaComercial, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoReferenciaComercial.setText("Nuevo");
		this.jButtonModificarReferenciaComercial.setText("Editar");
        this.jButtonActualizarReferenciaComercial.setText("Actualizar");
        this.jButtonEliminarReferenciaComercial.setText("Eliminar");
        this.jButtonCancelarReferenciaComercial.setText("Cancelar");
        this.jButtonGuardarCambiosReferenciaComercial.setText("Guardar");
		this.jButtonGuardarCambiosTablaReferenciaComercial.setText("Guardar");
		this.jButtonCerrarReferenciaComercial.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoReferenciaComercial,"nuevo_button","Nuevo",this.referenciacomercialSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarReferenciaComercial,"modificar_button","Editar",this.referenciacomercialSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarReferenciaComercial,"actualizar_button","Actualizar",this.referenciacomercialSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarReferenciaComercial,"eliminar_button","Eliminar",this.referenciacomercialSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarReferenciaComercial,"cancelar_button","Cancelar",this.referenciacomercialSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosReferenciaComercial,"guardarcambios_button","Guardar",this.referenciacomercialSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaReferenciaComercial,"guardarcambiostabla_button","Guardar",this.referenciacomercialSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReferenciaComercial,"cerrar_button","Salir",this.referenciacomercialSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoReferenciaComercial, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarReferenciaComercial, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosReferenciaComercial, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaReferenciaComercial, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarReferenciaComercial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarReferenciaComercial, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarReferenciaComercial, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarReferenciaComercial, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoReferenciaComercial.setToolTipText("Nuevo"+" "+ReferenciaComercialConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarReferenciaComercial.setToolTipText("Editar"+" "+ReferenciaComercialConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarReferenciaComercial.setToolTipText("Actualizar"+" "+ReferenciaComercialConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarReferenciaComercial.setToolTipText("Eliminar)"+" "+ReferenciaComercialConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarReferenciaComercial.setToolTipText("Cancelar"+" "+ReferenciaComercialConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosReferenciaComercial.setToolTipText("Guardar"+" "+ReferenciaComercialConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaReferenciaComercial.setToolTipText("Guardar"+" "+ReferenciaComercialConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarReferenciaComercial.setToolTipText("Salir"+" "+ReferenciaComercialConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoReferenciaComercial";
		inputMap = this.jButtonNuevoReferenciaComercial.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoReferenciaComercial.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoReferenciaComercial"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarReferenciaComercial";
		inputMap = this.jButtonActualizarReferenciaComercial.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarReferenciaComercial.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarReferenciaComercial"));
		
		//ELIMINAR
		sMapKey = "EliminarReferenciaComercial";
		inputMap = this.jButtonEliminarReferenciaComercial.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarReferenciaComercial.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarReferenciaComercial"));
		
		//CANCELAR	
		sMapKey = "CancelarReferenciaComercial";
		inputMap = this.jButtonCancelarReferenciaComercial.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarReferenciaComercial.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarReferenciaComercial"));
		
		//CERRAR		
		sMapKey = "CerrarReferenciaComercial";
		inputMap = this.jButtonCerrarReferenciaComercial.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarReferenciaComercial.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarReferenciaComercial"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaReferenciaComercial";
		inputMap = this.jButtonGuardarCambiosTablaReferenciaComercial.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaReferenciaComercial.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaReferenciaComercial"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoReferenciaComercial = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoReferenciaComercial.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoReferenciaComercial.setToolTipText("Nuevo ReferenciaComercial");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoReferenciaComercial, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarReferenciaComercial = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarReferenciaComercial.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarReferenciaComercial.setToolTipText("Sin Cerrar Ventana ReferenciaComercial");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarReferenciaComercial, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeReferenciaComercial = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeReferenciaComercial.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeReferenciaComercial.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeReferenciaComercial, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesReferenciaComercial = new JComboBoxMe();
		//this.jComboBoxTiposAccionesReferenciaComercial.setText("Accion");
		this.jComboBoxTiposAccionesReferenciaComercial.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioReferenciaComercial = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioReferenciaComercial.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioReferenciaComercial.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesReferenciaComercial = new JLabelMe();
		
		this.jLabelAccionesReferenciaComercial.setText("Acciones");		
		this.jLabelAccionesReferenciaComercial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesReferenciaComercial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesReferenciaComercial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposReferenciaComercial();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysReferenciaComercial();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesReferenciaComercial=new JTabbedPane();
		this.jTabbedPaneRelacionesReferenciaComercial.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesReferenciaComercial,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesReferenciaComercial.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesReferenciaComercial.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesReferenciaComercial.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesReferenciaComercial, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioReferenciaComercial.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioReferenciaComercial.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioReferenciaComercial.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioReferenciaComercial, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposReferenciaComercial = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosReferenciaComercial = new GridBagLayout();
		
		this.jPanelCamposReferenciaComercial.setLayout(gridaBagLayoutCamposReferenciaComercial);
		this.jPanelCamposOcultosReferenciaComercial.setLayout(gridaBagLayoutCamposOcultosReferenciaComercial);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
	this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaComercial.gridy = 0;
	this.gridBagConstraintsReferenciaComercial.gridx = 0;
	this.gridBagConstraintsReferenciaComercial.ipadx = 0;
	this.gridBagConstraintsReferenciaComercial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidReferenciaComercial.add(jLabelIdReferenciaComercial, this.gridBagConstraintsReferenciaComercial);



	this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
	this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaComercial.gridy = 0;
	this.gridBagConstraintsReferenciaComercial.gridx = 1;
	this.gridBagConstraintsReferenciaComercial.ipadx = 0;
	this.gridBagConstraintsReferenciaComercial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidReferenciaComercial.add(jLabelidReferenciaComercial, this.gridBagConstraintsReferenciaComercial);


	this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
	this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaComercial.gridy = 0;
	this.gridBagConstraintsReferenciaComercial.gridx = 0;
	this.gridBagConstraintsReferenciaComercial.ipadx = 0;
	this.gridBagConstraintsReferenciaComercial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaReferenciaComercial.add(jLabelid_empresaReferenciaComercial, this.gridBagConstraintsReferenciaComercial);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
		//this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaComercial.gridy = 0;
		this.gridBagConstraintsReferenciaComercial.gridx = 2;
		this.gridBagConstraintsReferenciaComercial.ipadx = 0;
		this.gridBagConstraintsReferenciaComercial.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaReferenciaComercial.add(jButtonid_empresaReferenciaComercialBusqueda, this.gridBagConstraintsReferenciaComercial);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
		//this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaComercial.gridy = 0;
		this.gridBagConstraintsReferenciaComercial.gridx = 3;
		this.gridBagConstraintsReferenciaComercial.ipadx = 0;
		this.gridBagConstraintsReferenciaComercial.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaReferenciaComercial.add(jButtonid_empresaReferenciaComercialUpdate, this.gridBagConstraintsReferenciaComercial);
	}

	this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
	this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaComercial.gridy = 0;
	this.gridBagConstraintsReferenciaComercial.gridx = 1;
	this.gridBagConstraintsReferenciaComercial.ipadx = 0;
	this.gridBagConstraintsReferenciaComercial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaReferenciaComercial.add(jComboBoxid_empresaReferenciaComercial, this.gridBagConstraintsReferenciaComercial);


	this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
	this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaComercial.gridy = 0;
	this.gridBagConstraintsReferenciaComercial.gridx = 0;
	this.gridBagConstraintsReferenciaComercial.ipadx = 0;
	this.gridBagConstraintsReferenciaComercial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidclienteReferenciaComercial.add(jLabelidclienteReferenciaComercial, this.gridBagConstraintsReferenciaComercial);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
	//this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaComercial.gridy = 0;
	this.gridBagConstraintsReferenciaComercial.gridx = 2;
	this.gridBagConstraintsReferenciaComercial.ipadx = 0;
	this.gridBagConstraintsReferenciaComercial.insets = new Insets(0, 0, 0, 0);
	this.jPanelidclienteReferenciaComercial.add(jButtonidclienteReferenciaComercial, this.gridBagConstraintsReferenciaComercial);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
		//this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaComercial.gridy = 0;
		this.gridBagConstraintsReferenciaComercial.gridx = 3;
		this.gridBagConstraintsReferenciaComercial.ipadx = 0;
		this.gridBagConstraintsReferenciaComercial.insets = new Insets(0, 0, 0, 0);
		this.jPanelidclienteReferenciaComercial.add(jButtonidclienteReferenciaComercialBusqueda, this.gridBagConstraintsReferenciaComercial);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
		//this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaComercial.gridy = 0;
		this.gridBagConstraintsReferenciaComercial.gridx = 4;
		this.gridBagConstraintsReferenciaComercial.ipadx = 0;
		this.gridBagConstraintsReferenciaComercial.insets = new Insets(0, 0, 0, 0);
		this.jPanelidclienteReferenciaComercial.add(jButtonidclienteReferenciaComercialUpdate, this.gridBagConstraintsReferenciaComercial);
	}

	this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
	this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaComercial.gridy = 0;
	this.gridBagConstraintsReferenciaComercial.gridx = 1;
	this.gridBagConstraintsReferenciaComercial.ipadx = 0;
	this.gridBagConstraintsReferenciaComercial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidclienteReferenciaComercial.add(jComboBoxidclienteReferenciaComercial, this.gridBagConstraintsReferenciaComercial);


	this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
	this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaComercial.gridy = 0;
	this.gridBagConstraintsReferenciaComercial.gridx = 0;
	this.gridBagConstraintsReferenciaComercial.ipadx = 0;
	this.gridBagConstraintsReferenciaComercial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidvalorclientesectoreconomicoReferenciaComercial.add(jLabelidvalorclientesectoreconomicoReferenciaComercial, this.gridBagConstraintsReferenciaComercial);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
		//this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaComercial.gridy = 0;
		this.gridBagConstraintsReferenciaComercial.gridx = 2;
		this.gridBagConstraintsReferenciaComercial.ipadx = 0;
		this.gridBagConstraintsReferenciaComercial.insets = new Insets(0, 0, 0, 0);
		this.jPanelidvalorclientesectoreconomicoReferenciaComercial.add(jButtonidvalorclientesectoreconomicoReferenciaComercialBusqueda, this.gridBagConstraintsReferenciaComercial);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
		//this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaComercial.gridy = 0;
		this.gridBagConstraintsReferenciaComercial.gridx = 3;
		this.gridBagConstraintsReferenciaComercial.ipadx = 0;
		this.gridBagConstraintsReferenciaComercial.insets = new Insets(0, 0, 0, 0);
		this.jPanelidvalorclientesectoreconomicoReferenciaComercial.add(jButtonidvalorclientesectoreconomicoReferenciaComercialUpdate, this.gridBagConstraintsReferenciaComercial);
	}

	this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
	this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaComercial.gridy = 0;
	this.gridBagConstraintsReferenciaComercial.gridx = 1;
	this.gridBagConstraintsReferenciaComercial.ipadx = 0;
	this.gridBagConstraintsReferenciaComercial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidvalorclientesectoreconomicoReferenciaComercial.add(jComboBoxidvalorclientesectoreconomicoReferenciaComercial, this.gridBagConstraintsReferenciaComercial);


	this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
	this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaComercial.gridy = 0;
	this.gridBagConstraintsReferenciaComercial.gridx = 0;
	this.gridBagConstraintsReferenciaComercial.ipadx = 0;
	this.gridBagConstraintsReferenciaComercial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_paisReferenciaComercial.add(jLabelid_paisReferenciaComercial, this.gridBagConstraintsReferenciaComercial);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
		//this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaComercial.gridy = 0;
		this.gridBagConstraintsReferenciaComercial.gridx = 2;
		this.gridBagConstraintsReferenciaComercial.ipadx = 0;
		this.gridBagConstraintsReferenciaComercial.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisReferenciaComercial.add(jButtonid_paisReferenciaComercialBusqueda, this.gridBagConstraintsReferenciaComercial);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
		//this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaComercial.gridy = 0;
		this.gridBagConstraintsReferenciaComercial.gridx = 3;
		this.gridBagConstraintsReferenciaComercial.ipadx = 0;
		this.gridBagConstraintsReferenciaComercial.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisReferenciaComercial.add(jButtonid_paisReferenciaComercialUpdate, this.gridBagConstraintsReferenciaComercial);
	}

	this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
	this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaComercial.gridy = 0;
	this.gridBagConstraintsReferenciaComercial.gridx = 1;
	this.gridBagConstraintsReferenciaComercial.ipadx = 0;
	this.gridBagConstraintsReferenciaComercial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_paisReferenciaComercial.add(jComboBoxid_paisReferenciaComercial, this.gridBagConstraintsReferenciaComercial);


	this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
	this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaComercial.gridy = 0;
	this.gridBagConstraintsReferenciaComercial.gridx = 0;
	this.gridBagConstraintsReferenciaComercial.ipadx = 0;
	this.gridBagConstraintsReferenciaComercial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidciudadReferenciaComercial.add(jLabelidciudadReferenciaComercial, this.gridBagConstraintsReferenciaComercial);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
		//this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaComercial.gridy = 0;
		this.gridBagConstraintsReferenciaComercial.gridx = 2;
		this.gridBagConstraintsReferenciaComercial.ipadx = 0;
		this.gridBagConstraintsReferenciaComercial.insets = new Insets(0, 0, 0, 0);
		this.jPanelidciudadReferenciaComercial.add(jButtonidciudadReferenciaComercialBusqueda, this.gridBagConstraintsReferenciaComercial);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
		//this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaComercial.gridy = 0;
		this.gridBagConstraintsReferenciaComercial.gridx = 3;
		this.gridBagConstraintsReferenciaComercial.ipadx = 0;
		this.gridBagConstraintsReferenciaComercial.insets = new Insets(0, 0, 0, 0);
		this.jPanelidciudadReferenciaComercial.add(jButtonidciudadReferenciaComercialUpdate, this.gridBagConstraintsReferenciaComercial);
	}

	this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
	this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaComercial.gridy = 0;
	this.gridBagConstraintsReferenciaComercial.gridx = 1;
	this.gridBagConstraintsReferenciaComercial.ipadx = 0;
	this.gridBagConstraintsReferenciaComercial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidciudadReferenciaComercial.add(jComboBoxidciudadReferenciaComercial, this.gridBagConstraintsReferenciaComercial);


	this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
	this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaComercial.gridy = 0;
	this.gridBagConstraintsReferenciaComercial.gridx = 0;
	this.gridBagConstraintsReferenciaComercial.ipadx = 0;
	this.gridBagConstraintsReferenciaComercial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreempresaReferenciaComercial.add(jLabelnombreempresaReferenciaComercial, this.gridBagConstraintsReferenciaComercial);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
		//this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaComercial.gridy = 0;
		this.gridBagConstraintsReferenciaComercial.gridx = 2;
		this.gridBagConstraintsReferenciaComercial.ipadx = 0;
		this.gridBagConstraintsReferenciaComercial.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreempresaReferenciaComercial.add(jButtonnombreempresaReferenciaComercialBusqueda, this.gridBagConstraintsReferenciaComercial);
	}

	this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
	this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaComercial.gridy = 0;
	this.gridBagConstraintsReferenciaComercial.gridx = 1;
	this.gridBagConstraintsReferenciaComercial.ipadx = 0;
	this.gridBagConstraintsReferenciaComercial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreempresaReferenciaComercial.add(jscrollPanenombreempresaReferenciaComercial, this.gridBagConstraintsReferenciaComercial);


	this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
	this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaComercial.gridy = 0;
	this.gridBagConstraintsReferenciaComercial.gridx = 0;
	this.gridBagConstraintsReferenciaComercial.ipadx = 0;
	this.gridBagConstraintsReferenciaComercial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_clienteReferenciaComercial.add(jLabelcodigo_clienteReferenciaComercial, this.gridBagConstraintsReferenciaComercial);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
		//this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaComercial.gridy = 0;
		this.gridBagConstraintsReferenciaComercial.gridx = 2;
		this.gridBagConstraintsReferenciaComercial.ipadx = 0;
		this.gridBagConstraintsReferenciaComercial.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_clienteReferenciaComercial.add(jButtoncodigo_clienteReferenciaComercialBusqueda, this.gridBagConstraintsReferenciaComercial);
	}

	this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
	this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaComercial.gridy = 0;
	this.gridBagConstraintsReferenciaComercial.gridx = 1;
	this.gridBagConstraintsReferenciaComercial.ipadx = 0;
	this.gridBagConstraintsReferenciaComercial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_clienteReferenciaComercial.add(jTextFieldcodigo_clienteReferenciaComercial, this.gridBagConstraintsReferenciaComercial);


	this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
	this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaComercial.gridy = 0;
	this.gridBagConstraintsReferenciaComercial.gridx = 0;
	this.gridBagConstraintsReferenciaComercial.ipadx = 0;
	this.gridBagConstraintsReferenciaComercial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcontactoReferenciaComercial.add(jLabelcontactoReferenciaComercial, this.gridBagConstraintsReferenciaComercial);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
		//this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaComercial.gridy = 0;
		this.gridBagConstraintsReferenciaComercial.gridx = 2;
		this.gridBagConstraintsReferenciaComercial.ipadx = 0;
		this.gridBagConstraintsReferenciaComercial.insets = new Insets(0, 0, 0, 0);
		this.jPanelcontactoReferenciaComercial.add(jButtoncontactoReferenciaComercialBusqueda, this.gridBagConstraintsReferenciaComercial);
	}

	this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
	this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaComercial.gridy = 0;
	this.gridBagConstraintsReferenciaComercial.gridx = 1;
	this.gridBagConstraintsReferenciaComercial.ipadx = 0;
	this.gridBagConstraintsReferenciaComercial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcontactoReferenciaComercial.add(jscrollPanecontactoReferenciaComercial, this.gridBagConstraintsReferenciaComercial);


	this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
	this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaComercial.gridy = 0;
	this.gridBagConstraintsReferenciaComercial.gridx = 0;
	this.gridBagConstraintsReferenciaComercial.ipadx = 0;
	this.gridBagConstraintsReferenciaComercial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelarticulo_compraReferenciaComercial.add(jLabelarticulo_compraReferenciaComercial, this.gridBagConstraintsReferenciaComercial);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
		//this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaComercial.gridy = 0;
		this.gridBagConstraintsReferenciaComercial.gridx = 2;
		this.gridBagConstraintsReferenciaComercial.ipadx = 0;
		this.gridBagConstraintsReferenciaComercial.insets = new Insets(0, 0, 0, 0);
		this.jPanelarticulo_compraReferenciaComercial.add(jButtonarticulo_compraReferenciaComercialBusqueda, this.gridBagConstraintsReferenciaComercial);
	}

	this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
	this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaComercial.gridy = 0;
	this.gridBagConstraintsReferenciaComercial.gridx = 1;
	this.gridBagConstraintsReferenciaComercial.ipadx = 0;
	this.gridBagConstraintsReferenciaComercial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelarticulo_compraReferenciaComercial.add(jscrollPanearticulo_compraReferenciaComercial, this.gridBagConstraintsReferenciaComercial);


	this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
	this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaComercial.gridy = 0;
	this.gridBagConstraintsReferenciaComercial.gridx = 0;
	this.gridBagConstraintsReferenciaComercial.ipadx = 0;
	this.gridBagConstraintsReferenciaComercial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_aniosReferenciaComercial.add(jLabelnumero_aniosReferenciaComercial, this.gridBagConstraintsReferenciaComercial);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
		//this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaComercial.gridy = 0;
		this.gridBagConstraintsReferenciaComercial.gridx = 2;
		this.gridBagConstraintsReferenciaComercial.ipadx = 0;
		this.gridBagConstraintsReferenciaComercial.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_aniosReferenciaComercial.add(jButtonnumero_aniosReferenciaComercialBusqueda, this.gridBagConstraintsReferenciaComercial);
	}

	this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
	this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaComercial.gridy = 0;
	this.gridBagConstraintsReferenciaComercial.gridx = 1;
	this.gridBagConstraintsReferenciaComercial.ipadx = 0;
	this.gridBagConstraintsReferenciaComercial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_aniosReferenciaComercial.add(jTextFieldnumero_aniosReferenciaComercial, this.gridBagConstraintsReferenciaComercial);


	this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
	this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaComercial.gridy = 0;
	this.gridBagConstraintsReferenciaComercial.gridx = 0;
	this.gridBagConstraintsReferenciaComercial.ipadx = 0;
	this.gridBagConstraintsReferenciaComercial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_mesesReferenciaComercial.add(jLabelnumero_mesesReferenciaComercial, this.gridBagConstraintsReferenciaComercial);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
		//this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaComercial.gridy = 0;
		this.gridBagConstraintsReferenciaComercial.gridx = 2;
		this.gridBagConstraintsReferenciaComercial.ipadx = 0;
		this.gridBagConstraintsReferenciaComercial.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_mesesReferenciaComercial.add(jButtonnumero_mesesReferenciaComercialBusqueda, this.gridBagConstraintsReferenciaComercial);
	}

	this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
	this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaComercial.gridy = 0;
	this.gridBagConstraintsReferenciaComercial.gridx = 1;
	this.gridBagConstraintsReferenciaComercial.ipadx = 0;
	this.gridBagConstraintsReferenciaComercial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_mesesReferenciaComercial.add(jTextFieldnumero_mesesReferenciaComercial, this.gridBagConstraintsReferenciaComercial);


	this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
	this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaComercial.gridy = 0;
	this.gridBagConstraintsReferenciaComercial.gridx = 0;
	this.gridBagConstraintsReferenciaComercial.ipadx = 0;
	this.gridBagConstraintsReferenciaComercial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_valoracionReferenciaComercial.add(jLabelid_tipo_valoracionReferenciaComercial, this.gridBagConstraintsReferenciaComercial);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
		//this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaComercial.gridy = 0;
		this.gridBagConstraintsReferenciaComercial.gridx = 2;
		this.gridBagConstraintsReferenciaComercial.ipadx = 0;
		this.gridBagConstraintsReferenciaComercial.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_valoracionReferenciaComercial.add(jButtonid_tipo_valoracionReferenciaComercialBusqueda, this.gridBagConstraintsReferenciaComercial);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
		//this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaComercial.gridy = 0;
		this.gridBagConstraintsReferenciaComercial.gridx = 3;
		this.gridBagConstraintsReferenciaComercial.ipadx = 0;
		this.gridBagConstraintsReferenciaComercial.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_valoracionReferenciaComercial.add(jButtonid_tipo_valoracionReferenciaComercialUpdate, this.gridBagConstraintsReferenciaComercial);
	}

	this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
	this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaComercial.gridy = 0;
	this.gridBagConstraintsReferenciaComercial.gridx = 1;
	this.gridBagConstraintsReferenciaComercial.ipadx = 0;
	this.gridBagConstraintsReferenciaComercial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_valoracionReferenciaComercial.add(jComboBoxid_tipo_valoracionReferenciaComercial, this.gridBagConstraintsReferenciaComercial);


	this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
	this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaComercial.gridy = 0;
	this.gridBagConstraintsReferenciaComercial.gridx = 0;
	this.gridBagConstraintsReferenciaComercial.ipadx = 0;
	this.gridBagConstraintsReferenciaComercial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldireccionReferenciaComercial.add(jLabeldireccionReferenciaComercial, this.gridBagConstraintsReferenciaComercial);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
		//this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaComercial.gridy = 0;
		this.gridBagConstraintsReferenciaComercial.gridx = 2;
		this.gridBagConstraintsReferenciaComercial.ipadx = 0;
		this.gridBagConstraintsReferenciaComercial.insets = new Insets(0, 0, 0, 0);
		this.jPaneldireccionReferenciaComercial.add(jButtondireccionReferenciaComercialBusqueda, this.gridBagConstraintsReferenciaComercial);
	}

	this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
	this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaComercial.gridy = 0;
	this.gridBagConstraintsReferenciaComercial.gridx = 1;
	this.gridBagConstraintsReferenciaComercial.ipadx = 0;
	this.gridBagConstraintsReferenciaComercial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldireccionReferenciaComercial.add(jscrollPanedireccionReferenciaComercial, this.gridBagConstraintsReferenciaComercial);


	this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
	this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaComercial.gridy = 0;
	this.gridBagConstraintsReferenciaComercial.gridx = 0;
	this.gridBagConstraintsReferenciaComercial.ipadx = 0;
	this.gridBagConstraintsReferenciaComercial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltelefonoReferenciaComercial.add(jLabeltelefonoReferenciaComercial, this.gridBagConstraintsReferenciaComercial);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
		//this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaComercial.gridy = 0;
		this.gridBagConstraintsReferenciaComercial.gridx = 2;
		this.gridBagConstraintsReferenciaComercial.ipadx = 0;
		this.gridBagConstraintsReferenciaComercial.insets = new Insets(0, 0, 0, 0);
		this.jPaneltelefonoReferenciaComercial.add(jButtontelefonoReferenciaComercialBusqueda, this.gridBagConstraintsReferenciaComercial);
	}

	this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
	this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaComercial.gridy = 0;
	this.gridBagConstraintsReferenciaComercial.gridx = 1;
	this.gridBagConstraintsReferenciaComercial.ipadx = 0;
	this.gridBagConstraintsReferenciaComercial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltelefonoReferenciaComercial.add(jscrollPanetelefonoReferenciaComercial, this.gridBagConstraintsReferenciaComercial);


	this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
	this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaComercial.gridy = 0;
	this.gridBagConstraintsReferenciaComercial.gridx = 0;
	this.gridBagConstraintsReferenciaComercial.ipadx = 0;
	this.gridBagConstraintsReferenciaComercial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltelefonomovilReferenciaComercial.add(jLabeltelefonomovilReferenciaComercial, this.gridBagConstraintsReferenciaComercial);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
		//this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaComercial.gridy = 0;
		this.gridBagConstraintsReferenciaComercial.gridx = 2;
		this.gridBagConstraintsReferenciaComercial.ipadx = 0;
		this.gridBagConstraintsReferenciaComercial.insets = new Insets(0, 0, 0, 0);
		this.jPaneltelefonomovilReferenciaComercial.add(jButtontelefonomovilReferenciaComercialBusqueda, this.gridBagConstraintsReferenciaComercial);
	}

	this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
	this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaComercial.gridy = 0;
	this.gridBagConstraintsReferenciaComercial.gridx = 1;
	this.gridBagConstraintsReferenciaComercial.ipadx = 0;
	this.gridBagConstraintsReferenciaComercial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltelefonomovilReferenciaComercial.add(jscrollPanetelefonomovilReferenciaComercial, this.gridBagConstraintsReferenciaComercial);


	this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
	this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaComercial.gridy = 0;
	this.gridBagConstraintsReferenciaComercial.gridx = 0;
	this.gridBagConstraintsReferenciaComercial.ipadx = 0;
	this.gridBagConstraintsReferenciaComercial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltelefonocodigoareaReferenciaComercial.add(jLabeltelefonocodigoareaReferenciaComercial, this.gridBagConstraintsReferenciaComercial);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
		//this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaComercial.gridy = 0;
		this.gridBagConstraintsReferenciaComercial.gridx = 2;
		this.gridBagConstraintsReferenciaComercial.ipadx = 0;
		this.gridBagConstraintsReferenciaComercial.insets = new Insets(0, 0, 0, 0);
		this.jPaneltelefonocodigoareaReferenciaComercial.add(jButtontelefonocodigoareaReferenciaComercialBusqueda, this.gridBagConstraintsReferenciaComercial);
	}

	this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
	this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaComercial.gridy = 0;
	this.gridBagConstraintsReferenciaComercial.gridx = 1;
	this.gridBagConstraintsReferenciaComercial.ipadx = 0;
	this.gridBagConstraintsReferenciaComercial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltelefonocodigoareaReferenciaComercial.add(jTextFieldtelefonocodigoareaReferenciaComercial, this.gridBagConstraintsReferenciaComercial);


	this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
	this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaComercial.gridy = 0;
	this.gridBagConstraintsReferenciaComercial.gridx = 0;
	this.gridBagConstraintsReferenciaComercial.ipadx = 0;
	this.gridBagConstraintsReferenciaComercial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelemailReferenciaComercial.add(jLabelemailReferenciaComercial, this.gridBagConstraintsReferenciaComercial);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
		//this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaComercial.gridy = 0;
		this.gridBagConstraintsReferenciaComercial.gridx = 2;
		this.gridBagConstraintsReferenciaComercial.ipadx = 0;
		this.gridBagConstraintsReferenciaComercial.insets = new Insets(0, 0, 0, 0);
		this.jPanelemailReferenciaComercial.add(jButtonemailReferenciaComercialBusqueda, this.gridBagConstraintsReferenciaComercial);
	}

	this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
	this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaComercial.gridy = 0;
	this.gridBagConstraintsReferenciaComercial.gridx = 1;
	this.gridBagConstraintsReferenciaComercial.ipadx = 0;
	this.gridBagConstraintsReferenciaComercial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelemailReferenciaComercial.add(jscrollPaneemailReferenciaComercial, this.gridBagConstraintsReferenciaComercial);


	this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
	this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaComercial.gridy = 0;
	this.gridBagConstraintsReferenciaComercial.gridx = 0;
	this.gridBagConstraintsReferenciaComercial.ipadx = 0;
	this.gridBagConstraintsReferenciaComercial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelmontoReferenciaComercial.add(jLabelmontoReferenciaComercial, this.gridBagConstraintsReferenciaComercial);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
		//this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaComercial.gridy = 0;
		this.gridBagConstraintsReferenciaComercial.gridx = 2;
		this.gridBagConstraintsReferenciaComercial.ipadx = 0;
		this.gridBagConstraintsReferenciaComercial.insets = new Insets(0, 0, 0, 0);
		this.jPanelmontoReferenciaComercial.add(jButtonmontoReferenciaComercialBusqueda, this.gridBagConstraintsReferenciaComercial);
	}

	this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
	this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaComercial.gridy = 0;
	this.gridBagConstraintsReferenciaComercial.gridx = 1;
	this.gridBagConstraintsReferenciaComercial.ipadx = 0;
	this.gridBagConstraintsReferenciaComercial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelmontoReferenciaComercial.add(jTextFieldmontoReferenciaComercial, this.gridBagConstraintsReferenciaComercial);


	this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
	this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaComercial.gridy = 0;
	this.gridBagConstraintsReferenciaComercial.gridx = 0;
	this.gridBagConstraintsReferenciaComercial.ipadx = 0;
	this.gridBagConstraintsReferenciaComercial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelesactivoReferenciaComercial.add(jLabelesactivoReferenciaComercial, this.gridBagConstraintsReferenciaComercial);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
		//this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaComercial.gridy = 0;
		this.gridBagConstraintsReferenciaComercial.gridx = 2;
		this.gridBagConstraintsReferenciaComercial.ipadx = 0;
		this.gridBagConstraintsReferenciaComercial.insets = new Insets(0, 0, 0, 0);
		this.jPanelesactivoReferenciaComercial.add(jButtonesactivoReferenciaComercialBusqueda, this.gridBagConstraintsReferenciaComercial);
	}

	this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
	this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaComercial.gridy = 0;
	this.gridBagConstraintsReferenciaComercial.gridx = 1;
	this.gridBagConstraintsReferenciaComercial.ipadx = 0;
	this.gridBagConstraintsReferenciaComercial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelesactivoReferenciaComercial.add(jCheckBoxesactivoReferenciaComercial, this.gridBagConstraintsReferenciaComercial);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
	this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsReferenciaComercial.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsReferenciaComercial.gridy = iYPanelCamposReferenciaComercial;
	this.gridBagConstraintsReferenciaComercial.gridx = iXPanelCamposReferenciaComercial++;
	this.gridBagConstraintsReferenciaComercial.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsReferenciaComercial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposReferenciaComercial.add(this.jPanelidReferenciaComercial, this.gridBagConstraintsReferenciaComercial);



	if(iXPanelCamposReferenciaComercial % 2==0) {
		iXPanelCamposReferenciaComercial=0;
		iYPanelCamposReferenciaComercial++;
	}
	this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
	this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsReferenciaComercial.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsReferenciaComercial.gridy = iYPanelCamposReferenciaComercial;
	this.gridBagConstraintsReferenciaComercial.gridx = iXPanelCamposReferenciaComercial++;
	this.gridBagConstraintsReferenciaComercial.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsReferenciaComercial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposReferenciaComercial.add(this.jPanelidclienteReferenciaComercial, this.gridBagConstraintsReferenciaComercial);



	if(iXPanelCamposReferenciaComercial % 2==0) {
		iXPanelCamposReferenciaComercial=0;
		iYPanelCamposReferenciaComercial++;
	}
	this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
	this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsReferenciaComercial.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsReferenciaComercial.gridy = iYPanelCamposReferenciaComercial;
	this.gridBagConstraintsReferenciaComercial.gridx = iXPanelCamposReferenciaComercial++;
	this.gridBagConstraintsReferenciaComercial.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsReferenciaComercial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposReferenciaComercial.add(this.jPanelidvalorclientesectoreconomicoReferenciaComercial, this.gridBagConstraintsReferenciaComercial);



	if(iXPanelCamposReferenciaComercial % 2==0) {
		iXPanelCamposReferenciaComercial=0;
		iYPanelCamposReferenciaComercial++;
	}
	this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
	this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsReferenciaComercial.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsReferenciaComercial.gridy = iYPanelCamposReferenciaComercial;
	this.gridBagConstraintsReferenciaComercial.gridx = iXPanelCamposReferenciaComercial++;
	this.gridBagConstraintsReferenciaComercial.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsReferenciaComercial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposReferenciaComercial.add(this.jPanelid_paisReferenciaComercial, this.gridBagConstraintsReferenciaComercial);



	if(iXPanelCamposReferenciaComercial % 2==0) {
		iXPanelCamposReferenciaComercial=0;
		iYPanelCamposReferenciaComercial++;
	}
	this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
	this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsReferenciaComercial.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsReferenciaComercial.gridy = iYPanelCamposReferenciaComercial;
	this.gridBagConstraintsReferenciaComercial.gridx = iXPanelCamposReferenciaComercial++;
	this.gridBagConstraintsReferenciaComercial.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsReferenciaComercial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposReferenciaComercial.add(this.jPanelidciudadReferenciaComercial, this.gridBagConstraintsReferenciaComercial);



	if(iXPanelCamposReferenciaComercial % 2==0) {
		iXPanelCamposReferenciaComercial=0;
		iYPanelCamposReferenciaComercial++;
	}
	this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
	this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsReferenciaComercial.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsReferenciaComercial.gridy = iYPanelCamposReferenciaComercial;
	this.gridBagConstraintsReferenciaComercial.gridx = iXPanelCamposReferenciaComercial++;
	this.gridBagConstraintsReferenciaComercial.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsReferenciaComercial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposReferenciaComercial.add(this.jPanelnombreempresaReferenciaComercial, this.gridBagConstraintsReferenciaComercial);



	if(iXPanelCamposReferenciaComercial % 2==0) {
		iXPanelCamposReferenciaComercial=0;
		iYPanelCamposReferenciaComercial++;
	}
	this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
	this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsReferenciaComercial.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsReferenciaComercial.gridy = iYPanelCamposReferenciaComercial;
	this.gridBagConstraintsReferenciaComercial.gridx = iXPanelCamposReferenciaComercial++;
	this.gridBagConstraintsReferenciaComercial.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsReferenciaComercial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposReferenciaComercial.add(this.jPanelcodigo_clienteReferenciaComercial, this.gridBagConstraintsReferenciaComercial);



	if(iXPanelCamposReferenciaComercial % 2==0) {
		iXPanelCamposReferenciaComercial=0;
		iYPanelCamposReferenciaComercial++;
	}
	this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
	this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsReferenciaComercial.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsReferenciaComercial.gridy = iYPanelCamposReferenciaComercial;
	this.gridBagConstraintsReferenciaComercial.gridx = iXPanelCamposReferenciaComercial++;
	this.gridBagConstraintsReferenciaComercial.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsReferenciaComercial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposReferenciaComercial.add(this.jPanelcontactoReferenciaComercial, this.gridBagConstraintsReferenciaComercial);



	if(iXPanelCamposReferenciaComercial % 2==0) {
		iXPanelCamposReferenciaComercial=0;
		iYPanelCamposReferenciaComercial++;
	}
	this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
	this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsReferenciaComercial.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsReferenciaComercial.gridy = iYPanelCamposReferenciaComercial;
	this.gridBagConstraintsReferenciaComercial.gridx = iXPanelCamposReferenciaComercial++;
	this.gridBagConstraintsReferenciaComercial.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsReferenciaComercial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposReferenciaComercial.add(this.jPanelarticulo_compraReferenciaComercial, this.gridBagConstraintsReferenciaComercial);



	if(iXPanelCamposReferenciaComercial % 2==0) {
		iXPanelCamposReferenciaComercial=0;
		iYPanelCamposReferenciaComercial++;
	}
	this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
	this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsReferenciaComercial.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsReferenciaComercial.gridy = iYPanelCamposReferenciaComercial;
	this.gridBagConstraintsReferenciaComercial.gridx = iXPanelCamposReferenciaComercial++;
	this.gridBagConstraintsReferenciaComercial.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsReferenciaComercial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposReferenciaComercial.add(this.jPanelnumero_aniosReferenciaComercial, this.gridBagConstraintsReferenciaComercial);



	if(iXPanelCamposReferenciaComercial % 2==0) {
		iXPanelCamposReferenciaComercial=0;
		iYPanelCamposReferenciaComercial++;
	}
	this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
	this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsReferenciaComercial.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsReferenciaComercial.gridy = iYPanelCamposReferenciaComercial;
	this.gridBagConstraintsReferenciaComercial.gridx = iXPanelCamposReferenciaComercial++;
	this.gridBagConstraintsReferenciaComercial.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsReferenciaComercial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposReferenciaComercial.add(this.jPanelnumero_mesesReferenciaComercial, this.gridBagConstraintsReferenciaComercial);



	if(iXPanelCamposReferenciaComercial % 2==0) {
		iXPanelCamposReferenciaComercial=0;
		iYPanelCamposReferenciaComercial++;
	}
	this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
	this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsReferenciaComercial.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsReferenciaComercial.gridy = iYPanelCamposReferenciaComercial;
	this.gridBagConstraintsReferenciaComercial.gridx = iXPanelCamposReferenciaComercial++;
	this.gridBagConstraintsReferenciaComercial.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsReferenciaComercial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposReferenciaComercial.add(this.jPanelid_tipo_valoracionReferenciaComercial, this.gridBagConstraintsReferenciaComercial);



	if(iXPanelCamposReferenciaComercial % 2==0) {
		iXPanelCamposReferenciaComercial=0;
		iYPanelCamposReferenciaComercial++;
	}
	this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
	this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsReferenciaComercial.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsReferenciaComercial.gridy = iYPanelCamposReferenciaComercial;
	this.gridBagConstraintsReferenciaComercial.gridx = iXPanelCamposReferenciaComercial++;
	this.gridBagConstraintsReferenciaComercial.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsReferenciaComercial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposReferenciaComercial.add(this.jPaneldireccionReferenciaComercial, this.gridBagConstraintsReferenciaComercial);



	if(iXPanelCamposReferenciaComercial % 2==0) {
		iXPanelCamposReferenciaComercial=0;
		iYPanelCamposReferenciaComercial++;
	}
	this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
	this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsReferenciaComercial.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsReferenciaComercial.gridy = iYPanelCamposReferenciaComercial;
	this.gridBagConstraintsReferenciaComercial.gridx = iXPanelCamposReferenciaComercial++;
	this.gridBagConstraintsReferenciaComercial.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsReferenciaComercial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposReferenciaComercial.add(this.jPaneltelefonoReferenciaComercial, this.gridBagConstraintsReferenciaComercial);



	if(iXPanelCamposReferenciaComercial % 2==0) {
		iXPanelCamposReferenciaComercial=0;
		iYPanelCamposReferenciaComercial++;
	}
	this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
	this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsReferenciaComercial.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsReferenciaComercial.gridy = iYPanelCamposReferenciaComercial;
	this.gridBagConstraintsReferenciaComercial.gridx = iXPanelCamposReferenciaComercial++;
	this.gridBagConstraintsReferenciaComercial.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsReferenciaComercial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposReferenciaComercial.add(this.jPaneltelefonomovilReferenciaComercial, this.gridBagConstraintsReferenciaComercial);



	if(iXPanelCamposReferenciaComercial % 2==0) {
		iXPanelCamposReferenciaComercial=0;
		iYPanelCamposReferenciaComercial++;
	}
	this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
	this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsReferenciaComercial.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsReferenciaComercial.gridy = iYPanelCamposReferenciaComercial;
	this.gridBagConstraintsReferenciaComercial.gridx = iXPanelCamposReferenciaComercial++;
	this.gridBagConstraintsReferenciaComercial.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsReferenciaComercial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposReferenciaComercial.add(this.jPaneltelefonocodigoareaReferenciaComercial, this.gridBagConstraintsReferenciaComercial);



	if(iXPanelCamposReferenciaComercial % 2==0) {
		iXPanelCamposReferenciaComercial=0;
		iYPanelCamposReferenciaComercial++;
	}
	this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
	this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsReferenciaComercial.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsReferenciaComercial.gridy = iYPanelCamposReferenciaComercial;
	this.gridBagConstraintsReferenciaComercial.gridx = iXPanelCamposReferenciaComercial++;
	this.gridBagConstraintsReferenciaComercial.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsReferenciaComercial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposReferenciaComercial.add(this.jPanelemailReferenciaComercial, this.gridBagConstraintsReferenciaComercial);



	if(iXPanelCamposReferenciaComercial % 2==0) {
		iXPanelCamposReferenciaComercial=0;
		iYPanelCamposReferenciaComercial++;
	}
	this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
	this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsReferenciaComercial.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsReferenciaComercial.gridy = iYPanelCamposReferenciaComercial;
	this.gridBagConstraintsReferenciaComercial.gridx = iXPanelCamposReferenciaComercial++;
	this.gridBagConstraintsReferenciaComercial.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsReferenciaComercial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposReferenciaComercial.add(this.jPanelmontoReferenciaComercial, this.gridBagConstraintsReferenciaComercial);



	if(iXPanelCamposReferenciaComercial % 2==0) {
		iXPanelCamposReferenciaComercial=0;
		iYPanelCamposReferenciaComercial++;
	}
	this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
	this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsReferenciaComercial.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsReferenciaComercial.gridy = iYPanelCamposReferenciaComercial;
	this.gridBagConstraintsReferenciaComercial.gridx = iXPanelCamposReferenciaComercial++;
	this.gridBagConstraintsReferenciaComercial.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsReferenciaComercial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposReferenciaComercial.add(this.jPanelesactivoReferenciaComercial, this.gridBagConstraintsReferenciaComercial);



	if(iXPanelCamposReferenciaComercial % 2==0) {
		iXPanelCamposReferenciaComercial=0;
		iYPanelCamposReferenciaComercial++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
	this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsReferenciaComercial.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsReferenciaComercial.gridy = iYPanelCamposOcultosReferenciaComercial;
	this.gridBagConstraintsReferenciaComercial.gridx = iXPanelCamposOcultosReferenciaComercial++;
	this.gridBagConstraintsReferenciaComercial.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsReferenciaComercial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosReferenciaComercial.add(this.jPanelid_empresaReferenciaComercial, this.gridBagConstraintsReferenciaComercial);



	if(iXPanelCamposOcultosReferenciaComercial % 2==0) {
		iXPanelCamposOcultosReferenciaComercial=0;
		iYPanelCamposOcultosReferenciaComercial++;
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
			
		GridBagLayout gridaBagLayoutAccionesReferenciaComercial= new GridBagLayout();
		this.jPanelAccionesReferenciaComercial.setLayout(gridaBagLayoutAccionesReferenciaComercial);
		
		GridBagLayout gridaBagLayoutAccionesFormularioReferenciaComercial= new GridBagLayout();
		this.jPanelAccionesFormularioReferenciaComercial.setLayout(gridaBagLayoutAccionesFormularioReferenciaComercial);
		
		this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
		this.gridBagConstraintsReferenciaComercial.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsReferenciaComercial.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioReferenciaComercial.add(this.jComboBoxTiposAccionesFormularioReferenciaComercial, this.gridBagConstraintsReferenciaComercial);

		this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
		this.gridBagConstraintsReferenciaComercial.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsReferenciaComercial.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioReferenciaComercial.add(this.jCheckBoxPostAccionNuevoReferenciaComercial, this.gridBagConstraintsReferenciaComercial);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.referenciacomercialSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
			this.gridBagConstraintsReferenciaComercial.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsReferenciaComercial.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioReferenciaComercial.add(this.jCheckBoxPostAccionSinCerrarReferenciaComercial, this.gridBagConstraintsReferenciaComercial);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.referenciacomercialSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.referenciacomercialSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
			this.gridBagConstraintsReferenciaComercial.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsReferenciaComercial.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioReferenciaComercial.add(this.jCheckBoxPostAccionSinMensajeReferenciaComercial, this.gridBagConstraintsReferenciaComercial);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
		this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsReferenciaComercial.gridy = 0;
		this.gridBagConstraintsReferenciaComercial.gridx = iPosXAccion++;
			
		this.jPanelAccionesReferenciaComercial.add(this.jButtonModificarReferenciaComercial, this.gridBagConstraintsReferenciaComercial);							

		this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
		this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsReferenciaComercial.gridy = 0;
		this.gridBagConstraintsReferenciaComercial.gridx =iPosXAccion++;
			
		this.jPanelAccionesReferenciaComercial.add(this.jButtonEliminarReferenciaComercial, this.gridBagConstraintsReferenciaComercial);
		
			
		this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
		this.gridBagConstraintsReferenciaComercial.gridy = 0;		
		this.gridBagConstraintsReferenciaComercial.gridx = iPosXAccion++;
		
		this.jPanelAccionesReferenciaComercial.add(this.jButtonActualizarReferenciaComercial, this.gridBagConstraintsReferenciaComercial);


		this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
		this.gridBagConstraintsReferenciaComercial.gridy = 0;		
		this.gridBagConstraintsReferenciaComercial.gridx = iPosXAccion++;
		
		this.jPanelAccionesReferenciaComercial.add(this.jButtonGuardarCambiosReferenciaComercial, this.gridBagConstraintsReferenciaComercial);	
		
		this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
		this.gridBagConstraintsReferenciaComercial.gridy = 0;		
		this.gridBagConstraintsReferenciaComercial.gridx =iPosXAccion++;
		
		this.jPanelAccionesReferenciaComercial.add(this.jButtonCancelarReferenciaComercial, this.gridBagConstraintsReferenciaComercial);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutReferenciaComercial = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutReferenciaComercial);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.referenciacomercialSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();						
			this.gridBagConstraintsReferenciaComercial.gridy = iGridyPrincipal++;
			this.gridBagConstraintsReferenciaComercial.gridx = 0;		
			//this.gridBagConstraintsReferenciaComercial.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReferenciaComercial.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsReferenciaComercial.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
		this.gridBagConstraintsReferenciaComercial.gridy =iGridyPrincipal++;
		this.gridBagConstraintsReferenciaComercial.gridx =0;
		this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsReferenciaComercial.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosReferenciaComercial, this.gridBagConstraintsReferenciaComercial);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ReferenciaComercialJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleReferenciaComercial = new ReferenciaComercialBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Referencia Comercial DATOS");
			
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
			
	        //this.setTitle("[FOR] - Referencia Comercial DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Referencia Comercial Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ReferenciaComercialModel referenciacomercialModel=new ReferenciaComercialModel(this);
			
			//SI USARA CLASE INTERNA
			//ReferenciaComercialModel.ReferenciaComercialFocusTraversalPolicy referenciacomercialFocusTraversalPolicy = referenciacomercialModel.new ReferenciaComercialFocusTraversalPolicy(this);
			
			//referenciacomercialFocusTraversalPolicy.setreferenciacomercialJInternalFrame(this);
			
			this.setFocusTraversalPolicy(referenciacomercialModel);
			
			
			this.jContentPaneDetalleReferenciaComercial = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleReferenciaComercial = new GridBagLayout();	
			this.jContentPaneDetalleReferenciaComercial.setLayout(gridaBagLayoutDetalleReferenciaComercial);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosReferenciaComercial = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
				this.gridBagConstraintsReferenciaComercial.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsReferenciaComercial.gridx = 0;
					
				
				this.jContentPaneDetalleReferenciaComercial.add(jTtoolBarDetalleReferenciaComercial, gridBagConstraintsReferenciaComercial);								
				
}
			
			this.jScrollPanelDatosEdicionReferenciaComercial=   new JScrollPane(jContentPaneDetalleReferenciaComercial,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionReferenciaComercial.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionReferenciaComercial.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionReferenciaComercial.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralReferenciaComercial=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralReferenciaComercial.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralReferenciaComercial.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralReferenciaComercial.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
			
			
	        this.gridBagConstraintsReferenciaComercial.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsReferenciaComercial.gridx = 0;
	        
			this.jContentPaneDetalleReferenciaComercial.add(jPanelCamposReferenciaComercial, gridBagConstraintsReferenciaComercial);
			
			
			
			
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
						&& referenciacomercialSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.referenciacomercialSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsReferenciaComercial= new GridBagConstraints();
						this.gridBagConstraintsReferenciaComercial.gridy = iGridyRelaciones++;
						this.gridBagConstraintsReferenciaComercial.gridx = 0;
						this.jContentPaneDetalleReferenciaComercial.add(this.jTabbedPaneRelacionesReferenciaComercial, this.gridBagConstraintsReferenciaComercial);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesReferenciaComercial.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosReferenciaComercial.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
					this.gridBagConstraintsReferenciaComercial.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsReferenciaComercial.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsReferenciaComercial.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsReferenciaComercial.gridx = 0;
					
				
					this.jContentPaneDetalleReferenciaComercial.add(jPanelCamposOcultosReferenciaComercial, gridBagConstraintsReferenciaComercial);
				
					this.jPanelCamposOcultosReferenciaComercial.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
			this.gridBagConstraintsReferenciaComercial.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsReferenciaComercial.gridx = 0;
	        this.gridBagConstraintsReferenciaComercial.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleReferenciaComercial.add(this.jPanelAccionesFormularioReferenciaComercial, this.gridBagConstraintsReferenciaComercial);							
			
			
			
			this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
	        this.gridBagConstraintsReferenciaComercial.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsReferenciaComercial.gridx = 0;
	        
			
			this.jContentPaneDetalleReferenciaComercial.add(this.jPanelAccionesReferenciaComercial, this.gridBagConstraintsReferenciaComercial);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionReferenciaComercial);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionReferenciaComercial=   new JScrollPane(this.jPanelCamposReferenciaComercial,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionReferenciaComercial.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionReferenciaComercial.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionReferenciaComercial.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
			this.gridBagConstraintsReferenciaComercial.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsReferenciaComercial.gridx = 0;
			this.gridBagConstraintsReferenciaComercial.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsReferenciaComercial.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsReferenciaComercial.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionReferenciaComercial, this.gridBagConstraintsReferenciaComercial);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
			this.gridBagConstraintsReferenciaComercial.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsReferenciaComercial.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioReferenciaComercial, this.gridBagConstraintsReferenciaComercial);			
			
			this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
			this.gridBagConstraintsReferenciaComercial.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsReferenciaComercial.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesReferenciaComercial, this.gridBagConstraintsReferenciaComercial);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
		this.gridBagConstraintsReferenciaComercial.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsReferenciaComercial.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposReferenciaComercial, this.gridBagConstraintsReferenciaComercial);
			
			
		this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
		this.gridBagConstraintsReferenciaComercial.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsReferenciaComercial.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosReferenciaComercial, this.gridBagConstraintsReferenciaComercial);
		
			
		this.gridBagConstraintsReferenciaComercial = new GridBagConstraints();
		this.gridBagConstraintsReferenciaComercial.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsReferenciaComercial.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesReferenciaComercial, this.gridBagConstraintsReferenciaComercial);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralReferenciaComercial;//jContentPane;
		
		return jScrollPanelDatosEdicionReferenciaComercial;
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
