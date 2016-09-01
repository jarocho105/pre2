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


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.contabilidad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.contabilidad.util.NivelCentroCostoConstantesFunciones;

import com.bydan.erp.contabilidad.business.logic.*;
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
public class NivelCentroCostoDetalleFormJInternalFrame extends NivelCentroCostoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleNivelCentroCosto;
	
	protected JMenuBar jmenuBarDetalleNivelCentroCosto;
	
	protected JMenu jmenuDetalleNivelCentroCosto;
	protected JMenu jmenuDetalleArchivoNivelCentroCosto;
	protected JMenu jmenuDetalleAccionesNivelCentroCosto;
	protected JMenu jmenuDetalleDatosNivelCentroCosto;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleNivelCentroCosto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutNivelCentroCosto;	
	protected GridBagConstraints gridBagConstraintsNivelCentroCosto;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected NivelCentroCostoBeanSwingJInternalFrameAdditional jInternalFrameDetalleNivelCentroCosto;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public NivelCentroCostoSessionBean nivelcentrocostoSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public NivelCentroCostoLogic nivelcentrocostoLogic;
	
	public JScrollPane jScrollPanelDatosNivelCentroCosto;
	public JScrollPane jScrollPanelDatosEdicionNivelCentroCosto;
	public JScrollPane jScrollPanelDatosGeneralNivelCentroCosto;
	
	protected JPanel jPanelCamposNivelCentroCosto;    
	protected JPanel jPanelCamposOcultosNivelCentroCosto;    	
	protected JPanel jPanelAccionesNivelCentroCosto;
	protected JPanel jPanelAccionesFormularioNivelCentroCosto;
    
	
	
	protected Integer iXPanelCamposNivelCentroCosto=0;
	protected Integer iYPanelCamposNivelCentroCosto=0;
	
	protected Integer iXPanelCamposOcultosNivelCentroCosto=0;
	protected Integer iYPanelCamposOcultosNivelCentroCosto=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoNivelCentroCosto;
	public JButton jButtonModificarNivelCentroCosto;
	public JButton jButtonActualizarNivelCentroCosto;
    public JButton jButtonEliminarNivelCentroCosto;
	public JButton jButtonCancelarNivelCentroCosto;
    public JButton jButtonGuardarCambiosNivelCentroCosto;
	public JButton jButtonGuardarCambiosTablaNivelCentroCosto;
	protected JButton jButtonCerrarNivelCentroCosto;
	
	
	protected JButton jButtonProcesarInformacionNivelCentroCosto;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoNivelCentroCosto;
	protected JCheckBox jCheckBoxPostAccionSinCerrarNivelCentroCosto;
	protected JCheckBox jCheckBoxPostAccionSinMensajeNivelCentroCosto;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarNivelCentroCosto;
	protected JButton jButtonModificarToolBarNivelCentroCosto;
	protected JButton jButtonActualizarToolBarNivelCentroCosto;
    protected JButton jButtonEliminarToolBarNivelCentroCosto;
	protected JButton jButtonCancelarToolBarNivelCentroCosto;
    protected JButton jButtonGuardarCambiosToolBarNivelCentroCosto;
	protected JButton jButtonGuardarCambiosTablaToolBarNivelCentroCosto;
	protected JButton jButtonMostrarOcultarTablaToolBarNivelCentroCosto;
	protected JButton jButtonCerrarToolBarNivelCentroCosto;
	
	protected JButton jButtonProcesarInformacionToolBarNivelCentroCosto;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoNivelCentroCosto;
	protected JMenuItem jMenuItemModificarNivelCentroCosto;
	protected JMenuItem jMenuItemActualizarNivelCentroCosto;
    protected JMenuItem jMenuItemEliminarNivelCentroCosto;
	protected JMenuItem jMenuItemCancelarNivelCentroCosto;
    protected JMenuItem jMenuItemGuardarCambiosNivelCentroCosto;
	protected JMenuItem jMenuItemGuardarCambiosTablaNivelCentroCosto;
	protected JMenuItem jMenuItemCerrarNivelCentroCosto;
	protected JMenuItem jMenuItemDetalleCerrarNivelCentroCosto;
	protected JMenuItem jMenuItemDetalleMostarOcultarNivelCentroCosto;
	
	protected JMenuItem jMenuItemProcesarInformacionNivelCentroCosto;
	protected JMenuItem jMenuItemNuevoGuardarCambiosNivelCentroCosto;
	protected JMenuItem jMenuItemMostrarOcultarNivelCentroCosto;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesNivelCentroCosto;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesNivelCentroCosto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesNivelCentroCosto;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioNivelCentroCosto;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidNivelCentroCosto;
	public JLabel jLabelIdNivelCentroCosto;
	public JLabel jLabelidNivelCentroCosto;
	public JButton jButtonidNivelCentroCostoBusqueda= new JButtonMe();

	public JPanel jPanelnivelNivelCentroCosto;
	public JLabel jLabelnivelNivelCentroCosto;
	public JTextField jTextFieldnivelNivelCentroCosto;
	public JButton jButtonnivelNivelCentroCostoBusqueda= new JButtonMe();

	public JPanel jPanelnumero_digitosNivelCentroCosto;
	public JLabel jLabelnumero_digitosNivelCentroCosto;
	public JTextField jTextFieldnumero_digitosNivelCentroCosto;
	public JButton jButtonnumero_digitosNivelCentroCostoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaNivelCentroCosto;
	public JLabel jLabelid_empresaNivelCentroCosto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaNivelCentroCosto;
	public JButton jButtonid_empresaNivelCentroCosto= new JButtonMe();
	public JButton jButtonid_empresaNivelCentroCostoUpdate= new JButtonMe();
	public JButton jButtonid_empresaNivelCentroCostoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesNivelCentroCosto;
	
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
	public int iHeightFormulario=242;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public NivelCentroCostoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposNivelCentroCosto=new JPanel();
				this.jPanelAccionesFormularioNivelCentroCosto=new JPanel();
				this.jmenuBarDetalleNivelCentroCosto=new JMenuBar();
				this.jTtoolBarDetalleNivelCentroCosto=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NivelCentroCostoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("NivelCentroCosto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public NivelCentroCostoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("NivelCentroCosto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NivelCentroCostoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("NivelCentroCosto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NivelCentroCostoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("NivelCentroCosto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NivelCentroCostoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("NivelCentroCosto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarNivelCentroCosto() {
		return this.jButtonActualizarToolBarNivelCentroCosto;
	}
	
	public JButton getjButtonEliminarToolBarNivelCentroCosto() {
		return this.jButtonEliminarToolBarNivelCentroCosto;
	}
	
	public JButton getjButtonCancelarToolBarNivelCentroCosto() {
		return this.jButtonCancelarToolBarNivelCentroCosto;
	}		
	
	public JButton getjButtonProcesarInformacionNivelCentroCosto() {
		return this.jButtonProcesarInformacionNivelCentroCosto;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionNivelCentroCosto)	{
		this.jButtonProcesarInformacionNivelCentroCosto = jButtonProcesarInformacionNivelCentroCosto;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesNivelCentroCosto() {
		return this.jComboBoxTiposAccionesNivelCentroCosto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesNivelCentroCosto(
			JComboBox jComboBoxTiposRelacionesNivelCentroCosto) {
		this.jComboBoxTiposRelacionesNivelCentroCosto = jComboBoxTiposRelacionesNivelCentroCosto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesNivelCentroCosto(
			JComboBox jComboBoxTiposAccionesNivelCentroCosto) {
		this.jComboBoxTiposAccionesNivelCentroCosto = jComboBoxTiposAccionesNivelCentroCosto;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioNivelCentroCosto() {
		return this.jComboBoxTiposAccionesFormularioNivelCentroCosto;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioNivelCentroCosto(
			JComboBox jComboBoxTiposAccionesFormularioNivelCentroCosto) {
		this.jComboBoxTiposAccionesFormularioNivelCentroCosto = jComboBoxTiposAccionesFormularioNivelCentroCosto;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.nivelcentrocostoSessionBean=new NivelCentroCostoSessionBean();
		
		this.nivelcentrocostoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.nivelcentrocostoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.nivelcentrocostoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		NivelCentroCostoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		NivelCentroCostoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		NivelCentroCostoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Nivel Centro Costo MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.nivelcentrocostoSessionBean.getEsGuardarRelacionado()) {
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
	
		NivelCentroCostoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleNivelCentroCosto= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarNivelCentroCosto=new JButtonMe();
				this.jButtonModificarToolBarNivelCentroCosto=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarNivelCentroCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarNivelCentroCosto,this.jTtoolBarDetalleNivelCentroCosto,
							"actualizar","actualizar","Actualizar"+" "+NivelCentroCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarNivelCentroCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarNivelCentroCosto,this.jTtoolBarDetalleNivelCentroCosto,
							"eliminar","eliminar","Eliminar"+" "+NivelCentroCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarNivelCentroCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarNivelCentroCosto,this.jTtoolBarDetalleNivelCentroCosto,
							"cancelar","cancelar","Cancelar"+" "+NivelCentroCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarNivelCentroCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarNivelCentroCosto,this.jTtoolBarDetalleNivelCentroCosto,
							"guardarcambios","guardarcambios","Guardar"+" "+NivelCentroCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarNivelCentroCosto,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarNivelCentroCosto,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarNivelCentroCosto,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleNivelCentroCosto=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleNivelCentroCosto=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoNivelCentroCosto=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesNivelCentroCosto=new JMenuMe("Acciones");
		this.jmenuDetalleDatosNivelCentroCosto=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoNivelCentroCosto= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoNivelCentroCosto.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoNivelCentroCosto,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoNivelCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarNivelCentroCosto= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarNivelCentroCosto.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarNivelCentroCosto,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarNivelCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarNivelCentroCosto= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarNivelCentroCosto.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarNivelCentroCosto,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarNivelCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarNivelCentroCosto= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarNivelCentroCosto.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarNivelCentroCosto,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarNivelCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarNivelCentroCosto= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarNivelCentroCosto.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarNivelCentroCosto,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarNivelCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosNivelCentroCosto= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosNivelCentroCosto.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosNivelCentroCosto,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosNivelCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarNivelCentroCosto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarNivelCentroCosto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarNivelCentroCosto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarNivelCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarNivelCentroCosto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarNivelCentroCosto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarNivelCentroCosto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarNivelCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarNivelCentroCosto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarNivelCentroCosto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarNivelCentroCosto,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarNivelCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarNivelCentroCosto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarNivelCentroCosto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarNivelCentroCosto,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarNivelCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoNivelCentroCosto.add(this.jMenuItemDetalleCerrarNivelCentroCosto);
		
		this.jmenuDetalleAccionesNivelCentroCosto.add(this.jMenuItemActualizarNivelCentroCosto);
		this.jmenuDetalleAccionesNivelCentroCosto.add(this.jMenuItemEliminarNivelCentroCosto);
		this.jmenuDetalleAccionesNivelCentroCosto.add(this.jMenuItemCancelarNivelCentroCosto);		
		
		//this.jmenuDetalleDatosNivelCentroCosto.add(this.jMenuItemDetalleAbrirOrderByNivelCentroCosto);				
		this.jmenuDetalleDatosNivelCentroCosto.add(this.jMenuItemDetalleMostarOcultarNivelCentroCosto);				
				
		//this.jmenuDetalleAccionesNivelCentroCosto.add(this.jMenuItemGuardarCambiosNivelCentroCosto);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoNivelCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesNivelCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosNivelCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleNivelCentroCosto.add(this.jmenuDetalleArchivoNivelCentroCosto);		
		this.jmenuBarDetalleNivelCentroCosto.add(this.jmenuDetalleAccionesNivelCentroCosto);		
		this.jmenuBarDetalleNivelCentroCosto.add(this.jmenuDetalleDatosNivelCentroCosto);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleNivelCentroCosto);				
	}
	
	
	public void inicializarElementosCamposNivelCentroCosto() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdNivelCentroCosto = new JLabelMe();
		jLabelIdNivelCentroCosto.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdNivelCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdNivelCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdNivelCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdNivelCentroCosto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidNivelCentroCosto = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidNivelCentroCosto.setToolTipText(NivelCentroCostoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutNivelCentroCosto= new GridBagLayout();

		this.jPanelidNivelCentroCosto.setLayout(this.gridaBagLayoutNivelCentroCosto);

		jLabelidNivelCentroCosto = new JLabel();
		jLabelidNivelCentroCosto.setText("Id");

		jLabelidNivelCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidNivelCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidNivelCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnivelNivelCentroCosto = new JLabelMe();
		this.jLabelnivelNivelCentroCosto.setText(""+NivelCentroCostoConstantesFunciones.LABEL_NIVEL+" : *");
		this.jLabelnivelNivelCentroCosto.setToolTipText("Nivel");
		this.jLabelnivelNivelCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnivelNivelCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnivelNivelCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnivelNivelCentroCosto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnivelNivelCentroCosto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnivelNivelCentroCosto.setToolTipText(NivelCentroCostoConstantesFunciones.LABEL_NIVEL);
		this.gridaBagLayoutNivelCentroCosto = new GridBagLayout();
		this.jPanelnivelNivelCentroCosto.setLayout(this.gridaBagLayoutNivelCentroCosto);


		jTextFieldnivelNivelCentroCosto= new JTextFieldMe();
		jTextFieldnivelNivelCentroCosto.setEnabled(false);
		jTextFieldnivelNivelCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnivelNivelCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnivelNivelCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnivelNivelCentroCosto,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnivelNivelCentroCosto.setText("0");

		this.jButtonnivelNivelCentroCostoBusqueda= new JButtonMe();
		this.jButtonnivelNivelCentroCostoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnivelNivelCentroCostoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnivelNivelCentroCostoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnivelNivelCentroCostoBusqueda.setText("U");
		this.jButtonnivelNivelCentroCostoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnivelNivelCentroCostoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnivelNivelCentroCostoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnivelNivelCentroCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnivelNivelCentroCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nivelNivelCentroCostoBusqueda"));

		if(this.nivelcentrocostoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnivelNivelCentroCostoBusqueda.setVisible(false);		}


					
		this.jLabelnumero_digitosNivelCentroCosto = new JLabelMe();
		this.jLabelnumero_digitosNivelCentroCosto.setText(""+NivelCentroCostoConstantesFunciones.LABEL_NUMERODIGITOS+" : *");
		this.jLabelnumero_digitosNivelCentroCosto.setToolTipText("Numero Digitos");
		this.jLabelnumero_digitosNivelCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_digitosNivelCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_digitosNivelCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_digitosNivelCentroCosto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_digitosNivelCentroCosto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_digitosNivelCentroCosto.setToolTipText(NivelCentroCostoConstantesFunciones.LABEL_NUMERODIGITOS);
		this.gridaBagLayoutNivelCentroCosto = new GridBagLayout();
		this.jPanelnumero_digitosNivelCentroCosto.setLayout(this.gridaBagLayoutNivelCentroCosto);


		jTextFieldnumero_digitosNivelCentroCosto= new JTextFieldMe();
		jTextFieldnumero_digitosNivelCentroCosto.setEnabled(false);
		jTextFieldnumero_digitosNivelCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_digitosNivelCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_digitosNivelCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_digitosNivelCentroCosto,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_digitosNivelCentroCosto.setText("0");

		this.jButtonnumero_digitosNivelCentroCostoBusqueda= new JButtonMe();
		this.jButtonnumero_digitosNivelCentroCostoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_digitosNivelCentroCostoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_digitosNivelCentroCostoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_digitosNivelCentroCostoBusqueda.setText("U");
		this.jButtonnumero_digitosNivelCentroCostoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_digitosNivelCentroCostoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_digitosNivelCentroCostoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_digitosNivelCentroCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_digitosNivelCentroCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_digitosNivelCentroCostoBusqueda"));

		if(this.nivelcentrocostoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_digitosNivelCentroCostoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysNivelCentroCosto() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaNivelCentroCosto = new JLabelMe();
		this.jLabelid_empresaNivelCentroCosto.setText(""+NivelCentroCostoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaNivelCentroCosto.setToolTipText("Empresa");
		this.jLabelid_empresaNivelCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaNivelCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaNivelCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaNivelCentroCosto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaNivelCentroCosto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaNivelCentroCosto.setToolTipText(NivelCentroCostoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutNivelCentroCosto = new GridBagLayout();
		this.jPanelid_empresaNivelCentroCosto.setLayout(this.gridaBagLayoutNivelCentroCosto);


		jComboBoxid_empresaNivelCentroCosto= new JComboBoxMe();
		jComboBoxid_empresaNivelCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaNivelCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaNivelCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaNivelCentroCosto,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaNivelCentroCosto.setEnabled(false);

		this.jButtonid_empresaNivelCentroCosto= new JButtonMe();
		this.jButtonid_empresaNivelCentroCosto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaNivelCentroCosto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaNivelCentroCosto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaNivelCentroCosto.setText("Buscar");
		this.jButtonid_empresaNivelCentroCosto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaNivelCentroCosto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaNivelCentroCosto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaNivelCentroCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaNivelCentroCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaNivelCentroCosto"));

		this.jButtonid_empresaNivelCentroCostoBusqueda= new JButtonMe();
		this.jButtonid_empresaNivelCentroCostoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaNivelCentroCostoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaNivelCentroCostoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaNivelCentroCostoBusqueda.setText("U");
		this.jButtonid_empresaNivelCentroCostoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaNivelCentroCostoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaNivelCentroCostoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaNivelCentroCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaNivelCentroCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaNivelCentroCostoBusqueda"));

		if(this.nivelcentrocostoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaNivelCentroCostoBusqueda.setVisible(false);		}

		this.jButtonid_empresaNivelCentroCostoUpdate= new JButtonMe();
		this.jButtonid_empresaNivelCentroCostoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaNivelCentroCostoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaNivelCentroCostoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaNivelCentroCostoUpdate.setText("U");
		this.jButtonid_empresaNivelCentroCostoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaNivelCentroCostoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaNivelCentroCostoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaNivelCentroCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaNivelCentroCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaNivelCentroCostoUpdate"));



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
		//this.jInternalFrameDetalleNivelCentroCosto = new NivelCentroCostoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Nivel Centro Costo DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutNivelCentroCosto= new GridBagLayout();
		

		
		String sToolTipNivelCentroCosto="";
		sToolTipNivelCentroCosto=NivelCentroCostoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipNivelCentroCosto+="(Contabilidad.NivelCentroCosto)";
		}
		
		if(!this.nivelcentrocostoSessionBean.getEsGuardarRelacionado()) {
			sToolTipNivelCentroCosto+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoNivelCentroCosto = new JButtonMe();
		this.jButtonModificarNivelCentroCosto = new JButtonMe();
        this.jButtonActualizarNivelCentroCosto = new JButtonMe();
        this.jButtonEliminarNivelCentroCosto = new JButtonMe();
        this.jButtonCancelarNivelCentroCosto = new JButtonMe();
        this.jButtonGuardarCambiosNivelCentroCosto = new JButtonMe();
		this.jButtonGuardarCambiosTablaNivelCentroCosto = new JButtonMe();
		this.jButtonCerrarNivelCentroCosto = new JButtonMe();
		
		this.jScrollPanelDatosNivelCentroCosto = new JScrollPane();   
        this.jScrollPanelDatosEdicionNivelCentroCosto = new JScrollPane();
		this.jScrollPanelDatosGeneralNivelCentroCosto = new JScrollPane();
				
		
		
		this.jPanelCamposNivelCentroCosto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosNivelCentroCosto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesNivelCentroCosto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioNivelCentroCosto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Nivel Centro Costo";
		
		if(!this.nivelcentrocostoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosNivelCentroCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Nivel Centro Costos" + this.sPath));
		} else {
			this.jScrollPanelDatosNivelCentroCosto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionNivelCentroCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralNivelCentroCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposNivelCentroCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposNivelCentroCosto.setName("jPanelCamposNivelCentroCosto"); 

		this.jPanelCamposOcultosNivelCentroCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosNivelCentroCosto.setName("jPanelCamposOcultosNivelCentroCosto"); 

        this.jPanelAccionesNivelCentroCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesNivelCentroCosto.setToolTipText("Acciones");
        this.jPanelAccionesNivelCentroCosto.setName("Acciones"); 

		this.jPanelAccionesFormularioNivelCentroCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioNivelCentroCosto.setToolTipText("Acciones");
        this.jPanelAccionesFormularioNivelCentroCosto.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionNivelCentroCosto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralNivelCentroCosto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosNivelCentroCosto, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposNivelCentroCosto, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosNivelCentroCosto, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioNivelCentroCosto, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoNivelCentroCosto.setText("Nuevo");
		this.jButtonModificarNivelCentroCosto.setText("Editar");
        this.jButtonActualizarNivelCentroCosto.setText("Actualizar");
        this.jButtonEliminarNivelCentroCosto.setText("Eliminar");
        this.jButtonCancelarNivelCentroCosto.setText("Cancelar");
        this.jButtonGuardarCambiosNivelCentroCosto.setText("Guardar");
		this.jButtonGuardarCambiosTablaNivelCentroCosto.setText("Guardar");
		this.jButtonCerrarNivelCentroCosto.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoNivelCentroCosto,"nuevo_button","Nuevo",this.nivelcentrocostoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarNivelCentroCosto,"modificar_button","Editar",this.nivelcentrocostoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarNivelCentroCosto,"actualizar_button","Actualizar",this.nivelcentrocostoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarNivelCentroCosto,"eliminar_button","Eliminar",this.nivelcentrocostoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarNivelCentroCosto,"cancelar_button","Cancelar",this.nivelcentrocostoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosNivelCentroCosto,"guardarcambios_button","Guardar",this.nivelcentrocostoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaNivelCentroCosto,"guardarcambiostabla_button","Guardar",this.nivelcentrocostoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarNivelCentroCosto,"cerrar_button","Salir",this.nivelcentrocostoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoNivelCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarNivelCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosNivelCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaNivelCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarNivelCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarNivelCentroCosto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarNivelCentroCosto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarNivelCentroCosto, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoNivelCentroCosto.setToolTipText("Nuevo"+" "+NivelCentroCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarNivelCentroCosto.setToolTipText("Editar"+" "+NivelCentroCostoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarNivelCentroCosto.setToolTipText("Actualizar"+" "+NivelCentroCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarNivelCentroCosto.setToolTipText("Eliminar)"+" "+NivelCentroCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarNivelCentroCosto.setToolTipText("Cancelar"+" "+NivelCentroCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosNivelCentroCosto.setToolTipText("Guardar"+" "+NivelCentroCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaNivelCentroCosto.setToolTipText("Guardar"+" "+NivelCentroCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarNivelCentroCosto.setToolTipText("Salir"+" "+NivelCentroCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoNivelCentroCosto";
		inputMap = this.jButtonNuevoNivelCentroCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoNivelCentroCosto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoNivelCentroCosto"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarNivelCentroCosto";
		inputMap = this.jButtonActualizarNivelCentroCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarNivelCentroCosto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarNivelCentroCosto"));
		
		//ELIMINAR
		sMapKey = "EliminarNivelCentroCosto";
		inputMap = this.jButtonEliminarNivelCentroCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarNivelCentroCosto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarNivelCentroCosto"));
		
		//CANCELAR	
		sMapKey = "CancelarNivelCentroCosto";
		inputMap = this.jButtonCancelarNivelCentroCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarNivelCentroCosto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarNivelCentroCosto"));
		
		//CERRAR		
		sMapKey = "CerrarNivelCentroCosto";
		inputMap = this.jButtonCerrarNivelCentroCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarNivelCentroCosto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarNivelCentroCosto"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaNivelCentroCosto";
		inputMap = this.jButtonGuardarCambiosTablaNivelCentroCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaNivelCentroCosto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaNivelCentroCosto"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoNivelCentroCosto = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoNivelCentroCosto.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoNivelCentroCosto.setToolTipText("Nuevo NivelCentroCosto");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoNivelCentroCosto, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarNivelCentroCosto = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarNivelCentroCosto.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarNivelCentroCosto.setToolTipText("Sin Cerrar Ventana NivelCentroCosto");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarNivelCentroCosto, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeNivelCentroCosto = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeNivelCentroCosto.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeNivelCentroCosto.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeNivelCentroCosto, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesNivelCentroCosto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesNivelCentroCosto.setText("Accion");
		this.jComboBoxTiposAccionesNivelCentroCosto.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioNivelCentroCosto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioNivelCentroCosto.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioNivelCentroCosto.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesNivelCentroCosto = new JLabelMe();
		
		this.jLabelAccionesNivelCentroCosto.setText("Acciones");		
		this.jLabelAccionesNivelCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesNivelCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesNivelCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposNivelCentroCosto();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysNivelCentroCosto();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesNivelCentroCosto=new JTabbedPane();
		this.jTabbedPaneRelacionesNivelCentroCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesNivelCentroCosto,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesNivelCentroCosto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesNivelCentroCosto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesNivelCentroCosto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesNivelCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioNivelCentroCosto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioNivelCentroCosto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioNivelCentroCosto.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioNivelCentroCosto, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposNivelCentroCosto = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosNivelCentroCosto = new GridBagLayout();
		
		this.jPanelCamposNivelCentroCosto.setLayout(gridaBagLayoutCamposNivelCentroCosto);
		this.jPanelCamposOcultosNivelCentroCosto.setLayout(gridaBagLayoutCamposOcultosNivelCentroCosto);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsNivelCentroCosto = new GridBagConstraints();
	this.gridBagConstraintsNivelCentroCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNivelCentroCosto.gridy = 0;
	this.gridBagConstraintsNivelCentroCosto.gridx = 0;
	this.gridBagConstraintsNivelCentroCosto.ipadx = 0;
	this.gridBagConstraintsNivelCentroCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidNivelCentroCosto.add(jLabelIdNivelCentroCosto, this.gridBagConstraintsNivelCentroCosto);



	this.gridBagConstraintsNivelCentroCosto = new GridBagConstraints();
	this.gridBagConstraintsNivelCentroCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNivelCentroCosto.gridy = 0;
	this.gridBagConstraintsNivelCentroCosto.gridx = 1;
	this.gridBagConstraintsNivelCentroCosto.ipadx = 0;
	this.gridBagConstraintsNivelCentroCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidNivelCentroCosto.add(jLabelidNivelCentroCosto, this.gridBagConstraintsNivelCentroCosto);


	this.gridBagConstraintsNivelCentroCosto = new GridBagConstraints();
	this.gridBagConstraintsNivelCentroCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNivelCentroCosto.gridy = 0;
	this.gridBagConstraintsNivelCentroCosto.gridx = 0;
	this.gridBagConstraintsNivelCentroCosto.ipadx = 0;
	this.gridBagConstraintsNivelCentroCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaNivelCentroCosto.add(jLabelid_empresaNivelCentroCosto, this.gridBagConstraintsNivelCentroCosto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNivelCentroCosto = new GridBagConstraints();
		//this.gridBagConstraintsNivelCentroCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNivelCentroCosto.gridy = 0;
		this.gridBagConstraintsNivelCentroCosto.gridx = 2;
		this.gridBagConstraintsNivelCentroCosto.ipadx = 0;
		this.gridBagConstraintsNivelCentroCosto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaNivelCentroCosto.add(jButtonid_empresaNivelCentroCostoBusqueda, this.gridBagConstraintsNivelCentroCosto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNivelCentroCosto = new GridBagConstraints();
		//this.gridBagConstraintsNivelCentroCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNivelCentroCosto.gridy = 0;
		this.gridBagConstraintsNivelCentroCosto.gridx = 3;
		this.gridBagConstraintsNivelCentroCosto.ipadx = 0;
		this.gridBagConstraintsNivelCentroCosto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaNivelCentroCosto.add(jButtonid_empresaNivelCentroCostoUpdate, this.gridBagConstraintsNivelCentroCosto);
	}

	this.gridBagConstraintsNivelCentroCosto = new GridBagConstraints();
	this.gridBagConstraintsNivelCentroCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNivelCentroCosto.gridy = 0;
	this.gridBagConstraintsNivelCentroCosto.gridx = 1;
	this.gridBagConstraintsNivelCentroCosto.ipadx = 0;
	this.gridBagConstraintsNivelCentroCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaNivelCentroCosto.add(jComboBoxid_empresaNivelCentroCosto, this.gridBagConstraintsNivelCentroCosto);


	this.gridBagConstraintsNivelCentroCosto = new GridBagConstraints();
	this.gridBagConstraintsNivelCentroCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNivelCentroCosto.gridy = 0;
	this.gridBagConstraintsNivelCentroCosto.gridx = 0;
	this.gridBagConstraintsNivelCentroCosto.ipadx = 0;
	this.gridBagConstraintsNivelCentroCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnivelNivelCentroCosto.add(jLabelnivelNivelCentroCosto, this.gridBagConstraintsNivelCentroCosto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNivelCentroCosto = new GridBagConstraints();
		//this.gridBagConstraintsNivelCentroCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNivelCentroCosto.gridy = 0;
		this.gridBagConstraintsNivelCentroCosto.gridx = 2;
		this.gridBagConstraintsNivelCentroCosto.ipadx = 0;
		this.gridBagConstraintsNivelCentroCosto.insets = new Insets(0, 0, 0, 0);
		this.jPanelnivelNivelCentroCosto.add(jButtonnivelNivelCentroCostoBusqueda, this.gridBagConstraintsNivelCentroCosto);
	}

	this.gridBagConstraintsNivelCentroCosto = new GridBagConstraints();
	this.gridBagConstraintsNivelCentroCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNivelCentroCosto.gridy = 0;
	this.gridBagConstraintsNivelCentroCosto.gridx = 1;
	this.gridBagConstraintsNivelCentroCosto.ipadx = 0;
	this.gridBagConstraintsNivelCentroCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnivelNivelCentroCosto.add(jTextFieldnivelNivelCentroCosto, this.gridBagConstraintsNivelCentroCosto);


	this.gridBagConstraintsNivelCentroCosto = new GridBagConstraints();
	this.gridBagConstraintsNivelCentroCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNivelCentroCosto.gridy = 0;
	this.gridBagConstraintsNivelCentroCosto.gridx = 0;
	this.gridBagConstraintsNivelCentroCosto.ipadx = 0;
	this.gridBagConstraintsNivelCentroCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_digitosNivelCentroCosto.add(jLabelnumero_digitosNivelCentroCosto, this.gridBagConstraintsNivelCentroCosto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNivelCentroCosto = new GridBagConstraints();
		//this.gridBagConstraintsNivelCentroCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNivelCentroCosto.gridy = 0;
		this.gridBagConstraintsNivelCentroCosto.gridx = 2;
		this.gridBagConstraintsNivelCentroCosto.ipadx = 0;
		this.gridBagConstraintsNivelCentroCosto.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_digitosNivelCentroCosto.add(jButtonnumero_digitosNivelCentroCostoBusqueda, this.gridBagConstraintsNivelCentroCosto);
	}

	this.gridBagConstraintsNivelCentroCosto = new GridBagConstraints();
	this.gridBagConstraintsNivelCentroCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNivelCentroCosto.gridy = 0;
	this.gridBagConstraintsNivelCentroCosto.gridx = 1;
	this.gridBagConstraintsNivelCentroCosto.ipadx = 0;
	this.gridBagConstraintsNivelCentroCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_digitosNivelCentroCosto.add(jTextFieldnumero_digitosNivelCentroCosto, this.gridBagConstraintsNivelCentroCosto);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsNivelCentroCosto = new GridBagConstraints();
	this.gridBagConstraintsNivelCentroCosto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNivelCentroCosto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNivelCentroCosto.gridy = iYPanelCamposNivelCentroCosto;
	this.gridBagConstraintsNivelCentroCosto.gridx = iXPanelCamposNivelCentroCosto++;
	this.gridBagConstraintsNivelCentroCosto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNivelCentroCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNivelCentroCosto.add(this.jPanelidNivelCentroCosto, this.gridBagConstraintsNivelCentroCosto);



	if(iXPanelCamposNivelCentroCosto % 1==0) {
		iXPanelCamposNivelCentroCosto=0;
		iYPanelCamposNivelCentroCosto++;
	}
	this.gridBagConstraintsNivelCentroCosto = new GridBagConstraints();
	this.gridBagConstraintsNivelCentroCosto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNivelCentroCosto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNivelCentroCosto.gridy = iYPanelCamposNivelCentroCosto;
	this.gridBagConstraintsNivelCentroCosto.gridx = iXPanelCamposNivelCentroCosto++;
	this.gridBagConstraintsNivelCentroCosto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNivelCentroCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNivelCentroCosto.add(this.jPanelnivelNivelCentroCosto, this.gridBagConstraintsNivelCentroCosto);



	if(iXPanelCamposNivelCentroCosto % 1==0) {
		iXPanelCamposNivelCentroCosto=0;
		iYPanelCamposNivelCentroCosto++;
	}
	this.gridBagConstraintsNivelCentroCosto = new GridBagConstraints();
	this.gridBagConstraintsNivelCentroCosto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNivelCentroCosto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNivelCentroCosto.gridy = iYPanelCamposNivelCentroCosto;
	this.gridBagConstraintsNivelCentroCosto.gridx = iXPanelCamposNivelCentroCosto++;
	this.gridBagConstraintsNivelCentroCosto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNivelCentroCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNivelCentroCosto.add(this.jPanelnumero_digitosNivelCentroCosto, this.gridBagConstraintsNivelCentroCosto);



	if(iXPanelCamposNivelCentroCosto % 1==0) {
		iXPanelCamposNivelCentroCosto=0;
		iYPanelCamposNivelCentroCosto++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsNivelCentroCosto = new GridBagConstraints();
	this.gridBagConstraintsNivelCentroCosto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNivelCentroCosto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNivelCentroCosto.gridy = iYPanelCamposOcultosNivelCentroCosto;
	this.gridBagConstraintsNivelCentroCosto.gridx = iXPanelCamposOcultosNivelCentroCosto++;
	this.gridBagConstraintsNivelCentroCosto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNivelCentroCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosNivelCentroCosto.add(this.jPanelid_empresaNivelCentroCosto, this.gridBagConstraintsNivelCentroCosto);



	if(iXPanelCamposOcultosNivelCentroCosto % 1==0) {
		iXPanelCamposOcultosNivelCentroCosto=0;
		iYPanelCamposOcultosNivelCentroCosto++;
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
			
		GridBagLayout gridaBagLayoutAccionesNivelCentroCosto= new GridBagLayout();
		this.jPanelAccionesNivelCentroCosto.setLayout(gridaBagLayoutAccionesNivelCentroCosto);
		
		GridBagLayout gridaBagLayoutAccionesFormularioNivelCentroCosto= new GridBagLayout();
		this.jPanelAccionesFormularioNivelCentroCosto.setLayout(gridaBagLayoutAccionesFormularioNivelCentroCosto);
		
		this.gridBagConstraintsNivelCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsNivelCentroCosto.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsNivelCentroCosto.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioNivelCentroCosto.add(this.jComboBoxTiposAccionesFormularioNivelCentroCosto, this.gridBagConstraintsNivelCentroCosto);

		this.gridBagConstraintsNivelCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsNivelCentroCosto.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsNivelCentroCosto.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioNivelCentroCosto.add(this.jCheckBoxPostAccionNuevoNivelCentroCosto, this.gridBagConstraintsNivelCentroCosto);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.nivelcentrocostoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsNivelCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsNivelCentroCosto.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsNivelCentroCosto.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioNivelCentroCosto.add(this.jCheckBoxPostAccionSinCerrarNivelCentroCosto, this.gridBagConstraintsNivelCentroCosto);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.nivelcentrocostoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.nivelcentrocostoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsNivelCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsNivelCentroCosto.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsNivelCentroCosto.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioNivelCentroCosto.add(this.jCheckBoxPostAccionSinMensajeNivelCentroCosto, this.gridBagConstraintsNivelCentroCosto);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsNivelCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsNivelCentroCosto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNivelCentroCosto.gridy = 0;
		this.gridBagConstraintsNivelCentroCosto.gridx = iPosXAccion++;
			
		this.jPanelAccionesNivelCentroCosto.add(this.jButtonModificarNivelCentroCosto, this.gridBagConstraintsNivelCentroCosto);							

		this.gridBagConstraintsNivelCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsNivelCentroCosto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNivelCentroCosto.gridy = 0;
		this.gridBagConstraintsNivelCentroCosto.gridx =iPosXAccion++;
			
		this.jPanelAccionesNivelCentroCosto.add(this.jButtonEliminarNivelCentroCosto, this.gridBagConstraintsNivelCentroCosto);
		
			
		this.gridBagConstraintsNivelCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsNivelCentroCosto.gridy = 0;		
		this.gridBagConstraintsNivelCentroCosto.gridx = iPosXAccion++;
		
		this.jPanelAccionesNivelCentroCosto.add(this.jButtonActualizarNivelCentroCosto, this.gridBagConstraintsNivelCentroCosto);


		this.gridBagConstraintsNivelCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsNivelCentroCosto.gridy = 0;		
		this.gridBagConstraintsNivelCentroCosto.gridx = iPosXAccion++;
		
		this.jPanelAccionesNivelCentroCosto.add(this.jButtonGuardarCambiosNivelCentroCosto, this.gridBagConstraintsNivelCentroCosto);	
		
		this.gridBagConstraintsNivelCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsNivelCentroCosto.gridy = 0;		
		this.gridBagConstraintsNivelCentroCosto.gridx =iPosXAccion++;
		
		this.jPanelAccionesNivelCentroCosto.add(this.jButtonCancelarNivelCentroCosto, this.gridBagConstraintsNivelCentroCosto);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutNivelCentroCosto = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutNivelCentroCosto);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.nivelcentrocostoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsNivelCentroCosto = new GridBagConstraints();						
			this.gridBagConstraintsNivelCentroCosto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsNivelCentroCosto.gridx = 0;		
			//this.gridBagConstraintsNivelCentroCosto.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNivelCentroCosto.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsNivelCentroCosto.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsNivelCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsNivelCentroCosto.gridy =iGridyPrincipal++;
		this.gridBagConstraintsNivelCentroCosto.gridx =0;
		this.gridBagConstraintsNivelCentroCosto.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsNivelCentroCosto.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosNivelCentroCosto, this.gridBagConstraintsNivelCentroCosto);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(NivelCentroCostoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleNivelCentroCosto = new NivelCentroCostoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Nivel Centro Costo DATOS");
			
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
			
	        //this.setTitle("[FOR] - Nivel Centro Costo DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Nivel Centro Costo Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			NivelCentroCostoModel nivelcentrocostoModel=new NivelCentroCostoModel(this);
			
			//SI USARA CLASE INTERNA
			//NivelCentroCostoModel.NivelCentroCostoFocusTraversalPolicy nivelcentrocostoFocusTraversalPolicy = nivelcentrocostoModel.new NivelCentroCostoFocusTraversalPolicy(this);
			
			//nivelcentrocostoFocusTraversalPolicy.setnivelcentrocostoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(nivelcentrocostoModel);
			
			
			this.jContentPaneDetalleNivelCentroCosto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleNivelCentroCosto = new GridBagLayout();	
			this.jContentPaneDetalleNivelCentroCosto.setLayout(gridaBagLayoutDetalleNivelCentroCosto);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosNivelCentroCosto = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsNivelCentroCosto = new GridBagConstraints();
				this.gridBagConstraintsNivelCentroCosto.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsNivelCentroCosto.gridx = 0;
					
				
				this.jContentPaneDetalleNivelCentroCosto.add(jTtoolBarDetalleNivelCentroCosto, gridBagConstraintsNivelCentroCosto);								
				
}
			
			this.jScrollPanelDatosEdicionNivelCentroCosto=   new JScrollPane(jContentPaneDetalleNivelCentroCosto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionNivelCentroCosto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionNivelCentroCosto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionNivelCentroCosto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralNivelCentroCosto=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralNivelCentroCosto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralNivelCentroCosto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralNivelCentroCosto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsNivelCentroCosto = new GridBagConstraints();
			
			
	        this.gridBagConstraintsNivelCentroCosto.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsNivelCentroCosto.gridx = 0;
	        
			this.jContentPaneDetalleNivelCentroCosto.add(jPanelCamposNivelCentroCosto, gridBagConstraintsNivelCentroCosto);
			
			
			
			
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
						&& nivelcentrocostoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.nivelcentrocostoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsNivelCentroCosto= new GridBagConstraints();
						this.gridBagConstraintsNivelCentroCosto.gridy = iGridyRelaciones++;
						this.gridBagConstraintsNivelCentroCosto.gridx = 0;
						this.jContentPaneDetalleNivelCentroCosto.add(this.jTabbedPaneRelacionesNivelCentroCosto, this.gridBagConstraintsNivelCentroCosto);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesNivelCentroCosto.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosNivelCentroCosto.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsNivelCentroCosto = new GridBagConstraints();
					this.gridBagConstraintsNivelCentroCosto.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsNivelCentroCosto.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsNivelCentroCosto.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsNivelCentroCosto.gridx = 0;
					
				
					this.jContentPaneDetalleNivelCentroCosto.add(jPanelCamposOcultosNivelCentroCosto, gridBagConstraintsNivelCentroCosto);
				
					this.jPanelCamposOcultosNivelCentroCosto.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsNivelCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsNivelCentroCosto.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsNivelCentroCosto.gridx = 0;
	        this.gridBagConstraintsNivelCentroCosto.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleNivelCentroCosto.add(this.jPanelAccionesFormularioNivelCentroCosto, this.gridBagConstraintsNivelCentroCosto);							
			
			
			
			this.gridBagConstraintsNivelCentroCosto = new GridBagConstraints();
	        this.gridBagConstraintsNivelCentroCosto.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsNivelCentroCosto.gridx = 0;
	        
			
			this.jContentPaneDetalleNivelCentroCosto.add(this.jPanelAccionesNivelCentroCosto, this.gridBagConstraintsNivelCentroCosto);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionNivelCentroCosto);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionNivelCentroCosto=   new JScrollPane(this.jPanelCamposNivelCentroCosto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionNivelCentroCosto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionNivelCentroCosto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionNivelCentroCosto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsNivelCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsNivelCentroCosto.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsNivelCentroCosto.gridx = 0;
			this.gridBagConstraintsNivelCentroCosto.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsNivelCentroCosto.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsNivelCentroCosto.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionNivelCentroCosto, this.gridBagConstraintsNivelCentroCosto);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsNivelCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsNivelCentroCosto.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsNivelCentroCosto.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioNivelCentroCosto, this.gridBagConstraintsNivelCentroCosto);			
			
			this.gridBagConstraintsNivelCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsNivelCentroCosto.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsNivelCentroCosto.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesNivelCentroCosto, this.gridBagConstraintsNivelCentroCosto);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsNivelCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsNivelCentroCosto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNivelCentroCosto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposNivelCentroCosto, this.gridBagConstraintsNivelCentroCosto);
			
			
		this.gridBagConstraintsNivelCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsNivelCentroCosto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNivelCentroCosto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosNivelCentroCosto, this.gridBagConstraintsNivelCentroCosto);
		
			
		this.gridBagConstraintsNivelCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsNivelCentroCosto.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsNivelCentroCosto.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesNivelCentroCosto, this.gridBagConstraintsNivelCentroCosto);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralNivelCentroCosto;//jContentPane;
		
		return jScrollPanelDatosEdicionNivelCentroCosto;
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
