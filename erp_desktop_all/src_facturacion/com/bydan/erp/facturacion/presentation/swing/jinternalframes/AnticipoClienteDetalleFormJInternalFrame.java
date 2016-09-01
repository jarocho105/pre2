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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.facturacion.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.facturacion.util.AnticipoClienteConstantesFunciones;

import com.bydan.erp.facturacion.business.logic.*;
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
public class AnticipoClienteDetalleFormJInternalFrame extends AnticipoClienteBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleAnticipoCliente;
	
	protected JMenuBar jmenuBarDetalleAnticipoCliente;
	
	protected JMenu jmenuDetalleAnticipoCliente;
	protected JMenu jmenuDetalleArchivoAnticipoCliente;
	protected JMenu jmenuDetalleAccionesAnticipoCliente;
	protected JMenu jmenuDetalleDatosAnticipoCliente;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleAnticipoCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutAnticipoCliente;	
	protected GridBagConstraints gridBagConstraintsAnticipoCliente;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected AnticipoClienteBeanSwingJInternalFrameAdditional jInternalFrameDetalleAnticipoCliente;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected EstadoAntiClienteBeanSwingJInternalFrame estadoanticlienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadoanticliente="";

	protected TipoGrupoFormaPagoBeanSwingJInternalFrame tipogrupoformapagoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipogrupoformapago="";
	
	public AnticipoClienteSessionBean anticipoclienteSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public EstadoAntiClienteSessionBean estadoanticlienteSessionBean;
	public TipoGrupoFormaPagoSessionBean tipogrupoformapagoSessionBean;	
	
	public AnticipoClienteLogic anticipoclienteLogic;
	
	public JScrollPane jScrollPanelDatosAnticipoCliente;
	public JScrollPane jScrollPanelDatosEdicionAnticipoCliente;
	public JScrollPane jScrollPanelDatosGeneralAnticipoCliente;
	
	protected JPanel jPanelCamposAnticipoCliente;    
	protected JPanel jPanelCamposOcultosAnticipoCliente;    	
	protected JPanel jPanelAccionesAnticipoCliente;
	protected JPanel jPanelAccionesFormularioAnticipoCliente;
    
	
	
	protected Integer iXPanelCamposAnticipoCliente=0;
	protected Integer iYPanelCamposAnticipoCliente=0;
	
	protected Integer iXPanelCamposOcultosAnticipoCliente=0;
	protected Integer iYPanelCamposOcultosAnticipoCliente=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoAnticipoCliente;
	public JButton jButtonModificarAnticipoCliente;
	public JButton jButtonActualizarAnticipoCliente;
    public JButton jButtonEliminarAnticipoCliente;
	public JButton jButtonCancelarAnticipoCliente;
    public JButton jButtonGuardarCambiosAnticipoCliente;
	public JButton jButtonGuardarCambiosTablaAnticipoCliente;
	protected JButton jButtonCerrarAnticipoCliente;
	
	
	protected JButton jButtonProcesarInformacionAnticipoCliente;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoAnticipoCliente;
	protected JCheckBox jCheckBoxPostAccionSinCerrarAnticipoCliente;
	protected JCheckBox jCheckBoxPostAccionSinMensajeAnticipoCliente;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarAnticipoCliente;
	protected JButton jButtonModificarToolBarAnticipoCliente;
	protected JButton jButtonActualizarToolBarAnticipoCliente;
    protected JButton jButtonEliminarToolBarAnticipoCliente;
	protected JButton jButtonCancelarToolBarAnticipoCliente;
    protected JButton jButtonGuardarCambiosToolBarAnticipoCliente;
	protected JButton jButtonGuardarCambiosTablaToolBarAnticipoCliente;
	protected JButton jButtonMostrarOcultarTablaToolBarAnticipoCliente;
	protected JButton jButtonCerrarToolBarAnticipoCliente;
	
	protected JButton jButtonProcesarInformacionToolBarAnticipoCliente;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoAnticipoCliente;
	protected JMenuItem jMenuItemModificarAnticipoCliente;
	protected JMenuItem jMenuItemActualizarAnticipoCliente;
    protected JMenuItem jMenuItemEliminarAnticipoCliente;
	protected JMenuItem jMenuItemCancelarAnticipoCliente;
    protected JMenuItem jMenuItemGuardarCambiosAnticipoCliente;
	protected JMenuItem jMenuItemGuardarCambiosTablaAnticipoCliente;
	protected JMenuItem jMenuItemCerrarAnticipoCliente;
	protected JMenuItem jMenuItemDetalleCerrarAnticipoCliente;
	protected JMenuItem jMenuItemDetalleMostarOcultarAnticipoCliente;
	
	protected JMenuItem jMenuItemProcesarInformacionAnticipoCliente;
	protected JMenuItem jMenuItemNuevoGuardarCambiosAnticipoCliente;
	protected JMenuItem jMenuItemMostrarOcultarAnticipoCliente;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesAnticipoCliente;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesAnticipoCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesAnticipoCliente;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioAnticipoCliente;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidAnticipoCliente;
	public JLabel jLabelIdAnticipoCliente;
	public JLabel jLabelidAnticipoCliente;
	public JButton jButtonidAnticipoClienteBusqueda= new JButtonMe();

	public JPanel jPanelfechaAnticipoCliente;
	public JLabel jLabelfechaAnticipoCliente;
	//public JFormattedTextField jDateChooserfechaAnticipoCliente;

	public JDateChooser jDateChooserfechaAnticipoCliente;
	public JButton jButtonfechaAnticipoClienteBusqueda= new JButtonMe();

	public JPanel jPanelvalorAnticipoCliente;
	public JLabel jLabelvalorAnticipoCliente;
	public JTextField jTextFieldvalorAnticipoCliente;
	public JButton jButtonvalorAnticipoClienteBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionAnticipoCliente;
	public JLabel jLabeldescripcionAnticipoCliente;
	public JTextArea jTextAreadescripcionAnticipoCliente;
	public JScrollPane jscrollPanedescripcionAnticipoCliente;
	public JButton jButtondescripcionAnticipoClienteBusqueda= new JButtonMe();

	public JPanel jPanelvalor_adicionalAnticipoCliente;
	public JLabel jLabelvalor_adicionalAnticipoCliente;
	public JTextField jTextFieldvalor_adicionalAnticipoCliente;
	public JButton jButtonvalor_adicionalAnticipoClienteBusqueda= new JButtonMe();

	public JPanel jPanelvalor_prestamoAnticipoCliente;
	public JLabel jLabelvalor_prestamoAnticipoCliente;
	public JTextField jTextFieldvalor_prestamoAnticipoCliente;
	public JButton jButtonvalor_prestamoAnticipoClienteBusqueda= new JButtonMe();

	public JPanel jPanelingreso1AnticipoCliente;
	public JLabel jLabelingreso1AnticipoCliente;
	public JTextField jTextFieldingreso1AnticipoCliente;
	public JButton jButtoningreso1AnticipoClienteBusqueda= new JButtonMe();

	public JPanel jPanelingreso2AnticipoCliente;
	public JLabel jLabelingreso2AnticipoCliente;
	public JTextField jTextFieldingreso2AnticipoCliente;
	public JButton jButtoningreso2AnticipoClienteBusqueda= new JButtonMe();

	public JPanel jPanelingreso3AnticipoCliente;
	public JLabel jLabelingreso3AnticipoCliente;
	public JTextField jTextFieldingreso3AnticipoCliente;
	public JButton jButtoningreso3AnticipoClienteBusqueda= new JButtonMe();

	public JPanel jPanelingreso4AnticipoCliente;
	public JLabel jLabelingreso4AnticipoCliente;
	public JTextField jTextFieldingreso4AnticipoCliente;
	public JButton jButtoningreso4AnticipoClienteBusqueda= new JButtonMe();

	public JPanel jPanelingreso5AnticipoCliente;
	public JLabel jLabelingreso5AnticipoCliente;
	public JTextField jTextFieldingreso5AnticipoCliente;
	public JButton jButtoningreso5AnticipoClienteBusqueda= new JButtonMe();

	public JPanel jPaneldescuento1AnticipoCliente;
	public JLabel jLabeldescuento1AnticipoCliente;
	public JTextField jTextFielddescuento1AnticipoCliente;
	public JButton jButtondescuento1AnticipoClienteBusqueda= new JButtonMe();

	public JPanel jPaneldescuento2AnticipoCliente;
	public JLabel jLabeldescuento2AnticipoCliente;
	public JTextField jTextFielddescuento2AnticipoCliente;
	public JButton jButtondescuento2AnticipoClienteBusqueda= new JButtonMe();

	public JPanel jPaneldescuento3AnticipoCliente;
	public JLabel jLabeldescuento3AnticipoCliente;
	public JTextField jTextFielddescuento3AnticipoCliente;
	public JButton jButtondescuento3AnticipoClienteBusqueda= new JButtonMe();

	public JPanel jPaneldescuento4AnticipoCliente;
	public JLabel jLabeldescuento4AnticipoCliente;
	public JTextField jTextFielddescuento4AnticipoCliente;
	public JButton jButtondescuento4AnticipoClienteBusqueda= new JButtonMe();

	public JPanel jPaneldescuento5AnticipoCliente;
	public JLabel jLabeldescuento5AnticipoCliente;
	public JTextField jTextFielddescuento5AnticipoCliente;
	public JButton jButtondescuento5AnticipoClienteBusqueda= new JButtonMe();

	public JPanel jPaneltipo_ingresoAnticipoCliente;
	public JLabel jLabeltipo_ingresoAnticipoCliente;
	public JTextField jTextFieldtipo_ingresoAnticipoCliente;
	public JButton jButtontipo_ingresoAnticipoClienteBusqueda= new JButtonMe();

	public JPanel jPaneltipo_descuentoAnticipoCliente;
	public JLabel jLabeltipo_descuentoAnticipoCliente;
	public JTextField jTextFieldtipo_descuentoAnticipoCliente;
	public JButton jButtontipo_descuentoAnticipoClienteBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaAnticipoCliente;
	public JLabel jLabelid_empresaAnticipoCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaAnticipoCliente;
	public JButton jButtonid_empresaAnticipoCliente= new JButtonMe();
	public JButton jButtonid_empresaAnticipoClienteUpdate= new JButtonMe();
	public JButton jButtonid_empresaAnticipoClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_empleadoAnticipoCliente;
	public JLabel jLabelid_empleadoAnticipoCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoAnticipoCliente;
	public JButton jButtonid_empleadoAnticipoCliente= new JButtonMe();
	public JButton jButtonid_empleadoAnticipoClienteUpdate= new JButtonMe();
	public JButton jButtonid_empleadoAnticipoClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_estado_anti_clienteAnticipoCliente;
	public JLabel jLabelid_estado_anti_clienteAnticipoCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_anti_clienteAnticipoCliente;
	public JButton jButtonid_estado_anti_clienteAnticipoCliente= new JButtonMe();
	public JButton jButtonid_estado_anti_clienteAnticipoClienteUpdate= new JButtonMe();
	public JButton jButtonid_estado_anti_clienteAnticipoClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_grupo_forma_pagoAnticipoCliente;
	public JLabel jLabelid_tipo_grupo_forma_pagoAnticipoCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_grupo_forma_pagoAnticipoCliente;
	public JButton jButtonid_tipo_grupo_forma_pagoAnticipoCliente= new JButtonMe();
	public JButton jButtonid_tipo_grupo_forma_pagoAnticipoClienteUpdate= new JButtonMe();
	public JButton jButtonid_tipo_grupo_forma_pagoAnticipoClienteBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesAnticipoCliente;
	
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
	public int iHeightFormulario=616;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public AnticipoClienteDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposAnticipoCliente=new JPanel();
				this.jPanelAccionesFormularioAnticipoCliente=new JPanel();
				this.jmenuBarDetalleAnticipoCliente=new JMenuBar();
				this.jTtoolBarDetalleAnticipoCliente=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AnticipoClienteDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("AnticipoCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public AnticipoClienteDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("AnticipoCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AnticipoClienteDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("AnticipoCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AnticipoClienteDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("AnticipoCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AnticipoClienteDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("AnticipoCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarAnticipoCliente() {
		return this.jButtonActualizarToolBarAnticipoCliente;
	}
	
	public JButton getjButtonEliminarToolBarAnticipoCliente() {
		return this.jButtonEliminarToolBarAnticipoCliente;
	}
	
	public JButton getjButtonCancelarToolBarAnticipoCliente() {
		return this.jButtonCancelarToolBarAnticipoCliente;
	}		
	
	public JButton getjButtonProcesarInformacionAnticipoCliente() {
		return this.jButtonProcesarInformacionAnticipoCliente;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionAnticipoCliente)	{
		this.jButtonProcesarInformacionAnticipoCliente = jButtonProcesarInformacionAnticipoCliente;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesAnticipoCliente() {
		return this.jComboBoxTiposAccionesAnticipoCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesAnticipoCliente(
			JComboBox jComboBoxTiposRelacionesAnticipoCliente) {
		this.jComboBoxTiposRelacionesAnticipoCliente = jComboBoxTiposRelacionesAnticipoCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesAnticipoCliente(
			JComboBox jComboBoxTiposAccionesAnticipoCliente) {
		this.jComboBoxTiposAccionesAnticipoCliente = jComboBoxTiposAccionesAnticipoCliente;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioAnticipoCliente() {
		return this.jComboBoxTiposAccionesFormularioAnticipoCliente;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioAnticipoCliente(
			JComboBox jComboBoxTiposAccionesFormularioAnticipoCliente) {
		this.jComboBoxTiposAccionesFormularioAnticipoCliente = jComboBoxTiposAccionesFormularioAnticipoCliente;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.anticipoclienteSessionBean=new AnticipoClienteSessionBean();
		
		this.anticipoclienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.anticipoclienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.anticipoclienteSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		AnticipoClienteJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		AnticipoClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		AnticipoClienteJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Anticipo Cliente MANTENIMIENTO"));
		
		
		if(iWidth > 2250) {
			iWidth=2250;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.anticipoclienteSessionBean.getEsGuardarRelacionado()) {
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
	
		AnticipoClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleAnticipoCliente= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarAnticipoCliente=new JButtonMe();
				this.jButtonModificarToolBarAnticipoCliente=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarAnticipoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarAnticipoCliente,this.jTtoolBarDetalleAnticipoCliente,
							"actualizar","actualizar","Actualizar"+" "+AnticipoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarAnticipoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarAnticipoCliente,this.jTtoolBarDetalleAnticipoCliente,
							"eliminar","eliminar","Eliminar"+" "+AnticipoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarAnticipoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarAnticipoCliente,this.jTtoolBarDetalleAnticipoCliente,
							"cancelar","cancelar","Cancelar"+" "+AnticipoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarAnticipoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarAnticipoCliente,this.jTtoolBarDetalleAnticipoCliente,
							"guardarcambios","guardarcambios","Guardar"+" "+AnticipoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarAnticipoCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarAnticipoCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarAnticipoCliente,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleAnticipoCliente=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleAnticipoCliente=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoAnticipoCliente=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesAnticipoCliente=new JMenuMe("Acciones");
		this.jmenuDetalleDatosAnticipoCliente=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoAnticipoCliente= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoAnticipoCliente.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoAnticipoCliente,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoAnticipoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarAnticipoCliente= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarAnticipoCliente.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarAnticipoCliente,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarAnticipoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarAnticipoCliente= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarAnticipoCliente.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarAnticipoCliente,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarAnticipoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarAnticipoCliente= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarAnticipoCliente.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarAnticipoCliente,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarAnticipoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarAnticipoCliente= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarAnticipoCliente.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarAnticipoCliente,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarAnticipoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosAnticipoCliente= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosAnticipoCliente.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosAnticipoCliente,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosAnticipoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarAnticipoCliente= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarAnticipoCliente.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarAnticipoCliente,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarAnticipoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarAnticipoCliente= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarAnticipoCliente.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarAnticipoCliente,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarAnticipoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarAnticipoCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarAnticipoCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarAnticipoCliente,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarAnticipoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarAnticipoCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarAnticipoCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarAnticipoCliente,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarAnticipoCliente, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoAnticipoCliente.add(this.jMenuItemDetalleCerrarAnticipoCliente);
		
		this.jmenuDetalleAccionesAnticipoCliente.add(this.jMenuItemActualizarAnticipoCliente);
		this.jmenuDetalleAccionesAnticipoCliente.add(this.jMenuItemEliminarAnticipoCliente);
		this.jmenuDetalleAccionesAnticipoCliente.add(this.jMenuItemCancelarAnticipoCliente);		
		
		//this.jmenuDetalleDatosAnticipoCliente.add(this.jMenuItemDetalleAbrirOrderByAnticipoCliente);				
		this.jmenuDetalleDatosAnticipoCliente.add(this.jMenuItemDetalleMostarOcultarAnticipoCliente);				
				
		//this.jmenuDetalleAccionesAnticipoCliente.add(this.jMenuItemGuardarCambiosAnticipoCliente);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoAnticipoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesAnticipoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosAnticipoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleAnticipoCliente.add(this.jmenuDetalleArchivoAnticipoCliente);		
		this.jmenuBarDetalleAnticipoCliente.add(this.jmenuDetalleAccionesAnticipoCliente);		
		this.jmenuBarDetalleAnticipoCliente.add(this.jmenuDetalleDatosAnticipoCliente);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleAnticipoCliente);				
	}
	
	
	public void inicializarElementosCamposAnticipoCliente() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdAnticipoCliente = new JLabelMe();
		jLabelIdAnticipoCliente.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdAnticipoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdAnticipoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdAnticipoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdAnticipoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidAnticipoCliente = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidAnticipoCliente.setToolTipText(AnticipoClienteConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutAnticipoCliente= new GridBagLayout();

		this.jPanelidAnticipoCliente.setLayout(this.gridaBagLayoutAnticipoCliente);

		jLabelidAnticipoCliente = new JLabel();
		jLabelidAnticipoCliente.setText("Id");

		jLabelidAnticipoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidAnticipoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidAnticipoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfechaAnticipoCliente = new JLabelMe();
		this.jLabelfechaAnticipoCliente.setText(""+AnticipoClienteConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaAnticipoCliente.setToolTipText("Fecha");
		this.jLabelfechaAnticipoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaAnticipoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaAnticipoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaAnticipoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaAnticipoCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaAnticipoCliente.setToolTipText(AnticipoClienteConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutAnticipoCliente = new GridBagLayout();
		this.jPanelfechaAnticipoCliente.setLayout(this.gridaBagLayoutAnticipoCliente);


		//jFormattedTextFieldfechaAnticipoCliente= new JFormattedTextFieldMe();

		jDateChooserfechaAnticipoCliente= new JDateChooser();
		jDateChooserfechaAnticipoCliente.setEnabled(false);
		jDateChooserfechaAnticipoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaAnticipoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaAnticipoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaAnticipoCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaAnticipoCliente.setDate(new Date());
		jDateChooserfechaAnticipoCliente.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaAnticipoCliente.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaAnticipoClienteBusqueda= new JButtonMe();
		this.jButtonfechaAnticipoClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaAnticipoClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaAnticipoClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaAnticipoClienteBusqueda.setText("U");
		this.jButtonfechaAnticipoClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaAnticipoClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaAnticipoClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaAnticipoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaAnticipoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaAnticipoClienteBusqueda"));

		if(this.anticipoclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaAnticipoClienteBusqueda.setVisible(false);		}


					
		this.jLabelvalorAnticipoCliente = new JLabelMe();
		this.jLabelvalorAnticipoCliente.setText(""+AnticipoClienteConstantesFunciones.LABEL_VALOR+" : *");
		this.jLabelvalorAnticipoCliente.setToolTipText("Valor");
		this.jLabelvalorAnticipoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorAnticipoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorAnticipoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalorAnticipoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalorAnticipoCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalorAnticipoCliente.setToolTipText(AnticipoClienteConstantesFunciones.LABEL_VALOR);
		this.gridaBagLayoutAnticipoCliente = new GridBagLayout();
		this.jPanelvalorAnticipoCliente.setLayout(this.gridaBagLayoutAnticipoCliente);


		jTextFieldvalorAnticipoCliente= new JTextFieldMe();
		jTextFieldvalorAnticipoCliente.setEnabled(false);
		jTextFieldvalorAnticipoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorAnticipoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorAnticipoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalorAnticipoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalorAnticipoCliente.setText("0.0");

		this.jButtonvalorAnticipoClienteBusqueda= new JButtonMe();
		this.jButtonvalorAnticipoClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorAnticipoClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorAnticipoClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalorAnticipoClienteBusqueda.setText("U");
		this.jButtonvalorAnticipoClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalorAnticipoClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalorAnticipoClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalorAnticipoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalorAnticipoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valorAnticipoClienteBusqueda"));

		if(this.anticipoclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalorAnticipoClienteBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionAnticipoCliente = new JLabelMe();
		this.jLabeldescripcionAnticipoCliente.setText(""+AnticipoClienteConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionAnticipoCliente.setToolTipText("Descripcion");
		this.jLabeldescripcionAnticipoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionAnticipoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionAnticipoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionAnticipoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionAnticipoCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionAnticipoCliente.setToolTipText(AnticipoClienteConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutAnticipoCliente = new GridBagLayout();
		this.jPaneldescripcionAnticipoCliente.setLayout(this.gridaBagLayoutAnticipoCliente);


		jTextAreadescripcionAnticipoCliente= new JTextAreaMe();
		jTextAreadescripcionAnticipoCliente.setEnabled(false);
		jTextAreadescripcionAnticipoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionAnticipoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionAnticipoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionAnticipoCliente.setLineWrap(true);
		jTextAreadescripcionAnticipoCliente.setWrapStyleWord(true);
		jTextAreadescripcionAnticipoCliente.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionAnticipoCliente.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionAnticipoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionAnticipoCliente = new JScrollPane(jTextAreadescripcionAnticipoCliente);
		jscrollPanedescripcionAnticipoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionAnticipoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionAnticipoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionAnticipoClienteBusqueda= new JButtonMe();
		this.jButtondescripcionAnticipoClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionAnticipoClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionAnticipoClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionAnticipoClienteBusqueda.setText("U");
		this.jButtondescripcionAnticipoClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionAnticipoClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionAnticipoClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionAnticipoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionAnticipoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionAnticipoClienteBusqueda"));

		if(this.anticipoclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionAnticipoClienteBusqueda.setVisible(false);		}


					
		this.jLabelvalor_adicionalAnticipoCliente = new JLabelMe();
		this.jLabelvalor_adicionalAnticipoCliente.setText(""+AnticipoClienteConstantesFunciones.LABEL_VALORADICIONAL+" : *");
		this.jLabelvalor_adicionalAnticipoCliente.setToolTipText("Valor Adicional");
		this.jLabelvalor_adicionalAnticipoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_adicionalAnticipoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_adicionalAnticipoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_adicionalAnticipoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_adicionalAnticipoCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_adicionalAnticipoCliente.setToolTipText(AnticipoClienteConstantesFunciones.LABEL_VALORADICIONAL);
		this.gridaBagLayoutAnticipoCliente = new GridBagLayout();
		this.jPanelvalor_adicionalAnticipoCliente.setLayout(this.gridaBagLayoutAnticipoCliente);


		jTextFieldvalor_adicionalAnticipoCliente= new JTextFieldMe();
		jTextFieldvalor_adicionalAnticipoCliente.setEnabled(false);
		jTextFieldvalor_adicionalAnticipoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_adicionalAnticipoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_adicionalAnticipoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_adicionalAnticipoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_adicionalAnticipoCliente.setText("0.0");

		this.jButtonvalor_adicionalAnticipoClienteBusqueda= new JButtonMe();
		this.jButtonvalor_adicionalAnticipoClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_adicionalAnticipoClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_adicionalAnticipoClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_adicionalAnticipoClienteBusqueda.setText("U");
		this.jButtonvalor_adicionalAnticipoClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_adicionalAnticipoClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_adicionalAnticipoClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_adicionalAnticipoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_adicionalAnticipoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_adicionalAnticipoClienteBusqueda"));

		if(this.anticipoclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_adicionalAnticipoClienteBusqueda.setVisible(false);		}


					
		this.jLabelvalor_prestamoAnticipoCliente = new JLabelMe();
		this.jLabelvalor_prestamoAnticipoCliente.setText(""+AnticipoClienteConstantesFunciones.LABEL_VALORPRESTAMO+" : *");
		this.jLabelvalor_prestamoAnticipoCliente.setToolTipText("Valor Prestamo");
		this.jLabelvalor_prestamoAnticipoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_prestamoAnticipoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_prestamoAnticipoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_prestamoAnticipoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_prestamoAnticipoCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_prestamoAnticipoCliente.setToolTipText(AnticipoClienteConstantesFunciones.LABEL_VALORPRESTAMO);
		this.gridaBagLayoutAnticipoCliente = new GridBagLayout();
		this.jPanelvalor_prestamoAnticipoCliente.setLayout(this.gridaBagLayoutAnticipoCliente);


		jTextFieldvalor_prestamoAnticipoCliente= new JTextFieldMe();
		jTextFieldvalor_prestamoAnticipoCliente.setEnabled(false);
		jTextFieldvalor_prestamoAnticipoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_prestamoAnticipoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_prestamoAnticipoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_prestamoAnticipoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_prestamoAnticipoCliente.setText("0.0");

		this.jButtonvalor_prestamoAnticipoClienteBusqueda= new JButtonMe();
		this.jButtonvalor_prestamoAnticipoClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_prestamoAnticipoClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_prestamoAnticipoClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_prestamoAnticipoClienteBusqueda.setText("U");
		this.jButtonvalor_prestamoAnticipoClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_prestamoAnticipoClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_prestamoAnticipoClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_prestamoAnticipoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_prestamoAnticipoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_prestamoAnticipoClienteBusqueda"));

		if(this.anticipoclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_prestamoAnticipoClienteBusqueda.setVisible(false);		}


					
		this.jLabelingreso1AnticipoCliente = new JLabelMe();
		this.jLabelingreso1AnticipoCliente.setText(""+AnticipoClienteConstantesFunciones.LABEL_INGRESO1+" : *");
		this.jLabelingreso1AnticipoCliente.setToolTipText("Ingreso1");
		this.jLabelingreso1AnticipoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelingreso1AnticipoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelingreso1AnticipoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelingreso1AnticipoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelingreso1AnticipoCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelingreso1AnticipoCliente.setToolTipText(AnticipoClienteConstantesFunciones.LABEL_INGRESO1);
		this.gridaBagLayoutAnticipoCliente = new GridBagLayout();
		this.jPanelingreso1AnticipoCliente.setLayout(this.gridaBagLayoutAnticipoCliente);


		jTextFieldingreso1AnticipoCliente= new JTextFieldMe();
		jTextFieldingreso1AnticipoCliente.setEnabled(false);
		jTextFieldingreso1AnticipoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldingreso1AnticipoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldingreso1AnticipoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldingreso1AnticipoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldingreso1AnticipoCliente.setText("0.0");

		this.jButtoningreso1AnticipoClienteBusqueda= new JButtonMe();
		this.jButtoningreso1AnticipoClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoningreso1AnticipoClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoningreso1AnticipoClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoningreso1AnticipoClienteBusqueda.setText("U");
		this.jButtoningreso1AnticipoClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoningreso1AnticipoClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoningreso1AnticipoClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldingreso1AnticipoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldingreso1AnticipoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ingreso1AnticipoClienteBusqueda"));

		if(this.anticipoclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoningreso1AnticipoClienteBusqueda.setVisible(false);		}


					
		this.jLabelingreso2AnticipoCliente = new JLabelMe();
		this.jLabelingreso2AnticipoCliente.setText(""+AnticipoClienteConstantesFunciones.LABEL_INGRESO2+" : *");
		this.jLabelingreso2AnticipoCliente.setToolTipText("Ingreso2");
		this.jLabelingreso2AnticipoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelingreso2AnticipoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelingreso2AnticipoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelingreso2AnticipoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelingreso2AnticipoCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelingreso2AnticipoCliente.setToolTipText(AnticipoClienteConstantesFunciones.LABEL_INGRESO2);
		this.gridaBagLayoutAnticipoCliente = new GridBagLayout();
		this.jPanelingreso2AnticipoCliente.setLayout(this.gridaBagLayoutAnticipoCliente);


		jTextFieldingreso2AnticipoCliente= new JTextFieldMe();
		jTextFieldingreso2AnticipoCliente.setEnabled(false);
		jTextFieldingreso2AnticipoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldingreso2AnticipoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldingreso2AnticipoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldingreso2AnticipoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldingreso2AnticipoCliente.setText("0.0");

		this.jButtoningreso2AnticipoClienteBusqueda= new JButtonMe();
		this.jButtoningreso2AnticipoClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoningreso2AnticipoClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoningreso2AnticipoClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoningreso2AnticipoClienteBusqueda.setText("U");
		this.jButtoningreso2AnticipoClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoningreso2AnticipoClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoningreso2AnticipoClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldingreso2AnticipoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldingreso2AnticipoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ingreso2AnticipoClienteBusqueda"));

		if(this.anticipoclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoningreso2AnticipoClienteBusqueda.setVisible(false);		}


					
		this.jLabelingreso3AnticipoCliente = new JLabelMe();
		this.jLabelingreso3AnticipoCliente.setText(""+AnticipoClienteConstantesFunciones.LABEL_INGRESO3+" : *");
		this.jLabelingreso3AnticipoCliente.setToolTipText("Ingreso3");
		this.jLabelingreso3AnticipoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelingreso3AnticipoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelingreso3AnticipoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelingreso3AnticipoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelingreso3AnticipoCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelingreso3AnticipoCliente.setToolTipText(AnticipoClienteConstantesFunciones.LABEL_INGRESO3);
		this.gridaBagLayoutAnticipoCliente = new GridBagLayout();
		this.jPanelingreso3AnticipoCliente.setLayout(this.gridaBagLayoutAnticipoCliente);


		jTextFieldingreso3AnticipoCliente= new JTextFieldMe();
		jTextFieldingreso3AnticipoCliente.setEnabled(false);
		jTextFieldingreso3AnticipoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldingreso3AnticipoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldingreso3AnticipoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldingreso3AnticipoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldingreso3AnticipoCliente.setText("0.0");

		this.jButtoningreso3AnticipoClienteBusqueda= new JButtonMe();
		this.jButtoningreso3AnticipoClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoningreso3AnticipoClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoningreso3AnticipoClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoningreso3AnticipoClienteBusqueda.setText("U");
		this.jButtoningreso3AnticipoClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoningreso3AnticipoClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoningreso3AnticipoClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldingreso3AnticipoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldingreso3AnticipoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ingreso3AnticipoClienteBusqueda"));

		if(this.anticipoclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoningreso3AnticipoClienteBusqueda.setVisible(false);		}


					
		this.jLabelingreso4AnticipoCliente = new JLabelMe();
		this.jLabelingreso4AnticipoCliente.setText(""+AnticipoClienteConstantesFunciones.LABEL_INGRESO4+" : *");
		this.jLabelingreso4AnticipoCliente.setToolTipText("Ingreso4");
		this.jLabelingreso4AnticipoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelingreso4AnticipoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelingreso4AnticipoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelingreso4AnticipoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelingreso4AnticipoCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelingreso4AnticipoCliente.setToolTipText(AnticipoClienteConstantesFunciones.LABEL_INGRESO4);
		this.gridaBagLayoutAnticipoCliente = new GridBagLayout();
		this.jPanelingreso4AnticipoCliente.setLayout(this.gridaBagLayoutAnticipoCliente);


		jTextFieldingreso4AnticipoCliente= new JTextFieldMe();
		jTextFieldingreso4AnticipoCliente.setEnabled(false);
		jTextFieldingreso4AnticipoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldingreso4AnticipoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldingreso4AnticipoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldingreso4AnticipoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldingreso4AnticipoCliente.setText("0.0");

		this.jButtoningreso4AnticipoClienteBusqueda= new JButtonMe();
		this.jButtoningreso4AnticipoClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoningreso4AnticipoClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoningreso4AnticipoClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoningreso4AnticipoClienteBusqueda.setText("U");
		this.jButtoningreso4AnticipoClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoningreso4AnticipoClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoningreso4AnticipoClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldingreso4AnticipoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldingreso4AnticipoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ingreso4AnticipoClienteBusqueda"));

		if(this.anticipoclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoningreso4AnticipoClienteBusqueda.setVisible(false);		}


					
		this.jLabelingreso5AnticipoCliente = new JLabelMe();
		this.jLabelingreso5AnticipoCliente.setText(""+AnticipoClienteConstantesFunciones.LABEL_INGRESO5+" : *");
		this.jLabelingreso5AnticipoCliente.setToolTipText("Ingreso5");
		this.jLabelingreso5AnticipoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelingreso5AnticipoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelingreso5AnticipoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelingreso5AnticipoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelingreso5AnticipoCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelingreso5AnticipoCliente.setToolTipText(AnticipoClienteConstantesFunciones.LABEL_INGRESO5);
		this.gridaBagLayoutAnticipoCliente = new GridBagLayout();
		this.jPanelingreso5AnticipoCliente.setLayout(this.gridaBagLayoutAnticipoCliente);


		jTextFieldingreso5AnticipoCliente= new JTextFieldMe();
		jTextFieldingreso5AnticipoCliente.setEnabled(false);
		jTextFieldingreso5AnticipoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldingreso5AnticipoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldingreso5AnticipoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldingreso5AnticipoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldingreso5AnticipoCliente.setText("0.0");

		this.jButtoningreso5AnticipoClienteBusqueda= new JButtonMe();
		this.jButtoningreso5AnticipoClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoningreso5AnticipoClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoningreso5AnticipoClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoningreso5AnticipoClienteBusqueda.setText("U");
		this.jButtoningreso5AnticipoClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoningreso5AnticipoClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoningreso5AnticipoClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldingreso5AnticipoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldingreso5AnticipoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ingreso5AnticipoClienteBusqueda"));

		if(this.anticipoclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoningreso5AnticipoClienteBusqueda.setVisible(false);		}


					
		this.jLabeldescuento1AnticipoCliente = new JLabelMe();
		this.jLabeldescuento1AnticipoCliente.setText(""+AnticipoClienteConstantesFunciones.LABEL_DESCUENTO1+" : *");
		this.jLabeldescuento1AnticipoCliente.setToolTipText("Descuento1");
		this.jLabeldescuento1AnticipoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuento1AnticipoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuento1AnticipoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescuento1AnticipoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescuento1AnticipoCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescuento1AnticipoCliente.setToolTipText(AnticipoClienteConstantesFunciones.LABEL_DESCUENTO1);
		this.gridaBagLayoutAnticipoCliente = new GridBagLayout();
		this.jPaneldescuento1AnticipoCliente.setLayout(this.gridaBagLayoutAnticipoCliente);


		jTextFielddescuento1AnticipoCliente= new JTextFieldMe();
		jTextFielddescuento1AnticipoCliente.setEnabled(false);
		jTextFielddescuento1AnticipoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento1AnticipoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento1AnticipoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddescuento1AnticipoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddescuento1AnticipoCliente.setText("0.0");

		this.jButtondescuento1AnticipoClienteBusqueda= new JButtonMe();
		this.jButtondescuento1AnticipoClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento1AnticipoClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento1AnticipoClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescuento1AnticipoClienteBusqueda.setText("U");
		this.jButtondescuento1AnticipoClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescuento1AnticipoClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescuento1AnticipoClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddescuento1AnticipoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddescuento1AnticipoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descuento1AnticipoClienteBusqueda"));

		if(this.anticipoclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescuento1AnticipoClienteBusqueda.setVisible(false);		}


					
		this.jLabeldescuento2AnticipoCliente = new JLabelMe();
		this.jLabeldescuento2AnticipoCliente.setText(""+AnticipoClienteConstantesFunciones.LABEL_DESCUENTO2+" : *");
		this.jLabeldescuento2AnticipoCliente.setToolTipText("Descuento2");
		this.jLabeldescuento2AnticipoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuento2AnticipoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuento2AnticipoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescuento2AnticipoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescuento2AnticipoCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescuento2AnticipoCliente.setToolTipText(AnticipoClienteConstantesFunciones.LABEL_DESCUENTO2);
		this.gridaBagLayoutAnticipoCliente = new GridBagLayout();
		this.jPaneldescuento2AnticipoCliente.setLayout(this.gridaBagLayoutAnticipoCliente);


		jTextFielddescuento2AnticipoCliente= new JTextFieldMe();
		jTextFielddescuento2AnticipoCliente.setEnabled(false);
		jTextFielddescuento2AnticipoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento2AnticipoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento2AnticipoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddescuento2AnticipoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddescuento2AnticipoCliente.setText("0.0");

		this.jButtondescuento2AnticipoClienteBusqueda= new JButtonMe();
		this.jButtondescuento2AnticipoClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento2AnticipoClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento2AnticipoClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescuento2AnticipoClienteBusqueda.setText("U");
		this.jButtondescuento2AnticipoClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescuento2AnticipoClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescuento2AnticipoClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddescuento2AnticipoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddescuento2AnticipoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descuento2AnticipoClienteBusqueda"));

		if(this.anticipoclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescuento2AnticipoClienteBusqueda.setVisible(false);		}


					
		this.jLabeldescuento3AnticipoCliente = new JLabelMe();
		this.jLabeldescuento3AnticipoCliente.setText(""+AnticipoClienteConstantesFunciones.LABEL_DESCUENTO3+" : *");
		this.jLabeldescuento3AnticipoCliente.setToolTipText("Descuento3");
		this.jLabeldescuento3AnticipoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuento3AnticipoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuento3AnticipoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescuento3AnticipoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescuento3AnticipoCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescuento3AnticipoCliente.setToolTipText(AnticipoClienteConstantesFunciones.LABEL_DESCUENTO3);
		this.gridaBagLayoutAnticipoCliente = new GridBagLayout();
		this.jPaneldescuento3AnticipoCliente.setLayout(this.gridaBagLayoutAnticipoCliente);


		jTextFielddescuento3AnticipoCliente= new JTextFieldMe();
		jTextFielddescuento3AnticipoCliente.setEnabled(false);
		jTextFielddescuento3AnticipoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento3AnticipoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento3AnticipoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddescuento3AnticipoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddescuento3AnticipoCliente.setText("0.0");

		this.jButtondescuento3AnticipoClienteBusqueda= new JButtonMe();
		this.jButtondescuento3AnticipoClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento3AnticipoClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento3AnticipoClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescuento3AnticipoClienteBusqueda.setText("U");
		this.jButtondescuento3AnticipoClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescuento3AnticipoClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescuento3AnticipoClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddescuento3AnticipoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddescuento3AnticipoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descuento3AnticipoClienteBusqueda"));

		if(this.anticipoclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescuento3AnticipoClienteBusqueda.setVisible(false);		}


					
		this.jLabeldescuento4AnticipoCliente = new JLabelMe();
		this.jLabeldescuento4AnticipoCliente.setText(""+AnticipoClienteConstantesFunciones.LABEL_DESCUENTO4+" : *");
		this.jLabeldescuento4AnticipoCliente.setToolTipText("Descuento4");
		this.jLabeldescuento4AnticipoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuento4AnticipoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuento4AnticipoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescuento4AnticipoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescuento4AnticipoCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescuento4AnticipoCliente.setToolTipText(AnticipoClienteConstantesFunciones.LABEL_DESCUENTO4);
		this.gridaBagLayoutAnticipoCliente = new GridBagLayout();
		this.jPaneldescuento4AnticipoCliente.setLayout(this.gridaBagLayoutAnticipoCliente);


		jTextFielddescuento4AnticipoCliente= new JTextFieldMe();
		jTextFielddescuento4AnticipoCliente.setEnabled(false);
		jTextFielddescuento4AnticipoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento4AnticipoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento4AnticipoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddescuento4AnticipoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddescuento4AnticipoCliente.setText("0.0");

		this.jButtondescuento4AnticipoClienteBusqueda= new JButtonMe();
		this.jButtondescuento4AnticipoClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento4AnticipoClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento4AnticipoClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescuento4AnticipoClienteBusqueda.setText("U");
		this.jButtondescuento4AnticipoClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescuento4AnticipoClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescuento4AnticipoClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddescuento4AnticipoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddescuento4AnticipoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descuento4AnticipoClienteBusqueda"));

		if(this.anticipoclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescuento4AnticipoClienteBusqueda.setVisible(false);		}


					
		this.jLabeldescuento5AnticipoCliente = new JLabelMe();
		this.jLabeldescuento5AnticipoCliente.setText(""+AnticipoClienteConstantesFunciones.LABEL_DESCUENTO5+" : *");
		this.jLabeldescuento5AnticipoCliente.setToolTipText("Descuento5");
		this.jLabeldescuento5AnticipoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuento5AnticipoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuento5AnticipoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescuento5AnticipoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescuento5AnticipoCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescuento5AnticipoCliente.setToolTipText(AnticipoClienteConstantesFunciones.LABEL_DESCUENTO5);
		this.gridaBagLayoutAnticipoCliente = new GridBagLayout();
		this.jPaneldescuento5AnticipoCliente.setLayout(this.gridaBagLayoutAnticipoCliente);


		jTextFielddescuento5AnticipoCliente= new JTextFieldMe();
		jTextFielddescuento5AnticipoCliente.setEnabled(false);
		jTextFielddescuento5AnticipoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento5AnticipoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento5AnticipoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddescuento5AnticipoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddescuento5AnticipoCliente.setText("0.0");

		this.jButtondescuento5AnticipoClienteBusqueda= new JButtonMe();
		this.jButtondescuento5AnticipoClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento5AnticipoClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento5AnticipoClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescuento5AnticipoClienteBusqueda.setText("U");
		this.jButtondescuento5AnticipoClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescuento5AnticipoClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescuento5AnticipoClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddescuento5AnticipoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddescuento5AnticipoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descuento5AnticipoClienteBusqueda"));

		if(this.anticipoclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescuento5AnticipoClienteBusqueda.setVisible(false);		}


					
		this.jLabeltipo_ingresoAnticipoCliente = new JLabelMe();
		this.jLabeltipo_ingresoAnticipoCliente.setText(""+AnticipoClienteConstantesFunciones.LABEL_TIPOINGRESO+" : *");
		this.jLabeltipo_ingresoAnticipoCliente.setToolTipText("Tipo Ingreso");
		this.jLabeltipo_ingresoAnticipoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltipo_ingresoAnticipoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltipo_ingresoAnticipoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltipo_ingresoAnticipoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltipo_ingresoAnticipoCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltipo_ingresoAnticipoCliente.setToolTipText(AnticipoClienteConstantesFunciones.LABEL_TIPOINGRESO);
		this.gridaBagLayoutAnticipoCliente = new GridBagLayout();
		this.jPaneltipo_ingresoAnticipoCliente.setLayout(this.gridaBagLayoutAnticipoCliente);


		jTextFieldtipo_ingresoAnticipoCliente= new JTextFieldMe();
		jTextFieldtipo_ingresoAnticipoCliente.setEnabled(false);
		jTextFieldtipo_ingresoAnticipoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtipo_ingresoAnticipoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtipo_ingresoAnticipoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtipo_ingresoAnticipoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtipo_ingresoAnticipoCliente.setText("0.0");

		this.jButtontipo_ingresoAnticipoClienteBusqueda= new JButtonMe();
		this.jButtontipo_ingresoAnticipoClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontipo_ingresoAnticipoClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontipo_ingresoAnticipoClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontipo_ingresoAnticipoClienteBusqueda.setText("U");
		this.jButtontipo_ingresoAnticipoClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontipo_ingresoAnticipoClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontipo_ingresoAnticipoClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtipo_ingresoAnticipoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtipo_ingresoAnticipoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"tipo_ingresoAnticipoClienteBusqueda"));

		if(this.anticipoclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontipo_ingresoAnticipoClienteBusqueda.setVisible(false);		}


					
		this.jLabeltipo_descuentoAnticipoCliente = new JLabelMe();
		this.jLabeltipo_descuentoAnticipoCliente.setText(""+AnticipoClienteConstantesFunciones.LABEL_TIPODESCUENTO+" : *");
		this.jLabeltipo_descuentoAnticipoCliente.setToolTipText("Tipo Descuento");
		this.jLabeltipo_descuentoAnticipoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltipo_descuentoAnticipoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltipo_descuentoAnticipoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltipo_descuentoAnticipoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltipo_descuentoAnticipoCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltipo_descuentoAnticipoCliente.setToolTipText(AnticipoClienteConstantesFunciones.LABEL_TIPODESCUENTO);
		this.gridaBagLayoutAnticipoCliente = new GridBagLayout();
		this.jPaneltipo_descuentoAnticipoCliente.setLayout(this.gridaBagLayoutAnticipoCliente);


		jTextFieldtipo_descuentoAnticipoCliente= new JTextFieldMe();
		jTextFieldtipo_descuentoAnticipoCliente.setEnabled(false);
		jTextFieldtipo_descuentoAnticipoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtipo_descuentoAnticipoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtipo_descuentoAnticipoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtipo_descuentoAnticipoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtipo_descuentoAnticipoCliente.setText("0.0");

		this.jButtontipo_descuentoAnticipoClienteBusqueda= new JButtonMe();
		this.jButtontipo_descuentoAnticipoClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontipo_descuentoAnticipoClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontipo_descuentoAnticipoClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontipo_descuentoAnticipoClienteBusqueda.setText("U");
		this.jButtontipo_descuentoAnticipoClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontipo_descuentoAnticipoClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontipo_descuentoAnticipoClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtipo_descuentoAnticipoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtipo_descuentoAnticipoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"tipo_descuentoAnticipoClienteBusqueda"));

		if(this.anticipoclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontipo_descuentoAnticipoClienteBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysAnticipoCliente() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaAnticipoCliente = new JLabelMe();
		this.jLabelid_empresaAnticipoCliente.setText(""+AnticipoClienteConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaAnticipoCliente.setToolTipText("Empresa");
		this.jLabelid_empresaAnticipoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaAnticipoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaAnticipoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaAnticipoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaAnticipoCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaAnticipoCliente.setToolTipText(AnticipoClienteConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutAnticipoCliente = new GridBagLayout();
		this.jPanelid_empresaAnticipoCliente.setLayout(this.gridaBagLayoutAnticipoCliente);


		jComboBoxid_empresaAnticipoCliente= new JComboBoxMe();
		jComboBoxid_empresaAnticipoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaAnticipoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaAnticipoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaAnticipoCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaAnticipoCliente.setEnabled(false);

		this.jButtonid_empresaAnticipoCliente= new JButtonMe();
		this.jButtonid_empresaAnticipoCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaAnticipoCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaAnticipoCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaAnticipoCliente.setText("Buscar");
		this.jButtonid_empresaAnticipoCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaAnticipoCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaAnticipoCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaAnticipoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaAnticipoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaAnticipoCliente"));

		this.jButtonid_empresaAnticipoClienteBusqueda= new JButtonMe();
		this.jButtonid_empresaAnticipoClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaAnticipoClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaAnticipoClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaAnticipoClienteBusqueda.setText("U");
		this.jButtonid_empresaAnticipoClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaAnticipoClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaAnticipoClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaAnticipoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaAnticipoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaAnticipoClienteBusqueda"));

		if(this.anticipoclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaAnticipoClienteBusqueda.setVisible(false);		}

		this.jButtonid_empresaAnticipoClienteUpdate= new JButtonMe();
		this.jButtonid_empresaAnticipoClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaAnticipoClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaAnticipoClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaAnticipoClienteUpdate.setText("U");
		this.jButtonid_empresaAnticipoClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaAnticipoClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaAnticipoClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaAnticipoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaAnticipoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaAnticipoClienteUpdate"));



					
		this.jLabelid_empleadoAnticipoCliente = new JLabelMe();
		this.jLabelid_empleadoAnticipoCliente.setText(""+AnticipoClienteConstantesFunciones.LABEL_IDEMPLEADO+" : *");
		this.jLabelid_empleadoAnticipoCliente.setToolTipText("Empleado");
		this.jLabelid_empleadoAnticipoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoAnticipoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoAnticipoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoAnticipoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empleadoAnticipoCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empleadoAnticipoCliente.setToolTipText(AnticipoClienteConstantesFunciones.LABEL_IDEMPLEADO);
		this.gridaBagLayoutAnticipoCliente = new GridBagLayout();
		this.jPanelid_empleadoAnticipoCliente.setLayout(this.gridaBagLayoutAnticipoCliente);


		jComboBoxid_empleadoAnticipoCliente= new JComboBoxMe();
		jComboBoxid_empleadoAnticipoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoAnticipoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoAnticipoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoAnticipoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empleadoAnticipoCliente= new JButtonMe();
		this.jButtonid_empleadoAnticipoCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoAnticipoCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoAnticipoCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoAnticipoCliente.setText("Buscar");
		this.jButtonid_empleadoAnticipoCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empleadoAnticipoCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoAnticipoCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empleadoAnticipoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoAnticipoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoAnticipoCliente"));

		this.jButtonid_empleadoAnticipoClienteBusqueda= new JButtonMe();
		this.jButtonid_empleadoAnticipoClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoAnticipoClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoAnticipoClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoAnticipoClienteBusqueda.setText("U");
		this.jButtonid_empleadoAnticipoClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empleadoAnticipoClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoAnticipoClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empleadoAnticipoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoAnticipoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoAnticipoClienteBusqueda"));

		if(this.anticipoclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empleadoAnticipoClienteBusqueda.setVisible(false);		}

		this.jButtonid_empleadoAnticipoClienteUpdate= new JButtonMe();
		this.jButtonid_empleadoAnticipoClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoAnticipoClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoAnticipoClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoAnticipoClienteUpdate.setText("U");
		this.jButtonid_empleadoAnticipoClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empleadoAnticipoClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoAnticipoClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empleadoAnticipoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoAnticipoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoAnticipoClienteUpdate"));



					
		this.jLabelid_estado_anti_clienteAnticipoCliente = new JLabelMe();
		this.jLabelid_estado_anti_clienteAnticipoCliente.setText(""+AnticipoClienteConstantesFunciones.LABEL_IDESTADOANTICLIENTE+" : *");
		this.jLabelid_estado_anti_clienteAnticipoCliente.setToolTipText("Estado Anti Cliente");
		this.jLabelid_estado_anti_clienteAnticipoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_estado_anti_clienteAnticipoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_estado_anti_clienteAnticipoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estado_anti_clienteAnticipoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estado_anti_clienteAnticipoCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estado_anti_clienteAnticipoCliente.setToolTipText(AnticipoClienteConstantesFunciones.LABEL_IDESTADOANTICLIENTE);
		this.gridaBagLayoutAnticipoCliente = new GridBagLayout();
		this.jPanelid_estado_anti_clienteAnticipoCliente.setLayout(this.gridaBagLayoutAnticipoCliente);


		jComboBoxid_estado_anti_clienteAnticipoCliente= new JComboBoxMe();
		jComboBoxid_estado_anti_clienteAnticipoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_anti_clienteAnticipoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_anti_clienteAnticipoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_anti_clienteAnticipoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estado_anti_clienteAnticipoCliente= new JButtonMe();
		this.jButtonid_estado_anti_clienteAnticipoCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_anti_clienteAnticipoCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_anti_clienteAnticipoCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_anti_clienteAnticipoCliente.setText("Buscar");
		this.jButtonid_estado_anti_clienteAnticipoCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estado_anti_clienteAnticipoCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_anti_clienteAnticipoCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estado_anti_clienteAnticipoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_anti_clienteAnticipoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_anti_clienteAnticipoCliente"));

		this.jButtonid_estado_anti_clienteAnticipoClienteBusqueda= new JButtonMe();
		this.jButtonid_estado_anti_clienteAnticipoClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_anti_clienteAnticipoClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_anti_clienteAnticipoClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_anti_clienteAnticipoClienteBusqueda.setText("U");
		this.jButtonid_estado_anti_clienteAnticipoClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estado_anti_clienteAnticipoClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_anti_clienteAnticipoClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estado_anti_clienteAnticipoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_anti_clienteAnticipoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_anti_clienteAnticipoClienteBusqueda"));

		if(this.anticipoclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estado_anti_clienteAnticipoClienteBusqueda.setVisible(false);		}

		this.jButtonid_estado_anti_clienteAnticipoClienteUpdate= new JButtonMe();
		this.jButtonid_estado_anti_clienteAnticipoClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_anti_clienteAnticipoClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_anti_clienteAnticipoClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_anti_clienteAnticipoClienteUpdate.setText("U");
		this.jButtonid_estado_anti_clienteAnticipoClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estado_anti_clienteAnticipoClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_anti_clienteAnticipoClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estado_anti_clienteAnticipoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_anti_clienteAnticipoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_anti_clienteAnticipoClienteUpdate"));



					
		this.jLabelid_tipo_grupo_forma_pagoAnticipoCliente = new JLabelMe();
		this.jLabelid_tipo_grupo_forma_pagoAnticipoCliente.setText(""+AnticipoClienteConstantesFunciones.LABEL_IDTIPOGRUPOFORMAPAGO+" : *");
		this.jLabelid_tipo_grupo_forma_pagoAnticipoCliente.setToolTipText("Tipo Grupo Forma Pago");
		this.jLabelid_tipo_grupo_forma_pagoAnticipoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_grupo_forma_pagoAnticipoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_grupo_forma_pagoAnticipoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_grupo_forma_pagoAnticipoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_grupo_forma_pagoAnticipoCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_grupo_forma_pagoAnticipoCliente.setToolTipText(AnticipoClienteConstantesFunciones.LABEL_IDTIPOGRUPOFORMAPAGO);
		this.gridaBagLayoutAnticipoCliente = new GridBagLayout();
		this.jPanelid_tipo_grupo_forma_pagoAnticipoCliente.setLayout(this.gridaBagLayoutAnticipoCliente);


		jComboBoxid_tipo_grupo_forma_pagoAnticipoCliente= new JComboBoxMe();
		jComboBoxid_tipo_grupo_forma_pagoAnticipoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_grupo_forma_pagoAnticipoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_grupo_forma_pagoAnticipoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_grupo_forma_pagoAnticipoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_grupo_forma_pagoAnticipoCliente= new JButtonMe();
		this.jButtonid_tipo_grupo_forma_pagoAnticipoCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_grupo_forma_pagoAnticipoCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_grupo_forma_pagoAnticipoCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_grupo_forma_pagoAnticipoCliente.setText("Buscar");
		this.jButtonid_tipo_grupo_forma_pagoAnticipoCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_grupo_forma_pagoAnticipoCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_grupo_forma_pagoAnticipoCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_grupo_forma_pagoAnticipoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_grupo_forma_pagoAnticipoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_grupo_forma_pagoAnticipoCliente"));

		this.jButtonid_tipo_grupo_forma_pagoAnticipoClienteBusqueda= new JButtonMe();
		this.jButtonid_tipo_grupo_forma_pagoAnticipoClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_grupo_forma_pagoAnticipoClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_grupo_forma_pagoAnticipoClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_grupo_forma_pagoAnticipoClienteBusqueda.setText("U");
		this.jButtonid_tipo_grupo_forma_pagoAnticipoClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_grupo_forma_pagoAnticipoClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_grupo_forma_pagoAnticipoClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_grupo_forma_pagoAnticipoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_grupo_forma_pagoAnticipoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_grupo_forma_pagoAnticipoClienteBusqueda"));

		if(this.anticipoclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_grupo_forma_pagoAnticipoClienteBusqueda.setVisible(false);		}

		this.jButtonid_tipo_grupo_forma_pagoAnticipoClienteUpdate= new JButtonMe();
		this.jButtonid_tipo_grupo_forma_pagoAnticipoClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_grupo_forma_pagoAnticipoClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_grupo_forma_pagoAnticipoClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_grupo_forma_pagoAnticipoClienteUpdate.setText("U");
		this.jButtonid_tipo_grupo_forma_pagoAnticipoClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_grupo_forma_pagoAnticipoClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_grupo_forma_pagoAnticipoClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_grupo_forma_pagoAnticipoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_grupo_forma_pagoAnticipoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_grupo_forma_pagoAnticipoClienteUpdate"));



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
		//this.jInternalFrameDetalleAnticipoCliente = new AnticipoClienteBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Anticipo Cliente DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutAnticipoCliente= new GridBagLayout();
		

		
		String sToolTipAnticipoCliente="";
		sToolTipAnticipoCliente=AnticipoClienteConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipAnticipoCliente+="(Facturacion.AnticipoCliente)";
		}
		
		if(!this.anticipoclienteSessionBean.getEsGuardarRelacionado()) {
			sToolTipAnticipoCliente+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoAnticipoCliente = new JButtonMe();
		this.jButtonModificarAnticipoCliente = new JButtonMe();
        this.jButtonActualizarAnticipoCliente = new JButtonMe();
        this.jButtonEliminarAnticipoCliente = new JButtonMe();
        this.jButtonCancelarAnticipoCliente = new JButtonMe();
        this.jButtonGuardarCambiosAnticipoCliente = new JButtonMe();
		this.jButtonGuardarCambiosTablaAnticipoCliente = new JButtonMe();
		this.jButtonCerrarAnticipoCliente = new JButtonMe();
		
		this.jScrollPanelDatosAnticipoCliente = new JScrollPane();   
        this.jScrollPanelDatosEdicionAnticipoCliente = new JScrollPane();
		this.jScrollPanelDatosGeneralAnticipoCliente = new JScrollPane();
				
		
		
		this.jPanelCamposAnticipoCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosAnticipoCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesAnticipoCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioAnticipoCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Anticipo Cliente";
		
		if(!this.anticipoclienteSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosAnticipoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Anticipo Clientes" + this.sPath));
		} else {
			this.jScrollPanelDatosAnticipoCliente.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionAnticipoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralAnticipoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposAnticipoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposAnticipoCliente.setName("jPanelCamposAnticipoCliente"); 

		this.jPanelCamposOcultosAnticipoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosAnticipoCliente.setName("jPanelCamposOcultosAnticipoCliente"); 

        this.jPanelAccionesAnticipoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesAnticipoCliente.setToolTipText("Acciones");
        this.jPanelAccionesAnticipoCliente.setName("Acciones"); 

		this.jPanelAccionesFormularioAnticipoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioAnticipoCliente.setToolTipText("Acciones");
        this.jPanelAccionesFormularioAnticipoCliente.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionAnticipoCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralAnticipoCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosAnticipoCliente, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposAnticipoCliente, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosAnticipoCliente, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioAnticipoCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoAnticipoCliente.setText("Nuevo");
		this.jButtonModificarAnticipoCliente.setText("Editar");
        this.jButtonActualizarAnticipoCliente.setText("Actualizar");
        this.jButtonEliminarAnticipoCliente.setText("Eliminar");
        this.jButtonCancelarAnticipoCliente.setText("Cancelar");
        this.jButtonGuardarCambiosAnticipoCliente.setText("Guardar");
		this.jButtonGuardarCambiosTablaAnticipoCliente.setText("Guardar");
		this.jButtonCerrarAnticipoCliente.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoAnticipoCliente,"nuevo_button","Nuevo",this.anticipoclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarAnticipoCliente,"modificar_button","Editar",this.anticipoclienteSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarAnticipoCliente,"actualizar_button","Actualizar",this.anticipoclienteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarAnticipoCliente,"eliminar_button","Eliminar",this.anticipoclienteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarAnticipoCliente,"cancelar_button","Cancelar",this.anticipoclienteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosAnticipoCliente,"guardarcambios_button","Guardar",this.anticipoclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaAnticipoCliente,"guardarcambiostabla_button","Guardar",this.anticipoclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarAnticipoCliente,"cerrar_button","Salir",this.anticipoclienteSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoAnticipoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarAnticipoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosAnticipoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaAnticipoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarAnticipoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarAnticipoCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarAnticipoCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarAnticipoCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoAnticipoCliente.setToolTipText("Nuevo"+" "+AnticipoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarAnticipoCliente.setToolTipText("Editar"+" "+AnticipoClienteConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarAnticipoCliente.setToolTipText("Actualizar"+" "+AnticipoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarAnticipoCliente.setToolTipText("Eliminar)"+" "+AnticipoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarAnticipoCliente.setToolTipText("Cancelar"+" "+AnticipoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosAnticipoCliente.setToolTipText("Guardar"+" "+AnticipoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaAnticipoCliente.setToolTipText("Guardar"+" "+AnticipoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarAnticipoCliente.setToolTipText("Salir"+" "+AnticipoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoAnticipoCliente";
		inputMap = this.jButtonNuevoAnticipoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoAnticipoCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoAnticipoCliente"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarAnticipoCliente";
		inputMap = this.jButtonActualizarAnticipoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarAnticipoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarAnticipoCliente"));
		
		//ELIMINAR
		sMapKey = "EliminarAnticipoCliente";
		inputMap = this.jButtonEliminarAnticipoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarAnticipoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarAnticipoCliente"));
		
		//CANCELAR	
		sMapKey = "CancelarAnticipoCliente";
		inputMap = this.jButtonCancelarAnticipoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarAnticipoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarAnticipoCliente"));
		
		//CERRAR		
		sMapKey = "CerrarAnticipoCliente";
		inputMap = this.jButtonCerrarAnticipoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarAnticipoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarAnticipoCliente"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaAnticipoCliente";
		inputMap = this.jButtonGuardarCambiosTablaAnticipoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaAnticipoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaAnticipoCliente"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoAnticipoCliente = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoAnticipoCliente.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoAnticipoCliente.setToolTipText("Nuevo AnticipoCliente");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoAnticipoCliente, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarAnticipoCliente = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarAnticipoCliente.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarAnticipoCliente.setToolTipText("Sin Cerrar Ventana AnticipoCliente");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarAnticipoCliente, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeAnticipoCliente = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeAnticipoCliente.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeAnticipoCliente.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeAnticipoCliente, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesAnticipoCliente = new JComboBoxMe();
		//this.jComboBoxTiposAccionesAnticipoCliente.setText("Accion");
		this.jComboBoxTiposAccionesAnticipoCliente.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioAnticipoCliente = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioAnticipoCliente.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioAnticipoCliente.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesAnticipoCliente = new JLabelMe();
		
		this.jLabelAccionesAnticipoCliente.setText("Acciones");		
		this.jLabelAccionesAnticipoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesAnticipoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesAnticipoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposAnticipoCliente();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysAnticipoCliente();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesAnticipoCliente=new JTabbedPane();
		this.jTabbedPaneRelacionesAnticipoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesAnticipoCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesAnticipoCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesAnticipoCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesAnticipoCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesAnticipoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioAnticipoCliente.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioAnticipoCliente.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioAnticipoCliente.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioAnticipoCliente, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposAnticipoCliente = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosAnticipoCliente = new GridBagLayout();
		
		this.jPanelCamposAnticipoCliente.setLayout(gridaBagLayoutCamposAnticipoCliente);
		this.jPanelCamposOcultosAnticipoCliente.setLayout(gridaBagLayoutCamposOcultosAnticipoCliente);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
	this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnticipoCliente.gridy = 0;
	this.gridBagConstraintsAnticipoCliente.gridx = 0;
	this.gridBagConstraintsAnticipoCliente.ipadx = 0;
	this.gridBagConstraintsAnticipoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidAnticipoCliente.add(jLabelIdAnticipoCliente, this.gridBagConstraintsAnticipoCliente);



	this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
	this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnticipoCliente.gridy = 0;
	this.gridBagConstraintsAnticipoCliente.gridx = 1;
	this.gridBagConstraintsAnticipoCliente.ipadx = 0;
	this.gridBagConstraintsAnticipoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidAnticipoCliente.add(jLabelidAnticipoCliente, this.gridBagConstraintsAnticipoCliente);


	this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
	this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnticipoCliente.gridy = 0;
	this.gridBagConstraintsAnticipoCliente.gridx = 0;
	this.gridBagConstraintsAnticipoCliente.ipadx = 0;
	this.gridBagConstraintsAnticipoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaAnticipoCliente.add(jLabelid_empresaAnticipoCliente, this.gridBagConstraintsAnticipoCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
		//this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnticipoCliente.gridy = 0;
		this.gridBagConstraintsAnticipoCliente.gridx = 2;
		this.gridBagConstraintsAnticipoCliente.ipadx = 0;
		this.gridBagConstraintsAnticipoCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaAnticipoCliente.add(jButtonid_empresaAnticipoClienteBusqueda, this.gridBagConstraintsAnticipoCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
		//this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnticipoCliente.gridy = 0;
		this.gridBagConstraintsAnticipoCliente.gridx = 3;
		this.gridBagConstraintsAnticipoCliente.ipadx = 0;
		this.gridBagConstraintsAnticipoCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaAnticipoCliente.add(jButtonid_empresaAnticipoClienteUpdate, this.gridBagConstraintsAnticipoCliente);
	}

	this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
	this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnticipoCliente.gridy = 0;
	this.gridBagConstraintsAnticipoCliente.gridx = 1;
	this.gridBagConstraintsAnticipoCliente.ipadx = 0;
	this.gridBagConstraintsAnticipoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaAnticipoCliente.add(jComboBoxid_empresaAnticipoCliente, this.gridBagConstraintsAnticipoCliente);


	this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
	this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnticipoCliente.gridy = 0;
	this.gridBagConstraintsAnticipoCliente.gridx = 0;
	this.gridBagConstraintsAnticipoCliente.ipadx = 0;
	this.gridBagConstraintsAnticipoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empleadoAnticipoCliente.add(jLabelid_empleadoAnticipoCliente, this.gridBagConstraintsAnticipoCliente);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
	//this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnticipoCliente.gridy = 0;
	this.gridBagConstraintsAnticipoCliente.gridx = 2;
	this.gridBagConstraintsAnticipoCliente.ipadx = 0;
	this.gridBagConstraintsAnticipoCliente.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_empleadoAnticipoCliente.add(jButtonid_empleadoAnticipoCliente, this.gridBagConstraintsAnticipoCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
		//this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnticipoCliente.gridy = 0;
		this.gridBagConstraintsAnticipoCliente.gridx = 3;
		this.gridBagConstraintsAnticipoCliente.ipadx = 0;
		this.gridBagConstraintsAnticipoCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoAnticipoCliente.add(jButtonid_empleadoAnticipoClienteBusqueda, this.gridBagConstraintsAnticipoCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
		//this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnticipoCliente.gridy = 0;
		this.gridBagConstraintsAnticipoCliente.gridx = 4;
		this.gridBagConstraintsAnticipoCliente.ipadx = 0;
		this.gridBagConstraintsAnticipoCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoAnticipoCliente.add(jButtonid_empleadoAnticipoClienteUpdate, this.gridBagConstraintsAnticipoCliente);
	}

	this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
	this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnticipoCliente.gridy = 0;
	this.gridBagConstraintsAnticipoCliente.gridx = 1;
	this.gridBagConstraintsAnticipoCliente.ipadx = 0;
	this.gridBagConstraintsAnticipoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empleadoAnticipoCliente.add(jComboBoxid_empleadoAnticipoCliente, this.gridBagConstraintsAnticipoCliente);


	this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
	this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnticipoCliente.gridy = 0;
	this.gridBagConstraintsAnticipoCliente.gridx = 0;
	this.gridBagConstraintsAnticipoCliente.ipadx = 0;
	this.gridBagConstraintsAnticipoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estado_anti_clienteAnticipoCliente.add(jLabelid_estado_anti_clienteAnticipoCliente, this.gridBagConstraintsAnticipoCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
		//this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnticipoCliente.gridy = 0;
		this.gridBagConstraintsAnticipoCliente.gridx = 2;
		this.gridBagConstraintsAnticipoCliente.ipadx = 0;
		this.gridBagConstraintsAnticipoCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_anti_clienteAnticipoCliente.add(jButtonid_estado_anti_clienteAnticipoClienteBusqueda, this.gridBagConstraintsAnticipoCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
		//this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnticipoCliente.gridy = 0;
		this.gridBagConstraintsAnticipoCliente.gridx = 3;
		this.gridBagConstraintsAnticipoCliente.ipadx = 0;
		this.gridBagConstraintsAnticipoCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_anti_clienteAnticipoCliente.add(jButtonid_estado_anti_clienteAnticipoClienteUpdate, this.gridBagConstraintsAnticipoCliente);
	}

	this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
	this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnticipoCliente.gridy = 0;
	this.gridBagConstraintsAnticipoCliente.gridx = 1;
	this.gridBagConstraintsAnticipoCliente.ipadx = 0;
	this.gridBagConstraintsAnticipoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estado_anti_clienteAnticipoCliente.add(jComboBoxid_estado_anti_clienteAnticipoCliente, this.gridBagConstraintsAnticipoCliente);


	this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
	this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnticipoCliente.gridy = 0;
	this.gridBagConstraintsAnticipoCliente.gridx = 0;
	this.gridBagConstraintsAnticipoCliente.ipadx = 0;
	this.gridBagConstraintsAnticipoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_grupo_forma_pagoAnticipoCliente.add(jLabelid_tipo_grupo_forma_pagoAnticipoCliente, this.gridBagConstraintsAnticipoCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
		//this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnticipoCliente.gridy = 0;
		this.gridBagConstraintsAnticipoCliente.gridx = 2;
		this.gridBagConstraintsAnticipoCliente.ipadx = 0;
		this.gridBagConstraintsAnticipoCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_grupo_forma_pagoAnticipoCliente.add(jButtonid_tipo_grupo_forma_pagoAnticipoClienteBusqueda, this.gridBagConstraintsAnticipoCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
		//this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnticipoCliente.gridy = 0;
		this.gridBagConstraintsAnticipoCliente.gridx = 3;
		this.gridBagConstraintsAnticipoCliente.ipadx = 0;
		this.gridBagConstraintsAnticipoCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_grupo_forma_pagoAnticipoCliente.add(jButtonid_tipo_grupo_forma_pagoAnticipoClienteUpdate, this.gridBagConstraintsAnticipoCliente);
	}

	this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
	this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnticipoCliente.gridy = 0;
	this.gridBagConstraintsAnticipoCliente.gridx = 1;
	this.gridBagConstraintsAnticipoCliente.ipadx = 0;
	this.gridBagConstraintsAnticipoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_grupo_forma_pagoAnticipoCliente.add(jComboBoxid_tipo_grupo_forma_pagoAnticipoCliente, this.gridBagConstraintsAnticipoCliente);


	this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
	this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnticipoCliente.gridy = 0;
	this.gridBagConstraintsAnticipoCliente.gridx = 0;
	this.gridBagConstraintsAnticipoCliente.ipadx = 0;
	this.gridBagConstraintsAnticipoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaAnticipoCliente.add(jLabelfechaAnticipoCliente, this.gridBagConstraintsAnticipoCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
		//this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnticipoCliente.gridy = 0;
		this.gridBagConstraintsAnticipoCliente.gridx = 2;
		this.gridBagConstraintsAnticipoCliente.ipadx = 0;
		this.gridBagConstraintsAnticipoCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaAnticipoCliente.add(jButtonfechaAnticipoClienteBusqueda, this.gridBagConstraintsAnticipoCliente);
	}

	this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
	this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnticipoCliente.gridy = 0;
	this.gridBagConstraintsAnticipoCliente.gridx = 1;
	this.gridBagConstraintsAnticipoCliente.ipadx = 0;
	this.gridBagConstraintsAnticipoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaAnticipoCliente.add(jDateChooserfechaAnticipoCliente, this.gridBagConstraintsAnticipoCliente);


	this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
	this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnticipoCliente.gridy = 0;
	this.gridBagConstraintsAnticipoCliente.gridx = 0;
	this.gridBagConstraintsAnticipoCliente.ipadx = 0;
	this.gridBagConstraintsAnticipoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalorAnticipoCliente.add(jLabelvalorAnticipoCliente, this.gridBagConstraintsAnticipoCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
		//this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnticipoCliente.gridy = 0;
		this.gridBagConstraintsAnticipoCliente.gridx = 2;
		this.gridBagConstraintsAnticipoCliente.ipadx = 0;
		this.gridBagConstraintsAnticipoCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalorAnticipoCliente.add(jButtonvalorAnticipoClienteBusqueda, this.gridBagConstraintsAnticipoCliente);
	}

	this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
	this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnticipoCliente.gridy = 0;
	this.gridBagConstraintsAnticipoCliente.gridx = 1;
	this.gridBagConstraintsAnticipoCliente.ipadx = 0;
	this.gridBagConstraintsAnticipoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalorAnticipoCliente.add(jTextFieldvalorAnticipoCliente, this.gridBagConstraintsAnticipoCliente);


	this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
	this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnticipoCliente.gridy = 0;
	this.gridBagConstraintsAnticipoCliente.gridx = 0;
	this.gridBagConstraintsAnticipoCliente.ipadx = 0;
	this.gridBagConstraintsAnticipoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionAnticipoCliente.add(jLabeldescripcionAnticipoCliente, this.gridBagConstraintsAnticipoCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
		//this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnticipoCliente.gridy = 0;
		this.gridBagConstraintsAnticipoCliente.gridx = 2;
		this.gridBagConstraintsAnticipoCliente.ipadx = 0;
		this.gridBagConstraintsAnticipoCliente.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionAnticipoCliente.add(jButtondescripcionAnticipoClienteBusqueda, this.gridBagConstraintsAnticipoCliente);
	}

	this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
	this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnticipoCliente.gridy = 0;
	this.gridBagConstraintsAnticipoCliente.gridx = 1;
	this.gridBagConstraintsAnticipoCliente.ipadx = 0;
	this.gridBagConstraintsAnticipoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionAnticipoCliente.add(jscrollPanedescripcionAnticipoCliente, this.gridBagConstraintsAnticipoCliente);


	this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
	this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnticipoCliente.gridy = 0;
	this.gridBagConstraintsAnticipoCliente.gridx = 0;
	this.gridBagConstraintsAnticipoCliente.ipadx = 0;
	this.gridBagConstraintsAnticipoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_adicionalAnticipoCliente.add(jLabelvalor_adicionalAnticipoCliente, this.gridBagConstraintsAnticipoCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
		//this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnticipoCliente.gridy = 0;
		this.gridBagConstraintsAnticipoCliente.gridx = 2;
		this.gridBagConstraintsAnticipoCliente.ipadx = 0;
		this.gridBagConstraintsAnticipoCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_adicionalAnticipoCliente.add(jButtonvalor_adicionalAnticipoClienteBusqueda, this.gridBagConstraintsAnticipoCliente);
	}

	this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
	this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnticipoCliente.gridy = 0;
	this.gridBagConstraintsAnticipoCliente.gridx = 1;
	this.gridBagConstraintsAnticipoCliente.ipadx = 0;
	this.gridBagConstraintsAnticipoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_adicionalAnticipoCliente.add(jTextFieldvalor_adicionalAnticipoCliente, this.gridBagConstraintsAnticipoCliente);


	this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
	this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnticipoCliente.gridy = 0;
	this.gridBagConstraintsAnticipoCliente.gridx = 0;
	this.gridBagConstraintsAnticipoCliente.ipadx = 0;
	this.gridBagConstraintsAnticipoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_prestamoAnticipoCliente.add(jLabelvalor_prestamoAnticipoCliente, this.gridBagConstraintsAnticipoCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
		//this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnticipoCliente.gridy = 0;
		this.gridBagConstraintsAnticipoCliente.gridx = 2;
		this.gridBagConstraintsAnticipoCliente.ipadx = 0;
		this.gridBagConstraintsAnticipoCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_prestamoAnticipoCliente.add(jButtonvalor_prestamoAnticipoClienteBusqueda, this.gridBagConstraintsAnticipoCliente);
	}

	this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
	this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnticipoCliente.gridy = 0;
	this.gridBagConstraintsAnticipoCliente.gridx = 1;
	this.gridBagConstraintsAnticipoCliente.ipadx = 0;
	this.gridBagConstraintsAnticipoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_prestamoAnticipoCliente.add(jTextFieldvalor_prestamoAnticipoCliente, this.gridBagConstraintsAnticipoCliente);


	this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
	this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnticipoCliente.gridy = 0;
	this.gridBagConstraintsAnticipoCliente.gridx = 0;
	this.gridBagConstraintsAnticipoCliente.ipadx = 0;
	this.gridBagConstraintsAnticipoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelingreso1AnticipoCliente.add(jLabelingreso1AnticipoCliente, this.gridBagConstraintsAnticipoCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
		//this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnticipoCliente.gridy = 0;
		this.gridBagConstraintsAnticipoCliente.gridx = 2;
		this.gridBagConstraintsAnticipoCliente.ipadx = 0;
		this.gridBagConstraintsAnticipoCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelingreso1AnticipoCliente.add(jButtoningreso1AnticipoClienteBusqueda, this.gridBagConstraintsAnticipoCliente);
	}

	this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
	this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnticipoCliente.gridy = 0;
	this.gridBagConstraintsAnticipoCliente.gridx = 1;
	this.gridBagConstraintsAnticipoCliente.ipadx = 0;
	this.gridBagConstraintsAnticipoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelingreso1AnticipoCliente.add(jTextFieldingreso1AnticipoCliente, this.gridBagConstraintsAnticipoCliente);


	this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
	this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnticipoCliente.gridy = 0;
	this.gridBagConstraintsAnticipoCliente.gridx = 0;
	this.gridBagConstraintsAnticipoCliente.ipadx = 0;
	this.gridBagConstraintsAnticipoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelingreso2AnticipoCliente.add(jLabelingreso2AnticipoCliente, this.gridBagConstraintsAnticipoCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
		//this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnticipoCliente.gridy = 0;
		this.gridBagConstraintsAnticipoCliente.gridx = 2;
		this.gridBagConstraintsAnticipoCliente.ipadx = 0;
		this.gridBagConstraintsAnticipoCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelingreso2AnticipoCliente.add(jButtoningreso2AnticipoClienteBusqueda, this.gridBagConstraintsAnticipoCliente);
	}

	this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
	this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnticipoCliente.gridy = 0;
	this.gridBagConstraintsAnticipoCliente.gridx = 1;
	this.gridBagConstraintsAnticipoCliente.ipadx = 0;
	this.gridBagConstraintsAnticipoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelingreso2AnticipoCliente.add(jTextFieldingreso2AnticipoCliente, this.gridBagConstraintsAnticipoCliente);


	this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
	this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnticipoCliente.gridy = 0;
	this.gridBagConstraintsAnticipoCliente.gridx = 0;
	this.gridBagConstraintsAnticipoCliente.ipadx = 0;
	this.gridBagConstraintsAnticipoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelingreso3AnticipoCliente.add(jLabelingreso3AnticipoCliente, this.gridBagConstraintsAnticipoCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
		//this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnticipoCliente.gridy = 0;
		this.gridBagConstraintsAnticipoCliente.gridx = 2;
		this.gridBagConstraintsAnticipoCliente.ipadx = 0;
		this.gridBagConstraintsAnticipoCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelingreso3AnticipoCliente.add(jButtoningreso3AnticipoClienteBusqueda, this.gridBagConstraintsAnticipoCliente);
	}

	this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
	this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnticipoCliente.gridy = 0;
	this.gridBagConstraintsAnticipoCliente.gridx = 1;
	this.gridBagConstraintsAnticipoCliente.ipadx = 0;
	this.gridBagConstraintsAnticipoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelingreso3AnticipoCliente.add(jTextFieldingreso3AnticipoCliente, this.gridBagConstraintsAnticipoCliente);


	this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
	this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnticipoCliente.gridy = 0;
	this.gridBagConstraintsAnticipoCliente.gridx = 0;
	this.gridBagConstraintsAnticipoCliente.ipadx = 0;
	this.gridBagConstraintsAnticipoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelingreso4AnticipoCliente.add(jLabelingreso4AnticipoCliente, this.gridBagConstraintsAnticipoCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
		//this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnticipoCliente.gridy = 0;
		this.gridBagConstraintsAnticipoCliente.gridx = 2;
		this.gridBagConstraintsAnticipoCliente.ipadx = 0;
		this.gridBagConstraintsAnticipoCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelingreso4AnticipoCliente.add(jButtoningreso4AnticipoClienteBusqueda, this.gridBagConstraintsAnticipoCliente);
	}

	this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
	this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnticipoCliente.gridy = 0;
	this.gridBagConstraintsAnticipoCliente.gridx = 1;
	this.gridBagConstraintsAnticipoCliente.ipadx = 0;
	this.gridBagConstraintsAnticipoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelingreso4AnticipoCliente.add(jTextFieldingreso4AnticipoCliente, this.gridBagConstraintsAnticipoCliente);


	this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
	this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnticipoCliente.gridy = 0;
	this.gridBagConstraintsAnticipoCliente.gridx = 0;
	this.gridBagConstraintsAnticipoCliente.ipadx = 0;
	this.gridBagConstraintsAnticipoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelingreso5AnticipoCliente.add(jLabelingreso5AnticipoCliente, this.gridBagConstraintsAnticipoCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
		//this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnticipoCliente.gridy = 0;
		this.gridBagConstraintsAnticipoCliente.gridx = 2;
		this.gridBagConstraintsAnticipoCliente.ipadx = 0;
		this.gridBagConstraintsAnticipoCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelingreso5AnticipoCliente.add(jButtoningreso5AnticipoClienteBusqueda, this.gridBagConstraintsAnticipoCliente);
	}

	this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
	this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnticipoCliente.gridy = 0;
	this.gridBagConstraintsAnticipoCliente.gridx = 1;
	this.gridBagConstraintsAnticipoCliente.ipadx = 0;
	this.gridBagConstraintsAnticipoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelingreso5AnticipoCliente.add(jTextFieldingreso5AnticipoCliente, this.gridBagConstraintsAnticipoCliente);


	this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
	this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnticipoCliente.gridy = 0;
	this.gridBagConstraintsAnticipoCliente.gridx = 0;
	this.gridBagConstraintsAnticipoCliente.ipadx = 0;
	this.gridBagConstraintsAnticipoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescuento1AnticipoCliente.add(jLabeldescuento1AnticipoCliente, this.gridBagConstraintsAnticipoCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
		//this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnticipoCliente.gridy = 0;
		this.gridBagConstraintsAnticipoCliente.gridx = 2;
		this.gridBagConstraintsAnticipoCliente.ipadx = 0;
		this.gridBagConstraintsAnticipoCliente.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescuento1AnticipoCliente.add(jButtondescuento1AnticipoClienteBusqueda, this.gridBagConstraintsAnticipoCliente);
	}

	this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
	this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnticipoCliente.gridy = 0;
	this.gridBagConstraintsAnticipoCliente.gridx = 1;
	this.gridBagConstraintsAnticipoCliente.ipadx = 0;
	this.gridBagConstraintsAnticipoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescuento1AnticipoCliente.add(jTextFielddescuento1AnticipoCliente, this.gridBagConstraintsAnticipoCliente);


	this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
	this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnticipoCliente.gridy = 0;
	this.gridBagConstraintsAnticipoCliente.gridx = 0;
	this.gridBagConstraintsAnticipoCliente.ipadx = 0;
	this.gridBagConstraintsAnticipoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescuento2AnticipoCliente.add(jLabeldescuento2AnticipoCliente, this.gridBagConstraintsAnticipoCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
		//this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnticipoCliente.gridy = 0;
		this.gridBagConstraintsAnticipoCliente.gridx = 2;
		this.gridBagConstraintsAnticipoCliente.ipadx = 0;
		this.gridBagConstraintsAnticipoCliente.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescuento2AnticipoCliente.add(jButtondescuento2AnticipoClienteBusqueda, this.gridBagConstraintsAnticipoCliente);
	}

	this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
	this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnticipoCliente.gridy = 0;
	this.gridBagConstraintsAnticipoCliente.gridx = 1;
	this.gridBagConstraintsAnticipoCliente.ipadx = 0;
	this.gridBagConstraintsAnticipoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescuento2AnticipoCliente.add(jTextFielddescuento2AnticipoCliente, this.gridBagConstraintsAnticipoCliente);


	this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
	this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnticipoCliente.gridy = 0;
	this.gridBagConstraintsAnticipoCliente.gridx = 0;
	this.gridBagConstraintsAnticipoCliente.ipadx = 0;
	this.gridBagConstraintsAnticipoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescuento3AnticipoCliente.add(jLabeldescuento3AnticipoCliente, this.gridBagConstraintsAnticipoCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
		//this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnticipoCliente.gridy = 0;
		this.gridBagConstraintsAnticipoCliente.gridx = 2;
		this.gridBagConstraintsAnticipoCliente.ipadx = 0;
		this.gridBagConstraintsAnticipoCliente.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescuento3AnticipoCliente.add(jButtondescuento3AnticipoClienteBusqueda, this.gridBagConstraintsAnticipoCliente);
	}

	this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
	this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnticipoCliente.gridy = 0;
	this.gridBagConstraintsAnticipoCliente.gridx = 1;
	this.gridBagConstraintsAnticipoCliente.ipadx = 0;
	this.gridBagConstraintsAnticipoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescuento3AnticipoCliente.add(jTextFielddescuento3AnticipoCliente, this.gridBagConstraintsAnticipoCliente);


	this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
	this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnticipoCliente.gridy = 0;
	this.gridBagConstraintsAnticipoCliente.gridx = 0;
	this.gridBagConstraintsAnticipoCliente.ipadx = 0;
	this.gridBagConstraintsAnticipoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescuento4AnticipoCliente.add(jLabeldescuento4AnticipoCliente, this.gridBagConstraintsAnticipoCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
		//this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnticipoCliente.gridy = 0;
		this.gridBagConstraintsAnticipoCliente.gridx = 2;
		this.gridBagConstraintsAnticipoCliente.ipadx = 0;
		this.gridBagConstraintsAnticipoCliente.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescuento4AnticipoCliente.add(jButtondescuento4AnticipoClienteBusqueda, this.gridBagConstraintsAnticipoCliente);
	}

	this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
	this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnticipoCliente.gridy = 0;
	this.gridBagConstraintsAnticipoCliente.gridx = 1;
	this.gridBagConstraintsAnticipoCliente.ipadx = 0;
	this.gridBagConstraintsAnticipoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescuento4AnticipoCliente.add(jTextFielddescuento4AnticipoCliente, this.gridBagConstraintsAnticipoCliente);


	this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
	this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnticipoCliente.gridy = 0;
	this.gridBagConstraintsAnticipoCliente.gridx = 0;
	this.gridBagConstraintsAnticipoCliente.ipadx = 0;
	this.gridBagConstraintsAnticipoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescuento5AnticipoCliente.add(jLabeldescuento5AnticipoCliente, this.gridBagConstraintsAnticipoCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
		//this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnticipoCliente.gridy = 0;
		this.gridBagConstraintsAnticipoCliente.gridx = 2;
		this.gridBagConstraintsAnticipoCliente.ipadx = 0;
		this.gridBagConstraintsAnticipoCliente.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescuento5AnticipoCliente.add(jButtondescuento5AnticipoClienteBusqueda, this.gridBagConstraintsAnticipoCliente);
	}

	this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
	this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnticipoCliente.gridy = 0;
	this.gridBagConstraintsAnticipoCliente.gridx = 1;
	this.gridBagConstraintsAnticipoCliente.ipadx = 0;
	this.gridBagConstraintsAnticipoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescuento5AnticipoCliente.add(jTextFielddescuento5AnticipoCliente, this.gridBagConstraintsAnticipoCliente);


	this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
	this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnticipoCliente.gridy = 0;
	this.gridBagConstraintsAnticipoCliente.gridx = 0;
	this.gridBagConstraintsAnticipoCliente.ipadx = 0;
	this.gridBagConstraintsAnticipoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltipo_ingresoAnticipoCliente.add(jLabeltipo_ingresoAnticipoCliente, this.gridBagConstraintsAnticipoCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
		//this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnticipoCliente.gridy = 0;
		this.gridBagConstraintsAnticipoCliente.gridx = 2;
		this.gridBagConstraintsAnticipoCliente.ipadx = 0;
		this.gridBagConstraintsAnticipoCliente.insets = new Insets(0, 0, 0, 0);
		this.jPaneltipo_ingresoAnticipoCliente.add(jButtontipo_ingresoAnticipoClienteBusqueda, this.gridBagConstraintsAnticipoCliente);
	}

	this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
	this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnticipoCliente.gridy = 0;
	this.gridBagConstraintsAnticipoCliente.gridx = 1;
	this.gridBagConstraintsAnticipoCliente.ipadx = 0;
	this.gridBagConstraintsAnticipoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltipo_ingresoAnticipoCliente.add(jTextFieldtipo_ingresoAnticipoCliente, this.gridBagConstraintsAnticipoCliente);


	this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
	this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnticipoCliente.gridy = 0;
	this.gridBagConstraintsAnticipoCliente.gridx = 0;
	this.gridBagConstraintsAnticipoCliente.ipadx = 0;
	this.gridBagConstraintsAnticipoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltipo_descuentoAnticipoCliente.add(jLabeltipo_descuentoAnticipoCliente, this.gridBagConstraintsAnticipoCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
		//this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnticipoCliente.gridy = 0;
		this.gridBagConstraintsAnticipoCliente.gridx = 2;
		this.gridBagConstraintsAnticipoCliente.ipadx = 0;
		this.gridBagConstraintsAnticipoCliente.insets = new Insets(0, 0, 0, 0);
		this.jPaneltipo_descuentoAnticipoCliente.add(jButtontipo_descuentoAnticipoClienteBusqueda, this.gridBagConstraintsAnticipoCliente);
	}

	this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
	this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnticipoCliente.gridy = 0;
	this.gridBagConstraintsAnticipoCliente.gridx = 1;
	this.gridBagConstraintsAnticipoCliente.ipadx = 0;
	this.gridBagConstraintsAnticipoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltipo_descuentoAnticipoCliente.add(jTextFieldtipo_descuentoAnticipoCliente, this.gridBagConstraintsAnticipoCliente);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
	this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAnticipoCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAnticipoCliente.gridy = iYPanelCamposAnticipoCliente;
	this.gridBagConstraintsAnticipoCliente.gridx = iXPanelCamposAnticipoCliente++;
	this.gridBagConstraintsAnticipoCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAnticipoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAnticipoCliente.add(this.jPanelidAnticipoCliente, this.gridBagConstraintsAnticipoCliente);



	if(iXPanelCamposAnticipoCliente % 2==0) {
		iXPanelCamposAnticipoCliente=0;
		iYPanelCamposAnticipoCliente++;
	}
	this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
	this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAnticipoCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAnticipoCliente.gridy = iYPanelCamposAnticipoCliente;
	this.gridBagConstraintsAnticipoCliente.gridx = iXPanelCamposAnticipoCliente++;
	this.gridBagConstraintsAnticipoCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAnticipoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAnticipoCliente.add(this.jPanelid_empleadoAnticipoCliente, this.gridBagConstraintsAnticipoCliente);



	if(iXPanelCamposAnticipoCliente % 2==0) {
		iXPanelCamposAnticipoCliente=0;
		iYPanelCamposAnticipoCliente++;
	}
	this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
	this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAnticipoCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAnticipoCliente.gridy = iYPanelCamposAnticipoCliente;
	this.gridBagConstraintsAnticipoCliente.gridx = iXPanelCamposAnticipoCliente++;
	this.gridBagConstraintsAnticipoCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAnticipoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAnticipoCliente.add(this.jPanelid_estado_anti_clienteAnticipoCliente, this.gridBagConstraintsAnticipoCliente);



	if(iXPanelCamposAnticipoCliente % 2==0) {
		iXPanelCamposAnticipoCliente=0;
		iYPanelCamposAnticipoCliente++;
	}
	this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
	this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAnticipoCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAnticipoCliente.gridy = iYPanelCamposAnticipoCliente;
	this.gridBagConstraintsAnticipoCliente.gridx = iXPanelCamposAnticipoCliente++;
	this.gridBagConstraintsAnticipoCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAnticipoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAnticipoCliente.add(this.jPanelid_tipo_grupo_forma_pagoAnticipoCliente, this.gridBagConstraintsAnticipoCliente);



	if(iXPanelCamposAnticipoCliente % 2==0) {
		iXPanelCamposAnticipoCliente=0;
		iYPanelCamposAnticipoCliente++;
	}
	this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
	this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAnticipoCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAnticipoCliente.gridy = iYPanelCamposAnticipoCliente;
	this.gridBagConstraintsAnticipoCliente.gridx = iXPanelCamposAnticipoCliente++;
	this.gridBagConstraintsAnticipoCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAnticipoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAnticipoCliente.add(this.jPanelfechaAnticipoCliente, this.gridBagConstraintsAnticipoCliente);



	if(iXPanelCamposAnticipoCliente % 2==0) {
		iXPanelCamposAnticipoCliente=0;
		iYPanelCamposAnticipoCliente++;
	}
	this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
	this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAnticipoCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAnticipoCliente.gridy = iYPanelCamposAnticipoCliente;
	this.gridBagConstraintsAnticipoCliente.gridx = iXPanelCamposAnticipoCliente++;
	this.gridBagConstraintsAnticipoCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAnticipoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAnticipoCliente.add(this.jPanelvalorAnticipoCliente, this.gridBagConstraintsAnticipoCliente);



	if(iXPanelCamposAnticipoCliente % 2==0) {
		iXPanelCamposAnticipoCliente=0;
		iYPanelCamposAnticipoCliente++;
	}
	this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
	this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAnticipoCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAnticipoCliente.gridy = iYPanelCamposAnticipoCliente;
	this.gridBagConstraintsAnticipoCliente.gridx = iXPanelCamposAnticipoCliente++;
	this.gridBagConstraintsAnticipoCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAnticipoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAnticipoCliente.add(this.jPaneldescripcionAnticipoCliente, this.gridBagConstraintsAnticipoCliente);



	if(iXPanelCamposAnticipoCliente % 2==0) {
		iXPanelCamposAnticipoCliente=0;
		iYPanelCamposAnticipoCliente++;
	}
	this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
	this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAnticipoCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAnticipoCliente.gridy = iYPanelCamposAnticipoCliente;
	this.gridBagConstraintsAnticipoCliente.gridx = iXPanelCamposAnticipoCliente++;
	this.gridBagConstraintsAnticipoCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAnticipoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAnticipoCliente.add(this.jPanelvalor_adicionalAnticipoCliente, this.gridBagConstraintsAnticipoCliente);



	if(iXPanelCamposAnticipoCliente % 2==0) {
		iXPanelCamposAnticipoCliente=0;
		iYPanelCamposAnticipoCliente++;
	}
	this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
	this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAnticipoCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAnticipoCliente.gridy = iYPanelCamposAnticipoCliente;
	this.gridBagConstraintsAnticipoCliente.gridx = iXPanelCamposAnticipoCliente++;
	this.gridBagConstraintsAnticipoCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAnticipoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAnticipoCliente.add(this.jPanelvalor_prestamoAnticipoCliente, this.gridBagConstraintsAnticipoCliente);



	if(iXPanelCamposAnticipoCliente % 2==0) {
		iXPanelCamposAnticipoCliente=0;
		iYPanelCamposAnticipoCliente++;
	}
	this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
	this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAnticipoCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAnticipoCliente.gridy = iYPanelCamposAnticipoCliente;
	this.gridBagConstraintsAnticipoCliente.gridx = iXPanelCamposAnticipoCliente++;
	this.gridBagConstraintsAnticipoCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAnticipoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAnticipoCliente.add(this.jPanelingreso1AnticipoCliente, this.gridBagConstraintsAnticipoCliente);



	if(iXPanelCamposAnticipoCliente % 2==0) {
		iXPanelCamposAnticipoCliente=0;
		iYPanelCamposAnticipoCliente++;
	}
	this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
	this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAnticipoCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAnticipoCliente.gridy = iYPanelCamposAnticipoCliente;
	this.gridBagConstraintsAnticipoCliente.gridx = iXPanelCamposAnticipoCliente++;
	this.gridBagConstraintsAnticipoCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAnticipoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAnticipoCliente.add(this.jPanelingreso2AnticipoCliente, this.gridBagConstraintsAnticipoCliente);



	if(iXPanelCamposAnticipoCliente % 2==0) {
		iXPanelCamposAnticipoCliente=0;
		iYPanelCamposAnticipoCliente++;
	}
	this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
	this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAnticipoCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAnticipoCliente.gridy = iYPanelCamposAnticipoCliente;
	this.gridBagConstraintsAnticipoCliente.gridx = iXPanelCamposAnticipoCliente++;
	this.gridBagConstraintsAnticipoCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAnticipoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAnticipoCliente.add(this.jPanelingreso3AnticipoCliente, this.gridBagConstraintsAnticipoCliente);



	if(iXPanelCamposAnticipoCliente % 2==0) {
		iXPanelCamposAnticipoCliente=0;
		iYPanelCamposAnticipoCliente++;
	}
	this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
	this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAnticipoCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAnticipoCliente.gridy = iYPanelCamposAnticipoCliente;
	this.gridBagConstraintsAnticipoCliente.gridx = iXPanelCamposAnticipoCliente++;
	this.gridBagConstraintsAnticipoCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAnticipoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAnticipoCliente.add(this.jPanelingreso4AnticipoCliente, this.gridBagConstraintsAnticipoCliente);



	if(iXPanelCamposAnticipoCliente % 2==0) {
		iXPanelCamposAnticipoCliente=0;
		iYPanelCamposAnticipoCliente++;
	}
	this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
	this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAnticipoCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAnticipoCliente.gridy = iYPanelCamposAnticipoCliente;
	this.gridBagConstraintsAnticipoCliente.gridx = iXPanelCamposAnticipoCliente++;
	this.gridBagConstraintsAnticipoCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAnticipoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAnticipoCliente.add(this.jPanelingreso5AnticipoCliente, this.gridBagConstraintsAnticipoCliente);



	if(iXPanelCamposAnticipoCliente % 2==0) {
		iXPanelCamposAnticipoCliente=0;
		iYPanelCamposAnticipoCliente++;
	}
	this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
	this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAnticipoCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAnticipoCliente.gridy = iYPanelCamposAnticipoCliente;
	this.gridBagConstraintsAnticipoCliente.gridx = iXPanelCamposAnticipoCliente++;
	this.gridBagConstraintsAnticipoCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAnticipoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAnticipoCliente.add(this.jPaneldescuento1AnticipoCliente, this.gridBagConstraintsAnticipoCliente);



	if(iXPanelCamposAnticipoCliente % 2==0) {
		iXPanelCamposAnticipoCliente=0;
		iYPanelCamposAnticipoCliente++;
	}
	this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
	this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAnticipoCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAnticipoCliente.gridy = iYPanelCamposAnticipoCliente;
	this.gridBagConstraintsAnticipoCliente.gridx = iXPanelCamposAnticipoCliente++;
	this.gridBagConstraintsAnticipoCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAnticipoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAnticipoCliente.add(this.jPaneldescuento2AnticipoCliente, this.gridBagConstraintsAnticipoCliente);



	if(iXPanelCamposAnticipoCliente % 2==0) {
		iXPanelCamposAnticipoCliente=0;
		iYPanelCamposAnticipoCliente++;
	}
	this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
	this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAnticipoCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAnticipoCliente.gridy = iYPanelCamposAnticipoCliente;
	this.gridBagConstraintsAnticipoCliente.gridx = iXPanelCamposAnticipoCliente++;
	this.gridBagConstraintsAnticipoCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAnticipoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAnticipoCliente.add(this.jPaneldescuento3AnticipoCliente, this.gridBagConstraintsAnticipoCliente);



	if(iXPanelCamposAnticipoCliente % 2==0) {
		iXPanelCamposAnticipoCliente=0;
		iYPanelCamposAnticipoCliente++;
	}
	this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
	this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAnticipoCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAnticipoCliente.gridy = iYPanelCamposAnticipoCliente;
	this.gridBagConstraintsAnticipoCliente.gridx = iXPanelCamposAnticipoCliente++;
	this.gridBagConstraintsAnticipoCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAnticipoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAnticipoCliente.add(this.jPaneldescuento4AnticipoCliente, this.gridBagConstraintsAnticipoCliente);



	if(iXPanelCamposAnticipoCliente % 2==0) {
		iXPanelCamposAnticipoCliente=0;
		iYPanelCamposAnticipoCliente++;
	}
	this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
	this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAnticipoCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAnticipoCliente.gridy = iYPanelCamposAnticipoCliente;
	this.gridBagConstraintsAnticipoCliente.gridx = iXPanelCamposAnticipoCliente++;
	this.gridBagConstraintsAnticipoCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAnticipoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAnticipoCliente.add(this.jPaneldescuento5AnticipoCliente, this.gridBagConstraintsAnticipoCliente);



	if(iXPanelCamposAnticipoCliente % 2==0) {
		iXPanelCamposAnticipoCliente=0;
		iYPanelCamposAnticipoCliente++;
	}
	this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
	this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAnticipoCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAnticipoCliente.gridy = iYPanelCamposAnticipoCliente;
	this.gridBagConstraintsAnticipoCliente.gridx = iXPanelCamposAnticipoCliente++;
	this.gridBagConstraintsAnticipoCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAnticipoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAnticipoCliente.add(this.jPaneltipo_ingresoAnticipoCliente, this.gridBagConstraintsAnticipoCliente);



	if(iXPanelCamposAnticipoCliente % 2==0) {
		iXPanelCamposAnticipoCliente=0;
		iYPanelCamposAnticipoCliente++;
	}
	this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
	this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAnticipoCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAnticipoCliente.gridy = iYPanelCamposAnticipoCliente;
	this.gridBagConstraintsAnticipoCliente.gridx = iXPanelCamposAnticipoCliente++;
	this.gridBagConstraintsAnticipoCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAnticipoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAnticipoCliente.add(this.jPaneltipo_descuentoAnticipoCliente, this.gridBagConstraintsAnticipoCliente);



	if(iXPanelCamposAnticipoCliente % 2==0) {
		iXPanelCamposAnticipoCliente=0;
		iYPanelCamposAnticipoCliente++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
	this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAnticipoCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAnticipoCliente.gridy = iYPanelCamposOcultosAnticipoCliente;
	this.gridBagConstraintsAnticipoCliente.gridx = iXPanelCamposOcultosAnticipoCliente++;
	this.gridBagConstraintsAnticipoCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAnticipoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosAnticipoCliente.add(this.jPanelid_empresaAnticipoCliente, this.gridBagConstraintsAnticipoCliente);



	if(iXPanelCamposOcultosAnticipoCliente % 2==0) {
		iXPanelCamposOcultosAnticipoCliente=0;
		iYPanelCamposOcultosAnticipoCliente++;
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
			
		GridBagLayout gridaBagLayoutAccionesAnticipoCliente= new GridBagLayout();
		this.jPanelAccionesAnticipoCliente.setLayout(gridaBagLayoutAccionesAnticipoCliente);
		
		GridBagLayout gridaBagLayoutAccionesFormularioAnticipoCliente= new GridBagLayout();
		this.jPanelAccionesFormularioAnticipoCliente.setLayout(gridaBagLayoutAccionesFormularioAnticipoCliente);
		
		this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
		this.gridBagConstraintsAnticipoCliente.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsAnticipoCliente.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioAnticipoCliente.add(this.jComboBoxTiposAccionesFormularioAnticipoCliente, this.gridBagConstraintsAnticipoCliente);

		this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
		this.gridBagConstraintsAnticipoCliente.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsAnticipoCliente.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioAnticipoCliente.add(this.jCheckBoxPostAccionNuevoAnticipoCliente, this.gridBagConstraintsAnticipoCliente);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.anticipoclienteSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
			this.gridBagConstraintsAnticipoCliente.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsAnticipoCliente.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioAnticipoCliente.add(this.jCheckBoxPostAccionSinCerrarAnticipoCliente, this.gridBagConstraintsAnticipoCliente);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.anticipoclienteSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.anticipoclienteSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
			this.gridBagConstraintsAnticipoCliente.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsAnticipoCliente.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioAnticipoCliente.add(this.jCheckBoxPostAccionSinMensajeAnticipoCliente, this.gridBagConstraintsAnticipoCliente);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
		this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAnticipoCliente.gridy = 0;
		this.gridBagConstraintsAnticipoCliente.gridx = iPosXAccion++;
			
		this.jPanelAccionesAnticipoCliente.add(this.jButtonModificarAnticipoCliente, this.gridBagConstraintsAnticipoCliente);							

		this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
		this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAnticipoCliente.gridy = 0;
		this.gridBagConstraintsAnticipoCliente.gridx =iPosXAccion++;
			
		this.jPanelAccionesAnticipoCliente.add(this.jButtonEliminarAnticipoCliente, this.gridBagConstraintsAnticipoCliente);
		
			
		this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
		this.gridBagConstraintsAnticipoCliente.gridy = 0;		
		this.gridBagConstraintsAnticipoCliente.gridx = iPosXAccion++;
		
		this.jPanelAccionesAnticipoCliente.add(this.jButtonActualizarAnticipoCliente, this.gridBagConstraintsAnticipoCliente);


		this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
		this.gridBagConstraintsAnticipoCliente.gridy = 0;		
		this.gridBagConstraintsAnticipoCliente.gridx = iPosXAccion++;
		
		this.jPanelAccionesAnticipoCliente.add(this.jButtonGuardarCambiosAnticipoCliente, this.gridBagConstraintsAnticipoCliente);	
		
		this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
		this.gridBagConstraintsAnticipoCliente.gridy = 0;		
		this.gridBagConstraintsAnticipoCliente.gridx =iPosXAccion++;
		
		this.jPanelAccionesAnticipoCliente.add(this.jButtonCancelarAnticipoCliente, this.gridBagConstraintsAnticipoCliente);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutAnticipoCliente = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutAnticipoCliente);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.anticipoclienteSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();						
			this.gridBagConstraintsAnticipoCliente.gridy = iGridyPrincipal++;
			this.gridBagConstraintsAnticipoCliente.gridx = 0;		
			//this.gridBagConstraintsAnticipoCliente.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAnticipoCliente.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsAnticipoCliente.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
		this.gridBagConstraintsAnticipoCliente.gridy =iGridyPrincipal++;
		this.gridBagConstraintsAnticipoCliente.gridx =0;
		this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsAnticipoCliente.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosAnticipoCliente, this.gridBagConstraintsAnticipoCliente);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(AnticipoClienteJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleAnticipoCliente = new AnticipoClienteBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Anticipo Cliente DATOS");
			
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
			
	        //this.setTitle("[FOR] - Anticipo Cliente DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Anticipo Cliente Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			AnticipoClienteModel anticipoclienteModel=new AnticipoClienteModel(this);
			
			//SI USARA CLASE INTERNA
			//AnticipoClienteModel.AnticipoClienteFocusTraversalPolicy anticipoclienteFocusTraversalPolicy = anticipoclienteModel.new AnticipoClienteFocusTraversalPolicy(this);
			
			//anticipoclienteFocusTraversalPolicy.setanticipoclienteJInternalFrame(this);
			
			this.setFocusTraversalPolicy(anticipoclienteModel);
			
			
			this.jContentPaneDetalleAnticipoCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleAnticipoCliente = new GridBagLayout();	
			this.jContentPaneDetalleAnticipoCliente.setLayout(gridaBagLayoutDetalleAnticipoCliente);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosAnticipoCliente = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
				this.gridBagConstraintsAnticipoCliente.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsAnticipoCliente.gridx = 0;
					
				
				this.jContentPaneDetalleAnticipoCliente.add(jTtoolBarDetalleAnticipoCliente, gridBagConstraintsAnticipoCliente);								
				
}
			
			this.jScrollPanelDatosEdicionAnticipoCliente=   new JScrollPane(jContentPaneDetalleAnticipoCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionAnticipoCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionAnticipoCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionAnticipoCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralAnticipoCliente=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralAnticipoCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralAnticipoCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralAnticipoCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
			
			
	        this.gridBagConstraintsAnticipoCliente.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsAnticipoCliente.gridx = 0;
	        
			this.jContentPaneDetalleAnticipoCliente.add(jPanelCamposAnticipoCliente, gridBagConstraintsAnticipoCliente);
			
			
			
			
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
						&& anticipoclienteSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.anticipoclienteSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsAnticipoCliente= new GridBagConstraints();
						this.gridBagConstraintsAnticipoCliente.gridy = iGridyRelaciones++;
						this.gridBagConstraintsAnticipoCliente.gridx = 0;
						this.jContentPaneDetalleAnticipoCliente.add(this.jTabbedPaneRelacionesAnticipoCliente, this.gridBagConstraintsAnticipoCliente);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesAnticipoCliente.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosAnticipoCliente.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
					this.gridBagConstraintsAnticipoCliente.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsAnticipoCliente.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsAnticipoCliente.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsAnticipoCliente.gridx = 0;
					
				
					this.jContentPaneDetalleAnticipoCliente.add(jPanelCamposOcultosAnticipoCliente, gridBagConstraintsAnticipoCliente);
				
					this.jPanelCamposOcultosAnticipoCliente.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
			this.gridBagConstraintsAnticipoCliente.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsAnticipoCliente.gridx = 0;
	        this.gridBagConstraintsAnticipoCliente.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleAnticipoCliente.add(this.jPanelAccionesFormularioAnticipoCliente, this.gridBagConstraintsAnticipoCliente);							
			
			
			
			this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
	        this.gridBagConstraintsAnticipoCliente.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsAnticipoCliente.gridx = 0;
	        
			
			this.jContentPaneDetalleAnticipoCliente.add(this.jPanelAccionesAnticipoCliente, this.gridBagConstraintsAnticipoCliente);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionAnticipoCliente);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionAnticipoCliente=   new JScrollPane(this.jPanelCamposAnticipoCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionAnticipoCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionAnticipoCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionAnticipoCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
			this.gridBagConstraintsAnticipoCliente.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsAnticipoCliente.gridx = 0;
			this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsAnticipoCliente.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsAnticipoCliente.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionAnticipoCliente, this.gridBagConstraintsAnticipoCliente);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
			this.gridBagConstraintsAnticipoCliente.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsAnticipoCliente.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioAnticipoCliente, this.gridBagConstraintsAnticipoCliente);			
			
			this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
			this.gridBagConstraintsAnticipoCliente.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsAnticipoCliente.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesAnticipoCliente, this.gridBagConstraintsAnticipoCliente);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
		this.gridBagConstraintsAnticipoCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAnticipoCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposAnticipoCliente, this.gridBagConstraintsAnticipoCliente);
			
			
		this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
		this.gridBagConstraintsAnticipoCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAnticipoCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosAnticipoCliente, this.gridBagConstraintsAnticipoCliente);
		
			
		this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
		this.gridBagConstraintsAnticipoCliente.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsAnticipoCliente.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesAnticipoCliente, this.gridBagConstraintsAnticipoCliente);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralAnticipoCliente;//jContentPane;
		
		return jScrollPanelDatosEdicionAnticipoCliente;
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
