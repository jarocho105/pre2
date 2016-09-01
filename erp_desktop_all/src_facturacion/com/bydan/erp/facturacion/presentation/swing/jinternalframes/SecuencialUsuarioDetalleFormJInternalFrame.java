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

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.facturacion.util.SecuencialUsuarioConstantesFunciones;

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
public class SecuencialUsuarioDetalleFormJInternalFrame extends SecuencialUsuarioBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleSecuencialUsuario;
	
	protected JMenuBar jmenuBarDetalleSecuencialUsuario;
	
	protected JMenu jmenuDetalleSecuencialUsuario;
	protected JMenu jmenuDetalleArchivoSecuencialUsuario;
	protected JMenu jmenuDetalleAccionesSecuencialUsuario;
	protected JMenu jmenuDetalleDatosSecuencialUsuario;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleSecuencialUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutSecuencialUsuario;	
	protected GridBagConstraints gridBagConstraintsSecuencialUsuario;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected SecuencialUsuarioBeanSwingJInternalFrameAdditional jInternalFrameDetalleSecuencialUsuario;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_usuario="";

	protected TipoDocumentoGeneralBeanSwingJInternalFrame tipodocumentogeneralBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipodocumentogeneral="";
	
	public SecuencialUsuarioSessionBean secuencialusuarioSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public UsuarioSessionBean usuarioSessionBean;
	public TipoDocumentoGeneralSessionBean tipodocumentogeneralSessionBean;	
	
	public SecuencialUsuarioLogic secuencialusuarioLogic;
	
	public JScrollPane jScrollPanelDatosSecuencialUsuario;
	public JScrollPane jScrollPanelDatosEdicionSecuencialUsuario;
	public JScrollPane jScrollPanelDatosGeneralSecuencialUsuario;
	
	protected JPanel jPanelCamposSecuencialUsuario;    
	protected JPanel jPanelCamposOcultosSecuencialUsuario;    	
	protected JPanel jPanelAccionesSecuencialUsuario;
	protected JPanel jPanelAccionesFormularioSecuencialUsuario;
    
	
	
	protected Integer iXPanelCamposSecuencialUsuario=0;
	protected Integer iYPanelCamposSecuencialUsuario=0;
	
	protected Integer iXPanelCamposOcultosSecuencialUsuario=0;
	protected Integer iYPanelCamposOcultosSecuencialUsuario=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoSecuencialUsuario;
	public JButton jButtonModificarSecuencialUsuario;
	public JButton jButtonActualizarSecuencialUsuario;
    public JButton jButtonEliminarSecuencialUsuario;
	public JButton jButtonCancelarSecuencialUsuario;
    public JButton jButtonGuardarCambiosSecuencialUsuario;
	public JButton jButtonGuardarCambiosTablaSecuencialUsuario;
	protected JButton jButtonCerrarSecuencialUsuario;
	
	
	protected JButton jButtonProcesarInformacionSecuencialUsuario;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoSecuencialUsuario;
	protected JCheckBox jCheckBoxPostAccionSinCerrarSecuencialUsuario;
	protected JCheckBox jCheckBoxPostAccionSinMensajeSecuencialUsuario;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarSecuencialUsuario;
	protected JButton jButtonModificarToolBarSecuencialUsuario;
	protected JButton jButtonActualizarToolBarSecuencialUsuario;
    protected JButton jButtonEliminarToolBarSecuencialUsuario;
	protected JButton jButtonCancelarToolBarSecuencialUsuario;
    protected JButton jButtonGuardarCambiosToolBarSecuencialUsuario;
	protected JButton jButtonGuardarCambiosTablaToolBarSecuencialUsuario;
	protected JButton jButtonMostrarOcultarTablaToolBarSecuencialUsuario;
	protected JButton jButtonCerrarToolBarSecuencialUsuario;
	
	protected JButton jButtonProcesarInformacionToolBarSecuencialUsuario;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoSecuencialUsuario;
	protected JMenuItem jMenuItemModificarSecuencialUsuario;
	protected JMenuItem jMenuItemActualizarSecuencialUsuario;
    protected JMenuItem jMenuItemEliminarSecuencialUsuario;
	protected JMenuItem jMenuItemCancelarSecuencialUsuario;
    protected JMenuItem jMenuItemGuardarCambiosSecuencialUsuario;
	protected JMenuItem jMenuItemGuardarCambiosTablaSecuencialUsuario;
	protected JMenuItem jMenuItemCerrarSecuencialUsuario;
	protected JMenuItem jMenuItemDetalleCerrarSecuencialUsuario;
	protected JMenuItem jMenuItemDetalleMostarOcultarSecuencialUsuario;
	
	protected JMenuItem jMenuItemProcesarInformacionSecuencialUsuario;
	protected JMenuItem jMenuItemNuevoGuardarCambiosSecuencialUsuario;
	protected JMenuItem jMenuItemMostrarOcultarSecuencialUsuario;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesSecuencialUsuario;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesSecuencialUsuario;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesSecuencialUsuario;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioSecuencialUsuario;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidSecuencialUsuario;
	public JLabel jLabelIdSecuencialUsuario;
	public JLabel jLabelidSecuencialUsuario;
	public JButton jButtonidSecuencialUsuarioBusqueda= new JButtonMe();

	public JPanel jPanelserieSecuencialUsuario;
	public JLabel jLabelserieSecuencialUsuario;
	public JTextField jTextFieldserieSecuencialUsuario;
	public JButton jButtonserieSecuencialUsuarioBusqueda= new JButtonMe();

	public JPanel jPanelautorizacionSecuencialUsuario;
	public JLabel jLabelautorizacionSecuencialUsuario;
	public JTextField jTextFieldautorizacionSecuencialUsuario;
	public JButton jButtonautorizacionSecuencialUsuarioBusqueda= new JButtonMe();

	public JPanel jPanelsecuencialSecuencialUsuario;
	public JLabel jLabelsecuencialSecuencialUsuario;
	public JTextField jTextFieldsecuencialSecuencialUsuario;
	public JButton jButtonsecuencialSecuencialUsuarioBusqueda= new JButtonMe();

	public JPanel jPaneldigitosSecuencialUsuario;
	public JLabel jLabeldigitosSecuencialUsuario;
	public JTextField jTextFielddigitosSecuencialUsuario;
	public JButton jButtondigitosSecuencialUsuarioBusqueda= new JButtonMe();

	public JPanel jPanelfecha_inicioSecuencialUsuario;
	public JLabel jLabelfecha_inicioSecuencialUsuario;
	//public JFormattedTextField jDateChooserfecha_inicioSecuencialUsuario;

	public JDateChooser jDateChooserfecha_inicioSecuencialUsuario;
	public JButton jButtonfecha_inicioSecuencialUsuarioBusqueda= new JButtonMe();

	public JPanel jPanelfecha_finSecuencialUsuario;
	public JLabel jLabelfecha_finSecuencialUsuario;
	//public JFormattedTextField jDateChooserfecha_finSecuencialUsuario;

	public JDateChooser jDateChooserfecha_finSecuencialUsuario;
	public JButton jButtonfecha_finSecuencialUsuarioBusqueda= new JButtonMe();

	public JPanel jPanelesta_activoSecuencialUsuario;
	public JLabel jLabelesta_activoSecuencialUsuario;
	public JCheckBox jCheckBoxesta_activoSecuencialUsuario;
	public JButton jButtonesta_activoSecuencialUsuarioBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaSecuencialUsuario;
	public JLabel jLabelid_empresaSecuencialUsuario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaSecuencialUsuario;
	public JButton jButtonid_empresaSecuencialUsuario= new JButtonMe();
	public JButton jButtonid_empresaSecuencialUsuarioUpdate= new JButtonMe();
	public JButton jButtonid_empresaSecuencialUsuarioBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalSecuencialUsuario;
	public JLabel jLabelid_sucursalSecuencialUsuario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalSecuencialUsuario;
	public JButton jButtonid_sucursalSecuencialUsuario= new JButtonMe();
	public JButton jButtonid_sucursalSecuencialUsuarioUpdate= new JButtonMe();
	public JButton jButtonid_sucursalSecuencialUsuarioBusqueda= new JButtonMe();

	public JPanel jPanelid_usuarioSecuencialUsuario;
	public JLabel jLabelid_usuarioSecuencialUsuario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_usuarioSecuencialUsuario;
	public JButton jButtonid_usuarioSecuencialUsuario= new JButtonMe();
	public JButton jButtonid_usuarioSecuencialUsuarioUpdate= new JButtonMe();
	public JButton jButtonid_usuarioSecuencialUsuarioBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_documento_generalSecuencialUsuario;
	public JLabel jLabelid_tipo_documento_generalSecuencialUsuario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_documento_generalSecuencialUsuario;
	public JButton jButtonid_tipo_documento_generalSecuencialUsuario= new JButtonMe();
	public JButton jButtonid_tipo_documento_generalSecuencialUsuarioUpdate= new JButtonMe();
	public JButton jButtonid_tipo_documento_generalSecuencialUsuarioBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesSecuencialUsuario;
	
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
	public int iHeightFormulario=814;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public SecuencialUsuarioDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposSecuencialUsuario=new JPanel();
				this.jPanelAccionesFormularioSecuencialUsuario=new JPanel();
				this.jmenuBarDetalleSecuencialUsuario=new JMenuBar();
				this.jTtoolBarDetalleSecuencialUsuario=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SecuencialUsuarioDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("SecuencialUsuario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public SecuencialUsuarioDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("SecuencialUsuario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SecuencialUsuarioDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("SecuencialUsuario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SecuencialUsuarioDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("SecuencialUsuario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SecuencialUsuarioDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("SecuencialUsuario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarSecuencialUsuario() {
		return this.jButtonActualizarToolBarSecuencialUsuario;
	}
	
	public JButton getjButtonEliminarToolBarSecuencialUsuario() {
		return this.jButtonEliminarToolBarSecuencialUsuario;
	}
	
	public JButton getjButtonCancelarToolBarSecuencialUsuario() {
		return this.jButtonCancelarToolBarSecuencialUsuario;
	}		
	
	public JButton getjButtonProcesarInformacionSecuencialUsuario() {
		return this.jButtonProcesarInformacionSecuencialUsuario;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionSecuencialUsuario)	{
		this.jButtonProcesarInformacionSecuencialUsuario = jButtonProcesarInformacionSecuencialUsuario;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesSecuencialUsuario() {
		return this.jComboBoxTiposAccionesSecuencialUsuario;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesSecuencialUsuario(
			JComboBox jComboBoxTiposRelacionesSecuencialUsuario) {
		this.jComboBoxTiposRelacionesSecuencialUsuario = jComboBoxTiposRelacionesSecuencialUsuario;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesSecuencialUsuario(
			JComboBox jComboBoxTiposAccionesSecuencialUsuario) {
		this.jComboBoxTiposAccionesSecuencialUsuario = jComboBoxTiposAccionesSecuencialUsuario;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioSecuencialUsuario() {
		return this.jComboBoxTiposAccionesFormularioSecuencialUsuario;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioSecuencialUsuario(
			JComboBox jComboBoxTiposAccionesFormularioSecuencialUsuario) {
		this.jComboBoxTiposAccionesFormularioSecuencialUsuario = jComboBoxTiposAccionesFormularioSecuencialUsuario;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.secuencialusuarioSessionBean=new SecuencialUsuarioSessionBean();
		
		this.secuencialusuarioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.secuencialusuarioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.secuencialusuarioSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		SecuencialUsuarioJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		SecuencialUsuarioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		SecuencialUsuarioJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Secuencial Usuario MANTENIMIENTO"));
		
		
		if(iWidth > 1150) {
			iWidth=1150;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.secuencialusuarioSessionBean.getEsGuardarRelacionado()) {
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
	
		SecuencialUsuarioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleSecuencialUsuario= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarSecuencialUsuario=new JButtonMe();
				this.jButtonModificarToolBarSecuencialUsuario=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarSecuencialUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarSecuencialUsuario,this.jTtoolBarDetalleSecuencialUsuario,
							"actualizar","actualizar","Actualizar"+" "+SecuencialUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarSecuencialUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarSecuencialUsuario,this.jTtoolBarDetalleSecuencialUsuario,
							"eliminar","eliminar","Eliminar"+" "+SecuencialUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarSecuencialUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarSecuencialUsuario,this.jTtoolBarDetalleSecuencialUsuario,
							"cancelar","cancelar","Cancelar"+" "+SecuencialUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarSecuencialUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarSecuencialUsuario,this.jTtoolBarDetalleSecuencialUsuario,
							"guardarcambios","guardarcambios","Guardar"+" "+SecuencialUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarSecuencialUsuario,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarSecuencialUsuario,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarSecuencialUsuario,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleSecuencialUsuario=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleSecuencialUsuario=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoSecuencialUsuario=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesSecuencialUsuario=new JMenuMe("Acciones");
		this.jmenuDetalleDatosSecuencialUsuario=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoSecuencialUsuario= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoSecuencialUsuario.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoSecuencialUsuario,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoSecuencialUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarSecuencialUsuario= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarSecuencialUsuario.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarSecuencialUsuario,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarSecuencialUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarSecuencialUsuario= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarSecuencialUsuario.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarSecuencialUsuario,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarSecuencialUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarSecuencialUsuario= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarSecuencialUsuario.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarSecuencialUsuario,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarSecuencialUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarSecuencialUsuario= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarSecuencialUsuario.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarSecuencialUsuario,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarSecuencialUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosSecuencialUsuario= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosSecuencialUsuario.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosSecuencialUsuario,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosSecuencialUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarSecuencialUsuario= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarSecuencialUsuario.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarSecuencialUsuario,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarSecuencialUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarSecuencialUsuario= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarSecuencialUsuario.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarSecuencialUsuario,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarSecuencialUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarSecuencialUsuario= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarSecuencialUsuario.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarSecuencialUsuario,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarSecuencialUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarSecuencialUsuario= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarSecuencialUsuario.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarSecuencialUsuario,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarSecuencialUsuario, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoSecuencialUsuario.add(this.jMenuItemDetalleCerrarSecuencialUsuario);
		
		this.jmenuDetalleAccionesSecuencialUsuario.add(this.jMenuItemActualizarSecuencialUsuario);
		this.jmenuDetalleAccionesSecuencialUsuario.add(this.jMenuItemEliminarSecuencialUsuario);
		this.jmenuDetalleAccionesSecuencialUsuario.add(this.jMenuItemCancelarSecuencialUsuario);		
		
		//this.jmenuDetalleDatosSecuencialUsuario.add(this.jMenuItemDetalleAbrirOrderBySecuencialUsuario);				
		this.jmenuDetalleDatosSecuencialUsuario.add(this.jMenuItemDetalleMostarOcultarSecuencialUsuario);				
				
		//this.jmenuDetalleAccionesSecuencialUsuario.add(this.jMenuItemGuardarCambiosSecuencialUsuario);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoSecuencialUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesSecuencialUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosSecuencialUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleSecuencialUsuario.add(this.jmenuDetalleArchivoSecuencialUsuario);		
		this.jmenuBarDetalleSecuencialUsuario.add(this.jmenuDetalleAccionesSecuencialUsuario);		
		this.jmenuBarDetalleSecuencialUsuario.add(this.jmenuDetalleDatosSecuencialUsuario);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleSecuencialUsuario);				
	}
	
	
	public void inicializarElementosCamposSecuencialUsuario() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdSecuencialUsuario = new JLabelMe();
		jLabelIdSecuencialUsuario.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdSecuencialUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdSecuencialUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdSecuencialUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdSecuencialUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidSecuencialUsuario = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidSecuencialUsuario.setToolTipText(SecuencialUsuarioConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutSecuencialUsuario= new GridBagLayout();

		this.jPanelidSecuencialUsuario.setLayout(this.gridaBagLayoutSecuencialUsuario);

		jLabelidSecuencialUsuario = new JLabel();
		jLabelidSecuencialUsuario.setText("Id");

		jLabelidSecuencialUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidSecuencialUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidSecuencialUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelserieSecuencialUsuario = new JLabelMe();
		this.jLabelserieSecuencialUsuario.setText(""+SecuencialUsuarioConstantesFunciones.LABEL_SERIE+" : *");
		this.jLabelserieSecuencialUsuario.setToolTipText("Serie");
		this.jLabelserieSecuencialUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelserieSecuencialUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelserieSecuencialUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelserieSecuencialUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelserieSecuencialUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelserieSecuencialUsuario.setToolTipText(SecuencialUsuarioConstantesFunciones.LABEL_SERIE);
		this.gridaBagLayoutSecuencialUsuario = new GridBagLayout();
		this.jPanelserieSecuencialUsuario.setLayout(this.gridaBagLayoutSecuencialUsuario);


		jTextFieldserieSecuencialUsuario= new JTextFieldMe();

		jTextFieldserieSecuencialUsuario.setEnabled(false);
		jTextFieldserieSecuencialUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldserieSecuencialUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldserieSecuencialUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldserieSecuencialUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonserieSecuencialUsuarioBusqueda= new JButtonMe();
		this.jButtonserieSecuencialUsuarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonserieSecuencialUsuarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonserieSecuencialUsuarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonserieSecuencialUsuarioBusqueda.setText("U");
		this.jButtonserieSecuencialUsuarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonserieSecuencialUsuarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonserieSecuencialUsuarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldserieSecuencialUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldserieSecuencialUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"serieSecuencialUsuarioBusqueda"));

		if(this.secuencialusuarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonserieSecuencialUsuarioBusqueda.setVisible(false);		}


					
		this.jLabelautorizacionSecuencialUsuario = new JLabelMe();
		this.jLabelautorizacionSecuencialUsuario.setText(""+SecuencialUsuarioConstantesFunciones.LABEL_AUTORIZACION+" : *");
		this.jLabelautorizacionSecuencialUsuario.setToolTipText("Autorizacion");
		this.jLabelautorizacionSecuencialUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelautorizacionSecuencialUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelautorizacionSecuencialUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelautorizacionSecuencialUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelautorizacionSecuencialUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelautorizacionSecuencialUsuario.setToolTipText(SecuencialUsuarioConstantesFunciones.LABEL_AUTORIZACION);
		this.gridaBagLayoutSecuencialUsuario = new GridBagLayout();
		this.jPanelautorizacionSecuencialUsuario.setLayout(this.gridaBagLayoutSecuencialUsuario);


		jTextFieldautorizacionSecuencialUsuario= new JTextFieldMe();

		jTextFieldautorizacionSecuencialUsuario.setEnabled(false);
		jTextFieldautorizacionSecuencialUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldautorizacionSecuencialUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldautorizacionSecuencialUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldautorizacionSecuencialUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonautorizacionSecuencialUsuarioBusqueda= new JButtonMe();
		this.jButtonautorizacionSecuencialUsuarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonautorizacionSecuencialUsuarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonautorizacionSecuencialUsuarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonautorizacionSecuencialUsuarioBusqueda.setText("U");
		this.jButtonautorizacionSecuencialUsuarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonautorizacionSecuencialUsuarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonautorizacionSecuencialUsuarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldautorizacionSecuencialUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldautorizacionSecuencialUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"autorizacionSecuencialUsuarioBusqueda"));

		if(this.secuencialusuarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonautorizacionSecuencialUsuarioBusqueda.setVisible(false);		}


					
		this.jLabelsecuencialSecuencialUsuario = new JLabelMe();
		this.jLabelsecuencialSecuencialUsuario.setText(""+SecuencialUsuarioConstantesFunciones.LABEL_SECUENCIAL+" : *");
		this.jLabelsecuencialSecuencialUsuario.setToolTipText("Secuencial");
		this.jLabelsecuencialSecuencialUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsecuencialSecuencialUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsecuencialSecuencialUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsecuencialSecuencialUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsecuencialSecuencialUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsecuencialSecuencialUsuario.setToolTipText(SecuencialUsuarioConstantesFunciones.LABEL_SECUENCIAL);
		this.gridaBagLayoutSecuencialUsuario = new GridBagLayout();
		this.jPanelsecuencialSecuencialUsuario.setLayout(this.gridaBagLayoutSecuencialUsuario);


		jTextFieldsecuencialSecuencialUsuario= new JTextFieldMe();

		jTextFieldsecuencialSecuencialUsuario.setEnabled(false);
		jTextFieldsecuencialSecuencialUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuencialSecuencialUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuencialSecuencialUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsecuencialSecuencialUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonsecuencialSecuencialUsuarioBusqueda= new JButtonMe();
		this.jButtonsecuencialSecuencialUsuarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuencialSecuencialUsuarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuencialSecuencialUsuarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsecuencialSecuencialUsuarioBusqueda.setText("U");
		this.jButtonsecuencialSecuencialUsuarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsecuencialSecuencialUsuarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsecuencialSecuencialUsuarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsecuencialSecuencialUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsecuencialSecuencialUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"secuencialSecuencialUsuarioBusqueda"));

		if(this.secuencialusuarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsecuencialSecuencialUsuarioBusqueda.setVisible(false);		}


					
		this.jLabeldigitosSecuencialUsuario = new JLabelMe();
		this.jLabeldigitosSecuencialUsuario.setText(""+SecuencialUsuarioConstantesFunciones.LABEL_DIGITOS+" : *");
		this.jLabeldigitosSecuencialUsuario.setToolTipText("Digitos");
		this.jLabeldigitosSecuencialUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldigitosSecuencialUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldigitosSecuencialUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldigitosSecuencialUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldigitosSecuencialUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldigitosSecuencialUsuario.setToolTipText(SecuencialUsuarioConstantesFunciones.LABEL_DIGITOS);
		this.gridaBagLayoutSecuencialUsuario = new GridBagLayout();
		this.jPaneldigitosSecuencialUsuario.setLayout(this.gridaBagLayoutSecuencialUsuario);


		jTextFielddigitosSecuencialUsuario= new JTextFieldMe();
		jTextFielddigitosSecuencialUsuario.setEnabled(false);
		jTextFielddigitosSecuencialUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddigitosSecuencialUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddigitosSecuencialUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddigitosSecuencialUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddigitosSecuencialUsuario.setText("0");

		this.jButtondigitosSecuencialUsuarioBusqueda= new JButtonMe();
		this.jButtondigitosSecuencialUsuarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondigitosSecuencialUsuarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondigitosSecuencialUsuarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondigitosSecuencialUsuarioBusqueda.setText("U");
		this.jButtondigitosSecuencialUsuarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondigitosSecuencialUsuarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondigitosSecuencialUsuarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddigitosSecuencialUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddigitosSecuencialUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"digitosSecuencialUsuarioBusqueda"));

		if(this.secuencialusuarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondigitosSecuencialUsuarioBusqueda.setVisible(false);		}


					
		this.jLabelfecha_inicioSecuencialUsuario = new JLabelMe();
		this.jLabelfecha_inicioSecuencialUsuario.setText(""+SecuencialUsuarioConstantesFunciones.LABEL_FECHAINICIO+" : *");
		this.jLabelfecha_inicioSecuencialUsuario.setToolTipText("Fecha Inicio");
		this.jLabelfecha_inicioSecuencialUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_inicioSecuencialUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_inicioSecuencialUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_inicioSecuencialUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_inicioSecuencialUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_inicioSecuencialUsuario.setToolTipText(SecuencialUsuarioConstantesFunciones.LABEL_FECHAINICIO);
		this.gridaBagLayoutSecuencialUsuario = new GridBagLayout();
		this.jPanelfecha_inicioSecuencialUsuario.setLayout(this.gridaBagLayoutSecuencialUsuario);


		//jFormattedTextFieldfecha_inicioSecuencialUsuario= new JFormattedTextFieldMe();

		jDateChooserfecha_inicioSecuencialUsuario= new JDateChooser();
		jDateChooserfecha_inicioSecuencialUsuario.setEnabled(false);
		jDateChooserfecha_inicioSecuencialUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioSecuencialUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioSecuencialUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_inicioSecuencialUsuario,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_inicioSecuencialUsuario.setDate(new Date());
		jDateChooserfecha_inicioSecuencialUsuario.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_inicioSecuencialUsuario.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_inicioSecuencialUsuarioBusqueda= new JButtonMe();
		this.jButtonfecha_inicioSecuencialUsuarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_inicioSecuencialUsuarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_inicioSecuencialUsuarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_inicioSecuencialUsuarioBusqueda.setText("U");
		this.jButtonfecha_inicioSecuencialUsuarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_inicioSecuencialUsuarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_inicioSecuencialUsuarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_inicioSecuencialUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_inicioSecuencialUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_inicioSecuencialUsuarioBusqueda"));

		if(this.secuencialusuarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_inicioSecuencialUsuarioBusqueda.setVisible(false);		}


					
		this.jLabelfecha_finSecuencialUsuario = new JLabelMe();
		this.jLabelfecha_finSecuencialUsuario.setText(""+SecuencialUsuarioConstantesFunciones.LABEL_FECHAFIN+" : *");
		this.jLabelfecha_finSecuencialUsuario.setToolTipText("Fecha Fin");
		this.jLabelfecha_finSecuencialUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_finSecuencialUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_finSecuencialUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_finSecuencialUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_finSecuencialUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_finSecuencialUsuario.setToolTipText(SecuencialUsuarioConstantesFunciones.LABEL_FECHAFIN);
		this.gridaBagLayoutSecuencialUsuario = new GridBagLayout();
		this.jPanelfecha_finSecuencialUsuario.setLayout(this.gridaBagLayoutSecuencialUsuario);


		//jFormattedTextFieldfecha_finSecuencialUsuario= new JFormattedTextFieldMe();

		jDateChooserfecha_finSecuencialUsuario= new JDateChooser();
		jDateChooserfecha_finSecuencialUsuario.setEnabled(false);
		jDateChooserfecha_finSecuencialUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finSecuencialUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finSecuencialUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_finSecuencialUsuario,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_finSecuencialUsuario.setDate(new Date());
		jDateChooserfecha_finSecuencialUsuario.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_finSecuencialUsuario.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_finSecuencialUsuarioBusqueda= new JButtonMe();
		this.jButtonfecha_finSecuencialUsuarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_finSecuencialUsuarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_finSecuencialUsuarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_finSecuencialUsuarioBusqueda.setText("U");
		this.jButtonfecha_finSecuencialUsuarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_finSecuencialUsuarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_finSecuencialUsuarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_finSecuencialUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_finSecuencialUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_finSecuencialUsuarioBusqueda"));

		if(this.secuencialusuarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_finSecuencialUsuarioBusqueda.setVisible(false);		}


					
		this.jLabelesta_activoSecuencialUsuario = new JLabelMe();
		this.jLabelesta_activoSecuencialUsuario.setText(""+SecuencialUsuarioConstantesFunciones.LABEL_ESTAACTIVO+" : *");
		this.jLabelesta_activoSecuencialUsuario.setToolTipText("Esta Activo");
		this.jLabelesta_activoSecuencialUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelesta_activoSecuencialUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelesta_activoSecuencialUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelesta_activoSecuencialUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelesta_activoSecuencialUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelesta_activoSecuencialUsuario.setToolTipText(SecuencialUsuarioConstantesFunciones.LABEL_ESTAACTIVO);
		this.gridaBagLayoutSecuencialUsuario = new GridBagLayout();
		this.jPanelesta_activoSecuencialUsuario.setLayout(this.gridaBagLayoutSecuencialUsuario);


		jCheckBoxesta_activoSecuencialUsuario= new JCheckBoxMe();
		jCheckBoxesta_activoSecuencialUsuario.setEnabled(false);

		jCheckBoxesta_activoSecuencialUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesta_activoSecuencialUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesta_activoSecuencialUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxesta_activoSecuencialUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonesta_activoSecuencialUsuarioBusqueda= new JButtonMe();
		this.jButtonesta_activoSecuencialUsuarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesta_activoSecuencialUsuarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesta_activoSecuencialUsuarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonesta_activoSecuencialUsuarioBusqueda.setText("U");
		this.jButtonesta_activoSecuencialUsuarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonesta_activoSecuencialUsuarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonesta_activoSecuencialUsuarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxesta_activoSecuencialUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxesta_activoSecuencialUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"esta_activoSecuencialUsuarioBusqueda"));

		if(this.secuencialusuarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonesta_activoSecuencialUsuarioBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysSecuencialUsuario() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaSecuencialUsuario = new JLabelMe();
		this.jLabelid_empresaSecuencialUsuario.setText(""+SecuencialUsuarioConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaSecuencialUsuario.setToolTipText("Empresa");
		this.jLabelid_empresaSecuencialUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaSecuencialUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaSecuencialUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaSecuencialUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaSecuencialUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaSecuencialUsuario.setToolTipText(SecuencialUsuarioConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutSecuencialUsuario = new GridBagLayout();
		this.jPanelid_empresaSecuencialUsuario.setLayout(this.gridaBagLayoutSecuencialUsuario);


		jComboBoxid_empresaSecuencialUsuario= new JComboBoxMe();
		jComboBoxid_empresaSecuencialUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaSecuencialUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaSecuencialUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaSecuencialUsuario,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaSecuencialUsuario.setEnabled(false);

		this.jButtonid_empresaSecuencialUsuario= new JButtonMe();
		this.jButtonid_empresaSecuencialUsuario.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaSecuencialUsuario.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaSecuencialUsuario.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaSecuencialUsuario.setText("Buscar");
		this.jButtonid_empresaSecuencialUsuario.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaSecuencialUsuario.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaSecuencialUsuario,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaSecuencialUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaSecuencialUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaSecuencialUsuario"));

		this.jButtonid_empresaSecuencialUsuarioBusqueda= new JButtonMe();
		this.jButtonid_empresaSecuencialUsuarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaSecuencialUsuarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaSecuencialUsuarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaSecuencialUsuarioBusqueda.setText("U");
		this.jButtonid_empresaSecuencialUsuarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaSecuencialUsuarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaSecuencialUsuarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaSecuencialUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaSecuencialUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaSecuencialUsuarioBusqueda"));

		if(this.secuencialusuarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaSecuencialUsuarioBusqueda.setVisible(false);		}

		this.jButtonid_empresaSecuencialUsuarioUpdate= new JButtonMe();
		this.jButtonid_empresaSecuencialUsuarioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaSecuencialUsuarioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaSecuencialUsuarioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaSecuencialUsuarioUpdate.setText("U");
		this.jButtonid_empresaSecuencialUsuarioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaSecuencialUsuarioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaSecuencialUsuarioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaSecuencialUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaSecuencialUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaSecuencialUsuarioUpdate"));



					
		this.jLabelid_sucursalSecuencialUsuario = new JLabelMe();
		this.jLabelid_sucursalSecuencialUsuario.setText(""+SecuencialUsuarioConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalSecuencialUsuario.setToolTipText("Sucursal");
		this.jLabelid_sucursalSecuencialUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalSecuencialUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalSecuencialUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalSecuencialUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalSecuencialUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalSecuencialUsuario.setToolTipText(SecuencialUsuarioConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutSecuencialUsuario = new GridBagLayout();
		this.jPanelid_sucursalSecuencialUsuario.setLayout(this.gridaBagLayoutSecuencialUsuario);


		jComboBoxid_sucursalSecuencialUsuario= new JComboBoxMe();
		jComboBoxid_sucursalSecuencialUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalSecuencialUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalSecuencialUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalSecuencialUsuario,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalSecuencialUsuario.setEnabled(false);

		this.jButtonid_sucursalSecuencialUsuario= new JButtonMe();
		this.jButtonid_sucursalSecuencialUsuario.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalSecuencialUsuario.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalSecuencialUsuario.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalSecuencialUsuario.setText("Buscar");
		this.jButtonid_sucursalSecuencialUsuario.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalSecuencialUsuario.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalSecuencialUsuario,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalSecuencialUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalSecuencialUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalSecuencialUsuario"));

		this.jButtonid_sucursalSecuencialUsuarioBusqueda= new JButtonMe();
		this.jButtonid_sucursalSecuencialUsuarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalSecuencialUsuarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalSecuencialUsuarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalSecuencialUsuarioBusqueda.setText("U");
		this.jButtonid_sucursalSecuencialUsuarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalSecuencialUsuarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalSecuencialUsuarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalSecuencialUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalSecuencialUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalSecuencialUsuarioBusqueda"));

		if(this.secuencialusuarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalSecuencialUsuarioBusqueda.setVisible(false);		}

		this.jButtonid_sucursalSecuencialUsuarioUpdate= new JButtonMe();
		this.jButtonid_sucursalSecuencialUsuarioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalSecuencialUsuarioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalSecuencialUsuarioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalSecuencialUsuarioUpdate.setText("U");
		this.jButtonid_sucursalSecuencialUsuarioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalSecuencialUsuarioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalSecuencialUsuarioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalSecuencialUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalSecuencialUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalSecuencialUsuarioUpdate"));



					
		this.jLabelid_usuarioSecuencialUsuario = new JLabelMe();
		this.jLabelid_usuarioSecuencialUsuario.setText(""+SecuencialUsuarioConstantesFunciones.LABEL_IDUSUARIO+" : *");
		this.jLabelid_usuarioSecuencialUsuario.setToolTipText("Usuario");
		this.jLabelid_usuarioSecuencialUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioSecuencialUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioSecuencialUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_usuarioSecuencialUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_usuarioSecuencialUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_usuarioSecuencialUsuario.setToolTipText(SecuencialUsuarioConstantesFunciones.LABEL_IDUSUARIO);
		this.gridaBagLayoutSecuencialUsuario = new GridBagLayout();
		this.jPanelid_usuarioSecuencialUsuario.setLayout(this.gridaBagLayoutSecuencialUsuario);


		jComboBoxid_usuarioSecuencialUsuario= new JComboBoxMe();
		jComboBoxid_usuarioSecuencialUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioSecuencialUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioSecuencialUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_usuarioSecuencialUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_usuarioSecuencialUsuario= new JButtonMe();
		this.jButtonid_usuarioSecuencialUsuario.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioSecuencialUsuario.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioSecuencialUsuario.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioSecuencialUsuario.setText("Buscar");
		this.jButtonid_usuarioSecuencialUsuario.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_usuarioSecuencialUsuario.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioSecuencialUsuario,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_usuarioSecuencialUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioSecuencialUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioSecuencialUsuario"));

		this.jButtonid_usuarioSecuencialUsuarioBusqueda= new JButtonMe();
		this.jButtonid_usuarioSecuencialUsuarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioSecuencialUsuarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioSecuencialUsuarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioSecuencialUsuarioBusqueda.setText("U");
		this.jButtonid_usuarioSecuencialUsuarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_usuarioSecuencialUsuarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioSecuencialUsuarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_usuarioSecuencialUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioSecuencialUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioSecuencialUsuarioBusqueda"));

		if(this.secuencialusuarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_usuarioSecuencialUsuarioBusqueda.setVisible(false);		}

		this.jButtonid_usuarioSecuencialUsuarioUpdate= new JButtonMe();
		this.jButtonid_usuarioSecuencialUsuarioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioSecuencialUsuarioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioSecuencialUsuarioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioSecuencialUsuarioUpdate.setText("U");
		this.jButtonid_usuarioSecuencialUsuarioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_usuarioSecuencialUsuarioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioSecuencialUsuarioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_usuarioSecuencialUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioSecuencialUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioSecuencialUsuarioUpdate"));



					
		this.jLabelid_tipo_documento_generalSecuencialUsuario = new JLabelMe();
		this.jLabelid_tipo_documento_generalSecuencialUsuario.setText(""+SecuencialUsuarioConstantesFunciones.LABEL_IDTIPODOCUMENTOGENERAL+" : *");
		this.jLabelid_tipo_documento_generalSecuencialUsuario.setToolTipText("T. Documento General");
		this.jLabelid_tipo_documento_generalSecuencialUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_documento_generalSecuencialUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_documento_generalSecuencialUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_documento_generalSecuencialUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_documento_generalSecuencialUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_documento_generalSecuencialUsuario.setToolTipText(SecuencialUsuarioConstantesFunciones.LABEL_IDTIPODOCUMENTOGENERAL);
		this.gridaBagLayoutSecuencialUsuario = new GridBagLayout();
		this.jPanelid_tipo_documento_generalSecuencialUsuario.setLayout(this.gridaBagLayoutSecuencialUsuario);


		jComboBoxid_tipo_documento_generalSecuencialUsuario= new JComboBoxMe();
		jComboBoxid_tipo_documento_generalSecuencialUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_documento_generalSecuencialUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_documento_generalSecuencialUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_documento_generalSecuencialUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_documento_generalSecuencialUsuario= new JButtonMe();
		this.jButtonid_tipo_documento_generalSecuencialUsuario.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_documento_generalSecuencialUsuario.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_documento_generalSecuencialUsuario.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_documento_generalSecuencialUsuario.setText("Buscar");
		this.jButtonid_tipo_documento_generalSecuencialUsuario.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_documento_generalSecuencialUsuario.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_documento_generalSecuencialUsuario,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_documento_generalSecuencialUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_documento_generalSecuencialUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_documento_generalSecuencialUsuario"));

		this.jButtonid_tipo_documento_generalSecuencialUsuarioBusqueda= new JButtonMe();
		this.jButtonid_tipo_documento_generalSecuencialUsuarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_documento_generalSecuencialUsuarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_documento_generalSecuencialUsuarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_documento_generalSecuencialUsuarioBusqueda.setText("U");
		this.jButtonid_tipo_documento_generalSecuencialUsuarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_documento_generalSecuencialUsuarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_documento_generalSecuencialUsuarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_documento_generalSecuencialUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_documento_generalSecuencialUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_documento_generalSecuencialUsuarioBusqueda"));

		if(this.secuencialusuarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_documento_generalSecuencialUsuarioBusqueda.setVisible(false);		}

		this.jButtonid_tipo_documento_generalSecuencialUsuarioUpdate= new JButtonMe();
		this.jButtonid_tipo_documento_generalSecuencialUsuarioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_documento_generalSecuencialUsuarioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_documento_generalSecuencialUsuarioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_documento_generalSecuencialUsuarioUpdate.setText("U");
		this.jButtonid_tipo_documento_generalSecuencialUsuarioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_documento_generalSecuencialUsuarioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_documento_generalSecuencialUsuarioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_documento_generalSecuencialUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_documento_generalSecuencialUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_documento_generalSecuencialUsuarioUpdate"));



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
		//this.jInternalFrameDetalleSecuencialUsuario = new SecuencialUsuarioBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Secuencial Usuario DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutSecuencialUsuario= new GridBagLayout();
		

		
		String sToolTipSecuencialUsuario="";
		sToolTipSecuencialUsuario=SecuencialUsuarioConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipSecuencialUsuario+="(Facturacion.SecuencialUsuario)";
		}
		
		if(!this.secuencialusuarioSessionBean.getEsGuardarRelacionado()) {
			sToolTipSecuencialUsuario+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoSecuencialUsuario = new JButtonMe();
		this.jButtonModificarSecuencialUsuario = new JButtonMe();
        this.jButtonActualizarSecuencialUsuario = new JButtonMe();
        this.jButtonEliminarSecuencialUsuario = new JButtonMe();
        this.jButtonCancelarSecuencialUsuario = new JButtonMe();
        this.jButtonGuardarCambiosSecuencialUsuario = new JButtonMe();
		this.jButtonGuardarCambiosTablaSecuencialUsuario = new JButtonMe();
		this.jButtonCerrarSecuencialUsuario = new JButtonMe();
		
		this.jScrollPanelDatosSecuencialUsuario = new JScrollPane();   
        this.jScrollPanelDatosEdicionSecuencialUsuario = new JScrollPane();
		this.jScrollPanelDatosGeneralSecuencialUsuario = new JScrollPane();
				
		
		
		this.jPanelCamposSecuencialUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosSecuencialUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesSecuencialUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioSecuencialUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Secuencial Usuario";
		
		if(!this.secuencialusuarioSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosSecuencialUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Secuencial Usuarios" + this.sPath));
		} else {
			this.jScrollPanelDatosSecuencialUsuario.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionSecuencialUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralSecuencialUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposSecuencialUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposSecuencialUsuario.setName("jPanelCamposSecuencialUsuario"); 

		this.jPanelCamposOcultosSecuencialUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosSecuencialUsuario.setName("jPanelCamposOcultosSecuencialUsuario"); 

        this.jPanelAccionesSecuencialUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesSecuencialUsuario.setToolTipText("Acciones");
        this.jPanelAccionesSecuencialUsuario.setName("Acciones"); 

		this.jPanelAccionesFormularioSecuencialUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioSecuencialUsuario.setToolTipText("Acciones");
        this.jPanelAccionesFormularioSecuencialUsuario.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionSecuencialUsuario, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralSecuencialUsuario, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosSecuencialUsuario, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposSecuencialUsuario, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosSecuencialUsuario, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioSecuencialUsuario, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoSecuencialUsuario.setText("Nuevo");
		this.jButtonModificarSecuencialUsuario.setText("Editar");
        this.jButtonActualizarSecuencialUsuario.setText("Actualizar");
        this.jButtonEliminarSecuencialUsuario.setText("Eliminar");
        this.jButtonCancelarSecuencialUsuario.setText("Cancelar");
        this.jButtonGuardarCambiosSecuencialUsuario.setText("Guardar");
		this.jButtonGuardarCambiosTablaSecuencialUsuario.setText("Guardar");
		this.jButtonCerrarSecuencialUsuario.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoSecuencialUsuario,"nuevo_button","Nuevo",this.secuencialusuarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarSecuencialUsuario,"modificar_button","Editar",this.secuencialusuarioSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarSecuencialUsuario,"actualizar_button","Actualizar",this.secuencialusuarioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarSecuencialUsuario,"eliminar_button","Eliminar",this.secuencialusuarioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarSecuencialUsuario,"cancelar_button","Cancelar",this.secuencialusuarioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosSecuencialUsuario,"guardarcambios_button","Guardar",this.secuencialusuarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaSecuencialUsuario,"guardarcambiostabla_button","Guardar",this.secuencialusuarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarSecuencialUsuario,"cerrar_button","Salir",this.secuencialusuarioSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoSecuencialUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarSecuencialUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosSecuencialUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaSecuencialUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarSecuencialUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarSecuencialUsuario, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarSecuencialUsuario, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarSecuencialUsuario, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoSecuencialUsuario.setToolTipText("Nuevo"+" "+SecuencialUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarSecuencialUsuario.setToolTipText("Editar"+" "+SecuencialUsuarioConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarSecuencialUsuario.setToolTipText("Actualizar"+" "+SecuencialUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarSecuencialUsuario.setToolTipText("Eliminar)"+" "+SecuencialUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarSecuencialUsuario.setToolTipText("Cancelar"+" "+SecuencialUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosSecuencialUsuario.setToolTipText("Guardar"+" "+SecuencialUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaSecuencialUsuario.setToolTipText("Guardar"+" "+SecuencialUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarSecuencialUsuario.setToolTipText("Salir"+" "+SecuencialUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoSecuencialUsuario";
		inputMap = this.jButtonNuevoSecuencialUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoSecuencialUsuario.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoSecuencialUsuario"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarSecuencialUsuario";
		inputMap = this.jButtonActualizarSecuencialUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarSecuencialUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarSecuencialUsuario"));
		
		//ELIMINAR
		sMapKey = "EliminarSecuencialUsuario";
		inputMap = this.jButtonEliminarSecuencialUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarSecuencialUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarSecuencialUsuario"));
		
		//CANCELAR	
		sMapKey = "CancelarSecuencialUsuario";
		inputMap = this.jButtonCancelarSecuencialUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarSecuencialUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarSecuencialUsuario"));
		
		//CERRAR		
		sMapKey = "CerrarSecuencialUsuario";
		inputMap = this.jButtonCerrarSecuencialUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarSecuencialUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarSecuencialUsuario"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaSecuencialUsuario";
		inputMap = this.jButtonGuardarCambiosTablaSecuencialUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaSecuencialUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaSecuencialUsuario"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoSecuencialUsuario = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoSecuencialUsuario.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoSecuencialUsuario.setToolTipText("Nuevo SecuencialUsuario");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoSecuencialUsuario, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarSecuencialUsuario = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarSecuencialUsuario.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarSecuencialUsuario.setToolTipText("Sin Cerrar Ventana SecuencialUsuario");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarSecuencialUsuario, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeSecuencialUsuario = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeSecuencialUsuario.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeSecuencialUsuario.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeSecuencialUsuario, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesSecuencialUsuario = new JComboBoxMe();
		//this.jComboBoxTiposAccionesSecuencialUsuario.setText("Accion");
		this.jComboBoxTiposAccionesSecuencialUsuario.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioSecuencialUsuario = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioSecuencialUsuario.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioSecuencialUsuario.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesSecuencialUsuario = new JLabelMe();
		
		this.jLabelAccionesSecuencialUsuario.setText("Acciones");		
		this.jLabelAccionesSecuencialUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSecuencialUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSecuencialUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposSecuencialUsuario();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysSecuencialUsuario();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesSecuencialUsuario=new JTabbedPane();
		this.jTabbedPaneRelacionesSecuencialUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesSecuencialUsuario,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesSecuencialUsuario.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSecuencialUsuario.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSecuencialUsuario.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesSecuencialUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioSecuencialUsuario.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioSecuencialUsuario.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioSecuencialUsuario.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioSecuencialUsuario, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposSecuencialUsuario = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosSecuencialUsuario = new GridBagLayout();
		
		this.jPanelCamposSecuencialUsuario.setLayout(gridaBagLayoutCamposSecuencialUsuario);
		this.jPanelCamposOcultosSecuencialUsuario.setLayout(gridaBagLayoutCamposOcultosSecuencialUsuario);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
	this.gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSecuencialUsuario.gridy = 0;
	this.gridBagConstraintsSecuencialUsuario.gridx = 0;
	this.gridBagConstraintsSecuencialUsuario.ipadx = 0;
	this.gridBagConstraintsSecuencialUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidSecuencialUsuario.add(jLabelIdSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);



	this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
	this.gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSecuencialUsuario.gridy = 0;
	this.gridBagConstraintsSecuencialUsuario.gridx = 1;
	this.gridBagConstraintsSecuencialUsuario.ipadx = 0;
	this.gridBagConstraintsSecuencialUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidSecuencialUsuario.add(jLabelidSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);


	this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
	this.gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSecuencialUsuario.gridy = 0;
	this.gridBagConstraintsSecuencialUsuario.gridx = 0;
	this.gridBagConstraintsSecuencialUsuario.ipadx = 0;
	this.gridBagConstraintsSecuencialUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaSecuencialUsuario.add(jLabelid_empresaSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
		//this.gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSecuencialUsuario.gridy = 0;
		this.gridBagConstraintsSecuencialUsuario.gridx = 2;
		this.gridBagConstraintsSecuencialUsuario.ipadx = 0;
		this.gridBagConstraintsSecuencialUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaSecuencialUsuario.add(jButtonid_empresaSecuencialUsuarioBusqueda, this.gridBagConstraintsSecuencialUsuario);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
		//this.gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSecuencialUsuario.gridy = 0;
		this.gridBagConstraintsSecuencialUsuario.gridx = 3;
		this.gridBagConstraintsSecuencialUsuario.ipadx = 0;
		this.gridBagConstraintsSecuencialUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaSecuencialUsuario.add(jButtonid_empresaSecuencialUsuarioUpdate, this.gridBagConstraintsSecuencialUsuario);
	}

	this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
	this.gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSecuencialUsuario.gridy = 0;
	this.gridBagConstraintsSecuencialUsuario.gridx = 1;
	this.gridBagConstraintsSecuencialUsuario.ipadx = 0;
	this.gridBagConstraintsSecuencialUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaSecuencialUsuario.add(jComboBoxid_empresaSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);


	this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
	this.gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSecuencialUsuario.gridy = 0;
	this.gridBagConstraintsSecuencialUsuario.gridx = 0;
	this.gridBagConstraintsSecuencialUsuario.ipadx = 0;
	this.gridBagConstraintsSecuencialUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalSecuencialUsuario.add(jLabelid_sucursalSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
		//this.gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSecuencialUsuario.gridy = 0;
		this.gridBagConstraintsSecuencialUsuario.gridx = 2;
		this.gridBagConstraintsSecuencialUsuario.ipadx = 0;
		this.gridBagConstraintsSecuencialUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalSecuencialUsuario.add(jButtonid_sucursalSecuencialUsuarioBusqueda, this.gridBagConstraintsSecuencialUsuario);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
		//this.gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSecuencialUsuario.gridy = 0;
		this.gridBagConstraintsSecuencialUsuario.gridx = 3;
		this.gridBagConstraintsSecuencialUsuario.ipadx = 0;
		this.gridBagConstraintsSecuencialUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalSecuencialUsuario.add(jButtonid_sucursalSecuencialUsuarioUpdate, this.gridBagConstraintsSecuencialUsuario);
	}

	this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
	this.gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSecuencialUsuario.gridy = 0;
	this.gridBagConstraintsSecuencialUsuario.gridx = 1;
	this.gridBagConstraintsSecuencialUsuario.ipadx = 0;
	this.gridBagConstraintsSecuencialUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalSecuencialUsuario.add(jComboBoxid_sucursalSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);


	this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
	this.gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSecuencialUsuario.gridy = 0;
	this.gridBagConstraintsSecuencialUsuario.gridx = 0;
	this.gridBagConstraintsSecuencialUsuario.ipadx = 0;
	this.gridBagConstraintsSecuencialUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_usuarioSecuencialUsuario.add(jLabelid_usuarioSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
		//this.gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSecuencialUsuario.gridy = 0;
		this.gridBagConstraintsSecuencialUsuario.gridx = 2;
		this.gridBagConstraintsSecuencialUsuario.ipadx = 0;
		this.gridBagConstraintsSecuencialUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioSecuencialUsuario.add(jButtonid_usuarioSecuencialUsuarioBusqueda, this.gridBagConstraintsSecuencialUsuario);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
		//this.gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSecuencialUsuario.gridy = 0;
		this.gridBagConstraintsSecuencialUsuario.gridx = 3;
		this.gridBagConstraintsSecuencialUsuario.ipadx = 0;
		this.gridBagConstraintsSecuencialUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioSecuencialUsuario.add(jButtonid_usuarioSecuencialUsuarioUpdate, this.gridBagConstraintsSecuencialUsuario);
	}

	this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
	this.gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSecuencialUsuario.gridy = 0;
	this.gridBagConstraintsSecuencialUsuario.gridx = 1;
	this.gridBagConstraintsSecuencialUsuario.ipadx = 0;
	this.gridBagConstraintsSecuencialUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_usuarioSecuencialUsuario.add(jComboBoxid_usuarioSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);


	this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
	this.gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSecuencialUsuario.gridy = 0;
	this.gridBagConstraintsSecuencialUsuario.gridx = 0;
	this.gridBagConstraintsSecuencialUsuario.ipadx = 0;
	this.gridBagConstraintsSecuencialUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_documento_generalSecuencialUsuario.add(jLabelid_tipo_documento_generalSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
		//this.gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSecuencialUsuario.gridy = 0;
		this.gridBagConstraintsSecuencialUsuario.gridx = 2;
		this.gridBagConstraintsSecuencialUsuario.ipadx = 0;
		this.gridBagConstraintsSecuencialUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_documento_generalSecuencialUsuario.add(jButtonid_tipo_documento_generalSecuencialUsuarioBusqueda, this.gridBagConstraintsSecuencialUsuario);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
		//this.gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSecuencialUsuario.gridy = 0;
		this.gridBagConstraintsSecuencialUsuario.gridx = 3;
		this.gridBagConstraintsSecuencialUsuario.ipadx = 0;
		this.gridBagConstraintsSecuencialUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_documento_generalSecuencialUsuario.add(jButtonid_tipo_documento_generalSecuencialUsuarioUpdate, this.gridBagConstraintsSecuencialUsuario);
	}

	this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
	this.gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSecuencialUsuario.gridy = 0;
	this.gridBagConstraintsSecuencialUsuario.gridx = 1;
	this.gridBagConstraintsSecuencialUsuario.ipadx = 0;
	this.gridBagConstraintsSecuencialUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_documento_generalSecuencialUsuario.add(jComboBoxid_tipo_documento_generalSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);


	this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
	this.gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSecuencialUsuario.gridy = 0;
	this.gridBagConstraintsSecuencialUsuario.gridx = 0;
	this.gridBagConstraintsSecuencialUsuario.ipadx = 0;
	this.gridBagConstraintsSecuencialUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelserieSecuencialUsuario.add(jLabelserieSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
		//this.gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSecuencialUsuario.gridy = 0;
		this.gridBagConstraintsSecuencialUsuario.gridx = 2;
		this.gridBagConstraintsSecuencialUsuario.ipadx = 0;
		this.gridBagConstraintsSecuencialUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelserieSecuencialUsuario.add(jButtonserieSecuencialUsuarioBusqueda, this.gridBagConstraintsSecuencialUsuario);
	}

	this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
	this.gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSecuencialUsuario.gridy = 0;
	this.gridBagConstraintsSecuencialUsuario.gridx = 1;
	this.gridBagConstraintsSecuencialUsuario.ipadx = 0;
	this.gridBagConstraintsSecuencialUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelserieSecuencialUsuario.add(jTextFieldserieSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);


	this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
	this.gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSecuencialUsuario.gridy = 0;
	this.gridBagConstraintsSecuencialUsuario.gridx = 0;
	this.gridBagConstraintsSecuencialUsuario.ipadx = 0;
	this.gridBagConstraintsSecuencialUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelautorizacionSecuencialUsuario.add(jLabelautorizacionSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
		//this.gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSecuencialUsuario.gridy = 0;
		this.gridBagConstraintsSecuencialUsuario.gridx = 2;
		this.gridBagConstraintsSecuencialUsuario.ipadx = 0;
		this.gridBagConstraintsSecuencialUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelautorizacionSecuencialUsuario.add(jButtonautorizacionSecuencialUsuarioBusqueda, this.gridBagConstraintsSecuencialUsuario);
	}

	this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
	this.gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSecuencialUsuario.gridy = 0;
	this.gridBagConstraintsSecuencialUsuario.gridx = 1;
	this.gridBagConstraintsSecuencialUsuario.ipadx = 0;
	this.gridBagConstraintsSecuencialUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelautorizacionSecuencialUsuario.add(jTextFieldautorizacionSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);


	this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
	this.gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSecuencialUsuario.gridy = 0;
	this.gridBagConstraintsSecuencialUsuario.gridx = 0;
	this.gridBagConstraintsSecuencialUsuario.ipadx = 0;
	this.gridBagConstraintsSecuencialUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsecuencialSecuencialUsuario.add(jLabelsecuencialSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
		//this.gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSecuencialUsuario.gridy = 0;
		this.gridBagConstraintsSecuencialUsuario.gridx = 2;
		this.gridBagConstraintsSecuencialUsuario.ipadx = 0;
		this.gridBagConstraintsSecuencialUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelsecuencialSecuencialUsuario.add(jButtonsecuencialSecuencialUsuarioBusqueda, this.gridBagConstraintsSecuencialUsuario);
	}

	this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
	this.gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSecuencialUsuario.gridy = 0;
	this.gridBagConstraintsSecuencialUsuario.gridx = 1;
	this.gridBagConstraintsSecuencialUsuario.ipadx = 0;
	this.gridBagConstraintsSecuencialUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsecuencialSecuencialUsuario.add(jTextFieldsecuencialSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);


	this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
	this.gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSecuencialUsuario.gridy = 0;
	this.gridBagConstraintsSecuencialUsuario.gridx = 0;
	this.gridBagConstraintsSecuencialUsuario.ipadx = 0;
	this.gridBagConstraintsSecuencialUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldigitosSecuencialUsuario.add(jLabeldigitosSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
		//this.gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSecuencialUsuario.gridy = 0;
		this.gridBagConstraintsSecuencialUsuario.gridx = 2;
		this.gridBagConstraintsSecuencialUsuario.ipadx = 0;
		this.gridBagConstraintsSecuencialUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPaneldigitosSecuencialUsuario.add(jButtondigitosSecuencialUsuarioBusqueda, this.gridBagConstraintsSecuencialUsuario);
	}

	this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
	this.gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSecuencialUsuario.gridy = 0;
	this.gridBagConstraintsSecuencialUsuario.gridx = 1;
	this.gridBagConstraintsSecuencialUsuario.ipadx = 0;
	this.gridBagConstraintsSecuencialUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldigitosSecuencialUsuario.add(jTextFielddigitosSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);


	this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
	this.gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSecuencialUsuario.gridy = 0;
	this.gridBagConstraintsSecuencialUsuario.gridx = 0;
	this.gridBagConstraintsSecuencialUsuario.ipadx = 0;
	this.gridBagConstraintsSecuencialUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_inicioSecuencialUsuario.add(jLabelfecha_inicioSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
		//this.gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSecuencialUsuario.gridy = 0;
		this.gridBagConstraintsSecuencialUsuario.gridx = 2;
		this.gridBagConstraintsSecuencialUsuario.ipadx = 0;
		this.gridBagConstraintsSecuencialUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_inicioSecuencialUsuario.add(jButtonfecha_inicioSecuencialUsuarioBusqueda, this.gridBagConstraintsSecuencialUsuario);
	}

	this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
	this.gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSecuencialUsuario.gridy = 0;
	this.gridBagConstraintsSecuencialUsuario.gridx = 1;
	this.gridBagConstraintsSecuencialUsuario.ipadx = 0;
	this.gridBagConstraintsSecuencialUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_inicioSecuencialUsuario.add(jDateChooserfecha_inicioSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);


	this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
	this.gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSecuencialUsuario.gridy = 0;
	this.gridBagConstraintsSecuencialUsuario.gridx = 0;
	this.gridBagConstraintsSecuencialUsuario.ipadx = 0;
	this.gridBagConstraintsSecuencialUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_finSecuencialUsuario.add(jLabelfecha_finSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
		//this.gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSecuencialUsuario.gridy = 0;
		this.gridBagConstraintsSecuencialUsuario.gridx = 2;
		this.gridBagConstraintsSecuencialUsuario.ipadx = 0;
		this.gridBagConstraintsSecuencialUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_finSecuencialUsuario.add(jButtonfecha_finSecuencialUsuarioBusqueda, this.gridBagConstraintsSecuencialUsuario);
	}

	this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
	this.gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSecuencialUsuario.gridy = 0;
	this.gridBagConstraintsSecuencialUsuario.gridx = 1;
	this.gridBagConstraintsSecuencialUsuario.ipadx = 0;
	this.gridBagConstraintsSecuencialUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_finSecuencialUsuario.add(jDateChooserfecha_finSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);


	this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
	this.gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSecuencialUsuario.gridy = 0;
	this.gridBagConstraintsSecuencialUsuario.gridx = 0;
	this.gridBagConstraintsSecuencialUsuario.ipadx = 0;
	this.gridBagConstraintsSecuencialUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelesta_activoSecuencialUsuario.add(jLabelesta_activoSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
		//this.gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSecuencialUsuario.gridy = 0;
		this.gridBagConstraintsSecuencialUsuario.gridx = 2;
		this.gridBagConstraintsSecuencialUsuario.ipadx = 0;
		this.gridBagConstraintsSecuencialUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelesta_activoSecuencialUsuario.add(jButtonesta_activoSecuencialUsuarioBusqueda, this.gridBagConstraintsSecuencialUsuario);
	}

	this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
	this.gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSecuencialUsuario.gridy = 0;
	this.gridBagConstraintsSecuencialUsuario.gridx = 1;
	this.gridBagConstraintsSecuencialUsuario.ipadx = 0;
	this.gridBagConstraintsSecuencialUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelesta_activoSecuencialUsuario.add(jCheckBoxesta_activoSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
	this.gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSecuencialUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSecuencialUsuario.gridy = iYPanelCamposSecuencialUsuario;
	this.gridBagConstraintsSecuencialUsuario.gridx = iXPanelCamposSecuencialUsuario++;
	this.gridBagConstraintsSecuencialUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSecuencialUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSecuencialUsuario.add(this.jPanelidSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);



	if(iXPanelCamposSecuencialUsuario % 1==0) {
		iXPanelCamposSecuencialUsuario=0;
		iYPanelCamposSecuencialUsuario++;
	}
	this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
	this.gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSecuencialUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSecuencialUsuario.gridy = iYPanelCamposSecuencialUsuario;
	this.gridBagConstraintsSecuencialUsuario.gridx = iXPanelCamposSecuencialUsuario++;
	this.gridBagConstraintsSecuencialUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSecuencialUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSecuencialUsuario.add(this.jPanelid_usuarioSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);



	if(iXPanelCamposSecuencialUsuario % 1==0) {
		iXPanelCamposSecuencialUsuario=0;
		iYPanelCamposSecuencialUsuario++;
	}
	this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
	this.gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSecuencialUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSecuencialUsuario.gridy = iYPanelCamposSecuencialUsuario;
	this.gridBagConstraintsSecuencialUsuario.gridx = iXPanelCamposSecuencialUsuario++;
	this.gridBagConstraintsSecuencialUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSecuencialUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSecuencialUsuario.add(this.jPanelid_tipo_documento_generalSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);



	if(iXPanelCamposSecuencialUsuario % 1==0) {
		iXPanelCamposSecuencialUsuario=0;
		iYPanelCamposSecuencialUsuario++;
	}
	this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
	this.gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSecuencialUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSecuencialUsuario.gridy = iYPanelCamposSecuencialUsuario;
	this.gridBagConstraintsSecuencialUsuario.gridx = iXPanelCamposSecuencialUsuario++;
	this.gridBagConstraintsSecuencialUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSecuencialUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSecuencialUsuario.add(this.jPanelserieSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);



	if(iXPanelCamposSecuencialUsuario % 1==0) {
		iXPanelCamposSecuencialUsuario=0;
		iYPanelCamposSecuencialUsuario++;
	}
	this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
	this.gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSecuencialUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSecuencialUsuario.gridy = iYPanelCamposSecuencialUsuario;
	this.gridBagConstraintsSecuencialUsuario.gridx = iXPanelCamposSecuencialUsuario++;
	this.gridBagConstraintsSecuencialUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSecuencialUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSecuencialUsuario.add(this.jPanelautorizacionSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);



	if(iXPanelCamposSecuencialUsuario % 1==0) {
		iXPanelCamposSecuencialUsuario=0;
		iYPanelCamposSecuencialUsuario++;
	}
	this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
	this.gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSecuencialUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSecuencialUsuario.gridy = iYPanelCamposSecuencialUsuario;
	this.gridBagConstraintsSecuencialUsuario.gridx = iXPanelCamposSecuencialUsuario++;
	this.gridBagConstraintsSecuencialUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSecuencialUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSecuencialUsuario.add(this.jPanelsecuencialSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);



	if(iXPanelCamposSecuencialUsuario % 1==0) {
		iXPanelCamposSecuencialUsuario=0;
		iYPanelCamposSecuencialUsuario++;
	}
	this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
	this.gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSecuencialUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSecuencialUsuario.gridy = iYPanelCamposSecuencialUsuario;
	this.gridBagConstraintsSecuencialUsuario.gridx = iXPanelCamposSecuencialUsuario++;
	this.gridBagConstraintsSecuencialUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSecuencialUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSecuencialUsuario.add(this.jPaneldigitosSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);



	if(iXPanelCamposSecuencialUsuario % 1==0) {
		iXPanelCamposSecuencialUsuario=0;
		iYPanelCamposSecuencialUsuario++;
	}
	this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
	this.gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSecuencialUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSecuencialUsuario.gridy = iYPanelCamposSecuencialUsuario;
	this.gridBagConstraintsSecuencialUsuario.gridx = iXPanelCamposSecuencialUsuario++;
	this.gridBagConstraintsSecuencialUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSecuencialUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSecuencialUsuario.add(this.jPanelfecha_inicioSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);



	if(iXPanelCamposSecuencialUsuario % 1==0) {
		iXPanelCamposSecuencialUsuario=0;
		iYPanelCamposSecuencialUsuario++;
	}
	this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
	this.gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSecuencialUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSecuencialUsuario.gridy = iYPanelCamposSecuencialUsuario;
	this.gridBagConstraintsSecuencialUsuario.gridx = iXPanelCamposSecuencialUsuario++;
	this.gridBagConstraintsSecuencialUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSecuencialUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSecuencialUsuario.add(this.jPanelfecha_finSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);



	if(iXPanelCamposSecuencialUsuario % 1==0) {
		iXPanelCamposSecuencialUsuario=0;
		iYPanelCamposSecuencialUsuario++;
	}
	this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
	this.gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSecuencialUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSecuencialUsuario.gridy = iYPanelCamposSecuencialUsuario;
	this.gridBagConstraintsSecuencialUsuario.gridx = iXPanelCamposSecuencialUsuario++;
	this.gridBagConstraintsSecuencialUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSecuencialUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSecuencialUsuario.add(this.jPanelesta_activoSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);



	if(iXPanelCamposSecuencialUsuario % 1==0) {
		iXPanelCamposSecuencialUsuario=0;
		iYPanelCamposSecuencialUsuario++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
	this.gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSecuencialUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSecuencialUsuario.gridy = iYPanelCamposOcultosSecuencialUsuario;
	this.gridBagConstraintsSecuencialUsuario.gridx = iXPanelCamposOcultosSecuencialUsuario++;
	this.gridBagConstraintsSecuencialUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSecuencialUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosSecuencialUsuario.add(this.jPanelid_empresaSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);



	if(iXPanelCamposOcultosSecuencialUsuario % 1==0) {
		iXPanelCamposOcultosSecuencialUsuario=0;
		iYPanelCamposOcultosSecuencialUsuario++;
	}
	this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
	this.gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSecuencialUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSecuencialUsuario.gridy = iYPanelCamposOcultosSecuencialUsuario;
	this.gridBagConstraintsSecuencialUsuario.gridx = iXPanelCamposOcultosSecuencialUsuario++;
	this.gridBagConstraintsSecuencialUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSecuencialUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosSecuencialUsuario.add(this.jPanelid_sucursalSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);



	if(iXPanelCamposOcultosSecuencialUsuario % 1==0) {
		iXPanelCamposOcultosSecuencialUsuario=0;
		iYPanelCamposOcultosSecuencialUsuario++;
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
			
		GridBagLayout gridaBagLayoutAccionesSecuencialUsuario= new GridBagLayout();
		this.jPanelAccionesSecuencialUsuario.setLayout(gridaBagLayoutAccionesSecuencialUsuario);
		
		GridBagLayout gridaBagLayoutAccionesFormularioSecuencialUsuario= new GridBagLayout();
		this.jPanelAccionesFormularioSecuencialUsuario.setLayout(gridaBagLayoutAccionesFormularioSecuencialUsuario);
		
		this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
		this.gridBagConstraintsSecuencialUsuario.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsSecuencialUsuario.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioSecuencialUsuario.add(this.jComboBoxTiposAccionesFormularioSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);

		this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
		this.gridBagConstraintsSecuencialUsuario.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsSecuencialUsuario.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioSecuencialUsuario.add(this.jCheckBoxPostAccionNuevoSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.secuencialusuarioSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
			this.gridBagConstraintsSecuencialUsuario.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsSecuencialUsuario.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioSecuencialUsuario.add(this.jCheckBoxPostAccionSinCerrarSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.secuencialusuarioSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.secuencialusuarioSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
			this.gridBagConstraintsSecuencialUsuario.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsSecuencialUsuario.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioSecuencialUsuario.add(this.jCheckBoxPostAccionSinMensajeSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
		this.gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSecuencialUsuario.gridy = 0;
		this.gridBagConstraintsSecuencialUsuario.gridx = iPosXAccion++;
			
		this.jPanelAccionesSecuencialUsuario.add(this.jButtonModificarSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);							

		this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
		this.gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSecuencialUsuario.gridy = 0;
		this.gridBagConstraintsSecuencialUsuario.gridx =iPosXAccion++;
			
		this.jPanelAccionesSecuencialUsuario.add(this.jButtonEliminarSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);
		
			
		this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
		this.gridBagConstraintsSecuencialUsuario.gridy = 0;		
		this.gridBagConstraintsSecuencialUsuario.gridx = iPosXAccion++;
		
		this.jPanelAccionesSecuencialUsuario.add(this.jButtonActualizarSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);


		this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
		this.gridBagConstraintsSecuencialUsuario.gridy = 0;		
		this.gridBagConstraintsSecuencialUsuario.gridx = iPosXAccion++;
		
		this.jPanelAccionesSecuencialUsuario.add(this.jButtonGuardarCambiosSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);	
		
		this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
		this.gridBagConstraintsSecuencialUsuario.gridy = 0;		
		this.gridBagConstraintsSecuencialUsuario.gridx =iPosXAccion++;
		
		this.jPanelAccionesSecuencialUsuario.add(this.jButtonCancelarSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutSecuencialUsuario = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutSecuencialUsuario);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.secuencialusuarioSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();						
			this.gridBagConstraintsSecuencialUsuario.gridy = iGridyPrincipal++;
			this.gridBagConstraintsSecuencialUsuario.gridx = 0;		
			//this.gridBagConstraintsSecuencialUsuario.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSecuencialUsuario.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsSecuencialUsuario.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
		this.gridBagConstraintsSecuencialUsuario.gridy =iGridyPrincipal++;
		this.gridBagConstraintsSecuencialUsuario.gridx =0;
		this.gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsSecuencialUsuario.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(SecuencialUsuarioJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleSecuencialUsuario = new SecuencialUsuarioBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Secuencial Usuario DATOS");
			
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
			
	        //this.setTitle("[FOR] - Secuencial Usuario DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Secuencial Usuario Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			SecuencialUsuarioModel secuencialusuarioModel=new SecuencialUsuarioModel(this);
			
			//SI USARA CLASE INTERNA
			//SecuencialUsuarioModel.SecuencialUsuarioFocusTraversalPolicy secuencialusuarioFocusTraversalPolicy = secuencialusuarioModel.new SecuencialUsuarioFocusTraversalPolicy(this);
			
			//secuencialusuarioFocusTraversalPolicy.setsecuencialusuarioJInternalFrame(this);
			
			this.setFocusTraversalPolicy(secuencialusuarioModel);
			
			
			this.jContentPaneDetalleSecuencialUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleSecuencialUsuario = new GridBagLayout();	
			this.jContentPaneDetalleSecuencialUsuario.setLayout(gridaBagLayoutDetalleSecuencialUsuario);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosSecuencialUsuario = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
				this.gridBagConstraintsSecuencialUsuario.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsSecuencialUsuario.gridx = 0;
					
				
				this.jContentPaneDetalleSecuencialUsuario.add(jTtoolBarDetalleSecuencialUsuario, gridBagConstraintsSecuencialUsuario);								
				
}
			
			this.jScrollPanelDatosEdicionSecuencialUsuario=   new JScrollPane(jContentPaneDetalleSecuencialUsuario,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionSecuencialUsuario.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSecuencialUsuario.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSecuencialUsuario.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralSecuencialUsuario=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralSecuencialUsuario.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSecuencialUsuario.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSecuencialUsuario.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
			
			
	        this.gridBagConstraintsSecuencialUsuario.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsSecuencialUsuario.gridx = 0;
	        
			this.jContentPaneDetalleSecuencialUsuario.add(jPanelCamposSecuencialUsuario, gridBagConstraintsSecuencialUsuario);
			
			
			
			
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
						&& secuencialusuarioSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.secuencialusuarioSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsSecuencialUsuario= new GridBagConstraints();
						this.gridBagConstraintsSecuencialUsuario.gridy = iGridyRelaciones++;
						this.gridBagConstraintsSecuencialUsuario.gridx = 0;
						this.jContentPaneDetalleSecuencialUsuario.add(this.jTabbedPaneRelacionesSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesSecuencialUsuario.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosSecuencialUsuario.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
					this.gridBagConstraintsSecuencialUsuario.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsSecuencialUsuario.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsSecuencialUsuario.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsSecuencialUsuario.gridx = 0;
					
				
					this.jContentPaneDetalleSecuencialUsuario.add(jPanelCamposOcultosSecuencialUsuario, gridBagConstraintsSecuencialUsuario);
				
					this.jPanelCamposOcultosSecuencialUsuario.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
			this.gridBagConstraintsSecuencialUsuario.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsSecuencialUsuario.gridx = 0;
	        this.gridBagConstraintsSecuencialUsuario.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleSecuencialUsuario.add(this.jPanelAccionesFormularioSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);							
			
			
			
			this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
	        this.gridBagConstraintsSecuencialUsuario.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsSecuencialUsuario.gridx = 0;
	        
			
			this.jContentPaneDetalleSecuencialUsuario.add(this.jPanelAccionesSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionSecuencialUsuario);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionSecuencialUsuario=   new JScrollPane(this.jPanelCamposSecuencialUsuario,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionSecuencialUsuario.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSecuencialUsuario.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSecuencialUsuario.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
			this.gridBagConstraintsSecuencialUsuario.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsSecuencialUsuario.gridx = 0;
			this.gridBagConstraintsSecuencialUsuario.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsSecuencialUsuario.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsSecuencialUsuario.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
			this.gridBagConstraintsSecuencialUsuario.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsSecuencialUsuario.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);			
			
			this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
			this.gridBagConstraintsSecuencialUsuario.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsSecuencialUsuario.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
		this.gridBagConstraintsSecuencialUsuario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSecuencialUsuario.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);
			
			
		this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
		this.gridBagConstraintsSecuencialUsuario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSecuencialUsuario.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);
		
			
		this.gridBagConstraintsSecuencialUsuario = new GridBagConstraints();
		this.gridBagConstraintsSecuencialUsuario.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsSecuencialUsuario.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesSecuencialUsuario, this.gridBagConstraintsSecuencialUsuario);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralSecuencialUsuario;//jContentPane;
		
		return jScrollPanelDatosEdicionSecuencialUsuario;
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
