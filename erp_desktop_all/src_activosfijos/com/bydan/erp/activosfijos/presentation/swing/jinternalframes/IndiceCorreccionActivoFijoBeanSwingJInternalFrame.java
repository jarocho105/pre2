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
package com.bydan.erp.activosfijos.presentation.swing.jinternalframes;




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

import com.bydan.erp.activosfijos.util.IndiceCorreccionActivoFijoConstantesFunciones;
import com.bydan.erp.activosfijos.util.IndiceCorreccionActivoFijoParameterReturnGeneral;
//import com.bydan.erp.activosfijos.util.IndiceCorreccionActivoFijoParameterGeneral;
//import com.bydan.erp.activosfijos.presentation.report.source.IndiceCorreccionActivoFijoBean;
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

import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.activosfijos.resources.reportes.AuxiliarReportes;


import com.bydan.erp.activosfijos.util.*;
import com.bydan.erp.activosfijos.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.activosfijos.business.entity.*;
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


import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;

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
public class IndiceCorreccionActivoFijoBeanSwingJInternalFrame extends IndiceCorreccionActivoFijoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(IndiceCorreccionActivoFijoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<IndiceCorreccionActivoFijo> indicecorreccionactivofijoValidator = new ClassValidator<IndiceCorreccionActivoFijo>(IndiceCorreccionActivoFijo.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public IndiceCorreccionActivoFijo indicecorreccionactivofijo;	
	public IndiceCorreccionActivoFijo indicecorreccionactivofijoAux;
	public IndiceCorreccionActivoFijo indicecorreccionactivofijoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public IndiceCorreccionActivoFijo indicecorreccionactivofijoTotales;
	public Long idIndiceCorreccionActivoFijoActual;
	public Long iIdNuevoIndiceCorreccionActivoFijo=0L;
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
	
	public Boolean isPermisoTodoIndiceCorreccionActivoFijo;
	public Boolean isPermisoNuevoIndiceCorreccionActivoFijo;
	public Boolean isPermisoActualizarIndiceCorreccionActivoFijo;
	public Boolean isPermisoActualizarOriginalIndiceCorreccionActivoFijo;
	public Boolean isPermisoEliminarIndiceCorreccionActivoFijo;
	public Boolean isPermisoGuardarCambiosIndiceCorreccionActivoFijo;
	public Boolean isPermisoConsultaIndiceCorreccionActivoFijo;
	public Boolean isPermisoBusquedaIndiceCorreccionActivoFijo;
	public Boolean isPermisoReporteIndiceCorreccionActivoFijo;
	public Boolean isPermisoPaginacionMedioIndiceCorreccionActivoFijo;
	public Boolean isPermisoPaginacionAltoIndiceCorreccionActivoFijo;
	public Boolean isPermisoPaginacionTodoIndiceCorreccionActivoFijo;
	public Boolean isPermisoCopiarIndiceCorreccionActivoFijo;
	public Boolean isPermisoVerFormIndiceCorreccionActivoFijo;
	public Boolean isPermisoDuplicarIndiceCorreccionActivoFijo;
	public Boolean isPermisoOrdenIndiceCorreccionActivoFijo;
	
	
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
	
	public IndiceCorreccionActivoFijoParameterReturnGeneral indicecorreccionactivofijoReturnGeneral;
	public IndiceCorreccionActivoFijoParameterReturnGeneral indicecorreccionactivofijoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoIndiceCorreccionActivoFijo=false;
	public Boolean esParaAccionDesdeFormularioIndiceCorreccionActivoFijo=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected IndiceCorreccionActivoFijoSessionBeanAdditional indicecorreccionactivofijoSessionBeanAdditional=null;
	
	public IndiceCorreccionActivoFijoSessionBeanAdditional getIndiceCorreccionActivoFijoSessionBeanAdditional() {
		return this.indicecorreccionactivofijoSessionBeanAdditional;
	}
	
	public void setIndiceCorreccionActivoFijoSessionBeanAdditional(IndiceCorreccionActivoFijoSessionBeanAdditional indicecorreccionactivofijoSessionBeanAdditional) {
		try {
			this.indicecorreccionactivofijoSessionBeanAdditional=indicecorreccionactivofijoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected IndiceCorreccionActivoFijoBeanSwingJInternalFrameAdditional indicecorreccionactivofijoBeanSwingJInternalFrameAdditional=null;
	//public class IndiceCorreccionActivoFijoBeanSwingJInternalFrame
	
	public IndiceCorreccionActivoFijoBeanSwingJInternalFrameAdditional getIndiceCorreccionActivoFijoBeanSwingJInternalFrameAdditional() {
		return this.indicecorreccionactivofijoBeanSwingJInternalFrameAdditional;
	}
	
	public void setIndiceCorreccionActivoFijoBeanSwingJInternalFrameAdditional(IndiceCorreccionActivoFijoBeanSwingJInternalFrameAdditional indicecorreccionactivofijoBeanSwingJInternalFrameAdditional) {
		try {
			this.indicecorreccionactivofijoBeanSwingJInternalFrameAdditional=indicecorreccionactivofijoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public IndiceCorreccionActivoFijoLogic indicecorreccionactivofijoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public IndiceCorreccionActivoFijo indicecorreccionactivofijoBean;
	public IndiceCorreccionActivoFijoConstantesFunciones indicecorreccionactivofijoConstantesFunciones;
	//public IndiceCorreccionActivoFijoParameterReturnGeneral indicecorreccionactivofijoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<IndiceCorreccionActivoFijo> indicecorreccionactivofijos;	
	//public List<IndiceCorreccionActivoFijo> indicecorreccionactivofijosEliminados;
	//public List<IndiceCorreccionActivoFijo> indicecorreccionactivofijosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoIndiceCorreccionActivoFijo=false;
	public Boolean isVisibilidadCeldaDuplicarIndiceCorreccionActivoFijo=true;
	public Boolean isVisibilidadCeldaCopiarIndiceCorreccionActivoFijo=true;
	public Boolean isVisibilidadCeldaVerFormIndiceCorreccionActivoFijo=true;
	public Boolean isVisibilidadCeldaOrdenIndiceCorreccionActivoFijo=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesIndiceCorreccionActivoFijo=false;
	public Boolean isVisibilidadCeldaModificarIndiceCorreccionActivoFijo=false;
	public Boolean isVisibilidadCeldaActualizarIndiceCorreccionActivoFijo=false;
	public Boolean isVisibilidadCeldaEliminarIndiceCorreccionActivoFijo=false;
	public Boolean isVisibilidadCeldaCancelarIndiceCorreccionActivoFijo=false;
	public Boolean isVisibilidadCeldaGuardarIndiceCorreccionActivoFijo=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosIndiceCorreccionActivoFijo=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoIndiceCorreccionActivoFijo() {
		return this.iIdNuevoIndiceCorreccionActivoFijo;
	}

	public void setiIdNuevoIndiceCorreccionActivoFijo(Long iIdNuevoIndiceCorreccionActivoFijo) {
		this.iIdNuevoIndiceCorreccionActivoFijo = iIdNuevoIndiceCorreccionActivoFijo;
	}
	
	public Long getidIndiceCorreccionActivoFijoActual() {
		return this.idIndiceCorreccionActivoFijoActual;
	}

	public void setidIndiceCorreccionActivoFijoActual(Long idIndiceCorreccionActivoFijoActual) {
		this.idIndiceCorreccionActivoFijoActual = idIndiceCorreccionActivoFijoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public IndiceCorreccionActivoFijo getindicecorreccionactivofijo() {
		return this.indicecorreccionactivofijo;
	}

	public void setindicecorreccionactivofijo(IndiceCorreccionActivoFijo indicecorreccionactivofijo) {
		this.indicecorreccionactivofijo = indicecorreccionactivofijo;
	}
	
	public IndiceCorreccionActivoFijo getindicecorreccionactivofijoAux() {
		return this.indicecorreccionactivofijoAux;
	}

	public void setindicecorreccionactivofijoAux(IndiceCorreccionActivoFijo indicecorreccionactivofijoAux) {
		this.indicecorreccionactivofijoAux = indicecorreccionactivofijoAux;
	}				
	
	public IndiceCorreccionActivoFijo getindicecorreccionactivofijoAnterior() {
		return this.indicecorreccionactivofijoAnterior;
	}

	public void setindicecorreccionactivofijoAnterior(IndiceCorreccionActivoFijo indicecorreccionactivofijoAnterior) {
		this.indicecorreccionactivofijoAnterior = indicecorreccionactivofijoAnterior;
	}	
	
	public IndiceCorreccionActivoFijo getindicecorreccionactivofijoTotales() {
		return this.indicecorreccionactivofijoTotales;
	}

	public void setindicecorreccionactivofijoTotales(IndiceCorreccionActivoFijo indicecorreccionactivofijoTotales) {
		this.indicecorreccionactivofijoTotales = indicecorreccionactivofijoTotales;
	}	
	
	public IndiceCorreccionActivoFijo getindicecorreccionactivofijoBean() {
		return this.indicecorreccionactivofijoBean;
	}

	public void setindicecorreccionactivofijoBean(IndiceCorreccionActivoFijo indicecorreccionactivofijoBean) {
		this.indicecorreccionactivofijoBean = indicecorreccionactivofijoBean;
	}	
	
	public IndiceCorreccionActivoFijoParameterReturnGeneral getindicecorreccionactivofijoReturnGeneral() {
		return this.indicecorreccionactivofijoReturnGeneral;
	}

	public void setindicecorreccionactivofijoReturnGeneral(IndiceCorreccionActivoFijoParameterReturnGeneral indicecorreccionactivofijoReturnGeneral) {
		this.indicecorreccionactivofijoReturnGeneral = indicecorreccionactivofijoReturnGeneral;
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
	
	
	public IndiceCorreccionActivoFijoLogic getIndiceCorreccionActivoFijoLogic()	{		
		return indicecorreccionactivofijoLogic;
	}

	public void setIndiceCorreccionActivoFijoLogic(IndiceCorreccionActivoFijoLogic indicecorreccionactivofijoLogic) {
		this.indicecorreccionactivofijoLogic = indicecorreccionactivofijoLogic;
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
	
	public Boolean getIsEsNuevoIndiceCorreccionActivoFijo() {
		return isEsNuevoIndiceCorreccionActivoFijo;
	}

	public void setIsEsNuevoIndiceCorreccionActivoFijo(Boolean isEsNuevoIndiceCorreccionActivoFijo) {
		this.isEsNuevoIndiceCorreccionActivoFijo = isEsNuevoIndiceCorreccionActivoFijo;
	}

	public Boolean getEsParaAccionDesdeFormularioIndiceCorreccionActivoFijo() {
		return esParaAccionDesdeFormularioIndiceCorreccionActivoFijo;
	}
	
	public void setEsParaAccionDesdeFormularioIndiceCorreccionActivoFijo(Boolean esParaAccionDesdeFormularioIndiceCorreccionActivoFijo) {
		this.esParaAccionDesdeFormularioIndiceCorreccionActivoFijo = esParaAccionDesdeFormularioIndiceCorreccionActivoFijo;
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

			if(this.indicecorreccionactivofijoSessionBean==null) {
				this.indicecorreccionactivofijoSessionBean=new IndiceCorreccionActivoFijoSessionBean();
			}

			if(!this.indicecorreccionactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(indicecorreccionactivofijoSessionBean.getlidEmpresaActual());
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

					if(this.indicecorreccionactivofijo!=null) {
						this.indicecorreccionactivofijo.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo!=null) {
						this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jComboBoxid_empresaIndiceCorreccionActivoFijo.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaIndiceCorreccionActivoFijo.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo!=null) {
						if(this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jComboBoxid_empresaIndiceCorreccionActivoFijo.getItemCount()>0) {
							this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jComboBoxid_empresaIndiceCorreccionActivoFijo.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaIndiceCorreccionActivoFijoGenerico)throws Exception
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
				jComboBoxid_empresaIndiceCorreccionActivoFijoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaIndiceCorreccionActivoFijoGenerico!=null && jComboBoxid_empresaIndiceCorreccionActivoFijoGenerico.getItemCount()>0) {
					jComboBoxid_empresaIndiceCorreccionActivoFijoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(IndiceCorreccionActivoFijo indicecorreccionactivofijo,JComboBox jComboBoxid_empresaIndiceCorreccionActivoFijoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaIndiceCorreccionActivoFijoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jComboBoxid_empresaIndiceCorreccionActivoFijo.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaIndiceCorreccionActivoFijoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				indicecorreccionactivofijo.setid_empresa(empresaAux.getId());
				indicecorreccionactivofijo.setempresa_descripcion(IndiceCorreccionActivoFijoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				indicecorreccionactivofijo.setEmpresa(empresaAux);			}
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

					if(!IndiceCorreccionActivoFijoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo!=null) { 
							this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jComboBoxid_empresaIndiceCorreccionActivoFijo.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jComboBoxid_empresaIndiceCorreccionActivoFijo.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo!=null) { 
					}

					if(!IndiceCorreccionActivoFijoJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo!=null) {
							this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jComboBoxid_empresaIndiceCorreccionActivoFijo.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo!=null) {
							this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jComboBoxid_empresaIndiceCorreccionActivoFijo.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesIndiceCorreccionActivoFijo() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			IndiceCorreccionActivoFijoConstantesFunciones.refrescarForeignKeysDescripcionesIndiceCorreccionActivoFijo(this.indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			IndiceCorreccionActivoFijoConstantesFunciones.refrescarForeignKeysDescripcionesIndiceCorreccionActivoFijo(this.indicecorreccionactivofijos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//indicecorreccionactivofijoLogic.setIndiceCorreccionActivoFijos(this.indicecorreccionactivofijos);
			indicecorreccionactivofijoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public IndiceCorreccionActivoFijoParameterReturnGeneral getIndiceCorreccionActivoFijoParameterGeneral() {
		return this.indicecorreccionactivofijoParameterGeneral;
	}
	
	public void setIndiceCorreccionActivoFijoParameterGeneral(IndiceCorreccionActivoFijoParameterReturnGeneral indicecorreccionactivofijoParameterGeneral) {
		this.indicecorreccionactivofijoParameterGeneral = indicecorreccionactivofijoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoIndiceCorreccionActivoFijo() {
		return isPermisoTodoIndiceCorreccionActivoFijo;
	}

	public void setIsPermisoTodoIndiceCorreccionActivoFijo(Boolean isPermisoTodoIndiceCorreccionActivoFijo) {
		this.isPermisoTodoIndiceCorreccionActivoFijo = isPermisoTodoIndiceCorreccionActivoFijo;
	}

	public Boolean getIsPermisoNuevoIndiceCorreccionActivoFijo() {
		return isPermisoNuevoIndiceCorreccionActivoFijo;
	}

	public void setIsPermisoNuevoIndiceCorreccionActivoFijo(Boolean isPermisoNuevoIndiceCorreccionActivoFijo) {
		this.isPermisoNuevoIndiceCorreccionActivoFijo = isPermisoNuevoIndiceCorreccionActivoFijo;
	}

	public Boolean getIsPermisoActualizarIndiceCorreccionActivoFijo() {
		return isPermisoActualizarIndiceCorreccionActivoFijo;
	}

	public void setIsPermisoActualizarIndiceCorreccionActivoFijo(Boolean isPermisoActualizarIndiceCorreccionActivoFijo) {
		this.isPermisoActualizarIndiceCorreccionActivoFijo = isPermisoActualizarIndiceCorreccionActivoFijo;
	}

	public Boolean getIsPermisoEliminarIndiceCorreccionActivoFijo() {
		return isPermisoEliminarIndiceCorreccionActivoFijo;
	}

	public void setIsPermisoEliminarIndiceCorreccionActivoFijo(Boolean isPermisoEliminarIndiceCorreccionActivoFijo) {
		this.isPermisoEliminarIndiceCorreccionActivoFijo = isPermisoEliminarIndiceCorreccionActivoFijo;
	}

	public Boolean getIsPermisoGuardarCambiosIndiceCorreccionActivoFijo() {
		return isPermisoGuardarCambiosIndiceCorreccionActivoFijo;
	}

	public void setIsPermisoGuardarCambiosIndiceCorreccionActivoFijo(Boolean isPermisoGuardarCambiosIndiceCorreccionActivoFijo) {
		this.isPermisoGuardarCambiosIndiceCorreccionActivoFijo = isPermisoGuardarCambiosIndiceCorreccionActivoFijo;
	}
	
	public Boolean getIsPermisoConsultaIndiceCorreccionActivoFijo() {
		return isPermisoConsultaIndiceCorreccionActivoFijo;
	}

	public void setIsPermisoConsultaIndiceCorreccionActivoFijo(Boolean isPermisoConsultaIndiceCorreccionActivoFijo) {
		this.isPermisoConsultaIndiceCorreccionActivoFijo = isPermisoConsultaIndiceCorreccionActivoFijo;
	}

	public Boolean getIsPermisoBusquedaIndiceCorreccionActivoFijo() {
		return isPermisoBusquedaIndiceCorreccionActivoFijo;
	}

	public void setIsPermisoBusquedaIndiceCorreccionActivoFijo(Boolean isPermisoBusquedaIndiceCorreccionActivoFijo) {
		this.isPermisoBusquedaIndiceCorreccionActivoFijo = isPermisoBusquedaIndiceCorreccionActivoFijo;
	}

	public Boolean getIsPermisoReporteIndiceCorreccionActivoFijo() {
		return isPermisoReporteIndiceCorreccionActivoFijo;
	}

	public void setIsPermisoReporteIndiceCorreccionActivoFijo(Boolean isPermisoReporteIndiceCorreccionActivoFijo) {
		this.isPermisoReporteIndiceCorreccionActivoFijo = isPermisoReporteIndiceCorreccionActivoFijo;
	}
	
	public Boolean getIsPermisoPaginacionMedioIndiceCorreccionActivoFijo() {
		return isPermisoPaginacionMedioIndiceCorreccionActivoFijo;
	}

	public void setIsPermisoPaginacionMedioIndiceCorreccionActivoFijo(Boolean isPermisoPaginacionMedioIndiceCorreccionActivoFijo) {
		this.isPermisoPaginacionMedioIndiceCorreccionActivoFijo = isPermisoPaginacionMedioIndiceCorreccionActivoFijo;
	}
	
	public Boolean getIsPermisoPaginacionTodoIndiceCorreccionActivoFijo() {
		return isPermisoPaginacionTodoIndiceCorreccionActivoFijo;
	}

	public void setIsPermisoPaginacionTodoIndiceCorreccionActivoFijo(Boolean isPermisoPaginacionTodoIndiceCorreccionActivoFijo) {
		this.isPermisoPaginacionTodoIndiceCorreccionActivoFijo = isPermisoPaginacionTodoIndiceCorreccionActivoFijo;
	}
	
	public Boolean getIsPermisoPaginacionAltoIndiceCorreccionActivoFijo() {
		return isPermisoPaginacionAltoIndiceCorreccionActivoFijo;
	}

	public void setIsPermisoPaginacionAltoIndiceCorreccionActivoFijo(Boolean isPermisoPaginacionAltoIndiceCorreccionActivoFijo) {
		this.isPermisoPaginacionAltoIndiceCorreccionActivoFijo = isPermisoPaginacionAltoIndiceCorreccionActivoFijo;
	}
	
	public Boolean getIsPermisoCopiarIndiceCorreccionActivoFijo() {
		return isPermisoCopiarIndiceCorreccionActivoFijo;
	}

	public void setIsPermisoCopiarIndiceCorreccionActivoFijo(Boolean isPermisoCopiarIndiceCorreccionActivoFijo) {
		this.isPermisoCopiarIndiceCorreccionActivoFijo = isPermisoCopiarIndiceCorreccionActivoFijo;
	}
	
	public Boolean getIsPermisoVerFormIndiceCorreccionActivoFijo() {
		return isPermisoVerFormIndiceCorreccionActivoFijo;
	}

	public void setIsPermisoVerFormIndiceCorreccionActivoFijo(Boolean isPermisoVerFormIndiceCorreccionActivoFijo) {
		this.isPermisoVerFormIndiceCorreccionActivoFijo = isPermisoVerFormIndiceCorreccionActivoFijo;
	}
	
	public Boolean getIsPermisoDuplicarIndiceCorreccionActivoFijo() {
		return isPermisoDuplicarIndiceCorreccionActivoFijo;
	}

	public void setIsPermisoDuplicarIndiceCorreccionActivoFijo(Boolean isPermisoDuplicarIndiceCorreccionActivoFijo) {
		this.isPermisoDuplicarIndiceCorreccionActivoFijo = isPermisoDuplicarIndiceCorreccionActivoFijo;
	}
	
	public Boolean getIsPermisoOrdenIndiceCorreccionActivoFijo() {
		return isPermisoOrdenIndiceCorreccionActivoFijo;
	}

	public void setIsPermisoOrdenIndiceCorreccionActivoFijo(Boolean isPermisoOrdenIndiceCorreccionActivoFijo) {
		this.isPermisoOrdenIndiceCorreccionActivoFijo = isPermisoOrdenIndiceCorreccionActivoFijo;
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
	
	public Boolean getIsVisibilidadCeldaNuevoIndiceCorreccionActivoFijo() {
		return isVisibilidadCeldaNuevoIndiceCorreccionActivoFijo;
	}

	public void setIsVisibilidadCeldaNuevoIndiceCorreccionActivoFijo(Boolean isVisibilidadCeldaNuevoIndiceCorreccionActivoFijo) {
		this.isVisibilidadCeldaNuevoIndiceCorreccionActivoFijo = isVisibilidadCeldaNuevoIndiceCorreccionActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarIndiceCorreccionActivoFijo() {
		return isVisibilidadCeldaDuplicarIndiceCorreccionActivoFijo;
	}

	public void setIsVisibilidadCeldaDuplicarIndiceCorreccionActivoFijo(Boolean isVisibilidadCeldaDuplicarIndiceCorreccionActivoFijo) {
		this.isVisibilidadCeldaDuplicarIndiceCorreccionActivoFijo = isVisibilidadCeldaDuplicarIndiceCorreccionActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarIndiceCorreccionActivoFijo() {
		return isVisibilidadCeldaCopiarIndiceCorreccionActivoFijo;
	}

	public void setIsVisibilidadCeldaCopiarIndiceCorreccionActivoFijo(Boolean isVisibilidadCeldaCopiarIndiceCorreccionActivoFijo) {
		this.isVisibilidadCeldaCopiarIndiceCorreccionActivoFijo = isVisibilidadCeldaCopiarIndiceCorreccionActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormIndiceCorreccionActivoFijo() {
		return isVisibilidadCeldaVerFormIndiceCorreccionActivoFijo;
	}

	public void setIsVisibilidadCeldaVerFormIndiceCorreccionActivoFijo(Boolean isVisibilidadCeldaVerFormIndiceCorreccionActivoFijo) {
		this.isVisibilidadCeldaVerFormIndiceCorreccionActivoFijo = isVisibilidadCeldaVerFormIndiceCorreccionActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenIndiceCorreccionActivoFijo() {
		return isVisibilidadCeldaOrdenIndiceCorreccionActivoFijo;
	}

	public void setIsVisibilidadCeldaOrdenIndiceCorreccionActivoFijo(Boolean isVisibilidadCeldaOrdenIndiceCorreccionActivoFijo) {
		this.isVisibilidadCeldaOrdenIndiceCorreccionActivoFijo = isVisibilidadCeldaOrdenIndiceCorreccionActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesIndiceCorreccionActivoFijo() {
		return isVisibilidadCeldaNuevoRelacionesIndiceCorreccionActivoFijo;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesIndiceCorreccionActivoFijo(Boolean isVisibilidadCeldaNuevoRelacionesIndiceCorreccionActivoFijo) {
		this.isVisibilidadCeldaNuevoRelacionesIndiceCorreccionActivoFijo = isVisibilidadCeldaNuevoRelacionesIndiceCorreccionActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaModificarIndiceCorreccionActivoFijo() {
		return isVisibilidadCeldaModificarIndiceCorreccionActivoFijo;
	}

	public void setIsVisibilidadCeldaModificarIndiceCorreccionActivoFijo(Boolean isVisibilidadCeldaModificarIndiceCorreccionActivoFijo) {
		this.isVisibilidadCeldaModificarIndiceCorreccionActivoFijo = isVisibilidadCeldaModificarIndiceCorreccionActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarIndiceCorreccionActivoFijo() {
		return isVisibilidadCeldaActualizarIndiceCorreccionActivoFijo;
	}

	public void setIsVisibilidadCeldaActualizarIndiceCorreccionActivoFijo(Boolean isVisibilidadCeldaActualizarIndiceCorreccionActivoFijo) {
		this.isVisibilidadCeldaActualizarIndiceCorreccionActivoFijo = isVisibilidadCeldaActualizarIndiceCorreccionActivoFijo;
	}

	public Boolean getIsVisibilidadCeldaEliminarIndiceCorreccionActivoFijo() {
		return isVisibilidadCeldaEliminarIndiceCorreccionActivoFijo;
	}

	public void setIsVisibilidadCeldaEliminarIndiceCorreccionActivoFijo(Boolean isVisibilidadCeldaEliminarIndiceCorreccionActivoFijo) {
		this.isVisibilidadCeldaEliminarIndiceCorreccionActivoFijo = isVisibilidadCeldaEliminarIndiceCorreccionActivoFijo;
	}

	public Boolean getIsVisibilidadCeldaCancelarIndiceCorreccionActivoFijo() {
		return isVisibilidadCeldaCancelarIndiceCorreccionActivoFijo;
	}

	public void setIsVisibilidadCeldaCancelarIndiceCorreccionActivoFijo(Boolean isVisibilidadCeldaCancelarIndiceCorreccionActivoFijo) {
		this.isVisibilidadCeldaCancelarIndiceCorreccionActivoFijo = isVisibilidadCeldaCancelarIndiceCorreccionActivoFijo;
	}

	public Boolean getIsVisibilidadCeldaGuardarIndiceCorreccionActivoFijo() {
		return isVisibilidadCeldaGuardarIndiceCorreccionActivoFijo;
	}

	public void setIsVisibilidadCeldaGuardarIndiceCorreccionActivoFijo(Boolean isVisibilidadCeldaGuardarIndiceCorreccionActivoFijo) {
		this.isVisibilidadCeldaGuardarIndiceCorreccionActivoFijo = isVisibilidadCeldaGuardarIndiceCorreccionActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosIndiceCorreccionActivoFijo() {
		return isVisibilidadCeldaGuardarCambiosIndiceCorreccionActivoFijo;
	}

	public void setIsVisibilidadCeldaGuardarCambiosIndiceCorreccionActivoFijo(Boolean isVisibilidadCeldaGuardarCambiosIndiceCorreccionActivoFijo) {
		this.isVisibilidadCeldaGuardarCambiosIndiceCorreccionActivoFijo = isVisibilidadCeldaGuardarCambiosIndiceCorreccionActivoFijo;
	}
		
	public IndiceCorreccionActivoFijoSessionBean getindicecorreccionactivofijoSessionBean() {
		return this.indicecorreccionactivofijoSessionBean;
	}
	
	public void setindicecorreccionactivofijoSessionBean(IndiceCorreccionActivoFijoSessionBean indicecorreccionactivofijoSessionBean) {
		this.indicecorreccionactivofijoSessionBean=indicecorreccionactivofijoSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysIndiceCorreccionActivoFijo(IndiceCorreccionActivoFijo indicecorreccionactivofijo)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(indicecorreccionactivofijo,null);
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
	
	public void bugActualizarReferenciaActual(IndiceCorreccionActivoFijo indicecorreccionactivofijo,IndiceCorreccionActivoFijo indicecorreccionactivofijoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalIndiceCorreccionActivoFijo(indicecorreccionactivofijo);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		indicecorreccionactivofijoAux.setId(indicecorreccionactivofijo.getId());
		indicecorreccionactivofijoAux.setVersionRow(indicecorreccionactivofijo.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessIndiceCorreccionActivoFijo();
		
			int intSelectedRow = this.jTableDatosIndiceCorreccionActivoFijo.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.indicecorreccionactivofijo =(IndiceCorreccionActivoFijo) this.indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijos().toArray()[this.jTableDatosIndiceCorreccionActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.indicecorreccionactivofijo =(IndiceCorreccionActivoFijo) this.indicecorreccionactivofijos.toArray()[this.jTableDatosIndiceCorreccionActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(IndiceCorreccionActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualIndiceCorreccionActivoFijo(this.indicecorreccionactivofijo,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysIndiceCorreccionActivoFijo(this.indicecorreccionactivofijo);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = indicecorreccionactivofijoValidator.getInvalidValues(this.indicecorreccionactivofijo);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			indicecorreccionactivofijoLogic.setDatosCliente(datosCliente);
			indicecorreccionactivofijoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				indicecorreccionactivofijoAux=new  IndiceCorreccionActivoFijo();
				
				indicecorreccionactivofijoAux.setIsNew(true);
				indicecorreccionactivofijoAux.setIsChanged(true);
				
				indicecorreccionactivofijoAux.setIndiceCorreccionActivoFijoOriginal(this.indicecorreccionactivofijo);
				
				indicecorreccionactivofijoAux.setId(this.indicecorreccionactivofijo.getId());	
				indicecorreccionactivofijoAux.setVersionRow(this.indicecorreccionactivofijo.getVersionRow());	
				indicecorreccionactivofijoAux.setid_empresa(this.indicecorreccionactivofijo.getid_empresa());	
				indicecorreccionactivofijoAux.setanio(this.indicecorreccionactivofijo.getanio());	
				indicecorreccionactivofijoAux.setvalor(this.indicecorreccionactivofijo.getvalor());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.indicecorreccionactivofijoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.indicecorreccionactivofijoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(indicecorreccionactivofijoAux,indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(indicecorreccionactivofijoAux,indicecorreccionactivofijos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.indicecorreccionactivofijoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.indicecorreccionactivofijoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						indicecorreccionactivofijoLogic.saveIndiceCorreccionActivoFijos();//WithConnection
						//indicecorreccionactivofijoLogic.getSetVersionRowIndiceCorreccionActivoFijos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.indicecorreccionactivofijo,indicecorreccionactivofijoAux);
					
					this.refrescarForeignKeysDescripcionesIndiceCorreccionActivoFijo();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.indicecorreccionactivofijoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.indicecorreccionactivofijoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								indicecorreccionactivofijoLogic.saveIndiceCorreccionActivoFijoRelaciones(indicecorreccionactivofijoAux);//WithConnection
								//indicecorreccionactivofijoLogic.getSetVersionRowIndiceCorreccionActivoFijos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.indicecorreccionactivofijo,indicecorreccionactivofijoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.indicecorreccionactivofijoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.indicecorreccionactivofijoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(indicecorreccionactivofijoAux,indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(indicecorreccionactivofijoAux,indicecorreccionactivofijos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.indicecorreccionactivofijo,indicecorreccionactivofijoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				indicecorreccionactivofijoAux=new  IndiceCorreccionActivoFijo();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.indicecorreccionactivofijoSessionBean.getEsGuardarRelacionado() 
					|| (this.indicecorreccionactivofijoSessionBean.getEsGuardarRelacionado() && this.indicecorreccionactivofijo.getId()>=0)) {
						
					indicecorreccionactivofijoAux.setIsNew(false);
				}
				
				indicecorreccionactivofijoAux.setIsDeleted(false);
			
				indicecorreccionactivofijoAux.setId(this.indicecorreccionactivofijo.getId());	
				indicecorreccionactivofijoAux.setVersionRow(this.indicecorreccionactivofijo.getVersionRow());	
				indicecorreccionactivofijoAux.setid_empresa(this.indicecorreccionactivofijo.getid_empresa());	
				indicecorreccionactivofijoAux.setanio(this.indicecorreccionactivofijo.getanio());	
				indicecorreccionactivofijoAux.setvalor(this.indicecorreccionactivofijo.getvalor());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(indicecorreccionactivofijoAux,indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(indicecorreccionactivofijoAux,indicecorreccionactivofijos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.indicecorreccionactivofijoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.indicecorreccionactivofijoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						indicecorreccionactivofijoLogic.saveIndiceCorreccionActivoFijos();//WithConnection
						//indicecorreccionactivofijoLogic.getSetVersionRowIndiceCorreccionActivoFijos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.indicecorreccionactivofijo,indicecorreccionactivofijoAux);
					
					this.refrescarForeignKeysDescripcionesIndiceCorreccionActivoFijo();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.indicecorreccionactivofijoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.indicecorreccionactivofijoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								indicecorreccionactivofijoLogic.saveIndiceCorreccionActivoFijoRelaciones(indicecorreccionactivofijoAux);//WithConnection
								//indicecorreccionactivofijoLogic.getSetVersionRowIndiceCorreccionActivoFijos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.indicecorreccionactivofijo,indicecorreccionactivofijoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.indicecorreccionactivofijoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.indicecorreccionactivofijoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(indicecorreccionactivofijoAux,indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(indicecorreccionactivofijoAux,indicecorreccionactivofijos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.indicecorreccionactivofijo,indicecorreccionactivofijoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				indicecorreccionactivofijoAux=new  IndiceCorreccionActivoFijo();
				
				indicecorreccionactivofijoAux.setIsNew(false);
				indicecorreccionactivofijoAux.setIsChanged(false);
				
				indicecorreccionactivofijoAux.setIsDeleted(true);
				
				indicecorreccionactivofijoAux.setId(this.indicecorreccionactivofijo.getId());	
				indicecorreccionactivofijoAux.setVersionRow(this.indicecorreccionactivofijo.getVersionRow());	
				indicecorreccionactivofijoAux.setid_empresa(this.indicecorreccionactivofijo.getid_empresa());	
				indicecorreccionactivofijoAux.setanio(this.indicecorreccionactivofijo.getanio());	
				indicecorreccionactivofijoAux.setvalor(this.indicecorreccionactivofijo.getvalor());	
				
				if(this.indicecorreccionactivofijoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.indicecorreccionactivofijoAux.getId()>=0) {	
						this.indicecorreccionactivofijosEliminados.add(indicecorreccionactivofijoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(indicecorreccionactivofijoAux,indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(indicecorreccionactivofijoAux,indicecorreccionactivofijos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.indicecorreccionactivofijoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.indicecorreccionactivofijoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						indicecorreccionactivofijoLogic.saveIndiceCorreccionActivoFijos();//WithConnection
						//indicecorreccionactivofijoLogic.getSetVersionRowIndiceCorreccionActivoFijos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.indicecorreccionactivofijoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.indicecorreccionactivofijoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								indicecorreccionactivofijoLogic.saveIndiceCorreccionActivoFijoRelaciones(indicecorreccionactivofijoAux);//WithConnection
								//indicecorreccionactivofijoLogic.getSetVersionRowIndiceCorreccionActivoFijos();//WithConnection
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
							if(this.indicecorreccionactivofijoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.indicecorreccionactivofijoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(indicecorreccionactivofijoAux,indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(indicecorreccionactivofijoAux,indicecorreccionactivofijos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijos().addAll(this.indicecorreccionactivofijosEliminados);
					
					indicecorreccionactivofijoLogic.saveIndiceCorreccionActivoFijos();//WithConnection
					//indicecorreccionactivofijoLogic.getSetVersionRowIndiceCorreccionActivoFijos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesIndiceCorreccionActivoFijo();
				
				this.indicecorreccionactivofijosEliminados= new ArrayList<IndiceCorreccionActivoFijo>();		
			}
			
			if(this.indicecorreccionactivofijoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.indicecorreccionactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Indice Correccion Activo Fijo GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Indice Correccion Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.indicecorreccionactivofijo=indicecorreccionactivofijoAux;
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
      		//this.finishProcessIndiceCorreccionActivoFijo();
      	}
		
	}	
	
	public void actualizarRelaciones(IndiceCorreccionActivoFijo indicecorreccionactivofijoLocal) throws Exception {
		
		if(this.indicecorreccionactivofijoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(IndiceCorreccionActivoFijo indicecorreccionactivofijoLocal) throws Exception {	
		if(this.indicecorreccionactivofijoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				indicecorreccionactivofijoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarIndiceCorreccionActivoFijoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosIndiceCorreccionActivoFijo.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.indicecorreccionactivofijo =(IndiceCorreccionActivoFijo) this.indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijos().toArray()[this.jTableDatosIndiceCorreccionActivoFijo.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.indicecorreccionactivofijo =(IndiceCorreccionActivoFijo) this.indicecorreccionactivofijos.toArray()[this.jTableDatosIndiceCorreccionActivoFijo.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = indicecorreccionactivofijoValidator.getInvalidValues(this.indicecorreccionactivofijo);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(IndiceCorreccionActivoFijo indicecorreccionactivofijo,List<IndiceCorreccionActivoFijo> indicecorreccionactivofijos) throws Exception {
		try	{		
			IndiceCorreccionActivoFijoConstantesFunciones.actualizarLista(indicecorreccionactivofijo,indicecorreccionactivofijos,this.indicecorreccionactivofijoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(IndiceCorreccionActivoFijo indicecorreccionactivofijo,List<IndiceCorreccionActivoFijo> indicecorreccionactivofijos) throws Exception {
		try	{			
			IndiceCorreccionActivoFijoConstantesFunciones.actualizarSelectedLista(indicecorreccionactivofijo,indicecorreccionactivofijos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<IndiceCorreccionActivoFijo> indicecorreccionactivofijosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				indicecorreccionactivofijosLocal=this.indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				indicecorreccionactivofijosLocal=this.indicecorreccionactivofijos;
			}
			//ARCHITECTURE
		
			for(IndiceCorreccionActivoFijo indicecorreccionactivofijoLocal:indicecorreccionactivofijosLocal) {
				if(this.permiteMantenimiento(indicecorreccionactivofijoLocal) && indicecorreccionactivofijoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+IndiceCorreccionActivoFijoConstantesFunciones.getIndiceCorreccionActivoFijoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(IndiceCorreccionActivoFijoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jLabelid_empresaIndiceCorreccionActivoFijo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(IndiceCorreccionActivoFijoConstantesFunciones.ANIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jLabelanioIndiceCorreccionActivoFijo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(IndiceCorreccionActivoFijoConstantesFunciones.VALOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jLabelvalorIndiceCorreccionActivoFijo,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jLabelid_empresaIndiceCorreccionActivoFijo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jLabelanioIndiceCorreccionActivoFijo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jLabelvalorIndiceCorreccionActivoFijo,"");
		
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
		this.iIdNuevoIndiceCorreccionActivoFijo--;	
		
		
		this.indicecorreccionactivofijoAux=new IndiceCorreccionActivoFijo();
		
		this.indicecorreccionactivofijoAux.setId(this.iIdNuevoIndiceCorreccionActivoFijo);
		this.indicecorreccionactivofijoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijos().add(this.indicecorreccionactivofijoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.indicecorreccionactivofijos.add(this.indicecorreccionactivofijoAux);
		}
		//ARCHITECTURE
		
		this.indicecorreccionactivofijo=this.indicecorreccionactivofijoAux;
		
		if(IndiceCorreccionActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioIndiceCorreccionActivoFijo(this.indicecorreccionactivofijo);
			this.setVariablesObjetoActualToFormularioForeignKeyIndiceCorreccionActivoFijo(this.indicecorreccionactivofijo);
		}
				
		//this.setDefaultControlesIndiceCorreccionActivoFijo();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyIndiceCorreccionActivoFijo();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyIndiceCorreccionActivoFijo();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyIndiceCorreccionActivoFijo();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualIndiceCorreccionActivoFijo(this.indicecorreccionactivofijoBean,this.indicecorreccionactivofijo,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysIndiceCorreccionActivoFijo(this.indicecorreccionactivofijo);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.indicecorreccionactivofijoSessionBean.getConGuardarRelaciones()) {
			classes=IndiceCorreccionActivoFijoConstantesFunciones.getClassesRelationshipsOfIndiceCorreccionActivoFijo(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.indicecorreccionactivofijoReturnGeneral=indicecorreccionactivofijoLogic.procesarEventosIndiceCorreccionActivoFijosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijos(),this.indicecorreccionactivofijo,this.indicecorreccionactivofijoParameterGeneral,this.isEsNuevoIndiceCorreccionActivoFijo,classes);//this.indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijo()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanIndiceCorreccionActivoFijo(this.indicecorreccionactivofijoReturnGeneral,this.indicecorreccionactivofijoBean,false);
		
		if(this.indicecorreccionactivofijoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyIndiceCorreccionActivoFijo(this.indicecorreccionactivofijoReturnGeneral.getIndiceCorreccionActivoFijo());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioIndiceCorreccionActivoFijo(this.indicecorreccionactivofijoReturnGeneral.getIndiceCorreccionActivoFijo());
		}
		
		if(this.indicecorreccionactivofijoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioIndiceCorreccionActivoFijo(this.indicecorreccionactivofijoReturnGeneral.getIndiceCorreccionActivoFijo(),classes);//this.indicecorreccionactivofijoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualIndiceCorreccionActivoFijo(this.indicecorreccionactivofijo,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyIndiceCorreccionActivoFijo();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyIndiceCorreccionActivoFijo();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			IndiceCorreccionActivoFijoBeanSwingJInternalFrameAdditional.RecargarFormIndiceCorreccionActivoFijo(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingIndiceCorreccionActivoFijo(false);
						
			if(indicecorreccionactivofijoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(IndiceCorreccionActivoFijoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualIndiceCorreccionActivoFijo();
			}
			
			this.actualizarVisualTableDatosIndiceCorreccionActivoFijo();
			
			this.jTableDatosIndiceCorreccionActivoFijo.setRowSelectionInterval(this.getIndiceNuevoIndiceCorreccionActivoFijo(), this.getIndiceNuevoIndiceCorreccionActivoFijo());
			
			this.seleccionarFilaTablaIndiceCorreccionActivoFijoActual();
						
			this.actualizarEstadoCeldasBotonesIndiceCorreccionActivoFijo("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesIndiceCorreccionActivoFijo(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jTextFieldanioIndiceCorreccionActivoFijo.setEnabled(isHabilitar && this.indicecorreccionactivofijoConstantesFunciones.activaranioIndiceCorreccionActivoFijo);
		this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jTextFieldvalorIndiceCorreccionActivoFijo.setEnabled(isHabilitar && this.indicecorreccionactivofijoConstantesFunciones.activarvalorIndiceCorreccionActivoFijo);	
		//
		this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jComboBoxid_empresaIndiceCorreccionActivoFijo.setEnabled(isHabilitar && this.indicecorreccionactivofijoConstantesFunciones.activarid_empresaIndiceCorreccionActivoFijo);
	};
	
	public void setDefaultControlesIndiceCorreccionActivoFijo() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoIndiceCorreccionActivoFijo(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.indicecorreccionactivofijoSessionBean.setConGuardarRelaciones(true);			
			this.indicecorreccionactivofijoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jTabbedPaneRelacionesIndiceCorreccionActivoFijo.setVisible(true);
			
					
		} else {
			//this.indicecorreccionactivofijoSessionBean.setConGuardarRelaciones(false);			
			this.indicecorreccionactivofijoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jTabbedPaneRelacionesIndiceCorreccionActivoFijo.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoIndiceCorreccionActivoFijo() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(IndiceCorreccionActivoFijo indicecorreccionactivofijoAux:this.indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijos()) {
				if(indicecorreccionactivofijoAux.getId().equals(this.iIdNuevoIndiceCorreccionActivoFijo)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(IndiceCorreccionActivoFijo indicecorreccionactivofijoAux:this.indicecorreccionactivofijos) {
				if(indicecorreccionactivofijoAux.getId().equals(this.iIdNuevoIndiceCorreccionActivoFijo)) {
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
	
	public int getIndiceActualIndiceCorreccionActivoFijo(IndiceCorreccionActivoFijo indicecorreccionactivofijo,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(IndiceCorreccionActivoFijo indicecorreccionactivofijoAux:this.indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijos()) {
				if(indicecorreccionactivofijoAux.getId().equals(indicecorreccionactivofijo.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(IndiceCorreccionActivoFijo indicecorreccionactivofijoAux:this.indicecorreccionactivofijos) {
				if(indicecorreccionactivofijoAux.getId().equals(indicecorreccionactivofijo.getId())) {
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
	
	public void setCamposBaseDesdeOriginalIndiceCorreccionActivoFijo(IndiceCorreccionActivoFijo indicecorreccionactivofijoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(IndiceCorreccionActivoFijo indicecorreccionactivofijoAux:this.indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijos()) {
				if(indicecorreccionactivofijoAux.getIndiceCorreccionActivoFijoOriginal().getId().equals(indicecorreccionactivofijoOriginal.getId())) {
					existe=true;
					indicecorreccionactivofijoOriginal.setId(indicecorreccionactivofijoAux.getId());
					indicecorreccionactivofijoOriginal.setVersionRow(indicecorreccionactivofijoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(IndiceCorreccionActivoFijo indicecorreccionactivofijoAux:this.indicecorreccionactivofijos) {
				if(indicecorreccionactivofijoAux.getIndiceCorreccionActivoFijoOriginal().getId().equals(indicecorreccionactivofijoOriginal.getId())) {
					existe=true;
					indicecorreccionactivofijoOriginal.setId(indicecorreccionactivofijoAux.getId());
					indicecorreccionactivofijoOriginal.setVersionRow(indicecorreccionactivofijoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosIndiceCorreccionActivoFijo(Boolean esParaCancelar) throws Exception {
		indicecorreccionactivofijosAux=new ArrayList<IndiceCorreccionActivoFijo>();
		indicecorreccionactivofijoAux=new IndiceCorreccionActivoFijo();
		
		if(!this.indicecorreccionactivofijoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(IndiceCorreccionActivoFijo indicecorreccionactivofijoAux:this.indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijos()) {
					if(indicecorreccionactivofijoAux.getId()<0) {
						indicecorreccionactivofijosAux.add(indicecorreccionactivofijoAux);
					}		
				}
				this.iIdNuevoIndiceCorreccionActivoFijo=0L;
				this.indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijos().removeAll(indicecorreccionactivofijosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(IndiceCorreccionActivoFijo indicecorreccionactivofijoAux:this.indicecorreccionactivofijos) {
					if(indicecorreccionactivofijoAux.getId()<0) {
						indicecorreccionactivofijosAux.add(indicecorreccionactivofijoAux);
					}		
				}
				this.iIdNuevoIndiceCorreccionActivoFijo=0L;
				this.indicecorreccionactivofijos.removeAll(indicecorreccionactivofijosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoIndiceCorreccionActivoFijo 
					&& this.indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijos().size()>0
					) {
					indicecorreccionactivofijoAux=this.indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijos().get(this.indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijos().size() - 1);
				
					if(indicecorreccionactivofijoAux.getId()<0) {
						this.indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijos().remove(indicecorreccionactivofijoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoIndiceCorreccionActivoFijo && this.indicecorreccionactivofijos.size()>0) {
					indicecorreccionactivofijoAux=this.indicecorreccionactivofijos.get(this.indicecorreccionactivofijos.size() - 1);
				
					if(indicecorreccionactivofijoAux.getId()<0) {
						this.indicecorreccionactivofijos.remove(indicecorreccionactivofijoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoIndiceCorreccionActivoFijo(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(indicecorreccionactivofijo.getId()<0) {
				this.indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijos().remove(this.indicecorreccionactivofijo);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(indicecorreccionactivofijo.getId()<0) {
				this.indicecorreccionactivofijos.remove(this.indicecorreccionactivofijo);
			}
		}			
	}
	
	public void setEstadosInicialesIndiceCorreccionActivoFijo(List<IndiceCorreccionActivoFijo> indicecorreccionactivofijosAux) throws Exception {
		IndiceCorreccionActivoFijoConstantesFunciones.setEstadosInicialesIndiceCorreccionActivoFijo(indicecorreccionactivofijosAux);
	}
	
	public void setEstadosInicialesIndiceCorreccionActivoFijo(IndiceCorreccionActivoFijo indicecorreccionactivofijoAux) throws Exception {
		IndiceCorreccionActivoFijoConstantesFunciones.setEstadosInicialesIndiceCorreccionActivoFijo(indicecorreccionactivofijoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarIndiceCorreccionActivoFijoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesIndiceCorreccionActivoFijo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarIndiceCorreccionActivoFijoActual()) {
				if(!this.isEsNuevoIndiceCorreccionActivoFijo) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesIndiceCorreccionActivoFijo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoIndiceCorreccionActivoFijo=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarIndiceCorreccionActivoFijoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Indice Correccion Activo Fijo ?", "MANTENIMIENTO DE Indice Correccion Activo Fijo", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesIndiceCorreccionActivoFijo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(IndiceCorreccionActivoFijo indicecorreccionactivofijo) throws Exception {
		IndiceCorreccionActivoFijoConstantesFunciones.seleccionarAsignar(this.indicecorreccionactivofijo,indicecorreccionactivofijo);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarIndiceCorreccionActivoFijo=this.isPermisoActualizarOriginalIndiceCorreccionActivoFijo;
			
			
			this.seleccionarAsignar(indicecorreccionactivofijo);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			IndiceCorreccionActivoFijoConstantesFunciones.quitarEspaciosIndiceCorreccionActivoFijo(this.indicecorreccionactivofijo,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesIndiceCorreccionActivoFijo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.indicecorreccionactivofijoSessionBean.setsFuncionBusquedaRapida(this.indicecorreccionactivofijoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoIndiceCorreccionActivoFijo) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosIndiceCorreccionActivoFijo(esParaCancelar);				
				this.cancelarNuevoIndiceCorreccionActivoFijo(esParaCancelar);								
			}
			
			this.indicecorreccionactivofijo=new IndiceCorreccionActivoFijo();
			
			this.inicializarIndiceCorreccionActivoFijo();
			
			this.actualizarEstadoCeldasBotonesIndiceCorreccionActivoFijo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarIndiceCorreccionActivoFijo() throws Exception {
		try {
			IndiceCorreccionActivoFijoConstantesFunciones.inicializarIndiceCorreccionActivoFijo(this.indicecorreccionactivofijo);
			
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
			FuncionesSwing.manageException(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteIndiceCorreccionActivoFijos(String sAccionBusqueda,List<IndiceCorreccionActivoFijo> indicecorreccionactivofijosParaReportes) throws Exception {
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
					sPathReporteFinal="IndiceCorreccionActivoFijo"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="IndiceCorreccionActivoFijoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("IndiceCorreccionActivoFijoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="IndiceCorreccionActivoFijo"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Indice Correccion Activo Fijos");		
		parameters.put("busquedapor", IndiceCorreccionActivoFijoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceIndiceCorreccionActivoFijo=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			IndiceCorreccionActivoFijoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			IndiceCorreccionActivoFijoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceIndiceCorreccionActivoFijo=new JRBeanArrayDataSource(IndiceCorreccionActivoFijoJInternalFrame.TraerIndiceCorreccionActivoFijoBeans(indicecorreccionactivofijosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceIndiceCorreccionActivoFijo);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+IndiceCorreccionActivoFijoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(IndiceCorreccionActivoFijoBean.TraerIndiceCorreccionActivoFijoBeans(indicecorreccionactivofijosParaReportes).toArray()));
							
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
				this.generarExcelReporteIndiceCorreccionActivoFijos(sAccionBusqueda,sTipoArchivoReporte,indicecorreccionactivofijosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalIndiceCorreccionActivoFijos(sAccionBusqueda,sTipoArchivoReporte,indicecorreccionactivofijosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoIndiceCorreccionActivoFijoActionPerformed(null);
					//this.generarExcelReporteIndiceCorreccionActivoFijos(sAccionBusqueda,sTipoArchivoReporte,indicecorreccionactivofijosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalIndiceCorreccionActivoFijos(sAccionBusqueda,sTipoArchivoReporte,indicecorreccionactivofijosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesIndiceCorreccionActivoFijos(sAccionBusqueda,sTipoArchivoReporte,indicecorreccionactivofijosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesIndiceCorreccionActivoFijos(sAccionBusqueda,sTipoArchivoReporte,indicecorreccionactivofijosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteIndiceCorreccionActivoFijos(String sAccionBusqueda,String sTipoArchivoReporte,List<IndiceCorreccionActivoFijo> indicecorreccionactivofijosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"indicecorreccionactivofijo";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("IndiceCorreccionActivoFijos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderIndiceCorreccionActivoFijo("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(IndiceCorreccionActivoFijo indicecorreccionactivofijo : indicecorreccionactivofijosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			IndiceCorreccionActivoFijoConstantesFunciones.generarExcelReporteDataIndiceCorreccionActivoFijo("NORMAL",row,workbook,indicecorreccionactivofijo,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.indicecorreccionactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Indice Correccion Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderIndiceCorreccionActivoFijo(String sTipo,Row row,Workbook workbook) {
		
		IndiceCorreccionActivoFijoConstantesFunciones.generarExcelReporteHeaderIndiceCorreccionActivoFijo(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalIndiceCorreccionActivoFijos(String sAccionBusqueda,String sTipoArchivoReporte,List<IndiceCorreccionActivoFijo> indicecorreccionactivofijosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"indicecorreccionactivofijo_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("IndiceCorreccionActivoFijos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(IndiceCorreccionActivoFijo indicecorreccionactivofijo : indicecorreccionactivofijosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(IndiceCorreccionActivoFijoConstantesFunciones.getIndiceCorreccionActivoFijoDescripcion(indicecorreccionactivofijo));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(IndiceCorreccionActivoFijoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(IndiceCorreccionActivoFijoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(indicecorreccionactivofijo.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(IndiceCorreccionActivoFijoConstantesFunciones.LABEL_ANIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(IndiceCorreccionActivoFijoConstantesFunciones.LABEL_ANIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(indicecorreccionactivofijo.getanio());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(IndiceCorreccionActivoFijoConstantesFunciones.LABEL_VALOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(IndiceCorreccionActivoFijoConstantesFunciones.LABEL_VALOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(indicecorreccionactivofijo.getvalor());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.indicecorreccionactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Indice Correccion Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesIndiceCorreccionActivoFijos(String sAccionBusqueda,String sTipoArchivoReporte,List<IndiceCorreccionActivoFijo> indicecorreccionactivofijosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<IndiceCorreccionActivoFijo> indicecorreccionactivofijosRespaldo=null;
		
		classes=IndiceCorreccionActivoFijoConstantesFunciones.getClassesRelationshipsOfIndiceCorreccionActivoFijo(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.indicecorreccionactivofijoLogic.setDatosCliente(this.datosCliente);
		this.indicecorreccionactivofijoLogic.setDatosDeep(this.datosDeep);
		this.indicecorreccionactivofijoLogic.setIsConDeep(true);
		
		indicecorreccionactivofijosRespaldo=this.indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijos();
		
		this.indicecorreccionactivofijoLogic.setIndiceCorreccionActivoFijos(indicecorreccionactivofijosParaReportes);	
		this.indicecorreccionactivofijoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		indicecorreccionactivofijosParaReportes=this.indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijos();
		this.indicecorreccionactivofijoLogic.setIndiceCorreccionActivoFijos(indicecorreccionactivofijosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"indicecorreccionactivofijo_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("IndiceCorreccionActivoFijos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderIndiceCorreccionActivoFijo("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(IndiceCorreccionActivoFijo indicecorreccionactivofijo : indicecorreccionactivofijosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderIndiceCorreccionActivoFijo("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			IndiceCorreccionActivoFijoConstantesFunciones.generarExcelReporteDataIndiceCorreccionActivoFijo("NORMAL",row,workbook,indicecorreccionactivofijo,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(IndiceCorreccionActivoFijoConstantesFunciones.getIndiceCorreccionActivoFijoDescripcion(indicecorreccionactivofijo));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.indicecorreccionactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Indice Correccion Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoIndiceCorreccionActivoFijo.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoIndiceCorreccionActivoFijo.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoIndiceCorreccionActivoFijo.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoIndiceCorreccionActivoFijo.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessIndiceCorreccionActivoFijo() throws Exception {		
		this.startProcessIndiceCorreccionActivoFijo(true);
	}
	
	public void startProcessIndiceCorreccionActivoFijo(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasIndiceCorreccionActivoFijo ,this.jPanelParametrosReportesIndiceCorreccionActivoFijo, this.jScrollPanelDatosIndiceCorreccionActivoFijo,this.jPanelPaginacionIndiceCorreccionActivoFijo, this.jScrollPanelDatosEdicionIndiceCorreccionActivoFijo, this.jPanelAccionesIndiceCorreccionActivoFijo,this.jPanelAccionesFormularioIndiceCorreccionActivoFijo,this.jmenuBarIndiceCorreccionActivoFijo,this.jmenuBarDetalleIndiceCorreccionActivoFijo,this.jTtoolBarIndiceCorreccionActivoFijo,this.jTtoolBarDetalleIndiceCorreccionActivoFijo);		
		
		final JTabbedPane jTabbedPaneBusquedasIndiceCorreccionActivoFijo=this.jTabbedPaneBusquedasIndiceCorreccionActivoFijo; 
		
		final JPanel jPanelParametrosReportesIndiceCorreccionActivoFijo=this.jPanelParametrosReportesIndiceCorreccionActivoFijo;
		//final JScrollPane jScrollPanelDatosIndiceCorreccionActivoFijo=this.jScrollPanelDatosIndiceCorreccionActivoFijo;
		final JTable jTableDatosIndiceCorreccionActivoFijo=this.jTableDatosIndiceCorreccionActivoFijo;		
		final JPanel jPanelPaginacionIndiceCorreccionActivoFijo=this.jPanelPaginacionIndiceCorreccionActivoFijo;
		//final JScrollPane jScrollPanelDatosEdicionIndiceCorreccionActivoFijo=this.jScrollPanelDatosEdicionIndiceCorreccionActivoFijo;
		final JPanel jPanelAccionesIndiceCorreccionActivoFijo=this.jPanelAccionesIndiceCorreccionActivoFijo;
		
		JPanel jPanelCamposAuxiliarIndiceCorreccionActivoFijo=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarIndiceCorreccionActivoFijo=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo!=null) {
			jPanelCamposAuxiliarIndiceCorreccionActivoFijo=this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jPanelCamposIndiceCorreccionActivoFijo;
			jPanelAccionesFormularioAuxiliarIndiceCorreccionActivoFijo=this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jPanelAccionesFormularioIndiceCorreccionActivoFijo;
		}
		
		final JPanel jPanelCamposIndiceCorreccionActivoFijo=jPanelCamposAuxiliarIndiceCorreccionActivoFijo;
		final JPanel jPanelAccionesFormularioIndiceCorreccionActivoFijo=jPanelAccionesFormularioAuxiliarIndiceCorreccionActivoFijo;
		
		
		final JMenuBar jmenuBarIndiceCorreccionActivoFijo=this.jmenuBarIndiceCorreccionActivoFijo;
		final JToolBar jTtoolBarIndiceCorreccionActivoFijo=this.jTtoolBarIndiceCorreccionActivoFijo;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarIndiceCorreccionActivoFijo=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarIndiceCorreccionActivoFijo=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo!=null) {
			jmenuBarDetalleAuxiliarIndiceCorreccionActivoFijo=this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jmenuBarDetalleIndiceCorreccionActivoFijo;
			jTtoolBarDetalleAuxiliarIndiceCorreccionActivoFijo=this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jTtoolBarDetalleIndiceCorreccionActivoFijo;
		}
		
		final JMenuBar jmenuBarDetalleIndiceCorreccionActivoFijo=jmenuBarDetalleAuxiliarIndiceCorreccionActivoFijo;
		final JToolBar jTtoolBarDetalleIndiceCorreccionActivoFijo=jTtoolBarDetalleAuxiliarIndiceCorreccionActivoFijo;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasIndiceCorreccionActivoFijo;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesIndiceCorreccionActivoFijo;
			processRunnable.jTableDatos=jTableDatosIndiceCorreccionActivoFijo;
			processRunnable.jPanelCampos=jPanelCamposIndiceCorreccionActivoFijo;
			processRunnable.jPanelPaginacion=jPanelPaginacionIndiceCorreccionActivoFijo;
			processRunnable.jPanelAcciones=jPanelAccionesIndiceCorreccionActivoFijo;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioIndiceCorreccionActivoFijo;
			
			
			processRunnable.jmenuBar=jmenuBarIndiceCorreccionActivoFijo;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleIndiceCorreccionActivoFijo;
			processRunnable.jTtoolBar=jTtoolBarIndiceCorreccionActivoFijo;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleIndiceCorreccionActivoFijo;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasIndiceCorreccionActivoFijo ,jPanelParametrosReportesIndiceCorreccionActivoFijo,jTableDatosIndiceCorreccionActivoFijo, /*jScrollPanelDatosIndiceCorreccionActivoFijo,*/jPanelCamposIndiceCorreccionActivoFijo,jPanelPaginacionIndiceCorreccionActivoFijo, /*jScrollPanelDatosEdicionIndiceCorreccionActivoFijo,*/ jPanelAccionesIndiceCorreccionActivoFijo,jPanelAccionesFormularioIndiceCorreccionActivoFijo,jmenuBarIndiceCorreccionActivoFijo,jmenuBarDetalleIndiceCorreccionActivoFijo,jTtoolBarIndiceCorreccionActivoFijo,jTtoolBarDetalleIndiceCorreccionActivoFijo);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasIndiceCorreccionActivoFijo ,jPanelParametrosReportesIndiceCorreccionActivoFijo, jScrollPanelDatosIndiceCorreccionActivoFijo,jPanelPaginacionIndiceCorreccionActivoFijo, jScrollPanelDatosEdicionIndiceCorreccionActivoFijo, jPanelAccionesIndiceCorreccionActivoFijo,jPanelAccionesFormularioIndiceCorreccionActivoFijo,jmenuBarIndiceCorreccionActivoFijo,jmenuBarDetalleIndiceCorreccionActivoFijo,jTtoolBarIndiceCorreccionActivoFijo,jTtoolBarDetalleIndiceCorreccionActivoFijo);
						
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
	
	public void finishProcessIndiceCorreccionActivoFijo() {// throws Exception 
		this.finishProcessIndiceCorreccionActivoFijo(true);
	}
	
	public void finishProcessIndiceCorreccionActivoFijo(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasIndiceCorreccionActivoFijo ,this.jPanelParametrosReportesIndiceCorreccionActivoFijo, this.jScrollPanelDatosIndiceCorreccionActivoFijo,this.jPanelPaginacionIndiceCorreccionActivoFijo, this.jScrollPanelDatosEdicionIndiceCorreccionActivoFijo, this.jPanelAccionesIndiceCorreccionActivoFijo,this.jPanelAccionesFormularioIndiceCorreccionActivoFijo,this.jmenuBarIndiceCorreccionActivoFijo,this.jmenuBarDetalleIndiceCorreccionActivoFijo,this.jTtoolBarIndiceCorreccionActivoFijo,this.jTtoolBarDetalleIndiceCorreccionActivoFijo);		
		
		final JTabbedPane jTabbedPaneBusquedasIndiceCorreccionActivoFijo=this.jTabbedPaneBusquedasIndiceCorreccionActivoFijo; 
		
		final JPanel jPanelParametrosReportesIndiceCorreccionActivoFijo=this.jPanelParametrosReportesIndiceCorreccionActivoFijo;
		//final JScrollPane jScrollPanelDatosIndiceCorreccionActivoFijo=this.jScrollPanelDatosIndiceCorreccionActivoFijo;
		final JTable jTableDatosIndiceCorreccionActivoFijo=this.jTableDatosIndiceCorreccionActivoFijo;		
		final JPanel jPanelPaginacionIndiceCorreccionActivoFijo=this.jPanelPaginacionIndiceCorreccionActivoFijo;
		//final JScrollPane jScrollPanelDatosEdicionIndiceCorreccionActivoFijo=this.jScrollPanelDatosEdicionIndiceCorreccionActivoFijo;
		final JPanel jPanelAccionesIndiceCorreccionActivoFijo=this.jPanelAccionesIndiceCorreccionActivoFijo;
		
		JPanel jPanelCamposAuxiliarIndiceCorreccionActivoFijo=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarIndiceCorreccionActivoFijo=new JPanel();
		
		if(this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo!=null) {
			jPanelCamposAuxiliarIndiceCorreccionActivoFijo=this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jPanelCamposIndiceCorreccionActivoFijo;
			jPanelAccionesFormularioAuxiliarIndiceCorreccionActivoFijo=this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jPanelAccionesFormularioIndiceCorreccionActivoFijo;
		}
		
		final JPanel jPanelCamposIndiceCorreccionActivoFijo=jPanelCamposAuxiliarIndiceCorreccionActivoFijo;
		final JPanel jPanelAccionesFormularioIndiceCorreccionActivoFijo=jPanelAccionesFormularioAuxiliarIndiceCorreccionActivoFijo;
		
		
		final JMenuBar jmenuBarIndiceCorreccionActivoFijo=this.jmenuBarIndiceCorreccionActivoFijo;		
		final JToolBar jTtoolBarIndiceCorreccionActivoFijo=this.jTtoolBarIndiceCorreccionActivoFijo;
				
		JMenuBar jmenuBarDetalleAuxiliarIndiceCorreccionActivoFijo=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarIndiceCorreccionActivoFijo=new JToolBar();
		
		if(this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo!=null) {
			jmenuBarDetalleAuxiliarIndiceCorreccionActivoFijo=this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jmenuBarDetalleIndiceCorreccionActivoFijo;
			jTtoolBarDetalleAuxiliarIndiceCorreccionActivoFijo=this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jTtoolBarDetalleIndiceCorreccionActivoFijo;		
		}
		
		final JMenuBar jmenuBarDetalleIndiceCorreccionActivoFijo=jmenuBarDetalleAuxiliarIndiceCorreccionActivoFijo;
		final JToolBar jTtoolBarDetalleIndiceCorreccionActivoFijo=jTtoolBarDetalleAuxiliarIndiceCorreccionActivoFijo;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasIndiceCorreccionActivoFijo;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesIndiceCorreccionActivoFijo;
			processRunnable.jTableDatos=jTableDatosIndiceCorreccionActivoFijo;
			processRunnable.jPanelCampos=jPanelCamposIndiceCorreccionActivoFijo;
			processRunnable.jPanelPaginacion=jPanelPaginacionIndiceCorreccionActivoFijo;
			processRunnable.jPanelAcciones=jPanelAccionesIndiceCorreccionActivoFijo;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioIndiceCorreccionActivoFijo;
			
			
			processRunnable.jmenuBar=jmenuBarIndiceCorreccionActivoFijo;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleIndiceCorreccionActivoFijo;
			processRunnable.jTtoolBar=jTtoolBarIndiceCorreccionActivoFijo;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleIndiceCorreccionActivoFijo;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasIndiceCorreccionActivoFijo ,jPanelParametrosReportesIndiceCorreccionActivoFijo, jTableDatosIndiceCorreccionActivoFijo,/*jScrollPanelDatosIndiceCorreccionActivoFijo,*/jPanelCamposIndiceCorreccionActivoFijo,jPanelPaginacionIndiceCorreccionActivoFijo, /*jScrollPanelDatosEdicionIndiceCorreccionActivoFijo,*/ jPanelAccionesIndiceCorreccionActivoFijo,jPanelAccionesFormularioIndiceCorreccionActivoFijo,jmenuBarIndiceCorreccionActivoFijo,jmenuBarDetalleIndiceCorreccionActivoFijo,jTtoolBarIndiceCorreccionActivoFijo,jTtoolBarDetalleIndiceCorreccionActivoFijo));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesIndiceCorreccionActivoFijo(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarIndiceCorreccionActivoFijo(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuIndiceCorreccionActivoFijo(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarIndiceCorreccionActivoFijo(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarIndiceCorreccionActivoFijo,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleIndiceCorreccionActivoFijo,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuIndiceCorreccionActivoFijo(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarIndiceCorreccionActivoFijo,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleIndiceCorreccionActivoFijo,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.indicecorreccionactivofijoConstantesFunciones.getsFinalQueryIndiceCorreccionActivoFijo();
		String  finalQueryPaginacionTodos=this.indicecorreccionactivofijoConstantesFunciones.getsFinalQueryIndiceCorreccionActivoFijo();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=IndiceCorreccionActivoFijoConstantesFunciones.getArrayColumnasGlobalesNoIndiceCorreccionActivoFijo(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=IndiceCorreccionActivoFijoConstantesFunciones.getArrayColumnasGlobalesIndiceCorreccionActivoFijo(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,IndiceCorreccionActivoFijoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.indicecorreccionactivofijosEliminados= new ArrayList<IndiceCorreccionActivoFijo>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessIndiceCorreccionActivoFijo();
		
				///*IndiceCorreccionActivoFijoSessionBean*/this.indicecorreccionactivofijoSessionBean=new IndiceCorreccionActivoFijoSessionBean();
			
			if(this.indicecorreccionactivofijoSessionBean==null) {
				this.indicecorreccionactivofijoSessionBean=new IndiceCorreccionActivoFijoSessionBean();
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
					this.iNumeroPaginacion=IndiceCorreccionActivoFijoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=IndiceCorreccionActivoFijoConstantesFunciones.getClassesForeignKeysOfIndiceCorreccionActivoFijo(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/indicecorreccionactivofijo."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			indicecorreccionactivofijosAux= new ArrayList<IndiceCorreccionActivoFijo>();
			
				
			indicecorreccionactivofijoLogic.setDatosCliente(this.datosCliente);
			indicecorreccionactivofijoLogic.setDatosDeep(this.datosDeep);
			indicecorreccionactivofijoLogic.setIsConDeep(true);
			
			
			indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					indicecorreccionactivofijoLogic.getTodosIndiceCorreccionActivoFijos(finalQueryGlobal,pagination);
					
					//indicecorreccionactivofijoLogic.getTodosIndiceCorreccionActivoFijosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijos()==null|| indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							indicecorreccionactivofijosAux= new ArrayList<IndiceCorreccionActivoFijo>();
							indicecorreccionactivofijosAux.addAll(indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							indicecorreccionactivofijosAux= new ArrayList<IndiceCorreccionActivoFijo>();
							indicecorreccionactivofijosAux.addAll(indicecorreccionactivofijos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							indicecorreccionactivofijoLogic.getTodosIndiceCorreccionActivoFijos(finalQueryGlobal+"",this.pagination);												
							
							//indicecorreccionactivofijoLogic.getTodosIndiceCorreccionActivoFijosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteIndiceCorreccionActivoFijos("Todos",indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							indicecorreccionactivofijoLogic.setIndiceCorreccionActivoFijos(new ArrayList<IndiceCorreccionActivoFijo>());					
							indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijos().addAll(indicecorreccionactivofijosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							indicecorreccionactivofijos=new ArrayList<IndiceCorreccionActivoFijo>();
							indicecorreccionactivofijos.addAll(indicecorreccionactivofijosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idIndiceCorreccionActivoFijo=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idIndiceCorreccionActivoFijo=this.idActual;
				
				} else if(this.idIndiceCorreccionActivoFijoActual!=null && this.idIndiceCorreccionActivoFijoActual!=0L) {
					idIndiceCorreccionActivoFijo=idIndiceCorreccionActivoFijoActual;
				}
				
					
				this.sDetalleReporte=IndiceCorreccionActivoFijoConstantesFunciones.getDetalleIndicePorId(idIndiceCorreccionActivoFijo);
				
				this.indicecorreccionactivofijos=new ArrayList<IndiceCorreccionActivoFijo>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					indicecorreccionactivofijoLogic.getEntity(idIndiceCorreccionActivoFijo);
					
					//indicecorreccionactivofijoLogic.getEntityWithConnection(idIndiceCorreccionActivoFijo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					indicecorreccionactivofijoLogic.setIndiceCorreccionActivoFijos(new ArrayList<IndiceCorreccionActivoFijo>());
					indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijos().add(indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijo());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.indicecorreccionactivofijos=new ArrayList<IndiceCorreccionActivoFijo>();
					this.indicecorreccionactivofijos.add(indicecorreccionactivofijo);
				}
				
				if(indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijo()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=IndiceCorreccionActivoFijoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=IndiceCorreccionActivoFijoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=IndiceCorreccionActivoFijoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijos()==null||indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=indicecorreccionactivofijos==null|| indicecorreccionactivofijos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						indicecorreccionactivofijosAux=new ArrayList<IndiceCorreccionActivoFijo>();
						indicecorreccionactivofijosAux.addAll(indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							indicecorreccionactivofijosAux=new ArrayList<IndiceCorreccionActivoFijo>();
							indicecorreccionactivofijosAux.addAll(indicecorreccionactivofijos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=IndiceCorreccionActivoFijoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=IndiceCorreccionActivoFijoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteIndiceCorreccionActivoFijos("FK_IdEmpresa",indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteIndiceCorreccionActivoFijos("FK_IdEmpresa",indicecorreccionactivofijos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						indicecorreccionactivofijoLogic.setIndiceCorreccionActivoFijos(new ArrayList<IndiceCorreccionActivoFijo>());
						indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijos().addAll(indicecorreccionactivofijosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							indicecorreccionactivofijos=new ArrayList<IndiceCorreccionActivoFijo>();
							indicecorreccionactivofijos.addAll(indicecorreccionactivofijosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesIndiceCorreccionActivoFijo();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessIndiceCorreccionActivoFijo();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=indicecorreccionactivofijos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=indicecorreccionactivofijos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(IndiceCorreccionActivoFijo indicecorreccionactivofijo) {
		Boolean permite=true;
		
		if(this.indicecorreccionactivofijo.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=IndiceCorreccionActivoFijoConstantesFunciones.getOrderByListaIndiceCorreccionActivoFijo();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=IndiceCorreccionActivoFijoConstantesFunciones.getOrderByListaIndiceCorreccionActivoFijo();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(IndiceCorreccionActivoFijo indicecorreccionactivofijo:indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijos()) {
				if(indicecorreccionactivofijo.getsType().equals(Constantes2.S_TOTALES)) {
					indicecorreccionactivofijoTotales=indicecorreccionactivofijo;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(IndiceCorreccionActivoFijo indicecorreccionactivofijo:this.indicecorreccionactivofijos) {
				if(indicecorreccionactivofijo.getsType().equals(Constantes2.S_TOTALES)) {
					indicecorreccionactivofijoTotales=indicecorreccionactivofijo;
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
			this.indicecorreccionactivofijoAux=new IndiceCorreccionActivoFijo();
			this.indicecorreccionactivofijoAux.setsType(Constantes2.S_TOTALES);
			this.indicecorreccionactivofijoAux.setIsNew(false);
			this.indicecorreccionactivofijoAux.setIsChanged(false);
			this.indicecorreccionactivofijoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				IndiceCorreccionActivoFijoConstantesFunciones.TotalizarValoresFilaIndiceCorreccionActivoFijo(this.indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijos(),this.indicecorreccionactivofijoAux);
				
				this.indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijos().add(this.indicecorreccionactivofijoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				IndiceCorreccionActivoFijoConstantesFunciones.TotalizarValoresFilaIndiceCorreccionActivoFijo(this.indicecorreccionactivofijos,this.indicecorreccionactivofijoAux);
				
				this.indicecorreccionactivofijos.add(this.indicecorreccionactivofijoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		indicecorreccionactivofijoTotales=new IndiceCorreccionActivoFijo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijos().remove(indicecorreccionactivofijoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.indicecorreccionactivofijos.remove(indicecorreccionactivofijoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		indicecorreccionactivofijoTotales=new IndiceCorreccionActivoFijo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(IndiceCorreccionActivoFijo indicecorreccionactivofijo:indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijos()) {
				if(indicecorreccionactivofijo.getsType().equals(Constantes2.S_TOTALES)) {
					indicecorreccionactivofijoTotales=indicecorreccionactivofijo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				IndiceCorreccionActivoFijoConstantesFunciones.TotalizarValoresFilaIndiceCorreccionActivoFijo(this.indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijos(),indicecorreccionactivofijoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(IndiceCorreccionActivoFijo indicecorreccionactivofijo:this.indicecorreccionactivofijos) {
				if(indicecorreccionactivofijo.getsType().equals(Constantes2.S_TOTALES)) {
					indicecorreccionactivofijoTotales=indicecorreccionactivofijo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				IndiceCorreccionActivoFijoConstantesFunciones.TotalizarValoresFilaIndiceCorreccionActivoFijo(this.indicecorreccionactivofijos,indicecorreccionactivofijoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getIndiceCorreccionActivoFijosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getIndiceCorreccionActivoFijosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosIndiceCorreccionActivoFijo() {
		this.isPermisoTodoIndiceCorreccionActivoFijo=false;
		this.isPermisoNuevoIndiceCorreccionActivoFijo=false;
		this.isPermisoActualizarIndiceCorreccionActivoFijo=false;
		this.isPermisoActualizarOriginalIndiceCorreccionActivoFijo=false;
		this.isPermisoEliminarIndiceCorreccionActivoFijo=false;
		this.isPermisoGuardarCambiosIndiceCorreccionActivoFijo=false;
		this.isPermisoConsultaIndiceCorreccionActivoFijo=false;
		this.isPermisoBusquedaIndiceCorreccionActivoFijo=false;
		this.isPermisoReporteIndiceCorreccionActivoFijo=false;		
		this.isPermisoOrdenIndiceCorreccionActivoFijo=false;		
		this.isPermisoPaginacionMedioIndiceCorreccionActivoFijo=false;		
		this.isPermisoPaginacionAltoIndiceCorreccionActivoFijo=false;
		this.isPermisoPaginacionTodoIndiceCorreccionActivoFijo=false;
		this.isPermisoCopiarIndiceCorreccionActivoFijo=false;		
		this.isPermisoVerFormIndiceCorreccionActivoFijo=false;		
		this.isPermisoDuplicarIndiceCorreccionActivoFijo=false;		
		this.isPermisoOrdenIndiceCorreccionActivoFijo=false;		
	}
	
	public void setPermisosUsuarioIndiceCorreccionActivoFijo(Boolean isPermiso) {
		this.isPermisoTodoIndiceCorreccionActivoFijo=isPermiso;
		this.isPermisoNuevoIndiceCorreccionActivoFijo=isPermiso;
		this.isPermisoActualizarIndiceCorreccionActivoFijo=isPermiso;
		this.isPermisoActualizarOriginalIndiceCorreccionActivoFijo=isPermiso;
		this.isPermisoEliminarIndiceCorreccionActivoFijo=isPermiso;
		this.isPermisoGuardarCambiosIndiceCorreccionActivoFijo=isPermiso;
		this.isPermisoConsultaIndiceCorreccionActivoFijo=isPermiso;
		this.isPermisoBusquedaIndiceCorreccionActivoFijo=isPermiso;
		this.isPermisoReporteIndiceCorreccionActivoFijo=isPermiso;
		this.isPermisoOrdenIndiceCorreccionActivoFijo=isPermiso;		
		this.isPermisoPaginacionMedioIndiceCorreccionActivoFijo=isPermiso;		
		this.isPermisoPaginacionAltoIndiceCorreccionActivoFijo=isPermiso;		
		this.isPermisoPaginacionTodoIndiceCorreccionActivoFijo=isPermiso;		
		this.isPermisoCopiarIndiceCorreccionActivoFijo=isPermiso;		
		this.isPermisoVerFormIndiceCorreccionActivoFijo=isPermiso;		
		this.isPermisoDuplicarIndiceCorreccionActivoFijo=isPermiso;
		this.isPermisoOrdenIndiceCorreccionActivoFijo=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioIndiceCorreccionActivoFijo(Boolean isPermiso) {
		//this.isPermisoTodoIndiceCorreccionActivoFijo=isPermiso;
		this.isPermisoNuevoIndiceCorreccionActivoFijo=isPermiso;
		this.isPermisoActualizarIndiceCorreccionActivoFijo=isPermiso;
		this.isPermisoActualizarOriginalIndiceCorreccionActivoFijo=isPermiso;
		this.isPermisoEliminarIndiceCorreccionActivoFijo=isPermiso;
		this.isPermisoGuardarCambiosIndiceCorreccionActivoFijo=isPermiso;
		//this.isPermisoConsultaIndiceCorreccionActivoFijo=isPermiso;
		//this.isPermisoBusquedaIndiceCorreccionActivoFijo=isPermiso;
		//this.isPermisoReporteIndiceCorreccionActivoFijo=isPermiso;
		//this.isPermisoOrdenIndiceCorreccionActivoFijo=isPermiso;		
		//this.isPermisoPaginacionMedioIndiceCorreccionActivoFijo=isPermiso;		
		//this.isPermisoPaginacionAltoIndiceCorreccionActivoFijo=isPermiso;		
		//this.isPermisoPaginacionTodoIndiceCorreccionActivoFijo=isPermiso;		
		//this.isPermisoCopiarIndiceCorreccionActivoFijo=isPermiso;		
		//this.isPermisoDuplicarIndiceCorreccionActivoFijo=isPermiso;
		//this.isPermisoOrdenIndiceCorreccionActivoFijo=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioIndiceCorreccionActivoFijoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(IndiceCorreccionActivoFijoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebIndiceCorreccionActivoFijo(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioIndiceCorreccionActivoFijoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioIndiceCorreccionActivoFijoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionIndiceCorreccionActivoFijoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioIndiceCorreccionActivoFijoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioIndiceCorreccionActivoFijo() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(IndiceCorreccionActivoFijoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.indicecorreccionactivofijoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, IndiceCorreccionActivoFijoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoIndiceCorreccionActivoFijo=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarIndiceCorreccionActivoFijo=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalIndiceCorreccionActivoFijo=this.isPermisoActualizarIndiceCorreccionActivoFijo;
			this.isPermisoEliminarIndiceCorreccionActivoFijo=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosIndiceCorreccionActivoFijo=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaIndiceCorreccionActivoFijo=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaIndiceCorreccionActivoFijo=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoIndiceCorreccionActivoFijo=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteIndiceCorreccionActivoFijo=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenIndiceCorreccionActivoFijo=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioIndiceCorreccionActivoFijo=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoIndiceCorreccionActivoFijo=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoIndiceCorreccionActivoFijo=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarIndiceCorreccionActivoFijo=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormIndiceCorreccionActivoFijo=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarIndiceCorreccionActivoFijo=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenIndiceCorreccionActivoFijo=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.indicecorreccionactivofijoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosIndiceCorreccionActivoFijo.setToolTipText(this.jTableDatosIndiceCorreccionActivoFijo.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioIndiceCorreccionActivoFijo(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioIndiceCorreccionActivoFijo(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(IndiceCorreccionActivoFijoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(IndiceCorreccionActivoFijoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioIndiceCorreccionActivoFijo() throws Exception {
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
	public void inicializarCombosForeignKeyIndiceCorreccionActivoFijoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyIndiceCorreccionActivoFijoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(IndiceCorreccionActivoFijoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyIndiceCorreccionActivoFijoListas(false);
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
	
	public void cargarCombosLoteForeignKeyIndiceCorreccionActivoFijoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			IndiceCorreccionActivoFijoParameterReturnGeneral indicecorreccionactivofijoReturnGeneral=new IndiceCorreccionActivoFijoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.indicecorreccionactivofijoConstantesFunciones.cargarid_empresaIndiceCorreccionActivoFijo)
					 || (this.esRecargarFks && this.indicecorreccionactivofijoConstantesFunciones.cargarid_empresaIndiceCorreccionActivoFijo)) {

					if(!this.indicecorreccionactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+indicecorreccionactivofijoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				indicecorreccionactivofijoReturnGeneral=indicecorreccionactivofijoLogic.cargarCombosLoteForeignKeyIndiceCorreccionActivoFijo(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=indicecorreccionactivofijoReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyIndiceCorreccionActivoFijo()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.indicecorreccionactivofijoSessionBean==null) {
				this.indicecorreccionactivofijoSessionBean=new IndiceCorreccionActivoFijoSessionBean();
			}

			if(!this.indicecorreccionactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyIndiceCorreccionActivoFijo()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyIndiceCorreccionActivoFijo(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyIndiceCorreccionActivoFijo()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyIndiceCorreccionActivoFijo();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyIndiceCorreccionActivoFijo(IndiceCorreccionActivoFijo indicecorreccionactivofijo)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyIndiceCorreccionActivoFijo(IndiceCorreccionActivoFijo indicecorreccionactivofijo,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyIndiceCorreccionActivoFijo()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyIndiceCorreccionActivoFijo()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyIndiceCorreccionActivoFijo()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyIndiceCorreccionActivoFijo()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroIndiceCorreccionActivoFijo()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyIndiceCorreccionActivoFijo()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyIndiceCorreccionActivoFijo(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyIndiceCorreccionActivoFijo()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jComboBoxid_empresaIndiceCorreccionActivoFijo!=null && this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jComboBoxid_empresaIndiceCorreccionActivoFijo.getItemCount()>0) {
				this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jComboBoxid_empresaIndiceCorreccionActivoFijo.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public IndiceCorreccionActivoFijoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public IndiceCorreccionActivoFijoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public IndiceCorreccionActivoFijoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.indicecorreccionactivofijoSessionBean=new IndiceCorreccionActivoFijoSessionBean(); 
		this.indicecorreccionactivofijoConstantesFunciones=new IndiceCorreccionActivoFijoConstantesFunciones(); 
		this.indicecorreccionactivofijoBean=new IndiceCorreccionActivoFijo();//(this.indicecorreccionactivofijoConstantesFunciones); 		
		this.indicecorreccionactivofijoReturnGeneral=new IndiceCorreccionActivoFijoParameterReturnGeneral(); 
		
		this.indicecorreccionactivofijoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.indicecorreccionactivofijoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public IndiceCorreccionActivoFijoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public IndiceCorreccionActivoFijoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public IndiceCorreccionActivoFijoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessIndiceCorreccionActivoFijo(true);
			
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
			
			this.indicecorreccionactivofijoConstantesFunciones=new IndiceCorreccionActivoFijoConstantesFunciones(); 
			this.indicecorreccionactivofijoBean=new IndiceCorreccionActivoFijo();//this.indicecorreccionactivofijoConstantesFunciones); 			
			this.indicecorreccionactivofijoReturnGeneral=new IndiceCorreccionActivoFijoParameterReturnGeneral(); 
		
			IndiceCorreccionActivoFijoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Indice Correccion Activo Fijo Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.indicecorreccionactivofijo=new IndiceCorreccionActivoFijo();
			this.indicecorreccionactivofijos = new ArrayList<IndiceCorreccionActivoFijo>();
			this.indicecorreccionactivofijosAux = new ArrayList<IndiceCorreccionActivoFijo>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.indicecorreccionactivofijoLogic=new IndiceCorreccionActivoFijoLogic();
				this.indicecorreccionactivofijoLogic.getNewConnexionToDeep("");
			}
			
			//this.indicecorreccionactivofijoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.indicecorreccionactivofijoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoIndiceCorreccionActivoFijo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoIndiceCorreccionActivoFijo);	
					}
					
					if(this.jInternalFrameImportacionIndiceCorreccionActivoFijo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionIndiceCorreccionActivoFijo);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByIndiceCorreccionActivoFijo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByIndiceCorreccionActivoFijo);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo);
				this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.setVisible(false);
				this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoIndiceCorreccionActivoFijo!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoIndiceCorreccionActivoFijo);
					this.jInternalFrameReporteDinamicoIndiceCorreccionActivoFijo.setVisible(false);
					this.jInternalFrameReporteDinamicoIndiceCorreccionActivoFijo.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionIndiceCorreccionActivoFijo!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionIndiceCorreccionActivoFijo);
					this.jInternalFrameImportacionIndiceCorreccionActivoFijo.setVisible(false);
					this.jInternalFrameImportacionIndiceCorreccionActivoFijo.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByIndiceCorreccionActivoFijo!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByIndiceCorreccionActivoFijo);
					this.jInternalFrameOrderByIndiceCorreccionActivoFijo.setVisible(false);
					this.jInternalFrameOrderByIndiceCorreccionActivoFijo.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idIndiceCorreccionActivoFijoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=IndiceCorreccionActivoFijoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.indicecorreccionactivofijoReturnGeneral=new IndiceCorreccionActivoFijoParameterReturnGeneral();
			
			this.indicecorreccionactivofijoParameterGeneral=new IndiceCorreccionActivoFijoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.indicecorreccionactivofijoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.indicecorreccionactivofijoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(IndiceCorreccionActivoFijoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.indicecorreccionactivofijoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,IndiceCorreccionActivoFijoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.indicecorreccionactivofijoSessionBean.getEsGuardarRelacionado(),this.indicecorreccionactivofijoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,IndiceCorreccionActivoFijoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.indicecorreccionactivofijoSessionBean.getEsGuardarRelacionado(),this.indicecorreccionactivofijoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoIndiceCorreccionActivoFijo=false;
			this.isVisibilidadCeldaDuplicarIndiceCorreccionActivoFijo=true;
			this.isVisibilidadCeldaCopiarIndiceCorreccionActivoFijo=true;
			this.isVisibilidadCeldaVerFormIndiceCorreccionActivoFijo=true;
			this.isVisibilidadCeldaOrdenIndiceCorreccionActivoFijo=true;
			this.isVisibilidadCeldaNuevoRelacionesIndiceCorreccionActivoFijo=false;
			this.isVisibilidadCeldaModificarIndiceCorreccionActivoFijo=false;
			this.isVisibilidadCeldaActualizarIndiceCorreccionActivoFijo=false;
			this.isVisibilidadCeldaEliminarIndiceCorreccionActivoFijo=false;
			this.isVisibilidadCeldaCancelarIndiceCorreccionActivoFijo=false;
			this.isVisibilidadCeldaGuardarIndiceCorreccionActivoFijo=false;
			this.isVisibilidadCeldaGuardarCambiosIndiceCorreccionActivoFijo=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesIndiceCorreccionActivoFijo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosIndiceCorreccionActivoFijo();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioIndiceCorreccionActivoFijo(false);
			
			this.setPermisosUsuarioIndiceCorreccionActivoFijo();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.indicecorreccionactivofijoSessionBean.getEsGuardarRelacionado() 
				|| (this.indicecorreccionactivofijoSessionBean.getEsGuardarRelacionado() && this.indicecorreccionactivofijoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioIndiceCorreccionActivoFijoClasesRelacionadas();
			}
			
			if(this.indicecorreccionactivofijoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioIndiceCorreccionActivoFijoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!IndiceCorreccionActivoFijoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosIndiceCorreccionActivoFijo();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualIndiceCorreccionActivoFijo();
			}
			
			if(!this.isPermisoBusquedaIndiceCorreccionActivoFijo) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasIndiceCorreccionActivoFijo.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.indicecorreccionactivofijoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioIndiceCorreccionActivoFijo,this.isPermisoPaginacionMedioIndiceCorreccionActivoFijo,this.isPermisoPaginacionTodoIndiceCorreccionActivoFijo);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(IndiceCorreccionActivoFijoConstantesFunciones.getTiposSeleccionarIndiceCorreccionActivoFijo());
				
				this.tiposColumnasSelect=IndiceCorreccionActivoFijoConstantesFunciones.getTiposSeleccionarIndiceCorreccionActivoFijo(true);
				
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
			//if(!this.indicecorreccionactivofijoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioIndiceCorreccionActivoFijo();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioIndiceCorreccionActivoFijo(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioIndiceCorreccionActivoFijo(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesIndiceCorreccionActivoFijo() ;
			
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
				indicecorreccionactivofijoImplementable= (IndiceCorreccionActivoFijoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+IndiceCorreccionActivoFijoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				indicecorreccionactivofijoImplementableHome= (IndiceCorreccionActivoFijoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+IndiceCorreccionActivoFijoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.indicecorreccionactivofijos= new ArrayList<IndiceCorreccionActivoFijo>();
			this.indicecorreccionactivofijosEliminados= new ArrayList<IndiceCorreccionActivoFijo>();
						
			this.isEsNuevoIndiceCorreccionActivoFijo=false;
			this.esParaAccionDesdeFormularioIndiceCorreccionActivoFijo=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyIndiceCorreccionActivoFijo(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroIndiceCorreccionActivoFijo();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.indicecorreccionactivofijoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			IndiceCorreccionActivoFijoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=IndiceCorreccionActivoFijoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesIndiceCorreccionActivoFijo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingIndiceCorreccionActivoFijo(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioIndiceCorreccionActivoFijo();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioIndiceCorreccionActivoFijo();
			}
			
			IndiceCorreccionActivoFijoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasIndiceCorreccionActivoFijo.getTabCount(); i++) {
					this.jTabbedPaneBusquedasIndiceCorreccionActivoFijo.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasIndiceCorreccionActivoFijo.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.indicecorreccionactivofijoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessIndiceCorreccionActivoFijo(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga IndiceCorreccionActivoFijo: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.indicecorreccionactivofijoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.indicecorreccionactivofijoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectIndiceCorreccionActivoFijo() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesIndiceCorreccionActivoFijo")) {
				iIndex=this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jTabbedPaneRelacionesIndiceCorreccionActivoFijo.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jTabbedPaneRelacionesIndiceCorreccionActivoFijo.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosIndiceCorreccionActivoFijo.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessIndiceCorreccionActivoFijo();	
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
	
	public void cargarCombosForeignKeyIndiceCorreccionActivoFijo(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyIndiceCorreccionActivoFijo(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyIndiceCorreccionActivoFijo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyIndiceCorreccionActivoFijoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyIndiceCorreccionActivoFijo();
		
		this.cargarCombosFrameForeignKeyIndiceCorreccionActivoFijo();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyIndiceCorreccionActivoFijo();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyIndiceCorreccionActivoFijo();
		}
	}
	
	
	
	public void jButtonNuevoIndiceCorreccionActivoFijoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.indicecorreccionactivofijoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			IndiceCorreccionActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.indicecorreccionactivofijo,new Object(),this.indicecorreccionactivofijoParameterGeneral,this.indicecorreccionactivofijoReturnGeneral);
			
			
			if(jTableDatosIndiceCorreccionActivoFijo.getRowCount()>=1) {
				jTableDatosIndiceCorreccionActivoFijo.removeRowSelectionInterval(0, jTableDatosIndiceCorreccionActivoFijo.getRowCount()-1);						
			}
			
			this.isEsNuevoIndiceCorreccionActivoFijo=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoIndiceCorreccionActivoFijo(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesIndiceCorreccionActivoFijo(true);			
			//this.indicecorreccionactivofijo=new IndiceCorreccionActivoFijo();
			//this.indicecorreccionactivofijo.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesIndiceCorreccionActivoFijo(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualIndiceCorreccionActivoFijo() ;
			
			if(IndiceCorreccionActivoFijoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleIndiceCorreccionActivoFijo(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.indicecorreccionactivofijo);	
			this.actualizarInformacion("INFO_PADRE",false,this.indicecorreccionactivofijo);				
			
			IndiceCorreccionActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.indicecorreccionactivofijo,new Object(),this.indicecorreccionactivofijoParameterGeneral,this.indicecorreccionactivofijoReturnGeneral);
			
			if(this.indicecorreccionactivofijoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar IndiceCorreccionActivoFijo: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			IndiceCorreccionActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.indicecorreccionactivofijo,new Object(),this.indicecorreccionactivofijoParameterGeneral,this.indicecorreccionactivofijoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarIndiceCorreccionActivoFijoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<IndiceCorreccionActivoFijo> indicecorreccionactivofijosSeleccionados=new ArrayList<IndiceCorreccionActivoFijo>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosIndiceCorreccionActivoFijo.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosIndiceCorreccionActivoFijo.getSelectedRows().length;			
			}
			
			indicecorreccionactivofijosSeleccionados=this.getIndiceCorreccionActivoFijosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoIndiceCorreccionActivoFijo--;			
				//IndiceCorreccionActivoFijo indicecorreccionactivofijoAux= new IndiceCorreccionActivoFijo();			
				//indicecorreccionactivofijoAux.setId(this.iIdNuevoIndiceCorreccionActivoFijo);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//IndiceCorreccionActivoFijo indicecorreccionactivofijoOrigen=new IndiceCorreccionActivoFijo();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(IndiceCorreccionActivoFijo indicecorreccionactivofijoOrigen : indicecorreccionactivofijosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosIndiceCorreccionActivoFijo.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							indicecorreccionactivofijoOrigen =(IndiceCorreccionActivoFijo) this.indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijos().toArray()[this.jTableDatosIndiceCorreccionActivoFijo.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							indicecorreccionactivofijoOrigen =(IndiceCorreccionActivoFijo) this.indicecorreccionactivofijos.toArray()[this.jTableDatosIndiceCorreccionActivoFijo.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaIndiceCorreccionActivoFijo();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.indicecorreccionactivofijo.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosIndiceCorreccionActivoFijo(indicecorreccionactivofijoOrigen,this.indicecorreccionactivofijo,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysIndiceCorreccionActivoFijo(this.indicecorreccionactivofijo);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijos().add(this.indicecorreccionactivofijoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.indicecorreccionactivofijos.add(this.indicecorreccionactivofijoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaIndiceCorreccionActivoFijo(false);
				
				this.jTableDatosIndiceCorreccionActivoFijo.setRowSelectionInterval(this.getIndiceNuevoIndiceCorreccionActivoFijo(), this.getIndiceNuevoIndiceCorreccionActivoFijo());
				
				int iLastRow =  this.jTableDatosIndiceCorreccionActivoFijo.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosIndiceCorreccionActivoFijo.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosIndiceCorreccionActivoFijo.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaIndiceCorreccionActivoFijo(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarIndiceCorreccionActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<IndiceCorreccionActivoFijo> indicecorreccionactivofijosSeleccionados=new ArrayList<IndiceCorreccionActivoFijo>();									
		
			IndiceCorreccionActivoFijo indicecorreccionactivofijoOrigen=new IndiceCorreccionActivoFijo();
			IndiceCorreccionActivoFijo indicecorreccionactivofijoDestino=new IndiceCorreccionActivoFijo();
				
			indicecorreccionactivofijosSeleccionados=this.getIndiceCorreccionActivoFijosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosIndiceCorreccionActivoFijo.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || indicecorreccionactivofijosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosIndiceCorreccionActivoFijo.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						indicecorreccionactivofijoOrigen =(IndiceCorreccionActivoFijo) this.indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijos().toArray()[this.jTableDatosIndiceCorreccionActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						indicecorreccionactivofijoOrigen =(IndiceCorreccionActivoFijo) this.indicecorreccionactivofijos.toArray()[this.jTableDatosIndiceCorreccionActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						indicecorreccionactivofijoDestino =(IndiceCorreccionActivoFijo) this.indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijos().toArray()[this.jTableDatosIndiceCorreccionActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						indicecorreccionactivofijoDestino =(IndiceCorreccionActivoFijo) this.indicecorreccionactivofijos.toArray()[this.jTableDatosIndiceCorreccionActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				indicecorreccionactivofijoOrigen =indicecorreccionactivofijosSeleccionados.get(0);
				indicecorreccionactivofijoDestino =indicecorreccionactivofijosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosIndiceCorreccionActivoFijo(indicecorreccionactivofijoOrigen,indicecorreccionactivofijoDestino,true,false);
				
				indicecorreccionactivofijoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(indicecorreccionactivofijoDestino,indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(indicecorreccionactivofijoDestino,indicecorreccionactivofijos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaIndiceCorreccionActivoFijo(false);
				
				//this.jTableDatosIndiceCorreccionActivoFijo.setRowSelectionInterval(this.getIndiceNuevoIndiceCorreccionActivoFijo(), this.getIndiceNuevoIndiceCorreccionActivoFijo());
				
				int iLastRow =  this.jTableDatosIndiceCorreccionActivoFijo.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosIndiceCorreccionActivoFijo.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosIndiceCorreccionActivoFijo.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaIndiceCorreccionActivoFijo(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormIndiceCorreccionActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarIndiceCorreccionActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesIndiceCorreccionActivoFijo.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasIndiceCorreccionActivoFijo.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesIndiceCorreccionActivoFijo.setVisible(!isVisible);
			this.jPanelPaginacionIndiceCorreccionActivoFijo.setVisible(!isVisible);
			this.jPanelAccionesIndiceCorreccionActivoFijo.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarIndiceCorreccionActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameIndiceCorreccionActivoFijo();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoIndiceCorreccionActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoIndiceCorreccionActivoFijo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionIndiceCorreccionActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionIndiceCorreccionActivoFijo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByIndiceCorreccionActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByIndiceCorreccionActivoFijo();
			
			this.abrirFrameOrderByIndiceCorreccionActivoFijo();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByIndiceCorreccionActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByIndiceCorreccionActivoFijo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleIndiceCorreccionActivoFijo(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormIndiceCorreccionActivoFijo);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.isMaximum()) {
					this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.setSize(this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.iWidthFormulario,this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.isMaximum()) {
						this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jContentPaneDetalleIndiceCorreccionActivoFijo.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jTabbedPaneRelacionesIndiceCorreccionActivoFijo.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jContentPaneDetalleIndiceCorreccionActivoFijo.getWidth(),IndiceCorreccionActivoFijoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jTabbedPaneRelacionesIndiceCorreccionActivoFijo.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jContentPaneDetalleIndiceCorreccionActivoFijo.getWidth(),IndiceCorreccionActivoFijoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jTabbedPaneRelacionesIndiceCorreccionActivoFijo.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jContentPaneDetalleIndiceCorreccionActivoFijo.getWidth(),IndiceCorreccionActivoFijoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.setVisible(true);
	        this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByIndiceCorreccionActivoFijo() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByIndiceCorreccionActivoFijo==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByIndiceCorreccionActivoFijo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByIndiceCorreccionActivoFijo,false,this);
				} else {
					this.jInternalFrameOrderByIndiceCorreccionActivoFijo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByIndiceCorreccionActivoFijo,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByIndiceCorreccionActivoFijo);
				this.jInternalFrameOrderByIndiceCorreccionActivoFijo.setVisible(false);
				this.jInternalFrameOrderByIndiceCorreccionActivoFijo.setSelected(false);
				
				this.jInternalFrameOrderByIndiceCorreccionActivoFijo.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByIndiceCorreccionActivoFijo"));
				
				this.inicializarActualizarBindingTablaOrderByIndiceCorreccionActivoFijo();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionIndiceCorreccionActivoFijo() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionIndiceCorreccionActivoFijo==null) {
				
				this.jInternalFrameImportacionIndiceCorreccionActivoFijo=new ImportacionJInternalFrame(IndiceCorreccionActivoFijoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionIndiceCorreccionActivoFijo);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionIndiceCorreccionActivoFijo);
				this.jInternalFrameImportacionIndiceCorreccionActivoFijo.setVisible(false);
				this.jInternalFrameImportacionIndiceCorreccionActivoFijo.setSelected(false);


				this.jInternalFrameImportacionIndiceCorreccionActivoFijo.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionIndiceCorreccionActivoFijo"));
				this.jInternalFrameImportacionIndiceCorreccionActivoFijo.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionIndiceCorreccionActivoFijo"));
				this.jInternalFrameImportacionIndiceCorreccionActivoFijo.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionIndiceCorreccionActivoFijo"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoIndiceCorreccionActivoFijo() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoIndiceCorreccionActivoFijo==null) {
				this.jInternalFrameReporteDinamicoIndiceCorreccionActivoFijo=new ReporteDinamicoJInternalFrame(IndiceCorreccionActivoFijoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoIndiceCorreccionActivoFijo);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoIndiceCorreccionActivoFijo);
				this.jInternalFrameReporteDinamicoIndiceCorreccionActivoFijo.setVisible(false);
				this.jInternalFrameReporteDinamicoIndiceCorreccionActivoFijo.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoIndiceCorreccionActivoFijo.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoIndiceCorreccionActivoFijo"));
				this.jInternalFrameReporteDinamicoIndiceCorreccionActivoFijo.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoIndiceCorreccionActivoFijo"));
				this.jInternalFrameReporteDinamicoIndiceCorreccionActivoFijo.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoIndiceCorreccionActivoFijo"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualIndiceCorreccionActivoFijo();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleIndiceCorreccionActivoFijo() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormIndiceCorreccionActivoFijo);
			
	       	this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.setVisible(false);
	        this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.setSelected(false);
			
			//this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.dispose();
			//this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoIndiceCorreccionActivoFijo() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoIndiceCorreccionActivoFijo.setVisible(true);
	        this.jInternalFrameReporteDinamicoIndiceCorreccionActivoFijo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionIndiceCorreccionActivoFijo() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionIndiceCorreccionActivoFijo.setVisible(true);
	        this.jInternalFrameImportacionIndiceCorreccionActivoFijo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByIndiceCorreccionActivoFijo() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByIndiceCorreccionActivoFijo.setVisible(true);
	        this.jInternalFrameOrderByIndiceCorreccionActivoFijo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByIndiceCorreccionActivoFijo() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByIndiceCorreccionActivoFijo.setVisible(false);
	        this.jInternalFrameOrderByIndiceCorreccionActivoFijo.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoIndiceCorreccionActivoFijo() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoIndiceCorreccionActivoFijo.setVisible(false);
	        this.jInternalFrameReporteDinamicoIndiceCorreccionActivoFijo.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionIndiceCorreccionActivoFijo() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionIndiceCorreccionActivoFijo.setVisible(false);
	        this.jInternalFrameImportacionIndiceCorreccionActivoFijo.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarIndiceCorreccionActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarIndiceCorreccionActivoFijo(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarIndiceCorreccionActivoFijo(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosIndiceCorreccionActivoFijo.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesIndiceCorreccionActivoFijo(true);
			//this.isEsNuevoIndiceCorreccionActivoFijo=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.indicecorreccionactivofijo =(IndiceCorreccionActivoFijo) this.indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijos().toArray()[this.jTableDatosIndiceCorreccionActivoFijo.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.indicecorreccionactivofijo =(IndiceCorreccionActivoFijo) this.indicecorreccionactivofijos.toArray()[this.jTableDatosIndiceCorreccionActivoFijo.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesIndiceCorreccionActivoFijo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesIndiceCorreccionActivoFijo(false) ;
			
			if(indicecorreccionactivofijoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(IndiceCorreccionActivoFijoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleIndiceCorreccionActivoFijo(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualIndiceCorreccionActivoFijo(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaIndiceCorreccionActivoFijoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosIndiceCorreccionActivoFijo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.indicecorreccionactivofijo =(IndiceCorreccionActivoFijo) this.indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijos().toArray()[this.jTableDatosIndiceCorreccionActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.indicecorreccionactivofijo =(IndiceCorreccionActivoFijo) this.indicecorreccionactivofijos.toArray()[this.jTableDatosIndiceCorreccionActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarIndiceCorreccionActivoFijo(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosIndiceCorreccionActivoFijo.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesIndiceCorreccionActivoFijo(true);
			//this.isEsNuevoIndiceCorreccionActivoFijo=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.indicecorreccionactivofijo =(IndiceCorreccionActivoFijo) this.indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijos().toArray()[this.jTableDatosIndiceCorreccionActivoFijo.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.indicecorreccionactivofijo =(IndiceCorreccionActivoFijo) this.indicecorreccionactivofijos.toArray()[this.jTableDatosIndiceCorreccionActivoFijo.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.indicecorreccionactivofijo.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesIndiceCorreccionActivoFijo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesIndiceCorreccionActivoFijo(false) ;
			
			if(IndiceCorreccionActivoFijoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleIndiceCorreccionActivoFijo(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualIndiceCorreccionActivoFijo(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarIndiceCorreccionActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.indicecorreccionactivofijoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesIndiceCorreccionActivoFijo(false);
			
			//if(!this.isEsNuevoIndiceCorreccionActivoFijo) {								
				int intSelectedRow = this.jTableDatosIndiceCorreccionActivoFijo.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.indicecorreccionactivofijo =(IndiceCorreccionActivoFijo) this.indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijos().toArray()[this.jTableDatosIndiceCorreccionActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.indicecorreccionactivofijo =(IndiceCorreccionActivoFijo) this.indicecorreccionactivofijos.toArray()[this.jTableDatosIndiceCorreccionActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(IndiceCorreccionActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualIndiceCorreccionActivoFijo(this.indicecorreccionactivofijo,true);
				this.setVariablesFormularioToObjetoActualForeignKeysIndiceCorreccionActivoFijo(this.indicecorreccionactivofijo);
				
			}
			
			if(this.permiteMantenimiento(this.indicecorreccionactivofijo)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.indicecorreccionactivofijoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoIndiceCorreccionActivoFijo=true;
					this.inicializarActualizarBindingTablaIndiceCorreccionActivoFijo(false);
					this.isEsNuevoIndiceCorreccionActivoFijo=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoIndiceCorreccionActivoFijo=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoIndiceCorreccionActivoFijo=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesIndiceCorreccionActivoFijo(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualIndiceCorreccionActivoFijo(false);
				
				this.habilitarDeshabilitarControlesIndiceCorreccionActivoFijo(false);
			
												
				
				if(IndiceCorreccionActivoFijoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleIndiceCorreccionActivoFijo();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoIndiceCorreccionActivoFijoActionPerformed(evt,indicecorreccionactivofijoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualIndiceCorreccionActivoFijo(this.indicecorreccionactivofijo,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosIndiceCorreccionActivoFijo.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,indicecorreccionactivofijoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.indicecorreccionactivofijoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.indicecorreccionactivofijo.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(IndiceCorreccionActivoFijo.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",IndiceCorreccionActivoFijo.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.indicecorreccionactivofijoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.indicecorreccionactivofijoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarIndiceCorreccionActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.indicecorreccionactivofijoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosIndiceCorreccionActivoFijo.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.indicecorreccionactivofijo =(IndiceCorreccionActivoFijo) this.indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijos().toArray()[this.jTableDatosIndiceCorreccionActivoFijo.convertRowIndexToModel(intSelectedRow)];
				this.indicecorreccionactivofijo.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.indicecorreccionactivofijo =(IndiceCorreccionActivoFijo) this.indicecorreccionactivofijos.toArray()[this.jTableDatosIndiceCorreccionActivoFijo.convertRowIndexToModel(intSelectedRow)];
				this.indicecorreccionactivofijo.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.indicecorreccionactivofijo)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.indicecorreccionactivofijoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((IndiceCorreccionActivoFijoModel) this.jTableDatosIndiceCorreccionActivoFijo.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoIndiceCorreccionActivoFijo=true;
				this.inicializarActualizarBindingTablaIndiceCorreccionActivoFijo(false);
				this.isEsNuevoIndiceCorreccionActivoFijo=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesIndiceCorreccionActivoFijo(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualIndiceCorreccionActivoFijo(false);
				
				this.habilitarDeshabilitarControlesIndiceCorreccionActivoFijo(false);
				
				
				
				if(IndiceCorreccionActivoFijoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleIndiceCorreccionActivoFijo();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.indicecorreccionactivofijoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.indicecorreccionactivofijoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.indicecorreccionactivofijoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarIndiceCorreccionActivoFijoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosIndiceCorreccionActivoFijo.getRowCount()>=1) {
				jTableDatosIndiceCorreccionActivoFijo.removeRowSelectionInterval(0, jTableDatosIndiceCorreccionActivoFijo.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesIndiceCorreccionActivoFijo(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaIndiceCorreccionActivoFijo(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesIndiceCorreccionActivoFijo(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualIndiceCorreccionActivoFijo(false) ;
			
			this.isEsNuevoIndiceCorreccionActivoFijo=false;
			
			if(IndiceCorreccionActivoFijoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleIndiceCorreccionActivoFijo();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosIndiceCorreccionActivoFijoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.indicecorreccionactivofijoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingIndiceCorreccionActivoFijo(false);
				
				//SI ES MANUAL
				if(IndiceCorreccionActivoFijoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualIndiceCorreccionActivoFijo();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.indicecorreccionactivofijoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.indicecorreccionactivofijoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.indicecorreccionactivofijoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosIndiceCorreccionActivoFijoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoIndiceCorreccionActivoFijo--;			
			//IndiceCorreccionActivoFijo indicecorreccionactivofijoAux= new IndiceCorreccionActivoFijo();			
			//indicecorreccionactivofijoAux.setId(this.iIdNuevoIndiceCorreccionActivoFijo);
			
			if(this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaIndiceCorreccionActivoFijo();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysIndiceCorreccionActivoFijo(this.indicecorreccionactivofijo);
			
			this.indicecorreccionactivofijo.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijos().add(this.indicecorreccionactivofijoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.indicecorreccionactivofijos.add(this.indicecorreccionactivofijoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaIndiceCorreccionActivoFijo(false);
			
			this.jTableDatosIndiceCorreccionActivoFijo.setRowSelectionInterval(this.getIndiceNuevoIndiceCorreccionActivoFijo(), this.getIndiceNuevoIndiceCorreccionActivoFijo());
			
			int iLastRow =  this.jTableDatosIndiceCorreccionActivoFijo.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosIndiceCorreccionActivoFijo.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosIndiceCorreccionActivoFijo.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaIndiceCorreccionActivoFijo(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionIndiceCorreccionActivoFijoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.indicecorreccionactivofijoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingIndiceCorreccionActivoFijo(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingIndiceCorreccionActivoFijo(false);
			
			//SI ES MANUAL
			if(IndiceCorreccionActivoFijoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualIndiceCorreccionActivoFijo();
			}
			
			//this.abrirFrameTreeIndiceCorreccionActivoFijo();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.indicecorreccionactivofijoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.indicecorreccionactivofijoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.indicecorreccionactivofijoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionIndiceCorreccionActivoFijoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Indice Correccion Activo FijoS ?", "MANTENIMIENTO DE Indice Correccion Activo Fijo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionIndiceCorreccionActivoFijo.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralIndiceCorreccionActivoFijo();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.indicecorreccionactivofijoReturnGeneral=indicecorreccionactivofijoLogic.procesarImportacionIndiceCorreccionActivoFijosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.indicecorreccionactivofijoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarIndiceCorreccionActivoFijoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionIndiceCorreccionActivoFijoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionIndiceCorreccionActivoFijo.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionIndiceCorreccionActivoFijo.setFileImportacion(this.jInternalFrameImportacionIndiceCorreccionActivoFijo.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionIndiceCorreccionActivoFijo.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionIndiceCorreccionActivoFijo.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionIndiceCorreccionActivoFijo.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionIndiceCorreccionActivoFijo.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoIndiceCorreccionActivoFijoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<IndiceCorreccionActivoFijo> indicecorreccionactivofijosSeleccionados=new ArrayList<IndiceCorreccionActivoFijo>();		

		indicecorreccionactivofijosSeleccionados=this.getIndiceCorreccionActivoFijosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoIndiceCorreccionActivoFijo.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoIndiceCorreccionActivoFijo.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("IndiceCorreccionActivoFijoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"IndiceCorreccionActivoFijoBaseDesign.jrxml";
			
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
			
			this.generarReporteIndiceCorreccionActivoFijos("Todos",indicecorreccionactivofijosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.indicecorreccionactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Indice Correccion Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoIndiceCorreccionActivoFijo.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoIndiceCorreccionActivoFijo.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case IndiceCorreccionActivoFijoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case IndiceCorreccionActivoFijoConstantesFunciones.LABEL_ANIO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_io_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_io_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_io_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_io_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case IndiceCorreccionActivoFijoConstantesFunciones.LABEL_VALOR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lor_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoIndiceCorreccionActivoFijo.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoIndiceCorreccionActivoFijo.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoIndiceCorreccionActivoFijo.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case IndiceCorreccionActivoFijoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case IndiceCorreccionActivoFijoConstantesFunciones.LABEL_ANIO:
					sNombreCampoCategoria="anio";
					break;

				case IndiceCorreccionActivoFijoConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoria="valor";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoIndiceCorreccionActivoFijo.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case IndiceCorreccionActivoFijoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case IndiceCorreccionActivoFijoConstantesFunciones.LABEL_ANIO:
					sNombreCampoCategoriaValor="anio";
					break;

				case IndiceCorreccionActivoFijoConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoriaValor="valor";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoIndiceCorreccionActivoFijo.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoIndiceCorreccionActivoFijo.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case IndiceCorreccionActivoFijoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case IndiceCorreccionActivoFijoConstantesFunciones.LABEL_ANIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Anio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"anio");
					break;

				case IndiceCorreccionActivoFijoConstantesFunciones.LABEL_VALOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor");
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
	
	public void jButtonGenerarExcelReporteDinamicoIndiceCorreccionActivoFijoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<IndiceCorreccionActivoFijo> indicecorreccionactivofijosSeleccionados=new ArrayList<IndiceCorreccionActivoFijo>();		
		
		indicecorreccionactivofijosSeleccionados=this.getIndiceCorreccionActivoFijosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"indicecorreccionactivofijo";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("IndiceCorreccionActivoFijos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoIndiceCorreccionActivoFijo.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoIndiceCorreccionActivoFijo.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case IndiceCorreccionActivoFijoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(IndiceCorreccionActivoFijoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(IndiceCorreccionActivoFijo indicecorreccionactivofijo:indicecorreccionactivofijosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(indicecorreccionactivofijo.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case IndiceCorreccionActivoFijoConstantesFunciones.LABEL_ANIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(IndiceCorreccionActivoFijoConstantesFunciones.LABEL_ANIO);
					iRow++;

					for(IndiceCorreccionActivoFijo indicecorreccionactivofijo:indicecorreccionactivofijosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(indicecorreccionactivofijo.getanio());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case IndiceCorreccionActivoFijoConstantesFunciones.LABEL_VALOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(IndiceCorreccionActivoFijoConstantesFunciones.LABEL_VALOR);
					iRow++;

					for(IndiceCorreccionActivoFijo indicecorreccionactivofijo:indicecorreccionactivofijosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(indicecorreccionactivofijo.getvalor());
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
			//	this.getFilaCabeceraExportarExcelIndiceCorreccionActivoFijo(row);				
			//	iRow++;
			//}				
			
			//for(IndiceCorreccionActivoFijo indicecorreccionactivofijoAux:indicecorreccionactivofijosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelIndiceCorreccionActivoFijo(indicecorreccionactivofijoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.indicecorreccionactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Indice Correccion Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
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
				this.indicecorreccionactivofijoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingIndiceCorreccionActivoFijo(false);
			
			//SI ES MANUAL
			if(IndiceCorreccionActivoFijoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualIndiceCorreccionActivoFijo();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.indicecorreccionactivofijoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.indicecorreccionactivofijoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.indicecorreccionactivofijoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresIndiceCorreccionActivoFijoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.indicecorreccionactivofijoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingIndiceCorreccionActivoFijo(false);
			
			//SI ES MANUAL
			if(IndiceCorreccionActivoFijoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualIndiceCorreccionActivoFijo();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.indicecorreccionactivofijoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.indicecorreccionactivofijoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.indicecorreccionactivofijoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesIndiceCorreccionActivoFijoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.indicecorreccionactivofijoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingIndiceCorreccionActivoFijo(false);
			
			//SI ES MANUAL
			if(IndiceCorreccionActivoFijoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualIndiceCorreccionActivoFijo();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.indicecorreccionactivofijoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.indicecorreccionactivofijoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.indicecorreccionactivofijoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaIndiceCorreccionActivoFijo() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosIndiceCorreccionActivoFijo.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosIndiceCorreccionActivoFijo.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosIndiceCorreccionActivoFijo.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosIndiceCorreccionActivoFijo.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosIndiceCorreccionActivoFijo.setMinimumSize(dimensionMinimum);
		this.jTableDatosIndiceCorreccionActivoFijo.setMaximumSize(dimensionMaximum);
		this.jTableDatosIndiceCorreccionActivoFijo.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingIndiceCorreccionActivoFijo(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingIndiceCorreccionActivoFijo(esInicializar,true);
	}
	
	public void inicializarActualizarBindingIndiceCorreccionActivoFijo(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaIndiceCorreccionActivoFijo(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesIndiceCorreccionActivoFijo(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.indicecorreccionactivofijoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasIndiceCorreccionActivoFijo(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesIndiceCorreccionActivoFijo(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesIndiceCorreccionActivoFijo(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !IndiceCorreccionActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!IndiceCorreccionActivoFijoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualIndiceCorreccionActivoFijo() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaIndiceCorreccionActivoFijo();
		
		this.inicializarActualizarBindingBotonesManualIndiceCorreccionActivoFijo(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.indicecorreccionactivofijoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualIndiceCorreccionActivoFijo();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesIndiceCorreccionActivoFijo() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualIndiceCorreccionActivoFijo(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualIndiceCorreccionActivoFijo(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosIndiceCorreccionActivoFijo.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosIndiceCorreccionActivoFijo.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteIndiceCorreccionActivoFijo.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jCheckBoxPostAccionNuevoIndiceCorreccionActivoFijo.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jCheckBoxPostAccionSinCerrarIndiceCorreccionActivoFijo.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jCheckBoxPostAccionSinMensajeIndiceCorreccionActivoFijo.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosIndiceCorreccionActivoFijo.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosIndiceCorreccionActivoFijo.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteIndiceCorreccionActivoFijo.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo!=null) {
				this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jCheckBoxPostAccionNuevoIndiceCorreccionActivoFijo.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jCheckBoxPostAccionSinCerrarIndiceCorreccionActivoFijo.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jCheckBoxPostAccionSinMensajeIndiceCorreccionActivoFijo.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionIndiceCorreccionActivoFijo.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionIndiceCorreccionActivoFijo.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jComboBoxTiposAccionesFormularioIndiceCorreccionActivoFijo.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesIndiceCorreccionActivoFijo.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoIndiceCorreccionActivoFijo!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoIndiceCorreccionActivoFijo.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesIndiceCorreccionActivoFijo.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesIndiceCorreccionActivoFijo.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarIndiceCorreccionActivoFijo.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesIndiceCorreccionActivoFijo.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoIndiceCorreccionActivoFijo!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoIndiceCorreccionActivoFijo.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesIndiceCorreccionActivoFijo.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralIndiceCorreccionActivoFijo.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesIndiceCorreccionActivoFijo(Boolean esInicializar) throws Exception {
		try	{	
			if(IndiceCorreccionActivoFijoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualIndiceCorreccionActivoFijo(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesIndiceCorreccionActivoFijo() throws Exception {
		try	{
			if(IndiceCorreccionActivoFijoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualIndiceCorreccionActivoFijo();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleIndiceCorreccionActivoFijo() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jComboBoxTiposAccionesFormularioIndiceCorreccionActivoFijo.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jComboBoxTiposAccionesFormularioIndiceCorreccionActivoFijo.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualIndiceCorreccionActivoFijo() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesIndiceCorreccionActivoFijo.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesIndiceCorreccionActivoFijo.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesIndiceCorreccionActivoFijo.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesIndiceCorreccionActivoFijo.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesIndiceCorreccionActivoFijo.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesIndiceCorreccionActivoFijo.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionIndiceCorreccionActivoFijo.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionIndiceCorreccionActivoFijo.addItem(reporte);
			}
			
			
			if(!this.indicecorreccionactivofijoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionIndiceCorreccionActivoFijo.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionIndiceCorreccionActivoFijo.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesIndiceCorreccionActivoFijo.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesIndiceCorreccionActivoFijo.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesIndiceCorreccionActivoFijo.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesIndiceCorreccionActivoFijo.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jComboBoxTiposAccionesFormularioIndiceCorreccionActivoFijo.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jComboBoxTiposAccionesFormularioIndiceCorreccionActivoFijo.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarIndiceCorreccionActivoFijo.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarIndiceCorreccionActivoFijo.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarIndiceCorreccionActivoFijo.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualIndiceCorreccionActivoFijo();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualIndiceCorreccionActivoFijo() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoIndiceCorreccionActivoFijo!=null) {
				this.jInternalFrameReporteDinamicoIndiceCorreccionActivoFijo.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoIndiceCorreccionActivoFijo.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoIndiceCorreccionActivoFijo!=null) {
				this.jInternalFrameReporteDinamicoIndiceCorreccionActivoFijo.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoIndiceCorreccionActivoFijo.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoIndiceCorreccionActivoFijo!=null) {
				
				if(this.jInternalFrameReporteDinamicoIndiceCorreccionActivoFijo.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoIndiceCorreccionActivoFijo.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoIndiceCorreccionActivoFijo.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoIndiceCorreccionActivoFijo.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoIndiceCorreccionActivoFijo.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoIndiceCorreccionActivoFijo.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoIndiceCorreccionActivoFijo.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoIndiceCorreccionActivoFijo.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=IndiceCorreccionActivoFijoConstantesFunciones.getTiposSeleccionarIndiceCorreccionActivoFijo(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoIndiceCorreccionActivoFijo.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoIndiceCorreccionActivoFijo.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoIndiceCorreccionActivoFijo.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=IndiceCorreccionActivoFijoConstantesFunciones.getTiposSeleccionarIndiceCorreccionActivoFijo(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoIndiceCorreccionActivoFijo.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoIndiceCorreccionActivoFijo.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoIndiceCorreccionActivoFijo.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=IndiceCorreccionActivoFijoConstantesFunciones.getTiposSeleccionarIndiceCorreccionActivoFijo(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoIndiceCorreccionActivoFijo.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoIndiceCorreccionActivoFijo.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoIndiceCorreccionActivoFijo.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoIndiceCorreccionActivoFijo.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualIndiceCorreccionActivoFijo()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasIndiceCorreccionActivoFijo(Boolean esInicializar) throws Exception {				
		if(IndiceCorreccionActivoFijoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualIndiceCorreccionActivoFijo();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaIndiceCorreccionActivoFijo() throws Exception {
		this.inicializarActualizarBindingTablaIndiceCorreccionActivoFijo(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByIndiceCorreccionActivoFijo() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByIndiceCorreccionActivoFijo.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByIndiceCorreccionActivoFijo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByIndiceCorreccionActivoFijo.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new IndiceCorreccionActivoFijoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByIndiceCorreccionActivoFijo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByIndiceCorreccionActivoFijo.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new IndiceCorreccionActivoFijoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosIndiceCorreccionActivoFijoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosIndiceCorreccionActivoFijoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new IndiceCorreccionActivoFijoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByIndiceCorreccionActivoFijo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByIndiceCorreccionActivoFijo.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new IndiceCorreccionActivoFijoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByIndiceCorreccionActivoFijo.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaIndiceCorreccionActivoFijo(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=indicecorreccionactivofijos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(IndiceCorreccionActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosIndiceCorreccionActivoFijo.setModel(new IndiceCorreccionActivoFijoModel(this.indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosIndiceCorreccionActivoFijo.setModel(new IndiceCorreccionActivoFijoModel(this.indicecorreccionactivofijos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByIndiceCorreccionActivoFijo!=null && this.jInternalFrameOrderByIndiceCorreccionActivoFijo.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByIndiceCorreccionActivoFijo();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosIndiceCorreccionActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosIndiceCorreccionActivoFijo,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new IndiceCorreccionActivoFijoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+IndiceCorreccionActivoFijoConstantesFunciones.SCLASSWEBTITULO,indicecorreccionactivofijoConstantesFunciones.resaltarSeleccionarIndiceCorreccionActivoFijo,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+IndiceCorreccionActivoFijoConstantesFunciones.SCLASSWEBTITULO,indicecorreccionactivofijoConstantesFunciones.resaltarSeleccionarIndiceCorreccionActivoFijo,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosIndiceCorreccionActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosIndiceCorreccionActivoFijo,IndiceCorreccionActivoFijoConstantesFunciones.LABEL_ID));

		if(this.indicecorreccionactivofijoConstantesFunciones.mostraridIndiceCorreccionActivoFijo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,IndiceCorreccionActivoFijoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.indicecorreccionactivofijoConstantesFunciones.resaltaridIndiceCorreccionActivoFijo,this.indicecorreccionactivofijoConstantesFunciones.activaridIndiceCorreccionActivoFijo,iSizeTabla,this,true,"idIndiceCorreccionActivoFijo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.indicecorreccionactivofijoConstantesFunciones.resaltaridIndiceCorreccionActivoFijo,this.indicecorreccionactivofijoConstantesFunciones.activaridIndiceCorreccionActivoFijo,this,true,"idIndiceCorreccionActivoFijo","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosIndiceCorreccionActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosIndiceCorreccionActivoFijo,IndiceCorreccionActivoFijoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.indicecorreccionactivofijoConstantesFunciones.mostrarid_empresaIndiceCorreccionActivoFijo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,IndiceCorreccionActivoFijoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.indicecorreccionactivofijoConstantesFunciones.resaltarid_empresaIndiceCorreccionActivoFijo,this,this.indicecorreccionactivofijoConstantesFunciones.activarid_empresaIndiceCorreccionActivoFijo,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.indicecorreccionactivofijoConstantesFunciones.resaltarid_empresaIndiceCorreccionActivoFijo,this,this.indicecorreccionactivofijoConstantesFunciones.activarid_empresaIndiceCorreccionActivoFijo,false,"id_empresaIndiceCorreccionActivoFijo","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new IndiceCorreccionActivoFijoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosIndiceCorreccionActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosIndiceCorreccionActivoFijo,IndiceCorreccionActivoFijoConstantesFunciones.LABEL_ANIO));

		if(this.indicecorreccionactivofijoConstantesFunciones.mostraranioIndiceCorreccionActivoFijo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,IndiceCorreccionActivoFijoConstantesFunciones.LABEL_ANIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.indicecorreccionactivofijoConstantesFunciones.resaltaranioIndiceCorreccionActivoFijo,this.indicecorreccionactivofijoConstantesFunciones.activaranioIndiceCorreccionActivoFijo,iSizeTabla,this,true,"anioIndiceCorreccionActivoFijo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.indicecorreccionactivofijoConstantesFunciones.resaltaranioIndiceCorreccionActivoFijo,this.indicecorreccionactivofijoConstantesFunciones.activaranioIndiceCorreccionActivoFijo,this,true,"anioIndiceCorreccionActivoFijo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new IndiceCorreccionActivoFijoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosIndiceCorreccionActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosIndiceCorreccionActivoFijo,IndiceCorreccionActivoFijoConstantesFunciones.LABEL_VALOR));

		if(this.indicecorreccionactivofijoConstantesFunciones.mostrarvalorIndiceCorreccionActivoFijo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,IndiceCorreccionActivoFijoConstantesFunciones.LABEL_VALOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.indicecorreccionactivofijoConstantesFunciones.resaltarvalorIndiceCorreccionActivoFijo,this.indicecorreccionactivofijoConstantesFunciones.activarvalorIndiceCorreccionActivoFijo,iSizeTabla,this,true,"valorIndiceCorreccionActivoFijo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.indicecorreccionactivofijoConstantesFunciones.resaltarvalorIndiceCorreccionActivoFijo,this.indicecorreccionactivofijoConstantesFunciones.activarvalorIndiceCorreccionActivoFijo,this,true,"valorIndiceCorreccionActivoFijo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new IndiceCorreccionActivoFijoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.indicecorreccionactivofijoSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.indicecorreccionactivofijoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.indicecorreccionactivofijoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosIndiceCorreccionActivoFijo.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.indicecorreccionactivofijoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.indicecorreccionactivofijoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosIndiceCorreccionActivoFijo.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarIndiceCorreccionActivoFijo && this.isPermisoGuardarCambiosIndiceCorreccionActivoFijo) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.indicecorreccionactivofijoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.indicecorreccionactivofijoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosIndiceCorreccionActivoFijo.addColumn(tableColumn);
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
			
			this.jTableDatosIndiceCorreccionActivoFijo.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarIndiceCorreccionActivoFijo && this.isPermisoGuardarCambiosIndiceCorreccionActivoFijo) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarIndiceCorreccionActivoFijo && this.isPermisoGuardarCambiosIndiceCorreccionActivoFijo) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosIndiceCorreccionActivoFijo.moveColumn(this.jTableDatosIndiceCorreccionActivoFijo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosIndiceCorreccionActivoFijo.moveColumn(this.jTableDatosIndiceCorreccionActivoFijo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosIndiceCorreccionActivoFijo.moveColumn(this.jTableDatosIndiceCorreccionActivoFijo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosIndiceCorreccionActivoFijo.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosIndiceCorreccionActivoFijo.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosIndiceCorreccionActivoFijo,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!IndiceCorreccionActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosIndiceCorreccionActivoFijo.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosIndiceCorreccionActivoFijo.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!IndiceCorreccionActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!IndiceCorreccionActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosIndiceCorreccionActivoFijo.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosIndiceCorreccionActivoFijo.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosIndiceCorreccionActivoFijo.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=indicecorreccionactivofijos.size()-1;
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
		//this.jTableDatosIndiceCorreccionActivoFijo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosIndiceCorreccionActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosIndiceCorreccionActivoFijo();
			
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
				
				//this.isEsNuevoIndiceCorreccionActivoFijo=false;
					
				IndiceCorreccionActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.indicecorreccionactivofijo,new Object(),this.indicecorreccionactivofijoParameterGeneral,this.indicecorreccionactivofijoReturnGeneral);
			
				if(this.indicecorreccionactivofijoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosIndiceCorreccionActivoFijo.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosIndiceCorreccionActivoFijo.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.indicecorreccionactivofijo =(IndiceCorreccionActivoFijo) this.indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijos().toArray()[this.jTableDatosIndiceCorreccionActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.indicecorreccionactivofijo =(IndiceCorreccionActivoFijo) this.indicecorreccionactivofijos.toArray()[this.jTableDatosIndiceCorreccionActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.indicecorreccionactivofijo.getsType().equals("DUPLICADO")
				   || this.indicecorreccionactivofijo.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoIndiceCorreccionActivoFijo=true;
				
				} else {
					this.isEsNuevoIndiceCorreccionActivoFijo=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.indicecorreccionactivofijoSessionBean.getEsGuardarRelacionado()) {
					if(this.indicecorreccionactivofijo.getId()>=0 && !this.indicecorreccionactivofijo.getIsNew()) {						
						this.isEsNuevoIndiceCorreccionActivoFijo=false;
						
					} else {
						this.isEsNuevoIndiceCorreccionActivoFijo=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoIndiceCorreccionActivoFijo(esRelaciones);						
				
				this.seleccionarIndiceCorreccionActivoFijo(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.indicecorreccionactivofijo.getId()<0) {
					this.isEsNuevoIndiceCorreccionActivoFijo=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarIndiceCorreccionActivoFijo(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarIndiceCorreccionActivoFijo(evt,rowIndex);
				}	
				
				if(this.indicecorreccionactivofijoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion IndiceCorreccionActivoFijo: " + this.dDif); 
					}
				}								
				
				IndiceCorreccionActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.indicecorreccionactivofijo,new Object(),this.indicecorreccionactivofijoParameterGeneral,this.indicecorreccionactivofijoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarIndiceCorreccionActivoFijo(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.indicecorreccionactivofijo)) {
					if(this.indicecorreccionactivofijo.getId()>0) {
						this.indicecorreccionactivofijo.setIsDeleted(true);
						
						this.indicecorreccionactivofijosEliminados.add(this.indicecorreccionactivofijo);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijos().remove(this.indicecorreccionactivofijo);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.indicecorreccionactivofijos.remove(this.indicecorreccionactivofijo);				
					}
					
					
					((IndiceCorreccionActivoFijoModel) this.jTableDatosIndiceCorreccionActivoFijo.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaIndiceCorreccionActivoFijo(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarIndiceCorreccionActivoFijo(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoIndiceCorreccionActivoFijo) {
			
			if(this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosIndiceCorreccionActivoFijo.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosIndiceCorreccionActivoFijo.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.indicecorreccionactivofijo =(IndiceCorreccionActivoFijo) this.indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijos().toArray()[this.jTableDatosIndiceCorreccionActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.indicecorreccionactivofijo =(IndiceCorreccionActivoFijo) this.indicecorreccionactivofijos.toArray()[this.jTableDatosIndiceCorreccionActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(IndiceCorreccionActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioIndiceCorreccionActivoFijo(this.indicecorreccionactivofijo);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.indicecorreccionactivofijoConstantesFunciones.cargarid_empresaIndiceCorreccionActivoFijo || this.indicecorreccionactivofijoConstantesFunciones.event_dependid_empresaIndiceCorreccionActivoFijo) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.indicecorreccionactivofijo.getid_empresa());
									//this.inicializarActualizarBindingIndiceCorreccionActivoFijo(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(indicecorreccionactivofijo.getEmpresa()!=null) {
							this.empresasForeignKey.add(indicecorreccionactivofijo.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.indicecorreccionactivofijo.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesIndiceCorreccionActivoFijo("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesIndiceCorreccionActivoFijo(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualIndiceCorreccionActivoFijo() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoIndiceCorreccionActivoFijo(IndiceCorreccionActivoFijo indicecorreccionactivofijo) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoIndiceCorreccionActivoFijo(indicecorreccionactivofijo,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoIndiceCorreccionActivoFijo(IndiceCorreccionActivoFijo indicecorreccionactivofijo,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioIndiceCorreccionActivoFijo(indicecorreccionactivofijo);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyIndiceCorreccionActivoFijo(indicecorreccionactivofijo,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyIndiceCorreccionActivoFijo(indicecorreccionactivofijo);
	}
	
	public void setVariablesObjetoActualToFormularioIndiceCorreccionActivoFijo(IndiceCorreccionActivoFijo indicecorreccionactivofijo) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jLabelidIndiceCorreccionActivoFijo.setText(indicecorreccionactivofijo.getId().toString());
			this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jTextFieldanioIndiceCorreccionActivoFijo.setText(indicecorreccionactivofijo.getanio().toString());
			this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jTextFieldvalorIndiceCorreccionActivoFijo.setText(indicecorreccionactivofijo.getvalor().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,IndiceCorreccionActivoFijo indicecorreccionactivofijoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,indicecorreccionactivofijoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,IndiceCorreccionActivoFijo indicecorreccionactivofijoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				indicecorreccionactivofijoLocal=this.indicecorreccionactivofijo;
			} else {
				indicecorreccionactivofijoLocal=this.indicecorreccionactivofijoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(indicecorreccionactivofijoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoIndiceCorreccionActivoFijo(indicecorreccionactivofijoLocal,true);
					
					if(indicecorreccionactivofijoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(indicecorreccionactivofijoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.indicecorreccionactivofijoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(indicecorreccionactivofijoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoIndiceCorreccionActivoFijo(IndiceCorreccionActivoFijo indicecorreccionactivofijo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualIndiceCorreccionActivoFijo(indicecorreccionactivofijo,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysIndiceCorreccionActivoFijo(indicecorreccionactivofijo);
	}
	
	public void setVariablesFormularioToObjetoActualIndiceCorreccionActivoFijo(IndiceCorreccionActivoFijo indicecorreccionactivofijo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualIndiceCorreccionActivoFijo(indicecorreccionactivofijo,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualIndiceCorreccionActivoFijo(IndiceCorreccionActivoFijo indicecorreccionactivofijo,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jLabelidIndiceCorreccionActivoFijo.getText()==null || this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jLabelidIndiceCorreccionActivoFijo.getText()=="" || this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jLabelidIndiceCorreccionActivoFijo.getText()=="Id") {
				this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jLabelidIndiceCorreccionActivoFijo.setText("0");
			}

			if(conColumnasBase) {indicecorreccionactivofijo.setId(Long.parseLong(this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jLabelidIndiceCorreccionActivoFijo.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+IndiceCorreccionActivoFijoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jLabelIdIndiceCorreccionActivoFijo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			indicecorreccionactivofijo.setanio(Integer.parseInt(this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jTextFieldanioIndiceCorreccionActivoFijo.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+IndiceCorreccionActivoFijoConstantesFunciones.LABEL_ANIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jLabelanioIndiceCorreccionActivoFijo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			indicecorreccionactivofijo.setvalor(Double.parseDouble(this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jTextFieldvalorIndiceCorreccionActivoFijo.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+IndiceCorreccionActivoFijoConstantesFunciones.LABEL_VALOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jLabelvalorIndiceCorreccionActivoFijo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualIndiceCorreccionActivoFijo(IndiceCorreccionActivoFijo indicecorreccionactivofijoBean,IndiceCorreccionActivoFijo indicecorreccionactivofijo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosIndiceCorreccionActivoFijo(IndiceCorreccionActivoFijo indicecorreccionactivofijoOrigen,IndiceCorreccionActivoFijo indicecorreccionactivofijo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && indicecorreccionactivofijoOrigen.getId()!=null && !indicecorreccionactivofijoOrigen.getId().equals(0L))) {indicecorreccionactivofijo.setId(indicecorreccionactivofijoOrigen.getId());}}
			if(conDefault || (!conDefault && indicecorreccionactivofijoOrigen.getanio()!=null && !indicecorreccionactivofijoOrigen.getanio().equals(0))) {indicecorreccionactivofijo.setanio(indicecorreccionactivofijoOrigen.getanio());}
			if(conDefault || (!conDefault && indicecorreccionactivofijoOrigen.getvalor()!=null && !indicecorreccionactivofijoOrigen.getvalor().equals(0.0))) {indicecorreccionactivofijo.setvalor(indicecorreccionactivofijoOrigen.getvalor());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioIndiceCorreccionActivoFijo(IndiceCorreccionActivoFijo indicecorreccionactivofijo) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jLabelidIndiceCorreccionActivoFijo.setText(indicecorreccionactivofijo.getId().toString());
			this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jTextFieldanioIndiceCorreccionActivoFijo.setText(indicecorreccionactivofijo.getanio().toString());
			this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jTextFieldvalorIndiceCorreccionActivoFijo.setText(indicecorreccionactivofijo.getvalor().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioIndiceCorreccionActivoFijo(IndiceCorreccionActivoFijoBean indicecorreccionactivofijoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jLabelidIndiceCorreccionActivoFijo.setText(indicecorreccionactivofijoBean.getId().toString());
			this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jTextFieldanioIndiceCorreccionActivoFijo.setText(indicecorreccionactivofijoBean.getanio().toString());
			this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jTextFieldvalorIndiceCorreccionActivoFijo.setText(indicecorreccionactivofijoBean.getvalor().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanIndiceCorreccionActivoFijo(IndiceCorreccionActivoFijoParameterReturnGeneral indicecorreccionactivofijoReturnGeneral,IndiceCorreccionActivoFijoBean indicecorreccionactivofijoBean,Boolean conDefault) throws Exception { 
		try {
			IndiceCorreccionActivoFijo indicecorreccionactivofijoLocal=new IndiceCorreccionActivoFijo();
			
			indicecorreccionactivofijoLocal=indicecorreccionactivofijoReturnGeneral.getIndiceCorreccionActivoFijo();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && indicecorreccionactivofijoLocal.getId()!=null && !indicecorreccionactivofijoLocal.getId().equals(0L))) {indicecorreccionactivofijoBean.setId(indicecorreccionactivofijoLocal.getId());}}
			if(conDefault || (!conDefault && indicecorreccionactivofijoLocal.getanio()!=null && !indicecorreccionactivofijoLocal.getanio().equals(0))) {indicecorreccionactivofijoBean.setanio(indicecorreccionactivofijoLocal.getanio());}
			if(conDefault || (!conDefault && indicecorreccionactivofijoLocal.getvalor()!=null && !indicecorreccionactivofijoLocal.getvalor().equals(0.0))) {indicecorreccionactivofijoBean.setvalor(indicecorreccionactivofijoLocal.getvalor());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxIndiceCorreccionActivoFijoGenerico(Long idIndiceCorreccionActivoFijoSeleccionado,JComboBox jComboBoxIndiceCorreccionActivoFijo,List<IndiceCorreccionActivoFijo> indicecorreccionactivofijosLocal)throws Exception {
		try {
			IndiceCorreccionActivoFijo  indicecorreccionactivofijoTemp=null;

			for(IndiceCorreccionActivoFijo indicecorreccionactivofijoAux:indicecorreccionactivofijosLocal) {
				if(indicecorreccionactivofijoAux.getId()!=null && indicecorreccionactivofijoAux.getId().equals(idIndiceCorreccionActivoFijoSeleccionado)) {
					indicecorreccionactivofijoTemp=indicecorreccionactivofijoAux;
					break;
				}
			}

			jComboBoxIndiceCorreccionActivoFijo.setSelectedItem(indicecorreccionactivofijoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxIndiceCorreccionActivoFijoGenerico(JComboBox jComboBoxIndiceCorreccionActivoFijo,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxIndiceCorreccionActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxIndiceCorreccionActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxIndiceCorreccionActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxIndiceCorreccionActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxIndiceCorreccionActivoFijo.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxIndiceCorreccionActivoFijo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxIndiceCorreccionActivoFijo.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxIndiceCorreccionActivoFijo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxIndiceCorreccionActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxIndiceCorreccionActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			indicecorreccionactivofijo=(IndiceCorreccionActivoFijo) indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			indicecorreccionactivofijo =(IndiceCorreccionActivoFijo) indicecorreccionactivofijos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!indicecorreccionactivofijo.getIsNew() && !indicecorreccionactivofijo.getIsChanged() && !indicecorreccionactivofijo.getIsDeleted()) {
				sDescripcion=indicecorreccionactivofijo.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=indicecorreccionactivofijo.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		IndiceCorreccionActivoFijo indicecorreccionactivofijoRow=new IndiceCorreccionActivoFijo();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			indicecorreccionactivofijoRow=(IndiceCorreccionActivoFijo) indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			indicecorreccionactivofijoRow=(IndiceCorreccionActivoFijo) indicecorreccionactivofijos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualIndiceCorreccionActivoFijo(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoIndiceCorreccionActivoFijo.setVisible((this.isVisibilidadCeldaNuevoIndiceCorreccionActivoFijo && this.isPermisoNuevoIndiceCorreccionActivoFijo));			
			this.jButtonDuplicarIndiceCorreccionActivoFijo.setVisible((this.isVisibilidadCeldaDuplicarIndiceCorreccionActivoFijo && this.isPermisoDuplicarIndiceCorreccionActivoFijo));			
			this.jButtonCopiarIndiceCorreccionActivoFijo.setVisible((this.isVisibilidadCeldaCopiarIndiceCorreccionActivoFijo && this.isPermisoCopiarIndiceCorreccionActivoFijo));
			this.jButtonVerFormIndiceCorreccionActivoFijo.setVisible((this.isVisibilidadCeldaVerFormIndiceCorreccionActivoFijo && this.isPermisoVerFormIndiceCorreccionActivoFijo));
			
			this.jButtonAbrirOrderByIndiceCorreccionActivoFijo.setVisible((this.isVisibilidadCeldaOrdenIndiceCorreccionActivoFijo && this.isPermisoOrdenIndiceCorreccionActivoFijo));			
			
			this.jButtonNuevoRelacionesIndiceCorreccionActivoFijo.setVisible((this.isVisibilidadCeldaNuevoRelacionesIndiceCorreccionActivoFijo && this.isPermisoNuevoIndiceCorreccionActivoFijo));			
			this.jButtonNuevoGuardarCambiosIndiceCorreccionActivoFijo.setVisible((this.isVisibilidadCeldaNuevoIndiceCorreccionActivoFijo && this.isPermisoNuevoIndiceCorreccionActivoFijo && this.isPermisoGuardarCambiosIndiceCorreccionActivoFijo));
			
			if(this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo!=null) {
			this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jButtonModificarIndiceCorreccionActivoFijo.setVisible((this.isVisibilidadCeldaModificarIndiceCorreccionActivoFijo && this.isPermisoActualizarIndiceCorreccionActivoFijo));	
			this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jButtonActualizarIndiceCorreccionActivoFijo.setVisible((this.isVisibilidadCeldaActualizarIndiceCorreccionActivoFijo && this.isPermisoActualizarIndiceCorreccionActivoFijo));	
			this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jButtonEliminarIndiceCorreccionActivoFijo.setVisible((this.isVisibilidadCeldaEliminarIndiceCorreccionActivoFijo && this.isPermisoEliminarIndiceCorreccionActivoFijo));
			this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jButtonCancelarIndiceCorreccionActivoFijo.setVisible(this.isVisibilidadCeldaCancelarIndiceCorreccionActivoFijo);							
			this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jButtonGuardarCambiosIndiceCorreccionActivoFijo.setVisible((this.isVisibilidadCeldaGuardarIndiceCorreccionActivoFijo && this.isPermisoGuardarCambiosIndiceCorreccionActivoFijo));			
			
			}
						
			this.jButtonGuardarCambiosTablaIndiceCorreccionActivoFijo.setVisible((this.isVisibilidadCeldaGuardarCambiosIndiceCorreccionActivoFijo && this.isPermisoGuardarCambiosIndiceCorreccionActivoFijo));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarIndiceCorreccionActivoFijo.setVisible((this.isVisibilidadCeldaNuevoIndiceCorreccionActivoFijo && this.isPermisoNuevoIndiceCorreccionActivoFijo));						
			this.jButtonDuplicarToolBarIndiceCorreccionActivoFijo.setVisible((this.isVisibilidadCeldaDuplicarIndiceCorreccionActivoFijo && this.isPermisoDuplicarIndiceCorreccionActivoFijo));						
			this.jButtonCopiarToolBarIndiceCorreccionActivoFijo.setVisible((this.isVisibilidadCeldaCopiarIndiceCorreccionActivoFijo && this.isPermisoCopiarIndiceCorreccionActivoFijo));			
			this.jButtonVerFormToolBarIndiceCorreccionActivoFijo.setVisible((this.isVisibilidadCeldaVerFormIndiceCorreccionActivoFijo && this.isPermisoVerFormIndiceCorreccionActivoFijo));			
			this.jButtonAbrirOrderByToolBarIndiceCorreccionActivoFijo.setVisible((this.isVisibilidadCeldaOrdenIndiceCorreccionActivoFijo && this.isPermisoOrdenIndiceCorreccionActivoFijo));
			this.jButtonNuevoRelacionesToolBarIndiceCorreccionActivoFijo.setVisible((this.isVisibilidadCeldaNuevoRelacionesIndiceCorreccionActivoFijo && this.isPermisoNuevoIndiceCorreccionActivoFijo));			
			this.jButtonNuevoGuardarCambiosToolBarIndiceCorreccionActivoFijo.setVisible((this.isVisibilidadCeldaNuevoIndiceCorreccionActivoFijo && this.isPermisoNuevoIndiceCorreccionActivoFijo && this.isPermisoGuardarCambiosIndiceCorreccionActivoFijo));			
			
			if(this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo!=null) {
			this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jButtonModificarToolBarIndiceCorreccionActivoFijo.setVisible((this.isVisibilidadCeldaModificarIndiceCorreccionActivoFijo && this.isPermisoActualizarIndiceCorreccionActivoFijo));	
			this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jButtonActualizarToolBarIndiceCorreccionActivoFijo.setVisible((this.isVisibilidadCeldaActualizarIndiceCorreccionActivoFijo  && this.isPermisoActualizarIndiceCorreccionActivoFijo));	
			this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jButtonEliminarToolBarIndiceCorreccionActivoFijo.setVisible((this.isVisibilidadCeldaEliminarIndiceCorreccionActivoFijo && this.isPermisoEliminarIndiceCorreccionActivoFijo));
			this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jButtonCancelarToolBarIndiceCorreccionActivoFijo.setVisible(this.isVisibilidadCeldaCancelarIndiceCorreccionActivoFijo);				
			this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jButtonGuardarCambiosToolBarIndiceCorreccionActivoFijo.setVisible((this.isVisibilidadCeldaGuardarIndiceCorreccionActivoFijo && this.isPermisoGuardarCambiosIndiceCorreccionActivoFijo));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarIndiceCorreccionActivoFijo.setVisible((this.isVisibilidadCeldaGuardarCambiosIndiceCorreccionActivoFijo && this.isPermisoGuardarCambiosIndiceCorreccionActivoFijo));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoIndiceCorreccionActivoFijo.setVisible((this.isVisibilidadCeldaNuevoIndiceCorreccionActivoFijo && this.isPermisoNuevoIndiceCorreccionActivoFijo));			
			this.jMenuItemDuplicarIndiceCorreccionActivoFijo.setVisible((this.isVisibilidadCeldaDuplicarIndiceCorreccionActivoFijo && this.isPermisoDuplicarIndiceCorreccionActivoFijo));			
			this.jMenuItemCopiarIndiceCorreccionActivoFijo.setVisible((this.isVisibilidadCeldaCopiarIndiceCorreccionActivoFijo && this.isPermisoCopiarIndiceCorreccionActivoFijo));			
			this.jMenuItemVerFormIndiceCorreccionActivoFijo.setVisible((this.isVisibilidadCeldaVerFormIndiceCorreccionActivoFijo && this.isPermisoVerFormIndiceCorreccionActivoFijo));			
			this.jMenuItemAbrirOrderByIndiceCorreccionActivoFijo.setVisible((this.isVisibilidadCeldaOrdenIndiceCorreccionActivoFijo && this.isPermisoOrdenIndiceCorreccionActivoFijo));			
			//this.jMenuItemMostrarOcultarIndiceCorreccionActivoFijo.setVisible((this.isVisibilidadCeldaOrdenIndiceCorreccionActivoFijo && this.isPermisoOrdenIndiceCorreccionActivoFijo));
			this.jMenuItemDetalleAbrirOrderByIndiceCorreccionActivoFijo.setVisible((this.isVisibilidadCeldaOrdenIndiceCorreccionActivoFijo && this.isPermisoOrdenIndiceCorreccionActivoFijo));			
			//this.jMenuItemDetalleMostrarOcultarIndiceCorreccionActivoFijo.setVisible((this.isVisibilidadCeldaOrdenIndiceCorreccionActivoFijo && this.isPermisoOrdenIndiceCorreccionActivoFijo));			
			this.jMenuItemNuevoRelacionesIndiceCorreccionActivoFijo.setVisible((this.isVisibilidadCeldaNuevoRelacionesIndiceCorreccionActivoFijo && this.isPermisoNuevoIndiceCorreccionActivoFijo));			
			this.jMenuItemNuevoGuardarCambiosIndiceCorreccionActivoFijo.setVisible((this.isVisibilidadCeldaNuevoIndiceCorreccionActivoFijo && this.isPermisoNuevoIndiceCorreccionActivoFijo && this.isPermisoGuardarCambiosIndiceCorreccionActivoFijo));									
			
			if(this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo!=null) {
			this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jMenuItemModificarIndiceCorreccionActivoFijo.setVisible((this.isVisibilidadCeldaModificarIndiceCorreccionActivoFijo && this.isPermisoActualizarIndiceCorreccionActivoFijo));	
			this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jMenuItemActualizarIndiceCorreccionActivoFijo.setVisible((this.isVisibilidadCeldaActualizarIndiceCorreccionActivoFijo && this.isPermisoActualizarIndiceCorreccionActivoFijo));	
			this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jMenuItemEliminarIndiceCorreccionActivoFijo.setVisible((this.isVisibilidadCeldaEliminarIndiceCorreccionActivoFijo && this.isPermisoEliminarIndiceCorreccionActivoFijo));
			this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jMenuItemCancelarIndiceCorreccionActivoFijo.setVisible(this.isVisibilidadCeldaCancelarIndiceCorreccionActivoFijo);				
			}
			
			this.jMenuItemGuardarCambiosIndiceCorreccionActivoFijo.setVisible((this.isVisibilidadCeldaGuardarIndiceCorreccionActivoFijo && this.isPermisoGuardarCambiosIndiceCorreccionActivoFijo));						
			this.jMenuItemGuardarCambiosTablaIndiceCorreccionActivoFijo.setVisible((this.isVisibilidadCeldaGuardarCambiosIndiceCorreccionActivoFijo && this.isPermisoGuardarCambiosIndiceCorreccionActivoFijo));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoIndiceCorreccionActivoFijo=this.jButtonNuevoIndiceCorreccionActivoFijo.isVisible();
			this.isVisibilidadCeldaDuplicarIndiceCorreccionActivoFijo=this.jButtonDuplicarIndiceCorreccionActivoFijo.isVisible();
			this.isVisibilidadCeldaCopiarIndiceCorreccionActivoFijo=this.jButtonCopiarIndiceCorreccionActivoFijo.isVisible();
			this.isVisibilidadCeldaVerFormIndiceCorreccionActivoFijo=this.jButtonVerFormIndiceCorreccionActivoFijo.isVisible();
			
			this.isVisibilidadCeldaOrdenIndiceCorreccionActivoFijo=this.jButtonAbrirOrderByIndiceCorreccionActivoFijo.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesIndiceCorreccionActivoFijo=this.jButtonNuevoRelacionesIndiceCorreccionActivoFijo.isVisible();
			this.isVisibilidadCeldaModificarIndiceCorreccionActivoFijo=this.jButtonModificarIndiceCorreccionActivoFijo.isVisible();
			
			if(this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo!=null) {
			this.isVisibilidadCeldaActualizarIndiceCorreccionActivoFijo=this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jButtonActualizarIndiceCorreccionActivoFijo.isVisible();
			this.isVisibilidadCeldaEliminarIndiceCorreccionActivoFijo=this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jButtonEliminarIndiceCorreccionActivoFijo.isVisible();
			this.isVisibilidadCeldaCancelarIndiceCorreccionActivoFijo=this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jButtonCancelarIndiceCorreccionActivoFijo.isVisible();
			this.isVisibilidadCeldaGuardarIndiceCorreccionActivoFijo=this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jButtonGuardarCambiosIndiceCorreccionActivoFijo.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosIndiceCorreccionActivoFijo=this.jButtonGuardarCambiosTablaIndiceCorreccionActivoFijo.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoIndiceCorreccionActivoFijo=this.jButtonNuevoToolBarIndiceCorreccionActivoFijo.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesIndiceCorreccionActivoFijo=this.jButtonNuevoRelacionesToolBarIndiceCorreccionActivoFijo.isVisible();
			
			if(this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo!=null) {
			this.isVisibilidadCeldaModificarIndiceCorreccionActivoFijo=this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jButtonModificarToolBarIndiceCorreccionActivoFijo.isVisible();
			this.isVisibilidadCeldaActualizarIndiceCorreccionActivoFijo=this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jButtonActualizarToolBarIndiceCorreccionActivoFijo.isVisible();
			this.isVisibilidadCeldaEliminarIndiceCorreccionActivoFijo=this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jButtonEliminarToolBarIndiceCorreccionActivoFijo.isVisible();
			this.isVisibilidadCeldaCancelarIndiceCorreccionActivoFijo=this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jButtonCancelarToolBarIndiceCorreccionActivoFijo.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarIndiceCorreccionActivoFijo=this.jButtonGuardarCambiosToolBarIndiceCorreccionActivoFijo.isVisible();
			this.isVisibilidadCeldaGuardarCambiosIndiceCorreccionActivoFijo=this.jButtonGuardarCambiosTablaToolBarIndiceCorreccionActivoFijo.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoIndiceCorreccionActivoFijo=this.jMenuItemNuevoIndiceCorreccionActivoFijo.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesIndiceCorreccionActivoFijo=this.jMenuItemNuevoRelacionesIndiceCorreccionActivoFijo.isVisible();
			
			if(this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo!=null) {
			this.isVisibilidadCeldaModificarIndiceCorreccionActivoFijo=this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jMenuItemModificarIndiceCorreccionActivoFijo.isVisible();
			this.isVisibilidadCeldaActualizarIndiceCorreccionActivoFijo=this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jMenuItemActualizarIndiceCorreccionActivoFijo.isVisible();
			this.isVisibilidadCeldaEliminarIndiceCorreccionActivoFijo=this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jMenuItemEliminarIndiceCorreccionActivoFijo.isVisible();
			this.isVisibilidadCeldaCancelarIndiceCorreccionActivoFijo=this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jMenuItemCancelarIndiceCorreccionActivoFijo.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarIndiceCorreccionActivoFijo=this.jMenuItemGuardarCambiosIndiceCorreccionActivoFijo.isVisible();
			this.isVisibilidadCeldaGuardarCambiosIndiceCorreccionActivoFijo=this.jMenuItemGuardarCambiosTablaIndiceCorreccionActivoFijo.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesIndiceCorreccionActivoFijo(Boolean esInicializar) {
		if(IndiceCorreccionActivoFijoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.indicecorreccionactivofijoSessionBean.getConGuardarRelaciones()) {
				//if(this.indicecorreccionactivofijoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesIndiceCorreccionActivoFijo();
			}
			
			this.inicializarActualizarBindingBotonesManualIndiceCorreccionActivoFijo(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualIndiceCorreccionActivoFijo() {
		this.jButtonNuevoIndiceCorreccionActivoFijo.setVisible(this.isPermisoNuevoIndiceCorreccionActivoFijo);			
		this.jButtonDuplicarIndiceCorreccionActivoFijo.setVisible(this.isPermisoDuplicarIndiceCorreccionActivoFijo);			
		this.jButtonCopiarIndiceCorreccionActivoFijo.setVisible(this.isPermisoCopiarIndiceCorreccionActivoFijo);			
		this.jButtonVerFormIndiceCorreccionActivoFijo.setVisible(this.isPermisoVerFormIndiceCorreccionActivoFijo);			
		
		this.jButtonAbrirOrderByIndiceCorreccionActivoFijo.setVisible(this.isPermisoOrdenIndiceCorreccionActivoFijo);					
		
		this.jButtonNuevoRelacionesIndiceCorreccionActivoFijo.setVisible(this.isPermisoNuevoIndiceCorreccionActivoFijo);			
		
		if(this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jButtonModificarIndiceCorreccionActivoFijo.setVisible(this.isPermisoActualizarIndiceCorreccionActivoFijo);	
			this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jButtonActualizarIndiceCorreccionActivoFijo.setVisible(this.isPermisoActualizarIndiceCorreccionActivoFijo);	
			this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jButtonEliminarIndiceCorreccionActivoFijo.setVisible(this.isPermisoEliminarIndiceCorreccionActivoFijo);
			this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jButtonCancelarIndiceCorreccionActivoFijo.setVisible(this.isVisibilidadCeldaCancelarIndiceCorreccionActivoFijo);						
			this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jButtonGuardarCambiosIndiceCorreccionActivoFijo.setVisible(this.isPermisoGuardarCambiosIndiceCorreccionActivoFijo);							
		}
		
		this.jButtonGuardarCambiosTablaIndiceCorreccionActivoFijo.setVisible(this.isPermisoActualizarIndiceCorreccionActivoFijo);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleIndiceCorreccionActivoFijo() {
		this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jButtonModificarIndiceCorreccionActivoFijo.setVisible(this.isPermisoActualizarIndiceCorreccionActivoFijo);	
		this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jButtonActualizarIndiceCorreccionActivoFijo.setVisible(this.isPermisoActualizarIndiceCorreccionActivoFijo);	
		this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jButtonEliminarIndiceCorreccionActivoFijo.setVisible(this.isPermisoEliminarIndiceCorreccionActivoFijo);
		this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jButtonCancelarIndiceCorreccionActivoFijo.setVisible(this.isVisibilidadCeldaCancelarIndiceCorreccionActivoFijo);							
		this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jButtonGuardarCambiosIndiceCorreccionActivoFijo.setVisible((this.isVisibilidadCeldaGuardarIndiceCorreccionActivoFijo && this.isPermisoGuardarCambiosIndiceCorreccionActivoFijo));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosIndiceCorreccionActivoFijo() {
		if(IndiceCorreccionActivoFijoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualIndiceCorreccionActivoFijo();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesIndiceCorreccionActivoFijo() {
	}
	
	public void jTableDatosIndiceCorreccionActivoFijoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarIndiceCorreccionActivoFijo(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidIndiceCorreccionActivoFijoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.indicecorreccionactivofijoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosIndiceCorreccionActivoFijo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualIndiceCorreccionActivoFijo(this.getindicecorreccionactivofijo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysIndiceCorreccionActivoFijo(this.indicecorreccionactivofijo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.indicecorreccionactivofijo =(IndiceCorreccionActivoFijo) this.indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijos().toArray()[this.jTableDatosIndiceCorreccionActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.indicecorreccionactivofijo =(IndiceCorreccionActivoFijo) this.indicecorreccionactivofijos.toArray()[this.jTableDatosIndiceCorreccionActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.indicecorreccionactivofijo==null) {
						this.indicecorreccionactivofijo = new IndiceCorreccionActivoFijo();
					}

					this.setVariablesFormularioToObjetoActualIndiceCorreccionActivoFijo(this.indicecorreccionactivofijo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysIndiceCorreccionActivoFijo(this.indicecorreccionactivofijo);
				}

				if(this.indicecorreccionactivofijo.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.indicecorreccionactivofijo.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingIndiceCorreccionActivoFijo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.indicecorreccionactivofijoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.indicecorreccionactivofijoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.indicecorreccionactivofijoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaIndiceCorreccionActivoFijoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.indicecorreccionactivofijoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebIndiceCorreccionActivoFijo(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosIndiceCorreccionActivoFijo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosIndiceCorreccionActivoFijo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosIndiceCorreccionActivoFijo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.indicecorreccionactivofijo =(IndiceCorreccionActivoFijo) this.indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijos().toArray()[this.jTableDatosIndiceCorreccionActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.indicecorreccionactivofijo =(IndiceCorreccionActivoFijo) this.indicecorreccionactivofijos.toArray()[this.jTableDatosIndiceCorreccionActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualIndiceCorreccionActivoFijo(this.getindicecorreccionactivofijo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysIndiceCorreccionActivoFijo(this.indicecorreccionactivofijo);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.indicecorreccionactivofijoLogic.getConnexion());

				if(this.indicecorreccionactivofijo.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.indicecorreccionactivofijo.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderIndiceCorreccionActivoFijo=(TitledBorder)this.jScrollPanelDatosIndiceCorreccionActivoFijo.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderIndiceCorreccionActivoFijo.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.indicecorreccionactivofijoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.indicecorreccionactivofijoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.indicecorreccionactivofijoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaIndiceCorreccionActivoFijoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.indicecorreccionactivofijoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosIndiceCorreccionActivoFijo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualIndiceCorreccionActivoFijo(this.getindicecorreccionactivofijo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysIndiceCorreccionActivoFijo(this.indicecorreccionactivofijo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.indicecorreccionactivofijo =(IndiceCorreccionActivoFijo) this.indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijos().toArray()[this.jTableDatosIndiceCorreccionActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.indicecorreccionactivofijo =(IndiceCorreccionActivoFijo) this.indicecorreccionactivofijos.toArray()[this.jTableDatosIndiceCorreccionActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.indicecorreccionactivofijo==null) {
						this.indicecorreccionactivofijo = new IndiceCorreccionActivoFijo();
					}

					this.setVariablesFormularioToObjetoActualIndiceCorreccionActivoFijo(this.indicecorreccionactivofijo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysIndiceCorreccionActivoFijo(this.indicecorreccionactivofijo);
				}

				if(this.indicecorreccionactivofijo.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.indicecorreccionactivofijo.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingIndiceCorreccionActivoFijo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.indicecorreccionactivofijoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.indicecorreccionactivofijoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.indicecorreccionactivofijoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonanioIndiceCorreccionActivoFijoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.indicecorreccionactivofijoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosIndiceCorreccionActivoFijo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualIndiceCorreccionActivoFijo(this.getindicecorreccionactivofijo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysIndiceCorreccionActivoFijo(this.indicecorreccionactivofijo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.indicecorreccionactivofijo =(IndiceCorreccionActivoFijo) this.indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijos().toArray()[this.jTableDatosIndiceCorreccionActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.indicecorreccionactivofijo =(IndiceCorreccionActivoFijo) this.indicecorreccionactivofijos.toArray()[this.jTableDatosIndiceCorreccionActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.indicecorreccionactivofijo==null) {
						this.indicecorreccionactivofijo = new IndiceCorreccionActivoFijo();
					}

					this.setVariablesFormularioToObjetoActualIndiceCorreccionActivoFijo(this.indicecorreccionactivofijo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysIndiceCorreccionActivoFijo(this.indicecorreccionactivofijo);
				}

				if(this.indicecorreccionactivofijo.getanio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where anio = "+this.indicecorreccionactivofijo.getanio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingIndiceCorreccionActivoFijo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.indicecorreccionactivofijoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.indicecorreccionactivofijoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.indicecorreccionactivofijoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalorIndiceCorreccionActivoFijoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.indicecorreccionactivofijoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosIndiceCorreccionActivoFijo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualIndiceCorreccionActivoFijo(this.getindicecorreccionactivofijo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysIndiceCorreccionActivoFijo(this.indicecorreccionactivofijo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.indicecorreccionactivofijo =(IndiceCorreccionActivoFijo) this.indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijos().toArray()[this.jTableDatosIndiceCorreccionActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.indicecorreccionactivofijo =(IndiceCorreccionActivoFijo) this.indicecorreccionactivofijos.toArray()[this.jTableDatosIndiceCorreccionActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.indicecorreccionactivofijo==null) {
						this.indicecorreccionactivofijo = new IndiceCorreccionActivoFijo();
					}

					this.setVariablesFormularioToObjetoActualIndiceCorreccionActivoFijo(this.indicecorreccionactivofijo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysIndiceCorreccionActivoFijo(this.indicecorreccionactivofijo);
				}

				if(this.indicecorreccionactivofijo.getvalor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor = "+this.indicecorreccionactivofijo.getvalor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingIndiceCorreccionActivoFijo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.indicecorreccionactivofijoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.indicecorreccionactivofijoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.indicecorreccionactivofijoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaIndiceCorreccionActivoFijoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.indicecorreccionactivofijoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingIndiceCorreccionActivoFijo(false,false);

			this.getIndiceCorreccionActivoFijosFK_IdEmpresa();

			this.inicializarActualizarBindingIndiceCorreccionActivoFijo(false);

			//if(IndiceCorreccionActivoFijoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingIndiceCorreccionActivoFijo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.indicecorreccionactivofijoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.indicecorreccionactivofijoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.indicecorreccionactivofijoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameIndiceCorreccionActivoFijo() {
		if(this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo!=null) {
			this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.setVisible(false);	    			
			this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.dispose();
			this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoIndiceCorreccionActivoFijo!=null) {
			this.jInternalFrameReporteDinamicoIndiceCorreccionActivoFijo.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoIndiceCorreccionActivoFijo.dispose();
			this.jInternalFrameReporteDinamicoIndiceCorreccionActivoFijo=null;
		}
		
		if(this.jInternalFrameImportacionIndiceCorreccionActivoFijo!=null) {
			this.jInternalFrameImportacionIndiceCorreccionActivoFijo.setVisible(false);	    			
			this.jInternalFrameImportacionIndiceCorreccionActivoFijo.dispose();
			this.jInternalFrameImportacionIndiceCorreccionActivoFijo=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessIndiceCorreccionActivoFijo();
			
			IndiceCorreccionActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.indicecorreccionactivofijo,new Object(),this.indicecorreccionactivofijoParameterGeneral,this.indicecorreccionactivofijoReturnGeneral);
			
			
			if(sTipo.equals("NuevoIndiceCorreccionActivoFijo")) {
				jButtonNuevoIndiceCorreccionActivoFijoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarIndiceCorreccionActivoFijo")) {
				jButtonDuplicarIndiceCorreccionActivoFijoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarIndiceCorreccionActivoFijo")) {
				jButtonCopiarIndiceCorreccionActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("VerFormIndiceCorreccionActivoFijo")) {
				jButtonVerFormIndiceCorreccionActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarIndiceCorreccionActivoFijo")) {
				jButtonNuevoIndiceCorreccionActivoFijoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarIndiceCorreccionActivoFijo")) {
				jButtonDuplicarIndiceCorreccionActivoFijoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoIndiceCorreccionActivoFijo")) {
				jButtonNuevoIndiceCorreccionActivoFijoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarIndiceCorreccionActivoFijo")) {
				jButtonDuplicarIndiceCorreccionActivoFijoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesIndiceCorreccionActivoFijo")) {
				jButtonNuevoIndiceCorreccionActivoFijoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarIndiceCorreccionActivoFijo")) {
				jButtonNuevoIndiceCorreccionActivoFijoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesIndiceCorreccionActivoFijo")) {
				jButtonNuevoIndiceCorreccionActivoFijoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarIndiceCorreccionActivoFijo")) {
				jButtonModificarIndiceCorreccionActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarIndiceCorreccionActivoFijo")) {
				jButtonModificarIndiceCorreccionActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarIndiceCorreccionActivoFijo")) {
				jButtonModificarIndiceCorreccionActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarIndiceCorreccionActivoFijo")) {
				jButtonActualizarIndiceCorreccionActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarIndiceCorreccionActivoFijo")) {
				jButtonActualizarIndiceCorreccionActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarIndiceCorreccionActivoFijo")) {
				jButtonActualizarIndiceCorreccionActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("EliminarIndiceCorreccionActivoFijo")) {
				jButtonEliminarIndiceCorreccionActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarIndiceCorreccionActivoFijo")) {
				jButtonEliminarIndiceCorreccionActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarIndiceCorreccionActivoFijo")) {
				jButtonEliminarIndiceCorreccionActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("CancelarIndiceCorreccionActivoFijo")) {
				jButtonCancelarIndiceCorreccionActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarIndiceCorreccionActivoFijo")) {
				jButtonCancelarIndiceCorreccionActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarIndiceCorreccionActivoFijo")) {
				jButtonCancelarIndiceCorreccionActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("CerrarIndiceCorreccionActivoFijo")) {
				jButtonCerrarIndiceCorreccionActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarIndiceCorreccionActivoFijo")) {
				jButtonCerrarIndiceCorreccionActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarIndiceCorreccionActivoFijo")) {
				jButtonCerrarIndiceCorreccionActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarIndiceCorreccionActivoFijo")) {
				jButtonMostrarOcultarIndiceCorreccionActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarIndiceCorreccionActivoFijo")) {
				jButtonCancelarIndiceCorreccionActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosIndiceCorreccionActivoFijo")) {
				jButtonGuardarCambiosIndiceCorreccionActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarIndiceCorreccionActivoFijo")) {
				jButtonGuardarCambiosIndiceCorreccionActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarIndiceCorreccionActivoFijo")) {
				jButtonCopiarIndiceCorreccionActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarIndiceCorreccionActivoFijo")) {
				jButtonVerFormIndiceCorreccionActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosIndiceCorreccionActivoFijo")) {
				jButtonGuardarCambiosIndiceCorreccionActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarIndiceCorreccionActivoFijo")) {
				jButtonCopiarIndiceCorreccionActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormIndiceCorreccionActivoFijo")) {
				jButtonVerFormIndiceCorreccionActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaIndiceCorreccionActivoFijo")) {
				jButtonGuardarCambiosIndiceCorreccionActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarIndiceCorreccionActivoFijo")) {
				jButtonGuardarCambiosIndiceCorreccionActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaIndiceCorreccionActivoFijo")) {
				jButtonGuardarCambiosIndiceCorreccionActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionIndiceCorreccionActivoFijo")) {
				jButtonRecargarInformacionIndiceCorreccionActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarIndiceCorreccionActivoFijo")) {
				jButtonRecargarInformacionIndiceCorreccionActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionIndiceCorreccionActivoFijo")) {
				jButtonRecargarInformacionIndiceCorreccionActivoFijoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresIndiceCorreccionActivoFijo")) {
				jButtonAnterioresIndiceCorreccionActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarIndiceCorreccionActivoFijo")) {
				jButtonAnterioresIndiceCorreccionActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreIndiceCorreccionActivoFijo")) {
				jButtonAnterioresIndiceCorreccionActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesIndiceCorreccionActivoFijo")) {
				jButtonSiguientesIndiceCorreccionActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarIndiceCorreccionActivoFijo")) {
				jButtonSiguientesIndiceCorreccionActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesIndiceCorreccionActivoFijo")) {
				jButtonSiguientesIndiceCorreccionActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByIndiceCorreccionActivoFijo") || sTipo.equals("MenuItemDetalleAbrirOrderByIndiceCorreccionActivoFijo")) {
				jButtonAbrirOrderByIndiceCorreccionActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarIndiceCorreccionActivoFijo") || sTipo.equals("MenuItemDetalleMostrarOcultarIndiceCorreccionActivoFijo")) {
				jButtonMostrarOcultarIndiceCorreccionActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosIndiceCorreccionActivoFijo")) {
				jButtonNuevoGuardarCambiosIndiceCorreccionActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarIndiceCorreccionActivoFijo")) {
				jButtonNuevoGuardarCambiosIndiceCorreccionActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosIndiceCorreccionActivoFijo")) {
				jButtonNuevoGuardarCambiosIndiceCorreccionActivoFijoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoIndiceCorreccionActivoFijo")) {
				jButtonCerrarReporteDinamicoIndiceCorreccionActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoIndiceCorreccionActivoFijo")) {
				jButtonGenerarReporteDinamicoIndiceCorreccionActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoIndiceCorreccionActivoFijo")) {
				
				jButtonGenerarExcelReporteDinamicoIndiceCorreccionActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionIndiceCorreccionActivoFijo")) {
				jButtonCerrarImportacionIndiceCorreccionActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionIndiceCorreccionActivoFijo")) {
				
				jButtonGenerarImportacionIndiceCorreccionActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionIndiceCorreccionActivoFijo")) {
				
				jButtonAbrirImportacionIndiceCorreccionActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesIndiceCorreccionActivoFijo")) {
				jComboBoxTiposAccionesIndiceCorreccionActivoFijoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesIndiceCorreccionActivoFijo")) {
				jComboBoxTiposRelacionesIndiceCorreccionActivoFijoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioIndiceCorreccionActivoFijo")) {
				jComboBoxTiposAccionesIndiceCorreccionActivoFijoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarIndiceCorreccionActivoFijo")) {
				
				jComboBoxTiposSeleccionarIndiceCorreccionActivoFijoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralIndiceCorreccionActivoFijo")) {
				jTextFieldValorCampoGeneralIndiceCorreccionActivoFijoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByIndiceCorreccionActivoFijo")) {
				jButtonAbrirOrderByIndiceCorreccionActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarIndiceCorreccionActivoFijo")) {
				jButtonAbrirOrderByIndiceCorreccionActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByIndiceCorreccionActivoFijo")) {
				jButtonCerrarOrderByIndiceCorreccionActivoFijoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idIndiceCorreccionActivoFijoBusqueda")) {
				this.jButtonidIndiceCorreccionActivoFijoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaIndiceCorreccionActivoFijoUpdate")) {
				this.jButtonid_empresaIndiceCorreccionActivoFijoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaIndiceCorreccionActivoFijoBusqueda")) {
				this.jButtonid_empresaIndiceCorreccionActivoFijoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("anioIndiceCorreccionActivoFijoBusqueda")) {
				this.jButtonanioIndiceCorreccionActivoFijoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorIndiceCorreccionActivoFijoBusqueda")) {
				this.jButtonvalorIndiceCorreccionActivoFijoBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			IndiceCorreccionActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.indicecorreccionactivofijo,new Object(),this.indicecorreccionactivofijoParameterGeneral,this.indicecorreccionactivofijoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessIndiceCorreccionActivoFijo();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaIndiceCorreccionActivoFijoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.indicecorreccionactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.indicecorreccionactivofijo);
				
				IndiceCorreccionActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.indicecorreccionactivofijo,new Object(),this.indicecorreccionactivofijoParameterGeneral,this.indicecorreccionactivofijoReturnGeneral);
				
				


				
				IndiceCorreccionActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.indicecorreccionactivofijo,new Object(),this.indicecorreccionactivofijoParameterGeneral,this.indicecorreccionactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(IndiceCorreccionActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",IndiceCorreccionActivoFijo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			IndiceCorreccionActivoFijo indicecorreccionactivofijoLocal=null;
			
			if(!this.getEsControlTabla()) {
				indicecorreccionactivofijoLocal=this.indicecorreccionactivofijo;
			} else {
				indicecorreccionactivofijoLocal=this.indicecorreccionactivofijoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.indicecorreccionactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.indicecorreccionactivofijo);
				
				IndiceCorreccionActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.indicecorreccionactivofijo,new Object(),this.indicecorreccionactivofijoParameterGeneral,this.indicecorreccionactivofijoReturnGeneral);
							
				
				


				
				IndiceCorreccionActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.indicecorreccionactivofijo,new Object(),this.indicecorreccionactivofijoParameterGeneral,this.indicecorreccionactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(IndiceCorreccionActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",IndiceCorreccionActivoFijo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaIndiceCorreccionActivoFijoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosIndiceCorreccionActivoFijo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.indicecorreccionactivofijoAnterior =(IndiceCorreccionActivoFijo) this.indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijos().toArray()[this.jTableDatosIndiceCorreccionActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.indicecorreccionactivofijoAnterior =(IndiceCorreccionActivoFijo) this.indicecorreccionactivofijos.toArray()[this.jTableDatosIndiceCorreccionActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
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
			
			IndiceCorreccionActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.indicecorreccionactivofijo,new Object(),this.indicecorreccionactivofijoParameterGeneral,this.indicecorreccionactivofijoReturnGeneral);
			
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
			
			


			
			IndiceCorreccionActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.indicecorreccionactivofijo,new Object(),this.indicecorreccionactivofijoParameterGeneral,this.indicecorreccionactivofijoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaIndiceCorreccionActivoFijoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.indicecorreccionactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.indicecorreccionactivofijo);
				
				IndiceCorreccionActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.indicecorreccionactivofijo,new Object(),this.indicecorreccionactivofijoParameterGeneral,this.indicecorreccionactivofijoReturnGeneral);
								
						
				


				
				IndiceCorreccionActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.indicecorreccionactivofijo,new Object(),this.indicecorreccionactivofijoParameterGeneral,this.indicecorreccionactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(IndiceCorreccionActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",IndiceCorreccionActivoFijo.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.indicecorreccionactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.indicecorreccionactivofijo);
				
				IndiceCorreccionActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.indicecorreccionactivofijo,new Object(),this.indicecorreccionactivofijoParameterGeneral,this.indicecorreccionactivofijoReturnGeneral);
								
				
				


				
				IndiceCorreccionActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.indicecorreccionactivofijo,new Object(),this.indicecorreccionactivofijoParameterGeneral,this.indicecorreccionactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(IndiceCorreccionActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",IndiceCorreccionActivoFijo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaIndiceCorreccionActivoFijoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosIndiceCorreccionActivoFijo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.indicecorreccionactivofijoAnterior =(IndiceCorreccionActivoFijo) this.indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijos().toArray()[this.jTableDatosIndiceCorreccionActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.indicecorreccionactivofijoAnterior =(IndiceCorreccionActivoFijo) this.indicecorreccionactivofijos.toArray()[this.jTableDatosIndiceCorreccionActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.indicecorreccionactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.indicecorreccionactivofijo);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaIndiceCorreccionActivoFijoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosIndiceCorreccionActivoFijo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.indicecorreccionactivofijoAnterior =(IndiceCorreccionActivoFijo) this.indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijos().toArray()[this.jTableDatosIndiceCorreccionActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.indicecorreccionactivofijoAnterior =(IndiceCorreccionActivoFijo) this.indicecorreccionactivofijos.toArray()[this.jTableDatosIndiceCorreccionActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaIndiceCorreccionActivoFijoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.indicecorreccionactivofijo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.indicecorreccionactivofijo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.indicecorreccionactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.indicecorreccionactivofijo);
				
				IndiceCorreccionActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.indicecorreccionactivofijo,new Object(),this.indicecorreccionactivofijoParameterGeneral,this.indicecorreccionactivofijoReturnGeneral);
							
				
				


				
				IndiceCorreccionActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.indicecorreccionactivofijo,new Object(),this.indicecorreccionactivofijoParameterGeneral,this.indicecorreccionactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(IndiceCorreccionActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",IndiceCorreccionActivoFijo.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaIndiceCorreccionActivoFijoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosIndiceCorreccionActivoFijo.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.indicecorreccionactivofijoAnterior =(IndiceCorreccionActivoFijo) this.indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijos().toArray()[this.jTableDatosIndiceCorreccionActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.indicecorreccionactivofijoAnterior =(IndiceCorreccionActivoFijo) this.indicecorreccionactivofijos.toArray()[this.jTableDatosIndiceCorreccionActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
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
			
			IndiceCorreccionActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.indicecorreccionactivofijo,new Object(),this.indicecorreccionactivofijoParameterGeneral,this.indicecorreccionactivofijoReturnGeneral);
			
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
			
			


			
			IndiceCorreccionActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.indicecorreccionactivofijo,new Object(),this.indicecorreccionactivofijoParameterGeneral,this.indicecorreccionactivofijoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaIndiceCorreccionActivoFijoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.indicecorreccionactivofijo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.indicecorreccionactivofijo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.indicecorreccionactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.indicecorreccionactivofijo);
				
				IndiceCorreccionActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.indicecorreccionactivofijo,new Object(),this.indicecorreccionactivofijoParameterGeneral,this.indicecorreccionactivofijoReturnGeneral);
								
				
				


				
				IndiceCorreccionActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.indicecorreccionactivofijo,new Object(),this.indicecorreccionactivofijoParameterGeneral,this.indicecorreccionactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(IndiceCorreccionActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",IndiceCorreccionActivoFijo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaIndiceCorreccionActivoFijoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosIndiceCorreccionActivoFijo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.indicecorreccionactivofijoAnterior =(IndiceCorreccionActivoFijo) this.indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijos().toArray()[this.jTableDatosIndiceCorreccionActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.indicecorreccionactivofijoAnterior =(IndiceCorreccionActivoFijo) this.indicecorreccionactivofijos.toArray()[this.jTableDatosIndiceCorreccionActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaIndiceCorreccionActivoFijoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.indicecorreccionactivofijo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.indicecorreccionactivofijo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaIndiceCorreccionActivoFijoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.indicecorreccionactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.indicecorreccionactivofijo);
				
				IndiceCorreccionActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.indicecorreccionactivofijo,new Object(),this.indicecorreccionactivofijoParameterGeneral,this.indicecorreccionactivofijoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosIndiceCorreccionActivoFijo")) {
					jCheckBoxSeleccionarTodosIndiceCorreccionActivoFijoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosIndiceCorreccionActivoFijo")) {
					jCheckBoxSeleccionadosIndiceCorreccionActivoFijoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarIndiceCorreccionActivoFijo")) {
					
				}
				
				


				
				
				IndiceCorreccionActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.indicecorreccionactivofijo,new Object(),this.indicecorreccionactivofijoParameterGeneral,this.indicecorreccionactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(IndiceCorreccionActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",IndiceCorreccionActivoFijo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.indicecorreccionactivofijo);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.indicecorreccionactivofijo);
				
				IndiceCorreccionActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.indicecorreccionactivofijo,new Object(),this.indicecorreccionactivofijoParameterGeneral,this.indicecorreccionactivofijoReturnGeneral);
												
				
				


				
				
				IndiceCorreccionActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.indicecorreccionactivofijo,new Object(),this.indicecorreccionactivofijoParameterGeneral,this.indicecorreccionactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(IndiceCorreccionActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",IndiceCorreccionActivoFijo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaIndiceCorreccionActivoFijoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosIndiceCorreccionActivoFijo.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.indicecorreccionactivofijoAnterior =(IndiceCorreccionActivoFijo) this.indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijos().toArray()[this.jTableDatosIndiceCorreccionActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.indicecorreccionactivofijoAnterior =(IndiceCorreccionActivoFijo) this.indicecorreccionactivofijos.toArray()[this.jTableDatosIndiceCorreccionActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaIndiceCorreccionActivoFijoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.indicecorreccionactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.indicecorreccionactivofijo);
				
				IndiceCorreccionActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.indicecorreccionactivofijo,new Object(),this.indicecorreccionactivofijoParameterGeneral,this.indicecorreccionactivofijoReturnGeneral);
				
				
				IndiceCorreccionActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.indicecorreccionactivofijo,new Object(),this.indicecorreccionactivofijoParameterGeneral,this.indicecorreccionactivofijoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
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
			
			IndiceCorreccionActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.indicecorreccionactivofijo,new Object(),this.indicecorreccionactivofijoParameterGeneral,this.indicecorreccionactivofijoReturnGeneral);
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
			
			


			
			IndiceCorreccionActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.indicecorreccionactivofijo,new Object(),this.indicecorreccionactivofijoParameterGeneral,this.indicecorreccionactivofijoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaIndiceCorreccionActivoFijoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.indicecorreccionactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.indicecorreccionactivofijo);
				
				IndiceCorreccionActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.indicecorreccionactivofijo,new Object(),this.indicecorreccionactivofijoParameterGeneral,this.indicecorreccionactivofijoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				IndiceCorreccionActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.indicecorreccionactivofijo,new Object(),this.indicecorreccionactivofijoParameterGeneral,this.indicecorreccionactivofijoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(IndiceCorreccionActivoFijo.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",IndiceCorreccionActivoFijo.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.indicecorreccionactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.indicecorreccionactivofijo);
				
				IndiceCorreccionActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.indicecorreccionactivofijo,new Object(),this.indicecorreccionactivofijoParameterGeneral,this.indicecorreccionactivofijoReturnGeneral);
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
				
				


				
				IndiceCorreccionActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.indicecorreccionactivofijo,new Object(),this.indicecorreccionactivofijoParameterGeneral,this.indicecorreccionactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(IndiceCorreccionActivoFijo.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",IndiceCorreccionActivoFijo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaIndiceCorreccionActivoFijoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosIndiceCorreccionActivoFijo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.indicecorreccionactivofijoAnterior =(IndiceCorreccionActivoFijo) this.indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijos().toArray()[this.jTableDatosIndiceCorreccionActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.indicecorreccionactivofijoAnterior =(IndiceCorreccionActivoFijo) this.indicecorreccionactivofijos.toArray()[this.jTableDatosIndiceCorreccionActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				IndiceCorreccionActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.indicecorreccionactivofijo,new Object(),this.indicecorreccionactivofijoParameterGeneral,this.indicecorreccionactivofijoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarIndiceCorreccionActivoFijo")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosIndiceCorreccionActivoFijoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosIndiceCorreccionActivoFijo.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.indicecorreccionactivofijo =(IndiceCorreccionActivoFijo) this.indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijos().toArray()[this.jTableDatosIndiceCorreccionActivoFijo.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.indicecorreccionactivofijo =(IndiceCorreccionActivoFijo) this.indicecorreccionactivofijos.toArray()[this.jTableDatosIndiceCorreccionActivoFijo.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.indicecorreccionactivofijo);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarIndiceCorreccionActivoFijo")) {
				
				}
				
				IndiceCorreccionActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.indicecorreccionactivofijo,new Object(),this.indicecorreccionactivofijoParameterGeneral,this.indicecorreccionactivofijoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			IndiceCorreccionActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.indicecorreccionactivofijo,new Object(),this.indicecorreccionactivofijoParameterGeneral,this.indicecorreccionactivofijoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarIndiceCorreccionActivoFijo")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosIndiceCorreccionActivoFijo.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarIndiceCorreccionActivoFijo")) {
			
			}
			
			IndiceCorreccionActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.indicecorreccionactivofijo,new Object(),this.indicecorreccionactivofijoParameterGeneral,this.indicecorreccionactivofijoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessIndiceCorreccionActivoFijo();
			
			IndiceCorreccionActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.indicecorreccionactivofijo,new Object(),this.indicecorreccionactivofijoParameterGeneral,this.indicecorreccionactivofijoReturnGeneral);
			
			if(sTipo.equals("NuevoIndiceCorreccionActivoFijo")) {
				jButtonNuevoIndiceCorreccionActivoFijoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarIndiceCorreccionActivoFijo")) {
				jButtonDuplicarIndiceCorreccionActivoFijoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarIndiceCorreccionActivoFijo")) {
				jButtonCopiarIndiceCorreccionActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormIndiceCorreccionActivoFijo")) {
				jButtonVerFormIndiceCorreccionActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesIndiceCorreccionActivoFijo")) {
				jButtonNuevoIndiceCorreccionActivoFijoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarIndiceCorreccionActivoFijo")) {
				jButtonModificarIndiceCorreccionActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarIndiceCorreccionActivoFijo")) {
				jButtonActualizarIndiceCorreccionActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarIndiceCorreccionActivoFijo")) {
				jButtonEliminarIndiceCorreccionActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaIndiceCorreccionActivoFijo")) {
				jButtonGuardarCambiosIndiceCorreccionActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarIndiceCorreccionActivoFijo")) {
				jButtonCancelarIndiceCorreccionActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarIndiceCorreccionActivoFijo")) {
				jButtonCerrarIndiceCorreccionActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosIndiceCorreccionActivoFijo")) {
				jButtonGuardarCambiosIndiceCorreccionActivoFijoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosIndiceCorreccionActivoFijo")) {
				jButtonNuevoGuardarCambiosIndiceCorreccionActivoFijoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByIndiceCorreccionActivoFijo")) {
				jButtonAbrirOrderByIndiceCorreccionActivoFijoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionIndiceCorreccionActivoFijo")) {
				jButtonRecargarInformacionIndiceCorreccionActivoFijoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresIndiceCorreccionActivoFijo")) {
				jButtonAnterioresIndiceCorreccionActivoFijoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesIndiceCorreccionActivoFijo")) {
				jButtonSiguientesIndiceCorreccionActivoFijoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idIndiceCorreccionActivoFijoBusqueda")) {
				this.jButtonidIndiceCorreccionActivoFijoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaIndiceCorreccionActivoFijoUpdate")) {
				this.jButtonid_empresaIndiceCorreccionActivoFijoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaIndiceCorreccionActivoFijoBusqueda")) {
				this.jButtonid_empresaIndiceCorreccionActivoFijoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("anioIndiceCorreccionActivoFijoBusqueda")) {
				this.jButtonanioIndiceCorreccionActivoFijoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorIndiceCorreccionActivoFijoBusqueda")) {
				this.jButtonvalorIndiceCorreccionActivoFijoBusquedaActionPerformed(evt);
			}
			
			IndiceCorreccionActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.indicecorreccionactivofijo,new Object(),this.indicecorreccionactivofijoParameterGeneral,this.indicecorreccionactivofijoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessIndiceCorreccionActivoFijo();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			IndiceCorreccionActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.indicecorreccionactivofijo,new Object(),this.indicecorreccionactivofijoParameterGeneral,this.indicecorreccionactivofijoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameIndiceCorreccionActivoFijo")) {
				closingInternalFrameIndiceCorreccionActivoFijo();
				
			} else if(sTipo.equals("jButtonCancelarIndiceCorreccionActivoFijo")) {
				JInternalFrameBase jInternalFrameDetalleFormIndiceCorreccionActivoFijo = (JInternalFrameBase)evt.getSource();
	            	
	            IndiceCorreccionActivoFijoBeanSwingJInternalFrame jInternalFrameParent=(IndiceCorreccionActivoFijoBeanSwingJInternalFrame)jInternalFrameDetalleFormIndiceCorreccionActivoFijo.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarIndiceCorreccionActivoFijoActionPerformed(null);
			}
			
			IndiceCorreccionActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.indicecorreccionactivofijo,new Object(),this.indicecorreccionactivofijoParameterGeneral,this.indicecorreccionactivofijoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormIndiceCorreccionActivoFijo(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormIndiceCorreccionActivoFijo(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormIndiceCorreccionActivoFijo(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.indicecorreccionactivofijo)) {
			if(!esControlTabla) {
				if(IndiceCorreccionActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualIndiceCorreccionActivoFijo(this.indicecorreccionactivofijo,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysIndiceCorreccionActivoFijo(this.indicecorreccionactivofijo);			
				}
				
				if(this.indicecorreccionactivofijoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualIndiceCorreccionActivoFijo(this.indicecorreccionactivofijo,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.indicecorreccionactivofijoReturnGeneral=indicecorreccionactivofijoLogic.procesarEventosIndiceCorreccionActivoFijosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijos(),this.indicecorreccionactivofijo,this.indicecorreccionactivofijoParameterGeneral,this.isEsNuevoIndiceCorreccionActivoFijo,classes);//this.indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijo()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanIndiceCorreccionActivoFijo(this.indicecorreccionactivofijoReturnGeneral,this.indicecorreccionactivofijoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.indicecorreccionactivofijoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanIndiceCorreccionActivoFijo(classes,this.indicecorreccionactivofijoReturnGeneral,this.indicecorreccionactivofijoBean,false);
					}
						
					if(this.indicecorreccionactivofijoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyIndiceCorreccionActivoFijo(this.indicecorreccionactivofijoReturnGeneral.getIndiceCorreccionActivoFijo());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioIndiceCorreccionActivoFijo(this.indicecorreccionactivofijoReturnGeneral.getIndiceCorreccionActivoFijo());	
					}
						
					if(this.indicecorreccionactivofijoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioIndiceCorreccionActivoFijo(this.indicecorreccionactivofijoReturnGeneral.getIndiceCorreccionActivoFijo(),classes);//this.indicecorreccionactivofijoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioIndiceCorreccionActivoFijo(this.indicecorreccionactivofijo,classes);//this.indicecorreccionactivofijoBean);									
				}
			
				if(IndiceCorreccionActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualIndiceCorreccionActivoFijo(this.indicecorreccionactivofijo,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysIndiceCorreccionActivoFijo(this.indicecorreccionactivofijo);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.indicecorreccionactivofijoAnterior!=null) {
						this.indicecorreccionactivofijo=this.indicecorreccionactivofijoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.indicecorreccionactivofijoReturnGeneral=indicecorreccionactivofijoLogic.procesarEventosIndiceCorreccionActivoFijosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijos(),this.indicecorreccionactivofijo,this.indicecorreccionactivofijoParameterGeneral,this.isEsNuevoIndiceCorreccionActivoFijo,classes);//this.indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijo()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.indicecorreccionactivofijoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.indicecorreccionactivofijoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.indicecorreccionactivofijoReturnGeneral.getIndiceCorreccionActivoFijo(),indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.indicecorreccionactivofijoReturnGeneral.getIndiceCorreccionActivoFijo(),this.indicecorreccionactivofijos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosIndiceCorreccionActivoFijo.repaint();
				
				//((AbstractTableModel) this.jTableDatosIndiceCorreccionActivoFijo.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosIndiceCorreccionActivoFijo();
			}
		}
	}
	
	public void actualizarVisualTableDatosIndiceCorreccionActivoFijo() throws Exception {
		
		IndiceCorreccionActivoFijoModel indicecorreccionactivofijoModel=(IndiceCorreccionActivoFijoModel)this.jTableDatosIndiceCorreccionActivoFijo.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			indicecorreccionactivofijoModel.indicecorreccionactivofijos=this.indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			indicecorreccionactivofijoModel.indicecorreccionactivofijos=this.indicecorreccionactivofijos;
		}
		
		
		((IndiceCorreccionActivoFijoModel) this.jTableDatosIndiceCorreccionActivoFijo.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaIndiceCorreccionActivoFijo() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getindicecorreccionactivofijoAnterior(),this.indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getindicecorreccionactivofijoAnterior(),this.indicecorreccionactivofijos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosIndiceCorreccionActivoFijo();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioIndiceCorreccionActivoFijo(IndiceCorreccionActivoFijo indicecorreccionactivofijo,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
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
										
				IndiceCorreccionActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.indicecorreccionactivofijo,new Object(),generalEntityParameterGeneral,this.indicecorreccionactivofijoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.indicecorreccionactivofijoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=IndiceCorreccionActivoFijoConstantesFunciones.getClassesRelationshipsOfIndiceCorreccionActivoFijo(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=IndiceCorreccionActivoFijoConstantesFunciones.getClassesRelationshipsFromStringsOfIndiceCorreccionActivoFijo(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormIndiceCorreccionActivoFijo(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				IndiceCorreccionActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.indicecorreccionactivofijo,new Object(),generalEntityParameterGeneral,this.indicecorreccionactivofijoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioIndiceCorreccionActivoFijo(IndiceCorreccionActivoFijoBean indicecorreccionactivofijoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanIndiceCorreccionActivoFijo(ArrayList<Classe> classes,IndiceCorreccionActivoFijoReturnGeneral indicecorreccionactivofijoReturnGeneral,IndiceCorreccionActivoFijoBean indicecorreccionactivofijoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualIndiceCorreccionActivoFijo(IndiceCorreccionActivoFijo indicecorreccionactivofijo,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.indicecorreccionactivofijo)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo = new IndiceCorreccionActivoFijoDetalleFormJInternalFrame(jDesktopPane,this.indicecorreccionactivofijoSessionBean.getConGuardarRelaciones(),this.indicecorreccionactivofijoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo);
		this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.setVisible(false);
		this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.setSelected(false);						
		
		this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.indicecorreccionactivofijoLogic=this.indicecorreccionactivofijoLogic;
		
		this.cargarCombosFrameForeignKeyIndiceCorreccionActivoFijo("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleIndiceCorreccionActivoFijo();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleIndiceCorreccionActivoFijo();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyIndiceCorreccionActivoFijo("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyIndiceCorreccionActivoFijo();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarIndiceCorreccionActivoFijo"));
		
		this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jButtonModificarIndiceCorreccionActivoFijo.addActionListener(new ButtonActionListener(this,"ModificarIndiceCorreccionActivoFijo"));

		
		this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jButtonModificarToolBarIndiceCorreccionActivoFijo.addActionListener(new ButtonActionListener(this,"ModificarToolBarIndiceCorreccionActivoFijo"));
					
		this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jMenuItemModificarIndiceCorreccionActivoFijo.addActionListener(new ButtonActionListener(this,"MenuItemModificarIndiceCorreccionActivoFijo"));		
		
		
		
		this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jButtonActualizarIndiceCorreccionActivoFijo.addActionListener (new ButtonActionListener(this,"ActualizarIndiceCorreccionActivoFijo"));
		
		
		this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jButtonActualizarToolBarIndiceCorreccionActivoFijo.addActionListener(new ButtonActionListener(this,"ActualizarToolBarIndiceCorreccionActivoFijo"));
						
		this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jMenuItemActualizarIndiceCorreccionActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemActualizarIndiceCorreccionActivoFijo"));		
		
		
		
		this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jButtonEliminarIndiceCorreccionActivoFijo.addActionListener (new ButtonActionListener(this,"EliminarIndiceCorreccionActivoFijo"));
		
		
		this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jButtonEliminarToolBarIndiceCorreccionActivoFijo.addActionListener (new ButtonActionListener(this,"EliminarToolBarIndiceCorreccionActivoFijo"));
								
		this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jMenuItemEliminarIndiceCorreccionActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemEliminarIndiceCorreccionActivoFijo"));		
		
		
		
		this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jButtonCancelarIndiceCorreccionActivoFijo.addActionListener (new ButtonActionListener(this,"CancelarIndiceCorreccionActivoFijo"));
		
		
		this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jButtonCancelarToolBarIndiceCorreccionActivoFijo.addActionListener (new ButtonActionListener(this,"CancelarToolBarIndiceCorreccionActivoFijo"));
					
		this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jMenuItemCancelarIndiceCorreccionActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemCancelarIndiceCorreccionActivoFijo"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jMenuItemDetalleCerrarIndiceCorreccionActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarIndiceCorreccionActivoFijo"));		
		
		
		
		this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jButtonGuardarCambiosToolBarIndiceCorreccionActivoFijo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarIndiceCorreccionActivoFijo"));
		
		
		
		this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jButtonGuardarCambiosToolBarIndiceCorreccionActivoFijo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarIndiceCorreccionActivoFijo"));
		
		
		
		this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jComboBoxTiposAccionesFormularioIndiceCorreccionActivoFijo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioIndiceCorreccionActivoFijo"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jButtonidIndiceCorreccionActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"idIndiceCorreccionActivoFijoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jButtonid_empresaIndiceCorreccionActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaIndiceCorreccionActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jButtonid_empresaIndiceCorreccionActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaIndiceCorreccionActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jButtonanioIndiceCorreccionActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"anioIndiceCorreccionActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jButtonvalorIndiceCorreccionActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"valorIndiceCorreccionActivoFijoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jTabbedPaneRelacionesIndiceCorreccionActivoFijo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesIndiceCorreccionActivoFijo"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameIndiceCorreccionActivoFijo"));
		
		if(this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarIndiceCorreccionActivoFijo"));
		}
		
		this.jTableDatosIndiceCorreccionActivoFijo.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarIndiceCorreccionActivoFijo"));
		
		this.jTableDatosIndiceCorreccionActivoFijo.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarIndiceCorreccionActivoFijo"));
		
		this.jButtonNuevoIndiceCorreccionActivoFijo.addActionListener(new ButtonActionListener(this,"NuevoIndiceCorreccionActivoFijo"));
		
		this.jButtonDuplicarIndiceCorreccionActivoFijo.addActionListener(new ButtonActionListener(this,"DuplicarIndiceCorreccionActivoFijo"));
		
		this.jButtonCopiarIndiceCorreccionActivoFijo.addActionListener(new ButtonActionListener(this,"CopiarIndiceCorreccionActivoFijo"));
		
		this.jButtonVerFormIndiceCorreccionActivoFijo.addActionListener(new ButtonActionListener(this,"VerFormIndiceCorreccionActivoFijo"));
		
		
		this.jButtonNuevoToolBarIndiceCorreccionActivoFijo.addActionListener(new ButtonActionListener(this,"NuevoToolBarIndiceCorreccionActivoFijo"));
			
		this.jButtonDuplicarToolBarIndiceCorreccionActivoFijo.addActionListener(new ButtonActionListener(this,"DuplicarToolBarIndiceCorreccionActivoFijo"));
			
		this.jMenuItemNuevoIndiceCorreccionActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemNuevoIndiceCorreccionActivoFijo"));
			
		this.jMenuItemDuplicarIndiceCorreccionActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarIndiceCorreccionActivoFijo"));		
		
		
		this.jButtonNuevoRelacionesIndiceCorreccionActivoFijo.addActionListener (new ButtonActionListener(this,"NuevoRelacionesIndiceCorreccionActivoFijo"));
		
		
		this.jButtonNuevoRelacionesToolBarIndiceCorreccionActivoFijo.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarIndiceCorreccionActivoFijo"));
			
		this.jMenuItemNuevoRelacionesIndiceCorreccionActivoFijo.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesIndiceCorreccionActivoFijo"));		
		
		
		if(this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jButtonModificarIndiceCorreccionActivoFijo.addActionListener(new ButtonActionListener(this,"ModificarIndiceCorreccionActivoFijo"));
		}
		
		
		if(this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jButtonModificarToolBarIndiceCorreccionActivoFijo.addActionListener(new ButtonActionListener(this,"ModificarToolBarIndiceCorreccionActivoFijo"));
			
			this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jMenuItemModificarIndiceCorreccionActivoFijo.addActionListener(new ButtonActionListener(this,"MenuItemModificarIndiceCorreccionActivoFijo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jButtonActualizarIndiceCorreccionActivoFijo.addActionListener (new ButtonActionListener(this,"ActualizarIndiceCorreccionActivoFijo"));
		}
		
		
		if(this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jButtonActualizarToolBarIndiceCorreccionActivoFijo.addActionListener(new ButtonActionListener(this,"ActualizarToolBarIndiceCorreccionActivoFijo"));
				
			this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jMenuItemActualizarIndiceCorreccionActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemActualizarIndiceCorreccionActivoFijo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jButtonEliminarIndiceCorreccionActivoFijo.addActionListener (new ButtonActionListener(this,"EliminarIndiceCorreccionActivoFijo"));
		}
		
		
		if(this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jButtonEliminarToolBarIndiceCorreccionActivoFijo.addActionListener (new ButtonActionListener(this,"EliminarToolBarIndiceCorreccionActivoFijo"));
						
			this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jMenuItemEliminarIndiceCorreccionActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemEliminarIndiceCorreccionActivoFijo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jButtonCancelarIndiceCorreccionActivoFijo.addActionListener (new ButtonActionListener(this,"CancelarIndiceCorreccionActivoFijo"));
		}
		
		
		if(this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jButtonCancelarToolBarIndiceCorreccionActivoFijo.addActionListener (new ButtonActionListener(this,"CancelarToolBarIndiceCorreccionActivoFijo"));
			
			this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jMenuItemCancelarIndiceCorreccionActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemCancelarIndiceCorreccionActivoFijo"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarIndiceCorreccionActivoFijo.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarIndiceCorreccionActivoFijo"));		
		
		
		this.jButtonCerrarIndiceCorreccionActivoFijo.addActionListener (new ButtonActionListener(this,"CerrarIndiceCorreccionActivoFijo"));
		
		
		this.jButtonCerrarToolBarIndiceCorreccionActivoFijo.addActionListener (new ButtonActionListener(this,"CerrarToolBarIndiceCorreccionActivoFijo"));
			
		this.jMenuItemCerrarIndiceCorreccionActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemCerrarIndiceCorreccionActivoFijo"));
			
		if(this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jMenuItemDetalleCerrarIndiceCorreccionActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarIndiceCorreccionActivoFijo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jButtonGuardarCambiosIndiceCorreccionActivoFijo.addActionListener (new ButtonActionListener(this,"GuardarCambiosIndiceCorreccionActivoFijo"));
		}
		
		
		if(this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jButtonGuardarCambiosToolBarIndiceCorreccionActivoFijo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarIndiceCorreccionActivoFijo"));
		}
		
		this.jButtonCopiarToolBarIndiceCorreccionActivoFijo.addActionListener (new ButtonActionListener(this,"CopiarToolBarIndiceCorreccionActivoFijo"));
			
		this.jButtonVerFormToolBarIndiceCorreccionActivoFijo.addActionListener (new ButtonActionListener(this,"VerFormToolBarIndiceCorreccionActivoFijo"));
		
		this.jMenuItemGuardarCambiosIndiceCorreccionActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosIndiceCorreccionActivoFijo"));
			
		this.jMenuItemCopiarIndiceCorreccionActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemCopiarIndiceCorreccionActivoFijo"));		
		
		this.jMenuItemVerFormIndiceCorreccionActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemVerFormIndiceCorreccionActivoFijo"));		
		
		
		this.jButtonGuardarCambiosTablaIndiceCorreccionActivoFijo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaIndiceCorreccionActivoFijo"));
		
		
		this.jButtonGuardarCambiosTablaToolBarIndiceCorreccionActivoFijo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarIndiceCorreccionActivoFijo"));
			
		this.jMenuItemGuardarCambiosTablaIndiceCorreccionActivoFijo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaIndiceCorreccionActivoFijo"));		
		
		
		
		this.jButtonRecargarInformacionIndiceCorreccionActivoFijo.addActionListener (new ButtonActionListener(this,"RecargarInformacionIndiceCorreccionActivoFijo"));
					
		this.jButtonRecargarInformacionToolBarIndiceCorreccionActivoFijo.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarIndiceCorreccionActivoFijo"));
		
		this.jMenuItemRecargarInformacionIndiceCorreccionActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionIndiceCorreccionActivoFijo"));		
		
		
		
		this.jButtonAnterioresIndiceCorreccionActivoFijo.addActionListener (new ButtonActionListener(this,"AnterioresIndiceCorreccionActivoFijo"));
		
		
		this.jButtonAnterioresToolBarIndiceCorreccionActivoFijo.addActionListener (new ButtonActionListener(this,"AnterioresToolBarIndiceCorreccionActivoFijo"));
		
		this.jMenuItemAnterioresIndiceCorreccionActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresIndiceCorreccionActivoFijo"));		
		
		
		this.jButtonSiguientesIndiceCorreccionActivoFijo.addActionListener (new ButtonActionListener(this,"SiguientesIndiceCorreccionActivoFijo"));
		
		
		this.jButtonSiguientesToolBarIndiceCorreccionActivoFijo.addActionListener (new ButtonActionListener(this,"SiguientesToolBarIndiceCorreccionActivoFijo"));
			
		this.jMenuItemSiguientesIndiceCorreccionActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesIndiceCorreccionActivoFijo"));
			
		this.jMenuItemAbrirOrderByIndiceCorreccionActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByIndiceCorreccionActivoFijo"));
			
		this.jMenuItemMostrarOcultarIndiceCorreccionActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarIndiceCorreccionActivoFijo"));
			
		this.jMenuItemDetalleAbrirOrderByIndiceCorreccionActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByIndiceCorreccionActivoFijo"));
			
		this.jMenuItemDetalleMostarOcultarIndiceCorreccionActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarIndiceCorreccionActivoFijo"));		
		
		
		this.jButtonNuevoGuardarCambiosIndiceCorreccionActivoFijo.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosIndiceCorreccionActivoFijo"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarIndiceCorreccionActivoFijo.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarIndiceCorreccionActivoFijo"));
			
		this.jMenuItemNuevoGuardarCambiosIndiceCorreccionActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosIndiceCorreccionActivoFijo"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosIndiceCorreccionActivoFijo.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosIndiceCorreccionActivoFijo"));

		this.jCheckBoxSeleccionadosIndiceCorreccionActivoFijo.addItemListener(new CheckBoxItemListener(this,"SeleccionadosIndiceCorreccionActivoFijo"));
		
		if(this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jComboBoxTiposAccionesFormularioIndiceCorreccionActivoFijo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioIndiceCorreccionActivoFijo"));
		}
		
		
		this.jComboBoxTiposRelacionesIndiceCorreccionActivoFijo.addActionListener (new ButtonActionListener(this,"TiposRelacionesIndiceCorreccionActivoFijo"));
			
		this.jComboBoxTiposAccionesIndiceCorreccionActivoFijo.addActionListener (new ButtonActionListener(this,"TiposAccionesIndiceCorreccionActivoFijo"));
					
		this.jComboBoxTiposSeleccionarIndiceCorreccionActivoFijo.addActionListener (new ButtonActionListener(this,"TiposSeleccionarIndiceCorreccionActivoFijo"));
			
		this.jTextFieldValorCampoGeneralIndiceCorreccionActivoFijo.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralIndiceCorreccionActivoFijo"));		
		
		
		if(this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jButtonidIndiceCorreccionActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"idIndiceCorreccionActivoFijoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jButtonid_empresaIndiceCorreccionActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaIndiceCorreccionActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jButtonid_empresaIndiceCorreccionActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaIndiceCorreccionActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jButtonanioIndiceCorreccionActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"anioIndiceCorreccionActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jButtonvalorIndiceCorreccionActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"valorIndiceCorreccionActivoFijoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoIndiceCorreccionActivoFijo!=null) {
				this.jInternalFrameReporteDinamicoIndiceCorreccionActivoFijo.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoIndiceCorreccionActivoFijo"));
				this.jInternalFrameReporteDinamicoIndiceCorreccionActivoFijo.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoIndiceCorreccionActivoFijo"));
				this.jInternalFrameReporteDinamicoIndiceCorreccionActivoFijo.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoIndiceCorreccionActivoFijo"));
			}
			
			//this.jButtonCerrarReporteDinamicoIndiceCorreccionActivoFijo.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoIndiceCorreccionActivoFijo"));				
			//this.jButtonGenerarReporteDinamicoIndiceCorreccionActivoFijo.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoIndiceCorreccionActivoFijo"));
			//this.jButtonGenerarExcelReporteDinamicoIndiceCorreccionActivoFijo.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoIndiceCorreccionActivoFijo"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionIndiceCorreccionActivoFijo!=null) {
				this.jInternalFrameImportacionIndiceCorreccionActivoFijo.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionIndiceCorreccionActivoFijo"));
				this.jInternalFrameImportacionIndiceCorreccionActivoFijo.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionIndiceCorreccionActivoFijo"));
				this.jInternalFrameImportacionIndiceCorreccionActivoFijo.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionIndiceCorreccionActivoFijo"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByIndiceCorreccionActivoFijo.addActionListener (new ButtonActionListener(this,"AbrirOrderByIndiceCorreccionActivoFijo"));
			
			this.jButtonAbrirOrderByToolBarIndiceCorreccionActivoFijo.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarIndiceCorreccionActivoFijo"));			
			
			if(this.jInternalFrameOrderByIndiceCorreccionActivoFijo!=null) {
				this.jInternalFrameOrderByIndiceCorreccionActivoFijo.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByIndiceCorreccionActivoFijo"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jTabbedPaneRelacionesIndiceCorreccionActivoFijo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesIndiceCorreccionActivoFijo"));
		
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
            		closingInternalFrameIndiceCorreccionActivoFijo();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormIndiceCorreccionActivoFijo = (JInternalFrameBase)event.getSource();
	            	
	            IndiceCorreccionActivoFijoBeanSwingJInternalFrame jInternalFrameParent=(IndiceCorreccionActivoFijoBeanSwingJInternalFrame)jInternalFrameDetalleFormIndiceCorreccionActivoFijo.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarIndiceCorreccionActivoFijoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosIndiceCorreccionActivoFijo.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosIndiceCorreccionActivoFijoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosIndiceCorreccionActivoFijo.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosIndiceCorreccionActivoFijo.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoIndiceCorreccionActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoIndiceCorreccionActivoFijoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarIndiceCorreccionActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoIndiceCorreccionActivoFijoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoIndiceCorreccionActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoIndiceCorreccionActivoFijoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoIndiceCorreccionActivoFijo";
		inputMap = this.jButtonNuevoIndiceCorreccionActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoIndiceCorreccionActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoIndiceCorreccionActivoFijoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesIndiceCorreccionActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoIndiceCorreccionActivoFijoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarIndiceCorreccionActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoIndiceCorreccionActivoFijoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesIndiceCorreccionActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoIndiceCorreccionActivoFijoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesIndiceCorreccionActivoFijo";
		inputMap = this.jButtonNuevoRelacionesIndiceCorreccionActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesIndiceCorreccionActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoIndiceCorreccionActivoFijoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarIndiceCorreccionActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarIndiceCorreccionActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarIndiceCorreccionActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarIndiceCorreccionActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarIndiceCorreccionActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarIndiceCorreccionActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarIndiceCorreccionActivoFijo";
		inputMap = this.jButtonModificarIndiceCorreccionActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarIndiceCorreccionActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarIndiceCorreccionActivoFijoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarIndiceCorreccionActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarIndiceCorreccionActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarIndiceCorreccionActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarIndiceCorreccionActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarIndiceCorreccionActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarIndiceCorreccionActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarIndiceCorreccionActivoFijo";
		inputMap = this.jButtonActualizarIndiceCorreccionActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarIndiceCorreccionActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarIndiceCorreccionActivoFijoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarIndiceCorreccionActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarIndiceCorreccionActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarIndiceCorreccionActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarIndiceCorreccionActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarIndiceCorreccionActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarIndiceCorreccionActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarIndiceCorreccionActivoFijo";
		inputMap = this.jButtonEliminarIndiceCorreccionActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarIndiceCorreccionActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarIndiceCorreccionActivoFijoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarIndiceCorreccionActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarIndiceCorreccionActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarIndiceCorreccionActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarIndiceCorreccionActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarIndiceCorreccionActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarIndiceCorreccionActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarIndiceCorreccionActivoFijo";
		inputMap = this.jButtonCancelarIndiceCorreccionActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarIndiceCorreccionActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarIndiceCorreccionActivoFijoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarIndiceCorreccionActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarIndiceCorreccionActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarIndiceCorreccionActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarIndiceCorreccionActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarIndiceCorreccionActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarIndiceCorreccionActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarIndiceCorreccionActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarIndiceCorreccionActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarIndiceCorreccionActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarIndiceCorreccionActivoFijo";
		inputMap = this.jButtonCerrarIndiceCorreccionActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarIndiceCorreccionActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarIndiceCorreccionActivoFijoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jButtonGuardarCambiosIndiceCorreccionActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosIndiceCorreccionActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarIndiceCorreccionActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosIndiceCorreccionActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosIndiceCorreccionActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosIndiceCorreccionActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaIndiceCorreccionActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosIndiceCorreccionActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarIndiceCorreccionActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosIndiceCorreccionActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaIndiceCorreccionActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosIndiceCorreccionActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosIndiceCorreccionActivoFijo";
		inputMap = this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jButtonGuardarCambiosIndiceCorreccionActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jButtonGuardarCambiosIndiceCorreccionActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosIndiceCorreccionActivoFijoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionIndiceCorreccionActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionIndiceCorreccionActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarIndiceCorreccionActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionIndiceCorreccionActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionIndiceCorreccionActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionIndiceCorreccionActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresIndiceCorreccionActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresIndiceCorreccionActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarIndiceCorreccionActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresIndiceCorreccionActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresIndiceCorreccionActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresIndiceCorreccionActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesIndiceCorreccionActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesIndiceCorreccionActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarIndiceCorreccionActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesIndiceCorreccionActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesIndiceCorreccionActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesIndiceCorreccionActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosIndiceCorreccionActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosIndiceCorreccionActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarIndiceCorreccionActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosIndiceCorreccionActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosIndiceCorreccionActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosIndiceCorreccionActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosIndiceCorreccionActivoFijo.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosIndiceCorreccionActivoFijoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesIndiceCorreccionActivoFijo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesIndiceCorreccionActivoFijoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarIndiceCorreccionActivoFijo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarIndiceCorreccionActivoFijoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralIndiceCorreccionActivoFijo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralIndiceCorreccionActivoFijoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jButtonidIndiceCorreccionActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"idIndiceCorreccionActivoFijoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jButtonid_empresaIndiceCorreccionActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaIndiceCorreccionActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jButtonid_empresaIndiceCorreccionActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaIndiceCorreccionActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jButtonanioIndiceCorreccionActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"anioIndiceCorreccionActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jButtonvalorIndiceCorreccionActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"valorIndiceCorreccionActivoFijoBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoIndiceCorreccionActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoIndiceCorreccionActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoIndiceCorreccionActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoIndiceCorreccionActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoIndiceCorreccionActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoIndiceCorreccionActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionIndiceCorreccionActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionIndiceCorreccionActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionIndiceCorreccionActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionIndiceCorreccionActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionIndiceCorreccionActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionIndiceCorreccionActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarIndiceCorreccionActivoFijoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarIndiceCorreccionActivoFijo.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosIndiceCorreccionActivoFijo(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(IndiceCorreccionActivoFijo indicecorreccionactivofijoAux:this.indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijos()) {
					indicecorreccionactivofijoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(IndiceCorreccionActivoFijo indicecorreccionactivofijoAux:indicecorreccionactivofijos) {
					indicecorreccionactivofijoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosIndiceCorreccionActivoFijoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingIndiceCorreccionActivoFijo(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(IndiceCorreccionActivoFijo indicecorreccionactivofijoAux:this.indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijos()) {
						indicecorreccionactivofijoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(IndiceCorreccionActivoFijo indicecorreccionactivofijoAux:indicecorreccionactivofijos) {
						indicecorreccionactivofijoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(IndiceCorreccionActivoFijo indicecorreccionactivofijoAux:this.indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(IndiceCorreccionActivoFijo indicecorreccionactivofijoAux:indicecorreccionactivofijos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaIndiceCorreccionActivoFijo(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosIndiceCorreccionActivoFijo.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosIndiceCorreccionActivoFijo.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosIndiceCorreccionActivoFijo,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosIndiceCorreccionActivoFijoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingIndiceCorreccionActivoFijo(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosIndiceCorreccionActivoFijo.getSelectedRows();
			
			IndiceCorreccionActivoFijo indicecorreccionactivofijoLocal=new IndiceCorreccionActivoFijo();
			
			//this.seleccionarTodosIndiceCorreccionActivoFijo(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					indicecorreccionactivofijoLocal =(IndiceCorreccionActivoFijo) this.indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijos().toArray()[this.jTableDatosIndiceCorreccionActivoFijo.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					indicecorreccionactivofijoLocal =(IndiceCorreccionActivoFijo) this.indicecorreccionactivofijos.toArray()[this.jTableDatosIndiceCorreccionActivoFijo.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				indicecorreccionactivofijoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(IndiceCorreccionActivoFijo indicecorreccionactivofijoAux:this.indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijos()) {
						indicecorreccionactivofijoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(IndiceCorreccionActivoFijo indicecorreccionactivofijoAux:indicecorreccionactivofijos) {
						indicecorreccionactivofijoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaIndiceCorreccionActivoFijo(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosIndiceCorreccionActivoFijo.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosIndiceCorreccionActivoFijo.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosIndiceCorreccionActivoFijo,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualIndiceCorreccionActivoFijoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarIndiceCorreccionActivoFijoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralIndiceCorreccionActivoFijoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingIndiceCorreccionActivoFijo(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralIndiceCorreccionActivoFijo.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(IndiceCorreccionActivoFijo indicecorreccionactivofijoAux:this.indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijos()) {
				
						if(sTipoSeleccionar.equals(IndiceCorreccionActivoFijoConstantesFunciones.LABEL_ANIO)) {
							existe=true;
							indicecorreccionactivofijoAux.setanio(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(IndiceCorreccionActivoFijoConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							indicecorreccionactivofijoAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(IndiceCorreccionActivoFijo indicecorreccionactivofijoAux:indicecorreccionactivofijos) {
					
						if(sTipoSeleccionar.equals(IndiceCorreccionActivoFijoConstantesFunciones.LABEL_ANIO)) {
							existe=true;
							indicecorreccionactivofijoAux.setanio(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(IndiceCorreccionActivoFijoConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							indicecorreccionactivofijoAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaIndiceCorreccionActivoFijo(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesIndiceCorreccionActivoFijoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingIndiceCorreccionActivoFijo(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioIndiceCorreccionActivoFijo=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesIndiceCorreccionActivoFijo.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jComboBoxTiposAccionesFormularioIndiceCorreccionActivoFijo.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteIndiceCorreccionActivoFijo) {				
					conSplash=true;//false;										
					
					//this.startProcessIndiceCorreccionActivoFijo(conSplash);
				
					this.generarReporteIndiceCorreccionActivoFijosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesIndiceCorreccionActivoFijo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jComboBoxTiposAccionesFormularioIndiceCorreccionActivoFijo.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoIndiceCorreccionActivoFijosSeleccionados();
				//this.jComboBoxTiposAccionesIndiceCorreccionActivoFijo.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoIndiceCorreccionActivoFijosSeleccionados(false);
				//this.jComboBoxTiposAccionesIndiceCorreccionActivoFijo.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoIndiceCorreccionActivoFijosSeleccionados(true);
				//this.jComboBoxTiposAccionesIndiceCorreccionActivoFijo.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessIndiceCorreccionActivoFijo();
				
				this.exportarIndiceCorreccionActivoFijosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesIndiceCorreccionActivoFijo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jComboBoxTiposAccionesFormularioIndiceCorreccionActivoFijo.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionIndiceCorreccionActivoFijos();
				//this.importarIndiceCorreccionActivoFijos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesIndiceCorreccionActivoFijo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jComboBoxTiposAccionesFormularioIndiceCorreccionActivoFijo.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessIndiceCorreccionActivoFijo();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelIndiceCorreccionActivoFijosSeleccionados();
				//this.jComboBoxTiposAccionesIndiceCorreccionActivoFijo.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Indice Correccion Activo Fijo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessIndiceCorreccionActivoFijo();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoIndiceCorreccionActivoFijo)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyIndiceCorreccionActivoFijo(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Indice Correccion Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesIndiceCorreccionActivoFijo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jComboBoxTiposAccionesFormularioIndiceCorreccionActivoFijo.setSelectedIndex(0);					
				}	
			} 			
			else if(IndiceCorreccionActivoFijoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteIndiceCorreccionActivoFijo) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessIndiceCorreccionActivoFijo(conSplash);
					
						//this.actualizarParametrosGeneralIndiceCorreccionActivoFijo();
						
						this.generarReporteProcesoAccionIndiceCorreccionActivoFijosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesIndiceCorreccionActivoFijo.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jComboBoxTiposAccionesFormularioIndiceCorreccionActivoFijo.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(IndiceCorreccionActivoFijoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Indice Correccion Activo FijoS SELECCIONADOS?", "MANTENIMIENTO DE Indice Correccion Activo Fijo", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessIndiceCorreccionActivoFijo();
				
						this.actualizarParametrosGeneralIndiceCorreccionActivoFijo();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.indicecorreccionactivofijoReturnGeneral=indicecorreccionactivofijoLogic.procesarAccionIndiceCorreccionActivoFijosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijos(),this.indicecorreccionactivofijoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarIndiceCorreccionActivoFijoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesIndiceCorreccionActivoFijo.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jComboBoxTiposAccionesFormularioIndiceCorreccionActivoFijo.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralIndiceCorreccionActivoFijo();
					
					IndiceCorreccionActivoFijoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarIndiceCorreccionActivoFijoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesIndiceCorreccionActivoFijo.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jComboBoxTiposAccionesFormularioIndiceCorreccionActivoFijo.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessIndiceCorreccionActivoFijo(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesIndiceCorreccionActivoFijoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessIndiceCorreccionActivoFijo();
			
			if(this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<IndiceCorreccionActivoFijo> indicecorreccionactivofijosSeleccionados=new ArrayList<IndiceCorreccionActivoFijo>();		
			IndiceCorreccionActivoFijo indicecorreccionactivofijo=new IndiceCorreccionActivoFijo();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingIndiceCorreccionActivoFijo(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesIndiceCorreccionActivoFijo.getSelectedItem();
			
			
			
			
			indicecorreccionactivofijosSeleccionados=this.getIndiceCorreccionActivoFijosSeleccionados(true);
			//this.sTipoAccion;
			
			if(indicecorreccionactivofijosSeleccionados.size()==1) {
				for(IndiceCorreccionActivoFijo indicecorreccionactivofijoAux:indicecorreccionactivofijosSeleccionados) {
					indicecorreccionactivofijo=indicecorreccionactivofijoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessIndiceCorreccionActivoFijo();
			
      		//this.finishProcessIndiceCorreccionActivoFijo(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarIndiceCorreccionActivoFijoReturnGeneral() throws Exception {
		if(this.indicecorreccionactivofijoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.indicecorreccionactivofijoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.indicecorreccionactivofijoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.indicecorreccionactivofijoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.indicecorreccionactivofijoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.indicecorreccionactivofijoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingIndiceCorreccionActivoFijo(false);
		}
		
		if(this.indicecorreccionactivofijoReturnGeneral.getConRetornoLista() || this.indicecorreccionactivofijoReturnGeneral.getConRetornoObjeto()) {
			if(this.indicecorreccionactivofijoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.indicecorreccionactivofijoLogic.setIndiceCorreccionActivoFijos(this.indicecorreccionactivofijoReturnGeneral.getIndiceCorreccionActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.indicecorreccionactivofijoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.indicecorreccionactivofijoLogic.setIndiceCorreccionActivoFijo(this.indicecorreccionactivofijoReturnGeneral.getIndiceCorreccionActivoFijo());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingIndiceCorreccionActivoFijo(false);
		}
	}
	
	public void actualizarParametrosGeneralIndiceCorreccionActivoFijo() throws Exception {
		
		
	}
	
	public ArrayList<IndiceCorreccionActivoFijo> getIndiceCorreccionActivoFijosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<IndiceCorreccionActivoFijo> indicecorreccionactivofijosSeleccionados=new ArrayList<IndiceCorreccionActivoFijo>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioIndiceCorreccionActivoFijo) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(IndiceCorreccionActivoFijo indicecorreccionactivofijoAux:indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijos()) {
					if(indicecorreccionactivofijoAux.getIsSelected()) {
						indicecorreccionactivofijosSeleccionados.add(indicecorreccionactivofijoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(IndiceCorreccionActivoFijo indicecorreccionactivofijoAux:this.indicecorreccionactivofijos) {
					if(indicecorreccionactivofijoAux.getIsSelected()) {
						indicecorreccionactivofijosSeleccionados.add(indicecorreccionactivofijoAux);				
					}
				}
			}
			
			if(indicecorreccionactivofijosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						indicecorreccionactivofijosSeleccionados.addAll(this.indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						indicecorreccionactivofijosSeleccionados.addAll(this.indicecorreccionactivofijos);				
					}
				}
			}
		} else {
			indicecorreccionactivofijosSeleccionados.add(this.indicecorreccionactivofijo);
		}
		
		return indicecorreccionactivofijosSeleccionados;
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
	
	public void generarReporteIndiceCorreccionActivoFijosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalIndiceCorreccionActivoFijosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoIndiceCorreccionActivoFijosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoIndiceCorreccionActivoFijosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoIndiceCorreccionActivoFijosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Indice Correccion Activo Fijo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesIndiceCorreccionActivoFijosSeleccionados() throws Exception {
		ArrayList<IndiceCorreccionActivoFijo> indicecorreccionactivofijosSeleccionados=new ArrayList<IndiceCorreccionActivoFijo>();		
		
		indicecorreccionactivofijosSeleccionados=this.getIndiceCorreccionActivoFijosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteIndiceCorreccionActivoFijos("Todos",indicecorreccionactivofijosSeleccionados);
		
	}	
	
	public void generarReporteNormalIndiceCorreccionActivoFijosSeleccionados() throws Exception {
		ArrayList<IndiceCorreccionActivoFijo> indicecorreccionactivofijosSeleccionados=new ArrayList<IndiceCorreccionActivoFijo>();		
		
		indicecorreccionactivofijosSeleccionados=this.getIndiceCorreccionActivoFijosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteIndiceCorreccionActivoFijos("Todos",indicecorreccionactivofijosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionIndiceCorreccionActivoFijosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<IndiceCorreccionActivoFijo> indicecorreccionactivofijosSeleccionados=new ArrayList<IndiceCorreccionActivoFijo>();
		
		indicecorreccionactivofijosSeleccionados=this.getIndiceCorreccionActivoFijosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteIndiceCorreccionActivoFijos("Todos",indicecorreccionactivofijosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoIndiceCorreccionActivoFijosSeleccionados() throws Exception {
		ArrayList<IndiceCorreccionActivoFijo> indicecorreccionactivofijosSeleccionados=new ArrayList<IndiceCorreccionActivoFijo>();		
		
		
		this.abrirInicializarFrameReporteDinamicoIndiceCorreccionActivoFijo();
		
		
		indicecorreccionactivofijosSeleccionados=this.getIndiceCorreccionActivoFijosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoIndiceCorreccionActivoFijo();
		
		
		//this.generarReporteIndiceCorreccionActivoFijos("Todos",indicecorreccionactivofijosSeleccionados ,indicecorreccionactivofijoImplementable,indicecorreccionactivofijoImplementableHome);
	}
	
	public void mostrarImportacionIndiceCorreccionActivoFijos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionIndiceCorreccionActivoFijo();
		
		this.abrirFrameImportacionIndiceCorreccionActivoFijo();		
		
			
		//this.generarReporteIndiceCorreccionActivoFijos("Todos",indicecorreccionactivofijosSeleccionados ,indicecorreccionactivofijoImplementable,indicecorreccionactivofijoImplementableHome);
	}
	
	public void importarIndiceCorreccionActivoFijos() throws Exception {		
	
	}
	
	public void exportarIndiceCorreccionActivoFijosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelIndiceCorreccionActivoFijosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoIndiceCorreccionActivoFijosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlIndiceCorreccionActivoFijosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Indice Correccion Activo Fijo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoIndiceCorreccionActivoFijosSeleccionados() throws Exception {
		ArrayList<IndiceCorreccionActivoFijo> indicecorreccionactivofijosSeleccionados=new ArrayList<IndiceCorreccionActivoFijo>();		
		
		indicecorreccionactivofijosSeleccionados=this.getIndiceCorreccionActivoFijosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"indicecorreccionactivofijo."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarIndiceCorreccionActivoFijo(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(IndiceCorreccionActivoFijo indicecorreccionactivofijoAux:indicecorreccionactivofijosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarIndiceCorreccionActivoFijo(indicecorreccionactivofijoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//indicecorreccionactivofijoAux.setsDetalleGeneralEntityReporte(indicecorreccionactivofijoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.indicecorreccionactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Indice Correccion Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarIndiceCorreccionActivoFijo(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=IndiceCorreccionActivoFijoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=IndiceCorreccionActivoFijoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=IndiceCorreccionActivoFijoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=IndiceCorreccionActivoFijoConstantesFunciones.LABEL_ANIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=IndiceCorreccionActivoFijoConstantesFunciones.LABEL_VALOR;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarIndiceCorreccionActivoFijo(IndiceCorreccionActivoFijo indicecorreccionactivofijo,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=indicecorreccionactivofijo.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=indicecorreccionactivofijo.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=indicecorreccionactivofijo.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=indicecorreccionactivofijo.getanio().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=indicecorreccionactivofijo.getvalor().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelIndiceCorreccionActivoFijosSeleccionados() throws Exception {
		ArrayList<IndiceCorreccionActivoFijo> indicecorreccionactivofijosSeleccionados=new ArrayList<IndiceCorreccionActivoFijo>();		
		
		indicecorreccionactivofijosSeleccionados=this.getIndiceCorreccionActivoFijosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"indicecorreccionactivofijo.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("IndiceCorreccionActivoFijos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelIndiceCorreccionActivoFijo(row);				
				iRow++;
			}				
			
			for(IndiceCorreccionActivoFijo indicecorreccionactivofijoAux:indicecorreccionactivofijosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelIndiceCorreccionActivoFijo(indicecorreccionactivofijoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.indicecorreccionactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Indice Correccion Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlIndiceCorreccionActivoFijosSeleccionados() throws Exception {
		ArrayList<IndiceCorreccionActivoFijo> indicecorreccionactivofijosSeleccionados=new ArrayList<IndiceCorreccionActivoFijo>();		
		
		indicecorreccionactivofijosSeleccionados=this.getIndiceCorreccionActivoFijosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"indicecorreccionactivofijo.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("indicecorreccionactivofijos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("indicecorreccionactivofijo");
			//elementRoot.appendChild(element);
		
			for(IndiceCorreccionActivoFijo indicecorreccionactivofijoAux:indicecorreccionactivofijosSeleccionados) {
				element = document.createElement("indicecorreccionactivofijo");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlIndiceCorreccionActivoFijo(indicecorreccionactivofijoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.indicecorreccionactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Indice Correccion Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelIndiceCorreccionActivoFijo(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(IndiceCorreccionActivoFijoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(IndiceCorreccionActivoFijoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(IndiceCorreccionActivoFijoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(IndiceCorreccionActivoFijoConstantesFunciones.LABEL_ANIO);
		cell = row.createCell(iColumn++);cell.setCellValue(IndiceCorreccionActivoFijoConstantesFunciones.LABEL_VALOR);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelIndiceCorreccionActivoFijo(IndiceCorreccionActivoFijo indicecorreccionactivofijo,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(indicecorreccionactivofijo.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(indicecorreccionactivofijo.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(indicecorreccionactivofijo.getanio());
		cell = row.createCell(iColumn++);cell.setCellValue(indicecorreccionactivofijo.getvalor());				
	}
	
	public void setFilaDatosExportarXmlIndiceCorreccionActivoFijo(IndiceCorreccionActivoFijo indicecorreccionactivofijo,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(IndiceCorreccionActivoFijoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(indicecorreccionactivofijo.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(IndiceCorreccionActivoFijoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(indicecorreccionactivofijo.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(IndiceCorreccionActivoFijoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(indicecorreccionactivofijo.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementanio = document.createElement(IndiceCorreccionActivoFijoConstantesFunciones.ANIO);
		elementanio.appendChild(document.createTextNode(indicecorreccionactivofijo.getanio().toString().trim()));
		element.appendChild(elementanio);

		Element elementvalor = document.createElement(IndiceCorreccionActivoFijoConstantesFunciones.VALOR);
		elementvalor.appendChild(document.createTextNode(indicecorreccionactivofijo.getvalor().toString().trim()));
		element.appendChild(elementvalor);
	}
	
	public void generarReporteGroupGenericoIndiceCorreccionActivoFijosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<IndiceCorreccionActivoFijo> indicecorreccionactivofijosSeleccionados=new ArrayList<IndiceCorreccionActivoFijo>();
		
		indicecorreccionactivofijosSeleccionados=this.getIndiceCorreccionActivoFijosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoIndiceCorreccionActivoFijo(indicecorreccionactivofijosSeleccionados);
		
		this.generarReporteIndiceCorreccionActivoFijos("Todos",indicecorreccionactivofijosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoIndiceCorreccionActivoFijo(ArrayList<IndiceCorreccionActivoFijo> indicecorreccionactivofijosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(IndiceCorreccionActivoFijo indicecorreccionactivofijoAux:indicecorreccionactivofijosSeleccionados) {
				indicecorreccionactivofijoAux.setsDetalleGeneralEntityReporte(indicecorreccionactivofijoAux.toString());
			
				if(sTipoSeleccionar.equals(IndiceCorreccionActivoFijoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					indicecorreccionactivofijoAux.setsDescripcionGeneralEntityReporte1(indicecorreccionactivofijoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(IndiceCorreccionActivoFijoConstantesFunciones.LABEL_ANIO)) {
					existe=true;
					indicecorreccionactivofijoAux.setsDescripcionGeneralEntityReporte1(indicecorreccionactivofijoAux.getanio().toString());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IndiceCorreccionActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesIndiceCorreccionActivoFijo(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoIndiceCorreccionActivoFijo=true;
				this.isVisibilidadCeldaNuevoRelacionesIndiceCorreccionActivoFijo=true;
				this.isVisibilidadCeldaGuardarCambiosIndiceCorreccionActivoFijo=true;
			}
			
			this.isVisibilidadCeldaModificarIndiceCorreccionActivoFijo=false;
			this.isVisibilidadCeldaActualizarIndiceCorreccionActivoFijo=false;
			this.isVisibilidadCeldaEliminarIndiceCorreccionActivoFijo=false;
			this.isVisibilidadCeldaCancelarIndiceCorreccionActivoFijo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarIndiceCorreccionActivoFijo=true;
				} else {
					this.isVisibilidadCeldaGuardarIndiceCorreccionActivoFijo=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoIndiceCorreccionActivoFijo=false;
			this.isVisibilidadCeldaNuevoRelacionesIndiceCorreccionActivoFijo=false;
			this.isVisibilidadCeldaGuardarCambiosIndiceCorreccionActivoFijo=false;
			this.isVisibilidadCeldaModificarIndiceCorreccionActivoFijo=false;
			this.isVisibilidadCeldaActualizarIndiceCorreccionActivoFijo=true;
			this.isVisibilidadCeldaEliminarIndiceCorreccionActivoFijo=false;
			this.isVisibilidadCeldaCancelarIndiceCorreccionActivoFijo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarIndiceCorreccionActivoFijo=true;
				} else {
					this.isVisibilidadCeldaGuardarIndiceCorreccionActivoFijo=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoIndiceCorreccionActivoFijo=false;
			this.isVisibilidadCeldaNuevoRelacionesIndiceCorreccionActivoFijo=false;
			this.isVisibilidadCeldaGuardarCambiosIndiceCorreccionActivoFijo=false;
			this.isVisibilidadCeldaModificarIndiceCorreccionActivoFijo=false;
			this.isVisibilidadCeldaActualizarIndiceCorreccionActivoFijo=true;
			this.isVisibilidadCeldaEliminarIndiceCorreccionActivoFijo=true;
			this.isVisibilidadCeldaCancelarIndiceCorreccionActivoFijo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarIndiceCorreccionActivoFijo=true;
				} else {
					this.isVisibilidadCeldaGuardarIndiceCorreccionActivoFijo=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoIndiceCorreccionActivoFijo=false;
			this.isVisibilidadCeldaNuevoRelacionesIndiceCorreccionActivoFijo=false;
			this.isVisibilidadCeldaGuardarCambiosIndiceCorreccionActivoFijo=false;
			this.isVisibilidadCeldaModificarIndiceCorreccionActivoFijo=false;
			this.isVisibilidadCeldaActualizarIndiceCorreccionActivoFijo=true;
			this.isVisibilidadCeldaEliminarIndiceCorreccionActivoFijo=false;
			this.isVisibilidadCeldaCancelarIndiceCorreccionActivoFijo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarIndiceCorreccionActivoFijo=false;
				} else {
					this.isVisibilidadCeldaGuardarIndiceCorreccionActivoFijo=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoIndiceCorreccionActivoFijo=true;
			this.isVisibilidadCeldaNuevoRelacionesIndiceCorreccionActivoFijo=true;
			this.isVisibilidadCeldaGuardarCambiosIndiceCorreccionActivoFijo=true;
			this.isVisibilidadCeldaModificarIndiceCorreccionActivoFijo=false;
			this.isVisibilidadCeldaActualizarIndiceCorreccionActivoFijo=false;
			this.isVisibilidadCeldaEliminarIndiceCorreccionActivoFijo=false;
			this.isVisibilidadCeldaCancelarIndiceCorreccionActivoFijo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarIndiceCorreccionActivoFijo=true;
				} else {
					this.isVisibilidadCeldaGuardarIndiceCorreccionActivoFijo=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoIndiceCorreccionActivoFijo=false;
			this.isVisibilidadCeldaNuevoRelacionesIndiceCorreccionActivoFijo=false;
			this.isVisibilidadCeldaGuardarCambiosIndiceCorreccionActivoFijo=false;
			this.isVisibilidadCeldaActualizarIndiceCorreccionActivoFijo=false;
			this.isVisibilidadCeldaEliminarIndiceCorreccionActivoFijo=false;
			this.isVisibilidadCeldaCancelarIndiceCorreccionActivoFijo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarIndiceCorreccionActivoFijo=false;
				} else {
					this.isVisibilidadCeldaGuardarIndiceCorreccionActivoFijo=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoIndiceCorreccionActivoFijo=false;
			this.isVisibilidadCeldaNuevoRelacionesIndiceCorreccionActivoFijo=false;
			this.isVisibilidadCeldaGuardarCambiosIndiceCorreccionActivoFijo=false;
			this.isVisibilidadCeldaModificarIndiceCorreccionActivoFijo=true;
			this.isVisibilidadCeldaActualizarIndiceCorreccionActivoFijo=false;
			this.isVisibilidadCeldaEliminarIndiceCorreccionActivoFijo=false;
			this.isVisibilidadCeldaCancelarIndiceCorreccionActivoFijo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarIndiceCorreccionActivoFijo=false;
				} else {
					this.isVisibilidadCeldaGuardarIndiceCorreccionActivoFijo=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(IndiceCorreccionActivoFijoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoIndiceCorreccionActivoFijo=true;
			this.isVisibilidadCeldaNuevoRelacionesIndiceCorreccionActivoFijo=true;
			this.isVisibilidadCeldaGuardarCambiosIndiceCorreccionActivoFijo=true;
		} else {
			this.actualizarEstadoPanelsIndiceCorreccionActivoFijo(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarIndiceCorreccionActivoFijo=false;
			//this.isVisibilidadCeldaVerFormIndiceCorreccionActivoFijo=false;
			this.isVisibilidadCeldaDuplicarIndiceCorreccionActivoFijo=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!indicecorreccionactivofijoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesIndiceCorreccionActivoFijo=false;
		} else {
			this.isVisibilidadCeldaNuevoIndiceCorreccionActivoFijo=false;
			this.isVisibilidadCeldaGuardarCambiosIndiceCorreccionActivoFijo=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(indicecorreccionactivofijoSessionBean.getEsGuardarRelacionado()) {
			if(!indicecorreccionactivofijoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesIndiceCorreccionActivoFijo=false;												
			}
			
			this.jButtonCerrarIndiceCorreccionActivoFijo.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesIndiceCorreccionActivoFijo=false;
		}
		
		if(!this.permiteMantenimiento(this.indicecorreccionactivofijo)) {
			this.isVisibilidadCeldaActualizarIndiceCorreccionActivoFijo=false;
			this.isVisibilidadCeldaEliminarIndiceCorreccionActivoFijo=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesIndiceCorreccionActivoFijo() {
	}
	
	public void actualizarEstadoPanelsIndiceCorreccionActivoFijo(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionIndiceCorreccionActivoFijo!=null) {
				this.jScrollPanelDatosEdicionIndiceCorreccionActivoFijo.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasIndiceCorreccionActivoFijo!=null) {
				this.jTabbedPaneBusquedasIndiceCorreccionActivoFijo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosIndiceCorreccionActivoFijo!=null) {
				this.jScrollPanelDatosIndiceCorreccionActivoFijo.setVisible(true);
			}
			
			if(this.jPanelPaginacionIndiceCorreccionActivoFijo!=null) {
				this.jPanelPaginacionIndiceCorreccionActivoFijo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesIndiceCorreccionActivoFijo!=null) {
				this.jPanelParametrosReportesIndiceCorreccionActivoFijo.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionIndiceCorreccionActivoFijo!=null) {
				this.jScrollPanelDatosEdicionIndiceCorreccionActivoFijo.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasIndiceCorreccionActivoFijo!=null) {
				this.jTabbedPaneBusquedasIndiceCorreccionActivoFijo.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosIndiceCorreccionActivoFijo!=null) {
				this.jScrollPanelDatosIndiceCorreccionActivoFijo.setVisible(false);
			}
			
			if(this.jPanelPaginacionIndiceCorreccionActivoFijo!=null) {
				this.jPanelPaginacionIndiceCorreccionActivoFijo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesIndiceCorreccionActivoFijo!=null) {
				this.jPanelParametrosReportesIndiceCorreccionActivoFijo.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionIndiceCorreccionActivoFijo!=null) {
				this.jScrollPanelDatosEdicionIndiceCorreccionActivoFijo.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasIndiceCorreccionActivoFijo!=null) {
				this.jTabbedPaneBusquedasIndiceCorreccionActivoFijo.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosIndiceCorreccionActivoFijo!=null) {
				this.jScrollPanelDatosIndiceCorreccionActivoFijo.setVisible(false);
			}
			
			if(this.jPanelPaginacionIndiceCorreccionActivoFijo!=null) {
				this.jPanelPaginacionIndiceCorreccionActivoFijo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesIndiceCorreccionActivoFijo!=null) {
				this.jPanelParametrosReportesIndiceCorreccionActivoFijo.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionIndiceCorreccionActivoFijo!=null) {
				this.jScrollPanelDatosEdicionIndiceCorreccionActivoFijo.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasIndiceCorreccionActivoFijo!=null) {
				this.jTabbedPaneBusquedasIndiceCorreccionActivoFijo.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosIndiceCorreccionActivoFijo!=null) {
				this.jScrollPanelDatosIndiceCorreccionActivoFijo.setVisible(false);
			}
			
			if(this.jPanelPaginacionIndiceCorreccionActivoFijo!=null) {
				this.jPanelPaginacionIndiceCorreccionActivoFijo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesIndiceCorreccionActivoFijo!=null) {
				this.jPanelParametrosReportesIndiceCorreccionActivoFijo.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionIndiceCorreccionActivoFijo!=null) {
				this.jScrollPanelDatosEdicionIndiceCorreccionActivoFijo.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasIndiceCorreccionActivoFijo!=null) {
				this.jTabbedPaneBusquedasIndiceCorreccionActivoFijo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosIndiceCorreccionActivoFijo!=null) {
				this.jScrollPanelDatosIndiceCorreccionActivoFijo.setVisible(true);
			}
			
			if(this.jPanelPaginacionIndiceCorreccionActivoFijo!=null) {
				this.jPanelPaginacionIndiceCorreccionActivoFijo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesIndiceCorreccionActivoFijo!=null) {
				this.jPanelParametrosReportesIndiceCorreccionActivoFijo.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionIndiceCorreccionActivoFijo!=null) {
				this.jScrollPanelDatosEdicionIndiceCorreccionActivoFijo.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasIndiceCorreccionActivoFijo!=null) {
				this.jTabbedPaneBusquedasIndiceCorreccionActivoFijo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosIndiceCorreccionActivoFijo!=null) {
				this.jScrollPanelDatosIndiceCorreccionActivoFijo.setVisible(true);
			}
			
			if(this.jPanelPaginacionIndiceCorreccionActivoFijo!=null) {
				this.jPanelPaginacionIndiceCorreccionActivoFijo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesIndiceCorreccionActivoFijo!=null) {
				this.jPanelParametrosReportesIndiceCorreccionActivoFijo.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionIndiceCorreccionActivoFijo!=null) {
				this.jScrollPanelDatosEdicionIndiceCorreccionActivoFijo.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasIndiceCorreccionActivoFijo!=null) {
				this.jTabbedPaneBusquedasIndiceCorreccionActivoFijo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosIndiceCorreccionActivoFijo!=null) {
				this.jScrollPanelDatosIndiceCorreccionActivoFijo.setVisible(true);
			}
			
			if(this.jPanelPaginacionIndiceCorreccionActivoFijo!=null) {
				this.jPanelPaginacionIndiceCorreccionActivoFijo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesIndiceCorreccionActivoFijo!=null) {
				this.jPanelParametrosReportesIndiceCorreccionActivoFijo.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.indicecorreccionactivofijoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasIndiceCorreccionActivoFijo!=null) {
					this.jTabbedPaneBusquedasIndiceCorreccionActivoFijo.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesIndiceCorreccionActivoFijo!=null) {
				this.jPanelParametrosReportesIndiceCorreccionActivoFijo.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.indicecorreccionactivofijoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasIndiceCorreccionActivoFijo!=null) {
				this.jTabbedPaneBusquedasIndiceCorreccionActivoFijo.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesIndiceCorreccionActivoFijo!=null) {
				this.jPanelParametrosReportesIndiceCorreccionActivoFijo.setVisible(true);
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
		
		//IndiceCorreccionActivoFijoSessionBean indicecorreccionactivofijoSessionBean=new IndiceCorreccionActivoFijoSessionBean();
		
		if(this.indicecorreccionactivofijoSessionBean==null) {
			this.indicecorreccionactivofijoSessionBean=new IndiceCorreccionActivoFijoSessionBean();
		}
		
		this.indicecorreccionactivofijoSessionBean.setsUltimaBusquedaIndiceCorreccionActivoFijo(this.getsAccionBusqueda());
		this.indicecorreccionactivofijoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.indicecorreccionactivofijoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			indicecorreccionactivofijoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//IndiceCorreccionActivoFijoSessionBean indicecorreccionactivofijoSessionBean=new IndiceCorreccionActivoFijoSessionBean();
		
		if(this.indicecorreccionactivofijoSessionBean==null) {
			this.indicecorreccionactivofijoSessionBean=new IndiceCorreccionActivoFijoSessionBean();
		}
		
		if(this.indicecorreccionactivofijoSessionBean.getsUltimaBusquedaIndiceCorreccionActivoFijo()!=null&&!this.indicecorreccionactivofijoSessionBean.getsUltimaBusquedaIndiceCorreccionActivoFijo().equals("")) {
			this.setsAccionBusqueda(indicecorreccionactivofijoSessionBean.getsUltimaBusquedaIndiceCorreccionActivoFijo());
			this.setiNumeroPaginacion(indicecorreccionactivofijoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(indicecorreccionactivofijoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(indicecorreccionactivofijoSessionBean.getid_empresa());
				indicecorreccionactivofijoSessionBean.setid_empresa(-1L);
			}
		}
		
		this.indicecorreccionactivofijoSessionBean.setsUltimaBusquedaIndiceCorreccionActivoFijo("");
		this.indicecorreccionactivofijoSessionBean.setiNumeroPaginacion(IndiceCorreccionActivoFijoConstantesFunciones.INUMEROPAGINACION);
		this.indicecorreccionactivofijoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaIndiceCorreccionActivoFijo(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioIndiceCorreccionActivoFijo() {
		this.updateBorderResaltarBusquedasFormularioIndiceCorreccionActivoFijo();
		this.updateVisibilidadBusquedasFormularioIndiceCorreccionActivoFijo();
		this.updateHabilitarBusquedasFormularioIndiceCorreccionActivoFijo();
	}
	
	public void updateBorderResaltarBusquedasFormularioIndiceCorreccionActivoFijo() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasIndiceCorreccionActivoFijo.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioIndiceCorreccionActivoFijo() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasIndiceCorreccionActivoFijo.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioIndiceCorreccionActivoFijo() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasIndiceCorreccionActivoFijo.getComponents().length>0) {
	
		}	
	
	}
	
	
	public void resaltarPanelBusquedaIndiceCorreccionActivoFijo(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		

		if(existe) {
			
			this.jTtoolBarIndiceCorreccionActivoFijo.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioIndiceCorreccionActivoFijo() throws Exception {

		if(this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioIndiceCorreccionActivoFijo();
		this.updateVisibilidadResaltarControlesFormularioIndiceCorreccionActivoFijo();
		this.updateHabilitarResaltarControlesFormularioIndiceCorreccionActivoFijo();
		
	}
	
	public void updateBorderResaltarControlesFormularioIndiceCorreccionActivoFijo() throws Exception {
		if(this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.indicecorreccionactivofijoConstantesFunciones.resaltaridIndiceCorreccionActivoFijo!=null && this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo!=null) {this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jLabelidIndiceCorreccionActivoFijo.setBorder(this.indicecorreccionactivofijoConstantesFunciones.resaltaridIndiceCorreccionActivoFijo);}
		if(this.indicecorreccionactivofijoConstantesFunciones.resaltarid_empresaIndiceCorreccionActivoFijo!=null && this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo!=null) {this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jComboBoxid_empresaIndiceCorreccionActivoFijo.setBorder(this.indicecorreccionactivofijoConstantesFunciones.resaltarid_empresaIndiceCorreccionActivoFijo);}
		if(this.indicecorreccionactivofijoConstantesFunciones.resaltaranioIndiceCorreccionActivoFijo!=null && this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo!=null) {this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jTextFieldanioIndiceCorreccionActivoFijo.setBorder(this.indicecorreccionactivofijoConstantesFunciones.resaltaranioIndiceCorreccionActivoFijo);}
		if(this.indicecorreccionactivofijoConstantesFunciones.resaltarvalorIndiceCorreccionActivoFijo!=null && this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo!=null) {this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jTextFieldvalorIndiceCorreccionActivoFijo.setBorder(this.indicecorreccionactivofijoConstantesFunciones.resaltarvalorIndiceCorreccionActivoFijo);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioIndiceCorreccionActivoFijo() throws Exception {		
		if(this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo!=null) {
	
		//this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jLabelidIndiceCorreccionActivoFijo.setVisible(this.indicecorreccionactivofijoConstantesFunciones.mostraridIndiceCorreccionActivoFijo);
		this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jPanelidIndiceCorreccionActivoFijo.setVisible(this.indicecorreccionactivofijoConstantesFunciones.mostraridIndiceCorreccionActivoFijo);
		//this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jComboBoxid_empresaIndiceCorreccionActivoFijo.setVisible(this.indicecorreccionactivofijoConstantesFunciones.mostrarid_empresaIndiceCorreccionActivoFijo);
		this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jPanelid_empresaIndiceCorreccionActivoFijo.setVisible(this.indicecorreccionactivofijoConstantesFunciones.mostrarid_empresaIndiceCorreccionActivoFijo);
		//this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jTextFieldanioIndiceCorreccionActivoFijo.setVisible(this.indicecorreccionactivofijoConstantesFunciones.mostraranioIndiceCorreccionActivoFijo);
		this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jPanelanioIndiceCorreccionActivoFijo.setVisible(this.indicecorreccionactivofijoConstantesFunciones.mostraranioIndiceCorreccionActivoFijo);
		//this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jTextFieldvalorIndiceCorreccionActivoFijo.setVisible(this.indicecorreccionactivofijoConstantesFunciones.mostrarvalorIndiceCorreccionActivoFijo);
		this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jPanelvalorIndiceCorreccionActivoFijo.setVisible(this.indicecorreccionactivofijoConstantesFunciones.mostrarvalorIndiceCorreccionActivoFijo);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioIndiceCorreccionActivoFijo() throws Exception {
		if(this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo!=null) {
	
		this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jLabelidIndiceCorreccionActivoFijo.setEnabled(this.indicecorreccionactivofijoConstantesFunciones.activaridIndiceCorreccionActivoFijo);
		this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jComboBoxid_empresaIndiceCorreccionActivoFijo.setEnabled(this.indicecorreccionactivofijoConstantesFunciones.activarid_empresaIndiceCorreccionActivoFijo);
		this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jTextFieldanioIndiceCorreccionActivoFijo.setEnabled(this.indicecorreccionactivofijoConstantesFunciones.activaranioIndiceCorreccionActivoFijo);
		this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo.jTextFieldvalorIndiceCorreccionActivoFijo.setEnabled(this.indicecorreccionactivofijoConstantesFunciones.activarvalorIndiceCorreccionActivoFijo);
		}
	}
	
		
}