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
import com.bydan.erp.contabilidad.util.SubGrupoParametroFormularioIvaConstantesFunciones;

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
public class SubGrupoParametroFormularioIvaDetalleFormJInternalFrame extends SubGrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleSubGrupoParametroFormularioIva;
	
	protected JMenuBar jmenuBarDetalleSubGrupoParametroFormularioIva;
	
	protected JMenu jmenuDetalleSubGrupoParametroFormularioIva;
	protected JMenu jmenuDetalleArchivoSubGrupoParametroFormularioIva;
	protected JMenu jmenuDetalleAccionesSubGrupoParametroFormularioIva;
	protected JMenu jmenuDetalleDatosSubGrupoParametroFormularioIva;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleSubGrupoParametroFormularioIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutSubGrupoParametroFormularioIva;	
	protected GridBagConstraints gridBagConstraintsSubGrupoParametroFormularioIva;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected SubGrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional jInternalFrameDetalleSubGrupoParametroFormularioIva;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public SubGrupoParametroFormularioIvaSessionBean subgrupoparametroformularioivaSessionBean;
	
	

	public ParametroFormularioIvaBeanSwingJInternalFrame parametroformularioivaBeanSwingJInternalFrame=null;
	public ParametroFormularioIvaBeanSwingJInternalFrame parametroformularioivaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteParametroFormularioIva=false;
	public ParametroFormularioIvaSessionBean parametroformularioivaSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public SubGrupoParametroFormularioIvaLogic subgrupoparametroformularioivaLogic;
	
	public JScrollPane jScrollPanelDatosSubGrupoParametroFormularioIva;
	public JScrollPane jScrollPanelDatosEdicionSubGrupoParametroFormularioIva;
	public JScrollPane jScrollPanelDatosGeneralSubGrupoParametroFormularioIva;
	
	protected JPanel jPanelCamposSubGrupoParametroFormularioIva;    
	protected JPanel jPanelCamposOcultosSubGrupoParametroFormularioIva;    	
	protected JPanel jPanelAccionesSubGrupoParametroFormularioIva;
	protected JPanel jPanelAccionesFormularioSubGrupoParametroFormularioIva;
    
	
	
	protected Integer iXPanelCamposSubGrupoParametroFormularioIva=0;
	protected Integer iYPanelCamposSubGrupoParametroFormularioIva=0;
	
	protected Integer iXPanelCamposOcultosSubGrupoParametroFormularioIva=0;
	protected Integer iYPanelCamposOcultosSubGrupoParametroFormularioIva=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoSubGrupoParametroFormularioIva;
	public JButton jButtonModificarSubGrupoParametroFormularioIva;
	public JButton jButtonActualizarSubGrupoParametroFormularioIva;
    public JButton jButtonEliminarSubGrupoParametroFormularioIva;
	public JButton jButtonCancelarSubGrupoParametroFormularioIva;
    public JButton jButtonGuardarCambiosSubGrupoParametroFormularioIva;
	public JButton jButtonGuardarCambiosTablaSubGrupoParametroFormularioIva;
	protected JButton jButtonCerrarSubGrupoParametroFormularioIva;
	
	
	protected JButton jButtonProcesarInformacionSubGrupoParametroFormularioIva;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoSubGrupoParametroFormularioIva;
	protected JCheckBox jCheckBoxPostAccionSinCerrarSubGrupoParametroFormularioIva;
	protected JCheckBox jCheckBoxPostAccionSinMensajeSubGrupoParametroFormularioIva;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarSubGrupoParametroFormularioIva;
	protected JButton jButtonModificarToolBarSubGrupoParametroFormularioIva;
	protected JButton jButtonActualizarToolBarSubGrupoParametroFormularioIva;
    protected JButton jButtonEliminarToolBarSubGrupoParametroFormularioIva;
	protected JButton jButtonCancelarToolBarSubGrupoParametroFormularioIva;
    protected JButton jButtonGuardarCambiosToolBarSubGrupoParametroFormularioIva;
	protected JButton jButtonGuardarCambiosTablaToolBarSubGrupoParametroFormularioIva;
	protected JButton jButtonMostrarOcultarTablaToolBarSubGrupoParametroFormularioIva;
	protected JButton jButtonCerrarToolBarSubGrupoParametroFormularioIva;
	
	protected JButton jButtonProcesarInformacionToolBarSubGrupoParametroFormularioIva;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoSubGrupoParametroFormularioIva;
	protected JMenuItem jMenuItemModificarSubGrupoParametroFormularioIva;
	protected JMenuItem jMenuItemActualizarSubGrupoParametroFormularioIva;
    protected JMenuItem jMenuItemEliminarSubGrupoParametroFormularioIva;
	protected JMenuItem jMenuItemCancelarSubGrupoParametroFormularioIva;
    protected JMenuItem jMenuItemGuardarCambiosSubGrupoParametroFormularioIva;
	protected JMenuItem jMenuItemGuardarCambiosTablaSubGrupoParametroFormularioIva;
	protected JMenuItem jMenuItemCerrarSubGrupoParametroFormularioIva;
	protected JMenuItem jMenuItemDetalleCerrarSubGrupoParametroFormularioIva;
	protected JMenuItem jMenuItemDetalleMostarOcultarSubGrupoParametroFormularioIva;
	
	protected JMenuItem jMenuItemProcesarInformacionSubGrupoParametroFormularioIva;
	protected JMenuItem jMenuItemNuevoGuardarCambiosSubGrupoParametroFormularioIva;
	protected JMenuItem jMenuItemMostrarOcultarSubGrupoParametroFormularioIva;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesSubGrupoParametroFormularioIva;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesSubGrupoParametroFormularioIva;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesSubGrupoParametroFormularioIva;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioSubGrupoParametroFormularioIva;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidSubGrupoParametroFormularioIva;
	public JLabel jLabelIdSubGrupoParametroFormularioIva;
	public JLabel jLabelidSubGrupoParametroFormularioIva;
	public JButton jButtonidSubGrupoParametroFormularioIvaBusqueda= new JButtonMe();

	public JPanel jPanelnombreSubGrupoParametroFormularioIva;
	public JLabel jLabelnombreSubGrupoParametroFormularioIva;
	public JTextArea jTextAreanombreSubGrupoParametroFormularioIva;
	public JScrollPane jscrollPanenombreSubGrupoParametroFormularioIva;
	public JButton jButtonnombreSubGrupoParametroFormularioIvaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaSubGrupoParametroFormularioIva;
	public JLabel jLabelid_empresaSubGrupoParametroFormularioIva;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaSubGrupoParametroFormularioIva;
	public JButton jButtonid_empresaSubGrupoParametroFormularioIva= new JButtonMe();
	public JButton jButtonid_empresaSubGrupoParametroFormularioIvaUpdate= new JButtonMe();
	public JButton jButtonid_empresaSubGrupoParametroFormularioIvaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesSubGrupoParametroFormularioIva;
	
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
	public int iHeightFormulario=286;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public SubGrupoParametroFormularioIvaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposSubGrupoParametroFormularioIva=new JPanel();
				this.jPanelAccionesFormularioSubGrupoParametroFormularioIva=new JPanel();
				this.jmenuBarDetalleSubGrupoParametroFormularioIva=new JMenuBar();
				this.jTtoolBarDetalleSubGrupoParametroFormularioIva=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SubGrupoParametroFormularioIvaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("SubGrupoParametroFormularioIva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public SubGrupoParametroFormularioIvaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("SubGrupoParametroFormularioIva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SubGrupoParametroFormularioIvaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("SubGrupoParametroFormularioIva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SubGrupoParametroFormularioIvaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("SubGrupoParametroFormularioIva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SubGrupoParametroFormularioIvaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("SubGrupoParametroFormularioIva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarSubGrupoParametroFormularioIva() {
		return this.jButtonActualizarToolBarSubGrupoParametroFormularioIva;
	}
	
	public JButton getjButtonEliminarToolBarSubGrupoParametroFormularioIva() {
		return this.jButtonEliminarToolBarSubGrupoParametroFormularioIva;
	}
	
	public JButton getjButtonCancelarToolBarSubGrupoParametroFormularioIva() {
		return this.jButtonCancelarToolBarSubGrupoParametroFormularioIva;
	}		
	
	public JButton getjButtonProcesarInformacionSubGrupoParametroFormularioIva() {
		return this.jButtonProcesarInformacionSubGrupoParametroFormularioIva;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionSubGrupoParametroFormularioIva)	{
		this.jButtonProcesarInformacionSubGrupoParametroFormularioIva = jButtonProcesarInformacionSubGrupoParametroFormularioIva;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesSubGrupoParametroFormularioIva() {
		return this.jComboBoxTiposAccionesSubGrupoParametroFormularioIva;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesSubGrupoParametroFormularioIva(
			JComboBox jComboBoxTiposRelacionesSubGrupoParametroFormularioIva) {
		this.jComboBoxTiposRelacionesSubGrupoParametroFormularioIva = jComboBoxTiposRelacionesSubGrupoParametroFormularioIva;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesSubGrupoParametroFormularioIva(
			JComboBox jComboBoxTiposAccionesSubGrupoParametroFormularioIva) {
		this.jComboBoxTiposAccionesSubGrupoParametroFormularioIva = jComboBoxTiposAccionesSubGrupoParametroFormularioIva;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioSubGrupoParametroFormularioIva() {
		return this.jComboBoxTiposAccionesFormularioSubGrupoParametroFormularioIva;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioSubGrupoParametroFormularioIva(
			JComboBox jComboBoxTiposAccionesFormularioSubGrupoParametroFormularioIva) {
		this.jComboBoxTiposAccionesFormularioSubGrupoParametroFormularioIva = jComboBoxTiposAccionesFormularioSubGrupoParametroFormularioIva;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.subgrupoparametroformularioivaSessionBean=new SubGrupoParametroFormularioIvaSessionBean();
		
		this.subgrupoparametroformularioivaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.subgrupoparametroformularioivaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.subgrupoparametroformularioivaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.parametroformularioivaSessionBean=new ParametroFormularioIvaSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		SubGrupoParametroFormularioIvaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		SubGrupoParametroFormularioIvaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		SubGrupoParametroFormularioIvaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Sub Grupo Parametro Formulario Iva  MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.subgrupoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {
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
	
		SubGrupoParametroFormularioIvaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleSubGrupoParametroFormularioIva= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarSubGrupoParametroFormularioIva=new JButtonMe();
				this.jButtonModificarToolBarSubGrupoParametroFormularioIva=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarSubGrupoParametroFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarSubGrupoParametroFormularioIva,this.jTtoolBarDetalleSubGrupoParametroFormularioIva,
							"actualizar","actualizar","Actualizar"+" "+SubGrupoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarSubGrupoParametroFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarSubGrupoParametroFormularioIva,this.jTtoolBarDetalleSubGrupoParametroFormularioIva,
							"eliminar","eliminar","Eliminar"+" "+SubGrupoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarSubGrupoParametroFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarSubGrupoParametroFormularioIva,this.jTtoolBarDetalleSubGrupoParametroFormularioIva,
							"cancelar","cancelar","Cancelar"+" "+SubGrupoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarSubGrupoParametroFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarSubGrupoParametroFormularioIva,this.jTtoolBarDetalleSubGrupoParametroFormularioIva,
							"guardarcambios","guardarcambios","Guardar"+" "+SubGrupoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarSubGrupoParametroFormularioIva,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarSubGrupoParametroFormularioIva,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarSubGrupoParametroFormularioIva,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleSubGrupoParametroFormularioIva=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleSubGrupoParametroFormularioIva=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoSubGrupoParametroFormularioIva=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesSubGrupoParametroFormularioIva=new JMenuMe("Acciones");
		this.jmenuDetalleDatosSubGrupoParametroFormularioIva=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoSubGrupoParametroFormularioIva= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoSubGrupoParametroFormularioIva.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoSubGrupoParametroFormularioIva,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoSubGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarSubGrupoParametroFormularioIva= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarSubGrupoParametroFormularioIva.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarSubGrupoParametroFormularioIva,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarSubGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarSubGrupoParametroFormularioIva= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarSubGrupoParametroFormularioIva.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarSubGrupoParametroFormularioIva,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarSubGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarSubGrupoParametroFormularioIva= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarSubGrupoParametroFormularioIva.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarSubGrupoParametroFormularioIva,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarSubGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarSubGrupoParametroFormularioIva= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarSubGrupoParametroFormularioIva.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarSubGrupoParametroFormularioIva,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarSubGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosSubGrupoParametroFormularioIva= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosSubGrupoParametroFormularioIva.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosSubGrupoParametroFormularioIva,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosSubGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarSubGrupoParametroFormularioIva= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarSubGrupoParametroFormularioIva.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarSubGrupoParametroFormularioIva,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarSubGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarSubGrupoParametroFormularioIva= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarSubGrupoParametroFormularioIva.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarSubGrupoParametroFormularioIva,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarSubGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarSubGrupoParametroFormularioIva= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarSubGrupoParametroFormularioIva.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarSubGrupoParametroFormularioIva,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarSubGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarSubGrupoParametroFormularioIva= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarSubGrupoParametroFormularioIva.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarSubGrupoParametroFormularioIva,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarSubGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoSubGrupoParametroFormularioIva.add(this.jMenuItemDetalleCerrarSubGrupoParametroFormularioIva);
		
		this.jmenuDetalleAccionesSubGrupoParametroFormularioIva.add(this.jMenuItemActualizarSubGrupoParametroFormularioIva);
		this.jmenuDetalleAccionesSubGrupoParametroFormularioIva.add(this.jMenuItemEliminarSubGrupoParametroFormularioIva);
		this.jmenuDetalleAccionesSubGrupoParametroFormularioIva.add(this.jMenuItemCancelarSubGrupoParametroFormularioIva);		
		
		//this.jmenuDetalleDatosSubGrupoParametroFormularioIva.add(this.jMenuItemDetalleAbrirOrderBySubGrupoParametroFormularioIva);				
		this.jmenuDetalleDatosSubGrupoParametroFormularioIva.add(this.jMenuItemDetalleMostarOcultarSubGrupoParametroFormularioIva);				
				
		//this.jmenuDetalleAccionesSubGrupoParametroFormularioIva.add(this.jMenuItemGuardarCambiosSubGrupoParametroFormularioIva);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoSubGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesSubGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosSubGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleSubGrupoParametroFormularioIva.add(this.jmenuDetalleArchivoSubGrupoParametroFormularioIva);		
		this.jmenuBarDetalleSubGrupoParametroFormularioIva.add(this.jmenuDetalleAccionesSubGrupoParametroFormularioIva);		
		this.jmenuBarDetalleSubGrupoParametroFormularioIva.add(this.jmenuDetalleDatosSubGrupoParametroFormularioIva);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleSubGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleSubGrupoParametroFormularioIva.add(this.jmenuDetalleSubGrupoParametroFormularioIva);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleSubGrupoParametroFormularioIva);				
	}
	
	
	public void inicializarElementosCamposSubGrupoParametroFormularioIva() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdSubGrupoParametroFormularioIva = new JLabelMe();
		jLabelIdSubGrupoParametroFormularioIva.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdSubGrupoParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdSubGrupoParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdSubGrupoParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdSubGrupoParametroFormularioIva,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidSubGrupoParametroFormularioIva = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidSubGrupoParametroFormularioIva.setToolTipText(SubGrupoParametroFormularioIvaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutSubGrupoParametroFormularioIva= new GridBagLayout();

		this.jPanelidSubGrupoParametroFormularioIva.setLayout(this.gridaBagLayoutSubGrupoParametroFormularioIva);

		jLabelidSubGrupoParametroFormularioIva = new JLabel();
		jLabelidSubGrupoParametroFormularioIva.setText("Id");

		jLabelidSubGrupoParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidSubGrupoParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidSubGrupoParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreSubGrupoParametroFormularioIva = new JLabelMe();
		this.jLabelnombreSubGrupoParametroFormularioIva.setText(""+SubGrupoParametroFormularioIvaConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreSubGrupoParametroFormularioIva.setToolTipText("Nombre");
		this.jLabelnombreSubGrupoParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreSubGrupoParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreSubGrupoParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreSubGrupoParametroFormularioIva,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreSubGrupoParametroFormularioIva=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreSubGrupoParametroFormularioIva.setToolTipText(SubGrupoParametroFormularioIvaConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutSubGrupoParametroFormularioIva = new GridBagLayout();
		this.jPanelnombreSubGrupoParametroFormularioIva.setLayout(this.gridaBagLayoutSubGrupoParametroFormularioIva);


		jTextAreanombreSubGrupoParametroFormularioIva= new JTextAreaMe();
		jTextAreanombreSubGrupoParametroFormularioIva.setEnabled(false);
		jTextAreanombreSubGrupoParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreSubGrupoParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreSubGrupoParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreSubGrupoParametroFormularioIva.setLineWrap(true);
		jTextAreanombreSubGrupoParametroFormularioIva.setWrapStyleWord(true);
		jTextAreanombreSubGrupoParametroFormularioIva.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreSubGrupoParametroFormularioIva.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreSubGrupoParametroFormularioIva,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreSubGrupoParametroFormularioIva = new JScrollPane(jTextAreanombreSubGrupoParametroFormularioIva);
		jscrollPanenombreSubGrupoParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreSubGrupoParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreSubGrupoParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreSubGrupoParametroFormularioIvaBusqueda= new JButtonMe();
		this.jButtonnombreSubGrupoParametroFormularioIvaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreSubGrupoParametroFormularioIvaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreSubGrupoParametroFormularioIvaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreSubGrupoParametroFormularioIvaBusqueda.setText("U");
		this.jButtonnombreSubGrupoParametroFormularioIvaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreSubGrupoParametroFormularioIvaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreSubGrupoParametroFormularioIvaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreSubGrupoParametroFormularioIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreSubGrupoParametroFormularioIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreSubGrupoParametroFormularioIvaBusqueda"));

		if(this.subgrupoparametroformularioivaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreSubGrupoParametroFormularioIvaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysSubGrupoParametroFormularioIva() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaSubGrupoParametroFormularioIva = new JLabelMe();
		this.jLabelid_empresaSubGrupoParametroFormularioIva.setText(""+SubGrupoParametroFormularioIvaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaSubGrupoParametroFormularioIva.setToolTipText("Empresa");
		this.jLabelid_empresaSubGrupoParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaSubGrupoParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaSubGrupoParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaSubGrupoParametroFormularioIva,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaSubGrupoParametroFormularioIva=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaSubGrupoParametroFormularioIva.setToolTipText(SubGrupoParametroFormularioIvaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutSubGrupoParametroFormularioIva = new GridBagLayout();
		this.jPanelid_empresaSubGrupoParametroFormularioIva.setLayout(this.gridaBagLayoutSubGrupoParametroFormularioIva);


		jComboBoxid_empresaSubGrupoParametroFormularioIva= new JComboBoxMe();
		jComboBoxid_empresaSubGrupoParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaSubGrupoParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaSubGrupoParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaSubGrupoParametroFormularioIva,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaSubGrupoParametroFormularioIva.setEnabled(false);

		this.jButtonid_empresaSubGrupoParametroFormularioIva= new JButtonMe();
		this.jButtonid_empresaSubGrupoParametroFormularioIva.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaSubGrupoParametroFormularioIva.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaSubGrupoParametroFormularioIva.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaSubGrupoParametroFormularioIva.setText("Buscar");
		this.jButtonid_empresaSubGrupoParametroFormularioIva.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaSubGrupoParametroFormularioIva.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaSubGrupoParametroFormularioIva,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaSubGrupoParametroFormularioIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaSubGrupoParametroFormularioIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaSubGrupoParametroFormularioIva"));

		this.jButtonid_empresaSubGrupoParametroFormularioIvaBusqueda= new JButtonMe();
		this.jButtonid_empresaSubGrupoParametroFormularioIvaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaSubGrupoParametroFormularioIvaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaSubGrupoParametroFormularioIvaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaSubGrupoParametroFormularioIvaBusqueda.setText("U");
		this.jButtonid_empresaSubGrupoParametroFormularioIvaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaSubGrupoParametroFormularioIvaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaSubGrupoParametroFormularioIvaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaSubGrupoParametroFormularioIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaSubGrupoParametroFormularioIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaSubGrupoParametroFormularioIvaBusqueda"));

		if(this.subgrupoparametroformularioivaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaSubGrupoParametroFormularioIvaBusqueda.setVisible(false);		}

		this.jButtonid_empresaSubGrupoParametroFormularioIvaUpdate= new JButtonMe();
		this.jButtonid_empresaSubGrupoParametroFormularioIvaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaSubGrupoParametroFormularioIvaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaSubGrupoParametroFormularioIvaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaSubGrupoParametroFormularioIvaUpdate.setText("U");
		this.jButtonid_empresaSubGrupoParametroFormularioIvaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaSubGrupoParametroFormularioIvaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaSubGrupoParametroFormularioIvaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaSubGrupoParametroFormularioIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaSubGrupoParametroFormularioIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaSubGrupoParametroFormularioIvaUpdate"));



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
		//this.jInternalFrameDetalleSubGrupoParametroFormularioIva = new SubGrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Sub Grupo Parametro Formulario Iva  DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutSubGrupoParametroFormularioIva= new GridBagLayout();
		

		
		String sToolTipSubGrupoParametroFormularioIva="";
		sToolTipSubGrupoParametroFormularioIva=SubGrupoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipSubGrupoParametroFormularioIva+="(Contabilidad.SubGrupoParametroFormularioIva)";
		}
		
		if(!this.subgrupoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {
			sToolTipSubGrupoParametroFormularioIva+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoSubGrupoParametroFormularioIva = new JButtonMe();
		this.jButtonModificarSubGrupoParametroFormularioIva = new JButtonMe();
        this.jButtonActualizarSubGrupoParametroFormularioIva = new JButtonMe();
        this.jButtonEliminarSubGrupoParametroFormularioIva = new JButtonMe();
        this.jButtonCancelarSubGrupoParametroFormularioIva = new JButtonMe();
        this.jButtonGuardarCambiosSubGrupoParametroFormularioIva = new JButtonMe();
		this.jButtonGuardarCambiosTablaSubGrupoParametroFormularioIva = new JButtonMe();
		this.jButtonCerrarSubGrupoParametroFormularioIva = new JButtonMe();
		
		this.jScrollPanelDatosSubGrupoParametroFormularioIva = new JScrollPane();   
        this.jScrollPanelDatosEdicionSubGrupoParametroFormularioIva = new JScrollPane();
		this.jScrollPanelDatosGeneralSubGrupoParametroFormularioIva = new JScrollPane();
				
		
		
		this.jPanelCamposSubGrupoParametroFormularioIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosSubGrupoParametroFormularioIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesSubGrupoParametroFormularioIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioSubGrupoParametroFormularioIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Sub Grupo Parametro Formulario Iva ";
		
		if(!this.subgrupoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosSubGrupoParametroFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sub Grupo Parametro Formulario Iva s" + this.sPath));
		} else {
			this.jScrollPanelDatosSubGrupoParametroFormularioIva.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionSubGrupoParametroFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralSubGrupoParametroFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposSubGrupoParametroFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposSubGrupoParametroFormularioIva.setName("jPanelCamposSubGrupoParametroFormularioIva"); 

		this.jPanelCamposOcultosSubGrupoParametroFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosSubGrupoParametroFormularioIva.setName("jPanelCamposOcultosSubGrupoParametroFormularioIva"); 

        this.jPanelAccionesSubGrupoParametroFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesSubGrupoParametroFormularioIva.setToolTipText("Acciones");
        this.jPanelAccionesSubGrupoParametroFormularioIva.setName("Acciones"); 

		this.jPanelAccionesFormularioSubGrupoParametroFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioSubGrupoParametroFormularioIva.setToolTipText("Acciones");
        this.jPanelAccionesFormularioSubGrupoParametroFormularioIva.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionSubGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralSubGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosSubGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposSubGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosSubGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioSubGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoSubGrupoParametroFormularioIva.setText("Nuevo");
		this.jButtonModificarSubGrupoParametroFormularioIva.setText("Editar");
        this.jButtonActualizarSubGrupoParametroFormularioIva.setText("Actualizar");
        this.jButtonEliminarSubGrupoParametroFormularioIva.setText("Eliminar");
        this.jButtonCancelarSubGrupoParametroFormularioIva.setText("Cancelar");
        this.jButtonGuardarCambiosSubGrupoParametroFormularioIva.setText("Guardar");
		this.jButtonGuardarCambiosTablaSubGrupoParametroFormularioIva.setText("Guardar");
		this.jButtonCerrarSubGrupoParametroFormularioIva.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoSubGrupoParametroFormularioIva,"nuevo_button","Nuevo",this.subgrupoparametroformularioivaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarSubGrupoParametroFormularioIva,"modificar_button","Editar",this.subgrupoparametroformularioivaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarSubGrupoParametroFormularioIva,"actualizar_button","Actualizar",this.subgrupoparametroformularioivaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarSubGrupoParametroFormularioIva,"eliminar_button","Eliminar",this.subgrupoparametroformularioivaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarSubGrupoParametroFormularioIva,"cancelar_button","Cancelar",this.subgrupoparametroformularioivaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosSubGrupoParametroFormularioIva,"guardarcambios_button","Guardar",this.subgrupoparametroformularioivaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaSubGrupoParametroFormularioIva,"guardarcambiostabla_button","Guardar",this.subgrupoparametroformularioivaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarSubGrupoParametroFormularioIva,"cerrar_button","Salir",this.subgrupoparametroformularioivaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoSubGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarSubGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosSubGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaSubGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarSubGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarSubGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarSubGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarSubGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoSubGrupoParametroFormularioIva.setToolTipText("Nuevo"+" "+SubGrupoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarSubGrupoParametroFormularioIva.setToolTipText("Editar"+" "+SubGrupoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarSubGrupoParametroFormularioIva.setToolTipText("Actualizar"+" "+SubGrupoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarSubGrupoParametroFormularioIva.setToolTipText("Eliminar)"+" "+SubGrupoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarSubGrupoParametroFormularioIva.setToolTipText("Cancelar"+" "+SubGrupoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosSubGrupoParametroFormularioIva.setToolTipText("Guardar"+" "+SubGrupoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaSubGrupoParametroFormularioIva.setToolTipText("Guardar"+" "+SubGrupoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarSubGrupoParametroFormularioIva.setToolTipText("Salir"+" "+SubGrupoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoSubGrupoParametroFormularioIva";
		inputMap = this.jButtonNuevoSubGrupoParametroFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoSubGrupoParametroFormularioIva.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoSubGrupoParametroFormularioIva"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarSubGrupoParametroFormularioIva";
		inputMap = this.jButtonActualizarSubGrupoParametroFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarSubGrupoParametroFormularioIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarSubGrupoParametroFormularioIva"));
		
		//ELIMINAR
		sMapKey = "EliminarSubGrupoParametroFormularioIva";
		inputMap = this.jButtonEliminarSubGrupoParametroFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarSubGrupoParametroFormularioIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarSubGrupoParametroFormularioIva"));
		
		//CANCELAR	
		sMapKey = "CancelarSubGrupoParametroFormularioIva";
		inputMap = this.jButtonCancelarSubGrupoParametroFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarSubGrupoParametroFormularioIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarSubGrupoParametroFormularioIva"));
		
		//CERRAR		
		sMapKey = "CerrarSubGrupoParametroFormularioIva";
		inputMap = this.jButtonCerrarSubGrupoParametroFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarSubGrupoParametroFormularioIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarSubGrupoParametroFormularioIva"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaSubGrupoParametroFormularioIva";
		inputMap = this.jButtonGuardarCambiosTablaSubGrupoParametroFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaSubGrupoParametroFormularioIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaSubGrupoParametroFormularioIva"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoSubGrupoParametroFormularioIva = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoSubGrupoParametroFormularioIva.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoSubGrupoParametroFormularioIva.setToolTipText("Nuevo SubGrupoParametroFormularioIva");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoSubGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarSubGrupoParametroFormularioIva = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarSubGrupoParametroFormularioIva.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarSubGrupoParametroFormularioIva.setToolTipText("Sin Cerrar Ventana SubGrupoParametroFormularioIva");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarSubGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeSubGrupoParametroFormularioIva = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeSubGrupoParametroFormularioIva.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeSubGrupoParametroFormularioIva.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeSubGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesSubGrupoParametroFormularioIva = new JComboBoxMe();
		//this.jComboBoxTiposAccionesSubGrupoParametroFormularioIva.setText("Accion");
		this.jComboBoxTiposAccionesSubGrupoParametroFormularioIva.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioSubGrupoParametroFormularioIva = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioSubGrupoParametroFormularioIva.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioSubGrupoParametroFormularioIva.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesSubGrupoParametroFormularioIva = new JLabelMe();
		
		this.jLabelAccionesSubGrupoParametroFormularioIva.setText("Acciones");		
		this.jLabelAccionesSubGrupoParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSubGrupoParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSubGrupoParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposSubGrupoParametroFormularioIva();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysSubGrupoParametroFormularioIva();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesSubGrupoParametroFormularioIva=new JTabbedPane();
		this.jTabbedPaneRelacionesSubGrupoParametroFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesSubGrupoParametroFormularioIva,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesSubGrupoParametroFormularioIva.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSubGrupoParametroFormularioIva.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSubGrupoParametroFormularioIva.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesSubGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioSubGrupoParametroFormularioIva.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioSubGrupoParametroFormularioIva.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioSubGrupoParametroFormularioIva.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioSubGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposSubGrupoParametroFormularioIva = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosSubGrupoParametroFormularioIva = new GridBagLayout();
		
		this.jPanelCamposSubGrupoParametroFormularioIva.setLayout(gridaBagLayoutCamposSubGrupoParametroFormularioIva);
		this.jPanelCamposOcultosSubGrupoParametroFormularioIva.setLayout(gridaBagLayoutCamposOcultosSubGrupoParametroFormularioIva);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsSubGrupoParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubGrupoParametroFormularioIva.gridy = 0;
	this.gridBagConstraintsSubGrupoParametroFormularioIva.gridx = 0;
	this.gridBagConstraintsSubGrupoParametroFormularioIva.ipadx = 0;
	this.gridBagConstraintsSubGrupoParametroFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidSubGrupoParametroFormularioIva.add(jLabelIdSubGrupoParametroFormularioIva, this.gridBagConstraintsSubGrupoParametroFormularioIva);



	this.gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsSubGrupoParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubGrupoParametroFormularioIva.gridy = 0;
	this.gridBagConstraintsSubGrupoParametroFormularioIva.gridx = 1;
	this.gridBagConstraintsSubGrupoParametroFormularioIva.ipadx = 0;
	this.gridBagConstraintsSubGrupoParametroFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidSubGrupoParametroFormularioIva.add(jLabelidSubGrupoParametroFormularioIva, this.gridBagConstraintsSubGrupoParametroFormularioIva);


	this.gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsSubGrupoParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubGrupoParametroFormularioIva.gridy = 0;
	this.gridBagConstraintsSubGrupoParametroFormularioIva.gridx = 0;
	this.gridBagConstraintsSubGrupoParametroFormularioIva.ipadx = 0;
	this.gridBagConstraintsSubGrupoParametroFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaSubGrupoParametroFormularioIva.add(jLabelid_empresaSubGrupoParametroFormularioIva, this.gridBagConstraintsSubGrupoParametroFormularioIva);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
		//this.gridBagConstraintsSubGrupoParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubGrupoParametroFormularioIva.gridy = 0;
		this.gridBagConstraintsSubGrupoParametroFormularioIva.gridx = 2;
		this.gridBagConstraintsSubGrupoParametroFormularioIva.ipadx = 0;
		this.gridBagConstraintsSubGrupoParametroFormularioIva.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaSubGrupoParametroFormularioIva.add(jButtonid_empresaSubGrupoParametroFormularioIvaBusqueda, this.gridBagConstraintsSubGrupoParametroFormularioIva);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
		//this.gridBagConstraintsSubGrupoParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubGrupoParametroFormularioIva.gridy = 0;
		this.gridBagConstraintsSubGrupoParametroFormularioIva.gridx = 3;
		this.gridBagConstraintsSubGrupoParametroFormularioIva.ipadx = 0;
		this.gridBagConstraintsSubGrupoParametroFormularioIva.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaSubGrupoParametroFormularioIva.add(jButtonid_empresaSubGrupoParametroFormularioIvaUpdate, this.gridBagConstraintsSubGrupoParametroFormularioIva);
	}

	this.gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsSubGrupoParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubGrupoParametroFormularioIva.gridy = 0;
	this.gridBagConstraintsSubGrupoParametroFormularioIva.gridx = 1;
	this.gridBagConstraintsSubGrupoParametroFormularioIva.ipadx = 0;
	this.gridBagConstraintsSubGrupoParametroFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaSubGrupoParametroFormularioIva.add(jComboBoxid_empresaSubGrupoParametroFormularioIva, this.gridBagConstraintsSubGrupoParametroFormularioIva);


	this.gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsSubGrupoParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubGrupoParametroFormularioIva.gridy = 0;
	this.gridBagConstraintsSubGrupoParametroFormularioIva.gridx = 0;
	this.gridBagConstraintsSubGrupoParametroFormularioIva.ipadx = 0;
	this.gridBagConstraintsSubGrupoParametroFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreSubGrupoParametroFormularioIva.add(jLabelnombreSubGrupoParametroFormularioIva, this.gridBagConstraintsSubGrupoParametroFormularioIva);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
		//this.gridBagConstraintsSubGrupoParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubGrupoParametroFormularioIva.gridy = 0;
		this.gridBagConstraintsSubGrupoParametroFormularioIva.gridx = 2;
		this.gridBagConstraintsSubGrupoParametroFormularioIva.ipadx = 0;
		this.gridBagConstraintsSubGrupoParametroFormularioIva.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreSubGrupoParametroFormularioIva.add(jButtonnombreSubGrupoParametroFormularioIvaBusqueda, this.gridBagConstraintsSubGrupoParametroFormularioIva);
	}

	this.gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsSubGrupoParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubGrupoParametroFormularioIva.gridy = 0;
	this.gridBagConstraintsSubGrupoParametroFormularioIva.gridx = 1;
	this.gridBagConstraintsSubGrupoParametroFormularioIva.ipadx = 0;
	this.gridBagConstraintsSubGrupoParametroFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreSubGrupoParametroFormularioIva.add(jscrollPanenombreSubGrupoParametroFormularioIva, this.gridBagConstraintsSubGrupoParametroFormularioIva);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsSubGrupoParametroFormularioIva.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSubGrupoParametroFormularioIva.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSubGrupoParametroFormularioIva.gridy = iYPanelCamposSubGrupoParametroFormularioIva;
	this.gridBagConstraintsSubGrupoParametroFormularioIva.gridx = iXPanelCamposSubGrupoParametroFormularioIva++;
	this.gridBagConstraintsSubGrupoParametroFormularioIva.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSubGrupoParametroFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSubGrupoParametroFormularioIva.add(this.jPanelidSubGrupoParametroFormularioIva, this.gridBagConstraintsSubGrupoParametroFormularioIva);



	if(iXPanelCamposSubGrupoParametroFormularioIva % 1==0) {
		iXPanelCamposSubGrupoParametroFormularioIva=0;
		iYPanelCamposSubGrupoParametroFormularioIva++;
	}
	this.gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsSubGrupoParametroFormularioIva.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSubGrupoParametroFormularioIva.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSubGrupoParametroFormularioIva.gridy = iYPanelCamposSubGrupoParametroFormularioIva;
	this.gridBagConstraintsSubGrupoParametroFormularioIva.gridx = iXPanelCamposSubGrupoParametroFormularioIva++;
	this.gridBagConstraintsSubGrupoParametroFormularioIva.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSubGrupoParametroFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSubGrupoParametroFormularioIva.add(this.jPanelnombreSubGrupoParametroFormularioIva, this.gridBagConstraintsSubGrupoParametroFormularioIva);



	if(iXPanelCamposSubGrupoParametroFormularioIva % 1==0) {
		iXPanelCamposSubGrupoParametroFormularioIva=0;
		iYPanelCamposSubGrupoParametroFormularioIva++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsSubGrupoParametroFormularioIva.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSubGrupoParametroFormularioIva.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSubGrupoParametroFormularioIva.gridy = iYPanelCamposOcultosSubGrupoParametroFormularioIva;
	this.gridBagConstraintsSubGrupoParametroFormularioIva.gridx = iXPanelCamposOcultosSubGrupoParametroFormularioIva++;
	this.gridBagConstraintsSubGrupoParametroFormularioIva.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSubGrupoParametroFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosSubGrupoParametroFormularioIva.add(this.jPanelid_empresaSubGrupoParametroFormularioIva, this.gridBagConstraintsSubGrupoParametroFormularioIva);



	if(iXPanelCamposOcultosSubGrupoParametroFormularioIva % 1==0) {
		iXPanelCamposOcultosSubGrupoParametroFormularioIva=0;
		iYPanelCamposOcultosSubGrupoParametroFormularioIva++;
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
			
		GridBagLayout gridaBagLayoutAccionesSubGrupoParametroFormularioIva= new GridBagLayout();
		this.jPanelAccionesSubGrupoParametroFormularioIva.setLayout(gridaBagLayoutAccionesSubGrupoParametroFormularioIva);
		
		GridBagLayout gridaBagLayoutAccionesFormularioSubGrupoParametroFormularioIva= new GridBagLayout();
		this.jPanelAccionesFormularioSubGrupoParametroFormularioIva.setLayout(gridaBagLayoutAccionesFormularioSubGrupoParametroFormularioIva);
		
		this.gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsSubGrupoParametroFormularioIva.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsSubGrupoParametroFormularioIva.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioSubGrupoParametroFormularioIva.add(this.jComboBoxTiposAccionesFormularioSubGrupoParametroFormularioIva, this.gridBagConstraintsSubGrupoParametroFormularioIva);

		this.gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsSubGrupoParametroFormularioIva.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsSubGrupoParametroFormularioIva.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioSubGrupoParametroFormularioIva.add(this.jCheckBoxPostAccionNuevoSubGrupoParametroFormularioIva, this.gridBagConstraintsSubGrupoParametroFormularioIva);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.subgrupoparametroformularioivaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsSubGrupoParametroFormularioIva.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsSubGrupoParametroFormularioIva.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioSubGrupoParametroFormularioIva.add(this.jCheckBoxPostAccionSinCerrarSubGrupoParametroFormularioIva, this.gridBagConstraintsSubGrupoParametroFormularioIva);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.subgrupoparametroformularioivaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.subgrupoparametroformularioivaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsSubGrupoParametroFormularioIva.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsSubGrupoParametroFormularioIva.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioSubGrupoParametroFormularioIva.add(this.jCheckBoxPostAccionSinMensajeSubGrupoParametroFormularioIva, this.gridBagConstraintsSubGrupoParametroFormularioIva);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsSubGrupoParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSubGrupoParametroFormularioIva.gridy = 0;
		this.gridBagConstraintsSubGrupoParametroFormularioIva.gridx = iPosXAccion++;
			
		this.jPanelAccionesSubGrupoParametroFormularioIva.add(this.jButtonModificarSubGrupoParametroFormularioIva, this.gridBagConstraintsSubGrupoParametroFormularioIva);							

		this.gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsSubGrupoParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSubGrupoParametroFormularioIva.gridy = 0;
		this.gridBagConstraintsSubGrupoParametroFormularioIva.gridx =iPosXAccion++;
			
		this.jPanelAccionesSubGrupoParametroFormularioIva.add(this.jButtonEliminarSubGrupoParametroFormularioIva, this.gridBagConstraintsSubGrupoParametroFormularioIva);
		
			
		this.gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsSubGrupoParametroFormularioIva.gridy = 0;		
		this.gridBagConstraintsSubGrupoParametroFormularioIva.gridx = iPosXAccion++;
		
		this.jPanelAccionesSubGrupoParametroFormularioIva.add(this.jButtonActualizarSubGrupoParametroFormularioIva, this.gridBagConstraintsSubGrupoParametroFormularioIva);


		this.gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsSubGrupoParametroFormularioIva.gridy = 0;		
		this.gridBagConstraintsSubGrupoParametroFormularioIva.gridx = iPosXAccion++;
		
		this.jPanelAccionesSubGrupoParametroFormularioIva.add(this.jButtonGuardarCambiosSubGrupoParametroFormularioIva, this.gridBagConstraintsSubGrupoParametroFormularioIva);	
		
		this.gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsSubGrupoParametroFormularioIva.gridy = 0;		
		this.gridBagConstraintsSubGrupoParametroFormularioIva.gridx =iPosXAccion++;
		
		this.jPanelAccionesSubGrupoParametroFormularioIva.add(this.jButtonCancelarSubGrupoParametroFormularioIva, this.gridBagConstraintsSubGrupoParametroFormularioIva);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutSubGrupoParametroFormularioIva = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutSubGrupoParametroFormularioIva);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.subgrupoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();						
			this.gridBagConstraintsSubGrupoParametroFormularioIva.gridy = iGridyPrincipal++;
			this.gridBagConstraintsSubGrupoParametroFormularioIva.gridx = 0;		
			//this.gridBagConstraintsSubGrupoParametroFormularioIva.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSubGrupoParametroFormularioIva.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsSubGrupoParametroFormularioIva.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsSubGrupoParametroFormularioIva.gridy =iGridyPrincipal++;
		this.gridBagConstraintsSubGrupoParametroFormularioIva.gridx =0;
		this.gridBagConstraintsSubGrupoParametroFormularioIva.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsSubGrupoParametroFormularioIva.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosSubGrupoParametroFormularioIva, this.gridBagConstraintsSubGrupoParametroFormularioIva);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(SubGrupoParametroFormularioIvaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleSubGrupoParametroFormularioIva = new SubGrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Sub Grupo Parametro Formulario Iva  DATOS");
			
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
			
	        //this.setTitle("[FOR] - Sub Grupo Parametro Formulario Iva  DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Sub Grupo Parametro Formulario Iva  Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			SubGrupoParametroFormularioIvaModel subgrupoparametroformularioivaModel=new SubGrupoParametroFormularioIvaModel(this);
			
			//SI USARA CLASE INTERNA
			//SubGrupoParametroFormularioIvaModel.SubGrupoParametroFormularioIvaFocusTraversalPolicy subgrupoparametroformularioivaFocusTraversalPolicy = subgrupoparametroformularioivaModel.new SubGrupoParametroFormularioIvaFocusTraversalPolicy(this);
			
			//subgrupoparametroformularioivaFocusTraversalPolicy.setsubgrupoparametroformularioivaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(subgrupoparametroformularioivaModel);
			
			
			this.jContentPaneDetalleSubGrupoParametroFormularioIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleSubGrupoParametroFormularioIva = new GridBagLayout();	
			this.jContentPaneDetalleSubGrupoParametroFormularioIva.setLayout(gridaBagLayoutDetalleSubGrupoParametroFormularioIva);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosSubGrupoParametroFormularioIva = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
				this.gridBagConstraintsSubGrupoParametroFormularioIva.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsSubGrupoParametroFormularioIva.gridx = 0;
					
				
				this.jContentPaneDetalleSubGrupoParametroFormularioIva.add(jTtoolBarDetalleSubGrupoParametroFormularioIva, gridBagConstraintsSubGrupoParametroFormularioIva);								
				
}
			
			this.jScrollPanelDatosEdicionSubGrupoParametroFormularioIva=   new JScrollPane(jContentPaneDetalleSubGrupoParametroFormularioIva,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionSubGrupoParametroFormularioIva.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSubGrupoParametroFormularioIva.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSubGrupoParametroFormularioIva.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralSubGrupoParametroFormularioIva=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralSubGrupoParametroFormularioIva.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSubGrupoParametroFormularioIva.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSubGrupoParametroFormularioIva.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
			
			
	        this.gridBagConstraintsSubGrupoParametroFormularioIva.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsSubGrupoParametroFormularioIva.gridx = 0;
	        
			this.jContentPaneDetalleSubGrupoParametroFormularioIva.add(jPanelCamposSubGrupoParametroFormularioIva, gridBagConstraintsSubGrupoParametroFormularioIva);
			
			
			
			
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
						&& subgrupoparametroformularioivaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameParametroFormularioIva(this.puedeCargarPorParteParametroFormularioIva,false,-1);
					
					if(this.subgrupoparametroformularioivaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsSubGrupoParametroFormularioIva= new GridBagConstraints();
						this.gridBagConstraintsSubGrupoParametroFormularioIva.gridy = iGridyRelaciones++;
						this.gridBagConstraintsSubGrupoParametroFormularioIva.gridx = 0;
						this.jContentPaneDetalleSubGrupoParametroFormularioIva.add(this.jTabbedPaneRelacionesSubGrupoParametroFormularioIva, this.gridBagConstraintsSubGrupoParametroFormularioIva);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesSubGrupoParametroFormularioIva.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameParametroFormularioIva(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosSubGrupoParametroFormularioIva.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
					this.gridBagConstraintsSubGrupoParametroFormularioIva.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsSubGrupoParametroFormularioIva.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsSubGrupoParametroFormularioIva.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsSubGrupoParametroFormularioIva.gridx = 0;
					
				
					this.jContentPaneDetalleSubGrupoParametroFormularioIva.add(jPanelCamposOcultosSubGrupoParametroFormularioIva, gridBagConstraintsSubGrupoParametroFormularioIva);
				
					this.jPanelCamposOcultosSubGrupoParametroFormularioIva.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsSubGrupoParametroFormularioIva.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsSubGrupoParametroFormularioIva.gridx = 0;
	        this.gridBagConstraintsSubGrupoParametroFormularioIva.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleSubGrupoParametroFormularioIva.add(this.jPanelAccionesFormularioSubGrupoParametroFormularioIva, this.gridBagConstraintsSubGrupoParametroFormularioIva);							
			
			
			
			this.gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
	        this.gridBagConstraintsSubGrupoParametroFormularioIva.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsSubGrupoParametroFormularioIva.gridx = 0;
	        
			
			this.jContentPaneDetalleSubGrupoParametroFormularioIva.add(this.jPanelAccionesSubGrupoParametroFormularioIva, this.gridBagConstraintsSubGrupoParametroFormularioIva);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionSubGrupoParametroFormularioIva);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionSubGrupoParametroFormularioIva=   new JScrollPane(this.jPanelCamposSubGrupoParametroFormularioIva,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionSubGrupoParametroFormularioIva.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSubGrupoParametroFormularioIva.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSubGrupoParametroFormularioIva.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsSubGrupoParametroFormularioIva.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsSubGrupoParametroFormularioIva.gridx = 0;
			this.gridBagConstraintsSubGrupoParametroFormularioIva.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsSubGrupoParametroFormularioIva.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsSubGrupoParametroFormularioIva.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionSubGrupoParametroFormularioIva, this.gridBagConstraintsSubGrupoParametroFormularioIva);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsSubGrupoParametroFormularioIva.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsSubGrupoParametroFormularioIva.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioSubGrupoParametroFormularioIva, this.gridBagConstraintsSubGrupoParametroFormularioIva);			
			
			this.gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsSubGrupoParametroFormularioIva.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsSubGrupoParametroFormularioIva.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesSubGrupoParametroFormularioIva, this.gridBagConstraintsSubGrupoParametroFormularioIva);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsSubGrupoParametroFormularioIva.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSubGrupoParametroFormularioIva.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposSubGrupoParametroFormularioIva, this.gridBagConstraintsSubGrupoParametroFormularioIva);
			
			
		this.gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsSubGrupoParametroFormularioIva.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSubGrupoParametroFormularioIva.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosSubGrupoParametroFormularioIva, this.gridBagConstraintsSubGrupoParametroFormularioIva);
		
			
		this.gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsSubGrupoParametroFormularioIva.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsSubGrupoParametroFormularioIva.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesSubGrupoParametroFormularioIva, this.gridBagConstraintsSubGrupoParametroFormularioIva);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralSubGrupoParametroFormularioIva;//jContentPane;
		
		return jScrollPanelDatosEdicionSubGrupoParametroFormularioIva;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameParametroFormularioIva(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.parametroformularioivaSessionBean=new ParametroFormularioIvaSessionBean();
		this.parametroformularioivaSessionBean.setConGuardarRelaciones(false);
		this.parametroformularioivaSessionBean.setEsGuardarRelacionado(true);

		this.parametroformularioivaBeanSwingJInternalFrame=null;//new ParametroFormularioIvaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.parametroformularioivaBeanSwingJInternalFramePopup=new ParametroFormularioIvaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.parametroformularioivaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.parametroformularioivaSessionBean.getEsGuardarRelacionado()) {

				ParametroFormularioIvaJInternalFrame.STIPO_TAMANIO_GENERAL=SubGrupoParametroFormularioIvaJInternalFrame.STIPO_TAMANIO_GENERAL;
				ParametroFormularioIvaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=SubGrupoParametroFormularioIvaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.parametroformularioivaSessionBean.setEsGuardarRelacionado(true);

				this.parametroformularioivaBeanSwingJInternalFrame=new ParametroFormularioIvaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.parametroformularioivaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.parametroformularioivaBeanSwingJInternalFrame.setparametroformularioivaSessionBean(this.parametroformularioivaSessionBean);

				//this.gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
				//this.gridBagConstraintsSubGrupoParametroFormularioIva.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsSubGrupoParametroFormularioIva.gridx = 0;
				//this.jContentPaneDetalleSubGrupoParametroFormularioIva.add(this.parametroformularioivaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsSubGrupoParametroFormularioIva);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesSubGrupoParametroFormularioIva.add("Parametro Formulario Ivas",this.parametroformularioivaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesSubGrupoParametroFormularioIva.setComponentAt(iIndexTab,this.parametroformularioivaBeanSwingJInternalFrame.getContentPane());
				}

				//ParametroFormularioIvaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.parametroformularioivaSessionBean.setEsGuardarRelacionado(false);
				this.parametroformularioivaBeanSwingJInternalFrame=null;//new ParametroFormularioIvaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.parametroformularioivaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteParametroFormularioIva) {
					this.jTabbedPaneRelacionesSubGrupoParametroFormularioIva.add("Parametro Formulario Ivas",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarParametroFormularioIvaBeanSwingJInternalFrame(List<SubGrupoParametroFormularioIva> subgrupoparametroformularioivas,SubGrupoParametroFormularioIva subgrupoparametroformularioiva,ParametroFormularioIvaBeanSwingJInternalFrame parametroformularioivaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//parametroformularioivaBeanSwingJInternalFrame=new ParametroFormularioIvaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					parametroformularioivaBeanSwingJInternalFrame.getParametroFormularioIvaLogic().setConnexion(this.subgrupoparametroformularioivaLogic.getConnexion());

					parametroformularioivaBeanSwingJInternalFrame.setsubgrupoparametroformularioivasForeignKey(subgrupoparametroformularioivas);
					parametroformularioivaBeanSwingJInternalFrame.setsubgrupoparametroformularioivaForeignKey(subgrupoparametroformularioiva);
					parametroformularioivaBeanSwingJInternalFrame.parametroformularioivaSessionBean.setisBusquedaDesdeForeignKeySesionSubGrupoParametroFormularioIva(true);
					parametroformularioivaBeanSwingJInternalFrame.parametroformularioivaSessionBean.setlidSubGrupoParametroFormularioIvaActual(subgrupoparametroformularioiva.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					parametroformularioivaBeanSwingJInternalFrame.cargarCombosForeignKeyParametroFormularioIva(parametroformularioivaBeanSwingJInternalFrame.isCargarCombosDependencia);
					parametroformularioivaBeanSwingJInternalFrame.setVisibilidadBusquedasParaSubGrupoParametroFormularioIva(true);
					parametroformularioivaBeanSwingJInternalFrame.setid_sub_grupo_parametro_formulario_ivaFK_IdSubGrupoParametroFormularioIva(subgrupoparametroformularioiva.getId());

					if(!this.conCargarFormDetalle) {
						parametroformularioivaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					parametroformularioivaBeanSwingJInternalFrame.setSelectedItemCombosFrameSubGrupoParametroFormularioIvaForeignKey(subgrupoparametroformularioiva,1,false,true,true);
					parametroformularioivaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					parametroformularioivaBeanSwingJInternalFrame.procesarBusqueda("FK_IdSubGrupoParametroFormularioIva");
					parametroformularioivaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdSubGrupoParametroFormularioIva");
					parametroformularioivaBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroFormularioIva(true);
					parametroformularioivaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesParametroFormularioIva("n",parametroformularioivaBeanSwingJInternalFrame.isGuardarCambiosEnLote, parametroformularioivaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					parametroformularioivaBeanSwingJInternalFrame.setAutoscrolls(true);
					parametroformularioivaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						parametroformularioivaBeanSwingJInternalFrame.actualizarEstadoPanelsParametroFormularioIva("relacionado");
					} else {
						parametroformularioivaBeanSwingJInternalFrame.actualizarEstadoPanelsParametroFormularioIva("no_relacionado");
					}

					parametroformularioivaBeanSwingJInternalFrame.getjButtonRecargarInformacionParametroFormularioIva().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
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
