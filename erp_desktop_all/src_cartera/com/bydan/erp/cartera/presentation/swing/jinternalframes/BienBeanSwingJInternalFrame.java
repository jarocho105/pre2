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




import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.PerfilOpcion;
import com.bydan.erp.seguridad.business.entity.PerfilCampo;
import com.bydan.erp.seguridad.business.entity.PerfilAccion;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;
import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Accion;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneralAdditional;
import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;


//import com.bydan.erp.seguridad.business.entity.PerfilAccion;


import com.bydan.erp.seguridad.util.SistemaConstantesFunciones;
import com.bydan.erp.seguridad.util.SistemaConstantesFuncionesAdditional;
import com.bydan.erp.seguridad.business.logic.SistemaLogicAdditional;

import com.bydan.erp.cartera.util.BienConstantesFunciones;
import com.bydan.erp.cartera.util.BienParameterReturnGeneral;
//import com.bydan.erp.cartera.util.BienParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.BienBean;
import com.bydan.framework.erp.business.dataaccess.ConstantesSql;
import com.bydan.framework.erp.business.entity.Classe;
import com.bydan.framework.erp.business.entity.DatoGeneral;
import com.bydan.framework.erp.business.entity.GeneralEntityParameterGeneral;
import com.bydan.framework.erp.business.entity.OrderBy;
import com.bydan.framework.erp.business.entity.DatoGeneralMinimo;
import com.bydan.framework.erp.business.entity.GeneralEntity;
import com.bydan.framework.erp.business.entity.Mensajes;
import com.bydan.framework.erp.business.entity.GeneralEntityParameterReturnGeneral;
//import com.bydan.framework.erp.business.entity.MaintenanceType;
import com.bydan.framework.erp.util.MaintenanceType;
import com.bydan.framework.erp.util.FuncionesReporte;
import com.bydan.framework.erp.business.logic.DatosCliente;
import com.bydan.framework.erp.business.logic.Pagination;

import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.framework.erp.presentation.desktop.swing.TablaGeneralTotalModel;
import com.bydan.framework.erp.presentation.desktop.swing.TablaGeneralOrderByModel;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverter;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverterFromDate;
import com.bydan.framework.erp.presentation.desktop.swing.DateRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.DateEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.BooleanRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.BooleanEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.TextFieldRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.RunnableProceso;
import com.bydan.framework.erp.presentation.desktop.swing.*;
//import com.bydan.framework.erp.presentation.desktop.swing.TextFieldEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.HeaderRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.JInternalFrameBase;
import com.bydan.framework.erp.presentation.desktop.swing.FuncionesSwing;
import com.bydan.framework.erp.presentation.desktop.swing.MainJFrame;
import com.bydan.framework.erp.resources.imagenes.AuxiliarImagenes;
import com.bydan.erp.cartera.resources.reportes.AuxiliarReportes;


import com.bydan.erp.cartera.util.*;
import com.bydan.erp.cartera.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.cartera.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;






import javax.imageio.ImageIO;
import java.net.NetworkInterface;
import java.net.InterfaceAddress;
import java.net.InetAddress;
import javax.naming.InitialContext;
import java.lang.Long;
import java.util.Date;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;
import java.util.Hashtable;
import java.util.Collections;
import java.io.File;
import java.io.FileInputStream;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.stream.StreamSource;

import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import org.w3c.dom.Document;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.util.CellRangeAddress;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;


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
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

import org.apache.log4j.Logger;

import com.bydan.framework.erp.business.entity.Reporte;


//VALIDACION
import org.hibernate.validator.ClassValidator;
import org.hibernate.validator.InvalidValue;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.JasperRunManager;
import net.sf.jasperreports.engine.export.JExcelApiExporter;
import net.sf.jasperreports.engine.export.JRCsvExporter;
import net.sf.jasperreports.engine.export.JRRtfExporter;
import net.sf.jasperreports.engine.export.JRXlsExporter;
import net.sf.jasperreports.engine.export.JRXlsExporterParameter;
import net.sf.jasperreports.engine.util.JRSaver;
import net.sf.jasperreports.engine.xml.JRXmlWriter;


import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;

import java.util.EventObject;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.event.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import java.awt.*;
import java.awt.event.*;

import org.jdesktop.beansbinding.Binding.SyncFailure;
import org.jdesktop.beansbinding.BindingListener;
import org.jdesktop.beansbinding.Bindings;
import org.jdesktop.beansbinding.BeanProperty;
import org.jdesktop.beansbinding.ELProperty;
import org.jdesktop.beansbinding.AutoBinding.UpdateStrategy;
import org.jdesktop.beansbinding.PropertyStateEvent;
import org.jdesktop.swingbinding.JComboBoxBinding;
import org.jdesktop.swingbinding.SwingBindings;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

import com.toedter.calendar.JDateChooser;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class BienBeanSwingJInternalFrame extends BienJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(BienBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Bien> bienValidator = new ClassValidator<Bien>(Bien.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Bien bien;	
	public Bien bienAux;
	public Bien bienAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Bien bienTotales;
	public Long idBienActual;
	public Long iIdNuevoBien=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboEmpresa="";

	public List<Empresa> empresasForeignKey;

	public List<Empresa> getempresasForeignKey() {
		return empresasForeignKey;
	}

	public void setempresasForeignKey(List<Empresa> empresasForeignKey) {
		this.empresasForeignKey = empresasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Empresa empresaForeignKey;

	public Empresa getempresaForeignKey() {
		return empresaForeignKey;
	}

	public void setempresaForeignKey(Empresa empresaForeignKey) {
		this.empresaForeignKey = empresaForeignKey;
	}

	public String sFinalQueryComboCliente="";

	public List<Cliente> clientesForeignKey;

	public List<Cliente> getclientesForeignKey() {
		return clientesForeignKey;
	}

	public void setclientesForeignKey(List<Cliente> clientesForeignKey) {
		this.clientesForeignKey = clientesForeignKey;
	}

	//OBJETO FK ACTUAL
	public Cliente clienteForeignKey;

	public Cliente getclienteForeignKey() {
		return clienteForeignKey;
	}

	public void setclienteForeignKey(Cliente clienteForeignKey) {
		this.clienteForeignKey = clienteForeignKey;
	}

	public String sFinalQueryComboTipoBien="";

	public List<TipoBien> tipobiensForeignKey;

	public List<TipoBien> gettipobiensForeignKey() {
		return tipobiensForeignKey;
	}

	public void settipobiensForeignKey(List<TipoBien> tipobiensForeignKey) {
		this.tipobiensForeignKey = tipobiensForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoBien tipobienForeignKey;

	public TipoBien gettipobienForeignKey() {
		return tipobienForeignKey;
	}

	public void settipobienForeignKey(TipoBien tipobienForeignKey) {
		this.tipobienForeignKey = tipobienForeignKey;
	}

		
	
	
	
	//BUSQUEDA INTERNA FK
	public Long idClienteActual=0L;

	public Long getidClienteActual() {
		return idClienteActual;
	}

	public void setidClienteActual(Long idClienteActual) {
		this.idClienteActual= idClienteActual;
	}
	
	
	
	
	//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
	public String sFinalQueryGeneral="";
	public Boolean isEntroOnLoad=false;
	public Boolean isErrorGuardar=false;
	
	public Boolean isGuardarCambiosEnLote=false;
	public Boolean isCargarCombosDependencia=false;
	public Boolean isSeleccionarTodos=false;
	public Boolean isSeleccionados=false;
	public Boolean conGraficoReporte=false;
	
	public Boolean isPostAccionNuevo=false;
	public Boolean isPostAccionSinCerrar=false;
	public Boolean isPostAccionSinMensaje=false;
	
	
	public Boolean esControlTabla=false;
	
	public Boolean isPermisoTodoBien;
	public Boolean isPermisoNuevoBien;
	public Boolean isPermisoActualizarBien;
	public Boolean isPermisoActualizarOriginalBien;
	public Boolean isPermisoEliminarBien;
	public Boolean isPermisoGuardarCambiosBien;
	public Boolean isPermisoConsultaBien;
	public Boolean isPermisoBusquedaBien;
	public Boolean isPermisoReporteBien;
	public Boolean isPermisoPaginacionMedioBien;
	public Boolean isPermisoPaginacionAltoBien;
	public Boolean isPermisoPaginacionTodoBien;
	public Boolean isPermisoCopiarBien;
	public Boolean isPermisoVerFormBien;
	public Boolean isPermisoDuplicarBien;
	public Boolean isPermisoOrdenBien;
	
	
	public ArrayList<DatoGeneral> arrDatoGeneral;
	public ArrayList<String> arrDatoGeneralNo;
	ArrayList<Classe> classesActual=new ArrayList<Classe>();
	
	public List<Accion> accions;	
	public List<Accion> accionsFormulario;
	
	
	public ArrayList<DatoGeneralMinimo> arrDatoGeneralMinimos;
	
	public ArrayList<Reporte> tiposArchivosReportes;
	public ArrayList<Reporte> tiposArchivosReportesDinamico;
	public ArrayList<Reporte> tiposReportes;
	public ArrayList<Reporte> tiposReportesDinamico;
	public ArrayList<Reporte> tiposGraficosReportes;
	public ArrayList<Reporte> tiposPaginacion;
	public ArrayList<Reporte> tiposRelaciones;
	public ArrayList<Reporte> tiposAcciones;
	public ArrayList<Reporte> tiposAccionesFormulario;
	public ArrayList<Reporte> tiposSeleccionar;
	
	public ArrayList<Reporte> tiposColumnasSelect;
	public ArrayList<Reporte> tiposRelacionesSelect;
	
	
	public Integer iNumeroPaginacion;
	public Integer iNumeroPaginacionPagina;
	public Pagination pagination;
	public DatosCliente datosCliente;
	public DatosDeep datosDeep;
	public String sTipoArchivoReporte="";
	public String sTipoArchivoReporteDinamico="";
	public String sTipoReporte="";
	public String sTipoReporteDinamico="";
	public String sTipoGraficoReporte="";
	public String sTipoPaginacion="";
	public String sTipoRelacion="";
	public String sTipoAccion="";
	public String sTipoAccionFormulario="";
	public String sTipoSeleccionar="";	
	public String sDetalleReporte="";
	public Boolean isMostrarNumeroPaginacion;
	public String sTipoReporteExtra="";
	public String sValorCampoGeneral="";
	public Boolean esReporteDinamico=false;
	public Boolean esReporteAccionProceso=false;
	public Boolean esRecargarFks=false;
	public String sPathReporteDinamico="";
	
	public BienParameterReturnGeneral bienReturnGeneral;
	public BienParameterReturnGeneral bienParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoBien=false;
	public Boolean esParaAccionDesdeFormularioBien=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected BienSessionBeanAdditional bienSessionBeanAdditional=null;
	
	public BienSessionBeanAdditional getBienSessionBeanAdditional() {
		return this.bienSessionBeanAdditional;
	}
	
	public void setBienSessionBeanAdditional(BienSessionBeanAdditional bienSessionBeanAdditional) {
		try {
			this.bienSessionBeanAdditional=bienSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected BienBeanSwingJInternalFrameAdditional bienBeanSwingJInternalFrameAdditional=null;
	//public class BienBeanSwingJInternalFrame
	
	public BienBeanSwingJInternalFrameAdditional getBienBeanSwingJInternalFrameAdditional() {
		return this.bienBeanSwingJInternalFrameAdditional;
	}
	
	public void setBienBeanSwingJInternalFrameAdditional(BienBeanSwingJInternalFrameAdditional bienBeanSwingJInternalFrameAdditional) {
		try {
			this.bienBeanSwingJInternalFrameAdditional=bienBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public BienLogic bienLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Bien bienBean;
	public BienConstantesFunciones bienConstantesFunciones;
	//public BienParameterReturnGeneral bienReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public ClienteLogic clienteLogic;
	public TipoBienLogic tipobienLogic;
	
	//PARAMETROS
	
	
	//public List<Bien> biens;	
	//public List<Bien> biensEliminados;
	//public List<Bien> biensAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoBien=false;
	public Boolean isVisibilidadCeldaDuplicarBien=true;
	public Boolean isVisibilidadCeldaCopiarBien=true;
	public Boolean isVisibilidadCeldaVerFormBien=true;
	public Boolean isVisibilidadCeldaOrdenBien=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesBien=false;
	public Boolean isVisibilidadCeldaModificarBien=false;
	public Boolean isVisibilidadCeldaActualizarBien=false;
	public Boolean isVisibilidadCeldaEliminarBien=false;
	public Boolean isVisibilidadCeldaCancelarBien=false;
	public Boolean isVisibilidadCeldaGuardarBien=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosBien=false;	
	
	
	public Boolean isVisibilidadFK_IdCliente=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdValorClienteTipoBien=false;
	
	public Long getiIdNuevoBien() {
		return this.iIdNuevoBien;
	}

	public void setiIdNuevoBien(Long iIdNuevoBien) {
		this.iIdNuevoBien = iIdNuevoBien;
	}
	
	public Long getidBienActual() {
		return this.idBienActual;
	}

	public void setidBienActual(Long idBienActual) {
		this.idBienActual = idBienActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Bien getbien() {
		return this.bien;
	}

	public void setbien(Bien bien) {
		this.bien = bien;
	}
	
	public Bien getbienAux() {
		return this.bienAux;
	}

	public void setbienAux(Bien bienAux) {
		this.bienAux = bienAux;
	}				
	
	public Bien getbienAnterior() {
		return this.bienAnterior;
	}

	public void setbienAnterior(Bien bienAnterior) {
		this.bienAnterior = bienAnterior;
	}	
	
	public Bien getbienTotales() {
		return this.bienTotales;
	}

	public void setbienTotales(Bien bienTotales) {
		this.bienTotales = bienTotales;
	}	
	
	public Bien getbienBean() {
		return this.bienBean;
	}

	public void setbienBean(Bien bienBean) {
		this.bienBean = bienBean;
	}	
	
	public BienParameterReturnGeneral getbienReturnGeneral() {
		return this.bienReturnGeneral;
	}

	public void setbienReturnGeneral(BienParameterReturnGeneral bienReturnGeneral) {
		this.bienReturnGeneral = bienReturnGeneral;
	}	
	
	
	public Long id_clienteFK_IdCliente=-1L;

	public Long getid_clienteFK_IdCliente() {
		return this.id_clienteFK_IdCliente;
	}

	public void setid_clienteFK_IdCliente(Long id_clienteFK_IdCliente) {
		this.id_clienteFK_IdCliente = id_clienteFK_IdCliente;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_tipobienFK_IdValorClienteTipoBien=-1L;

	public Long getid_tipobienFK_IdValorClienteTipoBien() {
		return this.id_tipobienFK_IdValorClienteTipoBien;
	}

	public void setid_tipobienFK_IdValorClienteTipoBien(Long id_tipobienFK_IdValorClienteTipoBien) {
		this.id_tipobienFK_IdValorClienteTipoBien = id_tipobienFK_IdValorClienteTipoBien;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public BienLogic getBienLogic()	{		
		return bienLogic;
	}

	public void setBienLogic(BienLogic bienLogic) {
		this.bienLogic = bienLogic;
	}
	
	
	public void setsFinalQueryGeneral(String sFinalQueryGeneral) {
		this.sFinalQueryGeneral=sFinalQueryGeneral;
	}
	
	public String getsFinalQueryGeneral() {
		return this.sFinalQueryGeneral;
	}
		
	public Boolean getIsGuardarCambiosEnLote() {
		return isGuardarCambiosEnLote;
	}

	public void setIsGuardarCambiosEnLote(Boolean isGuardarCambiosEnLote) {
		this.isGuardarCambiosEnLote = isGuardarCambiosEnLote;
	}
	
	public Boolean getIsCargarCombosDependencia() {
		return isCargarCombosDependencia;
	}

	public void setIsCargarCombosDependencia(Boolean isCargarCombosDependencia) {
		this.isCargarCombosDependencia = isCargarCombosDependencia;
	}
	
	public Boolean getIsEsNuevoBien() {
		return isEsNuevoBien;
	}

	public void setIsEsNuevoBien(Boolean isEsNuevoBien) {
		this.isEsNuevoBien = isEsNuevoBien;
	}

	public Boolean getEsParaAccionDesdeFormularioBien() {
		return esParaAccionDesdeFormularioBien;
	}
	
	public void setEsParaAccionDesdeFormularioBien(Boolean esParaAccionDesdeFormularioBien) {
		this.esParaAccionDesdeFormularioBien = esParaAccionDesdeFormularioBien;
	}
	
	public Boolean getIsEsMantenimientoRelacionesRelacionadoUnico() {
		return isEsMantenimientoRelacionesRelacionadoUnico;
	}

	public void setIsEsMantenimientoRelacionesRelacionadoUnico(Boolean isEsMantenimientoRelacionesRelacionadoUnico) {
		this.isEsMantenimientoRelacionesRelacionadoUnico = isEsMantenimientoRelacionesRelacionadoUnico;
	}

	public Boolean getIsEsMantenimientoRelaciones() {
		return isEsMantenimientoRelaciones;
	}

	public void setIsEsMantenimientoRelaciones(Boolean isEsMantenimientoRelaciones) {
		this.isEsMantenimientoRelaciones = isEsMantenimientoRelaciones;
	}

	public Boolean getIsEsMantenimientoRelacionado() {
		return isEsMantenimientoRelacionado;
	}

	public void setIsEsMantenimientoRelacionado(Boolean isEsMantenimientoRelacionado) {
		this.isEsMantenimientoRelacionado = isEsMantenimientoRelacionado;
	}

	public Boolean getesParaBusquedaForeignKey() {
		return esParaBusquedaForeignKey;
	}

	public void setesParaBusquedaForeignKey(Boolean esParaBusquedaForeignKey) {
		this.esParaBusquedaForeignKey = esParaBusquedaForeignKey;
	}

	public Boolean getIsContieneImagenes() {
		return isContieneImagenes;
	}

	public void setIsContieneImagenes(Boolean isContieneImagenes) {
		this.isContieneImagenes = isContieneImagenes;
	}		
	
	
	public void cargarCombosEmpresasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.empresasForeignKey=new ArrayList<Empresa>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EmpresaLogic empresaLogic=new EmpresaLogic();

			//empresaLogic.getEmpresaDataAccess().setIsForForeingKeyData(true);

			if(this.bienSessionBean==null) {
				this.bienSessionBean=new BienSessionBean();
			}

			if(!this.bienSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//empresaLogic.getEmpresaDataAccess().setIsForForeingKeyData(true);

					empresaLogic.getTodosEmpresasWithConnection(sFinalQuery,new Pagination());

					this.empresasForeignKey=empresaLogic.getEmpresas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEmpresa(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					empresaLogic.getEntityWithConnection(bienSessionBean.getlidEmpresaActual());
					this.empresasForeignKey.add(empresaLogic.getEmpresa());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public void cargarCombosClientesForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.clientesForeignKey=new ArrayList<Cliente>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			ClienteLogic clienteLogic=new ClienteLogic();

			//clienteLogic.getClienteDataAccess().setIsForForeingKeyData(true);

			if(this.bienSessionBean==null) {
				this.bienSessionBean=new BienSessionBean();
			}

			if(!this.bienSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//clienteLogic.getClienteDataAccess().setIsForForeingKeyData(true);

					clienteLogic.getTodosClientesWithConnection(sFinalQuery,new Pagination());

					this.clientesForeignKey=clienteLogic.getClientes();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCliente(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					clienteLogic.getEntityWithConnection(bienSessionBean.getlidClienteActual());
					this.clientesForeignKey.add(clienteLogic.getCliente());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public void cargarCombosTipoBiensForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipobiensForeignKey=new ArrayList<TipoBien>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoBienLogic tipobienLogic=new TipoBienLogic();

			//tipobienLogic.getTipoBienDataAccess().setIsForForeingKeyData(true);

			if(this.bienSessionBean==null) {
				this.bienSessionBean=new BienSessionBean();
			}

			if(!this.bienSessionBean.getisBusquedaDesdeForeignKeySesionTipoBien()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipobienLogic.getTipoBienDataAccess().setIsForForeingKeyData(true);

					tipobienLogic.getTodosTipoBiensWithConnection(sFinalQuery,new Pagination());

					this.tipobiensForeignKey=tipobienLogic.getTipoBiens();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoBien(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipobienLogic.getEntityWithConnection(bienSessionBean.getlidTipoBienActual());
					this.tipobiensForeignKey.add(tipobienLogic.getTipoBien());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	
	public void setActualEmpresaForeignKey(Long idEmpresaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(empresaTemp!=null) {

					if(this.bien!=null) {
						this.bien.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormBien!=null) {
						this.jInternalFrameDetalleFormBien.jComboBoxid_empresaBien.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaBien.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormBien!=null) {
						if(this.jInternalFrameDetalleFormBien.jComboBoxid_empresaBien.getItemCount()>0) {
							this.jInternalFrameDetalleFormBien.jComboBoxid_empresaBien.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualEmpresaForeignKeyDescripcion(Long idEmpresaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}


			sDescripcion=EmpresaConstantesFunciones.getEmpresaDescripcion(empresaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaBienGenerico)throws Exception
	{
		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}

			if(empresaTemp!=null) {
				jComboBoxid_empresaBienGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaBienGenerico!=null && jComboBoxid_empresaBienGenerico.getItemCount()>0) {
					jComboBoxid_empresaBienGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualClienteForeignKey(Long idClienteSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Cliente  clienteTemp=null;

			for(Cliente clienteAux:clientesForeignKey) {
				if(clienteAux.getId()!=null && clienteAux.getId().equals(idClienteSeleccionado)) {
					clienteTemp=clienteAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(clienteTemp!=null) {

					if(this.bien!=null) {
						this.bien.setCliente(clienteTemp);
					}

					if(this.jInternalFrameDetalleFormBien!=null) {
						this.jInternalFrameDetalleFormBien.jComboBoxid_clienteBien.setSelectedItem(clienteTemp);
					}
				} else {
					//jComboBoxid_clienteBien.setSelectedItem(clienteTemp);
					if(this.jInternalFrameDetalleFormBien!=null) {
						if(this.jInternalFrameDetalleFormBien.jComboBoxid_clienteBien.getItemCount()>0) {
							this.jInternalFrameDetalleFormBien.jComboBoxid_clienteBien.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCliente") || sFormularioTipoBusqueda.equals("Todos")){
					if(clienteTemp!=null && jComboBoxid_clienteFK_IdClienteBien!=null) {
						jComboBoxid_clienteFK_IdClienteBien.setSelectedItem(clienteTemp);
					} else {
						if(jComboBoxid_clienteFK_IdClienteBien!=null) {
							//jComboBoxid_clienteFK_IdClienteBien.setSelectedItem(clienteTemp);
							if(jComboBoxid_clienteFK_IdClienteBien.getItemCount()>0) {
								jComboBoxid_clienteFK_IdClienteBien.setSelectedIndex(0);
							}
						}
					}
				}

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualClienteForeignKeyDescripcion(Long idClienteSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Cliente  clienteTemp=null;

			for(Cliente clienteAux:clientesForeignKey) {
				if(clienteAux.getId()!=null && clienteAux.getId().equals(idClienteSeleccionado)) {
					clienteTemp=clienteAux;
					break;
				}
			}


			sDescripcion=ClienteConstantesFunciones.getClienteDescripcion(clienteTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualClienteForeignKeyGenerico(Long idClienteSeleccionado,JComboBox jComboBoxid_clienteBienGenerico)throws Exception
	{
		try
		{
			Cliente  clienteTemp=null;

			for(Cliente clienteAux:clientesForeignKey) {
				if(clienteAux.getId()!=null && clienteAux.getId().equals(idClienteSeleccionado)) {
					clienteTemp=clienteAux;
					break;
				}
			}

			if(clienteTemp!=null) {
				jComboBoxid_clienteBienGenerico.setSelectedItem(clienteTemp);
			} else {
				if(jComboBoxid_clienteBienGenerico!=null && jComboBoxid_clienteBienGenerico.getItemCount()>0) {
					jComboBoxid_clienteBienGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoBienForeignKey(Long idTipoBienSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoBien  tipobienTemp=null;

			for(TipoBien tipobienAux:tipobiensForeignKey) {
				if(tipobienAux.getId()!=null && tipobienAux.getId().equals(idTipoBienSeleccionado)) {
					tipobienTemp=tipobienAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipobienTemp!=null) {

					if(this.bien!=null) {
						this.bien.setTipoBien(tipobienTemp);
					}

					if(this.jInternalFrameDetalleFormBien!=null) {
						this.jInternalFrameDetalleFormBien.jComboBoxid_tipobienBien.setSelectedItem(tipobienTemp);
					}
				} else {
					//jComboBoxid_tipobienBien.setSelectedItem(tipobienTemp);
					if(this.jInternalFrameDetalleFormBien!=null) {
						if(this.jInternalFrameDetalleFormBien.jComboBoxid_tipobienBien.getItemCount()>0) {
							this.jInternalFrameDetalleFormBien.jComboBoxid_tipobienBien.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdValorClienteTipoBien") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipobienTemp!=null && jComboBoxid_tipobienFK_IdValorClienteTipoBienBien!=null) {
						jComboBoxid_tipobienFK_IdValorClienteTipoBienBien.setSelectedItem(tipobienTemp);
					} else {
						if(jComboBoxid_tipobienFK_IdValorClienteTipoBienBien!=null) {
							//jComboBoxid_tipobienFK_IdValorClienteTipoBienBien.setSelectedItem(tipobienTemp);
							if(jComboBoxid_tipobienFK_IdValorClienteTipoBienBien.getItemCount()>0) {
								jComboBoxid_tipobienFK_IdValorClienteTipoBienBien.setSelectedIndex(0);
							}
						}
					}
				}

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualTipoBienForeignKeyDescripcion(Long idTipoBienSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoBien  tipobienTemp=null;

			for(TipoBien tipobienAux:tipobiensForeignKey) {
				if(tipobienAux.getId()!=null && tipobienAux.getId().equals(idTipoBienSeleccionado)) {
					tipobienTemp=tipobienAux;
					break;
				}
			}


			sDescripcion=TipoBienConstantesFunciones.getTipoBienDescripcion(tipobienTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoBienForeignKeyGenerico(Long idTipoBienSeleccionado,JComboBox jComboBoxid_tipobienBienGenerico)throws Exception
	{
		try
		{
			TipoBien  tipobienTemp=null;

			for(TipoBien tipobienAux:tipobiensForeignKey) {
				if(tipobienAux.getId()!=null && tipobienAux.getId().equals(idTipoBienSeleccionado)) {
					tipobienTemp=tipobienAux;
					break;
				}
			}

			if(tipobienTemp!=null) {
				jComboBoxid_tipobienBienGenerico.setSelectedItem(tipobienTemp);
			} else {
				if(jComboBoxid_tipobienBienGenerico!=null && jComboBoxid_tipobienBienGenerico.getItemCount()>0) {
					jComboBoxid_tipobienBienGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(Bien bien,JComboBox jComboBoxid_empresaBienGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaBienGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormBien.jComboBoxid_empresaBien.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaBienGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				bien.setid_empresa(empresaAux.getId());
				bien.setempresa_descripcion(BienConstantesFunciones.getEmpresaDescripcion(empresaAux));
				bien.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarClienteForeignKey(Bien bien,JComboBox jComboBoxid_clienteBienGenerico)throws Exception
	{
		try
		{
			Cliente  clienteAux=new Cliente();

			if(jComboBoxid_clienteBienGenerico==null) {
				clienteAux=(Cliente)this.jInternalFrameDetalleFormBien.jComboBoxid_clienteBien.getSelectedItem();
			} else {
				clienteAux=(Cliente)jComboBoxid_clienteBienGenerico.getSelectedItem();
			}

			if(clienteAux!=null && clienteAux.getId()!=null) {
				bien.setid_cliente(clienteAux.getId());
				bien.setcliente_descripcion(BienConstantesFunciones.getClienteDescripcion(clienteAux));
				bien.setCliente(clienteAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoBienForeignKey(Bien bien,JComboBox jComboBoxid_tipobienBienGenerico)throws Exception
	{
		try
		{
			TipoBien  tipobienAux=new TipoBien();

			if(jComboBoxid_tipobienBienGenerico==null) {
				tipobienAux=(TipoBien)this.jInternalFrameDetalleFormBien.jComboBoxid_tipobienBien.getSelectedItem();
			} else {
				tipobienAux=(TipoBien)jComboBoxid_tipobienBienGenerico.getSelectedItem();
			}

			if(tipobienAux!=null && tipobienAux.getId()!=null) {
				bien.setid_tipobien(tipobienAux.getId());
				bien.settipobien_descripcion(BienConstantesFunciones.getTipoBienDescripcion(tipobienAux));
				bien.setTipoBien(tipobienAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEmpresasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEmpresa=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!BienJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormBien!=null) { 
							this.jInternalFrameDetalleFormBien.jComboBoxid_empresaBien.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormBien.jComboBoxid_empresaBien.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormBien!=null) { 
					}

					if(!BienJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameClientesForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCliente=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!BienJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormBien!=null) { 
							this.jInternalFrameDetalleFormBien.jComboBoxid_clienteBien.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jInternalFrameDetalleFormBien.jComboBoxid_clienteBien.addItem(cliente);
							}
						}
					}

					if(this.jInternalFrameDetalleFormBien!=null) { 
					}

					if(!BienJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCliente") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!BienJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_clienteFK_IdClienteBien.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jComboBoxid_clienteFK_IdClienteBien.addItem(cliente);
							}
						}

						if(!BienJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoBiensForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoBien=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!BienJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormBien!=null) { 
							this.jInternalFrameDetalleFormBien.jComboBoxid_tipobienBien.removeAllItems();

							for(TipoBien tipobien:this.tipobiensForeignKey) {
								this.jInternalFrameDetalleFormBien.jComboBoxid_tipobienBien.addItem(tipobien);
							}
						}
					}

					if(this.jInternalFrameDetalleFormBien!=null) { 
					}

					if(!BienJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdValorClienteTipoBien") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!BienJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipobienFK_IdValorClienteTipoBienBien.removeAllItems();

							for(TipoBien tipobien:this.tipobiensForeignKey) {
								this.jComboBoxid_tipobienFK_IdValorClienteTipoBienBien.addItem(tipobien);
							}
						}

						if(!BienJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormBien!=null) {
							this.jInternalFrameDetalleFormBien.jComboBoxid_empresaBien.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormBien!=null) {
							this.jInternalFrameDetalleFormBien.jComboBoxid_empresaBien.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameClienteForeignKey(Cliente cliente,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormBien!=null) {
							this.jInternalFrameDetalleFormBien.jComboBoxid_clienteBien.setSelectedItem(cliente);
						}
					} else {
						if(this.jInternalFrameDetalleFormBien!=null) {
							this.jInternalFrameDetalleFormBien.jComboBoxid_clienteBien.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_clienteFK_IdClienteBien.setSelectedItem(cliente);
						} else {
							this.jComboBoxid_clienteFK_IdClienteBien.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoBienForeignKey(TipoBien tipobien,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormBien!=null) {
							this.jInternalFrameDetalleFormBien.jComboBoxid_tipobienBien.setSelectedItem(tipobien);
						}
					} else {
						if(this.jInternalFrameDetalleFormBien!=null) {
							this.jInternalFrameDetalleFormBien.jComboBoxid_tipobienBien.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipobienFK_IdValorClienteTipoBienBien.setSelectedItem(tipobien);
						} else {
							this.jComboBoxid_tipobienFK_IdValorClienteTipoBienBien.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesBien() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			BienConstantesFunciones.refrescarForeignKeysDescripcionesBien(this.bienLogic.getBiens());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			BienConstantesFunciones.refrescarForeignKeysDescripcionesBien(this.biens);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Cliente.class));
		classes.add(new Classe(TipoBien.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//bienLogic.setBiens(this.biens);
			bienLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		*/				
	}	
	
	
	
	public Integer getiNumeroPaginacion() {
		return iNumeroPaginacion;
	}

	public void setiNumeroPaginacion(Integer iNumeroPaginacion) {
		this.iNumeroPaginacion= iNumeroPaginacion;
	}
	
	public Integer getiNumeroPaginacionPagina() {
		return iNumeroPaginacionPagina;
	}

	public void setiNumeroPaginacionPagina(Integer iNumeroPaginacionPagina) {
		this.iNumeroPaginacionPagina= iNumeroPaginacionPagina;
	}
	
	
	public Boolean getIsSeleccionarTodos() {
		return this.isSeleccionarTodos;
	}

	public void setIsSeleccionarTodos(Boolean isSeleccionarTodos) {
		this.isSeleccionarTodos= isSeleccionarTodos;
	}
	
	public Boolean getEsControlTabla() {
		return this.esControlTabla;
	}

	public void setEsControlTabla(Boolean esControlTabla) {
		this.esControlTabla= esControlTabla;
	}
	
	public Boolean getIsSeleccionados() {
		return this.isSeleccionados;
	}

	public void setIsSeleccionados(Boolean isSeleccionados) {
		this.isSeleccionados= isSeleccionados;
	}
	
	public Boolean getIsPostAccionNuevo() {
		return this.isPostAccionNuevo;
	}

	public void setIsPostAccionNuevo(Boolean isPostAccionNuevo) {
		this.isPostAccionNuevo= isPostAccionNuevo;
	}
	
	public Boolean getIsPostAccionSinCerrar() {
		return this.isPostAccionSinCerrar;
	}

	public void setIsPostAccionSinCerrar(Boolean isPostAccionSinCerrar) {
		this.isPostAccionSinCerrar= isPostAccionSinCerrar;
	}
	
	public Boolean getIsPostAccionSinMensaje() {
		return this.isPostAccionSinMensaje;
	}

	public void setIsPostAccionSinMensaje(Boolean isPostAccionSinMensaje) {
		this.isPostAccionSinMensaje= isPostAccionSinMensaje;
	}
	
	public Boolean getConGraficoReporte() {
		return this.conGraficoReporte;
	}

	public void setConGraficoReporte(Boolean conGraficoReporte) {
		this.conGraficoReporte= conGraficoReporte;
	}
	
	
	public ArrayList<Reporte> gettiposArchivosReportes() {
		return this.tiposArchivosReportes;
	}
	
	public void settiposArchivosReportes(ArrayList<Reporte> tiposArchivosReportes) {
		this.tiposArchivosReportes = tiposArchivosReportes;
	}
	
	//TIPOS ARCHIVOS DINAMICOS
	public ArrayList<Reporte> gettiposArchivosReportesDinamico() {
		return this.tiposArchivosReportesDinamico;
	}
	
	public void settiposArchivosReportesDinamico(ArrayList<Reporte> tiposArchivosReportesDinamico) {
		this.tiposArchivosReportesDinamico = tiposArchivosReportesDinamico;
	}
	
	//TIPOS REPORTES
	public ArrayList<Reporte> gettiposReportes() {
		return this.tiposReportes;
	}
	
	public void settiposReportes(ArrayList<Reporte> tiposReportes) {
		this.tiposReportes = tiposReportes;
	}
	
	//TIPOS REPORTES
	public ArrayList<Reporte> gettiposReportesDinamico() {
		return this.tiposReportesDinamico;
	}
	
	public void settiposReportesDinamico(ArrayList<Reporte> tiposReportesDinamico) {
		this.tiposReportesDinamico = tiposReportesDinamico;
	}
	
	//TIPOS GRAFICOS REPORTES
	public ArrayList<Reporte> gettiposGraficosReportes() {
		return this.tiposGraficosReportes;
	}
	
	public void settiposGraficosReportes(ArrayList<Reporte> tiposGraficosReportes) {
		this.tiposGraficosReportes = tiposGraficosReportes;
	}
	
	public ArrayList<Reporte> gettiposPaginacion() {
		return this.tiposPaginacion;
	}
	
	public void settiposPaginacion(ArrayList<Reporte> tiposPaginacion) {
		this.tiposPaginacion = tiposPaginacion;
	}
	
	public ArrayList<Reporte> gettiposRelaciones() {
		return this.tiposRelaciones;
	}
	
	public void settiposRelaciones(ArrayList<Reporte> tiposRelaciones) {
		this.tiposRelaciones= tiposRelaciones;
	}
	
	public ArrayList<Reporte> gettiposAcciones() {
		return this.tiposAcciones;
	}
	
	public void settiposAcciones(ArrayList<Reporte> tiposAcciones) {
		this.tiposAcciones = tiposAcciones;
	}
	
	public ArrayList<Reporte> gettiposAccionesFormulario() {
		return this.tiposAccionesFormulario;
	}
	
	public void settiposAccionesFormulario(ArrayList<Reporte> tiposAccionesFormulario) {
		this.tiposAccionesFormulario = tiposAccionesFormulario;
	}
	
	public ArrayList<Reporte> gettiposSeleccionar() {
		return this.tiposSeleccionar;
	}
	
	public void settiposSeleccionar(ArrayList<Reporte> tiposSeleccionar) {
		this.tiposSeleccionar = tiposSeleccionar;
	}
	
	public ArrayList<Reporte> gettiposColumnasSelect() {
		return this.tiposColumnasSelect;
	}
	
	public void settiposColumnasSelect(ArrayList<Reporte> tiposColumnasSelect) {
		this.tiposColumnasSelect = tiposColumnasSelect;
	}
		
	public ArrayList<Reporte> gettiposRelacionesSelect() {
		return this.tiposRelacionesSelect;
	}
	
	public void settiposRelacionesSelect(ArrayList<Reporte> tiposRelacionesSelect) {
		this.tiposRelacionesSelect = tiposRelacionesSelect;
	}
	
	public Long getIIdUsuarioSesion() {
		return lIdUsuarioSesion;
	}

	public void setIIdUsuarioSesion(Long lIdUsuarioSesion) {
		this.lIdUsuarioSesion = lIdUsuarioSesion;
	}
	
	
	public List<Accion> getAccions() {
		return this.accions;
	}

	public void setAccions(List<Accion> accions) {
		this.accions = accions;
	}
	
	public List<Accion> getAccionsFormulario() {
		return this.accionsFormulario;
	}

	public void setAccionsFormulario(List<Accion> accionsFormulario) {
		this.accionsFormulario = accionsFormulario;
	}
	
	public String getsAccionMantenimiento() {
		return sAccionMantenimiento;
	}

	public void setsAccionMantenimiento(String sAccionMantenimiento) {
		this.sAccionMantenimiento = sAccionMantenimiento;
	}

	public String getsAccionBusqueda() {
		return sAccionBusqueda;
	}

	public void setsAccionBusqueda(String sAccionBusqueda) {
		this.sAccionBusqueda = sAccionBusqueda;
	}

	public String getsAccionAdicional() {
		return sAccionAdicional;
	}

	public void setsAccionAdicional(String sAccionAdicional) {
		this.sAccionAdicional = sAccionAdicional;
	}

	public String getsUltimaBusqueda() {
		return sUltimaBusqueda;
	}

	public void setsUltimaBusqueda(String sUltimaBusqueda) {
		this.sUltimaBusqueda = sUltimaBusqueda;
	}
	
	public String getsTipoArchivoReporte() {
		return sTipoArchivoReporte;
	}

	public void setsTipoArchivoReporte(String sTipoArchivoReporte) {
		this.sTipoArchivoReporte = sTipoArchivoReporte;
	}
	
	public String getsTipoArchivoReporteDinamico() {
		return sTipoArchivoReporteDinamico;
	}

	public void setsTipoArchivoReporteDinamico(String sTipoArchivoReporteDinamico) {
		this.sTipoArchivoReporteDinamico = sTipoArchivoReporteDinamico;
	}
	
	public String getsTipoReporte() {
		return sTipoReporte;
	}

	public void setsTipoReporte(String sTipoReporte) {
		this.sTipoReporte = sTipoReporte;
	}
	
	public String getsTipoReporteDinamico() {
		return sTipoReporteDinamico;
	}

	public void setsTipoReporteDinamico(String sTipoReporteDinamico) {
		this.sTipoReporteDinamico = sTipoReporteDinamico;
	}
	
	public String getsTipoGraficoReporte() {
		return sTipoGraficoReporte;
	}

	public void setsTipoGraficoReporte(String sTipoGraficoReporte) {
		this.sTipoGraficoReporte = sTipoGraficoReporte;
	}
	
	public String getsTipoPaginacion() {
		return sTipoPaginacion;
	}

	public void setsTipoPaginacion(String sTipoPaginacion) {
		this.sTipoPaginacion = sTipoPaginacion;
	}
	
	public String getsTipoRelacion() {
		return sTipoRelacion;
	}

	public void setsTipoRelacion(String sTipoRelacion) {
		this.sTipoRelacion = sTipoRelacion;
	}
	
	public String getsTipoAccion() {
		return sTipoAccion;
	}

	public void setsTipoAccion(String sTipoAccion) {
		this.sTipoAccion = sTipoAccion;
	}
	
	public String getsTipoAccionFormulario() {
		return sTipoAccionFormulario;
	}

	public void setsTipoAccionFormulario(String sTipoAccionFormulario) {
		this.sTipoAccionFormulario = sTipoAccionFormulario;
	}
	
	public String getsTipoSeleccionar() {
		return sTipoSeleccionar;
	}

	public void setsTipoSeleccionar(String sTipoSeleccionar) {
		this.sTipoSeleccionar = sTipoSeleccionar;
	}
	
	public String getsValorCampoGeneral() {
		return sValorCampoGeneral;
	}

	public void setsValorCampoGeneral(String sValorCampoGeneral) {
		this.sValorCampoGeneral = sValorCampoGeneral;
	}			

	public String getsDetalleReporte() {
		return sDetalleReporte;
	}

	public void setsDetalleReporte(String sDetalleReporte) {
		this.sDetalleReporte = sDetalleReporte;
	}
	
	
	public String getsTipoReporteExtra() {
		return sTipoReporteExtra;
	}

	public void setsTipoReporteExtra(String sTipoReporteExtra) {
		this.sTipoReporteExtra = sTipoReporteExtra;
	}
	
	public Boolean getesReporteDinamico() {
		return esReporteDinamico;
	}	
	
	public void setesReporteDinamico(Boolean esReporteDinamico) {
		this.esReporteDinamico = esReporteDinamico;
	}
	
	public Boolean getesRecargarFks() {
		return esRecargarFks;
	}	
	
	public void setesRecargarFks(Boolean esRecargarFks) {
		this.esRecargarFks = esRecargarFks;
	}
	
	public Boolean getesReporteAccionProceso() {
		return esReporteAccionProceso;
	}	
	
	public void setesReporteAccionProceso(Boolean esReporteAccionProceso) {
		this.esReporteAccionProceso= esReporteAccionProceso;
	}
		
	public BienParameterReturnGeneral getBienParameterGeneral() {
		return this.bienParameterGeneral;
	}
	
	public void setBienParameterGeneral(BienParameterReturnGeneral bienParameterGeneral) {
		this.bienParameterGeneral = bienParameterGeneral;
	}
	
	public String getsPathReporteDinamico() {
		return sPathReporteDinamico;
	}

	public void setsPathReporteDinamico(String sPathReporteDinamico) {
		this.sPathReporteDinamico = sPathReporteDinamico;
	}
		
	public Boolean getisMostrarNumeroPaginacion() {
		return isMostrarNumeroPaginacion;
	}

	public void setisMostrarNumeroPaginacion(Boolean isMostrarNumeroPaginacion) {
		this.isMostrarNumeroPaginacion = isMostrarNumeroPaginacion;
	}
	
	public Mensaje getMensaje() {
		return mensaje;
	}

	public void setMensaje(Mensaje mensaje) {
		this.mensaje = mensaje;
	}
	
	public Boolean getIsPermisoTodoBien() {
		return isPermisoTodoBien;
	}

	public void setIsPermisoTodoBien(Boolean isPermisoTodoBien) {
		this.isPermisoTodoBien = isPermisoTodoBien;
	}

	public Boolean getIsPermisoNuevoBien() {
		return isPermisoNuevoBien;
	}

	public void setIsPermisoNuevoBien(Boolean isPermisoNuevoBien) {
		this.isPermisoNuevoBien = isPermisoNuevoBien;
	}

	public Boolean getIsPermisoActualizarBien() {
		return isPermisoActualizarBien;
	}

	public void setIsPermisoActualizarBien(Boolean isPermisoActualizarBien) {
		this.isPermisoActualizarBien = isPermisoActualizarBien;
	}

	public Boolean getIsPermisoEliminarBien() {
		return isPermisoEliminarBien;
	}

	public void setIsPermisoEliminarBien(Boolean isPermisoEliminarBien) {
		this.isPermisoEliminarBien = isPermisoEliminarBien;
	}

	public Boolean getIsPermisoGuardarCambiosBien() {
		return isPermisoGuardarCambiosBien;
	}

	public void setIsPermisoGuardarCambiosBien(Boolean isPermisoGuardarCambiosBien) {
		this.isPermisoGuardarCambiosBien = isPermisoGuardarCambiosBien;
	}
	
	public Boolean getIsPermisoConsultaBien() {
		return isPermisoConsultaBien;
	}

	public void setIsPermisoConsultaBien(Boolean isPermisoConsultaBien) {
		this.isPermisoConsultaBien = isPermisoConsultaBien;
	}

	public Boolean getIsPermisoBusquedaBien() {
		return isPermisoBusquedaBien;
	}

	public void setIsPermisoBusquedaBien(Boolean isPermisoBusquedaBien) {
		this.isPermisoBusquedaBien = isPermisoBusquedaBien;
	}

	public Boolean getIsPermisoReporteBien() {
		return isPermisoReporteBien;
	}

	public void setIsPermisoReporteBien(Boolean isPermisoReporteBien) {
		this.isPermisoReporteBien = isPermisoReporteBien;
	}
	
	public Boolean getIsPermisoPaginacionMedioBien() {
		return isPermisoPaginacionMedioBien;
	}

	public void setIsPermisoPaginacionMedioBien(Boolean isPermisoPaginacionMedioBien) {
		this.isPermisoPaginacionMedioBien = isPermisoPaginacionMedioBien;
	}
	
	public Boolean getIsPermisoPaginacionTodoBien() {
		return isPermisoPaginacionTodoBien;
	}

	public void setIsPermisoPaginacionTodoBien(Boolean isPermisoPaginacionTodoBien) {
		this.isPermisoPaginacionTodoBien = isPermisoPaginacionTodoBien;
	}
	
	public Boolean getIsPermisoPaginacionAltoBien() {
		return isPermisoPaginacionAltoBien;
	}

	public void setIsPermisoPaginacionAltoBien(Boolean isPermisoPaginacionAltoBien) {
		this.isPermisoPaginacionAltoBien = isPermisoPaginacionAltoBien;
	}
	
	public Boolean getIsPermisoCopiarBien() {
		return isPermisoCopiarBien;
	}

	public void setIsPermisoCopiarBien(Boolean isPermisoCopiarBien) {
		this.isPermisoCopiarBien = isPermisoCopiarBien;
	}
	
	public Boolean getIsPermisoVerFormBien() {
		return isPermisoVerFormBien;
	}

	public void setIsPermisoVerFormBien(Boolean isPermisoVerFormBien) {
		this.isPermisoVerFormBien = isPermisoVerFormBien;
	}
	
	public Boolean getIsPermisoDuplicarBien() {
		return isPermisoDuplicarBien;
	}

	public void setIsPermisoDuplicarBien(Boolean isPermisoDuplicarBien) {
		this.isPermisoDuplicarBien = isPermisoDuplicarBien;
	}
	
	public Boolean getIsPermisoOrdenBien() {
		return isPermisoOrdenBien;
	}

	public void setIsPermisoOrdenBien(Boolean isPermisoOrdenBien) {
		this.isPermisoOrdenBien = isPermisoOrdenBien;
	}
	
	public String getsVisibilidadTablaBusquedas() {
		return sVisibilidadTablaBusquedas;
	}

	public void setsVisibilidadTablaBusquedas(String sVisibilidadTablaBusquedas) {
		this.sVisibilidadTablaBusquedas = sVisibilidadTablaBusquedas;
	}
	
	public String getsVisibilidadTablaElementos() {
		return sVisibilidadTablaElementos;
	}

	public void setsVisibilidadTablaElementos(String sVisibilidadTablaElementos) {
		this.sVisibilidadTablaElementos = sVisibilidadTablaElementos;
	}

	public String getsVisibilidadTablaAcciones() {
		return sVisibilidadTablaAcciones;
	}

	public void setsVisibilidadTablaAcciones(String sVisibilidadTablaAcciones) {
		this.sVisibilidadTablaAcciones = sVisibilidadTablaAcciones;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoBien() {
		return isVisibilidadCeldaNuevoBien;
	}

	public void setIsVisibilidadCeldaNuevoBien(Boolean isVisibilidadCeldaNuevoBien) {
		this.isVisibilidadCeldaNuevoBien = isVisibilidadCeldaNuevoBien;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarBien() {
		return isVisibilidadCeldaDuplicarBien;
	}

	public void setIsVisibilidadCeldaDuplicarBien(Boolean isVisibilidadCeldaDuplicarBien) {
		this.isVisibilidadCeldaDuplicarBien = isVisibilidadCeldaDuplicarBien;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarBien() {
		return isVisibilidadCeldaCopiarBien;
	}

	public void setIsVisibilidadCeldaCopiarBien(Boolean isVisibilidadCeldaCopiarBien) {
		this.isVisibilidadCeldaCopiarBien = isVisibilidadCeldaCopiarBien;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormBien() {
		return isVisibilidadCeldaVerFormBien;
	}

	public void setIsVisibilidadCeldaVerFormBien(Boolean isVisibilidadCeldaVerFormBien) {
		this.isVisibilidadCeldaVerFormBien = isVisibilidadCeldaVerFormBien;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenBien() {
		return isVisibilidadCeldaOrdenBien;
	}

	public void setIsVisibilidadCeldaOrdenBien(Boolean isVisibilidadCeldaOrdenBien) {
		this.isVisibilidadCeldaOrdenBien = isVisibilidadCeldaOrdenBien;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesBien() {
		return isVisibilidadCeldaNuevoRelacionesBien;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesBien(Boolean isVisibilidadCeldaNuevoRelacionesBien) {
		this.isVisibilidadCeldaNuevoRelacionesBien = isVisibilidadCeldaNuevoRelacionesBien;
	}
	
	public Boolean getIsVisibilidadCeldaModificarBien() {
		return isVisibilidadCeldaModificarBien;
	}

	public void setIsVisibilidadCeldaModificarBien(Boolean isVisibilidadCeldaModificarBien) {
		this.isVisibilidadCeldaModificarBien = isVisibilidadCeldaModificarBien;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarBien() {
		return isVisibilidadCeldaActualizarBien;
	}

	public void setIsVisibilidadCeldaActualizarBien(Boolean isVisibilidadCeldaActualizarBien) {
		this.isVisibilidadCeldaActualizarBien = isVisibilidadCeldaActualizarBien;
	}

	public Boolean getIsVisibilidadCeldaEliminarBien() {
		return isVisibilidadCeldaEliminarBien;
	}

	public void setIsVisibilidadCeldaEliminarBien(Boolean isVisibilidadCeldaEliminarBien) {
		this.isVisibilidadCeldaEliminarBien = isVisibilidadCeldaEliminarBien;
	}

	public Boolean getIsVisibilidadCeldaCancelarBien() {
		return isVisibilidadCeldaCancelarBien;
	}

	public void setIsVisibilidadCeldaCancelarBien(Boolean isVisibilidadCeldaCancelarBien) {
		this.isVisibilidadCeldaCancelarBien = isVisibilidadCeldaCancelarBien;
	}

	public Boolean getIsVisibilidadCeldaGuardarBien() {
		return isVisibilidadCeldaGuardarBien;
	}

	public void setIsVisibilidadCeldaGuardarBien(Boolean isVisibilidadCeldaGuardarBien) {
		this.isVisibilidadCeldaGuardarBien = isVisibilidadCeldaGuardarBien;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosBien() {
		return isVisibilidadCeldaGuardarCambiosBien;
	}

	public void setIsVisibilidadCeldaGuardarCambiosBien(Boolean isVisibilidadCeldaGuardarCambiosBien) {
		this.isVisibilidadCeldaGuardarCambiosBien = isVisibilidadCeldaGuardarCambiosBien;
	}
		
	public BienSessionBean getbienSessionBean() {
		return this.bienSessionBean;
	}
	
	public void setbienSessionBean(BienSessionBean bienSessionBean) {
		this.bienSessionBean=bienSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdCliente() {
		return this.isVisibilidadFK_IdCliente;
	}

	public void setisVisibilidadFK_IdCliente(Boolean isVisibilidadFK_IdCliente) {
		this.isVisibilidadFK_IdCliente=isVisibilidadFK_IdCliente;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdValorClienteTipoBien() {
		return this.isVisibilidadFK_IdValorClienteTipoBien;
	}

	public void setisVisibilidadFK_IdValorClienteTipoBien(Boolean isVisibilidadFK_IdValorClienteTipoBien) {
		this.isVisibilidadFK_IdValorClienteTipoBien=isVisibilidadFK_IdValorClienteTipoBien;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysBien(Bien bien)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(bien,null);
				this.setActualParaGuardarClienteForeignKey(bien,null);
				this.setActualParaGuardarTipoBienForeignKey(bien,null);
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarLicenciaCliente(DatosCliente datosCliente) throws Exception {
		Boolean existe=false;
			
		try {
				InputStream reportFile=null;
				
				String sPath=this.parametroGeneralUsuario.getpath_exportar()+"erp_bydan/license/license.xml";
				
				reportFile = new FileInputStream(sPath);
				
				Document documentBuilder=null;
				
				if(this.constantes2.DOCUMENT_BUILDER==null) {
					documentBuilder=Funciones2.parseXml(reportFile);
				} else {
					documentBuilder=this.constantes2.DOCUMENT_BUILDER;
				}
				
				//GlobalSeguridad.readXml(documentBuilder);
				
				String sNamePCServerLicencia="";
				String sClaveSistemaLicencia="";
				Date dFechaServerLicencia=null;
				
				//CARGAR ELEMENTOS DE LICENCIA
				NodeList nodeList = documentBuilder.getElementsByTagName("Licencia");
				
				for (int iIndice = 0; iIndice < nodeList.getLength(); iIndice++) {
					Node node = nodeList.item(iIndice);
				
					if (node.getNodeType() == Node.ELEMENT_NODE) {
						Element element = (Element) node;
						 
						sNamePCServerLicencia=element.getElementsByTagName("NombrePc").item(0).getTextContent();
						sClaveSistemaLicencia=element.getElementsByTagName("ClaveSistema").item(0).getTextContent();
						
						existe=true;
						break;
					}
				}														
			
				
			if(existe) {
				datosCliente.setsClaveSistema(sClaveSistemaLicencia);
				
				if(!datosCliente.getsNamePCServer().equals(sNamePCServerLicencia)
					&& !datosCliente.getsNamePCServer().equals("")) {
					
					datosCliente.setsNamePCServer(sNamePCServerLicencia);
				}
			} else {
				throw new Exception("NO EXISTE LICENCIA O NO ESTA BIEN FORMADO");
			}
		} catch(Exception e) {
			throw new Exception("NO EXISTE LICENCIA O NO ESTA BIEN FORMADO");
		}						
	}
	
	public void cargarDatosCliente() throws Exception {
		String sPrimerMacAddress="";		
		String sHostName="";		 
		String sHostIp="";		  
		String sHostUser="";
		
		
		sPrimerMacAddress=FuncionesNetwork.getPrimerMacAddress();		
		sHostName=FuncionesNetwork.getHostName();		 
		sHostIp=FuncionesNetwork.getHostIp();		  
		sHostUser=FuncionesNetwork.getHostUser();
		
		
		this.datosCliente=new DatosCliente();
		if(lIdUsuarioSesion!=null){datosCliente.setIdUsuario(this.lIdUsuarioSesion);}
		
		//SERVIDOR WEB Y TALVEZ SERVIDOR SWING WINDOWS
		this.datosCliente.setsUsuarioPCServer(sHostUser);
		this.datosCliente.setsNamePCServer(sHostName);
		this.datosCliente.setsIPPCServer(sHostIp);
		this.datosCliente.setsMacAddressPCServer(sPrimerMacAddress);
			
			//CLIENTE SWING WINDOWS
			this.datosCliente.setIsClienteWeb(false);
			
			this.datosCliente.setsUsuarioPC(sHostUser);
			this.datosCliente.setsNamePC(sHostName);
			this.datosCliente.setsIPPC(sHostIp);
			this.datosCliente.setsMacAddressPC(sPrimerMacAddress);	
			
			
			//this.cargarLicenciaCliente(this.datosCliente);
			
	}
	
	public void bugActualizarReferenciaActual(Bien bien,Bien bienAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalBien(bien);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		bienAux.setId(bien.getId());
		bienAux.setVersionRow(bien.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessBien();
		
			int intSelectedRow = this.jTableDatosBien.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bien =(Bien) this.bienLogic.getBiens().toArray()[this.jTableDatosBien.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.bien =(Bien) this.biens.toArray()[this.jTableDatosBien.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(BienJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualBien(this.bien,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysBien(this.bien);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = bienValidator.getInvalidValues(this.bien);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			bienLogic.setDatosCliente(datosCliente);
			bienLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				bienAux=new  Bien();
				
				bienAux.setIsNew(true);
				bienAux.setIsChanged(true);
				
				bienAux.setBienOriginal(this.bien);
				
				bienAux.setId(this.bien.getId());	
				bienAux.setVersionRow(this.bien.getVersionRow());	
				bienAux.setid_empresa(this.bien.getid_empresa());	
				bienAux.setid_cliente(this.bien.getid_cliente());	
				bienAux.setid_tipobien(this.bien.getid_tipobien());	
				bienAux.setnumero(this.bien.getnumero());	
				bienAux.setdescripcion(this.bien.getdescripcion());	
				bienAux.setvalor_avaluo(this.bien.getvalor_avaluo());	
				bienAux.setdireccion(this.bien.getdireccion());	
				bienAux.setes_activo(this.bien.getes_activo());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.bienSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.bienSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(bienAux,bienLogic.getBiens());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(bienAux,biens);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.bienSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.bienSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						bienLogic.saveBiens();//WithConnection
						//bienLogic.getSetVersionRowBiens();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.bien,bienAux);
					
					this.refrescarForeignKeysDescripcionesBien();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.bienSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.bienSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								bienLogic.saveBienRelaciones(bienAux);//WithConnection
								//bienLogic.getSetVersionRowBiens();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.bien,bienAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.bienSessionBean.getEstaModoGuardarRelaciones() 
									|| this.bienSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(bienAux,bienLogic.getBiens());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(bienAux,biens);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.bien,bienAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				bienAux=new  Bien();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.bienSessionBean.getEsGuardarRelacionado() 
					|| (this.bienSessionBean.getEsGuardarRelacionado() && this.bien.getId()>=0)) {
						
					bienAux.setIsNew(false);
				}
				
				bienAux.setIsDeleted(false);
			
				bienAux.setId(this.bien.getId());	
				bienAux.setVersionRow(this.bien.getVersionRow());	
				bienAux.setid_empresa(this.bien.getid_empresa());	
				bienAux.setid_cliente(this.bien.getid_cliente());	
				bienAux.setid_tipobien(this.bien.getid_tipobien());	
				bienAux.setnumero(this.bien.getnumero());	
				bienAux.setdescripcion(this.bien.getdescripcion());	
				bienAux.setvalor_avaluo(this.bien.getvalor_avaluo());	
				bienAux.setdireccion(this.bien.getdireccion());	
				bienAux.setes_activo(this.bien.getes_activo());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(bienAux,bienLogic.getBiens());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(bienAux,biens);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.bienSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.bienSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						bienLogic.saveBiens();//WithConnection
						//bienLogic.getSetVersionRowBiens();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.bien,bienAux);
					
					this.refrescarForeignKeysDescripcionesBien();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.bienSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.bienSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								bienLogic.saveBienRelaciones(bienAux);//WithConnection
								//bienLogic.getSetVersionRowBiens();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.bien,bienAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.bienSessionBean.getEstaModoGuardarRelaciones() 
									|| this.bienSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(bienAux,bienLogic.getBiens());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(bienAux,biens);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.bien,bienAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				bienAux=new  Bien();
				
				bienAux.setIsNew(false);
				bienAux.setIsChanged(false);
				
				bienAux.setIsDeleted(true);
				
				bienAux.setId(this.bien.getId());	
				bienAux.setVersionRow(this.bien.getVersionRow());	
				bienAux.setid_empresa(this.bien.getid_empresa());	
				bienAux.setid_cliente(this.bien.getid_cliente());	
				bienAux.setid_tipobien(this.bien.getid_tipobien());	
				bienAux.setnumero(this.bien.getnumero());	
				bienAux.setdescripcion(this.bien.getdescripcion());	
				bienAux.setvalor_avaluo(this.bien.getvalor_avaluo());	
				bienAux.setdireccion(this.bien.getdireccion());	
				bienAux.setes_activo(this.bien.getes_activo());	
				
				if(this.bienSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.bienAux.getId()>=0) {	
						this.biensEliminados.add(bienAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(bienAux,bienLogic.getBiens());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(bienAux,biens);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.bienSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.bienSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						bienLogic.saveBiens();//WithConnection
						//bienLogic.getSetVersionRowBiens();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.bienSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.bienSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								bienLogic.saveBienRelaciones(bienAux);//WithConnection
								//bienLogic.getSetVersionRowBiens();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						}
					}  else {
							
						
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.bienSessionBean.getEstaModoGuardarRelaciones() 
								|| this.bienSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(bienAux,bienLogic.getBiens());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(bienAux,biens);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bienLogic.getBiens().addAll(this.biensEliminados);
					
					bienLogic.saveBiens();//WithConnection
					//bienLogic.getSetVersionRowBiens();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesBien();
				
				this.biensEliminados= new ArrayList<Bien>();		
			}
			
			if(this.bienSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.bienSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Bien GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Bien",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.bien=bienAux;
					}
				}
			}
			
			this.isErrorGuardar=false;
			
			this.inicializarInvalidValues();
		/*
		} else {
			this.mostrarInvalidValues();	
		}
		*/
			
		} catch(Exception e) {
			this.isErrorGuardar=true;
			
			this.crearFilaTotales();
			
			throw e;
		} finally {
      		//this.finishProcessBien();
      	}
		
	}	
	
	public void actualizarRelaciones(Bien bienLocal) throws Exception {
		
		if(this.bienSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Bien bienLocal) throws Exception {	
		if(this.bienSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				bienLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ClienteDetalleFormJInternalFrame.class)) {
				ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrameLocal=(ClienteBeanSwingJInternalFrame) ((ClienteDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				clienteBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCliente(clienteBeanSwingJInternalFrameLocal.getcliente(),true);
				clienteBeanSwingJInternalFrameLocal.actualizarLista(clienteBeanSwingJInternalFrameLocal.cliente,this.clientesForeignKey);

				clienteBeanSwingJInternalFrameLocal.actualizarRelaciones(clienteBeanSwingJInternalFrameLocal.cliente);

				bienLocal.setCliente(clienteBeanSwingJInternalFrameLocal.cliente);

				this.addItemDefectoCombosForeignKeyCliente();
				this.cargarCombosFrameClientesForeignKey("Formulario");
				this.setActualClienteForeignKey(clienteBeanSwingJInternalFrameLocal.cliente.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoBienDetalleFormJInternalFrame.class)) {
				TipoBienBeanSwingJInternalFrame tipobienBeanSwingJInternalFrameLocal=(TipoBienBeanSwingJInternalFrame) ((TipoBienDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipobienBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoBien(tipobienBeanSwingJInternalFrameLocal.gettipobien(),true);
				tipobienBeanSwingJInternalFrameLocal.actualizarLista(tipobienBeanSwingJInternalFrameLocal.tipobien,this.tipobiensForeignKey);

				tipobienBeanSwingJInternalFrameLocal.actualizarRelaciones(tipobienBeanSwingJInternalFrameLocal.tipobien);

				bienLocal.setTipoBien(tipobienBeanSwingJInternalFrameLocal.tipobien);

				this.addItemDefectoCombosForeignKeyTipoBien();
				this.cargarCombosFrameTipoBiensForeignKey("Formulario");
				this.setActualTipoBienForeignKey(tipobienBeanSwingJInternalFrameLocal.tipobien.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarBienActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosBien.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.bien =(Bien) this.bienLogic.getBiens().toArray()[this.jTableDatosBien.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.bien =(Bien) this.biens.toArray()[this.jTableDatosBien.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = bienValidator.getInvalidValues(this.bien);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Bien bien,List<Bien> biens) throws Exception {
		try	{		
			BienConstantesFunciones.actualizarLista(bien,biens,this.bienSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Bien bien,List<Bien> biens) throws Exception {
		try	{			
			BienConstantesFunciones.actualizarSelectedLista(bien,biens);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Bien> biensLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				biensLocal=this.bienLogic.getBiens();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				biensLocal=this.biens;
			}
			//ARCHITECTURE
		
			for(Bien bienLocal:biensLocal) {
				if(this.permiteMantenimiento(bienLocal) && bienLocal.getIsSelected()) {
					tiene=true;
					break;
				}
			}
		} catch(Exception e) {
			throw e;
		}
		
		return tiene;
	}			
	
	public void mostrarInvalidValues() throws Exception {
		String sMensaje="";
				
		for (InvalidValue invalidValue : this.invalidValues) {
			sMensaje+="\r\n"+BienConstantesFunciones.getBienLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(BienConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBien.jLabelid_empresaBien,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(BienConstantesFunciones.IDCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBien.jLabelid_clienteBien,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(BienConstantesFunciones.IDTIPOBIEN)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBien.jLabelid_tipobienBien,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(BienConstantesFunciones.NUMERO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBien.jLabelnumeroBien,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(BienConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBien.jLabeldescripcionBien,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(BienConstantesFunciones.VALORAVALUO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBien.jLabelvalor_avaluoBien,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(BienConstantesFunciones.DIRECCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBien.jLabeldireccionBien,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(BienConstantesFunciones.ESACTIVO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBien.jLabeles_activoBien,invalidValue.getMessage());}
        }
		
		
		if(!sMensaje.equals("")) {
			//JOptionPane.showMessageDialog(this,sMensaje,"VALIDACION ",JOptionPane.ERROR_MESSAGE);
			throw new Exception(sMensaje);			
		}
		
		/*
		System.out.println(invalidValue);
        System.out.println("message=" + invalidValue.getMessage());
        System.out.println("propertyName=" + invalidValue.getPropertyName());
        System.out.println("propertyPath=" + invalidValue.getPropertyPath());
        System.out.println("value=" + invalidValue.getValue());
        */
	}		
	
	public void inicializarInvalidValues() throws Exception {
		String sMensaje="";	
		
		if(this.jInternalFrameDetalleFormBien!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormBien.jLabelid_empresaBien,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormBien.jLabelid_clienteBien,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormBien.jLabelid_tipobienBien,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormBien.jLabelnumeroBien,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormBien.jLabeldescripcionBien,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormBien.jLabelvalor_avaluoBien,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormBien.jLabeldireccionBien,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormBien.jLabeles_activoBien,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoBien--;	
		
		
		this.bienAux=new Bien();
		
		this.bienAux.setId(this.iIdNuevoBien);
		this.bienAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.bienLogic.getBiens().add(this.bienAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.biens.add(this.bienAux);
		}
		//ARCHITECTURE
		
		this.bien=this.bienAux;
		
		if(BienJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioBien(this.bien);
			this.setVariablesObjetoActualToFormularioForeignKeyBien(this.bien);
		}
				
		//this.setDefaultControlesBien();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyBien();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyBien();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyBien();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualBien(this.bienBean,this.bien,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysBien(this.bien);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(BienConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.bienSessionBean.getConGuardarRelaciones()) {
			classes=BienConstantesFunciones.getClassesRelationshipsOfBien(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.bienReturnGeneral=bienLogic.procesarEventosBiensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.bienLogic.getBiens(),this.bien,this.bienParameterGeneral,this.isEsNuevoBien,classes);//this.bienLogic.getBien()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanBien(this.bienReturnGeneral,this.bienBean,false);
		
		if(this.bienReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyBien(this.bienReturnGeneral.getBien());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioBien(this.bienReturnGeneral.getBien());
		}
		
		if(this.bienReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioBien(this.bienReturnGeneral.getBien(),classes);//this.bienBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualBien(this.bien,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyBien();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyBien();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			BienBeanSwingJInternalFrameAdditional.RecargarFormBien(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingBien(false);
						
			if(bienSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(BienJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualBien();
			}
			
			this.actualizarVisualTableDatosBien();
			
			this.jTableDatosBien.setRowSelectionInterval(this.getIndiceNuevoBien(), this.getIndiceNuevoBien());
			
			this.seleccionarFilaTablaBienActual();
						
			this.actualizarEstadoCeldasBotonesBien("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesBien(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormBien.jTextFieldnumeroBien.setEnabled(isHabilitar && this.bienConstantesFunciones.activarnumeroBien);
		this.jInternalFrameDetalleFormBien.jTextAreadescripcionBien.setEnabled(isHabilitar && this.bienConstantesFunciones.activardescripcionBien);
		this.jInternalFrameDetalleFormBien.jTextFieldvalor_avaluoBien.setEnabled(isHabilitar && this.bienConstantesFunciones.activarvalor_avaluoBien);
		this.jInternalFrameDetalleFormBien.jTextAreadireccionBien.setEnabled(isHabilitar && this.bienConstantesFunciones.activardireccionBien);
		this.jInternalFrameDetalleFormBien.jCheckBoxes_activoBien.setEnabled(isHabilitar && this.bienConstantesFunciones.activares_activoBien);	
		//
		this.jInternalFrameDetalleFormBien.jComboBoxid_empresaBien.setEnabled(isHabilitar && this.bienConstantesFunciones.activarid_empresaBien);
		this.jInternalFrameDetalleFormBien.jComboBoxid_clienteBien.setEnabled(isHabilitar && this.bienConstantesFunciones.activarid_clienteBien);
		this.jInternalFrameDetalleFormBien.jComboBoxid_tipobienBien.setEnabled(isHabilitar && this.bienConstantesFunciones.activarid_tipobienBien);
	};
	
	public void setDefaultControlesBien() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoBien(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.bienSessionBean.setConGuardarRelaciones(true);			
			this.bienSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormBien.jTabbedPaneRelacionesBien.setVisible(true);
			
					
		} else {
			//this.bienSessionBean.setConGuardarRelaciones(false);			
			this.bienSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormBien.jTabbedPaneRelacionesBien.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoBien() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Bien bienAux:this.bienLogic.getBiens()) {
				if(bienAux.getId().equals(this.iIdNuevoBien)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Bien bienAux:this.biens) {
				if(bienAux.getId().equals(this.iIdNuevoBien)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
			iIndice=iIndice-1;
		}
		
		return iIndice;
	}
	
	public int getIndiceActualBien(Bien bien,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Bien bienAux:this.bienLogic.getBiens()) {
				if(bienAux.getId().equals(bien.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Bien bienAux:this.biens) {
				if(bienAux.getId().equals(bien.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
			iIndice=iIndiceActual;
		}
		
		return iIndice;
	}
	
	public void setCamposBaseDesdeOriginalBien(Bien bienOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Bien bienAux:this.bienLogic.getBiens()) {
				if(bienAux.getBienOriginal().getId().equals(bienOriginal.getId())) {
					existe=true;
					bienOriginal.setId(bienAux.getId());
					bienOriginal.setVersionRow(bienAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Bien bienAux:this.biens) {
				if(bienAux.getBienOriginal().getId().equals(bienOriginal.getId())) {
					existe=true;
					bienOriginal.setId(bienAux.getId());
					bienOriginal.setVersionRow(bienAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosBien(Boolean esParaCancelar) throws Exception {
		biensAux=new ArrayList<Bien>();
		bienAux=new Bien();
		
		if(!this.bienSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Bien bienAux:this.bienLogic.getBiens()) {
					if(bienAux.getId()<0) {
						biensAux.add(bienAux);
					}		
				}
				this.iIdNuevoBien=0L;
				this.bienLogic.getBiens().removeAll(biensAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Bien bienAux:this.biens) {
					if(bienAux.getId()<0) {
						biensAux.add(bienAux);
					}		
				}
				this.iIdNuevoBien=0L;
				this.biens.removeAll(biensAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoBien 
					&& this.bienLogic.getBiens().size()>0
					) {
					bienAux=this.bienLogic.getBiens().get(this.bienLogic.getBiens().size() - 1);
				
					if(bienAux.getId()<0) {
						this.bienLogic.getBiens().remove(bienAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoBien && this.biens.size()>0) {
					bienAux=this.biens.get(this.biens.size() - 1);
				
					if(bienAux.getId()<0) {
						this.biens.remove(bienAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoBien(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(bien.getId()<0) {
				this.bienLogic.getBiens().remove(this.bien);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(bien.getId()<0) {
				this.biens.remove(this.bien);
			}
		}			
	}
	
	public void setEstadosInicialesBien(List<Bien> biensAux) throws Exception {
		BienConstantesFunciones.setEstadosInicialesBien(biensAux);
	}
	
	public void setEstadosInicialesBien(Bien bienAux) throws Exception {
		BienConstantesFunciones.setEstadosInicialesBien(bienAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarBienActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesBien("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,BienConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarBienActual()) {
				if(!this.isEsNuevoBien) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesBien("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoBien=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,BienConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarBienActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Bien ?", "MANTENIMIENTO DE Bien", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesBien("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,BienConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BienConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Bien bien) throws Exception {
		BienConstantesFunciones.seleccionarAsignar(this.bien,bien);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarBien=this.isPermisoActualizarOriginalBien;
			
			
			this.seleccionarAsignar(bien);
			
			

			idClienteActual=bien.getid_cliente();
			this.seleccionarClienteActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			BienConstantesFunciones.quitarEspaciosBien(this.bien,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesBien("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BienConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.bienSessionBean.setsFuncionBusquedaRapida(this.bienSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BienConstantesFunciones.CLASSNAME);
		}
	}
	
	
	//BUSQUEDA INTERNA FK
	public void seleccionarClienteActual() throws Exception {
		try	{
			Cliente clienteAux=new Cliente();

			if(this.idClienteActual != null && this.idClienteActual>0) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					clienteLogic.getEntityWithConnection(this.idClienteActual);
					clienteAux= clienteLogic.getCliente();
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE

				clientesForeignKey=new ArrayList<Cliente>();
				clientesForeignKey.add(clienteAux);
			}

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoBien) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosBien(esParaCancelar);				
				this.cancelarNuevoBien(esParaCancelar);								
			}
			
			this.bien=new Bien();
			
			this.inicializarBien();
			
			this.actualizarEstadoCeldasBotonesBien("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BienConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarBien() throws Exception {
		try {
			BienConstantesFunciones.inicializarBien(this.bien);
			
			} catch(Exception e) {
			throw e;
		}
	}
	
	public void anteriores()throws Exception {
		try	{
			//this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina-this.iNumeroPaginacion;
			
			if(this.iNumeroPaginacionPagina-this.iNumeroPaginacion<this.iNumeroPaginacion) {
				this.iNumeroPaginacionPagina=0;		
			} else {
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina-this.iNumeroPaginacion;
			}
			
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BienConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.bienLogic.getBiens().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BienConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteBiens(String sAccionBusqueda,List<Bien> biensParaReportes) throws Exception {
		//HttpSession httpSession = httpServletRequest.getSession();
		Long iIdUsuarioSesion=0L;	
		
		
		if(usuarioActual==null) {
			this.usuarioActual=new Usuario();
		}
		
		iIdUsuarioSesion=usuarioActual.getId();
		
		String sPathReportes="";
		
		InputStream reportFile=null;
		InputStream imageFile=null;
			
		imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		String sPathReporteFinal="";
		
		if(!esReporteAccionProceso) {
			if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
				if(!this.esReporteDinamico) {
					sPathReporteFinal="Bien"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="BienMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("BienMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Bien"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
		}
		
		if(reportFile==null) {
			throw new JRRuntimeException(sPathReporteFinal+" no existe");
		}
		
		String sUsuario="";
		
		if(usuarioActual!=null) {
			sUsuario=usuarioActual.getuser_name();
		}
		
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("usuario", sUsuario);
		
		parameters.put("titulo", Funciones.GetTituloSistemaReporte(this.parametroGeneralSg,this.moduloActual,this.usuarioActual));
		parameters.put("subtitulo", "Reporte De  Bienes");		
		parameters.put("busquedapor", BienConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceBien=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			BienConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			BienConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceBien=new JRBeanArrayDataSource(BienJInternalFrame.TraerBienBeans(biensParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceBien);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+BienConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+BienConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(BienBean.TraerBienBeans(biensParaReportes).toArray()));
							
			if(this.sTipoArchivoReporte=="HTML") {
				sDestFileName+=".html";
				JasperExportManager.exportReportToHtmlFile(jasperPrint,sDestFileName);
					
			} else if(this.sTipoArchivoReporte=="PDF") {
				sDestFileName+=".pdf";
				JasperExportManager.exportReportToPdfFile(jasperPrint,sDestFileName);
			} else {
				sDestFileName+=".xml";
				JasperExportManager.exportReportToXmlFile(jasperPrint,sDestFileName, false);
			}	
			
		} else if(this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {
				
			if(this.sTipoArchivoReporte=="WORD") {
				sDestFileName+=".rtf";
					
				JRRtfExporter exporter = new JRRtfExporter();
		
				exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
				exporter.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, sDestFileName);
		
				exporter.exportReport();
				
			} else	{
				sDestFileName+=".xls";
					
				JRXlsExporter exporterXls = new JRXlsExporter();
		
				exporterXls.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
				exporterXls.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, sDestFileName);
				exporterXls.setParameter(JRXlsExporterParameter.IS_ONE_PAGE_PER_SHEET, Boolean.TRUE);
		
				exporterXls.exportReport();
			}
			
		} else if(this.sTipoArchivoReporte=="EXCEL2"||this.sTipoArchivoReporte=="EXCEL2_2") {
			//sDestFileName+=".xlsx";
			
			if(this.sTipoReporte.equals("NORMAL")) {
				this.generarExcelReporteBiens(sAccionBusqueda,sTipoArchivoReporte,biensParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalBiens(sAccionBusqueda,sTipoArchivoReporte,biensParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoBienActionPerformed(null);
					//this.generarExcelReporteBiens(sAccionBusqueda,sTipoArchivoReporte,biensParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalBiens(sAccionBusqueda,sTipoArchivoReporte,biensParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesBiens(sAccionBusqueda,sTipoArchivoReporte,biensParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesBiens(sAccionBusqueda,sTipoArchivoReporte,biensParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteBiens(String sAccionBusqueda,String sTipoArchivoReporte,List<Bien> biensParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"bien";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Biens");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderBien("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Bien bien : biensParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			BienConstantesFunciones.generarExcelReporteDataBien("NORMAL",row,workbook,bien,cellStyleDataAux);
		
			
			/*
            Cell cell0 = row.createCell(0);
            cell0.setCellValue(country.getName());
            Cell cell1 = row.createCell(1);
            cell1.setCellValue(country.getShortCode());
			*/
			
			i++;
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.bienSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Bien",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderBien(String sTipo,Row row,Workbook workbook) {
		
		BienConstantesFunciones.generarExcelReporteHeaderBien(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalBiens(String sAccionBusqueda,String sTipoArchivoReporte,List<Bien> biensParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"bien_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Biens");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Bien bien : biensParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(BienConstantesFunciones.getBienDescripcion(bien));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BienConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BienConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(bien.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BienConstantesFunciones.LABEL_IDCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BienConstantesFunciones.LABEL_IDCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(bien.getcliente_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BienConstantesFunciones.LABEL_IDTIPOBIEN))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BienConstantesFunciones.LABEL_IDTIPOBIEN);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(bien.gettipobien_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BienConstantesFunciones.LABEL_NUMERO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BienConstantesFunciones.LABEL_NUMERO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(bien.getnumero());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BienConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BienConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(bien.getdescripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BienConstantesFunciones.LABEL_VALORAVALUO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BienConstantesFunciones.LABEL_VALORAVALUO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(bien.getvalor_avaluo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BienConstantesFunciones.LABEL_DIRECCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BienConstantesFunciones.LABEL_DIRECCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(bien.getdireccion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BienConstantesFunciones.LABEL_ESACTIVO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BienConstantesFunciones.LABEL_ESACTIVO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(bien.getes_activo()));


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.bienSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Bien",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesBiens(String sAccionBusqueda,String sTipoArchivoReporte,List<Bien> biensParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Bien> biensRespaldo=null;
		
		classes=BienConstantesFunciones.getClassesRelationshipsOfBien(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.bienLogic.setDatosCliente(this.datosCliente);
		this.bienLogic.setDatosDeep(this.datosDeep);
		this.bienLogic.setIsConDeep(true);
		
		biensRespaldo=this.bienLogic.getBiens();
		
		this.bienLogic.setBiens(biensParaReportes);	
		this.bienLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		biensParaReportes=this.bienLogic.getBiens();
		this.bienLogic.setBiens(biensRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"bien_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Biens");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderBien("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Bien bien : biensParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderBien("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			BienConstantesFunciones.generarExcelReporteDataBien("NORMAL",row,workbook,bien,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(BienConstantesFunciones.getBienDescripcion(bien));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.bienSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Bien",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoBien.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoBien.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public Boolean existeRelacionReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoBien.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoBien.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessBien() throws Exception {		
		this.startProcessBien(true);
	}
	
	public void startProcessBien(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasBien ,this.jPanelParametrosReportesBien, this.jScrollPanelDatosBien,this.jPanelPaginacionBien, this.jScrollPanelDatosEdicionBien, this.jPanelAccionesBien,this.jPanelAccionesFormularioBien,this.jmenuBarBien,this.jmenuBarDetalleBien,this.jTtoolBarBien,this.jTtoolBarDetalleBien);		
		
		final JTabbedPane jTabbedPaneBusquedasBien=this.jTabbedPaneBusquedasBien; 
		
		final JPanel jPanelParametrosReportesBien=this.jPanelParametrosReportesBien;
		//final JScrollPane jScrollPanelDatosBien=this.jScrollPanelDatosBien;
		final JTable jTableDatosBien=this.jTableDatosBien;		
		final JPanel jPanelPaginacionBien=this.jPanelPaginacionBien;
		//final JScrollPane jScrollPanelDatosEdicionBien=this.jScrollPanelDatosEdicionBien;
		final JPanel jPanelAccionesBien=this.jPanelAccionesBien;
		
		JPanel jPanelCamposAuxiliarBien=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarBien=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormBien!=null) {
			jPanelCamposAuxiliarBien=this.jInternalFrameDetalleFormBien.jPanelCamposBien;
			jPanelAccionesFormularioAuxiliarBien=this.jInternalFrameDetalleFormBien.jPanelAccionesFormularioBien;
		}
		
		final JPanel jPanelCamposBien=jPanelCamposAuxiliarBien;
		final JPanel jPanelAccionesFormularioBien=jPanelAccionesFormularioAuxiliarBien;
		
		
		final JMenuBar jmenuBarBien=this.jmenuBarBien;
		final JToolBar jTtoolBarBien=this.jTtoolBarBien;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarBien=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarBien=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormBien!=null) {
			jmenuBarDetalleAuxiliarBien=this.jInternalFrameDetalleFormBien.jmenuBarDetalleBien;
			jTtoolBarDetalleAuxiliarBien=this.jInternalFrameDetalleFormBien.jTtoolBarDetalleBien;
		}
		
		final JMenuBar jmenuBarDetalleBien=jmenuBarDetalleAuxiliarBien;
		final JToolBar jTtoolBarDetalleBien=jTtoolBarDetalleAuxiliarBien;		
		
		
		
		
		
		if(Constantes2.CON_PROCESO_HILO) {
			Thread threadRunnableProcess;
			ProcessRunnable processRunnable;
			
			processRunnable=new ProcessRunnable();
			
			processRunnable.setsTipo("START");
			processRunnable.setDesktop(jDesktopPane);
			processRunnable.setModuloActual(moduloActual);
			processRunnable.setModuloUsuarioSeleccionado(moduloActual);
			processRunnable.setOpcionActual(opcionActual);
			processRunnable.setParametroGeneralSg(parametroGeneralSg);
			processRunnable.setParametroGeneralUsuario(parametroGeneralUsuario);
			processRunnable.setResumenUsuarioActual(resumenUsuarioActual);
			processRunnable.setUsuarioActual(usuarioActual);
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasBien;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesBien;
			processRunnable.jTableDatos=jTableDatosBien;
			processRunnable.jPanelCampos=jPanelCamposBien;
			processRunnable.jPanelPaginacion=jPanelPaginacionBien;
			processRunnable.jPanelAcciones=jPanelAccionesBien;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioBien;
			
			
			processRunnable.jmenuBar=jmenuBarBien;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleBien;
			processRunnable.jTtoolBar=jTtoolBarBien;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleBien;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasBien ,jPanelParametrosReportesBien,jTableDatosBien, /*jScrollPanelDatosBien,*/jPanelCamposBien,jPanelPaginacionBien, /*jScrollPanelDatosEdicionBien,*/ jPanelAccionesBien,jPanelAccionesFormularioBien,jmenuBarBien,jmenuBarDetalleBien,jTtoolBarBien,jTtoolBarDetalleBien);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasBien ,jPanelParametrosReportesBien, jScrollPanelDatosBien,jPanelPaginacionBien, jScrollPanelDatosEdicionBien, jPanelAccionesBien,jPanelAccionesFormularioBien,jmenuBarBien,jmenuBarDetalleBien,jTtoolBarBien,jTtoolBarDetalleBien);
						
							startProcess();//this.
							
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
			      }
			});
		}
		*/
	}
	
	public void finishProcessBien() {// throws Exception 
		this.finishProcessBien(true);
	}
	
	public void finishProcessBien(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasBien ,this.jPanelParametrosReportesBien, this.jScrollPanelDatosBien,this.jPanelPaginacionBien, this.jScrollPanelDatosEdicionBien, this.jPanelAccionesBien,this.jPanelAccionesFormularioBien,this.jmenuBarBien,this.jmenuBarDetalleBien,this.jTtoolBarBien,this.jTtoolBarDetalleBien);		
		
		final JTabbedPane jTabbedPaneBusquedasBien=this.jTabbedPaneBusquedasBien; 
		
		final JPanel jPanelParametrosReportesBien=this.jPanelParametrosReportesBien;
		//final JScrollPane jScrollPanelDatosBien=this.jScrollPanelDatosBien;
		final JTable jTableDatosBien=this.jTableDatosBien;		
		final JPanel jPanelPaginacionBien=this.jPanelPaginacionBien;
		//final JScrollPane jScrollPanelDatosEdicionBien=this.jScrollPanelDatosEdicionBien;
		final JPanel jPanelAccionesBien=this.jPanelAccionesBien;
		
		JPanel jPanelCamposAuxiliarBien=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarBien=new JPanel();
		
		if(this.jInternalFrameDetalleFormBien!=null) {
			jPanelCamposAuxiliarBien=this.jInternalFrameDetalleFormBien.jPanelCamposBien;
			jPanelAccionesFormularioAuxiliarBien=this.jInternalFrameDetalleFormBien.jPanelAccionesFormularioBien;
		}
		
		final JPanel jPanelCamposBien=jPanelCamposAuxiliarBien;
		final JPanel jPanelAccionesFormularioBien=jPanelAccionesFormularioAuxiliarBien;
		
		
		final JMenuBar jmenuBarBien=this.jmenuBarBien;		
		final JToolBar jTtoolBarBien=this.jTtoolBarBien;
				
		JMenuBar jmenuBarDetalleAuxiliarBien=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarBien=new JToolBar();
		
		if(this.jInternalFrameDetalleFormBien!=null) {
			jmenuBarDetalleAuxiliarBien=this.jInternalFrameDetalleFormBien.jmenuBarDetalleBien;
			jTtoolBarDetalleAuxiliarBien=this.jInternalFrameDetalleFormBien.jTtoolBarDetalleBien;		
		}
		
		final JMenuBar jmenuBarDetalleBien=jmenuBarDetalleAuxiliarBien;
		final JToolBar jTtoolBarDetalleBien=jTtoolBarDetalleAuxiliarBien;
		
		
		
		if(Constantes2.CON_PROCESO_HILO) {
			Thread threadRunnableProcess;
			ProcessRunnable processRunnable;
			
			processRunnable=new ProcessRunnable();
			
			processRunnable.setsTipo("END");
			processRunnable.setDesktop(jDesktopPane);
			processRunnable.setModuloActual(moduloActual);
			processRunnable.setModuloUsuarioSeleccionado(moduloActual);
			processRunnable.setOpcionActual(opcionActual);
			processRunnable.setParametroGeneralSg(parametroGeneralSg);
			processRunnable.setParametroGeneralUsuario(parametroGeneralUsuario);
			processRunnable.setResumenUsuarioActual(resumenUsuarioActual);
			processRunnable.setUsuarioActual(usuarioActual);
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasBien;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesBien;
			processRunnable.jTableDatos=jTableDatosBien;
			processRunnable.jPanelCampos=jPanelCamposBien;
			processRunnable.jPanelPaginacion=jPanelPaginacionBien;
			processRunnable.jPanelAcciones=jPanelAccionesBien;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioBien;
			
			
			processRunnable.jmenuBar=jmenuBarBien;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleBien;
			processRunnable.jTtoolBar=jTtoolBarBien;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleBien;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasBien ,jPanelParametrosReportesBien, jTableDatosBien,/*jScrollPanelDatosBien,*/jPanelCamposBien,jPanelPaginacionBien, /*jScrollPanelDatosEdicionBien,*/ jPanelAccionesBien,jPanelAccionesFormularioBien,jmenuBarBien,jmenuBarDetalleBien,jTtoolBarBien,jTtoolBarDetalleBien));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesBien(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarBien(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuBien(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarBien(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarBien,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleBien,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuBien(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarBien,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleBien,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.bienConstantesFunciones.getsFinalQueryBien();
		String  finalQueryPaginacionTodos=this.bienConstantesFunciones.getsFinalQueryBien();
		
		Boolean esBusqueda=false;
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		if(!sAccionBusqueda.equals("Todos"))	{
			esBusqueda=true;
		}
		
		this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
		this.arrDatoGeneralNo= new  ArrayList<String>();
		
		ArrayList<String> arrColumnasGlobalesNo=BienConstantesFunciones.getArrayColumnasGlobalesNoBien(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=BienConstantesFunciones.getArrayColumnasGlobalesBien(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,BienConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.biensEliminados= new ArrayList<Bien>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessBien();
		
				///*BienSessionBean*/this.bienSessionBean=new BienSessionBean();
			
			if(this.bienSessionBean==null) {
				this.bienSessionBean=new BienSessionBean();
			}
			
			//ACTUALIZA EL TAMANIO DE PAGINACION DESDE EL COMBO
			if(this.sTipoPaginacion!=null && !this.sTipoPaginacion.equals("")) {
				if(!this.sTipoPaginacion.equals("TODOS")) {
					this.iNumeroPaginacion=Integer.parseInt(this.sTipoPaginacion);
				} else {
					this.iNumeroPaginacion=-1;
					this.iNumeroPaginacionPagina=-1;
				}
			} else {
				if(this.iNumeroPaginacion==null || (this.iNumeroPaginacion!=null && this.iNumeroPaginacion<=0)) {
					this.iNumeroPaginacion=BienConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=BienConstantesFunciones.getClassesForeignKeysOfBien(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/bien."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			biensAux= new ArrayList<Bien>();
			
				
			bienLogic.setDatosCliente(this.datosCliente);
			bienLogic.setDatosDeep(this.datosDeep);
			bienLogic.setIsConDeep(true);
			
			
			bienLogic.getBienDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					bienLogic.getTodosBiens(finalQueryGlobal,pagination);
					
					//bienLogic.getTodosBiensWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(bienLogic.getBiens()==null|| bienLogic.getBiens().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							biensAux= new ArrayList<Bien>();
							biensAux.addAll(bienLogic.getBiens());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							biensAux= new ArrayList<Bien>();
							biensAux.addAll(biens);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							bienLogic.getTodosBiens(finalQueryGlobal+"",this.pagination);												
							
							//bienLogic.getTodosBiensWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteBiens("Todos",bienLogic.getBiens() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							bienLogic.setBiens(new ArrayList<Bien>());					
							bienLogic.getBiens().addAll(biensAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							biens=new ArrayList<Bien>();
							biens.addAll(biensAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idBien=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idBien=this.idActual;
				
				} else if(this.idBienActual!=null && this.idBienActual!=0L) {
					idBien=idBienActual;
				}
				
					
				this.sDetalleReporte=BienConstantesFunciones.getDetalleIndicePorId(idBien);
				
				this.biens=new ArrayList<Bien>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					bienLogic.getEntity(idBien);
					
					//bienLogic.getEntityWithConnection(idBien);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					bienLogic.setBiens(new ArrayList<Bien>());
					bienLogic.getBiens().add(bienLogic.getBien());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.biens=new ArrayList<Bien>();
					this.biens.add(bien);
				}
				
				if(bienLogic.getBien()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdCliente")) {
				this.sDetalleReporte=BienConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					bienLogic.getBiensFK_IdCliente(finalQueryGlobal,pagination,id_clienteFK_IdCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=BienConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=BienConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=bienLogic.getBiens()==null||bienLogic.getBiens().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=biens==null|| biens.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						biensAux=new ArrayList<Bien>();
						biensAux.addAll(bienLogic.getBiens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							biensAux=new ArrayList<Bien>();
							biensAux.addAll(biens);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							bienLogic.getBiensFK_IdCliente(finalQueryGlobal,pagination,id_clienteFK_IdCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=BienConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=BienConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteBiens("FK_IdCliente",bienLogic.getBiens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteBiens("FK_IdCliente",biens);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						bienLogic.setBiens(new ArrayList<Bien>());
						bienLogic.getBiens().addAll(biensAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							biens=new ArrayList<Bien>();
							biens.addAll(biensAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=BienConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					bienLogic.getBiensFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=BienConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=BienConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=bienLogic.getBiens()==null||bienLogic.getBiens().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=biens==null|| biens.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						biensAux=new ArrayList<Bien>();
						biensAux.addAll(bienLogic.getBiens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							biensAux=new ArrayList<Bien>();
							biensAux.addAll(biens);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							bienLogic.getBiensFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=BienConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=BienConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteBiens("FK_IdEmpresa",bienLogic.getBiens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteBiens("FK_IdEmpresa",biens);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						bienLogic.setBiens(new ArrayList<Bien>());
						bienLogic.getBiens().addAll(biensAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							biens=new ArrayList<Bien>();
							biens.addAll(biensAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdValorClienteTipoBien")) {
				this.sDetalleReporte=BienConstantesFunciones.getDetalleIndiceFK_IdValorClienteTipoBien(id_tipobienFK_IdValorClienteTipoBien);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					bienLogic.getBiensFK_IdValorClienteTipoBien(finalQueryGlobal,pagination,id_tipobienFK_IdValorClienteTipoBien);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=BienConstantesFunciones.getDetalleIndiceFK_IdValorClienteTipoBien(id_tipobienFK_IdValorClienteTipoBien);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=BienConstantesFunciones.getDetalleIndiceFK_IdValorClienteTipoBien(id_tipobienFK_IdValorClienteTipoBien);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=bienLogic.getBiens()==null||bienLogic.getBiens().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=biens==null|| biens.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						biensAux=new ArrayList<Bien>();
						biensAux.addAll(bienLogic.getBiens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							biensAux=new ArrayList<Bien>();
							biensAux.addAll(biens);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							bienLogic.getBiensFK_IdValorClienteTipoBien(finalQueryGlobal,pagination,id_tipobienFK_IdValorClienteTipoBien);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=BienConstantesFunciones.getDetalleIndiceFK_IdValorClienteTipoBien(id_tipobienFK_IdValorClienteTipoBien);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=BienConstantesFunciones.getDetalleIndiceFK_IdValorClienteTipoBien(id_tipobienFK_IdValorClienteTipoBien);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteBiens("FK_IdValorClienteTipoBien",bienLogic.getBiens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteBiens("FK_IdValorClienteTipoBien",biens);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						bienLogic.setBiens(new ArrayList<Bien>());
						bienLogic.getBiens().addAll(biensAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							biens=new ArrayList<Bien>();
							biens.addAll(biensAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesBien();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessBien();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=bienLogic.getBiens().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=biens.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=bienLogic.getBiens().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=biens.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Bien bien) {
		Boolean permite=true;
		
		if(this.bien.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=BienConstantesFunciones.getOrderByListaBien();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=BienConstantesFunciones.getOrderByListaBien();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Bien bien:bienLogic.getBiens()) {
				if(bien.getsType().equals(Constantes2.S_TOTALES)) {
					bienTotales=bien;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Bien bien:this.biens) {
				if(bien.getsType().equals(Constantes2.S_TOTALES)) {
					bienTotales=bien;
					existe=true;
					break;
				}
			}
		}
		
		return existe;
	}
	
	public void crearFilaTotales() throws Exception {
		Boolean existe=false;
		
		existe=this.existeFilaTotales();
		
		if(!existe) {
			//SI NO ES UNO A UNO SE CREA FILA TOTALES
			this.bienAux=new Bien();
			this.bienAux.setsType(Constantes2.S_TOTALES);
			this.bienAux.setIsNew(false);
			this.bienAux.setIsChanged(false);
			this.bienAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				BienConstantesFunciones.TotalizarValoresFilaBien(this.bienLogic.getBiens(),this.bienAux);
				
				this.bienLogic.getBiens().add(this.bienAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				BienConstantesFunciones.TotalizarValoresFilaBien(this.biens,this.bienAux);
				
				this.biens.add(this.bienAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		bienTotales=new Bien();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.bienLogic.getBiens().remove(bienTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.biens.remove(bienTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		bienTotales=new Bien();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Bien bien:bienLogic.getBiens()) {
				if(bien.getsType().equals(Constantes2.S_TOTALES)) {
					bienTotales=bien;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				BienConstantesFunciones.TotalizarValoresFilaBien(this.bienLogic.getBiens(),bienTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Bien bien:this.biens) {
				if(bien.getsType().equals(Constantes2.S_TOTALES)) {
					bienTotales=bien;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				BienConstantesFunciones.TotalizarValoresFilaBien(this.biens,bienTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BienConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getBiensFK_IdCliente()throws Exception {
		try {
			sAccionBusqueda="FK_IdCliente";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getBiensFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getBiensFK_IdValorClienteTipoBien()throws Exception {
		try {
			sAccionBusqueda="FK_IdValorClienteTipoBien";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getBiensFK_IdCliente(String sFinalQuery,Long id_cliente)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					bienLogic.getBiensFK_IdCliente(sFinalQuery,this.pagination,id_cliente);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getBiensFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					bienLogic.getBiensFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getBiensFK_IdValorClienteTipoBien(String sFinalQuery,Long id_tipobien)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					bienLogic.getBiensFK_IdValorClienteTipoBien(sFinalQuery,this.pagination,id_tipobien);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	
	public void onLoad()throws Exception {		
		try {		
			isEntroOnLoad=true;
			//INTENTA TRAER DATOS DE BUSQUEDA ANTERIOR
			this.traerDatosBusquedaDesdeSession();
					
			//SINO SE CUMPLE VIENE DE PADRE FOREIGN O BUSQUEDA ANTIGUA
			if(this.sAccionBusqueda.equals("")) {
				this.sAccionBusqueda="Todos";
			}
								
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch (Exception e) {
			throw e;
		}
	}		
	
	public void inicializarPermisosBien() {
		this.isPermisoTodoBien=false;
		this.isPermisoNuevoBien=false;
		this.isPermisoActualizarBien=false;
		this.isPermisoActualizarOriginalBien=false;
		this.isPermisoEliminarBien=false;
		this.isPermisoGuardarCambiosBien=false;
		this.isPermisoConsultaBien=false;
		this.isPermisoBusquedaBien=false;
		this.isPermisoReporteBien=false;		
		this.isPermisoOrdenBien=false;		
		this.isPermisoPaginacionMedioBien=false;		
		this.isPermisoPaginacionAltoBien=false;
		this.isPermisoPaginacionTodoBien=false;
		this.isPermisoCopiarBien=false;		
		this.isPermisoVerFormBien=false;		
		this.isPermisoDuplicarBien=false;		
		this.isPermisoOrdenBien=false;		
	}
	
	public void setPermisosUsuarioBien(Boolean isPermiso) {
		this.isPermisoTodoBien=isPermiso;
		this.isPermisoNuevoBien=isPermiso;
		this.isPermisoActualizarBien=isPermiso;
		this.isPermisoActualizarOriginalBien=isPermiso;
		this.isPermisoEliminarBien=isPermiso;
		this.isPermisoGuardarCambiosBien=isPermiso;
		this.isPermisoConsultaBien=isPermiso;
		this.isPermisoBusquedaBien=isPermiso;
		this.isPermisoReporteBien=isPermiso;
		this.isPermisoOrdenBien=isPermiso;		
		this.isPermisoPaginacionMedioBien=isPermiso;		
		this.isPermisoPaginacionAltoBien=isPermiso;		
		this.isPermisoPaginacionTodoBien=isPermiso;		
		this.isPermisoCopiarBien=isPermiso;		
		this.isPermisoVerFormBien=isPermiso;		
		this.isPermisoDuplicarBien=isPermiso;
		this.isPermisoOrdenBien=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioBien(Boolean isPermiso) {
		//this.isPermisoTodoBien=isPermiso;
		this.isPermisoNuevoBien=isPermiso;
		this.isPermisoActualizarBien=isPermiso;
		this.isPermisoActualizarOriginalBien=isPermiso;
		this.isPermisoEliminarBien=isPermiso;
		this.isPermisoGuardarCambiosBien=isPermiso;
		//this.isPermisoConsultaBien=isPermiso;
		//this.isPermisoBusquedaBien=isPermiso;
		//this.isPermisoReporteBien=isPermiso;
		//this.isPermisoOrdenBien=isPermiso;		
		//this.isPermisoPaginacionMedioBien=isPermiso;		
		//this.isPermisoPaginacionAltoBien=isPermiso;		
		//this.isPermisoPaginacionTodoBien=isPermiso;		
		//this.isPermisoCopiarBien=isPermiso;		
		//this.isPermisoDuplicarBien=isPermiso;
		//this.isPermisoOrdenBien=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioBienClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(BienJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebBien(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioBienClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioBienClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionBienClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioBienClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioBien() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(BienJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.bienSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, BienConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoBien=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarBien=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalBien=this.isPermisoActualizarBien;
			this.isPermisoEliminarBien=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosBien=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaBien=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaBien=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoBien=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteBien=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenBien=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioBien=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoBien=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoBien=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarBien=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormBien=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarBien=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenBien=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.bienSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosBien.setToolTipText(this.jTableDatosBien.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioBien(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioBien(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(BienJInternalFrame.CON_LLAMADA_SIMPLE) {
				this.accions=this.sistemaReturnGeneral.getAccions();
				
				
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.accions=sistemaLogicAdditional.getAccionesUsuario(this.usuarioActual,this.opcionActual,false);				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}
			
			if(this.accions.size()>0) {			
				for(Accion accion:this.accions) {
					reporte=new Reporte();
					reporte.setsCodigo(accion.getcodigo());
					reporte.setsDescripcion(accion.getnombre());
		
		
					this.tiposAcciones.add(reporte);
				}
			}	
			
			

			reporte=new Reporte();
			reporte.setsCodigo("");
			reporte.setsDescripcion("");

			this.tiposAcciones.add(reporte);
			
		} else {
			//ACCIONES FORMULARIO
			this.accionsFormulario=new ArrayList<Accion>();
			
			if(BienJInternalFrame.CON_LLAMADA_SIMPLE) {
				this.accionsFormulario=this.sistemaReturnGeneral.getAccionsFormulario();
			
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.accionsFormulario=sistemaLogicAdditional.getAccionesUsuario(this.usuarioActual,this.opcionActual,true);				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}
			
			if(this.accionsFormulario.size()>0) {			
				for(Accion accion:this.accionsFormulario) {
					reporte=new Reporte();
					reporte.setsCodigo(accion.getcodigo());
					reporte.setsDescripcion(accion.getnombre());
					
					this.tiposAccionesFormulario.add(reporte);
				}
			}	
			
			

			reporte=new Reporte();
			reporte.setsCodigo("");
			reporte.setsDescripcion("");

			this.tiposAccionesFormulario.add(reporte);
		}				
	}	 	
	
	public void setRelacionesUsuarioBien() throws Exception {
		Reporte reporte=null;
		
		
		
		
		//ORDENAR ALFABETICAMENTE
		Collections.sort(this.tiposRelaciones, new ReporteComparator());
		/*
		reporte=new Reporte();
		reporte.setsCodigo(accion.getcodigo());
		reporte.setsDescripcion(accion.getnombre());
			
		this.tiposRelaciones.add(reporte);
		*/
	}	
	
		
	@SuppressWarnings({ "unchecked", "rawtypes" } )
	public void inicializarCombosForeignKeyBienListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.clientesForeignKey=new ArrayList();
				this.tipobiensForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyBienListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(BienJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyBienListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyClienteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoBienListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyEmpresaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EmpresaConstantesFunciones.SFINALQUERY;

				this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyClienteListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.clientesForeignKey==null||this.clientesForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=ClienteConstantesFunciones.getArrayColumnasGlobalesCliente(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ClienteConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=ClienteConstantesFunciones.SFINALQUERY;

				this.cargarCombosClientesForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoBienListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipobiensForeignKey==null||this.tipobiensForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoBienConstantesFunciones.getArrayColumnasGlobalesTipoBien(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoBienConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoBienConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoBiensForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyBienListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			BienParameterReturnGeneral bienReturnGeneral=new BienParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.bienConstantesFunciones.cargarid_empresaBien)
					 || (this.esRecargarFks && this.bienConstantesFunciones.cargarid_empresaBien)) {

					if(!this.bienSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+bienSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalCliente="";

				if(((this.clientesForeignKey==null||this.clientesForeignKey.size()<=0) && this.bienConstantesFunciones.cargarid_clienteBien)
					 || (this.esRecargarFks && this.bienConstantesFunciones.cargarid_clienteBien)) {

					if(!this.bienSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ClienteConstantesFunciones.getArrayColumnasGlobalesCliente(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCliente=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ClienteConstantesFunciones.TABLENAME);

						finalQueryGlobalCliente=Funciones.GetFinalQueryAppend(finalQueryGlobalCliente, "");
						finalQueryGlobalCliente+=ClienteConstantesFunciones.SFINALQUERY;

						//this.cargarCombosClientesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCliente=" WHERE " + ConstantesSql.ID + "="+bienSessionBean.getlidClienteActual();
					}
				} else {
					finalQueryGlobalCliente="NONE";
				}


				String finalQueryGlobalTipoBien="";

				if(((this.tipobiensForeignKey==null||this.tipobiensForeignKey.size()<=0) && this.bienConstantesFunciones.cargarid_tipobienBien)
					 || (this.esRecargarFks && this.bienConstantesFunciones.cargarid_tipobienBien)) {

					if(!this.bienSessionBean.getisBusquedaDesdeForeignKeySesionTipoBien()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoBienConstantesFunciones.getArrayColumnasGlobalesTipoBien(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoBien=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoBienConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoBien=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoBien, "");
						finalQueryGlobalTipoBien+=TipoBienConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoBiensForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoBien=" WHERE " + ConstantesSql.ID + "="+bienSessionBean.getlidTipoBienActual();
					}
				} else {
					finalQueryGlobalTipoBien="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				bienReturnGeneral=bienLogic.cargarCombosLoteForeignKeyBien(finalQueryGlobalEmpresa,finalQueryGlobalCliente,finalQueryGlobalTipoBien);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=bienReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalCliente.equals("NONE")) {
				this.clientesForeignKey=bienReturnGeneral.getclientesForeignKey();
			}

			if(!finalQueryGlobalTipoBien.equals("NONE")) {
				this.tipobiensForeignKey=bienReturnGeneral.gettipobiensForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyBien()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyCliente();
			this.addItemDefectoCombosForeignKeyTipoBien();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.bienSessionBean==null) {
				this.bienSessionBean=new BienSessionBean();
			}

			if(!this.bienSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
				Empresa empresa=new Empresa();
				EmpresaConstantesFunciones.setEmpresaDescripcion(empresa,Constantes.SMENSAJE_ESCOJA_OPCION);
				empresa.setId(null);

				if(!EmpresaConstantesFunciones.ExisteEnLista(this.empresasForeignKey,empresa,true)) {

					this.empresasForeignKey.add(0,empresa);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyCliente()throws Exception {
		try {

			if(!this.bienSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
				Cliente cliente=new Cliente();
				ClienteConstantesFunciones.setClienteDescripcion(cliente,Constantes.SMENSAJE_ESCOJA_OPCION);
				cliente.setId(null);

				if(!ClienteConstantesFunciones.ExisteEnLista(this.clientesForeignKey,cliente,true)) {

					this.clientesForeignKey.add(0,cliente);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTipoBien()throws Exception {
		try {

			if(!this.bienSessionBean.getisBusquedaDesdeForeignKeySesionTipoBien()) {
				TipoBien tipobien=new TipoBien();
				TipoBienConstantesFunciones.setTipoBienDescripcion(tipobien,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipobien.setId(null);

				if(!TipoBienConstantesFunciones.ExisteEnLista(this.tipobiensForeignKey,tipobien,true)) {

					this.tipobiensForeignKey.add(0,tipobien);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyBien()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyBien(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyBien()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyBien();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyBien(Bien bien)throws Exception {	
		try {
			
			this.setActualClienteForeignKey(bien.getid_cliente(),false,"Formulario");
			this.setActualTipoBienForeignKey(bien.getid_tipobien(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyBien(Bien bien,String sTipoEvento)throws Exception {	
		try {
			
			

				if(bien.getCliente()!=null && !sTipoEvento.equals("id_clienteBien")) { //sTipoEvento Evita Bucle Infinito

					this.clientesForeignKey=new ArrayList<Cliente>();
					this.clientesForeignKey.add(bien.getCliente());

					this.addItemDefectoCombosForeignKeyCliente();
					this.cargarCombosFrameClientesForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyBien()throws Exception {	
		try {
			
			this.setActualClienteForeignKey(this.bienConstantesFunciones.getid_cliente(),false,"Formulario");
			this.setActualTipoBienForeignKey(this.bienConstantesFunciones.getid_tipobien(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyBien()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyBien()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyBien()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroBien()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyBien()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameClientesForeignKey("Todos");
			this.cargarCombosFrameTipoBiensForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyBien(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameClientesForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoBiensForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyBien()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormBien.jComboBoxid_empresaBien!=null && this.jInternalFrameDetalleFormBien.jComboBoxid_empresaBien.getItemCount()>0) {
				this.jInternalFrameDetalleFormBien.jComboBoxid_empresaBien.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormBien.jComboBoxid_clienteBien!=null && this.jInternalFrameDetalleFormBien.jComboBoxid_clienteBien.getItemCount()>0) {
				this.jInternalFrameDetalleFormBien.jComboBoxid_clienteBien.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormBien.jComboBoxid_tipobienBien!=null && this.jInternalFrameDetalleFormBien.jComboBoxid_tipobienBien.getItemCount()>0) {
				this.jInternalFrameDetalleFormBien.jComboBoxid_tipobienBien.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public BienBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public BienBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public BienBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.bienSessionBean=new BienSessionBean(); 
		this.bienConstantesFunciones=new BienConstantesFunciones(); 
		this.bienBean=new Bien();//(this.bienConstantesFunciones); 		
		this.bienReturnGeneral=new BienParameterReturnGeneral(); 
		
		this.bienSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.bienSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public BienBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public BienBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public BienBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessBien(true);
			
			Boolean esParaBusquedaForeignKey=false;//ANTES USADO COMO PARAMETRO DEL CONSTRUCTOR
			
			if(paginaTipo.equals(PaginaTipo.BUSQUEDA)) {
				esParaBusquedaForeignKey=true;
			}
			
			
			
			//SE ASIGNA EN CLASE PADRE
			/*
			this.parametroGeneralSg=parametroGeneralSg;		
			this.parametroGeneralUsuario=parametroGeneralUsuario;	
			this.usuarioActual=usuarioActual;
			this.moduloActual=moduloActual;
			*/						
			
			long start_time=0;
			long end_time=0;
			
			if(Constantes2.ISDEVELOPING2) {
				start_time = System.currentTimeMillis();
			}
			
			if(!cargarTodosDatos) {
				this.sAccionBusqueda="NINGUNO";
			}
			
			this.bienConstantesFunciones=new BienConstantesFunciones(); 
			this.bienBean=new Bien();//this.bienConstantesFunciones); 			
			this.bienReturnGeneral=new BienParameterReturnGeneral(); 
		
			BienBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Bien Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.bien=new Bien();
			this.biens = new ArrayList<Bien>();
			this.biensAux = new ArrayList<Bien>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bienLogic=new BienLogic();
				this.bienLogic.getNewConnexionToDeep("");
			}
			
			//this.bienSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.bienSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormBien);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoBien!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoBien);	
					}
					
					if(this.jInternalFrameImportacionBien!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionBien);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByBien!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByBien);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormBien!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormBien);
				this.jInternalFrameDetalleFormBien.setVisible(false);
				this.jInternalFrameDetalleFormBien.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoBien!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoBien);
					this.jInternalFrameReporteDinamicoBien.setVisible(false);
					this.jInternalFrameReporteDinamicoBien.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionBien!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionBien);
					this.jInternalFrameImportacionBien.setVisible(false);
					this.jInternalFrameImportacionBien.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByBien!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByBien);
					this.jInternalFrameOrderByBien.setVisible(false);
					this.jInternalFrameOrderByBien.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idBienActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=BienConstantesFunciones.INUMEROPAGINACION;
			this.pagination=new Pagination();
			this.datosCliente=new DatosCliente();
			this.lIdUsuarioSesion=0L;	
			this.sTipoArchivoReporte="";
			this.sTipoArchivoReporteDinamico="";
			this.sTipoReporte="";
			this.sTipoReporteDinamico="";
			this.sTipoPaginacion="";
			this.sTipoRelacion="";
			this.sTipoAccion="";
			this.sTipoAccionFormulario="";
			this.sTipoSeleccionar="";			
			this.sDetalleReporte="";
			this.sTipoReporteExtra="";
			this.sValorCampoGeneral="";
			this.sPathReporteDinamico="";			
			
			this.isMostrarNumeroPaginacion=false;
			this.isSeleccionarTodos=false;
			this.isSeleccionados=false;
			this.conGraficoReporte=false;
			this.isPostAccionNuevo=false;
			this.isPostAccionSinCerrar=false;
			this.isPostAccionSinMensaje=false;
			this.esReporteDinamico=false;
			this.esRecargarFks=false;
			this.esReporteAccionProceso=false;
			
			this.bienReturnGeneral=new BienParameterReturnGeneral();
			
			this.bienParameterGeneral=new BienParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.bienLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.bienSessionBean.getEsGuardarRelacionado()) {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					if(!sistemaLogicAdditional.validarLicenciaCliente(this.datosCliente,this.moduloActual,this.usuarioActual)) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_CONTROLGLOBAL);
					}
					
				} else if(Constantes.ISUSAEJBREMOTE) {
					
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}			
			
			//VERIFICAR GLOBAL
			
			//VERIFICAR SESSION ACTUAL
			//this.cargarDatosCliente();
			
			this.sistemaReturnGeneral=new SistemaParameterReturnGeneral();
			
			SistemaParameterReturnGeneralAdditional.inicializarSinSeguridad(this.sistemaReturnGeneral);
			
			if(BienJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.bienSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,BienConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.bienSessionBean.getEsGuardarRelacionado(),this.bienSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,BienConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.bienSessionBean.getEsGuardarRelacionado(),this.bienSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					if(!this.sistemaReturnGeneral.getEsValidado()) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_SESIONACTUAL);
					}
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
					//FALTA
				}
			} else { 
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					if(!sistemaLogicAdditional.validarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual)) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_SESIONACTUAL);
					}
				
				} else if(Constantes.ISUSAEJBREMOTE) {
					
				} else if(Constantes.ISUSAEJBHOME) {
				}
			} 
			//VERIFICAR SESSION ACTUAL
			
			
			this.sVisibilidadTablaBusquedas="table-row";
			this.sVisibilidadTablaElementos="none";
			this.sVisibilidadTablaAcciones="none";
			
			this.isVisibilidadCeldaNuevoBien=false;
			this.isVisibilidadCeldaDuplicarBien=true;
			this.isVisibilidadCeldaCopiarBien=true;
			this.isVisibilidadCeldaVerFormBien=true;
			this.isVisibilidadCeldaOrdenBien=true;
			this.isVisibilidadCeldaNuevoRelacionesBien=false;
			this.isVisibilidadCeldaModificarBien=false;
			this.isVisibilidadCeldaActualizarBien=false;
			this.isVisibilidadCeldaEliminarBien=false;
			this.isVisibilidadCeldaCancelarBien=false;
			this.isVisibilidadCeldaGuardarBien=false;
			this.isVisibilidadCeldaGuardarCambiosBien=false;
			
			
			this.isVisibilidadFK_IdCliente=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdValorClienteTipoBien=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesBien("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosBien();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioBien(false);
			
			this.setPermisosUsuarioBien();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.bienSessionBean.getEsGuardarRelacionado() 
				|| (this.bienSessionBean.getEsGuardarRelacionado() && this.bienSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioBienClasesRelacionadas();
			}
			
			if(this.bienSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioBienClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!BienJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosBien();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualBien();
			}
			
			if(!this.isPermisoBusquedaBien) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasBien.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.bienSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioBien,this.isPermisoPaginacionMedioBien,this.isPermisoPaginacionTodoBien);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(BienConstantesFunciones.getTiposSeleccionarBien());
				
				this.tiposColumnasSelect=BienConstantesFunciones.getTiposSeleccionarBien(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				
			} else {
				this.tiposArchivosReportes=new ArrayList<Reporte>();
				this.tiposArchivosReportesDinamico=new ArrayList<Reporte>();
				this.tiposReportes=new ArrayList<Reporte>();
				this.tiposReportesDinamico=new ArrayList<Reporte>();
				this.tiposGraficosReportes=new ArrayList<Reporte>();
				this.tiposPaginacion=new ArrayList<Reporte>();
				this.tiposSeleccionar=new ArrayList<Reporte>();			
				this.tiposColumnasSelect=new ArrayList<Reporte>();	
				this.tiposRelacionesSelect=new ArrayList<Reporte>();	
			}
						
			
			//FUNCIONALIDAD_RELACIONADO
			//if(!this.bienSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioBien();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioBien(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioBien(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesBien() ;
			
			/*
			} else {
				this.tiposAcciones=new ArrayList<Reporte>();
				this.tiposAccionesFormulario=new ArrayList<Reporte>();
			}
			*/						
			
			this.inicializarInvalidValues();
						
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			
			
			this.arrOrderBy= new  ArrayList<OrderBy>();
			
			
			this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
			
			
			this.traerValoresTablaOrderBy();			
			
			
			this.isGuardarCambiosEnLote=false;
			this.isCargarCombosDependencia=false;
			
			 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			this.clienteLogic=new ClienteLogic();
			this.tipobienLogic=new TipoBienLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				bienImplementable= (BienImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+BienConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				bienImplementableHome= (BienImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+BienConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.biens= new ArrayList<Bien>();
			this.biensEliminados= new ArrayList<Bien>();
						
			this.isEsNuevoBien=false;
			this.esParaAccionDesdeFormularioBien=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idClienteActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.clientesForeignKey=new ArrayList<Cliente>() ;
			this.tipobiensForeignKey=new ArrayList<TipoBien>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyBien(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroBien();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.bienSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			BienBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=BienConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesBien("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingBien(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormBien!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioBien();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioBien();
			}
			
			BienBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasBien.getTabCount(); i++) {
					this.jTabbedPaneBusquedasBien.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasBien.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bienLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessBien(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Bien: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bienLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,BienConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bienLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectBien() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesBien")) {
				iIndex=this.jInternalFrameDetalleFormBien.jTabbedPaneRelacionesBien.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormBien.jTabbedPaneRelacionesBien.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosBien.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessBien();	
			}
		}
    }
	
	
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
	}		
	
	public void cargarCombosForeignKeyBien(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyBien(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyBien(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyBienListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyBien();
		
		this.cargarCombosFrameForeignKeyBien();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyBien();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyBien();
		}
	}
	
	

	public void cargarCombosForeignKeyCliente(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyClienteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCliente();
				this.cargarCombosFrameClientesForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaCliente(this.clientesForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoBien(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoBienListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoBien();
				this.cargarCombosFrameTipoBiensForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoBien(this.tipobiensForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoBienActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.bienSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormBien==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			BienBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.bien,new Object(),this.bienParameterGeneral,this.bienReturnGeneral);
			
			
			if(jTableDatosBien.getRowCount()>=1) {
				jTableDatosBien.removeRowSelectionInterval(0, jTableDatosBien.getRowCount()-1);						
			}
			
			this.isEsNuevoBien=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoBien(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesBien(true);			
			//this.bien=new Bien();
			//this.bien.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesBien(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualBien() ;
			
			if(BienJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleBien(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.bien);	
			this.actualizarInformacion("INFO_PADRE",false,this.bien);				
			
			BienBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.bien,new Object(),this.bienParameterGeneral,this.bienReturnGeneral);
			
			if(this.bienSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Bien: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			BienBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.bien,new Object(),this.bienParameterGeneral,this.bienReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,BienConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarBienActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Bien> biensSeleccionados=new ArrayList<Bien>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosBien.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosBien.getSelectedRows().length;			
			}
			
			biensSeleccionados=this.getBiensSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoBien--;			
				//Bien bienAux= new Bien();			
				//bienAux.setId(this.iIdNuevoBien);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Bien bienOrigen=new Bien();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Bien bienOrigen : biensSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosBien.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							bienOrigen =(Bien) this.bienLogic.getBiens().toArray()[this.jTableDatosBien.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							bienOrigen =(Bien) this.biens.toArray()[this.jTableDatosBien.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaBien();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.bien.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosBien(bienOrigen,this.bien,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysBien(this.bien);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.bienLogic.getBiens().add(this.bienAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.biens.add(this.bienAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaBien(false);
				
				this.jTableDatosBien.setRowSelectionInterval(this.getIndiceNuevoBien(), this.getIndiceNuevoBien());
				
				int iLastRow =  this.jTableDatosBien.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosBien.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosBien.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaBien(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,BienConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarBienActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Bien> biensSeleccionados=new ArrayList<Bien>();									
		
			Bien bienOrigen=new Bien();
			Bien bienDestino=new Bien();
				
			biensSeleccionados=this.getBiensSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosBien.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || biensSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosBien.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						bienOrigen =(Bien) this.bienLogic.getBiens().toArray()[this.jTableDatosBien.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						bienOrigen =(Bien) this.biens.toArray()[this.jTableDatosBien.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						bienDestino =(Bien) this.bienLogic.getBiens().toArray()[this.jTableDatosBien.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						bienDestino =(Bien) this.biens.toArray()[this.jTableDatosBien.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				bienOrigen =biensSeleccionados.get(0);
				bienDestino =biensSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosBien(bienOrigen,bienDestino,true,false);
				
				bienDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(bienDestino,bienLogic.getBiens());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(bienDestino,biens);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaBien(false);
				
				//this.jTableDatosBien.setRowSelectionInterval(this.getIndiceNuevoBien(), this.getIndiceNuevoBien());
				
				int iLastRow =  this.jTableDatosBien.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosBien.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosBien.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaBien(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BienConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormBienActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormBien==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormBien.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BienConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarBienActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesBien.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasBien.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesBien.setVisible(!isVisible);
			this.jPanelPaginacionBien.setVisible(!isVisible);
			this.jPanelAccionesBien.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BienConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarBienActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameBien();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BienConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoBienActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoBien();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BienConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionBienActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionBien();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BienConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByBienActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByBien();
			
			this.abrirFrameOrderByBien();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BienConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByBienActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByBien();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BienConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleBien(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormBien);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormBien.isMaximum()) {
					this.jInternalFrameDetalleFormBien.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormBien.setSize(this.jInternalFrameDetalleFormBien.iWidthFormulario,this.jInternalFrameDetalleFormBien.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormBien.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormBien.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormBien.isMaximum()) {
						this.jInternalFrameDetalleFormBien.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormBien.jContentPaneDetalleBien.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormBien.jTabbedPaneRelacionesBien.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormBien.jContentPaneDetalleBien.getWidth(),BienConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormBien.jTabbedPaneRelacionesBien.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormBien.jContentPaneDetalleBien.getWidth(),BienConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormBien.jTabbedPaneRelacionesBien.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormBien.jContentPaneDetalleBien.getWidth(),BienConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormBien.setVisible(true);
	        this.jInternalFrameDetalleFormBien.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,BienConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByBien() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByBien==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByBien=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByBien,false,this);
				} else {
					this.jInternalFrameOrderByBien=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByBien,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByBien);
				this.jInternalFrameOrderByBien.setVisible(false);
				this.jInternalFrameOrderByBien.setSelected(false);
				
				this.jInternalFrameOrderByBien.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByBien"));
				
				this.inicializarActualizarBindingTablaOrderByBien();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionBien() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionBien==null) {
				
				this.jInternalFrameImportacionBien=new ImportacionJInternalFrame(BienConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionBien);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionBien);
				this.jInternalFrameImportacionBien.setVisible(false);
				this.jInternalFrameImportacionBien.setSelected(false);


				this.jInternalFrameImportacionBien.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionBien"));
				this.jInternalFrameImportacionBien.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionBien"));
				this.jInternalFrameImportacionBien.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionBien"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoBien() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoBien==null) {
				this.jInternalFrameReporteDinamicoBien=new ReporteDinamicoJInternalFrame(BienConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoBien);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoBien);
				this.jInternalFrameReporteDinamicoBien.setVisible(false);
				this.jInternalFrameReporteDinamicoBien.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoBien.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoBien"));
				this.jInternalFrameReporteDinamicoBien.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoBien"));
				this.jInternalFrameReporteDinamicoBien.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoBien"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualBien();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleBien() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormBien);
			
	       	this.jInternalFrameDetalleFormBien.setVisible(false);
	        this.jInternalFrameDetalleFormBien.setSelected(false);
			
			//this.jInternalFrameDetalleFormBien.dispose();
			//this.jInternalFrameDetalleFormBien=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,BienConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoBien() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoBien.setVisible(true);
	        this.jInternalFrameReporteDinamicoBien.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,BienConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionBien() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionBien.setVisible(true);
	        this.jInternalFrameImportacionBien.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,BienConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByBien() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByBien.setVisible(true);
	        this.jInternalFrameOrderByBien.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,BienConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByBien() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByBien.setVisible(false);
	        this.jInternalFrameOrderByBien.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,BienConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoBien() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoBien.setVisible(false);
	        this.jInternalFrameReporteDinamicoBien.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,BienConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionBien() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionBien.setVisible(false);
	        this.jInternalFrameImportacionBien.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,BienConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarBienActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarBien(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BienConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarBien(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosBien.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesBien(true);
			//this.isEsNuevoBien=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bien =(Bien) this.bienLogic.getBiens().toArray()[this.jTableDatosBien.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.bien =(Bien) this.biens.toArray()[this.jTableDatosBien.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesBien("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesBien(false) ;
			
			if(bienSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(BienJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleBien(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualBien(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BienConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaBienActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosBien.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bien =(Bien) this.bienLogic.getBiens().toArray()[this.jTableDatosBien.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.bien =(Bien) this.biens.toArray()[this.jTableDatosBien.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BienConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarBien(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormBien==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosBien.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesBien(true);
			//this.isEsNuevoBien=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bien =(Bien) this.bienLogic.getBiens().toArray()[this.jTableDatosBien.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.bien =(Bien) this.biens.toArray()[this.jTableDatosBien.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.bien.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesBien("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesBien(false) ;
			
			if(BienJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleBien(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualBien(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BienConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Cliente")) {
				if(!this.bienConstantesFunciones.cargarid_clienteBien) {
					this.cargarCombosClientesForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingBien(false,false);
					this.cargarCombosFrameClientesForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_cliente (id);

				this.recargarComboTablaCliente(this.clientesForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaCliente(List<Cliente> clientesForeignKey)throws Exception{
		TableColumn tableColumnCliente=this.jTableDatosBien.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBien,BienConstantesFunciones.LABEL_IDCLIENTE));
		TableCellEditor tableCellEditorCliente =tableColumnCliente.getCellEditor();

		ClienteTableCell clienteTableCellFk=(ClienteTableCell)tableCellEditorCliente;

		if(clienteTableCellFk!=null) {
			clienteTableCellFk.setclientesForeignKey(clientesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosBien.getSelectedRow();

		//if(intSelectedRow<=0) {
			//clienteTableCellFk.setRowActual(intSelectedRow);
			//clienteTableCellFk.setclientesForeignKeyActual(clientesForeignKey);
		//}


		if(clienteTableCellFk!=null) {
			clienteTableCellFk.RecargarClientesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoBien(List<TipoBien> tipobiensForeignKey)throws Exception{
		TableColumn tableColumnTipoBien=this.jTableDatosBien.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBien,BienConstantesFunciones.LABEL_IDTIPOBIEN));
		TableCellEditor tableCellEditorTipoBien =tableColumnTipoBien.getCellEditor();

		TipoBienTableCell tipobienTableCellFk=(TipoBienTableCell)tableCellEditorTipoBien;

		if(tipobienTableCellFk!=null) {
			tipobienTableCellFk.settipobiensForeignKey(tipobiensForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosBien.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipobienTableCellFk.setRowActual(intSelectedRow);
			//tipobienTableCellFk.settipobiensForeignKeyActual(tipobiensForeignKey);
		//}


		if(tipobienTableCellFk!=null) {
			tipobienTableCellFk.RecargarTipoBiensForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_cliente (Long id) throws Exception {
		this.setActualClienteForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarBienActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bienLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesBien(false);
			
			//if(!this.isEsNuevoBien) {								
				int intSelectedRow = this.jTableDatosBien.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bien =(Bien) this.bienLogic.getBiens().toArray()[this.jTableDatosBien.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.bien =(Bien) this.biens.toArray()[this.jTableDatosBien.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(BienJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualBien(this.bien,true);
				this.setVariablesFormularioToObjetoActualForeignKeysBien(this.bien);
				
			}
			
			if(this.permiteMantenimiento(this.bien)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.bienSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoBien=true;
					this.inicializarActualizarBindingTablaBien(false);
					this.isEsNuevoBien=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoBien=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoBien=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesBien(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualBien(false);
				
				this.habilitarDeshabilitarControlesBien(false);
			
												
				
				if(BienJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleBien();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoBienActionPerformed(evt,bienSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualBien(this.bien,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosBien.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,bienSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bienLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.bien.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Bien.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Bien.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bienLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,BienConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bienLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarBienActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bienLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosBien.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bien =(Bien) this.bienLogic.getBiens().toArray()[this.jTableDatosBien.convertRowIndexToModel(intSelectedRow)];
				this.bien.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.bien =(Bien) this.biens.toArray()[this.jTableDatosBien.convertRowIndexToModel(intSelectedRow)];
				this.bien.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.bien)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.bienSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((BienModel) this.jTableDatosBien.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoBien=true;
				this.inicializarActualizarBindingTablaBien(false);
				this.isEsNuevoBien=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesBien(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualBien(false);
				
				this.habilitarDeshabilitarControlesBien(false);
				
				
				
				if(BienJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleBien();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bienLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bienLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BienConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bienLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarBienActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosBien.getRowCount()>=1) {
				jTableDatosBien.removeRowSelectionInterval(0, jTableDatosBien.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesBien(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaBien(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesBien(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualBien(false) ;
			
			this.isEsNuevoBien=false;
			
			if(BienJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleBien();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BienConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosBienActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bienLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBien(false);
				
				//SI ES MANUAL
				if(BienJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualBien();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bienLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bienLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BienConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bienLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosBienActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoBien--;			
			//Bien bienAux= new Bien();			
			//bienAux.setId(this.iIdNuevoBien);
			
			if(this.jInternalFrameDetalleFormBien==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaBien();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysBien(this.bien);
			
			this.bien.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.bienLogic.getBiens().add(this.bienAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.biens.add(this.bienAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaBien(false);
			
			this.jTableDatosBien.setRowSelectionInterval(this.getIndiceNuevoBien(), this.getIndiceNuevoBien());
			
			int iLastRow =  this.jTableDatosBien.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosBien.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosBien.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaBien(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,BienConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionBienActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bienLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingBien(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBien(false);
			
			//SI ES MANUAL
			if(BienJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualBien();
			}
			
			//this.abrirFrameTreeBien();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bienLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bienLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,BienConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bienLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionBienActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE BienES ?", "MANTENIMIENTO DE Bien", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionBien.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralBien();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.bienReturnGeneral=bienLogic.procesarImportacionBiensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.bienParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarBienReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BienConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionBienActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionBien.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionBien.setFileImportacion(this.jInternalFrameImportacionBien.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionBien.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionBien.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionBien.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionBien.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BienConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoBienActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Bien> biensSeleccionados=new ArrayList<Bien>();		

		biensSeleccionados=this.getBiensSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoBien.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoBien.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("BienBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"BienBaseDesign.jrxml";
			
			sXmlStringFile=Funciones2.getStringFromInputStream(reportFile);
						
			bufferedWriter = new BufferedWriter(new FileWriter(sPath));
			
			
			sXmlStringFile=this.actualizarReporteDinamico(sXmlStringFile);
			
			
			bufferedWriter.write(sXmlStringFile);
			
			bufferedWriter.close();
			
			try{JasperCompileManager.compileReportToFile(sPath);}catch(Exception e){e.printStackTrace();}
			
			this.actualizarVariablesTipoReporte(false,true,false,sPath);
			
			/*
			this.esReporteDinamico=true;
			this.sPathReporteDinamico=sPath.replace(".jrxml",".jasper");
			this.sTipoReporteExtra="";
			*/
			
			this.generarReporteBiens("Todos",biensSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.bienSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Bien",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BienConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}
	}		
	
	
	public String actualizarReporteDinamico(String sXmlStringFile) {				
		Reporte reporte=new Reporte();
		Integer iAnchoMaximoVertical=535;//781,782
		Integer iAnchoMaximoHorizontal=782;
		Integer iAnchoSum=0;
		Integer iAnchoColumna=0;
		
		Integer iAnchoMargenes=60;
		String sWidthGrafico="535";
		
		for(int index:this.jInternalFrameReporteDinamicoBien.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoBien.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case BienConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case BienConstantesFunciones.LABEL_IDCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Cliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Cliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Cliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Cliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case BienConstantesFunciones.LABEL_IDTIPOBIEN:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoBien_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoBien_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoBien_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoBien_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case BienConstantesFunciones.LABEL_NUMERO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mero_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mero_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mero_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mero_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case BienConstantesFunciones.LABEL_DESCRIPCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scripcion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scripcion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scripcion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scripcion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case BienConstantesFunciones.LABEL_VALORAVALUO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lorAvaluo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lorAvaluo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lorAvaluo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lorAvaluo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case BienConstantesFunciones.LABEL_DIRECCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_reccion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_reccion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_reccion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_reccion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case BienConstantesFunciones.LABEL_ESACTIVO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Activo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Activo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Activo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Activo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;
					
				default :
					break;
			}
		}
		
		iAnchoSum+=iAnchoMargenes;
		
		if(iAnchoSum>iAnchoMaximoVertical) {
			sXmlStringFile=sXmlStringFile.replace("595", "842");
			//sXmlStringFile=sXmlStringFile.replace("842", "595");
			sXmlStringFile=sXmlStringFile.replace("535", "782");
			sXmlStringFile=sXmlStringFile.replace("Portrait", "Landscape");			
			sWidthGrafico="782";
		
		} else {
			sXmlStringFile=sXmlStringFile.replace("842", "595");
			//sXmlStringFile=sXmlStringFile.replace("595", "842");
			sXmlStringFile=sXmlStringFile.replace("782", "535");
			sXmlStringFile=sXmlStringFile.replace("Landscape", "Portrait");
			sWidthGrafico="535";
		}
		
		if(this.jInternalFrameReporteDinamicoBien.getjCheckBoxConGraficoDinamico().isSelected()) {
			sXmlStringFile=this.actualizarGraficoReporteDinamico(sXmlStringFile,sWidthGrafico);
		} else {
			sXmlStringFile=sXmlStringFile.replace("colancho_summary_colancho", "30");
		}
		
		return sXmlStringFile;
	}
	
	
	
	public String actualizarGraficoReporteDinamico(String sXmlStringFile,String sWidthGrafico) {		
		String strGrafico="";		
		String sTipo="NORMAL";
		String strCategorySeries="";
		String sNombreCampoCategoria="";
		String sNombreCampoCategoriaValor="";
		Reporte reporte=new Reporte();
		Reporte reporteCategoriaValor=new Reporte();
		Reporte reporteTipoGraficoReporte=new Reporte();
		Boolean existe=false;
		
		sXmlStringFile=sXmlStringFile.replace("colancho_summary_colancho", "280");
		
		//CATEGORIA GRAFICO				
		reporte=((Reporte)this.jInternalFrameReporteDinamicoBien.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoBien.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case BienConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case BienConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoria="id_cliente";
					break;

				case BienConstantesFunciones.LABEL_IDTIPOBIEN:
					sNombreCampoCategoria="id_tipobien";
					break;

				case BienConstantesFunciones.LABEL_NUMERO:
					sNombreCampoCategoria="numero";
					break;

				case BienConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;

				case BienConstantesFunciones.LABEL_VALORAVALUO:
					sNombreCampoCategoria="valor_avaluo";
					break;

				case BienConstantesFunciones.LABEL_DIRECCION:
					sNombreCampoCategoria="direccion";
					break;

				case BienConstantesFunciones.LABEL_ESACTIVO:
					sNombreCampoCategoria="es_activo";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoBien.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case BienConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case BienConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoriaValor="id_cliente";
					break;

				case BienConstantesFunciones.LABEL_IDTIPOBIEN:
					sNombreCampoCategoriaValor="id_tipobien";
					break;

				case BienConstantesFunciones.LABEL_NUMERO:
					sNombreCampoCategoriaValor="numero";
					break;

				case BienConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;

				case BienConstantesFunciones.LABEL_VALORAVALUO:
					sNombreCampoCategoriaValor="valor_avaluo";
					break;

				case BienConstantesFunciones.LABEL_DIRECCION:
					sNombreCampoCategoriaValor="direccion";
					break;

				case BienConstantesFunciones.LABEL_ESACTIVO:
					sNombreCampoCategoriaValor="es_activo";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoBien.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoBien.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case BienConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case BienConstantesFunciones.LABEL_IDCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cliente");
					break;

				case BienConstantesFunciones.LABEL_IDTIPOBIEN:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Bien",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipobien");
					break;

				case BienConstantesFunciones.LABEL_NUMERO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero");
					break;

				case BienConstantesFunciones.LABEL_DESCRIPCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descripcion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descripcion");
					break;

				case BienConstantesFunciones.LABEL_VALORAVALUO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor Avaluo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor_avaluo");
					break;

				case BienConstantesFunciones.LABEL_DIRECCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Direccion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"direccion");
					break;

				case BienConstantesFunciones.LABEL_ESACTIVO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Es Activo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"es_activo");
					break;
					
				default :
					break;
			}
		}
		//VALORES GRAFICO
		//if(sTipoGraficoReporte.equals("BARRAS") || sTipoGraficoReporte.equals("BARRAS_3D") || sTipoGraficoReporte.equals("BARRAS_XY") ||
		//   sTipoGraficoReporte.equals("PASTEL") || sTipoGraficoReporte.equals("PASTEL_3D") || sTipoGraficoReporte.equals("APILADO")) {
			
			existe=true;
			strGrafico=FuncionesReporte.getStringGraficoReporte(sTipoGraficoReporte,sWidthGrafico,strCategorySeries);			
		//}
		
		if(existe) {
			sXmlStringFile=sXmlStringFile.replace("<!--GRAFICO-->", strGrafico);
		}												
		
		return sXmlStringFile;
	}
	
	
	//@SuppressWarnings("deprecation")
	
	public void jButtonGenerarExcelReporteDinamicoBienActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Bien> biensSeleccionados=new ArrayList<Bien>();		
		
		biensSeleccionados=this.getBiensSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"bien";//.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		Boolean existeFilas=false;
		
		Workbook workbook = null;
		FileOutputStream fileOutputStream=null;
		Reporte reporte=new Reporte();
		
		try {
			
			if(sTipoArchivoReporte=="EXCEL2") {
				workbook = new HSSFWorkbook();
				sPath+=".xls";
			
			} else if(sTipoArchivoReporte=="EXCEL2_2") {
				workbook = new XSSFWorkbook();
				sPath+=".xlsx";			
			}
		
			Sheet sheet = workbook.createSheet("Biens");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoBien.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoBien.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case BienConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BienConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(Bien bien:biensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(bien.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case BienConstantesFunciones.LABEL_IDCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BienConstantesFunciones.LABEL_IDCLIENTE);
					iRow++;

					for(Bien bien:biensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(bien.getcliente_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case BienConstantesFunciones.LABEL_IDTIPOBIEN:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BienConstantesFunciones.LABEL_IDTIPOBIEN);
					iRow++;

					for(Bien bien:biensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(bien.gettipobien_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case BienConstantesFunciones.LABEL_NUMERO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BienConstantesFunciones.LABEL_NUMERO);
					iRow++;

					for(Bien bien:biensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(bien.getnumero());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case BienConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BienConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(Bien bien:biensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(bien.getdescripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case BienConstantesFunciones.LABEL_VALORAVALUO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BienConstantesFunciones.LABEL_VALORAVALUO);
					iRow++;

					for(Bien bien:biensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(bien.getvalor_avaluo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case BienConstantesFunciones.LABEL_DIRECCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BienConstantesFunciones.LABEL_DIRECCION);
					iRow++;

					for(Bien bien:biensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(bien.getdireccion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case BienConstantesFunciones.LABEL_ESACTIVO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BienConstantesFunciones.LABEL_ESACTIVO);
					iRow++;

					for(Bien bien:biensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(bien.getes_activo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;
					
					default :
						break;
				}
			}
			
			
			//if(conCabecera) {
			//	this.getFilaCabeceraExportarExcelBien(row);				
			//	iRow++;
			//}				
			
			//for(Bien bienAux:biensSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelBien(bienAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.bienSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Bien",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}				
	}	
	
	
	
	
	public void buscarPorId(Long idActual) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bienLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBien(false);
			
			//SI ES MANUAL
			if(BienJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualBien();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bienLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bienLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bienLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresBienActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bienLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBien(false);
			
			//SI ES MANUAL
			if(BienJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualBien();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bienLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bienLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,BienConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bienLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesBienActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bienLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBien(false);
			
			//SI ES MANUAL
			if(BienJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualBien();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bienLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bienLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,BienConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bienLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaBien() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosBien.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosBien.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosBien.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosBien.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosBien.setMinimumSize(dimensionMinimum);
		this.jTableDatosBien.setMaximumSize(dimensionMaximum);
		this.jTableDatosBien.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingBien(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingBien(esInicializar,true);
	}
	
	public void inicializarActualizarBindingBien(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaBien(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesBien(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.bienSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasBien(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesBien(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesBien(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !BienJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!BienJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualBien() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaBien();
		
		this.inicializarActualizarBindingBotonesManualBien(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.bienSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualBien();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesBien() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualBien(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualBien(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosBien.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosBien.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteBien.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormBien!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormBien.jCheckBoxPostAccionNuevoBien.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormBien.jCheckBoxPostAccionSinCerrarBien.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormBien.jCheckBoxPostAccionSinMensajeBien.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosBien.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosBien.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteBien.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormBien!=null) {
				this.jInternalFrameDetalleFormBien.jCheckBoxPostAccionNuevoBien.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormBien.jCheckBoxPostAccionSinCerrarBien.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormBien.jCheckBoxPostAccionSinMensajeBien.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionBien.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionBien.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormBien!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormBien.jComboBoxTiposAccionesFormularioBien.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesBien.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoBien!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoBien.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesBien.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesBien.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarBien.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesBien.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoBien!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoBien.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesBien.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralBien.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesBien(Boolean esInicializar) throws Exception {
		try	{	
			if(BienJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualBien(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesBien() throws Exception {
		try	{
			if(BienJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualBien();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleBien() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormBien.jComboBoxTiposAccionesFormularioBien.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormBien.jComboBoxTiposAccionesFormularioBien.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualBien() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesBien.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesBien.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesBien.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesBien.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesBien.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesBien.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionBien.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionBien.addItem(reporte);
			}
			
			
			if(!this.bienSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionBien.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionBien.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesBien.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesBien.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesBien.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesBien.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormBien!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormBien.jComboBoxTiposAccionesFormularioBien.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormBien.jComboBoxTiposAccionesFormularioBien.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarBien.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarBien.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarBien.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualBien();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualBien() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoBien!=null) {
				this.jInternalFrameReporteDinamicoBien.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoBien.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoBien!=null) {
				this.jInternalFrameReporteDinamicoBien.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoBien.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoBien!=null) {
				
				if(this.jInternalFrameReporteDinamicoBien.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoBien.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoBien.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoBien.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoBien.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoBien.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoBien.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoBien.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=BienConstantesFunciones.getTiposSeleccionarBien(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoBien.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoBien.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoBien.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=BienConstantesFunciones.getTiposSeleccionarBien(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoBien.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoBien.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoBien.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=BienConstantesFunciones.getTiposSeleccionarBien(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoBien.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoBien.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoBien.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoBien.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualBien()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_clienteFK_IdClienteBien.getSelectedItem()!=null){this.id_clienteFK_IdCliente=((Cliente)this.jComboBoxid_clienteFK_IdClienteBien.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipobienFK_IdValorClienteTipoBienBien.getSelectedItem()!=null){this.id_tipobienFK_IdValorClienteTipoBien=((TipoBien)this.jComboBoxid_tipobienFK_IdValorClienteTipoBienBien.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasBien(Boolean esInicializar) throws Exception {				
		if(BienJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualBien();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaBien() throws Exception {
		this.inicializarActualizarBindingTablaBien(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByBien() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByBien.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByBien.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByBien.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new BienPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByBien.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByBien.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new BienPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosBienOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBienOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new BienPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByBien.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByBien.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new BienPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByBien.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaBien(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=bienLogic.getBiens().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=biens.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(BienJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosBien.setModel(new BienModel(this.bienLogic.getBiens(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosBien.setModel(new BienModel(this.biens,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByBien!=null && this.jInternalFrameOrderByBien.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByBien();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosBien.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBien,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new BienPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+BienConstantesFunciones.SCLASSWEBTITULO,bienConstantesFunciones.resaltarSeleccionarBien,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+BienConstantesFunciones.SCLASSWEBTITULO,bienConstantesFunciones.resaltarSeleccionarBien,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosBien.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBien,BienConstantesFunciones.LABEL_ID));

		if(this.bienConstantesFunciones.mostraridBien && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,BienConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.bienConstantesFunciones.resaltaridBien,this.bienConstantesFunciones.activaridBien,iSizeTabla,this,true,"idBien","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.bienConstantesFunciones.resaltaridBien,this.bienConstantesFunciones.activaridBien,this,true,"idBien","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosBien.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBien,BienConstantesFunciones.LABEL_IDEMPRESA));

		if(this.bienConstantesFunciones.mostrarid_empresaBien && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,BienConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.bienConstantesFunciones.resaltarid_empresaBien,this,this.bienConstantesFunciones.activarid_empresaBien,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.bienConstantesFunciones.resaltarid_empresaBien,this,this.bienConstantesFunciones.activarid_empresaBien,false,"id_empresaBien","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new BienPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosBien.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBien,BienConstantesFunciones.LABEL_IDCLIENTE));

		if(this.bienConstantesFunciones.mostrarid_clienteBien && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,BienConstantesFunciones.LABEL_IDCLIENTE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ClienteTableCell(this.clientesForeignKey,this.bienConstantesFunciones.resaltarid_clienteBien,this,this.bienConstantesFunciones.activarid_clienteBien,iSizeTabla));
			tableColumn.setCellEditor(new ClienteTableCell(this.clientesForeignKey,this.bienConstantesFunciones.resaltarid_clienteBien,this,this.bienConstantesFunciones.activarid_clienteBien,true,"id_clienteBien","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new BienPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosBien.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBien,BienConstantesFunciones.LABEL_IDTIPOBIEN));

		if(this.bienConstantesFunciones.mostrarid_tipobienBien && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,BienConstantesFunciones.LABEL_IDTIPOBIEN,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoBienTableCell(this.tipobiensForeignKey,this.bienConstantesFunciones.resaltarid_tipobienBien,this,this.bienConstantesFunciones.activarid_tipobienBien,iSizeTabla));
			tableColumn.setCellEditor(new TipoBienTableCell(this.tipobiensForeignKey,this.bienConstantesFunciones.resaltarid_tipobienBien,this,this.bienConstantesFunciones.activarid_tipobienBien,true,"id_tipobienBien","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new BienPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosBien.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBien,BienConstantesFunciones.LABEL_NUMERO));

		if(this.bienConstantesFunciones.mostrarnumeroBien && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,BienConstantesFunciones.LABEL_NUMERO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.bienConstantesFunciones.resaltarnumeroBien,this.bienConstantesFunciones.activarnumeroBien,iSizeTabla,this,true,"numeroBien","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.bienConstantesFunciones.resaltarnumeroBien,this.bienConstantesFunciones.activarnumeroBien,this,true,"numeroBien","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new BienPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosBien.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBien,BienConstantesFunciones.LABEL_DESCRIPCION));

		if(this.bienConstantesFunciones.mostrardescripcionBien && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,BienConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.bienConstantesFunciones.resaltardescripcionBien,this.bienConstantesFunciones.activardescripcionBien,iSizeTabla,this,true,"descripcionBien","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.bienConstantesFunciones.resaltardescripcionBien,this.bienConstantesFunciones.activardescripcionBien,this,true,"descripcionBien","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new BienPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosBien.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBien,BienConstantesFunciones.LABEL_VALORAVALUO));

		if(this.bienConstantesFunciones.mostrarvalor_avaluoBien && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,BienConstantesFunciones.LABEL_VALORAVALUO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.bienConstantesFunciones.resaltarvalor_avaluoBien,this.bienConstantesFunciones.activarvalor_avaluoBien,iSizeTabla,this,true,"valor_avaluoBien","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.bienConstantesFunciones.resaltarvalor_avaluoBien,this.bienConstantesFunciones.activarvalor_avaluoBien,this,true,"valor_avaluoBien","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new BienPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosBien.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBien,BienConstantesFunciones.LABEL_DIRECCION));

		if(this.bienConstantesFunciones.mostrardireccionBien && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,BienConstantesFunciones.LABEL_DIRECCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.bienConstantesFunciones.resaltardireccionBien,this.bienConstantesFunciones.activardireccionBien,iSizeTabla,this,true,"direccionBien","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.bienConstantesFunciones.resaltardireccionBien,this.bienConstantesFunciones.activardireccionBien,this,true,"direccionBien","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new BienPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosBien.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBien,BienConstantesFunciones.LABEL_ESACTIVO));

		if(this.bienConstantesFunciones.mostrares_activoBien && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,BienConstantesFunciones.LABEL_ESACTIVO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.bienConstantesFunciones.resaltares_activoBien,this.bienConstantesFunciones.activares_activoBien,iSizeTabla));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.bienConstantesFunciones.resaltares_activoBien,this.bienConstantesFunciones.activares_activoBien,this,true,"es_activoBien","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new BienPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.bienSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			
		}
		
		if(true) {
			String sLabelColumnAccion="Editar";
			String sLabelColumnAccionEli="Eli";
			
			if(this.esParaBusquedaForeignKey)  {
				sLabelColumnAccion="Seleccionar";
				
				//LO MISMO QUE ELSE
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.bienSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.bienSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosBien.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.bienSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.bienSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosBien.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarBien && this.isPermisoGuardarCambiosBien) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.bienSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.bienSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosBien.addColumn(tableColumn);
				}
			}			
						
			
			/*
			tableColumn= new TableColumn();
			tableColumn.setIdentifier(Constantes2.S_SELECCIONAR);
			tableColumn.setHeaderValue(Constantes2.S_SELECCIONAR);
			tableColumn.setCellRenderer(new IdSeleccionarTableCell(this));
			tableColumn.setCellEditor(new IdSeleccionarTableCell(this));
			
			tableColumn.setPreferredWidth(30); 	 
			tableColumn.setWidth(30); 	 
			tableColumn.setMinWidth(30); 
			
			this.iWidthTableDefinicion+=30;
			
			this.jTableDatosBien.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarBien && this.isPermisoGuardarCambiosBien) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarBien && this.isPermisoGuardarCambiosBien) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosBien.moveColumn(this.jTableDatosBien.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosBien.moveColumn(this.jTableDatosBien.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosBien.moveColumn(this.jTableDatosBien.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosBien.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosBien.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosBien,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!BienJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosBien.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosBien.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!BienJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!BienJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosBien.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosBien.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosBien.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
			private static final long serialVersionUID = 1L;
			
		    @Override
		    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
		        final Component component= super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
		        //POR DEFECTO ES MEJOR, SE PIERDE DATOS AL SELECCIONAR BLANCO LETRAS BLANCAS
				component.setBackground(row % 2 == 0 ? FuncionesSwing.getColorTextFields(Constantes2.S_FONDOCONTROL_COLOR) : Funciones2.getColorFilaTabla2()); //FuncionesSwing.getColorTextFields(Constantes2.S_FONDOCONTROL_COLOR)
				component.setForeground(Funciones2.getColorTextoFilaTabla1());
				
				try {
		        	int iSize=-999;
		        	
		        	if(conTotales) {
						//FILA TOTALES OTRO COLOR, SI TABLA NO ES UNO A UNO
			        	if(Constantes.ISUSAEJBLOGICLAYER) {
							iSize=bienLogic.getBiens().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=biens.size()-1;
						}
						
						if(iSize==row) {
							component.setBackground(Funciones2.getColorFilaTablaTotales());
						}
		        	}
					
					//POR EFICIENCIA NO UTILIZAR					
					//if (component instanceof JComponent) {
		            //    JComponent jcomponent = (JComponent) component;		                 		                
		        	//}				
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
		        return component;
		    }
		});
		*/
		
		//ESTA EN LA DEFINICION DE LA TABLA
		//this.jTableDatosBien.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosBien.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosBien();
			
		}
	}
	
	/*
	//COPY_TABLES
	/* FALTARIA RESOLVER:
	   1 SOLO SCROLL PARA 2 TABLAS
	   COPIA EXACTA DE COLUMNAS DE UNA TABLA A OTRA, SI SE MODIFICA TAMANIO TAMBIEN LA OTRA
	*/
	
	public void jButtonIdActionPerformed(ActionEvent evt,int rowIndex,Boolean esRelaciones,Boolean esEliminar) { 
		try {
			if(!esEliminar) {
				this.estaModoSeleccionar=true;
				
				//this.isEsNuevoBien=false;
					
				BienBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.bien,new Object(),this.bienParameterGeneral,this.bienReturnGeneral);
			
				if(this.bienSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormBien==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosBien.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosBien.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bien =(Bien) this.bienLogic.getBiens().toArray()[this.jTableDatosBien.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.bien =(Bien) this.biens.toArray()[this.jTableDatosBien.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.bien.getsType().equals("DUPLICADO")
				   || this.bien.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoBien=true;
				
				} else {
					this.isEsNuevoBien=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.bienSessionBean.getEsGuardarRelacionado()) {
					if(this.bien.getId()>=0 && !this.bien.getIsNew()) {						
						this.isEsNuevoBien=false;
						
					} else {
						this.isEsNuevoBien=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoBien(esRelaciones);						
				
				this.seleccionarBien(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.bien.getId()<0) {
					this.isEsNuevoBien=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarBien(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarBien(evt,rowIndex);
				}	
				
				if(this.bienSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Bien: " + this.dDif); 
					}
				}								
				
				BienBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.bien,new Object(),this.bienParameterGeneral,this.bienReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarBien(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.bien)) {
					if(this.bien.getId()>0) {
						this.bien.setIsDeleted(true);
						
						this.biensEliminados.add(this.bien);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.bienLogic.getBiens().remove(this.bien);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.biens.remove(this.bien);				
					}
					
					
					((BienModel) this.jTableDatosBien.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaBien(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,BienConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarBien(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoBien) {
			
			if(this.jInternalFrameDetalleFormBien==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosBien.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosBien.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bien =(Bien) this.bienLogic.getBiens().toArray()[this.jTableDatosBien.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.bien =(Bien) this.biens.toArray()[this.jTableDatosBien.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(BienJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioBien(this.bien);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.bienConstantesFunciones.cargarid_empresaBien || this.bienConstantesFunciones.event_dependid_empresaBien) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.bien.getid_empresa());
									//this.inicializarActualizarBindingBien(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(bien.getEmpresa()!=null) {
							this.empresasForeignKey.add(bien.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.bien.getid_empresa(),false,"Formulario");

					//Cliente
					if(!this.bienConstantesFunciones.cargarid_clienteBien || this.bienConstantesFunciones.event_dependid_clienteBien) {
						//this.cargarCombosClientesForeignKeyLista(" where id="+this.bien.getid_cliente());
									//this.inicializarActualizarBindingBien(false,false);
						this.clientesForeignKey=new ArrayList<Cliente>();

						if(bien.getCliente()!=null) {
							this.clientesForeignKey.add(bien.getCliente());
						}

						this.addItemDefectoCombosForeignKeyCliente();
						this.cargarCombosFrameClientesForeignKey("Todos");
					}
					this.setActualClienteForeignKey(this.bien.getid_cliente(),false,"Formulario");

					//TipoBien
					if(!this.bienConstantesFunciones.cargarid_tipobienBien || this.bienConstantesFunciones.event_dependid_tipobienBien) {
						//this.cargarCombosTipoBiensForeignKeyLista(" where id="+this.bien.getid_tipobien());
									//this.inicializarActualizarBindingBien(false,false);
						this.tipobiensForeignKey=new ArrayList<TipoBien>();

						if(bien.getTipoBien()!=null) {
							this.tipobiensForeignKey.add(bien.getTipoBien());
						}

						this.addItemDefectoCombosForeignKeyTipoBien();
						this.cargarCombosFrameTipoBiensForeignKey("Todos");
					}
					this.setActualTipoBienForeignKey(this.bien.getid_tipobien(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesBien("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesBien(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualBien() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BienConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoBien(Bien bien) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoBien(bien,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoBien(Bien bien,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioBien(bien);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyBien(bien,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyBien(bien);
	}
	
	public void setVariablesObjetoActualToFormularioBien(Bien bien) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormBien==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormBien.jLabelidBien.setText(bien.getId().toString());
			this.jInternalFrameDetalleFormBien.jTextFieldnumeroBien.setText(bien.getnumero());
			this.jInternalFrameDetalleFormBien.jTextAreadescripcionBien.setText(bien.getdescripcion());
			this.jInternalFrameDetalleFormBien.jTextFieldvalor_avaluoBien.setText(bien.getvalor_avaluo().toString());
			this.jInternalFrameDetalleFormBien.jTextAreadireccionBien.setText(bien.getdireccion());
			this.jInternalFrameDetalleFormBien.jCheckBoxes_activoBien.setSelected(bien.getes_activo());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,BienConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Bien bienLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,bienLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Bien bienLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				bienLocal=this.bien;
			} else {
				bienLocal=this.bienAnterior;
			}
		}
		
		if(this.permiteMantenimiento(bienLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoBien(bienLocal,true);
					
					if(bienSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(bienLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.bienSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(bienLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoBien(Bien bien,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualBien(bien,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysBien(bien);
	}
	
	public void setVariablesFormularioToObjetoActualBien(Bien bien,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualBien(bien,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualBien(Bien bien,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormBien==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormBien.jLabelidBien.getText()==null || this.jInternalFrameDetalleFormBien.jLabelidBien.getText()=="" || this.jInternalFrameDetalleFormBien.jLabelidBien.getText()=="Id") {
				this.jInternalFrameDetalleFormBien.jLabelidBien.setText("0");
			}

			if(conColumnasBase) {bien.setId(Long.parseLong(this.jInternalFrameDetalleFormBien.jLabelidBien.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+BienConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBien.jLabelIdBien,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			bien.setnumero(this.jInternalFrameDetalleFormBien.jTextFieldnumeroBien.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+BienConstantesFunciones.LABEL_NUMERO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBien.jLabelnumeroBien,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			bien.setdescripcion(this.jInternalFrameDetalleFormBien.jTextAreadescripcionBien.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+BienConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBien.jLabeldescripcionBien,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			bien.setvalor_avaluo(Double.parseDouble(this.jInternalFrameDetalleFormBien.jTextFieldvalor_avaluoBien.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+BienConstantesFunciones.LABEL_VALORAVALUO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBien.jLabelvalor_avaluoBien,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			bien.setdireccion(this.jInternalFrameDetalleFormBien.jTextAreadireccionBien.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+BienConstantesFunciones.LABEL_DIRECCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBien.jLabeldireccionBien,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			bien.setes_activo(this.jInternalFrameDetalleFormBien.jCheckBoxes_activoBien.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+BienConstantesFunciones.LABEL_ESACTIVO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBien.jLabeles_activoBien,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,BienConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualBien(Bien bienBean,Bien bien,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && bienBean.getid_cliente()!=null && !bienBean.getid_cliente().equals(-1L))) {bien.setid_cliente(bienBean.getid_cliente());}
			if(conDefault || (!conDefault && bienBean.getid_tipobien()!=null && !bienBean.getid_tipobien().equals(-1L))) {bien.setid_tipobien(bienBean.getid_tipobien());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,BienConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosBien(Bien bienOrigen,Bien bien,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && bienOrigen.getId()!=null && !bienOrigen.getId().equals(0L))) {bien.setId(bienOrigen.getId());}}
			if(conDefault || (!conDefault && bienOrigen.getid_cliente()!=null && !bienOrigen.getid_cliente().equals(-1L))) {bien.setid_cliente(bienOrigen.getid_cliente());}
			if(conDefault || (!conDefault && bienOrigen.getid_tipobien()!=null && !bienOrigen.getid_tipobien().equals(-1L))) {bien.setid_tipobien(bienOrigen.getid_tipobien());}
			if(conDefault || (!conDefault && bienOrigen.getnumero()!=null && !bienOrigen.getnumero().equals(""))) {bien.setnumero(bienOrigen.getnumero());}
			if(conDefault || (!conDefault && bienOrigen.getdescripcion()!=null && !bienOrigen.getdescripcion().equals(""))) {bien.setdescripcion(bienOrigen.getdescripcion());}
			if(conDefault || (!conDefault && bienOrigen.getvalor_avaluo()!=null && !bienOrigen.getvalor_avaluo().equals(0.0))) {bien.setvalor_avaluo(bienOrigen.getvalor_avaluo());}
			if(conDefault || (!conDefault && bienOrigen.getdireccion()!=null && !bienOrigen.getdireccion().equals(""))) {bien.setdireccion(bienOrigen.getdireccion());}
			if(conDefault || (!conDefault && bienOrigen.getes_activo()!=null && !bienOrigen.getes_activo().equals(false))) {bien.setes_activo(bienOrigen.getes_activo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,BienConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioBien(Bien bien) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormBien.jLabelidBien.setText(bien.getId().toString());
			this.jInternalFrameDetalleFormBien.jTextFieldnumeroBien.setText(bien.getnumero());
			this.jInternalFrameDetalleFormBien.jTextAreadescripcionBien.setText(bien.getdescripcion());
			this.jInternalFrameDetalleFormBien.jTextFieldvalor_avaluoBien.setText(bien.getvalor_avaluo().toString());
			this.jInternalFrameDetalleFormBien.jTextAreadireccionBien.setText(bien.getdireccion());
			this.jInternalFrameDetalleFormBien.jCheckBoxes_activoBien.setSelected(bien.getes_activo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BienConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioBien(BienBean bienBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormBien.jLabelidBien.setText(bienBean.getId().toString());
			this.jInternalFrameDetalleFormBien.jTextFieldnumeroBien.setText(bienBean.getnumero());
			this.jInternalFrameDetalleFormBien.jTextAreadescripcionBien.setText(bienBean.getdescripcion());
			this.jInternalFrameDetalleFormBien.jTextFieldvalor_avaluoBien.setText(bienBean.getvalor_avaluo().toString());
			this.jInternalFrameDetalleFormBien.jTextAreadireccionBien.setText(bienBean.getdireccion());
			this.jInternalFrameDetalleFormBien.jCheckBoxes_activoBien.setSelected(bienBean.getes_activo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BienConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanBien(BienParameterReturnGeneral bienReturnGeneral,BienBean bienBean,Boolean conDefault) throws Exception { 
		try {
			Bien bienLocal=new Bien();
			
			bienLocal=bienReturnGeneral.getBien();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && bienLocal.getId()!=null && !bienLocal.getId().equals(0L))) {bienBean.setId(bienLocal.getId());}}
			if(conDefault || (!conDefault && bienLocal.getid_cliente()!=null && !bienLocal.getid_cliente().equals(-1L))) {bienBean.setid_cliente(bienLocal.getid_cliente());}
			if(conDefault || (!conDefault && bienLocal.getid_tipobien()!=null && !bienLocal.getid_tipobien().equals(-1L))) {bienBean.setid_tipobien(bienLocal.getid_tipobien());}
			if(conDefault || (!conDefault && bienLocal.getnumero()!=null && !bienLocal.getnumero().equals(""))) {bienBean.setnumero(bienLocal.getnumero());}
			if(conDefault || (!conDefault && bienLocal.getdescripcion()!=null && !bienLocal.getdescripcion().equals(""))) {bienBean.setdescripcion(bienLocal.getdescripcion());}
			if(conDefault || (!conDefault && bienLocal.getvalor_avaluo()!=null && !bienLocal.getvalor_avaluo().equals(0.0))) {bienBean.setvalor_avaluo(bienLocal.getvalor_avaluo());}
			if(conDefault || (!conDefault && bienLocal.getdireccion()!=null && !bienLocal.getdireccion().equals(""))) {bienBean.setdireccion(bienLocal.getdireccion());}
			if(conDefault || (!conDefault && bienLocal.getes_activo()!=null && !bienLocal.getes_activo().equals(false))) {bienBean.setes_activo(bienLocal.getes_activo());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BienConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxBienGenerico(Long idBienSeleccionado,JComboBox jComboBoxBien,List<Bien> biensLocal)throws Exception {
		try {
			Bien  bienTemp=null;

			for(Bien bienAux:biensLocal) {
				if(bienAux.getId()!=null && bienAux.getId().equals(idBienSeleccionado)) {
					bienTemp=bienAux;
					break;
				}
			}

			jComboBoxBien.setSelectedItem(bienTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxBienGenerico(JComboBox jComboBoxBien,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
		try {
			//GLOBAL(id_empresa,id_sucursal,id_ejercicio)
			//BASICO(normal)
			//CON_BUSQUEDA(Permite buscar Fk)
			
			String sKeyStrokeName="";
			KeyStroke keyStrokeControl=null;
			
			if(!sTipoBusqueda.equals("GLOBAL")) {
				
				//BUSCAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSCAR");
				
				jComboBoxBien.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxBien.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxBien.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxBien.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxBien.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxBien.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxBien.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxBien.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxBien.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxBien.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
				}
				//CON_BUSQUEDA
				
				
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	@SuppressWarnings("rawtypes")
	public void setHotKeysComboBoxGenerico(JComboBox jComboBox,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
			if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
				jComboBox.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
				jComboBox.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
			} else {
				jComboBox.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
				jComboBox.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
			}
		}
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJTextFieldGenerico(JTextField jTextField,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jTextField.addFocusListener(new TextFieldFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		jTextField.addActionListener(new TextFieldActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJTextAreaGenerico(JTextArea jTextArea,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jTextArea.addFocusListener(new TextAreaFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//NO EXISTE
		//jTextArea.addActionListener(new TextAreaActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJLabelGenerico(JLabel jLabel,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jLabel.addFocusListener(new LabelFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//NO EXISTE
		//jLabel.addActionListener(new LabelActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJCheckBoxGenerico(JCheckBox jCheckBox,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jCheckBox.addFocusListener(new CheckBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//SI SE DEFINE AL CAMBIAR VALOR, ESTE NUEVO VALOR NO SE ENVIA AL EVENTO
		//jCheckBox.addItemListener(new CheckBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJDateChooserGenerico(JDateChooser jDateChooser,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		FuncionesSwing.addDateListener(jDateChooser, jInternalFrameBase, sNombreHotKeyAbstractAction);
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJButtonGenerico(JButton jButton,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jButton.addActionListener(new ButtonActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	public void jButtonRelacionActionPerformed(String sTipo,ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado) {
		//ABRIR RELACIONES
		try {
			
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,BienConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			bien=(Bien) bienLogic.getBiens().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			bien =(Bien) biens.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!bien.getIsNew() && !bien.getIsChanged() && !bien.getIsDeleted()) {
				sDescripcion=bien.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=bien.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Cliente")) {
			//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
			if(!bien.getIsNew() && !bien.getIsChanged() && !bien.getIsDeleted()) {
				sDescripcion=bien.getcliente_descripcion();
			} else {
				//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
				sDescripcion=bien.getcliente_descripcion();
			}
		}

		if(sTipo.equals("TipoBien")) {
			//sDescripcion=this.getActualTipoBienForeignKeyDescripcion((Long)value);
			if(!bien.getIsNew() && !bien.getIsChanged() && !bien.getIsDeleted()) {
				sDescripcion=bien.gettipobien_descripcion();
			} else {
				//sDescripcion=this.getActualTipoBienForeignKeyDescripcion((Long)value);
				sDescripcion=bien.gettipobien_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Bien bienRow=new Bien();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			bienRow=(Bien) bienLogic.getBiens().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			bienRow=(Bien) biens.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualBien(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoBien.setVisible((this.isVisibilidadCeldaNuevoBien && this.isPermisoNuevoBien));			
			this.jButtonDuplicarBien.setVisible((this.isVisibilidadCeldaDuplicarBien && this.isPermisoDuplicarBien));			
			this.jButtonCopiarBien.setVisible((this.isVisibilidadCeldaCopiarBien && this.isPermisoCopiarBien));
			this.jButtonVerFormBien.setVisible((this.isVisibilidadCeldaVerFormBien && this.isPermisoVerFormBien));
			
			this.jButtonAbrirOrderByBien.setVisible((this.isVisibilidadCeldaOrdenBien && this.isPermisoOrdenBien));			
			
			this.jButtonNuevoRelacionesBien.setVisible((this.isVisibilidadCeldaNuevoRelacionesBien && this.isPermisoNuevoBien));			
			this.jButtonNuevoGuardarCambiosBien.setVisible((this.isVisibilidadCeldaNuevoBien && this.isPermisoNuevoBien && this.isPermisoGuardarCambiosBien));
			
			if(this.jInternalFrameDetalleFormBien!=null) {
			this.jInternalFrameDetalleFormBien.jButtonModificarBien.setVisible((this.isVisibilidadCeldaModificarBien && this.isPermisoActualizarBien));	
			this.jInternalFrameDetalleFormBien.jButtonActualizarBien.setVisible((this.isVisibilidadCeldaActualizarBien && this.isPermisoActualizarBien));	
			this.jInternalFrameDetalleFormBien.jButtonEliminarBien.setVisible((this.isVisibilidadCeldaEliminarBien && this.isPermisoEliminarBien));
			this.jInternalFrameDetalleFormBien.jButtonCancelarBien.setVisible(this.isVisibilidadCeldaCancelarBien);							
			this.jInternalFrameDetalleFormBien.jButtonGuardarCambiosBien.setVisible((this.isVisibilidadCeldaGuardarBien && this.isPermisoGuardarCambiosBien));			
			
			}
						
			this.jButtonGuardarCambiosTablaBien.setVisible((this.isVisibilidadCeldaGuardarCambiosBien && this.isPermisoGuardarCambiosBien));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarBien.setVisible((this.isVisibilidadCeldaNuevoBien && this.isPermisoNuevoBien));						
			this.jButtonDuplicarToolBarBien.setVisible((this.isVisibilidadCeldaDuplicarBien && this.isPermisoDuplicarBien));						
			this.jButtonCopiarToolBarBien.setVisible((this.isVisibilidadCeldaCopiarBien && this.isPermisoCopiarBien));			
			this.jButtonVerFormToolBarBien.setVisible((this.isVisibilidadCeldaVerFormBien && this.isPermisoVerFormBien));			
			this.jButtonAbrirOrderByToolBarBien.setVisible((this.isVisibilidadCeldaOrdenBien && this.isPermisoOrdenBien));
			this.jButtonNuevoRelacionesToolBarBien.setVisible((this.isVisibilidadCeldaNuevoRelacionesBien && this.isPermisoNuevoBien));			
			this.jButtonNuevoGuardarCambiosToolBarBien.setVisible((this.isVisibilidadCeldaNuevoBien && this.isPermisoNuevoBien && this.isPermisoGuardarCambiosBien));			
			
			if(this.jInternalFrameDetalleFormBien!=null) {
			this.jInternalFrameDetalleFormBien.jButtonModificarToolBarBien.setVisible((this.isVisibilidadCeldaModificarBien && this.isPermisoActualizarBien));	
			this.jInternalFrameDetalleFormBien.jButtonActualizarToolBarBien.setVisible((this.isVisibilidadCeldaActualizarBien  && this.isPermisoActualizarBien));	
			this.jInternalFrameDetalleFormBien.jButtonEliminarToolBarBien.setVisible((this.isVisibilidadCeldaEliminarBien && this.isPermisoEliminarBien));
			this.jInternalFrameDetalleFormBien.jButtonCancelarToolBarBien.setVisible(this.isVisibilidadCeldaCancelarBien);				
			this.jInternalFrameDetalleFormBien.jButtonGuardarCambiosToolBarBien.setVisible((this.isVisibilidadCeldaGuardarBien && this.isPermisoGuardarCambiosBien));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarBien.setVisible((this.isVisibilidadCeldaGuardarCambiosBien && this.isPermisoGuardarCambiosBien));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoBien.setVisible((this.isVisibilidadCeldaNuevoBien && this.isPermisoNuevoBien));			
			this.jMenuItemDuplicarBien.setVisible((this.isVisibilidadCeldaDuplicarBien && this.isPermisoDuplicarBien));			
			this.jMenuItemCopiarBien.setVisible((this.isVisibilidadCeldaCopiarBien && this.isPermisoCopiarBien));			
			this.jMenuItemVerFormBien.setVisible((this.isVisibilidadCeldaVerFormBien && this.isPermisoVerFormBien));			
			this.jMenuItemAbrirOrderByBien.setVisible((this.isVisibilidadCeldaOrdenBien && this.isPermisoOrdenBien));			
			//this.jMenuItemMostrarOcultarBien.setVisible((this.isVisibilidadCeldaOrdenBien && this.isPermisoOrdenBien));
			this.jMenuItemDetalleAbrirOrderByBien.setVisible((this.isVisibilidadCeldaOrdenBien && this.isPermisoOrdenBien));			
			//this.jMenuItemDetalleMostrarOcultarBien.setVisible((this.isVisibilidadCeldaOrdenBien && this.isPermisoOrdenBien));			
			this.jMenuItemNuevoRelacionesBien.setVisible((this.isVisibilidadCeldaNuevoRelacionesBien && this.isPermisoNuevoBien));			
			this.jMenuItemNuevoGuardarCambiosBien.setVisible((this.isVisibilidadCeldaNuevoBien && this.isPermisoNuevoBien && this.isPermisoGuardarCambiosBien));									
			
			if(this.jInternalFrameDetalleFormBien!=null) {
			this.jInternalFrameDetalleFormBien.jMenuItemModificarBien.setVisible((this.isVisibilidadCeldaModificarBien && this.isPermisoActualizarBien));	
			this.jInternalFrameDetalleFormBien.jMenuItemActualizarBien.setVisible((this.isVisibilidadCeldaActualizarBien && this.isPermisoActualizarBien));	
			this.jInternalFrameDetalleFormBien.jMenuItemEliminarBien.setVisible((this.isVisibilidadCeldaEliminarBien && this.isPermisoEliminarBien));
			this.jInternalFrameDetalleFormBien.jMenuItemCancelarBien.setVisible(this.isVisibilidadCeldaCancelarBien);				
			}
			
			this.jMenuItemGuardarCambiosBien.setVisible((this.isVisibilidadCeldaGuardarBien && this.isPermisoGuardarCambiosBien));						
			this.jMenuItemGuardarCambiosTablaBien.setVisible((this.isVisibilidadCeldaGuardarCambiosBien && this.isPermisoGuardarCambiosBien));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoBien=this.jButtonNuevoBien.isVisible();
			this.isVisibilidadCeldaDuplicarBien=this.jButtonDuplicarBien.isVisible();
			this.isVisibilidadCeldaCopiarBien=this.jButtonCopiarBien.isVisible();
			this.isVisibilidadCeldaVerFormBien=this.jButtonVerFormBien.isVisible();
			
			this.isVisibilidadCeldaOrdenBien=this.jButtonAbrirOrderByBien.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesBien=this.jButtonNuevoRelacionesBien.isVisible();
			this.isVisibilidadCeldaModificarBien=this.jButtonModificarBien.isVisible();
			
			if(this.jInternalFrameDetalleFormBien!=null) {
			this.isVisibilidadCeldaActualizarBien=this.jInternalFrameDetalleFormBien.jButtonActualizarBien.isVisible();
			this.isVisibilidadCeldaEliminarBien=this.jInternalFrameDetalleFormBien.jButtonEliminarBien.isVisible();
			this.isVisibilidadCeldaCancelarBien=this.jInternalFrameDetalleFormBien.jButtonCancelarBien.isVisible();
			this.isVisibilidadCeldaGuardarBien=this.jInternalFrameDetalleFormBien.jButtonGuardarCambiosBien.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosBien=this.jButtonGuardarCambiosTablaBien.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoBien=this.jButtonNuevoToolBarBien.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesBien=this.jButtonNuevoRelacionesToolBarBien.isVisible();
			
			if(this.jInternalFrameDetalleFormBien!=null) {
			this.isVisibilidadCeldaModificarBien=this.jInternalFrameDetalleFormBien.jButtonModificarToolBarBien.isVisible();
			this.isVisibilidadCeldaActualizarBien=this.jInternalFrameDetalleFormBien.jButtonActualizarToolBarBien.isVisible();
			this.isVisibilidadCeldaEliminarBien=this.jInternalFrameDetalleFormBien.jButtonEliminarToolBarBien.isVisible();
			this.isVisibilidadCeldaCancelarBien=this.jInternalFrameDetalleFormBien.jButtonCancelarToolBarBien.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarBien=this.jButtonGuardarCambiosToolBarBien.isVisible();
			this.isVisibilidadCeldaGuardarCambiosBien=this.jButtonGuardarCambiosTablaToolBarBien.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoBien=this.jMenuItemNuevoBien.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesBien=this.jMenuItemNuevoRelacionesBien.isVisible();
			
			if(this.jInternalFrameDetalleFormBien!=null) {
			this.isVisibilidadCeldaModificarBien=this.jInternalFrameDetalleFormBien.jMenuItemModificarBien.isVisible();
			this.isVisibilidadCeldaActualizarBien=this.jInternalFrameDetalleFormBien.jMenuItemActualizarBien.isVisible();
			this.isVisibilidadCeldaEliminarBien=this.jInternalFrameDetalleFormBien.jMenuItemEliminarBien.isVisible();
			this.isVisibilidadCeldaCancelarBien=this.jInternalFrameDetalleFormBien.jMenuItemCancelarBien.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarBien=this.jMenuItemGuardarCambiosBien.isVisible();
			this.isVisibilidadCeldaGuardarCambiosBien=this.jMenuItemGuardarCambiosTablaBien.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesBien(Boolean esInicializar) {
		if(BienJInternalFrame.ISBINDING_MANUAL) {			
			if(this.bienSessionBean.getConGuardarRelaciones()) {
				//if(this.bienSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesBien();
			}
			
			this.inicializarActualizarBindingBotonesManualBien(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualBien() {
		this.jButtonNuevoBien.setVisible(this.isPermisoNuevoBien);			
		this.jButtonDuplicarBien.setVisible(this.isPermisoDuplicarBien);			
		this.jButtonCopiarBien.setVisible(this.isPermisoCopiarBien);			
		this.jButtonVerFormBien.setVisible(this.isPermisoVerFormBien);			
		
		this.jButtonAbrirOrderByBien.setVisible(this.isPermisoOrdenBien);					
		
		this.jButtonNuevoRelacionesBien.setVisible(this.isPermisoNuevoBien);			
		
		if(this.jInternalFrameDetalleFormBien!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBien.jButtonModificarBien.setVisible(this.isPermisoActualizarBien);	
			this.jInternalFrameDetalleFormBien.jButtonActualizarBien.setVisible(this.isPermisoActualizarBien);	
			this.jInternalFrameDetalleFormBien.jButtonEliminarBien.setVisible(this.isPermisoEliminarBien);
			this.jInternalFrameDetalleFormBien.jButtonCancelarBien.setVisible(this.isVisibilidadCeldaCancelarBien);						
			this.jInternalFrameDetalleFormBien.jButtonGuardarCambiosBien.setVisible(this.isPermisoGuardarCambiosBien);							
		}
		
		this.jButtonGuardarCambiosTablaBien.setVisible(this.isPermisoActualizarBien);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleBien() {
		this.jInternalFrameDetalleFormBien.jButtonModificarBien.setVisible(this.isPermisoActualizarBien);	
		this.jInternalFrameDetalleFormBien.jButtonActualizarBien.setVisible(this.isPermisoActualizarBien);	
		this.jInternalFrameDetalleFormBien.jButtonEliminarBien.setVisible(this.isPermisoEliminarBien);
		this.jInternalFrameDetalleFormBien.jButtonCancelarBien.setVisible(this.isVisibilidadCeldaCancelarBien);							
		this.jInternalFrameDetalleFormBien.jButtonGuardarCambiosBien.setVisible((this.isVisibilidadCeldaGuardarBien && this.isPermisoGuardarCambiosBien));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosBien() {
		if(BienJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualBien();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesBien() {
	}
	
	public void jTableDatosBienListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarBien(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BienConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidBienBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bienLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBien.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBien(this.getbien(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBien(this.bien);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.bien =(Bien) this.bienLogic.getBiens().toArray()[this.jTableDatosBien.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.bien =(Bien) this.biens.toArray()[this.jTableDatosBien.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.bien==null) {
						this.bien = new Bien();
					}

					this.setVariablesFormularioToObjetoActualBien(this.bien,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBien(this.bien);
				}

				if(this.bien.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.bien.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBien(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bienLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bienLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BienConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bienLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaBienUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bienLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebBien(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBien.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosBien.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosBien.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bien =(Bien) this.bienLogic.getBiens().toArray()[this.jTableDatosBien.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.bien =(Bien) this.biens.toArray()[this.jTableDatosBien.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualBien(this.getbien(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysBien(this.bien);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.bienLogic.getConnexion());

				if(this.bien.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.bien.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderBien=(TitledBorder)this.jScrollPanelDatosBien.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderBien.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bienLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bienLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BienConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bienLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaBienBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bienLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBien.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBien(this.getbien(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBien(this.bien);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.bien =(Bien) this.bienLogic.getBiens().toArray()[this.jTableDatosBien.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.bien =(Bien) this.biens.toArray()[this.jTableDatosBien.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.bien==null) {
						this.bien = new Bien();
					}

					this.setVariablesFormularioToObjetoActualBien(this.bien,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBien(this.bien);
				}

				if(this.bien.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.bien.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBien(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bienLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bienLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BienConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bienLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_clienteBienActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {
			this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
			this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);
			this.clienteBeanSwingJInternalFrame.sTipoBusqueda="Cliente";

			if(!this.sFinalQueryGeneral_cliente.equals("")) {
				this.clienteBeanSwingJInternalFrame.setsFinalQueryGeneral(this.sFinalQueryGeneral_cliente);
				this.clienteBeanSwingJInternalFrame.sAccionBusqueda="Query";


				this.clienteBeanSwingJInternalFrame.procesarBusqueda(this.clienteBeanSwingJInternalFrame.sAccionBusqueda);
				this.clienteBeanSwingJInternalFrame.inicializarActualizarBindingCliente(false);
			}

			if(!this.sFinalQueryComboCliente.equals("") && false) {
			}


			JInternalFrameBase jinternalFrame =this.clienteBeanSwingJInternalFrame;
			jinternalFrame.setAutoscrolls(true);
			//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
			jinternalFrame.setVisible(true); 


			TitledBorder titledBorderBien=null;
			TitledBorder titledBordercliente=null;

			if(!this.jScrollPanelDatosBien.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderBien=(TitledBorder)this.jScrollPanelDatosBien.getBorder();
				titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderBien.getTitle() + " -> Cliente");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BienConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_clienteBienUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bienLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocliente=true;

			idTienePermisocliente=this.tienePermisosUsuarioEnPaginaWebBien(ClienteConstantesFunciones.CLASSNAME);

			if(idTienePermisocliente) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBien.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosBien.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosBien.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bien =(Bien) this.bienLogic.getBiens().toArray()[this.jTableDatosBien.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.bien =(Bien) this.biens.toArray()[this.jTableDatosBien.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualBien(this.getbien(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysBien(this.bien);

				this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.clienteBeanSwingJInternalFrame.getClienteLogic().setConnexion(this.bienLogic.getConnexion());

				if(this.bien.getid_cliente()!=null) {
					this.clienteBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.clienteBeanSwingJInternalFrame.setIdActual(this.bien.getid_cliente());
					this.clienteBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente();
				}

				JInternalFrameBase jinternalFrame =this.clienteBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderBien=(TitledBorder)this.jScrollPanelDatosBien.getBorder();
				TitledBorder titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderBien.getTitle() + " -> Cliente");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bienLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bienLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BienConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bienLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_clienteBienBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bienLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBien.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBien(this.getbien(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBien(this.bien);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.bien =(Bien) this.bienLogic.getBiens().toArray()[this.jTableDatosBien.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.bien =(Bien) this.biens.toArray()[this.jTableDatosBien.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.bien==null) {
						this.bien = new Bien();
					}

					this.setVariablesFormularioToObjetoActualBien(this.bien,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBien(this.bien);
				}

				if(this.bien.getid_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cliente = "+this.bien.getid_cliente().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBien(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bienLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bienLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BienConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bienLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipobienBienUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bienLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipobien=true;

			idTienePermisotipobien=this.tienePermisosUsuarioEnPaginaWebBien(TipoBienConstantesFunciones.CLASSNAME);

			if(idTienePermisotipobien) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBien.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosBien.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosBien.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bien =(Bien) this.bienLogic.getBiens().toArray()[this.jTableDatosBien.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.bien =(Bien) this.biens.toArray()[this.jTableDatosBien.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualBien(this.getbien(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysBien(this.bien);

				this.tipobienBeanSwingJInternalFrame=new TipoBienBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipobienBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipobienBeanSwingJInternalFrame.getTipoBienLogic().setConnexion(this.bienLogic.getConnexion());

				if(this.bien.getid_tipobien()!=null) {
					this.tipobienBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipobienBeanSwingJInternalFrame.setIdActual(this.bien.getid_tipobien());
					this.tipobienBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipobienBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipobienBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoBien();
				}

				JInternalFrameBase jinternalFrame =this.tipobienBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderBien=(TitledBorder)this.jScrollPanelDatosBien.getBorder();
				TitledBorder titledBordertipobien=(TitledBorder)this.tipobienBeanSwingJInternalFrame.jScrollPanelDatosTipoBien.getBorder();

				titledBordertipobien.setTitle(titledBorderBien.getTitle() + " -> Tipo Bien");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bienLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bienLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BienConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bienLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipobienBienBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bienLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBien.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBien(this.getbien(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBien(this.bien);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.bien =(Bien) this.bienLogic.getBiens().toArray()[this.jTableDatosBien.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.bien =(Bien) this.biens.toArray()[this.jTableDatosBien.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.bien==null) {
						this.bien = new Bien();
					}

					this.setVariablesFormularioToObjetoActualBien(this.bien,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBien(this.bien);
				}

				if(this.bien.getid_tipobien()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipobien = "+this.bien.getid_tipobien().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBien(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bienLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bienLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BienConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bienLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumeroBienBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bienLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBien.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBien(this.getbien(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBien(this.bien);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.bien =(Bien) this.bienLogic.getBiens().toArray()[this.jTableDatosBien.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.bien =(Bien) this.biens.toArray()[this.jTableDatosBien.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.bien==null) {
						this.bien = new Bien();
					}

					this.setVariablesFormularioToObjetoActualBien(this.bien,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBien(this.bien);
				}

				if(this.bien.getnumero()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero like '%"+this.bien.getnumero()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBien(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bienLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bienLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BienConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bienLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionBienBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bienLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBien.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBien(this.getbien(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBien(this.bien);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.bien =(Bien) this.bienLogic.getBiens().toArray()[this.jTableDatosBien.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.bien =(Bien) this.biens.toArray()[this.jTableDatosBien.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.bien==null) {
						this.bien = new Bien();
					}

					this.setVariablesFormularioToObjetoActualBien(this.bien,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBien(this.bien);
				}

				if(this.bien.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.bien.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBien(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bienLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bienLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BienConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bienLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalor_avaluoBienBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bienLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBien.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBien(this.getbien(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBien(this.bien);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.bien =(Bien) this.bienLogic.getBiens().toArray()[this.jTableDatosBien.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.bien =(Bien) this.biens.toArray()[this.jTableDatosBien.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.bien==null) {
						this.bien = new Bien();
					}

					this.setVariablesFormularioToObjetoActualBien(this.bien,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBien(this.bien);
				}

				if(this.bien.getvalor_avaluo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor_avaluo = "+this.bien.getvalor_avaluo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBien(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bienLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bienLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BienConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bienLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondireccionBienBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bienLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBien.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBien(this.getbien(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBien(this.bien);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.bien =(Bien) this.bienLogic.getBiens().toArray()[this.jTableDatosBien.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.bien =(Bien) this.biens.toArray()[this.jTableDatosBien.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.bien==null) {
						this.bien = new Bien();
					}

					this.setVariablesFormularioToObjetoActualBien(this.bien,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBien(this.bien);
				}

				if(this.bien.getdireccion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where direccion like '%"+this.bien.getdireccion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBien(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bienLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bienLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BienConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bienLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtones_activoBienBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bienLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBien.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBien(this.getbien(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBien(this.bien);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.bien =(Bien) this.bienLogic.getBiens().toArray()[this.jTableDatosBien.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.bien =(Bien) this.biens.toArray()[this.jTableDatosBien.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.bien==null) {
						this.bien = new Bien();
					}

					this.setVariablesFormularioToObjetoActualBien(this.bien,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBien(this.bien);
				}

				if(this.bien.getes_activo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where es_activo = "+this.bien.getes_activo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBien(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bienLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bienLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BienConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bienLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdClienteBienActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bienLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingBien(false,false);

			this.getBiensFK_IdCliente();

			this.inicializarActualizarBindingBien(false);

			//if(BienBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingBien(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bienLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bienLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BienConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bienLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaBienActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bienLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingBien(false,false);

			this.getBiensFK_IdEmpresa();

			this.inicializarActualizarBindingBien(false);

			//if(BienBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingBien(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bienLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bienLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BienConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bienLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdValorClienteTipoBienBienActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bienLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingBien(false,false);

			this.getBiensFK_IdValorClienteTipoBien();

			this.inicializarActualizarBindingBien(false);

			//if(BienBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingBien(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bienLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bienLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BienConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bienLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameBien() {
		if(this.jInternalFrameDetalleFormBien!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormBien!=null) {
			this.jInternalFrameDetalleFormBien.setVisible(false);	    			
			this.jInternalFrameDetalleFormBien.dispose();
			this.jInternalFrameDetalleFormBien=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoBien!=null) {
			this.jInternalFrameReporteDinamicoBien.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoBien.dispose();
			this.jInternalFrameReporteDinamicoBien=null;
		}
		
		if(this.jInternalFrameImportacionBien!=null) {
			this.jInternalFrameImportacionBien.setVisible(false);	    			
			this.jInternalFrameImportacionBien.dispose();
			this.jInternalFrameImportacionBien=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessBien();
			
			BienBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.bien,new Object(),this.bienParameterGeneral,this.bienReturnGeneral);
			
			
			if(sTipo.equals("NuevoBien")) {
				jButtonNuevoBienActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarBien")) {
				jButtonDuplicarBienActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarBien")) {
				jButtonCopiarBienActionPerformed(evt);
			} else if(sTipo.equals("VerFormBien")) {
				jButtonVerFormBienActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarBien")) {
				jButtonNuevoBienActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarBien")) {
				jButtonDuplicarBienActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoBien")) {
				jButtonNuevoBienActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarBien")) {
				jButtonDuplicarBienActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesBien")) {
				jButtonNuevoBienActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarBien")) {
				jButtonNuevoBienActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesBien")) {
				jButtonNuevoBienActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarBien")) {
				jButtonModificarBienActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarBien")) {
				jButtonModificarBienActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarBien")) {
				jButtonModificarBienActionPerformed(evt);
			} else if(sTipo.equals("ActualizarBien")) {
				jButtonActualizarBienActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarBien")) {
				jButtonActualizarBienActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarBien")) {
				jButtonActualizarBienActionPerformed(evt);
			} else if(sTipo.equals("EliminarBien")) {
				jButtonEliminarBienActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarBien")) {
				jButtonEliminarBienActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarBien")) {
				jButtonEliminarBienActionPerformed(evt);
			} else if(sTipo.equals("CancelarBien")) {
				jButtonCancelarBienActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarBien")) {
				jButtonCancelarBienActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarBien")) {
				jButtonCancelarBienActionPerformed(evt);
			} else if(sTipo.equals("CerrarBien")) {
				jButtonCerrarBienActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarBien")) {
				jButtonCerrarBienActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarBien")) {
				jButtonCerrarBienActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarBien")) {
				jButtonMostrarOcultarBienActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarBien")) {
				jButtonCancelarBienActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosBien")) {
				jButtonGuardarCambiosBienActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarBien")) {
				jButtonGuardarCambiosBienActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarBien")) {
				jButtonCopiarBienActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarBien")) {
				jButtonVerFormBienActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosBien")) {
				jButtonGuardarCambiosBienActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarBien")) {
				jButtonCopiarBienActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormBien")) {
				jButtonVerFormBienActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaBien")) {
				jButtonGuardarCambiosBienActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarBien")) {
				jButtonGuardarCambiosBienActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaBien")) {
				jButtonGuardarCambiosBienActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionBien")) {
				jButtonRecargarInformacionBienActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarBien")) {
				jButtonRecargarInformacionBienActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionBien")) {
				jButtonRecargarInformacionBienActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresBien")) {
				jButtonAnterioresBienActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarBien")) {
				jButtonAnterioresBienActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreBien")) {
				jButtonAnterioresBienActionPerformed(evt);
			} else if(sTipo.equals("SiguientesBien")) {
				jButtonSiguientesBienActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarBien")) {
				jButtonSiguientesBienActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesBien")) {
				jButtonSiguientesBienActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByBien") || sTipo.equals("MenuItemDetalleAbrirOrderByBien")) {
				jButtonAbrirOrderByBienActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarBien") || sTipo.equals("MenuItemDetalleMostrarOcultarBien")) {
				jButtonMostrarOcultarBienActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosBien")) {
				jButtonNuevoGuardarCambiosBienActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarBien")) {
				jButtonNuevoGuardarCambiosBienActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosBien")) {
				jButtonNuevoGuardarCambiosBienActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoBien")) {
				jButtonCerrarReporteDinamicoBienActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoBien")) {
				jButtonGenerarReporteDinamicoBienActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoBien")) {
				
				jButtonGenerarExcelReporteDinamicoBienActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionBien")) {
				jButtonCerrarImportacionBienActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionBien")) {
				
				jButtonGenerarImportacionBienActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionBien")) {
				
				jButtonAbrirImportacionBienActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesBien")) {
				jComboBoxTiposAccionesBienActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesBien")) {
				jComboBoxTiposRelacionesBienActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioBien")) {
				jComboBoxTiposAccionesBienActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarBien")) {
				
				jComboBoxTiposSeleccionarBienActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralBien")) {
				jTextFieldValorCampoGeneralBienActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByBien")) {
				jButtonAbrirOrderByBienActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarBien")) {
				jButtonAbrirOrderByBienActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByBien")) {
				jButtonCerrarOrderByBienActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idBienBusqueda")) {
				this.jButtonidBienBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaBienUpdate")) {
				this.jButtonid_empresaBienUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaBienBusqueda")) {
				this.jButtonid_empresaBienBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_clienteBien")) {
				this.jButtonid_clienteBienActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteBienUpdate")) {
				this.jButtonid_clienteBienUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteBienBusqueda")) {
				this.jButtonid_clienteBienBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipobienBienUpdate")) {
				this.jButtonid_tipobienBienUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipobienBienBusqueda")) {
				this.jButtonid_tipobienBienBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numeroBienBusqueda")) {
				this.jButtonnumeroBienBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionBienBusqueda")) {
				this.jButtondescripcionBienBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_avaluoBienBusqueda")) {
				this.jButtonvalor_avaluoBienBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("direccionBienBusqueda")) {
				this.jButtondireccionBienBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_activoBienBusqueda")) {
				this.jButtones_activoBienBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_clienteBien")) {
				this.jButtonid_clienteBienActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdClienteBien")) {
				this.jButtonFK_IdClienteBienActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdValorClienteTipoBienBien")) {
				this.jButtonFK_IdValorClienteTipoBienBienActionPerformed(evt);
			}
			
			;
			
			
			BienBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.bien,new Object(),this.bienParameterGeneral,this.bienReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BienConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessBien();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaBienActual();
			
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				Container containerParent=null;
				JTextField jTextField=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParent=jTextField.getParent();
						
				if(containerParent!=null && containerParent.getClass().equals(JTableMe.class)) {
					esControlTabla=true;
				}
						
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.bien);
				
				this.actualizarInformacion("INFO_PADRE",false,this.bien);
				
				BienBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bien,new Object(),this.bienParameterGeneral,this.bienReturnGeneral);
				
				


				
				BienBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bien,new Object(),this.bienParameterGeneral,this.bienReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Bien.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Bien.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,BienConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Bien bienLocal=null;
			
			if(!this.getEsControlTabla()) {
				bienLocal=this.bien;
			} else {
				bienLocal=this.bienAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BienConstantesFunciones.CLASSNAME);
  		}
		
		return existeCambio;
	}
	
	public void jTextFieldFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTBOX,sTipo)) {
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextField jTextField=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParent=jTextField.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.bien);
				
				this.actualizarInformacion("INFO_PADRE",false,this.bien);
				
				BienBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bien,new Object(),this.bienParameterGeneral,this.bienReturnGeneral);
							
				
				


				
				BienBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bien,new Object(),this.bienParameterGeneral,this.bienReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Bien.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Bien.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BienConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaBienActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosBien.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bienAnterior =(Bien) this.bienLogic.getBiens().toArray()[this.jTableDatosBien.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.bienAnterior =(Bien) this.biens.toArray()[this.jTableDatosBien.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BienConstantesFunciones.CLASSNAME);
  		}
    }	
	
	//CUANDO SE CAMBIA ALGUN FORMATO(TIPO DE LETRA,NEGRILLA,ETC)
	public void jTextFieldChangedUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			/*
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			//System.out.println("UPDATE");
			
			Boolean esControlTabla=false;
			//JTextField jTextField=null;
			Container containerParent=null;
			Component componentOpposite=null;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			BienBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bien,new Object(),this.bienParameterGeneral,this.bienReturnGeneral);
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			//jTextField=(JTextField)evt.getSource();
			
			containerParent=jTextField.getParent();
					
			componentOpposite=null;//evt.getOppositeComponent();
			
			if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
				|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
			) {					
				esControlTabla=true;
			}
			
			this.esControlTabla=esControlTabla;
			
			


			
			BienBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bien,new Object(),this.bienParameterGeneral,this.bienReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BienConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BienConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BienConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaBienActual();
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				Container containerParent=null;
				Container containerParentAux=null;
				JFormattedTextField JFormattedTextField=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				JFormattedTextField=(JFormattedTextField)evt.getSource();
				
				containerParentAux=JFormattedTextField.getParent();
				
				if(containerParentAux!=null && containerParentAux.getClass().equals(JDateChooser.class)) {
					containerParent=containerParentAux.getParent();
				}
				
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.bien);
				
				this.actualizarInformacion("INFO_PADRE",false,this.bien);
				
				BienBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bien,new Object(),this.bienParameterGeneral,this.bienReturnGeneral);
								
						
				


				
				BienBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bien,new Object(),this.bienParameterGeneral,this.bienReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Bien.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Bien.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BienConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTBOX,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextField jTextField=null;
				Container containerParent=null;
				Container containerParentAux=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParentAux=jTextField.getParent();
						
				if(containerParentAux!=null && containerParentAux.getClass().equals(JDateChooser.class)) {
					containerParent=containerParentAux.getParent();
				}
				
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.bien);
				
				this.actualizarInformacion("INFO_PADRE",false,this.bien);
				
				BienBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bien,new Object(),this.bienParameterGeneral,this.bienReturnGeneral);
								
				
				


				
				BienBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bien,new Object(),this.bienParameterGeneral,this.bienReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Bien.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Bien.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BienConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaBienActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosBien.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bienAnterior =(Bien) this.bienLogic.getBiens().toArray()[this.jTableDatosBien.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.bienAnterior =(Bien) this.biens.toArray()[this.jTableDatosBien.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BienConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.bien);
				
				this.actualizarInformacion("INFO_PADRE",false,this.bien);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BienConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaBienActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosBien.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bienAnterior =(Bien) this.bienLogic.getBiens().toArray()[this.jTableDatosBien.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.bienAnterior =(Bien) this.biens.toArray()[this.jTableDatosBien.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BienConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaBienActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.bien);
			
			this.actualizarInformacion("INFO_PADRE",false,this.bien);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BienConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jTextAreaFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTAREA,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextArea jTextArea=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextArea=(JTextArea)evt.getSource();
				
				containerParent=jTextArea.getParent();
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.bien);
				
				this.actualizarInformacion("INFO_PADRE",false,this.bien);
				
				BienBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bien,new Object(),this.bienParameterGeneral,this.bienReturnGeneral);
							
				
				


				
				BienBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bien,new Object(),this.bienParameterGeneral,this.bienReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Bien.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Bien.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BienConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaBienActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosBien.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.bienAnterior =(Bien) this.bienLogic.getBiens().toArray()[this.jTableDatosBien.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.bienAnterior =(Bien) this.biens.toArray()[this.jTableDatosBien.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BienConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaChangedUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			/*
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			//System.out.println("UPDATE");
			
			Boolean esControlTabla=false;
			//JTextArea jTextArea=null;
			Container containerParent=null;
			Component componentOpposite=null;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			BienBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bien,new Object(),this.bienParameterGeneral,this.bienReturnGeneral);
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			//jTextArea=(JTextArea)evt.getSource();
			
			containerParent=jTextArea.getParent();
			componentOpposite=null;//evt.getOppositeComponent();
			
			if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
				|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
			) {
				esControlTabla=true;
			}
			
			this.esControlTabla=esControlTabla;
			
			


			
			BienBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bien,new Object(),this.bienParameterGeneral,this.bienReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BienConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BienConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BienConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaBienActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.bien);
			
			this.actualizarInformacion("INFO_PADRE",false,this.bien);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BienConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JLabel jLabel=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jLabel=(JLabel)evt.getSource();
				
				containerParent=jLabel.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.bien);
				
				this.actualizarInformacion("INFO_PADRE",false,this.bien);
				
				BienBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bien,new Object(),this.bienParameterGeneral,this.bienReturnGeneral);
								
				
				


				
				BienBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bien,new Object(),this.bienParameterGeneral,this.bienReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Bien.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Bien.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BienConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaBienActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosBien.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bienAnterior =(Bien) this.bienLogic.getBiens().toArray()[this.jTableDatosBien.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.bienAnterior =(Bien) this.biens.toArray()[this.jTableDatosBien.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BienConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaBienActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.bien);
			
			this.actualizarInformacion("INFO_PADRE",false,this.bien);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BienConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaBienActual();
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JCheckBox jCheckBox=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
							
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jCheckBox=(JCheckBox)evt.getSource();
				
				containerParent=jCheckBox.getParent();
						
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.bien);
				
				this.actualizarInformacion("INFO_PADRE",false,this.bien);
				
				BienBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.bien,new Object(),this.bienParameterGeneral,this.bienReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosBien")) {
					jCheckBoxSeleccionarTodosBienItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosBien")) {
					jCheckBoxSeleccionadosBienItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarBien")) {
					
				}
				
				


				
				
				BienBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.bien,new Object(),this.bienParameterGeneral,this.bienReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Bien.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Bien.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BienConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.CHECKBOX,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JCheckBox jCheckBox=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jCheckBox=(JCheckBox)evt.getSource();
				
				containerParent=jCheckBox.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.bien);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.bien);
				
				BienBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.bien,new Object(),this.bienParameterGeneral,this.bienReturnGeneral);
												
				
				


				
				
				BienBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.bien,new Object(),this.bienParameterGeneral,this.bienReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Bien.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Bien.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BienConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaBienActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosBien.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.bienAnterior =(Bien) this.bienLogic.getBiens().toArray()[this.jTableDatosBien.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.bienAnterior =(Bien) this.biens.toArray()[this.jTableDatosBien.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BienConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaBienActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.bien);
				
				this.actualizarInformacion("INFO_PADRE",false,this.bien);
				
				BienBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.bien,new Object(),this.bienParameterGeneral,this.bienReturnGeneral);
				
				
				BienBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.bien,new Object(),this.bienParameterGeneral,this.bienReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BienConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO SE UTILIZA, SE USA EL DE ABAJO, IGUAL SE DEJA EL CODIGO COMO RESPALDO Y ES CASI IGUAL
	//ERROR:SI SE USA,AL HACER CLIC EN EL MISMO ELEMENTO O EJECUTAR SELECTEDITEM, SIEMPRE SE EJECUTA COMO SI ESCOGIERA OTRO ELEMENTO(NO DEBERIA)
	//@SuppressWarnings("rawtypes")
	public void jComboBoxActionPerformedGeneral(String sTipo,ActionEvent evt) {		
		try {
			/*		
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			Container containerParent=null;
			Component componentOpposite=null;
			Boolean esControlTabla=false;
				
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			BienBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.bien,new Object(),this.bienParameterGeneral,this.bienReturnGeneral);
			JComboBox jComboBoxGenerico=null;						
			
			if(evt.getSource().getClass().equals(JComboBox.class)
				|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
					
				jComboBoxGenerico=(JComboBox)evt.getSource();
				
				containerParent=jComboBoxGenerico.getParent();
				
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
			}
			
			String sFinalQueryCombo="";
			
			


			
			BienBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bien,new Object(),this.bienParameterGeneral,this.bienReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BienConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaBienActual();
			
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
			
			
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				Container containerParent=null;
				Component componentOpposite=null;
				Boolean esControlTabla=false;
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				JComboBox jComboBoxGenerico=null;						
				
				if(evt.getSource().getClass().equals(JComboBox.class)
					|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
						
					jComboBoxGenerico=(JComboBox)evt.getSource();
					
					containerParent=jComboBoxGenerico.getParent();
					
					componentOpposite=null;//evt.getOppositeComponent();
					
					if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
					) {					
						esControlTabla=true;
					}		
					
					this.esControlTabla=esControlTabla;
				}
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.bien);
				
				this.actualizarInformacion("INFO_PADRE",false,this.bien);
				
				BienBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.bien,new Object(),this.bienParameterGeneral,this.bienReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				BienBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bien,new Object(),this.bienParameterGeneral,this.bienReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Bien.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Bien.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BienConstantesFunciones.CLASSNAME);
  		}
    }
	
	//@SuppressWarnings("rawtypes")
	public void jComboBoxFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		//MANEJADO EN ITEMLISTENER
		/*
		try {
			if(this.permiteManejarEventosControl()) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				
				//if(this.esUsoDesdeHijo) {
				//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				//}
				
				
				Container containerParent=null;
				Component componentOpposite=null;
				Boolean esControlTabla=false;
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.bien);
				
				this.actualizarInformacion("INFO_PADRE",false,this.bien);
				
				BienBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.bien,new Object(),this.bienParameterGeneral,this.bienReturnGeneral);
				JComboBox jComboBoxGenerico=null;						
				
				if(evt.getSource().getClass().equals(JComboBox.class)
					|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
						
					jComboBoxGenerico=(JComboBox)evt.getSource();
					
					containerParent=jComboBoxGenerico.getParent();
					
					componentOpposite=evt.getOppositeComponent();
					
					if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
					) {					
						esControlTabla=true;
					}
					
					this.esControlTabla=esControlTabla;
				}
				
				String sFinalQueryCombo="";
				
				


				
				BienBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bien,new Object(),this.bienParameterGeneral,this.bienReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Bien.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Bien.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BienConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaBienActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosBien.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bienAnterior =(Bien) this.bienLogic.getBiens().toArray()[this.jTableDatosBien.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.bienAnterior =(Bien) this.biens.toArray()[this.jTableDatosBien.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BienConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				BienBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bien,new Object(),this.bienParameterGeneral,this.bienReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarBien")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosBienListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosBien.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.bien =(Bien) this.bienLogic.getBiens().toArray()[this.jTableDatosBien.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.bien =(Bien) this.biens.toArray()[this.jTableDatosBien.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.bien);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarBien")) {
				
				}
				
				BienBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bien,new Object(),this.bienParameterGeneral,this.bienReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BienConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			BienBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.bien,new Object(),this.bienParameterGeneral,this.bienReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarBien")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosBien.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarBien")) {
			
			}
			
			BienBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.bien,new Object(),this.bienParameterGeneral,this.bienReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BienConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessBien();
			
			BienBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.bien,new Object(),this.bienParameterGeneral,this.bienReturnGeneral);
			
			if(sTipo.equals("NuevoBien")) {
				jButtonNuevoBienActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarBien")) {
				jButtonDuplicarBienActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarBien")) {
				jButtonCopiarBienActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormBien")) {
				jButtonVerFormBienActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesBien")) {
				jButtonNuevoBienActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarBien")) {
				jButtonModificarBienActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarBien")) {
				jButtonActualizarBienActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarBien")) {
				jButtonEliminarBienActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaBien")) {
				jButtonGuardarCambiosBienActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarBien")) {
				jButtonCancelarBienActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarBien")) {
				jButtonCerrarBienActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosBien")) {
				jButtonGuardarCambiosBienActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosBien")) {
				jButtonNuevoGuardarCambiosBienActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByBien")) {
				jButtonAbrirOrderByBienActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionBien")) {
				jButtonRecargarInformacionBienActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresBien")) {
				jButtonAnterioresBienActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesBien")) {
				jButtonSiguientesBienActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idBienBusqueda")) {
				this.jButtonidBienBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaBienUpdate")) {
				this.jButtonid_empresaBienUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaBienBusqueda")) {
				this.jButtonid_empresaBienBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_clienteBien")) {
				this.jButtonid_clienteBienActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteBienUpdate")) {
				this.jButtonid_clienteBienUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteBienBusqueda")) {
				this.jButtonid_clienteBienBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipobienBienUpdate")) {
				this.jButtonid_tipobienBienUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipobienBienBusqueda")) {
				this.jButtonid_tipobienBienBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numeroBienBusqueda")) {
				this.jButtonnumeroBienBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionBienBusqueda")) {
				this.jButtondescripcionBienBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_avaluoBienBusqueda")) {
				this.jButtonvalor_avaluoBienBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("direccionBienBusqueda")) {
				this.jButtondireccionBienBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_activoBienBusqueda")) {
				this.jButtones_activoBienBusquedaActionPerformed(evt);
			}
			
			BienBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.bien,new Object(),this.bienParameterGeneral,this.bienReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BienConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessBien();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			BienBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.bien,new Object(),this.bienParameterGeneral,this.bienReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameBien")) {
				closingInternalFrameBien();
				
			} else if(sTipo.equals("jButtonCancelarBien")) {
				JInternalFrameBase jInternalFrameDetalleFormBien = (JInternalFrameBase)evt.getSource();
	            	
	            BienBeanSwingJInternalFrame jInternalFrameParent=(BienBeanSwingJInternalFrame)jInternalFrameDetalleFormBien.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarBienActionPerformed(null);
			}
			
			BienBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.bien,new Object(),this.bienParameterGeneral,this.bienReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BienConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormBien(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormBien(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormBien(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.bien)) {
			if(!esControlTabla) {
				if(BienJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualBien(this.bien,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysBien(this.bien);			
				}
				
				if(this.bienSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualBien(this.bien,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.bienReturnGeneral=bienLogic.procesarEventosBiensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.bienLogic.getBiens(),this.bien,this.bienParameterGeneral,this.isEsNuevoBien,classes);//this.bienLogic.getBien()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanBien(this.bienReturnGeneral,this.bienBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.bienSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanBien(classes,this.bienReturnGeneral,this.bienBean,false);
					}
						
					if(this.bienReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyBien(this.bienReturnGeneral.getBien());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioBien(this.bienReturnGeneral.getBien());	
					}
						
					if(this.bienReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioBien(this.bienReturnGeneral.getBien(),classes);//this.bienBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioBien(this.bien,classes);//this.bienBean);									
				}
			
				if(BienJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualBien(this.bien,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysBien(this.bien);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.bienAnterior!=null) {
						this.bien=this.bienAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.bienReturnGeneral=bienLogic.procesarEventosBiensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.bienLogic.getBiens(),this.bien,this.bienParameterGeneral,this.isEsNuevoBien,classes);//this.bienLogic.getBien()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.bienSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.bienSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.bienReturnGeneral.getBien(),bienLogic.getBiens());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.bienReturnGeneral.getBien(),this.biens);
				}
				//ARCHITECTURE
				
				//this.jTableDatosBien.repaint();
				
				//((AbstractTableModel) this.jTableDatosBien.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosBien();
			}
		}
	}
	
	public void actualizarVisualTableDatosBien() throws Exception {
		
		BienModel bienModel=(BienModel)this.jTableDatosBien.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			bienModel.biens=this.bienLogic.getBiens();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			bienModel.biens=this.biens;
		}
		
		
		((BienModel) this.jTableDatosBien.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaBien() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getbienAnterior(),this.bienLogic.getBiens());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getbienAnterior(),this.biens);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosBien();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioBien(Bien bien,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BienConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setEventoParentGeneral(Boolean esUsoDesdeHijo,String sDominio,String sDominioTipo,String sTipo,String sTipoGeneral,Boolean esControlTabla,Boolean conIrServidorAplicacion,
						Long id,Component control, EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,ArrayList<String> arrClasses,
						Object evt,GeneralEntityParameterReturnGeneral generalEntityParameterGeneral,Object otro) { 	  
		try {
			
			if(this.permiteManejarEventosControl()) {
				
				//BASE COPIADO DESDE TEXTFIELLOSTFOCUS
				
				//EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				Boolean conTodasRelaciones=false;
				
				this.esUsoDesdeHijo=esUsoDesdeHijo;
										
				BienBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.bien,new Object(),generalEntityParameterGeneral,this.bienReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.bienSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=BienConstantesFunciones.getClassesRelationshipsOfBien(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=BienConstantesFunciones.getClassesRelationshipsFromStringsOfBien(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormBien(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				BienBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.bien,new Object(),generalEntityParameterGeneral,this.bienReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BienConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioBien(BienBean bienBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BienConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanBien(ArrayList<Classe> classes,BienReturnGeneral bienReturnGeneral,BienBean bienBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualBien(Bien bien,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.bien)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormBien = new BienDetalleFormJInternalFrame(jDesktopPane,this.bienSessionBean.getConGuardarRelaciones(),this.bienSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormBien);
		this.jInternalFrameDetalleFormBien.setVisible(false);
		this.jInternalFrameDetalleFormBien.setSelected(false);						
		
		this.jInternalFrameDetalleFormBien.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormBien.bienLogic=this.bienLogic;
		
		this.cargarCombosFrameForeignKeyBien("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleBien();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleBien();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyBien("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyBien();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormBien.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarBien"));
		
		this.jInternalFrameDetalleFormBien.jButtonModificarBien.addActionListener(new ButtonActionListener(this,"ModificarBien"));

		
		this.jInternalFrameDetalleFormBien.jButtonModificarToolBarBien.addActionListener(new ButtonActionListener(this,"ModificarToolBarBien"));
					
		this.jInternalFrameDetalleFormBien.jMenuItemModificarBien.addActionListener(new ButtonActionListener(this,"MenuItemModificarBien"));		
		
		
		
		this.jInternalFrameDetalleFormBien.jButtonActualizarBien.addActionListener (new ButtonActionListener(this,"ActualizarBien"));
		
		
		this.jInternalFrameDetalleFormBien.jButtonActualizarToolBarBien.addActionListener(new ButtonActionListener(this,"ActualizarToolBarBien"));
						
		this.jInternalFrameDetalleFormBien.jMenuItemActualizarBien.addActionListener (new ButtonActionListener(this,"MenuItemActualizarBien"));		
		
		
		
		this.jInternalFrameDetalleFormBien.jButtonEliminarBien.addActionListener (new ButtonActionListener(this,"EliminarBien"));
		
		
		this.jInternalFrameDetalleFormBien.jButtonEliminarToolBarBien.addActionListener (new ButtonActionListener(this,"EliminarToolBarBien"));
								
		this.jInternalFrameDetalleFormBien.jMenuItemEliminarBien.addActionListener (new ButtonActionListener(this,"MenuItemEliminarBien"));		
		
		
		
		this.jInternalFrameDetalleFormBien.jButtonCancelarBien.addActionListener (new ButtonActionListener(this,"CancelarBien"));
		
		
		this.jInternalFrameDetalleFormBien.jButtonCancelarToolBarBien.addActionListener (new ButtonActionListener(this,"CancelarToolBarBien"));
					
		this.jInternalFrameDetalleFormBien.jMenuItemCancelarBien.addActionListener (new ButtonActionListener(this,"MenuItemCancelarBien"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormBien.jMenuItemDetalleCerrarBien.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarBien"));		
		
		
		
		this.jInternalFrameDetalleFormBien.jButtonGuardarCambiosToolBarBien.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarBien"));
		
		
		
		this.jInternalFrameDetalleFormBien.jButtonGuardarCambiosToolBarBien.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarBien"));
		
		
		
		this.jInternalFrameDetalleFormBien.jComboBoxTiposAccionesFormularioBien.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioBien"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBien.jButtonidBienBusqueda.addActionListener(new ButtonActionListener(this,"idBienBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBien.jButtonid_empresaBienUpdate.addActionListener(new ButtonActionListener(this,"id_empresaBienUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBien.jButtonid_empresaBienBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaBienBusqueda"));
		//jButtonid_clienteBien.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteBienActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormBien.jButtonid_clienteBien.addActionListener(new ButtonActionListener(this,"id_clienteBien"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBien.jButtonid_clienteBienUpdate.addActionListener(new ButtonActionListener(this,"id_clienteBienUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBien.jButtonid_clienteBienBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteBienBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBien.jButtonid_tipobienBienUpdate.addActionListener(new ButtonActionListener(this,"id_tipobienBienUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBien.jButtonid_tipobienBienBusqueda.addActionListener(new ButtonActionListener(this,"id_tipobienBienBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBien.jButtonnumeroBienBusqueda.addActionListener(new ButtonActionListener(this,"numeroBienBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBien.jButtondescripcionBienBusqueda.addActionListener(new ButtonActionListener(this,"descripcionBienBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBien.jButtonvalor_avaluoBienBusqueda.addActionListener(new ButtonActionListener(this,"valor_avaluoBienBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBien.jButtondireccionBienBusqueda.addActionListener(new ButtonActionListener(this,"direccionBienBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBien.jButtones_activoBienBusqueda.addActionListener(new ButtonActionListener(this,"es_activoBienBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormBien.jTabbedPaneRelacionesBien.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesBien"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameBien"));
		
		if(this.jInternalFrameDetalleFormBien!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBien.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarBien"));
		}
		
		this.jTableDatosBien.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarBien"));
		
		this.jTableDatosBien.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarBien"));
		
		this.jButtonNuevoBien.addActionListener(new ButtonActionListener(this,"NuevoBien"));
		
		this.jButtonDuplicarBien.addActionListener(new ButtonActionListener(this,"DuplicarBien"));
		
		this.jButtonCopiarBien.addActionListener(new ButtonActionListener(this,"CopiarBien"));
		
		this.jButtonVerFormBien.addActionListener(new ButtonActionListener(this,"VerFormBien"));
		
		
		this.jButtonNuevoToolBarBien.addActionListener(new ButtonActionListener(this,"NuevoToolBarBien"));
			
		this.jButtonDuplicarToolBarBien.addActionListener(new ButtonActionListener(this,"DuplicarToolBarBien"));
			
		this.jMenuItemNuevoBien.addActionListener (new ButtonActionListener(this,"MenuItemNuevoBien"));
			
		this.jMenuItemDuplicarBien.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarBien"));		
		
		
		this.jButtonNuevoRelacionesBien.addActionListener (new ButtonActionListener(this,"NuevoRelacionesBien"));
		
		
		this.jButtonNuevoRelacionesToolBarBien.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarBien"));
			
		this.jMenuItemNuevoRelacionesBien.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesBien"));		
		
		
		if(this.jInternalFrameDetalleFormBien!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBien.jButtonModificarBien.addActionListener(new ButtonActionListener(this,"ModificarBien"));
		}
		
		
		if(this.jInternalFrameDetalleFormBien!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBien.jButtonModificarToolBarBien.addActionListener(new ButtonActionListener(this,"ModificarToolBarBien"));
			
			this.jInternalFrameDetalleFormBien.jMenuItemModificarBien.addActionListener(new ButtonActionListener(this,"MenuItemModificarBien"));		
		}
		
		
		if(this.jInternalFrameDetalleFormBien!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormBien.jButtonActualizarBien.addActionListener (new ButtonActionListener(this,"ActualizarBien"));
		}
		
		
		if(this.jInternalFrameDetalleFormBien!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBien.jButtonActualizarToolBarBien.addActionListener(new ButtonActionListener(this,"ActualizarToolBarBien"));
				
			this.jInternalFrameDetalleFormBien.jMenuItemActualizarBien.addActionListener (new ButtonActionListener(this,"MenuItemActualizarBien"));		
		}
		
		
		if(this.jInternalFrameDetalleFormBien!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBien.jButtonEliminarBien.addActionListener (new ButtonActionListener(this,"EliminarBien"));
		}
		
		
		if(this.jInternalFrameDetalleFormBien!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBien.jButtonEliminarToolBarBien.addActionListener (new ButtonActionListener(this,"EliminarToolBarBien"));
						
			this.jInternalFrameDetalleFormBien.jMenuItemEliminarBien.addActionListener (new ButtonActionListener(this,"MenuItemEliminarBien"));		
		}
		
		
		if(this.jInternalFrameDetalleFormBien!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBien.jButtonCancelarBien.addActionListener (new ButtonActionListener(this,"CancelarBien"));
		}
		
		
		if(this.jInternalFrameDetalleFormBien!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBien.jButtonCancelarToolBarBien.addActionListener (new ButtonActionListener(this,"CancelarToolBarBien"));
			
			this.jInternalFrameDetalleFormBien.jMenuItemCancelarBien.addActionListener (new ButtonActionListener(this,"MenuItemCancelarBien"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarBien.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarBien"));		
		
		
		this.jButtonCerrarBien.addActionListener (new ButtonActionListener(this,"CerrarBien"));
		
		
		this.jButtonCerrarToolBarBien.addActionListener (new ButtonActionListener(this,"CerrarToolBarBien"));
			
		this.jMenuItemCerrarBien.addActionListener (new ButtonActionListener(this,"MenuItemCerrarBien"));
			
		if(this.jInternalFrameDetalleFormBien!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBien.jMenuItemDetalleCerrarBien.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarBien"));		
		}
		
		
		if(this.jInternalFrameDetalleFormBien!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBien.jButtonGuardarCambiosBien.addActionListener (new ButtonActionListener(this,"GuardarCambiosBien"));
		}
		
		
		if(this.jInternalFrameDetalleFormBien!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBien.jButtonGuardarCambiosToolBarBien.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarBien"));
		}
		
		this.jButtonCopiarToolBarBien.addActionListener (new ButtonActionListener(this,"CopiarToolBarBien"));
			
		this.jButtonVerFormToolBarBien.addActionListener (new ButtonActionListener(this,"VerFormToolBarBien"));
		
		this.jMenuItemGuardarCambiosBien.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosBien"));
			
		this.jMenuItemCopiarBien.addActionListener (new ButtonActionListener(this,"MenuItemCopiarBien"));		
		
		this.jMenuItemVerFormBien.addActionListener (new ButtonActionListener(this,"MenuItemVerFormBien"));		
		
		
		this.jButtonGuardarCambiosTablaBien.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaBien"));
		
		
		this.jButtonGuardarCambiosTablaToolBarBien.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarBien"));
			
		this.jMenuItemGuardarCambiosTablaBien.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaBien"));		
		
		
		
		this.jButtonRecargarInformacionBien.addActionListener (new ButtonActionListener(this,"RecargarInformacionBien"));
					
		this.jButtonRecargarInformacionToolBarBien.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarBien"));
		
		this.jMenuItemRecargarInformacionBien.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionBien"));		
		
		
		
		this.jButtonAnterioresBien.addActionListener (new ButtonActionListener(this,"AnterioresBien"));
		
		
		this.jButtonAnterioresToolBarBien.addActionListener (new ButtonActionListener(this,"AnterioresToolBarBien"));
		
		this.jMenuItemAnterioresBien.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresBien"));		
		
		
		this.jButtonSiguientesBien.addActionListener (new ButtonActionListener(this,"SiguientesBien"));
		
		
		this.jButtonSiguientesToolBarBien.addActionListener (new ButtonActionListener(this,"SiguientesToolBarBien"));
			
		this.jMenuItemSiguientesBien.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesBien"));
			
		this.jMenuItemAbrirOrderByBien.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByBien"));
			
		this.jMenuItemMostrarOcultarBien.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarBien"));
			
		this.jMenuItemDetalleAbrirOrderByBien.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByBien"));
			
		this.jMenuItemDetalleMostarOcultarBien.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarBien"));		
		
		
		this.jButtonNuevoGuardarCambiosBien.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosBien"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarBien.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarBien"));
			
		this.jMenuItemNuevoGuardarCambiosBien.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosBien"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosBien.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosBien"));

		this.jCheckBoxSeleccionadosBien.addItemListener(new CheckBoxItemListener(this,"SeleccionadosBien"));
		
		if(this.jInternalFrameDetalleFormBien!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBien.jComboBoxTiposAccionesFormularioBien.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioBien"));
		}
		
		
		this.jComboBoxTiposRelacionesBien.addActionListener (new ButtonActionListener(this,"TiposRelacionesBien"));
			
		this.jComboBoxTiposAccionesBien.addActionListener (new ButtonActionListener(this,"TiposAccionesBien"));
					
		this.jComboBoxTiposSeleccionarBien.addActionListener (new ButtonActionListener(this,"TiposSeleccionarBien"));
			
		this.jTextFieldValorCampoGeneralBien.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralBien"));		
		
		
		if(this.jInternalFrameDetalleFormBien!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBien.jButtonidBienBusqueda.addActionListener(new ButtonActionListener(this,"idBienBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBien.jButtonid_empresaBienUpdate.addActionListener(new ButtonActionListener(this,"id_empresaBienUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBien.jButtonid_empresaBienBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaBienBusqueda"));
		//jButtonid_clienteBien.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteBienActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormBien.jButtonid_clienteBien.addActionListener(new ButtonActionListener(this,"id_clienteBien"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBien.jButtonid_clienteBienUpdate.addActionListener(new ButtonActionListener(this,"id_clienteBienUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBien.jButtonid_clienteBienBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteBienBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBien.jButtonid_tipobienBienUpdate.addActionListener(new ButtonActionListener(this,"id_tipobienBienUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBien.jButtonid_tipobienBienBusqueda.addActionListener(new ButtonActionListener(this,"id_tipobienBienBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBien.jButtonnumeroBienBusqueda.addActionListener(new ButtonActionListener(this,"numeroBienBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBien.jButtondescripcionBienBusqueda.addActionListener(new ButtonActionListener(this,"descripcionBienBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBien.jButtonvalor_avaluoBienBusqueda.addActionListener(new ButtonActionListener(this,"valor_avaluoBienBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBien.jButtondireccionBienBusqueda.addActionListener(new ButtonActionListener(this,"direccionBienBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBien.jButtones_activoBienBusqueda.addActionListener(new ButtonActionListener(this,"es_activoBienBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdClienteBien.addActionListener(new ButtonActionListener(this,"FK_IdClienteBien"));

			this.jButtonBuscarFK_IdClienteid_clienteBien.addActionListener(new ButtonActionListener(this,"id_clienteBien"));

			this.jButtonFK_IdValorClienteTipoBienBien.addActionListener(new ButtonActionListener(this,"FK_IdValorClienteTipoBienBien"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoBien!=null) {
				this.jInternalFrameReporteDinamicoBien.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoBien"));
				this.jInternalFrameReporteDinamicoBien.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoBien"));
				this.jInternalFrameReporteDinamicoBien.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoBien"));
			}
			
			//this.jButtonCerrarReporteDinamicoBien.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoBien"));				
			//this.jButtonGenerarReporteDinamicoBien.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoBien"));
			//this.jButtonGenerarExcelReporteDinamicoBien.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoBien"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionBien!=null) {
				this.jInternalFrameImportacionBien.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionBien"));
				this.jInternalFrameImportacionBien.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionBien"));
				this.jInternalFrameImportacionBien.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionBien"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByBien.addActionListener (new ButtonActionListener(this,"AbrirOrderByBien"));
			
			this.jButtonAbrirOrderByToolBarBien.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarBien"));			
			
			if(this.jInternalFrameOrderByBien!=null) {
				this.jInternalFrameOrderByBien.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByBien"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormBien!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormBien!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBien.jTabbedPaneRelacionesBien.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesBien"));
		
		;
		}
		//TABBED PANE RELACIONES FIN(EXTRA TAB)		
	}
	
	/*
	public void initActions() {
		String sMapKey = "";
		InputMap inputMap =null;
		
		this.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
            public void internalFrameClosing(InternalFrameEvent event) {          	
            	try {
            		closingInternalFrameBien();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormBien.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormBien = (JInternalFrameBase)event.getSource();
	            	
	            BienBeanSwingJInternalFrame jInternalFrameParent=(BienBeanSwingJInternalFrame)jInternalFrameDetalleFormBien.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarBienActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosBien.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosBienListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosBien.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosBien.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoBien.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoBienActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarBien.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoBienActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoBien.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoBienActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoBien";
		inputMap = this.jButtonNuevoBien.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoBien.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoBienActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesBien.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoBienActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarBien.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoBienActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesBien.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoBienActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesBien";
		inputMap = this.jButtonNuevoRelacionesBien.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesBien.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoBienActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarBien.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarBienActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarBien.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarBienActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarBien.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarBienActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarBien";
		inputMap = this.jButtonModificarBien.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarBien.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarBienActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarBien.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarBienActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarBien.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarBienActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarBien.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarBienActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarBien";
		inputMap = this.jButtonActualizarBien.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarBien.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarBienActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarBien.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarBienActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarBien.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarBienActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarBien.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarBienActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarBien";
		inputMap = this.jButtonEliminarBien.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarBien.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarBienActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarBien.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarBienActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarBien.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarBienActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarBien.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarBienActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarBien";
		inputMap = this.jButtonCancelarBien.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarBien.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarBienActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarBien.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarBienActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarBien.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarBienActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarBien.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarBienActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarBien.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarBienActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarBienActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarBien";
		inputMap = this.jButtonCerrarBien.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarBien.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarBienActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormBien.jButtonGuardarCambiosBien.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosBienActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarBien.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosBienActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosBien.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosBienActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaBien.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosBienActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarBien.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosBienActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaBien.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosBienActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosBien";
		inputMap = this.jInternalFrameDetalleFormBien.jButtonGuardarCambiosBien.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormBien.jButtonGuardarCambiosBien.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosBienActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionBien.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionBienActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarBien.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionBienActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionBien.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionBienActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresBien.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresBienActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarBien.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresBienActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresBien.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresBienActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesBien.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesBienActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarBien.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesBienActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesBien.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesBienActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosBien.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosBienActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarBien.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosBienActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosBien.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosBienActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosBien.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosBienItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesBien.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesBienActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarBien.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarBienActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralBien.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralBienActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBien.jButtonidBienBusqueda.addActionListener(new ButtonActionListener(this,"idBienBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBien.jButtonid_empresaBienUpdate.addActionListener(new ButtonActionListener(this,"id_empresaBienUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBien.jButtonid_empresaBienBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaBienBusqueda"));
		//jButtonid_clienteBien.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteBienActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormBien.jButtonid_clienteBien.addActionListener(new ButtonActionListener(this,"id_clienteBien"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBien.jButtonid_clienteBienUpdate.addActionListener(new ButtonActionListener(this,"id_clienteBienUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBien.jButtonid_clienteBienBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteBienBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBien.jButtonid_tipobienBienUpdate.addActionListener(new ButtonActionListener(this,"id_tipobienBienUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBien.jButtonid_tipobienBienBusqueda.addActionListener(new ButtonActionListener(this,"id_tipobienBienBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBien.jButtonnumeroBienBusqueda.addActionListener(new ButtonActionListener(this,"numeroBienBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBien.jButtondescripcionBienBusqueda.addActionListener(new ButtonActionListener(this,"descripcionBienBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBien.jButtonvalor_avaluoBienBusqueda.addActionListener(new ButtonActionListener(this,"valor_avaluoBienBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBien.jButtondireccionBienBusqueda.addActionListener(new ButtonActionListener(this,"direccionBienBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBien.jButtones_activoBienBusqueda.addActionListener(new ButtonActionListener(this,"es_activoBienBusqueda"));
		
		
		this.jButtonFK_IdClienteBien.addActionListener(new ButtonActionListener(this,"FK_IdClienteBien"));

		this.jButtonBuscarFK_IdClienteid_clienteBien.addActionListener(new ButtonActionListener(this,"id_clienteBien"));

		this.jButtonFK_IdValorClienteTipoBienBien.addActionListener(new ButtonActionListener(this,"FK_IdValorClienteTipoBienBien"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoBien.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoBienActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoBien.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoBienActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoBien.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoBienActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionBien.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionBienActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionBien.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionBienActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionBien.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionBienActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarBienActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarBien.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BienConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosBien(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Bien bienAux:this.bienLogic.getBiens()) {
					bienAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Bien bienAux:biens) {
					bienAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BienConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosBienItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingBien(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Bien bienAux:this.bienLogic.getBiens()) {
						bienAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Bien bienAux:biens) {
						bienAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Bien bienAux:this.bienLogic.getBiens()) {
					
						if(sTipoSeleccionar.equals(BienConstantesFunciones.LABEL_ESACTIVO)) {
							existe=true;
							bienAux.setes_activo(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Bien bienAux:biens) {
						
						if(sTipoSeleccionar.equals(BienConstantesFunciones.LABEL_ESACTIVO)) {
							existe=true;
							bienAux.setes_activo(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaBien(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosBien.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosBien.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosBien,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BienConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosBienItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingBien(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosBien.getSelectedRows();
			
			Bien bienLocal=new Bien();
			
			//this.seleccionarTodosBien(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					bienLocal =(Bien) this.bienLogic.getBiens().toArray()[this.jTableDatosBien.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					bienLocal =(Bien) this.biens.toArray()[this.jTableDatosBien.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				bienLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Bien bienAux:this.bienLogic.getBiens()) {
						bienAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Bien bienAux:biens) {
						bienAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaBien(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosBien.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosBien.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosBien,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BienConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualBienItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BienConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarBienParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BienConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralBienActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingBien(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralBien.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Bien bienAux:this.bienLogic.getBiens()) {
				
						if(sTipoSeleccionar.equals(BienConstantesFunciones.LABEL_NUMERO)) {
							existe=true;
							bienAux.setnumero(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(BienConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							bienAux.setdescripcion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(BienConstantesFunciones.LABEL_VALORAVALUO)) {
							existe=true;
							bienAux.setvalor_avaluo(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(BienConstantesFunciones.LABEL_DIRECCION)) {
							existe=true;
							bienAux.setdireccion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Bien bienAux:biens) {
					
						if(sTipoSeleccionar.equals(BienConstantesFunciones.LABEL_NUMERO)) {
							existe=true;
							bienAux.setnumero(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(BienConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							bienAux.setdescripcion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(BienConstantesFunciones.LABEL_VALORAVALUO)) {
							existe=true;
							bienAux.setvalor_avaluo(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(BienConstantesFunciones.LABEL_DIRECCION)) {
							existe=true;
							bienAux.setdireccion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaBien(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BienConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesBienActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingBien(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioBien=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesBien.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormBien.jComboBoxTiposAccionesFormularioBien.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteBien) {				
					conSplash=true;//false;										
					
					//this.startProcessBien(conSplash);
				
					this.generarReporteBiensSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesBien.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormBien.jComboBoxTiposAccionesFormularioBien.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoBiensSeleccionados();
				//this.jComboBoxTiposAccionesBien.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoBiensSeleccionados(false);
				//this.jComboBoxTiposAccionesBien.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoBiensSeleccionados(true);
				//this.jComboBoxTiposAccionesBien.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessBien();
				
				this.exportarBiensSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesBien.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormBien.jComboBoxTiposAccionesFormularioBien.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionBiens();
				//this.importarBiens();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesBien.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormBien.jComboBoxTiposAccionesFormularioBien.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessBien();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelBiensSeleccionados();
				//this.jComboBoxTiposAccionesBien.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Bien", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessBien();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoBien)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyBien(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Bien",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesBien.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormBien.jComboBoxTiposAccionesFormularioBien.setSelectedIndex(0);					
				}	
			} 			
			else if(BienBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteBien) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessBien(conSplash);
					
						//this.actualizarParametrosGeneralBien();
						
						this.generarReporteProcesoAccionBiensSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesBien.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormBien.jComboBoxTiposAccionesFormularioBien.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(BienBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO BienES SELECCIONADOS?", "MANTENIMIENTO DE Bien", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessBien();
				
						this.actualizarParametrosGeneralBien();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.bienReturnGeneral=bienLogic.procesarAccionBiensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.bienLogic.getBiens(),this.bienParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarBienReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesBien.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormBien.jComboBoxTiposAccionesFormularioBien.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralBien();
					
					BienBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarBienReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesBien.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormBien.jComboBoxTiposAccionesFormularioBien.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,BienConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessBien(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesBienActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessBien();
			
			if(this.jInternalFrameDetalleFormBien==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Bien> biensSeleccionados=new ArrayList<Bien>();		
			Bien bien=new Bien();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingBien(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesBien.getSelectedItem();
			
			
			
			
			biensSeleccionados=this.getBiensSeleccionados(true);
			//this.sTipoAccion;
			
			if(biensSeleccionados.size()==1) {
				for(Bien bienAux:biensSeleccionados) {
					bien=bienAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BienConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessBien();
			
      		//this.finishProcessBien(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarBienReturnGeneral() throws Exception {
		if(this.bienReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.bienReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.bienReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.bienReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.bienReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.bienReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingBien(false);
		}
		
		if(this.bienReturnGeneral.getConRetornoLista() || this.bienReturnGeneral.getConRetornoObjeto()) {
			if(this.bienReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.bienLogic.setBiens(this.bienReturnGeneral.getBiens());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.bienReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.bienLogic.setBien(this.bienReturnGeneral.getBien());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingBien(false);
		}
	}
	
	public void actualizarParametrosGeneralBien() throws Exception {
		
		
	}
	
	public ArrayList<Bien> getBiensSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Bien> biensSeleccionados=new ArrayList<Bien>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioBien) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Bien bienAux:bienLogic.getBiens()) {
					if(bienAux.getIsSelected()) {
						biensSeleccionados.add(bienAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Bien bienAux:this.biens) {
					if(bienAux.getIsSelected()) {
						biensSeleccionados.add(bienAux);				
					}
				}
			}
			
			if(biensSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						biensSeleccionados.addAll(this.bienLogic.getBiens());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						biensSeleccionados.addAll(this.biens);				
					}
				}
			}
		} else {
			biensSeleccionados.add(this.bien);
		}
		
		return biensSeleccionados;
	}
	
	public void actualizarVariablesTipoReporte(Boolean esReporteNormal,Boolean esReporteDinamico,Boolean esReporteAccionProceso,String sPath) {
		if(esReporteNormal) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=false;
			this.sPathReporteDinamico="";
			this.esReporteAccionProceso=false;
			
		} else if(esReporteAccionProceso) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=false;
			this.sPathReporteDinamico="";
			this.esReporteAccionProceso=true;
			
		} else if(esReporteDinamico) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=true;
			this.esReporteAccionProceso=false;
			this.sPathReporteDinamico=sPath.replace(".jrxml",".jasper");			
		}
	}
	
	public void generarReporteBiensSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalBiensSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoBiensSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoBiensSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoBiensSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Bien",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesBiensSeleccionados() throws Exception {
		ArrayList<Bien> biensSeleccionados=new ArrayList<Bien>();		
		
		biensSeleccionados=this.getBiensSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteBiens("Todos",biensSeleccionados);
		
	}	
	
	public void generarReporteNormalBiensSeleccionados() throws Exception {
		ArrayList<Bien> biensSeleccionados=new ArrayList<Bien>();		
		
		biensSeleccionados=this.getBiensSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteBiens("Todos",biensSeleccionados);
	}		
	
	public void generarReporteProcesoAccionBiensSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Bien> biensSeleccionados=new ArrayList<Bien>();
		
		biensSeleccionados=this.getBiensSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteBiens("Todos",biensSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoBiensSeleccionados() throws Exception {
		ArrayList<Bien> biensSeleccionados=new ArrayList<Bien>();		
		
		
		this.abrirInicializarFrameReporteDinamicoBien();
		
		
		biensSeleccionados=this.getBiensSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoBien();
		
		
		//this.generarReporteBiens("Todos",biensSeleccionados ,bienImplementable,bienImplementableHome);
	}
	
	public void mostrarImportacionBiens() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionBien();
		
		this.abrirFrameImportacionBien();		
		
			
		//this.generarReporteBiens("Todos",biensSeleccionados ,bienImplementable,bienImplementableHome);
	}
	
	public void importarBiens() throws Exception {		
	
	}
	
	public void exportarBiensSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelBiensSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoBiensSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlBiensSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Bien",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoBiensSeleccionados() throws Exception {
		ArrayList<Bien> biensSeleccionados=new ArrayList<Bien>();		
		
		biensSeleccionados=this.getBiensSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"bien."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarBien(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Bien bienAux:biensSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarBien(bienAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//bienAux.setsDetalleGeneralEntityReporte(bienAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.bienSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Bien",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarBien(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=BienConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BienConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BienConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BienConstantesFunciones.LABEL_IDCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BienConstantesFunciones.LABEL_IDTIPOBIEN;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BienConstantesFunciones.LABEL_NUMERO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BienConstantesFunciones.LABEL_DESCRIPCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BienConstantesFunciones.LABEL_VALORAVALUO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BienConstantesFunciones.LABEL_DIRECCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BienConstantesFunciones.LABEL_ESACTIVO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarBien(Bien bien,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=bien.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=bien.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=bien.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=bien.getcliente_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=bien.gettipobien_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=bien.getnumero();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=bien.getdescripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=bien.getvalor_avaluo().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=bien.getdireccion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=bien.getes_activo().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelBiensSeleccionados() throws Exception {
		ArrayList<Bien> biensSeleccionados=new ArrayList<Bien>();		
		
		biensSeleccionados=this.getBiensSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"bien.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Biens");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelBien(row);				
				iRow++;
			}				
			
			for(Bien bienAux:biensSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelBien(bienAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.bienSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Bien",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlBiensSeleccionados() throws Exception {
		ArrayList<Bien> biensSeleccionados=new ArrayList<Bien>();		
		
		biensSeleccionados=this.getBiensSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"bien.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("biens");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("bien");
			//elementRoot.appendChild(element);
		
			for(Bien bienAux:biensSeleccionados) {
				element = document.createElement("bien");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlBien(bienAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.bienSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Bien",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelBien(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(BienConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(BienConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(BienConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(BienConstantesFunciones.LABEL_IDCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(BienConstantesFunciones.LABEL_IDTIPOBIEN);
		cell = row.createCell(iColumn++);cell.setCellValue(BienConstantesFunciones.LABEL_NUMERO);
		cell = row.createCell(iColumn++);cell.setCellValue(BienConstantesFunciones.LABEL_DESCRIPCION);
		cell = row.createCell(iColumn++);cell.setCellValue(BienConstantesFunciones.LABEL_VALORAVALUO);
		cell = row.createCell(iColumn++);cell.setCellValue(BienConstantesFunciones.LABEL_DIRECCION);
		cell = row.createCell(iColumn++);cell.setCellValue(BienConstantesFunciones.LABEL_ESACTIVO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelBien(Bien bien,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(bien.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(bien.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(bien.getcliente_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(bien.gettipobien_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(bien.getnumero());
		cell = row.createCell(iColumn++);cell.setCellValue(bien.getdescripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(bien.getvalor_avaluo());
		cell = row.createCell(iColumn++);cell.setCellValue(bien.getdireccion());
		cell = row.createCell(iColumn++);cell.setCellValue(bien.getes_activo());				
	}
	
	public void setFilaDatosExportarXmlBien(Bien bien,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(BienConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(bien.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(BienConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(bien.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(BienConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(bien.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcliente_descripcion = document.createElement(BienConstantesFunciones.IDCLIENTE);
		elementcliente_descripcion.appendChild(document.createTextNode(bien.getcliente_descripcion()));
		element.appendChild(elementcliente_descripcion);

		Element elementtipobien_descripcion = document.createElement(BienConstantesFunciones.IDTIPOBIEN);
		elementtipobien_descripcion.appendChild(document.createTextNode(bien.gettipobien_descripcion()));
		element.appendChild(elementtipobien_descripcion);

		Element elementnumero = document.createElement(BienConstantesFunciones.NUMERO);
		elementnumero.appendChild(document.createTextNode(bien.getnumero().trim()));
		element.appendChild(elementnumero);

		Element elementdescripcion = document.createElement(BienConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(bien.getdescripcion().trim()));
		element.appendChild(elementdescripcion);

		Element elementvalor_avaluo = document.createElement(BienConstantesFunciones.VALORAVALUO);
		elementvalor_avaluo.appendChild(document.createTextNode(bien.getvalor_avaluo().toString().trim()));
		element.appendChild(elementvalor_avaluo);

		Element elementdireccion = document.createElement(BienConstantesFunciones.DIRECCION);
		elementdireccion.appendChild(document.createTextNode(bien.getdireccion().trim()));
		element.appendChild(elementdireccion);

		Element elementes_activo = document.createElement(BienConstantesFunciones.ESACTIVO);
		elementes_activo.appendChild(document.createTextNode(bien.getes_activo().toString().trim()));
		element.appendChild(elementes_activo);
	}
	
	public void generarReporteGroupGenericoBiensSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Bien> biensSeleccionados=new ArrayList<Bien>();
		
		biensSeleccionados=this.getBiensSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		if(!soloTotales) {
			this.sTipoReporteExtra=Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO;
		} else {
			this.sTipoReporteExtra=Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO;
		}
		
		this.setColumnaDescripcionReporteGroupGenericoBien(biensSeleccionados);
		
		this.generarReporteBiens("Todos",biensSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoBien(ArrayList<Bien> biensSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Bien bienAux:biensSeleccionados) {
				bienAux.setsDetalleGeneralEntityReporte(bienAux.toString());
			
				if(sTipoSeleccionar.equals(BienConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					bienAux.setsDescripcionGeneralEntityReporte1(bienAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(BienConstantesFunciones.LABEL_IDCLIENTE)) {
					existe=true;
					bienAux.setsDescripcionGeneralEntityReporte1(bienAux.getcliente_descripcion());
				}
				 else if(sTipoSeleccionar.equals(BienConstantesFunciones.LABEL_IDTIPOBIEN)) {
					existe=true;
					bienAux.setsDescripcionGeneralEntityReporte1(bienAux.gettipobien_descripcion());
				}
				 else if(sTipoSeleccionar.equals(BienConstantesFunciones.LABEL_NUMERO)) {
					existe=true;
					bienAux.setsDescripcionGeneralEntityReporte1(bienAux.getnumero());
				}
				 else if(sTipoSeleccionar.equals(BienConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					bienAux.setsDescripcionGeneralEntityReporte1(bienAux.getdescripcion());
				}
				 else if(sTipoSeleccionar.equals(BienConstantesFunciones.LABEL_DIRECCION)) {
					existe=true;
					bienAux.setsDescripcionGeneralEntityReporte1(bienAux.getdireccion());
				}
				 else if(sTipoSeleccionar.equals(BienConstantesFunciones.LABEL_ESACTIVO)) {
					existe=true;
					bienAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(bienAux.getes_activo()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BienConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesBien(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoBien=true;
				this.isVisibilidadCeldaNuevoRelacionesBien=true;
				this.isVisibilidadCeldaGuardarCambiosBien=true;
			}
			
			this.isVisibilidadCeldaModificarBien=false;
			this.isVisibilidadCeldaActualizarBien=false;
			this.isVisibilidadCeldaEliminarBien=false;
			this.isVisibilidadCeldaCancelarBien=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarBien=true;
				} else {
					this.isVisibilidadCeldaGuardarBien=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoBien=false;
			this.isVisibilidadCeldaNuevoRelacionesBien=false;
			this.isVisibilidadCeldaGuardarCambiosBien=false;
			this.isVisibilidadCeldaModificarBien=false;
			this.isVisibilidadCeldaActualizarBien=true;
			this.isVisibilidadCeldaEliminarBien=false;
			this.isVisibilidadCeldaCancelarBien=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarBien=true;
				} else {
					this.isVisibilidadCeldaGuardarBien=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoBien=false;
			this.isVisibilidadCeldaNuevoRelacionesBien=false;
			this.isVisibilidadCeldaGuardarCambiosBien=false;
			this.isVisibilidadCeldaModificarBien=false;
			this.isVisibilidadCeldaActualizarBien=true;
			this.isVisibilidadCeldaEliminarBien=true;
			this.isVisibilidadCeldaCancelarBien=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarBien=true;
				} else {
					this.isVisibilidadCeldaGuardarBien=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoBien=false;
			this.isVisibilidadCeldaNuevoRelacionesBien=false;
			this.isVisibilidadCeldaGuardarCambiosBien=false;
			this.isVisibilidadCeldaModificarBien=false;
			this.isVisibilidadCeldaActualizarBien=true;
			this.isVisibilidadCeldaEliminarBien=false;
			this.isVisibilidadCeldaCancelarBien=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarBien=false;
				} else {
					this.isVisibilidadCeldaGuardarBien=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoBien=true;
			this.isVisibilidadCeldaNuevoRelacionesBien=true;
			this.isVisibilidadCeldaGuardarCambiosBien=true;
			this.isVisibilidadCeldaModificarBien=false;
			this.isVisibilidadCeldaActualizarBien=false;
			this.isVisibilidadCeldaEliminarBien=false;
			this.isVisibilidadCeldaCancelarBien=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarBien=true;
				} else {
					this.isVisibilidadCeldaGuardarBien=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoBien=false;
			this.isVisibilidadCeldaNuevoRelacionesBien=false;
			this.isVisibilidadCeldaGuardarCambiosBien=false;
			this.isVisibilidadCeldaActualizarBien=false;
			this.isVisibilidadCeldaEliminarBien=false;
			this.isVisibilidadCeldaCancelarBien=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarBien=false;
				} else {
					this.isVisibilidadCeldaGuardarBien=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoBien=false;
			this.isVisibilidadCeldaNuevoRelacionesBien=false;
			this.isVisibilidadCeldaGuardarCambiosBien=false;
			this.isVisibilidadCeldaModificarBien=true;
			this.isVisibilidadCeldaActualizarBien=false;
			this.isVisibilidadCeldaEliminarBien=false;
			this.isVisibilidadCeldaCancelarBien=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarBien=false;
				} else {
					this.isVisibilidadCeldaGuardarBien=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(BienJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoBien=true;
			this.isVisibilidadCeldaNuevoRelacionesBien=true;
			this.isVisibilidadCeldaGuardarCambiosBien=true;
		} else {
			this.actualizarEstadoPanelsBien(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarBien=false;
			//this.isVisibilidadCeldaVerFormBien=false;
			this.isVisibilidadCeldaDuplicarBien=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!bienSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesBien=false;
		} else {
			this.isVisibilidadCeldaNuevoBien=false;
			this.isVisibilidadCeldaGuardarCambiosBien=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(bienSessionBean.getEsGuardarRelacionado()) {
			if(!bienSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesBien=false;												
			}
			
			this.jButtonCerrarBien.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesBien=false;
		}
		
		if(!this.permiteMantenimiento(this.bien)) {
			this.isVisibilidadCeldaActualizarBien=false;
			this.isVisibilidadCeldaEliminarBien=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesBien() {
	}
	
	public void actualizarEstadoPanelsBien(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionBien!=null) {
				this.jScrollPanelDatosEdicionBien.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasBien!=null) {
				this.jTabbedPaneBusquedasBien.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosBien!=null) {
				this.jScrollPanelDatosBien.setVisible(true);
			}
			
			if(this.jPanelPaginacionBien!=null) {
				this.jPanelPaginacionBien.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesBien!=null) {
				this.jPanelParametrosReportesBien.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionBien!=null) {
				this.jScrollPanelDatosEdicionBien.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasBien!=null) {
				this.jTabbedPaneBusquedasBien.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosBien!=null) {
				this.jScrollPanelDatosBien.setVisible(false);
			}
			
			if(this.jPanelPaginacionBien!=null) {
				this.jPanelPaginacionBien.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesBien!=null) {
				this.jPanelParametrosReportesBien.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionBien!=null) {
				this.jScrollPanelDatosEdicionBien.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasBien!=null) {
				this.jTabbedPaneBusquedasBien.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosBien!=null) {
				this.jScrollPanelDatosBien.setVisible(false);
			}
			
			if(this.jPanelPaginacionBien!=null) {
				this.jPanelPaginacionBien.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesBien!=null) {
				this.jPanelParametrosReportesBien.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionBien!=null) {
				this.jScrollPanelDatosEdicionBien.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasBien!=null) {
				this.jTabbedPaneBusquedasBien.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosBien!=null) {
				this.jScrollPanelDatosBien.setVisible(false);
			}
			
			if(this.jPanelPaginacionBien!=null) {
				this.jPanelPaginacionBien.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesBien!=null) {
				this.jPanelParametrosReportesBien.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionBien!=null) {
				this.jScrollPanelDatosEdicionBien.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasBien!=null) {
				this.jTabbedPaneBusquedasBien.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosBien!=null) {
				this.jScrollPanelDatosBien.setVisible(true);
			}
			
			if(this.jPanelPaginacionBien!=null) {
				this.jPanelPaginacionBien.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesBien!=null) {
				this.jPanelParametrosReportesBien.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionBien!=null) {
				this.jScrollPanelDatosEdicionBien.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasBien!=null) {
				this.jTabbedPaneBusquedasBien.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosBien!=null) {
				this.jScrollPanelDatosBien.setVisible(true);
			}
			
			if(this.jPanelPaginacionBien!=null) {
				this.jPanelPaginacionBien.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesBien!=null) {
				this.jPanelParametrosReportesBien.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionBien!=null) {
				this.jScrollPanelDatosEdicionBien.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasBien!=null) {
				this.jTabbedPaneBusquedasBien.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosBien!=null) {
				this.jScrollPanelDatosBien.setVisible(true);
			}
			
			if(this.jPanelPaginacionBien!=null) {
				this.jPanelPaginacionBien.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesBien!=null) {
				this.jPanelParametrosReportesBien.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.bienSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasBien!=null) {
					this.jTabbedPaneBusquedasBien.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesBien!=null) {
				this.jPanelParametrosReportesBien.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.bienSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasBien!=null) {
				this.jTabbedPaneBusquedasBien.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesBien!=null) {
				this.jPanelParametrosReportesBien.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdCliente=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasBien.remove(jPanelFK_IdClienteBien);}

			this.isVisibilidadFK_IdValorClienteTipoBien=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdValorClienteTipoBien) {this.jTabbedPaneBusquedasBien.remove(jPanelFK_IdValorClienteTipoBienBien);}
		}
		
	}

	public void setVisibilidadBusquedasParaCliente(Boolean isParaCliente){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaClienteNegation=!isParaCliente;

			this.isVisibilidadFK_IdCliente=isParaCliente;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasBien.remove(jPanelFK_IdClienteBien);}

			this.isVisibilidadFK_IdValorClienteTipoBien=isParaClienteNegation;
			if(!this.isVisibilidadFK_IdValorClienteTipoBien) {this.jTabbedPaneBusquedasBien.remove(jPanelFK_IdValorClienteTipoBienBien);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoBien(Boolean isParaTipoBien){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoBienNegation=!isParaTipoBien;

			this.isVisibilidadFK_IdCliente=isParaTipoBienNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasBien.remove(jPanelFK_IdClienteBien);}

			this.isVisibilidadFK_IdValorClienteTipoBien=isParaTipoBien;
			if(!this.isVisibilidadFK_IdValorClienteTipoBien) {this.jTabbedPaneBusquedasBien.remove(jPanelFK_IdValorClienteTipoBienBien);}
		}
		
	}
	
	
	
	

	public String registrarSesionBienParaBusquedaClientes() throws Exception {
		Boolean isPaginaPopupCliente=false;

		try {

			if(bienSessionBean==null) {
				bienSessionBean=new BienSessionBean();
			}

			if(clienteSessionBean==null) {
				clienteSessionBean=new ClienteSessionBean();
			}

			clienteSessionBean.setsPathNavegacionActual(bienSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ClienteConstantesFunciones.SCLASSWEBTITULO);
			clienteSessionBean.setisPermiteRecargarInformacion(false);
			clienteSessionBean.setisPaginaPopup(true);
			isPaginaPopupCliente=clienteSessionBean.getisPaginaPopup();
			clienteSessionBean.setisPaginaPopup(false);
			clienteSessionBean.setEstaModoBusqueda(true);
			clienteSessionBean.setsFuncionBusquedaRapida("window.opener.bienFuncionGeneral.setCombosCodigoDesdeBusquedaid_cliente(TO_REPLACE);");
			clienteSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCliente(true);
			clienteSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCliente(BienConstantesFunciones.SNOMBREOPCION);
			//clienteSessionBean.setisBusquedaDesdeForeignKeySesionBien(true);
			//clienteSessionBean.setlidBienActual(this.idBienActual);

			bienSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyBien(true);
			bienSessionBean.setlIdBienActualForeignKey(this.idBienActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//BienSessionBean bienSessionBean=new BienSessionBean();
		
		if(this.bienSessionBean==null) {
			this.bienSessionBean=new BienSessionBean();
		}
		
		this.bienSessionBean.setsUltimaBusquedaBien(this.getsAccionBusqueda());
		this.bienSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.bienSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdCliente")) {
			bienSessionBean.setid_cliente(this.getid_clienteFK_IdCliente());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			bienSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdValorClienteTipoBien")) {
			bienSessionBean.setid_tipobien(this.getid_tipobienFK_IdValorClienteTipoBien());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//BienSessionBean bienSessionBean=new BienSessionBean();
		
		if(this.bienSessionBean==null) {
			this.bienSessionBean=new BienSessionBean();
		}
		
		if(this.bienSessionBean.getsUltimaBusquedaBien()!=null&&!this.bienSessionBean.getsUltimaBusquedaBien().equals("")) {
			this.setsAccionBusqueda(bienSessionBean.getsUltimaBusquedaBien());
			this.setiNumeroPaginacion(bienSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(bienSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdCliente")) {
				this.setid_clienteFK_IdCliente(bienSessionBean.getid_cliente());
				bienSessionBean.setid_cliente(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(bienSessionBean.getid_empresa());
				bienSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdValorClienteTipoBien")) {
				this.setid_tipobienFK_IdValorClienteTipoBien(bienSessionBean.getid_tipobien());
				bienSessionBean.setid_tipobien(-1L);
			}
		}
		
		this.bienSessionBean.setsUltimaBusquedaBien("");
		this.bienSessionBean.setiNumeroPaginacion(BienConstantesFunciones.INUMEROPAGINACION);
		this.bienSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaBien(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioBien() {
		this.updateBorderResaltarBusquedasFormularioBien();
		this.updateVisibilidadBusquedasFormularioBien();
		this.updateHabilitarBusquedasFormularioBien();
	}
	
	public void updateBorderResaltarBusquedasFormularioBien() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasBien.getComponents().length>0) {
	

		if(this.bienConstantesFunciones.resaltarFK_IdClienteBien!=null) {
			index= this.jTabbedPaneBusquedasBien.indexOfComponent(this.jPanelFK_IdClienteBien);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasBien.getComponent(index);
				jPanel.setBorder(this.bienConstantesFunciones.resaltarFK_IdClienteBien);
			}
		}

		if(this.bienConstantesFunciones.resaltarFK_IdValorClienteTipoBienBien!=null) {
			index= this.jTabbedPaneBusquedasBien.indexOfComponent(this.jPanelFK_IdValorClienteTipoBienBien);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasBien.getComponent(index);
				jPanel.setBorder(this.bienConstantesFunciones.resaltarFK_IdValorClienteTipoBienBien);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioBien() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasBien.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasBien.indexOfComponent(this.jPanelFK_IdClienteBien);
			jPanel=(JPanel)this.jTabbedPaneBusquedasBien.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.bienConstantesFunciones.mostrarFK_IdClienteBien);
			if(!this.bienConstantesFunciones.mostrarFK_IdClienteBien && index>-1) {
				this.jTabbedPaneBusquedasBien.remove(index);
			}

			index= this.jTabbedPaneBusquedasBien.indexOfComponent(this.jPanelFK_IdValorClienteTipoBienBien);
			jPanel=(JPanel)this.jTabbedPaneBusquedasBien.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.bienConstantesFunciones.mostrarFK_IdValorClienteTipoBienBien);
			if(!this.bienConstantesFunciones.mostrarFK_IdValorClienteTipoBienBien && index>-1) {
				this.jTabbedPaneBusquedasBien.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioBien() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasBien.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasBien.indexOfComponent(this.jPanelFK_IdClienteBien);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasBien.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.bienConstantesFunciones.activarFK_IdClienteBien);
				this.jTabbedPaneBusquedasBien.setEnabledAt(index,this.bienConstantesFunciones.activarFK_IdClienteBien);
			}

			index= this.jTabbedPaneBusquedasBien.indexOfComponent(this.jPanelFK_IdValorClienteTipoBienBien);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasBien.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.bienConstantesFunciones.activarFK_IdValorClienteTipoBienBien);
				this.jTabbedPaneBusquedasBien.setEnabledAt(index,this.bienConstantesFunciones.activarFK_IdValorClienteTipoBienBien);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaBien(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdCliente")) {
			index= this.jTabbedPaneBusquedasBien.indexOfComponent(this.jPanelFK_IdClienteBien);

			this.jTabbedPaneBusquedasBien.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasBien.getComponent(index);

			this.bienConstantesFunciones.setResaltarFK_IdClienteBien(resaltar);

			jPanel.setBorder(this.bienConstantesFunciones.resaltarFK_IdClienteBien);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdValorClienteTipoBien")) {
			index= this.jTabbedPaneBusquedasBien.indexOfComponent(this.jPanelFK_IdValorClienteTipoBienBien);

			this.jTabbedPaneBusquedasBien.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasBien.getComponent(index);

			this.bienConstantesFunciones.setResaltarFK_IdValorClienteTipoBienBien(resaltar);

			jPanel.setBorder(this.bienConstantesFunciones.resaltarFK_IdValorClienteTipoBienBien);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarBien.setBorder(resaltar);
			
		}
	}	
	
	//NO FUNCIONA
	public void windowClosed(WindowEvent e) {	
	}
		
	public void windowClosing(WindowEvent e) {	    	    
	}

	public void windowOpened(WindowEvent e) {	    
	}

	public void windowIconified(WindowEvent e) {	    
	}

	public void windowDeiconified(WindowEvent e) {	    
	}

	public void windowActivated(WindowEvent e) {	    
	}

	public void windowDeactivated(WindowEvent e) {	    
	}

	public void windowGainedFocus(WindowEvent e) {	    
	}

	public void windowLostFocus(WindowEvent e) {	    
	}
	
	public void updateControlesFormularioBien() throws Exception {

		if(this.jInternalFrameDetalleFormBien==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioBien();
		this.updateVisibilidadResaltarControlesFormularioBien();
		this.updateHabilitarResaltarControlesFormularioBien();
		
	}
	
	public void updateBorderResaltarControlesFormularioBien() throws Exception {
		if(this.jInternalFrameDetalleFormBien==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.bienConstantesFunciones.resaltaridBien!=null && this.jInternalFrameDetalleFormBien!=null) {this.jInternalFrameDetalleFormBien.jLabelidBien.setBorder(this.bienConstantesFunciones.resaltaridBien);}
		if(this.bienConstantesFunciones.resaltarid_empresaBien!=null && this.jInternalFrameDetalleFormBien!=null) {this.jInternalFrameDetalleFormBien.jComboBoxid_empresaBien.setBorder(this.bienConstantesFunciones.resaltarid_empresaBien);}
		if(this.bienConstantesFunciones.resaltarid_clienteBien!=null && this.jInternalFrameDetalleFormBien!=null) {this.jInternalFrameDetalleFormBien.jComboBoxid_clienteBien.setBorder(this.bienConstantesFunciones.resaltarid_clienteBien);}
		if(this.bienConstantesFunciones.resaltarid_tipobienBien!=null && this.jInternalFrameDetalleFormBien!=null) {this.jInternalFrameDetalleFormBien.jComboBoxid_tipobienBien.setBorder(this.bienConstantesFunciones.resaltarid_tipobienBien);}
		if(this.bienConstantesFunciones.resaltarnumeroBien!=null && this.jInternalFrameDetalleFormBien!=null) {this.jInternalFrameDetalleFormBien.jTextFieldnumeroBien.setBorder(this.bienConstantesFunciones.resaltarnumeroBien);}
		if(this.bienConstantesFunciones.resaltardescripcionBien!=null && this.jInternalFrameDetalleFormBien!=null) {this.jInternalFrameDetalleFormBien.jTextAreadescripcionBien.setBorder(this.bienConstantesFunciones.resaltardescripcionBien);}
		if(this.bienConstantesFunciones.resaltarvalor_avaluoBien!=null && this.jInternalFrameDetalleFormBien!=null) {this.jInternalFrameDetalleFormBien.jTextFieldvalor_avaluoBien.setBorder(this.bienConstantesFunciones.resaltarvalor_avaluoBien);}
		if(this.bienConstantesFunciones.resaltardireccionBien!=null && this.jInternalFrameDetalleFormBien!=null) {this.jInternalFrameDetalleFormBien.jTextAreadireccionBien.setBorder(this.bienConstantesFunciones.resaltardireccionBien);}
		if(this.bienConstantesFunciones.resaltares_activoBien!=null && this.jInternalFrameDetalleFormBien!=null) {this.jInternalFrameDetalleFormBien.jCheckBoxes_activoBien.setBorderPainted(true);this.jInternalFrameDetalleFormBien.jCheckBoxes_activoBien.setBorder(this.bienConstantesFunciones.resaltares_activoBien);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioBien() throws Exception {		
		if(this.jInternalFrameDetalleFormBien==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormBien!=null) {
	
		//this.jInternalFrameDetalleFormBien.jLabelidBien.setVisible(this.bienConstantesFunciones.mostraridBien);
		this.jInternalFrameDetalleFormBien.jPanelidBien.setVisible(this.bienConstantesFunciones.mostraridBien);
		//this.jInternalFrameDetalleFormBien.jComboBoxid_empresaBien.setVisible(this.bienConstantesFunciones.mostrarid_empresaBien);
		this.jInternalFrameDetalleFormBien.jPanelid_empresaBien.setVisible(this.bienConstantesFunciones.mostrarid_empresaBien);
		//this.jInternalFrameDetalleFormBien.jComboBoxid_clienteBien.setVisible(this.bienConstantesFunciones.mostrarid_clienteBien);
		this.jInternalFrameDetalleFormBien.jPanelid_clienteBien.setVisible(this.bienConstantesFunciones.mostrarid_clienteBien);
			this.jInternalFrameDetalleFormBien.jButtonid_clienteBien.setVisible(this.bienConstantesFunciones.mostrarid_clienteBien);
		//this.jInternalFrameDetalleFormBien.jComboBoxid_tipobienBien.setVisible(this.bienConstantesFunciones.mostrarid_tipobienBien);
		this.jInternalFrameDetalleFormBien.jPanelid_tipobienBien.setVisible(this.bienConstantesFunciones.mostrarid_tipobienBien);
		//this.jInternalFrameDetalleFormBien.jTextFieldnumeroBien.setVisible(this.bienConstantesFunciones.mostrarnumeroBien);
		this.jInternalFrameDetalleFormBien.jPanelnumeroBien.setVisible(this.bienConstantesFunciones.mostrarnumeroBien);
		//this.jInternalFrameDetalleFormBien.jTextAreadescripcionBien.setVisible(this.bienConstantesFunciones.mostrardescripcionBien);
		this.jInternalFrameDetalleFormBien.jPaneldescripcionBien.setVisible(this.bienConstantesFunciones.mostrardescripcionBien);
		//this.jInternalFrameDetalleFormBien.jTextFieldvalor_avaluoBien.setVisible(this.bienConstantesFunciones.mostrarvalor_avaluoBien);
		this.jInternalFrameDetalleFormBien.jPanelvalor_avaluoBien.setVisible(this.bienConstantesFunciones.mostrarvalor_avaluoBien);
		//this.jInternalFrameDetalleFormBien.jTextAreadireccionBien.setVisible(this.bienConstantesFunciones.mostrardireccionBien);
		this.jInternalFrameDetalleFormBien.jPaneldireccionBien.setVisible(this.bienConstantesFunciones.mostrardireccionBien);
		//this.jInternalFrameDetalleFormBien.jCheckBoxes_activoBien.setVisible(this.bienConstantesFunciones.mostrares_activoBien);
		this.jInternalFrameDetalleFormBien.jPaneles_activoBien.setVisible(this.bienConstantesFunciones.mostrares_activoBien);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioBien() throws Exception {
		if(this.jInternalFrameDetalleFormBien==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormBien!=null) {
	
		this.jInternalFrameDetalleFormBien.jLabelidBien.setEnabled(this.bienConstantesFunciones.activaridBien);
		this.jInternalFrameDetalleFormBien.jComboBoxid_empresaBien.setEnabled(this.bienConstantesFunciones.activarid_empresaBien);
		this.jInternalFrameDetalleFormBien.jComboBoxid_clienteBien.setEnabled(this.bienConstantesFunciones.activarid_clienteBien);
			this.jInternalFrameDetalleFormBien.jButtonid_clienteBien.setEnabled(this.bienConstantesFunciones.activarid_clienteBien);
		this.jInternalFrameDetalleFormBien.jComboBoxid_tipobienBien.setEnabled(this.bienConstantesFunciones.activarid_tipobienBien);
		this.jInternalFrameDetalleFormBien.jTextFieldnumeroBien.setEnabled(this.bienConstantesFunciones.activarnumeroBien);
		this.jInternalFrameDetalleFormBien.jTextAreadescripcionBien.setEnabled(this.bienConstantesFunciones.activardescripcionBien);
		this.jInternalFrameDetalleFormBien.jTextFieldvalor_avaluoBien.setEnabled(this.bienConstantesFunciones.activarvalor_avaluoBien);
		this.jInternalFrameDetalleFormBien.jTextAreadireccionBien.setEnabled(this.bienConstantesFunciones.activardireccionBien);
		this.jInternalFrameDetalleFormBien.jCheckBoxes_activoBien.setEnabled(this.bienConstantesFunciones.activares_activoBien);
		}
	}
	
		
}