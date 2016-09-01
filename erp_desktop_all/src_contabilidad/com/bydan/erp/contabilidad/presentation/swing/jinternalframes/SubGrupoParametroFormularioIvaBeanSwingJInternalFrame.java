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

import com.bydan.erp.contabilidad.util.SubGrupoParametroFormularioIvaConstantesFunciones;
import com.bydan.erp.contabilidad.util.SubGrupoParametroFormularioIvaParameterReturnGeneral;
//import com.bydan.erp.contabilidad.util.SubGrupoParametroFormularioIvaParameterGeneral;
//import com.bydan.erp.contabilidad.presentation.report.source.SubGrupoParametroFormularioIvaBean;
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
public class SubGrupoParametroFormularioIvaBeanSwingJInternalFrame extends SubGrupoParametroFormularioIvaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(SubGrupoParametroFormularioIvaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<SubGrupoParametroFormularioIva> subgrupoparametroformularioivaValidator = new ClassValidator<SubGrupoParametroFormularioIva>(SubGrupoParametroFormularioIva.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public SubGrupoParametroFormularioIva subgrupoparametroformularioiva;	
	public SubGrupoParametroFormularioIva subgrupoparametroformularioivaAux;
	public SubGrupoParametroFormularioIva subgrupoparametroformularioivaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public SubGrupoParametroFormularioIva subgrupoparametroformularioivaTotales;
	public Long idSubGrupoParametroFormularioIvaActual;
	public Long iIdNuevoSubGrupoParametroFormularioIva=0L;
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

		
	
	
	
	
	

	public Boolean isTienePermisosParametroFormularioIva=false;

	public Boolean getIsTienePermisosParametroFormularioIva() {
		return isTienePermisosParametroFormularioIva;
	}

	public void setIsTienePermisosParametroFormularioIva(Boolean isTienePermisosParametroFormularioIva) {
		this.isTienePermisosParametroFormularioIva= isTienePermisosParametroFormularioIva;
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
	
	public Boolean isPermisoTodoSubGrupoParametroFormularioIva;
	public Boolean isPermisoNuevoSubGrupoParametroFormularioIva;
	public Boolean isPermisoActualizarSubGrupoParametroFormularioIva;
	public Boolean isPermisoActualizarOriginalSubGrupoParametroFormularioIva;
	public Boolean isPermisoEliminarSubGrupoParametroFormularioIva;
	public Boolean isPermisoGuardarCambiosSubGrupoParametroFormularioIva;
	public Boolean isPermisoConsultaSubGrupoParametroFormularioIva;
	public Boolean isPermisoBusquedaSubGrupoParametroFormularioIva;
	public Boolean isPermisoReporteSubGrupoParametroFormularioIva;
	public Boolean isPermisoPaginacionMedioSubGrupoParametroFormularioIva;
	public Boolean isPermisoPaginacionAltoSubGrupoParametroFormularioIva;
	public Boolean isPermisoPaginacionTodoSubGrupoParametroFormularioIva;
	public Boolean isPermisoCopiarSubGrupoParametroFormularioIva;
	public Boolean isPermisoVerFormSubGrupoParametroFormularioIva;
	public Boolean isPermisoDuplicarSubGrupoParametroFormularioIva;
	public Boolean isPermisoOrdenSubGrupoParametroFormularioIva;
	
	
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
	
	public SubGrupoParametroFormularioIvaParameterReturnGeneral subgrupoparametroformularioivaReturnGeneral;
	public SubGrupoParametroFormularioIvaParameterReturnGeneral subgrupoparametroformularioivaParameterGeneral;
	
	

	public ParametroFormularioIvaLogic parametroformularioivaLogic=null;

	public ParametroFormularioIvaLogic getParametroFormularioIvaLogic() {
		return parametroformularioivaLogic;
	}

	public void setParametroFormularioIvaLogic(ParametroFormularioIvaLogic parametroformularioivaLogic) {
		this.parametroformularioivaLogic = parametroformularioivaLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoSubGrupoParametroFormularioIva=false;
	public Boolean esParaAccionDesdeFormularioSubGrupoParametroFormularioIva=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public SubGrupoParametroFormularioIvaLogic subgrupoparametroformularioivaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public SubGrupoParametroFormularioIva subgrupoparametroformularioivaBean;
	public SubGrupoParametroFormularioIvaConstantesFunciones subgrupoparametroformularioivaConstantesFunciones;
	//public SubGrupoParametroFormularioIvaParameterReturnGeneral subgrupoparametroformularioivaReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<SubGrupoParametroFormularioIva> subgrupoparametroformularioivas;	
	//public List<SubGrupoParametroFormularioIva> subgrupoparametroformularioivasEliminados;
	//public List<SubGrupoParametroFormularioIva> subgrupoparametroformularioivasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoSubGrupoParametroFormularioIva=false;
	public Boolean isVisibilidadCeldaDuplicarSubGrupoParametroFormularioIva=true;
	public Boolean isVisibilidadCeldaCopiarSubGrupoParametroFormularioIva=true;
	public Boolean isVisibilidadCeldaVerFormSubGrupoParametroFormularioIva=true;
	public Boolean isVisibilidadCeldaOrdenSubGrupoParametroFormularioIva=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesSubGrupoParametroFormularioIva=false;
	public Boolean isVisibilidadCeldaModificarSubGrupoParametroFormularioIva=false;
	public Boolean isVisibilidadCeldaActualizarSubGrupoParametroFormularioIva=false;
	public Boolean isVisibilidadCeldaEliminarSubGrupoParametroFormularioIva=false;
	public Boolean isVisibilidadCeldaCancelarSubGrupoParametroFormularioIva=false;
	public Boolean isVisibilidadCeldaGuardarSubGrupoParametroFormularioIva=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosSubGrupoParametroFormularioIva=false;	
	
	
	public Boolean isVisibilidadBusquedaPorId=false;
	public Boolean isVisibilidadBusquedaPorNombre=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoSubGrupoParametroFormularioIva() {
		return this.iIdNuevoSubGrupoParametroFormularioIva;
	}

	public void setiIdNuevoSubGrupoParametroFormularioIva(Long iIdNuevoSubGrupoParametroFormularioIva) {
		this.iIdNuevoSubGrupoParametroFormularioIva = iIdNuevoSubGrupoParametroFormularioIva;
	}
	
	public Long getidSubGrupoParametroFormularioIvaActual() {
		return this.idSubGrupoParametroFormularioIvaActual;
	}

	public void setidSubGrupoParametroFormularioIvaActual(Long idSubGrupoParametroFormularioIvaActual) {
		this.idSubGrupoParametroFormularioIvaActual = idSubGrupoParametroFormularioIvaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public SubGrupoParametroFormularioIva getsubgrupoparametroformularioiva() {
		return this.subgrupoparametroformularioiva;
	}

	public void setsubgrupoparametroformularioiva(SubGrupoParametroFormularioIva subgrupoparametroformularioiva) {
		this.subgrupoparametroformularioiva = subgrupoparametroformularioiva;
	}
	
	public SubGrupoParametroFormularioIva getsubgrupoparametroformularioivaAux() {
		return this.subgrupoparametroformularioivaAux;
	}

	public void setsubgrupoparametroformularioivaAux(SubGrupoParametroFormularioIva subgrupoparametroformularioivaAux) {
		this.subgrupoparametroformularioivaAux = subgrupoparametroformularioivaAux;
	}				
	
	public SubGrupoParametroFormularioIva getsubgrupoparametroformularioivaAnterior() {
		return this.subgrupoparametroformularioivaAnterior;
	}

	public void setsubgrupoparametroformularioivaAnterior(SubGrupoParametroFormularioIva subgrupoparametroformularioivaAnterior) {
		this.subgrupoparametroformularioivaAnterior = subgrupoparametroformularioivaAnterior;
	}	
	
	public SubGrupoParametroFormularioIva getsubgrupoparametroformularioivaTotales() {
		return this.subgrupoparametroformularioivaTotales;
	}

	public void setsubgrupoparametroformularioivaTotales(SubGrupoParametroFormularioIva subgrupoparametroformularioivaTotales) {
		this.subgrupoparametroformularioivaTotales = subgrupoparametroformularioivaTotales;
	}	
	
	public SubGrupoParametroFormularioIva getsubgrupoparametroformularioivaBean() {
		return this.subgrupoparametroformularioivaBean;
	}

	public void setsubgrupoparametroformularioivaBean(SubGrupoParametroFormularioIva subgrupoparametroformularioivaBean) {
		this.subgrupoparametroformularioivaBean = subgrupoparametroformularioivaBean;
	}	
	
	public SubGrupoParametroFormularioIvaParameterReturnGeneral getsubgrupoparametroformularioivaReturnGeneral() {
		return this.subgrupoparametroformularioivaReturnGeneral;
	}

	public void setsubgrupoparametroformularioivaReturnGeneral(SubGrupoParametroFormularioIvaParameterReturnGeneral subgrupoparametroformularioivaReturnGeneral) {
		this.subgrupoparametroformularioivaReturnGeneral = subgrupoparametroformularioivaReturnGeneral;
	}	
	
	
	public Long idBusquedaPorId=0L;

	public Long getidBusquedaPorId() {
		return this.idBusquedaPorId;
	}

	public void setidBusquedaPorId(Long idBusquedaPorId) {
		this.idBusquedaPorId = idBusquedaPorId;
	}

	public String nombreBusquedaPorNombre="";

	public String getnombreBusquedaPorNombre() {
		return this.nombreBusquedaPorNombre;
	}

	public void setnombreBusquedaPorNombre(String nombreBusquedaPorNombre) {
		this.nombreBusquedaPorNombre = nombreBusquedaPorNombre;
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
	
	
	public SubGrupoParametroFormularioIvaLogic getSubGrupoParametroFormularioIvaLogic()	{		
		return subgrupoparametroformularioivaLogic;
	}

	public void setSubGrupoParametroFormularioIvaLogic(SubGrupoParametroFormularioIvaLogic subgrupoparametroformularioivaLogic) {
		this.subgrupoparametroformularioivaLogic = subgrupoparametroformularioivaLogic;
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
	
	public Boolean getIsEsNuevoSubGrupoParametroFormularioIva() {
		return isEsNuevoSubGrupoParametroFormularioIva;
	}

	public void setIsEsNuevoSubGrupoParametroFormularioIva(Boolean isEsNuevoSubGrupoParametroFormularioIva) {
		this.isEsNuevoSubGrupoParametroFormularioIva = isEsNuevoSubGrupoParametroFormularioIva;
	}

	public Boolean getEsParaAccionDesdeFormularioSubGrupoParametroFormularioIva() {
		return esParaAccionDesdeFormularioSubGrupoParametroFormularioIva;
	}
	
	public void setEsParaAccionDesdeFormularioSubGrupoParametroFormularioIva(Boolean esParaAccionDesdeFormularioSubGrupoParametroFormularioIva) {
		this.esParaAccionDesdeFormularioSubGrupoParametroFormularioIva = esParaAccionDesdeFormularioSubGrupoParametroFormularioIva;
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

			if(this.subgrupoparametroformularioivaSessionBean==null) {
				this.subgrupoparametroformularioivaSessionBean=new SubGrupoParametroFormularioIvaSessionBean();
			}

			if(!this.subgrupoparametroformularioivaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(subgrupoparametroformularioivaSessionBean.getlidEmpresaActual());
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

					if(this.subgrupoparametroformularioiva!=null) {
						this.subgrupoparametroformularioiva.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva!=null) {
						this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jComboBoxid_empresaSubGrupoParametroFormularioIva.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaSubGrupoParametroFormularioIva.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva!=null) {
						if(this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jComboBoxid_empresaSubGrupoParametroFormularioIva.getItemCount()>0) {
							this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jComboBoxid_empresaSubGrupoParametroFormularioIva.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaSubGrupoParametroFormularioIvaGenerico)throws Exception
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
				jComboBoxid_empresaSubGrupoParametroFormularioIvaGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaSubGrupoParametroFormularioIvaGenerico!=null && jComboBoxid_empresaSubGrupoParametroFormularioIvaGenerico.getItemCount()>0) {
					jComboBoxid_empresaSubGrupoParametroFormularioIvaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(SubGrupoParametroFormularioIva subgrupoparametroformularioiva,JComboBox jComboBoxid_empresaSubGrupoParametroFormularioIvaGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaSubGrupoParametroFormularioIvaGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jComboBoxid_empresaSubGrupoParametroFormularioIva.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaSubGrupoParametroFormularioIvaGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				subgrupoparametroformularioiva.setid_empresa(empresaAux.getId());
				subgrupoparametroformularioiva.setempresa_descripcion(SubGrupoParametroFormularioIvaConstantesFunciones.getEmpresaDescripcion(empresaAux));
				subgrupoparametroformularioiva.setEmpresa(empresaAux);			}
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

					if(!SubGrupoParametroFormularioIvaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva!=null) { 
							this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jComboBoxid_empresaSubGrupoParametroFormularioIva.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jComboBoxid_empresaSubGrupoParametroFormularioIva.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva!=null) { 
					}

					if(!SubGrupoParametroFormularioIvaJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva!=null) {
							this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jComboBoxid_empresaSubGrupoParametroFormularioIva.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva!=null) {
							this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jComboBoxid_empresaSubGrupoParametroFormularioIva.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesSubGrupoParametroFormularioIva() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			SubGrupoParametroFormularioIvaConstantesFunciones.refrescarForeignKeysDescripcionesSubGrupoParametroFormularioIva(this.subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			SubGrupoParametroFormularioIvaConstantesFunciones.refrescarForeignKeysDescripcionesSubGrupoParametroFormularioIva(this.subgrupoparametroformularioivas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//subgrupoparametroformularioivaLogic.setSubGrupoParametroFormularioIvas(this.subgrupoparametroformularioivas);
			subgrupoparametroformularioivaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public SubGrupoParametroFormularioIvaParameterReturnGeneral getSubGrupoParametroFormularioIvaParameterGeneral() {
		return this.subgrupoparametroformularioivaParameterGeneral;
	}
	
	public void setSubGrupoParametroFormularioIvaParameterGeneral(SubGrupoParametroFormularioIvaParameterReturnGeneral subgrupoparametroformularioivaParameterGeneral) {
		this.subgrupoparametroformularioivaParameterGeneral = subgrupoparametroformularioivaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoSubGrupoParametroFormularioIva() {
		return isPermisoTodoSubGrupoParametroFormularioIva;
	}

	public void setIsPermisoTodoSubGrupoParametroFormularioIva(Boolean isPermisoTodoSubGrupoParametroFormularioIva) {
		this.isPermisoTodoSubGrupoParametroFormularioIva = isPermisoTodoSubGrupoParametroFormularioIva;
	}

	public Boolean getIsPermisoNuevoSubGrupoParametroFormularioIva() {
		return isPermisoNuevoSubGrupoParametroFormularioIva;
	}

	public void setIsPermisoNuevoSubGrupoParametroFormularioIva(Boolean isPermisoNuevoSubGrupoParametroFormularioIva) {
		this.isPermisoNuevoSubGrupoParametroFormularioIva = isPermisoNuevoSubGrupoParametroFormularioIva;
	}

	public Boolean getIsPermisoActualizarSubGrupoParametroFormularioIva() {
		return isPermisoActualizarSubGrupoParametroFormularioIva;
	}

	public void setIsPermisoActualizarSubGrupoParametroFormularioIva(Boolean isPermisoActualizarSubGrupoParametroFormularioIva) {
		this.isPermisoActualizarSubGrupoParametroFormularioIva = isPermisoActualizarSubGrupoParametroFormularioIva;
	}

	public Boolean getIsPermisoEliminarSubGrupoParametroFormularioIva() {
		return isPermisoEliminarSubGrupoParametroFormularioIva;
	}

	public void setIsPermisoEliminarSubGrupoParametroFormularioIva(Boolean isPermisoEliminarSubGrupoParametroFormularioIva) {
		this.isPermisoEliminarSubGrupoParametroFormularioIva = isPermisoEliminarSubGrupoParametroFormularioIva;
	}

	public Boolean getIsPermisoGuardarCambiosSubGrupoParametroFormularioIva() {
		return isPermisoGuardarCambiosSubGrupoParametroFormularioIva;
	}

	public void setIsPermisoGuardarCambiosSubGrupoParametroFormularioIva(Boolean isPermisoGuardarCambiosSubGrupoParametroFormularioIva) {
		this.isPermisoGuardarCambiosSubGrupoParametroFormularioIva = isPermisoGuardarCambiosSubGrupoParametroFormularioIva;
	}
	
	public Boolean getIsPermisoConsultaSubGrupoParametroFormularioIva() {
		return isPermisoConsultaSubGrupoParametroFormularioIva;
	}

	public void setIsPermisoConsultaSubGrupoParametroFormularioIva(Boolean isPermisoConsultaSubGrupoParametroFormularioIva) {
		this.isPermisoConsultaSubGrupoParametroFormularioIva = isPermisoConsultaSubGrupoParametroFormularioIva;
	}

	public Boolean getIsPermisoBusquedaSubGrupoParametroFormularioIva() {
		return isPermisoBusquedaSubGrupoParametroFormularioIva;
	}

	public void setIsPermisoBusquedaSubGrupoParametroFormularioIva(Boolean isPermisoBusquedaSubGrupoParametroFormularioIva) {
		this.isPermisoBusquedaSubGrupoParametroFormularioIva = isPermisoBusquedaSubGrupoParametroFormularioIva;
	}

	public Boolean getIsPermisoReporteSubGrupoParametroFormularioIva() {
		return isPermisoReporteSubGrupoParametroFormularioIva;
	}

	public void setIsPermisoReporteSubGrupoParametroFormularioIva(Boolean isPermisoReporteSubGrupoParametroFormularioIva) {
		this.isPermisoReporteSubGrupoParametroFormularioIva = isPermisoReporteSubGrupoParametroFormularioIva;
	}
	
	public Boolean getIsPermisoPaginacionMedioSubGrupoParametroFormularioIva() {
		return isPermisoPaginacionMedioSubGrupoParametroFormularioIva;
	}

	public void setIsPermisoPaginacionMedioSubGrupoParametroFormularioIva(Boolean isPermisoPaginacionMedioSubGrupoParametroFormularioIva) {
		this.isPermisoPaginacionMedioSubGrupoParametroFormularioIva = isPermisoPaginacionMedioSubGrupoParametroFormularioIva;
	}
	
	public Boolean getIsPermisoPaginacionTodoSubGrupoParametroFormularioIva() {
		return isPermisoPaginacionTodoSubGrupoParametroFormularioIva;
	}

	public void setIsPermisoPaginacionTodoSubGrupoParametroFormularioIva(Boolean isPermisoPaginacionTodoSubGrupoParametroFormularioIva) {
		this.isPermisoPaginacionTodoSubGrupoParametroFormularioIva = isPermisoPaginacionTodoSubGrupoParametroFormularioIva;
	}
	
	public Boolean getIsPermisoPaginacionAltoSubGrupoParametroFormularioIva() {
		return isPermisoPaginacionAltoSubGrupoParametroFormularioIva;
	}

	public void setIsPermisoPaginacionAltoSubGrupoParametroFormularioIva(Boolean isPermisoPaginacionAltoSubGrupoParametroFormularioIva) {
		this.isPermisoPaginacionAltoSubGrupoParametroFormularioIva = isPermisoPaginacionAltoSubGrupoParametroFormularioIva;
	}
	
	public Boolean getIsPermisoCopiarSubGrupoParametroFormularioIva() {
		return isPermisoCopiarSubGrupoParametroFormularioIva;
	}

	public void setIsPermisoCopiarSubGrupoParametroFormularioIva(Boolean isPermisoCopiarSubGrupoParametroFormularioIva) {
		this.isPermisoCopiarSubGrupoParametroFormularioIva = isPermisoCopiarSubGrupoParametroFormularioIva;
	}
	
	public Boolean getIsPermisoVerFormSubGrupoParametroFormularioIva() {
		return isPermisoVerFormSubGrupoParametroFormularioIva;
	}

	public void setIsPermisoVerFormSubGrupoParametroFormularioIva(Boolean isPermisoVerFormSubGrupoParametroFormularioIva) {
		this.isPermisoVerFormSubGrupoParametroFormularioIva = isPermisoVerFormSubGrupoParametroFormularioIva;
	}
	
	public Boolean getIsPermisoDuplicarSubGrupoParametroFormularioIva() {
		return isPermisoDuplicarSubGrupoParametroFormularioIva;
	}

	public void setIsPermisoDuplicarSubGrupoParametroFormularioIva(Boolean isPermisoDuplicarSubGrupoParametroFormularioIva) {
		this.isPermisoDuplicarSubGrupoParametroFormularioIva = isPermisoDuplicarSubGrupoParametroFormularioIva;
	}
	
	public Boolean getIsPermisoOrdenSubGrupoParametroFormularioIva() {
		return isPermisoOrdenSubGrupoParametroFormularioIva;
	}

	public void setIsPermisoOrdenSubGrupoParametroFormularioIva(Boolean isPermisoOrdenSubGrupoParametroFormularioIva) {
		this.isPermisoOrdenSubGrupoParametroFormularioIva = isPermisoOrdenSubGrupoParametroFormularioIva;
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
	
	public Boolean getIsVisibilidadCeldaNuevoSubGrupoParametroFormularioIva() {
		return isVisibilidadCeldaNuevoSubGrupoParametroFormularioIva;
	}

	public void setIsVisibilidadCeldaNuevoSubGrupoParametroFormularioIva(Boolean isVisibilidadCeldaNuevoSubGrupoParametroFormularioIva) {
		this.isVisibilidadCeldaNuevoSubGrupoParametroFormularioIva = isVisibilidadCeldaNuevoSubGrupoParametroFormularioIva;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarSubGrupoParametroFormularioIva() {
		return isVisibilidadCeldaDuplicarSubGrupoParametroFormularioIva;
	}

	public void setIsVisibilidadCeldaDuplicarSubGrupoParametroFormularioIva(Boolean isVisibilidadCeldaDuplicarSubGrupoParametroFormularioIva) {
		this.isVisibilidadCeldaDuplicarSubGrupoParametroFormularioIva = isVisibilidadCeldaDuplicarSubGrupoParametroFormularioIva;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarSubGrupoParametroFormularioIva() {
		return isVisibilidadCeldaCopiarSubGrupoParametroFormularioIva;
	}

	public void setIsVisibilidadCeldaCopiarSubGrupoParametroFormularioIva(Boolean isVisibilidadCeldaCopiarSubGrupoParametroFormularioIva) {
		this.isVisibilidadCeldaCopiarSubGrupoParametroFormularioIva = isVisibilidadCeldaCopiarSubGrupoParametroFormularioIva;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormSubGrupoParametroFormularioIva() {
		return isVisibilidadCeldaVerFormSubGrupoParametroFormularioIva;
	}

	public void setIsVisibilidadCeldaVerFormSubGrupoParametroFormularioIva(Boolean isVisibilidadCeldaVerFormSubGrupoParametroFormularioIva) {
		this.isVisibilidadCeldaVerFormSubGrupoParametroFormularioIva = isVisibilidadCeldaVerFormSubGrupoParametroFormularioIva;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenSubGrupoParametroFormularioIva() {
		return isVisibilidadCeldaOrdenSubGrupoParametroFormularioIva;
	}

	public void setIsVisibilidadCeldaOrdenSubGrupoParametroFormularioIva(Boolean isVisibilidadCeldaOrdenSubGrupoParametroFormularioIva) {
		this.isVisibilidadCeldaOrdenSubGrupoParametroFormularioIva = isVisibilidadCeldaOrdenSubGrupoParametroFormularioIva;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesSubGrupoParametroFormularioIva() {
		return isVisibilidadCeldaNuevoRelacionesSubGrupoParametroFormularioIva;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesSubGrupoParametroFormularioIva(Boolean isVisibilidadCeldaNuevoRelacionesSubGrupoParametroFormularioIva) {
		this.isVisibilidadCeldaNuevoRelacionesSubGrupoParametroFormularioIva = isVisibilidadCeldaNuevoRelacionesSubGrupoParametroFormularioIva;
	}
	
	public Boolean getIsVisibilidadCeldaModificarSubGrupoParametroFormularioIva() {
		return isVisibilidadCeldaModificarSubGrupoParametroFormularioIva;
	}

	public void setIsVisibilidadCeldaModificarSubGrupoParametroFormularioIva(Boolean isVisibilidadCeldaModificarSubGrupoParametroFormularioIva) {
		this.isVisibilidadCeldaModificarSubGrupoParametroFormularioIva = isVisibilidadCeldaModificarSubGrupoParametroFormularioIva;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarSubGrupoParametroFormularioIva() {
		return isVisibilidadCeldaActualizarSubGrupoParametroFormularioIva;
	}

	public void setIsVisibilidadCeldaActualizarSubGrupoParametroFormularioIva(Boolean isVisibilidadCeldaActualizarSubGrupoParametroFormularioIva) {
		this.isVisibilidadCeldaActualizarSubGrupoParametroFormularioIva = isVisibilidadCeldaActualizarSubGrupoParametroFormularioIva;
	}

	public Boolean getIsVisibilidadCeldaEliminarSubGrupoParametroFormularioIva() {
		return isVisibilidadCeldaEliminarSubGrupoParametroFormularioIva;
	}

	public void setIsVisibilidadCeldaEliminarSubGrupoParametroFormularioIva(Boolean isVisibilidadCeldaEliminarSubGrupoParametroFormularioIva) {
		this.isVisibilidadCeldaEliminarSubGrupoParametroFormularioIva = isVisibilidadCeldaEliminarSubGrupoParametroFormularioIva;
	}

	public Boolean getIsVisibilidadCeldaCancelarSubGrupoParametroFormularioIva() {
		return isVisibilidadCeldaCancelarSubGrupoParametroFormularioIva;
	}

	public void setIsVisibilidadCeldaCancelarSubGrupoParametroFormularioIva(Boolean isVisibilidadCeldaCancelarSubGrupoParametroFormularioIva) {
		this.isVisibilidadCeldaCancelarSubGrupoParametroFormularioIva = isVisibilidadCeldaCancelarSubGrupoParametroFormularioIva;
	}

	public Boolean getIsVisibilidadCeldaGuardarSubGrupoParametroFormularioIva() {
		return isVisibilidadCeldaGuardarSubGrupoParametroFormularioIva;
	}

	public void setIsVisibilidadCeldaGuardarSubGrupoParametroFormularioIva(Boolean isVisibilidadCeldaGuardarSubGrupoParametroFormularioIva) {
		this.isVisibilidadCeldaGuardarSubGrupoParametroFormularioIva = isVisibilidadCeldaGuardarSubGrupoParametroFormularioIva;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosSubGrupoParametroFormularioIva() {
		return isVisibilidadCeldaGuardarCambiosSubGrupoParametroFormularioIva;
	}

	public void setIsVisibilidadCeldaGuardarCambiosSubGrupoParametroFormularioIva(Boolean isVisibilidadCeldaGuardarCambiosSubGrupoParametroFormularioIva) {
		this.isVisibilidadCeldaGuardarCambiosSubGrupoParametroFormularioIva = isVisibilidadCeldaGuardarCambiosSubGrupoParametroFormularioIva;
	}
		
	public SubGrupoParametroFormularioIvaSessionBean getsubgrupoparametroformularioivaSessionBean() {
		return this.subgrupoparametroformularioivaSessionBean;
	}
	
	public void setsubgrupoparametroformularioivaSessionBean(SubGrupoParametroFormularioIvaSessionBean subgrupoparametroformularioivaSessionBean) {
		this.subgrupoparametroformularioivaSessionBean=subgrupoparametroformularioivaSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorId() {
		return this.isVisibilidadBusquedaPorId;
	}

	public void setisVisibilidadBusquedaPorId(Boolean isVisibilidadBusquedaPorId) {
		this.isVisibilidadBusquedaPorId=isVisibilidadBusquedaPorId;
	}

	public Boolean getisVisibilidadBusquedaPorNombre() {
		return this.isVisibilidadBusquedaPorNombre;
	}

	public void setisVisibilidadBusquedaPorNombre(Boolean isVisibilidadBusquedaPorNombre) {
		this.isVisibilidadBusquedaPorNombre=isVisibilidadBusquedaPorNombre;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysSubGrupoParametroFormularioIva(SubGrupoParametroFormularioIva subgrupoparametroformularioiva)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(subgrupoparametroformularioiva,null);
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
	
	public void bugActualizarReferenciaActual(SubGrupoParametroFormularioIva subgrupoparametroformularioiva,SubGrupoParametroFormularioIva subgrupoparametroformularioivaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalSubGrupoParametroFormularioIva(subgrupoparametroformularioiva);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		subgrupoparametroformularioivaAux.setId(subgrupoparametroformularioiva.getId());
		subgrupoparametroformularioivaAux.setVersionRow(subgrupoparametroformularioiva.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessSubGrupoParametroFormularioIva();
		
			int intSelectedRow = this.jTableDatosSubGrupoParametroFormularioIva.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subgrupoparametroformularioiva =(SubGrupoParametroFormularioIva) this.subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvas().toArray()[this.jTableDatosSubGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.subgrupoparametroformularioiva =(SubGrupoParametroFormularioIva) this.subgrupoparametroformularioivas.toArray()[this.jTableDatosSubGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(SubGrupoParametroFormularioIvaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualSubGrupoParametroFormularioIva(this.subgrupoparametroformularioiva,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysSubGrupoParametroFormularioIva(this.subgrupoparametroformularioiva);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = subgrupoparametroformularioivaValidator.getInvalidValues(this.subgrupoparametroformularioiva);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			subgrupoparametroformularioivaLogic.setDatosCliente(datosCliente);
			subgrupoparametroformularioivaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				subgrupoparametroformularioivaAux=new  SubGrupoParametroFormularioIva();
				
				subgrupoparametroformularioivaAux.setIsNew(true);
				subgrupoparametroformularioivaAux.setIsChanged(true);
				
				subgrupoparametroformularioivaAux.setSubGrupoParametroFormularioIvaOriginal(this.subgrupoparametroformularioiva);
				
				subgrupoparametroformularioivaAux.setId(this.subgrupoparametroformularioiva.getId());	
				subgrupoparametroformularioivaAux.setid_empresa(this.subgrupoparametroformularioiva.getid_empresa());	
				subgrupoparametroformularioivaAux.setVersionRow(this.subgrupoparametroformularioiva.getVersionRow());	
				subgrupoparametroformularioivaAux.setnombre(this.subgrupoparametroformularioiva.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.subgrupoparametroformularioivaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.subgrupoparametroformularioivaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(subgrupoparametroformularioivaAux,subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(subgrupoparametroformularioivaAux,subgrupoparametroformularioivas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.subgrupoparametroformularioivaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.subgrupoparametroformularioivaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						subgrupoparametroformularioivaLogic.saveSubGrupoParametroFormularioIvas();//WithConnection
						//subgrupoparametroformularioivaLogic.getSetVersionRowSubGrupoParametroFormularioIvas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.subgrupoparametroformularioiva,subgrupoparametroformularioivaAux);
					
					this.refrescarForeignKeysDescripcionesSubGrupoParametroFormularioIva();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.subgrupoparametroformularioivaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				subgrupoparametroformularioivaAux=new  SubGrupoParametroFormularioIva();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.subgrupoparametroformularioivaSessionBean.getEsGuardarRelacionado() 
					|| (this.subgrupoparametroformularioivaSessionBean.getEsGuardarRelacionado() && this.subgrupoparametroformularioiva.getId()>=0)) {
						
					subgrupoparametroformularioivaAux.setIsNew(false);
				}
				
				subgrupoparametroformularioivaAux.setIsDeleted(false);
			
				subgrupoparametroformularioivaAux.setId(this.subgrupoparametroformularioiva.getId());	
				subgrupoparametroformularioivaAux.setid_empresa(this.subgrupoparametroformularioiva.getid_empresa());	
				subgrupoparametroformularioivaAux.setVersionRow(this.subgrupoparametroformularioiva.getVersionRow());	
				subgrupoparametroformularioivaAux.setnombre(this.subgrupoparametroformularioiva.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(subgrupoparametroformularioivaAux,subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(subgrupoparametroformularioivaAux,subgrupoparametroformularioivas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.subgrupoparametroformularioivaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.subgrupoparametroformularioivaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						subgrupoparametroformularioivaLogic.saveSubGrupoParametroFormularioIvas();//WithConnection
						//subgrupoparametroformularioivaLogic.getSetVersionRowSubGrupoParametroFormularioIvas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.subgrupoparametroformularioiva,subgrupoparametroformularioivaAux);
					
					this.refrescarForeignKeysDescripcionesSubGrupoParametroFormularioIva();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.subgrupoparametroformularioivaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				subgrupoparametroformularioivaAux=new  SubGrupoParametroFormularioIva();
				
				subgrupoparametroformularioivaAux.setIsNew(false);
				subgrupoparametroformularioivaAux.setIsChanged(false);
				
				subgrupoparametroformularioivaAux.setIsDeleted(true);
				
				subgrupoparametroformularioivaAux.setId(this.subgrupoparametroformularioiva.getId());	
				subgrupoparametroformularioivaAux.setid_empresa(this.subgrupoparametroformularioiva.getid_empresa());	
				subgrupoparametroformularioivaAux.setVersionRow(this.subgrupoparametroformularioiva.getVersionRow());	
				subgrupoparametroformularioivaAux.setnombre(this.subgrupoparametroformularioiva.getnombre());	
				
				if(this.subgrupoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.subgrupoparametroformularioivaAux.getId()>=0) {	
						this.subgrupoparametroformularioivasEliminados.add(subgrupoparametroformularioivaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(subgrupoparametroformularioivaAux,subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(subgrupoparametroformularioivaAux,subgrupoparametroformularioivas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.subgrupoparametroformularioivaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.subgrupoparametroformularioivaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						subgrupoparametroformularioivaLogic.saveSubGrupoParametroFormularioIvas();//WithConnection
						//subgrupoparametroformularioivaLogic.getSetVersionRowSubGrupoParametroFormularioIvas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.subgrupoparametroformularioivaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}  else {
							
						

							if(this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.quitarFilaTotales();}
							subgrupoparametroformularioivaAux.setParametroFormularioIvas(this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.parametroformularioivaLogic.getParametroFormularioIvas());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.subgrupoparametroformularioivaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.subgrupoparametroformularioivaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(subgrupoparametroformularioivaAux,subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(subgrupoparametroformularioivaAux,subgrupoparametroformularioivas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvas().addAll(this.subgrupoparametroformularioivasEliminados);
					
					subgrupoparametroformularioivaLogic.saveSubGrupoParametroFormularioIvas();//WithConnection
					//subgrupoparametroformularioivaLogic.getSetVersionRowSubGrupoParametroFormularioIvas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesSubGrupoParametroFormularioIva();
				
				this.subgrupoparametroformularioivasEliminados= new ArrayList<SubGrupoParametroFormularioIva>();		
			}
			
			if(this.subgrupoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.subgrupoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Sub Grupo Parametro Formulario Iva  GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Sub Grupo Parametro Formulario Iva ",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.subgrupoparametroformularioiva=subgrupoparametroformularioivaAux;
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
      		//this.finishProcessSubGrupoParametroFormularioIva();
      	}
		
	}	
	
	public void actualizarRelaciones(SubGrupoParametroFormularioIva subgrupoparametroformularioivaLocal) throws Exception {
		
		if(this.subgrupoparametroformularioivaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				subgrupoparametroformularioivaLocal.setParametroFormularioIvas(this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.parametroformularioivaLogic.getParametroFormularioIvas());
			
			} else {
			
				subgrupoparametroformularioivaLocal.setParametroFormularioIvas(this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.parametroformularioivas);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(SubGrupoParametroFormularioIva subgrupoparametroformularioivaLocal) throws Exception {	
		if(this.subgrupoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				subgrupoparametroformularioivaLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarSubGrupoParametroFormularioIvaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosSubGrupoParametroFormularioIva.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.subgrupoparametroformularioiva =(SubGrupoParametroFormularioIva) this.subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvas().toArray()[this.jTableDatosSubGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.subgrupoparametroformularioiva =(SubGrupoParametroFormularioIva) this.subgrupoparametroformularioivas.toArray()[this.jTableDatosSubGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = subgrupoparametroformularioivaValidator.getInvalidValues(this.subgrupoparametroformularioiva);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(SubGrupoParametroFormularioIva subgrupoparametroformularioiva,List<SubGrupoParametroFormularioIva> subgrupoparametroformularioivas) throws Exception {
		try	{		
			SubGrupoParametroFormularioIvaConstantesFunciones.actualizarLista(subgrupoparametroformularioiva,subgrupoparametroformularioivas,this.subgrupoparametroformularioivaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(SubGrupoParametroFormularioIva subgrupoparametroformularioiva,List<SubGrupoParametroFormularioIva> subgrupoparametroformularioivas) throws Exception {
		try	{			
			SubGrupoParametroFormularioIvaConstantesFunciones.actualizarSelectedLista(subgrupoparametroformularioiva,subgrupoparametroformularioivas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<SubGrupoParametroFormularioIva> subgrupoparametroformularioivasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				subgrupoparametroformularioivasLocal=this.subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				subgrupoparametroformularioivasLocal=this.subgrupoparametroformularioivas;
			}
			//ARCHITECTURE
		
			for(SubGrupoParametroFormularioIva subgrupoparametroformularioivaLocal:subgrupoparametroformularioivasLocal) {
				if(this.permiteMantenimiento(subgrupoparametroformularioivaLocal) && subgrupoparametroformularioivaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+SubGrupoParametroFormularioIvaConstantesFunciones.getSubGrupoParametroFormularioIvaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(SubGrupoParametroFormularioIvaConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jLabelid_empresaSubGrupoParametroFormularioIva,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SubGrupoParametroFormularioIvaConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jLabelnombreSubGrupoParametroFormularioIva,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jLabelid_empresaSubGrupoParametroFormularioIva,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jLabelnombreSubGrupoParametroFormularioIva,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("ParametroFormularioIva")) {
			if(this.subgrupoparametroformularioiva==null) {
				this.subgrupoparametroformularioiva= new SubGrupoParametroFormularioIva();
			}

			if(this.subgrupoparametroformularioivaSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoSubGrupoParametroFormularioIva
				this.setVariablesFormularioToObjetoActualSubGrupoParametroFormularioIva(this.subgrupoparametroformularioiva,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysSubGrupoParametroFormularioIva(this.subgrupoparametroformularioiva);

				this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.getparametroformularioiva().setSubGrupoParametroFormularioIva(this.subgrupoparametroformularioiva);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoSubGrupoParametroFormularioIva--;	
		
		
		this.subgrupoparametroformularioivaAux=new SubGrupoParametroFormularioIva();
		
		this.subgrupoparametroformularioivaAux.setId(this.iIdNuevoSubGrupoParametroFormularioIva);
		this.subgrupoparametroformularioivaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvas().add(this.subgrupoparametroformularioivaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.subgrupoparametroformularioivas.add(this.subgrupoparametroformularioivaAux);
		}
		//ARCHITECTURE
		
		this.subgrupoparametroformularioiva=this.subgrupoparametroformularioivaAux;
		
		if(SubGrupoParametroFormularioIvaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioSubGrupoParametroFormularioIva(this.subgrupoparametroformularioiva);
			this.setVariablesObjetoActualToFormularioForeignKeySubGrupoParametroFormularioIva(this.subgrupoparametroformularioiva);
		}
				
		//this.setDefaultControlesSubGrupoParametroFormularioIva();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeySubGrupoParametroFormularioIva();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeySubGrupoParametroFormularioIva();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeySubGrupoParametroFormularioIva();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualSubGrupoParametroFormularioIva(this.subgrupoparametroformularioivaBean,this.subgrupoparametroformularioiva,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysSubGrupoParametroFormularioIva(this.subgrupoparametroformularioiva);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.subgrupoparametroformularioivaSessionBean.getConGuardarRelaciones()) {
			classes=SubGrupoParametroFormularioIvaConstantesFunciones.getClassesRelationshipsOfSubGrupoParametroFormularioIva(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.subgrupoparametroformularioivaReturnGeneral=subgrupoparametroformularioivaLogic.procesarEventosSubGrupoParametroFormularioIvasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvas(),this.subgrupoparametroformularioiva,this.subgrupoparametroformularioivaParameterGeneral,this.isEsNuevoSubGrupoParametroFormularioIva,classes);//this.subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIva()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanSubGrupoParametroFormularioIva(this.subgrupoparametroformularioivaReturnGeneral,this.subgrupoparametroformularioivaBean,false);
		
		if(this.subgrupoparametroformularioivaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeySubGrupoParametroFormularioIva(this.subgrupoparametroformularioivaReturnGeneral.getSubGrupoParametroFormularioIva());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioSubGrupoParametroFormularioIva(this.subgrupoparametroformularioivaReturnGeneral.getSubGrupoParametroFormularioIva());
		}
		
		if(this.subgrupoparametroformularioivaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioSubGrupoParametroFormularioIva(this.subgrupoparametroformularioivaReturnGeneral.getSubGrupoParametroFormularioIva(),classes);//this.subgrupoparametroformularioivaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualSubGrupoParametroFormularioIva(this.subgrupoparametroformularioiva,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeySubGrupoParametroFormularioIva();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeySubGrupoParametroFormularioIva();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingSubGrupoParametroFormularioIva(false);
						
			if(subgrupoparametroformularioivaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.parametroformularioivaSessionBean.getEsGuardarRelacionado() && ParametroFormularioIvaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonParametroFormularioIvaActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(SubGrupoParametroFormularioIvaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualSubGrupoParametroFormularioIva();
			}
			
			this.actualizarVisualTableDatosSubGrupoParametroFormularioIva();
			
			this.jTableDatosSubGrupoParametroFormularioIva.setRowSelectionInterval(this.getIndiceNuevoSubGrupoParametroFormularioIva(), this.getIndiceNuevoSubGrupoParametroFormularioIva());
			
			this.seleccionarFilaTablaSubGrupoParametroFormularioIvaActual();
						
			this.actualizarEstadoCeldasBotonesSubGrupoParametroFormularioIva("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesSubGrupoParametroFormularioIva(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jTextAreanombreSubGrupoParametroFormularioIva.setEnabled(isHabilitar && this.subgrupoparametroformularioivaConstantesFunciones.activarnombreSubGrupoParametroFormularioIva);	
		//
		this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jComboBoxid_empresaSubGrupoParametroFormularioIva.setEnabled(isHabilitar && this.subgrupoparametroformularioivaConstantesFunciones.activarid_empresaSubGrupoParametroFormularioIva);
	};
	
	public void setDefaultControlesSubGrupoParametroFormularioIva() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoSubGrupoParametroFormularioIva(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.subgrupoparametroformularioivaSessionBean.setConGuardarRelaciones(true);			
			this.subgrupoparametroformularioivaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jTabbedPaneRelacionesSubGrupoParametroFormularioIva.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.parametroformularioivaSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.subgrupoparametroformularioivaSessionBean.setConGuardarRelaciones(false);			
			this.subgrupoparametroformularioivaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jTabbedPaneRelacionesSubGrupoParametroFormularioIva.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.parametroformularioivaSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoSubGrupoParametroFormularioIva() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(SubGrupoParametroFormularioIva subgrupoparametroformularioivaAux:this.subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvas()) {
				if(subgrupoparametroformularioivaAux.getId().equals(this.iIdNuevoSubGrupoParametroFormularioIva)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(SubGrupoParametroFormularioIva subgrupoparametroformularioivaAux:this.subgrupoparametroformularioivas) {
				if(subgrupoparametroformularioivaAux.getId().equals(this.iIdNuevoSubGrupoParametroFormularioIva)) {
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
	
	public int getIndiceActualSubGrupoParametroFormularioIva(SubGrupoParametroFormularioIva subgrupoparametroformularioiva,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(SubGrupoParametroFormularioIva subgrupoparametroformularioivaAux:this.subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvas()) {
				if(subgrupoparametroformularioivaAux.getId().equals(subgrupoparametroformularioiva.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(SubGrupoParametroFormularioIva subgrupoparametroformularioivaAux:this.subgrupoparametroformularioivas) {
				if(subgrupoparametroformularioivaAux.getId().equals(subgrupoparametroformularioiva.getId())) {
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
	
	public void setCamposBaseDesdeOriginalSubGrupoParametroFormularioIva(SubGrupoParametroFormularioIva subgrupoparametroformularioivaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(SubGrupoParametroFormularioIva subgrupoparametroformularioivaAux:this.subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvas()) {
				if(subgrupoparametroformularioivaAux.getSubGrupoParametroFormularioIvaOriginal().getId().equals(subgrupoparametroformularioivaOriginal.getId())) {
					existe=true;
					subgrupoparametroformularioivaOriginal.setId(subgrupoparametroformularioivaAux.getId());
					subgrupoparametroformularioivaOriginal.setVersionRow(subgrupoparametroformularioivaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(SubGrupoParametroFormularioIva subgrupoparametroformularioivaAux:this.subgrupoparametroformularioivas) {
				if(subgrupoparametroformularioivaAux.getSubGrupoParametroFormularioIvaOriginal().getId().equals(subgrupoparametroformularioivaOriginal.getId())) {
					existe=true;
					subgrupoparametroformularioivaOriginal.setId(subgrupoparametroformularioivaAux.getId());
					subgrupoparametroformularioivaOriginal.setVersionRow(subgrupoparametroformularioivaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosSubGrupoParametroFormularioIva(Boolean esParaCancelar) throws Exception {
		subgrupoparametroformularioivasAux=new ArrayList<SubGrupoParametroFormularioIva>();
		subgrupoparametroformularioivaAux=new SubGrupoParametroFormularioIva();
		
		if(!this.subgrupoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(SubGrupoParametroFormularioIva subgrupoparametroformularioivaAux:this.subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvas()) {
					if(subgrupoparametroformularioivaAux.getId()<0) {
						subgrupoparametroformularioivasAux.add(subgrupoparametroformularioivaAux);
					}		
				}
				this.iIdNuevoSubGrupoParametroFormularioIva=0L;
				this.subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvas().removeAll(subgrupoparametroformularioivasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(SubGrupoParametroFormularioIva subgrupoparametroformularioivaAux:this.subgrupoparametroformularioivas) {
					if(subgrupoparametroformularioivaAux.getId()<0) {
						subgrupoparametroformularioivasAux.add(subgrupoparametroformularioivaAux);
					}		
				}
				this.iIdNuevoSubGrupoParametroFormularioIva=0L;
				this.subgrupoparametroformularioivas.removeAll(subgrupoparametroformularioivasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoSubGrupoParametroFormularioIva 
					&& this.subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvas().size()>0
					) {
					subgrupoparametroformularioivaAux=this.subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvas().get(this.subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvas().size() - 1);
				
					if(subgrupoparametroformularioivaAux.getId()<0) {
						this.subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvas().remove(subgrupoparametroformularioivaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoSubGrupoParametroFormularioIva && this.subgrupoparametroformularioivas.size()>0) {
					subgrupoparametroformularioivaAux=this.subgrupoparametroformularioivas.get(this.subgrupoparametroformularioivas.size() - 1);
				
					if(subgrupoparametroformularioivaAux.getId()<0) {
						this.subgrupoparametroformularioivas.remove(subgrupoparametroformularioivaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoSubGrupoParametroFormularioIva(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(subgrupoparametroformularioiva.getId()<0) {
				this.subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvas().remove(this.subgrupoparametroformularioiva);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(subgrupoparametroformularioiva.getId()<0) {
				this.subgrupoparametroformularioivas.remove(this.subgrupoparametroformularioiva);
			}
		}			
	}
	
	public void setEstadosInicialesSubGrupoParametroFormularioIva(List<SubGrupoParametroFormularioIva> subgrupoparametroformularioivasAux) throws Exception {
		SubGrupoParametroFormularioIvaConstantesFunciones.setEstadosInicialesSubGrupoParametroFormularioIva(subgrupoparametroformularioivasAux);
	}
	
	public void setEstadosInicialesSubGrupoParametroFormularioIva(SubGrupoParametroFormularioIva subgrupoparametroformularioivaAux) throws Exception {
		SubGrupoParametroFormularioIvaConstantesFunciones.setEstadosInicialesSubGrupoParametroFormularioIva(subgrupoparametroformularioivaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarSubGrupoParametroFormularioIvaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesSubGrupoParametroFormularioIva("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarSubGrupoParametroFormularioIvaActual()) {
				if(!this.isEsNuevoSubGrupoParametroFormularioIva) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesSubGrupoParametroFormularioIva("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoSubGrupoParametroFormularioIva=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarSubGrupoParametroFormularioIvaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Sub Grupo Parametro Formulario Iva  ?", "MANTENIMIENTO DE Sub Grupo Parametro Formulario Iva ", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesSubGrupoParametroFormularioIva("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(SubGrupoParametroFormularioIva subgrupoparametroformularioiva) throws Exception {
		SubGrupoParametroFormularioIvaConstantesFunciones.seleccionarAsignar(this.subgrupoparametroformularioiva,subgrupoparametroformularioiva);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarSubGrupoParametroFormularioIva=this.isPermisoActualizarOriginalSubGrupoParametroFormularioIva;
			
			
			this.seleccionarAsignar(subgrupoparametroformularioiva);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			SubGrupoParametroFormularioIvaConstantesFunciones.quitarEspaciosSubGrupoParametroFormularioIva(this.subgrupoparametroformularioiva,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesSubGrupoParametroFormularioIva("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.subgrupoparametroformularioivaSessionBean.setsFuncionBusquedaRapida(this.subgrupoparametroformularioivaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoSubGrupoParametroFormularioIva) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosSubGrupoParametroFormularioIva(esParaCancelar);				
				this.cancelarNuevoSubGrupoParametroFormularioIva(esParaCancelar);								
			}
			
			this.subgrupoparametroformularioiva=new SubGrupoParametroFormularioIva();
			
			this.inicializarSubGrupoParametroFormularioIva();
			
			this.actualizarEstadoCeldasBotonesSubGrupoParametroFormularioIva("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarSubGrupoParametroFormularioIva() throws Exception {
		try {
			SubGrupoParametroFormularioIvaConstantesFunciones.inicializarSubGrupoParametroFormularioIva(this.subgrupoparametroformularioiva);
			
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
			FuncionesSwing.manageException(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteSubGrupoParametroFormularioIvas(String sAccionBusqueda,List<SubGrupoParametroFormularioIva> subgrupoparametroformularioivasParaReportes) throws Exception {
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
					sPathReporteFinal="SubGrupoParametroFormularioIva"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="SubGrupoParametroFormularioIvaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("SubGrupoParametroFormularioIvaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="SubGrupoParametroFormularioIva"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Sub Grupo Parametro Formulario Iva s");		
		parameters.put("busquedapor", SubGrupoParametroFormularioIvaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(ParametroFormularioIva.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					SubGrupoParametroFormularioIvaLogic subgrupoparametroformularioivaLogicAuxiliar=new SubGrupoParametroFormularioIvaLogic();
					subgrupoparametroformularioivaLogicAuxiliar.setDatosCliente(subgrupoparametroformularioivaLogic.getDatosCliente());				
					subgrupoparametroformularioivaLogicAuxiliar.setSubGrupoParametroFormularioIvas(subgrupoparametroformularioivasParaReportes);
					
					subgrupoparametroformularioivaLogicAuxiliar.cargarRelacionesLoteForeignKeySubGrupoParametroFormularioIvaWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					subgrupoparametroformularioivasParaReportes=subgrupoparametroformularioivaLogicAuxiliar.getSubGrupoParametroFormularioIvas();
					
					//subgrupoparametroformularioivaLogic.getNewConnexionToDeep();
					
					//for (SubGrupoParametroFormularioIva subgrupoparametroformularioiva:subgrupoparametroformularioivasParaReportes) {
					//	subgrupoparametroformularioivaLogic.deepLoad(subgrupoparametroformularioiva, false, DeepLoadType.INCLUDE, classes);
					//}						
					//subgrupoparametroformularioivaLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//subgrupoparametroformularioivaLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileParametroFormularioIva = AuxiliarReportes.class.getResourceAsStream("ParametroFormularioIvaDetalleRelacionesDesign.jasper");
			parameters.put("subreport_parametroformularioiva", reportFileParametroFormularioIva);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceSubGrupoParametroFormularioIva=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			SubGrupoParametroFormularioIvaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			SubGrupoParametroFormularioIvaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceSubGrupoParametroFormularioIva=new JRBeanArrayDataSource(SubGrupoParametroFormularioIvaJInternalFrame.TraerSubGrupoParametroFormularioIvaBeans(subgrupoparametroformularioivasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceSubGrupoParametroFormularioIva);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+SubGrupoParametroFormularioIvaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(SubGrupoParametroFormularioIvaBean.TraerSubGrupoParametroFormularioIvaBeans(subgrupoparametroformularioivasParaReportes).toArray()));
							
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
				this.generarExcelReporteSubGrupoParametroFormularioIvas(sAccionBusqueda,sTipoArchivoReporte,subgrupoparametroformularioivasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalSubGrupoParametroFormularioIvas(sAccionBusqueda,sTipoArchivoReporte,subgrupoparametroformularioivasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoSubGrupoParametroFormularioIvaActionPerformed(null);
					//this.generarExcelReporteSubGrupoParametroFormularioIvas(sAccionBusqueda,sTipoArchivoReporte,subgrupoparametroformularioivasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalSubGrupoParametroFormularioIvas(sAccionBusqueda,sTipoArchivoReporte,subgrupoparametroformularioivasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesSubGrupoParametroFormularioIvas(sAccionBusqueda,sTipoArchivoReporte,subgrupoparametroformularioivasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesSubGrupoParametroFormularioIvas(sAccionBusqueda,sTipoArchivoReporte,subgrupoparametroformularioivasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteSubGrupoParametroFormularioIvas(String sAccionBusqueda,String sTipoArchivoReporte,List<SubGrupoParametroFormularioIva> subgrupoparametroformularioivasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"subgrupoparametroformularioiva";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("SubGrupoParametroFormularioIvas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderSubGrupoParametroFormularioIva("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(SubGrupoParametroFormularioIva subgrupoparametroformularioiva : subgrupoparametroformularioivasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			SubGrupoParametroFormularioIvaConstantesFunciones.generarExcelReporteDataSubGrupoParametroFormularioIva("NORMAL",row,workbook,subgrupoparametroformularioiva,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.subgrupoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sub Grupo Parametro Formulario Iva ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderSubGrupoParametroFormularioIva(String sTipo,Row row,Workbook workbook) {
		
		SubGrupoParametroFormularioIvaConstantesFunciones.generarExcelReporteHeaderSubGrupoParametroFormularioIva(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalSubGrupoParametroFormularioIvas(String sAccionBusqueda,String sTipoArchivoReporte,List<SubGrupoParametroFormularioIva> subgrupoparametroformularioivasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"subgrupoparametroformularioiva_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("SubGrupoParametroFormularioIvas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(SubGrupoParametroFormularioIva subgrupoparametroformularioiva : subgrupoparametroformularioivasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(SubGrupoParametroFormularioIvaConstantesFunciones.getSubGrupoParametroFormularioIvaDescripcion(subgrupoparametroformularioiva));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SubGrupoParametroFormularioIvaConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SubGrupoParametroFormularioIvaConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(subgrupoparametroformularioiva.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SubGrupoParametroFormularioIvaConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SubGrupoParametroFormularioIvaConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(subgrupoparametroformularioiva.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.subgrupoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sub Grupo Parametro Formulario Iva ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesSubGrupoParametroFormularioIvas(String sAccionBusqueda,String sTipoArchivoReporte,List<SubGrupoParametroFormularioIva> subgrupoparametroformularioivasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<SubGrupoParametroFormularioIva> subgrupoparametroformularioivasRespaldo=null;
		
		classes=SubGrupoParametroFormularioIvaConstantesFunciones.getClassesRelationshipsOfSubGrupoParametroFormularioIva(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.subgrupoparametroformularioivaLogic.setDatosCliente(this.datosCliente);
		this.subgrupoparametroformularioivaLogic.setDatosDeep(this.datosDeep);
		this.subgrupoparametroformularioivaLogic.setIsConDeep(true);
		
		subgrupoparametroformularioivasRespaldo=this.subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvas();
		
		this.subgrupoparametroformularioivaLogic.setSubGrupoParametroFormularioIvas(subgrupoparametroformularioivasParaReportes);	
		this.subgrupoparametroformularioivaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		subgrupoparametroformularioivasParaReportes=this.subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvas();
		this.subgrupoparametroformularioivaLogic.setSubGrupoParametroFormularioIvas(subgrupoparametroformularioivasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"subgrupoparametroformularioiva_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("SubGrupoParametroFormularioIvas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderSubGrupoParametroFormularioIva("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(SubGrupoParametroFormularioIva subgrupoparametroformularioiva : subgrupoparametroformularioivasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderSubGrupoParametroFormularioIva("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			SubGrupoParametroFormularioIvaConstantesFunciones.generarExcelReporteDataSubGrupoParametroFormularioIva("NORMAL",row,workbook,subgrupoparametroformularioiva,cellStyleDataAux);
		
			
			


				//ParametroFormularioIva
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO))) {

				if(subgrupoparametroformularioiva.getParametroFormularioIvas()!=null && subgrupoparametroformularioiva.getParametroFormularioIvas().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ParametroFormularioIvaConstantesFunciones.generarExcelReporteHeaderParametroFormularioIva("RELACIONADO",row,workbook);
				}

				if(subgrupoparametroformularioiva.getParametroFormularioIvas()!=null) {
					i2=0;
					for(ParametroFormularioIva parametroformularioiva : subgrupoparametroformularioiva.getParametroFormularioIvas()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						ParametroFormularioIvaConstantesFunciones.generarExcelReporteDataParametroFormularioIva("RELACIONADO",row,workbook,parametroformularioiva,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(SubGrupoParametroFormularioIvaConstantesFunciones.getSubGrupoParametroFormularioIvaDescripcion(subgrupoparametroformularioiva));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.subgrupoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sub Grupo Parametro Formulario Iva ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoSubGrupoParametroFormularioIva.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSubGrupoParametroFormularioIva.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoSubGrupoParametroFormularioIva.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSubGrupoParametroFormularioIva.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessSubGrupoParametroFormularioIva() throws Exception {		
		this.startProcessSubGrupoParametroFormularioIva(true);
	}
	
	public void startProcessSubGrupoParametroFormularioIva(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasSubGrupoParametroFormularioIva ,this.jPanelParametrosReportesSubGrupoParametroFormularioIva, this.jScrollPanelDatosSubGrupoParametroFormularioIva,this.jPanelPaginacionSubGrupoParametroFormularioIva, this.jScrollPanelDatosEdicionSubGrupoParametroFormularioIva, this.jPanelAccionesSubGrupoParametroFormularioIva,this.jPanelAccionesFormularioSubGrupoParametroFormularioIva,this.jmenuBarSubGrupoParametroFormularioIva,this.jmenuBarDetalleSubGrupoParametroFormularioIva,this.jTtoolBarSubGrupoParametroFormularioIva,this.jTtoolBarDetalleSubGrupoParametroFormularioIva);		
		
		final JTabbedPane jTabbedPaneBusquedasSubGrupoParametroFormularioIva=this.jTabbedPaneBusquedasSubGrupoParametroFormularioIva; 
		
		final JPanel jPanelParametrosReportesSubGrupoParametroFormularioIva=this.jPanelParametrosReportesSubGrupoParametroFormularioIva;
		//final JScrollPane jScrollPanelDatosSubGrupoParametroFormularioIva=this.jScrollPanelDatosSubGrupoParametroFormularioIva;
		final JTable jTableDatosSubGrupoParametroFormularioIva=this.jTableDatosSubGrupoParametroFormularioIva;		
		final JPanel jPanelPaginacionSubGrupoParametroFormularioIva=this.jPanelPaginacionSubGrupoParametroFormularioIva;
		//final JScrollPane jScrollPanelDatosEdicionSubGrupoParametroFormularioIva=this.jScrollPanelDatosEdicionSubGrupoParametroFormularioIva;
		final JPanel jPanelAccionesSubGrupoParametroFormularioIva=this.jPanelAccionesSubGrupoParametroFormularioIva;
		
		JPanel jPanelCamposAuxiliarSubGrupoParametroFormularioIva=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarSubGrupoParametroFormularioIva=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva!=null) {
			jPanelCamposAuxiliarSubGrupoParametroFormularioIva=this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jPanelCamposSubGrupoParametroFormularioIva;
			jPanelAccionesFormularioAuxiliarSubGrupoParametroFormularioIva=this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jPanelAccionesFormularioSubGrupoParametroFormularioIva;
		}
		
		final JPanel jPanelCamposSubGrupoParametroFormularioIva=jPanelCamposAuxiliarSubGrupoParametroFormularioIva;
		final JPanel jPanelAccionesFormularioSubGrupoParametroFormularioIva=jPanelAccionesFormularioAuxiliarSubGrupoParametroFormularioIva;
		
		
		final JMenuBar jmenuBarSubGrupoParametroFormularioIva=this.jmenuBarSubGrupoParametroFormularioIva;
		final JToolBar jTtoolBarSubGrupoParametroFormularioIva=this.jTtoolBarSubGrupoParametroFormularioIva;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarSubGrupoParametroFormularioIva=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarSubGrupoParametroFormularioIva=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva!=null) {
			jmenuBarDetalleAuxiliarSubGrupoParametroFormularioIva=this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jmenuBarDetalleSubGrupoParametroFormularioIva;
			jTtoolBarDetalleAuxiliarSubGrupoParametroFormularioIva=this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jTtoolBarDetalleSubGrupoParametroFormularioIva;
		}
		
		final JMenuBar jmenuBarDetalleSubGrupoParametroFormularioIva=jmenuBarDetalleAuxiliarSubGrupoParametroFormularioIva;
		final JToolBar jTtoolBarDetalleSubGrupoParametroFormularioIva=jTtoolBarDetalleAuxiliarSubGrupoParametroFormularioIva;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasSubGrupoParametroFormularioIva;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesSubGrupoParametroFormularioIva;
			processRunnable.jTableDatos=jTableDatosSubGrupoParametroFormularioIva;
			processRunnable.jPanelCampos=jPanelCamposSubGrupoParametroFormularioIva;
			processRunnable.jPanelPaginacion=jPanelPaginacionSubGrupoParametroFormularioIva;
			processRunnable.jPanelAcciones=jPanelAccionesSubGrupoParametroFormularioIva;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioSubGrupoParametroFormularioIva;
			
			
			processRunnable.jmenuBar=jmenuBarSubGrupoParametroFormularioIva;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleSubGrupoParametroFormularioIva;
			processRunnable.jTtoolBar=jTtoolBarSubGrupoParametroFormularioIva;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleSubGrupoParametroFormularioIva;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasSubGrupoParametroFormularioIva ,jPanelParametrosReportesSubGrupoParametroFormularioIva,jTableDatosSubGrupoParametroFormularioIva, /*jScrollPanelDatosSubGrupoParametroFormularioIva,*/jPanelCamposSubGrupoParametroFormularioIva,jPanelPaginacionSubGrupoParametroFormularioIva, /*jScrollPanelDatosEdicionSubGrupoParametroFormularioIva,*/ jPanelAccionesSubGrupoParametroFormularioIva,jPanelAccionesFormularioSubGrupoParametroFormularioIva,jmenuBarSubGrupoParametroFormularioIva,jmenuBarDetalleSubGrupoParametroFormularioIva,jTtoolBarSubGrupoParametroFormularioIva,jTtoolBarDetalleSubGrupoParametroFormularioIva);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasSubGrupoParametroFormularioIva ,jPanelParametrosReportesSubGrupoParametroFormularioIva, jScrollPanelDatosSubGrupoParametroFormularioIva,jPanelPaginacionSubGrupoParametroFormularioIva, jScrollPanelDatosEdicionSubGrupoParametroFormularioIva, jPanelAccionesSubGrupoParametroFormularioIva,jPanelAccionesFormularioSubGrupoParametroFormularioIva,jmenuBarSubGrupoParametroFormularioIva,jmenuBarDetalleSubGrupoParametroFormularioIva,jTtoolBarSubGrupoParametroFormularioIva,jTtoolBarDetalleSubGrupoParametroFormularioIva);
						
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
	
	public void finishProcessSubGrupoParametroFormularioIva() {// throws Exception 
		this.finishProcessSubGrupoParametroFormularioIva(true);
	}
	
	public void finishProcessSubGrupoParametroFormularioIva(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasSubGrupoParametroFormularioIva ,this.jPanelParametrosReportesSubGrupoParametroFormularioIva, this.jScrollPanelDatosSubGrupoParametroFormularioIva,this.jPanelPaginacionSubGrupoParametroFormularioIva, this.jScrollPanelDatosEdicionSubGrupoParametroFormularioIva, this.jPanelAccionesSubGrupoParametroFormularioIva,this.jPanelAccionesFormularioSubGrupoParametroFormularioIva,this.jmenuBarSubGrupoParametroFormularioIva,this.jmenuBarDetalleSubGrupoParametroFormularioIva,this.jTtoolBarSubGrupoParametroFormularioIva,this.jTtoolBarDetalleSubGrupoParametroFormularioIva);		
		
		final JTabbedPane jTabbedPaneBusquedasSubGrupoParametroFormularioIva=this.jTabbedPaneBusquedasSubGrupoParametroFormularioIva; 
		
		final JPanel jPanelParametrosReportesSubGrupoParametroFormularioIva=this.jPanelParametrosReportesSubGrupoParametroFormularioIva;
		//final JScrollPane jScrollPanelDatosSubGrupoParametroFormularioIva=this.jScrollPanelDatosSubGrupoParametroFormularioIva;
		final JTable jTableDatosSubGrupoParametroFormularioIva=this.jTableDatosSubGrupoParametroFormularioIva;		
		final JPanel jPanelPaginacionSubGrupoParametroFormularioIva=this.jPanelPaginacionSubGrupoParametroFormularioIva;
		//final JScrollPane jScrollPanelDatosEdicionSubGrupoParametroFormularioIva=this.jScrollPanelDatosEdicionSubGrupoParametroFormularioIva;
		final JPanel jPanelAccionesSubGrupoParametroFormularioIva=this.jPanelAccionesSubGrupoParametroFormularioIva;
		
		JPanel jPanelCamposAuxiliarSubGrupoParametroFormularioIva=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarSubGrupoParametroFormularioIva=new JPanel();
		
		if(this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva!=null) {
			jPanelCamposAuxiliarSubGrupoParametroFormularioIva=this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jPanelCamposSubGrupoParametroFormularioIva;
			jPanelAccionesFormularioAuxiliarSubGrupoParametroFormularioIva=this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jPanelAccionesFormularioSubGrupoParametroFormularioIva;
		}
		
		final JPanel jPanelCamposSubGrupoParametroFormularioIva=jPanelCamposAuxiliarSubGrupoParametroFormularioIva;
		final JPanel jPanelAccionesFormularioSubGrupoParametroFormularioIva=jPanelAccionesFormularioAuxiliarSubGrupoParametroFormularioIva;
		
		
		final JMenuBar jmenuBarSubGrupoParametroFormularioIva=this.jmenuBarSubGrupoParametroFormularioIva;		
		final JToolBar jTtoolBarSubGrupoParametroFormularioIva=this.jTtoolBarSubGrupoParametroFormularioIva;
				
		JMenuBar jmenuBarDetalleAuxiliarSubGrupoParametroFormularioIva=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarSubGrupoParametroFormularioIva=new JToolBar();
		
		if(this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva!=null) {
			jmenuBarDetalleAuxiliarSubGrupoParametroFormularioIva=this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jmenuBarDetalleSubGrupoParametroFormularioIva;
			jTtoolBarDetalleAuxiliarSubGrupoParametroFormularioIva=this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jTtoolBarDetalleSubGrupoParametroFormularioIva;		
		}
		
		final JMenuBar jmenuBarDetalleSubGrupoParametroFormularioIva=jmenuBarDetalleAuxiliarSubGrupoParametroFormularioIva;
		final JToolBar jTtoolBarDetalleSubGrupoParametroFormularioIva=jTtoolBarDetalleAuxiliarSubGrupoParametroFormularioIva;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasSubGrupoParametroFormularioIva;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesSubGrupoParametroFormularioIva;
			processRunnable.jTableDatos=jTableDatosSubGrupoParametroFormularioIva;
			processRunnable.jPanelCampos=jPanelCamposSubGrupoParametroFormularioIva;
			processRunnable.jPanelPaginacion=jPanelPaginacionSubGrupoParametroFormularioIva;
			processRunnable.jPanelAcciones=jPanelAccionesSubGrupoParametroFormularioIva;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioSubGrupoParametroFormularioIva;
			
			
			processRunnable.jmenuBar=jmenuBarSubGrupoParametroFormularioIva;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleSubGrupoParametroFormularioIva;
			processRunnable.jTtoolBar=jTtoolBarSubGrupoParametroFormularioIva;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleSubGrupoParametroFormularioIva;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasSubGrupoParametroFormularioIva ,jPanelParametrosReportesSubGrupoParametroFormularioIva, jTableDatosSubGrupoParametroFormularioIva,/*jScrollPanelDatosSubGrupoParametroFormularioIva,*/jPanelCamposSubGrupoParametroFormularioIva,jPanelPaginacionSubGrupoParametroFormularioIva, /*jScrollPanelDatosEdicionSubGrupoParametroFormularioIva,*/ jPanelAccionesSubGrupoParametroFormularioIva,jPanelAccionesFormularioSubGrupoParametroFormularioIva,jmenuBarSubGrupoParametroFormularioIva,jmenuBarDetalleSubGrupoParametroFormularioIva,jTtoolBarSubGrupoParametroFormularioIva,jTtoolBarDetalleSubGrupoParametroFormularioIva));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesSubGrupoParametroFormularioIva(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarSubGrupoParametroFormularioIva(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuSubGrupoParametroFormularioIva(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarSubGrupoParametroFormularioIva(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarSubGrupoParametroFormularioIva,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleSubGrupoParametroFormularioIva,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuSubGrupoParametroFormularioIva(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarSubGrupoParametroFormularioIva,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleSubGrupoParametroFormularioIva,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.subgrupoparametroformularioivaConstantesFunciones.getsFinalQuerySubGrupoParametroFormularioIva();
		String  finalQueryPaginacionTodos=this.subgrupoparametroformularioivaConstantesFunciones.getsFinalQuerySubGrupoParametroFormularioIva();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=SubGrupoParametroFormularioIvaConstantesFunciones.getArrayColumnasGlobalesNoSubGrupoParametroFormularioIva(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=SubGrupoParametroFormularioIvaConstantesFunciones.getArrayColumnasGlobalesSubGrupoParametroFormularioIva(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,SubGrupoParametroFormularioIvaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.subgrupoparametroformularioivasEliminados= new ArrayList<SubGrupoParametroFormularioIva>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessSubGrupoParametroFormularioIva();
		
				///*SubGrupoParametroFormularioIvaSessionBean*/this.subgrupoparametroformularioivaSessionBean=new SubGrupoParametroFormularioIvaSessionBean();
			
			if(this.subgrupoparametroformularioivaSessionBean==null) {
				this.subgrupoparametroformularioivaSessionBean=new SubGrupoParametroFormularioIvaSessionBean();
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
					this.iNumeroPaginacion=SubGrupoParametroFormularioIvaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=SubGrupoParametroFormularioIvaConstantesFunciones.getClassesForeignKeysOfSubGrupoParametroFormularioIva(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/subgrupoparametroformularioiva."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			subgrupoparametroformularioivasAux= new ArrayList<SubGrupoParametroFormularioIva>();
			
				
			subgrupoparametroformularioivaLogic.setDatosCliente(this.datosCliente);
			subgrupoparametroformularioivaLogic.setDatosDeep(this.datosDeep);
			subgrupoparametroformularioivaLogic.setIsConDeep(true);
			
			
			subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					subgrupoparametroformularioivaLogic.getTodosSubGrupoParametroFormularioIvas(finalQueryGlobal,pagination);
					
					//subgrupoparametroformularioivaLogic.getTodosSubGrupoParametroFormularioIvasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvas()==null|| subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							subgrupoparametroformularioivasAux= new ArrayList<SubGrupoParametroFormularioIva>();
							subgrupoparametroformularioivasAux.addAll(subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							subgrupoparametroformularioivasAux= new ArrayList<SubGrupoParametroFormularioIva>();
							subgrupoparametroformularioivasAux.addAll(subgrupoparametroformularioivas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							subgrupoparametroformularioivaLogic.getTodosSubGrupoParametroFormularioIvas(finalQueryGlobal+"",this.pagination);												
							
							//subgrupoparametroformularioivaLogic.getTodosSubGrupoParametroFormularioIvasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteSubGrupoParametroFormularioIvas("Todos",subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							subgrupoparametroformularioivaLogic.setSubGrupoParametroFormularioIvas(new ArrayList<SubGrupoParametroFormularioIva>());					
							subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvas().addAll(subgrupoparametroformularioivasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							subgrupoparametroformularioivas=new ArrayList<SubGrupoParametroFormularioIva>();
							subgrupoparametroformularioivas.addAll(subgrupoparametroformularioivasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idSubGrupoParametroFormularioIva=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idSubGrupoParametroFormularioIva=this.idActual;
				
				} else if(this.idSubGrupoParametroFormularioIvaActual!=null && this.idSubGrupoParametroFormularioIvaActual!=0L) {
					idSubGrupoParametroFormularioIva=idSubGrupoParametroFormularioIvaActual;
				}
				
					
				this.sDetalleReporte=SubGrupoParametroFormularioIvaConstantesFunciones.getDetalleIndicePorId(idSubGrupoParametroFormularioIva);
				
				this.subgrupoparametroformularioivas=new ArrayList<SubGrupoParametroFormularioIva>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					subgrupoparametroformularioivaLogic.getEntity(idSubGrupoParametroFormularioIva);
					
					//subgrupoparametroformularioivaLogic.getEntityWithConnection(idSubGrupoParametroFormularioIva);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					subgrupoparametroformularioivaLogic.setSubGrupoParametroFormularioIvas(new ArrayList<SubGrupoParametroFormularioIva>());
					subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvas().add(subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIva());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.subgrupoparametroformularioivas=new ArrayList<SubGrupoParametroFormularioIva>();
					this.subgrupoparametroformularioivas.add(subgrupoparametroformularioiva);
				}
				
				if(subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIva()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorId")) {
				this.sDetalleReporte=SubGrupoParametroFormularioIvaConstantesFunciones.getDetalleIndiceBusquedaPorId(idBusquedaPorId);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvasBusquedaPorId(finalQueryGlobal,pagination,idBusquedaPorId);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SubGrupoParametroFormularioIvaConstantesFunciones.getDetalleIndiceBusquedaPorId(idBusquedaPorId);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SubGrupoParametroFormularioIvaConstantesFunciones.getDetalleIndiceBusquedaPorId(idBusquedaPorId);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvas()==null||subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=subgrupoparametroformularioivas==null|| subgrupoparametroformularioivas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						subgrupoparametroformularioivasAux=new ArrayList<SubGrupoParametroFormularioIva>();
						subgrupoparametroformularioivasAux.addAll(subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							subgrupoparametroformularioivasAux=new ArrayList<SubGrupoParametroFormularioIva>();
							subgrupoparametroformularioivasAux.addAll(subgrupoparametroformularioivas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvasBusquedaPorId(finalQueryGlobal,pagination,idBusquedaPorId);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SubGrupoParametroFormularioIvaConstantesFunciones.getDetalleIndiceBusquedaPorId(idBusquedaPorId);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SubGrupoParametroFormularioIvaConstantesFunciones.getDetalleIndiceBusquedaPorId(idBusquedaPorId);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteSubGrupoParametroFormularioIvas("BusquedaPorId",subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteSubGrupoParametroFormularioIvas("BusquedaPorId",subgrupoparametroformularioivas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						subgrupoparametroformularioivaLogic.setSubGrupoParametroFormularioIvas(new ArrayList<SubGrupoParametroFormularioIva>());
						subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvas().addAll(subgrupoparametroformularioivasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							subgrupoparametroformularioivas=new ArrayList<SubGrupoParametroFormularioIva>();
							subgrupoparametroformularioivas.addAll(subgrupoparametroformularioivasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=SubGrupoParametroFormularioIvaConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvasBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SubGrupoParametroFormularioIvaConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SubGrupoParametroFormularioIvaConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvas()==null||subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=subgrupoparametroformularioivas==null|| subgrupoparametroformularioivas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						subgrupoparametroformularioivasAux=new ArrayList<SubGrupoParametroFormularioIva>();
						subgrupoparametroformularioivasAux.addAll(subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							subgrupoparametroformularioivasAux=new ArrayList<SubGrupoParametroFormularioIva>();
							subgrupoparametroformularioivasAux.addAll(subgrupoparametroformularioivas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvasBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SubGrupoParametroFormularioIvaConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SubGrupoParametroFormularioIvaConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteSubGrupoParametroFormularioIvas("BusquedaPorNombre",subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteSubGrupoParametroFormularioIvas("BusquedaPorNombre",subgrupoparametroformularioivas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						subgrupoparametroformularioivaLogic.setSubGrupoParametroFormularioIvas(new ArrayList<SubGrupoParametroFormularioIva>());
						subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvas().addAll(subgrupoparametroformularioivasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							subgrupoparametroformularioivas=new ArrayList<SubGrupoParametroFormularioIva>();
							subgrupoparametroformularioivas.addAll(subgrupoparametroformularioivasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=SubGrupoParametroFormularioIvaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SubGrupoParametroFormularioIvaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SubGrupoParametroFormularioIvaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvas()==null||subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=subgrupoparametroformularioivas==null|| subgrupoparametroformularioivas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						subgrupoparametroformularioivasAux=new ArrayList<SubGrupoParametroFormularioIva>();
						subgrupoparametroformularioivasAux.addAll(subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							subgrupoparametroformularioivasAux=new ArrayList<SubGrupoParametroFormularioIva>();
							subgrupoparametroformularioivasAux.addAll(subgrupoparametroformularioivas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SubGrupoParametroFormularioIvaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SubGrupoParametroFormularioIvaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteSubGrupoParametroFormularioIvas("FK_IdEmpresa",subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteSubGrupoParametroFormularioIvas("FK_IdEmpresa",subgrupoparametroformularioivas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						subgrupoparametroformularioivaLogic.setSubGrupoParametroFormularioIvas(new ArrayList<SubGrupoParametroFormularioIva>());
						subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvas().addAll(subgrupoparametroformularioivasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							subgrupoparametroformularioivas=new ArrayList<SubGrupoParametroFormularioIva>();
							subgrupoparametroformularioivas.addAll(subgrupoparametroformularioivasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesSubGrupoParametroFormularioIva();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessSubGrupoParametroFormularioIva();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=subgrupoparametroformularioivas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=subgrupoparametroformularioivas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(SubGrupoParametroFormularioIva subgrupoparametroformularioiva) {
		Boolean permite=true;
		
		if(this.subgrupoparametroformularioiva.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=SubGrupoParametroFormularioIvaConstantesFunciones.getOrderByListaSubGrupoParametroFormularioIva();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=SubGrupoParametroFormularioIvaConstantesFunciones.getOrderByListaSubGrupoParametroFormularioIva();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(SubGrupoParametroFormularioIva subgrupoparametroformularioiva:subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvas()) {
				if(subgrupoparametroformularioiva.getsType().equals(Constantes2.S_TOTALES)) {
					subgrupoparametroformularioivaTotales=subgrupoparametroformularioiva;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(SubGrupoParametroFormularioIva subgrupoparametroformularioiva:this.subgrupoparametroformularioivas) {
				if(subgrupoparametroformularioiva.getsType().equals(Constantes2.S_TOTALES)) {
					subgrupoparametroformularioivaTotales=subgrupoparametroformularioiva;
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
			this.subgrupoparametroformularioivaAux=new SubGrupoParametroFormularioIva();
			this.subgrupoparametroformularioivaAux.setsType(Constantes2.S_TOTALES);
			this.subgrupoparametroformularioivaAux.setIsNew(false);
			this.subgrupoparametroformularioivaAux.setIsChanged(false);
			this.subgrupoparametroformularioivaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				SubGrupoParametroFormularioIvaConstantesFunciones.TotalizarValoresFilaSubGrupoParametroFormularioIva(this.subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvas(),this.subgrupoparametroformularioivaAux);
				
				this.subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvas().add(this.subgrupoparametroformularioivaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				SubGrupoParametroFormularioIvaConstantesFunciones.TotalizarValoresFilaSubGrupoParametroFormularioIva(this.subgrupoparametroformularioivas,this.subgrupoparametroformularioivaAux);
				
				this.subgrupoparametroformularioivas.add(this.subgrupoparametroformularioivaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		subgrupoparametroformularioivaTotales=new SubGrupoParametroFormularioIva();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvas().remove(subgrupoparametroformularioivaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.subgrupoparametroformularioivas.remove(subgrupoparametroformularioivaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		subgrupoparametroformularioivaTotales=new SubGrupoParametroFormularioIva();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(SubGrupoParametroFormularioIva subgrupoparametroformularioiva:subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvas()) {
				if(subgrupoparametroformularioiva.getsType().equals(Constantes2.S_TOTALES)) {
					subgrupoparametroformularioivaTotales=subgrupoparametroformularioiva;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				SubGrupoParametroFormularioIvaConstantesFunciones.TotalizarValoresFilaSubGrupoParametroFormularioIva(this.subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvas(),subgrupoparametroformularioivaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(SubGrupoParametroFormularioIva subgrupoparametroformularioiva:this.subgrupoparametroformularioivas) {
				if(subgrupoparametroformularioiva.getsType().equals(Constantes2.S_TOTALES)) {
					subgrupoparametroformularioivaTotales=subgrupoparametroformularioiva;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				SubGrupoParametroFormularioIvaConstantesFunciones.TotalizarValoresFilaSubGrupoParametroFormularioIva(this.subgrupoparametroformularioivas,subgrupoparametroformularioivaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getSubGrupoParametroFormularioIvasBusquedaPorId()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorId";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getSubGrupoParametroFormularioIvasBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getSubGrupoParametroFormularioIvasFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getSubGrupoParametroFormularioIvasBusquedaPorId(String sFinalQuery,Long id)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvasBusquedaPorId(sFinalQuery,this.pagination,id);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getSubGrupoParametroFormularioIvasBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvasBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getSubGrupoParametroFormularioIvasFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvasFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosSubGrupoParametroFormularioIva() {
		this.isPermisoTodoSubGrupoParametroFormularioIva=false;
		this.isPermisoNuevoSubGrupoParametroFormularioIva=false;
		this.isPermisoActualizarSubGrupoParametroFormularioIva=false;
		this.isPermisoActualizarOriginalSubGrupoParametroFormularioIva=false;
		this.isPermisoEliminarSubGrupoParametroFormularioIva=false;
		this.isPermisoGuardarCambiosSubGrupoParametroFormularioIva=false;
		this.isPermisoConsultaSubGrupoParametroFormularioIva=false;
		this.isPermisoBusquedaSubGrupoParametroFormularioIva=false;
		this.isPermisoReporteSubGrupoParametroFormularioIva=false;		
		this.isPermisoOrdenSubGrupoParametroFormularioIva=false;		
		this.isPermisoPaginacionMedioSubGrupoParametroFormularioIva=false;		
		this.isPermisoPaginacionAltoSubGrupoParametroFormularioIva=false;
		this.isPermisoPaginacionTodoSubGrupoParametroFormularioIva=false;
		this.isPermisoCopiarSubGrupoParametroFormularioIva=false;		
		this.isPermisoVerFormSubGrupoParametroFormularioIva=false;		
		this.isPermisoDuplicarSubGrupoParametroFormularioIva=false;		
		this.isPermisoOrdenSubGrupoParametroFormularioIva=false;		
	}
	
	public void setPermisosUsuarioSubGrupoParametroFormularioIva(Boolean isPermiso) {
		this.isPermisoTodoSubGrupoParametroFormularioIva=isPermiso;
		this.isPermisoNuevoSubGrupoParametroFormularioIva=isPermiso;
		this.isPermisoActualizarSubGrupoParametroFormularioIva=isPermiso;
		this.isPermisoActualizarOriginalSubGrupoParametroFormularioIva=isPermiso;
		this.isPermisoEliminarSubGrupoParametroFormularioIva=isPermiso;
		this.isPermisoGuardarCambiosSubGrupoParametroFormularioIva=isPermiso;
		this.isPermisoConsultaSubGrupoParametroFormularioIva=isPermiso;
		this.isPermisoBusquedaSubGrupoParametroFormularioIva=isPermiso;
		this.isPermisoReporteSubGrupoParametroFormularioIva=isPermiso;
		this.isPermisoOrdenSubGrupoParametroFormularioIva=isPermiso;		
		this.isPermisoPaginacionMedioSubGrupoParametroFormularioIva=isPermiso;		
		this.isPermisoPaginacionAltoSubGrupoParametroFormularioIva=isPermiso;		
		this.isPermisoPaginacionTodoSubGrupoParametroFormularioIva=isPermiso;		
		this.isPermisoCopiarSubGrupoParametroFormularioIva=isPermiso;		
		this.isPermisoVerFormSubGrupoParametroFormularioIva=isPermiso;		
		this.isPermisoDuplicarSubGrupoParametroFormularioIva=isPermiso;
		this.isPermisoOrdenSubGrupoParametroFormularioIva=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioSubGrupoParametroFormularioIva(Boolean isPermiso) {
		//this.isPermisoTodoSubGrupoParametroFormularioIva=isPermiso;
		this.isPermisoNuevoSubGrupoParametroFormularioIva=isPermiso;
		this.isPermisoActualizarSubGrupoParametroFormularioIva=isPermiso;
		this.isPermisoActualizarOriginalSubGrupoParametroFormularioIva=isPermiso;
		this.isPermisoEliminarSubGrupoParametroFormularioIva=isPermiso;
		this.isPermisoGuardarCambiosSubGrupoParametroFormularioIva=isPermiso;
		//this.isPermisoConsultaSubGrupoParametroFormularioIva=isPermiso;
		//this.isPermisoBusquedaSubGrupoParametroFormularioIva=isPermiso;
		//this.isPermisoReporteSubGrupoParametroFormularioIva=isPermiso;
		//this.isPermisoOrdenSubGrupoParametroFormularioIva=isPermiso;		
		//this.isPermisoPaginacionMedioSubGrupoParametroFormularioIva=isPermiso;		
		//this.isPermisoPaginacionAltoSubGrupoParametroFormularioIva=isPermiso;		
		//this.isPermisoPaginacionTodoSubGrupoParametroFormularioIva=isPermiso;		
		//this.isPermisoCopiarSubGrupoParametroFormularioIva=isPermiso;		
		//this.isPermisoDuplicarSubGrupoParametroFormularioIva=isPermiso;
		//this.isPermisoOrdenSubGrupoParametroFormularioIva=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioSubGrupoParametroFormularioIvaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(ParametroFormularioIvaConstantesFunciones.SNOMBREOPCION);
		
		if(SubGrupoParametroFormularioIvaJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosParametroFormularioIva=false;
		this.isTienePermisosParametroFormularioIva=this.verificarGetPermisosUsuarioOpcionSubGrupoParametroFormularioIvaClaseRelacionada(this.opcionsRelacionadas,ParametroFormularioIvaConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebSubGrupoParametroFormularioIva(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioSubGrupoParametroFormularioIvaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosParametroFormularioIva=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioSubGrupoParametroFormularioIvaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionSubGrupoParametroFormularioIvaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioSubGrupoParametroFormularioIvaClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosParametroFormularioIva && this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva!=null && this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jTabbedPaneRelacionesSubGrupoParametroFormularioIva.remove(this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioSubGrupoParametroFormularioIva() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(SubGrupoParametroFormularioIvaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.subgrupoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, SubGrupoParametroFormularioIvaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoSubGrupoParametroFormularioIva=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarSubGrupoParametroFormularioIva=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalSubGrupoParametroFormularioIva=this.isPermisoActualizarSubGrupoParametroFormularioIva;
			this.isPermisoEliminarSubGrupoParametroFormularioIva=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosSubGrupoParametroFormularioIva=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaSubGrupoParametroFormularioIva=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaSubGrupoParametroFormularioIva=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoSubGrupoParametroFormularioIva=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteSubGrupoParametroFormularioIva=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenSubGrupoParametroFormularioIva=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioSubGrupoParametroFormularioIva=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoSubGrupoParametroFormularioIva=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoSubGrupoParametroFormularioIva=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarSubGrupoParametroFormularioIva=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormSubGrupoParametroFormularioIva=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarSubGrupoParametroFormularioIva=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenSubGrupoParametroFormularioIva=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.subgrupoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosSubGrupoParametroFormularioIva.setToolTipText(this.jTableDatosSubGrupoParametroFormularioIva.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioSubGrupoParametroFormularioIva(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioSubGrupoParametroFormularioIva(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(SubGrupoParametroFormularioIvaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(SubGrupoParametroFormularioIvaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioSubGrupoParametroFormularioIva() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosParametroFormularioIva && this.subgrupoparametroformularioivaConstantesFunciones.mostrarParametroFormularioIvaSubGrupoParametroFormularioIva && !SubGrupoParametroFormularioIvaConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Parametro Formulario Iva");
			reporte.setsDescripcion("Parametro Formulario Iva");
			this.tiposRelaciones.add(reporte);
		}
		
		
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
	public void inicializarCombosForeignKeySubGrupoParametroFormularioIvaListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeySubGrupoParametroFormularioIvaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(SubGrupoParametroFormularioIvaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeySubGrupoParametroFormularioIvaListas(false);
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
	
	public void cargarCombosLoteForeignKeySubGrupoParametroFormularioIvaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			SubGrupoParametroFormularioIvaParameterReturnGeneral subgrupoparametroformularioivaReturnGeneral=new SubGrupoParametroFormularioIvaParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.subgrupoparametroformularioivaConstantesFunciones.cargarid_empresaSubGrupoParametroFormularioIva)
					 || (this.esRecargarFks && this.subgrupoparametroformularioivaConstantesFunciones.cargarid_empresaSubGrupoParametroFormularioIva)) {

					if(!this.subgrupoparametroformularioivaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+subgrupoparametroformularioivaSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				subgrupoparametroformularioivaReturnGeneral=subgrupoparametroformularioivaLogic.cargarCombosLoteForeignKeySubGrupoParametroFormularioIva(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=subgrupoparametroformularioivaReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeySubGrupoParametroFormularioIva()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.subgrupoparametroformularioivaSessionBean==null) {
				this.subgrupoparametroformularioivaSessionBean=new SubGrupoParametroFormularioIvaSessionBean();
			}

			if(!this.subgrupoparametroformularioivaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeySubGrupoParametroFormularioIva()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeySubGrupoParametroFormularioIva(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeySubGrupoParametroFormularioIva()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeySubGrupoParametroFormularioIva();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeySubGrupoParametroFormularioIva(SubGrupoParametroFormularioIva subgrupoparametroformularioiva)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeySubGrupoParametroFormularioIva(SubGrupoParametroFormularioIva subgrupoparametroformularioiva,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeySubGrupoParametroFormularioIva()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeySubGrupoParametroFormularioIva()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeySubGrupoParametroFormularioIva()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeySubGrupoParametroFormularioIva()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroSubGrupoParametroFormularioIva()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeySubGrupoParametroFormularioIva()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeySubGrupoParametroFormularioIva(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeySubGrupoParametroFormularioIva()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jComboBoxid_empresaSubGrupoParametroFormularioIva!=null && this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jComboBoxid_empresaSubGrupoParametroFormularioIva.getItemCount()>0) {
				this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jComboBoxid_empresaSubGrupoParametroFormularioIva.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public SubGrupoParametroFormularioIvaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public SubGrupoParametroFormularioIvaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public SubGrupoParametroFormularioIvaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.subgrupoparametroformularioivaSessionBean=new SubGrupoParametroFormularioIvaSessionBean(); 
		this.subgrupoparametroformularioivaConstantesFunciones=new SubGrupoParametroFormularioIvaConstantesFunciones(); 
		this.subgrupoparametroformularioivaBean=new SubGrupoParametroFormularioIva();//(this.subgrupoparametroformularioivaConstantesFunciones); 		
		this.subgrupoparametroformularioivaReturnGeneral=new SubGrupoParametroFormularioIvaParameterReturnGeneral(); 
		
		this.subgrupoparametroformularioivaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.subgrupoparametroformularioivaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public SubGrupoParametroFormularioIvaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public SubGrupoParametroFormularioIvaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public SubGrupoParametroFormularioIvaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessSubGrupoParametroFormularioIva(true);
			
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
			
			this.subgrupoparametroformularioivaConstantesFunciones=new SubGrupoParametroFormularioIvaConstantesFunciones(); 
			this.subgrupoparametroformularioivaBean=new SubGrupoParametroFormularioIva();//this.subgrupoparametroformularioivaConstantesFunciones); 			
			this.subgrupoparametroformularioivaReturnGeneral=new SubGrupoParametroFormularioIvaParameterReturnGeneral(); 
		
			SubGrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Sub Grupo Parametro Formulario Iva  Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.subgrupoparametroformularioiva=new SubGrupoParametroFormularioIva();
			this.subgrupoparametroformularioivas = new ArrayList<SubGrupoParametroFormularioIva>();
			this.subgrupoparametroformularioivasAux = new ArrayList<SubGrupoParametroFormularioIva>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subgrupoparametroformularioivaLogic=new SubGrupoParametroFormularioIvaLogic();
				this.subgrupoparametroformularioivaLogic.getNewConnexionToDeep("");
			}
			
			//this.subgrupoparametroformularioivaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.subgrupoparametroformularioivaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoSubGrupoParametroFormularioIva!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoSubGrupoParametroFormularioIva);	
					}
					
					if(this.jInternalFrameImportacionSubGrupoParametroFormularioIva!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionSubGrupoParametroFormularioIva);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderBySubGrupoParametroFormularioIva!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderBySubGrupoParametroFormularioIva);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva);
				this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.setVisible(false);
				this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoSubGrupoParametroFormularioIva!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoSubGrupoParametroFormularioIva);
					this.jInternalFrameReporteDinamicoSubGrupoParametroFormularioIva.setVisible(false);
					this.jInternalFrameReporteDinamicoSubGrupoParametroFormularioIva.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionSubGrupoParametroFormularioIva!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionSubGrupoParametroFormularioIva);
					this.jInternalFrameImportacionSubGrupoParametroFormularioIva.setVisible(false);
					this.jInternalFrameImportacionSubGrupoParametroFormularioIva.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderBySubGrupoParametroFormularioIva!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderBySubGrupoParametroFormularioIva);
					this.jInternalFrameOrderBySubGrupoParametroFormularioIva.setVisible(false);
					this.jInternalFrameOrderBySubGrupoParametroFormularioIva.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idSubGrupoParametroFormularioIvaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=SubGrupoParametroFormularioIvaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.subgrupoparametroformularioivaReturnGeneral=new SubGrupoParametroFormularioIvaParameterReturnGeneral();
			
			this.subgrupoparametroformularioivaParameterGeneral=new SubGrupoParametroFormularioIvaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.subgrupoparametroformularioivaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.subgrupoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(SubGrupoParametroFormularioIvaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.subgrupoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(ParametroFormularioIvaConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,SubGrupoParametroFormularioIvaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.subgrupoparametroformularioivaSessionBean.getEsGuardarRelacionado(),this.subgrupoparametroformularioivaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,SubGrupoParametroFormularioIvaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.subgrupoparametroformularioivaSessionBean.getEsGuardarRelacionado(),this.subgrupoparametroformularioivaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoSubGrupoParametroFormularioIva=false;
			this.isVisibilidadCeldaDuplicarSubGrupoParametroFormularioIva=true;
			this.isVisibilidadCeldaCopiarSubGrupoParametroFormularioIva=true;
			this.isVisibilidadCeldaVerFormSubGrupoParametroFormularioIva=true;
			this.isVisibilidadCeldaOrdenSubGrupoParametroFormularioIva=true;
			this.isVisibilidadCeldaNuevoRelacionesSubGrupoParametroFormularioIva=false;
			this.isVisibilidadCeldaModificarSubGrupoParametroFormularioIva=false;
			this.isVisibilidadCeldaActualizarSubGrupoParametroFormularioIva=false;
			this.isVisibilidadCeldaEliminarSubGrupoParametroFormularioIva=false;
			this.isVisibilidadCeldaCancelarSubGrupoParametroFormularioIva=false;
			this.isVisibilidadCeldaGuardarSubGrupoParametroFormularioIva=false;
			this.isVisibilidadCeldaGuardarCambiosSubGrupoParametroFormularioIva=false;
			
			
			this.isVisibilidadBusquedaPorId=true;
			this.isVisibilidadBusquedaPorNombre=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesSubGrupoParametroFormularioIva("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosSubGrupoParametroFormularioIva();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioSubGrupoParametroFormularioIva(false);
			
			this.setPermisosUsuarioSubGrupoParametroFormularioIva();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.subgrupoparametroformularioivaSessionBean.getEsGuardarRelacionado() 
				|| (this.subgrupoparametroformularioivaSessionBean.getEsGuardarRelacionado() && this.subgrupoparametroformularioivaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioSubGrupoParametroFormularioIvaClasesRelacionadas();
			}
			
			if(this.subgrupoparametroformularioivaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioSubGrupoParametroFormularioIvaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!SubGrupoParametroFormularioIvaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosSubGrupoParametroFormularioIva();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualSubGrupoParametroFormularioIva();
			}
			
			if(!this.isPermisoBusquedaSubGrupoParametroFormularioIva) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasSubGrupoParametroFormularioIva.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.subgrupoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioSubGrupoParametroFormularioIva,this.isPermisoPaginacionMedioSubGrupoParametroFormularioIva,this.isPermisoPaginacionTodoSubGrupoParametroFormularioIva);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(SubGrupoParametroFormularioIvaConstantesFunciones.getTiposSeleccionarSubGrupoParametroFormularioIva());
				
				this.tiposColumnasSelect=SubGrupoParametroFormularioIvaConstantesFunciones.getTiposSeleccionarSubGrupoParametroFormularioIva(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectSubGrupoParametroFormularioIva();				
				//this.tiposRelacionesSelect=SubGrupoParametroFormularioIvaConstantesFunciones.getTiposRelacionesSubGrupoParametroFormularioIva(true);
				
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
			//if(!this.subgrupoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioSubGrupoParametroFormularioIva();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioSubGrupoParametroFormularioIva(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioSubGrupoParametroFormularioIva(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesSubGrupoParametroFormularioIva() ;
			
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
			
			
			this.parametroformularioivaLogic=new ParametroFormularioIvaLogic(); 
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
				subgrupoparametroformularioivaImplementable= (SubGrupoParametroFormularioIvaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+SubGrupoParametroFormularioIvaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				subgrupoparametroformularioivaImplementableHome= (SubGrupoParametroFormularioIvaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+SubGrupoParametroFormularioIvaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.subgrupoparametroformularioivas= new ArrayList<SubGrupoParametroFormularioIva>();
			this.subgrupoparametroformularioivasEliminados= new ArrayList<SubGrupoParametroFormularioIva>();
						
			this.isEsNuevoSubGrupoParametroFormularioIva=false;
			this.esParaAccionDesdeFormularioSubGrupoParametroFormularioIva=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeySubGrupoParametroFormularioIva(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroSubGrupoParametroFormularioIva();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.subgrupoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=SubGrupoParametroFormularioIvaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesSubGrupoParametroFormularioIva("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingSubGrupoParametroFormularioIva(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioSubGrupoParametroFormularioIva();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioSubGrupoParametroFormularioIva();
			}
			
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasSubGrupoParametroFormularioIva.getTabCount(); i++) {
					this.jTabbedPaneBusquedasSubGrupoParametroFormularioIva.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasSubGrupoParametroFormularioIva.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subgrupoparametroformularioivaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessSubGrupoParametroFormularioIva(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga SubGrupoParametroFormularioIva: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subgrupoparametroformularioivaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subgrupoparametroformularioivaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectSubGrupoParametroFormularioIva() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(ParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesSubGrupoParametroFormularioIva")) {
				iIndex=this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jTabbedPaneRelacionesSubGrupoParametroFormularioIva.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jTabbedPaneRelacionesSubGrupoParametroFormularioIva.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosSubGrupoParametroFormularioIva.getSelectedRow();	
				
				

				if(sTitle.equals("Parametro Formulario Ivas")) {
					if(!ParametroFormularioIvaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessSubGrupoParametroFormularioIva();

						this.cargarParteTabPanelRelacionadaParametroFormularioIva(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessSubGrupoParametroFormularioIva();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaParametroFormularioIva(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.cargarSessionConBeanSwingJInternalFrameParametroFormularioIva(false,true,iIndex);
		this.jButtonParametroFormularioIvaActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaParametroFormularioIva();

		//this.jTabbedPaneRelacionesSubGrupoParametroFormularioIva.updateUI();
		//this.jTabbedPaneRelacionesSubGrupoParametroFormularioIva.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesSubGrupoParametroFormularioIva.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("ParametroFormularioIva")) {
				int row=this.jTableDatosSubGrupoParametroFormularioIva.getSelectedRow();
				jButtonParametroFormularioIvaActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.subgrupoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Parametro Formulario Iva")) {

					if(this.isTienePermisosParametroFormularioIva && this.subgrupoparametroformularioivaConstantesFunciones.mostrarParametroFormularioIvaSubGrupoParametroFormularioIva && !SubGrupoParametroFormularioIvaConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Parametro Formulario Ivas"+"("+ParametroFormularioIvaConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Parametro Formulario Ivas");

						if(subgrupoparametroformularioivaConstantesFunciones.resaltarParametroFormularioIvaSubGrupoParametroFormularioIva!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(subgrupoparametroformularioivaConstantesFunciones.resaltarParametroFormularioIvaSubGrupoParametroFormularioIva);
						}

						jmenuItem.setEnabled(this.subgrupoparametroformularioivaConstantesFunciones.activarParametroFormularioIvaSubGrupoParametroFormularioIva);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"ParametroFormularioIva"));

						

						this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jmenuDetalleSubGrupoParametroFormularioIva.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeySubGrupoParametroFormularioIva(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeySubGrupoParametroFormularioIva(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeySubGrupoParametroFormularioIva(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeySubGrupoParametroFormularioIvaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeySubGrupoParametroFormularioIva();
		
		this.cargarCombosFrameForeignKeySubGrupoParametroFormularioIva();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeySubGrupoParametroFormularioIva();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeySubGrupoParametroFormularioIva();
		}
	}
	
	
	
	public void jButtonNuevoSubGrupoParametroFormularioIvaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.subgrupoparametroformularioivaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			SubGrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.subgrupoparametroformularioiva,new Object(),this.subgrupoparametroformularioivaParameterGeneral,this.subgrupoparametroformularioivaReturnGeneral);
			
			
			if(jTableDatosSubGrupoParametroFormularioIva.getRowCount()>=1) {
				jTableDatosSubGrupoParametroFormularioIva.removeRowSelectionInterval(0, jTableDatosSubGrupoParametroFormularioIva.getRowCount()-1);						
			}
			
			this.isEsNuevoSubGrupoParametroFormularioIva=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoSubGrupoParametroFormularioIva(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesSubGrupoParametroFormularioIva(true);			
			//this.subgrupoparametroformularioiva=new SubGrupoParametroFormularioIva();
			//this.subgrupoparametroformularioiva.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesSubGrupoParametroFormularioIva(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSubGrupoParametroFormularioIva() ;
			
			if(SubGrupoParametroFormularioIvaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleSubGrupoParametroFormularioIva(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.subgrupoparametroformularioiva);	
			this.actualizarInformacion("INFO_PADRE",false,this.subgrupoparametroformularioiva);				
			
			SubGrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.subgrupoparametroformularioiva,new Object(),this.subgrupoparametroformularioivaParameterGeneral,this.subgrupoparametroformularioivaReturnGeneral);
			
			if(this.subgrupoparametroformularioivaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar SubGrupoParametroFormularioIva: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			SubGrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.subgrupoparametroformularioiva,new Object(),this.subgrupoparametroformularioivaParameterGeneral,this.subgrupoparametroformularioivaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarSubGrupoParametroFormularioIvaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<SubGrupoParametroFormularioIva> subgrupoparametroformularioivasSeleccionados=new ArrayList<SubGrupoParametroFormularioIva>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosSubGrupoParametroFormularioIva.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosSubGrupoParametroFormularioIva.getSelectedRows().length;			
			}
			
			subgrupoparametroformularioivasSeleccionados=this.getSubGrupoParametroFormularioIvasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoSubGrupoParametroFormularioIva--;			
				//SubGrupoParametroFormularioIva subgrupoparametroformularioivaAux= new SubGrupoParametroFormularioIva();			
				//subgrupoparametroformularioivaAux.setId(this.iIdNuevoSubGrupoParametroFormularioIva);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//SubGrupoParametroFormularioIva subgrupoparametroformularioivaOrigen=new SubGrupoParametroFormularioIva();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(SubGrupoParametroFormularioIva subgrupoparametroformularioivaOrigen : subgrupoparametroformularioivasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosSubGrupoParametroFormularioIva.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							subgrupoparametroformularioivaOrigen =(SubGrupoParametroFormularioIva) this.subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvas().toArray()[this.jTableDatosSubGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							subgrupoparametroformularioivaOrigen =(SubGrupoParametroFormularioIva) this.subgrupoparametroformularioivas.toArray()[this.jTableDatosSubGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaSubGrupoParametroFormularioIva();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.subgrupoparametroformularioiva.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosSubGrupoParametroFormularioIva(subgrupoparametroformularioivaOrigen,this.subgrupoparametroformularioiva,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysSubGrupoParametroFormularioIva(this.subgrupoparametroformularioiva);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvas().add(this.subgrupoparametroformularioivaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.subgrupoparametroformularioivas.add(this.subgrupoparametroformularioivaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaSubGrupoParametroFormularioIva(false);
				
				this.jTableDatosSubGrupoParametroFormularioIva.setRowSelectionInterval(this.getIndiceNuevoSubGrupoParametroFormularioIva(), this.getIndiceNuevoSubGrupoParametroFormularioIva());
				
				int iLastRow =  this.jTableDatosSubGrupoParametroFormularioIva.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosSubGrupoParametroFormularioIva.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosSubGrupoParametroFormularioIva.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaSubGrupoParametroFormularioIva(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarSubGrupoParametroFormularioIvaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<SubGrupoParametroFormularioIva> subgrupoparametroformularioivasSeleccionados=new ArrayList<SubGrupoParametroFormularioIva>();									
		
			SubGrupoParametroFormularioIva subgrupoparametroformularioivaOrigen=new SubGrupoParametroFormularioIva();
			SubGrupoParametroFormularioIva subgrupoparametroformularioivaDestino=new SubGrupoParametroFormularioIva();
				
			subgrupoparametroformularioivasSeleccionados=this.getSubGrupoParametroFormularioIvasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosSubGrupoParametroFormularioIva.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || subgrupoparametroformularioivasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosSubGrupoParametroFormularioIva.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						subgrupoparametroformularioivaOrigen =(SubGrupoParametroFormularioIva) this.subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvas().toArray()[this.jTableDatosSubGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						subgrupoparametroformularioivaOrigen =(SubGrupoParametroFormularioIva) this.subgrupoparametroformularioivas.toArray()[this.jTableDatosSubGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						subgrupoparametroformularioivaDestino =(SubGrupoParametroFormularioIva) this.subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvas().toArray()[this.jTableDatosSubGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						subgrupoparametroformularioivaDestino =(SubGrupoParametroFormularioIva) this.subgrupoparametroformularioivas.toArray()[this.jTableDatosSubGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				subgrupoparametroformularioivaOrigen =subgrupoparametroformularioivasSeleccionados.get(0);
				subgrupoparametroformularioivaDestino =subgrupoparametroformularioivasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosSubGrupoParametroFormularioIva(subgrupoparametroformularioivaOrigen,subgrupoparametroformularioivaDestino,true,false);
				
				subgrupoparametroformularioivaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(subgrupoparametroformularioivaDestino,subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(subgrupoparametroformularioivaDestino,subgrupoparametroformularioivas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaSubGrupoParametroFormularioIva(false);
				
				//this.jTableDatosSubGrupoParametroFormularioIva.setRowSelectionInterval(this.getIndiceNuevoSubGrupoParametroFormularioIva(), this.getIndiceNuevoSubGrupoParametroFormularioIva());
				
				int iLastRow =  this.jTableDatosSubGrupoParametroFormularioIva.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosSubGrupoParametroFormularioIva.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosSubGrupoParametroFormularioIva.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaSubGrupoParametroFormularioIva(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormSubGrupoParametroFormularioIvaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarSubGrupoParametroFormularioIvaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesSubGrupoParametroFormularioIva.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasSubGrupoParametroFormularioIva.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesSubGrupoParametroFormularioIva.setVisible(!isVisible);
			this.jPanelPaginacionSubGrupoParametroFormularioIva.setVisible(!isVisible);
			this.jPanelAccionesSubGrupoParametroFormularioIva.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarSubGrupoParametroFormularioIvaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameSubGrupoParametroFormularioIva();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoSubGrupoParametroFormularioIvaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoSubGrupoParametroFormularioIva();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionSubGrupoParametroFormularioIvaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionSubGrupoParametroFormularioIva();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderBySubGrupoParametroFormularioIvaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderBySubGrupoParametroFormularioIva();
			
			this.abrirFrameOrderBySubGrupoParametroFormularioIva();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderBySubGrupoParametroFormularioIvaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderBySubGrupoParametroFormularioIva();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleSubGrupoParametroFormularioIva(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormSubGrupoParametroFormularioIva);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.isMaximum()) {
					this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.setSize(this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.iWidthFormulario,this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.isMaximum()) {
						this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jContentPaneDetalleSubGrupoParametroFormularioIva.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jTabbedPaneRelacionesSubGrupoParametroFormularioIva.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jContentPaneDetalleSubGrupoParametroFormularioIva.getWidth(),SubGrupoParametroFormularioIvaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jTabbedPaneRelacionesSubGrupoParametroFormularioIva.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jContentPaneDetalleSubGrupoParametroFormularioIva.getWidth(),SubGrupoParametroFormularioIvaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jTabbedPaneRelacionesSubGrupoParametroFormularioIva.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jContentPaneDetalleSubGrupoParametroFormularioIva.getWidth(),SubGrupoParametroFormularioIvaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(ParametroFormularioIvaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaParametroFormularioIva();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.setVisible(true);
	        this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderBySubGrupoParametroFormularioIva() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderBySubGrupoParametroFormularioIva==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderBySubGrupoParametroFormularioIva=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySubGrupoParametroFormularioIva,false,this);
				} else {
					this.jInternalFrameOrderBySubGrupoParametroFormularioIva=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySubGrupoParametroFormularioIva,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderBySubGrupoParametroFormularioIva);
				this.jInternalFrameOrderBySubGrupoParametroFormularioIva.setVisible(false);
				this.jInternalFrameOrderBySubGrupoParametroFormularioIva.setSelected(false);
				
				this.jInternalFrameOrderBySubGrupoParametroFormularioIva.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderBySubGrupoParametroFormularioIva"));
				
				this.inicializarActualizarBindingTablaOrderBySubGrupoParametroFormularioIva();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionSubGrupoParametroFormularioIva() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionSubGrupoParametroFormularioIva==null) {
				
				this.jInternalFrameImportacionSubGrupoParametroFormularioIva=new ImportacionJInternalFrame(SubGrupoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionSubGrupoParametroFormularioIva);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionSubGrupoParametroFormularioIva);
				this.jInternalFrameImportacionSubGrupoParametroFormularioIva.setVisible(false);
				this.jInternalFrameImportacionSubGrupoParametroFormularioIva.setSelected(false);


				this.jInternalFrameImportacionSubGrupoParametroFormularioIva.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionSubGrupoParametroFormularioIva"));
				this.jInternalFrameImportacionSubGrupoParametroFormularioIva.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionSubGrupoParametroFormularioIva"));
				this.jInternalFrameImportacionSubGrupoParametroFormularioIva.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionSubGrupoParametroFormularioIva"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoSubGrupoParametroFormularioIva() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoSubGrupoParametroFormularioIva==null) {
				this.jInternalFrameReporteDinamicoSubGrupoParametroFormularioIva=new ReporteDinamicoJInternalFrame(SubGrupoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoSubGrupoParametroFormularioIva);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoSubGrupoParametroFormularioIva);
				this.jInternalFrameReporteDinamicoSubGrupoParametroFormularioIva.setVisible(false);
				this.jInternalFrameReporteDinamicoSubGrupoParametroFormularioIva.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoSubGrupoParametroFormularioIva.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoSubGrupoParametroFormularioIva"));
				this.jInternalFrameReporteDinamicoSubGrupoParametroFormularioIva.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoSubGrupoParametroFormularioIva"));
				this.jInternalFrameReporteDinamicoSubGrupoParametroFormularioIva.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoSubGrupoParametroFormularioIva"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualSubGrupoParametroFormularioIva();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaParametroFormularioIva() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.jScrollPanelDatosParametroFormularioIva.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jContentPaneDetalleSubGrupoParametroFormularioIva.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.jScrollPanelDatosParametroFormularioIva.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.jScrollPanelDatosParametroFormularioIva.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.jScrollPanelDatosParametroFormularioIva.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleSubGrupoParametroFormularioIva() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormSubGrupoParametroFormularioIva);
			
	       	this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.setVisible(false);
	        this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.setSelected(false);
			
			//this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.dispose();
			//this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoSubGrupoParametroFormularioIva() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoSubGrupoParametroFormularioIva.setVisible(true);
	        this.jInternalFrameReporteDinamicoSubGrupoParametroFormularioIva.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionSubGrupoParametroFormularioIva() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionSubGrupoParametroFormularioIva.setVisible(true);
	        this.jInternalFrameImportacionSubGrupoParametroFormularioIva.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderBySubGrupoParametroFormularioIva() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderBySubGrupoParametroFormularioIva.setVisible(true);
	        this.jInternalFrameOrderBySubGrupoParametroFormularioIva.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderBySubGrupoParametroFormularioIva() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderBySubGrupoParametroFormularioIva.setVisible(false);
	        this.jInternalFrameOrderBySubGrupoParametroFormularioIva.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoSubGrupoParametroFormularioIva() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoSubGrupoParametroFormularioIva.setVisible(false);
	        this.jInternalFrameReporteDinamicoSubGrupoParametroFormularioIva.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionSubGrupoParametroFormularioIva() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionSubGrupoParametroFormularioIva.setVisible(false);
	        this.jInternalFrameImportacionSubGrupoParametroFormularioIva.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarSubGrupoParametroFormularioIvaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarSubGrupoParametroFormularioIva(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarSubGrupoParametroFormularioIva(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosSubGrupoParametroFormularioIva.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesSubGrupoParametroFormularioIva(true);
			//this.isEsNuevoSubGrupoParametroFormularioIva=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subgrupoparametroformularioiva =(SubGrupoParametroFormularioIva) this.subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvas().toArray()[this.jTableDatosSubGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.subgrupoparametroformularioiva =(SubGrupoParametroFormularioIva) this.subgrupoparametroformularioivas.toArray()[this.jTableDatosSubGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesSubGrupoParametroFormularioIva("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesSubGrupoParametroFormularioIva(false) ;
			
			if(subgrupoparametroformularioivaSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.parametroformularioivaSessionBean.getEsGuardarRelacionado() && ParametroFormularioIvaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonParametroFormularioIvaActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(SubGrupoParametroFormularioIvaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleSubGrupoParametroFormularioIva(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSubGrupoParametroFormularioIva(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaSubGrupoParametroFormularioIvaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosSubGrupoParametroFormularioIva.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subgrupoparametroformularioiva =(SubGrupoParametroFormularioIva) this.subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvas().toArray()[this.jTableDatosSubGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.subgrupoparametroformularioiva =(SubGrupoParametroFormularioIva) this.subgrupoparametroformularioivas.toArray()[this.jTableDatosSubGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarSubGrupoParametroFormularioIva(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosSubGrupoParametroFormularioIva.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesSubGrupoParametroFormularioIva(true);
			//this.isEsNuevoSubGrupoParametroFormularioIva=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subgrupoparametroformularioiva =(SubGrupoParametroFormularioIva) this.subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvas().toArray()[this.jTableDatosSubGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.subgrupoparametroformularioiva =(SubGrupoParametroFormularioIva) this.subgrupoparametroformularioivas.toArray()[this.jTableDatosSubGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.subgrupoparametroformularioiva.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesSubGrupoParametroFormularioIva("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesSubGrupoParametroFormularioIva(false) ;
			
			if(SubGrupoParametroFormularioIvaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleSubGrupoParametroFormularioIva(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSubGrupoParametroFormularioIva(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarSubGrupoParametroFormularioIvaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subgrupoparametroformularioivaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesSubGrupoParametroFormularioIva(false);
			
			//if(!this.isEsNuevoSubGrupoParametroFormularioIva) {								
				int intSelectedRow = this.jTableDatosSubGrupoParametroFormularioIva.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subgrupoparametroformularioiva =(SubGrupoParametroFormularioIva) this.subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvas().toArray()[this.jTableDatosSubGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.subgrupoparametroformularioiva =(SubGrupoParametroFormularioIva) this.subgrupoparametroformularioivas.toArray()[this.jTableDatosSubGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(SubGrupoParametroFormularioIvaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualSubGrupoParametroFormularioIva(this.subgrupoparametroformularioiva,true);
				this.setVariablesFormularioToObjetoActualForeignKeysSubGrupoParametroFormularioIva(this.subgrupoparametroformularioiva);
				
			}
			
			if(this.permiteMantenimiento(this.subgrupoparametroformularioiva)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.subgrupoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoSubGrupoParametroFormularioIva=true;
					this.inicializarActualizarBindingTablaSubGrupoParametroFormularioIva(false);
					this.isEsNuevoSubGrupoParametroFormularioIva=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoSubGrupoParametroFormularioIva=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoSubGrupoParametroFormularioIva=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesSubGrupoParametroFormularioIva(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualSubGrupoParametroFormularioIva(false);
				
				this.habilitarDeshabilitarControlesSubGrupoParametroFormularioIva(false);
			
												
				
				if(SubGrupoParametroFormularioIvaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleSubGrupoParametroFormularioIva();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoSubGrupoParametroFormularioIvaActionPerformed(evt,subgrupoparametroformularioivaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualSubGrupoParametroFormularioIva(this.subgrupoparametroformularioiva,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosSubGrupoParametroFormularioIva.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,subgrupoparametroformularioivaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subgrupoparametroformularioivaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.subgrupoparametroformularioiva.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(SubGrupoParametroFormularioIva.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SubGrupoParametroFormularioIva.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subgrupoparametroformularioivaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subgrupoparametroformularioivaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarSubGrupoParametroFormularioIvaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subgrupoparametroformularioivaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosSubGrupoParametroFormularioIva.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subgrupoparametroformularioiva =(SubGrupoParametroFormularioIva) this.subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvas().toArray()[this.jTableDatosSubGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
				this.subgrupoparametroformularioiva.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.subgrupoparametroformularioiva =(SubGrupoParametroFormularioIva) this.subgrupoparametroformularioivas.toArray()[this.jTableDatosSubGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
				this.subgrupoparametroformularioiva.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.subgrupoparametroformularioiva)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.subgrupoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((SubGrupoParametroFormularioIvaModel) this.jTableDatosSubGrupoParametroFormularioIva.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoSubGrupoParametroFormularioIva=true;
				this.inicializarActualizarBindingTablaSubGrupoParametroFormularioIva(false);
				this.isEsNuevoSubGrupoParametroFormularioIva=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesSubGrupoParametroFormularioIva(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualSubGrupoParametroFormularioIva(false);
				
				this.habilitarDeshabilitarControlesSubGrupoParametroFormularioIva(false);
				
				
				
				if(SubGrupoParametroFormularioIvaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleSubGrupoParametroFormularioIva();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subgrupoparametroformularioivaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subgrupoparametroformularioivaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subgrupoparametroformularioivaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarSubGrupoParametroFormularioIvaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosSubGrupoParametroFormularioIva.getRowCount()>=1) {
				jTableDatosSubGrupoParametroFormularioIva.removeRowSelectionInterval(0, jTableDatosSubGrupoParametroFormularioIva.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesSubGrupoParametroFormularioIva(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaSubGrupoParametroFormularioIva(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesSubGrupoParametroFormularioIva(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSubGrupoParametroFormularioIva(false) ;
			
			this.isEsNuevoSubGrupoParametroFormularioIva=false;
			
			if(SubGrupoParametroFormularioIvaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleSubGrupoParametroFormularioIva();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosSubGrupoParametroFormularioIvaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subgrupoparametroformularioivaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingSubGrupoParametroFormularioIva(false);
				
				//SI ES MANUAL
				if(SubGrupoParametroFormularioIvaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualSubGrupoParametroFormularioIva();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subgrupoparametroformularioivaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subgrupoparametroformularioivaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subgrupoparametroformularioivaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosSubGrupoParametroFormularioIvaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoSubGrupoParametroFormularioIva--;			
			//SubGrupoParametroFormularioIva subgrupoparametroformularioivaAux= new SubGrupoParametroFormularioIva();			
			//subgrupoparametroformularioivaAux.setId(this.iIdNuevoSubGrupoParametroFormularioIva);
			
			if(this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaSubGrupoParametroFormularioIva();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysSubGrupoParametroFormularioIva(this.subgrupoparametroformularioiva);
			
			this.subgrupoparametroformularioiva.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvas().add(this.subgrupoparametroformularioivaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.subgrupoparametroformularioivas.add(this.subgrupoparametroformularioivaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaSubGrupoParametroFormularioIva(false);
			
			this.jTableDatosSubGrupoParametroFormularioIva.setRowSelectionInterval(this.getIndiceNuevoSubGrupoParametroFormularioIva(), this.getIndiceNuevoSubGrupoParametroFormularioIva());
			
			int iLastRow =  this.jTableDatosSubGrupoParametroFormularioIva.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosSubGrupoParametroFormularioIva.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosSubGrupoParametroFormularioIva.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaSubGrupoParametroFormularioIva(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionSubGrupoParametroFormularioIvaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subgrupoparametroformularioivaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingSubGrupoParametroFormularioIva(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSubGrupoParametroFormularioIva(false);
			
			//SI ES MANUAL
			if(SubGrupoParametroFormularioIvaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualSubGrupoParametroFormularioIva();
			}
			
			//this.abrirFrameTreeSubGrupoParametroFormularioIva();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subgrupoparametroformularioivaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subgrupoparametroformularioivaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subgrupoparametroformularioivaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionSubGrupoParametroFormularioIvaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Sub Grupo Parametro Formulario Iva S ?", "MANTENIMIENTO DE Sub Grupo Parametro Formulario Iva ", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionSubGrupoParametroFormularioIva.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralSubGrupoParametroFormularioIva();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.subgrupoparametroformularioivaReturnGeneral=subgrupoparametroformularioivaLogic.procesarImportacionSubGrupoParametroFormularioIvasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.subgrupoparametroformularioivaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarSubGrupoParametroFormularioIvaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionSubGrupoParametroFormularioIvaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionSubGrupoParametroFormularioIva.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionSubGrupoParametroFormularioIva.setFileImportacion(this.jInternalFrameImportacionSubGrupoParametroFormularioIva.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionSubGrupoParametroFormularioIva.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionSubGrupoParametroFormularioIva.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionSubGrupoParametroFormularioIva.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionSubGrupoParametroFormularioIva.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoSubGrupoParametroFormularioIvaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<SubGrupoParametroFormularioIva> subgrupoparametroformularioivasSeleccionados=new ArrayList<SubGrupoParametroFormularioIva>();		

		subgrupoparametroformularioivasSeleccionados=this.getSubGrupoParametroFormularioIvasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSubGrupoParametroFormularioIva.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSubGrupoParametroFormularioIva.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("SubGrupoParametroFormularioIvaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"SubGrupoParametroFormularioIvaBaseDesign.jrxml";
			
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
			
			this.generarReporteSubGrupoParametroFormularioIvas("Todos",subgrupoparametroformularioivasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.subgrupoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sub Grupo Parametro Formulario Iva ",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoSubGrupoParametroFormularioIva.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSubGrupoParametroFormularioIva.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case SubGrupoParametroFormularioIvaConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SubGrupoParametroFormularioIvaConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoSubGrupoParametroFormularioIva.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoSubGrupoParametroFormularioIva.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoSubGrupoParametroFormularioIva.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case SubGrupoParametroFormularioIvaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case SubGrupoParametroFormularioIvaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoSubGrupoParametroFormularioIva.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case SubGrupoParametroFormularioIvaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case SubGrupoParametroFormularioIvaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoSubGrupoParametroFormularioIva.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSubGrupoParametroFormularioIva.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case SubGrupoParametroFormularioIvaConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case SubGrupoParametroFormularioIvaConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
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
	
	public void jButtonGenerarExcelReporteDinamicoSubGrupoParametroFormularioIvaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<SubGrupoParametroFormularioIva> subgrupoparametroformularioivasSeleccionados=new ArrayList<SubGrupoParametroFormularioIva>();		
		
		subgrupoparametroformularioivasSeleccionados=this.getSubGrupoParametroFormularioIvasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"subgrupoparametroformularioiva";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("SubGrupoParametroFormularioIvas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoSubGrupoParametroFormularioIva.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoSubGrupoParametroFormularioIva.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case SubGrupoParametroFormularioIvaConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SubGrupoParametroFormularioIvaConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(SubGrupoParametroFormularioIva subgrupoparametroformularioiva:subgrupoparametroformularioivasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(subgrupoparametroformularioiva.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SubGrupoParametroFormularioIvaConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SubGrupoParametroFormularioIvaConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(SubGrupoParametroFormularioIva subgrupoparametroformularioiva:subgrupoparametroformularioivasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(subgrupoparametroformularioiva.getnombre());
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
			//	this.getFilaCabeceraExportarExcelSubGrupoParametroFormularioIva(row);				
			//	iRow++;
			//}				
			
			//for(SubGrupoParametroFormularioIva subgrupoparametroformularioivaAux:subgrupoparametroformularioivasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelSubGrupoParametroFormularioIva(subgrupoparametroformularioivaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.subgrupoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sub Grupo Parametro Formulario Iva ",JOptionPane.INFORMATION_MESSAGE);
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
				this.subgrupoparametroformularioivaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSubGrupoParametroFormularioIva(false);
			
			//SI ES MANUAL
			if(SubGrupoParametroFormularioIvaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualSubGrupoParametroFormularioIva();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subgrupoparametroformularioivaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subgrupoparametroformularioivaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subgrupoparametroformularioivaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresSubGrupoParametroFormularioIvaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subgrupoparametroformularioivaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSubGrupoParametroFormularioIva(false);
			
			//SI ES MANUAL
			if(SubGrupoParametroFormularioIvaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualSubGrupoParametroFormularioIva();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subgrupoparametroformularioivaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subgrupoparametroformularioivaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subgrupoparametroformularioivaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesSubGrupoParametroFormularioIvaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subgrupoparametroformularioivaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSubGrupoParametroFormularioIva(false);
			
			//SI ES MANUAL
			if(SubGrupoParametroFormularioIvaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualSubGrupoParametroFormularioIva();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subgrupoparametroformularioivaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subgrupoparametroformularioivaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subgrupoparametroformularioivaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaSubGrupoParametroFormularioIva() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosSubGrupoParametroFormularioIva.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosSubGrupoParametroFormularioIva.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosSubGrupoParametroFormularioIva.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosSubGrupoParametroFormularioIva.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosSubGrupoParametroFormularioIva.setMinimumSize(dimensionMinimum);
		this.jTableDatosSubGrupoParametroFormularioIva.setMaximumSize(dimensionMaximum);
		this.jTableDatosSubGrupoParametroFormularioIva.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingSubGrupoParametroFormularioIva(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingSubGrupoParametroFormularioIva(esInicializar,true);
	}
	
	public void inicializarActualizarBindingSubGrupoParametroFormularioIva(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaSubGrupoParametroFormularioIva(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesSubGrupoParametroFormularioIva(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.subgrupoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasSubGrupoParametroFormularioIva(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesSubGrupoParametroFormularioIva(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesSubGrupoParametroFormularioIva(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !SubGrupoParametroFormularioIvaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!SubGrupoParametroFormularioIvaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualSubGrupoParametroFormularioIva() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaSubGrupoParametroFormularioIva();
		
		this.inicializarActualizarBindingBotonesManualSubGrupoParametroFormularioIva(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.subgrupoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualSubGrupoParametroFormularioIva();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesSubGrupoParametroFormularioIva() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualSubGrupoParametroFormularioIva(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualSubGrupoParametroFormularioIva(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosSubGrupoParametroFormularioIva.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosSubGrupoParametroFormularioIva.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteSubGrupoParametroFormularioIva.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jCheckBoxPostAccionNuevoSubGrupoParametroFormularioIva.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jCheckBoxPostAccionSinCerrarSubGrupoParametroFormularioIva.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jCheckBoxPostAccionSinMensajeSubGrupoParametroFormularioIva.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosSubGrupoParametroFormularioIva.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosSubGrupoParametroFormularioIva.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteSubGrupoParametroFormularioIva.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva!=null) {
				this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jCheckBoxPostAccionNuevoSubGrupoParametroFormularioIva.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jCheckBoxPostAccionSinCerrarSubGrupoParametroFormularioIva.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jCheckBoxPostAccionSinMensajeSubGrupoParametroFormularioIva.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionSubGrupoParametroFormularioIva.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionSubGrupoParametroFormularioIva.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jComboBoxTiposAccionesFormularioSubGrupoParametroFormularioIva.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesSubGrupoParametroFormularioIva.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoSubGrupoParametroFormularioIva!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSubGrupoParametroFormularioIva.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesSubGrupoParametroFormularioIva.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesSubGrupoParametroFormularioIva.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarSubGrupoParametroFormularioIva.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesSubGrupoParametroFormularioIva.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoSubGrupoParametroFormularioIva!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSubGrupoParametroFormularioIva.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesSubGrupoParametroFormularioIva.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralSubGrupoParametroFormularioIva.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesSubGrupoParametroFormularioIva(Boolean esInicializar) throws Exception {
		try	{	
			if(SubGrupoParametroFormularioIvaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualSubGrupoParametroFormularioIva(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesSubGrupoParametroFormularioIva() throws Exception {
		try	{
			if(SubGrupoParametroFormularioIvaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualSubGrupoParametroFormularioIva();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleSubGrupoParametroFormularioIva() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jComboBoxTiposAccionesFormularioSubGrupoParametroFormularioIva.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jComboBoxTiposAccionesFormularioSubGrupoParametroFormularioIva.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualSubGrupoParametroFormularioIva() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesSubGrupoParametroFormularioIva.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesSubGrupoParametroFormularioIva.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesSubGrupoParametroFormularioIva.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesSubGrupoParametroFormularioIva.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesSubGrupoParametroFormularioIva.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesSubGrupoParametroFormularioIva.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionSubGrupoParametroFormularioIva.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionSubGrupoParametroFormularioIva.addItem(reporte);
			}
			
			
			if(!this.subgrupoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionSubGrupoParametroFormularioIva.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionSubGrupoParametroFormularioIva.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesSubGrupoParametroFormularioIva.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesSubGrupoParametroFormularioIva.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesSubGrupoParametroFormularioIva.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesSubGrupoParametroFormularioIva.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jComboBoxTiposAccionesFormularioSubGrupoParametroFormularioIva.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jComboBoxTiposAccionesFormularioSubGrupoParametroFormularioIva.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarSubGrupoParametroFormularioIva.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarSubGrupoParametroFormularioIva.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarSubGrupoParametroFormularioIva.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualSubGrupoParametroFormularioIva();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualSubGrupoParametroFormularioIva() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoSubGrupoParametroFormularioIva!=null) {
				this.jInternalFrameReporteDinamicoSubGrupoParametroFormularioIva.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoSubGrupoParametroFormularioIva.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoSubGrupoParametroFormularioIva!=null) {
				this.jInternalFrameReporteDinamicoSubGrupoParametroFormularioIva.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoSubGrupoParametroFormularioIva.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoSubGrupoParametroFormularioIva!=null) {
				
				if(this.jInternalFrameReporteDinamicoSubGrupoParametroFormularioIva.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoSubGrupoParametroFormularioIva.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoSubGrupoParametroFormularioIva.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoSubGrupoParametroFormularioIva.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoSubGrupoParametroFormularioIva.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoSubGrupoParametroFormularioIva.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualSubGrupoParametroFormularioIva()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		//this.idBusquedaPorId=Long.parseLong(this.jLabelidSubGrupoParametroFormularioIvaBusquedaPorId.getText());
		this.nombreBusquedaPorNombre=this.jTextAreanombreBusquedaPorNombreSubGrupoParametroFormularioIva.getText();
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasSubGrupoParametroFormularioIva(Boolean esInicializar) throws Exception {				
		if(SubGrupoParametroFormularioIvaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualSubGrupoParametroFormularioIva();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaSubGrupoParametroFormularioIva() throws Exception {
		this.inicializarActualizarBindingTablaSubGrupoParametroFormularioIva(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderBySubGrupoParametroFormularioIva() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderBySubGrupoParametroFormularioIva.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderBySubGrupoParametroFormularioIva.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderBySubGrupoParametroFormularioIva.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new SubGrupoParametroFormularioIvaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderBySubGrupoParametroFormularioIva.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderBySubGrupoParametroFormularioIva.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new SubGrupoParametroFormularioIvaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosSubGrupoParametroFormularioIvaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSubGrupoParametroFormularioIvaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new SubGrupoParametroFormularioIvaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderBySubGrupoParametroFormularioIva.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderBySubGrupoParametroFormularioIva.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new SubGrupoParametroFormularioIvaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderBySubGrupoParametroFormularioIva.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaSubGrupoParametroFormularioIva(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=subgrupoparametroformularioivas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(SubGrupoParametroFormularioIvaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosSubGrupoParametroFormularioIva.setModel(new SubGrupoParametroFormularioIvaModel(this.subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosSubGrupoParametroFormularioIva.setModel(new SubGrupoParametroFormularioIvaModel(this.subgrupoparametroformularioivas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderBySubGrupoParametroFormularioIva!=null && this.jInternalFrameOrderBySubGrupoParametroFormularioIva.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderBySubGrupoParametroFormularioIva();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosSubGrupoParametroFormularioIva.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSubGrupoParametroFormularioIva,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new SubGrupoParametroFormularioIvaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+SubGrupoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO,subgrupoparametroformularioivaConstantesFunciones.resaltarSeleccionarSubGrupoParametroFormularioIva,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+SubGrupoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO,subgrupoparametroformularioivaConstantesFunciones.resaltarSeleccionarSubGrupoParametroFormularioIva,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosSubGrupoParametroFormularioIva.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSubGrupoParametroFormularioIva,SubGrupoParametroFormularioIvaConstantesFunciones.LABEL_ID));

		if(this.subgrupoparametroformularioivaConstantesFunciones.mostraridSubGrupoParametroFormularioIva && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SubGrupoParametroFormularioIvaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.subgrupoparametroformularioivaConstantesFunciones.resaltaridSubGrupoParametroFormularioIva,this.subgrupoparametroformularioivaConstantesFunciones.activaridSubGrupoParametroFormularioIva,this,true,"idSubGrupoParametroFormularioIva","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.subgrupoparametroformularioivaConstantesFunciones.resaltaridSubGrupoParametroFormularioIva,this.subgrupoparametroformularioivaConstantesFunciones.activaridSubGrupoParametroFormularioIva,this,true,"idSubGrupoParametroFormularioIva","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSubGrupoParametroFormularioIva.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSubGrupoParametroFormularioIva,SubGrupoParametroFormularioIvaConstantesFunciones.LABEL_IDEMPRESA));

		if(this.subgrupoparametroformularioivaConstantesFunciones.mostrarid_empresaSubGrupoParametroFormularioIva && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SubGrupoParametroFormularioIvaConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.subgrupoparametroformularioivaConstantesFunciones.resaltarid_empresaSubGrupoParametroFormularioIva,this,this.subgrupoparametroformularioivaConstantesFunciones.activarid_empresaSubGrupoParametroFormularioIva));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.subgrupoparametroformularioivaConstantesFunciones.resaltarid_empresaSubGrupoParametroFormularioIva,this,this.subgrupoparametroformularioivaConstantesFunciones.activarid_empresaSubGrupoParametroFormularioIva,false,"id_empresaSubGrupoParametroFormularioIva","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SubGrupoParametroFormularioIvaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSubGrupoParametroFormularioIva.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSubGrupoParametroFormularioIva,SubGrupoParametroFormularioIvaConstantesFunciones.LABEL_NOMBRE));

		if(this.subgrupoparametroformularioivaConstantesFunciones.mostrarnombreSubGrupoParametroFormularioIva && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SubGrupoParametroFormularioIvaConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.subgrupoparametroformularioivaConstantesFunciones.resaltarnombreSubGrupoParametroFormularioIva,this.subgrupoparametroformularioivaConstantesFunciones.activarnombreSubGrupoParametroFormularioIva,this,true,"nombreSubGrupoParametroFormularioIva","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.subgrupoparametroformularioivaConstantesFunciones.resaltarnombreSubGrupoParametroFormularioIva,this.subgrupoparametroformularioivaConstantesFunciones.activarnombreSubGrupoParametroFormularioIva,this,true,"nombreSubGrupoParametroFormularioIva","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SubGrupoParametroFormularioIvaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.subgrupoparametroformularioivaSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosParametroFormularioIva && this.subgrupoparametroformularioivaConstantesFunciones.mostrarParametroFormularioIvaSubGrupoParametroFormularioIva && !SubGrupoParametroFormularioIvaConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Parametro Formulario Ivas");
				tableColumn.setHeaderValue("Parametro Formulario Ivas");
				tableColumn.setCellRenderer(new ParametroFormularioIvaTableCell(subgrupoparametroformularioivaConstantesFunciones.resaltarParametroFormularioIvaSubGrupoParametroFormularioIva,this,this.subgrupoparametroformularioivaConstantesFunciones.activarParametroFormularioIvaSubGrupoParametroFormularioIva));
				tableColumn.setCellEditor(new ParametroFormularioIvaTableCell(subgrupoparametroformularioivaConstantesFunciones.resaltarParametroFormularioIvaSubGrupoParametroFormularioIva,this,this.subgrupoparametroformularioivaConstantesFunciones.activarParametroFormularioIvaSubGrupoParametroFormularioIva));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosSubGrupoParametroFormularioIva.addColumn(tableColumn);
			}
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.subgrupoparametroformularioivaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.subgrupoparametroformularioivaSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosSubGrupoParametroFormularioIva.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.subgrupoparametroformularioivaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.subgrupoparametroformularioivaSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosSubGrupoParametroFormularioIva.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarSubGrupoParametroFormularioIva && this.isPermisoGuardarCambiosSubGrupoParametroFormularioIva) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.subgrupoparametroformularioivaSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.subgrupoparametroformularioivaSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosSubGrupoParametroFormularioIva.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.subgrupoparametroformularioivaSessionBean.getConGuardarRelaciones()) {
				if(this.conFuncionalidadRelaciones) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier("Editar Rel");
					tableColumn.setHeaderValue("Editar Rel");
					tableColumn.setCellRenderer(new IdTableCell(this,true,false));
					tableColumn.setCellEditor(new IdTableCell(this,true,false));
		
					tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					
					this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
					this.jTableDatosSubGrupoParametroFormularioIva.addColumn(tableColumn);
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
			
			this.jTableDatosSubGrupoParametroFormularioIva.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarSubGrupoParametroFormularioIva && this.isPermisoGuardarCambiosSubGrupoParametroFormularioIva) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.subgrupoparametroformularioivaSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarSubGrupoParametroFormularioIva && this.isPermisoGuardarCambiosSubGrupoParametroFormularioIva) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosSubGrupoParametroFormularioIva.moveColumn(this.jTableDatosSubGrupoParametroFormularioIva.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosSubGrupoParametroFormularioIva.moveColumn(this.jTableDatosSubGrupoParametroFormularioIva.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.subgrupoparametroformularioivaSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosSubGrupoParametroFormularioIva.moveColumn(this.jTableDatosSubGrupoParametroFormularioIva.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosSubGrupoParametroFormularioIva.moveColumn(this.jTableDatosSubGrupoParametroFormularioIva.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosSubGrupoParametroFormularioIva.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosSubGrupoParametroFormularioIva.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosSubGrupoParametroFormularioIva,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!SubGrupoParametroFormularioIvaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosSubGrupoParametroFormularioIva.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosSubGrupoParametroFormularioIva.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!SubGrupoParametroFormularioIvaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!SubGrupoParametroFormularioIvaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosSubGrupoParametroFormularioIva.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosSubGrupoParametroFormularioIva.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosSubGrupoParametroFormularioIva.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=subgrupoparametroformularioivas.size()-1;
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
		//this.jTableDatosSubGrupoParametroFormularioIva.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosSubGrupoParametroFormularioIva.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosSubGrupoParametroFormularioIva();
			
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
				
				//this.isEsNuevoSubGrupoParametroFormularioIva=false;
					
				SubGrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.subgrupoparametroformularioiva,new Object(),this.subgrupoparametroformularioivaParameterGeneral,this.subgrupoparametroformularioivaReturnGeneral);
			
				if(this.subgrupoparametroformularioivaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosSubGrupoParametroFormularioIva.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosSubGrupoParametroFormularioIva.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subgrupoparametroformularioiva =(SubGrupoParametroFormularioIva) this.subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvas().toArray()[this.jTableDatosSubGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.subgrupoparametroformularioiva =(SubGrupoParametroFormularioIva) this.subgrupoparametroformularioivas.toArray()[this.jTableDatosSubGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.subgrupoparametroformularioiva.getsType().equals("DUPLICADO")
				   || this.subgrupoparametroformularioiva.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoSubGrupoParametroFormularioIva=true;
				
				} else {
					this.isEsNuevoSubGrupoParametroFormularioIva=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.subgrupoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {
					if(this.subgrupoparametroformularioiva.getId()>=0 && !this.subgrupoparametroformularioiva.getIsNew()) {						
						this.isEsNuevoSubGrupoParametroFormularioIva=false;
						
					} else {
						this.isEsNuevoSubGrupoParametroFormularioIva=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoSubGrupoParametroFormularioIva(esRelaciones);						
				
				this.seleccionarSubGrupoParametroFormularioIva(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.subgrupoparametroformularioiva.getId()<0) {
					this.isEsNuevoSubGrupoParametroFormularioIva=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarSubGrupoParametroFormularioIva(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarSubGrupoParametroFormularioIva(evt,rowIndex);
				}	
				
				if(this.subgrupoparametroformularioivaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion SubGrupoParametroFormularioIva: " + this.dDif); 
					}
				}								
				
				SubGrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.subgrupoparametroformularioiva,new Object(),this.subgrupoparametroformularioivaParameterGeneral,this.subgrupoparametroformularioivaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarSubGrupoParametroFormularioIva(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.subgrupoparametroformularioiva)) {
					if(this.subgrupoparametroformularioiva.getId()>0) {
						this.subgrupoparametroformularioiva.setIsDeleted(true);
						
						this.subgrupoparametroformularioivasEliminados.add(this.subgrupoparametroformularioiva);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvas().remove(this.subgrupoparametroformularioiva);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.subgrupoparametroformularioivas.remove(this.subgrupoparametroformularioiva);				
					}
					
					
					((SubGrupoParametroFormularioIvaModel) this.jTableDatosSubGrupoParametroFormularioIva.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaSubGrupoParametroFormularioIva(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarSubGrupoParametroFormularioIva(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoSubGrupoParametroFormularioIva) {
			
			if(this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosSubGrupoParametroFormularioIva.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosSubGrupoParametroFormularioIva.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subgrupoparametroformularioiva =(SubGrupoParametroFormularioIva) this.subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvas().toArray()[this.jTableDatosSubGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.subgrupoparametroformularioiva =(SubGrupoParametroFormularioIva) this.subgrupoparametroformularioivas.toArray()[this.jTableDatosSubGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(SubGrupoParametroFormularioIvaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioSubGrupoParametroFormularioIva(this.subgrupoparametroformularioiva);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.subgrupoparametroformularioivaConstantesFunciones.cargarid_empresaSubGrupoParametroFormularioIva || this.subgrupoparametroformularioivaConstantesFunciones.event_dependid_empresaSubGrupoParametroFormularioIva) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.subgrupoparametroformularioiva.getid_empresa());
									//this.inicializarActualizarBindingSubGrupoParametroFormularioIva(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(subgrupoparametroformularioiva.getEmpresa()!=null) {
							this.empresasForeignKey.add(subgrupoparametroformularioiva.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.subgrupoparametroformularioiva.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesSubGrupoParametroFormularioIva("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesSubGrupoParametroFormularioIva(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualSubGrupoParametroFormularioIva() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoSubGrupoParametroFormularioIva(SubGrupoParametroFormularioIva subgrupoparametroformularioiva) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoSubGrupoParametroFormularioIva(subgrupoparametroformularioiva,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoSubGrupoParametroFormularioIva(SubGrupoParametroFormularioIva subgrupoparametroformularioiva,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioSubGrupoParametroFormularioIva(subgrupoparametroformularioiva);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeySubGrupoParametroFormularioIva(subgrupoparametroformularioiva,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeySubGrupoParametroFormularioIva(subgrupoparametroformularioiva);
	}
	
	public void setVariablesObjetoActualToFormularioSubGrupoParametroFormularioIva(SubGrupoParametroFormularioIva subgrupoparametroformularioiva) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jLabelidSubGrupoParametroFormularioIva.setText(subgrupoparametroformularioiva.getId().toString());
			this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jTextAreanombreSubGrupoParametroFormularioIva.setText(subgrupoparametroformularioiva.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,SubGrupoParametroFormularioIva subgrupoparametroformularioivaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,subgrupoparametroformularioivaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,SubGrupoParametroFormularioIva subgrupoparametroformularioivaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				subgrupoparametroformularioivaLocal=this.subgrupoparametroformularioiva;
			} else {
				subgrupoparametroformularioivaLocal=this.subgrupoparametroformularioivaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(subgrupoparametroformularioivaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoSubGrupoParametroFormularioIva(subgrupoparametroformularioivaLocal,true);
					
					if(subgrupoparametroformularioivaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(subgrupoparametroformularioivaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.subgrupoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(subgrupoparametroformularioivaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoSubGrupoParametroFormularioIva(SubGrupoParametroFormularioIva subgrupoparametroformularioiva,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualSubGrupoParametroFormularioIva(subgrupoparametroformularioiva,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysSubGrupoParametroFormularioIva(subgrupoparametroformularioiva);
	}
	
	public void setVariablesFormularioToObjetoActualSubGrupoParametroFormularioIva(SubGrupoParametroFormularioIva subgrupoparametroformularioiva,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualSubGrupoParametroFormularioIva(subgrupoparametroformularioiva,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualSubGrupoParametroFormularioIva(SubGrupoParametroFormularioIva subgrupoparametroformularioiva,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jLabelidSubGrupoParametroFormularioIva.getText()==null || this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jLabelidSubGrupoParametroFormularioIva.getText()=="" || this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jLabelidSubGrupoParametroFormularioIva.getText()=="Id") {
				this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jLabelidSubGrupoParametroFormularioIva.setText("0");
			}

			if(conColumnasBase) {subgrupoparametroformularioiva.setId(Long.parseLong(this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jLabelidSubGrupoParametroFormularioIva.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SubGrupoParametroFormularioIvaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jLabelIdSubGrupoParametroFormularioIva,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			subgrupoparametroformularioiva.setnombre(this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jTextAreanombreSubGrupoParametroFormularioIva.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SubGrupoParametroFormularioIvaConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jLabelnombreSubGrupoParametroFormularioIva,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualSubGrupoParametroFormularioIva(SubGrupoParametroFormularioIva subgrupoparametroformularioivaBean,SubGrupoParametroFormularioIva subgrupoparametroformularioiva,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosSubGrupoParametroFormularioIva(SubGrupoParametroFormularioIva subgrupoparametroformularioivaOrigen,SubGrupoParametroFormularioIva subgrupoparametroformularioiva,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && subgrupoparametroformularioivaOrigen.getId()!=null && !subgrupoparametroformularioivaOrigen.getId().equals(0L))) {subgrupoparametroformularioiva.setId(subgrupoparametroformularioivaOrigen.getId());}}
			if(conDefault || (!conDefault && subgrupoparametroformularioivaOrigen.getnombre()!=null && !subgrupoparametroformularioivaOrigen.getnombre().equals(""))) {subgrupoparametroformularioiva.setnombre(subgrupoparametroformularioivaOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioSubGrupoParametroFormularioIva(SubGrupoParametroFormularioIva subgrupoparametroformularioiva) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jLabelidSubGrupoParametroFormularioIva.setText(subgrupoparametroformularioiva.getId().toString());
			this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jTextAreanombreSubGrupoParametroFormularioIva.setText(subgrupoparametroformularioiva.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioSubGrupoParametroFormularioIva(SubGrupoParametroFormularioIvaBean subgrupoparametroformularioivaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jLabelidSubGrupoParametroFormularioIva.setText(subgrupoparametroformularioivaBean.getId().toString());
			this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jTextAreanombreSubGrupoParametroFormularioIva.setText(subgrupoparametroformularioivaBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanSubGrupoParametroFormularioIva(SubGrupoParametroFormularioIvaParameterReturnGeneral subgrupoparametroformularioivaReturnGeneral,SubGrupoParametroFormularioIvaBean subgrupoparametroformularioivaBean,Boolean conDefault) throws Exception { 
		try {
			SubGrupoParametroFormularioIva subgrupoparametroformularioivaLocal=new SubGrupoParametroFormularioIva();
			
			subgrupoparametroformularioivaLocal=subgrupoparametroformularioivaReturnGeneral.getSubGrupoParametroFormularioIva();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && subgrupoparametroformularioivaLocal.getId()!=null && !subgrupoparametroformularioivaLocal.getId().equals(0L))) {subgrupoparametroformularioivaBean.setId(subgrupoparametroformularioivaLocal.getId());}}
			if(conDefault || (!conDefault && subgrupoparametroformularioivaLocal.getnombre()!=null && !subgrupoparametroformularioivaLocal.getnombre().equals(""))) {subgrupoparametroformularioivaBean.setnombre(subgrupoparametroformularioivaLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxSubGrupoParametroFormularioIvaGenerico(Long idSubGrupoParametroFormularioIvaSeleccionado,JComboBox jComboBoxSubGrupoParametroFormularioIva,List<SubGrupoParametroFormularioIva> subgrupoparametroformularioivasLocal)throws Exception {
		try {
			SubGrupoParametroFormularioIva  subgrupoparametroformularioivaTemp=null;

			for(SubGrupoParametroFormularioIva subgrupoparametroformularioivaAux:subgrupoparametroformularioivasLocal) {
				if(subgrupoparametroformularioivaAux.getId()!=null && subgrupoparametroformularioivaAux.getId().equals(idSubGrupoParametroFormularioIvaSeleccionado)) {
					subgrupoparametroformularioivaTemp=subgrupoparametroformularioivaAux;
					break;
				}
			}

			jComboBoxSubGrupoParametroFormularioIva.setSelectedItem(subgrupoparametroformularioivaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxSubGrupoParametroFormularioIvaGenerico(JComboBox jComboBoxSubGrupoParametroFormularioIva,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxSubGrupoParametroFormularioIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxSubGrupoParametroFormularioIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxSubGrupoParametroFormularioIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxSubGrupoParametroFormularioIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxSubGrupoParametroFormularioIva.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxSubGrupoParametroFormularioIva.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxSubGrupoParametroFormularioIva.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxSubGrupoParametroFormularioIva.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxSubGrupoParametroFormularioIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxSubGrupoParametroFormularioIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("ParametroFormularioIva")) {
			jButtonParametroFormularioIvaActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			subgrupoparametroformularioiva=(SubGrupoParametroFormularioIva) subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			subgrupoparametroformularioiva =(SubGrupoParametroFormularioIva) subgrupoparametroformularioivas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!subgrupoparametroformularioiva.getIsNew() && !subgrupoparametroformularioiva.getIsChanged() && !subgrupoparametroformularioiva.getIsDeleted()) {
				sDescripcion=subgrupoparametroformularioiva.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=subgrupoparametroformularioiva.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		SubGrupoParametroFormularioIva subgrupoparametroformularioivaRow=new SubGrupoParametroFormularioIva();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			subgrupoparametroformularioivaRow=(SubGrupoParametroFormularioIva) subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			subgrupoparametroformularioivaRow=(SubGrupoParametroFormularioIva) subgrupoparametroformularioivas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonParametroFormularioIvaActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,SubGrupoParametroFormularioIva subgrupoparametroformularioiva) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subgrupoparametroformularioivaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.subgrupoparametroformularioiva = (SubGrupoParametroFormularioIva)this.subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvas().toArray()[this.jTableDatosSubGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.subgrupoparametroformularioiva = (SubGrupoParametroFormularioIva)this.subgrupoparametroformularioivas.toArray()[this.jTableDatosSubGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(subgrupoparametroformularioiva!=null) {
						this.subgrupoparametroformularioiva = subgrupoparametroformularioiva;
					} else {
						this.subgrupoparametroformularioiva = new SubGrupoParametroFormularioIva();
					}
				}

				if(this.isTienePermisosParametroFormularioIva && this.permiteMantenimiento(this.subgrupoparametroformularioiva)) {
					ParametroFormularioIvaBeanSwingJInternalFrame parametroformularioivaBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFramePopup=new ParametroFormularioIvaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						parametroformularioivaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFramePopup;
					} else {
						parametroformularioivaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame;
					}

					List<SubGrupoParametroFormularioIva> subgrupoparametroformularioivas=new ArrayList<SubGrupoParametroFormularioIva>();
					subgrupoparametroformularioivas.add(this.subgrupoparametroformularioiva);
					if(!esRelacionado) {
						//parametroformularioivaBeanSwingJInternalFrame.parametroformularioivaSessionBean.setConGuardarRelaciones(false);
						//parametroformularioivaBeanSwingJInternalFrame.parametroformularioivaSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					parametroformularioivaBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.cargarParametroFormularioIvaBeanSwingJInternalFrame(subgrupoparametroformularioivas,this.subgrupoparametroformularioiva,parametroformularioivaBeanSwingJInternalFrame,/*conInicializar,*/parametroformularioivaBeanSwingJInternalFrame.parametroformularioivaSessionBean.getConGuardarRelaciones(),parametroformularioivaBeanSwingJInternalFrame.parametroformularioivaSessionBean.getEsGuardarRelacionado());
					parametroformularioivaBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						parametroformularioivaBeanSwingJInternalFrame.actualizarEstadoPanelsParametroFormularioIva("no_relacionado");

						parametroformularioivaBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ParametroFormularioIvaConstantesFunciones.ITAMANIOFILATABLA + (ParametroFormularioIvaConstantesFunciones.ITAMANIOFILATABLA/2));

						parametroformularioivaBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderSubGrupoParametroFormularioIva=(TitledBorder)this.jScrollPanelDatosSubGrupoParametroFormularioIva.getBorder();
						TitledBorder titledBorderParametroFormularioIva=(TitledBorder)parametroformularioivaBeanSwingJInternalFrame.jScrollPanelDatosParametroFormularioIva.getBorder();

						titledBorderParametroFormularioIva.setTitle(titledBorderSubGrupoParametroFormularioIva.getTitle() + " -> Parametro Formulario Iva");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,parametroformularioivaBeanSwingJInternalFrame);
						}

						parametroformularioivaBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(parametroformularioivaBeanSwingJInternalFrame);

						parametroformularioivaBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.subgrupoparametroformularioivaSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Parametro Formulario Iva",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subgrupoparametroformularioivaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subgrupoparametroformularioivaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subgrupoparametroformularioivaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualSubGrupoParametroFormularioIva(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoSubGrupoParametroFormularioIva.setVisible((this.isVisibilidadCeldaNuevoSubGrupoParametroFormularioIva && this.isPermisoNuevoSubGrupoParametroFormularioIva));			
			this.jButtonDuplicarSubGrupoParametroFormularioIva.setVisible((this.isVisibilidadCeldaDuplicarSubGrupoParametroFormularioIva && this.isPermisoDuplicarSubGrupoParametroFormularioIva));			
			this.jButtonCopiarSubGrupoParametroFormularioIva.setVisible((this.isVisibilidadCeldaCopiarSubGrupoParametroFormularioIva && this.isPermisoCopiarSubGrupoParametroFormularioIva));
			this.jButtonVerFormSubGrupoParametroFormularioIva.setVisible((this.isVisibilidadCeldaVerFormSubGrupoParametroFormularioIva && this.isPermisoVerFormSubGrupoParametroFormularioIva));
			
			this.jButtonAbrirOrderBySubGrupoParametroFormularioIva.setVisible((this.isVisibilidadCeldaOrdenSubGrupoParametroFormularioIva && this.isPermisoOrdenSubGrupoParametroFormularioIva));			
			
			this.jButtonNuevoRelacionesSubGrupoParametroFormularioIva.setVisible((this.isVisibilidadCeldaNuevoRelacionesSubGrupoParametroFormularioIva && this.isPermisoNuevoSubGrupoParametroFormularioIva));			
			this.jButtonNuevoGuardarCambiosSubGrupoParametroFormularioIva.setVisible((this.isVisibilidadCeldaNuevoSubGrupoParametroFormularioIva && this.isPermisoNuevoSubGrupoParametroFormularioIva && this.isPermisoGuardarCambiosSubGrupoParametroFormularioIva));
			
			if(this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva!=null) {
			this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jButtonModificarSubGrupoParametroFormularioIva.setVisible((this.isVisibilidadCeldaModificarSubGrupoParametroFormularioIva && this.isPermisoActualizarSubGrupoParametroFormularioIva));	
			this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jButtonActualizarSubGrupoParametroFormularioIva.setVisible((this.isVisibilidadCeldaActualizarSubGrupoParametroFormularioIva && this.isPermisoActualizarSubGrupoParametroFormularioIva));	
			this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jButtonEliminarSubGrupoParametroFormularioIva.setVisible((this.isVisibilidadCeldaEliminarSubGrupoParametroFormularioIva && this.isPermisoEliminarSubGrupoParametroFormularioIva));
			this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jButtonCancelarSubGrupoParametroFormularioIva.setVisible(this.isVisibilidadCeldaCancelarSubGrupoParametroFormularioIva);							
			this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jButtonGuardarCambiosSubGrupoParametroFormularioIva.setVisible((this.isVisibilidadCeldaGuardarSubGrupoParametroFormularioIva && this.isPermisoGuardarCambiosSubGrupoParametroFormularioIva));			
			
			}
						
			this.jButtonGuardarCambiosTablaSubGrupoParametroFormularioIva.setVisible((this.isVisibilidadCeldaGuardarCambiosSubGrupoParametroFormularioIva && this.isPermisoGuardarCambiosSubGrupoParametroFormularioIva));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarSubGrupoParametroFormularioIva.setVisible((this.isVisibilidadCeldaNuevoSubGrupoParametroFormularioIva && this.isPermisoNuevoSubGrupoParametroFormularioIva));						
			this.jButtonDuplicarToolBarSubGrupoParametroFormularioIva.setVisible((this.isVisibilidadCeldaDuplicarSubGrupoParametroFormularioIva && this.isPermisoDuplicarSubGrupoParametroFormularioIva));						
			this.jButtonCopiarToolBarSubGrupoParametroFormularioIva.setVisible((this.isVisibilidadCeldaCopiarSubGrupoParametroFormularioIva && this.isPermisoCopiarSubGrupoParametroFormularioIva));			
			this.jButtonVerFormToolBarSubGrupoParametroFormularioIva.setVisible((this.isVisibilidadCeldaVerFormSubGrupoParametroFormularioIva && this.isPermisoVerFormSubGrupoParametroFormularioIva));			
			this.jButtonAbrirOrderByToolBarSubGrupoParametroFormularioIva.setVisible((this.isVisibilidadCeldaOrdenSubGrupoParametroFormularioIva && this.isPermisoOrdenSubGrupoParametroFormularioIva));
			this.jButtonNuevoRelacionesToolBarSubGrupoParametroFormularioIva.setVisible((this.isVisibilidadCeldaNuevoRelacionesSubGrupoParametroFormularioIva && this.isPermisoNuevoSubGrupoParametroFormularioIva));			
			this.jButtonNuevoGuardarCambiosToolBarSubGrupoParametroFormularioIva.setVisible((this.isVisibilidadCeldaNuevoSubGrupoParametroFormularioIva && this.isPermisoNuevoSubGrupoParametroFormularioIva && this.isPermisoGuardarCambiosSubGrupoParametroFormularioIva));			
			
			if(this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva!=null) {
			this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jButtonModificarToolBarSubGrupoParametroFormularioIva.setVisible((this.isVisibilidadCeldaModificarSubGrupoParametroFormularioIva && this.isPermisoActualizarSubGrupoParametroFormularioIva));	
			this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jButtonActualizarToolBarSubGrupoParametroFormularioIva.setVisible((this.isVisibilidadCeldaActualizarSubGrupoParametroFormularioIva  && this.isPermisoActualizarSubGrupoParametroFormularioIva));	
			this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jButtonEliminarToolBarSubGrupoParametroFormularioIva.setVisible((this.isVisibilidadCeldaEliminarSubGrupoParametroFormularioIva && this.isPermisoEliminarSubGrupoParametroFormularioIva));
			this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jButtonCancelarToolBarSubGrupoParametroFormularioIva.setVisible(this.isVisibilidadCeldaCancelarSubGrupoParametroFormularioIva);				
			this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jButtonGuardarCambiosToolBarSubGrupoParametroFormularioIva.setVisible((this.isVisibilidadCeldaGuardarSubGrupoParametroFormularioIva && this.isPermisoGuardarCambiosSubGrupoParametroFormularioIva));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarSubGrupoParametroFormularioIva.setVisible((this.isVisibilidadCeldaGuardarCambiosSubGrupoParametroFormularioIva && this.isPermisoGuardarCambiosSubGrupoParametroFormularioIva));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoSubGrupoParametroFormularioIva.setVisible((this.isVisibilidadCeldaNuevoSubGrupoParametroFormularioIva && this.isPermisoNuevoSubGrupoParametroFormularioIva));			
			this.jMenuItemDuplicarSubGrupoParametroFormularioIva.setVisible((this.isVisibilidadCeldaDuplicarSubGrupoParametroFormularioIva && this.isPermisoDuplicarSubGrupoParametroFormularioIva));			
			this.jMenuItemCopiarSubGrupoParametroFormularioIva.setVisible((this.isVisibilidadCeldaCopiarSubGrupoParametroFormularioIva && this.isPermisoCopiarSubGrupoParametroFormularioIva));			
			this.jMenuItemVerFormSubGrupoParametroFormularioIva.setVisible((this.isVisibilidadCeldaVerFormSubGrupoParametroFormularioIva && this.isPermisoVerFormSubGrupoParametroFormularioIva));			
			this.jMenuItemAbrirOrderBySubGrupoParametroFormularioIva.setVisible((this.isVisibilidadCeldaOrdenSubGrupoParametroFormularioIva && this.isPermisoOrdenSubGrupoParametroFormularioIva));			
			//this.jMenuItemMostrarOcultarSubGrupoParametroFormularioIva.setVisible((this.isVisibilidadCeldaOrdenSubGrupoParametroFormularioIva && this.isPermisoOrdenSubGrupoParametroFormularioIva));
			this.jMenuItemDetalleAbrirOrderBySubGrupoParametroFormularioIva.setVisible((this.isVisibilidadCeldaOrdenSubGrupoParametroFormularioIva && this.isPermisoOrdenSubGrupoParametroFormularioIva));			
			//this.jMenuItemDetalleMostrarOcultarSubGrupoParametroFormularioIva.setVisible((this.isVisibilidadCeldaOrdenSubGrupoParametroFormularioIva && this.isPermisoOrdenSubGrupoParametroFormularioIva));			
			this.jMenuItemNuevoRelacionesSubGrupoParametroFormularioIva.setVisible((this.isVisibilidadCeldaNuevoRelacionesSubGrupoParametroFormularioIva && this.isPermisoNuevoSubGrupoParametroFormularioIva));			
			this.jMenuItemNuevoGuardarCambiosSubGrupoParametroFormularioIva.setVisible((this.isVisibilidadCeldaNuevoSubGrupoParametroFormularioIva && this.isPermisoNuevoSubGrupoParametroFormularioIva && this.isPermisoGuardarCambiosSubGrupoParametroFormularioIva));									
			
			if(this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva!=null) {
			this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jMenuItemModificarSubGrupoParametroFormularioIva.setVisible((this.isVisibilidadCeldaModificarSubGrupoParametroFormularioIva && this.isPermisoActualizarSubGrupoParametroFormularioIva));	
			this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jMenuItemActualizarSubGrupoParametroFormularioIva.setVisible((this.isVisibilidadCeldaActualizarSubGrupoParametroFormularioIva && this.isPermisoActualizarSubGrupoParametroFormularioIva));	
			this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jMenuItemEliminarSubGrupoParametroFormularioIva.setVisible((this.isVisibilidadCeldaEliminarSubGrupoParametroFormularioIva && this.isPermisoEliminarSubGrupoParametroFormularioIva));
			this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jMenuItemCancelarSubGrupoParametroFormularioIva.setVisible(this.isVisibilidadCeldaCancelarSubGrupoParametroFormularioIva);				
			}
			
			this.jMenuItemGuardarCambiosSubGrupoParametroFormularioIva.setVisible((this.isVisibilidadCeldaGuardarSubGrupoParametroFormularioIva && this.isPermisoGuardarCambiosSubGrupoParametroFormularioIva));						
			this.jMenuItemGuardarCambiosTablaSubGrupoParametroFormularioIva.setVisible((this.isVisibilidadCeldaGuardarCambiosSubGrupoParametroFormularioIva && this.isPermisoGuardarCambiosSubGrupoParametroFormularioIva));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoSubGrupoParametroFormularioIva=this.jButtonNuevoSubGrupoParametroFormularioIva.isVisible();
			this.isVisibilidadCeldaDuplicarSubGrupoParametroFormularioIva=this.jButtonDuplicarSubGrupoParametroFormularioIva.isVisible();
			this.isVisibilidadCeldaCopiarSubGrupoParametroFormularioIva=this.jButtonCopiarSubGrupoParametroFormularioIva.isVisible();
			this.isVisibilidadCeldaVerFormSubGrupoParametroFormularioIva=this.jButtonVerFormSubGrupoParametroFormularioIva.isVisible();
			
			this.isVisibilidadCeldaOrdenSubGrupoParametroFormularioIva=this.jButtonAbrirOrderBySubGrupoParametroFormularioIva.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesSubGrupoParametroFormularioIva=this.jButtonNuevoRelacionesSubGrupoParametroFormularioIva.isVisible();
			this.isVisibilidadCeldaModificarSubGrupoParametroFormularioIva=this.jButtonModificarSubGrupoParametroFormularioIva.isVisible();
			
			if(this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva!=null) {
			this.isVisibilidadCeldaActualizarSubGrupoParametroFormularioIva=this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jButtonActualizarSubGrupoParametroFormularioIva.isVisible();
			this.isVisibilidadCeldaEliminarSubGrupoParametroFormularioIva=this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jButtonEliminarSubGrupoParametroFormularioIva.isVisible();
			this.isVisibilidadCeldaCancelarSubGrupoParametroFormularioIva=this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jButtonCancelarSubGrupoParametroFormularioIva.isVisible();
			this.isVisibilidadCeldaGuardarSubGrupoParametroFormularioIva=this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jButtonGuardarCambiosSubGrupoParametroFormularioIva.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosSubGrupoParametroFormularioIva=this.jButtonGuardarCambiosTablaSubGrupoParametroFormularioIva.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoSubGrupoParametroFormularioIva=this.jButtonNuevoToolBarSubGrupoParametroFormularioIva.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesSubGrupoParametroFormularioIva=this.jButtonNuevoRelacionesToolBarSubGrupoParametroFormularioIva.isVisible();
			
			if(this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva!=null) {
			this.isVisibilidadCeldaModificarSubGrupoParametroFormularioIva=this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jButtonModificarToolBarSubGrupoParametroFormularioIva.isVisible();
			this.isVisibilidadCeldaActualizarSubGrupoParametroFormularioIva=this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jButtonActualizarToolBarSubGrupoParametroFormularioIva.isVisible();
			this.isVisibilidadCeldaEliminarSubGrupoParametroFormularioIva=this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jButtonEliminarToolBarSubGrupoParametroFormularioIva.isVisible();
			this.isVisibilidadCeldaCancelarSubGrupoParametroFormularioIva=this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jButtonCancelarToolBarSubGrupoParametroFormularioIva.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarSubGrupoParametroFormularioIva=this.jButtonGuardarCambiosToolBarSubGrupoParametroFormularioIva.isVisible();
			this.isVisibilidadCeldaGuardarCambiosSubGrupoParametroFormularioIva=this.jButtonGuardarCambiosTablaToolBarSubGrupoParametroFormularioIva.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoSubGrupoParametroFormularioIva=this.jMenuItemNuevoSubGrupoParametroFormularioIva.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesSubGrupoParametroFormularioIva=this.jMenuItemNuevoRelacionesSubGrupoParametroFormularioIva.isVisible();
			
			if(this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva!=null) {
			this.isVisibilidadCeldaModificarSubGrupoParametroFormularioIva=this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jMenuItemModificarSubGrupoParametroFormularioIva.isVisible();
			this.isVisibilidadCeldaActualizarSubGrupoParametroFormularioIva=this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jMenuItemActualizarSubGrupoParametroFormularioIva.isVisible();
			this.isVisibilidadCeldaEliminarSubGrupoParametroFormularioIva=this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jMenuItemEliminarSubGrupoParametroFormularioIva.isVisible();
			this.isVisibilidadCeldaCancelarSubGrupoParametroFormularioIva=this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jMenuItemCancelarSubGrupoParametroFormularioIva.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarSubGrupoParametroFormularioIva=this.jMenuItemGuardarCambiosSubGrupoParametroFormularioIva.isVisible();
			this.isVisibilidadCeldaGuardarCambiosSubGrupoParametroFormularioIva=this.jMenuItemGuardarCambiosTablaSubGrupoParametroFormularioIva.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesSubGrupoParametroFormularioIva(Boolean esInicializar) {
		if(SubGrupoParametroFormularioIvaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.subgrupoparametroformularioivaSessionBean.getConGuardarRelaciones()) {
				//if(this.subgrupoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesSubGrupoParametroFormularioIva();
			}
			
			this.inicializarActualizarBindingBotonesManualSubGrupoParametroFormularioIva(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualSubGrupoParametroFormularioIva() {
		this.jButtonNuevoSubGrupoParametroFormularioIva.setVisible(this.isPermisoNuevoSubGrupoParametroFormularioIva);			
		this.jButtonDuplicarSubGrupoParametroFormularioIva.setVisible(this.isPermisoDuplicarSubGrupoParametroFormularioIva);			
		this.jButtonCopiarSubGrupoParametroFormularioIva.setVisible(this.isPermisoCopiarSubGrupoParametroFormularioIva);			
		this.jButtonVerFormSubGrupoParametroFormularioIva.setVisible(this.isPermisoVerFormSubGrupoParametroFormularioIva);			
		
		this.jButtonAbrirOrderBySubGrupoParametroFormularioIva.setVisible(this.isPermisoOrdenSubGrupoParametroFormularioIva);					
		
		this.jButtonNuevoRelacionesSubGrupoParametroFormularioIva.setVisible(this.isPermisoNuevoSubGrupoParametroFormularioIva);			
		
		if(this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jButtonModificarSubGrupoParametroFormularioIva.setVisible(this.isPermisoActualizarSubGrupoParametroFormularioIva);	
			this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jButtonActualizarSubGrupoParametroFormularioIva.setVisible(this.isPermisoActualizarSubGrupoParametroFormularioIva);	
			this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jButtonEliminarSubGrupoParametroFormularioIva.setVisible(this.isPermisoEliminarSubGrupoParametroFormularioIva);
			this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jButtonCancelarSubGrupoParametroFormularioIva.setVisible(this.isVisibilidadCeldaCancelarSubGrupoParametroFormularioIva);						
			this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jButtonGuardarCambiosSubGrupoParametroFormularioIva.setVisible(this.isPermisoGuardarCambiosSubGrupoParametroFormularioIva);							
		}
		
		this.jButtonGuardarCambiosTablaSubGrupoParametroFormularioIva.setVisible(this.isPermisoActualizarSubGrupoParametroFormularioIva);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleSubGrupoParametroFormularioIva() {
		this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jButtonModificarSubGrupoParametroFormularioIva.setVisible(this.isPermisoActualizarSubGrupoParametroFormularioIva);	
		this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jButtonActualizarSubGrupoParametroFormularioIva.setVisible(this.isPermisoActualizarSubGrupoParametroFormularioIva);	
		this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jButtonEliminarSubGrupoParametroFormularioIva.setVisible(this.isPermisoEliminarSubGrupoParametroFormularioIva);
		this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jButtonCancelarSubGrupoParametroFormularioIva.setVisible(this.isVisibilidadCeldaCancelarSubGrupoParametroFormularioIva);							
		this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jButtonGuardarCambiosSubGrupoParametroFormularioIva.setVisible((this.isVisibilidadCeldaGuardarSubGrupoParametroFormularioIva && this.isPermisoGuardarCambiosSubGrupoParametroFormularioIva));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosSubGrupoParametroFormularioIva() {
		if(SubGrupoParametroFormularioIvaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualSubGrupoParametroFormularioIva();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesSubGrupoParametroFormularioIva() {
	}
	
	public void jTableDatosSubGrupoParametroFormularioIvaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarSubGrupoParametroFormularioIva(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidSubGrupoParametroFormularioIvaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subgrupoparametroformularioivaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSubGrupoParametroFormularioIva.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSubGrupoParametroFormularioIva(this.getsubgrupoparametroformularioiva(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSubGrupoParametroFormularioIva(this.subgrupoparametroformularioiva);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.subgrupoparametroformularioiva =(SubGrupoParametroFormularioIva) this.subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvas().toArray()[this.jTableDatosSubGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.subgrupoparametroformularioiva =(SubGrupoParametroFormularioIva) this.subgrupoparametroformularioivas.toArray()[this.jTableDatosSubGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.subgrupoparametroformularioiva==null) {
						this.subgrupoparametroformularioiva = new SubGrupoParametroFormularioIva();
					}

					this.setVariablesFormularioToObjetoActualSubGrupoParametroFormularioIva(this.subgrupoparametroformularioiva,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSubGrupoParametroFormularioIva(this.subgrupoparametroformularioiva);
				}

				if(this.subgrupoparametroformularioiva.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.subgrupoparametroformularioiva.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSubGrupoParametroFormularioIva(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subgrupoparametroformularioivaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subgrupoparametroformularioivaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subgrupoparametroformularioivaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaSubGrupoParametroFormularioIvaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subgrupoparametroformularioivaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebSubGrupoParametroFormularioIva(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSubGrupoParametroFormularioIva.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosSubGrupoParametroFormularioIva.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosSubGrupoParametroFormularioIva.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subgrupoparametroformularioiva =(SubGrupoParametroFormularioIva) this.subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvas().toArray()[this.jTableDatosSubGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.subgrupoparametroformularioiva =(SubGrupoParametroFormularioIva) this.subgrupoparametroformularioivas.toArray()[this.jTableDatosSubGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualSubGrupoParametroFormularioIva(this.getsubgrupoparametroformularioiva(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysSubGrupoParametroFormularioIva(this.subgrupoparametroformularioiva);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.subgrupoparametroformularioivaLogic.getConnexion());

				if(this.subgrupoparametroformularioiva.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.subgrupoparametroformularioiva.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderSubGrupoParametroFormularioIva=(TitledBorder)this.jScrollPanelDatosSubGrupoParametroFormularioIva.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderSubGrupoParametroFormularioIva.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subgrupoparametroformularioivaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subgrupoparametroformularioivaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subgrupoparametroformularioivaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaSubGrupoParametroFormularioIvaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subgrupoparametroformularioivaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSubGrupoParametroFormularioIva.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSubGrupoParametroFormularioIva(this.getsubgrupoparametroformularioiva(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSubGrupoParametroFormularioIva(this.subgrupoparametroformularioiva);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.subgrupoparametroformularioiva =(SubGrupoParametroFormularioIva) this.subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvas().toArray()[this.jTableDatosSubGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.subgrupoparametroformularioiva =(SubGrupoParametroFormularioIva) this.subgrupoparametroformularioivas.toArray()[this.jTableDatosSubGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.subgrupoparametroformularioiva==null) {
						this.subgrupoparametroformularioiva = new SubGrupoParametroFormularioIva();
					}

					this.setVariablesFormularioToObjetoActualSubGrupoParametroFormularioIva(this.subgrupoparametroformularioiva,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSubGrupoParametroFormularioIva(this.subgrupoparametroformularioiva);
				}

				if(this.subgrupoparametroformularioiva.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.subgrupoparametroformularioiva.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSubGrupoParametroFormularioIva(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subgrupoparametroformularioivaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subgrupoparametroformularioivaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subgrupoparametroformularioivaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreSubGrupoParametroFormularioIvaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subgrupoparametroformularioivaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSubGrupoParametroFormularioIva.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSubGrupoParametroFormularioIva(this.getsubgrupoparametroformularioiva(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSubGrupoParametroFormularioIva(this.subgrupoparametroformularioiva);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.subgrupoparametroformularioiva =(SubGrupoParametroFormularioIva) this.subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvas().toArray()[this.jTableDatosSubGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.subgrupoparametroformularioiva =(SubGrupoParametroFormularioIva) this.subgrupoparametroformularioivas.toArray()[this.jTableDatosSubGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.subgrupoparametroformularioiva==null) {
						this.subgrupoparametroformularioiva = new SubGrupoParametroFormularioIva();
					}

					this.setVariablesFormularioToObjetoActualSubGrupoParametroFormularioIva(this.subgrupoparametroformularioiva,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSubGrupoParametroFormularioIva(this.subgrupoparametroformularioiva);
				}

				if(this.subgrupoparametroformularioiva.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.subgrupoparametroformularioiva.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSubGrupoParametroFormularioIva(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subgrupoparametroformularioivaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subgrupoparametroformularioivaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subgrupoparametroformularioivaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorIdSubGrupoParametroFormularioIvaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subgrupoparametroformularioivaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSubGrupoParametroFormularioIva(false,false);

			this.getSubGrupoParametroFormularioIvasBusquedaPorId();

			this.inicializarActualizarBindingSubGrupoParametroFormularioIva(false);

			//if(SubGrupoParametroFormularioIvaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSubGrupoParametroFormularioIva(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subgrupoparametroformularioivaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subgrupoparametroformularioivaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subgrupoparametroformularioivaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorNombreSubGrupoParametroFormularioIvaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subgrupoparametroformularioivaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSubGrupoParametroFormularioIva(false,false);

			this.getSubGrupoParametroFormularioIvasBusquedaPorNombre();

			this.inicializarActualizarBindingSubGrupoParametroFormularioIva(false);

			//if(SubGrupoParametroFormularioIvaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSubGrupoParametroFormularioIva(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subgrupoparametroformularioivaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subgrupoparametroformularioivaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subgrupoparametroformularioivaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaSubGrupoParametroFormularioIvaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subgrupoparametroformularioivaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSubGrupoParametroFormularioIva(false,false);

			this.getSubGrupoParametroFormularioIvasFK_IdEmpresa();

			this.inicializarActualizarBindingSubGrupoParametroFormularioIva(false);

			//if(SubGrupoParametroFormularioIvaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSubGrupoParametroFormularioIva(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subgrupoparametroformularioivaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subgrupoparametroformularioivaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subgrupoparametroformularioivaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameSubGrupoParametroFormularioIva() {
		if(this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva!=null) {
		

		if(this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva!=null) {
			this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.setVisible(false);	    			
			this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.dispose();
			this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoSubGrupoParametroFormularioIva!=null) {
			this.jInternalFrameReporteDinamicoSubGrupoParametroFormularioIva.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoSubGrupoParametroFormularioIva.dispose();
			this.jInternalFrameReporteDinamicoSubGrupoParametroFormularioIva=null;
		}
		
		if(this.jInternalFrameImportacionSubGrupoParametroFormularioIva!=null) {
			this.jInternalFrameImportacionSubGrupoParametroFormularioIva.setVisible(false);	    			
			this.jInternalFrameImportacionSubGrupoParametroFormularioIva.dispose();
			this.jInternalFrameImportacionSubGrupoParametroFormularioIva=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessSubGrupoParametroFormularioIva();
			
			SubGrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.subgrupoparametroformularioiva,new Object(),this.subgrupoparametroformularioivaParameterGeneral,this.subgrupoparametroformularioivaReturnGeneral);
			
			
			if(sTipo.equals("NuevoSubGrupoParametroFormularioIva")) {
				jButtonNuevoSubGrupoParametroFormularioIvaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarSubGrupoParametroFormularioIva")) {
				jButtonDuplicarSubGrupoParametroFormularioIvaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarSubGrupoParametroFormularioIva")) {
				jButtonCopiarSubGrupoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("VerFormSubGrupoParametroFormularioIva")) {
				jButtonVerFormSubGrupoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarSubGrupoParametroFormularioIva")) {
				jButtonNuevoSubGrupoParametroFormularioIvaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarSubGrupoParametroFormularioIva")) {
				jButtonDuplicarSubGrupoParametroFormularioIvaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoSubGrupoParametroFormularioIva")) {
				jButtonNuevoSubGrupoParametroFormularioIvaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarSubGrupoParametroFormularioIva")) {
				jButtonDuplicarSubGrupoParametroFormularioIvaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesSubGrupoParametroFormularioIva")) {
				jButtonNuevoSubGrupoParametroFormularioIvaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarSubGrupoParametroFormularioIva")) {
				jButtonNuevoSubGrupoParametroFormularioIvaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesSubGrupoParametroFormularioIva")) {
				jButtonNuevoSubGrupoParametroFormularioIvaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarSubGrupoParametroFormularioIva")) {
				jButtonModificarSubGrupoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarSubGrupoParametroFormularioIva")) {
				jButtonModificarSubGrupoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarSubGrupoParametroFormularioIva")) {
				jButtonModificarSubGrupoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarSubGrupoParametroFormularioIva")) {
				jButtonActualizarSubGrupoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarSubGrupoParametroFormularioIva")) {
				jButtonActualizarSubGrupoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarSubGrupoParametroFormularioIva")) {
				jButtonActualizarSubGrupoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("EliminarSubGrupoParametroFormularioIva")) {
				jButtonEliminarSubGrupoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarSubGrupoParametroFormularioIva")) {
				jButtonEliminarSubGrupoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarSubGrupoParametroFormularioIva")) {
				jButtonEliminarSubGrupoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("CancelarSubGrupoParametroFormularioIva")) {
				jButtonCancelarSubGrupoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarSubGrupoParametroFormularioIva")) {
				jButtonCancelarSubGrupoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarSubGrupoParametroFormularioIva")) {
				jButtonCancelarSubGrupoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("CerrarSubGrupoParametroFormularioIva")) {
				jButtonCerrarSubGrupoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarSubGrupoParametroFormularioIva")) {
				jButtonCerrarSubGrupoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarSubGrupoParametroFormularioIva")) {
				jButtonCerrarSubGrupoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarSubGrupoParametroFormularioIva")) {
				jButtonMostrarOcultarSubGrupoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarSubGrupoParametroFormularioIva")) {
				jButtonCancelarSubGrupoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosSubGrupoParametroFormularioIva")) {
				jButtonGuardarCambiosSubGrupoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarSubGrupoParametroFormularioIva")) {
				jButtonGuardarCambiosSubGrupoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarSubGrupoParametroFormularioIva")) {
				jButtonCopiarSubGrupoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarSubGrupoParametroFormularioIva")) {
				jButtonVerFormSubGrupoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosSubGrupoParametroFormularioIva")) {
				jButtonGuardarCambiosSubGrupoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarSubGrupoParametroFormularioIva")) {
				jButtonCopiarSubGrupoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormSubGrupoParametroFormularioIva")) {
				jButtonVerFormSubGrupoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaSubGrupoParametroFormularioIva")) {
				jButtonGuardarCambiosSubGrupoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarSubGrupoParametroFormularioIva")) {
				jButtonGuardarCambiosSubGrupoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaSubGrupoParametroFormularioIva")) {
				jButtonGuardarCambiosSubGrupoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionSubGrupoParametroFormularioIva")) {
				jButtonRecargarInformacionSubGrupoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarSubGrupoParametroFormularioIva")) {
				jButtonRecargarInformacionSubGrupoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionSubGrupoParametroFormularioIva")) {
				jButtonRecargarInformacionSubGrupoParametroFormularioIvaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresSubGrupoParametroFormularioIva")) {
				jButtonAnterioresSubGrupoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarSubGrupoParametroFormularioIva")) {
				jButtonAnterioresSubGrupoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreSubGrupoParametroFormularioIva")) {
				jButtonAnterioresSubGrupoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesSubGrupoParametroFormularioIva")) {
				jButtonSiguientesSubGrupoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarSubGrupoParametroFormularioIva")) {
				jButtonSiguientesSubGrupoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesSubGrupoParametroFormularioIva")) {
				jButtonSiguientesSubGrupoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderBySubGrupoParametroFormularioIva") || sTipo.equals("MenuItemDetalleAbrirOrderBySubGrupoParametroFormularioIva")) {
				jButtonAbrirOrderBySubGrupoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarSubGrupoParametroFormularioIva") || sTipo.equals("MenuItemDetalleMostrarOcultarSubGrupoParametroFormularioIva")) {
				jButtonMostrarOcultarSubGrupoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosSubGrupoParametroFormularioIva")) {
				jButtonNuevoGuardarCambiosSubGrupoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarSubGrupoParametroFormularioIva")) {
				jButtonNuevoGuardarCambiosSubGrupoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosSubGrupoParametroFormularioIva")) {
				jButtonNuevoGuardarCambiosSubGrupoParametroFormularioIvaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoSubGrupoParametroFormularioIva")) {
				jButtonCerrarReporteDinamicoSubGrupoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoSubGrupoParametroFormularioIva")) {
				jButtonGenerarReporteDinamicoSubGrupoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoSubGrupoParametroFormularioIva")) {
				
				jButtonGenerarExcelReporteDinamicoSubGrupoParametroFormularioIvaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionSubGrupoParametroFormularioIva")) {
				jButtonCerrarImportacionSubGrupoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionSubGrupoParametroFormularioIva")) {
				
				jButtonGenerarImportacionSubGrupoParametroFormularioIvaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionSubGrupoParametroFormularioIva")) {
				
				jButtonAbrirImportacionSubGrupoParametroFormularioIvaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesSubGrupoParametroFormularioIva")) {
				jComboBoxTiposAccionesSubGrupoParametroFormularioIvaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesSubGrupoParametroFormularioIva")) {
				jComboBoxTiposRelacionesSubGrupoParametroFormularioIvaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioSubGrupoParametroFormularioIva")) {
				jComboBoxTiposAccionesSubGrupoParametroFormularioIvaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarSubGrupoParametroFormularioIva")) {
				
				jComboBoxTiposSeleccionarSubGrupoParametroFormularioIvaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralSubGrupoParametroFormularioIva")) {
				jTextFieldValorCampoGeneralSubGrupoParametroFormularioIvaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderBySubGrupoParametroFormularioIva")) {
				jButtonAbrirOrderBySubGrupoParametroFormularioIvaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarSubGrupoParametroFormularioIva")) {
				jButtonAbrirOrderBySubGrupoParametroFormularioIvaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderBySubGrupoParametroFormularioIva")) {
				jButtonCerrarOrderBySubGrupoParametroFormularioIvaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idSubGrupoParametroFormularioIvaBusqueda")) {
				this.jButtonidSubGrupoParametroFormularioIvaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaSubGrupoParametroFormularioIvaUpdate")) {
				this.jButtonid_empresaSubGrupoParametroFormularioIvaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaSubGrupoParametroFormularioIvaBusqueda")) {
				this.jButtonid_empresaSubGrupoParametroFormularioIvaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreSubGrupoParametroFormularioIvaBusqueda")) {
				this.jButtonnombreSubGrupoParametroFormularioIvaBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorIdSubGrupoParametroFormularioIva")) {
				this.jButtonBusquedaPorIdSubGrupoParametroFormularioIvaActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorNombreSubGrupoParametroFormularioIva")) {
				this.jButtonBusquedaPorNombreSubGrupoParametroFormularioIvaActionPerformed(evt);
			}
			
			;
			
			
			SubGrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.subgrupoparametroformularioiva,new Object(),this.subgrupoparametroformularioivaParameterGeneral,this.subgrupoparametroformularioivaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessSubGrupoParametroFormularioIva();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSubGrupoParametroFormularioIvaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.subgrupoparametroformularioiva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.subgrupoparametroformularioiva);
				
				SubGrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.subgrupoparametroformularioiva,new Object(),this.subgrupoparametroformularioivaParameterGeneral,this.subgrupoparametroformularioivaReturnGeneral);
				
				


				
				SubGrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.subgrupoparametroformularioiva,new Object(),this.subgrupoparametroformularioivaParameterGeneral,this.subgrupoparametroformularioivaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SubGrupoParametroFormularioIva.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SubGrupoParametroFormularioIva.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			SubGrupoParametroFormularioIva subgrupoparametroformularioivaLocal=null;
			
			if(!this.getEsControlTabla()) {
				subgrupoparametroformularioivaLocal=this.subgrupoparametroformularioiva;
			} else {
				subgrupoparametroformularioivaLocal=this.subgrupoparametroformularioivaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.subgrupoparametroformularioiva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.subgrupoparametroformularioiva);
				
				SubGrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.subgrupoparametroformularioiva,new Object(),this.subgrupoparametroformularioivaParameterGeneral,this.subgrupoparametroformularioivaReturnGeneral);
							
				
				


				
				SubGrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.subgrupoparametroformularioiva,new Object(),this.subgrupoparametroformularioivaParameterGeneral,this.subgrupoparametroformularioivaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SubGrupoParametroFormularioIva.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SubGrupoParametroFormularioIva.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSubGrupoParametroFormularioIvaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSubGrupoParametroFormularioIva.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subgrupoparametroformularioivaAnterior =(SubGrupoParametroFormularioIva) this.subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvas().toArray()[this.jTableDatosSubGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.subgrupoparametroformularioivaAnterior =(SubGrupoParametroFormularioIva) this.subgrupoparametroformularioivas.toArray()[this.jTableDatosSubGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
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
			
			SubGrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.subgrupoparametroformularioiva,new Object(),this.subgrupoparametroformularioivaParameterGeneral,this.subgrupoparametroformularioivaReturnGeneral);
			
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
			
			


			
			SubGrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.subgrupoparametroformularioiva,new Object(),this.subgrupoparametroformularioivaParameterGeneral,this.subgrupoparametroformularioivaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSubGrupoParametroFormularioIvaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.subgrupoparametroformularioiva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.subgrupoparametroformularioiva);
				
				SubGrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.subgrupoparametroformularioiva,new Object(),this.subgrupoparametroformularioivaParameterGeneral,this.subgrupoparametroformularioivaReturnGeneral);
								
						
				


				
				SubGrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.subgrupoparametroformularioiva,new Object(),this.subgrupoparametroformularioivaParameterGeneral,this.subgrupoparametroformularioivaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SubGrupoParametroFormularioIva.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SubGrupoParametroFormularioIva.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.subgrupoparametroformularioiva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.subgrupoparametroformularioiva);
				
				SubGrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.subgrupoparametroformularioiva,new Object(),this.subgrupoparametroformularioivaParameterGeneral,this.subgrupoparametroformularioivaReturnGeneral);
								
				
				


				
				SubGrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.subgrupoparametroformularioiva,new Object(),this.subgrupoparametroformularioivaParameterGeneral,this.subgrupoparametroformularioivaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SubGrupoParametroFormularioIva.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SubGrupoParametroFormularioIva.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSubGrupoParametroFormularioIvaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSubGrupoParametroFormularioIva.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subgrupoparametroformularioivaAnterior =(SubGrupoParametroFormularioIva) this.subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvas().toArray()[this.jTableDatosSubGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.subgrupoparametroformularioivaAnterior =(SubGrupoParametroFormularioIva) this.subgrupoparametroformularioivas.toArray()[this.jTableDatosSubGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.subgrupoparametroformularioiva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.subgrupoparametroformularioiva);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSubGrupoParametroFormularioIvaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSubGrupoParametroFormularioIva.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subgrupoparametroformularioivaAnterior =(SubGrupoParametroFormularioIva) this.subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvas().toArray()[this.jTableDatosSubGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.subgrupoparametroformularioivaAnterior =(SubGrupoParametroFormularioIva) this.subgrupoparametroformularioivas.toArray()[this.jTableDatosSubGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSubGrupoParametroFormularioIvaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.subgrupoparametroformularioiva);
			
			this.actualizarInformacion("INFO_PADRE",false,this.subgrupoparametroformularioiva);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.subgrupoparametroformularioiva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.subgrupoparametroformularioiva);
				
				SubGrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.subgrupoparametroformularioiva,new Object(),this.subgrupoparametroformularioivaParameterGeneral,this.subgrupoparametroformularioivaReturnGeneral);
							
				
				


				
				SubGrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.subgrupoparametroformularioiva,new Object(),this.subgrupoparametroformularioivaParameterGeneral,this.subgrupoparametroformularioivaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SubGrupoParametroFormularioIva.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SubGrupoParametroFormularioIva.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSubGrupoParametroFormularioIvaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosSubGrupoParametroFormularioIva.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.subgrupoparametroformularioivaAnterior =(SubGrupoParametroFormularioIva) this.subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvas().toArray()[this.jTableDatosSubGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.subgrupoparametroformularioivaAnterior =(SubGrupoParametroFormularioIva) this.subgrupoparametroformularioivas.toArray()[this.jTableDatosSubGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
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
			
			SubGrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.subgrupoparametroformularioiva,new Object(),this.subgrupoparametroformularioivaParameterGeneral,this.subgrupoparametroformularioivaReturnGeneral);
			
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
			
			


			
			SubGrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.subgrupoparametroformularioiva,new Object(),this.subgrupoparametroformularioivaParameterGeneral,this.subgrupoparametroformularioivaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSubGrupoParametroFormularioIvaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.subgrupoparametroformularioiva);
			
			this.actualizarInformacion("INFO_PADRE",false,this.subgrupoparametroformularioiva);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.subgrupoparametroformularioiva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.subgrupoparametroformularioiva);
				
				SubGrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.subgrupoparametroformularioiva,new Object(),this.subgrupoparametroformularioivaParameterGeneral,this.subgrupoparametroformularioivaReturnGeneral);
								
				
				


				
				SubGrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.subgrupoparametroformularioiva,new Object(),this.subgrupoparametroformularioivaParameterGeneral,this.subgrupoparametroformularioivaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SubGrupoParametroFormularioIva.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SubGrupoParametroFormularioIva.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSubGrupoParametroFormularioIvaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSubGrupoParametroFormularioIva.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subgrupoparametroformularioivaAnterior =(SubGrupoParametroFormularioIva) this.subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvas().toArray()[this.jTableDatosSubGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.subgrupoparametroformularioivaAnterior =(SubGrupoParametroFormularioIva) this.subgrupoparametroformularioivas.toArray()[this.jTableDatosSubGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSubGrupoParametroFormularioIvaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.subgrupoparametroformularioiva);
			
			this.actualizarInformacion("INFO_PADRE",false,this.subgrupoparametroformularioiva);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSubGrupoParametroFormularioIvaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.subgrupoparametroformularioiva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.subgrupoparametroformularioiva);
				
				SubGrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.subgrupoparametroformularioiva,new Object(),this.subgrupoparametroformularioivaParameterGeneral,this.subgrupoparametroformularioivaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosSubGrupoParametroFormularioIva")) {
					jCheckBoxSeleccionarTodosSubGrupoParametroFormularioIvaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosSubGrupoParametroFormularioIva")) {
					jCheckBoxSeleccionadosSubGrupoParametroFormularioIvaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarSubGrupoParametroFormularioIva")) {
					
				}
				
				


				
				
				SubGrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.subgrupoparametroformularioiva,new Object(),this.subgrupoparametroformularioivaParameterGeneral,this.subgrupoparametroformularioivaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SubGrupoParametroFormularioIva.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SubGrupoParametroFormularioIva.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.subgrupoparametroformularioiva);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.subgrupoparametroformularioiva);
				
				SubGrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.subgrupoparametroformularioiva,new Object(),this.subgrupoparametroformularioivaParameterGeneral,this.subgrupoparametroformularioivaReturnGeneral);
												
				
				


				
				
				SubGrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.subgrupoparametroformularioiva,new Object(),this.subgrupoparametroformularioivaParameterGeneral,this.subgrupoparametroformularioivaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SubGrupoParametroFormularioIva.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SubGrupoParametroFormularioIva.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSubGrupoParametroFormularioIvaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosSubGrupoParametroFormularioIva.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.subgrupoparametroformularioivaAnterior =(SubGrupoParametroFormularioIva) this.subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvas().toArray()[this.jTableDatosSubGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.subgrupoparametroformularioivaAnterior =(SubGrupoParametroFormularioIva) this.subgrupoparametroformularioivas.toArray()[this.jTableDatosSubGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSubGrupoParametroFormularioIvaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.subgrupoparametroformularioiva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.subgrupoparametroformularioiva);
				
				SubGrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.subgrupoparametroformularioiva,new Object(),this.subgrupoparametroformularioivaParameterGeneral,this.subgrupoparametroformularioivaReturnGeneral);
				
				
				SubGrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.subgrupoparametroformularioiva,new Object(),this.subgrupoparametroformularioivaParameterGeneral,this.subgrupoparametroformularioivaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
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
			
			SubGrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.subgrupoparametroformularioiva,new Object(),this.subgrupoparametroformularioivaParameterGeneral,this.subgrupoparametroformularioivaReturnGeneral);
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
			
			


			
			SubGrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.subgrupoparametroformularioiva,new Object(),this.subgrupoparametroformularioivaParameterGeneral,this.subgrupoparametroformularioivaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSubGrupoParametroFormularioIvaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.subgrupoparametroformularioiva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.subgrupoparametroformularioiva);
				
				SubGrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.subgrupoparametroformularioiva,new Object(),this.subgrupoparametroformularioivaParameterGeneral,this.subgrupoparametroformularioivaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				SubGrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.subgrupoparametroformularioiva,new Object(),this.subgrupoparametroformularioivaParameterGeneral,this.subgrupoparametroformularioivaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SubGrupoParametroFormularioIva.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SubGrupoParametroFormularioIva.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.subgrupoparametroformularioiva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.subgrupoparametroformularioiva);
				
				SubGrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.subgrupoparametroformularioiva,new Object(),this.subgrupoparametroformularioivaParameterGeneral,this.subgrupoparametroformularioivaReturnGeneral);
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
				
				


				
				SubGrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.subgrupoparametroformularioiva,new Object(),this.subgrupoparametroformularioivaParameterGeneral,this.subgrupoparametroformularioivaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SubGrupoParametroFormularioIva.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SubGrupoParametroFormularioIva.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSubGrupoParametroFormularioIvaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSubGrupoParametroFormularioIva.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subgrupoparametroformularioivaAnterior =(SubGrupoParametroFormularioIva) this.subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvas().toArray()[this.jTableDatosSubGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.subgrupoparametroformularioivaAnterior =(SubGrupoParametroFormularioIva) this.subgrupoparametroformularioivas.toArray()[this.jTableDatosSubGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				SubGrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.subgrupoparametroformularioiva,new Object(),this.subgrupoparametroformularioivaParameterGeneral,this.subgrupoparametroformularioivaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarSubGrupoParametroFormularioIva")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosSubGrupoParametroFormularioIvaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosSubGrupoParametroFormularioIva.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.subgrupoparametroformularioiva =(SubGrupoParametroFormularioIva) this.subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvas().toArray()[this.jTableDatosSubGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.subgrupoparametroformularioiva =(SubGrupoParametroFormularioIva) this.subgrupoparametroformularioivas.toArray()[this.jTableDatosSubGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.subgrupoparametroformularioiva);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarSubGrupoParametroFormularioIva")) {
				
				}
				
				SubGrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.subgrupoparametroformularioiva,new Object(),this.subgrupoparametroformularioivaParameterGeneral,this.subgrupoparametroformularioivaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			SubGrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.subgrupoparametroformularioiva,new Object(),this.subgrupoparametroformularioivaParameterGeneral,this.subgrupoparametroformularioivaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarSubGrupoParametroFormularioIva")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosSubGrupoParametroFormularioIva.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarSubGrupoParametroFormularioIva")) {
			
			}
			
			SubGrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.subgrupoparametroformularioiva,new Object(),this.subgrupoparametroformularioivaParameterGeneral,this.subgrupoparametroformularioivaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessSubGrupoParametroFormularioIva();
			
			SubGrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.subgrupoparametroformularioiva,new Object(),this.subgrupoparametroformularioivaParameterGeneral,this.subgrupoparametroformularioivaReturnGeneral);
			
			if(sTipo.equals("NuevoSubGrupoParametroFormularioIva")) {
				jButtonNuevoSubGrupoParametroFormularioIvaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarSubGrupoParametroFormularioIva")) {
				jButtonDuplicarSubGrupoParametroFormularioIvaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarSubGrupoParametroFormularioIva")) {
				jButtonCopiarSubGrupoParametroFormularioIvaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormSubGrupoParametroFormularioIva")) {
				jButtonVerFormSubGrupoParametroFormularioIvaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesSubGrupoParametroFormularioIva")) {
				jButtonNuevoSubGrupoParametroFormularioIvaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarSubGrupoParametroFormularioIva")) {
				jButtonModificarSubGrupoParametroFormularioIvaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarSubGrupoParametroFormularioIva")) {
				jButtonActualizarSubGrupoParametroFormularioIvaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarSubGrupoParametroFormularioIva")) {
				jButtonEliminarSubGrupoParametroFormularioIvaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaSubGrupoParametroFormularioIva")) {
				jButtonGuardarCambiosSubGrupoParametroFormularioIvaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarSubGrupoParametroFormularioIva")) {
				jButtonCancelarSubGrupoParametroFormularioIvaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarSubGrupoParametroFormularioIva")) {
				jButtonCerrarSubGrupoParametroFormularioIvaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosSubGrupoParametroFormularioIva")) {
				jButtonGuardarCambiosSubGrupoParametroFormularioIvaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosSubGrupoParametroFormularioIva")) {
				jButtonNuevoGuardarCambiosSubGrupoParametroFormularioIvaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderBySubGrupoParametroFormularioIva")) {
				jButtonAbrirOrderBySubGrupoParametroFormularioIvaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionSubGrupoParametroFormularioIva")) {
				jButtonRecargarInformacionSubGrupoParametroFormularioIvaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresSubGrupoParametroFormularioIva")) {
				jButtonAnterioresSubGrupoParametroFormularioIvaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesSubGrupoParametroFormularioIva")) {
				jButtonSiguientesSubGrupoParametroFormularioIvaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idSubGrupoParametroFormularioIvaBusqueda")) {
				this.jButtonidSubGrupoParametroFormularioIvaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaSubGrupoParametroFormularioIvaUpdate")) {
				this.jButtonid_empresaSubGrupoParametroFormularioIvaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaSubGrupoParametroFormularioIvaBusqueda")) {
				this.jButtonid_empresaSubGrupoParametroFormularioIvaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreSubGrupoParametroFormularioIvaBusqueda")) {
				this.jButtonnombreSubGrupoParametroFormularioIvaBusquedaActionPerformed(evt);
			}
			
			SubGrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.subgrupoparametroformularioiva,new Object(),this.subgrupoparametroformularioivaParameterGeneral,this.subgrupoparametroformularioivaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessSubGrupoParametroFormularioIva();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			SubGrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.subgrupoparametroformularioiva,new Object(),this.subgrupoparametroformularioivaParameterGeneral,this.subgrupoparametroformularioivaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameSubGrupoParametroFormularioIva")) {
				closingInternalFrameSubGrupoParametroFormularioIva();
				
			} else if(sTipo.equals("jButtonCancelarSubGrupoParametroFormularioIva")) {
				JInternalFrameBase jInternalFrameDetalleFormSubGrupoParametroFormularioIva = (JInternalFrameBase)evt.getSource();
	            	
	            SubGrupoParametroFormularioIvaBeanSwingJInternalFrame jInternalFrameParent=(SubGrupoParametroFormularioIvaBeanSwingJInternalFrame)jInternalFrameDetalleFormSubGrupoParametroFormularioIva.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarSubGrupoParametroFormularioIvaActionPerformed(null);
			}
			
			SubGrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.subgrupoparametroformularioiva,new Object(),this.subgrupoparametroformularioivaParameterGeneral,this.subgrupoparametroformularioivaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormSubGrupoParametroFormularioIva(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormSubGrupoParametroFormularioIva(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormSubGrupoParametroFormularioIva(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.subgrupoparametroformularioiva)) {
			if(!esControlTabla) {
				if(SubGrupoParametroFormularioIvaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualSubGrupoParametroFormularioIva(this.subgrupoparametroformularioiva,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysSubGrupoParametroFormularioIva(this.subgrupoparametroformularioiva);			
				}
				
				if(this.subgrupoparametroformularioivaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualSubGrupoParametroFormularioIva(this.subgrupoparametroformularioiva,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.subgrupoparametroformularioivaReturnGeneral=subgrupoparametroformularioivaLogic.procesarEventosSubGrupoParametroFormularioIvasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvas(),this.subgrupoparametroformularioiva,this.subgrupoparametroformularioivaParameterGeneral,this.isEsNuevoSubGrupoParametroFormularioIva,classes);//this.subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIva()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanSubGrupoParametroFormularioIva(this.subgrupoparametroformularioivaReturnGeneral,this.subgrupoparametroformularioivaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.subgrupoparametroformularioivaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanSubGrupoParametroFormularioIva(classes,this.subgrupoparametroformularioivaReturnGeneral,this.subgrupoparametroformularioivaBean,false);
					}
						
					if(this.subgrupoparametroformularioivaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeySubGrupoParametroFormularioIva(this.subgrupoparametroformularioivaReturnGeneral.getSubGrupoParametroFormularioIva());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioSubGrupoParametroFormularioIva(this.subgrupoparametroformularioivaReturnGeneral.getSubGrupoParametroFormularioIva());	
					}
						
					if(this.subgrupoparametroformularioivaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioSubGrupoParametroFormularioIva(this.subgrupoparametroformularioivaReturnGeneral.getSubGrupoParametroFormularioIva(),classes);//this.subgrupoparametroformularioivaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioSubGrupoParametroFormularioIva(this.subgrupoparametroformularioiva,classes);//this.subgrupoparametroformularioivaBean);									
				}
			
				if(SubGrupoParametroFormularioIvaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualSubGrupoParametroFormularioIva(this.subgrupoparametroformularioiva,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysSubGrupoParametroFormularioIva(this.subgrupoparametroformularioiva);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.subgrupoparametroformularioivaAnterior!=null) {
						this.subgrupoparametroformularioiva=this.subgrupoparametroformularioivaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.subgrupoparametroformularioivaReturnGeneral=subgrupoparametroformularioivaLogic.procesarEventosSubGrupoParametroFormularioIvasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvas(),this.subgrupoparametroformularioiva,this.subgrupoparametroformularioivaParameterGeneral,this.isEsNuevoSubGrupoParametroFormularioIva,classes);//this.subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIva()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.subgrupoparametroformularioivaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.subgrupoparametroformularioivaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.subgrupoparametroformularioivaReturnGeneral.getSubGrupoParametroFormularioIva(),subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.subgrupoparametroformularioivaReturnGeneral.getSubGrupoParametroFormularioIva(),this.subgrupoparametroformularioivas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosSubGrupoParametroFormularioIva.repaint();
				
				//((AbstractTableModel) this.jTableDatosSubGrupoParametroFormularioIva.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosSubGrupoParametroFormularioIva();
			}
		}
	}
	
	public void actualizarVisualTableDatosSubGrupoParametroFormularioIva() throws Exception {
		
		SubGrupoParametroFormularioIvaModel subgrupoparametroformularioivaModel=(SubGrupoParametroFormularioIvaModel)this.jTableDatosSubGrupoParametroFormularioIva.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			subgrupoparametroformularioivaModel.subgrupoparametroformularioivas=this.subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			subgrupoparametroformularioivaModel.subgrupoparametroformularioivas=this.subgrupoparametroformularioivas;
		}
		
		
		((SubGrupoParametroFormularioIvaModel) this.jTableDatosSubGrupoParametroFormularioIva.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaSubGrupoParametroFormularioIva() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getsubgrupoparametroformularioivaAnterior(),this.subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getsubgrupoparametroformularioivaAnterior(),this.subgrupoparametroformularioivas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosSubGrupoParametroFormularioIva();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioSubGrupoParametroFormularioIva(SubGrupoParametroFormularioIva subgrupoparametroformularioiva,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroFormularioIva.class)) {
					this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.parametroformularioivaLogic.setParametroFormularioIvas(subgrupoparametroformularioiva.getParametroFormularioIvas());
					this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroFormularioIva(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
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
										
				SubGrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.subgrupoparametroformularioiva,new Object(),generalEntityParameterGeneral,this.subgrupoparametroformularioivaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.subgrupoparametroformularioivaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=SubGrupoParametroFormularioIvaConstantesFunciones.getClassesRelationshipsOfSubGrupoParametroFormularioIva(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=SubGrupoParametroFormularioIvaConstantesFunciones.getClassesRelationshipsFromStringsOfSubGrupoParametroFormularioIva(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormSubGrupoParametroFormularioIva(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				SubGrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.subgrupoparametroformularioiva,new Object(),generalEntityParameterGeneral,this.subgrupoparametroformularioivaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioSubGrupoParametroFormularioIva(SubGrupoParametroFormularioIvaBean subgrupoparametroformularioivaBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroFormularioIva.class)) {
					this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.parametroformularioivaLogic.setParametroFormularioIvas(subgrupoparametroformularioiva.getParametroFormularioIvas());
					this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroFormularioIva(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanSubGrupoParametroFormularioIva(ArrayList<Classe> classes,SubGrupoParametroFormularioIvaReturnGeneral subgrupoparametroformularioivaReturnGeneral,SubGrupoParametroFormularioIvaBean subgrupoparametroformularioivaBean,Boolean conDefault) throws Exception {
		
			this.subgrupoparametroformularioivaBean.setParametroFormularioIvas(subgrupoparametroformularioivaReturnGeneral.getSubGrupoParametroFormularioIva().getParametroFormularioIvas());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualSubGrupoParametroFormularioIva(SubGrupoParametroFormularioIva subgrupoparametroformularioiva,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroFormularioIva.class)) {
					subgrupoparametroformularioiva.setParametroFormularioIvas(this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.parametroformularioivaLogic.getParametroFormularioIvas());
					break;
				}
			}
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.subgrupoparametroformularioiva)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva = new SubGrupoParametroFormularioIvaDetalleFormJInternalFrame(jDesktopPane,this.subgrupoparametroformularioivaSessionBean.getConGuardarRelaciones(),this.subgrupoparametroformularioivaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva);
		this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.setVisible(false);
		this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.setSelected(false);						
		
		this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.subgrupoparametroformularioivaLogic=this.subgrupoparametroformularioivaLogic;
		
		this.cargarCombosFrameForeignKeySubGrupoParametroFormularioIva("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleSubGrupoParametroFormularioIva();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleSubGrupoParametroFormularioIva();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeySubGrupoParametroFormularioIva("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeySubGrupoParametroFormularioIva();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarSubGrupoParametroFormularioIva"));
		
		this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jButtonModificarSubGrupoParametroFormularioIva.addActionListener(new ButtonActionListener(this,"ModificarSubGrupoParametroFormularioIva"));

		
		this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jButtonModificarToolBarSubGrupoParametroFormularioIva.addActionListener(new ButtonActionListener(this,"ModificarToolBarSubGrupoParametroFormularioIva"));
					
		this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jMenuItemModificarSubGrupoParametroFormularioIva.addActionListener(new ButtonActionListener(this,"MenuItemModificarSubGrupoParametroFormularioIva"));		
		
		
		
		this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jButtonActualizarSubGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"ActualizarSubGrupoParametroFormularioIva"));
		
		
		this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jButtonActualizarToolBarSubGrupoParametroFormularioIva.addActionListener(new ButtonActionListener(this,"ActualizarToolBarSubGrupoParametroFormularioIva"));
						
		this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jMenuItemActualizarSubGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemActualizarSubGrupoParametroFormularioIva"));		
		
		
		
		this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jButtonEliminarSubGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"EliminarSubGrupoParametroFormularioIva"));
		
		
		this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jButtonEliminarToolBarSubGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"EliminarToolBarSubGrupoParametroFormularioIva"));
								
		this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jMenuItemEliminarSubGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemEliminarSubGrupoParametroFormularioIva"));		
		
		
		
		this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jButtonCancelarSubGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"CancelarSubGrupoParametroFormularioIva"));
		
		
		this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jButtonCancelarToolBarSubGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"CancelarToolBarSubGrupoParametroFormularioIva"));
					
		this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jMenuItemCancelarSubGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemCancelarSubGrupoParametroFormularioIva"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jMenuItemDetalleCerrarSubGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarSubGrupoParametroFormularioIva"));		
		
		
		
		this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jButtonGuardarCambiosToolBarSubGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarSubGrupoParametroFormularioIva"));
		
		
		
		this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jButtonGuardarCambiosToolBarSubGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarSubGrupoParametroFormularioIva"));
		
		
		
		this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jComboBoxTiposAccionesFormularioSubGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioSubGrupoParametroFormularioIva"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jButtonidSubGrupoParametroFormularioIvaBusqueda.addActionListener(new ButtonActionListener(this,"idSubGrupoParametroFormularioIvaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jButtonid_empresaSubGrupoParametroFormularioIvaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaSubGrupoParametroFormularioIvaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jButtonid_empresaSubGrupoParametroFormularioIvaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaSubGrupoParametroFormularioIvaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jButtonnombreSubGrupoParametroFormularioIvaBusqueda.addActionListener(new ButtonActionListener(this,"nombreSubGrupoParametroFormularioIvaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jTabbedPaneRelacionesSubGrupoParametroFormularioIva.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesSubGrupoParametroFormularioIva"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameSubGrupoParametroFormularioIva"));
		
		if(this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarSubGrupoParametroFormularioIva"));
		}
		
		this.jTableDatosSubGrupoParametroFormularioIva.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarSubGrupoParametroFormularioIva"));
		
		this.jTableDatosSubGrupoParametroFormularioIva.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarSubGrupoParametroFormularioIva"));
		
		this.jButtonNuevoSubGrupoParametroFormularioIva.addActionListener(new ButtonActionListener(this,"NuevoSubGrupoParametroFormularioIva"));
		
		this.jButtonDuplicarSubGrupoParametroFormularioIva.addActionListener(new ButtonActionListener(this,"DuplicarSubGrupoParametroFormularioIva"));
		
		this.jButtonCopiarSubGrupoParametroFormularioIva.addActionListener(new ButtonActionListener(this,"CopiarSubGrupoParametroFormularioIva"));
		
		this.jButtonVerFormSubGrupoParametroFormularioIva.addActionListener(new ButtonActionListener(this,"VerFormSubGrupoParametroFormularioIva"));
		
		
		this.jButtonNuevoToolBarSubGrupoParametroFormularioIva.addActionListener(new ButtonActionListener(this,"NuevoToolBarSubGrupoParametroFormularioIva"));
			
		this.jButtonDuplicarToolBarSubGrupoParametroFormularioIva.addActionListener(new ButtonActionListener(this,"DuplicarToolBarSubGrupoParametroFormularioIva"));
			
		this.jMenuItemNuevoSubGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemNuevoSubGrupoParametroFormularioIva"));
			
		this.jMenuItemDuplicarSubGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarSubGrupoParametroFormularioIva"));		
		
		
		this.jButtonNuevoRelacionesSubGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"NuevoRelacionesSubGrupoParametroFormularioIva"));
		
		
		this.jButtonNuevoRelacionesToolBarSubGrupoParametroFormularioIva.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarSubGrupoParametroFormularioIva"));
			
		this.jMenuItemNuevoRelacionesSubGrupoParametroFormularioIva.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesSubGrupoParametroFormularioIva"));		
		
		
		if(this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jButtonModificarSubGrupoParametroFormularioIva.addActionListener(new ButtonActionListener(this,"ModificarSubGrupoParametroFormularioIva"));
		}
		
		
		if(this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jButtonModificarToolBarSubGrupoParametroFormularioIva.addActionListener(new ButtonActionListener(this,"ModificarToolBarSubGrupoParametroFormularioIva"));
			
			this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jMenuItemModificarSubGrupoParametroFormularioIva.addActionListener(new ButtonActionListener(this,"MenuItemModificarSubGrupoParametroFormularioIva"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jButtonActualizarSubGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"ActualizarSubGrupoParametroFormularioIva"));
		}
		
		
		if(this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jButtonActualizarToolBarSubGrupoParametroFormularioIva.addActionListener(new ButtonActionListener(this,"ActualizarToolBarSubGrupoParametroFormularioIva"));
				
			this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jMenuItemActualizarSubGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemActualizarSubGrupoParametroFormularioIva"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jButtonEliminarSubGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"EliminarSubGrupoParametroFormularioIva"));
		}
		
		
		if(this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jButtonEliminarToolBarSubGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"EliminarToolBarSubGrupoParametroFormularioIva"));
						
			this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jMenuItemEliminarSubGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemEliminarSubGrupoParametroFormularioIva"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jButtonCancelarSubGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"CancelarSubGrupoParametroFormularioIva"));
		}
		
		
		if(this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jButtonCancelarToolBarSubGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"CancelarToolBarSubGrupoParametroFormularioIva"));
			
			this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jMenuItemCancelarSubGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemCancelarSubGrupoParametroFormularioIva"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarSubGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarSubGrupoParametroFormularioIva"));		
		
		
		this.jButtonCerrarSubGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"CerrarSubGrupoParametroFormularioIva"));
		
		
		this.jButtonCerrarToolBarSubGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"CerrarToolBarSubGrupoParametroFormularioIva"));
			
		this.jMenuItemCerrarSubGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemCerrarSubGrupoParametroFormularioIva"));
			
		if(this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jMenuItemDetalleCerrarSubGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarSubGrupoParametroFormularioIva"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jButtonGuardarCambiosSubGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"GuardarCambiosSubGrupoParametroFormularioIva"));
		}
		
		
		if(this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jButtonGuardarCambiosToolBarSubGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarSubGrupoParametroFormularioIva"));
		}
		
		this.jButtonCopiarToolBarSubGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"CopiarToolBarSubGrupoParametroFormularioIva"));
			
		this.jButtonVerFormToolBarSubGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"VerFormToolBarSubGrupoParametroFormularioIva"));
		
		this.jMenuItemGuardarCambiosSubGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosSubGrupoParametroFormularioIva"));
			
		this.jMenuItemCopiarSubGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemCopiarSubGrupoParametroFormularioIva"));		
		
		this.jMenuItemVerFormSubGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemVerFormSubGrupoParametroFormularioIva"));		
		
		
		this.jButtonGuardarCambiosTablaSubGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaSubGrupoParametroFormularioIva"));
		
		
		this.jButtonGuardarCambiosTablaToolBarSubGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarSubGrupoParametroFormularioIva"));
			
		this.jMenuItemGuardarCambiosTablaSubGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaSubGrupoParametroFormularioIva"));		
		
		
		
		this.jButtonRecargarInformacionSubGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"RecargarInformacionSubGrupoParametroFormularioIva"));
					
		this.jButtonRecargarInformacionToolBarSubGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarSubGrupoParametroFormularioIva"));
		
		this.jMenuItemRecargarInformacionSubGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionSubGrupoParametroFormularioIva"));		
		
		
		
		this.jButtonAnterioresSubGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"AnterioresSubGrupoParametroFormularioIva"));
		
		
		this.jButtonAnterioresToolBarSubGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"AnterioresToolBarSubGrupoParametroFormularioIva"));
		
		this.jMenuItemAnterioresSubGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresSubGrupoParametroFormularioIva"));		
		
		
		this.jButtonSiguientesSubGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"SiguientesSubGrupoParametroFormularioIva"));
		
		
		this.jButtonSiguientesToolBarSubGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"SiguientesToolBarSubGrupoParametroFormularioIva"));
			
		this.jMenuItemSiguientesSubGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesSubGrupoParametroFormularioIva"));
			
		this.jMenuItemAbrirOrderBySubGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderBySubGrupoParametroFormularioIva"));
			
		this.jMenuItemMostrarOcultarSubGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarSubGrupoParametroFormularioIva"));
			
		this.jMenuItemDetalleAbrirOrderBySubGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderBySubGrupoParametroFormularioIva"));
			
		this.jMenuItemDetalleMostarOcultarSubGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarSubGrupoParametroFormularioIva"));		
		
		
		this.jButtonNuevoGuardarCambiosSubGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosSubGrupoParametroFormularioIva"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarSubGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarSubGrupoParametroFormularioIva"));
			
		this.jMenuItemNuevoGuardarCambiosSubGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosSubGrupoParametroFormularioIva"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosSubGrupoParametroFormularioIva.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosSubGrupoParametroFormularioIva"));

		this.jCheckBoxSeleccionadosSubGrupoParametroFormularioIva.addItemListener(new CheckBoxItemListener(this,"SeleccionadosSubGrupoParametroFormularioIva"));
		
		if(this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jComboBoxTiposAccionesFormularioSubGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioSubGrupoParametroFormularioIva"));
		}
		
		
		this.jComboBoxTiposRelacionesSubGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"TiposRelacionesSubGrupoParametroFormularioIva"));
			
		this.jComboBoxTiposAccionesSubGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"TiposAccionesSubGrupoParametroFormularioIva"));
					
		this.jComboBoxTiposSeleccionarSubGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"TiposSeleccionarSubGrupoParametroFormularioIva"));
			
		this.jTextFieldValorCampoGeneralSubGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralSubGrupoParametroFormularioIva"));		
		
		
		if(this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jButtonidSubGrupoParametroFormularioIvaBusqueda.addActionListener(new ButtonActionListener(this,"idSubGrupoParametroFormularioIvaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jButtonid_empresaSubGrupoParametroFormularioIvaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaSubGrupoParametroFormularioIvaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jButtonid_empresaSubGrupoParametroFormularioIvaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaSubGrupoParametroFormularioIvaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jButtonnombreSubGrupoParametroFormularioIvaBusqueda.addActionListener(new ButtonActionListener(this,"nombreSubGrupoParametroFormularioIvaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorIdSubGrupoParametroFormularioIva.addActionListener(new ButtonActionListener(this,"BusquedaPorIdSubGrupoParametroFormularioIva"));

			this.jButtonBusquedaPorNombreSubGrupoParametroFormularioIva.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreSubGrupoParametroFormularioIva"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoSubGrupoParametroFormularioIva!=null) {
				this.jInternalFrameReporteDinamicoSubGrupoParametroFormularioIva.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoSubGrupoParametroFormularioIva"));
				this.jInternalFrameReporteDinamicoSubGrupoParametroFormularioIva.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoSubGrupoParametroFormularioIva"));
				this.jInternalFrameReporteDinamicoSubGrupoParametroFormularioIva.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoSubGrupoParametroFormularioIva"));
			}
			
			//this.jButtonCerrarReporteDinamicoSubGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoSubGrupoParametroFormularioIva"));				
			//this.jButtonGenerarReporteDinamicoSubGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoSubGrupoParametroFormularioIva"));
			//this.jButtonGenerarExcelReporteDinamicoSubGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoSubGrupoParametroFormularioIva"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionSubGrupoParametroFormularioIva!=null) {
				this.jInternalFrameImportacionSubGrupoParametroFormularioIva.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionSubGrupoParametroFormularioIva"));
				this.jInternalFrameImportacionSubGrupoParametroFormularioIva.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionSubGrupoParametroFormularioIva"));
				this.jInternalFrameImportacionSubGrupoParametroFormularioIva.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionSubGrupoParametroFormularioIva"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderBySubGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"AbrirOrderBySubGrupoParametroFormularioIva"));
			
			this.jButtonAbrirOrderByToolBarSubGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarSubGrupoParametroFormularioIva"));			
			
			if(this.jInternalFrameOrderBySubGrupoParametroFormularioIva!=null) {
				this.jInternalFrameOrderBySubGrupoParametroFormularioIva.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderBySubGrupoParametroFormularioIva"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jTabbedPaneRelacionesSubGrupoParametroFormularioIva.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesSubGrupoParametroFormularioIva"));
		
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
            		closingInternalFrameSubGrupoParametroFormularioIva();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormSubGrupoParametroFormularioIva = (JInternalFrameBase)event.getSource();
	            	
	            SubGrupoParametroFormularioIvaBeanSwingJInternalFrame jInternalFrameParent=(SubGrupoParametroFormularioIvaBeanSwingJInternalFrame)jInternalFrameDetalleFormSubGrupoParametroFormularioIva.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarSubGrupoParametroFormularioIvaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosSubGrupoParametroFormularioIva.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosSubGrupoParametroFormularioIvaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosSubGrupoParametroFormularioIva.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosSubGrupoParametroFormularioIva.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoSubGrupoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSubGrupoParametroFormularioIvaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarSubGrupoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSubGrupoParametroFormularioIvaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoSubGrupoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSubGrupoParametroFormularioIvaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoSubGrupoParametroFormularioIva";
		inputMap = this.jButtonNuevoSubGrupoParametroFormularioIva.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoSubGrupoParametroFormularioIva.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoSubGrupoParametroFormularioIvaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesSubGrupoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSubGrupoParametroFormularioIvaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarSubGrupoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSubGrupoParametroFormularioIvaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesSubGrupoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSubGrupoParametroFormularioIvaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesSubGrupoParametroFormularioIva";
		inputMap = this.jButtonNuevoRelacionesSubGrupoParametroFormularioIva.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesSubGrupoParametroFormularioIva.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoSubGrupoParametroFormularioIvaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarSubGrupoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarSubGrupoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarSubGrupoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarSubGrupoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarSubGrupoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarSubGrupoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarSubGrupoParametroFormularioIva";
		inputMap = this.jButtonModificarSubGrupoParametroFormularioIva.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarSubGrupoParametroFormularioIva.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarSubGrupoParametroFormularioIvaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarSubGrupoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarSubGrupoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarSubGrupoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarSubGrupoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarSubGrupoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarSubGrupoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarSubGrupoParametroFormularioIva";
		inputMap = this.jButtonActualizarSubGrupoParametroFormularioIva.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarSubGrupoParametroFormularioIva.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarSubGrupoParametroFormularioIvaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarSubGrupoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarSubGrupoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarSubGrupoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarSubGrupoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarSubGrupoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarSubGrupoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarSubGrupoParametroFormularioIva";
		inputMap = this.jButtonEliminarSubGrupoParametroFormularioIva.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarSubGrupoParametroFormularioIva.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarSubGrupoParametroFormularioIvaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarSubGrupoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarSubGrupoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarSubGrupoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarSubGrupoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarSubGrupoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarSubGrupoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarSubGrupoParametroFormularioIva";
		inputMap = this.jButtonCancelarSubGrupoParametroFormularioIva.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarSubGrupoParametroFormularioIva.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarSubGrupoParametroFormularioIvaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarSubGrupoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarSubGrupoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarSubGrupoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarSubGrupoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarSubGrupoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarSubGrupoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarSubGrupoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarSubGrupoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarSubGrupoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarSubGrupoParametroFormularioIva";
		inputMap = this.jButtonCerrarSubGrupoParametroFormularioIva.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarSubGrupoParametroFormularioIva.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarSubGrupoParametroFormularioIvaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jButtonGuardarCambiosSubGrupoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSubGrupoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarSubGrupoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSubGrupoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosSubGrupoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSubGrupoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaSubGrupoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSubGrupoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarSubGrupoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSubGrupoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaSubGrupoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSubGrupoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosSubGrupoParametroFormularioIva";
		inputMap = this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jButtonGuardarCambiosSubGrupoParametroFormularioIva.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jButtonGuardarCambiosSubGrupoParametroFormularioIva.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosSubGrupoParametroFormularioIvaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionSubGrupoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionSubGrupoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarSubGrupoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionSubGrupoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionSubGrupoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionSubGrupoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresSubGrupoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresSubGrupoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarSubGrupoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresSubGrupoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresSubGrupoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresSubGrupoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesSubGrupoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesSubGrupoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarSubGrupoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesSubGrupoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesSubGrupoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesSubGrupoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosSubGrupoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosSubGrupoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarSubGrupoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosSubGrupoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosSubGrupoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosSubGrupoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosSubGrupoParametroFormularioIva.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosSubGrupoParametroFormularioIvaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesSubGrupoParametroFormularioIva.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesSubGrupoParametroFormularioIvaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarSubGrupoParametroFormularioIva.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarSubGrupoParametroFormularioIvaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralSubGrupoParametroFormularioIva.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralSubGrupoParametroFormularioIvaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jButtonidSubGrupoParametroFormularioIvaBusqueda.addActionListener(new ButtonActionListener(this,"idSubGrupoParametroFormularioIvaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jButtonid_empresaSubGrupoParametroFormularioIvaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaSubGrupoParametroFormularioIvaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jButtonid_empresaSubGrupoParametroFormularioIvaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaSubGrupoParametroFormularioIvaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jButtonnombreSubGrupoParametroFormularioIvaBusqueda.addActionListener(new ButtonActionListener(this,"nombreSubGrupoParametroFormularioIvaBusqueda"));
		
		
		this.jButtonBusquedaPorIdSubGrupoParametroFormularioIva.addActionListener(new ButtonActionListener(this,"BusquedaPorIdSubGrupoParametroFormularioIva"));

		this.jButtonBusquedaPorNombreSubGrupoParametroFormularioIva.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreSubGrupoParametroFormularioIva"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoSubGrupoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoSubGrupoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoSubGrupoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoSubGrupoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoSubGrupoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoSubGrupoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionSubGrupoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionSubGrupoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionSubGrupoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionSubGrupoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionSubGrupoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionSubGrupoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarSubGrupoParametroFormularioIvaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarSubGrupoParametroFormularioIva.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosSubGrupoParametroFormularioIva(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(SubGrupoParametroFormularioIva subgrupoparametroformularioivaAux:this.subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvas()) {
					subgrupoparametroformularioivaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(SubGrupoParametroFormularioIva subgrupoparametroformularioivaAux:subgrupoparametroformularioivas) {
					subgrupoparametroformularioivaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosSubGrupoParametroFormularioIvaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingSubGrupoParametroFormularioIva(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(SubGrupoParametroFormularioIva subgrupoparametroformularioivaAux:this.subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvas()) {
						subgrupoparametroformularioivaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(SubGrupoParametroFormularioIva subgrupoparametroformularioivaAux:subgrupoparametroformularioivas) {
						subgrupoparametroformularioivaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(SubGrupoParametroFormularioIva subgrupoparametroformularioivaAux:this.subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvas()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(SubGrupoParametroFormularioIva subgrupoparametroformularioivaAux:subgrupoparametroformularioivas) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaSubGrupoParametroFormularioIva(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosSubGrupoParametroFormularioIva.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosSubGrupoParametroFormularioIva.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosSubGrupoParametroFormularioIva,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosSubGrupoParametroFormularioIvaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingSubGrupoParametroFormularioIva(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosSubGrupoParametroFormularioIva.getSelectedRows();
			
			SubGrupoParametroFormularioIva subgrupoparametroformularioivaLocal=new SubGrupoParametroFormularioIva();
			
			//this.seleccionarTodosSubGrupoParametroFormularioIva(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					subgrupoparametroformularioivaLocal =(SubGrupoParametroFormularioIva) this.subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvas().toArray()[this.jTableDatosSubGrupoParametroFormularioIva.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					subgrupoparametroformularioivaLocal =(SubGrupoParametroFormularioIva) this.subgrupoparametroformularioivas.toArray()[this.jTableDatosSubGrupoParametroFormularioIva.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				subgrupoparametroformularioivaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(SubGrupoParametroFormularioIva subgrupoparametroformularioivaAux:this.subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvas()) {
						subgrupoparametroformularioivaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(SubGrupoParametroFormularioIva subgrupoparametroformularioivaAux:subgrupoparametroformularioivas) {
						subgrupoparametroformularioivaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaSubGrupoParametroFormularioIva(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosSubGrupoParametroFormularioIva.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosSubGrupoParametroFormularioIva.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosSubGrupoParametroFormularioIva,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualSubGrupoParametroFormularioIvaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarSubGrupoParametroFormularioIvaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralSubGrupoParametroFormularioIvaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingSubGrupoParametroFormularioIva(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralSubGrupoParametroFormularioIva.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(SubGrupoParametroFormularioIva subgrupoparametroformularioivaAux:this.subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvas()) {
				
						if(sTipoSeleccionar.equals(SubGrupoParametroFormularioIvaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							subgrupoparametroformularioivaAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(SubGrupoParametroFormularioIva subgrupoparametroformularioivaAux:subgrupoparametroformularioivas) {
					
						if(sTipoSeleccionar.equals(SubGrupoParametroFormularioIvaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							subgrupoparametroformularioivaAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaSubGrupoParametroFormularioIva(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesSubGrupoParametroFormularioIvaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingSubGrupoParametroFormularioIva(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioSubGrupoParametroFormularioIva=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesSubGrupoParametroFormularioIva.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jComboBoxTiposAccionesFormularioSubGrupoParametroFormularioIva.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteSubGrupoParametroFormularioIva) {				
					conSplash=true;//false;										
					
					//this.startProcessSubGrupoParametroFormularioIva(conSplash);
				
					this.generarReporteSubGrupoParametroFormularioIvasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSubGrupoParametroFormularioIva.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jComboBoxTiposAccionesFormularioSubGrupoParametroFormularioIva.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoSubGrupoParametroFormularioIvasSeleccionados();
				//this.jComboBoxTiposAccionesSubGrupoParametroFormularioIva.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoSubGrupoParametroFormularioIvasSeleccionados(false);
				//this.jComboBoxTiposAccionesSubGrupoParametroFormularioIva.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoSubGrupoParametroFormularioIvasSeleccionados(true);
				//this.jComboBoxTiposAccionesSubGrupoParametroFormularioIva.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessSubGrupoParametroFormularioIva();
				
				this.exportarSubGrupoParametroFormularioIvasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSubGrupoParametroFormularioIva.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jComboBoxTiposAccionesFormularioSubGrupoParametroFormularioIva.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionSubGrupoParametroFormularioIvas();
				//this.importarSubGrupoParametroFormularioIvas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSubGrupoParametroFormularioIva.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jComboBoxTiposAccionesFormularioSubGrupoParametroFormularioIva.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessSubGrupoParametroFormularioIva();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelSubGrupoParametroFormularioIvasSeleccionados();
				//this.jComboBoxTiposAccionesSubGrupoParametroFormularioIva.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Sub Grupo Parametro Formulario Iva ", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessSubGrupoParametroFormularioIva();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoSubGrupoParametroFormularioIva)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeySubGrupoParametroFormularioIva(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Sub Grupo Parametro Formulario Iva ",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSubGrupoParametroFormularioIva.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jComboBoxTiposAccionesFormularioSubGrupoParametroFormularioIva.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralSubGrupoParametroFormularioIva();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessSubGrupoParametroFormularioIva(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesSubGrupoParametroFormularioIvaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessSubGrupoParametroFormularioIva();
			
			if(this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<SubGrupoParametroFormularioIva> subgrupoparametroformularioivasSeleccionados=new ArrayList<SubGrupoParametroFormularioIva>();		
			SubGrupoParametroFormularioIva subgrupoparametroformularioiva=new SubGrupoParametroFormularioIva();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingSubGrupoParametroFormularioIva(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesSubGrupoParametroFormularioIva.getSelectedItem();
			
			
			
			
			subgrupoparametroformularioivasSeleccionados=this.getSubGrupoParametroFormularioIvasSeleccionados(true);
			//this.sTipoAccion;
			
			if(subgrupoparametroformularioivasSeleccionados.size()==1) {
				for(SubGrupoParametroFormularioIva subgrupoparametroformularioivaAux:subgrupoparametroformularioivasSeleccionados) {
					subgrupoparametroformularioiva=subgrupoparametroformularioivaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Parametro Formulario Iva")) {
					jButtonParametroFormularioIvaActionPerformed(null,rowIndex,true,false,subgrupoparametroformularioiva);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessSubGrupoParametroFormularioIva();
			
      		//this.finishProcessSubGrupoParametroFormularioIva(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarSubGrupoParametroFormularioIvaReturnGeneral() throws Exception {
		if(this.subgrupoparametroformularioivaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.subgrupoparametroformularioivaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.subgrupoparametroformularioivaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.subgrupoparametroformularioivaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.subgrupoparametroformularioivaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.subgrupoparametroformularioivaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingSubGrupoParametroFormularioIva(false);
		}
		
		if(this.subgrupoparametroformularioivaReturnGeneral.getConRetornoLista() || this.subgrupoparametroformularioivaReturnGeneral.getConRetornoObjeto()) {
			if(this.subgrupoparametroformularioivaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.subgrupoparametroformularioivaLogic.setSubGrupoParametroFormularioIvas(this.subgrupoparametroformularioivaReturnGeneral.getSubGrupoParametroFormularioIvas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.subgrupoparametroformularioivaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.subgrupoparametroformularioivaLogic.setSubGrupoParametroFormularioIva(this.subgrupoparametroformularioivaReturnGeneral.getSubGrupoParametroFormularioIva());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingSubGrupoParametroFormularioIva(false);
		}
	}
	
	public void actualizarParametrosGeneralSubGrupoParametroFormularioIva() throws Exception {
		
		
	}
	
	public ArrayList<SubGrupoParametroFormularioIva> getSubGrupoParametroFormularioIvasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<SubGrupoParametroFormularioIva> subgrupoparametroformularioivasSeleccionados=new ArrayList<SubGrupoParametroFormularioIva>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioSubGrupoParametroFormularioIva) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(SubGrupoParametroFormularioIva subgrupoparametroformularioivaAux:subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvas()) {
					if(subgrupoparametroformularioivaAux.getIsSelected()) {
						subgrupoparametroformularioivasSeleccionados.add(subgrupoparametroformularioivaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(SubGrupoParametroFormularioIva subgrupoparametroformularioivaAux:this.subgrupoparametroformularioivas) {
					if(subgrupoparametroformularioivaAux.getIsSelected()) {
						subgrupoparametroformularioivasSeleccionados.add(subgrupoparametroformularioivaAux);				
					}
				}
			}
			
			if(subgrupoparametroformularioivasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						subgrupoparametroformularioivasSeleccionados.addAll(this.subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						subgrupoparametroformularioivasSeleccionados.addAll(this.subgrupoparametroformularioivas);				
					}
				}
			}
		} else {
			subgrupoparametroformularioivasSeleccionados.add(this.subgrupoparametroformularioiva);
		}
		
		return subgrupoparametroformularioivasSeleccionados;
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
	
	public void generarReporteSubGrupoParametroFormularioIvasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalSubGrupoParametroFormularioIvasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoSubGrupoParametroFormularioIvasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoSubGrupoParametroFormularioIvasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoSubGrupoParametroFormularioIvasSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesSubGrupoParametroFormularioIvasSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Sub Grupo Parametro Formulario Iva ",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesSubGrupoParametroFormularioIvasSeleccionados() throws Exception {
		ArrayList<SubGrupoParametroFormularioIva> subgrupoparametroformularioivasSeleccionados=new ArrayList<SubGrupoParametroFormularioIva>();		
		
		subgrupoparametroformularioivasSeleccionados=this.getSubGrupoParametroFormularioIvasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteSubGrupoParametroFormularioIvas("Todos",subgrupoparametroformularioivasSeleccionados);
		
	}	
	
	public void generarReporteNormalSubGrupoParametroFormularioIvasSeleccionados() throws Exception {
		ArrayList<SubGrupoParametroFormularioIva> subgrupoparametroformularioivasSeleccionados=new ArrayList<SubGrupoParametroFormularioIva>();		
		
		subgrupoparametroformularioivasSeleccionados=this.getSubGrupoParametroFormularioIvasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteSubGrupoParametroFormularioIvas("Todos",subgrupoparametroformularioivasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionSubGrupoParametroFormularioIvasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<SubGrupoParametroFormularioIva> subgrupoparametroformularioivasSeleccionados=new ArrayList<SubGrupoParametroFormularioIva>();
		
		subgrupoparametroformularioivasSeleccionados=this.getSubGrupoParametroFormularioIvasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteSubGrupoParametroFormularioIvas("Todos",subgrupoparametroformularioivasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoSubGrupoParametroFormularioIvasSeleccionados() throws Exception {
		ArrayList<SubGrupoParametroFormularioIva> subgrupoparametroformularioivasSeleccionados=new ArrayList<SubGrupoParametroFormularioIva>();		
		
		
		this.abrirInicializarFrameReporteDinamicoSubGrupoParametroFormularioIva();
		
		
		subgrupoparametroformularioivasSeleccionados=this.getSubGrupoParametroFormularioIvasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoSubGrupoParametroFormularioIva();
		
		
		//this.generarReporteSubGrupoParametroFormularioIvas("Todos",subgrupoparametroformularioivasSeleccionados ,subgrupoparametroformularioivaImplementable,subgrupoparametroformularioivaImplementableHome);
	}
	
	public void mostrarImportacionSubGrupoParametroFormularioIvas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionSubGrupoParametroFormularioIva();
		
		this.abrirFrameImportacionSubGrupoParametroFormularioIva();		
		
			
		//this.generarReporteSubGrupoParametroFormularioIvas("Todos",subgrupoparametroformularioivasSeleccionados ,subgrupoparametroformularioivaImplementable,subgrupoparametroformularioivaImplementableHome);
	}
	
	public void importarSubGrupoParametroFormularioIvas() throws Exception {		
	
	}
	
	public void exportarSubGrupoParametroFormularioIvasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelSubGrupoParametroFormularioIvasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoSubGrupoParametroFormularioIvasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlSubGrupoParametroFormularioIvasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Sub Grupo Parametro Formulario Iva ",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoSubGrupoParametroFormularioIvasSeleccionados() throws Exception {
		ArrayList<SubGrupoParametroFormularioIva> subgrupoparametroformularioivasSeleccionados=new ArrayList<SubGrupoParametroFormularioIva>();		
		
		subgrupoparametroformularioivasSeleccionados=this.getSubGrupoParametroFormularioIvasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"subgrupoparametroformularioiva."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarSubGrupoParametroFormularioIva(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(SubGrupoParametroFormularioIva subgrupoparametroformularioivaAux:subgrupoparametroformularioivasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarSubGrupoParametroFormularioIva(subgrupoparametroformularioivaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//subgrupoparametroformularioivaAux.setsDetalleGeneralEntityReporte(subgrupoparametroformularioivaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.subgrupoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sub Grupo Parametro Formulario Iva ",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarSubGrupoParametroFormularioIva(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=SubGrupoParametroFormularioIvaConstantesFunciones.LABEL_ID;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SubGrupoParametroFormularioIvaConstantesFunciones.LABEL_IDEMPRESA;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SubGrupoParametroFormularioIvaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SubGrupoParametroFormularioIvaConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarSubGrupoParametroFormularioIva(SubGrupoParametroFormularioIva subgrupoparametroformularioiva,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=subgrupoparametroformularioiva.getId().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=subgrupoparametroformularioiva.getempresa_descripcion();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=subgrupoparametroformularioiva.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=subgrupoparametroformularioiva.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelSubGrupoParametroFormularioIvasSeleccionados() throws Exception {
		ArrayList<SubGrupoParametroFormularioIva> subgrupoparametroformularioivasSeleccionados=new ArrayList<SubGrupoParametroFormularioIva>();		
		
		subgrupoparametroformularioivasSeleccionados=this.getSubGrupoParametroFormularioIvasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"subgrupoparametroformularioiva.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("SubGrupoParametroFormularioIvas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelSubGrupoParametroFormularioIva(row);				
				iRow++;
			}				
			
			for(SubGrupoParametroFormularioIva subgrupoparametroformularioivaAux:subgrupoparametroformularioivasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelSubGrupoParametroFormularioIva(subgrupoparametroformularioivaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.subgrupoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sub Grupo Parametro Formulario Iva ",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlSubGrupoParametroFormularioIvasSeleccionados() throws Exception {
		ArrayList<SubGrupoParametroFormularioIva> subgrupoparametroformularioivasSeleccionados=new ArrayList<SubGrupoParametroFormularioIva>();		
		
		subgrupoparametroformularioivasSeleccionados=this.getSubGrupoParametroFormularioIvasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"subgrupoparametroformularioiva.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("subgrupoparametroformularioivas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("subgrupoparametroformularioiva");
			//elementRoot.appendChild(element);
		
			for(SubGrupoParametroFormularioIva subgrupoparametroformularioivaAux:subgrupoparametroformularioivasSeleccionados) {
				element = document.createElement("subgrupoparametroformularioiva");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlSubGrupoParametroFormularioIva(subgrupoparametroformularioivaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.subgrupoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sub Grupo Parametro Formulario Iva ",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelSubGrupoParametroFormularioIva(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(SubGrupoParametroFormularioIvaConstantesFunciones.LABEL_ID);
		cell = row.createCell(iColumn++);cell.setCellValue(SubGrupoParametroFormularioIvaConstantesFunciones.LABEL_IDEMPRESA);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(SubGrupoParametroFormularioIvaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(SubGrupoParametroFormularioIvaConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelSubGrupoParametroFormularioIva(SubGrupoParametroFormularioIva subgrupoparametroformularioiva,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(subgrupoparametroformularioiva.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(subgrupoparametroformularioiva.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(subgrupoparametroformularioiva.getnombre());				
	}
	
	public void setFilaDatosExportarXmlSubGrupoParametroFormularioIva(SubGrupoParametroFormularioIva subgrupoparametroformularioiva,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(SubGrupoParametroFormularioIvaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(subgrupoparametroformularioiva.getId().toString().trim()));
		element.appendChild(elementId);

		Element elementempresa_descripcion = document.createElement(SubGrupoParametroFormularioIvaConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(subgrupoparametroformularioiva.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(SubGrupoParametroFormularioIvaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(subgrupoparametroformularioiva.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementnombre = document.createElement(SubGrupoParametroFormularioIvaConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(subgrupoparametroformularioiva.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoSubGrupoParametroFormularioIvasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<SubGrupoParametroFormularioIva> subgrupoparametroformularioivasSeleccionados=new ArrayList<SubGrupoParametroFormularioIva>();
		
		subgrupoparametroformularioivasSeleccionados=this.getSubGrupoParametroFormularioIvasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoSubGrupoParametroFormularioIva(subgrupoparametroformularioivasSeleccionados);
		
		this.generarReporteSubGrupoParametroFormularioIvas("Todos",subgrupoparametroformularioivasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoSubGrupoParametroFormularioIva(ArrayList<SubGrupoParametroFormularioIva> subgrupoparametroformularioivasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(SubGrupoParametroFormularioIva subgrupoparametroformularioivaAux:subgrupoparametroformularioivasSeleccionados) {
				subgrupoparametroformularioivaAux.setsDetalleGeneralEntityReporte(subgrupoparametroformularioivaAux.toString());
			
				if(sTipoSeleccionar.equals(SubGrupoParametroFormularioIvaConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					subgrupoparametroformularioivaAux.setsDescripcionGeneralEntityReporte1(subgrupoparametroformularioivaAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(SubGrupoParametroFormularioIvaConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					subgrupoparametroformularioivaAux.setsDescripcionGeneralEntityReporte1(subgrupoparametroformularioivaAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesSubGrupoParametroFormularioIva(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoSubGrupoParametroFormularioIva=true;
				this.isVisibilidadCeldaNuevoRelacionesSubGrupoParametroFormularioIva=true;
				this.isVisibilidadCeldaGuardarCambiosSubGrupoParametroFormularioIva=true;
			}
			
			this.isVisibilidadCeldaModificarSubGrupoParametroFormularioIva=false;
			this.isVisibilidadCeldaActualizarSubGrupoParametroFormularioIva=false;
			this.isVisibilidadCeldaEliminarSubGrupoParametroFormularioIva=false;
			this.isVisibilidadCeldaCancelarSubGrupoParametroFormularioIva=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSubGrupoParametroFormularioIva=true;
				} else {
					this.isVisibilidadCeldaGuardarSubGrupoParametroFormularioIva=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoSubGrupoParametroFormularioIva=false;
			this.isVisibilidadCeldaNuevoRelacionesSubGrupoParametroFormularioIva=false;
			this.isVisibilidadCeldaGuardarCambiosSubGrupoParametroFormularioIva=false;
			this.isVisibilidadCeldaModificarSubGrupoParametroFormularioIva=false;
			this.isVisibilidadCeldaActualizarSubGrupoParametroFormularioIva=true;
			this.isVisibilidadCeldaEliminarSubGrupoParametroFormularioIva=false;
			this.isVisibilidadCeldaCancelarSubGrupoParametroFormularioIva=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSubGrupoParametroFormularioIva=true;
				} else {
					this.isVisibilidadCeldaGuardarSubGrupoParametroFormularioIva=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoSubGrupoParametroFormularioIva=false;
			this.isVisibilidadCeldaNuevoRelacionesSubGrupoParametroFormularioIva=false;
			this.isVisibilidadCeldaGuardarCambiosSubGrupoParametroFormularioIva=false;
			this.isVisibilidadCeldaModificarSubGrupoParametroFormularioIva=false;
			this.isVisibilidadCeldaActualizarSubGrupoParametroFormularioIva=true;
			this.isVisibilidadCeldaEliminarSubGrupoParametroFormularioIva=true;
			this.isVisibilidadCeldaCancelarSubGrupoParametroFormularioIva=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSubGrupoParametroFormularioIva=true;
				} else {
					this.isVisibilidadCeldaGuardarSubGrupoParametroFormularioIva=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoSubGrupoParametroFormularioIva=false;
			this.isVisibilidadCeldaNuevoRelacionesSubGrupoParametroFormularioIva=false;
			this.isVisibilidadCeldaGuardarCambiosSubGrupoParametroFormularioIva=false;
			this.isVisibilidadCeldaModificarSubGrupoParametroFormularioIva=false;
			this.isVisibilidadCeldaActualizarSubGrupoParametroFormularioIva=true;
			this.isVisibilidadCeldaEliminarSubGrupoParametroFormularioIva=false;
			this.isVisibilidadCeldaCancelarSubGrupoParametroFormularioIva=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSubGrupoParametroFormularioIva=false;
				} else {
					this.isVisibilidadCeldaGuardarSubGrupoParametroFormularioIva=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoSubGrupoParametroFormularioIva=true;
			this.isVisibilidadCeldaNuevoRelacionesSubGrupoParametroFormularioIva=true;
			this.isVisibilidadCeldaGuardarCambiosSubGrupoParametroFormularioIva=true;
			this.isVisibilidadCeldaModificarSubGrupoParametroFormularioIva=false;
			this.isVisibilidadCeldaActualizarSubGrupoParametroFormularioIva=false;
			this.isVisibilidadCeldaEliminarSubGrupoParametroFormularioIva=false;
			this.isVisibilidadCeldaCancelarSubGrupoParametroFormularioIva=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSubGrupoParametroFormularioIva=true;
				} else {
					this.isVisibilidadCeldaGuardarSubGrupoParametroFormularioIva=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoSubGrupoParametroFormularioIva=false;
			this.isVisibilidadCeldaNuevoRelacionesSubGrupoParametroFormularioIva=false;
			this.isVisibilidadCeldaGuardarCambiosSubGrupoParametroFormularioIva=false;
			this.isVisibilidadCeldaActualizarSubGrupoParametroFormularioIva=false;
			this.isVisibilidadCeldaEliminarSubGrupoParametroFormularioIva=false;
			this.isVisibilidadCeldaCancelarSubGrupoParametroFormularioIva=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSubGrupoParametroFormularioIva=false;
				} else {
					this.isVisibilidadCeldaGuardarSubGrupoParametroFormularioIva=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoSubGrupoParametroFormularioIva=false;
			this.isVisibilidadCeldaNuevoRelacionesSubGrupoParametroFormularioIva=false;
			this.isVisibilidadCeldaGuardarCambiosSubGrupoParametroFormularioIva=false;
			this.isVisibilidadCeldaModificarSubGrupoParametroFormularioIva=true;
			this.isVisibilidadCeldaActualizarSubGrupoParametroFormularioIva=false;
			this.isVisibilidadCeldaEliminarSubGrupoParametroFormularioIva=false;
			this.isVisibilidadCeldaCancelarSubGrupoParametroFormularioIva=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSubGrupoParametroFormularioIva=false;
				} else {
					this.isVisibilidadCeldaGuardarSubGrupoParametroFormularioIva=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(SubGrupoParametroFormularioIvaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoSubGrupoParametroFormularioIva=true;
			this.isVisibilidadCeldaNuevoRelacionesSubGrupoParametroFormularioIva=true;
			this.isVisibilidadCeldaGuardarCambiosSubGrupoParametroFormularioIva=true;
		} else {
			this.actualizarEstadoPanelsSubGrupoParametroFormularioIva(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarSubGrupoParametroFormularioIva=false;
			//this.isVisibilidadCeldaVerFormSubGrupoParametroFormularioIva=false;
			this.isVisibilidadCeldaDuplicarSubGrupoParametroFormularioIva=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!subgrupoparametroformularioivaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesSubGrupoParametroFormularioIva=false;
		} else {
			this.isVisibilidadCeldaNuevoSubGrupoParametroFormularioIva=false;
			this.isVisibilidadCeldaGuardarCambiosSubGrupoParametroFormularioIva=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(subgrupoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {
			if(!subgrupoparametroformularioivaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesSubGrupoParametroFormularioIva=false;												
			}
			
			this.jButtonCerrarSubGrupoParametroFormularioIva.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesSubGrupoParametroFormularioIva=false;
		}
		
		if(!this.permiteMantenimiento(this.subgrupoparametroformularioiva)) {
			this.isVisibilidadCeldaActualizarSubGrupoParametroFormularioIva=false;
			this.isVisibilidadCeldaEliminarSubGrupoParametroFormularioIva=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesSubGrupoParametroFormularioIva() {
		this.isVisibilidadCeldaNuevoSubGrupoParametroFormularioIva=false;
		this.isVisibilidadCeldaGuardarCambiosSubGrupoParametroFormularioIva=false;
	}
	
	public void actualizarEstadoPanelsSubGrupoParametroFormularioIva(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionSubGrupoParametroFormularioIva!=null) {
				this.jScrollPanelDatosEdicionSubGrupoParametroFormularioIva.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSubGrupoParametroFormularioIva!=null) {
				this.jTabbedPaneBusquedasSubGrupoParametroFormularioIva.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosSubGrupoParametroFormularioIva!=null) {
				this.jScrollPanelDatosSubGrupoParametroFormularioIva.setVisible(true);
			}
			
			if(this.jPanelPaginacionSubGrupoParametroFormularioIva!=null) {
				this.jPanelPaginacionSubGrupoParametroFormularioIva.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSubGrupoParametroFormularioIva!=null) {
				this.jPanelParametrosReportesSubGrupoParametroFormularioIva.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionSubGrupoParametroFormularioIva!=null) {
				this.jScrollPanelDatosEdicionSubGrupoParametroFormularioIva.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSubGrupoParametroFormularioIva!=null) {
				this.jTabbedPaneBusquedasSubGrupoParametroFormularioIva.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosSubGrupoParametroFormularioIva!=null) {
				this.jScrollPanelDatosSubGrupoParametroFormularioIva.setVisible(false);
			}
			
			if(this.jPanelPaginacionSubGrupoParametroFormularioIva!=null) {
				this.jPanelPaginacionSubGrupoParametroFormularioIva.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesSubGrupoParametroFormularioIva!=null) {
				this.jPanelParametrosReportesSubGrupoParametroFormularioIva.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionSubGrupoParametroFormularioIva!=null) {
				this.jScrollPanelDatosEdicionSubGrupoParametroFormularioIva.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSubGrupoParametroFormularioIva!=null) {
				this.jTabbedPaneBusquedasSubGrupoParametroFormularioIva.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosSubGrupoParametroFormularioIva!=null) {
				this.jScrollPanelDatosSubGrupoParametroFormularioIva.setVisible(false);
			}
			
			if(this.jPanelPaginacionSubGrupoParametroFormularioIva!=null) {
				this.jPanelPaginacionSubGrupoParametroFormularioIva.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesSubGrupoParametroFormularioIva!=null) {
				this.jPanelParametrosReportesSubGrupoParametroFormularioIva.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionSubGrupoParametroFormularioIva!=null) {
				this.jScrollPanelDatosEdicionSubGrupoParametroFormularioIva.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSubGrupoParametroFormularioIva!=null) {
				this.jTabbedPaneBusquedasSubGrupoParametroFormularioIva.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosSubGrupoParametroFormularioIva!=null) {
				this.jScrollPanelDatosSubGrupoParametroFormularioIva.setVisible(false);
			}
			
			if(this.jPanelPaginacionSubGrupoParametroFormularioIva!=null) {
				this.jPanelPaginacionSubGrupoParametroFormularioIva.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesSubGrupoParametroFormularioIva!=null) {
				this.jPanelParametrosReportesSubGrupoParametroFormularioIva.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionSubGrupoParametroFormularioIva!=null) {
				this.jScrollPanelDatosEdicionSubGrupoParametroFormularioIva.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSubGrupoParametroFormularioIva!=null) {
				this.jTabbedPaneBusquedasSubGrupoParametroFormularioIva.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosSubGrupoParametroFormularioIva!=null) {
				this.jScrollPanelDatosSubGrupoParametroFormularioIva.setVisible(true);
			}
			
			if(this.jPanelPaginacionSubGrupoParametroFormularioIva!=null) {
				this.jPanelPaginacionSubGrupoParametroFormularioIva.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSubGrupoParametroFormularioIva!=null) {
				this.jPanelParametrosReportesSubGrupoParametroFormularioIva.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionSubGrupoParametroFormularioIva!=null) {
				this.jScrollPanelDatosEdicionSubGrupoParametroFormularioIva.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSubGrupoParametroFormularioIva!=null) {
				this.jTabbedPaneBusquedasSubGrupoParametroFormularioIva.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosSubGrupoParametroFormularioIva!=null) {
				this.jScrollPanelDatosSubGrupoParametroFormularioIva.setVisible(true);
			}
			
			if(this.jPanelPaginacionSubGrupoParametroFormularioIva!=null) {
				this.jPanelPaginacionSubGrupoParametroFormularioIva.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSubGrupoParametroFormularioIva!=null) {
				this.jPanelParametrosReportesSubGrupoParametroFormularioIva.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionSubGrupoParametroFormularioIva!=null) {
				this.jScrollPanelDatosEdicionSubGrupoParametroFormularioIva.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSubGrupoParametroFormularioIva!=null) {
				this.jTabbedPaneBusquedasSubGrupoParametroFormularioIva.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosSubGrupoParametroFormularioIva!=null) {
				this.jScrollPanelDatosSubGrupoParametroFormularioIva.setVisible(true);
			}
			
			if(this.jPanelPaginacionSubGrupoParametroFormularioIva!=null) {
				this.jPanelPaginacionSubGrupoParametroFormularioIva.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSubGrupoParametroFormularioIva!=null) {
				this.jPanelParametrosReportesSubGrupoParametroFormularioIva.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.subgrupoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasSubGrupoParametroFormularioIva!=null) {
					this.jTabbedPaneBusquedasSubGrupoParametroFormularioIva.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesSubGrupoParametroFormularioIva!=null) {
				this.jPanelParametrosReportesSubGrupoParametroFormularioIva.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.subgrupoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSubGrupoParametroFormularioIva!=null) {
				this.jTabbedPaneBusquedasSubGrupoParametroFormularioIva.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesSubGrupoParametroFormularioIva!=null) {
				this.jPanelParametrosReportesSubGrupoParametroFormularioIva.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaPorId=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorId) {this.jTabbedPaneBusquedasSubGrupoParametroFormularioIva.remove(jPanelBusquedaPorIdSubGrupoParametroFormularioIva);}

			this.isVisibilidadBusquedaPorNombre=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasSubGrupoParametroFormularioIva.remove(jPanelBusquedaPorNombreSubGrupoParametroFormularioIva);}
		}
		
	}
	
	

	public String registrarSesionSubGrupoParametroFormularioIvaParaParametroFormularioIvas() throws Exception {
		Boolean isPaginaPopupParametroFormularioIva=false;

		try {

			if(this.subgrupoparametroformularioivaSessionBean==null) {
				this.subgrupoparametroformularioivaSessionBean=new SubGrupoParametroFormularioIvaSessionBean();
			}

			if(this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.parametroformularioivaSessionBean==null) {
				this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.parametroformularioivaSessionBean=new ParametroFormularioIvaSessionBean();
			}

			this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.parametroformularioivaSessionBean.setsPathNavegacionActual(subgrupoparametroformularioivaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.parametroformularioivaSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupParametroFormularioIva=this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.parametroformularioivaSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.parametroformularioivaSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeParametroFormularioIva(true);
			this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.parametroformularioivaSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeParametroFormularioIva(SubGrupoParametroFormularioIvaConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.parametroformularioivaSessionBean.setisBusquedaDesdeForeignKeySesionSubGrupoParametroFormularioIva(true);
			this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.parametroformularioivaSessionBean.setlidSubGrupoParametroFormularioIvaActual(this.idSubGrupoParametroFormularioIvaActual);

			subgrupoparametroformularioivaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeySubGrupoParametroFormularioIva(true);
			subgrupoparametroformularioivaSessionBean.setlIdSubGrupoParametroFormularioIvaActualForeignKey(this.idSubGrupoParametroFormularioIvaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//SubGrupoParametroFormularioIvaSessionBean subgrupoparametroformularioivaSessionBean=new SubGrupoParametroFormularioIvaSessionBean();
		
		if(this.subgrupoparametroformularioivaSessionBean==null) {
			this.subgrupoparametroformularioivaSessionBean=new SubGrupoParametroFormularioIvaSessionBean();
		}
		
		this.subgrupoparametroformularioivaSessionBean.setsUltimaBusquedaSubGrupoParametroFormularioIva(this.getsAccionBusqueda());
		this.subgrupoparametroformularioivaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.subgrupoparametroformularioivaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorId")) {
			subgrupoparametroformularioivaSessionBean.setid(this.getidBusquedaPorId());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			subgrupoparametroformularioivaSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			subgrupoparametroformularioivaSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//SubGrupoParametroFormularioIvaSessionBean subgrupoparametroformularioivaSessionBean=new SubGrupoParametroFormularioIvaSessionBean();
		
		if(this.subgrupoparametroformularioivaSessionBean==null) {
			this.subgrupoparametroformularioivaSessionBean=new SubGrupoParametroFormularioIvaSessionBean();
		}
		
		if(this.subgrupoparametroformularioivaSessionBean.getsUltimaBusquedaSubGrupoParametroFormularioIva()!=null&&!this.subgrupoparametroformularioivaSessionBean.getsUltimaBusquedaSubGrupoParametroFormularioIva().equals("")) {
			this.setsAccionBusqueda(subgrupoparametroformularioivaSessionBean.getsUltimaBusquedaSubGrupoParametroFormularioIva());
			this.setiNumeroPaginacion(subgrupoparametroformularioivaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(subgrupoparametroformularioivaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorId")) {
				this.setidBusquedaPorId(subgrupoparametroformularioivaSessionBean.getid());
				subgrupoparametroformularioivaSessionBean.setid(0L);
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(subgrupoparametroformularioivaSessionBean.getnombre());
				subgrupoparametroformularioivaSessionBean.setnombre("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(subgrupoparametroformularioivaSessionBean.getid_empresa());
				subgrupoparametroformularioivaSessionBean.setid_empresa(-1L);
			}
		}
		
		this.subgrupoparametroformularioivaSessionBean.setsUltimaBusquedaSubGrupoParametroFormularioIva("");
		this.subgrupoparametroformularioivaSessionBean.setiNumeroPaginacion(SubGrupoParametroFormularioIvaConstantesFunciones.INUMEROPAGINACION);
		this.subgrupoparametroformularioivaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaSubGrupoParametroFormularioIva(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioSubGrupoParametroFormularioIva() {
		this.updateBorderResaltarBusquedasFormularioSubGrupoParametroFormularioIva();
		this.updateVisibilidadBusquedasFormularioSubGrupoParametroFormularioIva();
		this.updateHabilitarBusquedasFormularioSubGrupoParametroFormularioIva();
	}
	
	public void updateBorderResaltarBusquedasFormularioSubGrupoParametroFormularioIva() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasSubGrupoParametroFormularioIva.getComponents().length>0) {
	

		if(this.subgrupoparametroformularioivaConstantesFunciones.resaltarBusquedaPorIdSubGrupoParametroFormularioIva!=null) {
			index= this.jTabbedPaneBusquedasSubGrupoParametroFormularioIva.indexOfComponent(this.jPanelBusquedaPorIdSubGrupoParametroFormularioIva);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSubGrupoParametroFormularioIva.getComponent(index);
				jPanel.setBorder(this.subgrupoparametroformularioivaConstantesFunciones.resaltarBusquedaPorIdSubGrupoParametroFormularioIva);
			}
		}

		if(this.subgrupoparametroformularioivaConstantesFunciones.resaltarBusquedaPorNombreSubGrupoParametroFormularioIva!=null) {
			index= this.jTabbedPaneBusquedasSubGrupoParametroFormularioIva.indexOfComponent(this.jPanelBusquedaPorNombreSubGrupoParametroFormularioIva);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSubGrupoParametroFormularioIva.getComponent(index);
				jPanel.setBorder(this.subgrupoparametroformularioivaConstantesFunciones.resaltarBusquedaPorNombreSubGrupoParametroFormularioIva);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioSubGrupoParametroFormularioIva() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasSubGrupoParametroFormularioIva.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasSubGrupoParametroFormularioIva.indexOfComponent(this.jPanelBusquedaPorIdSubGrupoParametroFormularioIva);
			jPanel=(JPanel)this.jTabbedPaneBusquedasSubGrupoParametroFormularioIva.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.subgrupoparametroformularioivaConstantesFunciones.mostrarBusquedaPorIdSubGrupoParametroFormularioIva);
			if(!this.subgrupoparametroformularioivaConstantesFunciones.mostrarBusquedaPorIdSubGrupoParametroFormularioIva && index>-1) {
				this.jTabbedPaneBusquedasSubGrupoParametroFormularioIva.remove(index);
			}

			index= this.jTabbedPaneBusquedasSubGrupoParametroFormularioIva.indexOfComponent(this.jPanelBusquedaPorNombreSubGrupoParametroFormularioIva);
			jPanel=(JPanel)this.jTabbedPaneBusquedasSubGrupoParametroFormularioIva.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.subgrupoparametroformularioivaConstantesFunciones.mostrarBusquedaPorNombreSubGrupoParametroFormularioIva);
			if(!this.subgrupoparametroformularioivaConstantesFunciones.mostrarBusquedaPorNombreSubGrupoParametroFormularioIva && index>-1) {
				this.jTabbedPaneBusquedasSubGrupoParametroFormularioIva.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioSubGrupoParametroFormularioIva() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasSubGrupoParametroFormularioIva.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasSubGrupoParametroFormularioIva.indexOfComponent(this.jPanelBusquedaPorIdSubGrupoParametroFormularioIva);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasSubGrupoParametroFormularioIva.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.subgrupoparametroformularioivaConstantesFunciones.activarBusquedaPorIdSubGrupoParametroFormularioIva);
				this.jTabbedPaneBusquedasSubGrupoParametroFormularioIva.setEnabledAt(index,this.subgrupoparametroformularioivaConstantesFunciones.activarBusquedaPorIdSubGrupoParametroFormularioIva);
			}

			index= this.jTabbedPaneBusquedasSubGrupoParametroFormularioIva.indexOfComponent(this.jPanelBusquedaPorNombreSubGrupoParametroFormularioIva);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasSubGrupoParametroFormularioIva.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.subgrupoparametroformularioivaConstantesFunciones.activarBusquedaPorNombreSubGrupoParametroFormularioIva);
				this.jTabbedPaneBusquedasSubGrupoParametroFormularioIva.setEnabledAt(index,this.subgrupoparametroformularioivaConstantesFunciones.activarBusquedaPorNombreSubGrupoParametroFormularioIva);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaSubGrupoParametroFormularioIva(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorId")) {
			index= this.jTabbedPaneBusquedasSubGrupoParametroFormularioIva.indexOfComponent(this.jPanelBusquedaPorIdSubGrupoParametroFormularioIva);

			this.jTabbedPaneBusquedasSubGrupoParametroFormularioIva.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSubGrupoParametroFormularioIva.getComponent(index);

			this.subgrupoparametroformularioivaConstantesFunciones.setResaltarBusquedaPorIdSubGrupoParametroFormularioIva(resaltar);

			jPanel.setBorder(this.subgrupoparametroformularioivaConstantesFunciones.resaltarBusquedaPorIdSubGrupoParametroFormularioIva);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasSubGrupoParametroFormularioIva.indexOfComponent(this.jPanelBusquedaPorNombreSubGrupoParametroFormularioIva);

			this.jTabbedPaneBusquedasSubGrupoParametroFormularioIva.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSubGrupoParametroFormularioIva.getComponent(index);

			this.subgrupoparametroformularioivaConstantesFunciones.setResaltarBusquedaPorNombreSubGrupoParametroFormularioIva(resaltar);

			jPanel.setBorder(this.subgrupoparametroformularioivaConstantesFunciones.resaltarBusquedaPorNombreSubGrupoParametroFormularioIva);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarSubGrupoParametroFormularioIva.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioSubGrupoParametroFormularioIva() throws Exception {

		if(this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioSubGrupoParametroFormularioIva();
		this.updateVisibilidadResaltarControlesFormularioSubGrupoParametroFormularioIva();
		this.updateHabilitarResaltarControlesFormularioSubGrupoParametroFormularioIva();
		
	}
	
	public void updateBorderResaltarControlesFormularioSubGrupoParametroFormularioIva() throws Exception {
		if(this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.subgrupoparametroformularioivaConstantesFunciones.resaltaridSubGrupoParametroFormularioIva!=null && this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva!=null) {this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jLabelidSubGrupoParametroFormularioIva.setBorder(this.subgrupoparametroformularioivaConstantesFunciones.resaltaridSubGrupoParametroFormularioIva);}
		if(this.subgrupoparametroformularioivaConstantesFunciones.resaltarid_empresaSubGrupoParametroFormularioIva!=null && this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva!=null) {this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jComboBoxid_empresaSubGrupoParametroFormularioIva.setBorder(this.subgrupoparametroformularioivaConstantesFunciones.resaltarid_empresaSubGrupoParametroFormularioIva);}
		if(this.subgrupoparametroformularioivaConstantesFunciones.resaltarnombreSubGrupoParametroFormularioIva!=null && this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva!=null) {this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jTextAreanombreSubGrupoParametroFormularioIva.setBorder(this.subgrupoparametroformularioivaConstantesFunciones.resaltarnombreSubGrupoParametroFormularioIva);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioSubGrupoParametroFormularioIva() throws Exception {		
		if(this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva!=null) {
	
		//this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jLabelidSubGrupoParametroFormularioIva.setVisible(this.subgrupoparametroformularioivaConstantesFunciones.mostraridSubGrupoParametroFormularioIva);
		this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jPanelidSubGrupoParametroFormularioIva.setVisible(this.subgrupoparametroformularioivaConstantesFunciones.mostraridSubGrupoParametroFormularioIva);
		//this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jComboBoxid_empresaSubGrupoParametroFormularioIva.setVisible(this.subgrupoparametroformularioivaConstantesFunciones.mostrarid_empresaSubGrupoParametroFormularioIva);
		this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jPanelid_empresaSubGrupoParametroFormularioIva.setVisible(this.subgrupoparametroformularioivaConstantesFunciones.mostrarid_empresaSubGrupoParametroFormularioIva);
		//this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jTextAreanombreSubGrupoParametroFormularioIva.setVisible(this.subgrupoparametroformularioivaConstantesFunciones.mostrarnombreSubGrupoParametroFormularioIva);
		this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jPanelnombreSubGrupoParametroFormularioIva.setVisible(this.subgrupoparametroformularioivaConstantesFunciones.mostrarnombreSubGrupoParametroFormularioIva);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioSubGrupoParametroFormularioIva() throws Exception {
		if(this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva!=null) {
	
		this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jLabelidSubGrupoParametroFormularioIva.setEnabled(this.subgrupoparametroformularioivaConstantesFunciones.activaridSubGrupoParametroFormularioIva);
		this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jComboBoxid_empresaSubGrupoParametroFormularioIva.setEnabled(this.subgrupoparametroformularioivaConstantesFunciones.activarid_empresaSubGrupoParametroFormularioIva);
		this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva.jTextAreanombreSubGrupoParametroFormularioIva.setEnabled(this.subgrupoparametroformularioivaConstantesFunciones.activarnombreSubGrupoParametroFormularioIva);
		}
	}
	
		
}