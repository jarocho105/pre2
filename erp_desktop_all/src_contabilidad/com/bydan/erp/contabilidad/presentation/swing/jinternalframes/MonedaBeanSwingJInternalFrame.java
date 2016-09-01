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

import com.bydan.erp.contabilidad.util.MonedaConstantesFunciones;
import com.bydan.erp.contabilidad.util.MonedaParameterReturnGeneral;
//import com.bydan.erp.contabilidad.util.MonedaParameterGeneral;
//import com.bydan.erp.contabilidad.presentation.report.source.MonedaBean;
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

import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.contabilidad.resources.reportes.AuxiliarReportes;


import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.contabilidad.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.contabilidad.business.entity.*;
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


import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

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
public class MonedaBeanSwingJInternalFrame extends MonedaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(MonedaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Moneda> monedaValidator = new ClassValidator<Moneda>(Moneda.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Moneda moneda;	
	public Moneda monedaAux;
	public Moneda monedaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Moneda monedaTotales;
	public Long idMonedaActual;
	public Long iIdNuevoMoneda=0L;
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
	
	public Boolean isPermisoTodoMoneda;
	public Boolean isPermisoNuevoMoneda;
	public Boolean isPermisoActualizarMoneda;
	public Boolean isPermisoActualizarOriginalMoneda;
	public Boolean isPermisoEliminarMoneda;
	public Boolean isPermisoGuardarCambiosMoneda;
	public Boolean isPermisoConsultaMoneda;
	public Boolean isPermisoBusquedaMoneda;
	public Boolean isPermisoReporteMoneda;
	public Boolean isPermisoPaginacionMedioMoneda;
	public Boolean isPermisoPaginacionAltoMoneda;
	public Boolean isPermisoPaginacionTodoMoneda;
	public Boolean isPermisoCopiarMoneda;
	public Boolean isPermisoVerFormMoneda;
	public Boolean isPermisoDuplicarMoneda;
	public Boolean isPermisoOrdenMoneda;
	
	
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
	
	public MonedaParameterReturnGeneral monedaReturnGeneral;
	public MonedaParameterReturnGeneral monedaParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoMoneda=false;
	public Boolean esParaAccionDesdeFormularioMoneda=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected MonedaSessionBeanAdditional monedaSessionBeanAdditional=null;
	
	public MonedaSessionBeanAdditional getMonedaSessionBeanAdditional() {
		return this.monedaSessionBeanAdditional;
	}
	
	public void setMonedaSessionBeanAdditional(MonedaSessionBeanAdditional monedaSessionBeanAdditional) {
		try {
			this.monedaSessionBeanAdditional=monedaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected MonedaBeanSwingJInternalFrameAdditional monedaBeanSwingJInternalFrameAdditional=null;
	//public class MonedaBeanSwingJInternalFrame
	
	public MonedaBeanSwingJInternalFrameAdditional getMonedaBeanSwingJInternalFrameAdditional() {
		return this.monedaBeanSwingJInternalFrameAdditional;
	}
	
	public void setMonedaBeanSwingJInternalFrameAdditional(MonedaBeanSwingJInternalFrameAdditional monedaBeanSwingJInternalFrameAdditional) {
		try {
			this.monedaBeanSwingJInternalFrameAdditional=monedaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public MonedaLogic monedaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Moneda monedaBean;
	public MonedaConstantesFunciones monedaConstantesFunciones;
	//public MonedaParameterReturnGeneral monedaReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<Moneda> monedas;	
	//public List<Moneda> monedasEliminados;
	//public List<Moneda> monedasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoMoneda=false;
	public Boolean isVisibilidadCeldaDuplicarMoneda=true;
	public Boolean isVisibilidadCeldaCopiarMoneda=true;
	public Boolean isVisibilidadCeldaVerFormMoneda=true;
	public Boolean isVisibilidadCeldaOrdenMoneda=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesMoneda=false;
	public Boolean isVisibilidadCeldaModificarMoneda=false;
	public Boolean isVisibilidadCeldaActualizarMoneda=false;
	public Boolean isVisibilidadCeldaEliminarMoneda=false;
	public Boolean isVisibilidadCeldaCancelarMoneda=false;
	public Boolean isVisibilidadCeldaGuardarMoneda=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosMoneda=false;	
	
	
	public Boolean isVisibilidadBusquedaPorNombre=false;
	public Boolean isVisibilidadBusquedaPorSigla=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoMoneda() {
		return this.iIdNuevoMoneda;
	}

	public void setiIdNuevoMoneda(Long iIdNuevoMoneda) {
		this.iIdNuevoMoneda = iIdNuevoMoneda;
	}
	
	public Long getidMonedaActual() {
		return this.idMonedaActual;
	}

	public void setidMonedaActual(Long idMonedaActual) {
		this.idMonedaActual = idMonedaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Moneda getmoneda() {
		return this.moneda;
	}

	public void setmoneda(Moneda moneda) {
		this.moneda = moneda;
	}
	
	public Moneda getmonedaAux() {
		return this.monedaAux;
	}

	public void setmonedaAux(Moneda monedaAux) {
		this.monedaAux = monedaAux;
	}				
	
	public Moneda getmonedaAnterior() {
		return this.monedaAnterior;
	}

	public void setmonedaAnterior(Moneda monedaAnterior) {
		this.monedaAnterior = monedaAnterior;
	}	
	
	public Moneda getmonedaTotales() {
		return this.monedaTotales;
	}

	public void setmonedaTotales(Moneda monedaTotales) {
		this.monedaTotales = monedaTotales;
	}	
	
	public Moneda getmonedaBean() {
		return this.monedaBean;
	}

	public void setmonedaBean(Moneda monedaBean) {
		this.monedaBean = monedaBean;
	}	
	
	public MonedaParameterReturnGeneral getmonedaReturnGeneral() {
		return this.monedaReturnGeneral;
	}

	public void setmonedaReturnGeneral(MonedaParameterReturnGeneral monedaReturnGeneral) {
		this.monedaReturnGeneral = monedaReturnGeneral;
	}	
	
	
	public String nombreBusquedaPorNombre="";

	public String getnombreBusquedaPorNombre() {
		return this.nombreBusquedaPorNombre;
	}

	public void setnombreBusquedaPorNombre(String nombreBusquedaPorNombre) {
		this.nombreBusquedaPorNombre = nombreBusquedaPorNombre;
	}

	public String siglaBusquedaPorSigla="";

	public String getsiglaBusquedaPorSigla() {
		return this.siglaBusquedaPorSigla;
	}

	public void setsiglaBusquedaPorSigla(String siglaBusquedaPorSigla) {
		this.siglaBusquedaPorSigla = siglaBusquedaPorSigla;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public MonedaLogic getMonedaLogic()	{		
		return monedaLogic;
	}

	public void setMonedaLogic(MonedaLogic monedaLogic) {
		this.monedaLogic = monedaLogic;
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
	
	public Boolean getIsEsNuevoMoneda() {
		return isEsNuevoMoneda;
	}

	public void setIsEsNuevoMoneda(Boolean isEsNuevoMoneda) {
		this.isEsNuevoMoneda = isEsNuevoMoneda;
	}

	public Boolean getEsParaAccionDesdeFormularioMoneda() {
		return esParaAccionDesdeFormularioMoneda;
	}
	
	public void setEsParaAccionDesdeFormularioMoneda(Boolean esParaAccionDesdeFormularioMoneda) {
		this.esParaAccionDesdeFormularioMoneda = esParaAccionDesdeFormularioMoneda;
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

			if(this.monedaSessionBean==null) {
				this.monedaSessionBean=new MonedaSessionBean();
			}

			if(!this.monedaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(monedaSessionBean.getlidEmpresaActual());
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

					if(this.moneda!=null) {
						this.moneda.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormMoneda!=null) {
						this.jInternalFrameDetalleFormMoneda.jComboBoxid_empresaMoneda.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaMoneda.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormMoneda!=null) {
						if(this.jInternalFrameDetalleFormMoneda.jComboBoxid_empresaMoneda.getItemCount()>0) {
							this.jInternalFrameDetalleFormMoneda.jComboBoxid_empresaMoneda.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaMonedaGenerico)throws Exception
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
				jComboBoxid_empresaMonedaGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaMonedaGenerico!=null && jComboBoxid_empresaMonedaGenerico.getItemCount()>0) {
					jComboBoxid_empresaMonedaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(Moneda moneda,JComboBox jComboBoxid_empresaMonedaGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaMonedaGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormMoneda.jComboBoxid_empresaMoneda.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaMonedaGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				moneda.setid_empresa(empresaAux.getId());
				moneda.setempresa_descripcion(MonedaConstantesFunciones.getEmpresaDescripcion(empresaAux));
				moneda.setEmpresa(empresaAux);			}
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

					if(!MonedaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormMoneda!=null) { 
							this.jInternalFrameDetalleFormMoneda.jComboBoxid_empresaMoneda.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormMoneda.jComboBoxid_empresaMoneda.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormMoneda!=null) { 
					}

					if(!MonedaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormMoneda!=null) {
							this.jInternalFrameDetalleFormMoneda.jComboBoxid_empresaMoneda.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormMoneda!=null) {
							this.jInternalFrameDetalleFormMoneda.jComboBoxid_empresaMoneda.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesMoneda() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			MonedaConstantesFunciones.refrescarForeignKeysDescripcionesMoneda(this.monedaLogic.getMonedas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			MonedaConstantesFunciones.refrescarForeignKeysDescripcionesMoneda(this.monedas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//monedaLogic.setMonedas(this.monedas);
			monedaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public MonedaParameterReturnGeneral getMonedaParameterGeneral() {
		return this.monedaParameterGeneral;
	}
	
	public void setMonedaParameterGeneral(MonedaParameterReturnGeneral monedaParameterGeneral) {
		this.monedaParameterGeneral = monedaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoMoneda() {
		return isPermisoTodoMoneda;
	}

	public void setIsPermisoTodoMoneda(Boolean isPermisoTodoMoneda) {
		this.isPermisoTodoMoneda = isPermisoTodoMoneda;
	}

	public Boolean getIsPermisoNuevoMoneda() {
		return isPermisoNuevoMoneda;
	}

	public void setIsPermisoNuevoMoneda(Boolean isPermisoNuevoMoneda) {
		this.isPermisoNuevoMoneda = isPermisoNuevoMoneda;
	}

	public Boolean getIsPermisoActualizarMoneda() {
		return isPermisoActualizarMoneda;
	}

	public void setIsPermisoActualizarMoneda(Boolean isPermisoActualizarMoneda) {
		this.isPermisoActualizarMoneda = isPermisoActualizarMoneda;
	}

	public Boolean getIsPermisoEliminarMoneda() {
		return isPermisoEliminarMoneda;
	}

	public void setIsPermisoEliminarMoneda(Boolean isPermisoEliminarMoneda) {
		this.isPermisoEliminarMoneda = isPermisoEliminarMoneda;
	}

	public Boolean getIsPermisoGuardarCambiosMoneda() {
		return isPermisoGuardarCambiosMoneda;
	}

	public void setIsPermisoGuardarCambiosMoneda(Boolean isPermisoGuardarCambiosMoneda) {
		this.isPermisoGuardarCambiosMoneda = isPermisoGuardarCambiosMoneda;
	}
	
	public Boolean getIsPermisoConsultaMoneda() {
		return isPermisoConsultaMoneda;
	}

	public void setIsPermisoConsultaMoneda(Boolean isPermisoConsultaMoneda) {
		this.isPermisoConsultaMoneda = isPermisoConsultaMoneda;
	}

	public Boolean getIsPermisoBusquedaMoneda() {
		return isPermisoBusquedaMoneda;
	}

	public void setIsPermisoBusquedaMoneda(Boolean isPermisoBusquedaMoneda) {
		this.isPermisoBusquedaMoneda = isPermisoBusquedaMoneda;
	}

	public Boolean getIsPermisoReporteMoneda() {
		return isPermisoReporteMoneda;
	}

	public void setIsPermisoReporteMoneda(Boolean isPermisoReporteMoneda) {
		this.isPermisoReporteMoneda = isPermisoReporteMoneda;
	}
	
	public Boolean getIsPermisoPaginacionMedioMoneda() {
		return isPermisoPaginacionMedioMoneda;
	}

	public void setIsPermisoPaginacionMedioMoneda(Boolean isPermisoPaginacionMedioMoneda) {
		this.isPermisoPaginacionMedioMoneda = isPermisoPaginacionMedioMoneda;
	}
	
	public Boolean getIsPermisoPaginacionTodoMoneda() {
		return isPermisoPaginacionTodoMoneda;
	}

	public void setIsPermisoPaginacionTodoMoneda(Boolean isPermisoPaginacionTodoMoneda) {
		this.isPermisoPaginacionTodoMoneda = isPermisoPaginacionTodoMoneda;
	}
	
	public Boolean getIsPermisoPaginacionAltoMoneda() {
		return isPermisoPaginacionAltoMoneda;
	}

	public void setIsPermisoPaginacionAltoMoneda(Boolean isPermisoPaginacionAltoMoneda) {
		this.isPermisoPaginacionAltoMoneda = isPermisoPaginacionAltoMoneda;
	}
	
	public Boolean getIsPermisoCopiarMoneda() {
		return isPermisoCopiarMoneda;
	}

	public void setIsPermisoCopiarMoneda(Boolean isPermisoCopiarMoneda) {
		this.isPermisoCopiarMoneda = isPermisoCopiarMoneda;
	}
	
	public Boolean getIsPermisoVerFormMoneda() {
		return isPermisoVerFormMoneda;
	}

	public void setIsPermisoVerFormMoneda(Boolean isPermisoVerFormMoneda) {
		this.isPermisoVerFormMoneda = isPermisoVerFormMoneda;
	}
	
	public Boolean getIsPermisoDuplicarMoneda() {
		return isPermisoDuplicarMoneda;
	}

	public void setIsPermisoDuplicarMoneda(Boolean isPermisoDuplicarMoneda) {
		this.isPermisoDuplicarMoneda = isPermisoDuplicarMoneda;
	}
	
	public Boolean getIsPermisoOrdenMoneda() {
		return isPermisoOrdenMoneda;
	}

	public void setIsPermisoOrdenMoneda(Boolean isPermisoOrdenMoneda) {
		this.isPermisoOrdenMoneda = isPermisoOrdenMoneda;
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
	
	public Boolean getIsVisibilidadCeldaNuevoMoneda() {
		return isVisibilidadCeldaNuevoMoneda;
	}

	public void setIsVisibilidadCeldaNuevoMoneda(Boolean isVisibilidadCeldaNuevoMoneda) {
		this.isVisibilidadCeldaNuevoMoneda = isVisibilidadCeldaNuevoMoneda;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarMoneda() {
		return isVisibilidadCeldaDuplicarMoneda;
	}

	public void setIsVisibilidadCeldaDuplicarMoneda(Boolean isVisibilidadCeldaDuplicarMoneda) {
		this.isVisibilidadCeldaDuplicarMoneda = isVisibilidadCeldaDuplicarMoneda;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarMoneda() {
		return isVisibilidadCeldaCopiarMoneda;
	}

	public void setIsVisibilidadCeldaCopiarMoneda(Boolean isVisibilidadCeldaCopiarMoneda) {
		this.isVisibilidadCeldaCopiarMoneda = isVisibilidadCeldaCopiarMoneda;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormMoneda() {
		return isVisibilidadCeldaVerFormMoneda;
	}

	public void setIsVisibilidadCeldaVerFormMoneda(Boolean isVisibilidadCeldaVerFormMoneda) {
		this.isVisibilidadCeldaVerFormMoneda = isVisibilidadCeldaVerFormMoneda;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenMoneda() {
		return isVisibilidadCeldaOrdenMoneda;
	}

	public void setIsVisibilidadCeldaOrdenMoneda(Boolean isVisibilidadCeldaOrdenMoneda) {
		this.isVisibilidadCeldaOrdenMoneda = isVisibilidadCeldaOrdenMoneda;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesMoneda() {
		return isVisibilidadCeldaNuevoRelacionesMoneda;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesMoneda(Boolean isVisibilidadCeldaNuevoRelacionesMoneda) {
		this.isVisibilidadCeldaNuevoRelacionesMoneda = isVisibilidadCeldaNuevoRelacionesMoneda;
	}
	
	public Boolean getIsVisibilidadCeldaModificarMoneda() {
		return isVisibilidadCeldaModificarMoneda;
	}

	public void setIsVisibilidadCeldaModificarMoneda(Boolean isVisibilidadCeldaModificarMoneda) {
		this.isVisibilidadCeldaModificarMoneda = isVisibilidadCeldaModificarMoneda;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarMoneda() {
		return isVisibilidadCeldaActualizarMoneda;
	}

	public void setIsVisibilidadCeldaActualizarMoneda(Boolean isVisibilidadCeldaActualizarMoneda) {
		this.isVisibilidadCeldaActualizarMoneda = isVisibilidadCeldaActualizarMoneda;
	}

	public Boolean getIsVisibilidadCeldaEliminarMoneda() {
		return isVisibilidadCeldaEliminarMoneda;
	}

	public void setIsVisibilidadCeldaEliminarMoneda(Boolean isVisibilidadCeldaEliminarMoneda) {
		this.isVisibilidadCeldaEliminarMoneda = isVisibilidadCeldaEliminarMoneda;
	}

	public Boolean getIsVisibilidadCeldaCancelarMoneda() {
		return isVisibilidadCeldaCancelarMoneda;
	}

	public void setIsVisibilidadCeldaCancelarMoneda(Boolean isVisibilidadCeldaCancelarMoneda) {
		this.isVisibilidadCeldaCancelarMoneda = isVisibilidadCeldaCancelarMoneda;
	}

	public Boolean getIsVisibilidadCeldaGuardarMoneda() {
		return isVisibilidadCeldaGuardarMoneda;
	}

	public void setIsVisibilidadCeldaGuardarMoneda(Boolean isVisibilidadCeldaGuardarMoneda) {
		this.isVisibilidadCeldaGuardarMoneda = isVisibilidadCeldaGuardarMoneda;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosMoneda() {
		return isVisibilidadCeldaGuardarCambiosMoneda;
	}

	public void setIsVisibilidadCeldaGuardarCambiosMoneda(Boolean isVisibilidadCeldaGuardarCambiosMoneda) {
		this.isVisibilidadCeldaGuardarCambiosMoneda = isVisibilidadCeldaGuardarCambiosMoneda;
	}
		
	public MonedaSessionBean getmonedaSessionBean() {
		return this.monedaSessionBean;
	}
	
	public void setmonedaSessionBean(MonedaSessionBean monedaSessionBean) {
		this.monedaSessionBean=monedaSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorNombre() {
		return this.isVisibilidadBusquedaPorNombre;
	}

	public void setisVisibilidadBusquedaPorNombre(Boolean isVisibilidadBusquedaPorNombre) {
		this.isVisibilidadBusquedaPorNombre=isVisibilidadBusquedaPorNombre;
	}

	public Boolean getisVisibilidadBusquedaPorSigla() {
		return this.isVisibilidadBusquedaPorSigla;
	}

	public void setisVisibilidadBusquedaPorSigla(Boolean isVisibilidadBusquedaPorSigla) {
		this.isVisibilidadBusquedaPorSigla=isVisibilidadBusquedaPorSigla;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysMoneda(Moneda moneda)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(moneda,null);
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
	
	public void bugActualizarReferenciaActual(Moneda moneda,Moneda monedaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalMoneda(moneda);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		monedaAux.setId(moneda.getId());
		monedaAux.setVersionRow(moneda.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessMoneda();
		
			int intSelectedRow = this.jTableDatosMoneda.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.moneda =(Moneda) this.monedaLogic.getMonedas().toArray()[this.jTableDatosMoneda.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.moneda =(Moneda) this.monedas.toArray()[this.jTableDatosMoneda.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(MonedaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualMoneda(this.moneda,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysMoneda(this.moneda);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = monedaValidator.getInvalidValues(this.moneda);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			monedaLogic.setDatosCliente(datosCliente);
			monedaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				monedaAux=new  Moneda();
				
				monedaAux.setIsNew(true);
				monedaAux.setIsChanged(true);
				
				monedaAux.setMonedaOriginal(this.moneda);
				
				monedaAux.setId(this.moneda.getId());	
				monedaAux.setVersionRow(this.moneda.getVersionRow());	
				monedaAux.setid_empresa(this.moneda.getid_empresa());	
				monedaAux.setnombre(this.moneda.getnombre());	
				monedaAux.setsigla(this.moneda.getsigla());	
				monedaAux.setsimbolo(this.moneda.getsimbolo());	
				monedaAux.setesta_activo(this.moneda.getesta_activo());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.monedaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.monedaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(monedaAux,monedaLogic.getMonedas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(monedaAux,monedas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.monedaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.monedaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						monedaLogic.saveMonedas();//WithConnection
						//monedaLogic.getSetVersionRowMonedas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.moneda,monedaAux);
					
					this.refrescarForeignKeysDescripcionesMoneda();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				monedaAux=new  Moneda();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.monedaSessionBean.getEsGuardarRelacionado() 
					|| (this.monedaSessionBean.getEsGuardarRelacionado() && this.moneda.getId()>=0)) {
						
					monedaAux.setIsNew(false);
				}
				
				monedaAux.setIsDeleted(false);
			
				monedaAux.setId(this.moneda.getId());	
				monedaAux.setVersionRow(this.moneda.getVersionRow());	
				monedaAux.setid_empresa(this.moneda.getid_empresa());	
				monedaAux.setnombre(this.moneda.getnombre());	
				monedaAux.setsigla(this.moneda.getsigla());	
				monedaAux.setsimbolo(this.moneda.getsimbolo());	
				monedaAux.setesta_activo(this.moneda.getesta_activo());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(monedaAux,monedaLogic.getMonedas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(monedaAux,monedas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.monedaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.monedaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						monedaLogic.saveMonedas();//WithConnection
						//monedaLogic.getSetVersionRowMonedas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.moneda,monedaAux);
					
					this.refrescarForeignKeysDescripcionesMoneda();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				monedaAux=new  Moneda();
				
				monedaAux.setIsNew(false);
				monedaAux.setIsChanged(false);
				
				monedaAux.setIsDeleted(true);
				
				monedaAux.setId(this.moneda.getId());	
				monedaAux.setVersionRow(this.moneda.getVersionRow());	
				monedaAux.setid_empresa(this.moneda.getid_empresa());	
				monedaAux.setnombre(this.moneda.getnombre());	
				monedaAux.setsigla(this.moneda.getsigla());	
				monedaAux.setsimbolo(this.moneda.getsimbolo());	
				monedaAux.setesta_activo(this.moneda.getesta_activo());	
				
				if(this.monedaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.monedaAux.getId()>=0) {	
						this.monedasEliminados.add(monedaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(monedaAux,monedaLogic.getMonedas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(monedaAux,monedas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.monedaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.monedaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						monedaLogic.saveMonedas();//WithConnection
						//monedaLogic.getSetVersionRowMonedas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.monedaLogic.getMonedas().addAll(this.monedasEliminados);
					
					monedaLogic.saveMonedas();//WithConnection
					//monedaLogic.getSetVersionRowMonedas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesMoneda();
				
				this.monedasEliminados= new ArrayList<Moneda>();		
			}
			
			if(this.monedaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.monedaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Moneda GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Moneda",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.moneda=monedaAux;
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
      		//this.finishProcessMoneda();
      	}
		
	}	
	
	public void actualizarRelaciones(Moneda monedaLocal) throws Exception {
		
		if(this.monedaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Moneda monedaLocal) throws Exception {	
		if(this.monedaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				monedaLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarMonedaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosMoneda.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.moneda =(Moneda) this.monedaLogic.getMonedas().toArray()[this.jTableDatosMoneda.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.moneda =(Moneda) this.monedas.toArray()[this.jTableDatosMoneda.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = monedaValidator.getInvalidValues(this.moneda);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Moneda moneda,List<Moneda> monedas) throws Exception {
		try	{		
			MonedaConstantesFunciones.actualizarLista(moneda,monedas,this.monedaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Moneda moneda,List<Moneda> monedas) throws Exception {
		try	{			
			MonedaConstantesFunciones.actualizarSelectedLista(moneda,monedas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Moneda> monedasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				monedasLocal=this.monedaLogic.getMonedas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				monedasLocal=this.monedas;
			}
			//ARCHITECTURE
		
			for(Moneda monedaLocal:monedasLocal) {
				if(this.permiteMantenimiento(monedaLocal) && monedaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+MonedaConstantesFunciones.getMonedaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(MonedaConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMoneda.jLabelid_empresaMoneda,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MonedaConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMoneda.jLabelnombreMoneda,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MonedaConstantesFunciones.SIGLA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMoneda.jLabelsiglaMoneda,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MonedaConstantesFunciones.SIMBOLO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMoneda.jLabelsimboloMoneda,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MonedaConstantesFunciones.ESTAACTIVO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMoneda.jLabelesta_activoMoneda,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormMoneda!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMoneda.jLabelid_empresaMoneda,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMoneda.jLabelnombreMoneda,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMoneda.jLabelsiglaMoneda,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMoneda.jLabelsimboloMoneda,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMoneda.jLabelesta_activoMoneda,"");
		
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
		this.iIdNuevoMoneda--;	
		
		
		this.monedaAux=new Moneda();
		
		this.monedaAux.setId(this.iIdNuevoMoneda);
		this.monedaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.monedaLogic.getMonedas().add(this.monedaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.monedas.add(this.monedaAux);
		}
		//ARCHITECTURE
		
		this.moneda=this.monedaAux;
		
		if(MonedaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioMoneda(this.moneda);
			this.setVariablesObjetoActualToFormularioForeignKeyMoneda(this.moneda);
		}
				
		//this.setDefaultControlesMoneda();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyMoneda();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyMoneda();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyMoneda();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualMoneda(this.monedaBean,this.moneda,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysMoneda(this.moneda);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(MonedaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.monedaSessionBean.getConGuardarRelaciones()) {
			classes=MonedaConstantesFunciones.getClassesRelationshipsOfMoneda(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.monedaReturnGeneral=monedaLogic.procesarEventosMonedasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.monedaLogic.getMonedas(),this.moneda,this.monedaParameterGeneral,this.isEsNuevoMoneda,classes);//this.monedaLogic.getMoneda()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanMoneda(this.monedaReturnGeneral,this.monedaBean,false);
		
		if(this.monedaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyMoneda(this.monedaReturnGeneral.getMoneda());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioMoneda(this.monedaReturnGeneral.getMoneda());
		}
		
		if(this.monedaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioMoneda(this.monedaReturnGeneral.getMoneda(),classes);//this.monedaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualMoneda(this.moneda,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyMoneda();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyMoneda();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			MonedaBeanSwingJInternalFrameAdditional.RecargarFormMoneda(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingMoneda(false);
						
			if(monedaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(MonedaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualMoneda();
			}
			
			this.actualizarVisualTableDatosMoneda();
			
			this.jTableDatosMoneda.setRowSelectionInterval(this.getIndiceNuevoMoneda(), this.getIndiceNuevoMoneda());
			
			this.seleccionarFilaTablaMonedaActual();
						
			this.actualizarEstadoCeldasBotonesMoneda("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesMoneda(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormMoneda.jTextFieldnombreMoneda.setEnabled(isHabilitar && this.monedaConstantesFunciones.activarnombreMoneda);
		this.jInternalFrameDetalleFormMoneda.jTextFieldsiglaMoneda.setEnabled(isHabilitar && this.monedaConstantesFunciones.activarsiglaMoneda);
		this.jInternalFrameDetalleFormMoneda.jTextFieldsimboloMoneda.setEnabled(isHabilitar && this.monedaConstantesFunciones.activarsimboloMoneda);
		this.jInternalFrameDetalleFormMoneda.jCheckBoxesta_activoMoneda.setEnabled(isHabilitar && this.monedaConstantesFunciones.activaresta_activoMoneda);	
		//
		this.jInternalFrameDetalleFormMoneda.jComboBoxid_empresaMoneda.setEnabled(isHabilitar && this.monedaConstantesFunciones.activarid_empresaMoneda);
	};
	
	public void setDefaultControlesMoneda() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoMoneda(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.monedaSessionBean.setConGuardarRelaciones(true);			
			this.monedaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormMoneda.jTabbedPaneRelacionesMoneda.setVisible(true);
			
					
		} else {
			//this.monedaSessionBean.setConGuardarRelaciones(false);			
			this.monedaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormMoneda.jTabbedPaneRelacionesMoneda.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoMoneda() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Moneda monedaAux:this.monedaLogic.getMonedas()) {
				if(monedaAux.getId().equals(this.iIdNuevoMoneda)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Moneda monedaAux:this.monedas) {
				if(monedaAux.getId().equals(this.iIdNuevoMoneda)) {
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
	
	public int getIndiceActualMoneda(Moneda moneda,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Moneda monedaAux:this.monedaLogic.getMonedas()) {
				if(monedaAux.getId().equals(moneda.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Moneda monedaAux:this.monedas) {
				if(monedaAux.getId().equals(moneda.getId())) {
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
	
	public void setCamposBaseDesdeOriginalMoneda(Moneda monedaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Moneda monedaAux:this.monedaLogic.getMonedas()) {
				if(monedaAux.getMonedaOriginal().getId().equals(monedaOriginal.getId())) {
					existe=true;
					monedaOriginal.setId(monedaAux.getId());
					monedaOriginal.setVersionRow(monedaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Moneda monedaAux:this.monedas) {
				if(monedaAux.getMonedaOriginal().getId().equals(monedaOriginal.getId())) {
					existe=true;
					monedaOriginal.setId(monedaAux.getId());
					monedaOriginal.setVersionRow(monedaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosMoneda(Boolean esParaCancelar) throws Exception {
		monedasAux=new ArrayList<Moneda>();
		monedaAux=new Moneda();
		
		if(!this.monedaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Moneda monedaAux:this.monedaLogic.getMonedas()) {
					if(monedaAux.getId()<0) {
						monedasAux.add(monedaAux);
					}		
				}
				this.iIdNuevoMoneda=0L;
				this.monedaLogic.getMonedas().removeAll(monedasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Moneda monedaAux:this.monedas) {
					if(monedaAux.getId()<0) {
						monedasAux.add(monedaAux);
					}		
				}
				this.iIdNuevoMoneda=0L;
				this.monedas.removeAll(monedasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoMoneda 
					&& this.monedaLogic.getMonedas().size()>0
					) {
					monedaAux=this.monedaLogic.getMonedas().get(this.monedaLogic.getMonedas().size() - 1);
				
					if(monedaAux.getId()<0) {
						this.monedaLogic.getMonedas().remove(monedaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoMoneda && this.monedas.size()>0) {
					monedaAux=this.monedas.get(this.monedas.size() - 1);
				
					if(monedaAux.getId()<0) {
						this.monedas.remove(monedaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoMoneda(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(moneda.getId()<0) {
				this.monedaLogic.getMonedas().remove(this.moneda);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(moneda.getId()<0) {
				this.monedas.remove(this.moneda);
			}
		}			
	}
	
	public void setEstadosInicialesMoneda(List<Moneda> monedasAux) throws Exception {
		MonedaConstantesFunciones.setEstadosInicialesMoneda(monedasAux);
	}
	
	public void setEstadosInicialesMoneda(Moneda monedaAux) throws Exception {
		MonedaConstantesFunciones.setEstadosInicialesMoneda(monedaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarMonedaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesMoneda("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarMonedaActual()) {
				if(!this.isEsNuevoMoneda) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesMoneda("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoMoneda=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarMonedaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Moneda ?", "MANTENIMIENTO DE Moneda", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesMoneda("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Moneda moneda) throws Exception {
		MonedaConstantesFunciones.seleccionarAsignar(this.moneda,moneda);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarMoneda=this.isPermisoActualizarOriginalMoneda;
			
			
			this.seleccionarAsignar(moneda);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			MonedaConstantesFunciones.quitarEspaciosMoneda(this.moneda,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesMoneda("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.monedaSessionBean.setsFuncionBusquedaRapida(this.monedaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoMoneda) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosMoneda(esParaCancelar);				
				this.cancelarNuevoMoneda(esParaCancelar);								
			}
			
			this.moneda=new Moneda();
			
			this.inicializarMoneda();
			
			this.actualizarEstadoCeldasBotonesMoneda("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarMoneda() throws Exception {
		try {
			MonedaConstantesFunciones.inicializarMoneda(this.moneda);
			
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
			FuncionesSwing.manageException(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.monedaLogic.getMonedas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteMonedas(String sAccionBusqueda,List<Moneda> monedasParaReportes) throws Exception {
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
					sPathReporteFinal="Moneda"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="MonedaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("MonedaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Moneda"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Monedas");		
		parameters.put("busquedapor", MonedaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceMoneda=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			MonedaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			MonedaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceMoneda=new JRBeanArrayDataSource(MonedaJInternalFrame.TraerMonedaBeans(monedasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceMoneda);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+MonedaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+MonedaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(MonedaBean.TraerMonedaBeans(monedasParaReportes).toArray()));
							
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
				this.generarExcelReporteMonedas(sAccionBusqueda,sTipoArchivoReporte,monedasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalMonedas(sAccionBusqueda,sTipoArchivoReporte,monedasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoMonedaActionPerformed(null);
					//this.generarExcelReporteMonedas(sAccionBusqueda,sTipoArchivoReporte,monedasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalMonedas(sAccionBusqueda,sTipoArchivoReporte,monedasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesMonedas(sAccionBusqueda,sTipoArchivoReporte,monedasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesMonedas(sAccionBusqueda,sTipoArchivoReporte,monedasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteMonedas(String sAccionBusqueda,String sTipoArchivoReporte,List<Moneda> monedasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"moneda";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Monedas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderMoneda("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Moneda moneda : monedasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			MonedaConstantesFunciones.generarExcelReporteDataMoneda("NORMAL",row,workbook,moneda,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.monedaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Moneda",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderMoneda(String sTipo,Row row,Workbook workbook) {
		
		MonedaConstantesFunciones.generarExcelReporteHeaderMoneda(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalMonedas(String sAccionBusqueda,String sTipoArchivoReporte,List<Moneda> monedasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"moneda_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Monedas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Moneda moneda : monedasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(MonedaConstantesFunciones.getMonedaDescripcion(moneda));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MonedaConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MonedaConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(moneda.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MonedaConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MonedaConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(moneda.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MonedaConstantesFunciones.LABEL_SIGLA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MonedaConstantesFunciones.LABEL_SIGLA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(moneda.getsigla());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MonedaConstantesFunciones.LABEL_SIMBOLO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MonedaConstantesFunciones.LABEL_SIMBOLO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(moneda.getsimbolo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MonedaConstantesFunciones.LABEL_ESTAACTIVO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MonedaConstantesFunciones.LABEL_ESTAACTIVO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(moneda.getesta_activo()));


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.monedaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Moneda",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesMonedas(String sAccionBusqueda,String sTipoArchivoReporte,List<Moneda> monedasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Moneda> monedasRespaldo=null;
		
		classes=MonedaConstantesFunciones.getClassesRelationshipsOfMoneda(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.monedaLogic.setDatosCliente(this.datosCliente);
		this.monedaLogic.setDatosDeep(this.datosDeep);
		this.monedaLogic.setIsConDeep(true);
		
		monedasRespaldo=this.monedaLogic.getMonedas();
		
		this.monedaLogic.setMonedas(monedasParaReportes);	
		this.monedaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		monedasParaReportes=this.monedaLogic.getMonedas();
		this.monedaLogic.setMonedas(monedasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"moneda_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Monedas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderMoneda("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Moneda moneda : monedasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderMoneda("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			MonedaConstantesFunciones.generarExcelReporteDataMoneda("NORMAL",row,workbook,moneda,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(MonedaConstantesFunciones.getMonedaDescripcion(moneda));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.monedaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Moneda",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoMoneda.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoMoneda.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoMoneda.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoMoneda.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessMoneda() throws Exception {		
		this.startProcessMoneda(true);
	}
	
	public void startProcessMoneda(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasMoneda ,this.jPanelParametrosReportesMoneda, this.jScrollPanelDatosMoneda,this.jPanelPaginacionMoneda, this.jScrollPanelDatosEdicionMoneda, this.jPanelAccionesMoneda,this.jPanelAccionesFormularioMoneda,this.jmenuBarMoneda,this.jmenuBarDetalleMoneda,this.jTtoolBarMoneda,this.jTtoolBarDetalleMoneda);		
		
		final JTabbedPane jTabbedPaneBusquedasMoneda=this.jTabbedPaneBusquedasMoneda; 
		
		final JPanel jPanelParametrosReportesMoneda=this.jPanelParametrosReportesMoneda;
		//final JScrollPane jScrollPanelDatosMoneda=this.jScrollPanelDatosMoneda;
		final JTable jTableDatosMoneda=this.jTableDatosMoneda;		
		final JPanel jPanelPaginacionMoneda=this.jPanelPaginacionMoneda;
		//final JScrollPane jScrollPanelDatosEdicionMoneda=this.jScrollPanelDatosEdicionMoneda;
		final JPanel jPanelAccionesMoneda=this.jPanelAccionesMoneda;
		
		JPanel jPanelCamposAuxiliarMoneda=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarMoneda=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormMoneda!=null) {
			jPanelCamposAuxiliarMoneda=this.jInternalFrameDetalleFormMoneda.jPanelCamposMoneda;
			jPanelAccionesFormularioAuxiliarMoneda=this.jInternalFrameDetalleFormMoneda.jPanelAccionesFormularioMoneda;
		}
		
		final JPanel jPanelCamposMoneda=jPanelCamposAuxiliarMoneda;
		final JPanel jPanelAccionesFormularioMoneda=jPanelAccionesFormularioAuxiliarMoneda;
		
		
		final JMenuBar jmenuBarMoneda=this.jmenuBarMoneda;
		final JToolBar jTtoolBarMoneda=this.jTtoolBarMoneda;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarMoneda=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarMoneda=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormMoneda!=null) {
			jmenuBarDetalleAuxiliarMoneda=this.jInternalFrameDetalleFormMoneda.jmenuBarDetalleMoneda;
			jTtoolBarDetalleAuxiliarMoneda=this.jInternalFrameDetalleFormMoneda.jTtoolBarDetalleMoneda;
		}
		
		final JMenuBar jmenuBarDetalleMoneda=jmenuBarDetalleAuxiliarMoneda;
		final JToolBar jTtoolBarDetalleMoneda=jTtoolBarDetalleAuxiliarMoneda;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasMoneda;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesMoneda;
			processRunnable.jTableDatos=jTableDatosMoneda;
			processRunnable.jPanelCampos=jPanelCamposMoneda;
			processRunnable.jPanelPaginacion=jPanelPaginacionMoneda;
			processRunnable.jPanelAcciones=jPanelAccionesMoneda;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioMoneda;
			
			
			processRunnable.jmenuBar=jmenuBarMoneda;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleMoneda;
			processRunnable.jTtoolBar=jTtoolBarMoneda;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleMoneda;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasMoneda ,jPanelParametrosReportesMoneda,jTableDatosMoneda, /*jScrollPanelDatosMoneda,*/jPanelCamposMoneda,jPanelPaginacionMoneda, /*jScrollPanelDatosEdicionMoneda,*/ jPanelAccionesMoneda,jPanelAccionesFormularioMoneda,jmenuBarMoneda,jmenuBarDetalleMoneda,jTtoolBarMoneda,jTtoolBarDetalleMoneda);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasMoneda ,jPanelParametrosReportesMoneda, jScrollPanelDatosMoneda,jPanelPaginacionMoneda, jScrollPanelDatosEdicionMoneda, jPanelAccionesMoneda,jPanelAccionesFormularioMoneda,jmenuBarMoneda,jmenuBarDetalleMoneda,jTtoolBarMoneda,jTtoolBarDetalleMoneda);
						
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
	
	public void finishProcessMoneda() {// throws Exception 
		this.finishProcessMoneda(true);
	}
	
	public void finishProcessMoneda(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasMoneda ,this.jPanelParametrosReportesMoneda, this.jScrollPanelDatosMoneda,this.jPanelPaginacionMoneda, this.jScrollPanelDatosEdicionMoneda, this.jPanelAccionesMoneda,this.jPanelAccionesFormularioMoneda,this.jmenuBarMoneda,this.jmenuBarDetalleMoneda,this.jTtoolBarMoneda,this.jTtoolBarDetalleMoneda);		
		
		final JTabbedPane jTabbedPaneBusquedasMoneda=this.jTabbedPaneBusquedasMoneda; 
		
		final JPanel jPanelParametrosReportesMoneda=this.jPanelParametrosReportesMoneda;
		//final JScrollPane jScrollPanelDatosMoneda=this.jScrollPanelDatosMoneda;
		final JTable jTableDatosMoneda=this.jTableDatosMoneda;		
		final JPanel jPanelPaginacionMoneda=this.jPanelPaginacionMoneda;
		//final JScrollPane jScrollPanelDatosEdicionMoneda=this.jScrollPanelDatosEdicionMoneda;
		final JPanel jPanelAccionesMoneda=this.jPanelAccionesMoneda;
		
		JPanel jPanelCamposAuxiliarMoneda=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarMoneda=new JPanel();
		
		if(this.jInternalFrameDetalleFormMoneda!=null) {
			jPanelCamposAuxiliarMoneda=this.jInternalFrameDetalleFormMoneda.jPanelCamposMoneda;
			jPanelAccionesFormularioAuxiliarMoneda=this.jInternalFrameDetalleFormMoneda.jPanelAccionesFormularioMoneda;
		}
		
		final JPanel jPanelCamposMoneda=jPanelCamposAuxiliarMoneda;
		final JPanel jPanelAccionesFormularioMoneda=jPanelAccionesFormularioAuxiliarMoneda;
		
		
		final JMenuBar jmenuBarMoneda=this.jmenuBarMoneda;		
		final JToolBar jTtoolBarMoneda=this.jTtoolBarMoneda;
				
		JMenuBar jmenuBarDetalleAuxiliarMoneda=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarMoneda=new JToolBar();
		
		if(this.jInternalFrameDetalleFormMoneda!=null) {
			jmenuBarDetalleAuxiliarMoneda=this.jInternalFrameDetalleFormMoneda.jmenuBarDetalleMoneda;
			jTtoolBarDetalleAuxiliarMoneda=this.jInternalFrameDetalleFormMoneda.jTtoolBarDetalleMoneda;		
		}
		
		final JMenuBar jmenuBarDetalleMoneda=jmenuBarDetalleAuxiliarMoneda;
		final JToolBar jTtoolBarDetalleMoneda=jTtoolBarDetalleAuxiliarMoneda;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasMoneda;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesMoneda;
			processRunnable.jTableDatos=jTableDatosMoneda;
			processRunnable.jPanelCampos=jPanelCamposMoneda;
			processRunnable.jPanelPaginacion=jPanelPaginacionMoneda;
			processRunnable.jPanelAcciones=jPanelAccionesMoneda;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioMoneda;
			
			
			processRunnable.jmenuBar=jmenuBarMoneda;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleMoneda;
			processRunnable.jTtoolBar=jTtoolBarMoneda;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleMoneda;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasMoneda ,jPanelParametrosReportesMoneda, jTableDatosMoneda,/*jScrollPanelDatosMoneda,*/jPanelCamposMoneda,jPanelPaginacionMoneda, /*jScrollPanelDatosEdicionMoneda,*/ jPanelAccionesMoneda,jPanelAccionesFormularioMoneda,jmenuBarMoneda,jmenuBarDetalleMoneda,jTtoolBarMoneda,jTtoolBarDetalleMoneda));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesMoneda(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarMoneda(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuMoneda(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarMoneda(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarMoneda,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleMoneda,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuMoneda(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarMoneda,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleMoneda,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.monedaConstantesFunciones.getsFinalQueryMoneda();
		String  finalQueryPaginacionTodos=this.monedaConstantesFunciones.getsFinalQueryMoneda();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=MonedaConstantesFunciones.getArrayColumnasGlobalesNoMoneda(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=MonedaConstantesFunciones.getArrayColumnasGlobalesMoneda(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,MonedaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.monedasEliminados= new ArrayList<Moneda>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessMoneda();
		
				///*MonedaSessionBean*/this.monedaSessionBean=new MonedaSessionBean();
			
			if(this.monedaSessionBean==null) {
				this.monedaSessionBean=new MonedaSessionBean();
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
					this.iNumeroPaginacion=MonedaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=MonedaConstantesFunciones.getClassesForeignKeysOfMoneda(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/moneda."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			monedasAux= new ArrayList<Moneda>();
			
				
			monedaLogic.setDatosCliente(this.datosCliente);
			monedaLogic.setDatosDeep(this.datosDeep);
			monedaLogic.setIsConDeep(true);
			
			
			monedaLogic.getMonedaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					monedaLogic.getTodosMonedas(finalQueryGlobal,pagination);
					
					//monedaLogic.getTodosMonedasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(monedaLogic.getMonedas()==null|| monedaLogic.getMonedas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							monedasAux= new ArrayList<Moneda>();
							monedasAux.addAll(monedaLogic.getMonedas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							monedasAux= new ArrayList<Moneda>();
							monedasAux.addAll(monedas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							monedaLogic.getTodosMonedas(finalQueryGlobal+"",this.pagination);												
							
							//monedaLogic.getTodosMonedasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteMonedas("Todos",monedaLogic.getMonedas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							monedaLogic.setMonedas(new ArrayList<Moneda>());					
							monedaLogic.getMonedas().addAll(monedasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							monedas=new ArrayList<Moneda>();
							monedas.addAll(monedasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idMoneda=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idMoneda=this.idActual;
				
				} else if(this.idMonedaActual!=null && this.idMonedaActual!=0L) {
					idMoneda=idMonedaActual;
				}
				
					
				this.sDetalleReporte=MonedaConstantesFunciones.getDetalleIndicePorId(idMoneda);
				
				this.monedas=new ArrayList<Moneda>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					monedaLogic.getEntity(idMoneda);
					
					//monedaLogic.getEntityWithConnection(idMoneda);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					monedaLogic.setMonedas(new ArrayList<Moneda>());
					monedaLogic.getMonedas().add(monedaLogic.getMoneda());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.monedas=new ArrayList<Moneda>();
					this.monedas.add(moneda);
				}
				
				if(monedaLogic.getMoneda()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=MonedaConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					monedaLogic.getMonedasBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=MonedaConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=MonedaConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=monedaLogic.getMonedas()==null||monedaLogic.getMonedas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=monedas==null|| monedas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						monedasAux=new ArrayList<Moneda>();
						monedasAux.addAll(monedaLogic.getMonedas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							monedasAux=new ArrayList<Moneda>();
							monedasAux.addAll(monedas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							monedaLogic.getMonedasBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=MonedaConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=MonedaConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteMonedas("BusquedaPorNombre",monedaLogic.getMonedas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteMonedas("BusquedaPorNombre",monedas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						monedaLogic.setMonedas(new ArrayList<Moneda>());
						monedaLogic.getMonedas().addAll(monedasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							monedas=new ArrayList<Moneda>();
							monedas.addAll(monedasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorSigla")) {
				this.sDetalleReporte=MonedaConstantesFunciones.getDetalleIndiceBusquedaPorSigla(siglaBusquedaPorSigla);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					monedaLogic.getMonedasBusquedaPorSigla(finalQueryGlobal,pagination,siglaBusquedaPorSigla);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=MonedaConstantesFunciones.getDetalleIndiceBusquedaPorSigla(siglaBusquedaPorSigla);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=MonedaConstantesFunciones.getDetalleIndiceBusquedaPorSigla(siglaBusquedaPorSigla);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=monedaLogic.getMonedas()==null||monedaLogic.getMonedas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=monedas==null|| monedas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						monedasAux=new ArrayList<Moneda>();
						monedasAux.addAll(monedaLogic.getMonedas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							monedasAux=new ArrayList<Moneda>();
							monedasAux.addAll(monedas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							monedaLogic.getMonedasBusquedaPorSigla(finalQueryGlobal,pagination,siglaBusquedaPorSigla);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=MonedaConstantesFunciones.getDetalleIndiceBusquedaPorSigla(siglaBusquedaPorSigla);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=MonedaConstantesFunciones.getDetalleIndiceBusquedaPorSigla(siglaBusquedaPorSigla);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteMonedas("BusquedaPorSigla",monedaLogic.getMonedas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteMonedas("BusquedaPorSigla",monedas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						monedaLogic.setMonedas(new ArrayList<Moneda>());
						monedaLogic.getMonedas().addAll(monedasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							monedas=new ArrayList<Moneda>();
							monedas.addAll(monedasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=MonedaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					monedaLogic.getMonedasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=MonedaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=MonedaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=monedaLogic.getMonedas()==null||monedaLogic.getMonedas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=monedas==null|| monedas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						monedasAux=new ArrayList<Moneda>();
						monedasAux.addAll(monedaLogic.getMonedas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							monedasAux=new ArrayList<Moneda>();
							monedasAux.addAll(monedas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							monedaLogic.getMonedasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=MonedaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=MonedaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteMonedas("FK_IdEmpresa",monedaLogic.getMonedas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteMonedas("FK_IdEmpresa",monedas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						monedaLogic.setMonedas(new ArrayList<Moneda>());
						monedaLogic.getMonedas().addAll(monedasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							monedas=new ArrayList<Moneda>();
							monedas.addAll(monedasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesMoneda();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessMoneda();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=monedaLogic.getMonedas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=monedas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=monedaLogic.getMonedas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=monedas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Moneda moneda) {
		Boolean permite=true;
		
		if(this.moneda.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=MonedaConstantesFunciones.getOrderByListaMoneda();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=MonedaConstantesFunciones.getOrderByListaMoneda();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Moneda moneda:monedaLogic.getMonedas()) {
				if(moneda.getsType().equals(Constantes2.S_TOTALES)) {
					monedaTotales=moneda;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Moneda moneda:this.monedas) {
				if(moneda.getsType().equals(Constantes2.S_TOTALES)) {
					monedaTotales=moneda;
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
			this.monedaAux=new Moneda();
			this.monedaAux.setsType(Constantes2.S_TOTALES);
			this.monedaAux.setIsNew(false);
			this.monedaAux.setIsChanged(false);
			this.monedaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				MonedaConstantesFunciones.TotalizarValoresFilaMoneda(this.monedaLogic.getMonedas(),this.monedaAux);
				
				this.monedaLogic.getMonedas().add(this.monedaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				MonedaConstantesFunciones.TotalizarValoresFilaMoneda(this.monedas,this.monedaAux);
				
				this.monedas.add(this.monedaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		monedaTotales=new Moneda();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.monedaLogic.getMonedas().remove(monedaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.monedas.remove(monedaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		monedaTotales=new Moneda();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Moneda moneda:monedaLogic.getMonedas()) {
				if(moneda.getsType().equals(Constantes2.S_TOTALES)) {
					monedaTotales=moneda;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				MonedaConstantesFunciones.TotalizarValoresFilaMoneda(this.monedaLogic.getMonedas(),monedaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Moneda moneda:this.monedas) {
				if(moneda.getsType().equals(Constantes2.S_TOTALES)) {
					monedaTotales=moneda;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				MonedaConstantesFunciones.TotalizarValoresFilaMoneda(this.monedas,monedaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getMonedasBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getMonedasBusquedaPorSigla()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorSigla";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getMonedasFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getMonedasBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					monedaLogic.getMonedasBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getMonedasBusquedaPorSigla(String sFinalQuery,String sigla)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					monedaLogic.getMonedasBusquedaPorSigla(sFinalQuery,this.pagination,sigla);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getMonedasFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					monedaLogic.getMonedasFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosMoneda() {
		this.isPermisoTodoMoneda=false;
		this.isPermisoNuevoMoneda=false;
		this.isPermisoActualizarMoneda=false;
		this.isPermisoActualizarOriginalMoneda=false;
		this.isPermisoEliminarMoneda=false;
		this.isPermisoGuardarCambiosMoneda=false;
		this.isPermisoConsultaMoneda=false;
		this.isPermisoBusquedaMoneda=false;
		this.isPermisoReporteMoneda=false;		
		this.isPermisoOrdenMoneda=false;		
		this.isPermisoPaginacionMedioMoneda=false;		
		this.isPermisoPaginacionAltoMoneda=false;
		this.isPermisoPaginacionTodoMoneda=false;
		this.isPermisoCopiarMoneda=false;		
		this.isPermisoVerFormMoneda=false;		
		this.isPermisoDuplicarMoneda=false;		
		this.isPermisoOrdenMoneda=false;		
	}
	
	public void setPermisosUsuarioMoneda(Boolean isPermiso) {
		this.isPermisoTodoMoneda=isPermiso;
		this.isPermisoNuevoMoneda=isPermiso;
		this.isPermisoActualizarMoneda=isPermiso;
		this.isPermisoActualizarOriginalMoneda=isPermiso;
		this.isPermisoEliminarMoneda=isPermiso;
		this.isPermisoGuardarCambiosMoneda=isPermiso;
		this.isPermisoConsultaMoneda=isPermiso;
		this.isPermisoBusquedaMoneda=isPermiso;
		this.isPermisoReporteMoneda=isPermiso;
		this.isPermisoOrdenMoneda=isPermiso;		
		this.isPermisoPaginacionMedioMoneda=isPermiso;		
		this.isPermisoPaginacionAltoMoneda=isPermiso;		
		this.isPermisoPaginacionTodoMoneda=isPermiso;		
		this.isPermisoCopiarMoneda=isPermiso;		
		this.isPermisoVerFormMoneda=isPermiso;		
		this.isPermisoDuplicarMoneda=isPermiso;
		this.isPermisoOrdenMoneda=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioMoneda(Boolean isPermiso) {
		//this.isPermisoTodoMoneda=isPermiso;
		this.isPermisoNuevoMoneda=isPermiso;
		this.isPermisoActualizarMoneda=isPermiso;
		this.isPermisoActualizarOriginalMoneda=isPermiso;
		this.isPermisoEliminarMoneda=isPermiso;
		this.isPermisoGuardarCambiosMoneda=isPermiso;
		//this.isPermisoConsultaMoneda=isPermiso;
		//this.isPermisoBusquedaMoneda=isPermiso;
		//this.isPermisoReporteMoneda=isPermiso;
		//this.isPermisoOrdenMoneda=isPermiso;		
		//this.isPermisoPaginacionMedioMoneda=isPermiso;		
		//this.isPermisoPaginacionAltoMoneda=isPermiso;		
		//this.isPermisoPaginacionTodoMoneda=isPermiso;		
		//this.isPermisoCopiarMoneda=isPermiso;		
		//this.isPermisoDuplicarMoneda=isPermiso;
		//this.isPermisoOrdenMoneda=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioMonedaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(MonedaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebMoneda(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioMonedaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioMonedaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionMonedaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioMonedaClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioMoneda() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(MonedaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.monedaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, MonedaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoMoneda=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarMoneda=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalMoneda=this.isPermisoActualizarMoneda;
			this.isPermisoEliminarMoneda=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosMoneda=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaMoneda=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaMoneda=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoMoneda=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteMoneda=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenMoneda=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioMoneda=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoMoneda=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoMoneda=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarMoneda=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormMoneda=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarMoneda=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenMoneda=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.monedaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosMoneda.setToolTipText(this.jTableDatosMoneda.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioMoneda(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioMoneda(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(MonedaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(MonedaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioMoneda() throws Exception {
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
	public void inicializarCombosForeignKeyMonedaListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyMonedaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(MonedaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyMonedaListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
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
	
	public void cargarCombosLoteForeignKeyMonedaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			MonedaParameterReturnGeneral monedaReturnGeneral=new MonedaParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.monedaConstantesFunciones.cargarid_empresaMoneda)
					 || (this.esRecargarFks && this.monedaConstantesFunciones.cargarid_empresaMoneda)) {

					if(!this.monedaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+monedaSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				monedaReturnGeneral=monedaLogic.cargarCombosLoteForeignKeyMoneda(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=monedaReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyMoneda()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.monedaSessionBean==null) {
				this.monedaSessionBean=new MonedaSessionBean();
			}

			if(!this.monedaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyMoneda()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyMoneda(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyMoneda()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyMoneda();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyMoneda(Moneda moneda)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyMoneda(Moneda moneda,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyMoneda()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyMoneda()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyMoneda()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyMoneda()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroMoneda()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyMoneda()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyMoneda(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyMoneda()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormMoneda.jComboBoxid_empresaMoneda!=null && this.jInternalFrameDetalleFormMoneda.jComboBoxid_empresaMoneda.getItemCount()>0) {
				this.jInternalFrameDetalleFormMoneda.jComboBoxid_empresaMoneda.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public MonedaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public MonedaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public MonedaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.monedaSessionBean=new MonedaSessionBean(); 
		this.monedaConstantesFunciones=new MonedaConstantesFunciones(); 
		this.monedaBean=new Moneda();//(this.monedaConstantesFunciones); 		
		this.monedaReturnGeneral=new MonedaParameterReturnGeneral(); 
		
		this.monedaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.monedaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public MonedaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public MonedaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public MonedaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessMoneda(true);
			
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
			
			this.monedaConstantesFunciones=new MonedaConstantesFunciones(); 
			this.monedaBean=new Moneda();//this.monedaConstantesFunciones); 			
			this.monedaReturnGeneral=new MonedaParameterReturnGeneral(); 
		
			MonedaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Moneda Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.moneda=new Moneda();
			this.monedas = new ArrayList<Moneda>();
			this.monedasAux = new ArrayList<Moneda>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.monedaLogic=new MonedaLogic();
				this.monedaLogic.getNewConnexionToDeep("");
			}
			
			//this.monedaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.monedaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormMoneda);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoMoneda!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoMoneda);	
					}
					
					if(this.jInternalFrameImportacionMoneda!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionMoneda);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByMoneda!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByMoneda);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormMoneda!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormMoneda);
				this.jInternalFrameDetalleFormMoneda.setVisible(false);
				this.jInternalFrameDetalleFormMoneda.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoMoneda!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoMoneda);
					this.jInternalFrameReporteDinamicoMoneda.setVisible(false);
					this.jInternalFrameReporteDinamicoMoneda.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionMoneda!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionMoneda);
					this.jInternalFrameImportacionMoneda.setVisible(false);
					this.jInternalFrameImportacionMoneda.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByMoneda!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByMoneda);
					this.jInternalFrameOrderByMoneda.setVisible(false);
					this.jInternalFrameOrderByMoneda.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idMonedaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=MonedaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.monedaReturnGeneral=new MonedaParameterReturnGeneral();
			
			this.monedaParameterGeneral=new MonedaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.monedaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.monedaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(MonedaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.monedaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,MonedaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.monedaSessionBean.getEsGuardarRelacionado(),this.monedaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,MonedaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.monedaSessionBean.getEsGuardarRelacionado(),this.monedaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoMoneda=false;
			this.isVisibilidadCeldaDuplicarMoneda=true;
			this.isVisibilidadCeldaCopiarMoneda=true;
			this.isVisibilidadCeldaVerFormMoneda=true;
			this.isVisibilidadCeldaOrdenMoneda=true;
			this.isVisibilidadCeldaNuevoRelacionesMoneda=false;
			this.isVisibilidadCeldaModificarMoneda=false;
			this.isVisibilidadCeldaActualizarMoneda=false;
			this.isVisibilidadCeldaEliminarMoneda=false;
			this.isVisibilidadCeldaCancelarMoneda=false;
			this.isVisibilidadCeldaGuardarMoneda=false;
			this.isVisibilidadCeldaGuardarCambiosMoneda=false;
			
			
			this.isVisibilidadBusquedaPorNombre=true;
			this.isVisibilidadBusquedaPorSigla=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesMoneda("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosMoneda();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioMoneda(false);
			
			this.setPermisosUsuarioMoneda();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.monedaSessionBean.getEsGuardarRelacionado() 
				|| (this.monedaSessionBean.getEsGuardarRelacionado() && this.monedaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioMonedaClasesRelacionadas();
			}
			
			if(this.monedaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioMonedaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!MonedaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosMoneda();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualMoneda();
			}
			
			if(!this.isPermisoBusquedaMoneda) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasMoneda.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.monedaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioMoneda,this.isPermisoPaginacionMedioMoneda,this.isPermisoPaginacionTodoMoneda);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(MonedaConstantesFunciones.getTiposSeleccionarMoneda());
				
				this.tiposColumnasSelect=MonedaConstantesFunciones.getTiposSeleccionarMoneda(true);
				
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
			//if(!this.monedaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioMoneda();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioMoneda(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioMoneda(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesMoneda() ;
			
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
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				monedaImplementable= (MonedaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+MonedaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				monedaImplementableHome= (MonedaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+MonedaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.monedas= new ArrayList<Moneda>();
			this.monedasEliminados= new ArrayList<Moneda>();
						
			this.isEsNuevoMoneda=false;
			this.esParaAccionDesdeFormularioMoneda=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyMoneda(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroMoneda();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.monedaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			MonedaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=MonedaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesMoneda("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingMoneda(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormMoneda!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioMoneda();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioMoneda();
			}
			
			MonedaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasMoneda.getTabCount(); i++) {
					this.jTabbedPaneBusquedasMoneda.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasMoneda.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.monedaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessMoneda(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Moneda: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.monedaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.monedaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectMoneda() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesMoneda")) {
				iIndex=this.jInternalFrameDetalleFormMoneda.jTabbedPaneRelacionesMoneda.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormMoneda.jTabbedPaneRelacionesMoneda.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosMoneda.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessMoneda();	
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
	
	public void cargarCombosForeignKeyMoneda(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyMoneda(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyMoneda(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyMonedaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyMoneda();
		
		this.cargarCombosFrameForeignKeyMoneda();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyMoneda();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyMoneda();
		}
	}
	
	
	
	public void jButtonNuevoMonedaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.monedaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormMoneda==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			MonedaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.moneda,new Object(),this.monedaParameterGeneral,this.monedaReturnGeneral);
			
			
			if(jTableDatosMoneda.getRowCount()>=1) {
				jTableDatosMoneda.removeRowSelectionInterval(0, jTableDatosMoneda.getRowCount()-1);						
			}
			
			this.isEsNuevoMoneda=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoMoneda(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesMoneda(true);			
			//this.moneda=new Moneda();
			//this.moneda.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesMoneda(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualMoneda() ;
			
			if(MonedaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleMoneda(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.moneda);	
			this.actualizarInformacion("INFO_PADRE",false,this.moneda);				
			
			MonedaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.moneda,new Object(),this.monedaParameterGeneral,this.monedaReturnGeneral);
			
			if(this.monedaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Moneda: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			MonedaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.moneda,new Object(),this.monedaParameterGeneral,this.monedaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarMonedaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Moneda> monedasSeleccionados=new ArrayList<Moneda>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosMoneda.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosMoneda.getSelectedRows().length;			
			}
			
			monedasSeleccionados=this.getMonedasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoMoneda--;			
				//Moneda monedaAux= new Moneda();			
				//monedaAux.setId(this.iIdNuevoMoneda);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Moneda monedaOrigen=new Moneda();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Moneda monedaOrigen : monedasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosMoneda.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							monedaOrigen =(Moneda) this.monedaLogic.getMonedas().toArray()[this.jTableDatosMoneda.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							monedaOrigen =(Moneda) this.monedas.toArray()[this.jTableDatosMoneda.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaMoneda();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.moneda.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosMoneda(monedaOrigen,this.moneda,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysMoneda(this.moneda);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.monedaLogic.getMonedas().add(this.monedaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.monedas.add(this.monedaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaMoneda(false);
				
				this.jTableDatosMoneda.setRowSelectionInterval(this.getIndiceNuevoMoneda(), this.getIndiceNuevoMoneda());
				
				int iLastRow =  this.jTableDatosMoneda.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosMoneda.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosMoneda.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaMoneda(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarMonedaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Moneda> monedasSeleccionados=new ArrayList<Moneda>();									
		
			Moneda monedaOrigen=new Moneda();
			Moneda monedaDestino=new Moneda();
				
			monedasSeleccionados=this.getMonedasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosMoneda.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || monedasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosMoneda.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						monedaOrigen =(Moneda) this.monedaLogic.getMonedas().toArray()[this.jTableDatosMoneda.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						monedaOrigen =(Moneda) this.monedas.toArray()[this.jTableDatosMoneda.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						monedaDestino =(Moneda) this.monedaLogic.getMonedas().toArray()[this.jTableDatosMoneda.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						monedaDestino =(Moneda) this.monedas.toArray()[this.jTableDatosMoneda.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				monedaOrigen =monedasSeleccionados.get(0);
				monedaDestino =monedasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosMoneda(monedaOrigen,monedaDestino,true,false);
				
				monedaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(monedaDestino,monedaLogic.getMonedas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(monedaDestino,monedas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaMoneda(false);
				
				//this.jTableDatosMoneda.setRowSelectionInterval(this.getIndiceNuevoMoneda(), this.getIndiceNuevoMoneda());
				
				int iLastRow =  this.jTableDatosMoneda.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosMoneda.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosMoneda.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaMoneda(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormMonedaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormMoneda==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormMoneda.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarMonedaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesMoneda.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasMoneda.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesMoneda.setVisible(!isVisible);
			this.jPanelPaginacionMoneda.setVisible(!isVisible);
			this.jPanelAccionesMoneda.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarMonedaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameMoneda();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoMonedaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoMoneda();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionMonedaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionMoneda();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByMonedaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByMoneda();
			
			this.abrirFrameOrderByMoneda();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByMonedaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByMoneda();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleMoneda(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormMoneda);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormMoneda.isMaximum()) {
					this.jInternalFrameDetalleFormMoneda.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormMoneda.setSize(this.jInternalFrameDetalleFormMoneda.iWidthFormulario,this.jInternalFrameDetalleFormMoneda.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormMoneda.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormMoneda.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormMoneda.isMaximum()) {
						this.jInternalFrameDetalleFormMoneda.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormMoneda.jContentPaneDetalleMoneda.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormMoneda.jTabbedPaneRelacionesMoneda.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormMoneda.jContentPaneDetalleMoneda.getWidth(),MonedaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormMoneda.jTabbedPaneRelacionesMoneda.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormMoneda.jContentPaneDetalleMoneda.getWidth(),MonedaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormMoneda.jTabbedPaneRelacionesMoneda.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormMoneda.jContentPaneDetalleMoneda.getWidth(),MonedaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormMoneda.setVisible(true);
	        this.jInternalFrameDetalleFormMoneda.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByMoneda() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByMoneda==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByMoneda=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByMoneda,false,this);
				} else {
					this.jInternalFrameOrderByMoneda=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByMoneda,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByMoneda);
				this.jInternalFrameOrderByMoneda.setVisible(false);
				this.jInternalFrameOrderByMoneda.setSelected(false);
				
				this.jInternalFrameOrderByMoneda.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByMoneda"));
				
				this.inicializarActualizarBindingTablaOrderByMoneda();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionMoneda() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionMoneda==null) {
				
				this.jInternalFrameImportacionMoneda=new ImportacionJInternalFrame(MonedaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionMoneda);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionMoneda);
				this.jInternalFrameImportacionMoneda.setVisible(false);
				this.jInternalFrameImportacionMoneda.setSelected(false);


				this.jInternalFrameImportacionMoneda.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionMoneda"));
				this.jInternalFrameImportacionMoneda.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionMoneda"));
				this.jInternalFrameImportacionMoneda.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionMoneda"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoMoneda() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoMoneda==null) {
				this.jInternalFrameReporteDinamicoMoneda=new ReporteDinamicoJInternalFrame(MonedaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoMoneda);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoMoneda);
				this.jInternalFrameReporteDinamicoMoneda.setVisible(false);
				this.jInternalFrameReporteDinamicoMoneda.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoMoneda.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoMoneda"));
				this.jInternalFrameReporteDinamicoMoneda.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoMoneda"));
				this.jInternalFrameReporteDinamicoMoneda.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoMoneda"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualMoneda();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
					
	public void cerrarFrameDetalleMoneda() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormMoneda);
			
	       	this.jInternalFrameDetalleFormMoneda.setVisible(false);
	        this.jInternalFrameDetalleFormMoneda.setSelected(false);
			
			//this.jInternalFrameDetalleFormMoneda.dispose();
			//this.jInternalFrameDetalleFormMoneda=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoMoneda() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoMoneda.setVisible(true);
	        this.jInternalFrameReporteDinamicoMoneda.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionMoneda() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionMoneda.setVisible(true);
	        this.jInternalFrameImportacionMoneda.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByMoneda() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByMoneda.setVisible(true);
	        this.jInternalFrameOrderByMoneda.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByMoneda() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByMoneda.setVisible(false);
	        this.jInternalFrameOrderByMoneda.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoMoneda() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoMoneda.setVisible(false);
	        this.jInternalFrameReporteDinamicoMoneda.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionMoneda() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionMoneda.setVisible(false);
	        this.jInternalFrameImportacionMoneda.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarMonedaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarMoneda(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarMoneda(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosMoneda.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesMoneda(true);
			//this.isEsNuevoMoneda=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.moneda =(Moneda) this.monedaLogic.getMonedas().toArray()[this.jTableDatosMoneda.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.moneda =(Moneda) this.monedas.toArray()[this.jTableDatosMoneda.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesMoneda("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesMoneda(false) ;
			
			if(monedaSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(MonedaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleMoneda(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualMoneda(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaMonedaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosMoneda.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.moneda =(Moneda) this.monedaLogic.getMonedas().toArray()[this.jTableDatosMoneda.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.moneda =(Moneda) this.monedas.toArray()[this.jTableDatosMoneda.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarMoneda(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormMoneda==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosMoneda.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesMoneda(true);
			//this.isEsNuevoMoneda=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.moneda =(Moneda) this.monedaLogic.getMonedas().toArray()[this.jTableDatosMoneda.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.moneda =(Moneda) this.monedas.toArray()[this.jTableDatosMoneda.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.moneda.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesMoneda("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesMoneda(false) ;
			
			if(MonedaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleMoneda(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualMoneda(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarMonedaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.monedaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesMoneda(false);
			
			//if(!this.isEsNuevoMoneda) {								
				int intSelectedRow = this.jTableDatosMoneda.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.moneda =(Moneda) this.monedaLogic.getMonedas().toArray()[this.jTableDatosMoneda.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.moneda =(Moneda) this.monedas.toArray()[this.jTableDatosMoneda.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(MonedaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualMoneda(this.moneda,true);
				this.setVariablesFormularioToObjetoActualForeignKeysMoneda(this.moneda);
				
			}
			
			if(this.permiteMantenimiento(this.moneda)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.monedaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoMoneda=true;
					this.inicializarActualizarBindingTablaMoneda(false);
					this.isEsNuevoMoneda=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoMoneda=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoMoneda=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesMoneda(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualMoneda(false);
				
				this.habilitarDeshabilitarControlesMoneda(false);
			
												
				
				if(MonedaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleMoneda();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoMonedaActionPerformed(evt,monedaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualMoneda(this.moneda,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosMoneda.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,monedaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.monedaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.moneda.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Moneda.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Moneda.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.monedaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.monedaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarMonedaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.monedaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosMoneda.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.moneda =(Moneda) this.monedaLogic.getMonedas().toArray()[this.jTableDatosMoneda.convertRowIndexToModel(intSelectedRow)];
				this.moneda.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.moneda =(Moneda) this.monedas.toArray()[this.jTableDatosMoneda.convertRowIndexToModel(intSelectedRow)];
				this.moneda.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.moneda)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.monedaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((MonedaModel) this.jTableDatosMoneda.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoMoneda=true;
				this.inicializarActualizarBindingTablaMoneda(false);
				this.isEsNuevoMoneda=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesMoneda(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualMoneda(false);
				
				this.habilitarDeshabilitarControlesMoneda(false);
				
				
				
				if(MonedaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleMoneda();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.monedaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.monedaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.monedaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarMonedaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosMoneda.getRowCount()>=1) {
				jTableDatosMoneda.removeRowSelectionInterval(0, jTableDatosMoneda.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesMoneda(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaMoneda(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesMoneda(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualMoneda(false) ;
			
			this.isEsNuevoMoneda=false;
			
			if(MonedaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleMoneda();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosMonedaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.monedaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingMoneda(false);
				
				//SI ES MANUAL
				if(MonedaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualMoneda();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.monedaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.monedaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.monedaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosMonedaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoMoneda--;			
			//Moneda monedaAux= new Moneda();			
			//monedaAux.setId(this.iIdNuevoMoneda);
			
			if(this.jInternalFrameDetalleFormMoneda==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaMoneda();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysMoneda(this.moneda);
			
			this.moneda.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.monedaLogic.getMonedas().add(this.monedaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.monedas.add(this.monedaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaMoneda(false);
			
			this.jTableDatosMoneda.setRowSelectionInterval(this.getIndiceNuevoMoneda(), this.getIndiceNuevoMoneda());
			
			int iLastRow =  this.jTableDatosMoneda.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosMoneda.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosMoneda.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaMoneda(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionMonedaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.monedaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingMoneda(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingMoneda(false);
			
			//SI ES MANUAL
			if(MonedaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualMoneda();
			}
			
			//this.abrirFrameTreeMoneda();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.monedaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.monedaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.monedaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionMonedaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE MonedaS ?", "MANTENIMIENTO DE Moneda", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionMoneda.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralMoneda();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.monedaReturnGeneral=monedaLogic.procesarImportacionMonedasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.monedaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarMonedaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionMonedaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionMoneda.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionMoneda.setFileImportacion(this.jInternalFrameImportacionMoneda.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionMoneda.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionMoneda.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionMoneda.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionMoneda.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoMonedaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Moneda> monedasSeleccionados=new ArrayList<Moneda>();		

		monedasSeleccionados=this.getMonedasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoMoneda.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoMoneda.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("MonedaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"MonedaBaseDesign.jrxml";
			
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
			
			this.generarReporteMonedas("Todos",monedasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.monedaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Moneda",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoMoneda.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoMoneda.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case MonedaConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MonedaConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MonedaConstantesFunciones.LABEL_SIGLA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_gla_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_gla_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_gla_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_gla_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MonedaConstantesFunciones.LABEL_SIMBOLO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbolo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbolo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbolo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbolo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MonedaConstantesFunciones.LABEL_ESTAACTIVO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_taActivo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_taActivo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_taActivo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_taActivo_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoMoneda.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoMoneda.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoMoneda.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case MonedaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case MonedaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case MonedaConstantesFunciones.LABEL_SIGLA:
					sNombreCampoCategoria="sigla";
					break;

				case MonedaConstantesFunciones.LABEL_SIMBOLO:
					sNombreCampoCategoria="simbolo";
					break;

				case MonedaConstantesFunciones.LABEL_ESTAACTIVO:
					sNombreCampoCategoria="esta_activo";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoMoneda.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case MonedaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case MonedaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case MonedaConstantesFunciones.LABEL_SIGLA:
					sNombreCampoCategoriaValor="sigla";
					break;

				case MonedaConstantesFunciones.LABEL_SIMBOLO:
					sNombreCampoCategoriaValor="simbolo";
					break;

				case MonedaConstantesFunciones.LABEL_ESTAACTIVO:
					sNombreCampoCategoriaValor="esta_activo";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoMoneda.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoMoneda.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case MonedaConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case MonedaConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case MonedaConstantesFunciones.LABEL_SIGLA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sigla",sNombreCampoCategoria,sNombreCampoCategoriaValor,"sigla");
					break;

				case MonedaConstantesFunciones.LABEL_SIMBOLO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Simbolo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"simbolo");
					break;

				case MonedaConstantesFunciones.LABEL_ESTAACTIVO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Esta Activo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"esta_activo");
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
	
	public void jButtonGenerarExcelReporteDinamicoMonedaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Moneda> monedasSeleccionados=new ArrayList<Moneda>();		
		
		monedasSeleccionados=this.getMonedasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"moneda";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("Monedas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoMoneda.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoMoneda.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case MonedaConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MonedaConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(Moneda moneda:monedasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(moneda.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MonedaConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MonedaConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(Moneda moneda:monedasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(moneda.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MonedaConstantesFunciones.LABEL_SIGLA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MonedaConstantesFunciones.LABEL_SIGLA);
					iRow++;

					for(Moneda moneda:monedasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(moneda.getsigla());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MonedaConstantesFunciones.LABEL_SIMBOLO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MonedaConstantesFunciones.LABEL_SIMBOLO);
					iRow++;

					for(Moneda moneda:monedasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(moneda.getsimbolo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MonedaConstantesFunciones.LABEL_ESTAACTIVO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MonedaConstantesFunciones.LABEL_ESTAACTIVO);
					iRow++;

					for(Moneda moneda:monedasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(moneda.getesta_activo());
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
			//	this.getFilaCabeceraExportarExcelMoneda(row);				
			//	iRow++;
			//}				
			
			//for(Moneda monedaAux:monedasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelMoneda(monedaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.monedaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Moneda",JOptionPane.INFORMATION_MESSAGE);
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
				this.monedaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingMoneda(false);
			
			//SI ES MANUAL
			if(MonedaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualMoneda();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.monedaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.monedaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.monedaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresMonedaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.monedaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingMoneda(false);
			
			//SI ES MANUAL
			if(MonedaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualMoneda();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.monedaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.monedaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.monedaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesMonedaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.monedaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingMoneda(false);
			
			//SI ES MANUAL
			if(MonedaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualMoneda();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.monedaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.monedaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.monedaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaMoneda() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosMoneda.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosMoneda.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosMoneda.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosMoneda.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosMoneda.setMinimumSize(dimensionMinimum);
		this.jTableDatosMoneda.setMaximumSize(dimensionMaximum);
		this.jTableDatosMoneda.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingMoneda(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingMoneda(esInicializar,true);
	}
	
	public void inicializarActualizarBindingMoneda(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaMoneda(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesMoneda(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.monedaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasMoneda(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesMoneda(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesMoneda(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !MonedaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!MonedaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualMoneda() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaMoneda();
		
		this.inicializarActualizarBindingBotonesManualMoneda(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.monedaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualMoneda();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesMoneda() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualMoneda(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualMoneda(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosMoneda.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosMoneda.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteMoneda.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormMoneda!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormMoneda.jCheckBoxPostAccionNuevoMoneda.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormMoneda.jCheckBoxPostAccionSinCerrarMoneda.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormMoneda.jCheckBoxPostAccionSinMensajeMoneda.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosMoneda.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosMoneda.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteMoneda.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormMoneda!=null) {
				this.jInternalFrameDetalleFormMoneda.jCheckBoxPostAccionNuevoMoneda.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormMoneda.jCheckBoxPostAccionSinCerrarMoneda.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormMoneda.jCheckBoxPostAccionSinMensajeMoneda.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionMoneda.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionMoneda.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormMoneda!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormMoneda.jComboBoxTiposAccionesFormularioMoneda.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesMoneda.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoMoneda!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoMoneda.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesMoneda.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesMoneda.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarMoneda.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesMoneda.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoMoneda!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoMoneda.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesMoneda.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralMoneda.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesMoneda(Boolean esInicializar) throws Exception {
		try	{	
			if(MonedaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualMoneda(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesMoneda() throws Exception {
		try	{
			if(MonedaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualMoneda();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleMoneda() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormMoneda.jComboBoxTiposAccionesFormularioMoneda.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormMoneda.jComboBoxTiposAccionesFormularioMoneda.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualMoneda() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesMoneda.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesMoneda.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesMoneda.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesMoneda.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesMoneda.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesMoneda.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionMoneda.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionMoneda.addItem(reporte);
			}
			
			
			if(!this.monedaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionMoneda.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionMoneda.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesMoneda.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesMoneda.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesMoneda.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesMoneda.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormMoneda!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormMoneda.jComboBoxTiposAccionesFormularioMoneda.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormMoneda.jComboBoxTiposAccionesFormularioMoneda.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarMoneda.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarMoneda.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarMoneda.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualMoneda();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualMoneda() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoMoneda!=null) {
				this.jInternalFrameReporteDinamicoMoneda.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoMoneda.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoMoneda!=null) {
				this.jInternalFrameReporteDinamicoMoneda.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoMoneda.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoMoneda!=null) {
				
				if(this.jInternalFrameReporteDinamicoMoneda.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoMoneda.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoMoneda.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoMoneda.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoMoneda.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoMoneda.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualMoneda()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.nombreBusquedaPorNombre=this.jTextFieldnombreBusquedaPorNombreMoneda.getText();
		this.siglaBusquedaPorSigla=this.jTextFieldsiglaBusquedaPorSiglaMoneda.getText();
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasMoneda(Boolean esInicializar) throws Exception {				
		if(MonedaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualMoneda();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaMoneda() throws Exception {
		this.inicializarActualizarBindingTablaMoneda(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByMoneda() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByMoneda.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByMoneda.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByMoneda.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new MonedaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByMoneda.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByMoneda.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new MonedaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosMonedaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMonedaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new MonedaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByMoneda.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByMoneda.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new MonedaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByMoneda.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaMoneda(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=monedaLogic.getMonedas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=monedas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(MonedaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosMoneda.setModel(new MonedaModel(this.monedaLogic.getMonedas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosMoneda.setModel(new MonedaModel(this.monedas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByMoneda!=null && this.jInternalFrameOrderByMoneda.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByMoneda();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosMoneda.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMoneda,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new MonedaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+MonedaConstantesFunciones.SCLASSWEBTITULO,monedaConstantesFunciones.resaltarSeleccionarMoneda,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+MonedaConstantesFunciones.SCLASSWEBTITULO,monedaConstantesFunciones.resaltarSeleccionarMoneda,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosMoneda.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMoneda,MonedaConstantesFunciones.LABEL_ID));

		if(this.monedaConstantesFunciones.mostraridMoneda && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MonedaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.monedaConstantesFunciones.resaltaridMoneda,this.monedaConstantesFunciones.activaridMoneda,this,true,"idMoneda","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.monedaConstantesFunciones.resaltaridMoneda,this.monedaConstantesFunciones.activaridMoneda,this,true,"idMoneda","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMoneda.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMoneda,MonedaConstantesFunciones.LABEL_IDEMPRESA));

		if(this.monedaConstantesFunciones.mostrarid_empresaMoneda && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MonedaConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.monedaConstantesFunciones.resaltarid_empresaMoneda,this,this.monedaConstantesFunciones.activarid_empresaMoneda));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.monedaConstantesFunciones.resaltarid_empresaMoneda,this,this.monedaConstantesFunciones.activarid_empresaMoneda,false,"id_empresaMoneda","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new MonedaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMoneda.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMoneda,MonedaConstantesFunciones.LABEL_NOMBRE));

		if(this.monedaConstantesFunciones.mostrarnombreMoneda && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MonedaConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.monedaConstantesFunciones.resaltarnombreMoneda,this.monedaConstantesFunciones.activarnombreMoneda,this,true,"nombreMoneda","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.monedaConstantesFunciones.resaltarnombreMoneda,this.monedaConstantesFunciones.activarnombreMoneda,this,true,"nombreMoneda","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new MonedaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMoneda.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMoneda,MonedaConstantesFunciones.LABEL_SIGLA));

		if(this.monedaConstantesFunciones.mostrarsiglaMoneda && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MonedaConstantesFunciones.LABEL_SIGLA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.monedaConstantesFunciones.resaltarsiglaMoneda,this.monedaConstantesFunciones.activarsiglaMoneda,this,true,"siglaMoneda","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.monedaConstantesFunciones.resaltarsiglaMoneda,this.monedaConstantesFunciones.activarsiglaMoneda,this,true,"siglaMoneda","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new MonedaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMoneda.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMoneda,MonedaConstantesFunciones.LABEL_SIMBOLO));

		if(this.monedaConstantesFunciones.mostrarsimboloMoneda && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MonedaConstantesFunciones.LABEL_SIMBOLO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.monedaConstantesFunciones.resaltarsimboloMoneda,this.monedaConstantesFunciones.activarsimboloMoneda,this,true,"simboloMoneda","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.monedaConstantesFunciones.resaltarsimboloMoneda,this.monedaConstantesFunciones.activarsimboloMoneda,this,true,"simboloMoneda","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new MonedaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMoneda.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMoneda,MonedaConstantesFunciones.LABEL_ESTAACTIVO));

		if(this.monedaConstantesFunciones.mostraresta_activoMoneda && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MonedaConstantesFunciones.LABEL_ESTAACTIVO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.monedaConstantesFunciones.resaltaresta_activoMoneda,this.monedaConstantesFunciones.activaresta_activoMoneda));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.monedaConstantesFunciones.resaltaresta_activoMoneda,this.monedaConstantesFunciones.activaresta_activoMoneda,this,true,"esta_activoMoneda","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new MonedaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.monedaSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.monedaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.monedaSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosMoneda.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.monedaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.monedaSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosMoneda.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarMoneda && this.isPermisoGuardarCambiosMoneda) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.monedaSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.monedaSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosMoneda.addColumn(tableColumn);
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
			
			this.jTableDatosMoneda.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarMoneda && this.isPermisoGuardarCambiosMoneda) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarMoneda && this.isPermisoGuardarCambiosMoneda) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosMoneda.moveColumn(this.jTableDatosMoneda.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosMoneda.moveColumn(this.jTableDatosMoneda.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosMoneda.moveColumn(this.jTableDatosMoneda.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosMoneda.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosMoneda.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosMoneda,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!MonedaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosMoneda.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosMoneda.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!MonedaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!MonedaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosMoneda.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosMoneda.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosMoneda.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=monedaLogic.getMonedas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=monedas.size()-1;
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
		//this.jTableDatosMoneda.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosMoneda.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosMoneda();
			
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
				
				//this.isEsNuevoMoneda=false;
					
				MonedaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.moneda,new Object(),this.monedaParameterGeneral,this.monedaReturnGeneral);
			
				if(this.monedaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormMoneda==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosMoneda.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosMoneda.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.moneda =(Moneda) this.monedaLogic.getMonedas().toArray()[this.jTableDatosMoneda.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.moneda =(Moneda) this.monedas.toArray()[this.jTableDatosMoneda.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.moneda.getsType().equals("DUPLICADO")
				   || this.moneda.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoMoneda=true;
				
				} else {
					this.isEsNuevoMoneda=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.monedaSessionBean.getEsGuardarRelacionado()) {
					if(this.moneda.getId()>=0 && !this.moneda.getIsNew()) {						
						this.isEsNuevoMoneda=false;
						
					} else {
						this.isEsNuevoMoneda=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoMoneda(esRelaciones);						
				
				this.seleccionarMoneda(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.moneda.getId()<0) {
					this.isEsNuevoMoneda=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarMoneda(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarMoneda(evt,rowIndex);
				}	
				
				if(this.monedaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Moneda: " + this.dDif); 
					}
				}								
				
				MonedaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.moneda,new Object(),this.monedaParameterGeneral,this.monedaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarMoneda(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.moneda)) {
					if(this.moneda.getId()>0) {
						this.moneda.setIsDeleted(true);
						
						this.monedasEliminados.add(this.moneda);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.monedaLogic.getMonedas().remove(this.moneda);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.monedas.remove(this.moneda);				
					}
					
					
					((MonedaModel) this.jTableDatosMoneda.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaMoneda(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarMoneda(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoMoneda) {
			
			if(this.jInternalFrameDetalleFormMoneda==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosMoneda.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosMoneda.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.moneda =(Moneda) this.monedaLogic.getMonedas().toArray()[this.jTableDatosMoneda.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.moneda =(Moneda) this.monedas.toArray()[this.jTableDatosMoneda.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(MonedaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioMoneda(this.moneda);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.monedaConstantesFunciones.cargarid_empresaMoneda || this.monedaConstantesFunciones.event_dependid_empresaMoneda) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.moneda.getid_empresa());
									//this.inicializarActualizarBindingMoneda(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(moneda.getEmpresa()!=null) {
							this.empresasForeignKey.add(moneda.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.moneda.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesMoneda("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesMoneda(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualMoneda() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoMoneda(Moneda moneda) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoMoneda(moneda,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoMoneda(Moneda moneda,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioMoneda(moneda);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyMoneda(moneda,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyMoneda(moneda);
	}
	
	public void setVariablesObjetoActualToFormularioMoneda(Moneda moneda) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormMoneda==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormMoneda.jLabelidMoneda.setText(moneda.getId().toString());
			this.jInternalFrameDetalleFormMoneda.jTextFieldnombreMoneda.setText(moneda.getnombre());
			this.jInternalFrameDetalleFormMoneda.jTextFieldsiglaMoneda.setText(moneda.getsigla());
			this.jInternalFrameDetalleFormMoneda.jTextFieldsimboloMoneda.setText(moneda.getsimbolo());
			this.jInternalFrameDetalleFormMoneda.jCheckBoxesta_activoMoneda.setSelected(moneda.getesta_activo());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Moneda monedaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,monedaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Moneda monedaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				monedaLocal=this.moneda;
			} else {
				monedaLocal=this.monedaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(monedaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoMoneda(monedaLocal,true);
					
					if(monedaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(monedaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.monedaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(monedaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoMoneda(Moneda moneda,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualMoneda(moneda,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysMoneda(moneda);
	}
	
	public void setVariablesFormularioToObjetoActualMoneda(Moneda moneda,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualMoneda(moneda,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualMoneda(Moneda moneda,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormMoneda==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormMoneda.jLabelidMoneda.getText()==null || this.jInternalFrameDetalleFormMoneda.jLabelidMoneda.getText()=="" || this.jInternalFrameDetalleFormMoneda.jLabelidMoneda.getText()=="Id") {
				this.jInternalFrameDetalleFormMoneda.jLabelidMoneda.setText("0");
			}

			if(conColumnasBase) {moneda.setId(Long.parseLong(this.jInternalFrameDetalleFormMoneda.jLabelidMoneda.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MonedaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMoneda.jLabelIdMoneda,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			moneda.setnombre(this.jInternalFrameDetalleFormMoneda.jTextFieldnombreMoneda.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MonedaConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMoneda.jLabelnombreMoneda,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			moneda.setsigla(this.jInternalFrameDetalleFormMoneda.jTextFieldsiglaMoneda.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MonedaConstantesFunciones.LABEL_SIGLA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMoneda.jLabelsiglaMoneda,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			moneda.setsimbolo(this.jInternalFrameDetalleFormMoneda.jTextFieldsimboloMoneda.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MonedaConstantesFunciones.LABEL_SIMBOLO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMoneda.jLabelsimboloMoneda,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			moneda.setesta_activo(this.jInternalFrameDetalleFormMoneda.jCheckBoxesta_activoMoneda.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MonedaConstantesFunciones.LABEL_ESTAACTIVO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMoneda.jLabelesta_activoMoneda,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualMoneda(Moneda monedaBean,Moneda moneda,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosMoneda(Moneda monedaOrigen,Moneda moneda,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && monedaOrigen.getId()!=null && !monedaOrigen.getId().equals(0L))) {moneda.setId(monedaOrigen.getId());}}
			if(conDefault || (!conDefault && monedaOrigen.getnombre()!=null && !monedaOrigen.getnombre().equals(""))) {moneda.setnombre(monedaOrigen.getnombre());}
			if(conDefault || (!conDefault && monedaOrigen.getsigla()!=null && !monedaOrigen.getsigla().equals(""))) {moneda.setsigla(monedaOrigen.getsigla());}
			if(conDefault || (!conDefault && monedaOrigen.getsimbolo()!=null && !monedaOrigen.getsimbolo().equals(""))) {moneda.setsimbolo(monedaOrigen.getsimbolo());}
			if(conDefault || (!conDefault && monedaOrigen.getesta_activo()!=null && !monedaOrigen.getesta_activo().equals(false))) {moneda.setesta_activo(monedaOrigen.getesta_activo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioMoneda(Moneda moneda) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormMoneda.jLabelidMoneda.setText(moneda.getId().toString());
			this.jInternalFrameDetalleFormMoneda.jTextFieldnombreMoneda.setText(moneda.getnombre());
			this.jInternalFrameDetalleFormMoneda.jTextFieldsiglaMoneda.setText(moneda.getsigla());
			this.jInternalFrameDetalleFormMoneda.jTextFieldsimboloMoneda.setText(moneda.getsimbolo());
			this.jInternalFrameDetalleFormMoneda.jCheckBoxesta_activoMoneda.setSelected(moneda.getesta_activo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioMoneda(MonedaBean monedaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormMoneda.jLabelidMoneda.setText(monedaBean.getId().toString());
			this.jInternalFrameDetalleFormMoneda.jTextFieldnombreMoneda.setText(monedaBean.getnombre());
			this.jInternalFrameDetalleFormMoneda.jTextFieldsiglaMoneda.setText(monedaBean.getsigla());
			this.jInternalFrameDetalleFormMoneda.jTextFieldsimboloMoneda.setText(monedaBean.getsimbolo());
			this.jInternalFrameDetalleFormMoneda.jCheckBoxesta_activoMoneda.setSelected(monedaBean.getesta_activo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanMoneda(MonedaParameterReturnGeneral monedaReturnGeneral,MonedaBean monedaBean,Boolean conDefault) throws Exception { 
		try {
			Moneda monedaLocal=new Moneda();
			
			monedaLocal=monedaReturnGeneral.getMoneda();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && monedaLocal.getId()!=null && !monedaLocal.getId().equals(0L))) {monedaBean.setId(monedaLocal.getId());}}
			if(conDefault || (!conDefault && monedaLocal.getnombre()!=null && !monedaLocal.getnombre().equals(""))) {monedaBean.setnombre(monedaLocal.getnombre());}
			if(conDefault || (!conDefault && monedaLocal.getsigla()!=null && !monedaLocal.getsigla().equals(""))) {monedaBean.setsigla(monedaLocal.getsigla());}
			if(conDefault || (!conDefault && monedaLocal.getsimbolo()!=null && !monedaLocal.getsimbolo().equals(""))) {monedaBean.setsimbolo(monedaLocal.getsimbolo());}
			if(conDefault || (!conDefault && monedaLocal.getesta_activo()!=null && !monedaLocal.getesta_activo().equals(false))) {monedaBean.setesta_activo(monedaLocal.getesta_activo());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxMonedaGenerico(Long idMonedaSeleccionado,JComboBox jComboBoxMoneda,List<Moneda> monedasLocal)throws Exception {
		try {
			Moneda  monedaTemp=null;

			for(Moneda monedaAux:monedasLocal) {
				if(monedaAux.getId()!=null && monedaAux.getId().equals(idMonedaSeleccionado)) {
					monedaTemp=monedaAux;
					break;
				}
			}

			jComboBoxMoneda.setSelectedItem(monedaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxMonedaGenerico(JComboBox jComboBoxMoneda,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxMoneda.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxMoneda.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxMoneda.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxMoneda.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxMoneda.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxMoneda.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxMoneda.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxMoneda.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxMoneda.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxMoneda.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			moneda=(Moneda) monedaLogic.getMonedas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			moneda =(Moneda) monedas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!moneda.getIsNew() && !moneda.getIsChanged() && !moneda.getIsDeleted()) {
				sDescripcion=moneda.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=moneda.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Moneda monedaRow=new Moneda();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			monedaRow=(Moneda) monedaLogic.getMonedas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			monedaRow=(Moneda) monedas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualMoneda(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoMoneda.setVisible((this.isVisibilidadCeldaNuevoMoneda && this.isPermisoNuevoMoneda));			
			this.jButtonDuplicarMoneda.setVisible((this.isVisibilidadCeldaDuplicarMoneda && this.isPermisoDuplicarMoneda));			
			this.jButtonCopiarMoneda.setVisible((this.isVisibilidadCeldaCopiarMoneda && this.isPermisoCopiarMoneda));
			this.jButtonVerFormMoneda.setVisible((this.isVisibilidadCeldaVerFormMoneda && this.isPermisoVerFormMoneda));
			
			this.jButtonAbrirOrderByMoneda.setVisible((this.isVisibilidadCeldaOrdenMoneda && this.isPermisoOrdenMoneda));			
			
			this.jButtonNuevoRelacionesMoneda.setVisible((this.isVisibilidadCeldaNuevoRelacionesMoneda && this.isPermisoNuevoMoneda));			
			this.jButtonNuevoGuardarCambiosMoneda.setVisible((this.isVisibilidadCeldaNuevoMoneda && this.isPermisoNuevoMoneda && this.isPermisoGuardarCambiosMoneda));
			
			if(this.jInternalFrameDetalleFormMoneda!=null) {
			this.jInternalFrameDetalleFormMoneda.jButtonModificarMoneda.setVisible((this.isVisibilidadCeldaModificarMoneda && this.isPermisoActualizarMoneda));	
			this.jInternalFrameDetalleFormMoneda.jButtonActualizarMoneda.setVisible((this.isVisibilidadCeldaActualizarMoneda && this.isPermisoActualizarMoneda));	
			this.jInternalFrameDetalleFormMoneda.jButtonEliminarMoneda.setVisible((this.isVisibilidadCeldaEliminarMoneda && this.isPermisoEliminarMoneda));
			this.jInternalFrameDetalleFormMoneda.jButtonCancelarMoneda.setVisible(this.isVisibilidadCeldaCancelarMoneda);							
			this.jInternalFrameDetalleFormMoneda.jButtonGuardarCambiosMoneda.setVisible((this.isVisibilidadCeldaGuardarMoneda && this.isPermisoGuardarCambiosMoneda));			
			
			}
						
			this.jButtonGuardarCambiosTablaMoneda.setVisible((this.isVisibilidadCeldaGuardarCambiosMoneda && this.isPermisoGuardarCambiosMoneda));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarMoneda.setVisible((this.isVisibilidadCeldaNuevoMoneda && this.isPermisoNuevoMoneda));						
			this.jButtonDuplicarToolBarMoneda.setVisible((this.isVisibilidadCeldaDuplicarMoneda && this.isPermisoDuplicarMoneda));						
			this.jButtonCopiarToolBarMoneda.setVisible((this.isVisibilidadCeldaCopiarMoneda && this.isPermisoCopiarMoneda));			
			this.jButtonVerFormToolBarMoneda.setVisible((this.isVisibilidadCeldaVerFormMoneda && this.isPermisoVerFormMoneda));			
			this.jButtonAbrirOrderByToolBarMoneda.setVisible((this.isVisibilidadCeldaOrdenMoneda && this.isPermisoOrdenMoneda));
			this.jButtonNuevoRelacionesToolBarMoneda.setVisible((this.isVisibilidadCeldaNuevoRelacionesMoneda && this.isPermisoNuevoMoneda));			
			this.jButtonNuevoGuardarCambiosToolBarMoneda.setVisible((this.isVisibilidadCeldaNuevoMoneda && this.isPermisoNuevoMoneda && this.isPermisoGuardarCambiosMoneda));			
			
			if(this.jInternalFrameDetalleFormMoneda!=null) {
			this.jInternalFrameDetalleFormMoneda.jButtonModificarToolBarMoneda.setVisible((this.isVisibilidadCeldaModificarMoneda && this.isPermisoActualizarMoneda));	
			this.jInternalFrameDetalleFormMoneda.jButtonActualizarToolBarMoneda.setVisible((this.isVisibilidadCeldaActualizarMoneda  && this.isPermisoActualizarMoneda));	
			this.jInternalFrameDetalleFormMoneda.jButtonEliminarToolBarMoneda.setVisible((this.isVisibilidadCeldaEliminarMoneda && this.isPermisoEliminarMoneda));
			this.jInternalFrameDetalleFormMoneda.jButtonCancelarToolBarMoneda.setVisible(this.isVisibilidadCeldaCancelarMoneda);				
			this.jInternalFrameDetalleFormMoneda.jButtonGuardarCambiosToolBarMoneda.setVisible((this.isVisibilidadCeldaGuardarMoneda && this.isPermisoGuardarCambiosMoneda));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarMoneda.setVisible((this.isVisibilidadCeldaGuardarCambiosMoneda && this.isPermisoGuardarCambiosMoneda));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoMoneda.setVisible((this.isVisibilidadCeldaNuevoMoneda && this.isPermisoNuevoMoneda));			
			this.jMenuItemDuplicarMoneda.setVisible((this.isVisibilidadCeldaDuplicarMoneda && this.isPermisoDuplicarMoneda));			
			this.jMenuItemCopiarMoneda.setVisible((this.isVisibilidadCeldaCopiarMoneda && this.isPermisoCopiarMoneda));			
			this.jMenuItemVerFormMoneda.setVisible((this.isVisibilidadCeldaVerFormMoneda && this.isPermisoVerFormMoneda));			
			this.jMenuItemAbrirOrderByMoneda.setVisible((this.isVisibilidadCeldaOrdenMoneda && this.isPermisoOrdenMoneda));			
			//this.jMenuItemMostrarOcultarMoneda.setVisible((this.isVisibilidadCeldaOrdenMoneda && this.isPermisoOrdenMoneda));
			this.jMenuItemDetalleAbrirOrderByMoneda.setVisible((this.isVisibilidadCeldaOrdenMoneda && this.isPermisoOrdenMoneda));			
			//this.jMenuItemDetalleMostrarOcultarMoneda.setVisible((this.isVisibilidadCeldaOrdenMoneda && this.isPermisoOrdenMoneda));			
			this.jMenuItemNuevoRelacionesMoneda.setVisible((this.isVisibilidadCeldaNuevoRelacionesMoneda && this.isPermisoNuevoMoneda));			
			this.jMenuItemNuevoGuardarCambiosMoneda.setVisible((this.isVisibilidadCeldaNuevoMoneda && this.isPermisoNuevoMoneda && this.isPermisoGuardarCambiosMoneda));									
			
			if(this.jInternalFrameDetalleFormMoneda!=null) {
			this.jInternalFrameDetalleFormMoneda.jMenuItemModificarMoneda.setVisible((this.isVisibilidadCeldaModificarMoneda && this.isPermisoActualizarMoneda));	
			this.jInternalFrameDetalleFormMoneda.jMenuItemActualizarMoneda.setVisible((this.isVisibilidadCeldaActualizarMoneda && this.isPermisoActualizarMoneda));	
			this.jInternalFrameDetalleFormMoneda.jMenuItemEliminarMoneda.setVisible((this.isVisibilidadCeldaEliminarMoneda && this.isPermisoEliminarMoneda));
			this.jInternalFrameDetalleFormMoneda.jMenuItemCancelarMoneda.setVisible(this.isVisibilidadCeldaCancelarMoneda);				
			}
			
			this.jMenuItemGuardarCambiosMoneda.setVisible((this.isVisibilidadCeldaGuardarMoneda && this.isPermisoGuardarCambiosMoneda));						
			this.jMenuItemGuardarCambiosTablaMoneda.setVisible((this.isVisibilidadCeldaGuardarCambiosMoneda && this.isPermisoGuardarCambiosMoneda));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoMoneda=this.jButtonNuevoMoneda.isVisible();
			this.isVisibilidadCeldaDuplicarMoneda=this.jButtonDuplicarMoneda.isVisible();
			this.isVisibilidadCeldaCopiarMoneda=this.jButtonCopiarMoneda.isVisible();
			this.isVisibilidadCeldaVerFormMoneda=this.jButtonVerFormMoneda.isVisible();
			
			this.isVisibilidadCeldaOrdenMoneda=this.jButtonAbrirOrderByMoneda.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesMoneda=this.jButtonNuevoRelacionesMoneda.isVisible();
			this.isVisibilidadCeldaModificarMoneda=this.jButtonModificarMoneda.isVisible();
			
			if(this.jInternalFrameDetalleFormMoneda!=null) {
			this.isVisibilidadCeldaActualizarMoneda=this.jInternalFrameDetalleFormMoneda.jButtonActualizarMoneda.isVisible();
			this.isVisibilidadCeldaEliminarMoneda=this.jInternalFrameDetalleFormMoneda.jButtonEliminarMoneda.isVisible();
			this.isVisibilidadCeldaCancelarMoneda=this.jInternalFrameDetalleFormMoneda.jButtonCancelarMoneda.isVisible();
			this.isVisibilidadCeldaGuardarMoneda=this.jInternalFrameDetalleFormMoneda.jButtonGuardarCambiosMoneda.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosMoneda=this.jButtonGuardarCambiosTablaMoneda.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoMoneda=this.jButtonNuevoToolBarMoneda.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesMoneda=this.jButtonNuevoRelacionesToolBarMoneda.isVisible();
			
			if(this.jInternalFrameDetalleFormMoneda!=null) {
			this.isVisibilidadCeldaModificarMoneda=this.jInternalFrameDetalleFormMoneda.jButtonModificarToolBarMoneda.isVisible();
			this.isVisibilidadCeldaActualizarMoneda=this.jInternalFrameDetalleFormMoneda.jButtonActualizarToolBarMoneda.isVisible();
			this.isVisibilidadCeldaEliminarMoneda=this.jInternalFrameDetalleFormMoneda.jButtonEliminarToolBarMoneda.isVisible();
			this.isVisibilidadCeldaCancelarMoneda=this.jInternalFrameDetalleFormMoneda.jButtonCancelarToolBarMoneda.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarMoneda=this.jButtonGuardarCambiosToolBarMoneda.isVisible();
			this.isVisibilidadCeldaGuardarCambiosMoneda=this.jButtonGuardarCambiosTablaToolBarMoneda.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoMoneda=this.jMenuItemNuevoMoneda.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesMoneda=this.jMenuItemNuevoRelacionesMoneda.isVisible();
			
			if(this.jInternalFrameDetalleFormMoneda!=null) {
			this.isVisibilidadCeldaModificarMoneda=this.jInternalFrameDetalleFormMoneda.jMenuItemModificarMoneda.isVisible();
			this.isVisibilidadCeldaActualizarMoneda=this.jInternalFrameDetalleFormMoneda.jMenuItemActualizarMoneda.isVisible();
			this.isVisibilidadCeldaEliminarMoneda=this.jInternalFrameDetalleFormMoneda.jMenuItemEliminarMoneda.isVisible();
			this.isVisibilidadCeldaCancelarMoneda=this.jInternalFrameDetalleFormMoneda.jMenuItemCancelarMoneda.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarMoneda=this.jMenuItemGuardarCambiosMoneda.isVisible();
			this.isVisibilidadCeldaGuardarCambiosMoneda=this.jMenuItemGuardarCambiosTablaMoneda.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesMoneda(Boolean esInicializar) {
		if(MonedaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.monedaSessionBean.getConGuardarRelaciones()) {
				//if(this.monedaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesMoneda();
			}
			
			this.inicializarActualizarBindingBotonesManualMoneda(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualMoneda() {
		this.jButtonNuevoMoneda.setVisible(this.isPermisoNuevoMoneda);			
		this.jButtonDuplicarMoneda.setVisible(this.isPermisoDuplicarMoneda);			
		this.jButtonCopiarMoneda.setVisible(this.isPermisoCopiarMoneda);			
		this.jButtonVerFormMoneda.setVisible(this.isPermisoVerFormMoneda);			
		
		this.jButtonAbrirOrderByMoneda.setVisible(this.isPermisoOrdenMoneda);					
		
		this.jButtonNuevoRelacionesMoneda.setVisible(this.isPermisoNuevoMoneda);			
		
		if(this.jInternalFrameDetalleFormMoneda!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMoneda.jButtonModificarMoneda.setVisible(this.isPermisoActualizarMoneda);	
			this.jInternalFrameDetalleFormMoneda.jButtonActualizarMoneda.setVisible(this.isPermisoActualizarMoneda);	
			this.jInternalFrameDetalleFormMoneda.jButtonEliminarMoneda.setVisible(this.isPermisoEliminarMoneda);
			this.jInternalFrameDetalleFormMoneda.jButtonCancelarMoneda.setVisible(this.isVisibilidadCeldaCancelarMoneda);						
			this.jInternalFrameDetalleFormMoneda.jButtonGuardarCambiosMoneda.setVisible(this.isPermisoGuardarCambiosMoneda);							
		}
		
		this.jButtonGuardarCambiosTablaMoneda.setVisible(this.isPermisoActualizarMoneda);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleMoneda() {
		this.jInternalFrameDetalleFormMoneda.jButtonModificarMoneda.setVisible(this.isPermisoActualizarMoneda);	
		this.jInternalFrameDetalleFormMoneda.jButtonActualizarMoneda.setVisible(this.isPermisoActualizarMoneda);	
		this.jInternalFrameDetalleFormMoneda.jButtonEliminarMoneda.setVisible(this.isPermisoEliminarMoneda);
		this.jInternalFrameDetalleFormMoneda.jButtonCancelarMoneda.setVisible(this.isVisibilidadCeldaCancelarMoneda);							
		this.jInternalFrameDetalleFormMoneda.jButtonGuardarCambiosMoneda.setVisible((this.isVisibilidadCeldaGuardarMoneda && this.isPermisoGuardarCambiosMoneda));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosMoneda() {
		if(MonedaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualMoneda();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesMoneda() {
	}
	
	public void jTableDatosMonedaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarMoneda(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidMonedaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.monedaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMoneda.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMoneda(this.getmoneda(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMoneda(this.moneda);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.moneda =(Moneda) this.monedaLogic.getMonedas().toArray()[this.jTableDatosMoneda.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.moneda =(Moneda) this.monedas.toArray()[this.jTableDatosMoneda.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.moneda==null) {
						this.moneda = new Moneda();
					}

					this.setVariablesFormularioToObjetoActualMoneda(this.moneda,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMoneda(this.moneda);
				}

				if(this.moneda.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.moneda.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMoneda(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.monedaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.monedaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MonedaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.monedaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaMonedaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.monedaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebMoneda(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMoneda.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosMoneda.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosMoneda.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.moneda =(Moneda) this.monedaLogic.getMonedas().toArray()[this.jTableDatosMoneda.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.moneda =(Moneda) this.monedas.toArray()[this.jTableDatosMoneda.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualMoneda(this.getmoneda(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysMoneda(this.moneda);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.monedaLogic.getConnexion());

				if(this.moneda.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.moneda.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderMoneda=(TitledBorder)this.jScrollPanelDatosMoneda.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderMoneda.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.monedaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.monedaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MonedaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.monedaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaMonedaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.monedaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMoneda.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMoneda(this.getmoneda(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMoneda(this.moneda);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.moneda =(Moneda) this.monedaLogic.getMonedas().toArray()[this.jTableDatosMoneda.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.moneda =(Moneda) this.monedas.toArray()[this.jTableDatosMoneda.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.moneda==null) {
						this.moneda = new Moneda();
					}

					this.setVariablesFormularioToObjetoActualMoneda(this.moneda,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMoneda(this.moneda);
				}

				if(this.moneda.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.moneda.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMoneda(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.monedaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.monedaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MonedaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.monedaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreMonedaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.monedaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMoneda.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMoneda(this.getmoneda(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMoneda(this.moneda);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.moneda =(Moneda) this.monedaLogic.getMonedas().toArray()[this.jTableDatosMoneda.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.moneda =(Moneda) this.monedas.toArray()[this.jTableDatosMoneda.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.moneda==null) {
						this.moneda = new Moneda();
					}

					this.setVariablesFormularioToObjetoActualMoneda(this.moneda,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMoneda(this.moneda);
				}

				if(this.moneda.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.moneda.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMoneda(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.monedaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.monedaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MonedaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.monedaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonsiglaMonedaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.monedaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMoneda.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMoneda(this.getmoneda(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMoneda(this.moneda);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.moneda =(Moneda) this.monedaLogic.getMonedas().toArray()[this.jTableDatosMoneda.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.moneda =(Moneda) this.monedas.toArray()[this.jTableDatosMoneda.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.moneda==null) {
						this.moneda = new Moneda();
					}

					this.setVariablesFormularioToObjetoActualMoneda(this.moneda,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMoneda(this.moneda);
				}

				if(this.moneda.getsigla()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where sigla like '%"+this.moneda.getsigla()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMoneda(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.monedaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.monedaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MonedaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.monedaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonsimboloMonedaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.monedaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMoneda.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMoneda(this.getmoneda(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMoneda(this.moneda);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.moneda =(Moneda) this.monedaLogic.getMonedas().toArray()[this.jTableDatosMoneda.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.moneda =(Moneda) this.monedas.toArray()[this.jTableDatosMoneda.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.moneda==null) {
						this.moneda = new Moneda();
					}

					this.setVariablesFormularioToObjetoActualMoneda(this.moneda,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMoneda(this.moneda);
				}

				if(this.moneda.getsimbolo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where simbolo like '%"+this.moneda.getsimbolo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMoneda(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.monedaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.monedaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MonedaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.monedaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonesta_activoMonedaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.monedaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMoneda.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMoneda(this.getmoneda(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMoneda(this.moneda);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.moneda =(Moneda) this.monedaLogic.getMonedas().toArray()[this.jTableDatosMoneda.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.moneda =(Moneda) this.monedas.toArray()[this.jTableDatosMoneda.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.moneda==null) {
						this.moneda = new Moneda();
					}

					this.setVariablesFormularioToObjetoActualMoneda(this.moneda,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMoneda(this.moneda);
				}

				if(this.moneda.getesta_activo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where esta_activo = "+this.moneda.getesta_activo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMoneda(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.monedaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.monedaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MonedaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.monedaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorNombreMonedaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.monedaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingMoneda(false,false);

			this.getMonedasBusquedaPorNombre();

			this.inicializarActualizarBindingMoneda(false);

			//if(MonedaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingMoneda(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.monedaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.monedaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MonedaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.monedaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorSiglaMonedaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.monedaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingMoneda(false,false);

			this.getMonedasBusquedaPorSigla();

			this.inicializarActualizarBindingMoneda(false);

			//if(MonedaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingMoneda(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.monedaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.monedaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MonedaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.monedaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaMonedaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.monedaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingMoneda(false,false);

			this.getMonedasFK_IdEmpresa();

			this.inicializarActualizarBindingMoneda(false);

			//if(MonedaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingMoneda(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.monedaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.monedaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MonedaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.monedaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameMoneda() {
		if(this.jInternalFrameDetalleFormMoneda!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormMoneda!=null) {
			this.jInternalFrameDetalleFormMoneda.setVisible(false);	    			
			this.jInternalFrameDetalleFormMoneda.dispose();
			this.jInternalFrameDetalleFormMoneda=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoMoneda!=null) {
			this.jInternalFrameReporteDinamicoMoneda.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoMoneda.dispose();
			this.jInternalFrameReporteDinamicoMoneda=null;
		}
		
		if(this.jInternalFrameImportacionMoneda!=null) {
			this.jInternalFrameImportacionMoneda.setVisible(false);	    			
			this.jInternalFrameImportacionMoneda.dispose();
			this.jInternalFrameImportacionMoneda=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessMoneda();
			
			MonedaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.moneda,new Object(),this.monedaParameterGeneral,this.monedaReturnGeneral);
			
			
			if(sTipo.equals("NuevoMoneda")) {
				jButtonNuevoMonedaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarMoneda")) {
				jButtonDuplicarMonedaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarMoneda")) {
				jButtonCopiarMonedaActionPerformed(evt);
			} else if(sTipo.equals("VerFormMoneda")) {
				jButtonVerFormMonedaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarMoneda")) {
				jButtonNuevoMonedaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarMoneda")) {
				jButtonDuplicarMonedaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoMoneda")) {
				jButtonNuevoMonedaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarMoneda")) {
				jButtonDuplicarMonedaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesMoneda")) {
				jButtonNuevoMonedaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarMoneda")) {
				jButtonNuevoMonedaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesMoneda")) {
				jButtonNuevoMonedaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarMoneda")) {
				jButtonModificarMonedaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarMoneda")) {
				jButtonModificarMonedaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarMoneda")) {
				jButtonModificarMonedaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarMoneda")) {
				jButtonActualizarMonedaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarMoneda")) {
				jButtonActualizarMonedaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarMoneda")) {
				jButtonActualizarMonedaActionPerformed(evt);
			} else if(sTipo.equals("EliminarMoneda")) {
				jButtonEliminarMonedaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarMoneda")) {
				jButtonEliminarMonedaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarMoneda")) {
				jButtonEliminarMonedaActionPerformed(evt);
			} else if(sTipo.equals("CancelarMoneda")) {
				jButtonCancelarMonedaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarMoneda")) {
				jButtonCancelarMonedaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarMoneda")) {
				jButtonCancelarMonedaActionPerformed(evt);
			} else if(sTipo.equals("CerrarMoneda")) {
				jButtonCerrarMonedaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarMoneda")) {
				jButtonCerrarMonedaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarMoneda")) {
				jButtonCerrarMonedaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarMoneda")) {
				jButtonMostrarOcultarMonedaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarMoneda")) {
				jButtonCancelarMonedaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosMoneda")) {
				jButtonGuardarCambiosMonedaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarMoneda")) {
				jButtonGuardarCambiosMonedaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarMoneda")) {
				jButtonCopiarMonedaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarMoneda")) {
				jButtonVerFormMonedaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosMoneda")) {
				jButtonGuardarCambiosMonedaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarMoneda")) {
				jButtonCopiarMonedaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormMoneda")) {
				jButtonVerFormMonedaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaMoneda")) {
				jButtonGuardarCambiosMonedaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarMoneda")) {
				jButtonGuardarCambiosMonedaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaMoneda")) {
				jButtonGuardarCambiosMonedaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionMoneda")) {
				jButtonRecargarInformacionMonedaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarMoneda")) {
				jButtonRecargarInformacionMonedaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionMoneda")) {
				jButtonRecargarInformacionMonedaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresMoneda")) {
				jButtonAnterioresMonedaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarMoneda")) {
				jButtonAnterioresMonedaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreMoneda")) {
				jButtonAnterioresMonedaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesMoneda")) {
				jButtonSiguientesMonedaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarMoneda")) {
				jButtonSiguientesMonedaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesMoneda")) {
				jButtonSiguientesMonedaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByMoneda") || sTipo.equals("MenuItemDetalleAbrirOrderByMoneda")) {
				jButtonAbrirOrderByMonedaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarMoneda") || sTipo.equals("MenuItemDetalleMostrarOcultarMoneda")) {
				jButtonMostrarOcultarMonedaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosMoneda")) {
				jButtonNuevoGuardarCambiosMonedaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarMoneda")) {
				jButtonNuevoGuardarCambiosMonedaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosMoneda")) {
				jButtonNuevoGuardarCambiosMonedaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoMoneda")) {
				jButtonCerrarReporteDinamicoMonedaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoMoneda")) {
				jButtonGenerarReporteDinamicoMonedaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoMoneda")) {
				
				jButtonGenerarExcelReporteDinamicoMonedaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionMoneda")) {
				jButtonCerrarImportacionMonedaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionMoneda")) {
				
				jButtonGenerarImportacionMonedaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionMoneda")) {
				
				jButtonAbrirImportacionMonedaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesMoneda")) {
				jComboBoxTiposAccionesMonedaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesMoneda")) {
				jComboBoxTiposRelacionesMonedaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioMoneda")) {
				jComboBoxTiposAccionesMonedaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarMoneda")) {
				
				jComboBoxTiposSeleccionarMonedaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralMoneda")) {
				jTextFieldValorCampoGeneralMonedaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByMoneda")) {
				jButtonAbrirOrderByMonedaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarMoneda")) {
				jButtonAbrirOrderByMonedaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByMoneda")) {
				jButtonCerrarOrderByMonedaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idMonedaBusqueda")) {
				this.jButtonidMonedaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaMonedaUpdate")) {
				this.jButtonid_empresaMonedaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaMonedaBusqueda")) {
				this.jButtonid_empresaMonedaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreMonedaBusqueda")) {
				this.jButtonnombreMonedaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("siglaMonedaBusqueda")) {
				this.jButtonsiglaMonedaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("simboloMonedaBusqueda")) {
				this.jButtonsimboloMonedaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("esta_activoMonedaBusqueda")) {
				this.jButtonesta_activoMonedaBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorNombreMoneda")) {
				this.jButtonBusquedaPorNombreMonedaActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorSiglaMoneda")) {
				this.jButtonBusquedaPorSiglaMonedaActionPerformed(evt);
			}
			
			;
			
			
			MonedaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.moneda,new Object(),this.monedaParameterGeneral,this.monedaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessMoneda();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMonedaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.moneda);
				
				this.actualizarInformacion("INFO_PADRE",false,this.moneda);
				
				MonedaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.moneda,new Object(),this.monedaParameterGeneral,this.monedaReturnGeneral);
				
				


				
				MonedaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.moneda,new Object(),this.monedaParameterGeneral,this.monedaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Moneda.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Moneda.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Moneda monedaLocal=null;
			
			if(!this.getEsControlTabla()) {
				monedaLocal=this.moneda;
			} else {
				monedaLocal=this.monedaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.moneda);
				
				this.actualizarInformacion("INFO_PADRE",false,this.moneda);
				
				MonedaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.moneda,new Object(),this.monedaParameterGeneral,this.monedaReturnGeneral);
							
				
				


				
				MonedaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.moneda,new Object(),this.monedaParameterGeneral,this.monedaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Moneda.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Moneda.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMonedaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosMoneda.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.monedaAnterior =(Moneda) this.monedaLogic.getMonedas().toArray()[this.jTableDatosMoneda.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.monedaAnterior =(Moneda) this.monedas.toArray()[this.jTableDatosMoneda.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
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
			
			MonedaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.moneda,new Object(),this.monedaParameterGeneral,this.monedaReturnGeneral);
			
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
			
			


			
			MonedaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.moneda,new Object(),this.monedaParameterGeneral,this.monedaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMonedaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.moneda);
				
				this.actualizarInformacion("INFO_PADRE",false,this.moneda);
				
				MonedaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.moneda,new Object(),this.monedaParameterGeneral,this.monedaReturnGeneral);
								
						
				


				
				MonedaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.moneda,new Object(),this.monedaParameterGeneral,this.monedaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Moneda.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Moneda.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.moneda);
				
				this.actualizarInformacion("INFO_PADRE",false,this.moneda);
				
				MonedaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.moneda,new Object(),this.monedaParameterGeneral,this.monedaReturnGeneral);
								
				
				


				
				MonedaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.moneda,new Object(),this.monedaParameterGeneral,this.monedaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Moneda.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Moneda.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMonedaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosMoneda.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.monedaAnterior =(Moneda) this.monedaLogic.getMonedas().toArray()[this.jTableDatosMoneda.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.monedaAnterior =(Moneda) this.monedas.toArray()[this.jTableDatosMoneda.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.moneda);
				
				this.actualizarInformacion("INFO_PADRE",false,this.moneda);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMonedaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosMoneda.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.monedaAnterior =(Moneda) this.monedaLogic.getMonedas().toArray()[this.jTableDatosMoneda.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.monedaAnterior =(Moneda) this.monedas.toArray()[this.jTableDatosMoneda.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMonedaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.moneda);
			
			this.actualizarInformacion("INFO_PADRE",false,this.moneda);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.moneda);
				
				this.actualizarInformacion("INFO_PADRE",false,this.moneda);
				
				MonedaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.moneda,new Object(),this.monedaParameterGeneral,this.monedaReturnGeneral);
							
				
				


				
				MonedaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.moneda,new Object(),this.monedaParameterGeneral,this.monedaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Moneda.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Moneda.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMonedaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosMoneda.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.monedaAnterior =(Moneda) this.monedaLogic.getMonedas().toArray()[this.jTableDatosMoneda.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.monedaAnterior =(Moneda) this.monedas.toArray()[this.jTableDatosMoneda.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
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
			
			MonedaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.moneda,new Object(),this.monedaParameterGeneral,this.monedaReturnGeneral);
			
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
			
			


			
			MonedaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.moneda,new Object(),this.monedaParameterGeneral,this.monedaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMonedaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.moneda);
			
			this.actualizarInformacion("INFO_PADRE",false,this.moneda);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.moneda);
				
				this.actualizarInformacion("INFO_PADRE",false,this.moneda);
				
				MonedaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.moneda,new Object(),this.monedaParameterGeneral,this.monedaReturnGeneral);
								
				
				


				
				MonedaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.moneda,new Object(),this.monedaParameterGeneral,this.monedaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Moneda.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Moneda.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMonedaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosMoneda.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.monedaAnterior =(Moneda) this.monedaLogic.getMonedas().toArray()[this.jTableDatosMoneda.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.monedaAnterior =(Moneda) this.monedas.toArray()[this.jTableDatosMoneda.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMonedaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.moneda);
			
			this.actualizarInformacion("INFO_PADRE",false,this.moneda);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMonedaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.moneda);
				
				this.actualizarInformacion("INFO_PADRE",false,this.moneda);
				
				MonedaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.moneda,new Object(),this.monedaParameterGeneral,this.monedaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosMoneda")) {
					jCheckBoxSeleccionarTodosMonedaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosMoneda")) {
					jCheckBoxSeleccionadosMonedaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarMoneda")) {
					
				}
				
				


				
				
				MonedaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.moneda,new Object(),this.monedaParameterGeneral,this.monedaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Moneda.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Moneda.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.moneda);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.moneda);
				
				MonedaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.moneda,new Object(),this.monedaParameterGeneral,this.monedaReturnGeneral);
												
				
				


				
				
				MonedaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.moneda,new Object(),this.monedaParameterGeneral,this.monedaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Moneda.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Moneda.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMonedaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosMoneda.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.monedaAnterior =(Moneda) this.monedaLogic.getMonedas().toArray()[this.jTableDatosMoneda.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.monedaAnterior =(Moneda) this.monedas.toArray()[this.jTableDatosMoneda.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMonedaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.moneda);
				
				this.actualizarInformacion("INFO_PADRE",false,this.moneda);
				
				MonedaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.moneda,new Object(),this.monedaParameterGeneral,this.monedaReturnGeneral);
				
				
				MonedaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.moneda,new Object(),this.monedaParameterGeneral,this.monedaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
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
			
			MonedaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.moneda,new Object(),this.monedaParameterGeneral,this.monedaReturnGeneral);
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
			
			


			
			MonedaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.moneda,new Object(),this.monedaParameterGeneral,this.monedaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMonedaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.moneda);
				
				this.actualizarInformacion("INFO_PADRE",false,this.moneda);
				
				MonedaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.moneda,new Object(),this.monedaParameterGeneral,this.monedaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				MonedaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.moneda,new Object(),this.monedaParameterGeneral,this.monedaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Moneda.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Moneda.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.moneda);
				
				this.actualizarInformacion("INFO_PADRE",false,this.moneda);
				
				MonedaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.moneda,new Object(),this.monedaParameterGeneral,this.monedaReturnGeneral);
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
				
				


				
				MonedaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.moneda,new Object(),this.monedaParameterGeneral,this.monedaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Moneda.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Moneda.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMonedaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosMoneda.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.monedaAnterior =(Moneda) this.monedaLogic.getMonedas().toArray()[this.jTableDatosMoneda.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.monedaAnterior =(Moneda) this.monedas.toArray()[this.jTableDatosMoneda.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				MonedaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.moneda,new Object(),this.monedaParameterGeneral,this.monedaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarMoneda")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosMonedaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosMoneda.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.moneda =(Moneda) this.monedaLogic.getMonedas().toArray()[this.jTableDatosMoneda.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.moneda =(Moneda) this.monedas.toArray()[this.jTableDatosMoneda.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.moneda);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarMoneda")) {
				
				}
				
				MonedaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.moneda,new Object(),this.monedaParameterGeneral,this.monedaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			MonedaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.moneda,new Object(),this.monedaParameterGeneral,this.monedaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarMoneda")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosMoneda.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarMoneda")) {
			
			}
			
			MonedaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.moneda,new Object(),this.monedaParameterGeneral,this.monedaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessMoneda();
			
			MonedaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.moneda,new Object(),this.monedaParameterGeneral,this.monedaReturnGeneral);
			
			if(sTipo.equals("NuevoMoneda")) {
				jButtonNuevoMonedaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarMoneda")) {
				jButtonDuplicarMonedaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarMoneda")) {
				jButtonCopiarMonedaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormMoneda")) {
				jButtonVerFormMonedaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesMoneda")) {
				jButtonNuevoMonedaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarMoneda")) {
				jButtonModificarMonedaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarMoneda")) {
				jButtonActualizarMonedaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarMoneda")) {
				jButtonEliminarMonedaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaMoneda")) {
				jButtonGuardarCambiosMonedaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarMoneda")) {
				jButtonCancelarMonedaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarMoneda")) {
				jButtonCerrarMonedaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosMoneda")) {
				jButtonGuardarCambiosMonedaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosMoneda")) {
				jButtonNuevoGuardarCambiosMonedaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByMoneda")) {
				jButtonAbrirOrderByMonedaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionMoneda")) {
				jButtonRecargarInformacionMonedaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresMoneda")) {
				jButtonAnterioresMonedaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesMoneda")) {
				jButtonSiguientesMonedaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idMonedaBusqueda")) {
				this.jButtonidMonedaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaMonedaUpdate")) {
				this.jButtonid_empresaMonedaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaMonedaBusqueda")) {
				this.jButtonid_empresaMonedaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreMonedaBusqueda")) {
				this.jButtonnombreMonedaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("siglaMonedaBusqueda")) {
				this.jButtonsiglaMonedaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("simboloMonedaBusqueda")) {
				this.jButtonsimboloMonedaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("esta_activoMonedaBusqueda")) {
				this.jButtonesta_activoMonedaBusquedaActionPerformed(evt);
			}
			
			MonedaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.moneda,new Object(),this.monedaParameterGeneral,this.monedaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessMoneda();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			MonedaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.moneda,new Object(),this.monedaParameterGeneral,this.monedaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameMoneda")) {
				closingInternalFrameMoneda();
				
			} else if(sTipo.equals("jButtonCancelarMoneda")) {
				JInternalFrameBase jInternalFrameDetalleFormMoneda = (JInternalFrameBase)evt.getSource();
	            	
	            MonedaBeanSwingJInternalFrame jInternalFrameParent=(MonedaBeanSwingJInternalFrame)jInternalFrameDetalleFormMoneda.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarMonedaActionPerformed(null);
			}
			
			MonedaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.moneda,new Object(),this.monedaParameterGeneral,this.monedaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormMoneda(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormMoneda(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormMoneda(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.moneda)) {
			if(!esControlTabla) {
				if(MonedaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualMoneda(this.moneda,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysMoneda(this.moneda);			
				}
				
				if(this.monedaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualMoneda(this.moneda,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.monedaReturnGeneral=monedaLogic.procesarEventosMonedasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.monedaLogic.getMonedas(),this.moneda,this.monedaParameterGeneral,this.isEsNuevoMoneda,classes);//this.monedaLogic.getMoneda()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanMoneda(this.monedaReturnGeneral,this.monedaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.monedaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanMoneda(classes,this.monedaReturnGeneral,this.monedaBean,false);
					}
						
					if(this.monedaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyMoneda(this.monedaReturnGeneral.getMoneda());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioMoneda(this.monedaReturnGeneral.getMoneda());	
					}
						
					if(this.monedaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioMoneda(this.monedaReturnGeneral.getMoneda(),classes);//this.monedaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioMoneda(this.moneda,classes);//this.monedaBean);									
				}
			
				if(MonedaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualMoneda(this.moneda,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysMoneda(this.moneda);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.monedaAnterior!=null) {
						this.moneda=this.monedaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.monedaReturnGeneral=monedaLogic.procesarEventosMonedasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.monedaLogic.getMonedas(),this.moneda,this.monedaParameterGeneral,this.isEsNuevoMoneda,classes);//this.monedaLogic.getMoneda()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.monedaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.monedaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.monedaReturnGeneral.getMoneda(),monedaLogic.getMonedas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.monedaReturnGeneral.getMoneda(),this.monedas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosMoneda.repaint();
				
				//((AbstractTableModel) this.jTableDatosMoneda.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosMoneda();
			}
		}
	}
	
	public void actualizarVisualTableDatosMoneda() throws Exception {
		
		MonedaModel monedaModel=(MonedaModel)this.jTableDatosMoneda.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			monedaModel.monedas=this.monedaLogic.getMonedas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			monedaModel.monedas=this.monedas;
		}
		
		
		((MonedaModel) this.jTableDatosMoneda.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaMoneda() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getmonedaAnterior(),this.monedaLogic.getMonedas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getmonedaAnterior(),this.monedas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosMoneda();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioMoneda(Moneda moneda,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
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
										
				MonedaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.moneda,new Object(),generalEntityParameterGeneral,this.monedaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.monedaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=MonedaConstantesFunciones.getClassesRelationshipsOfMoneda(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=MonedaConstantesFunciones.getClassesRelationshipsFromStringsOfMoneda(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormMoneda(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				MonedaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.moneda,new Object(),generalEntityParameterGeneral,this.monedaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioMoneda(MonedaBean monedaBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanMoneda(ArrayList<Classe> classes,MonedaReturnGeneral monedaReturnGeneral,MonedaBean monedaBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualMoneda(Moneda moneda,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.moneda)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormMoneda = new MonedaDetalleFormJInternalFrame(jDesktopPane,this.monedaSessionBean.getConGuardarRelaciones(),this.monedaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormMoneda);
		this.jInternalFrameDetalleFormMoneda.setVisible(false);
		this.jInternalFrameDetalleFormMoneda.setSelected(false);						
		
		this.jInternalFrameDetalleFormMoneda.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormMoneda.monedaLogic=this.monedaLogic;
		
		this.cargarCombosFrameForeignKeyMoneda("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleMoneda();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleMoneda();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyMoneda("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyMoneda();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormMoneda.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarMoneda"));
		
		this.jInternalFrameDetalleFormMoneda.jButtonModificarMoneda.addActionListener(new ButtonActionListener(this,"ModificarMoneda"));

		
		this.jInternalFrameDetalleFormMoneda.jButtonModificarToolBarMoneda.addActionListener(new ButtonActionListener(this,"ModificarToolBarMoneda"));
					
		this.jInternalFrameDetalleFormMoneda.jMenuItemModificarMoneda.addActionListener(new ButtonActionListener(this,"MenuItemModificarMoneda"));		
		
		
		
		this.jInternalFrameDetalleFormMoneda.jButtonActualizarMoneda.addActionListener (new ButtonActionListener(this,"ActualizarMoneda"));
		
		
		this.jInternalFrameDetalleFormMoneda.jButtonActualizarToolBarMoneda.addActionListener(new ButtonActionListener(this,"ActualizarToolBarMoneda"));
						
		this.jInternalFrameDetalleFormMoneda.jMenuItemActualizarMoneda.addActionListener (new ButtonActionListener(this,"MenuItemActualizarMoneda"));		
		
		
		
		this.jInternalFrameDetalleFormMoneda.jButtonEliminarMoneda.addActionListener (new ButtonActionListener(this,"EliminarMoneda"));
		
		
		this.jInternalFrameDetalleFormMoneda.jButtonEliminarToolBarMoneda.addActionListener (new ButtonActionListener(this,"EliminarToolBarMoneda"));
								
		this.jInternalFrameDetalleFormMoneda.jMenuItemEliminarMoneda.addActionListener (new ButtonActionListener(this,"MenuItemEliminarMoneda"));		
		
		
		
		this.jInternalFrameDetalleFormMoneda.jButtonCancelarMoneda.addActionListener (new ButtonActionListener(this,"CancelarMoneda"));
		
		
		this.jInternalFrameDetalleFormMoneda.jButtonCancelarToolBarMoneda.addActionListener (new ButtonActionListener(this,"CancelarToolBarMoneda"));
					
		this.jInternalFrameDetalleFormMoneda.jMenuItemCancelarMoneda.addActionListener (new ButtonActionListener(this,"MenuItemCancelarMoneda"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormMoneda.jMenuItemDetalleCerrarMoneda.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarMoneda"));		
		
		
		
		this.jInternalFrameDetalleFormMoneda.jButtonGuardarCambiosToolBarMoneda.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarMoneda"));
		
		
		
		this.jInternalFrameDetalleFormMoneda.jButtonGuardarCambiosToolBarMoneda.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarMoneda"));
		
		
		
		this.jInternalFrameDetalleFormMoneda.jComboBoxTiposAccionesFormularioMoneda.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioMoneda"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMoneda.jButtonidMonedaBusqueda.addActionListener(new ButtonActionListener(this,"idMonedaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMoneda.jButtonid_empresaMonedaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaMonedaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMoneda.jButtonid_empresaMonedaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaMonedaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMoneda.jButtonnombreMonedaBusqueda.addActionListener(new ButtonActionListener(this,"nombreMonedaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMoneda.jButtonsiglaMonedaBusqueda.addActionListener(new ButtonActionListener(this,"siglaMonedaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMoneda.jButtonsimboloMonedaBusqueda.addActionListener(new ButtonActionListener(this,"simboloMonedaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMoneda.jButtonesta_activoMonedaBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoMonedaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormMoneda.jTabbedPaneRelacionesMoneda.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesMoneda"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameMoneda"));
		
		if(this.jInternalFrameDetalleFormMoneda!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMoneda.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarMoneda"));
		}
		
		this.jTableDatosMoneda.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarMoneda"));
		
		this.jTableDatosMoneda.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarMoneda"));
		
		this.jButtonNuevoMoneda.addActionListener(new ButtonActionListener(this,"NuevoMoneda"));
		
		this.jButtonDuplicarMoneda.addActionListener(new ButtonActionListener(this,"DuplicarMoneda"));
		
		this.jButtonCopiarMoneda.addActionListener(new ButtonActionListener(this,"CopiarMoneda"));
		
		this.jButtonVerFormMoneda.addActionListener(new ButtonActionListener(this,"VerFormMoneda"));
		
		
		this.jButtonNuevoToolBarMoneda.addActionListener(new ButtonActionListener(this,"NuevoToolBarMoneda"));
			
		this.jButtonDuplicarToolBarMoneda.addActionListener(new ButtonActionListener(this,"DuplicarToolBarMoneda"));
			
		this.jMenuItemNuevoMoneda.addActionListener (new ButtonActionListener(this,"MenuItemNuevoMoneda"));
			
		this.jMenuItemDuplicarMoneda.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarMoneda"));		
		
		
		this.jButtonNuevoRelacionesMoneda.addActionListener (new ButtonActionListener(this,"NuevoRelacionesMoneda"));
		
		
		this.jButtonNuevoRelacionesToolBarMoneda.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarMoneda"));
			
		this.jMenuItemNuevoRelacionesMoneda.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesMoneda"));		
		
		
		if(this.jInternalFrameDetalleFormMoneda!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMoneda.jButtonModificarMoneda.addActionListener(new ButtonActionListener(this,"ModificarMoneda"));
		}
		
		
		if(this.jInternalFrameDetalleFormMoneda!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMoneda.jButtonModificarToolBarMoneda.addActionListener(new ButtonActionListener(this,"ModificarToolBarMoneda"));
			
			this.jInternalFrameDetalleFormMoneda.jMenuItemModificarMoneda.addActionListener(new ButtonActionListener(this,"MenuItemModificarMoneda"));		
		}
		
		
		if(this.jInternalFrameDetalleFormMoneda!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormMoneda.jButtonActualizarMoneda.addActionListener (new ButtonActionListener(this,"ActualizarMoneda"));
		}
		
		
		if(this.jInternalFrameDetalleFormMoneda!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMoneda.jButtonActualizarToolBarMoneda.addActionListener(new ButtonActionListener(this,"ActualizarToolBarMoneda"));
				
			this.jInternalFrameDetalleFormMoneda.jMenuItemActualizarMoneda.addActionListener (new ButtonActionListener(this,"MenuItemActualizarMoneda"));		
		}
		
		
		if(this.jInternalFrameDetalleFormMoneda!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMoneda.jButtonEliminarMoneda.addActionListener (new ButtonActionListener(this,"EliminarMoneda"));
		}
		
		
		if(this.jInternalFrameDetalleFormMoneda!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMoneda.jButtonEliminarToolBarMoneda.addActionListener (new ButtonActionListener(this,"EliminarToolBarMoneda"));
						
			this.jInternalFrameDetalleFormMoneda.jMenuItemEliminarMoneda.addActionListener (new ButtonActionListener(this,"MenuItemEliminarMoneda"));		
		}
		
		
		if(this.jInternalFrameDetalleFormMoneda!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMoneda.jButtonCancelarMoneda.addActionListener (new ButtonActionListener(this,"CancelarMoneda"));
		}
		
		
		if(this.jInternalFrameDetalleFormMoneda!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMoneda.jButtonCancelarToolBarMoneda.addActionListener (new ButtonActionListener(this,"CancelarToolBarMoneda"));
			
			this.jInternalFrameDetalleFormMoneda.jMenuItemCancelarMoneda.addActionListener (new ButtonActionListener(this,"MenuItemCancelarMoneda"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarMoneda.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarMoneda"));		
		
		
		this.jButtonCerrarMoneda.addActionListener (new ButtonActionListener(this,"CerrarMoneda"));
		
		
		this.jButtonCerrarToolBarMoneda.addActionListener (new ButtonActionListener(this,"CerrarToolBarMoneda"));
			
		this.jMenuItemCerrarMoneda.addActionListener (new ButtonActionListener(this,"MenuItemCerrarMoneda"));
			
		if(this.jInternalFrameDetalleFormMoneda!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMoneda.jMenuItemDetalleCerrarMoneda.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarMoneda"));		
		}
		
		
		if(this.jInternalFrameDetalleFormMoneda!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMoneda.jButtonGuardarCambiosMoneda.addActionListener (new ButtonActionListener(this,"GuardarCambiosMoneda"));
		}
		
		
		if(this.jInternalFrameDetalleFormMoneda!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMoneda.jButtonGuardarCambiosToolBarMoneda.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarMoneda"));
		}
		
		this.jButtonCopiarToolBarMoneda.addActionListener (new ButtonActionListener(this,"CopiarToolBarMoneda"));
			
		this.jButtonVerFormToolBarMoneda.addActionListener (new ButtonActionListener(this,"VerFormToolBarMoneda"));
		
		this.jMenuItemGuardarCambiosMoneda.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosMoneda"));
			
		this.jMenuItemCopiarMoneda.addActionListener (new ButtonActionListener(this,"MenuItemCopiarMoneda"));		
		
		this.jMenuItemVerFormMoneda.addActionListener (new ButtonActionListener(this,"MenuItemVerFormMoneda"));		
		
		
		this.jButtonGuardarCambiosTablaMoneda.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaMoneda"));
		
		
		this.jButtonGuardarCambiosTablaToolBarMoneda.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarMoneda"));
			
		this.jMenuItemGuardarCambiosTablaMoneda.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaMoneda"));		
		
		
		
		this.jButtonRecargarInformacionMoneda.addActionListener (new ButtonActionListener(this,"RecargarInformacionMoneda"));
					
		this.jButtonRecargarInformacionToolBarMoneda.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarMoneda"));
		
		this.jMenuItemRecargarInformacionMoneda.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionMoneda"));		
		
		
		
		this.jButtonAnterioresMoneda.addActionListener (new ButtonActionListener(this,"AnterioresMoneda"));
		
		
		this.jButtonAnterioresToolBarMoneda.addActionListener (new ButtonActionListener(this,"AnterioresToolBarMoneda"));
		
		this.jMenuItemAnterioresMoneda.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresMoneda"));		
		
		
		this.jButtonSiguientesMoneda.addActionListener (new ButtonActionListener(this,"SiguientesMoneda"));
		
		
		this.jButtonSiguientesToolBarMoneda.addActionListener (new ButtonActionListener(this,"SiguientesToolBarMoneda"));
			
		this.jMenuItemSiguientesMoneda.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesMoneda"));
			
		this.jMenuItemAbrirOrderByMoneda.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByMoneda"));
			
		this.jMenuItemMostrarOcultarMoneda.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarMoneda"));
			
		this.jMenuItemDetalleAbrirOrderByMoneda.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByMoneda"));
			
		this.jMenuItemDetalleMostarOcultarMoneda.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarMoneda"));		
		
		
		this.jButtonNuevoGuardarCambiosMoneda.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosMoneda"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarMoneda.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarMoneda"));
			
		this.jMenuItemNuevoGuardarCambiosMoneda.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosMoneda"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosMoneda.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosMoneda"));

		this.jCheckBoxSeleccionadosMoneda.addItemListener(new CheckBoxItemListener(this,"SeleccionadosMoneda"));
		
		if(this.jInternalFrameDetalleFormMoneda!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMoneda.jComboBoxTiposAccionesFormularioMoneda.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioMoneda"));
		}
		
		
		this.jComboBoxTiposRelacionesMoneda.addActionListener (new ButtonActionListener(this,"TiposRelacionesMoneda"));
			
		this.jComboBoxTiposAccionesMoneda.addActionListener (new ButtonActionListener(this,"TiposAccionesMoneda"));
					
		this.jComboBoxTiposSeleccionarMoneda.addActionListener (new ButtonActionListener(this,"TiposSeleccionarMoneda"));
			
		this.jTextFieldValorCampoGeneralMoneda.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralMoneda"));		
		
		
		if(this.jInternalFrameDetalleFormMoneda!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMoneda.jButtonidMonedaBusqueda.addActionListener(new ButtonActionListener(this,"idMonedaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMoneda.jButtonid_empresaMonedaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaMonedaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMoneda.jButtonid_empresaMonedaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaMonedaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMoneda.jButtonnombreMonedaBusqueda.addActionListener(new ButtonActionListener(this,"nombreMonedaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMoneda.jButtonsiglaMonedaBusqueda.addActionListener(new ButtonActionListener(this,"siglaMonedaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMoneda.jButtonsimboloMonedaBusqueda.addActionListener(new ButtonActionListener(this,"simboloMonedaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMoneda.jButtonesta_activoMonedaBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoMonedaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorNombreMoneda.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreMoneda"));

			this.jButtonBusquedaPorSiglaMoneda.addActionListener(new ButtonActionListener(this,"BusquedaPorSiglaMoneda"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoMoneda!=null) {
				this.jInternalFrameReporteDinamicoMoneda.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoMoneda"));
				this.jInternalFrameReporteDinamicoMoneda.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoMoneda"));
				this.jInternalFrameReporteDinamicoMoneda.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoMoneda"));
			}
			
			//this.jButtonCerrarReporteDinamicoMoneda.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoMoneda"));				
			//this.jButtonGenerarReporteDinamicoMoneda.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoMoneda"));
			//this.jButtonGenerarExcelReporteDinamicoMoneda.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoMoneda"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionMoneda!=null) {
				this.jInternalFrameImportacionMoneda.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionMoneda"));
				this.jInternalFrameImportacionMoneda.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionMoneda"));
				this.jInternalFrameImportacionMoneda.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionMoneda"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByMoneda.addActionListener (new ButtonActionListener(this,"AbrirOrderByMoneda"));
			
			this.jButtonAbrirOrderByToolBarMoneda.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarMoneda"));			
			
			if(this.jInternalFrameOrderByMoneda!=null) {
				this.jInternalFrameOrderByMoneda.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByMoneda"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormMoneda!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormMoneda!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMoneda.jTabbedPaneRelacionesMoneda.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesMoneda"));
		
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
            		closingInternalFrameMoneda();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormMoneda.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormMoneda = (JInternalFrameBase)event.getSource();
	            	
	            MonedaBeanSwingJInternalFrame jInternalFrameParent=(MonedaBeanSwingJInternalFrame)jInternalFrameDetalleFormMoneda.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarMonedaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosMoneda.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosMonedaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosMoneda.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosMoneda.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoMoneda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoMonedaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarMoneda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoMonedaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoMoneda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoMonedaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoMoneda";
		inputMap = this.jButtonNuevoMoneda.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoMoneda.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoMonedaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesMoneda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoMonedaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarMoneda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoMonedaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesMoneda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoMonedaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesMoneda";
		inputMap = this.jButtonNuevoRelacionesMoneda.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesMoneda.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoMonedaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarMoneda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarMonedaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarMoneda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarMonedaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarMoneda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarMonedaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarMoneda";
		inputMap = this.jButtonModificarMoneda.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarMoneda.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarMonedaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarMoneda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarMonedaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarMoneda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarMonedaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarMoneda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarMonedaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarMoneda";
		inputMap = this.jButtonActualizarMoneda.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarMoneda.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarMonedaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarMoneda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarMonedaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarMoneda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarMonedaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarMoneda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarMonedaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarMoneda";
		inputMap = this.jButtonEliminarMoneda.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarMoneda.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarMonedaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarMoneda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarMonedaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarMoneda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarMonedaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarMoneda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarMonedaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarMoneda";
		inputMap = this.jButtonCancelarMoneda.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarMoneda.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarMonedaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarMoneda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarMonedaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarMoneda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarMonedaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarMoneda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarMonedaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarMoneda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarMonedaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarMonedaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarMoneda";
		inputMap = this.jButtonCerrarMoneda.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarMoneda.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarMonedaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormMoneda.jButtonGuardarCambiosMoneda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosMonedaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarMoneda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosMonedaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosMoneda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosMonedaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaMoneda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosMonedaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarMoneda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosMonedaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaMoneda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosMonedaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosMoneda";
		inputMap = this.jInternalFrameDetalleFormMoneda.jButtonGuardarCambiosMoneda.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormMoneda.jButtonGuardarCambiosMoneda.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosMonedaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionMoneda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionMonedaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarMoneda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionMonedaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionMoneda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionMonedaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresMoneda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresMonedaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarMoneda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresMonedaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresMoneda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresMonedaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesMoneda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesMonedaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarMoneda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesMonedaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesMoneda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesMonedaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosMoneda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosMonedaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarMoneda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosMonedaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosMoneda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosMonedaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosMoneda.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosMonedaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesMoneda.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesMonedaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarMoneda.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarMonedaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralMoneda.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralMonedaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMoneda.jButtonidMonedaBusqueda.addActionListener(new ButtonActionListener(this,"idMonedaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMoneda.jButtonid_empresaMonedaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaMonedaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMoneda.jButtonid_empresaMonedaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaMonedaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMoneda.jButtonnombreMonedaBusqueda.addActionListener(new ButtonActionListener(this,"nombreMonedaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMoneda.jButtonsiglaMonedaBusqueda.addActionListener(new ButtonActionListener(this,"siglaMonedaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMoneda.jButtonsimboloMonedaBusqueda.addActionListener(new ButtonActionListener(this,"simboloMonedaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMoneda.jButtonesta_activoMonedaBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoMonedaBusqueda"));
		
		
		this.jButtonBusquedaPorNombreMoneda.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreMoneda"));

		this.jButtonBusquedaPorSiglaMoneda.addActionListener(new ButtonActionListener(this,"BusquedaPorSiglaMoneda"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoMoneda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoMonedaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoMoneda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoMonedaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoMoneda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoMonedaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionMoneda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionMonedaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionMoneda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionMonedaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionMoneda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionMonedaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarMonedaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarMoneda.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosMoneda(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Moneda monedaAux:this.monedaLogic.getMonedas()) {
					monedaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Moneda monedaAux:monedas) {
					monedaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosMonedaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingMoneda(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Moneda monedaAux:this.monedaLogic.getMonedas()) {
						monedaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Moneda monedaAux:monedas) {
						monedaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Moneda monedaAux:this.monedaLogic.getMonedas()) {
					
						if(sTipoSeleccionar.equals(MonedaConstantesFunciones.LABEL_ESTAACTIVO)) {
							existe=true;
							monedaAux.setesta_activo(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Moneda monedaAux:monedas) {
						
						if(sTipoSeleccionar.equals(MonedaConstantesFunciones.LABEL_ESTAACTIVO)) {
							existe=true;
							monedaAux.setesta_activo(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaMoneda(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosMoneda.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosMoneda.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosMoneda,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosMonedaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingMoneda(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosMoneda.getSelectedRows();
			
			Moneda monedaLocal=new Moneda();
			
			//this.seleccionarTodosMoneda(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					monedaLocal =(Moneda) this.monedaLogic.getMonedas().toArray()[this.jTableDatosMoneda.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					monedaLocal =(Moneda) this.monedas.toArray()[this.jTableDatosMoneda.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				monedaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Moneda monedaAux:this.monedaLogic.getMonedas()) {
						monedaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Moneda monedaAux:monedas) {
						monedaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaMoneda(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosMoneda.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosMoneda.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosMoneda,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualMonedaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarMonedaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralMonedaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingMoneda(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralMoneda.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Moneda monedaAux:this.monedaLogic.getMonedas()) {
				
						if(sTipoSeleccionar.equals(MonedaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							monedaAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(MonedaConstantesFunciones.LABEL_SIGLA)) {
							existe=true;
							monedaAux.setsigla(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(MonedaConstantesFunciones.LABEL_SIMBOLO)) {
							existe=true;
							monedaAux.setsimbolo(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Moneda monedaAux:monedas) {
					
						if(sTipoSeleccionar.equals(MonedaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							monedaAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(MonedaConstantesFunciones.LABEL_SIGLA)) {
							existe=true;
							monedaAux.setsigla(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(MonedaConstantesFunciones.LABEL_SIMBOLO)) {
							existe=true;
							monedaAux.setsimbolo(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaMoneda(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesMonedaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingMoneda(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioMoneda=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesMoneda.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormMoneda.jComboBoxTiposAccionesFormularioMoneda.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteMoneda) {				
					conSplash=true;//false;										
					
					//this.startProcessMoneda(conSplash);
				
					this.generarReporteMonedasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesMoneda.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormMoneda.jComboBoxTiposAccionesFormularioMoneda.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoMonedasSeleccionados();
				//this.jComboBoxTiposAccionesMoneda.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoMonedasSeleccionados(false);
				//this.jComboBoxTiposAccionesMoneda.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoMonedasSeleccionados(true);
				//this.jComboBoxTiposAccionesMoneda.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessMoneda();
				
				this.exportarMonedasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesMoneda.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormMoneda.jComboBoxTiposAccionesFormularioMoneda.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionMonedas();
				//this.importarMonedas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesMoneda.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormMoneda.jComboBoxTiposAccionesFormularioMoneda.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessMoneda();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelMonedasSeleccionados();
				//this.jComboBoxTiposAccionesMoneda.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Moneda", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessMoneda();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoMoneda)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyMoneda(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Moneda",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesMoneda.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormMoneda.jComboBoxTiposAccionesFormularioMoneda.setSelectedIndex(0);					
				}	
			} 			
			else if(MonedaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteMoneda) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessMoneda(conSplash);
					
						//this.actualizarParametrosGeneralMoneda();
						
						this.generarReporteProcesoAccionMonedasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesMoneda.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormMoneda.jComboBoxTiposAccionesFormularioMoneda.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(MonedaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO MonedaS SELECCIONADOS?", "MANTENIMIENTO DE Moneda", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessMoneda();
				
						this.actualizarParametrosGeneralMoneda();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.monedaReturnGeneral=monedaLogic.procesarAccionMonedasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.monedaLogic.getMonedas(),this.monedaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarMonedaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesMoneda.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormMoneda.jComboBoxTiposAccionesFormularioMoneda.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralMoneda();
					
					MonedaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarMonedaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesMoneda.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormMoneda.jComboBoxTiposAccionesFormularioMoneda.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessMoneda(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesMonedaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessMoneda();
			
			if(this.jInternalFrameDetalleFormMoneda==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Moneda> monedasSeleccionados=new ArrayList<Moneda>();		
			Moneda moneda=new Moneda();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingMoneda(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesMoneda.getSelectedItem();
			
			
			
			
			monedasSeleccionados=this.getMonedasSeleccionados(true);
			//this.sTipoAccion;
			
			if(monedasSeleccionados.size()==1) {
				for(Moneda monedaAux:monedasSeleccionados) {
					moneda=monedaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessMoneda();
			
      		//this.finishProcessMoneda(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarMonedaReturnGeneral() throws Exception {
		if(this.monedaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.monedaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.monedaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.monedaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.monedaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.monedaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingMoneda(false);
		}
		
		if(this.monedaReturnGeneral.getConRetornoLista() || this.monedaReturnGeneral.getConRetornoObjeto()) {
			if(this.monedaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.monedaLogic.setMonedas(this.monedaReturnGeneral.getMonedas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.monedaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.monedaLogic.setMoneda(this.monedaReturnGeneral.getMoneda());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingMoneda(false);
		}
	}
	
	public void actualizarParametrosGeneralMoneda() throws Exception {
		
		
	}
	
	public ArrayList<Moneda> getMonedasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Moneda> monedasSeleccionados=new ArrayList<Moneda>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioMoneda) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Moneda monedaAux:monedaLogic.getMonedas()) {
					if(monedaAux.getIsSelected()) {
						monedasSeleccionados.add(monedaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Moneda monedaAux:this.monedas) {
					if(monedaAux.getIsSelected()) {
						monedasSeleccionados.add(monedaAux);				
					}
				}
			}
			
			if(monedasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						monedasSeleccionados.addAll(this.monedaLogic.getMonedas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						monedasSeleccionados.addAll(this.monedas);				
					}
				}
			}
		} else {
			monedasSeleccionados.add(this.moneda);
		}
		
		return monedasSeleccionados;
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
	
	public void generarReporteMonedasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalMonedasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoMonedasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoMonedasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoMonedasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Moneda",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesMonedasSeleccionados() throws Exception {
		ArrayList<Moneda> monedasSeleccionados=new ArrayList<Moneda>();		
		
		monedasSeleccionados=this.getMonedasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteMonedas("Todos",monedasSeleccionados);
		
	}	
	
	public void generarReporteNormalMonedasSeleccionados() throws Exception {
		ArrayList<Moneda> monedasSeleccionados=new ArrayList<Moneda>();		
		
		monedasSeleccionados=this.getMonedasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteMonedas("Todos",monedasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionMonedasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Moneda> monedasSeleccionados=new ArrayList<Moneda>();
		
		monedasSeleccionados=this.getMonedasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteMonedas("Todos",monedasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoMonedasSeleccionados() throws Exception {
		ArrayList<Moneda> monedasSeleccionados=new ArrayList<Moneda>();		
		
		
		this.abrirInicializarFrameReporteDinamicoMoneda();
		
		
		monedasSeleccionados=this.getMonedasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoMoneda();
		
		
		//this.generarReporteMonedas("Todos",monedasSeleccionados ,monedaImplementable,monedaImplementableHome);
	}
	
	public void mostrarImportacionMonedas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionMoneda();
		
		this.abrirFrameImportacionMoneda();		
		
			
		//this.generarReporteMonedas("Todos",monedasSeleccionados ,monedaImplementable,monedaImplementableHome);
	}
	
	public void importarMonedas() throws Exception {		
	
	}
	
	public void exportarMonedasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelMonedasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoMonedasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlMonedasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Moneda",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoMonedasSeleccionados() throws Exception {
		ArrayList<Moneda> monedasSeleccionados=new ArrayList<Moneda>();		
		
		monedasSeleccionados=this.getMonedasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"moneda."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarMoneda(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Moneda monedaAux:monedasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarMoneda(monedaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//monedaAux.setsDetalleGeneralEntityReporte(monedaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.monedaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Moneda",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarMoneda(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=MonedaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MonedaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MonedaConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MonedaConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MonedaConstantesFunciones.LABEL_SIGLA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MonedaConstantesFunciones.LABEL_SIMBOLO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MonedaConstantesFunciones.LABEL_ESTAACTIVO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarMoneda(Moneda moneda,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=moneda.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=moneda.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=moneda.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=moneda.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=moneda.getsigla();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=moneda.getsimbolo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=moneda.getesta_activo().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelMonedasSeleccionados() throws Exception {
		ArrayList<Moneda> monedasSeleccionados=new ArrayList<Moneda>();		
		
		monedasSeleccionados=this.getMonedasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"moneda.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Monedas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelMoneda(row);				
				iRow++;
			}				
			
			for(Moneda monedaAux:monedasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelMoneda(monedaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.monedaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Moneda",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlMonedasSeleccionados() throws Exception {
		ArrayList<Moneda> monedasSeleccionados=new ArrayList<Moneda>();		
		
		monedasSeleccionados=this.getMonedasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"moneda.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("monedas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("moneda");
			//elementRoot.appendChild(element);
		
			for(Moneda monedaAux:monedasSeleccionados) {
				element = document.createElement("moneda");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlMoneda(monedaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.monedaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Moneda",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelMoneda(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(MonedaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(MonedaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(MonedaConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(MonedaConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(MonedaConstantesFunciones.LABEL_SIGLA);
		cell = row.createCell(iColumn++);cell.setCellValue(MonedaConstantesFunciones.LABEL_SIMBOLO);
		cell = row.createCell(iColumn++);cell.setCellValue(MonedaConstantesFunciones.LABEL_ESTAACTIVO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelMoneda(Moneda moneda,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(moneda.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(moneda.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(moneda.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(moneda.getsigla());
		cell = row.createCell(iColumn++);cell.setCellValue(moneda.getsimbolo());
		cell = row.createCell(iColumn++);cell.setCellValue(moneda.getesta_activo());				
	}
	
	public void setFilaDatosExportarXmlMoneda(Moneda moneda,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(MonedaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(moneda.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(MonedaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(moneda.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(MonedaConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(moneda.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementnombre = document.createElement(MonedaConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(moneda.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementsigla = document.createElement(MonedaConstantesFunciones.SIGLA);
		elementsigla.appendChild(document.createTextNode(moneda.getsigla().trim()));
		element.appendChild(elementsigla);

		Element elementsimbolo = document.createElement(MonedaConstantesFunciones.SIMBOLO);
		elementsimbolo.appendChild(document.createTextNode(moneda.getsimbolo().trim()));
		element.appendChild(elementsimbolo);

		Element elementesta_activo = document.createElement(MonedaConstantesFunciones.ESTAACTIVO);
		elementesta_activo.appendChild(document.createTextNode(moneda.getesta_activo().toString().trim()));
		element.appendChild(elementesta_activo);
	}
	
	public void generarReporteGroupGenericoMonedasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Moneda> monedasSeleccionados=new ArrayList<Moneda>();
		
		monedasSeleccionados=this.getMonedasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoMoneda(monedasSeleccionados);
		
		this.generarReporteMonedas("Todos",monedasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoMoneda(ArrayList<Moneda> monedasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Moneda monedaAux:monedasSeleccionados) {
				monedaAux.setsDetalleGeneralEntityReporte(monedaAux.toString());
			
				if(sTipoSeleccionar.equals(MonedaConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					monedaAux.setsDescripcionGeneralEntityReporte1(monedaAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(MonedaConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					monedaAux.setsDescripcionGeneralEntityReporte1(monedaAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(MonedaConstantesFunciones.LABEL_SIGLA)) {
					existe=true;
					monedaAux.setsDescripcionGeneralEntityReporte1(monedaAux.getsigla());
				}
				 else if(sTipoSeleccionar.equals(MonedaConstantesFunciones.LABEL_SIMBOLO)) {
					existe=true;
					monedaAux.setsDescripcionGeneralEntityReporte1(monedaAux.getsimbolo());
				}
				 else if(sTipoSeleccionar.equals(MonedaConstantesFunciones.LABEL_ESTAACTIVO)) {
					existe=true;
					monedaAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(monedaAux.getesta_activo()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MonedaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesMoneda(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoMoneda=true;
				this.isVisibilidadCeldaNuevoRelacionesMoneda=true;
				this.isVisibilidadCeldaGuardarCambiosMoneda=true;
			}
			
			this.isVisibilidadCeldaModificarMoneda=false;
			this.isVisibilidadCeldaActualizarMoneda=false;
			this.isVisibilidadCeldaEliminarMoneda=false;
			this.isVisibilidadCeldaCancelarMoneda=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMoneda=true;
				} else {
					this.isVisibilidadCeldaGuardarMoneda=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoMoneda=false;
			this.isVisibilidadCeldaNuevoRelacionesMoneda=false;
			this.isVisibilidadCeldaGuardarCambiosMoneda=false;
			this.isVisibilidadCeldaModificarMoneda=false;
			this.isVisibilidadCeldaActualizarMoneda=true;
			this.isVisibilidadCeldaEliminarMoneda=false;
			this.isVisibilidadCeldaCancelarMoneda=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMoneda=true;
				} else {
					this.isVisibilidadCeldaGuardarMoneda=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoMoneda=false;
			this.isVisibilidadCeldaNuevoRelacionesMoneda=false;
			this.isVisibilidadCeldaGuardarCambiosMoneda=false;
			this.isVisibilidadCeldaModificarMoneda=false;
			this.isVisibilidadCeldaActualizarMoneda=true;
			this.isVisibilidadCeldaEliminarMoneda=true;
			this.isVisibilidadCeldaCancelarMoneda=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMoneda=true;
				} else {
					this.isVisibilidadCeldaGuardarMoneda=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoMoneda=false;
			this.isVisibilidadCeldaNuevoRelacionesMoneda=false;
			this.isVisibilidadCeldaGuardarCambiosMoneda=false;
			this.isVisibilidadCeldaModificarMoneda=false;
			this.isVisibilidadCeldaActualizarMoneda=true;
			this.isVisibilidadCeldaEliminarMoneda=false;
			this.isVisibilidadCeldaCancelarMoneda=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMoneda=false;
				} else {
					this.isVisibilidadCeldaGuardarMoneda=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoMoneda=true;
			this.isVisibilidadCeldaNuevoRelacionesMoneda=true;
			this.isVisibilidadCeldaGuardarCambiosMoneda=true;
			this.isVisibilidadCeldaModificarMoneda=false;
			this.isVisibilidadCeldaActualizarMoneda=false;
			this.isVisibilidadCeldaEliminarMoneda=false;
			this.isVisibilidadCeldaCancelarMoneda=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMoneda=true;
				} else {
					this.isVisibilidadCeldaGuardarMoneda=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoMoneda=false;
			this.isVisibilidadCeldaNuevoRelacionesMoneda=false;
			this.isVisibilidadCeldaGuardarCambiosMoneda=false;
			this.isVisibilidadCeldaActualizarMoneda=false;
			this.isVisibilidadCeldaEliminarMoneda=false;
			this.isVisibilidadCeldaCancelarMoneda=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMoneda=false;
				} else {
					this.isVisibilidadCeldaGuardarMoneda=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoMoneda=false;
			this.isVisibilidadCeldaNuevoRelacionesMoneda=false;
			this.isVisibilidadCeldaGuardarCambiosMoneda=false;
			this.isVisibilidadCeldaModificarMoneda=true;
			this.isVisibilidadCeldaActualizarMoneda=false;
			this.isVisibilidadCeldaEliminarMoneda=false;
			this.isVisibilidadCeldaCancelarMoneda=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMoneda=false;
				} else {
					this.isVisibilidadCeldaGuardarMoneda=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(MonedaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoMoneda=true;
			this.isVisibilidadCeldaNuevoRelacionesMoneda=true;
			this.isVisibilidadCeldaGuardarCambiosMoneda=true;
		} else {
			this.actualizarEstadoPanelsMoneda(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarMoneda=false;
			//this.isVisibilidadCeldaVerFormMoneda=false;
			this.isVisibilidadCeldaDuplicarMoneda=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!monedaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesMoneda=false;
		} else {
			this.isVisibilidadCeldaNuevoMoneda=false;
			this.isVisibilidadCeldaGuardarCambiosMoneda=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(monedaSessionBean.getEsGuardarRelacionado()) {
			if(!monedaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesMoneda=false;												
			}
			
			this.jButtonCerrarMoneda.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesMoneda=false;
		}
		
		if(!this.permiteMantenimiento(this.moneda)) {
			this.isVisibilidadCeldaActualizarMoneda=false;
			this.isVisibilidadCeldaEliminarMoneda=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesMoneda() {
	}
	
	public void actualizarEstadoPanelsMoneda(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionMoneda!=null) {
				this.jScrollPanelDatosEdicionMoneda.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMoneda!=null) {
				this.jTabbedPaneBusquedasMoneda.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosMoneda!=null) {
				this.jScrollPanelDatosMoneda.setVisible(true);
			}
			
			if(this.jPanelPaginacionMoneda!=null) {
				this.jPanelPaginacionMoneda.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesMoneda!=null) {
				this.jPanelParametrosReportesMoneda.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionMoneda!=null) {
				this.jScrollPanelDatosEdicionMoneda.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMoneda!=null) {
				this.jTabbedPaneBusquedasMoneda.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosMoneda!=null) {
				this.jScrollPanelDatosMoneda.setVisible(false);
			}
			
			if(this.jPanelPaginacionMoneda!=null) {
				this.jPanelPaginacionMoneda.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesMoneda!=null) {
				this.jPanelParametrosReportesMoneda.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionMoneda!=null) {
				this.jScrollPanelDatosEdicionMoneda.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMoneda!=null) {
				this.jTabbedPaneBusquedasMoneda.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosMoneda!=null) {
				this.jScrollPanelDatosMoneda.setVisible(false);
			}
			
			if(this.jPanelPaginacionMoneda!=null) {
				this.jPanelPaginacionMoneda.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesMoneda!=null) {
				this.jPanelParametrosReportesMoneda.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionMoneda!=null) {
				this.jScrollPanelDatosEdicionMoneda.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMoneda!=null) {
				this.jTabbedPaneBusquedasMoneda.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosMoneda!=null) {
				this.jScrollPanelDatosMoneda.setVisible(false);
			}
			
			if(this.jPanelPaginacionMoneda!=null) {
				this.jPanelPaginacionMoneda.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesMoneda!=null) {
				this.jPanelParametrosReportesMoneda.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionMoneda!=null) {
				this.jScrollPanelDatosEdicionMoneda.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMoneda!=null) {
				this.jTabbedPaneBusquedasMoneda.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosMoneda!=null) {
				this.jScrollPanelDatosMoneda.setVisible(true);
			}
			
			if(this.jPanelPaginacionMoneda!=null) {
				this.jPanelPaginacionMoneda.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesMoneda!=null) {
				this.jPanelParametrosReportesMoneda.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionMoneda!=null) {
				this.jScrollPanelDatosEdicionMoneda.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMoneda!=null) {
				this.jTabbedPaneBusquedasMoneda.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosMoneda!=null) {
				this.jScrollPanelDatosMoneda.setVisible(true);
			}
			
			if(this.jPanelPaginacionMoneda!=null) {
				this.jPanelPaginacionMoneda.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesMoneda!=null) {
				this.jPanelParametrosReportesMoneda.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionMoneda!=null) {
				this.jScrollPanelDatosEdicionMoneda.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMoneda!=null) {
				this.jTabbedPaneBusquedasMoneda.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosMoneda!=null) {
				this.jScrollPanelDatosMoneda.setVisible(true);
			}
			
			if(this.jPanelPaginacionMoneda!=null) {
				this.jPanelPaginacionMoneda.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesMoneda!=null) {
				this.jPanelParametrosReportesMoneda.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.monedaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasMoneda!=null) {
					this.jTabbedPaneBusquedasMoneda.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesMoneda!=null) {
				this.jPanelParametrosReportesMoneda.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.monedaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMoneda!=null) {
				this.jTabbedPaneBusquedasMoneda.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesMoneda!=null) {
				this.jPanelParametrosReportesMoneda.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaPorNombre=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasMoneda.remove(jPanelBusquedaPorNombreMoneda);}

			this.isVisibilidadBusquedaPorSigla=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorSigla) {this.jTabbedPaneBusquedasMoneda.remove(jPanelBusquedaPorSiglaMoneda);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//MonedaSessionBean monedaSessionBean=new MonedaSessionBean();
		
		if(this.monedaSessionBean==null) {
			this.monedaSessionBean=new MonedaSessionBean();
		}
		
		this.monedaSessionBean.setsUltimaBusquedaMoneda(this.getsAccionBusqueda());
		this.monedaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.monedaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			monedaSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorSigla")) {
			monedaSessionBean.setsigla(this.getsiglaBusquedaPorSigla());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			monedaSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//MonedaSessionBean monedaSessionBean=new MonedaSessionBean();
		
		if(this.monedaSessionBean==null) {
			this.monedaSessionBean=new MonedaSessionBean();
		}
		
		if(this.monedaSessionBean.getsUltimaBusquedaMoneda()!=null&&!this.monedaSessionBean.getsUltimaBusquedaMoneda().equals("")) {
			this.setsAccionBusqueda(monedaSessionBean.getsUltimaBusquedaMoneda());
			this.setiNumeroPaginacion(monedaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(monedaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(monedaSessionBean.getnombre());
				monedaSessionBean.setnombre("");
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorSigla")) {
				this.setsiglaBusquedaPorSigla(monedaSessionBean.getsigla());
				monedaSessionBean.setsigla("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(monedaSessionBean.getid_empresa());
				monedaSessionBean.setid_empresa(-1L);
			}
		}
		
		this.monedaSessionBean.setsUltimaBusquedaMoneda("");
		this.monedaSessionBean.setiNumeroPaginacion(MonedaConstantesFunciones.INUMEROPAGINACION);
		this.monedaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaMoneda(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioMoneda() {
		this.updateBorderResaltarBusquedasFormularioMoneda();
		this.updateVisibilidadBusquedasFormularioMoneda();
		this.updateHabilitarBusquedasFormularioMoneda();
	}
	
	public void updateBorderResaltarBusquedasFormularioMoneda() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasMoneda.getComponents().length>0) {
	

		if(this.monedaConstantesFunciones.resaltarBusquedaPorNombreMoneda!=null) {
			index= this.jTabbedPaneBusquedasMoneda.indexOfComponent(this.jPanelBusquedaPorNombreMoneda);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasMoneda.getComponent(index);
				jPanel.setBorder(this.monedaConstantesFunciones.resaltarBusquedaPorNombreMoneda);
			}
		}

		if(this.monedaConstantesFunciones.resaltarBusquedaPorSiglaMoneda!=null) {
			index= this.jTabbedPaneBusquedasMoneda.indexOfComponent(this.jPanelBusquedaPorSiglaMoneda);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasMoneda.getComponent(index);
				jPanel.setBorder(this.monedaConstantesFunciones.resaltarBusquedaPorSiglaMoneda);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioMoneda() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasMoneda.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasMoneda.indexOfComponent(this.jPanelBusquedaPorNombreMoneda);
			jPanel=(JPanel)this.jTabbedPaneBusquedasMoneda.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.monedaConstantesFunciones.mostrarBusquedaPorNombreMoneda);
			if(!this.monedaConstantesFunciones.mostrarBusquedaPorNombreMoneda && index>-1) {
				this.jTabbedPaneBusquedasMoneda.remove(index);
			}

			index= this.jTabbedPaneBusquedasMoneda.indexOfComponent(this.jPanelBusquedaPorSiglaMoneda);
			jPanel=(JPanel)this.jTabbedPaneBusquedasMoneda.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.monedaConstantesFunciones.mostrarBusquedaPorSiglaMoneda);
			if(!this.monedaConstantesFunciones.mostrarBusquedaPorSiglaMoneda && index>-1) {
				this.jTabbedPaneBusquedasMoneda.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioMoneda() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasMoneda.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasMoneda.indexOfComponent(this.jPanelBusquedaPorNombreMoneda);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasMoneda.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.monedaConstantesFunciones.activarBusquedaPorNombreMoneda);
				this.jTabbedPaneBusquedasMoneda.setEnabledAt(index,this.monedaConstantesFunciones.activarBusquedaPorNombreMoneda);
			}

			index= this.jTabbedPaneBusquedasMoneda.indexOfComponent(this.jPanelBusquedaPorSiglaMoneda);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasMoneda.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.monedaConstantesFunciones.activarBusquedaPorSiglaMoneda);
				this.jTabbedPaneBusquedasMoneda.setEnabledAt(index,this.monedaConstantesFunciones.activarBusquedaPorSiglaMoneda);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaMoneda(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasMoneda.indexOfComponent(this.jPanelBusquedaPorNombreMoneda);

			this.jTabbedPaneBusquedasMoneda.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasMoneda.getComponent(index);

			this.monedaConstantesFunciones.setResaltarBusquedaPorNombreMoneda(resaltar);

			jPanel.setBorder(this.monedaConstantesFunciones.resaltarBusquedaPorNombreMoneda);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorSigla")) {
			index= this.jTabbedPaneBusquedasMoneda.indexOfComponent(this.jPanelBusquedaPorSiglaMoneda);

			this.jTabbedPaneBusquedasMoneda.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasMoneda.getComponent(index);

			this.monedaConstantesFunciones.setResaltarBusquedaPorSiglaMoneda(resaltar);

			jPanel.setBorder(this.monedaConstantesFunciones.resaltarBusquedaPorSiglaMoneda);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarMoneda.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioMoneda() throws Exception {

		if(this.jInternalFrameDetalleFormMoneda==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioMoneda();
		this.updateVisibilidadResaltarControlesFormularioMoneda();
		this.updateHabilitarResaltarControlesFormularioMoneda();
		
	}
	
	public void updateBorderResaltarControlesFormularioMoneda() throws Exception {
		if(this.jInternalFrameDetalleFormMoneda==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.monedaConstantesFunciones.resaltaridMoneda!=null && this.jInternalFrameDetalleFormMoneda!=null) {this.jInternalFrameDetalleFormMoneda.jLabelidMoneda.setBorder(this.monedaConstantesFunciones.resaltaridMoneda);}
		if(this.monedaConstantesFunciones.resaltarid_empresaMoneda!=null && this.jInternalFrameDetalleFormMoneda!=null) {this.jInternalFrameDetalleFormMoneda.jComboBoxid_empresaMoneda.setBorder(this.monedaConstantesFunciones.resaltarid_empresaMoneda);}
		if(this.monedaConstantesFunciones.resaltarnombreMoneda!=null && this.jInternalFrameDetalleFormMoneda!=null) {this.jInternalFrameDetalleFormMoneda.jTextFieldnombreMoneda.setBorder(this.monedaConstantesFunciones.resaltarnombreMoneda);}
		if(this.monedaConstantesFunciones.resaltarsiglaMoneda!=null && this.jInternalFrameDetalleFormMoneda!=null) {this.jInternalFrameDetalleFormMoneda.jTextFieldsiglaMoneda.setBorder(this.monedaConstantesFunciones.resaltarsiglaMoneda);}
		if(this.monedaConstantesFunciones.resaltarsimboloMoneda!=null && this.jInternalFrameDetalleFormMoneda!=null) {this.jInternalFrameDetalleFormMoneda.jTextFieldsimboloMoneda.setBorder(this.monedaConstantesFunciones.resaltarsimboloMoneda);}
		if(this.monedaConstantesFunciones.resaltaresta_activoMoneda!=null && this.jInternalFrameDetalleFormMoneda!=null) {this.jInternalFrameDetalleFormMoneda.jCheckBoxesta_activoMoneda.setBorderPainted(true);this.jInternalFrameDetalleFormMoneda.jCheckBoxesta_activoMoneda.setBorder(this.monedaConstantesFunciones.resaltaresta_activoMoneda);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioMoneda() throws Exception {		
		if(this.jInternalFrameDetalleFormMoneda==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormMoneda!=null) {
	
		//this.jInternalFrameDetalleFormMoneda.jLabelidMoneda.setVisible(this.monedaConstantesFunciones.mostraridMoneda);
		this.jInternalFrameDetalleFormMoneda.jPanelidMoneda.setVisible(this.monedaConstantesFunciones.mostraridMoneda);
		//this.jInternalFrameDetalleFormMoneda.jComboBoxid_empresaMoneda.setVisible(this.monedaConstantesFunciones.mostrarid_empresaMoneda);
		this.jInternalFrameDetalleFormMoneda.jPanelid_empresaMoneda.setVisible(this.monedaConstantesFunciones.mostrarid_empresaMoneda);
		//this.jInternalFrameDetalleFormMoneda.jTextFieldnombreMoneda.setVisible(this.monedaConstantesFunciones.mostrarnombreMoneda);
		this.jInternalFrameDetalleFormMoneda.jPanelnombreMoneda.setVisible(this.monedaConstantesFunciones.mostrarnombreMoneda);
		//this.jInternalFrameDetalleFormMoneda.jTextFieldsiglaMoneda.setVisible(this.monedaConstantesFunciones.mostrarsiglaMoneda);
		this.jInternalFrameDetalleFormMoneda.jPanelsiglaMoneda.setVisible(this.monedaConstantesFunciones.mostrarsiglaMoneda);
		//this.jInternalFrameDetalleFormMoneda.jTextFieldsimboloMoneda.setVisible(this.monedaConstantesFunciones.mostrarsimboloMoneda);
		this.jInternalFrameDetalleFormMoneda.jPanelsimboloMoneda.setVisible(this.monedaConstantesFunciones.mostrarsimboloMoneda);
		//this.jInternalFrameDetalleFormMoneda.jCheckBoxesta_activoMoneda.setVisible(this.monedaConstantesFunciones.mostraresta_activoMoneda);
		this.jInternalFrameDetalleFormMoneda.jPanelesta_activoMoneda.setVisible(this.monedaConstantesFunciones.mostraresta_activoMoneda);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioMoneda() throws Exception {
		if(this.jInternalFrameDetalleFormMoneda==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormMoneda!=null) {
	
		this.jInternalFrameDetalleFormMoneda.jLabelidMoneda.setEnabled(this.monedaConstantesFunciones.activaridMoneda);
		this.jInternalFrameDetalleFormMoneda.jComboBoxid_empresaMoneda.setEnabled(this.monedaConstantesFunciones.activarid_empresaMoneda);
		this.jInternalFrameDetalleFormMoneda.jTextFieldnombreMoneda.setEnabled(this.monedaConstantesFunciones.activarnombreMoneda);
		this.jInternalFrameDetalleFormMoneda.jTextFieldsiglaMoneda.setEnabled(this.monedaConstantesFunciones.activarsiglaMoneda);
		this.jInternalFrameDetalleFormMoneda.jTextFieldsimboloMoneda.setEnabled(this.monedaConstantesFunciones.activarsimboloMoneda);
		this.jInternalFrameDetalleFormMoneda.jCheckBoxesta_activoMoneda.setEnabled(this.monedaConstantesFunciones.activaresta_activoMoneda);
		}
	}
	
		
}