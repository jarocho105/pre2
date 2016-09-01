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
package com.bydan.erp.nomina.presentation.swing.jinternalframes;




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

import com.bydan.erp.nomina.util.RangoDiaNomiConstantesFunciones;
import com.bydan.erp.nomina.util.RangoDiaNomiParameterReturnGeneral;
//import com.bydan.erp.nomina.util.RangoDiaNomiParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.RangoDiaNomiBean;
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

import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.nomina.resources.reportes.AuxiliarReportes;


import com.bydan.erp.nomina.util.*;
import com.bydan.erp.nomina.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.nomina.business.entity.*;
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


import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;

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
public class RangoDiaNomiBeanSwingJInternalFrame extends RangoDiaNomiJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(RangoDiaNomiBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<RangoDiaNomi> rangodianomiValidator = new ClassValidator<RangoDiaNomi>(RangoDiaNomi.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public RangoDiaNomi rangodianomi;	
	public RangoDiaNomi rangodianomiAux;
	public RangoDiaNomi rangodianomiAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public RangoDiaNomi rangodianomiTotales;
	public Long idRangoDiaNomiActual;
	public Long iIdNuevoRangoDiaNomi=0L;
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
	
	public Boolean isPermisoTodoRangoDiaNomi;
	public Boolean isPermisoNuevoRangoDiaNomi;
	public Boolean isPermisoActualizarRangoDiaNomi;
	public Boolean isPermisoActualizarOriginalRangoDiaNomi;
	public Boolean isPermisoEliminarRangoDiaNomi;
	public Boolean isPermisoGuardarCambiosRangoDiaNomi;
	public Boolean isPermisoConsultaRangoDiaNomi;
	public Boolean isPermisoBusquedaRangoDiaNomi;
	public Boolean isPermisoReporteRangoDiaNomi;
	public Boolean isPermisoPaginacionMedioRangoDiaNomi;
	public Boolean isPermisoPaginacionAltoRangoDiaNomi;
	public Boolean isPermisoPaginacionTodoRangoDiaNomi;
	public Boolean isPermisoCopiarRangoDiaNomi;
	public Boolean isPermisoVerFormRangoDiaNomi;
	public Boolean isPermisoDuplicarRangoDiaNomi;
	public Boolean isPermisoOrdenRangoDiaNomi;
	
	
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
	
	public RangoDiaNomiParameterReturnGeneral rangodianomiReturnGeneral;
	public RangoDiaNomiParameterReturnGeneral rangodianomiParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoRangoDiaNomi=false;
	public Boolean esParaAccionDesdeFormularioRangoDiaNomi=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected RangoDiaNomiSessionBeanAdditional rangodianomiSessionBeanAdditional=null;
	
	public RangoDiaNomiSessionBeanAdditional getRangoDiaNomiSessionBeanAdditional() {
		return this.rangodianomiSessionBeanAdditional;
	}
	
	public void setRangoDiaNomiSessionBeanAdditional(RangoDiaNomiSessionBeanAdditional rangodianomiSessionBeanAdditional) {
		try {
			this.rangodianomiSessionBeanAdditional=rangodianomiSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected RangoDiaNomiBeanSwingJInternalFrameAdditional rangodianomiBeanSwingJInternalFrameAdditional=null;
	//public class RangoDiaNomiBeanSwingJInternalFrame
	
	public RangoDiaNomiBeanSwingJInternalFrameAdditional getRangoDiaNomiBeanSwingJInternalFrameAdditional() {
		return this.rangodianomiBeanSwingJInternalFrameAdditional;
	}
	
	public void setRangoDiaNomiBeanSwingJInternalFrameAdditional(RangoDiaNomiBeanSwingJInternalFrameAdditional rangodianomiBeanSwingJInternalFrameAdditional) {
		try {
			this.rangodianomiBeanSwingJInternalFrameAdditional=rangodianomiBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public RangoDiaNomiLogic rangodianomiLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public RangoDiaNomi rangodianomiBean;
	public RangoDiaNomiConstantesFunciones rangodianomiConstantesFunciones;
	//public RangoDiaNomiParameterReturnGeneral rangodianomiReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<RangoDiaNomi> rangodianomis;	
	//public List<RangoDiaNomi> rangodianomisEliminados;
	//public List<RangoDiaNomi> rangodianomisAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoRangoDiaNomi=false;
	public Boolean isVisibilidadCeldaDuplicarRangoDiaNomi=true;
	public Boolean isVisibilidadCeldaCopiarRangoDiaNomi=true;
	public Boolean isVisibilidadCeldaVerFormRangoDiaNomi=true;
	public Boolean isVisibilidadCeldaOrdenRangoDiaNomi=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesRangoDiaNomi=false;
	public Boolean isVisibilidadCeldaModificarRangoDiaNomi=false;
	public Boolean isVisibilidadCeldaActualizarRangoDiaNomi=false;
	public Boolean isVisibilidadCeldaEliminarRangoDiaNomi=false;
	public Boolean isVisibilidadCeldaCancelarRangoDiaNomi=false;
	public Boolean isVisibilidadCeldaGuardarRangoDiaNomi=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosRangoDiaNomi=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoRangoDiaNomi() {
		return this.iIdNuevoRangoDiaNomi;
	}

	public void setiIdNuevoRangoDiaNomi(Long iIdNuevoRangoDiaNomi) {
		this.iIdNuevoRangoDiaNomi = iIdNuevoRangoDiaNomi;
	}
	
	public Long getidRangoDiaNomiActual() {
		return this.idRangoDiaNomiActual;
	}

	public void setidRangoDiaNomiActual(Long idRangoDiaNomiActual) {
		this.idRangoDiaNomiActual = idRangoDiaNomiActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public RangoDiaNomi getrangodianomi() {
		return this.rangodianomi;
	}

	public void setrangodianomi(RangoDiaNomi rangodianomi) {
		this.rangodianomi = rangodianomi;
	}
	
	public RangoDiaNomi getrangodianomiAux() {
		return this.rangodianomiAux;
	}

	public void setrangodianomiAux(RangoDiaNomi rangodianomiAux) {
		this.rangodianomiAux = rangodianomiAux;
	}				
	
	public RangoDiaNomi getrangodianomiAnterior() {
		return this.rangodianomiAnterior;
	}

	public void setrangodianomiAnterior(RangoDiaNomi rangodianomiAnterior) {
		this.rangodianomiAnterior = rangodianomiAnterior;
	}	
	
	public RangoDiaNomi getrangodianomiTotales() {
		return this.rangodianomiTotales;
	}

	public void setrangodianomiTotales(RangoDiaNomi rangodianomiTotales) {
		this.rangodianomiTotales = rangodianomiTotales;
	}	
	
	public RangoDiaNomi getrangodianomiBean() {
		return this.rangodianomiBean;
	}

	public void setrangodianomiBean(RangoDiaNomi rangodianomiBean) {
		this.rangodianomiBean = rangodianomiBean;
	}	
	
	public RangoDiaNomiParameterReturnGeneral getrangodianomiReturnGeneral() {
		return this.rangodianomiReturnGeneral;
	}

	public void setrangodianomiReturnGeneral(RangoDiaNomiParameterReturnGeneral rangodianomiReturnGeneral) {
		this.rangodianomiReturnGeneral = rangodianomiReturnGeneral;
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
	
	
	public RangoDiaNomiLogic getRangoDiaNomiLogic()	{		
		return rangodianomiLogic;
	}

	public void setRangoDiaNomiLogic(RangoDiaNomiLogic rangodianomiLogic) {
		this.rangodianomiLogic = rangodianomiLogic;
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
	
	public Boolean getIsEsNuevoRangoDiaNomi() {
		return isEsNuevoRangoDiaNomi;
	}

	public void setIsEsNuevoRangoDiaNomi(Boolean isEsNuevoRangoDiaNomi) {
		this.isEsNuevoRangoDiaNomi = isEsNuevoRangoDiaNomi;
	}

	public Boolean getEsParaAccionDesdeFormularioRangoDiaNomi() {
		return esParaAccionDesdeFormularioRangoDiaNomi;
	}
	
	public void setEsParaAccionDesdeFormularioRangoDiaNomi(Boolean esParaAccionDesdeFormularioRangoDiaNomi) {
		this.esParaAccionDesdeFormularioRangoDiaNomi = esParaAccionDesdeFormularioRangoDiaNomi;
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

			if(this.rangodianomiSessionBean==null) {
				this.rangodianomiSessionBean=new RangoDiaNomiSessionBean();
			}

			if(!this.rangodianomiSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(rangodianomiSessionBean.getlidEmpresaActual());
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

					if(this.rangodianomi!=null) {
						this.rangodianomi.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormRangoDiaNomi!=null) {
						this.jInternalFrameDetalleFormRangoDiaNomi.jComboBoxid_empresaRangoDiaNomi.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaRangoDiaNomi.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormRangoDiaNomi!=null) {
						if(this.jInternalFrameDetalleFormRangoDiaNomi.jComboBoxid_empresaRangoDiaNomi.getItemCount()>0) {
							this.jInternalFrameDetalleFormRangoDiaNomi.jComboBoxid_empresaRangoDiaNomi.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaRangoDiaNomiGenerico)throws Exception
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
				jComboBoxid_empresaRangoDiaNomiGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaRangoDiaNomiGenerico!=null && jComboBoxid_empresaRangoDiaNomiGenerico.getItemCount()>0) {
					jComboBoxid_empresaRangoDiaNomiGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(RangoDiaNomi rangodianomi,JComboBox jComboBoxid_empresaRangoDiaNomiGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaRangoDiaNomiGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormRangoDiaNomi.jComboBoxid_empresaRangoDiaNomi.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaRangoDiaNomiGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				rangodianomi.setid_empresa(empresaAux.getId());
				rangodianomi.setempresa_descripcion(RangoDiaNomiConstantesFunciones.getEmpresaDescripcion(empresaAux));
				rangodianomi.setEmpresa(empresaAux);			}
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

					if(!RangoDiaNomiJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormRangoDiaNomi!=null) { 
							this.jInternalFrameDetalleFormRangoDiaNomi.jComboBoxid_empresaRangoDiaNomi.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormRangoDiaNomi.jComboBoxid_empresaRangoDiaNomi.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormRangoDiaNomi!=null) { 
					}

					if(!RangoDiaNomiJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormRangoDiaNomi!=null) {
							this.jInternalFrameDetalleFormRangoDiaNomi.jComboBoxid_empresaRangoDiaNomi.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormRangoDiaNomi!=null) {
							this.jInternalFrameDetalleFormRangoDiaNomi.jComboBoxid_empresaRangoDiaNomi.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesRangoDiaNomi() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			RangoDiaNomiConstantesFunciones.refrescarForeignKeysDescripcionesRangoDiaNomi(this.rangodianomiLogic.getRangoDiaNomis());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			RangoDiaNomiConstantesFunciones.refrescarForeignKeysDescripcionesRangoDiaNomi(this.rangodianomis);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//rangodianomiLogic.setRangoDiaNomis(this.rangodianomis);
			rangodianomiLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public RangoDiaNomiParameterReturnGeneral getRangoDiaNomiParameterGeneral() {
		return this.rangodianomiParameterGeneral;
	}
	
	public void setRangoDiaNomiParameterGeneral(RangoDiaNomiParameterReturnGeneral rangodianomiParameterGeneral) {
		this.rangodianomiParameterGeneral = rangodianomiParameterGeneral;
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
	
	public Boolean getIsPermisoTodoRangoDiaNomi() {
		return isPermisoTodoRangoDiaNomi;
	}

	public void setIsPermisoTodoRangoDiaNomi(Boolean isPermisoTodoRangoDiaNomi) {
		this.isPermisoTodoRangoDiaNomi = isPermisoTodoRangoDiaNomi;
	}

	public Boolean getIsPermisoNuevoRangoDiaNomi() {
		return isPermisoNuevoRangoDiaNomi;
	}

	public void setIsPermisoNuevoRangoDiaNomi(Boolean isPermisoNuevoRangoDiaNomi) {
		this.isPermisoNuevoRangoDiaNomi = isPermisoNuevoRangoDiaNomi;
	}

	public Boolean getIsPermisoActualizarRangoDiaNomi() {
		return isPermisoActualizarRangoDiaNomi;
	}

	public void setIsPermisoActualizarRangoDiaNomi(Boolean isPermisoActualizarRangoDiaNomi) {
		this.isPermisoActualizarRangoDiaNomi = isPermisoActualizarRangoDiaNomi;
	}

	public Boolean getIsPermisoEliminarRangoDiaNomi() {
		return isPermisoEliminarRangoDiaNomi;
	}

	public void setIsPermisoEliminarRangoDiaNomi(Boolean isPermisoEliminarRangoDiaNomi) {
		this.isPermisoEliminarRangoDiaNomi = isPermisoEliminarRangoDiaNomi;
	}

	public Boolean getIsPermisoGuardarCambiosRangoDiaNomi() {
		return isPermisoGuardarCambiosRangoDiaNomi;
	}

	public void setIsPermisoGuardarCambiosRangoDiaNomi(Boolean isPermisoGuardarCambiosRangoDiaNomi) {
		this.isPermisoGuardarCambiosRangoDiaNomi = isPermisoGuardarCambiosRangoDiaNomi;
	}
	
	public Boolean getIsPermisoConsultaRangoDiaNomi() {
		return isPermisoConsultaRangoDiaNomi;
	}

	public void setIsPermisoConsultaRangoDiaNomi(Boolean isPermisoConsultaRangoDiaNomi) {
		this.isPermisoConsultaRangoDiaNomi = isPermisoConsultaRangoDiaNomi;
	}

	public Boolean getIsPermisoBusquedaRangoDiaNomi() {
		return isPermisoBusquedaRangoDiaNomi;
	}

	public void setIsPermisoBusquedaRangoDiaNomi(Boolean isPermisoBusquedaRangoDiaNomi) {
		this.isPermisoBusquedaRangoDiaNomi = isPermisoBusquedaRangoDiaNomi;
	}

	public Boolean getIsPermisoReporteRangoDiaNomi() {
		return isPermisoReporteRangoDiaNomi;
	}

	public void setIsPermisoReporteRangoDiaNomi(Boolean isPermisoReporteRangoDiaNomi) {
		this.isPermisoReporteRangoDiaNomi = isPermisoReporteRangoDiaNomi;
	}
	
	public Boolean getIsPermisoPaginacionMedioRangoDiaNomi() {
		return isPermisoPaginacionMedioRangoDiaNomi;
	}

	public void setIsPermisoPaginacionMedioRangoDiaNomi(Boolean isPermisoPaginacionMedioRangoDiaNomi) {
		this.isPermisoPaginacionMedioRangoDiaNomi = isPermisoPaginacionMedioRangoDiaNomi;
	}
	
	public Boolean getIsPermisoPaginacionTodoRangoDiaNomi() {
		return isPermisoPaginacionTodoRangoDiaNomi;
	}

	public void setIsPermisoPaginacionTodoRangoDiaNomi(Boolean isPermisoPaginacionTodoRangoDiaNomi) {
		this.isPermisoPaginacionTodoRangoDiaNomi = isPermisoPaginacionTodoRangoDiaNomi;
	}
	
	public Boolean getIsPermisoPaginacionAltoRangoDiaNomi() {
		return isPermisoPaginacionAltoRangoDiaNomi;
	}

	public void setIsPermisoPaginacionAltoRangoDiaNomi(Boolean isPermisoPaginacionAltoRangoDiaNomi) {
		this.isPermisoPaginacionAltoRangoDiaNomi = isPermisoPaginacionAltoRangoDiaNomi;
	}
	
	public Boolean getIsPermisoCopiarRangoDiaNomi() {
		return isPermisoCopiarRangoDiaNomi;
	}

	public void setIsPermisoCopiarRangoDiaNomi(Boolean isPermisoCopiarRangoDiaNomi) {
		this.isPermisoCopiarRangoDiaNomi = isPermisoCopiarRangoDiaNomi;
	}
	
	public Boolean getIsPermisoVerFormRangoDiaNomi() {
		return isPermisoVerFormRangoDiaNomi;
	}

	public void setIsPermisoVerFormRangoDiaNomi(Boolean isPermisoVerFormRangoDiaNomi) {
		this.isPermisoVerFormRangoDiaNomi = isPermisoVerFormRangoDiaNomi;
	}
	
	public Boolean getIsPermisoDuplicarRangoDiaNomi() {
		return isPermisoDuplicarRangoDiaNomi;
	}

	public void setIsPermisoDuplicarRangoDiaNomi(Boolean isPermisoDuplicarRangoDiaNomi) {
		this.isPermisoDuplicarRangoDiaNomi = isPermisoDuplicarRangoDiaNomi;
	}
	
	public Boolean getIsPermisoOrdenRangoDiaNomi() {
		return isPermisoOrdenRangoDiaNomi;
	}

	public void setIsPermisoOrdenRangoDiaNomi(Boolean isPermisoOrdenRangoDiaNomi) {
		this.isPermisoOrdenRangoDiaNomi = isPermisoOrdenRangoDiaNomi;
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
	
	public Boolean getIsVisibilidadCeldaNuevoRangoDiaNomi() {
		return isVisibilidadCeldaNuevoRangoDiaNomi;
	}

	public void setIsVisibilidadCeldaNuevoRangoDiaNomi(Boolean isVisibilidadCeldaNuevoRangoDiaNomi) {
		this.isVisibilidadCeldaNuevoRangoDiaNomi = isVisibilidadCeldaNuevoRangoDiaNomi;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarRangoDiaNomi() {
		return isVisibilidadCeldaDuplicarRangoDiaNomi;
	}

	public void setIsVisibilidadCeldaDuplicarRangoDiaNomi(Boolean isVisibilidadCeldaDuplicarRangoDiaNomi) {
		this.isVisibilidadCeldaDuplicarRangoDiaNomi = isVisibilidadCeldaDuplicarRangoDiaNomi;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarRangoDiaNomi() {
		return isVisibilidadCeldaCopiarRangoDiaNomi;
	}

	public void setIsVisibilidadCeldaCopiarRangoDiaNomi(Boolean isVisibilidadCeldaCopiarRangoDiaNomi) {
		this.isVisibilidadCeldaCopiarRangoDiaNomi = isVisibilidadCeldaCopiarRangoDiaNomi;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormRangoDiaNomi() {
		return isVisibilidadCeldaVerFormRangoDiaNomi;
	}

	public void setIsVisibilidadCeldaVerFormRangoDiaNomi(Boolean isVisibilidadCeldaVerFormRangoDiaNomi) {
		this.isVisibilidadCeldaVerFormRangoDiaNomi = isVisibilidadCeldaVerFormRangoDiaNomi;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenRangoDiaNomi() {
		return isVisibilidadCeldaOrdenRangoDiaNomi;
	}

	public void setIsVisibilidadCeldaOrdenRangoDiaNomi(Boolean isVisibilidadCeldaOrdenRangoDiaNomi) {
		this.isVisibilidadCeldaOrdenRangoDiaNomi = isVisibilidadCeldaOrdenRangoDiaNomi;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesRangoDiaNomi() {
		return isVisibilidadCeldaNuevoRelacionesRangoDiaNomi;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesRangoDiaNomi(Boolean isVisibilidadCeldaNuevoRelacionesRangoDiaNomi) {
		this.isVisibilidadCeldaNuevoRelacionesRangoDiaNomi = isVisibilidadCeldaNuevoRelacionesRangoDiaNomi;
	}
	
	public Boolean getIsVisibilidadCeldaModificarRangoDiaNomi() {
		return isVisibilidadCeldaModificarRangoDiaNomi;
	}

	public void setIsVisibilidadCeldaModificarRangoDiaNomi(Boolean isVisibilidadCeldaModificarRangoDiaNomi) {
		this.isVisibilidadCeldaModificarRangoDiaNomi = isVisibilidadCeldaModificarRangoDiaNomi;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarRangoDiaNomi() {
		return isVisibilidadCeldaActualizarRangoDiaNomi;
	}

	public void setIsVisibilidadCeldaActualizarRangoDiaNomi(Boolean isVisibilidadCeldaActualizarRangoDiaNomi) {
		this.isVisibilidadCeldaActualizarRangoDiaNomi = isVisibilidadCeldaActualizarRangoDiaNomi;
	}

	public Boolean getIsVisibilidadCeldaEliminarRangoDiaNomi() {
		return isVisibilidadCeldaEliminarRangoDiaNomi;
	}

	public void setIsVisibilidadCeldaEliminarRangoDiaNomi(Boolean isVisibilidadCeldaEliminarRangoDiaNomi) {
		this.isVisibilidadCeldaEliminarRangoDiaNomi = isVisibilidadCeldaEliminarRangoDiaNomi;
	}

	public Boolean getIsVisibilidadCeldaCancelarRangoDiaNomi() {
		return isVisibilidadCeldaCancelarRangoDiaNomi;
	}

	public void setIsVisibilidadCeldaCancelarRangoDiaNomi(Boolean isVisibilidadCeldaCancelarRangoDiaNomi) {
		this.isVisibilidadCeldaCancelarRangoDiaNomi = isVisibilidadCeldaCancelarRangoDiaNomi;
	}

	public Boolean getIsVisibilidadCeldaGuardarRangoDiaNomi() {
		return isVisibilidadCeldaGuardarRangoDiaNomi;
	}

	public void setIsVisibilidadCeldaGuardarRangoDiaNomi(Boolean isVisibilidadCeldaGuardarRangoDiaNomi) {
		this.isVisibilidadCeldaGuardarRangoDiaNomi = isVisibilidadCeldaGuardarRangoDiaNomi;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosRangoDiaNomi() {
		return isVisibilidadCeldaGuardarCambiosRangoDiaNomi;
	}

	public void setIsVisibilidadCeldaGuardarCambiosRangoDiaNomi(Boolean isVisibilidadCeldaGuardarCambiosRangoDiaNomi) {
		this.isVisibilidadCeldaGuardarCambiosRangoDiaNomi = isVisibilidadCeldaGuardarCambiosRangoDiaNomi;
	}
		
	public RangoDiaNomiSessionBean getrangodianomiSessionBean() {
		return this.rangodianomiSessionBean;
	}
	
	public void setrangodianomiSessionBean(RangoDiaNomiSessionBean rangodianomiSessionBean) {
		this.rangodianomiSessionBean=rangodianomiSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysRangoDiaNomi(RangoDiaNomi rangodianomi)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(rangodianomi,null);
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
	
	public void bugActualizarReferenciaActual(RangoDiaNomi rangodianomi,RangoDiaNomi rangodianomiAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalRangoDiaNomi(rangodianomi);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		rangodianomiAux.setId(rangodianomi.getId());
		rangodianomiAux.setVersionRow(rangodianomi.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessRangoDiaNomi();
		
			int intSelectedRow = this.jTableDatosRangoDiaNomi.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rangodianomi =(RangoDiaNomi) this.rangodianomiLogic.getRangoDiaNomis().toArray()[this.jTableDatosRangoDiaNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.rangodianomi =(RangoDiaNomi) this.rangodianomis.toArray()[this.jTableDatosRangoDiaNomi.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(RangoDiaNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualRangoDiaNomi(this.rangodianomi,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysRangoDiaNomi(this.rangodianomi);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = rangodianomiValidator.getInvalidValues(this.rangodianomi);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			rangodianomiLogic.setDatosCliente(datosCliente);
			rangodianomiLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				rangodianomiAux=new  RangoDiaNomi();
				
				rangodianomiAux.setIsNew(true);
				rangodianomiAux.setIsChanged(true);
				
				rangodianomiAux.setRangoDiaNomiOriginal(this.rangodianomi);
				
				rangodianomiAux.setId(this.rangodianomi.getId());	
				rangodianomiAux.setVersionRow(this.rangodianomi.getVersionRow());	
				rangodianomiAux.setid_empresa(this.rangodianomi.getid_empresa());	
				rangodianomiAux.setfecha_inicio(this.rangodianomi.getfecha_inicio());	
				rangodianomiAux.setfecha_fin(this.rangodianomi.getfecha_fin());	
				rangodianomiAux.setdescripcion(this.rangodianomi.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.rangodianomiSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.rangodianomiSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(rangodianomiAux,rangodianomiLogic.getRangoDiaNomis());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(rangodianomiAux,rangodianomis);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.rangodianomiSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.rangodianomiSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						rangodianomiLogic.saveRangoDiaNomis();//WithConnection
						//rangodianomiLogic.getSetVersionRowRangoDiaNomis();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.rangodianomi,rangodianomiAux);
					
					this.refrescarForeignKeysDescripcionesRangoDiaNomi();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.rangodianomiSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.rangodianomiSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								rangodianomiLogic.saveRangoDiaNomiRelaciones(rangodianomiAux);//WithConnection
								//rangodianomiLogic.getSetVersionRowRangoDiaNomis();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.rangodianomi,rangodianomiAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.rangodianomiSessionBean.getEstaModoGuardarRelaciones() 
									|| this.rangodianomiSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(rangodianomiAux,rangodianomiLogic.getRangoDiaNomis());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(rangodianomiAux,rangodianomis);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.rangodianomi,rangodianomiAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				rangodianomiAux=new  RangoDiaNomi();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.rangodianomiSessionBean.getEsGuardarRelacionado() 
					|| (this.rangodianomiSessionBean.getEsGuardarRelacionado() && this.rangodianomi.getId()>=0)) {
						
					rangodianomiAux.setIsNew(false);
				}
				
				rangodianomiAux.setIsDeleted(false);
			
				rangodianomiAux.setId(this.rangodianomi.getId());	
				rangodianomiAux.setVersionRow(this.rangodianomi.getVersionRow());	
				rangodianomiAux.setid_empresa(this.rangodianomi.getid_empresa());	
				rangodianomiAux.setfecha_inicio(this.rangodianomi.getfecha_inicio());	
				rangodianomiAux.setfecha_fin(this.rangodianomi.getfecha_fin());	
				rangodianomiAux.setdescripcion(this.rangodianomi.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(rangodianomiAux,rangodianomiLogic.getRangoDiaNomis());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(rangodianomiAux,rangodianomis);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.rangodianomiSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.rangodianomiSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						rangodianomiLogic.saveRangoDiaNomis();//WithConnection
						//rangodianomiLogic.getSetVersionRowRangoDiaNomis();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.rangodianomi,rangodianomiAux);
					
					this.refrescarForeignKeysDescripcionesRangoDiaNomi();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.rangodianomiSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.rangodianomiSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								rangodianomiLogic.saveRangoDiaNomiRelaciones(rangodianomiAux);//WithConnection
								//rangodianomiLogic.getSetVersionRowRangoDiaNomis();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.rangodianomi,rangodianomiAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.rangodianomiSessionBean.getEstaModoGuardarRelaciones() 
									|| this.rangodianomiSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(rangodianomiAux,rangodianomiLogic.getRangoDiaNomis());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(rangodianomiAux,rangodianomis);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.rangodianomi,rangodianomiAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				rangodianomiAux=new  RangoDiaNomi();
				
				rangodianomiAux.setIsNew(false);
				rangodianomiAux.setIsChanged(false);
				
				rangodianomiAux.setIsDeleted(true);
				
				rangodianomiAux.setId(this.rangodianomi.getId());	
				rangodianomiAux.setVersionRow(this.rangodianomi.getVersionRow());	
				rangodianomiAux.setid_empresa(this.rangodianomi.getid_empresa());	
				rangodianomiAux.setfecha_inicio(this.rangodianomi.getfecha_inicio());	
				rangodianomiAux.setfecha_fin(this.rangodianomi.getfecha_fin());	
				rangodianomiAux.setdescripcion(this.rangodianomi.getdescripcion());	
				
				if(this.rangodianomiSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.rangodianomiAux.getId()>=0) {	
						this.rangodianomisEliminados.add(rangodianomiAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(rangodianomiAux,rangodianomiLogic.getRangoDiaNomis());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(rangodianomiAux,rangodianomis);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.rangodianomiSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.rangodianomiSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						rangodianomiLogic.saveRangoDiaNomis();//WithConnection
						//rangodianomiLogic.getSetVersionRowRangoDiaNomis();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.rangodianomiSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.rangodianomiSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								rangodianomiLogic.saveRangoDiaNomiRelaciones(rangodianomiAux);//WithConnection
								//rangodianomiLogic.getSetVersionRowRangoDiaNomis();//WithConnection
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
							if(this.rangodianomiSessionBean.getEstaModoGuardarRelaciones() 
								|| this.rangodianomiSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(rangodianomiAux,rangodianomiLogic.getRangoDiaNomis());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(rangodianomiAux,rangodianomis);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rangodianomiLogic.getRangoDiaNomis().addAll(this.rangodianomisEliminados);
					
					rangodianomiLogic.saveRangoDiaNomis();//WithConnection
					//rangodianomiLogic.getSetVersionRowRangoDiaNomis();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesRangoDiaNomi();
				
				this.rangodianomisEliminados= new ArrayList<RangoDiaNomi>();		
			}
			
			if(this.rangodianomiSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.rangodianomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Rango Dia Nomi GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Rango Dia Nomi",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.rangodianomi=rangodianomiAux;
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
      		//this.finishProcessRangoDiaNomi();
      	}
		
	}	
	
	public void actualizarRelaciones(RangoDiaNomi rangodianomiLocal) throws Exception {
		
		if(this.rangodianomiSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(RangoDiaNomi rangodianomiLocal) throws Exception {	
		if(this.rangodianomiSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				rangodianomiLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarRangoDiaNomiActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosRangoDiaNomi.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.rangodianomi =(RangoDiaNomi) this.rangodianomiLogic.getRangoDiaNomis().toArray()[this.jTableDatosRangoDiaNomi.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.rangodianomi =(RangoDiaNomi) this.rangodianomis.toArray()[this.jTableDatosRangoDiaNomi.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = rangodianomiValidator.getInvalidValues(this.rangodianomi);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(RangoDiaNomi rangodianomi,List<RangoDiaNomi> rangodianomis) throws Exception {
		try	{		
			RangoDiaNomiConstantesFunciones.actualizarLista(rangodianomi,rangodianomis,this.rangodianomiSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(RangoDiaNomi rangodianomi,List<RangoDiaNomi> rangodianomis) throws Exception {
		try	{			
			RangoDiaNomiConstantesFunciones.actualizarSelectedLista(rangodianomi,rangodianomis);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<RangoDiaNomi> rangodianomisLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				rangodianomisLocal=this.rangodianomiLogic.getRangoDiaNomis();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				rangodianomisLocal=this.rangodianomis;
			}
			//ARCHITECTURE
		
			for(RangoDiaNomi rangodianomiLocal:rangodianomisLocal) {
				if(this.permiteMantenimiento(rangodianomiLocal) && rangodianomiLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+RangoDiaNomiConstantesFunciones.getRangoDiaNomiLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(RangoDiaNomiConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRangoDiaNomi.jLabelid_empresaRangoDiaNomi,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RangoDiaNomiConstantesFunciones.FECHAINICIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRangoDiaNomi.jLabelfecha_inicioRangoDiaNomi,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RangoDiaNomiConstantesFunciones.FECHAFIN)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRangoDiaNomi.jLabelfecha_finRangoDiaNomi,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RangoDiaNomiConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRangoDiaNomi.jLabeldescripcionRangoDiaNomi,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormRangoDiaNomi!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRangoDiaNomi.jLabelid_empresaRangoDiaNomi,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRangoDiaNomi.jLabelfecha_inicioRangoDiaNomi,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRangoDiaNomi.jLabelfecha_finRangoDiaNomi,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRangoDiaNomi.jLabeldescripcionRangoDiaNomi,"");
		
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
		this.iIdNuevoRangoDiaNomi--;	
		
		
		this.rangodianomiAux=new RangoDiaNomi();
		
		this.rangodianomiAux.setId(this.iIdNuevoRangoDiaNomi);
		this.rangodianomiAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.rangodianomiLogic.getRangoDiaNomis().add(this.rangodianomiAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.rangodianomis.add(this.rangodianomiAux);
		}
		//ARCHITECTURE
		
		this.rangodianomi=this.rangodianomiAux;
		
		if(RangoDiaNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioRangoDiaNomi(this.rangodianomi);
			this.setVariablesObjetoActualToFormularioForeignKeyRangoDiaNomi(this.rangodianomi);
		}
				
		//this.setDefaultControlesRangoDiaNomi();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyRangoDiaNomi();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyRangoDiaNomi();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyRangoDiaNomi();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualRangoDiaNomi(this.rangodianomiBean,this.rangodianomi,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysRangoDiaNomi(this.rangodianomi);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(RangoDiaNomiConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.rangodianomiSessionBean.getConGuardarRelaciones()) {
			classes=RangoDiaNomiConstantesFunciones.getClassesRelationshipsOfRangoDiaNomi(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.rangodianomiReturnGeneral=rangodianomiLogic.procesarEventosRangoDiaNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.rangodianomiLogic.getRangoDiaNomis(),this.rangodianomi,this.rangodianomiParameterGeneral,this.isEsNuevoRangoDiaNomi,classes);//this.rangodianomiLogic.getRangoDiaNomi()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanRangoDiaNomi(this.rangodianomiReturnGeneral,this.rangodianomiBean,false);
		
		if(this.rangodianomiReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyRangoDiaNomi(this.rangodianomiReturnGeneral.getRangoDiaNomi());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioRangoDiaNomi(this.rangodianomiReturnGeneral.getRangoDiaNomi());
		}
		
		if(this.rangodianomiReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioRangoDiaNomi(this.rangodianomiReturnGeneral.getRangoDiaNomi(),classes);//this.rangodianomiBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualRangoDiaNomi(this.rangodianomi,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyRangoDiaNomi();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyRangoDiaNomi();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			RangoDiaNomiBeanSwingJInternalFrameAdditional.RecargarFormRangoDiaNomi(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingRangoDiaNomi(false);
						
			if(rangodianomiSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(RangoDiaNomiJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualRangoDiaNomi();
			}
			
			this.actualizarVisualTableDatosRangoDiaNomi();
			
			this.jTableDatosRangoDiaNomi.setRowSelectionInterval(this.getIndiceNuevoRangoDiaNomi(), this.getIndiceNuevoRangoDiaNomi());
			
			this.seleccionarFilaTablaRangoDiaNomiActual();
						
			this.actualizarEstadoCeldasBotonesRangoDiaNomi("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesRangoDiaNomi(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormRangoDiaNomi.jDateChooserfecha_inicioRangoDiaNomi.setEnabled(isHabilitar && this.rangodianomiConstantesFunciones.activarfecha_inicioRangoDiaNomi);
		this.jInternalFrameDetalleFormRangoDiaNomi.jDateChooserfecha_finRangoDiaNomi.setEnabled(isHabilitar && this.rangodianomiConstantesFunciones.activarfecha_finRangoDiaNomi);
		this.jInternalFrameDetalleFormRangoDiaNomi.jTextAreadescripcionRangoDiaNomi.setEnabled(isHabilitar && this.rangodianomiConstantesFunciones.activardescripcionRangoDiaNomi);	
		//
		this.jInternalFrameDetalleFormRangoDiaNomi.jComboBoxid_empresaRangoDiaNomi.setEnabled(isHabilitar && this.rangodianomiConstantesFunciones.activarid_empresaRangoDiaNomi);
	};
	
	public void setDefaultControlesRangoDiaNomi() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoRangoDiaNomi(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.rangodianomiSessionBean.setConGuardarRelaciones(true);			
			this.rangodianomiSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormRangoDiaNomi.jTabbedPaneRelacionesRangoDiaNomi.setVisible(true);
			
					
		} else {
			//this.rangodianomiSessionBean.setConGuardarRelaciones(false);			
			this.rangodianomiSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormRangoDiaNomi.jTabbedPaneRelacionesRangoDiaNomi.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoRangoDiaNomi() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(RangoDiaNomi rangodianomiAux:this.rangodianomiLogic.getRangoDiaNomis()) {
				if(rangodianomiAux.getId().equals(this.iIdNuevoRangoDiaNomi)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(RangoDiaNomi rangodianomiAux:this.rangodianomis) {
				if(rangodianomiAux.getId().equals(this.iIdNuevoRangoDiaNomi)) {
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
	
	public int getIndiceActualRangoDiaNomi(RangoDiaNomi rangodianomi,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(RangoDiaNomi rangodianomiAux:this.rangodianomiLogic.getRangoDiaNomis()) {
				if(rangodianomiAux.getId().equals(rangodianomi.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(RangoDiaNomi rangodianomiAux:this.rangodianomis) {
				if(rangodianomiAux.getId().equals(rangodianomi.getId())) {
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
	
	public void setCamposBaseDesdeOriginalRangoDiaNomi(RangoDiaNomi rangodianomiOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(RangoDiaNomi rangodianomiAux:this.rangodianomiLogic.getRangoDiaNomis()) {
				if(rangodianomiAux.getRangoDiaNomiOriginal().getId().equals(rangodianomiOriginal.getId())) {
					existe=true;
					rangodianomiOriginal.setId(rangodianomiAux.getId());
					rangodianomiOriginal.setVersionRow(rangodianomiAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(RangoDiaNomi rangodianomiAux:this.rangodianomis) {
				if(rangodianomiAux.getRangoDiaNomiOriginal().getId().equals(rangodianomiOriginal.getId())) {
					existe=true;
					rangodianomiOriginal.setId(rangodianomiAux.getId());
					rangodianomiOriginal.setVersionRow(rangodianomiAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosRangoDiaNomi(Boolean esParaCancelar) throws Exception {
		rangodianomisAux=new ArrayList<RangoDiaNomi>();
		rangodianomiAux=new RangoDiaNomi();
		
		if(!this.rangodianomiSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(RangoDiaNomi rangodianomiAux:this.rangodianomiLogic.getRangoDiaNomis()) {
					if(rangodianomiAux.getId()<0) {
						rangodianomisAux.add(rangodianomiAux);
					}		
				}
				this.iIdNuevoRangoDiaNomi=0L;
				this.rangodianomiLogic.getRangoDiaNomis().removeAll(rangodianomisAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(RangoDiaNomi rangodianomiAux:this.rangodianomis) {
					if(rangodianomiAux.getId()<0) {
						rangodianomisAux.add(rangodianomiAux);
					}		
				}
				this.iIdNuevoRangoDiaNomi=0L;
				this.rangodianomis.removeAll(rangodianomisAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoRangoDiaNomi 
					&& this.rangodianomiLogic.getRangoDiaNomis().size()>0
					) {
					rangodianomiAux=this.rangodianomiLogic.getRangoDiaNomis().get(this.rangodianomiLogic.getRangoDiaNomis().size() - 1);
				
					if(rangodianomiAux.getId()<0) {
						this.rangodianomiLogic.getRangoDiaNomis().remove(rangodianomiAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoRangoDiaNomi && this.rangodianomis.size()>0) {
					rangodianomiAux=this.rangodianomis.get(this.rangodianomis.size() - 1);
				
					if(rangodianomiAux.getId()<0) {
						this.rangodianomis.remove(rangodianomiAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoRangoDiaNomi(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(rangodianomi.getId()<0) {
				this.rangodianomiLogic.getRangoDiaNomis().remove(this.rangodianomi);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(rangodianomi.getId()<0) {
				this.rangodianomis.remove(this.rangodianomi);
			}
		}			
	}
	
	public void setEstadosInicialesRangoDiaNomi(List<RangoDiaNomi> rangodianomisAux) throws Exception {
		RangoDiaNomiConstantesFunciones.setEstadosInicialesRangoDiaNomi(rangodianomisAux);
	}
	
	public void setEstadosInicialesRangoDiaNomi(RangoDiaNomi rangodianomiAux) throws Exception {
		RangoDiaNomiConstantesFunciones.setEstadosInicialesRangoDiaNomi(rangodianomiAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarRangoDiaNomiActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesRangoDiaNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarRangoDiaNomiActual()) {
				if(!this.isEsNuevoRangoDiaNomi) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesRangoDiaNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoRangoDiaNomi=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarRangoDiaNomiActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Rango Dia Nomi ?", "MANTENIMIENTO DE Rango Dia Nomi", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesRangoDiaNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(RangoDiaNomi rangodianomi) throws Exception {
		RangoDiaNomiConstantesFunciones.seleccionarAsignar(this.rangodianomi,rangodianomi);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarRangoDiaNomi=this.isPermisoActualizarOriginalRangoDiaNomi;
			
			
			this.seleccionarAsignar(rangodianomi);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			RangoDiaNomiConstantesFunciones.quitarEspaciosRangoDiaNomi(this.rangodianomi,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesRangoDiaNomi("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.rangodianomiSessionBean.setsFuncionBusquedaRapida(this.rangodianomiSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoRangoDiaNomi) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosRangoDiaNomi(esParaCancelar);				
				this.cancelarNuevoRangoDiaNomi(esParaCancelar);								
			}
			
			this.rangodianomi=new RangoDiaNomi();
			
			this.inicializarRangoDiaNomi();
			
			this.actualizarEstadoCeldasBotonesRangoDiaNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarRangoDiaNomi() throws Exception {
		try {
			RangoDiaNomiConstantesFunciones.inicializarRangoDiaNomi(this.rangodianomi);
			
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
			FuncionesSwing.manageException(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.rangodianomiLogic.getRangoDiaNomis().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteRangoDiaNomis(String sAccionBusqueda,List<RangoDiaNomi> rangodianomisParaReportes) throws Exception {
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
					sPathReporteFinal="RangoDiaNomi"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="RangoDiaNomiMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("RangoDiaNomiMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="RangoDiaNomi"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Rango Dia Nomis");		
		parameters.put("busquedapor", RangoDiaNomiConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceRangoDiaNomi=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			RangoDiaNomiConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			RangoDiaNomiConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceRangoDiaNomi=new JRBeanArrayDataSource(RangoDiaNomiJInternalFrame.TraerRangoDiaNomiBeans(rangodianomisParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceRangoDiaNomi);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+RangoDiaNomiConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+RangoDiaNomiConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(RangoDiaNomiBean.TraerRangoDiaNomiBeans(rangodianomisParaReportes).toArray()));
							
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
				this.generarExcelReporteRangoDiaNomis(sAccionBusqueda,sTipoArchivoReporte,rangodianomisParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalRangoDiaNomis(sAccionBusqueda,sTipoArchivoReporte,rangodianomisParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoRangoDiaNomiActionPerformed(null);
					//this.generarExcelReporteRangoDiaNomis(sAccionBusqueda,sTipoArchivoReporte,rangodianomisParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalRangoDiaNomis(sAccionBusqueda,sTipoArchivoReporte,rangodianomisParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesRangoDiaNomis(sAccionBusqueda,sTipoArchivoReporte,rangodianomisParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesRangoDiaNomis(sAccionBusqueda,sTipoArchivoReporte,rangodianomisParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRangoDiaNomis(String sAccionBusqueda,String sTipoArchivoReporte,List<RangoDiaNomi> rangodianomisParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"rangodianomi";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("RangoDiaNomis");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderRangoDiaNomi("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(RangoDiaNomi rangodianomi : rangodianomisParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			RangoDiaNomiConstantesFunciones.generarExcelReporteDataRangoDiaNomi("NORMAL",row,workbook,rangodianomi,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.rangodianomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Rango Dia Nomi",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderRangoDiaNomi(String sTipo,Row row,Workbook workbook) {
		
		RangoDiaNomiConstantesFunciones.generarExcelReporteHeaderRangoDiaNomi(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalRangoDiaNomis(String sAccionBusqueda,String sTipoArchivoReporte,List<RangoDiaNomi> rangodianomisParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"rangodianomi_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("RangoDiaNomis");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(RangoDiaNomi rangodianomi : rangodianomisParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(RangoDiaNomiConstantesFunciones.getRangoDiaNomiDescripcion(rangodianomi));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RangoDiaNomiConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RangoDiaNomiConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(rangodianomi.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RangoDiaNomiConstantesFunciones.LABEL_FECHAINICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RangoDiaNomiConstantesFunciones.LABEL_FECHAINICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(rangodianomi.getfecha_inicio());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RangoDiaNomiConstantesFunciones.LABEL_FECHAFIN))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RangoDiaNomiConstantesFunciones.LABEL_FECHAFIN);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(rangodianomi.getfecha_fin());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RangoDiaNomiConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RangoDiaNomiConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(rangodianomi.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.rangodianomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Rango Dia Nomi",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesRangoDiaNomis(String sAccionBusqueda,String sTipoArchivoReporte,List<RangoDiaNomi> rangodianomisParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<RangoDiaNomi> rangodianomisRespaldo=null;
		
		classes=RangoDiaNomiConstantesFunciones.getClassesRelationshipsOfRangoDiaNomi(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.rangodianomiLogic.setDatosCliente(this.datosCliente);
		this.rangodianomiLogic.setDatosDeep(this.datosDeep);
		this.rangodianomiLogic.setIsConDeep(true);
		
		rangodianomisRespaldo=this.rangodianomiLogic.getRangoDiaNomis();
		
		this.rangodianomiLogic.setRangoDiaNomis(rangodianomisParaReportes);	
		this.rangodianomiLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		rangodianomisParaReportes=this.rangodianomiLogic.getRangoDiaNomis();
		this.rangodianomiLogic.setRangoDiaNomis(rangodianomisRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"rangodianomi_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("RangoDiaNomis");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderRangoDiaNomi("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(RangoDiaNomi rangodianomi : rangodianomisParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderRangoDiaNomi("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			RangoDiaNomiConstantesFunciones.generarExcelReporteDataRangoDiaNomi("NORMAL",row,workbook,rangodianomi,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(RangoDiaNomiConstantesFunciones.getRangoDiaNomiDescripcion(rangodianomi));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.rangodianomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Rango Dia Nomi",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoRangoDiaNomi.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoRangoDiaNomi.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoRangoDiaNomi.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoRangoDiaNomi.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessRangoDiaNomi() throws Exception {		
		this.startProcessRangoDiaNomi(true);
	}
	
	public void startProcessRangoDiaNomi(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasRangoDiaNomi ,this.jPanelParametrosReportesRangoDiaNomi, this.jScrollPanelDatosRangoDiaNomi,this.jPanelPaginacionRangoDiaNomi, this.jScrollPanelDatosEdicionRangoDiaNomi, this.jPanelAccionesRangoDiaNomi,this.jPanelAccionesFormularioRangoDiaNomi,this.jmenuBarRangoDiaNomi,this.jmenuBarDetalleRangoDiaNomi,this.jTtoolBarRangoDiaNomi,this.jTtoolBarDetalleRangoDiaNomi);		
		
		final JTabbedPane jTabbedPaneBusquedasRangoDiaNomi=this.jTabbedPaneBusquedasRangoDiaNomi; 
		
		final JPanel jPanelParametrosReportesRangoDiaNomi=this.jPanelParametrosReportesRangoDiaNomi;
		//final JScrollPane jScrollPanelDatosRangoDiaNomi=this.jScrollPanelDatosRangoDiaNomi;
		final JTable jTableDatosRangoDiaNomi=this.jTableDatosRangoDiaNomi;		
		final JPanel jPanelPaginacionRangoDiaNomi=this.jPanelPaginacionRangoDiaNomi;
		//final JScrollPane jScrollPanelDatosEdicionRangoDiaNomi=this.jScrollPanelDatosEdicionRangoDiaNomi;
		final JPanel jPanelAccionesRangoDiaNomi=this.jPanelAccionesRangoDiaNomi;
		
		JPanel jPanelCamposAuxiliarRangoDiaNomi=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarRangoDiaNomi=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormRangoDiaNomi!=null) {
			jPanelCamposAuxiliarRangoDiaNomi=this.jInternalFrameDetalleFormRangoDiaNomi.jPanelCamposRangoDiaNomi;
			jPanelAccionesFormularioAuxiliarRangoDiaNomi=this.jInternalFrameDetalleFormRangoDiaNomi.jPanelAccionesFormularioRangoDiaNomi;
		}
		
		final JPanel jPanelCamposRangoDiaNomi=jPanelCamposAuxiliarRangoDiaNomi;
		final JPanel jPanelAccionesFormularioRangoDiaNomi=jPanelAccionesFormularioAuxiliarRangoDiaNomi;
		
		
		final JMenuBar jmenuBarRangoDiaNomi=this.jmenuBarRangoDiaNomi;
		final JToolBar jTtoolBarRangoDiaNomi=this.jTtoolBarRangoDiaNomi;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarRangoDiaNomi=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarRangoDiaNomi=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormRangoDiaNomi!=null) {
			jmenuBarDetalleAuxiliarRangoDiaNomi=this.jInternalFrameDetalleFormRangoDiaNomi.jmenuBarDetalleRangoDiaNomi;
			jTtoolBarDetalleAuxiliarRangoDiaNomi=this.jInternalFrameDetalleFormRangoDiaNomi.jTtoolBarDetalleRangoDiaNomi;
		}
		
		final JMenuBar jmenuBarDetalleRangoDiaNomi=jmenuBarDetalleAuxiliarRangoDiaNomi;
		final JToolBar jTtoolBarDetalleRangoDiaNomi=jTtoolBarDetalleAuxiliarRangoDiaNomi;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasRangoDiaNomi;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesRangoDiaNomi;
			processRunnable.jTableDatos=jTableDatosRangoDiaNomi;
			processRunnable.jPanelCampos=jPanelCamposRangoDiaNomi;
			processRunnable.jPanelPaginacion=jPanelPaginacionRangoDiaNomi;
			processRunnable.jPanelAcciones=jPanelAccionesRangoDiaNomi;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioRangoDiaNomi;
			
			
			processRunnable.jmenuBar=jmenuBarRangoDiaNomi;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleRangoDiaNomi;
			processRunnable.jTtoolBar=jTtoolBarRangoDiaNomi;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleRangoDiaNomi;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasRangoDiaNomi ,jPanelParametrosReportesRangoDiaNomi,jTableDatosRangoDiaNomi, /*jScrollPanelDatosRangoDiaNomi,*/jPanelCamposRangoDiaNomi,jPanelPaginacionRangoDiaNomi, /*jScrollPanelDatosEdicionRangoDiaNomi,*/ jPanelAccionesRangoDiaNomi,jPanelAccionesFormularioRangoDiaNomi,jmenuBarRangoDiaNomi,jmenuBarDetalleRangoDiaNomi,jTtoolBarRangoDiaNomi,jTtoolBarDetalleRangoDiaNomi);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasRangoDiaNomi ,jPanelParametrosReportesRangoDiaNomi, jScrollPanelDatosRangoDiaNomi,jPanelPaginacionRangoDiaNomi, jScrollPanelDatosEdicionRangoDiaNomi, jPanelAccionesRangoDiaNomi,jPanelAccionesFormularioRangoDiaNomi,jmenuBarRangoDiaNomi,jmenuBarDetalleRangoDiaNomi,jTtoolBarRangoDiaNomi,jTtoolBarDetalleRangoDiaNomi);
						
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
	
	public void finishProcessRangoDiaNomi() {// throws Exception 
		this.finishProcessRangoDiaNomi(true);
	}
	
	public void finishProcessRangoDiaNomi(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasRangoDiaNomi ,this.jPanelParametrosReportesRangoDiaNomi, this.jScrollPanelDatosRangoDiaNomi,this.jPanelPaginacionRangoDiaNomi, this.jScrollPanelDatosEdicionRangoDiaNomi, this.jPanelAccionesRangoDiaNomi,this.jPanelAccionesFormularioRangoDiaNomi,this.jmenuBarRangoDiaNomi,this.jmenuBarDetalleRangoDiaNomi,this.jTtoolBarRangoDiaNomi,this.jTtoolBarDetalleRangoDiaNomi);		
		
		final JTabbedPane jTabbedPaneBusquedasRangoDiaNomi=this.jTabbedPaneBusquedasRangoDiaNomi; 
		
		final JPanel jPanelParametrosReportesRangoDiaNomi=this.jPanelParametrosReportesRangoDiaNomi;
		//final JScrollPane jScrollPanelDatosRangoDiaNomi=this.jScrollPanelDatosRangoDiaNomi;
		final JTable jTableDatosRangoDiaNomi=this.jTableDatosRangoDiaNomi;		
		final JPanel jPanelPaginacionRangoDiaNomi=this.jPanelPaginacionRangoDiaNomi;
		//final JScrollPane jScrollPanelDatosEdicionRangoDiaNomi=this.jScrollPanelDatosEdicionRangoDiaNomi;
		final JPanel jPanelAccionesRangoDiaNomi=this.jPanelAccionesRangoDiaNomi;
		
		JPanel jPanelCamposAuxiliarRangoDiaNomi=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarRangoDiaNomi=new JPanel();
		
		if(this.jInternalFrameDetalleFormRangoDiaNomi!=null) {
			jPanelCamposAuxiliarRangoDiaNomi=this.jInternalFrameDetalleFormRangoDiaNomi.jPanelCamposRangoDiaNomi;
			jPanelAccionesFormularioAuxiliarRangoDiaNomi=this.jInternalFrameDetalleFormRangoDiaNomi.jPanelAccionesFormularioRangoDiaNomi;
		}
		
		final JPanel jPanelCamposRangoDiaNomi=jPanelCamposAuxiliarRangoDiaNomi;
		final JPanel jPanelAccionesFormularioRangoDiaNomi=jPanelAccionesFormularioAuxiliarRangoDiaNomi;
		
		
		final JMenuBar jmenuBarRangoDiaNomi=this.jmenuBarRangoDiaNomi;		
		final JToolBar jTtoolBarRangoDiaNomi=this.jTtoolBarRangoDiaNomi;
				
		JMenuBar jmenuBarDetalleAuxiliarRangoDiaNomi=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarRangoDiaNomi=new JToolBar();
		
		if(this.jInternalFrameDetalleFormRangoDiaNomi!=null) {
			jmenuBarDetalleAuxiliarRangoDiaNomi=this.jInternalFrameDetalleFormRangoDiaNomi.jmenuBarDetalleRangoDiaNomi;
			jTtoolBarDetalleAuxiliarRangoDiaNomi=this.jInternalFrameDetalleFormRangoDiaNomi.jTtoolBarDetalleRangoDiaNomi;		
		}
		
		final JMenuBar jmenuBarDetalleRangoDiaNomi=jmenuBarDetalleAuxiliarRangoDiaNomi;
		final JToolBar jTtoolBarDetalleRangoDiaNomi=jTtoolBarDetalleAuxiliarRangoDiaNomi;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasRangoDiaNomi;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesRangoDiaNomi;
			processRunnable.jTableDatos=jTableDatosRangoDiaNomi;
			processRunnable.jPanelCampos=jPanelCamposRangoDiaNomi;
			processRunnable.jPanelPaginacion=jPanelPaginacionRangoDiaNomi;
			processRunnable.jPanelAcciones=jPanelAccionesRangoDiaNomi;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioRangoDiaNomi;
			
			
			processRunnable.jmenuBar=jmenuBarRangoDiaNomi;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleRangoDiaNomi;
			processRunnable.jTtoolBar=jTtoolBarRangoDiaNomi;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleRangoDiaNomi;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasRangoDiaNomi ,jPanelParametrosReportesRangoDiaNomi, jTableDatosRangoDiaNomi,/*jScrollPanelDatosRangoDiaNomi,*/jPanelCamposRangoDiaNomi,jPanelPaginacionRangoDiaNomi, /*jScrollPanelDatosEdicionRangoDiaNomi,*/ jPanelAccionesRangoDiaNomi,jPanelAccionesFormularioRangoDiaNomi,jmenuBarRangoDiaNomi,jmenuBarDetalleRangoDiaNomi,jTtoolBarRangoDiaNomi,jTtoolBarDetalleRangoDiaNomi));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesRangoDiaNomi(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarRangoDiaNomi(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuRangoDiaNomi(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarRangoDiaNomi(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarRangoDiaNomi,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleRangoDiaNomi,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuRangoDiaNomi(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarRangoDiaNomi,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleRangoDiaNomi,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.rangodianomiConstantesFunciones.getsFinalQueryRangoDiaNomi();
		String  finalQueryPaginacionTodos=this.rangodianomiConstantesFunciones.getsFinalQueryRangoDiaNomi();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=RangoDiaNomiConstantesFunciones.getArrayColumnasGlobalesNoRangoDiaNomi(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=RangoDiaNomiConstantesFunciones.getArrayColumnasGlobalesRangoDiaNomi(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,RangoDiaNomiConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.rangodianomisEliminados= new ArrayList<RangoDiaNomi>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessRangoDiaNomi();
		
				///*RangoDiaNomiSessionBean*/this.rangodianomiSessionBean=new RangoDiaNomiSessionBean();
			
			if(this.rangodianomiSessionBean==null) {
				this.rangodianomiSessionBean=new RangoDiaNomiSessionBean();
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
					this.iNumeroPaginacion=RangoDiaNomiConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=RangoDiaNomiConstantesFunciones.getClassesForeignKeysOfRangoDiaNomi(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/rangodianomi."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			rangodianomisAux= new ArrayList<RangoDiaNomi>();
			
				
			rangodianomiLogic.setDatosCliente(this.datosCliente);
			rangodianomiLogic.setDatosDeep(this.datosDeep);
			rangodianomiLogic.setIsConDeep(true);
			
			
			rangodianomiLogic.getRangoDiaNomiDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					rangodianomiLogic.getTodosRangoDiaNomis(finalQueryGlobal,pagination);
					
					//rangodianomiLogic.getTodosRangoDiaNomisWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(rangodianomiLogic.getRangoDiaNomis()==null|| rangodianomiLogic.getRangoDiaNomis().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							rangodianomisAux= new ArrayList<RangoDiaNomi>();
							rangodianomisAux.addAll(rangodianomiLogic.getRangoDiaNomis());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							rangodianomisAux= new ArrayList<RangoDiaNomi>();
							rangodianomisAux.addAll(rangodianomis);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							rangodianomiLogic.getTodosRangoDiaNomis(finalQueryGlobal+"",this.pagination);												
							
							//rangodianomiLogic.getTodosRangoDiaNomisWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteRangoDiaNomis("Todos",rangodianomiLogic.getRangoDiaNomis() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							rangodianomiLogic.setRangoDiaNomis(new ArrayList<RangoDiaNomi>());					
							rangodianomiLogic.getRangoDiaNomis().addAll(rangodianomisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							rangodianomis=new ArrayList<RangoDiaNomi>();
							rangodianomis.addAll(rangodianomisAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idRangoDiaNomi=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idRangoDiaNomi=this.idActual;
				
				} else if(this.idRangoDiaNomiActual!=null && this.idRangoDiaNomiActual!=0L) {
					idRangoDiaNomi=idRangoDiaNomiActual;
				}
				
					
				this.sDetalleReporte=RangoDiaNomiConstantesFunciones.getDetalleIndicePorId(idRangoDiaNomi);
				
				this.rangodianomis=new ArrayList<RangoDiaNomi>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					rangodianomiLogic.getEntity(idRangoDiaNomi);
					
					//rangodianomiLogic.getEntityWithConnection(idRangoDiaNomi);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					rangodianomiLogic.setRangoDiaNomis(new ArrayList<RangoDiaNomi>());
					rangodianomiLogic.getRangoDiaNomis().add(rangodianomiLogic.getRangoDiaNomi());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.rangodianomis=new ArrayList<RangoDiaNomi>();
					this.rangodianomis.add(rangodianomi);
				}
				
				if(rangodianomiLogic.getRangoDiaNomi()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=RangoDiaNomiConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					rangodianomiLogic.getRangoDiaNomisFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RangoDiaNomiConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RangoDiaNomiConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=rangodianomiLogic.getRangoDiaNomis()==null||rangodianomiLogic.getRangoDiaNomis().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=rangodianomis==null|| rangodianomis.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						rangodianomisAux=new ArrayList<RangoDiaNomi>();
						rangodianomisAux.addAll(rangodianomiLogic.getRangoDiaNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							rangodianomisAux=new ArrayList<RangoDiaNomi>();
							rangodianomisAux.addAll(rangodianomis);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							rangodianomiLogic.getRangoDiaNomisFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RangoDiaNomiConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RangoDiaNomiConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteRangoDiaNomis("FK_IdEmpresa",rangodianomiLogic.getRangoDiaNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteRangoDiaNomis("FK_IdEmpresa",rangodianomis);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						rangodianomiLogic.setRangoDiaNomis(new ArrayList<RangoDiaNomi>());
						rangodianomiLogic.getRangoDiaNomis().addAll(rangodianomisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							rangodianomis=new ArrayList<RangoDiaNomi>();
							rangodianomis.addAll(rangodianomisAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesRangoDiaNomi();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessRangoDiaNomi();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=rangodianomiLogic.getRangoDiaNomis().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=rangodianomis.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=rangodianomiLogic.getRangoDiaNomis().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=rangodianomis.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(RangoDiaNomi rangodianomi) {
		Boolean permite=true;
		
		if(this.rangodianomi.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=RangoDiaNomiConstantesFunciones.getOrderByListaRangoDiaNomi();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=RangoDiaNomiConstantesFunciones.getOrderByListaRangoDiaNomi();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(RangoDiaNomi rangodianomi:rangodianomiLogic.getRangoDiaNomis()) {
				if(rangodianomi.getsType().equals(Constantes2.S_TOTALES)) {
					rangodianomiTotales=rangodianomi;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(RangoDiaNomi rangodianomi:this.rangodianomis) {
				if(rangodianomi.getsType().equals(Constantes2.S_TOTALES)) {
					rangodianomiTotales=rangodianomi;
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
			this.rangodianomiAux=new RangoDiaNomi();
			this.rangodianomiAux.setsType(Constantes2.S_TOTALES);
			this.rangodianomiAux.setIsNew(false);
			this.rangodianomiAux.setIsChanged(false);
			this.rangodianomiAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				RangoDiaNomiConstantesFunciones.TotalizarValoresFilaRangoDiaNomi(this.rangodianomiLogic.getRangoDiaNomis(),this.rangodianomiAux);
				
				this.rangodianomiLogic.getRangoDiaNomis().add(this.rangodianomiAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				RangoDiaNomiConstantesFunciones.TotalizarValoresFilaRangoDiaNomi(this.rangodianomis,this.rangodianomiAux);
				
				this.rangodianomis.add(this.rangodianomiAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		rangodianomiTotales=new RangoDiaNomi();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.rangodianomiLogic.getRangoDiaNomis().remove(rangodianomiTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.rangodianomis.remove(rangodianomiTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		rangodianomiTotales=new RangoDiaNomi();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(RangoDiaNomi rangodianomi:rangodianomiLogic.getRangoDiaNomis()) {
				if(rangodianomi.getsType().equals(Constantes2.S_TOTALES)) {
					rangodianomiTotales=rangodianomi;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				RangoDiaNomiConstantesFunciones.TotalizarValoresFilaRangoDiaNomi(this.rangodianomiLogic.getRangoDiaNomis(),rangodianomiTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(RangoDiaNomi rangodianomi:this.rangodianomis) {
				if(rangodianomi.getsType().equals(Constantes2.S_TOTALES)) {
					rangodianomiTotales=rangodianomi;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				RangoDiaNomiConstantesFunciones.TotalizarValoresFilaRangoDiaNomi(this.rangodianomis,rangodianomiTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getRangoDiaNomisFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getRangoDiaNomisFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					rangodianomiLogic.getRangoDiaNomisFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosRangoDiaNomi() {
		this.isPermisoTodoRangoDiaNomi=false;
		this.isPermisoNuevoRangoDiaNomi=false;
		this.isPermisoActualizarRangoDiaNomi=false;
		this.isPermisoActualizarOriginalRangoDiaNomi=false;
		this.isPermisoEliminarRangoDiaNomi=false;
		this.isPermisoGuardarCambiosRangoDiaNomi=false;
		this.isPermisoConsultaRangoDiaNomi=false;
		this.isPermisoBusquedaRangoDiaNomi=false;
		this.isPermisoReporteRangoDiaNomi=false;		
		this.isPermisoOrdenRangoDiaNomi=false;		
		this.isPermisoPaginacionMedioRangoDiaNomi=false;		
		this.isPermisoPaginacionAltoRangoDiaNomi=false;
		this.isPermisoPaginacionTodoRangoDiaNomi=false;
		this.isPermisoCopiarRangoDiaNomi=false;		
		this.isPermisoVerFormRangoDiaNomi=false;		
		this.isPermisoDuplicarRangoDiaNomi=false;		
		this.isPermisoOrdenRangoDiaNomi=false;		
	}
	
	public void setPermisosUsuarioRangoDiaNomi(Boolean isPermiso) {
		this.isPermisoTodoRangoDiaNomi=isPermiso;
		this.isPermisoNuevoRangoDiaNomi=isPermiso;
		this.isPermisoActualizarRangoDiaNomi=isPermiso;
		this.isPermisoActualizarOriginalRangoDiaNomi=isPermiso;
		this.isPermisoEliminarRangoDiaNomi=isPermiso;
		this.isPermisoGuardarCambiosRangoDiaNomi=isPermiso;
		this.isPermisoConsultaRangoDiaNomi=isPermiso;
		this.isPermisoBusquedaRangoDiaNomi=isPermiso;
		this.isPermisoReporteRangoDiaNomi=isPermiso;
		this.isPermisoOrdenRangoDiaNomi=isPermiso;		
		this.isPermisoPaginacionMedioRangoDiaNomi=isPermiso;		
		this.isPermisoPaginacionAltoRangoDiaNomi=isPermiso;		
		this.isPermisoPaginacionTodoRangoDiaNomi=isPermiso;		
		this.isPermisoCopiarRangoDiaNomi=isPermiso;		
		this.isPermisoVerFormRangoDiaNomi=isPermiso;		
		this.isPermisoDuplicarRangoDiaNomi=isPermiso;
		this.isPermisoOrdenRangoDiaNomi=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioRangoDiaNomi(Boolean isPermiso) {
		//this.isPermisoTodoRangoDiaNomi=isPermiso;
		this.isPermisoNuevoRangoDiaNomi=isPermiso;
		this.isPermisoActualizarRangoDiaNomi=isPermiso;
		this.isPermisoActualizarOriginalRangoDiaNomi=isPermiso;
		this.isPermisoEliminarRangoDiaNomi=isPermiso;
		this.isPermisoGuardarCambiosRangoDiaNomi=isPermiso;
		//this.isPermisoConsultaRangoDiaNomi=isPermiso;
		//this.isPermisoBusquedaRangoDiaNomi=isPermiso;
		//this.isPermisoReporteRangoDiaNomi=isPermiso;
		//this.isPermisoOrdenRangoDiaNomi=isPermiso;		
		//this.isPermisoPaginacionMedioRangoDiaNomi=isPermiso;		
		//this.isPermisoPaginacionAltoRangoDiaNomi=isPermiso;		
		//this.isPermisoPaginacionTodoRangoDiaNomi=isPermiso;		
		//this.isPermisoCopiarRangoDiaNomi=isPermiso;		
		//this.isPermisoDuplicarRangoDiaNomi=isPermiso;
		//this.isPermisoOrdenRangoDiaNomi=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioRangoDiaNomiClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(RangoDiaNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebRangoDiaNomi(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioRangoDiaNomiClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioRangoDiaNomiClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionRangoDiaNomiClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioRangoDiaNomiClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioRangoDiaNomi() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(RangoDiaNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.rangodianomiSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, RangoDiaNomiConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoRangoDiaNomi=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarRangoDiaNomi=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalRangoDiaNomi=this.isPermisoActualizarRangoDiaNomi;
			this.isPermisoEliminarRangoDiaNomi=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosRangoDiaNomi=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaRangoDiaNomi=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaRangoDiaNomi=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoRangoDiaNomi=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteRangoDiaNomi=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenRangoDiaNomi=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioRangoDiaNomi=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoRangoDiaNomi=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoRangoDiaNomi=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarRangoDiaNomi=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormRangoDiaNomi=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarRangoDiaNomi=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenRangoDiaNomi=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.rangodianomiSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosRangoDiaNomi.setToolTipText(this.jTableDatosRangoDiaNomi.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioRangoDiaNomi(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioRangoDiaNomi(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(RangoDiaNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(RangoDiaNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioRangoDiaNomi() throws Exception {
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
	public void inicializarCombosForeignKeyRangoDiaNomiListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyRangoDiaNomiListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(RangoDiaNomiJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyRangoDiaNomiListas(false);
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
	
	public void cargarCombosLoteForeignKeyRangoDiaNomiListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			RangoDiaNomiParameterReturnGeneral rangodianomiReturnGeneral=new RangoDiaNomiParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.rangodianomiConstantesFunciones.cargarid_empresaRangoDiaNomi)
					 || (this.esRecargarFks && this.rangodianomiConstantesFunciones.cargarid_empresaRangoDiaNomi)) {

					if(!this.rangodianomiSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+rangodianomiSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				rangodianomiReturnGeneral=rangodianomiLogic.cargarCombosLoteForeignKeyRangoDiaNomi(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=rangodianomiReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyRangoDiaNomi()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.rangodianomiSessionBean==null) {
				this.rangodianomiSessionBean=new RangoDiaNomiSessionBean();
			}

			if(!this.rangodianomiSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyRangoDiaNomi()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyRangoDiaNomi(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyRangoDiaNomi()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
				this.rangodianomi.setfecha_inicio(this.parametroGeneralUsuario.getfecha_sistema());
				this.rangodianomi.setfecha_fin(this.parametroGeneralUsuario.getfecha_sistema());
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyRangoDiaNomi();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyRangoDiaNomi(RangoDiaNomi rangodianomi)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyRangoDiaNomi(RangoDiaNomi rangodianomi,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyRangoDiaNomi()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyRangoDiaNomi()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyRangoDiaNomi()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyRangoDiaNomi()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroRangoDiaNomi()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyRangoDiaNomi()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyRangoDiaNomi(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyRangoDiaNomi()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormRangoDiaNomi.jComboBoxid_empresaRangoDiaNomi!=null && this.jInternalFrameDetalleFormRangoDiaNomi.jComboBoxid_empresaRangoDiaNomi.getItemCount()>0) {
				this.jInternalFrameDetalleFormRangoDiaNomi.jComboBoxid_empresaRangoDiaNomi.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public RangoDiaNomiBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public RangoDiaNomiBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public RangoDiaNomiBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.rangodianomiSessionBean=new RangoDiaNomiSessionBean(); 
		this.rangodianomiConstantesFunciones=new RangoDiaNomiConstantesFunciones(); 
		this.rangodianomiBean=new RangoDiaNomi();//(this.rangodianomiConstantesFunciones); 		
		this.rangodianomiReturnGeneral=new RangoDiaNomiParameterReturnGeneral(); 
		
		this.rangodianomiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.rangodianomiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public RangoDiaNomiBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public RangoDiaNomiBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public RangoDiaNomiBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessRangoDiaNomi(true);
			
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
			
			this.rangodianomiConstantesFunciones=new RangoDiaNomiConstantesFunciones(); 
			this.rangodianomiBean=new RangoDiaNomi();//this.rangodianomiConstantesFunciones); 			
			this.rangodianomiReturnGeneral=new RangoDiaNomiParameterReturnGeneral(); 
		
			RangoDiaNomiBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Rango Dia Nomi Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.rangodianomi=new RangoDiaNomi();
			this.rangodianomis = new ArrayList<RangoDiaNomi>();
			this.rangodianomisAux = new ArrayList<RangoDiaNomi>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rangodianomiLogic=new RangoDiaNomiLogic();
				this.rangodianomiLogic.getNewConnexionToDeep("");
			}
			
			//this.rangodianomiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.rangodianomiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormRangoDiaNomi);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoRangoDiaNomi!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoRangoDiaNomi);	
					}
					
					if(this.jInternalFrameImportacionRangoDiaNomi!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionRangoDiaNomi);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByRangoDiaNomi!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByRangoDiaNomi);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormRangoDiaNomi!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormRangoDiaNomi);
				this.jInternalFrameDetalleFormRangoDiaNomi.setVisible(false);
				this.jInternalFrameDetalleFormRangoDiaNomi.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoRangoDiaNomi!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoRangoDiaNomi);
					this.jInternalFrameReporteDinamicoRangoDiaNomi.setVisible(false);
					this.jInternalFrameReporteDinamicoRangoDiaNomi.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionRangoDiaNomi!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionRangoDiaNomi);
					this.jInternalFrameImportacionRangoDiaNomi.setVisible(false);
					this.jInternalFrameImportacionRangoDiaNomi.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByRangoDiaNomi!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByRangoDiaNomi);
					this.jInternalFrameOrderByRangoDiaNomi.setVisible(false);
					this.jInternalFrameOrderByRangoDiaNomi.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idRangoDiaNomiActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=RangoDiaNomiConstantesFunciones.INUMEROPAGINACION;
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
			
			this.rangodianomiReturnGeneral=new RangoDiaNomiParameterReturnGeneral();
			
			this.rangodianomiParameterGeneral=new RangoDiaNomiParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.rangodianomiLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.rangodianomiSessionBean.getEsGuardarRelacionado()) {
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
			
			if(RangoDiaNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.rangodianomiSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,RangoDiaNomiConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.rangodianomiSessionBean.getEsGuardarRelacionado(),this.rangodianomiSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,RangoDiaNomiConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.rangodianomiSessionBean.getEsGuardarRelacionado(),this.rangodianomiSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoRangoDiaNomi=false;
			this.isVisibilidadCeldaDuplicarRangoDiaNomi=true;
			this.isVisibilidadCeldaCopiarRangoDiaNomi=true;
			this.isVisibilidadCeldaVerFormRangoDiaNomi=true;
			this.isVisibilidadCeldaOrdenRangoDiaNomi=true;
			this.isVisibilidadCeldaNuevoRelacionesRangoDiaNomi=false;
			this.isVisibilidadCeldaModificarRangoDiaNomi=false;
			this.isVisibilidadCeldaActualizarRangoDiaNomi=false;
			this.isVisibilidadCeldaEliminarRangoDiaNomi=false;
			this.isVisibilidadCeldaCancelarRangoDiaNomi=false;
			this.isVisibilidadCeldaGuardarRangoDiaNomi=false;
			this.isVisibilidadCeldaGuardarCambiosRangoDiaNomi=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesRangoDiaNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosRangoDiaNomi();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioRangoDiaNomi(false);
			
			this.setPermisosUsuarioRangoDiaNomi();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.rangodianomiSessionBean.getEsGuardarRelacionado() 
				|| (this.rangodianomiSessionBean.getEsGuardarRelacionado() && this.rangodianomiSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioRangoDiaNomiClasesRelacionadas();
			}
			
			if(this.rangodianomiSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioRangoDiaNomiClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!RangoDiaNomiJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosRangoDiaNomi();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualRangoDiaNomi();
			}
			
			if(!this.isPermisoBusquedaRangoDiaNomi) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasRangoDiaNomi.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.rangodianomiSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioRangoDiaNomi,this.isPermisoPaginacionMedioRangoDiaNomi,this.isPermisoPaginacionTodoRangoDiaNomi);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(RangoDiaNomiConstantesFunciones.getTiposSeleccionarRangoDiaNomi());
				
				this.tiposColumnasSelect=RangoDiaNomiConstantesFunciones.getTiposSeleccionarRangoDiaNomi(true);
				
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
			//if(!this.rangodianomiSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioRangoDiaNomi();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioRangoDiaNomi(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioRangoDiaNomi(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesRangoDiaNomi() ;
			
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
				rangodianomiImplementable= (RangoDiaNomiImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+RangoDiaNomiConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				rangodianomiImplementableHome= (RangoDiaNomiImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+RangoDiaNomiConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.rangodianomis= new ArrayList<RangoDiaNomi>();
			this.rangodianomisEliminados= new ArrayList<RangoDiaNomi>();
						
			this.isEsNuevoRangoDiaNomi=false;
			this.esParaAccionDesdeFormularioRangoDiaNomi=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyRangoDiaNomi(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroRangoDiaNomi();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.rangodianomiSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			RangoDiaNomiBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=RangoDiaNomiConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesRangoDiaNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingRangoDiaNomi(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormRangoDiaNomi!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioRangoDiaNomi();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioRangoDiaNomi();
			}
			
			RangoDiaNomiBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasRangoDiaNomi.getTabCount(); i++) {
					this.jTabbedPaneBusquedasRangoDiaNomi.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasRangoDiaNomi.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rangodianomiLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessRangoDiaNomi(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga RangoDiaNomi: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rangodianomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rangodianomiLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectRangoDiaNomi() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesRangoDiaNomi")) {
				iIndex=this.jInternalFrameDetalleFormRangoDiaNomi.jTabbedPaneRelacionesRangoDiaNomi.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormRangoDiaNomi.jTabbedPaneRelacionesRangoDiaNomi.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosRangoDiaNomi.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessRangoDiaNomi();	
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
	
	public void cargarCombosForeignKeyRangoDiaNomi(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyRangoDiaNomi(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyRangoDiaNomi(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyRangoDiaNomiListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyRangoDiaNomi();
		
		this.cargarCombosFrameForeignKeyRangoDiaNomi();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyRangoDiaNomi();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyRangoDiaNomi();
		}
	}
	
	
	
	public void jButtonNuevoRangoDiaNomiActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.rangodianomiSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormRangoDiaNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			RangoDiaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.rangodianomi,new Object(),this.rangodianomiParameterGeneral,this.rangodianomiReturnGeneral);
			
			
			if(jTableDatosRangoDiaNomi.getRowCount()>=1) {
				jTableDatosRangoDiaNomi.removeRowSelectionInterval(0, jTableDatosRangoDiaNomi.getRowCount()-1);						
			}
			
			this.isEsNuevoRangoDiaNomi=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoRangoDiaNomi(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesRangoDiaNomi(true);			
			//this.rangodianomi=new RangoDiaNomi();
			//this.rangodianomi.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesRangoDiaNomi(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualRangoDiaNomi() ;
			
			if(RangoDiaNomiJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleRangoDiaNomi(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.rangodianomi);	
			this.actualizarInformacion("INFO_PADRE",false,this.rangodianomi);				
			
			RangoDiaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.rangodianomi,new Object(),this.rangodianomiParameterGeneral,this.rangodianomiReturnGeneral);
			
			if(this.rangodianomiSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar RangoDiaNomi: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			RangoDiaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.rangodianomi,new Object(),this.rangodianomiParameterGeneral,this.rangodianomiReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarRangoDiaNomiActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<RangoDiaNomi> rangodianomisSeleccionados=new ArrayList<RangoDiaNomi>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosRangoDiaNomi.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosRangoDiaNomi.getSelectedRows().length;			
			}
			
			rangodianomisSeleccionados=this.getRangoDiaNomisSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoRangoDiaNomi--;			
				//RangoDiaNomi rangodianomiAux= new RangoDiaNomi();			
				//rangodianomiAux.setId(this.iIdNuevoRangoDiaNomi);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//RangoDiaNomi rangodianomiOrigen=new RangoDiaNomi();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(RangoDiaNomi rangodianomiOrigen : rangodianomisSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosRangoDiaNomi.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							rangodianomiOrigen =(RangoDiaNomi) this.rangodianomiLogic.getRangoDiaNomis().toArray()[this.jTableDatosRangoDiaNomi.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							rangodianomiOrigen =(RangoDiaNomi) this.rangodianomis.toArray()[this.jTableDatosRangoDiaNomi.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaRangoDiaNomi();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.rangodianomi.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosRangoDiaNomi(rangodianomiOrigen,this.rangodianomi,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysRangoDiaNomi(this.rangodianomi);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.rangodianomiLogic.getRangoDiaNomis().add(this.rangodianomiAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.rangodianomis.add(this.rangodianomiAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaRangoDiaNomi(false);
				
				this.jTableDatosRangoDiaNomi.setRowSelectionInterval(this.getIndiceNuevoRangoDiaNomi(), this.getIndiceNuevoRangoDiaNomi());
				
				int iLastRow =  this.jTableDatosRangoDiaNomi.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosRangoDiaNomi.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosRangoDiaNomi.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaRangoDiaNomi(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarRangoDiaNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<RangoDiaNomi> rangodianomisSeleccionados=new ArrayList<RangoDiaNomi>();									
		
			RangoDiaNomi rangodianomiOrigen=new RangoDiaNomi();
			RangoDiaNomi rangodianomiDestino=new RangoDiaNomi();
				
			rangodianomisSeleccionados=this.getRangoDiaNomisSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosRangoDiaNomi.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || rangodianomisSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosRangoDiaNomi.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						rangodianomiOrigen =(RangoDiaNomi) this.rangodianomiLogic.getRangoDiaNomis().toArray()[this.jTableDatosRangoDiaNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						rangodianomiOrigen =(RangoDiaNomi) this.rangodianomis.toArray()[this.jTableDatosRangoDiaNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						rangodianomiDestino =(RangoDiaNomi) this.rangodianomiLogic.getRangoDiaNomis().toArray()[this.jTableDatosRangoDiaNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						rangodianomiDestino =(RangoDiaNomi) this.rangodianomis.toArray()[this.jTableDatosRangoDiaNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				rangodianomiOrigen =rangodianomisSeleccionados.get(0);
				rangodianomiDestino =rangodianomisSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosRangoDiaNomi(rangodianomiOrigen,rangodianomiDestino,true,false);
				
				rangodianomiDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(rangodianomiDestino,rangodianomiLogic.getRangoDiaNomis());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(rangodianomiDestino,rangodianomis);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaRangoDiaNomi(false);
				
				//this.jTableDatosRangoDiaNomi.setRowSelectionInterval(this.getIndiceNuevoRangoDiaNomi(), this.getIndiceNuevoRangoDiaNomi());
				
				int iLastRow =  this.jTableDatosRangoDiaNomi.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosRangoDiaNomi.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosRangoDiaNomi.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaRangoDiaNomi(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormRangoDiaNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormRangoDiaNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormRangoDiaNomi.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarRangoDiaNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesRangoDiaNomi.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasRangoDiaNomi.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesRangoDiaNomi.setVisible(!isVisible);
			this.jPanelPaginacionRangoDiaNomi.setVisible(!isVisible);
			this.jPanelAccionesRangoDiaNomi.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarRangoDiaNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameRangoDiaNomi();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoRangoDiaNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoRangoDiaNomi();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionRangoDiaNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionRangoDiaNomi();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByRangoDiaNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByRangoDiaNomi();
			
			this.abrirFrameOrderByRangoDiaNomi();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByRangoDiaNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByRangoDiaNomi();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleRangoDiaNomi(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormRangoDiaNomi);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormRangoDiaNomi.isMaximum()) {
					this.jInternalFrameDetalleFormRangoDiaNomi.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormRangoDiaNomi.setSize(this.jInternalFrameDetalleFormRangoDiaNomi.iWidthFormulario,this.jInternalFrameDetalleFormRangoDiaNomi.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormRangoDiaNomi.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormRangoDiaNomi.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormRangoDiaNomi.isMaximum()) {
						this.jInternalFrameDetalleFormRangoDiaNomi.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormRangoDiaNomi.jContentPaneDetalleRangoDiaNomi.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormRangoDiaNomi.jTabbedPaneRelacionesRangoDiaNomi.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormRangoDiaNomi.jContentPaneDetalleRangoDiaNomi.getWidth(),RangoDiaNomiConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormRangoDiaNomi.jTabbedPaneRelacionesRangoDiaNomi.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormRangoDiaNomi.jContentPaneDetalleRangoDiaNomi.getWidth(),RangoDiaNomiConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormRangoDiaNomi.jTabbedPaneRelacionesRangoDiaNomi.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormRangoDiaNomi.jContentPaneDetalleRangoDiaNomi.getWidth(),RangoDiaNomiConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormRangoDiaNomi.setVisible(true);
	        this.jInternalFrameDetalleFormRangoDiaNomi.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByRangoDiaNomi() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByRangoDiaNomi==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByRangoDiaNomi=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByRangoDiaNomi,false,this);
				} else {
					this.jInternalFrameOrderByRangoDiaNomi=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByRangoDiaNomi,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByRangoDiaNomi);
				this.jInternalFrameOrderByRangoDiaNomi.setVisible(false);
				this.jInternalFrameOrderByRangoDiaNomi.setSelected(false);
				
				this.jInternalFrameOrderByRangoDiaNomi.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByRangoDiaNomi"));
				
				this.inicializarActualizarBindingTablaOrderByRangoDiaNomi();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionRangoDiaNomi() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionRangoDiaNomi==null) {
				
				this.jInternalFrameImportacionRangoDiaNomi=new ImportacionJInternalFrame(RangoDiaNomiConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionRangoDiaNomi);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionRangoDiaNomi);
				this.jInternalFrameImportacionRangoDiaNomi.setVisible(false);
				this.jInternalFrameImportacionRangoDiaNomi.setSelected(false);


				this.jInternalFrameImportacionRangoDiaNomi.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionRangoDiaNomi"));
				this.jInternalFrameImportacionRangoDiaNomi.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionRangoDiaNomi"));
				this.jInternalFrameImportacionRangoDiaNomi.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionRangoDiaNomi"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoRangoDiaNomi() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoRangoDiaNomi==null) {
				this.jInternalFrameReporteDinamicoRangoDiaNomi=new ReporteDinamicoJInternalFrame(RangoDiaNomiConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoRangoDiaNomi);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoRangoDiaNomi);
				this.jInternalFrameReporteDinamicoRangoDiaNomi.setVisible(false);
				this.jInternalFrameReporteDinamicoRangoDiaNomi.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoRangoDiaNomi.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoRangoDiaNomi"));
				this.jInternalFrameReporteDinamicoRangoDiaNomi.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoRangoDiaNomi"));
				this.jInternalFrameReporteDinamicoRangoDiaNomi.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoRangoDiaNomi"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualRangoDiaNomi();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleRangoDiaNomi() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormRangoDiaNomi);
			
	       	this.jInternalFrameDetalleFormRangoDiaNomi.setVisible(false);
	        this.jInternalFrameDetalleFormRangoDiaNomi.setSelected(false);
			
			//this.jInternalFrameDetalleFormRangoDiaNomi.dispose();
			//this.jInternalFrameDetalleFormRangoDiaNomi=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoRangoDiaNomi() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoRangoDiaNomi.setVisible(true);
	        this.jInternalFrameReporteDinamicoRangoDiaNomi.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionRangoDiaNomi() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionRangoDiaNomi.setVisible(true);
	        this.jInternalFrameImportacionRangoDiaNomi.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByRangoDiaNomi() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByRangoDiaNomi.setVisible(true);
	        this.jInternalFrameOrderByRangoDiaNomi.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByRangoDiaNomi() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByRangoDiaNomi.setVisible(false);
	        this.jInternalFrameOrderByRangoDiaNomi.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoRangoDiaNomi() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoRangoDiaNomi.setVisible(false);
	        this.jInternalFrameReporteDinamicoRangoDiaNomi.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionRangoDiaNomi() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionRangoDiaNomi.setVisible(false);
	        this.jInternalFrameImportacionRangoDiaNomi.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarRangoDiaNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarRangoDiaNomi(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarRangoDiaNomi(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosRangoDiaNomi.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesRangoDiaNomi(true);
			//this.isEsNuevoRangoDiaNomi=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rangodianomi =(RangoDiaNomi) this.rangodianomiLogic.getRangoDiaNomis().toArray()[this.jTableDatosRangoDiaNomi.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.rangodianomi =(RangoDiaNomi) this.rangodianomis.toArray()[this.jTableDatosRangoDiaNomi.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesRangoDiaNomi("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesRangoDiaNomi(false) ;
			
			if(rangodianomiSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(RangoDiaNomiJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleRangoDiaNomi(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualRangoDiaNomi(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaRangoDiaNomiActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosRangoDiaNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rangodianomi =(RangoDiaNomi) this.rangodianomiLogic.getRangoDiaNomis().toArray()[this.jTableDatosRangoDiaNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.rangodianomi =(RangoDiaNomi) this.rangodianomis.toArray()[this.jTableDatosRangoDiaNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarRangoDiaNomi(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormRangoDiaNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosRangoDiaNomi.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesRangoDiaNomi(true);
			//this.isEsNuevoRangoDiaNomi=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rangodianomi =(RangoDiaNomi) this.rangodianomiLogic.getRangoDiaNomis().toArray()[this.jTableDatosRangoDiaNomi.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.rangodianomi =(RangoDiaNomi) this.rangodianomis.toArray()[this.jTableDatosRangoDiaNomi.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.rangodianomi.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesRangoDiaNomi("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesRangoDiaNomi(false) ;
			
			if(RangoDiaNomiJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleRangoDiaNomi(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualRangoDiaNomi(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarRangoDiaNomiActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rangodianomiLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesRangoDiaNomi(false);
			
			//if(!this.isEsNuevoRangoDiaNomi) {								
				int intSelectedRow = this.jTableDatosRangoDiaNomi.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rangodianomi =(RangoDiaNomi) this.rangodianomiLogic.getRangoDiaNomis().toArray()[this.jTableDatosRangoDiaNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.rangodianomi =(RangoDiaNomi) this.rangodianomis.toArray()[this.jTableDatosRangoDiaNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(RangoDiaNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualRangoDiaNomi(this.rangodianomi,true);
				this.setVariablesFormularioToObjetoActualForeignKeysRangoDiaNomi(this.rangodianomi);
				
			}
			
			if(this.permiteMantenimiento(this.rangodianomi)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.rangodianomiSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoRangoDiaNomi=true;
					this.inicializarActualizarBindingTablaRangoDiaNomi(false);
					this.isEsNuevoRangoDiaNomi=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoRangoDiaNomi=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoRangoDiaNomi=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesRangoDiaNomi(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualRangoDiaNomi(false);
				
				this.habilitarDeshabilitarControlesRangoDiaNomi(false);
			
												
				
				if(RangoDiaNomiJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleRangoDiaNomi();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoRangoDiaNomiActionPerformed(evt,rangodianomiSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualRangoDiaNomi(this.rangodianomi,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosRangoDiaNomi.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,rangodianomiSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rangodianomiLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.rangodianomi.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(RangoDiaNomi.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RangoDiaNomi.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rangodianomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rangodianomiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarRangoDiaNomiActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rangodianomiLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosRangoDiaNomi.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rangodianomi =(RangoDiaNomi) this.rangodianomiLogic.getRangoDiaNomis().toArray()[this.jTableDatosRangoDiaNomi.convertRowIndexToModel(intSelectedRow)];
				this.rangodianomi.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.rangodianomi =(RangoDiaNomi) this.rangodianomis.toArray()[this.jTableDatosRangoDiaNomi.convertRowIndexToModel(intSelectedRow)];
				this.rangodianomi.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.rangodianomi)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.rangodianomiSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((RangoDiaNomiModel) this.jTableDatosRangoDiaNomi.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoRangoDiaNomi=true;
				this.inicializarActualizarBindingTablaRangoDiaNomi(false);
				this.isEsNuevoRangoDiaNomi=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesRangoDiaNomi(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualRangoDiaNomi(false);
				
				this.habilitarDeshabilitarControlesRangoDiaNomi(false);
				
				
				
				if(RangoDiaNomiJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleRangoDiaNomi();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rangodianomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rangodianomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rangodianomiLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarRangoDiaNomiActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosRangoDiaNomi.getRowCount()>=1) {
				jTableDatosRangoDiaNomi.removeRowSelectionInterval(0, jTableDatosRangoDiaNomi.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesRangoDiaNomi(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaRangoDiaNomi(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesRangoDiaNomi(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualRangoDiaNomi(false) ;
			
			this.isEsNuevoRangoDiaNomi=false;
			
			if(RangoDiaNomiJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleRangoDiaNomi();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosRangoDiaNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rangodianomiLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingRangoDiaNomi(false);
				
				//SI ES MANUAL
				if(RangoDiaNomiJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualRangoDiaNomi();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rangodianomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rangodianomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rangodianomiLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosRangoDiaNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoRangoDiaNomi--;			
			//RangoDiaNomi rangodianomiAux= new RangoDiaNomi();			
			//rangodianomiAux.setId(this.iIdNuevoRangoDiaNomi);
			
			if(this.jInternalFrameDetalleFormRangoDiaNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaRangoDiaNomi();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysRangoDiaNomi(this.rangodianomi);
			
			this.rangodianomi.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.rangodianomiLogic.getRangoDiaNomis().add(this.rangodianomiAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.rangodianomis.add(this.rangodianomiAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaRangoDiaNomi(false);
			
			this.jTableDatosRangoDiaNomi.setRowSelectionInterval(this.getIndiceNuevoRangoDiaNomi(), this.getIndiceNuevoRangoDiaNomi());
			
			int iLastRow =  this.jTableDatosRangoDiaNomi.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosRangoDiaNomi.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosRangoDiaNomi.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaRangoDiaNomi(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionRangoDiaNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rangodianomiLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingRangoDiaNomi(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingRangoDiaNomi(false);
			
			//SI ES MANUAL
			if(RangoDiaNomiJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualRangoDiaNomi();
			}
			
			//this.abrirFrameTreeRangoDiaNomi();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rangodianomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rangodianomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rangodianomiLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionRangoDiaNomiActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Rango Dia NomiS ?", "MANTENIMIENTO DE Rango Dia Nomi", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionRangoDiaNomi.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralRangoDiaNomi();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.rangodianomiReturnGeneral=rangodianomiLogic.procesarImportacionRangoDiaNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.rangodianomiParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarRangoDiaNomiReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionRangoDiaNomiActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionRangoDiaNomi.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionRangoDiaNomi.setFileImportacion(this.jInternalFrameImportacionRangoDiaNomi.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionRangoDiaNomi.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionRangoDiaNomi.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionRangoDiaNomi.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionRangoDiaNomi.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoRangoDiaNomiActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<RangoDiaNomi> rangodianomisSeleccionados=new ArrayList<RangoDiaNomi>();		

		rangodianomisSeleccionados=this.getRangoDiaNomisSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoRangoDiaNomi.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoRangoDiaNomi.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("RangoDiaNomiBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"RangoDiaNomiBaseDesign.jrxml";
			
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
			
			this.generarReporteRangoDiaNomis("Todos",rangodianomisSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.rangodianomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Rango Dia Nomi",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoRangoDiaNomi.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoRangoDiaNomi.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case RangoDiaNomiConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RangoDiaNomiConstantesFunciones.LABEL_FECHAINICIO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaInicio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaInicio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaInicio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaInicio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RangoDiaNomiConstantesFunciones.LABEL_FECHAFIN:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaFin_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaFin_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaFin_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaFin_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RangoDiaNomiConstantesFunciones.LABEL_DESCRIPCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scripcion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scripcion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scripcion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scripcion_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoRangoDiaNomi.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoRangoDiaNomi.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoRangoDiaNomi.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case RangoDiaNomiConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case RangoDiaNomiConstantesFunciones.LABEL_FECHAINICIO:
					sNombreCampoCategoria="fecha_inicio";
					break;

				case RangoDiaNomiConstantesFunciones.LABEL_FECHAFIN:
					sNombreCampoCategoria="fecha_fin";
					break;

				case RangoDiaNomiConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoRangoDiaNomi.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case RangoDiaNomiConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case RangoDiaNomiConstantesFunciones.LABEL_FECHAINICIO:
					sNombreCampoCategoriaValor="fecha_inicio";
					break;

				case RangoDiaNomiConstantesFunciones.LABEL_FECHAFIN:
					sNombreCampoCategoriaValor="fecha_fin";
					break;

				case RangoDiaNomiConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoRangoDiaNomi.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoRangoDiaNomi.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case RangoDiaNomiConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case RangoDiaNomiConstantesFunciones.LABEL_FECHAINICIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Inicio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_inicio");
					break;

				case RangoDiaNomiConstantesFunciones.LABEL_FECHAFIN:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Fin",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_fin");
					break;

				case RangoDiaNomiConstantesFunciones.LABEL_DESCRIPCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descripcion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descripcion");
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
	
	public void jButtonGenerarExcelReporteDinamicoRangoDiaNomiActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<RangoDiaNomi> rangodianomisSeleccionados=new ArrayList<RangoDiaNomi>();		
		
		rangodianomisSeleccionados=this.getRangoDiaNomisSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"rangodianomi";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("RangoDiaNomis");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoRangoDiaNomi.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoRangoDiaNomi.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case RangoDiaNomiConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RangoDiaNomiConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(RangoDiaNomi rangodianomi:rangodianomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(rangodianomi.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RangoDiaNomiConstantesFunciones.LABEL_FECHAINICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RangoDiaNomiConstantesFunciones.LABEL_FECHAINICIO);
					iRow++;

					for(RangoDiaNomi rangodianomi:rangodianomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(rangodianomi.getfecha_inicio());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RangoDiaNomiConstantesFunciones.LABEL_FECHAFIN:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RangoDiaNomiConstantesFunciones.LABEL_FECHAFIN);
					iRow++;

					for(RangoDiaNomi rangodianomi:rangodianomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(rangodianomi.getfecha_fin());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RangoDiaNomiConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RangoDiaNomiConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(RangoDiaNomi rangodianomi:rangodianomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(rangodianomi.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelRangoDiaNomi(row);				
			//	iRow++;
			//}				
			
			//for(RangoDiaNomi rangodianomiAux:rangodianomisSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelRangoDiaNomi(rangodianomiAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.rangodianomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Rango Dia Nomi",JOptionPane.INFORMATION_MESSAGE);
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
				this.rangodianomiLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingRangoDiaNomi(false);
			
			//SI ES MANUAL
			if(RangoDiaNomiJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualRangoDiaNomi();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rangodianomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rangodianomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rangodianomiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresRangoDiaNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rangodianomiLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingRangoDiaNomi(false);
			
			//SI ES MANUAL
			if(RangoDiaNomiJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualRangoDiaNomi();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rangodianomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rangodianomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rangodianomiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesRangoDiaNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rangodianomiLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingRangoDiaNomi(false);
			
			//SI ES MANUAL
			if(RangoDiaNomiJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualRangoDiaNomi();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rangodianomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rangodianomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rangodianomiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaRangoDiaNomi() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosRangoDiaNomi.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosRangoDiaNomi.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosRangoDiaNomi.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosRangoDiaNomi.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosRangoDiaNomi.setMinimumSize(dimensionMinimum);
		this.jTableDatosRangoDiaNomi.setMaximumSize(dimensionMaximum);
		this.jTableDatosRangoDiaNomi.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingRangoDiaNomi(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingRangoDiaNomi(esInicializar,true);
	}
	
	public void inicializarActualizarBindingRangoDiaNomi(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaRangoDiaNomi(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesRangoDiaNomi(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.rangodianomiSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasRangoDiaNomi(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesRangoDiaNomi(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesRangoDiaNomi(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !RangoDiaNomiJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!RangoDiaNomiJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualRangoDiaNomi() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaRangoDiaNomi();
		
		this.inicializarActualizarBindingBotonesManualRangoDiaNomi(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.rangodianomiSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualRangoDiaNomi();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesRangoDiaNomi() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualRangoDiaNomi(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualRangoDiaNomi(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosRangoDiaNomi.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosRangoDiaNomi.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteRangoDiaNomi.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormRangoDiaNomi!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormRangoDiaNomi.jCheckBoxPostAccionNuevoRangoDiaNomi.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormRangoDiaNomi.jCheckBoxPostAccionSinCerrarRangoDiaNomi.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormRangoDiaNomi.jCheckBoxPostAccionSinMensajeRangoDiaNomi.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosRangoDiaNomi.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosRangoDiaNomi.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteRangoDiaNomi.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormRangoDiaNomi!=null) {
				this.jInternalFrameDetalleFormRangoDiaNomi.jCheckBoxPostAccionNuevoRangoDiaNomi.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormRangoDiaNomi.jCheckBoxPostAccionSinCerrarRangoDiaNomi.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormRangoDiaNomi.jCheckBoxPostAccionSinMensajeRangoDiaNomi.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionRangoDiaNomi.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionRangoDiaNomi.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormRangoDiaNomi!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormRangoDiaNomi.jComboBoxTiposAccionesFormularioRangoDiaNomi.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesRangoDiaNomi.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoRangoDiaNomi!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoRangoDiaNomi.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesRangoDiaNomi.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesRangoDiaNomi.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarRangoDiaNomi.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesRangoDiaNomi.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoRangoDiaNomi!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoRangoDiaNomi.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesRangoDiaNomi.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralRangoDiaNomi.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesRangoDiaNomi(Boolean esInicializar) throws Exception {
		try	{	
			if(RangoDiaNomiJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualRangoDiaNomi(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesRangoDiaNomi() throws Exception {
		try	{
			if(RangoDiaNomiJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualRangoDiaNomi();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleRangoDiaNomi() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormRangoDiaNomi.jComboBoxTiposAccionesFormularioRangoDiaNomi.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormRangoDiaNomi.jComboBoxTiposAccionesFormularioRangoDiaNomi.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualRangoDiaNomi() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesRangoDiaNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesRangoDiaNomi.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesRangoDiaNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesRangoDiaNomi.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesRangoDiaNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesRangoDiaNomi.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionRangoDiaNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionRangoDiaNomi.addItem(reporte);
			}
			
			
			if(!this.rangodianomiSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionRangoDiaNomi.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionRangoDiaNomi.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesRangoDiaNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesRangoDiaNomi.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesRangoDiaNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesRangoDiaNomi.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormRangoDiaNomi!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormRangoDiaNomi.jComboBoxTiposAccionesFormularioRangoDiaNomi.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormRangoDiaNomi.jComboBoxTiposAccionesFormularioRangoDiaNomi.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarRangoDiaNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarRangoDiaNomi.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarRangoDiaNomi.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualRangoDiaNomi();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualRangoDiaNomi() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoRangoDiaNomi!=null) {
				this.jInternalFrameReporteDinamicoRangoDiaNomi.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoRangoDiaNomi.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoRangoDiaNomi!=null) {
				this.jInternalFrameReporteDinamicoRangoDiaNomi.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoRangoDiaNomi.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoRangoDiaNomi!=null) {
				
				if(this.jInternalFrameReporteDinamicoRangoDiaNomi.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoRangoDiaNomi.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoRangoDiaNomi.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoRangoDiaNomi.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoRangoDiaNomi.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoRangoDiaNomi.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualRangoDiaNomi()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasRangoDiaNomi(Boolean esInicializar) throws Exception {				
		if(RangoDiaNomiJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualRangoDiaNomi();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaRangoDiaNomi() throws Exception {
		this.inicializarActualizarBindingTablaRangoDiaNomi(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByRangoDiaNomi() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByRangoDiaNomi.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByRangoDiaNomi.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByRangoDiaNomi.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new RangoDiaNomiPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByRangoDiaNomi.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByRangoDiaNomi.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new RangoDiaNomiPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosRangoDiaNomiOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRangoDiaNomiOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new RangoDiaNomiPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByRangoDiaNomi.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByRangoDiaNomi.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new RangoDiaNomiPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByRangoDiaNomi.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaRangoDiaNomi(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=rangodianomiLogic.getRangoDiaNomis().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=rangodianomis.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(RangoDiaNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosRangoDiaNomi.setModel(new RangoDiaNomiModel(this.rangodianomiLogic.getRangoDiaNomis(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosRangoDiaNomi.setModel(new RangoDiaNomiModel(this.rangodianomis,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByRangoDiaNomi!=null && this.jInternalFrameOrderByRangoDiaNomi.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByRangoDiaNomi();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosRangoDiaNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRangoDiaNomi,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new RangoDiaNomiPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+RangoDiaNomiConstantesFunciones.SCLASSWEBTITULO,rangodianomiConstantesFunciones.resaltarSeleccionarRangoDiaNomi,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+RangoDiaNomiConstantesFunciones.SCLASSWEBTITULO,rangodianomiConstantesFunciones.resaltarSeleccionarRangoDiaNomi,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosRangoDiaNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRangoDiaNomi,RangoDiaNomiConstantesFunciones.LABEL_ID));

		if(this.rangodianomiConstantesFunciones.mostraridRangoDiaNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RangoDiaNomiConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.rangodianomiConstantesFunciones.resaltaridRangoDiaNomi,this.rangodianomiConstantesFunciones.activaridRangoDiaNomi,this,true,"idRangoDiaNomi","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.rangodianomiConstantesFunciones.resaltaridRangoDiaNomi,this.rangodianomiConstantesFunciones.activaridRangoDiaNomi,this,true,"idRangoDiaNomi","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRangoDiaNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRangoDiaNomi,RangoDiaNomiConstantesFunciones.LABEL_IDEMPRESA));

		if(this.rangodianomiConstantesFunciones.mostrarid_empresaRangoDiaNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RangoDiaNomiConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.rangodianomiConstantesFunciones.resaltarid_empresaRangoDiaNomi,this,this.rangodianomiConstantesFunciones.activarid_empresaRangoDiaNomi));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.rangodianomiConstantesFunciones.resaltarid_empresaRangoDiaNomi,this,this.rangodianomiConstantesFunciones.activarid_empresaRangoDiaNomi,false,"id_empresaRangoDiaNomi","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RangoDiaNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRangoDiaNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRangoDiaNomi,RangoDiaNomiConstantesFunciones.LABEL_FECHAINICIO));

		if(this.rangodianomiConstantesFunciones.mostrarfecha_inicioRangoDiaNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RangoDiaNomiConstantesFunciones.LABEL_FECHAINICIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.rangodianomiConstantesFunciones.resaltarfecha_inicioRangoDiaNomi,this.rangodianomiConstantesFunciones.activarfecha_inicioRangoDiaNomi,this,true,"fecha_inicioRangoDiaNomi","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.rangodianomiConstantesFunciones.resaltarfecha_inicioRangoDiaNomi,this.rangodianomiConstantesFunciones.activarfecha_inicioRangoDiaNomi,this,true,"fecha_inicioRangoDiaNomi","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new RangoDiaNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRangoDiaNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRangoDiaNomi,RangoDiaNomiConstantesFunciones.LABEL_FECHAFIN));

		if(this.rangodianomiConstantesFunciones.mostrarfecha_finRangoDiaNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RangoDiaNomiConstantesFunciones.LABEL_FECHAFIN,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.rangodianomiConstantesFunciones.resaltarfecha_finRangoDiaNomi,this.rangodianomiConstantesFunciones.activarfecha_finRangoDiaNomi,this,true,"fecha_finRangoDiaNomi","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.rangodianomiConstantesFunciones.resaltarfecha_finRangoDiaNomi,this.rangodianomiConstantesFunciones.activarfecha_finRangoDiaNomi,this,true,"fecha_finRangoDiaNomi","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new RangoDiaNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRangoDiaNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRangoDiaNomi,RangoDiaNomiConstantesFunciones.LABEL_DESCRIPCION));

		if(this.rangodianomiConstantesFunciones.mostrardescripcionRangoDiaNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RangoDiaNomiConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.rangodianomiConstantesFunciones.resaltardescripcionRangoDiaNomi,this.rangodianomiConstantesFunciones.activardescripcionRangoDiaNomi,this,true,"descripcionRangoDiaNomi","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.rangodianomiConstantesFunciones.resaltardescripcionRangoDiaNomi,this.rangodianomiConstantesFunciones.activardescripcionRangoDiaNomi,this,true,"descripcionRangoDiaNomi","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RangoDiaNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.rangodianomiSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.rangodianomiSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.rangodianomiSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosRangoDiaNomi.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.rangodianomiSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.rangodianomiSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosRangoDiaNomi.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarRangoDiaNomi && this.isPermisoGuardarCambiosRangoDiaNomi) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.rangodianomiSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.rangodianomiSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosRangoDiaNomi.addColumn(tableColumn);
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
			
			this.jTableDatosRangoDiaNomi.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarRangoDiaNomi && this.isPermisoGuardarCambiosRangoDiaNomi) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarRangoDiaNomi && this.isPermisoGuardarCambiosRangoDiaNomi) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosRangoDiaNomi.moveColumn(this.jTableDatosRangoDiaNomi.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosRangoDiaNomi.moveColumn(this.jTableDatosRangoDiaNomi.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosRangoDiaNomi.moveColumn(this.jTableDatosRangoDiaNomi.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosRangoDiaNomi.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosRangoDiaNomi.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosRangoDiaNomi,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!RangoDiaNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosRangoDiaNomi.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosRangoDiaNomi.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!RangoDiaNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!RangoDiaNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosRangoDiaNomi.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosRangoDiaNomi.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosRangoDiaNomi.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=rangodianomiLogic.getRangoDiaNomis().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=rangodianomis.size()-1;
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
		//this.jTableDatosRangoDiaNomi.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosRangoDiaNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosRangoDiaNomi();
			
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
				
				//this.isEsNuevoRangoDiaNomi=false;
					
				RangoDiaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.rangodianomi,new Object(),this.rangodianomiParameterGeneral,this.rangodianomiReturnGeneral);
			
				if(this.rangodianomiSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormRangoDiaNomi==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosRangoDiaNomi.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosRangoDiaNomi.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rangodianomi =(RangoDiaNomi) this.rangodianomiLogic.getRangoDiaNomis().toArray()[this.jTableDatosRangoDiaNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.rangodianomi =(RangoDiaNomi) this.rangodianomis.toArray()[this.jTableDatosRangoDiaNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.rangodianomi.getsType().equals("DUPLICADO")
				   || this.rangodianomi.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoRangoDiaNomi=true;
				
				} else {
					this.isEsNuevoRangoDiaNomi=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.rangodianomiSessionBean.getEsGuardarRelacionado()) {
					if(this.rangodianomi.getId()>=0 && !this.rangodianomi.getIsNew()) {						
						this.isEsNuevoRangoDiaNomi=false;
						
					} else {
						this.isEsNuevoRangoDiaNomi=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoRangoDiaNomi(esRelaciones);						
				
				this.seleccionarRangoDiaNomi(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.rangodianomi.getId()<0) {
					this.isEsNuevoRangoDiaNomi=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarRangoDiaNomi(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarRangoDiaNomi(evt,rowIndex);
				}	
				
				if(this.rangodianomiSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion RangoDiaNomi: " + this.dDif); 
					}
				}								
				
				RangoDiaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.rangodianomi,new Object(),this.rangodianomiParameterGeneral,this.rangodianomiReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarRangoDiaNomi(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.rangodianomi)) {
					if(this.rangodianomi.getId()>0) {
						this.rangodianomi.setIsDeleted(true);
						
						this.rangodianomisEliminados.add(this.rangodianomi);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.rangodianomiLogic.getRangoDiaNomis().remove(this.rangodianomi);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.rangodianomis.remove(this.rangodianomi);				
					}
					
					
					((RangoDiaNomiModel) this.jTableDatosRangoDiaNomi.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaRangoDiaNomi(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarRangoDiaNomi(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoRangoDiaNomi) {
			
			if(this.jInternalFrameDetalleFormRangoDiaNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosRangoDiaNomi.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosRangoDiaNomi.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rangodianomi =(RangoDiaNomi) this.rangodianomiLogic.getRangoDiaNomis().toArray()[this.jTableDatosRangoDiaNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.rangodianomi =(RangoDiaNomi) this.rangodianomis.toArray()[this.jTableDatosRangoDiaNomi.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(RangoDiaNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioRangoDiaNomi(this.rangodianomi);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.rangodianomiConstantesFunciones.cargarid_empresaRangoDiaNomi || this.rangodianomiConstantesFunciones.event_dependid_empresaRangoDiaNomi) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.rangodianomi.getid_empresa());
									//this.inicializarActualizarBindingRangoDiaNomi(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(rangodianomi.getEmpresa()!=null) {
							this.empresasForeignKey.add(rangodianomi.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.rangodianomi.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesRangoDiaNomi("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesRangoDiaNomi(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualRangoDiaNomi() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoRangoDiaNomi(RangoDiaNomi rangodianomi) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoRangoDiaNomi(rangodianomi,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoRangoDiaNomi(RangoDiaNomi rangodianomi,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioRangoDiaNomi(rangodianomi);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyRangoDiaNomi(rangodianomi,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyRangoDiaNomi(rangodianomi);
	}
	
	public void setVariablesObjetoActualToFormularioRangoDiaNomi(RangoDiaNomi rangodianomi) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormRangoDiaNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormRangoDiaNomi.jLabelidRangoDiaNomi.setText(rangodianomi.getId().toString());
			this.jInternalFrameDetalleFormRangoDiaNomi.jDateChooserfecha_inicioRangoDiaNomi.setDate(rangodianomi.getfecha_inicio());
			this.jInternalFrameDetalleFormRangoDiaNomi.jDateChooserfecha_finRangoDiaNomi.setDate(rangodianomi.getfecha_fin());
			this.jInternalFrameDetalleFormRangoDiaNomi.jTextAreadescripcionRangoDiaNomi.setText(rangodianomi.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,RangoDiaNomi rangodianomiLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,rangodianomiLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,RangoDiaNomi rangodianomiLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				rangodianomiLocal=this.rangodianomi;
			} else {
				rangodianomiLocal=this.rangodianomiAnterior;
			}
		}
		
		if(this.permiteMantenimiento(rangodianomiLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoRangoDiaNomi(rangodianomiLocal,true);
					
					if(rangodianomiSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(rangodianomiLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.rangodianomiSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(rangodianomiLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoRangoDiaNomi(RangoDiaNomi rangodianomi,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualRangoDiaNomi(rangodianomi,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysRangoDiaNomi(rangodianomi);
	}
	
	public void setVariablesFormularioToObjetoActualRangoDiaNomi(RangoDiaNomi rangodianomi,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualRangoDiaNomi(rangodianomi,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualRangoDiaNomi(RangoDiaNomi rangodianomi,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormRangoDiaNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormRangoDiaNomi.jLabelidRangoDiaNomi.getText()==null || this.jInternalFrameDetalleFormRangoDiaNomi.jLabelidRangoDiaNomi.getText()=="" || this.jInternalFrameDetalleFormRangoDiaNomi.jLabelidRangoDiaNomi.getText()=="Id") {
				this.jInternalFrameDetalleFormRangoDiaNomi.jLabelidRangoDiaNomi.setText("0");
			}

			if(conColumnasBase) {rangodianomi.setId(Long.parseLong(this.jInternalFrameDetalleFormRangoDiaNomi.jLabelidRangoDiaNomi.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RangoDiaNomiConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRangoDiaNomi.jLabelIdRangoDiaNomi,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			rangodianomi.setfecha_inicio(this.jInternalFrameDetalleFormRangoDiaNomi.jDateChooserfecha_inicioRangoDiaNomi.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RangoDiaNomiConstantesFunciones.LABEL_FECHAINICIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRangoDiaNomi.jLabelfecha_inicioRangoDiaNomi,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			rangodianomi.setfecha_fin(this.jInternalFrameDetalleFormRangoDiaNomi.jDateChooserfecha_finRangoDiaNomi.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RangoDiaNomiConstantesFunciones.LABEL_FECHAFIN+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRangoDiaNomi.jLabelfecha_finRangoDiaNomi,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			rangodianomi.setdescripcion(this.jInternalFrameDetalleFormRangoDiaNomi.jTextAreadescripcionRangoDiaNomi.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RangoDiaNomiConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRangoDiaNomi.jLabeldescripcionRangoDiaNomi,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualRangoDiaNomi(RangoDiaNomi rangodianomiBean,RangoDiaNomi rangodianomi,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosRangoDiaNomi(RangoDiaNomi rangodianomiOrigen,RangoDiaNomi rangodianomi,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && rangodianomiOrigen.getId()!=null && !rangodianomiOrigen.getId().equals(0L))) {rangodianomi.setId(rangodianomiOrigen.getId());}}
			if(conDefault || (!conDefault && rangodianomiOrigen.getfecha_inicio()!=null && !rangodianomiOrigen.getfecha_inicio().equals(new Date()))) {rangodianomi.setfecha_inicio(rangodianomiOrigen.getfecha_inicio());}
			if(conDefault || (!conDefault && rangodianomiOrigen.getfecha_fin()!=null && !rangodianomiOrigen.getfecha_fin().equals(new Date()))) {rangodianomi.setfecha_fin(rangodianomiOrigen.getfecha_fin());}
			if(conDefault || (!conDefault && rangodianomiOrigen.getdescripcion()!=null && !rangodianomiOrigen.getdescripcion().equals(""))) {rangodianomi.setdescripcion(rangodianomiOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioRangoDiaNomi(RangoDiaNomi rangodianomi) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormRangoDiaNomi.jLabelidRangoDiaNomi.setText(rangodianomi.getId().toString());
			this.jInternalFrameDetalleFormRangoDiaNomi.jDateChooserfecha_inicioRangoDiaNomi.setDate(rangodianomi.getfecha_inicio());
			this.jInternalFrameDetalleFormRangoDiaNomi.jDateChooserfecha_finRangoDiaNomi.setDate(rangodianomi.getfecha_fin());
			this.jInternalFrameDetalleFormRangoDiaNomi.jTextAreadescripcionRangoDiaNomi.setText(rangodianomi.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioRangoDiaNomi(RangoDiaNomiBean rangodianomiBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormRangoDiaNomi.jLabelidRangoDiaNomi.setText(rangodianomiBean.getId().toString());
			this.jInternalFrameDetalleFormRangoDiaNomi.jDateChooserfecha_inicioRangoDiaNomi.setDate(rangodianomiBean.getfecha_inicio());
			this.jInternalFrameDetalleFormRangoDiaNomi.jDateChooserfecha_finRangoDiaNomi.setDate(rangodianomiBean.getfecha_fin());
			this.jInternalFrameDetalleFormRangoDiaNomi.jTextAreadescripcionRangoDiaNomi.setText(rangodianomiBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanRangoDiaNomi(RangoDiaNomiParameterReturnGeneral rangodianomiReturnGeneral,RangoDiaNomiBean rangodianomiBean,Boolean conDefault) throws Exception { 
		try {
			RangoDiaNomi rangodianomiLocal=new RangoDiaNomi();
			
			rangodianomiLocal=rangodianomiReturnGeneral.getRangoDiaNomi();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && rangodianomiLocal.getId()!=null && !rangodianomiLocal.getId().equals(0L))) {rangodianomiBean.setId(rangodianomiLocal.getId());}}
			if(conDefault || (!conDefault && rangodianomiLocal.getfecha_inicio()!=null && !rangodianomiLocal.getfecha_inicio().equals(new Date()))) {rangodianomiBean.setfecha_inicio(rangodianomiLocal.getfecha_inicio());}
			if(conDefault || (!conDefault && rangodianomiLocal.getfecha_fin()!=null && !rangodianomiLocal.getfecha_fin().equals(new Date()))) {rangodianomiBean.setfecha_fin(rangodianomiLocal.getfecha_fin());}
			if(conDefault || (!conDefault && rangodianomiLocal.getdescripcion()!=null && !rangodianomiLocal.getdescripcion().equals(""))) {rangodianomiBean.setdescripcion(rangodianomiLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxRangoDiaNomiGenerico(Long idRangoDiaNomiSeleccionado,JComboBox jComboBoxRangoDiaNomi,List<RangoDiaNomi> rangodianomisLocal)throws Exception {
		try {
			RangoDiaNomi  rangodianomiTemp=null;

			for(RangoDiaNomi rangodianomiAux:rangodianomisLocal) {
				if(rangodianomiAux.getId()!=null && rangodianomiAux.getId().equals(idRangoDiaNomiSeleccionado)) {
					rangodianomiTemp=rangodianomiAux;
					break;
				}
			}

			jComboBoxRangoDiaNomi.setSelectedItem(rangodianomiTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxRangoDiaNomiGenerico(JComboBox jComboBoxRangoDiaNomi,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxRangoDiaNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxRangoDiaNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxRangoDiaNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxRangoDiaNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxRangoDiaNomi.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxRangoDiaNomi.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxRangoDiaNomi.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxRangoDiaNomi.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxRangoDiaNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxRangoDiaNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			rangodianomi=(RangoDiaNomi) rangodianomiLogic.getRangoDiaNomis().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			rangodianomi =(RangoDiaNomi) rangodianomis.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!rangodianomi.getIsNew() && !rangodianomi.getIsChanged() && !rangodianomi.getIsDeleted()) {
				sDescripcion=rangodianomi.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=rangodianomi.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		RangoDiaNomi rangodianomiRow=new RangoDiaNomi();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			rangodianomiRow=(RangoDiaNomi) rangodianomiLogic.getRangoDiaNomis().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			rangodianomiRow=(RangoDiaNomi) rangodianomis.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualRangoDiaNomi(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoRangoDiaNomi.setVisible((this.isVisibilidadCeldaNuevoRangoDiaNomi && this.isPermisoNuevoRangoDiaNomi));			
			this.jButtonDuplicarRangoDiaNomi.setVisible((this.isVisibilidadCeldaDuplicarRangoDiaNomi && this.isPermisoDuplicarRangoDiaNomi));			
			this.jButtonCopiarRangoDiaNomi.setVisible((this.isVisibilidadCeldaCopiarRangoDiaNomi && this.isPermisoCopiarRangoDiaNomi));
			this.jButtonVerFormRangoDiaNomi.setVisible((this.isVisibilidadCeldaVerFormRangoDiaNomi && this.isPermisoVerFormRangoDiaNomi));
			
			this.jButtonAbrirOrderByRangoDiaNomi.setVisible((this.isVisibilidadCeldaOrdenRangoDiaNomi && this.isPermisoOrdenRangoDiaNomi));			
			
			this.jButtonNuevoRelacionesRangoDiaNomi.setVisible((this.isVisibilidadCeldaNuevoRelacionesRangoDiaNomi && this.isPermisoNuevoRangoDiaNomi));			
			this.jButtonNuevoGuardarCambiosRangoDiaNomi.setVisible((this.isVisibilidadCeldaNuevoRangoDiaNomi && this.isPermisoNuevoRangoDiaNomi && this.isPermisoGuardarCambiosRangoDiaNomi));
			
			if(this.jInternalFrameDetalleFormRangoDiaNomi!=null) {
			this.jInternalFrameDetalleFormRangoDiaNomi.jButtonModificarRangoDiaNomi.setVisible((this.isVisibilidadCeldaModificarRangoDiaNomi && this.isPermisoActualizarRangoDiaNomi));	
			this.jInternalFrameDetalleFormRangoDiaNomi.jButtonActualizarRangoDiaNomi.setVisible((this.isVisibilidadCeldaActualizarRangoDiaNomi && this.isPermisoActualizarRangoDiaNomi));	
			this.jInternalFrameDetalleFormRangoDiaNomi.jButtonEliminarRangoDiaNomi.setVisible((this.isVisibilidadCeldaEliminarRangoDiaNomi && this.isPermisoEliminarRangoDiaNomi));
			this.jInternalFrameDetalleFormRangoDiaNomi.jButtonCancelarRangoDiaNomi.setVisible(this.isVisibilidadCeldaCancelarRangoDiaNomi);							
			this.jInternalFrameDetalleFormRangoDiaNomi.jButtonGuardarCambiosRangoDiaNomi.setVisible((this.isVisibilidadCeldaGuardarRangoDiaNomi && this.isPermisoGuardarCambiosRangoDiaNomi));			
			
			}
						
			this.jButtonGuardarCambiosTablaRangoDiaNomi.setVisible((this.isVisibilidadCeldaGuardarCambiosRangoDiaNomi && this.isPermisoGuardarCambiosRangoDiaNomi));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarRangoDiaNomi.setVisible((this.isVisibilidadCeldaNuevoRangoDiaNomi && this.isPermisoNuevoRangoDiaNomi));						
			this.jButtonDuplicarToolBarRangoDiaNomi.setVisible((this.isVisibilidadCeldaDuplicarRangoDiaNomi && this.isPermisoDuplicarRangoDiaNomi));						
			this.jButtonCopiarToolBarRangoDiaNomi.setVisible((this.isVisibilidadCeldaCopiarRangoDiaNomi && this.isPermisoCopiarRangoDiaNomi));			
			this.jButtonVerFormToolBarRangoDiaNomi.setVisible((this.isVisibilidadCeldaVerFormRangoDiaNomi && this.isPermisoVerFormRangoDiaNomi));			
			this.jButtonAbrirOrderByToolBarRangoDiaNomi.setVisible((this.isVisibilidadCeldaOrdenRangoDiaNomi && this.isPermisoOrdenRangoDiaNomi));
			this.jButtonNuevoRelacionesToolBarRangoDiaNomi.setVisible((this.isVisibilidadCeldaNuevoRelacionesRangoDiaNomi && this.isPermisoNuevoRangoDiaNomi));			
			this.jButtonNuevoGuardarCambiosToolBarRangoDiaNomi.setVisible((this.isVisibilidadCeldaNuevoRangoDiaNomi && this.isPermisoNuevoRangoDiaNomi && this.isPermisoGuardarCambiosRangoDiaNomi));			
			
			if(this.jInternalFrameDetalleFormRangoDiaNomi!=null) {
			this.jInternalFrameDetalleFormRangoDiaNomi.jButtonModificarToolBarRangoDiaNomi.setVisible((this.isVisibilidadCeldaModificarRangoDiaNomi && this.isPermisoActualizarRangoDiaNomi));	
			this.jInternalFrameDetalleFormRangoDiaNomi.jButtonActualizarToolBarRangoDiaNomi.setVisible((this.isVisibilidadCeldaActualizarRangoDiaNomi  && this.isPermisoActualizarRangoDiaNomi));	
			this.jInternalFrameDetalleFormRangoDiaNomi.jButtonEliminarToolBarRangoDiaNomi.setVisible((this.isVisibilidadCeldaEliminarRangoDiaNomi && this.isPermisoEliminarRangoDiaNomi));
			this.jInternalFrameDetalleFormRangoDiaNomi.jButtonCancelarToolBarRangoDiaNomi.setVisible(this.isVisibilidadCeldaCancelarRangoDiaNomi);				
			this.jInternalFrameDetalleFormRangoDiaNomi.jButtonGuardarCambiosToolBarRangoDiaNomi.setVisible((this.isVisibilidadCeldaGuardarRangoDiaNomi && this.isPermisoGuardarCambiosRangoDiaNomi));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarRangoDiaNomi.setVisible((this.isVisibilidadCeldaGuardarCambiosRangoDiaNomi && this.isPermisoGuardarCambiosRangoDiaNomi));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoRangoDiaNomi.setVisible((this.isVisibilidadCeldaNuevoRangoDiaNomi && this.isPermisoNuevoRangoDiaNomi));			
			this.jMenuItemDuplicarRangoDiaNomi.setVisible((this.isVisibilidadCeldaDuplicarRangoDiaNomi && this.isPermisoDuplicarRangoDiaNomi));			
			this.jMenuItemCopiarRangoDiaNomi.setVisible((this.isVisibilidadCeldaCopiarRangoDiaNomi && this.isPermisoCopiarRangoDiaNomi));			
			this.jMenuItemVerFormRangoDiaNomi.setVisible((this.isVisibilidadCeldaVerFormRangoDiaNomi && this.isPermisoVerFormRangoDiaNomi));			
			this.jMenuItemAbrirOrderByRangoDiaNomi.setVisible((this.isVisibilidadCeldaOrdenRangoDiaNomi && this.isPermisoOrdenRangoDiaNomi));			
			//this.jMenuItemMostrarOcultarRangoDiaNomi.setVisible((this.isVisibilidadCeldaOrdenRangoDiaNomi && this.isPermisoOrdenRangoDiaNomi));
			this.jMenuItemDetalleAbrirOrderByRangoDiaNomi.setVisible((this.isVisibilidadCeldaOrdenRangoDiaNomi && this.isPermisoOrdenRangoDiaNomi));			
			//this.jMenuItemDetalleMostrarOcultarRangoDiaNomi.setVisible((this.isVisibilidadCeldaOrdenRangoDiaNomi && this.isPermisoOrdenRangoDiaNomi));			
			this.jMenuItemNuevoRelacionesRangoDiaNomi.setVisible((this.isVisibilidadCeldaNuevoRelacionesRangoDiaNomi && this.isPermisoNuevoRangoDiaNomi));			
			this.jMenuItemNuevoGuardarCambiosRangoDiaNomi.setVisible((this.isVisibilidadCeldaNuevoRangoDiaNomi && this.isPermisoNuevoRangoDiaNomi && this.isPermisoGuardarCambiosRangoDiaNomi));									
			
			if(this.jInternalFrameDetalleFormRangoDiaNomi!=null) {
			this.jInternalFrameDetalleFormRangoDiaNomi.jMenuItemModificarRangoDiaNomi.setVisible((this.isVisibilidadCeldaModificarRangoDiaNomi && this.isPermisoActualizarRangoDiaNomi));	
			this.jInternalFrameDetalleFormRangoDiaNomi.jMenuItemActualizarRangoDiaNomi.setVisible((this.isVisibilidadCeldaActualizarRangoDiaNomi && this.isPermisoActualizarRangoDiaNomi));	
			this.jInternalFrameDetalleFormRangoDiaNomi.jMenuItemEliminarRangoDiaNomi.setVisible((this.isVisibilidadCeldaEliminarRangoDiaNomi && this.isPermisoEliminarRangoDiaNomi));
			this.jInternalFrameDetalleFormRangoDiaNomi.jMenuItemCancelarRangoDiaNomi.setVisible(this.isVisibilidadCeldaCancelarRangoDiaNomi);				
			}
			
			this.jMenuItemGuardarCambiosRangoDiaNomi.setVisible((this.isVisibilidadCeldaGuardarRangoDiaNomi && this.isPermisoGuardarCambiosRangoDiaNomi));						
			this.jMenuItemGuardarCambiosTablaRangoDiaNomi.setVisible((this.isVisibilidadCeldaGuardarCambiosRangoDiaNomi && this.isPermisoGuardarCambiosRangoDiaNomi));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoRangoDiaNomi=this.jButtonNuevoRangoDiaNomi.isVisible();
			this.isVisibilidadCeldaDuplicarRangoDiaNomi=this.jButtonDuplicarRangoDiaNomi.isVisible();
			this.isVisibilidadCeldaCopiarRangoDiaNomi=this.jButtonCopiarRangoDiaNomi.isVisible();
			this.isVisibilidadCeldaVerFormRangoDiaNomi=this.jButtonVerFormRangoDiaNomi.isVisible();
			
			this.isVisibilidadCeldaOrdenRangoDiaNomi=this.jButtonAbrirOrderByRangoDiaNomi.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesRangoDiaNomi=this.jButtonNuevoRelacionesRangoDiaNomi.isVisible();
			this.isVisibilidadCeldaModificarRangoDiaNomi=this.jButtonModificarRangoDiaNomi.isVisible();
			
			if(this.jInternalFrameDetalleFormRangoDiaNomi!=null) {
			this.isVisibilidadCeldaActualizarRangoDiaNomi=this.jInternalFrameDetalleFormRangoDiaNomi.jButtonActualizarRangoDiaNomi.isVisible();
			this.isVisibilidadCeldaEliminarRangoDiaNomi=this.jInternalFrameDetalleFormRangoDiaNomi.jButtonEliminarRangoDiaNomi.isVisible();
			this.isVisibilidadCeldaCancelarRangoDiaNomi=this.jInternalFrameDetalleFormRangoDiaNomi.jButtonCancelarRangoDiaNomi.isVisible();
			this.isVisibilidadCeldaGuardarRangoDiaNomi=this.jInternalFrameDetalleFormRangoDiaNomi.jButtonGuardarCambiosRangoDiaNomi.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosRangoDiaNomi=this.jButtonGuardarCambiosTablaRangoDiaNomi.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoRangoDiaNomi=this.jButtonNuevoToolBarRangoDiaNomi.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesRangoDiaNomi=this.jButtonNuevoRelacionesToolBarRangoDiaNomi.isVisible();
			
			if(this.jInternalFrameDetalleFormRangoDiaNomi!=null) {
			this.isVisibilidadCeldaModificarRangoDiaNomi=this.jInternalFrameDetalleFormRangoDiaNomi.jButtonModificarToolBarRangoDiaNomi.isVisible();
			this.isVisibilidadCeldaActualizarRangoDiaNomi=this.jInternalFrameDetalleFormRangoDiaNomi.jButtonActualizarToolBarRangoDiaNomi.isVisible();
			this.isVisibilidadCeldaEliminarRangoDiaNomi=this.jInternalFrameDetalleFormRangoDiaNomi.jButtonEliminarToolBarRangoDiaNomi.isVisible();
			this.isVisibilidadCeldaCancelarRangoDiaNomi=this.jInternalFrameDetalleFormRangoDiaNomi.jButtonCancelarToolBarRangoDiaNomi.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarRangoDiaNomi=this.jButtonGuardarCambiosToolBarRangoDiaNomi.isVisible();
			this.isVisibilidadCeldaGuardarCambiosRangoDiaNomi=this.jButtonGuardarCambiosTablaToolBarRangoDiaNomi.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoRangoDiaNomi=this.jMenuItemNuevoRangoDiaNomi.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesRangoDiaNomi=this.jMenuItemNuevoRelacionesRangoDiaNomi.isVisible();
			
			if(this.jInternalFrameDetalleFormRangoDiaNomi!=null) {
			this.isVisibilidadCeldaModificarRangoDiaNomi=this.jInternalFrameDetalleFormRangoDiaNomi.jMenuItemModificarRangoDiaNomi.isVisible();
			this.isVisibilidadCeldaActualizarRangoDiaNomi=this.jInternalFrameDetalleFormRangoDiaNomi.jMenuItemActualizarRangoDiaNomi.isVisible();
			this.isVisibilidadCeldaEliminarRangoDiaNomi=this.jInternalFrameDetalleFormRangoDiaNomi.jMenuItemEliminarRangoDiaNomi.isVisible();
			this.isVisibilidadCeldaCancelarRangoDiaNomi=this.jInternalFrameDetalleFormRangoDiaNomi.jMenuItemCancelarRangoDiaNomi.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarRangoDiaNomi=this.jMenuItemGuardarCambiosRangoDiaNomi.isVisible();
			this.isVisibilidadCeldaGuardarCambiosRangoDiaNomi=this.jMenuItemGuardarCambiosTablaRangoDiaNomi.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesRangoDiaNomi(Boolean esInicializar) {
		if(RangoDiaNomiJInternalFrame.ISBINDING_MANUAL) {			
			if(this.rangodianomiSessionBean.getConGuardarRelaciones()) {
				//if(this.rangodianomiSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesRangoDiaNomi();
			}
			
			this.inicializarActualizarBindingBotonesManualRangoDiaNomi(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualRangoDiaNomi() {
		this.jButtonNuevoRangoDiaNomi.setVisible(this.isPermisoNuevoRangoDiaNomi);			
		this.jButtonDuplicarRangoDiaNomi.setVisible(this.isPermisoDuplicarRangoDiaNomi);			
		this.jButtonCopiarRangoDiaNomi.setVisible(this.isPermisoCopiarRangoDiaNomi);			
		this.jButtonVerFormRangoDiaNomi.setVisible(this.isPermisoVerFormRangoDiaNomi);			
		
		this.jButtonAbrirOrderByRangoDiaNomi.setVisible(this.isPermisoOrdenRangoDiaNomi);					
		
		this.jButtonNuevoRelacionesRangoDiaNomi.setVisible(this.isPermisoNuevoRangoDiaNomi);			
		
		if(this.jInternalFrameDetalleFormRangoDiaNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRangoDiaNomi.jButtonModificarRangoDiaNomi.setVisible(this.isPermisoActualizarRangoDiaNomi);	
			this.jInternalFrameDetalleFormRangoDiaNomi.jButtonActualizarRangoDiaNomi.setVisible(this.isPermisoActualizarRangoDiaNomi);	
			this.jInternalFrameDetalleFormRangoDiaNomi.jButtonEliminarRangoDiaNomi.setVisible(this.isPermisoEliminarRangoDiaNomi);
			this.jInternalFrameDetalleFormRangoDiaNomi.jButtonCancelarRangoDiaNomi.setVisible(this.isVisibilidadCeldaCancelarRangoDiaNomi);						
			this.jInternalFrameDetalleFormRangoDiaNomi.jButtonGuardarCambiosRangoDiaNomi.setVisible(this.isPermisoGuardarCambiosRangoDiaNomi);							
		}
		
		this.jButtonGuardarCambiosTablaRangoDiaNomi.setVisible(this.isPermisoActualizarRangoDiaNomi);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleRangoDiaNomi() {
		this.jInternalFrameDetalleFormRangoDiaNomi.jButtonModificarRangoDiaNomi.setVisible(this.isPermisoActualizarRangoDiaNomi);	
		this.jInternalFrameDetalleFormRangoDiaNomi.jButtonActualizarRangoDiaNomi.setVisible(this.isPermisoActualizarRangoDiaNomi);	
		this.jInternalFrameDetalleFormRangoDiaNomi.jButtonEliminarRangoDiaNomi.setVisible(this.isPermisoEliminarRangoDiaNomi);
		this.jInternalFrameDetalleFormRangoDiaNomi.jButtonCancelarRangoDiaNomi.setVisible(this.isVisibilidadCeldaCancelarRangoDiaNomi);							
		this.jInternalFrameDetalleFormRangoDiaNomi.jButtonGuardarCambiosRangoDiaNomi.setVisible((this.isVisibilidadCeldaGuardarRangoDiaNomi && this.isPermisoGuardarCambiosRangoDiaNomi));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosRangoDiaNomi() {
		if(RangoDiaNomiJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualRangoDiaNomi();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesRangoDiaNomi() {
	}
	
	public void jTableDatosRangoDiaNomiListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarRangoDiaNomi(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidRangoDiaNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rangodianomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRangoDiaNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRangoDiaNomi(this.getrangodianomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRangoDiaNomi(this.rangodianomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.rangodianomi =(RangoDiaNomi) this.rangodianomiLogic.getRangoDiaNomis().toArray()[this.jTableDatosRangoDiaNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.rangodianomi =(RangoDiaNomi) this.rangodianomis.toArray()[this.jTableDatosRangoDiaNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.rangodianomi==null) {
						this.rangodianomi = new RangoDiaNomi();
					}

					this.setVariablesFormularioToObjetoActualRangoDiaNomi(this.rangodianomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRangoDiaNomi(this.rangodianomi);
				}

				if(this.rangodianomi.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.rangodianomi.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRangoDiaNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rangodianomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rangodianomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rangodianomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaRangoDiaNomiUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rangodianomiLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebRangoDiaNomi(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRangoDiaNomi.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosRangoDiaNomi.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosRangoDiaNomi.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rangodianomi =(RangoDiaNomi) this.rangodianomiLogic.getRangoDiaNomis().toArray()[this.jTableDatosRangoDiaNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.rangodianomi =(RangoDiaNomi) this.rangodianomis.toArray()[this.jTableDatosRangoDiaNomi.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualRangoDiaNomi(this.getrangodianomi(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysRangoDiaNomi(this.rangodianomi);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.rangodianomiLogic.getConnexion());

				if(this.rangodianomi.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.rangodianomi.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderRangoDiaNomi=(TitledBorder)this.jScrollPanelDatosRangoDiaNomi.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderRangoDiaNomi.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rangodianomiLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rangodianomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rangodianomiLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaRangoDiaNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rangodianomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRangoDiaNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRangoDiaNomi(this.getrangodianomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRangoDiaNomi(this.rangodianomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.rangodianomi =(RangoDiaNomi) this.rangodianomiLogic.getRangoDiaNomis().toArray()[this.jTableDatosRangoDiaNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.rangodianomi =(RangoDiaNomi) this.rangodianomis.toArray()[this.jTableDatosRangoDiaNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.rangodianomi==null) {
						this.rangodianomi = new RangoDiaNomi();
					}

					this.setVariablesFormularioToObjetoActualRangoDiaNomi(this.rangodianomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRangoDiaNomi(this.rangodianomi);
				}

				if(this.rangodianomi.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.rangodianomi.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRangoDiaNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rangodianomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rangodianomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rangodianomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_inicioRangoDiaNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rangodianomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRangoDiaNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRangoDiaNomi(this.getrangodianomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRangoDiaNomi(this.rangodianomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.rangodianomi =(RangoDiaNomi) this.rangodianomiLogic.getRangoDiaNomis().toArray()[this.jTableDatosRangoDiaNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.rangodianomi =(RangoDiaNomi) this.rangodianomis.toArray()[this.jTableDatosRangoDiaNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.rangodianomi==null) {
						this.rangodianomi = new RangoDiaNomi();
					}

					this.setVariablesFormularioToObjetoActualRangoDiaNomi(this.rangodianomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRangoDiaNomi(this.rangodianomi);
				}

				if(this.rangodianomi.getfecha_inicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_inicio = '"+Funciones2.getStringPostgresDate(this.rangodianomi.getfecha_inicio())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRangoDiaNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rangodianomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rangodianomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rangodianomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_finRangoDiaNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rangodianomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRangoDiaNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRangoDiaNomi(this.getrangodianomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRangoDiaNomi(this.rangodianomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.rangodianomi =(RangoDiaNomi) this.rangodianomiLogic.getRangoDiaNomis().toArray()[this.jTableDatosRangoDiaNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.rangodianomi =(RangoDiaNomi) this.rangodianomis.toArray()[this.jTableDatosRangoDiaNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.rangodianomi==null) {
						this.rangodianomi = new RangoDiaNomi();
					}

					this.setVariablesFormularioToObjetoActualRangoDiaNomi(this.rangodianomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRangoDiaNomi(this.rangodianomi);
				}

				if(this.rangodianomi.getfecha_fin()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_fin = '"+Funciones2.getStringPostgresDate(this.rangodianomi.getfecha_fin())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRangoDiaNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rangodianomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rangodianomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rangodianomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionRangoDiaNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rangodianomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRangoDiaNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRangoDiaNomi(this.getrangodianomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRangoDiaNomi(this.rangodianomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.rangodianomi =(RangoDiaNomi) this.rangodianomiLogic.getRangoDiaNomis().toArray()[this.jTableDatosRangoDiaNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.rangodianomi =(RangoDiaNomi) this.rangodianomis.toArray()[this.jTableDatosRangoDiaNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.rangodianomi==null) {
						this.rangodianomi = new RangoDiaNomi();
					}

					this.setVariablesFormularioToObjetoActualRangoDiaNomi(this.rangodianomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRangoDiaNomi(this.rangodianomi);
				}

				if(this.rangodianomi.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.rangodianomi.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRangoDiaNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rangodianomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rangodianomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rangodianomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaRangoDiaNomiActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rangodianomiLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingRangoDiaNomi(false,false);

			this.getRangoDiaNomisFK_IdEmpresa();

			this.inicializarActualizarBindingRangoDiaNomi(false);

			//if(RangoDiaNomiBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingRangoDiaNomi(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rangodianomiLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rangodianomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rangodianomiLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameRangoDiaNomi() {
		if(this.jInternalFrameDetalleFormRangoDiaNomi!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormRangoDiaNomi!=null) {
			this.jInternalFrameDetalleFormRangoDiaNomi.setVisible(false);	    			
			this.jInternalFrameDetalleFormRangoDiaNomi.dispose();
			this.jInternalFrameDetalleFormRangoDiaNomi=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoRangoDiaNomi!=null) {
			this.jInternalFrameReporteDinamicoRangoDiaNomi.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoRangoDiaNomi.dispose();
			this.jInternalFrameReporteDinamicoRangoDiaNomi=null;
		}
		
		if(this.jInternalFrameImportacionRangoDiaNomi!=null) {
			this.jInternalFrameImportacionRangoDiaNomi.setVisible(false);	    			
			this.jInternalFrameImportacionRangoDiaNomi.dispose();
			this.jInternalFrameImportacionRangoDiaNomi=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessRangoDiaNomi();
			
			RangoDiaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.rangodianomi,new Object(),this.rangodianomiParameterGeneral,this.rangodianomiReturnGeneral);
			
			
			if(sTipo.equals("NuevoRangoDiaNomi")) {
				jButtonNuevoRangoDiaNomiActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarRangoDiaNomi")) {
				jButtonDuplicarRangoDiaNomiActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarRangoDiaNomi")) {
				jButtonCopiarRangoDiaNomiActionPerformed(evt);
			} else if(sTipo.equals("VerFormRangoDiaNomi")) {
				jButtonVerFormRangoDiaNomiActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarRangoDiaNomi")) {
				jButtonNuevoRangoDiaNomiActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarRangoDiaNomi")) {
				jButtonDuplicarRangoDiaNomiActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoRangoDiaNomi")) {
				jButtonNuevoRangoDiaNomiActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarRangoDiaNomi")) {
				jButtonDuplicarRangoDiaNomiActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesRangoDiaNomi")) {
				jButtonNuevoRangoDiaNomiActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarRangoDiaNomi")) {
				jButtonNuevoRangoDiaNomiActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesRangoDiaNomi")) {
				jButtonNuevoRangoDiaNomiActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarRangoDiaNomi")) {
				jButtonModificarRangoDiaNomiActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarRangoDiaNomi")) {
				jButtonModificarRangoDiaNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarRangoDiaNomi")) {
				jButtonModificarRangoDiaNomiActionPerformed(evt);
			} else if(sTipo.equals("ActualizarRangoDiaNomi")) {
				jButtonActualizarRangoDiaNomiActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarRangoDiaNomi")) {
				jButtonActualizarRangoDiaNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarRangoDiaNomi")) {
				jButtonActualizarRangoDiaNomiActionPerformed(evt);
			} else if(sTipo.equals("EliminarRangoDiaNomi")) {
				jButtonEliminarRangoDiaNomiActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarRangoDiaNomi")) {
				jButtonEliminarRangoDiaNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarRangoDiaNomi")) {
				jButtonEliminarRangoDiaNomiActionPerformed(evt);
			} else if(sTipo.equals("CancelarRangoDiaNomi")) {
				jButtonCancelarRangoDiaNomiActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarRangoDiaNomi")) {
				jButtonCancelarRangoDiaNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarRangoDiaNomi")) {
				jButtonCancelarRangoDiaNomiActionPerformed(evt);
			} else if(sTipo.equals("CerrarRangoDiaNomi")) {
				jButtonCerrarRangoDiaNomiActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarRangoDiaNomi")) {
				jButtonCerrarRangoDiaNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarRangoDiaNomi")) {
				jButtonCerrarRangoDiaNomiActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarRangoDiaNomi")) {
				jButtonMostrarOcultarRangoDiaNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarRangoDiaNomi")) {
				jButtonCancelarRangoDiaNomiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosRangoDiaNomi")) {
				jButtonGuardarCambiosRangoDiaNomiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarRangoDiaNomi")) {
				jButtonGuardarCambiosRangoDiaNomiActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarRangoDiaNomi")) {
				jButtonCopiarRangoDiaNomiActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarRangoDiaNomi")) {
				jButtonVerFormRangoDiaNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosRangoDiaNomi")) {
				jButtonGuardarCambiosRangoDiaNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarRangoDiaNomi")) {
				jButtonCopiarRangoDiaNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormRangoDiaNomi")) {
				jButtonVerFormRangoDiaNomiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaRangoDiaNomi")) {
				jButtonGuardarCambiosRangoDiaNomiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarRangoDiaNomi")) {
				jButtonGuardarCambiosRangoDiaNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaRangoDiaNomi")) {
				jButtonGuardarCambiosRangoDiaNomiActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionRangoDiaNomi")) {
				jButtonRecargarInformacionRangoDiaNomiActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarRangoDiaNomi")) {
				jButtonRecargarInformacionRangoDiaNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionRangoDiaNomi")) {
				jButtonRecargarInformacionRangoDiaNomiActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresRangoDiaNomi")) {
				jButtonAnterioresRangoDiaNomiActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarRangoDiaNomi")) {
				jButtonAnterioresRangoDiaNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreRangoDiaNomi")) {
				jButtonAnterioresRangoDiaNomiActionPerformed(evt);
			} else if(sTipo.equals("SiguientesRangoDiaNomi")) {
				jButtonSiguientesRangoDiaNomiActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarRangoDiaNomi")) {
				jButtonSiguientesRangoDiaNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesRangoDiaNomi")) {
				jButtonSiguientesRangoDiaNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByRangoDiaNomi") || sTipo.equals("MenuItemDetalleAbrirOrderByRangoDiaNomi")) {
				jButtonAbrirOrderByRangoDiaNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarRangoDiaNomi") || sTipo.equals("MenuItemDetalleMostrarOcultarRangoDiaNomi")) {
				jButtonMostrarOcultarRangoDiaNomiActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosRangoDiaNomi")) {
				jButtonNuevoGuardarCambiosRangoDiaNomiActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarRangoDiaNomi")) {
				jButtonNuevoGuardarCambiosRangoDiaNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosRangoDiaNomi")) {
				jButtonNuevoGuardarCambiosRangoDiaNomiActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoRangoDiaNomi")) {
				jButtonCerrarReporteDinamicoRangoDiaNomiActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoRangoDiaNomi")) {
				jButtonGenerarReporteDinamicoRangoDiaNomiActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoRangoDiaNomi")) {
				
				jButtonGenerarExcelReporteDinamicoRangoDiaNomiActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionRangoDiaNomi")) {
				jButtonCerrarImportacionRangoDiaNomiActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionRangoDiaNomi")) {
				
				jButtonGenerarImportacionRangoDiaNomiActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionRangoDiaNomi")) {
				
				jButtonAbrirImportacionRangoDiaNomiActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesRangoDiaNomi")) {
				jComboBoxTiposAccionesRangoDiaNomiActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesRangoDiaNomi")) {
				jComboBoxTiposRelacionesRangoDiaNomiActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioRangoDiaNomi")) {
				jComboBoxTiposAccionesRangoDiaNomiActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarRangoDiaNomi")) {
				
				jComboBoxTiposSeleccionarRangoDiaNomiActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralRangoDiaNomi")) {
				jTextFieldValorCampoGeneralRangoDiaNomiActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByRangoDiaNomi")) {
				jButtonAbrirOrderByRangoDiaNomiActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarRangoDiaNomi")) {
				jButtonAbrirOrderByRangoDiaNomiActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByRangoDiaNomi")) {
				jButtonCerrarOrderByRangoDiaNomiActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idRangoDiaNomiBusqueda")) {
				this.jButtonidRangoDiaNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaRangoDiaNomiUpdate")) {
				this.jButtonid_empresaRangoDiaNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaRangoDiaNomiBusqueda")) {
				this.jButtonid_empresaRangoDiaNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_inicioRangoDiaNomiBusqueda")) {
				this.jButtonfecha_inicioRangoDiaNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_finRangoDiaNomiBusqueda")) {
				this.jButtonfecha_finRangoDiaNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionRangoDiaNomiBusqueda")) {
				this.jButtondescripcionRangoDiaNomiBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			RangoDiaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.rangodianomi,new Object(),this.rangodianomiParameterGeneral,this.rangodianomiReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessRangoDiaNomi();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRangoDiaNomiActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.rangodianomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.rangodianomi);
				
				RangoDiaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rangodianomi,new Object(),this.rangodianomiParameterGeneral,this.rangodianomiReturnGeneral);
				
				


				
				RangoDiaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rangodianomi,new Object(),this.rangodianomiParameterGeneral,this.rangodianomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RangoDiaNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RangoDiaNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			RangoDiaNomi rangodianomiLocal=null;
			
			if(!this.getEsControlTabla()) {
				rangodianomiLocal=this.rangodianomi;
			} else {
				rangodianomiLocal=this.rangodianomiAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.rangodianomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.rangodianomi);
				
				RangoDiaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rangodianomi,new Object(),this.rangodianomiParameterGeneral,this.rangodianomiReturnGeneral);
							
				
				


				
				RangoDiaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rangodianomi,new Object(),this.rangodianomiParameterGeneral,this.rangodianomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RangoDiaNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RangoDiaNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRangoDiaNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRangoDiaNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rangodianomiAnterior =(RangoDiaNomi) this.rangodianomiLogic.getRangoDiaNomis().toArray()[this.jTableDatosRangoDiaNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.rangodianomiAnterior =(RangoDiaNomi) this.rangodianomis.toArray()[this.jTableDatosRangoDiaNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
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
			
			RangoDiaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rangodianomi,new Object(),this.rangodianomiParameterGeneral,this.rangodianomiReturnGeneral);
			
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
			
			


			
			RangoDiaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rangodianomi,new Object(),this.rangodianomiParameterGeneral,this.rangodianomiReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRangoDiaNomiActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.rangodianomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.rangodianomi);
				
				RangoDiaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rangodianomi,new Object(),this.rangodianomiParameterGeneral,this.rangodianomiReturnGeneral);
								
						
				


				
				RangoDiaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rangodianomi,new Object(),this.rangodianomiParameterGeneral,this.rangodianomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RangoDiaNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RangoDiaNomi.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.rangodianomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.rangodianomi);
				
				RangoDiaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rangodianomi,new Object(),this.rangodianomiParameterGeneral,this.rangodianomiReturnGeneral);
								
				
				


				
				RangoDiaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rangodianomi,new Object(),this.rangodianomiParameterGeneral,this.rangodianomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RangoDiaNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RangoDiaNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRangoDiaNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRangoDiaNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rangodianomiAnterior =(RangoDiaNomi) this.rangodianomiLogic.getRangoDiaNomis().toArray()[this.jTableDatosRangoDiaNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.rangodianomiAnterior =(RangoDiaNomi) this.rangodianomis.toArray()[this.jTableDatosRangoDiaNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.rangodianomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.rangodianomi);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRangoDiaNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRangoDiaNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rangodianomiAnterior =(RangoDiaNomi) this.rangodianomiLogic.getRangoDiaNomis().toArray()[this.jTableDatosRangoDiaNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.rangodianomiAnterior =(RangoDiaNomi) this.rangodianomis.toArray()[this.jTableDatosRangoDiaNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRangoDiaNomiActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.rangodianomi);
			
			this.actualizarInformacion("INFO_PADRE",false,this.rangodianomi);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.rangodianomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.rangodianomi);
				
				RangoDiaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rangodianomi,new Object(),this.rangodianomiParameterGeneral,this.rangodianomiReturnGeneral);
							
				
				


				
				RangoDiaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rangodianomi,new Object(),this.rangodianomiParameterGeneral,this.rangodianomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RangoDiaNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RangoDiaNomi.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRangoDiaNomiActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosRangoDiaNomi.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.rangodianomiAnterior =(RangoDiaNomi) this.rangodianomiLogic.getRangoDiaNomis().toArray()[this.jTableDatosRangoDiaNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.rangodianomiAnterior =(RangoDiaNomi) this.rangodianomis.toArray()[this.jTableDatosRangoDiaNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
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
			
			RangoDiaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rangodianomi,new Object(),this.rangodianomiParameterGeneral,this.rangodianomiReturnGeneral);
			
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
			
			


			
			RangoDiaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rangodianomi,new Object(),this.rangodianomiParameterGeneral,this.rangodianomiReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRangoDiaNomiActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.rangodianomi);
			
			this.actualizarInformacion("INFO_PADRE",false,this.rangodianomi);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.rangodianomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.rangodianomi);
				
				RangoDiaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rangodianomi,new Object(),this.rangodianomiParameterGeneral,this.rangodianomiReturnGeneral);
								
				
				


				
				RangoDiaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rangodianomi,new Object(),this.rangodianomiParameterGeneral,this.rangodianomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RangoDiaNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RangoDiaNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRangoDiaNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRangoDiaNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rangodianomiAnterior =(RangoDiaNomi) this.rangodianomiLogic.getRangoDiaNomis().toArray()[this.jTableDatosRangoDiaNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.rangodianomiAnterior =(RangoDiaNomi) this.rangodianomis.toArray()[this.jTableDatosRangoDiaNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRangoDiaNomiActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.rangodianomi);
			
			this.actualizarInformacion("INFO_PADRE",false,this.rangodianomi);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRangoDiaNomiActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.rangodianomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.rangodianomi);
				
				RangoDiaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.rangodianomi,new Object(),this.rangodianomiParameterGeneral,this.rangodianomiReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosRangoDiaNomi")) {
					jCheckBoxSeleccionarTodosRangoDiaNomiItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosRangoDiaNomi")) {
					jCheckBoxSeleccionadosRangoDiaNomiItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarRangoDiaNomi")) {
					
				}
				
				


				
				
				RangoDiaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.rangodianomi,new Object(),this.rangodianomiParameterGeneral,this.rangodianomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RangoDiaNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RangoDiaNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.rangodianomi);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.rangodianomi);
				
				RangoDiaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.rangodianomi,new Object(),this.rangodianomiParameterGeneral,this.rangodianomiReturnGeneral);
												
				
				


				
				
				RangoDiaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.rangodianomi,new Object(),this.rangodianomiParameterGeneral,this.rangodianomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RangoDiaNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RangoDiaNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRangoDiaNomiActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosRangoDiaNomi.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.rangodianomiAnterior =(RangoDiaNomi) this.rangodianomiLogic.getRangoDiaNomis().toArray()[this.jTableDatosRangoDiaNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.rangodianomiAnterior =(RangoDiaNomi) this.rangodianomis.toArray()[this.jTableDatosRangoDiaNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRangoDiaNomiActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.rangodianomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.rangodianomi);
				
				RangoDiaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.rangodianomi,new Object(),this.rangodianomiParameterGeneral,this.rangodianomiReturnGeneral);
				
				
				RangoDiaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.rangodianomi,new Object(),this.rangodianomiParameterGeneral,this.rangodianomiReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
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
			
			RangoDiaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.rangodianomi,new Object(),this.rangodianomiParameterGeneral,this.rangodianomiReturnGeneral);
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
			
			


			
			RangoDiaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rangodianomi,new Object(),this.rangodianomiParameterGeneral,this.rangodianomiReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRangoDiaNomiActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.rangodianomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.rangodianomi);
				
				RangoDiaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.rangodianomi,new Object(),this.rangodianomiParameterGeneral,this.rangodianomiReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				RangoDiaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rangodianomi,new Object(),this.rangodianomiParameterGeneral,this.rangodianomiReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RangoDiaNomi.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RangoDiaNomi.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.rangodianomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.rangodianomi);
				
				RangoDiaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.rangodianomi,new Object(),this.rangodianomiParameterGeneral,this.rangodianomiReturnGeneral);
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
				
				


				
				RangoDiaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rangodianomi,new Object(),this.rangodianomiParameterGeneral,this.rangodianomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RangoDiaNomi.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RangoDiaNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRangoDiaNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRangoDiaNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rangodianomiAnterior =(RangoDiaNomi) this.rangodianomiLogic.getRangoDiaNomis().toArray()[this.jTableDatosRangoDiaNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.rangodianomiAnterior =(RangoDiaNomi) this.rangodianomis.toArray()[this.jTableDatosRangoDiaNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				RangoDiaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rangodianomi,new Object(),this.rangodianomiParameterGeneral,this.rangodianomiReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarRangoDiaNomi")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosRangoDiaNomiListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosRangoDiaNomi.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.rangodianomi =(RangoDiaNomi) this.rangodianomiLogic.getRangoDiaNomis().toArray()[this.jTableDatosRangoDiaNomi.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.rangodianomi =(RangoDiaNomi) this.rangodianomis.toArray()[this.jTableDatosRangoDiaNomi.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.rangodianomi);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarRangoDiaNomi")) {
				
				}
				
				RangoDiaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rangodianomi,new Object(),this.rangodianomiParameterGeneral,this.rangodianomiReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			RangoDiaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.rangodianomi,new Object(),this.rangodianomiParameterGeneral,this.rangodianomiReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarRangoDiaNomi")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosRangoDiaNomi.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarRangoDiaNomi")) {
			
			}
			
			RangoDiaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.rangodianomi,new Object(),this.rangodianomiParameterGeneral,this.rangodianomiReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessRangoDiaNomi();
			
			RangoDiaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.rangodianomi,new Object(),this.rangodianomiParameterGeneral,this.rangodianomiReturnGeneral);
			
			if(sTipo.equals("NuevoRangoDiaNomi")) {
				jButtonNuevoRangoDiaNomiActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarRangoDiaNomi")) {
				jButtonDuplicarRangoDiaNomiActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarRangoDiaNomi")) {
				jButtonCopiarRangoDiaNomiActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormRangoDiaNomi")) {
				jButtonVerFormRangoDiaNomiActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesRangoDiaNomi")) {
				jButtonNuevoRangoDiaNomiActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarRangoDiaNomi")) {
				jButtonModificarRangoDiaNomiActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarRangoDiaNomi")) {
				jButtonActualizarRangoDiaNomiActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarRangoDiaNomi")) {
				jButtonEliminarRangoDiaNomiActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaRangoDiaNomi")) {
				jButtonGuardarCambiosRangoDiaNomiActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarRangoDiaNomi")) {
				jButtonCancelarRangoDiaNomiActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarRangoDiaNomi")) {
				jButtonCerrarRangoDiaNomiActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosRangoDiaNomi")) {
				jButtonGuardarCambiosRangoDiaNomiActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosRangoDiaNomi")) {
				jButtonNuevoGuardarCambiosRangoDiaNomiActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByRangoDiaNomi")) {
				jButtonAbrirOrderByRangoDiaNomiActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionRangoDiaNomi")) {
				jButtonRecargarInformacionRangoDiaNomiActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresRangoDiaNomi")) {
				jButtonAnterioresRangoDiaNomiActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesRangoDiaNomi")) {
				jButtonSiguientesRangoDiaNomiActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idRangoDiaNomiBusqueda")) {
				this.jButtonidRangoDiaNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaRangoDiaNomiUpdate")) {
				this.jButtonid_empresaRangoDiaNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaRangoDiaNomiBusqueda")) {
				this.jButtonid_empresaRangoDiaNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_inicioRangoDiaNomiBusqueda")) {
				this.jButtonfecha_inicioRangoDiaNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_finRangoDiaNomiBusqueda")) {
				this.jButtonfecha_finRangoDiaNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionRangoDiaNomiBusqueda")) {
				this.jButtondescripcionRangoDiaNomiBusquedaActionPerformed(evt);
			}
			
			RangoDiaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.rangodianomi,new Object(),this.rangodianomiParameterGeneral,this.rangodianomiReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessRangoDiaNomi();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			RangoDiaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.rangodianomi,new Object(),this.rangodianomiParameterGeneral,this.rangodianomiReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameRangoDiaNomi")) {
				closingInternalFrameRangoDiaNomi();
				
			} else if(sTipo.equals("jButtonCancelarRangoDiaNomi")) {
				JInternalFrameBase jInternalFrameDetalleFormRangoDiaNomi = (JInternalFrameBase)evt.getSource();
	            	
	            RangoDiaNomiBeanSwingJInternalFrame jInternalFrameParent=(RangoDiaNomiBeanSwingJInternalFrame)jInternalFrameDetalleFormRangoDiaNomi.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarRangoDiaNomiActionPerformed(null);
			}
			
			RangoDiaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.rangodianomi,new Object(),this.rangodianomiParameterGeneral,this.rangodianomiReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormRangoDiaNomi(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormRangoDiaNomi(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormRangoDiaNomi(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.rangodianomi)) {
			if(!esControlTabla) {
				if(RangoDiaNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualRangoDiaNomi(this.rangodianomi,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysRangoDiaNomi(this.rangodianomi);			
				}
				
				if(this.rangodianomiSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualRangoDiaNomi(this.rangodianomi,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.rangodianomiReturnGeneral=rangodianomiLogic.procesarEventosRangoDiaNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.rangodianomiLogic.getRangoDiaNomis(),this.rangodianomi,this.rangodianomiParameterGeneral,this.isEsNuevoRangoDiaNomi,classes);//this.rangodianomiLogic.getRangoDiaNomi()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanRangoDiaNomi(this.rangodianomiReturnGeneral,this.rangodianomiBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.rangodianomiSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanRangoDiaNomi(classes,this.rangodianomiReturnGeneral,this.rangodianomiBean,false);
					}
						
					if(this.rangodianomiReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyRangoDiaNomi(this.rangodianomiReturnGeneral.getRangoDiaNomi());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioRangoDiaNomi(this.rangodianomiReturnGeneral.getRangoDiaNomi());	
					}
						
					if(this.rangodianomiReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioRangoDiaNomi(this.rangodianomiReturnGeneral.getRangoDiaNomi(),classes);//this.rangodianomiBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioRangoDiaNomi(this.rangodianomi,classes);//this.rangodianomiBean);									
				}
			
				if(RangoDiaNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualRangoDiaNomi(this.rangodianomi,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysRangoDiaNomi(this.rangodianomi);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.rangodianomiAnterior!=null) {
						this.rangodianomi=this.rangodianomiAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.rangodianomiReturnGeneral=rangodianomiLogic.procesarEventosRangoDiaNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.rangodianomiLogic.getRangoDiaNomis(),this.rangodianomi,this.rangodianomiParameterGeneral,this.isEsNuevoRangoDiaNomi,classes);//this.rangodianomiLogic.getRangoDiaNomi()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.rangodianomiSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.rangodianomiSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.rangodianomiReturnGeneral.getRangoDiaNomi(),rangodianomiLogic.getRangoDiaNomis());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.rangodianomiReturnGeneral.getRangoDiaNomi(),this.rangodianomis);
				}
				//ARCHITECTURE
				
				//this.jTableDatosRangoDiaNomi.repaint();
				
				//((AbstractTableModel) this.jTableDatosRangoDiaNomi.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosRangoDiaNomi();
			}
		}
	}
	
	public void actualizarVisualTableDatosRangoDiaNomi() throws Exception {
		
		RangoDiaNomiModel rangodianomiModel=(RangoDiaNomiModel)this.jTableDatosRangoDiaNomi.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			rangodianomiModel.rangodianomis=this.rangodianomiLogic.getRangoDiaNomis();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			rangodianomiModel.rangodianomis=this.rangodianomis;
		}
		
		
		((RangoDiaNomiModel) this.jTableDatosRangoDiaNomi.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaRangoDiaNomi() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getrangodianomiAnterior(),this.rangodianomiLogic.getRangoDiaNomis());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getrangodianomiAnterior(),this.rangodianomis);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosRangoDiaNomi();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioRangoDiaNomi(RangoDiaNomi rangodianomi,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
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
										
				RangoDiaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.rangodianomi,new Object(),generalEntityParameterGeneral,this.rangodianomiReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.rangodianomiSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=RangoDiaNomiConstantesFunciones.getClassesRelationshipsOfRangoDiaNomi(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=RangoDiaNomiConstantesFunciones.getClassesRelationshipsFromStringsOfRangoDiaNomi(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormRangoDiaNomi(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				RangoDiaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.rangodianomi,new Object(),generalEntityParameterGeneral,this.rangodianomiReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioRangoDiaNomi(RangoDiaNomiBean rangodianomiBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanRangoDiaNomi(ArrayList<Classe> classes,RangoDiaNomiReturnGeneral rangodianomiReturnGeneral,RangoDiaNomiBean rangodianomiBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualRangoDiaNomi(RangoDiaNomi rangodianomi,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.rangodianomi)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormRangoDiaNomi = new RangoDiaNomiDetalleFormJInternalFrame(jDesktopPane,this.rangodianomiSessionBean.getConGuardarRelaciones(),this.rangodianomiSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormRangoDiaNomi);
		this.jInternalFrameDetalleFormRangoDiaNomi.setVisible(false);
		this.jInternalFrameDetalleFormRangoDiaNomi.setSelected(false);						
		
		this.jInternalFrameDetalleFormRangoDiaNomi.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormRangoDiaNomi.rangodianomiLogic=this.rangodianomiLogic;
		
		this.cargarCombosFrameForeignKeyRangoDiaNomi("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleRangoDiaNomi();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleRangoDiaNomi();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyRangoDiaNomi("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyRangoDiaNomi();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormRangoDiaNomi.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarRangoDiaNomi"));
		
		this.jInternalFrameDetalleFormRangoDiaNomi.jButtonModificarRangoDiaNomi.addActionListener(new ButtonActionListener(this,"ModificarRangoDiaNomi"));

		
		this.jInternalFrameDetalleFormRangoDiaNomi.jButtonModificarToolBarRangoDiaNomi.addActionListener(new ButtonActionListener(this,"ModificarToolBarRangoDiaNomi"));
					
		this.jInternalFrameDetalleFormRangoDiaNomi.jMenuItemModificarRangoDiaNomi.addActionListener(new ButtonActionListener(this,"MenuItemModificarRangoDiaNomi"));		
		
		
		
		this.jInternalFrameDetalleFormRangoDiaNomi.jButtonActualizarRangoDiaNomi.addActionListener (new ButtonActionListener(this,"ActualizarRangoDiaNomi"));
		
		
		this.jInternalFrameDetalleFormRangoDiaNomi.jButtonActualizarToolBarRangoDiaNomi.addActionListener(new ButtonActionListener(this,"ActualizarToolBarRangoDiaNomi"));
						
		this.jInternalFrameDetalleFormRangoDiaNomi.jMenuItemActualizarRangoDiaNomi.addActionListener (new ButtonActionListener(this,"MenuItemActualizarRangoDiaNomi"));		
		
		
		
		this.jInternalFrameDetalleFormRangoDiaNomi.jButtonEliminarRangoDiaNomi.addActionListener (new ButtonActionListener(this,"EliminarRangoDiaNomi"));
		
		
		this.jInternalFrameDetalleFormRangoDiaNomi.jButtonEliminarToolBarRangoDiaNomi.addActionListener (new ButtonActionListener(this,"EliminarToolBarRangoDiaNomi"));
								
		this.jInternalFrameDetalleFormRangoDiaNomi.jMenuItemEliminarRangoDiaNomi.addActionListener (new ButtonActionListener(this,"MenuItemEliminarRangoDiaNomi"));		
		
		
		
		this.jInternalFrameDetalleFormRangoDiaNomi.jButtonCancelarRangoDiaNomi.addActionListener (new ButtonActionListener(this,"CancelarRangoDiaNomi"));
		
		
		this.jInternalFrameDetalleFormRangoDiaNomi.jButtonCancelarToolBarRangoDiaNomi.addActionListener (new ButtonActionListener(this,"CancelarToolBarRangoDiaNomi"));
					
		this.jInternalFrameDetalleFormRangoDiaNomi.jMenuItemCancelarRangoDiaNomi.addActionListener (new ButtonActionListener(this,"MenuItemCancelarRangoDiaNomi"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormRangoDiaNomi.jMenuItemDetalleCerrarRangoDiaNomi.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarRangoDiaNomi"));		
		
		
		
		this.jInternalFrameDetalleFormRangoDiaNomi.jButtonGuardarCambiosToolBarRangoDiaNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarRangoDiaNomi"));
		
		
		
		this.jInternalFrameDetalleFormRangoDiaNomi.jButtonGuardarCambiosToolBarRangoDiaNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarRangoDiaNomi"));
		
		
		
		this.jInternalFrameDetalleFormRangoDiaNomi.jComboBoxTiposAccionesFormularioRangoDiaNomi.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioRangoDiaNomi"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRangoDiaNomi.jButtonidRangoDiaNomiBusqueda.addActionListener(new ButtonActionListener(this,"idRangoDiaNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRangoDiaNomi.jButtonid_empresaRangoDiaNomiUpdate.addActionListener(new ButtonActionListener(this,"id_empresaRangoDiaNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRangoDiaNomi.jButtonid_empresaRangoDiaNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaRangoDiaNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRangoDiaNomi.jButtonfecha_inicioRangoDiaNomiBusqueda.addActionListener(new ButtonActionListener(this,"fecha_inicioRangoDiaNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRangoDiaNomi.jButtonfecha_finRangoDiaNomiBusqueda.addActionListener(new ButtonActionListener(this,"fecha_finRangoDiaNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRangoDiaNomi.jButtondescripcionRangoDiaNomiBusqueda.addActionListener(new ButtonActionListener(this,"descripcionRangoDiaNomiBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormRangoDiaNomi.jTabbedPaneRelacionesRangoDiaNomi.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesRangoDiaNomi"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameRangoDiaNomi"));
		
		if(this.jInternalFrameDetalleFormRangoDiaNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRangoDiaNomi.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarRangoDiaNomi"));
		}
		
		this.jTableDatosRangoDiaNomi.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarRangoDiaNomi"));
		
		this.jTableDatosRangoDiaNomi.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarRangoDiaNomi"));
		
		this.jButtonNuevoRangoDiaNomi.addActionListener(new ButtonActionListener(this,"NuevoRangoDiaNomi"));
		
		this.jButtonDuplicarRangoDiaNomi.addActionListener(new ButtonActionListener(this,"DuplicarRangoDiaNomi"));
		
		this.jButtonCopiarRangoDiaNomi.addActionListener(new ButtonActionListener(this,"CopiarRangoDiaNomi"));
		
		this.jButtonVerFormRangoDiaNomi.addActionListener(new ButtonActionListener(this,"VerFormRangoDiaNomi"));
		
		
		this.jButtonNuevoToolBarRangoDiaNomi.addActionListener(new ButtonActionListener(this,"NuevoToolBarRangoDiaNomi"));
			
		this.jButtonDuplicarToolBarRangoDiaNomi.addActionListener(new ButtonActionListener(this,"DuplicarToolBarRangoDiaNomi"));
			
		this.jMenuItemNuevoRangoDiaNomi.addActionListener (new ButtonActionListener(this,"MenuItemNuevoRangoDiaNomi"));
			
		this.jMenuItemDuplicarRangoDiaNomi.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarRangoDiaNomi"));		
		
		
		this.jButtonNuevoRelacionesRangoDiaNomi.addActionListener (new ButtonActionListener(this,"NuevoRelacionesRangoDiaNomi"));
		
		
		this.jButtonNuevoRelacionesToolBarRangoDiaNomi.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarRangoDiaNomi"));
			
		this.jMenuItemNuevoRelacionesRangoDiaNomi.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesRangoDiaNomi"));		
		
		
		if(this.jInternalFrameDetalleFormRangoDiaNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRangoDiaNomi.jButtonModificarRangoDiaNomi.addActionListener(new ButtonActionListener(this,"ModificarRangoDiaNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormRangoDiaNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRangoDiaNomi.jButtonModificarToolBarRangoDiaNomi.addActionListener(new ButtonActionListener(this,"ModificarToolBarRangoDiaNomi"));
			
			this.jInternalFrameDetalleFormRangoDiaNomi.jMenuItemModificarRangoDiaNomi.addActionListener(new ButtonActionListener(this,"MenuItemModificarRangoDiaNomi"));		
		}
		
		
		if(this.jInternalFrameDetalleFormRangoDiaNomi!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormRangoDiaNomi.jButtonActualizarRangoDiaNomi.addActionListener (new ButtonActionListener(this,"ActualizarRangoDiaNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormRangoDiaNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRangoDiaNomi.jButtonActualizarToolBarRangoDiaNomi.addActionListener(new ButtonActionListener(this,"ActualizarToolBarRangoDiaNomi"));
				
			this.jInternalFrameDetalleFormRangoDiaNomi.jMenuItemActualizarRangoDiaNomi.addActionListener (new ButtonActionListener(this,"MenuItemActualizarRangoDiaNomi"));		
		}
		
		
		if(this.jInternalFrameDetalleFormRangoDiaNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRangoDiaNomi.jButtonEliminarRangoDiaNomi.addActionListener (new ButtonActionListener(this,"EliminarRangoDiaNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormRangoDiaNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRangoDiaNomi.jButtonEliminarToolBarRangoDiaNomi.addActionListener (new ButtonActionListener(this,"EliminarToolBarRangoDiaNomi"));
						
			this.jInternalFrameDetalleFormRangoDiaNomi.jMenuItemEliminarRangoDiaNomi.addActionListener (new ButtonActionListener(this,"MenuItemEliminarRangoDiaNomi"));		
		}
		
		
		if(this.jInternalFrameDetalleFormRangoDiaNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRangoDiaNomi.jButtonCancelarRangoDiaNomi.addActionListener (new ButtonActionListener(this,"CancelarRangoDiaNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormRangoDiaNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRangoDiaNomi.jButtonCancelarToolBarRangoDiaNomi.addActionListener (new ButtonActionListener(this,"CancelarToolBarRangoDiaNomi"));
			
			this.jInternalFrameDetalleFormRangoDiaNomi.jMenuItemCancelarRangoDiaNomi.addActionListener (new ButtonActionListener(this,"MenuItemCancelarRangoDiaNomi"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarRangoDiaNomi.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarRangoDiaNomi"));		
		
		
		this.jButtonCerrarRangoDiaNomi.addActionListener (new ButtonActionListener(this,"CerrarRangoDiaNomi"));
		
		
		this.jButtonCerrarToolBarRangoDiaNomi.addActionListener (new ButtonActionListener(this,"CerrarToolBarRangoDiaNomi"));
			
		this.jMenuItemCerrarRangoDiaNomi.addActionListener (new ButtonActionListener(this,"MenuItemCerrarRangoDiaNomi"));
			
		if(this.jInternalFrameDetalleFormRangoDiaNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRangoDiaNomi.jMenuItemDetalleCerrarRangoDiaNomi.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarRangoDiaNomi"));		
		}
		
		
		if(this.jInternalFrameDetalleFormRangoDiaNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRangoDiaNomi.jButtonGuardarCambiosRangoDiaNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosRangoDiaNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormRangoDiaNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRangoDiaNomi.jButtonGuardarCambiosToolBarRangoDiaNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarRangoDiaNomi"));
		}
		
		this.jButtonCopiarToolBarRangoDiaNomi.addActionListener (new ButtonActionListener(this,"CopiarToolBarRangoDiaNomi"));
			
		this.jButtonVerFormToolBarRangoDiaNomi.addActionListener (new ButtonActionListener(this,"VerFormToolBarRangoDiaNomi"));
		
		this.jMenuItemGuardarCambiosRangoDiaNomi.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosRangoDiaNomi"));
			
		this.jMenuItemCopiarRangoDiaNomi.addActionListener (new ButtonActionListener(this,"MenuItemCopiarRangoDiaNomi"));		
		
		this.jMenuItemVerFormRangoDiaNomi.addActionListener (new ButtonActionListener(this,"MenuItemVerFormRangoDiaNomi"));		
		
		
		this.jButtonGuardarCambiosTablaRangoDiaNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaRangoDiaNomi"));
		
		
		this.jButtonGuardarCambiosTablaToolBarRangoDiaNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarRangoDiaNomi"));
			
		this.jMenuItemGuardarCambiosTablaRangoDiaNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaRangoDiaNomi"));		
		
		
		
		this.jButtonRecargarInformacionRangoDiaNomi.addActionListener (new ButtonActionListener(this,"RecargarInformacionRangoDiaNomi"));
					
		this.jButtonRecargarInformacionToolBarRangoDiaNomi.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarRangoDiaNomi"));
		
		this.jMenuItemRecargarInformacionRangoDiaNomi.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionRangoDiaNomi"));		
		
		
		
		this.jButtonAnterioresRangoDiaNomi.addActionListener (new ButtonActionListener(this,"AnterioresRangoDiaNomi"));
		
		
		this.jButtonAnterioresToolBarRangoDiaNomi.addActionListener (new ButtonActionListener(this,"AnterioresToolBarRangoDiaNomi"));
		
		this.jMenuItemAnterioresRangoDiaNomi.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresRangoDiaNomi"));		
		
		
		this.jButtonSiguientesRangoDiaNomi.addActionListener (new ButtonActionListener(this,"SiguientesRangoDiaNomi"));
		
		
		this.jButtonSiguientesToolBarRangoDiaNomi.addActionListener (new ButtonActionListener(this,"SiguientesToolBarRangoDiaNomi"));
			
		this.jMenuItemSiguientesRangoDiaNomi.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesRangoDiaNomi"));
			
		this.jMenuItemAbrirOrderByRangoDiaNomi.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByRangoDiaNomi"));
			
		this.jMenuItemMostrarOcultarRangoDiaNomi.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarRangoDiaNomi"));
			
		this.jMenuItemDetalleAbrirOrderByRangoDiaNomi.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByRangoDiaNomi"));
			
		this.jMenuItemDetalleMostarOcultarRangoDiaNomi.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarRangoDiaNomi"));		
		
		
		this.jButtonNuevoGuardarCambiosRangoDiaNomi.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosRangoDiaNomi"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarRangoDiaNomi.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarRangoDiaNomi"));
			
		this.jMenuItemNuevoGuardarCambiosRangoDiaNomi.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosRangoDiaNomi"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosRangoDiaNomi.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosRangoDiaNomi"));

		this.jCheckBoxSeleccionadosRangoDiaNomi.addItemListener(new CheckBoxItemListener(this,"SeleccionadosRangoDiaNomi"));
		
		if(this.jInternalFrameDetalleFormRangoDiaNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRangoDiaNomi.jComboBoxTiposAccionesFormularioRangoDiaNomi.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioRangoDiaNomi"));
		}
		
		
		this.jComboBoxTiposRelacionesRangoDiaNomi.addActionListener (new ButtonActionListener(this,"TiposRelacionesRangoDiaNomi"));
			
		this.jComboBoxTiposAccionesRangoDiaNomi.addActionListener (new ButtonActionListener(this,"TiposAccionesRangoDiaNomi"));
					
		this.jComboBoxTiposSeleccionarRangoDiaNomi.addActionListener (new ButtonActionListener(this,"TiposSeleccionarRangoDiaNomi"));
			
		this.jTextFieldValorCampoGeneralRangoDiaNomi.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralRangoDiaNomi"));		
		
		
		if(this.jInternalFrameDetalleFormRangoDiaNomi!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRangoDiaNomi.jButtonidRangoDiaNomiBusqueda.addActionListener(new ButtonActionListener(this,"idRangoDiaNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRangoDiaNomi.jButtonid_empresaRangoDiaNomiUpdate.addActionListener(new ButtonActionListener(this,"id_empresaRangoDiaNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRangoDiaNomi.jButtonid_empresaRangoDiaNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaRangoDiaNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRangoDiaNomi.jButtonfecha_inicioRangoDiaNomiBusqueda.addActionListener(new ButtonActionListener(this,"fecha_inicioRangoDiaNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRangoDiaNomi.jButtonfecha_finRangoDiaNomiBusqueda.addActionListener(new ButtonActionListener(this,"fecha_finRangoDiaNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRangoDiaNomi.jButtondescripcionRangoDiaNomiBusqueda.addActionListener(new ButtonActionListener(this,"descripcionRangoDiaNomiBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoRangoDiaNomi!=null) {
				this.jInternalFrameReporteDinamicoRangoDiaNomi.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoRangoDiaNomi"));
				this.jInternalFrameReporteDinamicoRangoDiaNomi.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoRangoDiaNomi"));
				this.jInternalFrameReporteDinamicoRangoDiaNomi.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoRangoDiaNomi"));
			}
			
			//this.jButtonCerrarReporteDinamicoRangoDiaNomi.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoRangoDiaNomi"));				
			//this.jButtonGenerarReporteDinamicoRangoDiaNomi.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoRangoDiaNomi"));
			//this.jButtonGenerarExcelReporteDinamicoRangoDiaNomi.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoRangoDiaNomi"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionRangoDiaNomi!=null) {
				this.jInternalFrameImportacionRangoDiaNomi.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionRangoDiaNomi"));
				this.jInternalFrameImportacionRangoDiaNomi.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionRangoDiaNomi"));
				this.jInternalFrameImportacionRangoDiaNomi.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionRangoDiaNomi"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByRangoDiaNomi.addActionListener (new ButtonActionListener(this,"AbrirOrderByRangoDiaNomi"));
			
			this.jButtonAbrirOrderByToolBarRangoDiaNomi.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarRangoDiaNomi"));			
			
			if(this.jInternalFrameOrderByRangoDiaNomi!=null) {
				this.jInternalFrameOrderByRangoDiaNomi.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByRangoDiaNomi"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormRangoDiaNomi!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormRangoDiaNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRangoDiaNomi.jTabbedPaneRelacionesRangoDiaNomi.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesRangoDiaNomi"));
		
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
            		closingInternalFrameRangoDiaNomi();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormRangoDiaNomi.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormRangoDiaNomi = (JInternalFrameBase)event.getSource();
	            	
	            RangoDiaNomiBeanSwingJInternalFrame jInternalFrameParent=(RangoDiaNomiBeanSwingJInternalFrame)jInternalFrameDetalleFormRangoDiaNomi.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarRangoDiaNomiActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosRangoDiaNomi.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosRangoDiaNomiListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosRangoDiaNomi.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosRangoDiaNomi.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoRangoDiaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRangoDiaNomiActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarRangoDiaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRangoDiaNomiActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRangoDiaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRangoDiaNomiActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRangoDiaNomi";
		inputMap = this.jButtonNuevoRangoDiaNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRangoDiaNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoRangoDiaNomiActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesRangoDiaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRangoDiaNomiActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarRangoDiaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRangoDiaNomiActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesRangoDiaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRangoDiaNomiActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesRangoDiaNomi";
		inputMap = this.jButtonNuevoRelacionesRangoDiaNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesRangoDiaNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoRangoDiaNomiActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarRangoDiaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarRangoDiaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarRangoDiaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarRangoDiaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarRangoDiaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarRangoDiaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarRangoDiaNomi";
		inputMap = this.jButtonModificarRangoDiaNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarRangoDiaNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarRangoDiaNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarRangoDiaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarRangoDiaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarRangoDiaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarRangoDiaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarRangoDiaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarRangoDiaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarRangoDiaNomi";
		inputMap = this.jButtonActualizarRangoDiaNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarRangoDiaNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarRangoDiaNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarRangoDiaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarRangoDiaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarRangoDiaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarRangoDiaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarRangoDiaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarRangoDiaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarRangoDiaNomi";
		inputMap = this.jButtonEliminarRangoDiaNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarRangoDiaNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarRangoDiaNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarRangoDiaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarRangoDiaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarRangoDiaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarRangoDiaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarRangoDiaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarRangoDiaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarRangoDiaNomi";
		inputMap = this.jButtonCancelarRangoDiaNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarRangoDiaNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarRangoDiaNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarRangoDiaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarRangoDiaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarRangoDiaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarRangoDiaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarRangoDiaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarRangoDiaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarRangoDiaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarRangoDiaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarRangoDiaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarRangoDiaNomi";
		inputMap = this.jButtonCerrarRangoDiaNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarRangoDiaNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarRangoDiaNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormRangoDiaNomi.jButtonGuardarCambiosRangoDiaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRangoDiaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarRangoDiaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRangoDiaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosRangoDiaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRangoDiaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaRangoDiaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRangoDiaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarRangoDiaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRangoDiaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaRangoDiaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRangoDiaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosRangoDiaNomi";
		inputMap = this.jInternalFrameDetalleFormRangoDiaNomi.jButtonGuardarCambiosRangoDiaNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormRangoDiaNomi.jButtonGuardarCambiosRangoDiaNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosRangoDiaNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionRangoDiaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionRangoDiaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarRangoDiaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionRangoDiaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionRangoDiaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionRangoDiaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresRangoDiaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresRangoDiaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarRangoDiaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresRangoDiaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresRangoDiaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresRangoDiaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesRangoDiaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesRangoDiaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarRangoDiaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesRangoDiaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesRangoDiaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesRangoDiaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosRangoDiaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosRangoDiaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarRangoDiaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosRangoDiaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosRangoDiaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosRangoDiaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosRangoDiaNomi.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosRangoDiaNomiItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesRangoDiaNomi.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesRangoDiaNomiActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarRangoDiaNomi.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarRangoDiaNomiActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralRangoDiaNomi.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralRangoDiaNomiActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRangoDiaNomi.jButtonidRangoDiaNomiBusqueda.addActionListener(new ButtonActionListener(this,"idRangoDiaNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRangoDiaNomi.jButtonid_empresaRangoDiaNomiUpdate.addActionListener(new ButtonActionListener(this,"id_empresaRangoDiaNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRangoDiaNomi.jButtonid_empresaRangoDiaNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaRangoDiaNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRangoDiaNomi.jButtonfecha_inicioRangoDiaNomiBusqueda.addActionListener(new ButtonActionListener(this,"fecha_inicioRangoDiaNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRangoDiaNomi.jButtonfecha_finRangoDiaNomiBusqueda.addActionListener(new ButtonActionListener(this,"fecha_finRangoDiaNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRangoDiaNomi.jButtondescripcionRangoDiaNomiBusqueda.addActionListener(new ButtonActionListener(this,"descripcionRangoDiaNomiBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoRangoDiaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoRangoDiaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoRangoDiaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoRangoDiaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoRangoDiaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoRangoDiaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionRangoDiaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionRangoDiaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionRangoDiaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionRangoDiaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionRangoDiaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionRangoDiaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarRangoDiaNomiActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarRangoDiaNomi.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosRangoDiaNomi(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(RangoDiaNomi rangodianomiAux:this.rangodianomiLogic.getRangoDiaNomis()) {
					rangodianomiAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(RangoDiaNomi rangodianomiAux:rangodianomis) {
					rangodianomiAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosRangoDiaNomiItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingRangoDiaNomi(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(RangoDiaNomi rangodianomiAux:this.rangodianomiLogic.getRangoDiaNomis()) {
						rangodianomiAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(RangoDiaNomi rangodianomiAux:rangodianomis) {
						rangodianomiAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(RangoDiaNomi rangodianomiAux:this.rangodianomiLogic.getRangoDiaNomis()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(RangoDiaNomi rangodianomiAux:rangodianomis) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaRangoDiaNomi(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosRangoDiaNomi.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosRangoDiaNomi.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosRangoDiaNomi,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosRangoDiaNomiItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingRangoDiaNomi(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosRangoDiaNomi.getSelectedRows();
			
			RangoDiaNomi rangodianomiLocal=new RangoDiaNomi();
			
			//this.seleccionarTodosRangoDiaNomi(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					rangodianomiLocal =(RangoDiaNomi) this.rangodianomiLogic.getRangoDiaNomis().toArray()[this.jTableDatosRangoDiaNomi.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					rangodianomiLocal =(RangoDiaNomi) this.rangodianomis.toArray()[this.jTableDatosRangoDiaNomi.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				rangodianomiLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(RangoDiaNomi rangodianomiAux:this.rangodianomiLogic.getRangoDiaNomis()) {
						rangodianomiAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(RangoDiaNomi rangodianomiAux:rangodianomis) {
						rangodianomiAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaRangoDiaNomi(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosRangoDiaNomi.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosRangoDiaNomi.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosRangoDiaNomi,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualRangoDiaNomiItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarRangoDiaNomiParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralRangoDiaNomiActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingRangoDiaNomi(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralRangoDiaNomi.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(RangoDiaNomi rangodianomiAux:this.rangodianomiLogic.getRangoDiaNomis()) {
				
						if(sTipoSeleccionar.equals(RangoDiaNomiConstantesFunciones.LABEL_FECHAINICIO)) {
							existe=true;
							rangodianomiAux.setfecha_inicio(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(RangoDiaNomiConstantesFunciones.LABEL_FECHAFIN)) {
							existe=true;
							rangodianomiAux.setfecha_fin(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(RangoDiaNomiConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							rangodianomiAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(RangoDiaNomi rangodianomiAux:rangodianomis) {
					
						if(sTipoSeleccionar.equals(RangoDiaNomiConstantesFunciones.LABEL_FECHAINICIO)) {
							existe=true;
							rangodianomiAux.setfecha_inicio(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(RangoDiaNomiConstantesFunciones.LABEL_FECHAFIN)) {
							existe=true;
							rangodianomiAux.setfecha_fin(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(RangoDiaNomiConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							rangodianomiAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaRangoDiaNomi(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesRangoDiaNomiActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingRangoDiaNomi(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioRangoDiaNomi=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesRangoDiaNomi.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormRangoDiaNomi.jComboBoxTiposAccionesFormularioRangoDiaNomi.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteRangoDiaNomi) {				
					conSplash=true;//false;										
					
					//this.startProcessRangoDiaNomi(conSplash);
				
					this.generarReporteRangoDiaNomisSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesRangoDiaNomi.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormRangoDiaNomi.jComboBoxTiposAccionesFormularioRangoDiaNomi.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoRangoDiaNomisSeleccionados();
				//this.jComboBoxTiposAccionesRangoDiaNomi.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoRangoDiaNomisSeleccionados(false);
				//this.jComboBoxTiposAccionesRangoDiaNomi.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoRangoDiaNomisSeleccionados(true);
				//this.jComboBoxTiposAccionesRangoDiaNomi.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessRangoDiaNomi();
				
				this.exportarRangoDiaNomisSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesRangoDiaNomi.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormRangoDiaNomi.jComboBoxTiposAccionesFormularioRangoDiaNomi.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionRangoDiaNomis();
				//this.importarRangoDiaNomis();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesRangoDiaNomi.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormRangoDiaNomi.jComboBoxTiposAccionesFormularioRangoDiaNomi.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessRangoDiaNomi();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelRangoDiaNomisSeleccionados();
				//this.jComboBoxTiposAccionesRangoDiaNomi.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Rango Dia Nomi", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessRangoDiaNomi();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoRangoDiaNomi)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyRangoDiaNomi(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Rango Dia Nomi",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesRangoDiaNomi.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormRangoDiaNomi.jComboBoxTiposAccionesFormularioRangoDiaNomi.setSelectedIndex(0);					
				}	
			} 			
			else if(RangoDiaNomiBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteRangoDiaNomi) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessRangoDiaNomi(conSplash);
					
						//this.actualizarParametrosGeneralRangoDiaNomi();
						
						this.generarReporteProcesoAccionRangoDiaNomisSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesRangoDiaNomi.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormRangoDiaNomi.jComboBoxTiposAccionesFormularioRangoDiaNomi.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(RangoDiaNomiBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Rango Dia NomiS SELECCIONADOS?", "MANTENIMIENTO DE Rango Dia Nomi", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessRangoDiaNomi();
				
						this.actualizarParametrosGeneralRangoDiaNomi();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.rangodianomiReturnGeneral=rangodianomiLogic.procesarAccionRangoDiaNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.rangodianomiLogic.getRangoDiaNomis(),this.rangodianomiParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarRangoDiaNomiReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesRangoDiaNomi.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormRangoDiaNomi.jComboBoxTiposAccionesFormularioRangoDiaNomi.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralRangoDiaNomi();
					
					RangoDiaNomiBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarRangoDiaNomiReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesRangoDiaNomi.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormRangoDiaNomi.jComboBoxTiposAccionesFormularioRangoDiaNomi.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessRangoDiaNomi(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesRangoDiaNomiActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessRangoDiaNomi();
			
			if(this.jInternalFrameDetalleFormRangoDiaNomi==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<RangoDiaNomi> rangodianomisSeleccionados=new ArrayList<RangoDiaNomi>();		
			RangoDiaNomi rangodianomi=new RangoDiaNomi();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingRangoDiaNomi(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesRangoDiaNomi.getSelectedItem();
			
			
			
			
			rangodianomisSeleccionados=this.getRangoDiaNomisSeleccionados(true);
			//this.sTipoAccion;
			
			if(rangodianomisSeleccionados.size()==1) {
				for(RangoDiaNomi rangodianomiAux:rangodianomisSeleccionados) {
					rangodianomi=rangodianomiAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessRangoDiaNomi();
			
      		//this.finishProcessRangoDiaNomi(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarRangoDiaNomiReturnGeneral() throws Exception {
		if(this.rangodianomiReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.rangodianomiReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.rangodianomiReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.rangodianomiReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.rangodianomiReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.rangodianomiReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingRangoDiaNomi(false);
		}
		
		if(this.rangodianomiReturnGeneral.getConRetornoLista() || this.rangodianomiReturnGeneral.getConRetornoObjeto()) {
			if(this.rangodianomiReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.rangodianomiLogic.setRangoDiaNomis(this.rangodianomiReturnGeneral.getRangoDiaNomis());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.rangodianomiReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.rangodianomiLogic.setRangoDiaNomi(this.rangodianomiReturnGeneral.getRangoDiaNomi());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingRangoDiaNomi(false);
		}
	}
	
	public void actualizarParametrosGeneralRangoDiaNomi() throws Exception {
		
		
	}
	
	public ArrayList<RangoDiaNomi> getRangoDiaNomisSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<RangoDiaNomi> rangodianomisSeleccionados=new ArrayList<RangoDiaNomi>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioRangoDiaNomi) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(RangoDiaNomi rangodianomiAux:rangodianomiLogic.getRangoDiaNomis()) {
					if(rangodianomiAux.getIsSelected()) {
						rangodianomisSeleccionados.add(rangodianomiAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(RangoDiaNomi rangodianomiAux:this.rangodianomis) {
					if(rangodianomiAux.getIsSelected()) {
						rangodianomisSeleccionados.add(rangodianomiAux);				
					}
				}
			}
			
			if(rangodianomisSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						rangodianomisSeleccionados.addAll(this.rangodianomiLogic.getRangoDiaNomis());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						rangodianomisSeleccionados.addAll(this.rangodianomis);				
					}
				}
			}
		} else {
			rangodianomisSeleccionados.add(this.rangodianomi);
		}
		
		return rangodianomisSeleccionados;
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
	
	public void generarReporteRangoDiaNomisSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalRangoDiaNomisSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoRangoDiaNomisSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoRangoDiaNomisSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoRangoDiaNomisSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Rango Dia Nomi",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesRangoDiaNomisSeleccionados() throws Exception {
		ArrayList<RangoDiaNomi> rangodianomisSeleccionados=new ArrayList<RangoDiaNomi>();		
		
		rangodianomisSeleccionados=this.getRangoDiaNomisSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteRangoDiaNomis("Todos",rangodianomisSeleccionados);
		
	}	
	
	public void generarReporteNormalRangoDiaNomisSeleccionados() throws Exception {
		ArrayList<RangoDiaNomi> rangodianomisSeleccionados=new ArrayList<RangoDiaNomi>();		
		
		rangodianomisSeleccionados=this.getRangoDiaNomisSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteRangoDiaNomis("Todos",rangodianomisSeleccionados);
	}		
	
	public void generarReporteProcesoAccionRangoDiaNomisSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<RangoDiaNomi> rangodianomisSeleccionados=new ArrayList<RangoDiaNomi>();
		
		rangodianomisSeleccionados=this.getRangoDiaNomisSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteRangoDiaNomis("Todos",rangodianomisSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoRangoDiaNomisSeleccionados() throws Exception {
		ArrayList<RangoDiaNomi> rangodianomisSeleccionados=new ArrayList<RangoDiaNomi>();		
		
		
		this.abrirInicializarFrameReporteDinamicoRangoDiaNomi();
		
		
		rangodianomisSeleccionados=this.getRangoDiaNomisSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoRangoDiaNomi();
		
		
		//this.generarReporteRangoDiaNomis("Todos",rangodianomisSeleccionados ,rangodianomiImplementable,rangodianomiImplementableHome);
	}
	
	public void mostrarImportacionRangoDiaNomis() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionRangoDiaNomi();
		
		this.abrirFrameImportacionRangoDiaNomi();		
		
			
		//this.generarReporteRangoDiaNomis("Todos",rangodianomisSeleccionados ,rangodianomiImplementable,rangodianomiImplementableHome);
	}
	
	public void importarRangoDiaNomis() throws Exception {		
	
	}
	
	public void exportarRangoDiaNomisSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelRangoDiaNomisSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoRangoDiaNomisSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlRangoDiaNomisSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Rango Dia Nomi",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoRangoDiaNomisSeleccionados() throws Exception {
		ArrayList<RangoDiaNomi> rangodianomisSeleccionados=new ArrayList<RangoDiaNomi>();		
		
		rangodianomisSeleccionados=this.getRangoDiaNomisSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"rangodianomi."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarRangoDiaNomi(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(RangoDiaNomi rangodianomiAux:rangodianomisSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarRangoDiaNomi(rangodianomiAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//rangodianomiAux.setsDetalleGeneralEntityReporte(rangodianomiAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.rangodianomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Rango Dia Nomi",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarRangoDiaNomi(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=RangoDiaNomiConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RangoDiaNomiConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RangoDiaNomiConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RangoDiaNomiConstantesFunciones.LABEL_FECHAINICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RangoDiaNomiConstantesFunciones.LABEL_FECHAFIN;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RangoDiaNomiConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarRangoDiaNomi(RangoDiaNomi rangodianomi,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=rangodianomi.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=rangodianomi.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=rangodianomi.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=rangodianomi.getfecha_inicio().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=rangodianomi.getfecha_fin().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=rangodianomi.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelRangoDiaNomisSeleccionados() throws Exception {
		ArrayList<RangoDiaNomi> rangodianomisSeleccionados=new ArrayList<RangoDiaNomi>();		
		
		rangodianomisSeleccionados=this.getRangoDiaNomisSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"rangodianomi.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("RangoDiaNomis");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelRangoDiaNomi(row);				
				iRow++;
			}				
			
			for(RangoDiaNomi rangodianomiAux:rangodianomisSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelRangoDiaNomi(rangodianomiAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.rangodianomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Rango Dia Nomi",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlRangoDiaNomisSeleccionados() throws Exception {
		ArrayList<RangoDiaNomi> rangodianomisSeleccionados=new ArrayList<RangoDiaNomi>();		
		
		rangodianomisSeleccionados=this.getRangoDiaNomisSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"rangodianomi.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("rangodianomis");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("rangodianomi");
			//elementRoot.appendChild(element);
		
			for(RangoDiaNomi rangodianomiAux:rangodianomisSeleccionados) {
				element = document.createElement("rangodianomi");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlRangoDiaNomi(rangodianomiAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.rangodianomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Rango Dia Nomi",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelRangoDiaNomi(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(RangoDiaNomiConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(RangoDiaNomiConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(RangoDiaNomiConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(RangoDiaNomiConstantesFunciones.LABEL_FECHAINICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(RangoDiaNomiConstantesFunciones.LABEL_FECHAFIN);
		cell = row.createCell(iColumn++);cell.setCellValue(RangoDiaNomiConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelRangoDiaNomi(RangoDiaNomi rangodianomi,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(rangodianomi.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(rangodianomi.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(rangodianomi.getfecha_inicio());
		cell = row.createCell(iColumn++);cell.setCellValue(rangodianomi.getfecha_fin());
		cell = row.createCell(iColumn++);cell.setCellValue(rangodianomi.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlRangoDiaNomi(RangoDiaNomi rangodianomi,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(RangoDiaNomiConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(rangodianomi.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(RangoDiaNomiConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(rangodianomi.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(RangoDiaNomiConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(rangodianomi.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementfecha_inicio = document.createElement(RangoDiaNomiConstantesFunciones.FECHAINICIO);
		elementfecha_inicio.appendChild(document.createTextNode(rangodianomi.getfecha_inicio().toString().trim()));
		element.appendChild(elementfecha_inicio);

		Element elementfecha_fin = document.createElement(RangoDiaNomiConstantesFunciones.FECHAFIN);
		elementfecha_fin.appendChild(document.createTextNode(rangodianomi.getfecha_fin().toString().trim()));
		element.appendChild(elementfecha_fin);

		Element elementdescripcion = document.createElement(RangoDiaNomiConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(rangodianomi.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoRangoDiaNomisSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<RangoDiaNomi> rangodianomisSeleccionados=new ArrayList<RangoDiaNomi>();
		
		rangodianomisSeleccionados=this.getRangoDiaNomisSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoRangoDiaNomi(rangodianomisSeleccionados);
		
		this.generarReporteRangoDiaNomis("Todos",rangodianomisSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoRangoDiaNomi(ArrayList<RangoDiaNomi> rangodianomisSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(RangoDiaNomi rangodianomiAux:rangodianomisSeleccionados) {
				rangodianomiAux.setsDetalleGeneralEntityReporte(rangodianomiAux.toString());
			
				if(sTipoSeleccionar.equals(RangoDiaNomiConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					rangodianomiAux.setsDescripcionGeneralEntityReporte1(rangodianomiAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(RangoDiaNomiConstantesFunciones.LABEL_FECHAINICIO)) {
					existe=true;
					rangodianomiAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(rangodianomiAux.getfecha_inicio()));
				}
				 else if(sTipoSeleccionar.equals(RangoDiaNomiConstantesFunciones.LABEL_FECHAFIN)) {
					existe=true;
					rangodianomiAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(rangodianomiAux.getfecha_fin()));
				}
				 else if(sTipoSeleccionar.equals(RangoDiaNomiConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					rangodianomiAux.setsDescripcionGeneralEntityReporte1(rangodianomiAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RangoDiaNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesRangoDiaNomi(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoRangoDiaNomi=true;
				this.isVisibilidadCeldaNuevoRelacionesRangoDiaNomi=true;
				this.isVisibilidadCeldaGuardarCambiosRangoDiaNomi=true;
			}
			
			this.isVisibilidadCeldaModificarRangoDiaNomi=false;
			this.isVisibilidadCeldaActualizarRangoDiaNomi=false;
			this.isVisibilidadCeldaEliminarRangoDiaNomi=false;
			this.isVisibilidadCeldaCancelarRangoDiaNomi=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRangoDiaNomi=true;
				} else {
					this.isVisibilidadCeldaGuardarRangoDiaNomi=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoRangoDiaNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesRangoDiaNomi=false;
			this.isVisibilidadCeldaGuardarCambiosRangoDiaNomi=false;
			this.isVisibilidadCeldaModificarRangoDiaNomi=false;
			this.isVisibilidadCeldaActualizarRangoDiaNomi=true;
			this.isVisibilidadCeldaEliminarRangoDiaNomi=false;
			this.isVisibilidadCeldaCancelarRangoDiaNomi=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRangoDiaNomi=true;
				} else {
					this.isVisibilidadCeldaGuardarRangoDiaNomi=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoRangoDiaNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesRangoDiaNomi=false;
			this.isVisibilidadCeldaGuardarCambiosRangoDiaNomi=false;
			this.isVisibilidadCeldaModificarRangoDiaNomi=false;
			this.isVisibilidadCeldaActualizarRangoDiaNomi=true;
			this.isVisibilidadCeldaEliminarRangoDiaNomi=true;
			this.isVisibilidadCeldaCancelarRangoDiaNomi=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRangoDiaNomi=true;
				} else {
					this.isVisibilidadCeldaGuardarRangoDiaNomi=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoRangoDiaNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesRangoDiaNomi=false;
			this.isVisibilidadCeldaGuardarCambiosRangoDiaNomi=false;
			this.isVisibilidadCeldaModificarRangoDiaNomi=false;
			this.isVisibilidadCeldaActualizarRangoDiaNomi=true;
			this.isVisibilidadCeldaEliminarRangoDiaNomi=false;
			this.isVisibilidadCeldaCancelarRangoDiaNomi=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRangoDiaNomi=false;
				} else {
					this.isVisibilidadCeldaGuardarRangoDiaNomi=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoRangoDiaNomi=true;
			this.isVisibilidadCeldaNuevoRelacionesRangoDiaNomi=true;
			this.isVisibilidadCeldaGuardarCambiosRangoDiaNomi=true;
			this.isVisibilidadCeldaModificarRangoDiaNomi=false;
			this.isVisibilidadCeldaActualizarRangoDiaNomi=false;
			this.isVisibilidadCeldaEliminarRangoDiaNomi=false;
			this.isVisibilidadCeldaCancelarRangoDiaNomi=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRangoDiaNomi=true;
				} else {
					this.isVisibilidadCeldaGuardarRangoDiaNomi=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoRangoDiaNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesRangoDiaNomi=false;
			this.isVisibilidadCeldaGuardarCambiosRangoDiaNomi=false;
			this.isVisibilidadCeldaActualizarRangoDiaNomi=false;
			this.isVisibilidadCeldaEliminarRangoDiaNomi=false;
			this.isVisibilidadCeldaCancelarRangoDiaNomi=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRangoDiaNomi=false;
				} else {
					this.isVisibilidadCeldaGuardarRangoDiaNomi=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoRangoDiaNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesRangoDiaNomi=false;
			this.isVisibilidadCeldaGuardarCambiosRangoDiaNomi=false;
			this.isVisibilidadCeldaModificarRangoDiaNomi=true;
			this.isVisibilidadCeldaActualizarRangoDiaNomi=false;
			this.isVisibilidadCeldaEliminarRangoDiaNomi=false;
			this.isVisibilidadCeldaCancelarRangoDiaNomi=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRangoDiaNomi=false;
				} else {
					this.isVisibilidadCeldaGuardarRangoDiaNomi=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(RangoDiaNomiJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoRangoDiaNomi=true;
			this.isVisibilidadCeldaNuevoRelacionesRangoDiaNomi=true;
			this.isVisibilidadCeldaGuardarCambiosRangoDiaNomi=true;
		} else {
			this.actualizarEstadoPanelsRangoDiaNomi(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarRangoDiaNomi=false;
			//this.isVisibilidadCeldaVerFormRangoDiaNomi=false;
			this.isVisibilidadCeldaDuplicarRangoDiaNomi=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!rangodianomiSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesRangoDiaNomi=false;
		} else {
			this.isVisibilidadCeldaNuevoRangoDiaNomi=false;
			this.isVisibilidadCeldaGuardarCambiosRangoDiaNomi=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(rangodianomiSessionBean.getEsGuardarRelacionado()) {
			if(!rangodianomiSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesRangoDiaNomi=false;												
			}
			
			this.jButtonCerrarRangoDiaNomi.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesRangoDiaNomi=false;
		}
		
		if(!this.permiteMantenimiento(this.rangodianomi)) {
			this.isVisibilidadCeldaActualizarRangoDiaNomi=false;
			this.isVisibilidadCeldaEliminarRangoDiaNomi=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesRangoDiaNomi() {
	}
	
	public void actualizarEstadoPanelsRangoDiaNomi(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionRangoDiaNomi!=null) {
				this.jScrollPanelDatosEdicionRangoDiaNomi.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRangoDiaNomi!=null) {
				this.jTabbedPaneBusquedasRangoDiaNomi.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosRangoDiaNomi!=null) {
				this.jScrollPanelDatosRangoDiaNomi.setVisible(true);
			}
			
			if(this.jPanelPaginacionRangoDiaNomi!=null) {
				this.jPanelPaginacionRangoDiaNomi.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesRangoDiaNomi!=null) {
				this.jPanelParametrosReportesRangoDiaNomi.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionRangoDiaNomi!=null) {
				this.jScrollPanelDatosEdicionRangoDiaNomi.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRangoDiaNomi!=null) {
				this.jTabbedPaneBusquedasRangoDiaNomi.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosRangoDiaNomi!=null) {
				this.jScrollPanelDatosRangoDiaNomi.setVisible(false);
			}
			
			if(this.jPanelPaginacionRangoDiaNomi!=null) {
				this.jPanelPaginacionRangoDiaNomi.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesRangoDiaNomi!=null) {
				this.jPanelParametrosReportesRangoDiaNomi.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionRangoDiaNomi!=null) {
				this.jScrollPanelDatosEdicionRangoDiaNomi.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRangoDiaNomi!=null) {
				this.jTabbedPaneBusquedasRangoDiaNomi.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosRangoDiaNomi!=null) {
				this.jScrollPanelDatosRangoDiaNomi.setVisible(false);
			}
			
			if(this.jPanelPaginacionRangoDiaNomi!=null) {
				this.jPanelPaginacionRangoDiaNomi.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesRangoDiaNomi!=null) {
				this.jPanelParametrosReportesRangoDiaNomi.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionRangoDiaNomi!=null) {
				this.jScrollPanelDatosEdicionRangoDiaNomi.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRangoDiaNomi!=null) {
				this.jTabbedPaneBusquedasRangoDiaNomi.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosRangoDiaNomi!=null) {
				this.jScrollPanelDatosRangoDiaNomi.setVisible(false);
			}
			
			if(this.jPanelPaginacionRangoDiaNomi!=null) {
				this.jPanelPaginacionRangoDiaNomi.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesRangoDiaNomi!=null) {
				this.jPanelParametrosReportesRangoDiaNomi.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionRangoDiaNomi!=null) {
				this.jScrollPanelDatosEdicionRangoDiaNomi.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRangoDiaNomi!=null) {
				this.jTabbedPaneBusquedasRangoDiaNomi.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosRangoDiaNomi!=null) {
				this.jScrollPanelDatosRangoDiaNomi.setVisible(true);
			}
			
			if(this.jPanelPaginacionRangoDiaNomi!=null) {
				this.jPanelPaginacionRangoDiaNomi.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesRangoDiaNomi!=null) {
				this.jPanelParametrosReportesRangoDiaNomi.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionRangoDiaNomi!=null) {
				this.jScrollPanelDatosEdicionRangoDiaNomi.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRangoDiaNomi!=null) {
				this.jTabbedPaneBusquedasRangoDiaNomi.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosRangoDiaNomi!=null) {
				this.jScrollPanelDatosRangoDiaNomi.setVisible(true);
			}
			
			if(this.jPanelPaginacionRangoDiaNomi!=null) {
				this.jPanelPaginacionRangoDiaNomi.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesRangoDiaNomi!=null) {
				this.jPanelParametrosReportesRangoDiaNomi.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionRangoDiaNomi!=null) {
				this.jScrollPanelDatosEdicionRangoDiaNomi.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRangoDiaNomi!=null) {
				this.jTabbedPaneBusquedasRangoDiaNomi.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosRangoDiaNomi!=null) {
				this.jScrollPanelDatosRangoDiaNomi.setVisible(true);
			}
			
			if(this.jPanelPaginacionRangoDiaNomi!=null) {
				this.jPanelPaginacionRangoDiaNomi.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesRangoDiaNomi!=null) {
				this.jPanelParametrosReportesRangoDiaNomi.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.rangodianomiSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasRangoDiaNomi!=null) {
					this.jTabbedPaneBusquedasRangoDiaNomi.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesRangoDiaNomi!=null) {
				this.jPanelParametrosReportesRangoDiaNomi.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.rangodianomiSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRangoDiaNomi!=null) {
				this.jTabbedPaneBusquedasRangoDiaNomi.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesRangoDiaNomi!=null) {
				this.jPanelParametrosReportesRangoDiaNomi.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//RangoDiaNomiSessionBean rangodianomiSessionBean=new RangoDiaNomiSessionBean();
		
		if(this.rangodianomiSessionBean==null) {
			this.rangodianomiSessionBean=new RangoDiaNomiSessionBean();
		}
		
		this.rangodianomiSessionBean.setsUltimaBusquedaRangoDiaNomi(this.getsAccionBusqueda());
		this.rangodianomiSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.rangodianomiSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			rangodianomiSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//RangoDiaNomiSessionBean rangodianomiSessionBean=new RangoDiaNomiSessionBean();
		
		if(this.rangodianomiSessionBean==null) {
			this.rangodianomiSessionBean=new RangoDiaNomiSessionBean();
		}
		
		if(this.rangodianomiSessionBean.getsUltimaBusquedaRangoDiaNomi()!=null&&!this.rangodianomiSessionBean.getsUltimaBusquedaRangoDiaNomi().equals("")) {
			this.setsAccionBusqueda(rangodianomiSessionBean.getsUltimaBusquedaRangoDiaNomi());
			this.setiNumeroPaginacion(rangodianomiSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(rangodianomiSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(rangodianomiSessionBean.getid_empresa());
				rangodianomiSessionBean.setid_empresa(-1L);
			}
		}
		
		this.rangodianomiSessionBean.setsUltimaBusquedaRangoDiaNomi("");
		this.rangodianomiSessionBean.setiNumeroPaginacion(RangoDiaNomiConstantesFunciones.INUMEROPAGINACION);
		this.rangodianomiSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaRangoDiaNomi(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioRangoDiaNomi() {
		this.updateBorderResaltarBusquedasFormularioRangoDiaNomi();
		this.updateVisibilidadBusquedasFormularioRangoDiaNomi();
		this.updateHabilitarBusquedasFormularioRangoDiaNomi();
	}
	
	public void updateBorderResaltarBusquedasFormularioRangoDiaNomi() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasRangoDiaNomi.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioRangoDiaNomi() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasRangoDiaNomi.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioRangoDiaNomi() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasRangoDiaNomi.getComponents().length>0) {
	
		}	
	
	}
	
	
	public void resaltarPanelBusquedaRangoDiaNomi(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		

		if(existe) {
			
			this.jTtoolBarRangoDiaNomi.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioRangoDiaNomi() throws Exception {

		if(this.jInternalFrameDetalleFormRangoDiaNomi==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioRangoDiaNomi();
		this.updateVisibilidadResaltarControlesFormularioRangoDiaNomi();
		this.updateHabilitarResaltarControlesFormularioRangoDiaNomi();
		
	}
	
	public void updateBorderResaltarControlesFormularioRangoDiaNomi() throws Exception {
		if(this.jInternalFrameDetalleFormRangoDiaNomi==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.rangodianomiConstantesFunciones.resaltaridRangoDiaNomi!=null && this.jInternalFrameDetalleFormRangoDiaNomi!=null) {this.jInternalFrameDetalleFormRangoDiaNomi.jLabelidRangoDiaNomi.setBorder(this.rangodianomiConstantesFunciones.resaltaridRangoDiaNomi);}
		if(this.rangodianomiConstantesFunciones.resaltarid_empresaRangoDiaNomi!=null && this.jInternalFrameDetalleFormRangoDiaNomi!=null) {this.jInternalFrameDetalleFormRangoDiaNomi.jComboBoxid_empresaRangoDiaNomi.setBorder(this.rangodianomiConstantesFunciones.resaltarid_empresaRangoDiaNomi);}
		if(this.rangodianomiConstantesFunciones.resaltarfecha_inicioRangoDiaNomi!=null && this.jInternalFrameDetalleFormRangoDiaNomi!=null) {this.jInternalFrameDetalleFormRangoDiaNomi.jDateChooserfecha_inicioRangoDiaNomi.setBorder(this.rangodianomiConstantesFunciones.resaltarfecha_inicioRangoDiaNomi);}
		if(this.rangodianomiConstantesFunciones.resaltarfecha_finRangoDiaNomi!=null && this.jInternalFrameDetalleFormRangoDiaNomi!=null) {this.jInternalFrameDetalleFormRangoDiaNomi.jDateChooserfecha_finRangoDiaNomi.setBorder(this.rangodianomiConstantesFunciones.resaltarfecha_finRangoDiaNomi);}
		if(this.rangodianomiConstantesFunciones.resaltardescripcionRangoDiaNomi!=null && this.jInternalFrameDetalleFormRangoDiaNomi!=null) {this.jInternalFrameDetalleFormRangoDiaNomi.jTextAreadescripcionRangoDiaNomi.setBorder(this.rangodianomiConstantesFunciones.resaltardescripcionRangoDiaNomi);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioRangoDiaNomi() throws Exception {		
		if(this.jInternalFrameDetalleFormRangoDiaNomi==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormRangoDiaNomi!=null) {
	
		//this.jInternalFrameDetalleFormRangoDiaNomi.jLabelidRangoDiaNomi.setVisible(this.rangodianomiConstantesFunciones.mostraridRangoDiaNomi);
		this.jInternalFrameDetalleFormRangoDiaNomi.jPanelidRangoDiaNomi.setVisible(this.rangodianomiConstantesFunciones.mostraridRangoDiaNomi);
		//this.jInternalFrameDetalleFormRangoDiaNomi.jComboBoxid_empresaRangoDiaNomi.setVisible(this.rangodianomiConstantesFunciones.mostrarid_empresaRangoDiaNomi);
		this.jInternalFrameDetalleFormRangoDiaNomi.jPanelid_empresaRangoDiaNomi.setVisible(this.rangodianomiConstantesFunciones.mostrarid_empresaRangoDiaNomi);
		//this.jInternalFrameDetalleFormRangoDiaNomi.jDateChooserfecha_inicioRangoDiaNomi.setVisible(this.rangodianomiConstantesFunciones.mostrarfecha_inicioRangoDiaNomi);
		this.jInternalFrameDetalleFormRangoDiaNomi.jPanelfecha_inicioRangoDiaNomi.setVisible(this.rangodianomiConstantesFunciones.mostrarfecha_inicioRangoDiaNomi);
		//this.jInternalFrameDetalleFormRangoDiaNomi.jDateChooserfecha_finRangoDiaNomi.setVisible(this.rangodianomiConstantesFunciones.mostrarfecha_finRangoDiaNomi);
		this.jInternalFrameDetalleFormRangoDiaNomi.jPanelfecha_finRangoDiaNomi.setVisible(this.rangodianomiConstantesFunciones.mostrarfecha_finRangoDiaNomi);
		//this.jInternalFrameDetalleFormRangoDiaNomi.jTextAreadescripcionRangoDiaNomi.setVisible(this.rangodianomiConstantesFunciones.mostrardescripcionRangoDiaNomi);
		this.jInternalFrameDetalleFormRangoDiaNomi.jPaneldescripcionRangoDiaNomi.setVisible(this.rangodianomiConstantesFunciones.mostrardescripcionRangoDiaNomi);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioRangoDiaNomi() throws Exception {
		if(this.jInternalFrameDetalleFormRangoDiaNomi==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormRangoDiaNomi!=null) {
	
		this.jInternalFrameDetalleFormRangoDiaNomi.jLabelidRangoDiaNomi.setEnabled(this.rangodianomiConstantesFunciones.activaridRangoDiaNomi);
		this.jInternalFrameDetalleFormRangoDiaNomi.jComboBoxid_empresaRangoDiaNomi.setEnabled(this.rangodianomiConstantesFunciones.activarid_empresaRangoDiaNomi);
		this.jInternalFrameDetalleFormRangoDiaNomi.jDateChooserfecha_inicioRangoDiaNomi.setEnabled(this.rangodianomiConstantesFunciones.activarfecha_inicioRangoDiaNomi);
		this.jInternalFrameDetalleFormRangoDiaNomi.jDateChooserfecha_finRangoDiaNomi.setEnabled(this.rangodianomiConstantesFunciones.activarfecha_finRangoDiaNomi);
		this.jInternalFrameDetalleFormRangoDiaNomi.jTextAreadescripcionRangoDiaNomi.setEnabled(this.rangodianomiConstantesFunciones.activardescripcionRangoDiaNomi);
		}
	}
	
		
}