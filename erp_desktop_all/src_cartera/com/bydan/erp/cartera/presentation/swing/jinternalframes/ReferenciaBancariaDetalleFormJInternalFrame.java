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
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.cartera.util.ReferenciaBancariaConstantesFunciones;

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
public class ReferenciaBancariaDetalleFormJInternalFrame extends ReferenciaBancariaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleReferenciaBancaria;
	
	protected JMenuBar jmenuBarDetalleReferenciaBancaria;
	
	protected JMenu jmenuDetalleReferenciaBancaria;
	protected JMenu jmenuDetalleArchivoReferenciaBancaria;
	protected JMenu jmenuDetalleAccionesReferenciaBancaria;
	protected JMenu jmenuDetalleDatosReferenciaBancaria;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleReferenciaBancaria = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutReferenciaBancaria;	
	protected GridBagConstraints gridBagConstraintsReferenciaBancaria;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ReferenciaBancariaBeanSwingJInternalFrameAdditional jInternalFrameDetalleReferenciaBancaria;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected BancoBeanSwingJInternalFrame bancoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_banco="";

	protected TipoProduBancoBeanSwingJInternalFrame tipoprodubancoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoprodubanco="";

	protected TipoCuentaBancoBeanSwingJInternalFrame tipocuentabancoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocuentabanco="";

	protected TipoValoracionBeanSwingJInternalFrame tipovaloracionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipovaloracion="";
	
	public ReferenciaBancariaSessionBean referenciabancariaSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public BancoSessionBean bancoSessionBean;
	public TipoProduBancoSessionBean tipoprodubancoSessionBean;
	public TipoCuentaBancoSessionBean tipocuentabancoSessionBean;
	public TipoValoracionSessionBean tipovaloracionSessionBean;	
	
	public ReferenciaBancariaLogic referenciabancariaLogic;
	
	public JScrollPane jScrollPanelDatosReferenciaBancaria;
	public JScrollPane jScrollPanelDatosEdicionReferenciaBancaria;
	public JScrollPane jScrollPanelDatosGeneralReferenciaBancaria;
	
	protected JPanel jPanelCamposReferenciaBancaria;    
	protected JPanel jPanelCamposOcultosReferenciaBancaria;    	
	protected JPanel jPanelAccionesReferenciaBancaria;
	protected JPanel jPanelAccionesFormularioReferenciaBancaria;
    
	
	
	protected Integer iXPanelCamposReferenciaBancaria=0;
	protected Integer iYPanelCamposReferenciaBancaria=0;
	
	protected Integer iXPanelCamposOcultosReferenciaBancaria=0;
	protected Integer iYPanelCamposOcultosReferenciaBancaria=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoReferenciaBancaria;
	public JButton jButtonModificarReferenciaBancaria;
	public JButton jButtonActualizarReferenciaBancaria;
    public JButton jButtonEliminarReferenciaBancaria;
	public JButton jButtonCancelarReferenciaBancaria;
    public JButton jButtonGuardarCambiosReferenciaBancaria;
	public JButton jButtonGuardarCambiosTablaReferenciaBancaria;
	protected JButton jButtonCerrarReferenciaBancaria;
	
	
	protected JButton jButtonProcesarInformacionReferenciaBancaria;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoReferenciaBancaria;
	protected JCheckBox jCheckBoxPostAccionSinCerrarReferenciaBancaria;
	protected JCheckBox jCheckBoxPostAccionSinMensajeReferenciaBancaria;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarReferenciaBancaria;
	protected JButton jButtonModificarToolBarReferenciaBancaria;
	protected JButton jButtonActualizarToolBarReferenciaBancaria;
    protected JButton jButtonEliminarToolBarReferenciaBancaria;
	protected JButton jButtonCancelarToolBarReferenciaBancaria;
    protected JButton jButtonGuardarCambiosToolBarReferenciaBancaria;
	protected JButton jButtonGuardarCambiosTablaToolBarReferenciaBancaria;
	protected JButton jButtonMostrarOcultarTablaToolBarReferenciaBancaria;
	protected JButton jButtonCerrarToolBarReferenciaBancaria;
	
	protected JButton jButtonProcesarInformacionToolBarReferenciaBancaria;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoReferenciaBancaria;
	protected JMenuItem jMenuItemModificarReferenciaBancaria;
	protected JMenuItem jMenuItemActualizarReferenciaBancaria;
    protected JMenuItem jMenuItemEliminarReferenciaBancaria;
	protected JMenuItem jMenuItemCancelarReferenciaBancaria;
    protected JMenuItem jMenuItemGuardarCambiosReferenciaBancaria;
	protected JMenuItem jMenuItemGuardarCambiosTablaReferenciaBancaria;
	protected JMenuItem jMenuItemCerrarReferenciaBancaria;
	protected JMenuItem jMenuItemDetalleCerrarReferenciaBancaria;
	protected JMenuItem jMenuItemDetalleMostarOcultarReferenciaBancaria;
	
	protected JMenuItem jMenuItemProcesarInformacionReferenciaBancaria;
	protected JMenuItem jMenuItemNuevoGuardarCambiosReferenciaBancaria;
	protected JMenuItem jMenuItemMostrarOcultarReferenciaBancaria;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesReferenciaBancaria;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesReferenciaBancaria;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesReferenciaBancaria;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioReferenciaBancaria;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidReferenciaBancaria;
	public JLabel jLabelIdReferenciaBancaria;
	public JLabel jLabelidReferenciaBancaria;
	public JButton jButtonidReferenciaBancariaBusqueda= new JButtonMe();

	public JPanel jPanelnumero_cuenta_tarjetaReferenciaBancaria;
	public JLabel jLabelnumero_cuenta_tarjetaReferenciaBancaria;
	public JTextField jTextFieldnumero_cuenta_tarjetaReferenciaBancaria;
	public JButton jButtonnumero_cuenta_tarjetaReferenciaBancariaBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emisionReferenciaBancaria;
	public JLabel jLabelfecha_emisionReferenciaBancaria;
	//public JFormattedTextField jDateChooserfecha_emisionReferenciaBancaria;

	public JDateChooser jDateChooserfecha_emisionReferenciaBancaria;
	public JButton jButtonfecha_emisionReferenciaBancariaBusqueda= new JButtonMe();

	public JPanel jPanelfecha_vencimientoReferenciaBancaria;
	public JLabel jLabelfecha_vencimientoReferenciaBancaria;
	//public JFormattedTextField jDateChooserfecha_vencimientoReferenciaBancaria;

	public JDateChooser jDateChooserfecha_vencimientoReferenciaBancaria;
	public JButton jButtonfecha_vencimientoReferenciaBancariaBusqueda= new JButtonMe();

	public JPanel jPanelcupoReferenciaBancaria;
	public JLabel jLabelcupoReferenciaBancaria;
	public JTextField jTextFieldcupoReferenciaBancaria;
	public JButton jButtoncupoReferenciaBancariaBusqueda= new JButtonMe();

	public JPanel jPaneltiene_creditoReferenciaBancaria;
	public JLabel jLabeltiene_creditoReferenciaBancaria;
	public JCheckBox jCheckBoxtiene_creditoReferenciaBancaria;
	public JButton jButtontiene_creditoReferenciaBancariaBusqueda= new JButtonMe();

	public JPanel jPanelnumero_creditosReferenciaBancaria;
	public JLabel jLabelnumero_creditosReferenciaBancaria;
	public JTextField jTextFieldnumero_creditosReferenciaBancaria;
	public JButton jButtonnumero_creditosReferenciaBancariaBusqueda= new JButtonMe();

	public JPanel jPaneltiene_protestosReferenciaBancaria;
	public JLabel jLabeltiene_protestosReferenciaBancaria;
	public JCheckBox jCheckBoxtiene_protestosReferenciaBancaria;
	public JButton jButtontiene_protestosReferenciaBancariaBusqueda= new JButtonMe();

	public JPanel jPanelnumero_protestosReferenciaBancaria;
	public JLabel jLabelnumero_protestosReferenciaBancaria;
	public JTextField jTextFieldnumero_protestosReferenciaBancaria;
	public JButton jButtonnumero_protestosReferenciaBancariaBusqueda= new JButtonMe();

	public JPanel jPanelsaldos_promediosReferenciaBancaria;
	public JLabel jLabelsaldos_promediosReferenciaBancaria;
	public JTextField jTextFieldsaldos_promediosReferenciaBancaria;
	public JButton jButtonsaldos_promediosReferenciaBancariaBusqueda= new JButtonMe();

	public JPanel jPanelpropietario_cuentaReferenciaBancaria;
	public JLabel jLabelpropietario_cuentaReferenciaBancaria;
	public JTextField jTextFieldpropietario_cuentaReferenciaBancaria;
	public JButton jButtonpropietario_cuentaReferenciaBancariaBusqueda= new JButtonMe();

	public JPanel jPanelesactivoReferenciaBancaria;
	public JLabel jLabelesactivoReferenciaBancaria;
	public JCheckBox jCheckBoxesactivoReferenciaBancaria;
	public JButton jButtonesactivoReferenciaBancariaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaReferenciaBancaria;
	public JLabel jLabelid_empresaReferenciaBancaria;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaReferenciaBancaria;
	public JButton jButtonid_empresaReferenciaBancaria= new JButtonMe();
	public JButton jButtonid_empresaReferenciaBancariaUpdate= new JButtonMe();
	public JButton jButtonid_empresaReferenciaBancariaBusqueda= new JButtonMe();

	public JPanel jPanelidclienteReferenciaBancaria;
	public JLabel jLabelidclienteReferenciaBancaria;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxidclienteReferenciaBancaria;
	public JButton jButtonidclienteReferenciaBancaria= new JButtonMe();
	public JButton jButtonidclienteReferenciaBancariaUpdate= new JButtonMe();
	public JButton jButtonidclienteReferenciaBancariaBusqueda= new JButtonMe();

	public JPanel jPanelidvalorclientebancoReferenciaBancaria;
	public JLabel jLabelidvalorclientebancoReferenciaBancaria;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxidvalorclientebancoReferenciaBancaria;
	public JButton jButtonidvalorclientebancoReferenciaBancaria= new JButtonMe();
	public JButton jButtonidvalorclientebancoReferenciaBancariaUpdate= new JButtonMe();
	public JButton jButtonidvalorclientebancoReferenciaBancariaBusqueda= new JButtonMe();

	public JPanel jPanelidvalorclienteproductobancoReferenciaBancaria;
	public JLabel jLabelidvalorclienteproductobancoReferenciaBancaria;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxidvalorclienteproductobancoReferenciaBancaria;
	public JButton jButtonidvalorclienteproductobancoReferenciaBancaria= new JButtonMe();
	public JButton jButtonidvalorclienteproductobancoReferenciaBancariaUpdate= new JButtonMe();
	public JButton jButtonidvalorclienteproductobancoReferenciaBancariaBusqueda= new JButtonMe();

	public JPanel jPanelidvalorclientecuentabancoReferenciaBancaria;
	public JLabel jLabelidvalorclientecuentabancoReferenciaBancaria;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxidvalorclientecuentabancoReferenciaBancaria;
	public JButton jButtonidvalorclientecuentabancoReferenciaBancaria= new JButtonMe();
	public JButton jButtonidvalorclientecuentabancoReferenciaBancariaUpdate= new JButtonMe();
	public JButton jButtonidvalorclientecuentabancoReferenciaBancariaBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_valoracionReferenciaBancaria;
	public JLabel jLabelid_tipo_valoracionReferenciaBancaria;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_valoracionReferenciaBancaria;
	public JButton jButtonid_tipo_valoracionReferenciaBancaria= new JButtonMe();
	public JButton jButtonid_tipo_valoracionReferenciaBancariaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_valoracionReferenciaBancariaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesReferenciaBancaria;
	
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
		
	public int iWidthFormulario=450;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightFormulario=1122;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ReferenciaBancariaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposReferenciaBancaria=new JPanel();
				this.jPanelAccionesFormularioReferenciaBancaria=new JPanel();
				this.jmenuBarDetalleReferenciaBancaria=new JMenuBar();
				this.jTtoolBarDetalleReferenciaBancaria=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ReferenciaBancariaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ReferenciaBancaria No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ReferenciaBancariaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ReferenciaBancaria No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ReferenciaBancariaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ReferenciaBancaria No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ReferenciaBancariaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ReferenciaBancaria No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ReferenciaBancariaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ReferenciaBancaria No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarReferenciaBancaria() {
		return this.jButtonActualizarToolBarReferenciaBancaria;
	}
	
	public JButton getjButtonEliminarToolBarReferenciaBancaria() {
		return this.jButtonEliminarToolBarReferenciaBancaria;
	}
	
	public JButton getjButtonCancelarToolBarReferenciaBancaria() {
		return this.jButtonCancelarToolBarReferenciaBancaria;
	}		
	
	public JButton getjButtonProcesarInformacionReferenciaBancaria() {
		return this.jButtonProcesarInformacionReferenciaBancaria;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionReferenciaBancaria)	{
		this.jButtonProcesarInformacionReferenciaBancaria = jButtonProcesarInformacionReferenciaBancaria;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesReferenciaBancaria() {
		return this.jComboBoxTiposAccionesReferenciaBancaria;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesReferenciaBancaria(
			JComboBox jComboBoxTiposRelacionesReferenciaBancaria) {
		this.jComboBoxTiposRelacionesReferenciaBancaria = jComboBoxTiposRelacionesReferenciaBancaria;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesReferenciaBancaria(
			JComboBox jComboBoxTiposAccionesReferenciaBancaria) {
		this.jComboBoxTiposAccionesReferenciaBancaria = jComboBoxTiposAccionesReferenciaBancaria;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioReferenciaBancaria() {
		return this.jComboBoxTiposAccionesFormularioReferenciaBancaria;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioReferenciaBancaria(
			JComboBox jComboBoxTiposAccionesFormularioReferenciaBancaria) {
		this.jComboBoxTiposAccionesFormularioReferenciaBancaria = jComboBoxTiposAccionesFormularioReferenciaBancaria;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.referenciabancariaSessionBean=new ReferenciaBancariaSessionBean();
		
		this.referenciabancariaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.referenciabancariaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.referenciabancariaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ReferenciaBancariaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ReferenciaBancariaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ReferenciaBancariaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Referencia Bancaria MANTENIMIENTO"));
		
		
		if(iWidth > 1850) {
			iWidth=1850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.referenciabancariaSessionBean.getEsGuardarRelacionado()) {
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
	
		ReferenciaBancariaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleReferenciaBancaria= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarReferenciaBancaria=new JButtonMe();
				this.jButtonModificarToolBarReferenciaBancaria=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarReferenciaBancaria=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarReferenciaBancaria,this.jTtoolBarDetalleReferenciaBancaria,
							"actualizar","actualizar","Actualizar"+" "+ReferenciaBancariaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarReferenciaBancaria=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarReferenciaBancaria,this.jTtoolBarDetalleReferenciaBancaria,
							"eliminar","eliminar","Eliminar"+" "+ReferenciaBancariaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarReferenciaBancaria=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarReferenciaBancaria,this.jTtoolBarDetalleReferenciaBancaria,
							"cancelar","cancelar","Cancelar"+" "+ReferenciaBancariaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarReferenciaBancaria=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarReferenciaBancaria,this.jTtoolBarDetalleReferenciaBancaria,
							"guardarcambios","guardarcambios","Guardar"+" "+ReferenciaBancariaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarReferenciaBancaria,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarReferenciaBancaria,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarReferenciaBancaria,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleReferenciaBancaria=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleReferenciaBancaria=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoReferenciaBancaria=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesReferenciaBancaria=new JMenuMe("Acciones");
		this.jmenuDetalleDatosReferenciaBancaria=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoReferenciaBancaria= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoReferenciaBancaria.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoReferenciaBancaria,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoReferenciaBancaria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarReferenciaBancaria= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarReferenciaBancaria.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarReferenciaBancaria,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarReferenciaBancaria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarReferenciaBancaria= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarReferenciaBancaria.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarReferenciaBancaria,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarReferenciaBancaria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarReferenciaBancaria= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarReferenciaBancaria.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarReferenciaBancaria,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarReferenciaBancaria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarReferenciaBancaria= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarReferenciaBancaria.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarReferenciaBancaria,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarReferenciaBancaria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosReferenciaBancaria= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosReferenciaBancaria.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosReferenciaBancaria,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosReferenciaBancaria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarReferenciaBancaria= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarReferenciaBancaria.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarReferenciaBancaria,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarReferenciaBancaria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarReferenciaBancaria= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarReferenciaBancaria.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarReferenciaBancaria,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarReferenciaBancaria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarReferenciaBancaria= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarReferenciaBancaria.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarReferenciaBancaria,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarReferenciaBancaria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarReferenciaBancaria= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarReferenciaBancaria.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarReferenciaBancaria,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarReferenciaBancaria, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoReferenciaBancaria.add(this.jMenuItemDetalleCerrarReferenciaBancaria);
		
		this.jmenuDetalleAccionesReferenciaBancaria.add(this.jMenuItemActualizarReferenciaBancaria);
		this.jmenuDetalleAccionesReferenciaBancaria.add(this.jMenuItemEliminarReferenciaBancaria);
		this.jmenuDetalleAccionesReferenciaBancaria.add(this.jMenuItemCancelarReferenciaBancaria);		
		
		//this.jmenuDetalleDatosReferenciaBancaria.add(this.jMenuItemDetalleAbrirOrderByReferenciaBancaria);				
		this.jmenuDetalleDatosReferenciaBancaria.add(this.jMenuItemDetalleMostarOcultarReferenciaBancaria);				
				
		//this.jmenuDetalleAccionesReferenciaBancaria.add(this.jMenuItemGuardarCambiosReferenciaBancaria);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoReferenciaBancaria, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesReferenciaBancaria, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosReferenciaBancaria, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleReferenciaBancaria.add(this.jmenuDetalleArchivoReferenciaBancaria);		
		this.jmenuBarDetalleReferenciaBancaria.add(this.jmenuDetalleAccionesReferenciaBancaria);		
		this.jmenuBarDetalleReferenciaBancaria.add(this.jmenuDetalleDatosReferenciaBancaria);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleReferenciaBancaria);				
	}
	
	
	public void inicializarElementosCamposReferenciaBancaria() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdReferenciaBancaria = new JLabelMe();
		jLabelIdReferenciaBancaria.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdReferenciaBancaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdReferenciaBancaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdReferenciaBancaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdReferenciaBancaria,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidReferenciaBancaria = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidReferenciaBancaria.setToolTipText(ReferenciaBancariaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutReferenciaBancaria= new GridBagLayout();

		this.jPanelidReferenciaBancaria.setLayout(this.gridaBagLayoutReferenciaBancaria);

		jLabelidReferenciaBancaria = new JLabel();
		jLabelidReferenciaBancaria.setText("Id");

		jLabelidReferenciaBancaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidReferenciaBancaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidReferenciaBancaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnumero_cuenta_tarjetaReferenciaBancaria = new JLabelMe();
		this.jLabelnumero_cuenta_tarjetaReferenciaBancaria.setText(""+ReferenciaBancariaConstantesFunciones.LABEL_NUMEROCUENTATARJETA+" : *");
		this.jLabelnumero_cuenta_tarjetaReferenciaBancaria.setToolTipText("Numero Cuenta/tarjeta");
		this.jLabelnumero_cuenta_tarjetaReferenciaBancaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnumero_cuenta_tarjetaReferenciaBancaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnumero_cuenta_tarjetaReferenciaBancaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_cuenta_tarjetaReferenciaBancaria,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_cuenta_tarjetaReferenciaBancaria=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_cuenta_tarjetaReferenciaBancaria.setToolTipText(ReferenciaBancariaConstantesFunciones.LABEL_NUMEROCUENTATARJETA);
		this.gridaBagLayoutReferenciaBancaria = new GridBagLayout();
		this.jPanelnumero_cuenta_tarjetaReferenciaBancaria.setLayout(this.gridaBagLayoutReferenciaBancaria);


		jTextFieldnumero_cuenta_tarjetaReferenciaBancaria= new JTextFieldMe();

		jTextFieldnumero_cuenta_tarjetaReferenciaBancaria.setEnabled(false);
		jTextFieldnumero_cuenta_tarjetaReferenciaBancaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_cuenta_tarjetaReferenciaBancaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_cuenta_tarjetaReferenciaBancaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_cuenta_tarjetaReferenciaBancaria,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_cuenta_tarjetaReferenciaBancariaBusqueda= new JButtonMe();
		this.jButtonnumero_cuenta_tarjetaReferenciaBancariaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_cuenta_tarjetaReferenciaBancariaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_cuenta_tarjetaReferenciaBancariaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_cuenta_tarjetaReferenciaBancariaBusqueda.setText("U");
		this.jButtonnumero_cuenta_tarjetaReferenciaBancariaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_cuenta_tarjetaReferenciaBancariaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_cuenta_tarjetaReferenciaBancariaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_cuenta_tarjetaReferenciaBancaria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_cuenta_tarjetaReferenciaBancaria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_cuenta_tarjetaReferenciaBancariaBusqueda"));

		if(this.referenciabancariaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_cuenta_tarjetaReferenciaBancariaBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emisionReferenciaBancaria = new JLabelMe();
		this.jLabelfecha_emisionReferenciaBancaria.setText(""+ReferenciaBancariaConstantesFunciones.LABEL_FECHAEMISION+" : *");
		this.jLabelfecha_emisionReferenciaBancaria.setToolTipText("Fecha Emision");
		this.jLabelfecha_emisionReferenciaBancaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionReferenciaBancaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionReferenciaBancaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emisionReferenciaBancaria,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emisionReferenciaBancaria=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emisionReferenciaBancaria.setToolTipText(ReferenciaBancariaConstantesFunciones.LABEL_FECHAEMISION);
		this.gridaBagLayoutReferenciaBancaria = new GridBagLayout();
		this.jPanelfecha_emisionReferenciaBancaria.setLayout(this.gridaBagLayoutReferenciaBancaria);


		//jFormattedTextFieldfecha_emisionReferenciaBancaria= new JFormattedTextFieldMe();

		jDateChooserfecha_emisionReferenciaBancaria= new JDateChooser();
		jDateChooserfecha_emisionReferenciaBancaria.setEnabled(false);
		jDateChooserfecha_emisionReferenciaBancaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionReferenciaBancaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionReferenciaBancaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emisionReferenciaBancaria,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emisionReferenciaBancaria.setDate(new Date());
		jDateChooserfecha_emisionReferenciaBancaria.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emisionReferenciaBancaria.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emisionReferenciaBancariaBusqueda= new JButtonMe();
		this.jButtonfecha_emisionReferenciaBancariaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionReferenciaBancariaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionReferenciaBancariaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emisionReferenciaBancariaBusqueda.setText("U");
		this.jButtonfecha_emisionReferenciaBancariaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emisionReferenciaBancariaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emisionReferenciaBancariaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emisionReferenciaBancaria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emisionReferenciaBancaria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emisionReferenciaBancariaBusqueda"));

		if(this.referenciabancariaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emisionReferenciaBancariaBusqueda.setVisible(false);		}


					
		this.jLabelfecha_vencimientoReferenciaBancaria = new JLabelMe();
		this.jLabelfecha_vencimientoReferenciaBancaria.setText(""+ReferenciaBancariaConstantesFunciones.LABEL_FECHAVENCIMIENTO+" : *");
		this.jLabelfecha_vencimientoReferenciaBancaria.setToolTipText("Fecha Vencimiento");
		this.jLabelfecha_vencimientoReferenciaBancaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_vencimientoReferenciaBancaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_vencimientoReferenciaBancaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_vencimientoReferenciaBancaria,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_vencimientoReferenciaBancaria=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_vencimientoReferenciaBancaria.setToolTipText(ReferenciaBancariaConstantesFunciones.LABEL_FECHAVENCIMIENTO);
		this.gridaBagLayoutReferenciaBancaria = new GridBagLayout();
		this.jPanelfecha_vencimientoReferenciaBancaria.setLayout(this.gridaBagLayoutReferenciaBancaria);


		//jFormattedTextFieldfecha_vencimientoReferenciaBancaria= new JFormattedTextFieldMe();

		jDateChooserfecha_vencimientoReferenciaBancaria= new JDateChooser();
		jDateChooserfecha_vencimientoReferenciaBancaria.setEnabled(false);
		jDateChooserfecha_vencimientoReferenciaBancaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_vencimientoReferenciaBancaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_vencimientoReferenciaBancaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_vencimientoReferenciaBancaria,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_vencimientoReferenciaBancaria.setDate(new Date());
		jDateChooserfecha_vencimientoReferenciaBancaria.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_vencimientoReferenciaBancaria.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_vencimientoReferenciaBancariaBusqueda= new JButtonMe();
		this.jButtonfecha_vencimientoReferenciaBancariaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_vencimientoReferenciaBancariaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_vencimientoReferenciaBancariaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_vencimientoReferenciaBancariaBusqueda.setText("U");
		this.jButtonfecha_vencimientoReferenciaBancariaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_vencimientoReferenciaBancariaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_vencimientoReferenciaBancariaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_vencimientoReferenciaBancaria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_vencimientoReferenciaBancaria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_vencimientoReferenciaBancariaBusqueda"));

		if(this.referenciabancariaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_vencimientoReferenciaBancariaBusqueda.setVisible(false);		}


					
		this.jLabelcupoReferenciaBancaria = new JLabelMe();
		this.jLabelcupoReferenciaBancaria.setText(""+ReferenciaBancariaConstantesFunciones.LABEL_CUPO+" : *");
		this.jLabelcupoReferenciaBancaria.setToolTipText("Cupo");
		this.jLabelcupoReferenciaBancaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcupoReferenciaBancaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcupoReferenciaBancaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcupoReferenciaBancaria,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcupoReferenciaBancaria=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcupoReferenciaBancaria.setToolTipText(ReferenciaBancariaConstantesFunciones.LABEL_CUPO);
		this.gridaBagLayoutReferenciaBancaria = new GridBagLayout();
		this.jPanelcupoReferenciaBancaria.setLayout(this.gridaBagLayoutReferenciaBancaria);


		jTextFieldcupoReferenciaBancaria= new JTextFieldMe();
		jTextFieldcupoReferenciaBancaria.setEnabled(false);
		jTextFieldcupoReferenciaBancaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcupoReferenciaBancaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcupoReferenciaBancaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcupoReferenciaBancaria,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcupoReferenciaBancaria.setText("0.0");

		this.jButtoncupoReferenciaBancariaBusqueda= new JButtonMe();
		this.jButtoncupoReferenciaBancariaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncupoReferenciaBancariaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncupoReferenciaBancariaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncupoReferenciaBancariaBusqueda.setText("U");
		this.jButtoncupoReferenciaBancariaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncupoReferenciaBancariaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncupoReferenciaBancariaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcupoReferenciaBancaria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcupoReferenciaBancaria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cupoReferenciaBancariaBusqueda"));

		if(this.referenciabancariaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncupoReferenciaBancariaBusqueda.setVisible(false);		}


					
		this.jLabeltiene_creditoReferenciaBancaria = new JLabelMe();
		this.jLabeltiene_creditoReferenciaBancaria.setText(""+ReferenciaBancariaConstantesFunciones.LABEL_TIENECREDITO+" : *");
		this.jLabeltiene_creditoReferenciaBancaria.setToolTipText("Tiene Credito");
		this.jLabeltiene_creditoReferenciaBancaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltiene_creditoReferenciaBancaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltiene_creditoReferenciaBancaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltiene_creditoReferenciaBancaria,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltiene_creditoReferenciaBancaria=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltiene_creditoReferenciaBancaria.setToolTipText(ReferenciaBancariaConstantesFunciones.LABEL_TIENECREDITO);
		this.gridaBagLayoutReferenciaBancaria = new GridBagLayout();
		this.jPaneltiene_creditoReferenciaBancaria.setLayout(this.gridaBagLayoutReferenciaBancaria);


		jCheckBoxtiene_creditoReferenciaBancaria= new JCheckBoxMe();
		jCheckBoxtiene_creditoReferenciaBancaria.setEnabled(false);

		jCheckBoxtiene_creditoReferenciaBancaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxtiene_creditoReferenciaBancaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxtiene_creditoReferenciaBancaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxtiene_creditoReferenciaBancaria,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtontiene_creditoReferenciaBancariaBusqueda= new JButtonMe();
		this.jButtontiene_creditoReferenciaBancariaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontiene_creditoReferenciaBancariaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontiene_creditoReferenciaBancariaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontiene_creditoReferenciaBancariaBusqueda.setText("U");
		this.jButtontiene_creditoReferenciaBancariaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontiene_creditoReferenciaBancariaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontiene_creditoReferenciaBancariaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxtiene_creditoReferenciaBancaria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxtiene_creditoReferenciaBancaria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"tiene_creditoReferenciaBancariaBusqueda"));

		if(this.referenciabancariaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontiene_creditoReferenciaBancariaBusqueda.setVisible(false);		}


					
		this.jLabelnumero_creditosReferenciaBancaria = new JLabelMe();
		this.jLabelnumero_creditosReferenciaBancaria.setText(""+ReferenciaBancariaConstantesFunciones.LABEL_NUMEROCREDITOS+" : *");
		this.jLabelnumero_creditosReferenciaBancaria.setToolTipText("Numero Creditos");
		this.jLabelnumero_creditosReferenciaBancaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_creditosReferenciaBancaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_creditosReferenciaBancaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_creditosReferenciaBancaria,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_creditosReferenciaBancaria=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_creditosReferenciaBancaria.setToolTipText(ReferenciaBancariaConstantesFunciones.LABEL_NUMEROCREDITOS);
		this.gridaBagLayoutReferenciaBancaria = new GridBagLayout();
		this.jPanelnumero_creditosReferenciaBancaria.setLayout(this.gridaBagLayoutReferenciaBancaria);


		jTextFieldnumero_creditosReferenciaBancaria= new JTextFieldMe();
		jTextFieldnumero_creditosReferenciaBancaria.setEnabled(false);
		jTextFieldnumero_creditosReferenciaBancaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_creditosReferenciaBancaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_creditosReferenciaBancaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_creditosReferenciaBancaria,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_creditosReferenciaBancaria.setText("0");

		this.jButtonnumero_creditosReferenciaBancariaBusqueda= new JButtonMe();
		this.jButtonnumero_creditosReferenciaBancariaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_creditosReferenciaBancariaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_creditosReferenciaBancariaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_creditosReferenciaBancariaBusqueda.setText("U");
		this.jButtonnumero_creditosReferenciaBancariaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_creditosReferenciaBancariaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_creditosReferenciaBancariaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_creditosReferenciaBancaria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_creditosReferenciaBancaria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_creditosReferenciaBancariaBusqueda"));

		if(this.referenciabancariaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_creditosReferenciaBancariaBusqueda.setVisible(false);		}


					
		this.jLabeltiene_protestosReferenciaBancaria = new JLabelMe();
		this.jLabeltiene_protestosReferenciaBancaria.setText(""+ReferenciaBancariaConstantesFunciones.LABEL_TIENEPROTESTOS+" : *");
		this.jLabeltiene_protestosReferenciaBancaria.setToolTipText("Tiene Protestos");
		this.jLabeltiene_protestosReferenciaBancaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltiene_protestosReferenciaBancaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltiene_protestosReferenciaBancaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeltiene_protestosReferenciaBancaria,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltiene_protestosReferenciaBancaria=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltiene_protestosReferenciaBancaria.setToolTipText(ReferenciaBancariaConstantesFunciones.LABEL_TIENEPROTESTOS);
		this.gridaBagLayoutReferenciaBancaria = new GridBagLayout();
		this.jPaneltiene_protestosReferenciaBancaria.setLayout(this.gridaBagLayoutReferenciaBancaria);


		jCheckBoxtiene_protestosReferenciaBancaria= new JCheckBoxMe();
		jCheckBoxtiene_protestosReferenciaBancaria.setEnabled(false);

		jCheckBoxtiene_protestosReferenciaBancaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxtiene_protestosReferenciaBancaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxtiene_protestosReferenciaBancaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxtiene_protestosReferenciaBancaria,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtontiene_protestosReferenciaBancariaBusqueda= new JButtonMe();
		this.jButtontiene_protestosReferenciaBancariaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontiene_protestosReferenciaBancariaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontiene_protestosReferenciaBancariaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontiene_protestosReferenciaBancariaBusqueda.setText("U");
		this.jButtontiene_protestosReferenciaBancariaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontiene_protestosReferenciaBancariaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontiene_protestosReferenciaBancariaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxtiene_protestosReferenciaBancaria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxtiene_protestosReferenciaBancaria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"tiene_protestosReferenciaBancariaBusqueda"));

		if(this.referenciabancariaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontiene_protestosReferenciaBancariaBusqueda.setVisible(false);		}


					
		this.jLabelnumero_protestosReferenciaBancaria = new JLabelMe();
		this.jLabelnumero_protestosReferenciaBancaria.setText(""+ReferenciaBancariaConstantesFunciones.LABEL_NUMEROPROTESTOS+" : *");
		this.jLabelnumero_protestosReferenciaBancaria.setToolTipText("Numero Protestos");
		this.jLabelnumero_protestosReferenciaBancaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_protestosReferenciaBancaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_protestosReferenciaBancaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_protestosReferenciaBancaria,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_protestosReferenciaBancaria=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_protestosReferenciaBancaria.setToolTipText(ReferenciaBancariaConstantesFunciones.LABEL_NUMEROPROTESTOS);
		this.gridaBagLayoutReferenciaBancaria = new GridBagLayout();
		this.jPanelnumero_protestosReferenciaBancaria.setLayout(this.gridaBagLayoutReferenciaBancaria);


		jTextFieldnumero_protestosReferenciaBancaria= new JTextFieldMe();
		jTextFieldnumero_protestosReferenciaBancaria.setEnabled(false);
		jTextFieldnumero_protestosReferenciaBancaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_protestosReferenciaBancaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_protestosReferenciaBancaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_protestosReferenciaBancaria,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_protestosReferenciaBancaria.setText("0");

		this.jButtonnumero_protestosReferenciaBancariaBusqueda= new JButtonMe();
		this.jButtonnumero_protestosReferenciaBancariaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_protestosReferenciaBancariaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_protestosReferenciaBancariaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_protestosReferenciaBancariaBusqueda.setText("U");
		this.jButtonnumero_protestosReferenciaBancariaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_protestosReferenciaBancariaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_protestosReferenciaBancariaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_protestosReferenciaBancaria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_protestosReferenciaBancaria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_protestosReferenciaBancariaBusqueda"));

		if(this.referenciabancariaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_protestosReferenciaBancariaBusqueda.setVisible(false);		}


					
		this.jLabelsaldos_promediosReferenciaBancaria = new JLabelMe();
		this.jLabelsaldos_promediosReferenciaBancaria.setText(""+ReferenciaBancariaConstantesFunciones.LABEL_SALDOSPROMEDIOS+" : *");
		this.jLabelsaldos_promediosReferenciaBancaria.setToolTipText("Saldos Promedios");
		this.jLabelsaldos_promediosReferenciaBancaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelsaldos_promediosReferenciaBancaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelsaldos_promediosReferenciaBancaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelsaldos_promediosReferenciaBancaria,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsaldos_promediosReferenciaBancaria=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsaldos_promediosReferenciaBancaria.setToolTipText(ReferenciaBancariaConstantesFunciones.LABEL_SALDOSPROMEDIOS);
		this.gridaBagLayoutReferenciaBancaria = new GridBagLayout();
		this.jPanelsaldos_promediosReferenciaBancaria.setLayout(this.gridaBagLayoutReferenciaBancaria);


		jTextFieldsaldos_promediosReferenciaBancaria= new JTextFieldMe();

		jTextFieldsaldos_promediosReferenciaBancaria.setEnabled(false);
		jTextFieldsaldos_promediosReferenciaBancaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsaldos_promediosReferenciaBancaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsaldos_promediosReferenciaBancaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsaldos_promediosReferenciaBancaria,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonsaldos_promediosReferenciaBancariaBusqueda= new JButtonMe();
		this.jButtonsaldos_promediosReferenciaBancariaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsaldos_promediosReferenciaBancariaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsaldos_promediosReferenciaBancariaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsaldos_promediosReferenciaBancariaBusqueda.setText("U");
		this.jButtonsaldos_promediosReferenciaBancariaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsaldos_promediosReferenciaBancariaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsaldos_promediosReferenciaBancariaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsaldos_promediosReferenciaBancaria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsaldos_promediosReferenciaBancaria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"saldos_promediosReferenciaBancariaBusqueda"));

		if(this.referenciabancariaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsaldos_promediosReferenciaBancariaBusqueda.setVisible(false);		}


					
		this.jLabelpropietario_cuentaReferenciaBancaria = new JLabelMe();
		this.jLabelpropietario_cuentaReferenciaBancaria.setText(""+ReferenciaBancariaConstantesFunciones.LABEL_PROPIETARIOCUENTA+" : *");
		this.jLabelpropietario_cuentaReferenciaBancaria.setToolTipText("Propietario Cuenta");
		this.jLabelpropietario_cuentaReferenciaBancaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelpropietario_cuentaReferenciaBancaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelpropietario_cuentaReferenciaBancaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelpropietario_cuentaReferenciaBancaria,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelpropietario_cuentaReferenciaBancaria=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelpropietario_cuentaReferenciaBancaria.setToolTipText(ReferenciaBancariaConstantesFunciones.LABEL_PROPIETARIOCUENTA);
		this.gridaBagLayoutReferenciaBancaria = new GridBagLayout();
		this.jPanelpropietario_cuentaReferenciaBancaria.setLayout(this.gridaBagLayoutReferenciaBancaria);


		jTextFieldpropietario_cuentaReferenciaBancaria= new JTextFieldMe();

		jTextFieldpropietario_cuentaReferenciaBancaria.setEnabled(false);
		jTextFieldpropietario_cuentaReferenciaBancaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldpropietario_cuentaReferenciaBancaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldpropietario_cuentaReferenciaBancaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldpropietario_cuentaReferenciaBancaria,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonpropietario_cuentaReferenciaBancariaBusqueda= new JButtonMe();
		this.jButtonpropietario_cuentaReferenciaBancariaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpropietario_cuentaReferenciaBancariaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpropietario_cuentaReferenciaBancariaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonpropietario_cuentaReferenciaBancariaBusqueda.setText("U");
		this.jButtonpropietario_cuentaReferenciaBancariaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonpropietario_cuentaReferenciaBancariaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonpropietario_cuentaReferenciaBancariaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldpropietario_cuentaReferenciaBancaria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldpropietario_cuentaReferenciaBancaria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"propietario_cuentaReferenciaBancariaBusqueda"));

		if(this.referenciabancariaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonpropietario_cuentaReferenciaBancariaBusqueda.setVisible(false);		}


					
		this.jLabelesactivoReferenciaBancaria = new JLabelMe();
		this.jLabelesactivoReferenciaBancaria.setText(""+ReferenciaBancariaConstantesFunciones.LABEL_ESACTIVO+" : *");
		this.jLabelesactivoReferenciaBancaria.setToolTipText("Es Activo");
		this.jLabelesactivoReferenciaBancaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelesactivoReferenciaBancaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelesactivoReferenciaBancaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelesactivoReferenciaBancaria,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelesactivoReferenciaBancaria=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelesactivoReferenciaBancaria.setToolTipText(ReferenciaBancariaConstantesFunciones.LABEL_ESACTIVO);
		this.gridaBagLayoutReferenciaBancaria = new GridBagLayout();
		this.jPanelesactivoReferenciaBancaria.setLayout(this.gridaBagLayoutReferenciaBancaria);


		jCheckBoxesactivoReferenciaBancaria= new JCheckBoxMe();
		jCheckBoxesactivoReferenciaBancaria.setEnabled(false);

		jCheckBoxesactivoReferenciaBancaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesactivoReferenciaBancaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesactivoReferenciaBancaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxesactivoReferenciaBancaria,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonesactivoReferenciaBancariaBusqueda= new JButtonMe();
		this.jButtonesactivoReferenciaBancariaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesactivoReferenciaBancariaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesactivoReferenciaBancariaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonesactivoReferenciaBancariaBusqueda.setText("U");
		this.jButtonesactivoReferenciaBancariaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonesactivoReferenciaBancariaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonesactivoReferenciaBancariaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxesactivoReferenciaBancaria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxesactivoReferenciaBancaria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"esactivoReferenciaBancariaBusqueda"));

		if(this.referenciabancariaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonesactivoReferenciaBancariaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysReferenciaBancaria() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaReferenciaBancaria = new JLabelMe();
		this.jLabelid_empresaReferenciaBancaria.setText(""+ReferenciaBancariaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaReferenciaBancaria.setToolTipText("Idempresa");
		this.jLabelid_empresaReferenciaBancaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaReferenciaBancaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaReferenciaBancaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaReferenciaBancaria,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaReferenciaBancaria=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaReferenciaBancaria.setToolTipText(ReferenciaBancariaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutReferenciaBancaria = new GridBagLayout();
		this.jPanelid_empresaReferenciaBancaria.setLayout(this.gridaBagLayoutReferenciaBancaria);


		jComboBoxid_empresaReferenciaBancaria= new JComboBoxMe();
		jComboBoxid_empresaReferenciaBancaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaReferenciaBancaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaReferenciaBancaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaReferenciaBancaria,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaReferenciaBancaria.setEnabled(false);

		this.jButtonid_empresaReferenciaBancaria= new JButtonMe();
		this.jButtonid_empresaReferenciaBancaria.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaReferenciaBancaria.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaReferenciaBancaria.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaReferenciaBancaria.setText("Buscar");
		this.jButtonid_empresaReferenciaBancaria.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaReferenciaBancaria.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaReferenciaBancaria,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaReferenciaBancaria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaReferenciaBancaria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaReferenciaBancaria"));

		this.jButtonid_empresaReferenciaBancariaBusqueda= new JButtonMe();
		this.jButtonid_empresaReferenciaBancariaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaReferenciaBancariaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaReferenciaBancariaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaReferenciaBancariaBusqueda.setText("U");
		this.jButtonid_empresaReferenciaBancariaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaReferenciaBancariaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaReferenciaBancariaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaReferenciaBancaria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaReferenciaBancaria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaReferenciaBancariaBusqueda"));

		if(this.referenciabancariaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaReferenciaBancariaBusqueda.setVisible(false);		}

		this.jButtonid_empresaReferenciaBancariaUpdate= new JButtonMe();
		this.jButtonid_empresaReferenciaBancariaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaReferenciaBancariaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaReferenciaBancariaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaReferenciaBancariaUpdate.setText("U");
		this.jButtonid_empresaReferenciaBancariaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaReferenciaBancariaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaReferenciaBancariaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaReferenciaBancaria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaReferenciaBancaria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaReferenciaBancariaUpdate"));



					
		this.jLabelidclienteReferenciaBancaria = new JLabelMe();
		this.jLabelidclienteReferenciaBancaria.setText(""+ReferenciaBancariaConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelidclienteReferenciaBancaria.setToolTipText("Cliente");
		this.jLabelidclienteReferenciaBancaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelidclienteReferenciaBancaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelidclienteReferenciaBancaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelidclienteReferenciaBancaria,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelidclienteReferenciaBancaria=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidclienteReferenciaBancaria.setToolTipText(ReferenciaBancariaConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutReferenciaBancaria = new GridBagLayout();
		this.jPanelidclienteReferenciaBancaria.setLayout(this.gridaBagLayoutReferenciaBancaria);


		jComboBoxidclienteReferenciaBancaria= new JComboBoxMe();
		jComboBoxidclienteReferenciaBancaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidclienteReferenciaBancaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidclienteReferenciaBancaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxidclienteReferenciaBancaria,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonidclienteReferenciaBancaria= new JButtonMe();
		this.jButtonidclienteReferenciaBancaria.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonidclienteReferenciaBancaria.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonidclienteReferenciaBancaria.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonidclienteReferenciaBancaria.setText("Buscar");
		this.jButtonidclienteReferenciaBancaria.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonidclienteReferenciaBancaria.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonidclienteReferenciaBancaria,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxidclienteReferenciaBancaria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxidclienteReferenciaBancaria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"idclienteReferenciaBancaria"));

		this.jButtonidclienteReferenciaBancariaBusqueda= new JButtonMe();
		this.jButtonidclienteReferenciaBancariaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidclienteReferenciaBancariaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidclienteReferenciaBancariaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonidclienteReferenciaBancariaBusqueda.setText("U");
		this.jButtonidclienteReferenciaBancariaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonidclienteReferenciaBancariaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonidclienteReferenciaBancariaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxidclienteReferenciaBancaria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxidclienteReferenciaBancaria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"idclienteReferenciaBancariaBusqueda"));

		if(this.referenciabancariaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonidclienteReferenciaBancariaBusqueda.setVisible(false);		}

		this.jButtonidclienteReferenciaBancariaUpdate= new JButtonMe();
		this.jButtonidclienteReferenciaBancariaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidclienteReferenciaBancariaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidclienteReferenciaBancariaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonidclienteReferenciaBancariaUpdate.setText("U");
		this.jButtonidclienteReferenciaBancariaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonidclienteReferenciaBancariaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonidclienteReferenciaBancariaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxidclienteReferenciaBancaria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxidclienteReferenciaBancaria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"idclienteReferenciaBancariaUpdate"));



					
		this.jLabelidvalorclientebancoReferenciaBancaria = new JLabelMe();
		this.jLabelidvalorclientebancoReferenciaBancaria.setText(""+ReferenciaBancariaConstantesFunciones.LABEL_IDBANCO+" : *");
		this.jLabelidvalorclientebancoReferenciaBancaria.setToolTipText("Banco");
		this.jLabelidvalorclientebancoReferenciaBancaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelidvalorclientebancoReferenciaBancaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelidvalorclientebancoReferenciaBancaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelidvalorclientebancoReferenciaBancaria,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelidvalorclientebancoReferenciaBancaria=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidvalorclientebancoReferenciaBancaria.setToolTipText(ReferenciaBancariaConstantesFunciones.LABEL_IDBANCO);
		this.gridaBagLayoutReferenciaBancaria = new GridBagLayout();
		this.jPanelidvalorclientebancoReferenciaBancaria.setLayout(this.gridaBagLayoutReferenciaBancaria);


		jComboBoxidvalorclientebancoReferenciaBancaria= new JComboBoxMe();
		jComboBoxidvalorclientebancoReferenciaBancaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidvalorclientebancoReferenciaBancaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidvalorclientebancoReferenciaBancaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxidvalorclientebancoReferenciaBancaria,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonidvalorclientebancoReferenciaBancaria= new JButtonMe();
		this.jButtonidvalorclientebancoReferenciaBancaria.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonidvalorclientebancoReferenciaBancaria.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonidvalorclientebancoReferenciaBancaria.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonidvalorclientebancoReferenciaBancaria.setText("Buscar");
		this.jButtonidvalorclientebancoReferenciaBancaria.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonidvalorclientebancoReferenciaBancaria.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonidvalorclientebancoReferenciaBancaria,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxidvalorclientebancoReferenciaBancaria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxidvalorclientebancoReferenciaBancaria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"idvalorclientebancoReferenciaBancaria"));

		this.jButtonidvalorclientebancoReferenciaBancariaBusqueda= new JButtonMe();
		this.jButtonidvalorclientebancoReferenciaBancariaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidvalorclientebancoReferenciaBancariaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidvalorclientebancoReferenciaBancariaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonidvalorclientebancoReferenciaBancariaBusqueda.setText("U");
		this.jButtonidvalorclientebancoReferenciaBancariaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonidvalorclientebancoReferenciaBancariaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonidvalorclientebancoReferenciaBancariaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxidvalorclientebancoReferenciaBancaria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxidvalorclientebancoReferenciaBancaria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"idvalorclientebancoReferenciaBancariaBusqueda"));

		if(this.referenciabancariaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonidvalorclientebancoReferenciaBancariaBusqueda.setVisible(false);		}

		this.jButtonidvalorclientebancoReferenciaBancariaUpdate= new JButtonMe();
		this.jButtonidvalorclientebancoReferenciaBancariaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidvalorclientebancoReferenciaBancariaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidvalorclientebancoReferenciaBancariaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonidvalorclientebancoReferenciaBancariaUpdate.setText("U");
		this.jButtonidvalorclientebancoReferenciaBancariaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonidvalorclientebancoReferenciaBancariaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonidvalorclientebancoReferenciaBancariaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxidvalorclientebancoReferenciaBancaria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxidvalorclientebancoReferenciaBancaria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"idvalorclientebancoReferenciaBancariaUpdate"));



					
		this.jLabelidvalorclienteproductobancoReferenciaBancaria = new JLabelMe();
		this.jLabelidvalorclienteproductobancoReferenciaBancaria.setText(""+ReferenciaBancariaConstantesFunciones.LABEL_IDTIPOPRODUBANCO+" : *");
		this.jLabelidvalorclienteproductobancoReferenciaBancaria.setToolTipText("Tipo Produ Banco");
		this.jLabelidvalorclienteproductobancoReferenciaBancaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelidvalorclienteproductobancoReferenciaBancaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelidvalorclienteproductobancoReferenciaBancaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelidvalorclienteproductobancoReferenciaBancaria,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelidvalorclienteproductobancoReferenciaBancaria=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidvalorclienteproductobancoReferenciaBancaria.setToolTipText(ReferenciaBancariaConstantesFunciones.LABEL_IDTIPOPRODUBANCO);
		this.gridaBagLayoutReferenciaBancaria = new GridBagLayout();
		this.jPanelidvalorclienteproductobancoReferenciaBancaria.setLayout(this.gridaBagLayoutReferenciaBancaria);


		jComboBoxidvalorclienteproductobancoReferenciaBancaria= new JComboBoxMe();
		jComboBoxidvalorclienteproductobancoReferenciaBancaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidvalorclienteproductobancoReferenciaBancaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidvalorclienteproductobancoReferenciaBancaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxidvalorclienteproductobancoReferenciaBancaria,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonidvalorclienteproductobancoReferenciaBancaria= new JButtonMe();
		this.jButtonidvalorclienteproductobancoReferenciaBancaria.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonidvalorclienteproductobancoReferenciaBancaria.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonidvalorclienteproductobancoReferenciaBancaria.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonidvalorclienteproductobancoReferenciaBancaria.setText("Buscar");
		this.jButtonidvalorclienteproductobancoReferenciaBancaria.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonidvalorclienteproductobancoReferenciaBancaria.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonidvalorclienteproductobancoReferenciaBancaria,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxidvalorclienteproductobancoReferenciaBancaria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxidvalorclienteproductobancoReferenciaBancaria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"idvalorclienteproductobancoReferenciaBancaria"));

		this.jButtonidvalorclienteproductobancoReferenciaBancariaBusqueda= new JButtonMe();
		this.jButtonidvalorclienteproductobancoReferenciaBancariaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidvalorclienteproductobancoReferenciaBancariaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidvalorclienteproductobancoReferenciaBancariaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonidvalorclienteproductobancoReferenciaBancariaBusqueda.setText("U");
		this.jButtonidvalorclienteproductobancoReferenciaBancariaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonidvalorclienteproductobancoReferenciaBancariaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonidvalorclienteproductobancoReferenciaBancariaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxidvalorclienteproductobancoReferenciaBancaria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxidvalorclienteproductobancoReferenciaBancaria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"idvalorclienteproductobancoReferenciaBancariaBusqueda"));

		if(this.referenciabancariaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonidvalorclienteproductobancoReferenciaBancariaBusqueda.setVisible(false);		}

		this.jButtonidvalorclienteproductobancoReferenciaBancariaUpdate= new JButtonMe();
		this.jButtonidvalorclienteproductobancoReferenciaBancariaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidvalorclienteproductobancoReferenciaBancariaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidvalorclienteproductobancoReferenciaBancariaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonidvalorclienteproductobancoReferenciaBancariaUpdate.setText("U");
		this.jButtonidvalorclienteproductobancoReferenciaBancariaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonidvalorclienteproductobancoReferenciaBancariaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonidvalorclienteproductobancoReferenciaBancariaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxidvalorclienteproductobancoReferenciaBancaria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxidvalorclienteproductobancoReferenciaBancaria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"idvalorclienteproductobancoReferenciaBancariaUpdate"));



					
		this.jLabelidvalorclientecuentabancoReferenciaBancaria = new JLabelMe();
		this.jLabelidvalorclientecuentabancoReferenciaBancaria.setText(""+ReferenciaBancariaConstantesFunciones.LABEL_IDTIPOCUENTABANCO+" : *");
		this.jLabelidvalorclientecuentabancoReferenciaBancaria.setToolTipText("Tipo Cuenta Banco");
		this.jLabelidvalorclientecuentabancoReferenciaBancaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelidvalorclientecuentabancoReferenciaBancaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelidvalorclientecuentabancoReferenciaBancaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelidvalorclientecuentabancoReferenciaBancaria,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelidvalorclientecuentabancoReferenciaBancaria=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidvalorclientecuentabancoReferenciaBancaria.setToolTipText(ReferenciaBancariaConstantesFunciones.LABEL_IDTIPOCUENTABANCO);
		this.gridaBagLayoutReferenciaBancaria = new GridBagLayout();
		this.jPanelidvalorclientecuentabancoReferenciaBancaria.setLayout(this.gridaBagLayoutReferenciaBancaria);


		jComboBoxidvalorclientecuentabancoReferenciaBancaria= new JComboBoxMe();
		jComboBoxidvalorclientecuentabancoReferenciaBancaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidvalorclientecuentabancoReferenciaBancaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidvalorclientecuentabancoReferenciaBancaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxidvalorclientecuentabancoReferenciaBancaria,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonidvalorclientecuentabancoReferenciaBancaria= new JButtonMe();
		this.jButtonidvalorclientecuentabancoReferenciaBancaria.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonidvalorclientecuentabancoReferenciaBancaria.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonidvalorclientecuentabancoReferenciaBancaria.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonidvalorclientecuentabancoReferenciaBancaria.setText("Buscar");
		this.jButtonidvalorclientecuentabancoReferenciaBancaria.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonidvalorclientecuentabancoReferenciaBancaria.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonidvalorclientecuentabancoReferenciaBancaria,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxidvalorclientecuentabancoReferenciaBancaria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxidvalorclientecuentabancoReferenciaBancaria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"idvalorclientecuentabancoReferenciaBancaria"));

		this.jButtonidvalorclientecuentabancoReferenciaBancariaBusqueda= new JButtonMe();
		this.jButtonidvalorclientecuentabancoReferenciaBancariaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidvalorclientecuentabancoReferenciaBancariaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidvalorclientecuentabancoReferenciaBancariaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonidvalorclientecuentabancoReferenciaBancariaBusqueda.setText("U");
		this.jButtonidvalorclientecuentabancoReferenciaBancariaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonidvalorclientecuentabancoReferenciaBancariaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonidvalorclientecuentabancoReferenciaBancariaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxidvalorclientecuentabancoReferenciaBancaria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxidvalorclientecuentabancoReferenciaBancaria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"idvalorclientecuentabancoReferenciaBancariaBusqueda"));

		if(this.referenciabancariaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonidvalorclientecuentabancoReferenciaBancariaBusqueda.setVisible(false);		}

		this.jButtonidvalorclientecuentabancoReferenciaBancariaUpdate= new JButtonMe();
		this.jButtonidvalorclientecuentabancoReferenciaBancariaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidvalorclientecuentabancoReferenciaBancariaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidvalorclientecuentabancoReferenciaBancariaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonidvalorclientecuentabancoReferenciaBancariaUpdate.setText("U");
		this.jButtonidvalorclientecuentabancoReferenciaBancariaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonidvalorclientecuentabancoReferenciaBancariaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonidvalorclientecuentabancoReferenciaBancariaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxidvalorclientecuentabancoReferenciaBancaria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxidvalorclientecuentabancoReferenciaBancaria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"idvalorclientecuentabancoReferenciaBancariaUpdate"));



					
		this.jLabelid_tipo_valoracionReferenciaBancaria = new JLabelMe();
		this.jLabelid_tipo_valoracionReferenciaBancaria.setText(""+ReferenciaBancariaConstantesFunciones.LABEL_IDTIPOVALORACION+" : *");
		this.jLabelid_tipo_valoracionReferenciaBancaria.setToolTipText("Tipo Valoracion");
		this.jLabelid_tipo_valoracionReferenciaBancaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_valoracionReferenciaBancaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_valoracionReferenciaBancaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_valoracionReferenciaBancaria,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_valoracionReferenciaBancaria=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_valoracionReferenciaBancaria.setToolTipText(ReferenciaBancariaConstantesFunciones.LABEL_IDTIPOVALORACION);
		this.gridaBagLayoutReferenciaBancaria = new GridBagLayout();
		this.jPanelid_tipo_valoracionReferenciaBancaria.setLayout(this.gridaBagLayoutReferenciaBancaria);


		jComboBoxid_tipo_valoracionReferenciaBancaria= new JComboBoxMe();
		jComboBoxid_tipo_valoracionReferenciaBancaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_valoracionReferenciaBancaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_valoracionReferenciaBancaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_valoracionReferenciaBancaria,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_valoracionReferenciaBancaria= new JButtonMe();
		this.jButtonid_tipo_valoracionReferenciaBancaria.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_valoracionReferenciaBancaria.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_valoracionReferenciaBancaria.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_valoracionReferenciaBancaria.setText("Buscar");
		this.jButtonid_tipo_valoracionReferenciaBancaria.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_valoracionReferenciaBancaria.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_valoracionReferenciaBancaria,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_valoracionReferenciaBancaria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_valoracionReferenciaBancaria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_valoracionReferenciaBancaria"));

		this.jButtonid_tipo_valoracionReferenciaBancariaBusqueda= new JButtonMe();
		this.jButtonid_tipo_valoracionReferenciaBancariaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_valoracionReferenciaBancariaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_valoracionReferenciaBancariaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_valoracionReferenciaBancariaBusqueda.setText("U");
		this.jButtonid_tipo_valoracionReferenciaBancariaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_valoracionReferenciaBancariaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_valoracionReferenciaBancariaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_valoracionReferenciaBancaria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_valoracionReferenciaBancaria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_valoracionReferenciaBancariaBusqueda"));

		if(this.referenciabancariaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_valoracionReferenciaBancariaBusqueda.setVisible(false);		}

		this.jButtonid_tipo_valoracionReferenciaBancariaUpdate= new JButtonMe();
		this.jButtonid_tipo_valoracionReferenciaBancariaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_valoracionReferenciaBancariaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_valoracionReferenciaBancariaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_valoracionReferenciaBancariaUpdate.setText("U");
		this.jButtonid_tipo_valoracionReferenciaBancariaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_valoracionReferenciaBancariaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_valoracionReferenciaBancariaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_valoracionReferenciaBancaria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_valoracionReferenciaBancaria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_valoracionReferenciaBancariaUpdate"));



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
		//this.jInternalFrameDetalleReferenciaBancaria = new ReferenciaBancariaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Referencia Bancaria DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutReferenciaBancaria= new GridBagLayout();
		

		
		String sToolTipReferenciaBancaria="";
		sToolTipReferenciaBancaria=ReferenciaBancariaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipReferenciaBancaria+="(Cartera.ReferenciaBancaria)";
		}
		
		if(!this.referenciabancariaSessionBean.getEsGuardarRelacionado()) {
			sToolTipReferenciaBancaria+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoReferenciaBancaria = new JButtonMe();
		this.jButtonModificarReferenciaBancaria = new JButtonMe();
        this.jButtonActualizarReferenciaBancaria = new JButtonMe();
        this.jButtonEliminarReferenciaBancaria = new JButtonMe();
        this.jButtonCancelarReferenciaBancaria = new JButtonMe();
        this.jButtonGuardarCambiosReferenciaBancaria = new JButtonMe();
		this.jButtonGuardarCambiosTablaReferenciaBancaria = new JButtonMe();
		this.jButtonCerrarReferenciaBancaria = new JButtonMe();
		
		this.jScrollPanelDatosReferenciaBancaria = new JScrollPane();   
        this.jScrollPanelDatosEdicionReferenciaBancaria = new JScrollPane();
		this.jScrollPanelDatosGeneralReferenciaBancaria = new JScrollPane();
				
		
		
		this.jPanelCamposReferenciaBancaria = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosReferenciaBancaria = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesReferenciaBancaria = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioReferenciaBancaria = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Referencia Bancaria";
		
		if(!this.referenciabancariaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosReferenciaBancaria.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Referencia Bancarias" + this.sPath));
		} else {
			this.jScrollPanelDatosReferenciaBancaria.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionReferenciaBancaria.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralReferenciaBancaria.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposReferenciaBancaria.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposReferenciaBancaria.setName("jPanelCamposReferenciaBancaria"); 

		this.jPanelCamposOcultosReferenciaBancaria.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosReferenciaBancaria.setName("jPanelCamposOcultosReferenciaBancaria"); 

        this.jPanelAccionesReferenciaBancaria.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesReferenciaBancaria.setToolTipText("Acciones");
        this.jPanelAccionesReferenciaBancaria.setName("Acciones"); 

		this.jPanelAccionesFormularioReferenciaBancaria.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioReferenciaBancaria.setToolTipText("Acciones");
        this.jPanelAccionesFormularioReferenciaBancaria.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionReferenciaBancaria, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralReferenciaBancaria, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosReferenciaBancaria, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposReferenciaBancaria, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosReferenciaBancaria, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioReferenciaBancaria, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoReferenciaBancaria.setText("Nuevo");
		this.jButtonModificarReferenciaBancaria.setText("Editar");
        this.jButtonActualizarReferenciaBancaria.setText("Actualizar");
        this.jButtonEliminarReferenciaBancaria.setText("Eliminar");
        this.jButtonCancelarReferenciaBancaria.setText("Cancelar");
        this.jButtonGuardarCambiosReferenciaBancaria.setText("Guardar");
		this.jButtonGuardarCambiosTablaReferenciaBancaria.setText("Guardar");
		this.jButtonCerrarReferenciaBancaria.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoReferenciaBancaria,"nuevo_button","Nuevo",this.referenciabancariaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarReferenciaBancaria,"modificar_button","Editar",this.referenciabancariaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarReferenciaBancaria,"actualizar_button","Actualizar",this.referenciabancariaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarReferenciaBancaria,"eliminar_button","Eliminar",this.referenciabancariaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarReferenciaBancaria,"cancelar_button","Cancelar",this.referenciabancariaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosReferenciaBancaria,"guardarcambios_button","Guardar",this.referenciabancariaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaReferenciaBancaria,"guardarcambiostabla_button","Guardar",this.referenciabancariaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReferenciaBancaria,"cerrar_button","Salir",this.referenciabancariaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoReferenciaBancaria, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarReferenciaBancaria, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosReferenciaBancaria, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaReferenciaBancaria, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarReferenciaBancaria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarReferenciaBancaria, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarReferenciaBancaria, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarReferenciaBancaria, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoReferenciaBancaria.setToolTipText("Nuevo"+" "+ReferenciaBancariaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarReferenciaBancaria.setToolTipText("Editar"+" "+ReferenciaBancariaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarReferenciaBancaria.setToolTipText("Actualizar"+" "+ReferenciaBancariaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarReferenciaBancaria.setToolTipText("Eliminar)"+" "+ReferenciaBancariaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarReferenciaBancaria.setToolTipText("Cancelar"+" "+ReferenciaBancariaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosReferenciaBancaria.setToolTipText("Guardar"+" "+ReferenciaBancariaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaReferenciaBancaria.setToolTipText("Guardar"+" "+ReferenciaBancariaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarReferenciaBancaria.setToolTipText("Salir"+" "+ReferenciaBancariaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoReferenciaBancaria";
		inputMap = this.jButtonNuevoReferenciaBancaria.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoReferenciaBancaria.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoReferenciaBancaria"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarReferenciaBancaria";
		inputMap = this.jButtonActualizarReferenciaBancaria.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarReferenciaBancaria.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarReferenciaBancaria"));
		
		//ELIMINAR
		sMapKey = "EliminarReferenciaBancaria";
		inputMap = this.jButtonEliminarReferenciaBancaria.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarReferenciaBancaria.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarReferenciaBancaria"));
		
		//CANCELAR	
		sMapKey = "CancelarReferenciaBancaria";
		inputMap = this.jButtonCancelarReferenciaBancaria.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarReferenciaBancaria.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarReferenciaBancaria"));
		
		//CERRAR		
		sMapKey = "CerrarReferenciaBancaria";
		inputMap = this.jButtonCerrarReferenciaBancaria.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarReferenciaBancaria.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarReferenciaBancaria"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaReferenciaBancaria";
		inputMap = this.jButtonGuardarCambiosTablaReferenciaBancaria.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaReferenciaBancaria.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaReferenciaBancaria"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoReferenciaBancaria = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoReferenciaBancaria.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoReferenciaBancaria.setToolTipText("Nuevo ReferenciaBancaria");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoReferenciaBancaria, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarReferenciaBancaria = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarReferenciaBancaria.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarReferenciaBancaria.setToolTipText("Sin Cerrar Ventana ReferenciaBancaria");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarReferenciaBancaria, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeReferenciaBancaria = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeReferenciaBancaria.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeReferenciaBancaria.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeReferenciaBancaria, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesReferenciaBancaria = new JComboBoxMe();
		//this.jComboBoxTiposAccionesReferenciaBancaria.setText("Accion");
		this.jComboBoxTiposAccionesReferenciaBancaria.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioReferenciaBancaria = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioReferenciaBancaria.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioReferenciaBancaria.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesReferenciaBancaria = new JLabelMe();
		
		this.jLabelAccionesReferenciaBancaria.setText("Acciones");		
		this.jLabelAccionesReferenciaBancaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesReferenciaBancaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesReferenciaBancaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposReferenciaBancaria();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysReferenciaBancaria();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesReferenciaBancaria=new JTabbedPane();
		this.jTabbedPaneRelacionesReferenciaBancaria.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesReferenciaBancaria,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesReferenciaBancaria.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesReferenciaBancaria.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesReferenciaBancaria.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesReferenciaBancaria, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioReferenciaBancaria.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioReferenciaBancaria.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioReferenciaBancaria.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioReferenciaBancaria, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposReferenciaBancaria = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosReferenciaBancaria = new GridBagLayout();
		
		this.jPanelCamposReferenciaBancaria.setLayout(gridaBagLayoutCamposReferenciaBancaria);
		this.jPanelCamposOcultosReferenciaBancaria.setLayout(gridaBagLayoutCamposOcultosReferenciaBancaria);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
	this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaBancaria.gridy = 0;
	this.gridBagConstraintsReferenciaBancaria.gridx = 0;
	this.gridBagConstraintsReferenciaBancaria.ipadx = 0;
	this.gridBagConstraintsReferenciaBancaria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidReferenciaBancaria.add(jLabelIdReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);



	this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
	this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaBancaria.gridy = 0;
	this.gridBagConstraintsReferenciaBancaria.gridx = 1;
	this.gridBagConstraintsReferenciaBancaria.ipadx = 0;
	this.gridBagConstraintsReferenciaBancaria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidReferenciaBancaria.add(jLabelidReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);


	this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
	this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaBancaria.gridy = 0;
	this.gridBagConstraintsReferenciaBancaria.gridx = 0;
	this.gridBagConstraintsReferenciaBancaria.ipadx = 0;
	this.gridBagConstraintsReferenciaBancaria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaReferenciaBancaria.add(jLabelid_empresaReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
		//this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaBancaria.gridy = 0;
		this.gridBagConstraintsReferenciaBancaria.gridx = 2;
		this.gridBagConstraintsReferenciaBancaria.ipadx = 0;
		this.gridBagConstraintsReferenciaBancaria.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaReferenciaBancaria.add(jButtonid_empresaReferenciaBancariaBusqueda, this.gridBagConstraintsReferenciaBancaria);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
		//this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaBancaria.gridy = 0;
		this.gridBagConstraintsReferenciaBancaria.gridx = 3;
		this.gridBagConstraintsReferenciaBancaria.ipadx = 0;
		this.gridBagConstraintsReferenciaBancaria.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaReferenciaBancaria.add(jButtonid_empresaReferenciaBancariaUpdate, this.gridBagConstraintsReferenciaBancaria);
	}

	this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
	this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaBancaria.gridy = 0;
	this.gridBagConstraintsReferenciaBancaria.gridx = 1;
	this.gridBagConstraintsReferenciaBancaria.ipadx = 0;
	this.gridBagConstraintsReferenciaBancaria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaReferenciaBancaria.add(jComboBoxid_empresaReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);


	this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
	this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaBancaria.gridy = 0;
	this.gridBagConstraintsReferenciaBancaria.gridx = 0;
	this.gridBagConstraintsReferenciaBancaria.ipadx = 0;
	this.gridBagConstraintsReferenciaBancaria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidclienteReferenciaBancaria.add(jLabelidclienteReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
	//this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaBancaria.gridy = 0;
	this.gridBagConstraintsReferenciaBancaria.gridx = 2;
	this.gridBagConstraintsReferenciaBancaria.ipadx = 0;
	this.gridBagConstraintsReferenciaBancaria.insets = new Insets(0, 0, 0, 0);
	this.jPanelidclienteReferenciaBancaria.add(jButtonidclienteReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
		//this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaBancaria.gridy = 0;
		this.gridBagConstraintsReferenciaBancaria.gridx = 3;
		this.gridBagConstraintsReferenciaBancaria.ipadx = 0;
		this.gridBagConstraintsReferenciaBancaria.insets = new Insets(0, 0, 0, 0);
		this.jPanelidclienteReferenciaBancaria.add(jButtonidclienteReferenciaBancariaBusqueda, this.gridBagConstraintsReferenciaBancaria);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
		//this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaBancaria.gridy = 0;
		this.gridBagConstraintsReferenciaBancaria.gridx = 4;
		this.gridBagConstraintsReferenciaBancaria.ipadx = 0;
		this.gridBagConstraintsReferenciaBancaria.insets = new Insets(0, 0, 0, 0);
		this.jPanelidclienteReferenciaBancaria.add(jButtonidclienteReferenciaBancariaUpdate, this.gridBagConstraintsReferenciaBancaria);
	}

	this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
	this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaBancaria.gridy = 0;
	this.gridBagConstraintsReferenciaBancaria.gridx = 1;
	this.gridBagConstraintsReferenciaBancaria.ipadx = 0;
	this.gridBagConstraintsReferenciaBancaria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidclienteReferenciaBancaria.add(jComboBoxidclienteReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);


	this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
	this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaBancaria.gridy = 0;
	this.gridBagConstraintsReferenciaBancaria.gridx = 0;
	this.gridBagConstraintsReferenciaBancaria.ipadx = 0;
	this.gridBagConstraintsReferenciaBancaria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidvalorclientebancoReferenciaBancaria.add(jLabelidvalorclientebancoReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
		//this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaBancaria.gridy = 0;
		this.gridBagConstraintsReferenciaBancaria.gridx = 2;
		this.gridBagConstraintsReferenciaBancaria.ipadx = 0;
		this.gridBagConstraintsReferenciaBancaria.insets = new Insets(0, 0, 0, 0);
		this.jPanelidvalorclientebancoReferenciaBancaria.add(jButtonidvalorclientebancoReferenciaBancariaBusqueda, this.gridBagConstraintsReferenciaBancaria);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
		//this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaBancaria.gridy = 0;
		this.gridBagConstraintsReferenciaBancaria.gridx = 3;
		this.gridBagConstraintsReferenciaBancaria.ipadx = 0;
		this.gridBagConstraintsReferenciaBancaria.insets = new Insets(0, 0, 0, 0);
		this.jPanelidvalorclientebancoReferenciaBancaria.add(jButtonidvalorclientebancoReferenciaBancariaUpdate, this.gridBagConstraintsReferenciaBancaria);
	}

	this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
	this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaBancaria.gridy = 0;
	this.gridBagConstraintsReferenciaBancaria.gridx = 1;
	this.gridBagConstraintsReferenciaBancaria.ipadx = 0;
	this.gridBagConstraintsReferenciaBancaria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidvalorclientebancoReferenciaBancaria.add(jComboBoxidvalorclientebancoReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);


	this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
	this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaBancaria.gridy = 0;
	this.gridBagConstraintsReferenciaBancaria.gridx = 0;
	this.gridBagConstraintsReferenciaBancaria.ipadx = 0;
	this.gridBagConstraintsReferenciaBancaria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidvalorclienteproductobancoReferenciaBancaria.add(jLabelidvalorclienteproductobancoReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
		//this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaBancaria.gridy = 0;
		this.gridBagConstraintsReferenciaBancaria.gridx = 2;
		this.gridBagConstraintsReferenciaBancaria.ipadx = 0;
		this.gridBagConstraintsReferenciaBancaria.insets = new Insets(0, 0, 0, 0);
		this.jPanelidvalorclienteproductobancoReferenciaBancaria.add(jButtonidvalorclienteproductobancoReferenciaBancariaBusqueda, this.gridBagConstraintsReferenciaBancaria);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
		//this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaBancaria.gridy = 0;
		this.gridBagConstraintsReferenciaBancaria.gridx = 3;
		this.gridBagConstraintsReferenciaBancaria.ipadx = 0;
		this.gridBagConstraintsReferenciaBancaria.insets = new Insets(0, 0, 0, 0);
		this.jPanelidvalorclienteproductobancoReferenciaBancaria.add(jButtonidvalorclienteproductobancoReferenciaBancariaUpdate, this.gridBagConstraintsReferenciaBancaria);
	}

	this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
	this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaBancaria.gridy = 0;
	this.gridBagConstraintsReferenciaBancaria.gridx = 1;
	this.gridBagConstraintsReferenciaBancaria.ipadx = 0;
	this.gridBagConstraintsReferenciaBancaria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidvalorclienteproductobancoReferenciaBancaria.add(jComboBoxidvalorclienteproductobancoReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);


	this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
	this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaBancaria.gridy = 0;
	this.gridBagConstraintsReferenciaBancaria.gridx = 0;
	this.gridBagConstraintsReferenciaBancaria.ipadx = 0;
	this.gridBagConstraintsReferenciaBancaria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidvalorclientecuentabancoReferenciaBancaria.add(jLabelidvalorclientecuentabancoReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
		//this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaBancaria.gridy = 0;
		this.gridBagConstraintsReferenciaBancaria.gridx = 2;
		this.gridBagConstraintsReferenciaBancaria.ipadx = 0;
		this.gridBagConstraintsReferenciaBancaria.insets = new Insets(0, 0, 0, 0);
		this.jPanelidvalorclientecuentabancoReferenciaBancaria.add(jButtonidvalorclientecuentabancoReferenciaBancariaBusqueda, this.gridBagConstraintsReferenciaBancaria);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
		//this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaBancaria.gridy = 0;
		this.gridBagConstraintsReferenciaBancaria.gridx = 3;
		this.gridBagConstraintsReferenciaBancaria.ipadx = 0;
		this.gridBagConstraintsReferenciaBancaria.insets = new Insets(0, 0, 0, 0);
		this.jPanelidvalorclientecuentabancoReferenciaBancaria.add(jButtonidvalorclientecuentabancoReferenciaBancariaUpdate, this.gridBagConstraintsReferenciaBancaria);
	}

	this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
	this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaBancaria.gridy = 0;
	this.gridBagConstraintsReferenciaBancaria.gridx = 1;
	this.gridBagConstraintsReferenciaBancaria.ipadx = 0;
	this.gridBagConstraintsReferenciaBancaria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidvalorclientecuentabancoReferenciaBancaria.add(jComboBoxidvalorclientecuentabancoReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);


	this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
	this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaBancaria.gridy = 0;
	this.gridBagConstraintsReferenciaBancaria.gridx = 0;
	this.gridBagConstraintsReferenciaBancaria.ipadx = 0;
	this.gridBagConstraintsReferenciaBancaria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_cuenta_tarjetaReferenciaBancaria.add(jLabelnumero_cuenta_tarjetaReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
		//this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaBancaria.gridy = 0;
		this.gridBagConstraintsReferenciaBancaria.gridx = 2;
		this.gridBagConstraintsReferenciaBancaria.ipadx = 0;
		this.gridBagConstraintsReferenciaBancaria.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_cuenta_tarjetaReferenciaBancaria.add(jButtonnumero_cuenta_tarjetaReferenciaBancariaBusqueda, this.gridBagConstraintsReferenciaBancaria);
	}

	this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
	this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaBancaria.gridy = 0;
	this.gridBagConstraintsReferenciaBancaria.gridx = 1;
	this.gridBagConstraintsReferenciaBancaria.ipadx = 0;
	this.gridBagConstraintsReferenciaBancaria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_cuenta_tarjetaReferenciaBancaria.add(jTextFieldnumero_cuenta_tarjetaReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);


	this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
	this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaBancaria.gridy = 0;
	this.gridBagConstraintsReferenciaBancaria.gridx = 0;
	this.gridBagConstraintsReferenciaBancaria.ipadx = 0;
	this.gridBagConstraintsReferenciaBancaria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emisionReferenciaBancaria.add(jLabelfecha_emisionReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
		//this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaBancaria.gridy = 0;
		this.gridBagConstraintsReferenciaBancaria.gridx = 2;
		this.gridBagConstraintsReferenciaBancaria.ipadx = 0;
		this.gridBagConstraintsReferenciaBancaria.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emisionReferenciaBancaria.add(jButtonfecha_emisionReferenciaBancariaBusqueda, this.gridBagConstraintsReferenciaBancaria);
	}

	this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
	this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaBancaria.gridy = 0;
	this.gridBagConstraintsReferenciaBancaria.gridx = 1;
	this.gridBagConstraintsReferenciaBancaria.ipadx = 0;
	this.gridBagConstraintsReferenciaBancaria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emisionReferenciaBancaria.add(jDateChooserfecha_emisionReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);


	this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
	this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaBancaria.gridy = 0;
	this.gridBagConstraintsReferenciaBancaria.gridx = 0;
	this.gridBagConstraintsReferenciaBancaria.ipadx = 0;
	this.gridBagConstraintsReferenciaBancaria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_vencimientoReferenciaBancaria.add(jLabelfecha_vencimientoReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
		//this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaBancaria.gridy = 0;
		this.gridBagConstraintsReferenciaBancaria.gridx = 2;
		this.gridBagConstraintsReferenciaBancaria.ipadx = 0;
		this.gridBagConstraintsReferenciaBancaria.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_vencimientoReferenciaBancaria.add(jButtonfecha_vencimientoReferenciaBancariaBusqueda, this.gridBagConstraintsReferenciaBancaria);
	}

	this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
	this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaBancaria.gridy = 0;
	this.gridBagConstraintsReferenciaBancaria.gridx = 1;
	this.gridBagConstraintsReferenciaBancaria.ipadx = 0;
	this.gridBagConstraintsReferenciaBancaria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_vencimientoReferenciaBancaria.add(jDateChooserfecha_vencimientoReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);


	this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
	this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaBancaria.gridy = 0;
	this.gridBagConstraintsReferenciaBancaria.gridx = 0;
	this.gridBagConstraintsReferenciaBancaria.ipadx = 0;
	this.gridBagConstraintsReferenciaBancaria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcupoReferenciaBancaria.add(jLabelcupoReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
		//this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaBancaria.gridy = 0;
		this.gridBagConstraintsReferenciaBancaria.gridx = 2;
		this.gridBagConstraintsReferenciaBancaria.ipadx = 0;
		this.gridBagConstraintsReferenciaBancaria.insets = new Insets(0, 0, 0, 0);
		this.jPanelcupoReferenciaBancaria.add(jButtoncupoReferenciaBancariaBusqueda, this.gridBagConstraintsReferenciaBancaria);
	}

	this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
	this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaBancaria.gridy = 0;
	this.gridBagConstraintsReferenciaBancaria.gridx = 1;
	this.gridBagConstraintsReferenciaBancaria.ipadx = 0;
	this.gridBagConstraintsReferenciaBancaria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcupoReferenciaBancaria.add(jTextFieldcupoReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);


	this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
	this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaBancaria.gridy = 0;
	this.gridBagConstraintsReferenciaBancaria.gridx = 0;
	this.gridBagConstraintsReferenciaBancaria.ipadx = 0;
	this.gridBagConstraintsReferenciaBancaria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltiene_creditoReferenciaBancaria.add(jLabeltiene_creditoReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
		//this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaBancaria.gridy = 0;
		this.gridBagConstraintsReferenciaBancaria.gridx = 2;
		this.gridBagConstraintsReferenciaBancaria.ipadx = 0;
		this.gridBagConstraintsReferenciaBancaria.insets = new Insets(0, 0, 0, 0);
		this.jPaneltiene_creditoReferenciaBancaria.add(jButtontiene_creditoReferenciaBancariaBusqueda, this.gridBagConstraintsReferenciaBancaria);
	}

	this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
	this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaBancaria.gridy = 0;
	this.gridBagConstraintsReferenciaBancaria.gridx = 1;
	this.gridBagConstraintsReferenciaBancaria.ipadx = 0;
	this.gridBagConstraintsReferenciaBancaria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltiene_creditoReferenciaBancaria.add(jCheckBoxtiene_creditoReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);


	this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
	this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaBancaria.gridy = 0;
	this.gridBagConstraintsReferenciaBancaria.gridx = 0;
	this.gridBagConstraintsReferenciaBancaria.ipadx = 0;
	this.gridBagConstraintsReferenciaBancaria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_creditosReferenciaBancaria.add(jLabelnumero_creditosReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
		//this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaBancaria.gridy = 0;
		this.gridBagConstraintsReferenciaBancaria.gridx = 2;
		this.gridBagConstraintsReferenciaBancaria.ipadx = 0;
		this.gridBagConstraintsReferenciaBancaria.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_creditosReferenciaBancaria.add(jButtonnumero_creditosReferenciaBancariaBusqueda, this.gridBagConstraintsReferenciaBancaria);
	}

	this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
	this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaBancaria.gridy = 0;
	this.gridBagConstraintsReferenciaBancaria.gridx = 1;
	this.gridBagConstraintsReferenciaBancaria.ipadx = 0;
	this.gridBagConstraintsReferenciaBancaria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_creditosReferenciaBancaria.add(jTextFieldnumero_creditosReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);


	this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
	this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaBancaria.gridy = 0;
	this.gridBagConstraintsReferenciaBancaria.gridx = 0;
	this.gridBagConstraintsReferenciaBancaria.ipadx = 0;
	this.gridBagConstraintsReferenciaBancaria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltiene_protestosReferenciaBancaria.add(jLabeltiene_protestosReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
		//this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaBancaria.gridy = 0;
		this.gridBagConstraintsReferenciaBancaria.gridx = 2;
		this.gridBagConstraintsReferenciaBancaria.ipadx = 0;
		this.gridBagConstraintsReferenciaBancaria.insets = new Insets(0, 0, 0, 0);
		this.jPaneltiene_protestosReferenciaBancaria.add(jButtontiene_protestosReferenciaBancariaBusqueda, this.gridBagConstraintsReferenciaBancaria);
	}

	this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
	this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaBancaria.gridy = 0;
	this.gridBagConstraintsReferenciaBancaria.gridx = 1;
	this.gridBagConstraintsReferenciaBancaria.ipadx = 0;
	this.gridBagConstraintsReferenciaBancaria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltiene_protestosReferenciaBancaria.add(jCheckBoxtiene_protestosReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);


	this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
	this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaBancaria.gridy = 0;
	this.gridBagConstraintsReferenciaBancaria.gridx = 0;
	this.gridBagConstraintsReferenciaBancaria.ipadx = 0;
	this.gridBagConstraintsReferenciaBancaria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_protestosReferenciaBancaria.add(jLabelnumero_protestosReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
		//this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaBancaria.gridy = 0;
		this.gridBagConstraintsReferenciaBancaria.gridx = 2;
		this.gridBagConstraintsReferenciaBancaria.ipadx = 0;
		this.gridBagConstraintsReferenciaBancaria.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_protestosReferenciaBancaria.add(jButtonnumero_protestosReferenciaBancariaBusqueda, this.gridBagConstraintsReferenciaBancaria);
	}

	this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
	this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaBancaria.gridy = 0;
	this.gridBagConstraintsReferenciaBancaria.gridx = 1;
	this.gridBagConstraintsReferenciaBancaria.ipadx = 0;
	this.gridBagConstraintsReferenciaBancaria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_protestosReferenciaBancaria.add(jTextFieldnumero_protestosReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);


	this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
	this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaBancaria.gridy = 0;
	this.gridBagConstraintsReferenciaBancaria.gridx = 0;
	this.gridBagConstraintsReferenciaBancaria.ipadx = 0;
	this.gridBagConstraintsReferenciaBancaria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsaldos_promediosReferenciaBancaria.add(jLabelsaldos_promediosReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
		//this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaBancaria.gridy = 0;
		this.gridBagConstraintsReferenciaBancaria.gridx = 2;
		this.gridBagConstraintsReferenciaBancaria.ipadx = 0;
		this.gridBagConstraintsReferenciaBancaria.insets = new Insets(0, 0, 0, 0);
		this.jPanelsaldos_promediosReferenciaBancaria.add(jButtonsaldos_promediosReferenciaBancariaBusqueda, this.gridBagConstraintsReferenciaBancaria);
	}

	this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
	this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaBancaria.gridy = 0;
	this.gridBagConstraintsReferenciaBancaria.gridx = 1;
	this.gridBagConstraintsReferenciaBancaria.ipadx = 0;
	this.gridBagConstraintsReferenciaBancaria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsaldos_promediosReferenciaBancaria.add(jTextFieldsaldos_promediosReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);


	this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
	this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaBancaria.gridy = 0;
	this.gridBagConstraintsReferenciaBancaria.gridx = 0;
	this.gridBagConstraintsReferenciaBancaria.ipadx = 0;
	this.gridBagConstraintsReferenciaBancaria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelpropietario_cuentaReferenciaBancaria.add(jLabelpropietario_cuentaReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
		//this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaBancaria.gridy = 0;
		this.gridBagConstraintsReferenciaBancaria.gridx = 2;
		this.gridBagConstraintsReferenciaBancaria.ipadx = 0;
		this.gridBagConstraintsReferenciaBancaria.insets = new Insets(0, 0, 0, 0);
		this.jPanelpropietario_cuentaReferenciaBancaria.add(jButtonpropietario_cuentaReferenciaBancariaBusqueda, this.gridBagConstraintsReferenciaBancaria);
	}

	this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
	this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaBancaria.gridy = 0;
	this.gridBagConstraintsReferenciaBancaria.gridx = 1;
	this.gridBagConstraintsReferenciaBancaria.ipadx = 0;
	this.gridBagConstraintsReferenciaBancaria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelpropietario_cuentaReferenciaBancaria.add(jTextFieldpropietario_cuentaReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);


	this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
	this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaBancaria.gridy = 0;
	this.gridBagConstraintsReferenciaBancaria.gridx = 0;
	this.gridBagConstraintsReferenciaBancaria.ipadx = 0;
	this.gridBagConstraintsReferenciaBancaria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_valoracionReferenciaBancaria.add(jLabelid_tipo_valoracionReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
		//this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaBancaria.gridy = 0;
		this.gridBagConstraintsReferenciaBancaria.gridx = 2;
		this.gridBagConstraintsReferenciaBancaria.ipadx = 0;
		this.gridBagConstraintsReferenciaBancaria.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_valoracionReferenciaBancaria.add(jButtonid_tipo_valoracionReferenciaBancariaBusqueda, this.gridBagConstraintsReferenciaBancaria);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
		//this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaBancaria.gridy = 0;
		this.gridBagConstraintsReferenciaBancaria.gridx = 3;
		this.gridBagConstraintsReferenciaBancaria.ipadx = 0;
		this.gridBagConstraintsReferenciaBancaria.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_valoracionReferenciaBancaria.add(jButtonid_tipo_valoracionReferenciaBancariaUpdate, this.gridBagConstraintsReferenciaBancaria);
	}

	this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
	this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaBancaria.gridy = 0;
	this.gridBagConstraintsReferenciaBancaria.gridx = 1;
	this.gridBagConstraintsReferenciaBancaria.ipadx = 0;
	this.gridBagConstraintsReferenciaBancaria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_valoracionReferenciaBancaria.add(jComboBoxid_tipo_valoracionReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);


	this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
	this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaBancaria.gridy = 0;
	this.gridBagConstraintsReferenciaBancaria.gridx = 0;
	this.gridBagConstraintsReferenciaBancaria.ipadx = 0;
	this.gridBagConstraintsReferenciaBancaria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelesactivoReferenciaBancaria.add(jLabelesactivoReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
		//this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaBancaria.gridy = 0;
		this.gridBagConstraintsReferenciaBancaria.gridx = 2;
		this.gridBagConstraintsReferenciaBancaria.ipadx = 0;
		this.gridBagConstraintsReferenciaBancaria.insets = new Insets(0, 0, 0, 0);
		this.jPanelesactivoReferenciaBancaria.add(jButtonesactivoReferenciaBancariaBusqueda, this.gridBagConstraintsReferenciaBancaria);
	}

	this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
	this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferenciaBancaria.gridy = 0;
	this.gridBagConstraintsReferenciaBancaria.gridx = 1;
	this.gridBagConstraintsReferenciaBancaria.ipadx = 0;
	this.gridBagConstraintsReferenciaBancaria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelesactivoReferenciaBancaria.add(jCheckBoxesactivoReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
	this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsReferenciaBancaria.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsReferenciaBancaria.gridy = iYPanelCamposReferenciaBancaria;
	this.gridBagConstraintsReferenciaBancaria.gridx = iXPanelCamposReferenciaBancaria++;
	this.gridBagConstraintsReferenciaBancaria.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsReferenciaBancaria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposReferenciaBancaria.add(this.jPanelidReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);



	if(iXPanelCamposReferenciaBancaria % 1==0) {
		iXPanelCamposReferenciaBancaria=0;
		iYPanelCamposReferenciaBancaria++;
	}
	this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
	this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsReferenciaBancaria.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsReferenciaBancaria.gridy = iYPanelCamposReferenciaBancaria;
	this.gridBagConstraintsReferenciaBancaria.gridx = iXPanelCamposReferenciaBancaria++;
	this.gridBagConstraintsReferenciaBancaria.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsReferenciaBancaria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposReferenciaBancaria.add(this.jPanelidclienteReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);



	if(iXPanelCamposReferenciaBancaria % 1==0) {
		iXPanelCamposReferenciaBancaria=0;
		iYPanelCamposReferenciaBancaria++;
	}
	this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
	this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsReferenciaBancaria.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsReferenciaBancaria.gridy = iYPanelCamposReferenciaBancaria;
	this.gridBagConstraintsReferenciaBancaria.gridx = iXPanelCamposReferenciaBancaria++;
	this.gridBagConstraintsReferenciaBancaria.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsReferenciaBancaria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposReferenciaBancaria.add(this.jPanelidvalorclientebancoReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);



	if(iXPanelCamposReferenciaBancaria % 1==0) {
		iXPanelCamposReferenciaBancaria=0;
		iYPanelCamposReferenciaBancaria++;
	}
	this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
	this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsReferenciaBancaria.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsReferenciaBancaria.gridy = iYPanelCamposReferenciaBancaria;
	this.gridBagConstraintsReferenciaBancaria.gridx = iXPanelCamposReferenciaBancaria++;
	this.gridBagConstraintsReferenciaBancaria.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsReferenciaBancaria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposReferenciaBancaria.add(this.jPanelidvalorclienteproductobancoReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);



	if(iXPanelCamposReferenciaBancaria % 1==0) {
		iXPanelCamposReferenciaBancaria=0;
		iYPanelCamposReferenciaBancaria++;
	}
	this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
	this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsReferenciaBancaria.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsReferenciaBancaria.gridy = iYPanelCamposReferenciaBancaria;
	this.gridBagConstraintsReferenciaBancaria.gridx = iXPanelCamposReferenciaBancaria++;
	this.gridBagConstraintsReferenciaBancaria.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsReferenciaBancaria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposReferenciaBancaria.add(this.jPanelidvalorclientecuentabancoReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);



	if(iXPanelCamposReferenciaBancaria % 1==0) {
		iXPanelCamposReferenciaBancaria=0;
		iYPanelCamposReferenciaBancaria++;
	}
	this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
	this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsReferenciaBancaria.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsReferenciaBancaria.gridy = iYPanelCamposReferenciaBancaria;
	this.gridBagConstraintsReferenciaBancaria.gridx = iXPanelCamposReferenciaBancaria++;
	this.gridBagConstraintsReferenciaBancaria.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsReferenciaBancaria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposReferenciaBancaria.add(this.jPanelnumero_cuenta_tarjetaReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);



	if(iXPanelCamposReferenciaBancaria % 1==0) {
		iXPanelCamposReferenciaBancaria=0;
		iYPanelCamposReferenciaBancaria++;
	}
	this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
	this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsReferenciaBancaria.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsReferenciaBancaria.gridy = iYPanelCamposReferenciaBancaria;
	this.gridBagConstraintsReferenciaBancaria.gridx = iXPanelCamposReferenciaBancaria++;
	this.gridBagConstraintsReferenciaBancaria.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsReferenciaBancaria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposReferenciaBancaria.add(this.jPanelfecha_emisionReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);



	if(iXPanelCamposReferenciaBancaria % 1==0) {
		iXPanelCamposReferenciaBancaria=0;
		iYPanelCamposReferenciaBancaria++;
	}
	this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
	this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsReferenciaBancaria.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsReferenciaBancaria.gridy = iYPanelCamposReferenciaBancaria;
	this.gridBagConstraintsReferenciaBancaria.gridx = iXPanelCamposReferenciaBancaria++;
	this.gridBagConstraintsReferenciaBancaria.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsReferenciaBancaria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposReferenciaBancaria.add(this.jPanelfecha_vencimientoReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);



	if(iXPanelCamposReferenciaBancaria % 1==0) {
		iXPanelCamposReferenciaBancaria=0;
		iYPanelCamposReferenciaBancaria++;
	}
	this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
	this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsReferenciaBancaria.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsReferenciaBancaria.gridy = iYPanelCamposReferenciaBancaria;
	this.gridBagConstraintsReferenciaBancaria.gridx = iXPanelCamposReferenciaBancaria++;
	this.gridBagConstraintsReferenciaBancaria.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsReferenciaBancaria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposReferenciaBancaria.add(this.jPanelcupoReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);



	if(iXPanelCamposReferenciaBancaria % 1==0) {
		iXPanelCamposReferenciaBancaria=0;
		iYPanelCamposReferenciaBancaria++;
	}
	this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
	this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsReferenciaBancaria.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsReferenciaBancaria.gridy = iYPanelCamposReferenciaBancaria;
	this.gridBagConstraintsReferenciaBancaria.gridx = iXPanelCamposReferenciaBancaria++;
	this.gridBagConstraintsReferenciaBancaria.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsReferenciaBancaria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposReferenciaBancaria.add(this.jPaneltiene_creditoReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);



	if(iXPanelCamposReferenciaBancaria % 1==0) {
		iXPanelCamposReferenciaBancaria=0;
		iYPanelCamposReferenciaBancaria++;
	}
	this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
	this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsReferenciaBancaria.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsReferenciaBancaria.gridy = iYPanelCamposReferenciaBancaria;
	this.gridBagConstraintsReferenciaBancaria.gridx = iXPanelCamposReferenciaBancaria++;
	this.gridBagConstraintsReferenciaBancaria.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsReferenciaBancaria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposReferenciaBancaria.add(this.jPanelnumero_creditosReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);



	if(iXPanelCamposReferenciaBancaria % 1==0) {
		iXPanelCamposReferenciaBancaria=0;
		iYPanelCamposReferenciaBancaria++;
	}
	this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
	this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsReferenciaBancaria.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsReferenciaBancaria.gridy = iYPanelCamposReferenciaBancaria;
	this.gridBagConstraintsReferenciaBancaria.gridx = iXPanelCamposReferenciaBancaria++;
	this.gridBagConstraintsReferenciaBancaria.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsReferenciaBancaria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposReferenciaBancaria.add(this.jPaneltiene_protestosReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);



	if(iXPanelCamposReferenciaBancaria % 1==0) {
		iXPanelCamposReferenciaBancaria=0;
		iYPanelCamposReferenciaBancaria++;
	}
	this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
	this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsReferenciaBancaria.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsReferenciaBancaria.gridy = iYPanelCamposReferenciaBancaria;
	this.gridBagConstraintsReferenciaBancaria.gridx = iXPanelCamposReferenciaBancaria++;
	this.gridBagConstraintsReferenciaBancaria.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsReferenciaBancaria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposReferenciaBancaria.add(this.jPanelnumero_protestosReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);



	if(iXPanelCamposReferenciaBancaria % 1==0) {
		iXPanelCamposReferenciaBancaria=0;
		iYPanelCamposReferenciaBancaria++;
	}
	this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
	this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsReferenciaBancaria.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsReferenciaBancaria.gridy = iYPanelCamposReferenciaBancaria;
	this.gridBagConstraintsReferenciaBancaria.gridx = iXPanelCamposReferenciaBancaria++;
	this.gridBagConstraintsReferenciaBancaria.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsReferenciaBancaria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposReferenciaBancaria.add(this.jPanelsaldos_promediosReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);



	if(iXPanelCamposReferenciaBancaria % 1==0) {
		iXPanelCamposReferenciaBancaria=0;
		iYPanelCamposReferenciaBancaria++;
	}
	this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
	this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsReferenciaBancaria.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsReferenciaBancaria.gridy = iYPanelCamposReferenciaBancaria;
	this.gridBagConstraintsReferenciaBancaria.gridx = iXPanelCamposReferenciaBancaria++;
	this.gridBagConstraintsReferenciaBancaria.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsReferenciaBancaria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposReferenciaBancaria.add(this.jPanelpropietario_cuentaReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);



	if(iXPanelCamposReferenciaBancaria % 1==0) {
		iXPanelCamposReferenciaBancaria=0;
		iYPanelCamposReferenciaBancaria++;
	}
	this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
	this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsReferenciaBancaria.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsReferenciaBancaria.gridy = iYPanelCamposReferenciaBancaria;
	this.gridBagConstraintsReferenciaBancaria.gridx = iXPanelCamposReferenciaBancaria++;
	this.gridBagConstraintsReferenciaBancaria.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsReferenciaBancaria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposReferenciaBancaria.add(this.jPanelid_tipo_valoracionReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);



	if(iXPanelCamposReferenciaBancaria % 1==0) {
		iXPanelCamposReferenciaBancaria=0;
		iYPanelCamposReferenciaBancaria++;
	}
	this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
	this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsReferenciaBancaria.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsReferenciaBancaria.gridy = iYPanelCamposReferenciaBancaria;
	this.gridBagConstraintsReferenciaBancaria.gridx = iXPanelCamposReferenciaBancaria++;
	this.gridBagConstraintsReferenciaBancaria.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsReferenciaBancaria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposReferenciaBancaria.add(this.jPanelesactivoReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);



	if(iXPanelCamposReferenciaBancaria % 1==0) {
		iXPanelCamposReferenciaBancaria=0;
		iYPanelCamposReferenciaBancaria++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
	this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsReferenciaBancaria.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsReferenciaBancaria.gridy = iYPanelCamposOcultosReferenciaBancaria;
	this.gridBagConstraintsReferenciaBancaria.gridx = iXPanelCamposOcultosReferenciaBancaria++;
	this.gridBagConstraintsReferenciaBancaria.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsReferenciaBancaria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosReferenciaBancaria.add(this.jPanelid_empresaReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);



	if(iXPanelCamposOcultosReferenciaBancaria % 1==0) {
		iXPanelCamposOcultosReferenciaBancaria=0;
		iYPanelCamposOcultosReferenciaBancaria++;
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
			
		GridBagLayout gridaBagLayoutAccionesReferenciaBancaria= new GridBagLayout();
		this.jPanelAccionesReferenciaBancaria.setLayout(gridaBagLayoutAccionesReferenciaBancaria);
		
		GridBagLayout gridaBagLayoutAccionesFormularioReferenciaBancaria= new GridBagLayout();
		this.jPanelAccionesFormularioReferenciaBancaria.setLayout(gridaBagLayoutAccionesFormularioReferenciaBancaria);
		
		this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
		this.gridBagConstraintsReferenciaBancaria.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsReferenciaBancaria.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioReferenciaBancaria.add(this.jComboBoxTiposAccionesFormularioReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);

		this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
		this.gridBagConstraintsReferenciaBancaria.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsReferenciaBancaria.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioReferenciaBancaria.add(this.jCheckBoxPostAccionNuevoReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.referenciabancariaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
			this.gridBagConstraintsReferenciaBancaria.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsReferenciaBancaria.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioReferenciaBancaria.add(this.jCheckBoxPostAccionSinCerrarReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.referenciabancariaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.referenciabancariaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
			this.gridBagConstraintsReferenciaBancaria.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsReferenciaBancaria.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioReferenciaBancaria.add(this.jCheckBoxPostAccionSinMensajeReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
		this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsReferenciaBancaria.gridy = 0;
		this.gridBagConstraintsReferenciaBancaria.gridx = iPosXAccion++;
			
		this.jPanelAccionesReferenciaBancaria.add(this.jButtonModificarReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);							

		this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
		this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsReferenciaBancaria.gridy = 0;
		this.gridBagConstraintsReferenciaBancaria.gridx =iPosXAccion++;
			
		this.jPanelAccionesReferenciaBancaria.add(this.jButtonEliminarReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);
		
			
		this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
		this.gridBagConstraintsReferenciaBancaria.gridy = 0;		
		this.gridBagConstraintsReferenciaBancaria.gridx = iPosXAccion++;
		
		this.jPanelAccionesReferenciaBancaria.add(this.jButtonActualizarReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);


		this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
		this.gridBagConstraintsReferenciaBancaria.gridy = 0;		
		this.gridBagConstraintsReferenciaBancaria.gridx = iPosXAccion++;
		
		this.jPanelAccionesReferenciaBancaria.add(this.jButtonGuardarCambiosReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);	
		
		this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
		this.gridBagConstraintsReferenciaBancaria.gridy = 0;		
		this.gridBagConstraintsReferenciaBancaria.gridx =iPosXAccion++;
		
		this.jPanelAccionesReferenciaBancaria.add(this.jButtonCancelarReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutReferenciaBancaria = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutReferenciaBancaria);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.referenciabancariaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();						
			this.gridBagConstraintsReferenciaBancaria.gridy = iGridyPrincipal++;
			this.gridBagConstraintsReferenciaBancaria.gridx = 0;		
			//this.gridBagConstraintsReferenciaBancaria.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReferenciaBancaria.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsReferenciaBancaria.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
		this.gridBagConstraintsReferenciaBancaria.gridy =iGridyPrincipal++;
		this.gridBagConstraintsReferenciaBancaria.gridx =0;
		this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsReferenciaBancaria.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ReferenciaBancariaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleReferenciaBancaria = new ReferenciaBancariaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Referencia Bancaria DATOS");
			
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
			
	        //this.setTitle("[FOR] - Referencia Bancaria DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Referencia Bancaria Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ReferenciaBancariaModel referenciabancariaModel=new ReferenciaBancariaModel(this);
			
			//SI USARA CLASE INTERNA
			//ReferenciaBancariaModel.ReferenciaBancariaFocusTraversalPolicy referenciabancariaFocusTraversalPolicy = referenciabancariaModel.new ReferenciaBancariaFocusTraversalPolicy(this);
			
			//referenciabancariaFocusTraversalPolicy.setreferenciabancariaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(referenciabancariaModel);
			
			
			this.jContentPaneDetalleReferenciaBancaria = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleReferenciaBancaria = new GridBagLayout();	
			this.jContentPaneDetalleReferenciaBancaria.setLayout(gridaBagLayoutDetalleReferenciaBancaria);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosReferenciaBancaria = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
				this.gridBagConstraintsReferenciaBancaria.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsReferenciaBancaria.gridx = 0;
					
				
				this.jContentPaneDetalleReferenciaBancaria.add(jTtoolBarDetalleReferenciaBancaria, gridBagConstraintsReferenciaBancaria);								
				
}
			
			this.jScrollPanelDatosEdicionReferenciaBancaria=   new JScrollPane(jContentPaneDetalleReferenciaBancaria,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionReferenciaBancaria.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionReferenciaBancaria.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionReferenciaBancaria.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralReferenciaBancaria=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralReferenciaBancaria.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralReferenciaBancaria.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralReferenciaBancaria.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
			
			
	        this.gridBagConstraintsReferenciaBancaria.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsReferenciaBancaria.gridx = 0;
	        
			this.jContentPaneDetalleReferenciaBancaria.add(jPanelCamposReferenciaBancaria, gridBagConstraintsReferenciaBancaria);
			
			
			
			
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
						&& referenciabancariaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.referenciabancariaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsReferenciaBancaria= new GridBagConstraints();
						this.gridBagConstraintsReferenciaBancaria.gridy = iGridyRelaciones++;
						this.gridBagConstraintsReferenciaBancaria.gridx = 0;
						this.jContentPaneDetalleReferenciaBancaria.add(this.jTabbedPaneRelacionesReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesReferenciaBancaria.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosReferenciaBancaria.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
					this.gridBagConstraintsReferenciaBancaria.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsReferenciaBancaria.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsReferenciaBancaria.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsReferenciaBancaria.gridx = 0;
					
				
					this.jContentPaneDetalleReferenciaBancaria.add(jPanelCamposOcultosReferenciaBancaria, gridBagConstraintsReferenciaBancaria);
				
					this.jPanelCamposOcultosReferenciaBancaria.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
			this.gridBagConstraintsReferenciaBancaria.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsReferenciaBancaria.gridx = 0;
	        this.gridBagConstraintsReferenciaBancaria.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleReferenciaBancaria.add(this.jPanelAccionesFormularioReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);							
			
			
			
			this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
	        this.gridBagConstraintsReferenciaBancaria.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsReferenciaBancaria.gridx = 0;
	        
			
			this.jContentPaneDetalleReferenciaBancaria.add(this.jPanelAccionesReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionReferenciaBancaria);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionReferenciaBancaria=   new JScrollPane(this.jPanelCamposReferenciaBancaria,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionReferenciaBancaria.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionReferenciaBancaria.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionReferenciaBancaria.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
			this.gridBagConstraintsReferenciaBancaria.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsReferenciaBancaria.gridx = 0;
			this.gridBagConstraintsReferenciaBancaria.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsReferenciaBancaria.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsReferenciaBancaria.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
			this.gridBagConstraintsReferenciaBancaria.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsReferenciaBancaria.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);			
			
			this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
			this.gridBagConstraintsReferenciaBancaria.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsReferenciaBancaria.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
		this.gridBagConstraintsReferenciaBancaria.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsReferenciaBancaria.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);
			
			
		this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
		this.gridBagConstraintsReferenciaBancaria.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsReferenciaBancaria.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);
		
			
		this.gridBagConstraintsReferenciaBancaria = new GridBagConstraints();
		this.gridBagConstraintsReferenciaBancaria.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsReferenciaBancaria.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesReferenciaBancaria, this.gridBagConstraintsReferenciaBancaria);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralReferenciaBancaria;//jContentPane;
		
		return jScrollPanelDatosEdicionReferenciaBancaria;
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
