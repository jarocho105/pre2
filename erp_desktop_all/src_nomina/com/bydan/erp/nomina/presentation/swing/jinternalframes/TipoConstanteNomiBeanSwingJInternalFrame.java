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

import com.bydan.erp.nomina.util.TipoConstanteNomiConstantesFunciones;
import com.bydan.erp.nomina.util.TipoConstanteNomiParameterReturnGeneral;
//import com.bydan.erp.nomina.util.TipoConstanteNomiParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.TipoConstanteNomiBean;
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
public class TipoConstanteNomiBeanSwingJInternalFrame extends TipoConstanteNomiJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoConstanteNomiBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoConstanteNomi> tipoconstantenomiValidator = new ClassValidator<TipoConstanteNomi>(TipoConstanteNomi.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoConstanteNomi tipoconstantenomi;	
	public TipoConstanteNomi tipoconstantenomiAux;
	public TipoConstanteNomi tipoconstantenomiAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoConstanteNomi tipoconstantenomiTotales;
	public Long idTipoConstanteNomiActual;
	public Long iIdNuevoTipoConstanteNomi=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	

	public Boolean isTienePermisosConstanteNomi=false;

	public Boolean getIsTienePermisosConstanteNomi() {
		return isTienePermisosConstanteNomi;
	}

	public void setIsTienePermisosConstanteNomi(Boolean isTienePermisosConstanteNomi) {
		this.isTienePermisosConstanteNomi= isTienePermisosConstanteNomi;
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
	
	public Boolean isPermisoTodoTipoConstanteNomi;
	public Boolean isPermisoNuevoTipoConstanteNomi;
	public Boolean isPermisoActualizarTipoConstanteNomi;
	public Boolean isPermisoActualizarOriginalTipoConstanteNomi;
	public Boolean isPermisoEliminarTipoConstanteNomi;
	public Boolean isPermisoGuardarCambiosTipoConstanteNomi;
	public Boolean isPermisoConsultaTipoConstanteNomi;
	public Boolean isPermisoBusquedaTipoConstanteNomi;
	public Boolean isPermisoReporteTipoConstanteNomi;
	public Boolean isPermisoPaginacionMedioTipoConstanteNomi;
	public Boolean isPermisoPaginacionAltoTipoConstanteNomi;
	public Boolean isPermisoPaginacionTodoTipoConstanteNomi;
	public Boolean isPermisoCopiarTipoConstanteNomi;
	public Boolean isPermisoVerFormTipoConstanteNomi;
	public Boolean isPermisoDuplicarTipoConstanteNomi;
	public Boolean isPermisoOrdenTipoConstanteNomi;
	
	
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
	
	public TipoConstanteNomiParameterReturnGeneral tipoconstantenomiReturnGeneral;
	public TipoConstanteNomiParameterReturnGeneral tipoconstantenomiParameterGeneral;
	
	

	public ConstanteNomiLogic constantenomiLogic=null;

	public ConstanteNomiLogic getConstanteNomiLogic() {
		return constantenomiLogic;
	}

	public void setConstanteNomiLogic(ConstanteNomiLogic constantenomiLogic) {
		this.constantenomiLogic = constantenomiLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoConstanteNomi=false;
	public Boolean esParaAccionDesdeFormularioTipoConstanteNomi=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TipoConstanteNomiSessionBeanAdditional tipoconstantenomiSessionBeanAdditional=null;
	
	public TipoConstanteNomiSessionBeanAdditional getTipoConstanteNomiSessionBeanAdditional() {
		return this.tipoconstantenomiSessionBeanAdditional;
	}
	
	public void setTipoConstanteNomiSessionBeanAdditional(TipoConstanteNomiSessionBeanAdditional tipoconstantenomiSessionBeanAdditional) {
		try {
			this.tipoconstantenomiSessionBeanAdditional=tipoconstantenomiSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TipoConstanteNomiBeanSwingJInternalFrameAdditional tipoconstantenomiBeanSwingJInternalFrameAdditional=null;
	//public class TipoConstanteNomiBeanSwingJInternalFrame
	
	public TipoConstanteNomiBeanSwingJInternalFrameAdditional getTipoConstanteNomiBeanSwingJInternalFrameAdditional() {
		return this.tipoconstantenomiBeanSwingJInternalFrameAdditional;
	}
	
	public void setTipoConstanteNomiBeanSwingJInternalFrameAdditional(TipoConstanteNomiBeanSwingJInternalFrameAdditional tipoconstantenomiBeanSwingJInternalFrameAdditional) {
		try {
			this.tipoconstantenomiBeanSwingJInternalFrameAdditional=tipoconstantenomiBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoConstanteNomiLogic tipoconstantenomiLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoConstanteNomi tipoconstantenomiBean;
	public TipoConstanteNomiConstantesFunciones tipoconstantenomiConstantesFunciones;
	//public TipoConstanteNomiParameterReturnGeneral tipoconstantenomiReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<TipoConstanteNomi> tipoconstantenomis;	
	//public List<TipoConstanteNomi> tipoconstantenomisEliminados;
	//public List<TipoConstanteNomi> tipoconstantenomisAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoConstanteNomi=false;
	public Boolean isVisibilidadCeldaDuplicarTipoConstanteNomi=true;
	public Boolean isVisibilidadCeldaCopiarTipoConstanteNomi=true;
	public Boolean isVisibilidadCeldaVerFormTipoConstanteNomi=true;
	public Boolean isVisibilidadCeldaOrdenTipoConstanteNomi=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoConstanteNomi=false;
	public Boolean isVisibilidadCeldaModificarTipoConstanteNomi=false;
	public Boolean isVisibilidadCeldaActualizarTipoConstanteNomi=false;
	public Boolean isVisibilidadCeldaEliminarTipoConstanteNomi=false;
	public Boolean isVisibilidadCeldaCancelarTipoConstanteNomi=false;
	public Boolean isVisibilidadCeldaGuardarTipoConstanteNomi=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoConstanteNomi=false;	
	
	
	
	public Long getiIdNuevoTipoConstanteNomi() {
		return this.iIdNuevoTipoConstanteNomi;
	}

	public void setiIdNuevoTipoConstanteNomi(Long iIdNuevoTipoConstanteNomi) {
		this.iIdNuevoTipoConstanteNomi = iIdNuevoTipoConstanteNomi;
	}
	
	public Long getidTipoConstanteNomiActual() {
		return this.idTipoConstanteNomiActual;
	}

	public void setidTipoConstanteNomiActual(Long idTipoConstanteNomiActual) {
		this.idTipoConstanteNomiActual = idTipoConstanteNomiActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoConstanteNomi gettipoconstantenomi() {
		return this.tipoconstantenomi;
	}

	public void settipoconstantenomi(TipoConstanteNomi tipoconstantenomi) {
		this.tipoconstantenomi = tipoconstantenomi;
	}
	
	public TipoConstanteNomi gettipoconstantenomiAux() {
		return this.tipoconstantenomiAux;
	}

	public void settipoconstantenomiAux(TipoConstanteNomi tipoconstantenomiAux) {
		this.tipoconstantenomiAux = tipoconstantenomiAux;
	}				
	
	public TipoConstanteNomi gettipoconstantenomiAnterior() {
		return this.tipoconstantenomiAnterior;
	}

	public void settipoconstantenomiAnterior(TipoConstanteNomi tipoconstantenomiAnterior) {
		this.tipoconstantenomiAnterior = tipoconstantenomiAnterior;
	}	
	
	public TipoConstanteNomi gettipoconstantenomiTotales() {
		return this.tipoconstantenomiTotales;
	}

	public void settipoconstantenomiTotales(TipoConstanteNomi tipoconstantenomiTotales) {
		this.tipoconstantenomiTotales = tipoconstantenomiTotales;
	}	
	
	public TipoConstanteNomi gettipoconstantenomiBean() {
		return this.tipoconstantenomiBean;
	}

	public void settipoconstantenomiBean(TipoConstanteNomi tipoconstantenomiBean) {
		this.tipoconstantenomiBean = tipoconstantenomiBean;
	}	
	
	public TipoConstanteNomiParameterReturnGeneral gettipoconstantenomiReturnGeneral() {
		return this.tipoconstantenomiReturnGeneral;
	}

	public void settipoconstantenomiReturnGeneral(TipoConstanteNomiParameterReturnGeneral tipoconstantenomiReturnGeneral) {
		this.tipoconstantenomiReturnGeneral = tipoconstantenomiReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoConstanteNomiLogic getTipoConstanteNomiLogic()	{		
		return tipoconstantenomiLogic;
	}

	public void setTipoConstanteNomiLogic(TipoConstanteNomiLogic tipoconstantenomiLogic) {
		this.tipoconstantenomiLogic = tipoconstantenomiLogic;
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
	
	public Boolean getIsEsNuevoTipoConstanteNomi() {
		return isEsNuevoTipoConstanteNomi;
	}

	public void setIsEsNuevoTipoConstanteNomi(Boolean isEsNuevoTipoConstanteNomi) {
		this.isEsNuevoTipoConstanteNomi = isEsNuevoTipoConstanteNomi;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoConstanteNomi() {
		return esParaAccionDesdeFormularioTipoConstanteNomi;
	}
	
	public void setEsParaAccionDesdeFormularioTipoConstanteNomi(Boolean esParaAccionDesdeFormularioTipoConstanteNomi) {
		this.esParaAccionDesdeFormularioTipoConstanteNomi = esParaAccionDesdeFormularioTipoConstanteNomi;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesTipoConstanteNomi() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoConstanteNomiConstantesFunciones.refrescarForeignKeysDescripcionesTipoConstanteNomi(this.tipoconstantenomiLogic.getTipoConstanteNomis());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoConstanteNomiConstantesFunciones.refrescarForeignKeysDescripcionesTipoConstanteNomi(this.tipoconstantenomis);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipoconstantenomiLogic.setTipoConstanteNomis(this.tipoconstantenomis);
			tipoconstantenomiLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoConstanteNomiParameterReturnGeneral getTipoConstanteNomiParameterGeneral() {
		return this.tipoconstantenomiParameterGeneral;
	}
	
	public void setTipoConstanteNomiParameterGeneral(TipoConstanteNomiParameterReturnGeneral tipoconstantenomiParameterGeneral) {
		this.tipoconstantenomiParameterGeneral = tipoconstantenomiParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoConstanteNomi() {
		return isPermisoTodoTipoConstanteNomi;
	}

	public void setIsPermisoTodoTipoConstanteNomi(Boolean isPermisoTodoTipoConstanteNomi) {
		this.isPermisoTodoTipoConstanteNomi = isPermisoTodoTipoConstanteNomi;
	}

	public Boolean getIsPermisoNuevoTipoConstanteNomi() {
		return isPermisoNuevoTipoConstanteNomi;
	}

	public void setIsPermisoNuevoTipoConstanteNomi(Boolean isPermisoNuevoTipoConstanteNomi) {
		this.isPermisoNuevoTipoConstanteNomi = isPermisoNuevoTipoConstanteNomi;
	}

	public Boolean getIsPermisoActualizarTipoConstanteNomi() {
		return isPermisoActualizarTipoConstanteNomi;
	}

	public void setIsPermisoActualizarTipoConstanteNomi(Boolean isPermisoActualizarTipoConstanteNomi) {
		this.isPermisoActualizarTipoConstanteNomi = isPermisoActualizarTipoConstanteNomi;
	}

	public Boolean getIsPermisoEliminarTipoConstanteNomi() {
		return isPermisoEliminarTipoConstanteNomi;
	}

	public void setIsPermisoEliminarTipoConstanteNomi(Boolean isPermisoEliminarTipoConstanteNomi) {
		this.isPermisoEliminarTipoConstanteNomi = isPermisoEliminarTipoConstanteNomi;
	}

	public Boolean getIsPermisoGuardarCambiosTipoConstanteNomi() {
		return isPermisoGuardarCambiosTipoConstanteNomi;
	}

	public void setIsPermisoGuardarCambiosTipoConstanteNomi(Boolean isPermisoGuardarCambiosTipoConstanteNomi) {
		this.isPermisoGuardarCambiosTipoConstanteNomi = isPermisoGuardarCambiosTipoConstanteNomi;
	}
	
	public Boolean getIsPermisoConsultaTipoConstanteNomi() {
		return isPermisoConsultaTipoConstanteNomi;
	}

	public void setIsPermisoConsultaTipoConstanteNomi(Boolean isPermisoConsultaTipoConstanteNomi) {
		this.isPermisoConsultaTipoConstanteNomi = isPermisoConsultaTipoConstanteNomi;
	}

	public Boolean getIsPermisoBusquedaTipoConstanteNomi() {
		return isPermisoBusquedaTipoConstanteNomi;
	}

	public void setIsPermisoBusquedaTipoConstanteNomi(Boolean isPermisoBusquedaTipoConstanteNomi) {
		this.isPermisoBusquedaTipoConstanteNomi = isPermisoBusquedaTipoConstanteNomi;
	}

	public Boolean getIsPermisoReporteTipoConstanteNomi() {
		return isPermisoReporteTipoConstanteNomi;
	}

	public void setIsPermisoReporteTipoConstanteNomi(Boolean isPermisoReporteTipoConstanteNomi) {
		this.isPermisoReporteTipoConstanteNomi = isPermisoReporteTipoConstanteNomi;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoConstanteNomi() {
		return isPermisoPaginacionMedioTipoConstanteNomi;
	}

	public void setIsPermisoPaginacionMedioTipoConstanteNomi(Boolean isPermisoPaginacionMedioTipoConstanteNomi) {
		this.isPermisoPaginacionMedioTipoConstanteNomi = isPermisoPaginacionMedioTipoConstanteNomi;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoConstanteNomi() {
		return isPermisoPaginacionTodoTipoConstanteNomi;
	}

	public void setIsPermisoPaginacionTodoTipoConstanteNomi(Boolean isPermisoPaginacionTodoTipoConstanteNomi) {
		this.isPermisoPaginacionTodoTipoConstanteNomi = isPermisoPaginacionTodoTipoConstanteNomi;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoConstanteNomi() {
		return isPermisoPaginacionAltoTipoConstanteNomi;
	}

	public void setIsPermisoPaginacionAltoTipoConstanteNomi(Boolean isPermisoPaginacionAltoTipoConstanteNomi) {
		this.isPermisoPaginacionAltoTipoConstanteNomi = isPermisoPaginacionAltoTipoConstanteNomi;
	}
	
	public Boolean getIsPermisoCopiarTipoConstanteNomi() {
		return isPermisoCopiarTipoConstanteNomi;
	}

	public void setIsPermisoCopiarTipoConstanteNomi(Boolean isPermisoCopiarTipoConstanteNomi) {
		this.isPermisoCopiarTipoConstanteNomi = isPermisoCopiarTipoConstanteNomi;
	}
	
	public Boolean getIsPermisoVerFormTipoConstanteNomi() {
		return isPermisoVerFormTipoConstanteNomi;
	}

	public void setIsPermisoVerFormTipoConstanteNomi(Boolean isPermisoVerFormTipoConstanteNomi) {
		this.isPermisoVerFormTipoConstanteNomi = isPermisoVerFormTipoConstanteNomi;
	}
	
	public Boolean getIsPermisoDuplicarTipoConstanteNomi() {
		return isPermisoDuplicarTipoConstanteNomi;
	}

	public void setIsPermisoDuplicarTipoConstanteNomi(Boolean isPermisoDuplicarTipoConstanteNomi) {
		this.isPermisoDuplicarTipoConstanteNomi = isPermisoDuplicarTipoConstanteNomi;
	}
	
	public Boolean getIsPermisoOrdenTipoConstanteNomi() {
		return isPermisoOrdenTipoConstanteNomi;
	}

	public void setIsPermisoOrdenTipoConstanteNomi(Boolean isPermisoOrdenTipoConstanteNomi) {
		this.isPermisoOrdenTipoConstanteNomi = isPermisoOrdenTipoConstanteNomi;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoConstanteNomi() {
		return isVisibilidadCeldaNuevoTipoConstanteNomi;
	}

	public void setIsVisibilidadCeldaNuevoTipoConstanteNomi(Boolean isVisibilidadCeldaNuevoTipoConstanteNomi) {
		this.isVisibilidadCeldaNuevoTipoConstanteNomi = isVisibilidadCeldaNuevoTipoConstanteNomi;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoConstanteNomi() {
		return isVisibilidadCeldaDuplicarTipoConstanteNomi;
	}

	public void setIsVisibilidadCeldaDuplicarTipoConstanteNomi(Boolean isVisibilidadCeldaDuplicarTipoConstanteNomi) {
		this.isVisibilidadCeldaDuplicarTipoConstanteNomi = isVisibilidadCeldaDuplicarTipoConstanteNomi;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoConstanteNomi() {
		return isVisibilidadCeldaCopiarTipoConstanteNomi;
	}

	public void setIsVisibilidadCeldaCopiarTipoConstanteNomi(Boolean isVisibilidadCeldaCopiarTipoConstanteNomi) {
		this.isVisibilidadCeldaCopiarTipoConstanteNomi = isVisibilidadCeldaCopiarTipoConstanteNomi;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoConstanteNomi() {
		return isVisibilidadCeldaVerFormTipoConstanteNomi;
	}

	public void setIsVisibilidadCeldaVerFormTipoConstanteNomi(Boolean isVisibilidadCeldaVerFormTipoConstanteNomi) {
		this.isVisibilidadCeldaVerFormTipoConstanteNomi = isVisibilidadCeldaVerFormTipoConstanteNomi;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoConstanteNomi() {
		return isVisibilidadCeldaOrdenTipoConstanteNomi;
	}

	public void setIsVisibilidadCeldaOrdenTipoConstanteNomi(Boolean isVisibilidadCeldaOrdenTipoConstanteNomi) {
		this.isVisibilidadCeldaOrdenTipoConstanteNomi = isVisibilidadCeldaOrdenTipoConstanteNomi;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoConstanteNomi() {
		return isVisibilidadCeldaNuevoRelacionesTipoConstanteNomi;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoConstanteNomi(Boolean isVisibilidadCeldaNuevoRelacionesTipoConstanteNomi) {
		this.isVisibilidadCeldaNuevoRelacionesTipoConstanteNomi = isVisibilidadCeldaNuevoRelacionesTipoConstanteNomi;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoConstanteNomi() {
		return isVisibilidadCeldaModificarTipoConstanteNomi;
	}

	public void setIsVisibilidadCeldaModificarTipoConstanteNomi(Boolean isVisibilidadCeldaModificarTipoConstanteNomi) {
		this.isVisibilidadCeldaModificarTipoConstanteNomi = isVisibilidadCeldaModificarTipoConstanteNomi;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoConstanteNomi() {
		return isVisibilidadCeldaActualizarTipoConstanteNomi;
	}

	public void setIsVisibilidadCeldaActualizarTipoConstanteNomi(Boolean isVisibilidadCeldaActualizarTipoConstanteNomi) {
		this.isVisibilidadCeldaActualizarTipoConstanteNomi = isVisibilidadCeldaActualizarTipoConstanteNomi;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoConstanteNomi() {
		return isVisibilidadCeldaEliminarTipoConstanteNomi;
	}

	public void setIsVisibilidadCeldaEliminarTipoConstanteNomi(Boolean isVisibilidadCeldaEliminarTipoConstanteNomi) {
		this.isVisibilidadCeldaEliminarTipoConstanteNomi = isVisibilidadCeldaEliminarTipoConstanteNomi;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoConstanteNomi() {
		return isVisibilidadCeldaCancelarTipoConstanteNomi;
	}

	public void setIsVisibilidadCeldaCancelarTipoConstanteNomi(Boolean isVisibilidadCeldaCancelarTipoConstanteNomi) {
		this.isVisibilidadCeldaCancelarTipoConstanteNomi = isVisibilidadCeldaCancelarTipoConstanteNomi;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoConstanteNomi() {
		return isVisibilidadCeldaGuardarTipoConstanteNomi;
	}

	public void setIsVisibilidadCeldaGuardarTipoConstanteNomi(Boolean isVisibilidadCeldaGuardarTipoConstanteNomi) {
		this.isVisibilidadCeldaGuardarTipoConstanteNomi = isVisibilidadCeldaGuardarTipoConstanteNomi;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoConstanteNomi() {
		return isVisibilidadCeldaGuardarCambiosTipoConstanteNomi;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoConstanteNomi(Boolean isVisibilidadCeldaGuardarCambiosTipoConstanteNomi) {
		this.isVisibilidadCeldaGuardarCambiosTipoConstanteNomi = isVisibilidadCeldaGuardarCambiosTipoConstanteNomi;
	}
		
	public TipoConstanteNomiSessionBean gettipoconstantenomiSessionBean() {
		return this.tipoconstantenomiSessionBean;
	}
	
	public void settipoconstantenomiSessionBean(TipoConstanteNomiSessionBean tipoconstantenomiSessionBean) {
		this.tipoconstantenomiSessionBean=tipoconstantenomiSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoConstanteNomi(TipoConstanteNomi tipoconstantenomi)throws Exception {
		try {
			
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
	
	public void bugActualizarReferenciaActual(TipoConstanteNomi tipoconstantenomi,TipoConstanteNomi tipoconstantenomiAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoConstanteNomi(tipoconstantenomi);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipoconstantenomiAux.setId(tipoconstantenomi.getId());
		tipoconstantenomiAux.setVersionRow(tipoconstantenomi.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoConstanteNomi();
		
			int intSelectedRow = this.jTableDatosTipoConstanteNomi.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconstantenomi =(TipoConstanteNomi) this.tipoconstantenomiLogic.getTipoConstanteNomis().toArray()[this.jTableDatosTipoConstanteNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipoconstantenomi =(TipoConstanteNomi) this.tipoconstantenomis.toArray()[this.jTableDatosTipoConstanteNomi.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoConstanteNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoConstanteNomi(this.tipoconstantenomi,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoConstanteNomi(this.tipoconstantenomi);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipoconstantenomiValidator.getInvalidValues(this.tipoconstantenomi);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipoconstantenomiLogic.setDatosCliente(datosCliente);
			tipoconstantenomiLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipoconstantenomiAux=new  TipoConstanteNomi();
				
				tipoconstantenomiAux.setIsNew(true);
				tipoconstantenomiAux.setIsChanged(true);
				
				tipoconstantenomiAux.setTipoConstanteNomiOriginal(this.tipoconstantenomi);
				
				tipoconstantenomiAux.setId(this.tipoconstantenomi.getId());	
				tipoconstantenomiAux.setVersionRow(this.tipoconstantenomi.getVersionRow());	
				tipoconstantenomiAux.setcodigo(this.tipoconstantenomi.getcodigo());	
				tipoconstantenomiAux.setnombre(this.tipoconstantenomi.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoconstantenomiSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoconstantenomiSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipoconstantenomiAux,tipoconstantenomiLogic.getTipoConstanteNomis());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoconstantenomiAux,tipoconstantenomis);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipoconstantenomiSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoconstantenomiSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoconstantenomiLogic.saveTipoConstanteNomis();//WithConnection
						//tipoconstantenomiLogic.getSetVersionRowTipoConstanteNomis();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoconstantenomi,tipoconstantenomiAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoconstantenomiSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFrame.constantenomiLogic.getConstanteNomis().addAll(this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFrame.constantenomisEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFrame.constantenomis.addAll(this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFrame.constantenomisEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.tipoconstantenomiSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFrame.jInternalFrameDetalleFormConstanteNomi.empleadoconstanteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFrame.jInternalFrameDetalleFormConstanteNomi.empleadoconstanteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFrame.jInternalFrameDetalleFormConstanteNomi.empleadoconstanteBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFrame.jInternalFrameDetalleFormConstanteNomi.empleadoconstanteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFrame.jInternalFrameDetalleFormConstanteNomi.empleadoconstanteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFrame.jInternalFrameDetalleFormConstanteNomi.empleadoconstanteBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipoconstantenomiLogic.saveTipoConstanteNomiRelaciones(tipoconstantenomiAux,this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFrame.constantenomiLogic.getConstanteNomis());//WithConnection
								//tipoconstantenomiLogic.getSetVersionRowTipoConstanteNomis();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipoconstantenomi,tipoconstantenomiAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFrame.constantenomiLogic.setConstanteNomis(new ArrayList<ConstanteNomi>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFrame.constantenomis= new ArrayList<ConstanteNomi>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoconstantenomiAux.setConstanteNomis(this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFrame.constantenomiLogic.getConstanteNomis());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipoconstantenomiSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipoconstantenomiSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipoconstantenomiAux,tipoconstantenomiLogic.getTipoConstanteNomis());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipoconstantenomiAux,tipoconstantenomis);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipoconstantenomi,tipoconstantenomiAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipoconstantenomiAux=new  TipoConstanteNomi();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipoconstantenomiSessionBean.getEsGuardarRelacionado() 
					|| (this.tipoconstantenomiSessionBean.getEsGuardarRelacionado() && this.tipoconstantenomi.getId()>=0)) {
						
					tipoconstantenomiAux.setIsNew(false);
				}
				
				tipoconstantenomiAux.setIsDeleted(false);
			
				tipoconstantenomiAux.setId(this.tipoconstantenomi.getId());	
				tipoconstantenomiAux.setVersionRow(this.tipoconstantenomi.getVersionRow());	
				tipoconstantenomiAux.setcodigo(this.tipoconstantenomi.getcodigo());	
				tipoconstantenomiAux.setnombre(this.tipoconstantenomi.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoconstantenomiAux,tipoconstantenomiLogic.getTipoConstanteNomis());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoconstantenomiAux,tipoconstantenomis);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipoconstantenomiSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoconstantenomiSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoconstantenomiLogic.saveTipoConstanteNomis();//WithConnection
						//tipoconstantenomiLogic.getSetVersionRowTipoConstanteNomis();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoconstantenomi,tipoconstantenomiAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoconstantenomiSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFrame.constantenomiLogic.getConstanteNomis().addAll(this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFrame.constantenomisEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFrame.constantenomis.addAll(this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFrame.constantenomisEliminados);
						}
						//ARCHITECTURE
						
						if(!this.tipoconstantenomiSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFrame.jInternalFrameDetalleFormConstanteNomi.empleadoconstanteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFrame.jInternalFrameDetalleFormConstanteNomi.empleadoconstanteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFrame.jInternalFrameDetalleFormConstanteNomi.empleadoconstanteBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFrame.jInternalFrameDetalleFormConstanteNomi.empleadoconstanteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFrame.jInternalFrameDetalleFormConstanteNomi.empleadoconstanteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFrame.jInternalFrameDetalleFormConstanteNomi.empleadoconstanteBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipoconstantenomiLogic.saveTipoConstanteNomiRelaciones(tipoconstantenomiAux,this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFrame.constantenomiLogic.getConstanteNomis());//WithConnection
								//tipoconstantenomiLogic.getSetVersionRowTipoConstanteNomis();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipoconstantenomi,tipoconstantenomiAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFrame.constantenomiLogic.setConstanteNomis(new ArrayList<ConstanteNomi>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFrame.constantenomis= new ArrayList<ConstanteNomi>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoconstantenomiAux.setConstanteNomis(this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFrame.constantenomiLogic.getConstanteNomis());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipoconstantenomiSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipoconstantenomiSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipoconstantenomiAux,tipoconstantenomiLogic.getTipoConstanteNomis());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipoconstantenomiAux,tipoconstantenomis);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipoconstantenomi,tipoconstantenomiAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipoconstantenomiAux=new  TipoConstanteNomi();
				
				tipoconstantenomiAux.setIsNew(false);
				tipoconstantenomiAux.setIsChanged(false);
				
				tipoconstantenomiAux.setIsDeleted(true);
				
				tipoconstantenomiAux.setId(this.tipoconstantenomi.getId());	
				tipoconstantenomiAux.setVersionRow(this.tipoconstantenomi.getVersionRow());	
				tipoconstantenomiAux.setcodigo(this.tipoconstantenomi.getcodigo());	
				tipoconstantenomiAux.setnombre(this.tipoconstantenomi.getnombre());	
				
				if(this.tipoconstantenomiSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipoconstantenomiAux.getId()>=0) {	
						this.tipoconstantenomisEliminados.add(tipoconstantenomiAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipoconstantenomiAux,tipoconstantenomiLogic.getTipoConstanteNomis());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoconstantenomiAux,tipoconstantenomis);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipoconstantenomiSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoconstantenomiSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoconstantenomiLogic.saveTipoConstanteNomis();//WithConnection
						//tipoconstantenomiLogic.getSetVersionRowTipoConstanteNomis();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoconstantenomiSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFrame.constantenomiLogic.getConstanteNomis().addAll(this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFrame.constantenomisEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFrame.constantenomis.addAll(this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFrame.constantenomisEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.tipoconstantenomiSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFrame.jInternalFrameDetalleFormConstanteNomi.empleadoconstanteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFrame.jInternalFrameDetalleFormConstanteNomi.empleadoconstanteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFrame.jInternalFrameDetalleFormConstanteNomi.empleadoconstanteBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFrame.jInternalFrameDetalleFormConstanteNomi.empleadoconstanteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFrame.jInternalFrameDetalleFormConstanteNomi.empleadoconstanteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFrame.jInternalFrameDetalleFormConstanteNomi.empleadoconstanteBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipoconstantenomiLogic.saveTipoConstanteNomiRelaciones(tipoconstantenomiAux,this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFrame.constantenomiLogic.getConstanteNomis());//WithConnection
								//tipoconstantenomiLogic.getSetVersionRowTipoConstanteNomis();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFrame.constantenomiLogic.setConstanteNomis(new ArrayList<ConstanteNomi>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFrame.constantenomis= new ArrayList<ConstanteNomi>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoconstantenomiAux.setConstanteNomis(this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFrame.constantenomiLogic.getConstanteNomis());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipoconstantenomiSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipoconstantenomiSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipoconstantenomiAux,tipoconstantenomiLogic.getTipoConstanteNomis());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipoconstantenomiAux,tipoconstantenomis);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconstantenomiLogic.getTipoConstanteNomis().addAll(this.tipoconstantenomisEliminados);
					
					tipoconstantenomiLogic.saveTipoConstanteNomis();//WithConnection
					//tipoconstantenomiLogic.getSetVersionRowTipoConstanteNomis();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.tipoconstantenomisEliminados= new ArrayList<TipoConstanteNomi>();		
			}
			
			if(this.tipoconstantenomiSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoconstantenomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Constante GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Constante",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipoconstantenomi=tipoconstantenomiAux;
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
      		//this.finishProcessTipoConstanteNomi();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoConstanteNomi tipoconstantenomiLocal) throws Exception {
		
		if(this.tipoconstantenomiSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				tipoconstantenomiLocal.setConstanteNomis(this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFrame.constantenomiLogic.getConstanteNomis());
			
			} else {
			
				tipoconstantenomiLocal.setConstanteNomis(this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFrame.constantenomis);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoConstanteNomi tipoconstantenomiLocal) throws Exception {	
		if(this.tipoconstantenomiSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarTipoConstanteNomiActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoConstanteNomi.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoconstantenomi =(TipoConstanteNomi) this.tipoconstantenomiLogic.getTipoConstanteNomis().toArray()[this.jTableDatosTipoConstanteNomi.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipoconstantenomi =(TipoConstanteNomi) this.tipoconstantenomis.toArray()[this.jTableDatosTipoConstanteNomi.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipoconstantenomiValidator.getInvalidValues(this.tipoconstantenomi);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoConstanteNomi tipoconstantenomi,List<TipoConstanteNomi> tipoconstantenomis) throws Exception {
		try	{		
			TipoConstanteNomiConstantesFunciones.actualizarLista(tipoconstantenomi,tipoconstantenomis,this.tipoconstantenomiSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoConstanteNomi tipoconstantenomi,List<TipoConstanteNomi> tipoconstantenomis) throws Exception {
		try	{			
			TipoConstanteNomiConstantesFunciones.actualizarSelectedLista(tipoconstantenomi,tipoconstantenomis);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoConstanteNomi> tipoconstantenomisLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipoconstantenomisLocal=this.tipoconstantenomiLogic.getTipoConstanteNomis();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipoconstantenomisLocal=this.tipoconstantenomis;
			}
			//ARCHITECTURE
		
			for(TipoConstanteNomi tipoconstantenomiLocal:tipoconstantenomisLocal) {
				if(this.permiteMantenimiento(tipoconstantenomiLocal) && tipoconstantenomiLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoConstanteNomiConstantesFunciones.getTipoConstanteNomiLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoConstanteNomiConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoConstanteNomi.jLabelcodigoTipoConstanteNomi,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoConstanteNomiConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoConstanteNomi.jLabelnombreTipoConstanteNomi,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoConstanteNomi!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoConstanteNomi.jLabelcodigoTipoConstanteNomi,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoConstanteNomi.jLabelnombreTipoConstanteNomi,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("ConstanteNomi")) {
			if(this.tipoconstantenomi==null) {
				this.tipoconstantenomi= new TipoConstanteNomi();
			}

			if(this.tipoconstantenomiSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoConstanteNomi
				this.setVariablesFormularioToObjetoActualTipoConstanteNomi(this.tipoconstantenomi,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoConstanteNomi(this.tipoconstantenomi);

				this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFrame.getconstantenomi().setTipoConstanteNomi(this.tipoconstantenomi);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTipoConstanteNomi--;	
		
		
		this.tipoconstantenomiAux=new TipoConstanteNomi();
		
		this.tipoconstantenomiAux.setId(this.iIdNuevoTipoConstanteNomi);
		this.tipoconstantenomiAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoconstantenomiLogic.getTipoConstanteNomis().add(this.tipoconstantenomiAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipoconstantenomis.add(this.tipoconstantenomiAux);
		}
		//ARCHITECTURE
		
		this.tipoconstantenomi=this.tipoconstantenomiAux;
		
		if(TipoConstanteNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoConstanteNomi(this.tipoconstantenomi);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoConstanteNomi(this.tipoconstantenomi);
		}
				
		//this.setDefaultControlesTipoConstanteNomi();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoConstanteNomi();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoConstanteNomi();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoConstanteNomi();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoConstanteNomi(this.tipoconstantenomiBean,this.tipoconstantenomi,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoConstanteNomi(this.tipoconstantenomi);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoConstanteNomiConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipoconstantenomiSessionBean.getConGuardarRelaciones()) {
			classes=TipoConstanteNomiConstantesFunciones.getClassesRelationshipsOfTipoConstanteNomi(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipoconstantenomiReturnGeneral=tipoconstantenomiLogic.procesarEventosTipoConstanteNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoconstantenomiLogic.getTipoConstanteNomis(),this.tipoconstantenomi,this.tipoconstantenomiParameterGeneral,this.isEsNuevoTipoConstanteNomi,classes);//this.tipoconstantenomiLogic.getTipoConstanteNomi()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoConstanteNomi(this.tipoconstantenomiReturnGeneral,this.tipoconstantenomiBean,false);
		
		if(this.tipoconstantenomiReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoConstanteNomi(this.tipoconstantenomiReturnGeneral.getTipoConstanteNomi());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoConstanteNomi(this.tipoconstantenomiReturnGeneral.getTipoConstanteNomi());
		}
		
		if(this.tipoconstantenomiReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoConstanteNomi(this.tipoconstantenomiReturnGeneral.getTipoConstanteNomi(),classes);//this.tipoconstantenomiBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoConstanteNomi(this.tipoconstantenomi,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoConstanteNomi();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoConstanteNomi();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoConstanteNomiBeanSwingJInternalFrameAdditional.RecargarFormTipoConstanteNomi(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoConstanteNomi(false);
						
			if(tipoconstantenomiSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFrame.constantenomiSessionBean.getEsGuardarRelacionado() && ConstanteNomiJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonConstanteNomiActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TipoConstanteNomiJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoConstanteNomi();
			}
			
			this.actualizarVisualTableDatosTipoConstanteNomi();
			
			this.jTableDatosTipoConstanteNomi.setRowSelectionInterval(this.getIndiceNuevoTipoConstanteNomi(), this.getIndiceNuevoTipoConstanteNomi());
			
			this.seleccionarFilaTablaTipoConstanteNomiActual();
						
			this.actualizarEstadoCeldasBotonesTipoConstanteNomi("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoConstanteNomi(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoConstanteNomi.jTextFieldcodigoTipoConstanteNomi.setEnabled(isHabilitar && this.tipoconstantenomiConstantesFunciones.activarcodigoTipoConstanteNomi);
		this.jInternalFrameDetalleFormTipoConstanteNomi.jTextAreanombreTipoConstanteNomi.setEnabled(isHabilitar && this.tipoconstantenomiConstantesFunciones.activarnombreTipoConstanteNomi);	
		
	};
	
	public void setDefaultControlesTipoConstanteNomi() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoConstanteNomi(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipoconstantenomiSessionBean.setConGuardarRelaciones(true);			
			this.tipoconstantenomiSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoConstanteNomi.jTabbedPaneRelacionesTipoConstanteNomi.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFrame.constantenomiSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.tipoconstantenomiSessionBean.setConGuardarRelaciones(false);			
			this.tipoconstantenomiSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoConstanteNomi.jTabbedPaneRelacionesTipoConstanteNomi.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFrame.constantenomiSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTipoConstanteNomi() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoConstanteNomi tipoconstantenomiAux:this.tipoconstantenomiLogic.getTipoConstanteNomis()) {
				if(tipoconstantenomiAux.getId().equals(this.iIdNuevoTipoConstanteNomi)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoConstanteNomi tipoconstantenomiAux:this.tipoconstantenomis) {
				if(tipoconstantenomiAux.getId().equals(this.iIdNuevoTipoConstanteNomi)) {
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
	
	public int getIndiceActualTipoConstanteNomi(TipoConstanteNomi tipoconstantenomi,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoConstanteNomi tipoconstantenomiAux:this.tipoconstantenomiLogic.getTipoConstanteNomis()) {
				if(tipoconstantenomiAux.getId().equals(tipoconstantenomi.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoConstanteNomi tipoconstantenomiAux:this.tipoconstantenomis) {
				if(tipoconstantenomiAux.getId().equals(tipoconstantenomi.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoConstanteNomi(TipoConstanteNomi tipoconstantenomiOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoConstanteNomi tipoconstantenomiAux:this.tipoconstantenomiLogic.getTipoConstanteNomis()) {
				if(tipoconstantenomiAux.getTipoConstanteNomiOriginal().getId().equals(tipoconstantenomiOriginal.getId())) {
					existe=true;
					tipoconstantenomiOriginal.setId(tipoconstantenomiAux.getId());
					tipoconstantenomiOriginal.setVersionRow(tipoconstantenomiAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoConstanteNomi tipoconstantenomiAux:this.tipoconstantenomis) {
				if(tipoconstantenomiAux.getTipoConstanteNomiOriginal().getId().equals(tipoconstantenomiOriginal.getId())) {
					existe=true;
					tipoconstantenomiOriginal.setId(tipoconstantenomiAux.getId());
					tipoconstantenomiOriginal.setVersionRow(tipoconstantenomiAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoConstanteNomi(Boolean esParaCancelar) throws Exception {
		tipoconstantenomisAux=new ArrayList<TipoConstanteNomi>();
		tipoconstantenomiAux=new TipoConstanteNomi();
		
		if(!this.tipoconstantenomiSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoConstanteNomi tipoconstantenomiAux:this.tipoconstantenomiLogic.getTipoConstanteNomis()) {
					if(tipoconstantenomiAux.getId()<0) {
						tipoconstantenomisAux.add(tipoconstantenomiAux);
					}		
				}
				this.iIdNuevoTipoConstanteNomi=0L;
				this.tipoconstantenomiLogic.getTipoConstanteNomis().removeAll(tipoconstantenomisAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoConstanteNomi tipoconstantenomiAux:this.tipoconstantenomis) {
					if(tipoconstantenomiAux.getId()<0) {
						tipoconstantenomisAux.add(tipoconstantenomiAux);
					}		
				}
				this.iIdNuevoTipoConstanteNomi=0L;
				this.tipoconstantenomis.removeAll(tipoconstantenomisAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoConstanteNomi 
					&& this.tipoconstantenomiLogic.getTipoConstanteNomis().size()>0
					) {
					tipoconstantenomiAux=this.tipoconstantenomiLogic.getTipoConstanteNomis().get(this.tipoconstantenomiLogic.getTipoConstanteNomis().size() - 1);
				
					if(tipoconstantenomiAux.getId()<0) {
						this.tipoconstantenomiLogic.getTipoConstanteNomis().remove(tipoconstantenomiAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoConstanteNomi && this.tipoconstantenomis.size()>0) {
					tipoconstantenomiAux=this.tipoconstantenomis.get(this.tipoconstantenomis.size() - 1);
				
					if(tipoconstantenomiAux.getId()<0) {
						this.tipoconstantenomis.remove(tipoconstantenomiAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoConstanteNomi(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipoconstantenomi.getId()<0) {
				this.tipoconstantenomiLogic.getTipoConstanteNomis().remove(this.tipoconstantenomi);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipoconstantenomi.getId()<0) {
				this.tipoconstantenomis.remove(this.tipoconstantenomi);
			}
		}			
	}
	
	public void setEstadosInicialesTipoConstanteNomi(List<TipoConstanteNomi> tipoconstantenomisAux) throws Exception {
		TipoConstanteNomiConstantesFunciones.setEstadosInicialesTipoConstanteNomi(tipoconstantenomisAux);
	}
	
	public void setEstadosInicialesTipoConstanteNomi(TipoConstanteNomi tipoconstantenomiAux) throws Exception {
		TipoConstanteNomiConstantesFunciones.setEstadosInicialesTipoConstanteNomi(tipoconstantenomiAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoConstanteNomiActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoConstanteNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoConstanteNomiActual()) {
				if(!this.isEsNuevoTipoConstanteNomi) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoConstanteNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoConstanteNomi=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoConstanteNomiActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Constante ?", "MANTENIMIENTO DE Tipo Constante", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoConstanteNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoConstanteNomi tipoconstantenomi) throws Exception {
		TipoConstanteNomiConstantesFunciones.seleccionarAsignar(this.tipoconstantenomi,tipoconstantenomi);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoConstanteNomi=this.isPermisoActualizarOriginalTipoConstanteNomi;
			
			
			this.seleccionarAsignar(tipoconstantenomi);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoConstanteNomiConstantesFunciones.quitarEspaciosTipoConstanteNomi(this.tipoconstantenomi,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoConstanteNomi("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipoconstantenomiSessionBean.setsFuncionBusquedaRapida(this.tipoconstantenomiSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoConstanteNomi) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoConstanteNomi(esParaCancelar);				
				this.cancelarNuevoTipoConstanteNomi(esParaCancelar);								
			}
			
			this.tipoconstantenomi=new TipoConstanteNomi();
			
			this.inicializarTipoConstanteNomi();
			
			this.actualizarEstadoCeldasBotonesTipoConstanteNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoConstanteNomi() throws Exception {
		try {
			TipoConstanteNomiConstantesFunciones.inicializarTipoConstanteNomi(this.tipoconstantenomi);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipoconstantenomiLogic.getTipoConstanteNomis().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoConstanteNomis(String sAccionBusqueda,List<TipoConstanteNomi> tipoconstantenomisParaReportes) throws Exception {
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
					sPathReporteFinal="TipoConstanteNomi"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoConstanteNomiMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoConstanteNomiMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoConstanteNomi"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Constantes");		
		parameters.put("busquedapor", TipoConstanteNomiConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(ConstanteNomi.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					TipoConstanteNomiLogic tipoconstantenomiLogicAuxiliar=new TipoConstanteNomiLogic();
					tipoconstantenomiLogicAuxiliar.setDatosCliente(tipoconstantenomiLogic.getDatosCliente());				
					tipoconstantenomiLogicAuxiliar.setTipoConstanteNomis(tipoconstantenomisParaReportes);
					
					tipoconstantenomiLogicAuxiliar.cargarRelacionesLoteForeignKeyTipoConstanteNomiWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					tipoconstantenomisParaReportes=tipoconstantenomiLogicAuxiliar.getTipoConstanteNomis();
					
					//tipoconstantenomiLogic.getNewConnexionToDeep();
					
					//for (TipoConstanteNomi tipoconstantenomi:tipoconstantenomisParaReportes) {
					//	tipoconstantenomiLogic.deepLoad(tipoconstantenomi, false, DeepLoadType.INCLUDE, classes);
					//}						
					//tipoconstantenomiLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//tipoconstantenomiLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileConstanteNomi = AuxiliarReportes.class.getResourceAsStream("ConstanteNomiDetalleRelacionesDesign.jasper");
			parameters.put("subreport_constantenomi", reportFileConstanteNomi);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoConstanteNomi=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoConstanteNomiConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoConstanteNomiConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoConstanteNomi=new JRBeanArrayDataSource(TipoConstanteNomiJInternalFrame.TraerTipoConstanteNomiBeans(tipoconstantenomisParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoConstanteNomi);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoConstanteNomiConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoConstanteNomiConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoConstanteNomiBean.TraerTipoConstanteNomiBeans(tipoconstantenomisParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoConstanteNomis(sAccionBusqueda,sTipoArchivoReporte,tipoconstantenomisParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoConstanteNomis(sAccionBusqueda,sTipoArchivoReporte,tipoconstantenomisParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoConstanteNomiActionPerformed(null);
					//this.generarExcelReporteTipoConstanteNomis(sAccionBusqueda,sTipoArchivoReporte,tipoconstantenomisParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoConstanteNomis(sAccionBusqueda,sTipoArchivoReporte,tipoconstantenomisParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoConstanteNomis(sAccionBusqueda,sTipoArchivoReporte,tipoconstantenomisParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoConstanteNomis(sAccionBusqueda,sTipoArchivoReporte,tipoconstantenomisParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoConstanteNomis(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoConstanteNomi> tipoconstantenomisParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoconstantenomi";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoConstanteNomis");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoConstanteNomi("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoConstanteNomi tipoconstantenomi : tipoconstantenomisParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoConstanteNomiConstantesFunciones.generarExcelReporteDataTipoConstanteNomi("NORMAL",row,workbook,tipoconstantenomi,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoconstantenomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Constante",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoConstanteNomi(String sTipo,Row row,Workbook workbook) {
		
		TipoConstanteNomiConstantesFunciones.generarExcelReporteHeaderTipoConstanteNomi(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoConstanteNomis(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoConstanteNomi> tipoconstantenomisParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoconstantenomi_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoConstanteNomis");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoConstanteNomi tipoconstantenomi : tipoconstantenomisParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoConstanteNomiConstantesFunciones.getTipoConstanteNomiDescripcion(tipoconstantenomi));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoConstanteNomiConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoConstanteNomiConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoconstantenomi.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoConstanteNomiConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoConstanteNomiConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoconstantenomi.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoconstantenomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Constante",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoConstanteNomis(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoConstanteNomi> tipoconstantenomisParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoConstanteNomi> tipoconstantenomisRespaldo=null;
		
		classes=TipoConstanteNomiConstantesFunciones.getClassesRelationshipsOfTipoConstanteNomi(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipoconstantenomiLogic.setDatosCliente(this.datosCliente);
		this.tipoconstantenomiLogic.setDatosDeep(this.datosDeep);
		this.tipoconstantenomiLogic.setIsConDeep(true);
		
		tipoconstantenomisRespaldo=this.tipoconstantenomiLogic.getTipoConstanteNomis();
		
		this.tipoconstantenomiLogic.setTipoConstanteNomis(tipoconstantenomisParaReportes);	
		this.tipoconstantenomiLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipoconstantenomisParaReportes=this.tipoconstantenomiLogic.getTipoConstanteNomis();
		this.tipoconstantenomiLogic.setTipoConstanteNomis(tipoconstantenomisRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoconstantenomi_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoConstanteNomis");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoConstanteNomi("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoConstanteNomi tipoconstantenomi : tipoconstantenomisParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoConstanteNomi("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoConstanteNomiConstantesFunciones.generarExcelReporteDataTipoConstanteNomi("NORMAL",row,workbook,tipoconstantenomi,cellStyleDataAux);
		
			
			


				//ConstanteNomi
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ConstanteNomiConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipoconstantenomi.getConstanteNomis()!=null && tipoconstantenomi.getConstanteNomis().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ConstanteNomiConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ConstanteNomiConstantesFunciones.generarExcelReporteHeaderConstanteNomi("RELACIONADO",row,workbook);
				}

				if(tipoconstantenomi.getConstanteNomis()!=null) {
					i2=0;
					for(ConstanteNomi constantenomi : tipoconstantenomi.getConstanteNomis()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						ConstanteNomiConstantesFunciones.generarExcelReporteDataConstanteNomi("RELACIONADO",row,workbook,constantenomi,cellStyleDataAuxHijo);
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
		cell.setCellValue(TipoConstanteNomiConstantesFunciones.getTipoConstanteNomiDescripcion(tipoconstantenomi));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoconstantenomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Constante",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoConstanteNomi.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoConstanteNomi.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoConstanteNomi.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoConstanteNomi.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoConstanteNomi() throws Exception {		
		this.startProcessTipoConstanteNomi(true);
	}
	
	public void startProcessTipoConstanteNomi(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesTipoConstanteNomi, this.jScrollPanelDatosTipoConstanteNomi,this.jPanelPaginacionTipoConstanteNomi, this.jScrollPanelDatosEdicionTipoConstanteNomi, this.jPanelAccionesTipoConstanteNomi,this.jPanelAccionesFormularioTipoConstanteNomi,this.jmenuBarTipoConstanteNomi,this.jmenuBarDetalleTipoConstanteNomi,this.jTtoolBarTipoConstanteNomi,this.jTtoolBarDetalleTipoConstanteNomi);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoConstanteNomi=null; 
		
		final JPanel jPanelParametrosReportesTipoConstanteNomi=this.jPanelParametrosReportesTipoConstanteNomi;
		//final JScrollPane jScrollPanelDatosTipoConstanteNomi=this.jScrollPanelDatosTipoConstanteNomi;
		final JTable jTableDatosTipoConstanteNomi=this.jTableDatosTipoConstanteNomi;		
		final JPanel jPanelPaginacionTipoConstanteNomi=this.jPanelPaginacionTipoConstanteNomi;
		//final JScrollPane jScrollPanelDatosEdicionTipoConstanteNomi=this.jScrollPanelDatosEdicionTipoConstanteNomi;
		final JPanel jPanelAccionesTipoConstanteNomi=this.jPanelAccionesTipoConstanteNomi;
		
		JPanel jPanelCamposAuxiliarTipoConstanteNomi=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoConstanteNomi=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoConstanteNomi!=null) {
			jPanelCamposAuxiliarTipoConstanteNomi=this.jInternalFrameDetalleFormTipoConstanteNomi.jPanelCamposTipoConstanteNomi;
			jPanelAccionesFormularioAuxiliarTipoConstanteNomi=this.jInternalFrameDetalleFormTipoConstanteNomi.jPanelAccionesFormularioTipoConstanteNomi;
		}
		
		final JPanel jPanelCamposTipoConstanteNomi=jPanelCamposAuxiliarTipoConstanteNomi;
		final JPanel jPanelAccionesFormularioTipoConstanteNomi=jPanelAccionesFormularioAuxiliarTipoConstanteNomi;
		
		
		final JMenuBar jmenuBarTipoConstanteNomi=this.jmenuBarTipoConstanteNomi;
		final JToolBar jTtoolBarTipoConstanteNomi=this.jTtoolBarTipoConstanteNomi;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoConstanteNomi=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoConstanteNomi=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoConstanteNomi!=null) {
			jmenuBarDetalleAuxiliarTipoConstanteNomi=this.jInternalFrameDetalleFormTipoConstanteNomi.jmenuBarDetalleTipoConstanteNomi;
			jTtoolBarDetalleAuxiliarTipoConstanteNomi=this.jInternalFrameDetalleFormTipoConstanteNomi.jTtoolBarDetalleTipoConstanteNomi;
		}
		
		final JMenuBar jmenuBarDetalleTipoConstanteNomi=jmenuBarDetalleAuxiliarTipoConstanteNomi;
		final JToolBar jTtoolBarDetalleTipoConstanteNomi=jTtoolBarDetalleAuxiliarTipoConstanteNomi;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoConstanteNomi;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoConstanteNomi;
			processRunnable.jTableDatos=jTableDatosTipoConstanteNomi;
			processRunnable.jPanelCampos=jPanelCamposTipoConstanteNomi;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoConstanteNomi;
			processRunnable.jPanelAcciones=jPanelAccionesTipoConstanteNomi;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoConstanteNomi;
			
			
			processRunnable.jmenuBar=jmenuBarTipoConstanteNomi;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoConstanteNomi;
			processRunnable.jTtoolBar=jTtoolBarTipoConstanteNomi;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoConstanteNomi;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoConstanteNomi ,jPanelParametrosReportesTipoConstanteNomi,jTableDatosTipoConstanteNomi, /*jScrollPanelDatosTipoConstanteNomi,*/jPanelCamposTipoConstanteNomi,jPanelPaginacionTipoConstanteNomi, /*jScrollPanelDatosEdicionTipoConstanteNomi,*/ jPanelAccionesTipoConstanteNomi,jPanelAccionesFormularioTipoConstanteNomi,jmenuBarTipoConstanteNomi,jmenuBarDetalleTipoConstanteNomi,jTtoolBarTipoConstanteNomi,jTtoolBarDetalleTipoConstanteNomi);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesTipoConstanteNomi, jScrollPanelDatosTipoConstanteNomi,jPanelPaginacionTipoConstanteNomi, jScrollPanelDatosEdicionTipoConstanteNomi, jPanelAccionesTipoConstanteNomi,jPanelAccionesFormularioTipoConstanteNomi,jmenuBarTipoConstanteNomi,jmenuBarDetalleTipoConstanteNomi,jTtoolBarTipoConstanteNomi,jTtoolBarDetalleTipoConstanteNomi);
						
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
	
	public void finishProcessTipoConstanteNomi() {// throws Exception 
		this.finishProcessTipoConstanteNomi(true);
	}
	
	public void finishProcessTipoConstanteNomi(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesTipoConstanteNomi, this.jScrollPanelDatosTipoConstanteNomi,this.jPanelPaginacionTipoConstanteNomi, this.jScrollPanelDatosEdicionTipoConstanteNomi, this.jPanelAccionesTipoConstanteNomi,this.jPanelAccionesFormularioTipoConstanteNomi,this.jmenuBarTipoConstanteNomi,this.jmenuBarDetalleTipoConstanteNomi,this.jTtoolBarTipoConstanteNomi,this.jTtoolBarDetalleTipoConstanteNomi);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoConstanteNomi=null; 
		
		final JPanel jPanelParametrosReportesTipoConstanteNomi=this.jPanelParametrosReportesTipoConstanteNomi;
		//final JScrollPane jScrollPanelDatosTipoConstanteNomi=this.jScrollPanelDatosTipoConstanteNomi;
		final JTable jTableDatosTipoConstanteNomi=this.jTableDatosTipoConstanteNomi;		
		final JPanel jPanelPaginacionTipoConstanteNomi=this.jPanelPaginacionTipoConstanteNomi;
		//final JScrollPane jScrollPanelDatosEdicionTipoConstanteNomi=this.jScrollPanelDatosEdicionTipoConstanteNomi;
		final JPanel jPanelAccionesTipoConstanteNomi=this.jPanelAccionesTipoConstanteNomi;
		
		JPanel jPanelCamposAuxiliarTipoConstanteNomi=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoConstanteNomi=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoConstanteNomi!=null) {
			jPanelCamposAuxiliarTipoConstanteNomi=this.jInternalFrameDetalleFormTipoConstanteNomi.jPanelCamposTipoConstanteNomi;
			jPanelAccionesFormularioAuxiliarTipoConstanteNomi=this.jInternalFrameDetalleFormTipoConstanteNomi.jPanelAccionesFormularioTipoConstanteNomi;
		}
		
		final JPanel jPanelCamposTipoConstanteNomi=jPanelCamposAuxiliarTipoConstanteNomi;
		final JPanel jPanelAccionesFormularioTipoConstanteNomi=jPanelAccionesFormularioAuxiliarTipoConstanteNomi;
		
		
		final JMenuBar jmenuBarTipoConstanteNomi=this.jmenuBarTipoConstanteNomi;		
		final JToolBar jTtoolBarTipoConstanteNomi=this.jTtoolBarTipoConstanteNomi;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoConstanteNomi=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoConstanteNomi=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoConstanteNomi!=null) {
			jmenuBarDetalleAuxiliarTipoConstanteNomi=this.jInternalFrameDetalleFormTipoConstanteNomi.jmenuBarDetalleTipoConstanteNomi;
			jTtoolBarDetalleAuxiliarTipoConstanteNomi=this.jInternalFrameDetalleFormTipoConstanteNomi.jTtoolBarDetalleTipoConstanteNomi;		
		}
		
		final JMenuBar jmenuBarDetalleTipoConstanteNomi=jmenuBarDetalleAuxiliarTipoConstanteNomi;
		final JToolBar jTtoolBarDetalleTipoConstanteNomi=jTtoolBarDetalleAuxiliarTipoConstanteNomi;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoConstanteNomi;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoConstanteNomi;
			processRunnable.jTableDatos=jTableDatosTipoConstanteNomi;
			processRunnable.jPanelCampos=jPanelCamposTipoConstanteNomi;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoConstanteNomi;
			processRunnable.jPanelAcciones=jPanelAccionesTipoConstanteNomi;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoConstanteNomi;
			
			
			processRunnable.jmenuBar=jmenuBarTipoConstanteNomi;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoConstanteNomi;
			processRunnable.jTtoolBar=jTtoolBarTipoConstanteNomi;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoConstanteNomi;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoConstanteNomi ,jPanelParametrosReportesTipoConstanteNomi, jTableDatosTipoConstanteNomi,/*jScrollPanelDatosTipoConstanteNomi,*/jPanelCamposTipoConstanteNomi,jPanelPaginacionTipoConstanteNomi, /*jScrollPanelDatosEdicionTipoConstanteNomi,*/ jPanelAccionesTipoConstanteNomi,jPanelAccionesFormularioTipoConstanteNomi,jmenuBarTipoConstanteNomi,jmenuBarDetalleTipoConstanteNomi,jTtoolBarTipoConstanteNomi,jTtoolBarDetalleTipoConstanteNomi));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoConstanteNomi(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoConstanteNomi(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoConstanteNomi(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoConstanteNomi(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoConstanteNomi,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoConstanteNomi,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoConstanteNomi(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoConstanteNomi,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoConstanteNomi,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipoconstantenomiConstantesFunciones.getsFinalQueryTipoConstanteNomi();
		String  finalQueryPaginacionTodos=this.tipoconstantenomiConstantesFunciones.getsFinalQueryTipoConstanteNomi();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoConstanteNomiConstantesFunciones.getArrayColumnasGlobalesNoTipoConstanteNomi(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoConstanteNomiConstantesFunciones.getArrayColumnasGlobalesTipoConstanteNomi(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoConstanteNomiConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipoconstantenomisEliminados= new ArrayList<TipoConstanteNomi>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoConstanteNomi();
		
				///*TipoConstanteNomiSessionBean*/this.tipoconstantenomiSessionBean=new TipoConstanteNomiSessionBean();
			
			if(this.tipoconstantenomiSessionBean==null) {
				this.tipoconstantenomiSessionBean=new TipoConstanteNomiSessionBean();
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
					this.iNumeroPaginacion=TipoConstanteNomiConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoConstanteNomiConstantesFunciones.getClassesForeignKeysOfTipoConstanteNomi(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipoconstantenomi."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipoconstantenomisAux= new ArrayList<TipoConstanteNomi>();
			
				
			tipoconstantenomiLogic.setDatosCliente(this.datosCliente);
			tipoconstantenomiLogic.setDatosDeep(this.datosDeep);
			tipoconstantenomiLogic.setIsConDeep(true);
			
			
			tipoconstantenomiLogic.getTipoConstanteNomiDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipoconstantenomiLogic.getTodosTipoConstanteNomis(finalQueryGlobal,pagination);
					
					//tipoconstantenomiLogic.getTodosTipoConstanteNomisWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipoconstantenomiLogic.getTipoConstanteNomis()==null|| tipoconstantenomiLogic.getTipoConstanteNomis().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoconstantenomisAux= new ArrayList<TipoConstanteNomi>();
							tipoconstantenomisAux.addAll(tipoconstantenomiLogic.getTipoConstanteNomis());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoconstantenomisAux= new ArrayList<TipoConstanteNomi>();
							tipoconstantenomisAux.addAll(tipoconstantenomis);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoconstantenomiLogic.getTodosTipoConstanteNomis(finalQueryGlobal+"",this.pagination);												
							
							//tipoconstantenomiLogic.getTodosTipoConstanteNomisWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoConstanteNomis("Todos",tipoconstantenomiLogic.getTipoConstanteNomis() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoconstantenomiLogic.setTipoConstanteNomis(new ArrayList<TipoConstanteNomi>());					
							tipoconstantenomiLogic.getTipoConstanteNomis().addAll(tipoconstantenomisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoconstantenomis=new ArrayList<TipoConstanteNomi>();
							tipoconstantenomis.addAll(tipoconstantenomisAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoConstanteNomi=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoConstanteNomi=this.idActual;
				
				} else if(this.idTipoConstanteNomiActual!=null && this.idTipoConstanteNomiActual!=0L) {
					idTipoConstanteNomi=idTipoConstanteNomiActual;
				}
				
					
				this.sDetalleReporte=TipoConstanteNomiConstantesFunciones.getDetalleIndicePorId(idTipoConstanteNomi);
				
				this.tipoconstantenomis=new ArrayList<TipoConstanteNomi>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipoconstantenomiLogic.getEntity(idTipoConstanteNomi);
					
					//tipoconstantenomiLogic.getEntityWithConnection(idTipoConstanteNomi);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoconstantenomiLogic.setTipoConstanteNomis(new ArrayList<TipoConstanteNomi>());
					tipoconstantenomiLogic.getTipoConstanteNomis().add(tipoconstantenomiLogic.getTipoConstanteNomi());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoconstantenomis=new ArrayList<TipoConstanteNomi>();
					this.tipoconstantenomis.add(tipoconstantenomi);
				}
				
				if(tipoconstantenomiLogic.getTipoConstanteNomi()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoConstanteNomi();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoConstanteNomi();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoconstantenomiLogic.getTipoConstanteNomis().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoconstantenomis.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoconstantenomiLogic.getTipoConstanteNomis().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoconstantenomis.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoConstanteNomi tipoconstantenomi) {
		Boolean permite=true;
		
		if(this.tipoconstantenomi.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoConstanteNomiConstantesFunciones.getOrderByListaTipoConstanteNomi();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoConstanteNomiConstantesFunciones.getOrderByListaTipoConstanteNomi();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoConstanteNomi tipoconstantenomi:tipoconstantenomiLogic.getTipoConstanteNomis()) {
				if(tipoconstantenomi.getsType().equals(Constantes2.S_TOTALES)) {
					tipoconstantenomiTotales=tipoconstantenomi;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoConstanteNomi tipoconstantenomi:this.tipoconstantenomis) {
				if(tipoconstantenomi.getsType().equals(Constantes2.S_TOTALES)) {
					tipoconstantenomiTotales=tipoconstantenomi;
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
			this.tipoconstantenomiAux=new TipoConstanteNomi();
			this.tipoconstantenomiAux.setsType(Constantes2.S_TOTALES);
			this.tipoconstantenomiAux.setIsNew(false);
			this.tipoconstantenomiAux.setIsChanged(false);
			this.tipoconstantenomiAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoConstanteNomiConstantesFunciones.TotalizarValoresFilaTipoConstanteNomi(this.tipoconstantenomiLogic.getTipoConstanteNomis(),this.tipoconstantenomiAux);
				
				this.tipoconstantenomiLogic.getTipoConstanteNomis().add(this.tipoconstantenomiAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoConstanteNomiConstantesFunciones.TotalizarValoresFilaTipoConstanteNomi(this.tipoconstantenomis,this.tipoconstantenomiAux);
				
				this.tipoconstantenomis.add(this.tipoconstantenomiAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipoconstantenomiTotales=new TipoConstanteNomi();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoconstantenomiLogic.getTipoConstanteNomis().remove(tipoconstantenomiTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoconstantenomis.remove(tipoconstantenomiTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipoconstantenomiTotales=new TipoConstanteNomi();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoConstanteNomi tipoconstantenomi:tipoconstantenomiLogic.getTipoConstanteNomis()) {
				if(tipoconstantenomi.getsType().equals(Constantes2.S_TOTALES)) {
					tipoconstantenomiTotales=tipoconstantenomi;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoConstanteNomiConstantesFunciones.TotalizarValoresFilaTipoConstanteNomi(this.tipoconstantenomiLogic.getTipoConstanteNomis(),tipoconstantenomiTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoConstanteNomi tipoconstantenomi:this.tipoconstantenomis) {
				if(tipoconstantenomi.getsType().equals(Constantes2.S_TOTALES)) {
					tipoconstantenomiTotales=tipoconstantenomi;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoConstanteNomiConstantesFunciones.TotalizarValoresFilaTipoConstanteNomi(this.tipoconstantenomis,tipoconstantenomiTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosTipoConstanteNomi() {
		this.isPermisoTodoTipoConstanteNomi=false;
		this.isPermisoNuevoTipoConstanteNomi=false;
		this.isPermisoActualizarTipoConstanteNomi=false;
		this.isPermisoActualizarOriginalTipoConstanteNomi=false;
		this.isPermisoEliminarTipoConstanteNomi=false;
		this.isPermisoGuardarCambiosTipoConstanteNomi=false;
		this.isPermisoConsultaTipoConstanteNomi=false;
		this.isPermisoBusquedaTipoConstanteNomi=false;
		this.isPermisoReporteTipoConstanteNomi=false;		
		this.isPermisoOrdenTipoConstanteNomi=false;		
		this.isPermisoPaginacionMedioTipoConstanteNomi=false;		
		this.isPermisoPaginacionAltoTipoConstanteNomi=false;
		this.isPermisoPaginacionTodoTipoConstanteNomi=false;
		this.isPermisoCopiarTipoConstanteNomi=false;		
		this.isPermisoVerFormTipoConstanteNomi=false;		
		this.isPermisoDuplicarTipoConstanteNomi=false;		
		this.isPermisoOrdenTipoConstanteNomi=false;		
	}
	
	public void setPermisosUsuarioTipoConstanteNomi(Boolean isPermiso) {
		this.isPermisoTodoTipoConstanteNomi=isPermiso;
		this.isPermisoNuevoTipoConstanteNomi=isPermiso;
		this.isPermisoActualizarTipoConstanteNomi=isPermiso;
		this.isPermisoActualizarOriginalTipoConstanteNomi=isPermiso;
		this.isPermisoEliminarTipoConstanteNomi=isPermiso;
		this.isPermisoGuardarCambiosTipoConstanteNomi=isPermiso;
		this.isPermisoConsultaTipoConstanteNomi=isPermiso;
		this.isPermisoBusquedaTipoConstanteNomi=isPermiso;
		this.isPermisoReporteTipoConstanteNomi=isPermiso;
		this.isPermisoOrdenTipoConstanteNomi=isPermiso;		
		this.isPermisoPaginacionMedioTipoConstanteNomi=isPermiso;		
		this.isPermisoPaginacionAltoTipoConstanteNomi=isPermiso;		
		this.isPermisoPaginacionTodoTipoConstanteNomi=isPermiso;		
		this.isPermisoCopiarTipoConstanteNomi=isPermiso;		
		this.isPermisoVerFormTipoConstanteNomi=isPermiso;		
		this.isPermisoDuplicarTipoConstanteNomi=isPermiso;
		this.isPermisoOrdenTipoConstanteNomi=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoConstanteNomi(Boolean isPermiso) {
		//this.isPermisoTodoTipoConstanteNomi=isPermiso;
		this.isPermisoNuevoTipoConstanteNomi=isPermiso;
		this.isPermisoActualizarTipoConstanteNomi=isPermiso;
		this.isPermisoActualizarOriginalTipoConstanteNomi=isPermiso;
		this.isPermisoEliminarTipoConstanteNomi=isPermiso;
		this.isPermisoGuardarCambiosTipoConstanteNomi=isPermiso;
		//this.isPermisoConsultaTipoConstanteNomi=isPermiso;
		//this.isPermisoBusquedaTipoConstanteNomi=isPermiso;
		//this.isPermisoReporteTipoConstanteNomi=isPermiso;
		//this.isPermisoOrdenTipoConstanteNomi=isPermiso;		
		//this.isPermisoPaginacionMedioTipoConstanteNomi=isPermiso;		
		//this.isPermisoPaginacionAltoTipoConstanteNomi=isPermiso;		
		//this.isPermisoPaginacionTodoTipoConstanteNomi=isPermiso;		
		//this.isPermisoCopiarTipoConstanteNomi=isPermiso;		
		//this.isPermisoDuplicarTipoConstanteNomi=isPermiso;
		//this.isPermisoOrdenTipoConstanteNomi=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoConstanteNomiClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(ConstanteNomiConstantesFunciones.SNOMBREOPCION);
		
		if(TipoConstanteNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosConstanteNomi=false;
		this.isTienePermisosConstanteNomi=this.verificarGetPermisosUsuarioOpcionTipoConstanteNomiClaseRelacionada(this.opcionsRelacionadas,ConstanteNomiConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoConstanteNomi(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoConstanteNomiClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosConstanteNomi=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTipoConstanteNomiClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoConstanteNomiClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoConstanteNomiClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosConstanteNomi && this.jInternalFrameDetalleFormTipoConstanteNomi!=null && this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoConstanteNomi.jTabbedPaneRelacionesTipoConstanteNomi.remove(this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTipoConstanteNomi() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoConstanteNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipoconstantenomiSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoConstanteNomiConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoConstanteNomi=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoConstanteNomi=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoConstanteNomi=this.isPermisoActualizarTipoConstanteNomi;
			this.isPermisoEliminarTipoConstanteNomi=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoConstanteNomi=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoConstanteNomi=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoConstanteNomi=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoConstanteNomi=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoConstanteNomi=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoConstanteNomi=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoConstanteNomi=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoConstanteNomi=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoConstanteNomi=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoConstanteNomi=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoConstanteNomi=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoConstanteNomi=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoConstanteNomi=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipoconstantenomiSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoConstanteNomi.setToolTipText(this.jTableDatosTipoConstanteNomi.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoConstanteNomi(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoConstanteNomi(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoConstanteNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoConstanteNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoConstanteNomi() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosConstanteNomi && this.tipoconstantenomiConstantesFunciones.mostrarConstanteNomiTipoConstanteNomi && !TipoConstanteNomiConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Constante Nomi");
			reporte.setsDescripcion("Constante Nomi");
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
	
		
	public void inicializarCombosForeignKeyTipoConstanteNomiListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoConstanteNomiListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoConstanteNomiJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoConstanteNomiListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyTipoConstanteNomiListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoConstanteNomi()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyTipoConstanteNomi()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoConstanteNomi(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoConstanteNomi()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoConstanteNomi();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoConstanteNomi(TipoConstanteNomi tipoconstantenomi)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoConstanteNomi(TipoConstanteNomi tipoconstantenomi,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoConstanteNomi()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoConstanteNomi()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoConstanteNomi()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoConstanteNomi()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoConstanteNomi()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoConstanteNomi()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoConstanteNomi(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoConstanteNomi()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public TipoConstanteNomiBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoConstanteNomiBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoConstanteNomiBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipoconstantenomiSessionBean=new TipoConstanteNomiSessionBean(); 
		this.tipoconstantenomiConstantesFunciones=new TipoConstanteNomiConstantesFunciones(); 
		this.tipoconstantenomiBean=new TipoConstanteNomi();//(this.tipoconstantenomiConstantesFunciones); 		
		this.tipoconstantenomiReturnGeneral=new TipoConstanteNomiParameterReturnGeneral(); 
		
		this.tipoconstantenomiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoconstantenomiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoConstanteNomiBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoConstanteNomiBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoConstanteNomiBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoConstanteNomi(true);
			
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
			
			this.tipoconstantenomiConstantesFunciones=new TipoConstanteNomiConstantesFunciones(); 
			this.tipoconstantenomiBean=new TipoConstanteNomi();//this.tipoconstantenomiConstantesFunciones); 			
			this.tipoconstantenomiReturnGeneral=new TipoConstanteNomiParameterReturnGeneral(); 
		
			TipoConstanteNomiBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Constante Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipoconstantenomi=new TipoConstanteNomi();
			this.tipoconstantenomis = new ArrayList<TipoConstanteNomi>();
			this.tipoconstantenomisAux = new ArrayList<TipoConstanteNomi>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconstantenomiLogic=new TipoConstanteNomiLogic();
				this.tipoconstantenomiLogic.getNewConnexionToDeep("");
			}
			
			//this.tipoconstantenomiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipoconstantenomiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoConstanteNomi);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoConstanteNomi!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoConstanteNomi);	
					}
					
					if(this.jInternalFrameImportacionTipoConstanteNomi!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoConstanteNomi);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoConstanteNomi!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoConstanteNomi);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoConstanteNomi!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoConstanteNomi);
				this.jInternalFrameDetalleFormTipoConstanteNomi.setVisible(false);
				this.jInternalFrameDetalleFormTipoConstanteNomi.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoConstanteNomi!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoConstanteNomi);
					this.jInternalFrameReporteDinamicoTipoConstanteNomi.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoConstanteNomi.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoConstanteNomi!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoConstanteNomi);
					this.jInternalFrameImportacionTipoConstanteNomi.setVisible(false);
					this.jInternalFrameImportacionTipoConstanteNomi.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoConstanteNomi!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoConstanteNomi);
					this.jInternalFrameOrderByTipoConstanteNomi.setVisible(false);
					this.jInternalFrameOrderByTipoConstanteNomi.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoConstanteNomiActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoConstanteNomiConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipoconstantenomiReturnGeneral=new TipoConstanteNomiParameterReturnGeneral();
			
			this.tipoconstantenomiParameterGeneral=new TipoConstanteNomiParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipoconstantenomiLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipoconstantenomiSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoConstanteNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipoconstantenomiSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(ConstanteNomiConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoConstanteNomiConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoconstantenomiSessionBean.getEsGuardarRelacionado(),this.tipoconstantenomiSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoConstanteNomiConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoconstantenomiSessionBean.getEsGuardarRelacionado(),this.tipoconstantenomiSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoConstanteNomi=false;
			this.isVisibilidadCeldaDuplicarTipoConstanteNomi=true;
			this.isVisibilidadCeldaCopiarTipoConstanteNomi=true;
			this.isVisibilidadCeldaVerFormTipoConstanteNomi=true;
			this.isVisibilidadCeldaOrdenTipoConstanteNomi=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoConstanteNomi=false;
			this.isVisibilidadCeldaModificarTipoConstanteNomi=false;
			this.isVisibilidadCeldaActualizarTipoConstanteNomi=false;
			this.isVisibilidadCeldaEliminarTipoConstanteNomi=false;
			this.isVisibilidadCeldaCancelarTipoConstanteNomi=false;
			this.isVisibilidadCeldaGuardarTipoConstanteNomi=false;
			this.isVisibilidadCeldaGuardarCambiosTipoConstanteNomi=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoConstanteNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoConstanteNomi();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoConstanteNomi(false);
			
			this.setPermisosUsuarioTipoConstanteNomi();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoconstantenomiSessionBean.getEsGuardarRelacionado() 
				|| (this.tipoconstantenomiSessionBean.getEsGuardarRelacionado() && this.tipoconstantenomiSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoConstanteNomiClasesRelacionadas();
			}
			
			if(this.tipoconstantenomiSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoConstanteNomiClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoConstanteNomiJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoConstanteNomi();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoConstanteNomi();
			}
			
			if(!this.isPermisoBusquedaTipoConstanteNomi) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoconstantenomiSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoConstanteNomi,this.isPermisoPaginacionMedioTipoConstanteNomi,this.isPermisoPaginacionTodoTipoConstanteNomi);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoConstanteNomiConstantesFunciones.getTiposSeleccionarTipoConstanteNomi());
				
				this.tiposColumnasSelect=TipoConstanteNomiConstantesFunciones.getTiposSeleccionarTipoConstanteNomi(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTipoConstanteNomi();				
				//this.tiposRelacionesSelect=TipoConstanteNomiConstantesFunciones.getTiposRelacionesTipoConstanteNomi(true);
				
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
			//if(!this.tipoconstantenomiSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoConstanteNomi();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioTipoConstanteNomi(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioTipoConstanteNomi(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoConstanteNomi() ;
			
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
			
			
			this.constantenomiLogic=new ConstanteNomiLogic(); 
			jasperPrint = null;												
			
			//FK
			
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				tipoconstantenomiImplementable= (TipoConstanteNomiImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoConstanteNomiConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipoconstantenomiImplementableHome= (TipoConstanteNomiImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoConstanteNomiConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipoconstantenomis= new ArrayList<TipoConstanteNomi>();
			this.tipoconstantenomisEliminados= new ArrayList<TipoConstanteNomi>();
						
			this.isEsNuevoTipoConstanteNomi=false;
			this.esParaAccionDesdeFormularioTipoConstanteNomi=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoConstanteNomi(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoConstanteNomi();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoconstantenomiSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TipoConstanteNomiBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoConstanteNomiConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoConstanteNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoConstanteNomi(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoConstanteNomi!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoConstanteNomi();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoConstanteNomi();
			}
			
			TipoConstanteNomiBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconstantenomiLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoConstanteNomi(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoConstanteNomi: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconstantenomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconstantenomiLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoConstanteNomi() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(ConstanteNomiConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ConstanteNomiConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoConstanteNomi")) {
				iIndex=this.jInternalFrameDetalleFormTipoConstanteNomi.jTabbedPaneRelacionesTipoConstanteNomi.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoConstanteNomi.jTabbedPaneRelacionesTipoConstanteNomi.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoConstanteNomi.getSelectedRow();	
				
				

				if(sTitle.equals("Constante Nomis")) {
					if(!ConstanteNomiJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoConstanteNomi();

						this.cargarParteTabPanelRelacionadaConstanteNomi(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoConstanteNomi();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaConstanteNomi(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoConstanteNomi.cargarSessionConBeanSwingJInternalFrameConstanteNomi(false,true,iIndex);
		this.jButtonConstanteNomiActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaConstanteNomi();

		//this.jTabbedPaneRelacionesTipoConstanteNomi.updateUI();
		//this.jTabbedPaneRelacionesTipoConstanteNomi.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoConstanteNomi.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("ConstanteNomi")) {
				int row=this.jTableDatosTipoConstanteNomi.getSelectedRow();
				jButtonConstanteNomiActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.tipoconstantenomiSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Constante Nomi")) {

					if(this.isTienePermisosConstanteNomi && this.tipoconstantenomiConstantesFunciones.mostrarConstanteNomiTipoConstanteNomi && !TipoConstanteNomiConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Constante Nomis"+"("+ConstanteNomiConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Constante Nomis");

						if(tipoconstantenomiConstantesFunciones.resaltarConstanteNomiTipoConstanteNomi!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipoconstantenomiConstantesFunciones.resaltarConstanteNomiTipoConstanteNomi);
						}

						jmenuItem.setEnabled(this.tipoconstantenomiConstantesFunciones.activarConstanteNomiTipoConstanteNomi);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"ConstanteNomi"));

						

						this.jInternalFrameDetalleFormTipoConstanteNomi.jmenuDetalleTipoConstanteNomi.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTipoConstanteNomi(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoConstanteNomi(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoConstanteNomi(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoConstanteNomiListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoConstanteNomi();
		
		this.cargarCombosFrameForeignKeyTipoConstanteNomi();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoConstanteNomi();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoConstanteNomi();
		}
	}
	
	
	
	public void jButtonNuevoTipoConstanteNomiActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipoconstantenomiSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoConstanteNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoConstanteNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoconstantenomi,new Object(),this.tipoconstantenomiParameterGeneral,this.tipoconstantenomiReturnGeneral);
			
			
			if(jTableDatosTipoConstanteNomi.getRowCount()>=1) {
				jTableDatosTipoConstanteNomi.removeRowSelectionInterval(0, jTableDatosTipoConstanteNomi.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoConstanteNomi=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoConstanteNomi(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoConstanteNomi(true);			
			//this.tipoconstantenomi=new TipoConstanteNomi();
			//this.tipoconstantenomi.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoConstanteNomi(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoConstanteNomi() ;
			
			if(TipoConstanteNomiJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoConstanteNomi(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipoconstantenomi);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipoconstantenomi);				
			
			TipoConstanteNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoconstantenomi,new Object(),this.tipoconstantenomiParameterGeneral,this.tipoconstantenomiReturnGeneral);
			
			if(this.tipoconstantenomiSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoConstanteNomi: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoConstanteNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipoconstantenomi,new Object(),this.tipoconstantenomiParameterGeneral,this.tipoconstantenomiReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoConstanteNomiActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoConstanteNomi> tipoconstantenomisSeleccionados=new ArrayList<TipoConstanteNomi>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoConstanteNomi.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoConstanteNomi.getSelectedRows().length;			
			}
			
			tipoconstantenomisSeleccionados=this.getTipoConstanteNomisSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoConstanteNomi--;			
				//TipoConstanteNomi tipoconstantenomiAux= new TipoConstanteNomi();			
				//tipoconstantenomiAux.setId(this.iIdNuevoTipoConstanteNomi);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoConstanteNomi tipoconstantenomiOrigen=new TipoConstanteNomi();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoConstanteNomi tipoconstantenomiOrigen : tipoconstantenomisSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoConstanteNomi.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipoconstantenomiOrigen =(TipoConstanteNomi) this.tipoconstantenomiLogic.getTipoConstanteNomis().toArray()[this.jTableDatosTipoConstanteNomi.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoconstantenomiOrigen =(TipoConstanteNomi) this.tipoconstantenomis.toArray()[this.jTableDatosTipoConstanteNomi.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoConstanteNomi();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipoconstantenomi.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoConstanteNomi(tipoconstantenomiOrigen,this.tipoconstantenomi,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoConstanteNomi(this.tipoconstantenomi);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoconstantenomiLogic.getTipoConstanteNomis().add(this.tipoconstantenomiAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoconstantenomis.add(this.tipoconstantenomiAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoConstanteNomi(false);
				
				this.jTableDatosTipoConstanteNomi.setRowSelectionInterval(this.getIndiceNuevoTipoConstanteNomi(), this.getIndiceNuevoTipoConstanteNomi());
				
				int iLastRow =  this.jTableDatosTipoConstanteNomi.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoConstanteNomi.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoConstanteNomi.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoConstanteNomi(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoConstanteNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoConstanteNomi> tipoconstantenomisSeleccionados=new ArrayList<TipoConstanteNomi>();									
		
			TipoConstanteNomi tipoconstantenomiOrigen=new TipoConstanteNomi();
			TipoConstanteNomi tipoconstantenomiDestino=new TipoConstanteNomi();
				
			tipoconstantenomisSeleccionados=this.getTipoConstanteNomisSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoConstanteNomi.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipoconstantenomisSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoConstanteNomi.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoconstantenomiOrigen =(TipoConstanteNomi) this.tipoconstantenomiLogic.getTipoConstanteNomis().toArray()[this.jTableDatosTipoConstanteNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoconstantenomiOrigen =(TipoConstanteNomi) this.tipoconstantenomis.toArray()[this.jTableDatosTipoConstanteNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoconstantenomiDestino =(TipoConstanteNomi) this.tipoconstantenomiLogic.getTipoConstanteNomis().toArray()[this.jTableDatosTipoConstanteNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoconstantenomiDestino =(TipoConstanteNomi) this.tipoconstantenomis.toArray()[this.jTableDatosTipoConstanteNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipoconstantenomiOrigen =tipoconstantenomisSeleccionados.get(0);
				tipoconstantenomiDestino =tipoconstantenomisSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoConstanteNomi(tipoconstantenomiOrigen,tipoconstantenomiDestino,true,false);
				
				tipoconstantenomiDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoconstantenomiDestino,tipoconstantenomiLogic.getTipoConstanteNomis());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoconstantenomiDestino,tipoconstantenomis);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoConstanteNomi(false);
				
				//this.jTableDatosTipoConstanteNomi.setRowSelectionInterval(this.getIndiceNuevoTipoConstanteNomi(), this.getIndiceNuevoTipoConstanteNomi());
				
				int iLastRow =  this.jTableDatosTipoConstanteNomi.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoConstanteNomi.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoConstanteNomi.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoConstanteNomi(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoConstanteNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoConstanteNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoConstanteNomi.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoConstanteNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoConstanteNomi.isVisible();
			
			
			this.jPanelParametrosReportesTipoConstanteNomi.setVisible(!isVisible);
			this.jPanelPaginacionTipoConstanteNomi.setVisible(!isVisible);
			this.jPanelAccionesTipoConstanteNomi.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoConstanteNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoConstanteNomi();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoConstanteNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoConstanteNomi();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoConstanteNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoConstanteNomi();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoConstanteNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoConstanteNomi();
			
			this.abrirFrameOrderByTipoConstanteNomi();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoConstanteNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoConstanteNomi();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoConstanteNomi(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoConstanteNomi);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoConstanteNomi.isMaximum()) {
					this.jInternalFrameDetalleFormTipoConstanteNomi.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoConstanteNomi.setSize(this.jInternalFrameDetalleFormTipoConstanteNomi.iWidthFormulario,this.jInternalFrameDetalleFormTipoConstanteNomi.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoConstanteNomi.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoConstanteNomi.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoConstanteNomi.isMaximum()) {
						this.jInternalFrameDetalleFormTipoConstanteNomi.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoConstanteNomi.jContentPaneDetalleTipoConstanteNomi.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoConstanteNomi.jTabbedPaneRelacionesTipoConstanteNomi.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoConstanteNomi.jContentPaneDetalleTipoConstanteNomi.getWidth(),TipoConstanteNomiConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoConstanteNomi.jTabbedPaneRelacionesTipoConstanteNomi.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoConstanteNomi.jContentPaneDetalleTipoConstanteNomi.getWidth(),TipoConstanteNomiConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoConstanteNomi.jTabbedPaneRelacionesTipoConstanteNomi.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoConstanteNomi.jContentPaneDetalleTipoConstanteNomi.getWidth(),TipoConstanteNomiConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(ConstanteNomiJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaConstanteNomi();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoConstanteNomi.setVisible(true);
	        this.jInternalFrameDetalleFormTipoConstanteNomi.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoConstanteNomi() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoConstanteNomi==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoConstanteNomi=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoConstanteNomi,false,this);
				} else {
					this.jInternalFrameOrderByTipoConstanteNomi=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoConstanteNomi,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoConstanteNomi);
				this.jInternalFrameOrderByTipoConstanteNomi.setVisible(false);
				this.jInternalFrameOrderByTipoConstanteNomi.setSelected(false);
				
				this.jInternalFrameOrderByTipoConstanteNomi.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoConstanteNomi"));
				
				this.inicializarActualizarBindingTablaOrderByTipoConstanteNomi();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoConstanteNomi() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoConstanteNomi==null) {
				
				this.jInternalFrameImportacionTipoConstanteNomi=new ImportacionJInternalFrame(TipoConstanteNomiConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoConstanteNomi);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoConstanteNomi);
				this.jInternalFrameImportacionTipoConstanteNomi.setVisible(false);
				this.jInternalFrameImportacionTipoConstanteNomi.setSelected(false);


				this.jInternalFrameImportacionTipoConstanteNomi.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoConstanteNomi"));
				this.jInternalFrameImportacionTipoConstanteNomi.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoConstanteNomi"));
				this.jInternalFrameImportacionTipoConstanteNomi.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoConstanteNomi"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoConstanteNomi() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoConstanteNomi==null) {
				this.jInternalFrameReporteDinamicoTipoConstanteNomi=new ReporteDinamicoJInternalFrame(TipoConstanteNomiConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoConstanteNomi);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoConstanteNomi);
				this.jInternalFrameReporteDinamicoTipoConstanteNomi.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoConstanteNomi.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoConstanteNomi.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoConstanteNomi"));
				this.jInternalFrameReporteDinamicoTipoConstanteNomi.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoConstanteNomi"));
				this.jInternalFrameReporteDinamicoTipoConstanteNomi.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoConstanteNomi"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoConstanteNomi();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaConstanteNomi() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFrame.jScrollPanelDatosConstanteNomi.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoConstanteNomi.jContentPaneDetalleTipoConstanteNomi.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFrame.jScrollPanelDatosConstanteNomi.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFrame.jScrollPanelDatosConstanteNomi.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFrame.jScrollPanelDatosConstanteNomi.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTipoConstanteNomi() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoConstanteNomi);
			
	       	this.jInternalFrameDetalleFormTipoConstanteNomi.setVisible(false);
	        this.jInternalFrameDetalleFormTipoConstanteNomi.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoConstanteNomi.dispose();
			//this.jInternalFrameDetalleFormTipoConstanteNomi=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoConstanteNomi() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoConstanteNomi.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoConstanteNomi.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoConstanteNomi() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoConstanteNomi.setVisible(true);
	        this.jInternalFrameImportacionTipoConstanteNomi.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoConstanteNomi() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoConstanteNomi.setVisible(true);
	        this.jInternalFrameOrderByTipoConstanteNomi.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoConstanteNomi() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoConstanteNomi.setVisible(false);
	        this.jInternalFrameOrderByTipoConstanteNomi.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoConstanteNomi() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoConstanteNomi.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoConstanteNomi.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoConstanteNomi() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoConstanteNomi.setVisible(false);
	        this.jInternalFrameImportacionTipoConstanteNomi.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoConstanteNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoConstanteNomi(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoConstanteNomi(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoConstanteNomi.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoConstanteNomi(true);
			//this.isEsNuevoTipoConstanteNomi=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconstantenomi =(TipoConstanteNomi) this.tipoconstantenomiLogic.getTipoConstanteNomis().toArray()[this.jTableDatosTipoConstanteNomi.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoconstantenomi =(TipoConstanteNomi) this.tipoconstantenomis.toArray()[this.jTableDatosTipoConstanteNomi.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoConstanteNomi("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoConstanteNomi(false) ;
			
			if(tipoconstantenomiSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFrame.constantenomiSessionBean.getEsGuardarRelacionado() && ConstanteNomiJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonConstanteNomiActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TipoConstanteNomiJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoConstanteNomi(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoConstanteNomi(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoConstanteNomiActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoConstanteNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconstantenomi =(TipoConstanteNomi) this.tipoconstantenomiLogic.getTipoConstanteNomis().toArray()[this.jTableDatosTipoConstanteNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoconstantenomi =(TipoConstanteNomi) this.tipoconstantenomis.toArray()[this.jTableDatosTipoConstanteNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoConstanteNomi(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoConstanteNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoConstanteNomi.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoConstanteNomi(true);
			//this.isEsNuevoTipoConstanteNomi=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconstantenomi =(TipoConstanteNomi) this.tipoconstantenomiLogic.getTipoConstanteNomis().toArray()[this.jTableDatosTipoConstanteNomi.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoconstantenomi =(TipoConstanteNomi) this.tipoconstantenomis.toArray()[this.jTableDatosTipoConstanteNomi.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipoconstantenomi.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoConstanteNomi("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoConstanteNomi(false) ;
			
			if(TipoConstanteNomiJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoConstanteNomi(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoConstanteNomi(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarTipoConstanteNomiActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconstantenomiLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoConstanteNomi(false);
			
			//if(!this.isEsNuevoTipoConstanteNomi) {								
				int intSelectedRow = this.jTableDatosTipoConstanteNomi.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconstantenomi =(TipoConstanteNomi) this.tipoconstantenomiLogic.getTipoConstanteNomis().toArray()[this.jTableDatosTipoConstanteNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoconstantenomi =(TipoConstanteNomi) this.tipoconstantenomis.toArray()[this.jTableDatosTipoConstanteNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoConstanteNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoConstanteNomi(this.tipoconstantenomi,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoConstanteNomi(this.tipoconstantenomi);
				
			}
			
			if(this.permiteMantenimiento(this.tipoconstantenomi)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoconstantenomiSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoConstanteNomi=true;
					this.inicializarActualizarBindingTablaTipoConstanteNomi(false);
					this.isEsNuevoTipoConstanteNomi=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoConstanteNomi=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoConstanteNomi=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoConstanteNomi(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoConstanteNomi(false);
				
				this.habilitarDeshabilitarControlesTipoConstanteNomi(false);
			
												
				
				if(TipoConstanteNomiJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoConstanteNomi();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoConstanteNomiActionPerformed(evt,tipoconstantenomiSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoConstanteNomi(this.tipoconstantenomi,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoConstanteNomi.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipoconstantenomiSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconstantenomiLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipoconstantenomi.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoConstanteNomi.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoConstanteNomi.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconstantenomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconstantenomiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoConstanteNomiActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconstantenomiLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoConstanteNomi.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconstantenomi =(TipoConstanteNomi) this.tipoconstantenomiLogic.getTipoConstanteNomis().toArray()[this.jTableDatosTipoConstanteNomi.convertRowIndexToModel(intSelectedRow)];
				this.tipoconstantenomi.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoconstantenomi =(TipoConstanteNomi) this.tipoconstantenomis.toArray()[this.jTableDatosTipoConstanteNomi.convertRowIndexToModel(intSelectedRow)];
				this.tipoconstantenomi.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipoconstantenomi)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoconstantenomiSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoConstanteNomiModel) this.jTableDatosTipoConstanteNomi.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoConstanteNomi=true;
				this.inicializarActualizarBindingTablaTipoConstanteNomi(false);
				this.isEsNuevoTipoConstanteNomi=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoConstanteNomi(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoConstanteNomi(false);
				
				this.habilitarDeshabilitarControlesTipoConstanteNomi(false);
				
				
				
				if(TipoConstanteNomiJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoConstanteNomi();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconstantenomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconstantenomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconstantenomiLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoConstanteNomiActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoConstanteNomi.getRowCount()>=1) {
				jTableDatosTipoConstanteNomi.removeRowSelectionInterval(0, jTableDatosTipoConstanteNomi.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoConstanteNomi(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoConstanteNomi(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoConstanteNomi(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoConstanteNomi(false) ;
			
			this.isEsNuevoTipoConstanteNomi=false;
			
			if(TipoConstanteNomiJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoConstanteNomi();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoConstanteNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconstantenomiLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoConstanteNomi(false);
				
				//SI ES MANUAL
				if(TipoConstanteNomiJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoConstanteNomi();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconstantenomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconstantenomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconstantenomiLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoConstanteNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoConstanteNomi--;			
			//TipoConstanteNomi tipoconstantenomiAux= new TipoConstanteNomi();			
			//tipoconstantenomiAux.setId(this.iIdNuevoTipoConstanteNomi);
			
			if(this.jInternalFrameDetalleFormTipoConstanteNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoConstanteNomi();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoConstanteNomi(this.tipoconstantenomi);
			
			this.tipoconstantenomi.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipoconstantenomiLogic.getTipoConstanteNomis().add(this.tipoconstantenomiAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipoconstantenomis.add(this.tipoconstantenomiAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoConstanteNomi(false);
			
			this.jTableDatosTipoConstanteNomi.setRowSelectionInterval(this.getIndiceNuevoTipoConstanteNomi(), this.getIndiceNuevoTipoConstanteNomi());
			
			int iLastRow =  this.jTableDatosTipoConstanteNomi.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoConstanteNomi.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoConstanteNomi.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoConstanteNomi(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoConstanteNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconstantenomiLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoConstanteNomi(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoConstanteNomi(false);
			
			//SI ES MANUAL
			if(TipoConstanteNomiJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoConstanteNomi();
			}
			
			//this.abrirFrameTreeTipoConstanteNomi();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconstantenomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconstantenomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconstantenomiLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoConstanteNomiActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo ConstanteS ?", "MANTENIMIENTO DE Tipo Constante", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoConstanteNomi.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoConstanteNomi();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipoconstantenomiReturnGeneral=tipoconstantenomiLogic.procesarImportacionTipoConstanteNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipoconstantenomiParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoConstanteNomiReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoConstanteNomiActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoConstanteNomi.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoConstanteNomi.setFileImportacion(this.jInternalFrameImportacionTipoConstanteNomi.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoConstanteNomi.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoConstanteNomi.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoConstanteNomi.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoConstanteNomi.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoConstanteNomiActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoConstanteNomi> tipoconstantenomisSeleccionados=new ArrayList<TipoConstanteNomi>();		

		tipoconstantenomisSeleccionados=this.getTipoConstanteNomisSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoConstanteNomi.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoConstanteNomi.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoConstanteNomiBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoConstanteNomiBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoConstanteNomis("Todos",tipoconstantenomisSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoconstantenomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Constante",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoConstanteNomi.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoConstanteNomi.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoConstanteNomiConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoConstanteNomiConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoConstanteNomi.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoConstanteNomi.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoConstanteNomi.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoConstanteNomiConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoConstanteNomiConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoConstanteNomi.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoConstanteNomiConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoConstanteNomiConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoConstanteNomi.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoConstanteNomi.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoConstanteNomiConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoConstanteNomiConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoConstanteNomiActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoConstanteNomi> tipoconstantenomisSeleccionados=new ArrayList<TipoConstanteNomi>();		
		
		tipoconstantenomisSeleccionados=this.getTipoConstanteNomisSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoconstantenomi";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoConstanteNomis");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoConstanteNomi.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoConstanteNomi.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoConstanteNomiConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoConstanteNomiConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoConstanteNomi tipoconstantenomi:tipoconstantenomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoconstantenomi.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoConstanteNomiConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoConstanteNomiConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoConstanteNomi tipoconstantenomi:tipoconstantenomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoconstantenomi.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoConstanteNomi(row);				
			//	iRow++;
			//}				
			
			//for(TipoConstanteNomi tipoconstantenomiAux:tipoconstantenomisSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoConstanteNomi(tipoconstantenomiAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoconstantenomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Constante",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipoconstantenomiLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoConstanteNomi(false);
			
			//SI ES MANUAL
			if(TipoConstanteNomiJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoConstanteNomi();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconstantenomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconstantenomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconstantenomiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoConstanteNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconstantenomiLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoConstanteNomi(false);
			
			//SI ES MANUAL
			if(TipoConstanteNomiJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoConstanteNomi();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconstantenomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconstantenomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconstantenomiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoConstanteNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconstantenomiLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoConstanteNomi(false);
			
			//SI ES MANUAL
			if(TipoConstanteNomiJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoConstanteNomi();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconstantenomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconstantenomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconstantenomiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoConstanteNomi() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoConstanteNomi.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoConstanteNomi.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoConstanteNomi.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoConstanteNomi.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoConstanteNomi.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoConstanteNomi.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoConstanteNomi.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoConstanteNomi(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoConstanteNomi(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoConstanteNomi(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoConstanteNomi(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoConstanteNomi(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoconstantenomiSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoConstanteNomi(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoConstanteNomi(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoConstanteNomi(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoConstanteNomiJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoConstanteNomiJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoConstanteNomi() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoConstanteNomi();
		
		this.inicializarActualizarBindingBotonesManualTipoConstanteNomi(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoconstantenomiSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoConstanteNomi();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoConstanteNomi() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoConstanteNomi(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoConstanteNomi(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoConstanteNomi.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoConstanteNomi.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoConstanteNomi.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoConstanteNomi!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoConstanteNomi.jCheckBoxPostAccionNuevoTipoConstanteNomi.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoConstanteNomi.jCheckBoxPostAccionSinCerrarTipoConstanteNomi.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoConstanteNomi.jCheckBoxPostAccionSinMensajeTipoConstanteNomi.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoConstanteNomi.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoConstanteNomi.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoConstanteNomi.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoConstanteNomi!=null) {
				this.jInternalFrameDetalleFormTipoConstanteNomi.jCheckBoxPostAccionNuevoTipoConstanteNomi.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoConstanteNomi.jCheckBoxPostAccionSinCerrarTipoConstanteNomi.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoConstanteNomi.jCheckBoxPostAccionSinMensajeTipoConstanteNomi.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoConstanteNomi.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoConstanteNomi.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoConstanteNomi!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoConstanteNomi.jComboBoxTiposAccionesFormularioTipoConstanteNomi.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoConstanteNomi.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoConstanteNomi!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoConstanteNomi.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoConstanteNomi.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoConstanteNomi.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoConstanteNomi.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoConstanteNomi.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoConstanteNomi!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoConstanteNomi.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoConstanteNomi.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoConstanteNomi.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoConstanteNomi(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoConstanteNomiJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoConstanteNomi(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoConstanteNomi() throws Exception {
		try	{
			if(TipoConstanteNomiJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoConstanteNomi();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoConstanteNomi() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoConstanteNomi.jComboBoxTiposAccionesFormularioTipoConstanteNomi.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoConstanteNomi.jComboBoxTiposAccionesFormularioTipoConstanteNomi.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoConstanteNomi() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoConstanteNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoConstanteNomi.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoConstanteNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoConstanteNomi.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoConstanteNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoConstanteNomi.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoConstanteNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoConstanteNomi.addItem(reporte);
			}
			
			
			if(!this.tipoconstantenomiSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoConstanteNomi.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoConstanteNomi.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoConstanteNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoConstanteNomi.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoConstanteNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoConstanteNomi.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoConstanteNomi!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoConstanteNomi.jComboBoxTiposAccionesFormularioTipoConstanteNomi.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoConstanteNomi.jComboBoxTiposAccionesFormularioTipoConstanteNomi.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoConstanteNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoConstanteNomi.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoConstanteNomi.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoConstanteNomi();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoConstanteNomi() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoConstanteNomi!=null) {
				this.jInternalFrameReporteDinamicoTipoConstanteNomi.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoConstanteNomi.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoConstanteNomi!=null) {
				this.jInternalFrameReporteDinamicoTipoConstanteNomi.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoConstanteNomi.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoConstanteNomi!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoConstanteNomi.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoConstanteNomi.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoConstanteNomi.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoConstanteNomi.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoConstanteNomi.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoConstanteNomi.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoConstanteNomi()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoConstanteNomi(Boolean esInicializar) throws Exception {				
		if(TipoConstanteNomiJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoConstanteNomi();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoConstanteNomi() throws Exception {
		this.inicializarActualizarBindingTablaTipoConstanteNomi(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoConstanteNomi() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoConstanteNomi.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoConstanteNomi.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoConstanteNomi.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoConstanteNomiPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoConstanteNomi.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoConstanteNomi.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoConstanteNomiPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoConstanteNomiOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoConstanteNomiOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoConstanteNomiPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoConstanteNomi.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoConstanteNomi.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoConstanteNomiPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoConstanteNomi.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoConstanteNomi(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipoconstantenomiLogic.getTipoConstanteNomis().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipoconstantenomis.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoConstanteNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoConstanteNomi.setModel(new TipoConstanteNomiModel(this.tipoconstantenomiLogic.getTipoConstanteNomis(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoConstanteNomi.setModel(new TipoConstanteNomiModel(this.tipoconstantenomis,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoConstanteNomi!=null && this.jInternalFrameOrderByTipoConstanteNomi.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoConstanteNomi();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoConstanteNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoConstanteNomi,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoConstanteNomiPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoConstanteNomiConstantesFunciones.SCLASSWEBTITULO,tipoconstantenomiConstantesFunciones.resaltarSeleccionarTipoConstanteNomi,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoConstanteNomiConstantesFunciones.SCLASSWEBTITULO,tipoconstantenomiConstantesFunciones.resaltarSeleccionarTipoConstanteNomi,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoConstanteNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoConstanteNomi,TipoConstanteNomiConstantesFunciones.LABEL_ID));

		if(this.tipoconstantenomiConstantesFunciones.mostraridTipoConstanteNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoConstanteNomiConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipoconstantenomiConstantesFunciones.resaltaridTipoConstanteNomi,this.tipoconstantenomiConstantesFunciones.activaridTipoConstanteNomi,this,true,"idTipoConstanteNomi","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoconstantenomiConstantesFunciones.resaltaridTipoConstanteNomi,this.tipoconstantenomiConstantesFunciones.activaridTipoConstanteNomi,this,true,"idTipoConstanteNomi","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoConstanteNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoConstanteNomi,TipoConstanteNomiConstantesFunciones.LABEL_CODIGO));

		if(this.tipoconstantenomiConstantesFunciones.mostrarcodigoTipoConstanteNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoConstanteNomiConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoconstantenomiConstantesFunciones.resaltarcodigoTipoConstanteNomi,this.tipoconstantenomiConstantesFunciones.activarcodigoTipoConstanteNomi,this,true,"codigoTipoConstanteNomi","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoconstantenomiConstantesFunciones.resaltarcodigoTipoConstanteNomi,this.tipoconstantenomiConstantesFunciones.activarcodigoTipoConstanteNomi,this,true,"codigoTipoConstanteNomi","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoConstanteNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoConstanteNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoConstanteNomi,TipoConstanteNomiConstantesFunciones.LABEL_NOMBRE));

		if(this.tipoconstantenomiConstantesFunciones.mostrarnombreTipoConstanteNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoConstanteNomiConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoconstantenomiConstantesFunciones.resaltarnombreTipoConstanteNomi,this.tipoconstantenomiConstantesFunciones.activarnombreTipoConstanteNomi,this,true,"nombreTipoConstanteNomi","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoconstantenomiConstantesFunciones.resaltarnombreTipoConstanteNomi,this.tipoconstantenomiConstantesFunciones.activarnombreTipoConstanteNomi,this,true,"nombreTipoConstanteNomi","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoConstanteNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipoconstantenomiSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosConstanteNomi && this.tipoconstantenomiConstantesFunciones.mostrarConstanteNomiTipoConstanteNomi && !TipoConstanteNomiConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Constante Nomis");
				tableColumn.setHeaderValue("Constante Nomis");
				tableColumn.setCellRenderer(new ConstanteNomiTableCell(tipoconstantenomiConstantesFunciones.resaltarConstanteNomiTipoConstanteNomi,this,this.tipoconstantenomiConstantesFunciones.activarConstanteNomiTipoConstanteNomi));
				tableColumn.setCellEditor(new ConstanteNomiTableCell(tipoconstantenomiConstantesFunciones.resaltarConstanteNomiTipoConstanteNomi,this,this.tipoconstantenomiConstantesFunciones.activarConstanteNomiTipoConstanteNomi));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoConstanteNomi.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoconstantenomiSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoconstantenomiSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoConstanteNomi.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoconstantenomiSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoconstantenomiSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoConstanteNomi.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoConstanteNomi && this.isPermisoGuardarCambiosTipoConstanteNomi) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipoconstantenomiSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipoconstantenomiSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoConstanteNomi.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.tipoconstantenomiSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosTipoConstanteNomi.addColumn(tableColumn);
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
			
			this.jTableDatosTipoConstanteNomi.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoConstanteNomi && this.isPermisoGuardarCambiosTipoConstanteNomi) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipoconstantenomiSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoConstanteNomi && this.isPermisoGuardarCambiosTipoConstanteNomi) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoConstanteNomi.moveColumn(this.jTableDatosTipoConstanteNomi.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoConstanteNomi.moveColumn(this.jTableDatosTipoConstanteNomi.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipoconstantenomiSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTipoConstanteNomi.moveColumn(this.jTableDatosTipoConstanteNomi.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoConstanteNomi.moveColumn(this.jTableDatosTipoConstanteNomi.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoConstanteNomi.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoConstanteNomi.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoConstanteNomi,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoConstanteNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoConstanteNomi.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoConstanteNomi.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoConstanteNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoConstanteNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoConstanteNomi.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoConstanteNomi.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoConstanteNomi.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipoconstantenomiLogic.getTipoConstanteNomis().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipoconstantenomis.size()-1;
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
		//this.jTableDatosTipoConstanteNomi.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoConstanteNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoConstanteNomi();
			
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
				
				//this.isEsNuevoTipoConstanteNomi=false;
					
				TipoConstanteNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoconstantenomi,new Object(),this.tipoconstantenomiParameterGeneral,this.tipoconstantenomiReturnGeneral);
			
				if(this.tipoconstantenomiSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoConstanteNomi==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoConstanteNomi.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoConstanteNomi.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconstantenomi =(TipoConstanteNomi) this.tipoconstantenomiLogic.getTipoConstanteNomis().toArray()[this.jTableDatosTipoConstanteNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoconstantenomi =(TipoConstanteNomi) this.tipoconstantenomis.toArray()[this.jTableDatosTipoConstanteNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipoconstantenomi.getsType().equals("DUPLICADO")
				   || this.tipoconstantenomi.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoConstanteNomi=true;
				
				} else {
					this.isEsNuevoTipoConstanteNomi=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipoconstantenomiSessionBean.getEsGuardarRelacionado()) {
					if(this.tipoconstantenomi.getId()>=0 && !this.tipoconstantenomi.getIsNew()) {						
						this.isEsNuevoTipoConstanteNomi=false;
						
					} else {
						this.isEsNuevoTipoConstanteNomi=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoConstanteNomi(esRelaciones);						
				
				this.seleccionarTipoConstanteNomi(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipoconstantenomi.getId()<0) {
					this.isEsNuevoTipoConstanteNomi=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoConstanteNomi(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoConstanteNomi(evt,rowIndex);
				}	
				
				if(this.tipoconstantenomiSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoConstanteNomi: " + this.dDif); 
					}
				}								
				
				TipoConstanteNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoconstantenomi,new Object(),this.tipoconstantenomiParameterGeneral,this.tipoconstantenomiReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoConstanteNomi(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipoconstantenomi)) {
					if(this.tipoconstantenomi.getId()>0) {
						this.tipoconstantenomi.setIsDeleted(true);
						
						this.tipoconstantenomisEliminados.add(this.tipoconstantenomi);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoconstantenomiLogic.getTipoConstanteNomis().remove(this.tipoconstantenomi);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoconstantenomis.remove(this.tipoconstantenomi);				
					}
					
					
					((TipoConstanteNomiModel) this.jTableDatosTipoConstanteNomi.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoConstanteNomi(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoConstanteNomi(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoConstanteNomi) {
			
			if(this.jInternalFrameDetalleFormTipoConstanteNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoConstanteNomi.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoConstanteNomi.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconstantenomi =(TipoConstanteNomi) this.tipoconstantenomiLogic.getTipoConstanteNomis().toArray()[this.jTableDatosTipoConstanteNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoconstantenomi =(TipoConstanteNomi) this.tipoconstantenomis.toArray()[this.jTableDatosTipoConstanteNomi.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoConstanteNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoConstanteNomi(this.tipoconstantenomi);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoConstanteNomi("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoConstanteNomi(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoConstanteNomi() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoConstanteNomi(TipoConstanteNomi tipoconstantenomi) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoConstanteNomi(tipoconstantenomi,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoConstanteNomi(TipoConstanteNomi tipoconstantenomi,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoConstanteNomi(tipoconstantenomi);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoConstanteNomi(tipoconstantenomi,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoConstanteNomi(tipoconstantenomi);
	}
	
	public void setVariablesObjetoActualToFormularioTipoConstanteNomi(TipoConstanteNomi tipoconstantenomi) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoConstanteNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoConstanteNomi.jTextFieldidTipoConstanteNomi.setText(tipoconstantenomi.getId().toString());
			this.jInternalFrameDetalleFormTipoConstanteNomi.jTextFieldcodigoTipoConstanteNomi.setText(tipoconstantenomi.getcodigo());
			this.jInternalFrameDetalleFormTipoConstanteNomi.jTextAreanombreTipoConstanteNomi.setText(tipoconstantenomi.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoConstanteNomi tipoconstantenomiLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipoconstantenomiLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoConstanteNomi tipoconstantenomiLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipoconstantenomiLocal=this.tipoconstantenomi;
			} else {
				tipoconstantenomiLocal=this.tipoconstantenomiAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipoconstantenomiLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoConstanteNomi(tipoconstantenomiLocal,true);
					
					if(tipoconstantenomiSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipoconstantenomiLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipoconstantenomiSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipoconstantenomiLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoConstanteNomi(TipoConstanteNomi tipoconstantenomi,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoConstanteNomi(tipoconstantenomi,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoConstanteNomi(tipoconstantenomi);
	}
	
	public void setVariablesFormularioToObjetoActualTipoConstanteNomi(TipoConstanteNomi tipoconstantenomi,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoConstanteNomi(tipoconstantenomi,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoConstanteNomi(TipoConstanteNomi tipoconstantenomi,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoConstanteNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoConstanteNomi.jTextFieldidTipoConstanteNomi.getText()==null || this.jInternalFrameDetalleFormTipoConstanteNomi.jTextFieldidTipoConstanteNomi.getText()=="" || this.jInternalFrameDetalleFormTipoConstanteNomi.jTextFieldidTipoConstanteNomi.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoConstanteNomi.jTextFieldidTipoConstanteNomi.setText("0");
			}

			if(conColumnasBase) {tipoconstantenomi.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoConstanteNomi.jTextFieldidTipoConstanteNomi.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoConstanteNomiConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoConstanteNomi.jLabelIdTipoConstanteNomi,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoconstantenomi.setcodigo(this.jInternalFrameDetalleFormTipoConstanteNomi.jTextFieldcodigoTipoConstanteNomi.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoConstanteNomiConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoConstanteNomi.jLabelcodigoTipoConstanteNomi,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoconstantenomi.setnombre(this.jInternalFrameDetalleFormTipoConstanteNomi.jTextAreanombreTipoConstanteNomi.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoConstanteNomiConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoConstanteNomi.jLabelnombreTipoConstanteNomi,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoConstanteNomi(TipoConstanteNomi tipoconstantenomiBean,TipoConstanteNomi tipoconstantenomi,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoConstanteNomi(TipoConstanteNomi tipoconstantenomiOrigen,TipoConstanteNomi tipoconstantenomi,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoconstantenomiOrigen.getId()!=null && !tipoconstantenomiOrigen.getId().equals(0L))) {tipoconstantenomi.setId(tipoconstantenomiOrigen.getId());}}
			if(conDefault || (!conDefault && tipoconstantenomiOrigen.getcodigo()!=null && !tipoconstantenomiOrigen.getcodigo().equals(""))) {tipoconstantenomi.setcodigo(tipoconstantenomiOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipoconstantenomiOrigen.getnombre()!=null && !tipoconstantenomiOrigen.getnombre().equals(""))) {tipoconstantenomi.setnombre(tipoconstantenomiOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoConstanteNomi(TipoConstanteNomi tipoconstantenomi) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoConstanteNomi.jTextFieldidTipoConstanteNomi.setText(tipoconstantenomi.getId().toString());
			this.jInternalFrameDetalleFormTipoConstanteNomi.jTextFieldcodigoTipoConstanteNomi.setText(tipoconstantenomi.getcodigo());
			this.jInternalFrameDetalleFormTipoConstanteNomi.jTextAreanombreTipoConstanteNomi.setText(tipoconstantenomi.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoConstanteNomi(TipoConstanteNomiBean tipoconstantenomiBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoConstanteNomi.jTextFieldidTipoConstanteNomi.setText(tipoconstantenomiBean.getId().toString());
			this.jInternalFrameDetalleFormTipoConstanteNomi.jTextFieldcodigoTipoConstanteNomi.setText(tipoconstantenomiBean.getcodigo());
			this.jInternalFrameDetalleFormTipoConstanteNomi.jTextAreanombreTipoConstanteNomi.setText(tipoconstantenomiBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoConstanteNomi(TipoConstanteNomiParameterReturnGeneral tipoconstantenomiReturnGeneral,TipoConstanteNomiBean tipoconstantenomiBean,Boolean conDefault) throws Exception { 
		try {
			TipoConstanteNomi tipoconstantenomiLocal=new TipoConstanteNomi();
			
			tipoconstantenomiLocal=tipoconstantenomiReturnGeneral.getTipoConstanteNomi();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoconstantenomiLocal.getId()!=null && !tipoconstantenomiLocal.getId().equals(0L))) {tipoconstantenomiBean.setId(tipoconstantenomiLocal.getId());}}
			if(conDefault || (!conDefault && tipoconstantenomiLocal.getcodigo()!=null && !tipoconstantenomiLocal.getcodigo().equals(""))) {tipoconstantenomiBean.setcodigo(tipoconstantenomiLocal.getcodigo());}
			if(conDefault || (!conDefault && tipoconstantenomiLocal.getnombre()!=null && !tipoconstantenomiLocal.getnombre().equals(""))) {tipoconstantenomiBean.setnombre(tipoconstantenomiLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoConstanteNomiGenerico(Long idTipoConstanteNomiSeleccionado,JComboBox jComboBoxTipoConstanteNomi,List<TipoConstanteNomi> tipoconstantenomisLocal)throws Exception {
		try {
			TipoConstanteNomi  tipoconstantenomiTemp=null;

			for(TipoConstanteNomi tipoconstantenomiAux:tipoconstantenomisLocal) {
				if(tipoconstantenomiAux.getId()!=null && tipoconstantenomiAux.getId().equals(idTipoConstanteNomiSeleccionado)) {
					tipoconstantenomiTemp=tipoconstantenomiAux;
					break;
				}
			}

			jComboBoxTipoConstanteNomi.setSelectedItem(tipoconstantenomiTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoConstanteNomiGenerico(JComboBox jComboBoxTipoConstanteNomi,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoConstanteNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoConstanteNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoConstanteNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoConstanteNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoConstanteNomi.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoConstanteNomi.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoConstanteNomi.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoConstanteNomi.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoConstanteNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoConstanteNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("ConstanteNomi")) {
			jButtonConstanteNomiActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoconstantenomi=(TipoConstanteNomi) tipoconstantenomiLogic.getTipoConstanteNomis().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoconstantenomi =(TipoConstanteNomi) tipoconstantenomis.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoConstanteNomi tipoconstantenomiRow=new TipoConstanteNomi();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoconstantenomiRow=(TipoConstanteNomi) tipoconstantenomiLogic.getTipoConstanteNomis().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoconstantenomiRow=(TipoConstanteNomi) tipoconstantenomis.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonConstanteNomiActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoConstanteNomi tipoconstantenomi) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoConstanteNomi==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconstantenomiLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoconstantenomi = (TipoConstanteNomi)this.tipoconstantenomiLogic.getTipoConstanteNomis().toArray()[this.jTableDatosTipoConstanteNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipoconstantenomi = (TipoConstanteNomi)this.tipoconstantenomis.toArray()[this.jTableDatosTipoConstanteNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipoconstantenomi!=null) {
						this.tipoconstantenomi = tipoconstantenomi;
					} else {
						this.tipoconstantenomi = new TipoConstanteNomi();
					}
				}

				if(this.isTienePermisosConstanteNomi && this.permiteMantenimiento(this.tipoconstantenomi)) {
					ConstanteNomiBeanSwingJInternalFrame constantenomiBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFramePopup=new ConstanteNomiBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						constantenomiBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFramePopup;
					} else {
						constantenomiBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFrame;
					}

					List<TipoConstanteNomi> tipoconstantenomis=new ArrayList<TipoConstanteNomi>();
					tipoconstantenomis.add(this.tipoconstantenomi);
					if(!esRelacionado) {
						//constantenomiBeanSwingJInternalFrame.constantenomiSessionBean.setConGuardarRelaciones(false);
						//constantenomiBeanSwingJInternalFrame.constantenomiSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					constantenomiBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoConstanteNomi.cargarConstanteNomiBeanSwingJInternalFrame(tipoconstantenomis,this.tipoconstantenomi,constantenomiBeanSwingJInternalFrame,/*conInicializar,*/constantenomiBeanSwingJInternalFrame.constantenomiSessionBean.getConGuardarRelaciones(),constantenomiBeanSwingJInternalFrame.constantenomiSessionBean.getEsGuardarRelacionado());
					constantenomiBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						constantenomiBeanSwingJInternalFrame.actualizarEstadoPanelsConstanteNomi("no_relacionado");

						constantenomiBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ConstanteNomiConstantesFunciones.ITAMANIOFILATABLA + (ConstanteNomiConstantesFunciones.ITAMANIOFILATABLA/2));

						constantenomiBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoConstanteNomi=(TitledBorder)this.jScrollPanelDatosTipoConstanteNomi.getBorder();
						TitledBorder titledBorderConstanteNomi=(TitledBorder)constantenomiBeanSwingJInternalFrame.jScrollPanelDatosConstanteNomi.getBorder();

						titledBorderConstanteNomi.setTitle(titledBorderTipoConstanteNomi.getTitle() + " -> Constante Nomi");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,constantenomiBeanSwingJInternalFrame);
						}

						constantenomiBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(constantenomiBeanSwingJInternalFrame);

						constantenomiBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipoconstantenomiSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Constante Nomi",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconstantenomiLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconstantenomiLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconstantenomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoConstanteNomi(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoConstanteNomi.setVisible((this.isVisibilidadCeldaNuevoTipoConstanteNomi && this.isPermisoNuevoTipoConstanteNomi));			
			this.jButtonDuplicarTipoConstanteNomi.setVisible((this.isVisibilidadCeldaDuplicarTipoConstanteNomi && this.isPermisoDuplicarTipoConstanteNomi));			
			this.jButtonCopiarTipoConstanteNomi.setVisible((this.isVisibilidadCeldaCopiarTipoConstanteNomi && this.isPermisoCopiarTipoConstanteNomi));
			this.jButtonVerFormTipoConstanteNomi.setVisible((this.isVisibilidadCeldaVerFormTipoConstanteNomi && this.isPermisoVerFormTipoConstanteNomi));
			
			this.jButtonAbrirOrderByTipoConstanteNomi.setVisible((this.isVisibilidadCeldaOrdenTipoConstanteNomi && this.isPermisoOrdenTipoConstanteNomi));			
			
			this.jButtonNuevoRelacionesTipoConstanteNomi.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoConstanteNomi && this.isPermisoNuevoTipoConstanteNomi));			
			this.jButtonNuevoGuardarCambiosTipoConstanteNomi.setVisible((this.isVisibilidadCeldaNuevoTipoConstanteNomi && this.isPermisoNuevoTipoConstanteNomi && this.isPermisoGuardarCambiosTipoConstanteNomi));
			
			if(this.jInternalFrameDetalleFormTipoConstanteNomi!=null) {
			this.jInternalFrameDetalleFormTipoConstanteNomi.jButtonModificarTipoConstanteNomi.setVisible((this.isVisibilidadCeldaModificarTipoConstanteNomi && this.isPermisoActualizarTipoConstanteNomi));	
			this.jInternalFrameDetalleFormTipoConstanteNomi.jButtonActualizarTipoConstanteNomi.setVisible((this.isVisibilidadCeldaActualizarTipoConstanteNomi && this.isPermisoActualizarTipoConstanteNomi));	
			this.jInternalFrameDetalleFormTipoConstanteNomi.jButtonEliminarTipoConstanteNomi.setVisible((this.isVisibilidadCeldaEliminarTipoConstanteNomi && this.isPermisoEliminarTipoConstanteNomi));
			this.jInternalFrameDetalleFormTipoConstanteNomi.jButtonCancelarTipoConstanteNomi.setVisible(this.isVisibilidadCeldaCancelarTipoConstanteNomi);							
			this.jInternalFrameDetalleFormTipoConstanteNomi.jButtonGuardarCambiosTipoConstanteNomi.setVisible((this.isVisibilidadCeldaGuardarTipoConstanteNomi && this.isPermisoGuardarCambiosTipoConstanteNomi));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoConstanteNomi.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoConstanteNomi && this.isPermisoGuardarCambiosTipoConstanteNomi));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoConstanteNomi.setVisible((this.isVisibilidadCeldaNuevoTipoConstanteNomi && this.isPermisoNuevoTipoConstanteNomi));						
			this.jButtonDuplicarToolBarTipoConstanteNomi.setVisible((this.isVisibilidadCeldaDuplicarTipoConstanteNomi && this.isPermisoDuplicarTipoConstanteNomi));						
			this.jButtonCopiarToolBarTipoConstanteNomi.setVisible((this.isVisibilidadCeldaCopiarTipoConstanteNomi && this.isPermisoCopiarTipoConstanteNomi));			
			this.jButtonVerFormToolBarTipoConstanteNomi.setVisible((this.isVisibilidadCeldaVerFormTipoConstanteNomi && this.isPermisoVerFormTipoConstanteNomi));			
			this.jButtonAbrirOrderByToolBarTipoConstanteNomi.setVisible((this.isVisibilidadCeldaOrdenTipoConstanteNomi && this.isPermisoOrdenTipoConstanteNomi));
			this.jButtonNuevoRelacionesToolBarTipoConstanteNomi.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoConstanteNomi && this.isPermisoNuevoTipoConstanteNomi));			
			this.jButtonNuevoGuardarCambiosToolBarTipoConstanteNomi.setVisible((this.isVisibilidadCeldaNuevoTipoConstanteNomi && this.isPermisoNuevoTipoConstanteNomi && this.isPermisoGuardarCambiosTipoConstanteNomi));			
			
			if(this.jInternalFrameDetalleFormTipoConstanteNomi!=null) {
			this.jInternalFrameDetalleFormTipoConstanteNomi.jButtonModificarToolBarTipoConstanteNomi.setVisible((this.isVisibilidadCeldaModificarTipoConstanteNomi && this.isPermisoActualizarTipoConstanteNomi));	
			this.jInternalFrameDetalleFormTipoConstanteNomi.jButtonActualizarToolBarTipoConstanteNomi.setVisible((this.isVisibilidadCeldaActualizarTipoConstanteNomi  && this.isPermisoActualizarTipoConstanteNomi));	
			this.jInternalFrameDetalleFormTipoConstanteNomi.jButtonEliminarToolBarTipoConstanteNomi.setVisible((this.isVisibilidadCeldaEliminarTipoConstanteNomi && this.isPermisoEliminarTipoConstanteNomi));
			this.jInternalFrameDetalleFormTipoConstanteNomi.jButtonCancelarToolBarTipoConstanteNomi.setVisible(this.isVisibilidadCeldaCancelarTipoConstanteNomi);				
			this.jInternalFrameDetalleFormTipoConstanteNomi.jButtonGuardarCambiosToolBarTipoConstanteNomi.setVisible((this.isVisibilidadCeldaGuardarTipoConstanteNomi && this.isPermisoGuardarCambiosTipoConstanteNomi));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoConstanteNomi.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoConstanteNomi && this.isPermisoGuardarCambiosTipoConstanteNomi));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoConstanteNomi.setVisible((this.isVisibilidadCeldaNuevoTipoConstanteNomi && this.isPermisoNuevoTipoConstanteNomi));			
			this.jMenuItemDuplicarTipoConstanteNomi.setVisible((this.isVisibilidadCeldaDuplicarTipoConstanteNomi && this.isPermisoDuplicarTipoConstanteNomi));			
			this.jMenuItemCopiarTipoConstanteNomi.setVisible((this.isVisibilidadCeldaCopiarTipoConstanteNomi && this.isPermisoCopiarTipoConstanteNomi));			
			this.jMenuItemVerFormTipoConstanteNomi.setVisible((this.isVisibilidadCeldaVerFormTipoConstanteNomi && this.isPermisoVerFormTipoConstanteNomi));			
			this.jMenuItemAbrirOrderByTipoConstanteNomi.setVisible((this.isVisibilidadCeldaOrdenTipoConstanteNomi && this.isPermisoOrdenTipoConstanteNomi));			
			//this.jMenuItemMostrarOcultarTipoConstanteNomi.setVisible((this.isVisibilidadCeldaOrdenTipoConstanteNomi && this.isPermisoOrdenTipoConstanteNomi));
			this.jMenuItemDetalleAbrirOrderByTipoConstanteNomi.setVisible((this.isVisibilidadCeldaOrdenTipoConstanteNomi && this.isPermisoOrdenTipoConstanteNomi));			
			//this.jMenuItemDetalleMostrarOcultarTipoConstanteNomi.setVisible((this.isVisibilidadCeldaOrdenTipoConstanteNomi && this.isPermisoOrdenTipoConstanteNomi));			
			this.jMenuItemNuevoRelacionesTipoConstanteNomi.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoConstanteNomi && this.isPermisoNuevoTipoConstanteNomi));			
			this.jMenuItemNuevoGuardarCambiosTipoConstanteNomi.setVisible((this.isVisibilidadCeldaNuevoTipoConstanteNomi && this.isPermisoNuevoTipoConstanteNomi && this.isPermisoGuardarCambiosTipoConstanteNomi));									
			
			if(this.jInternalFrameDetalleFormTipoConstanteNomi!=null) {
			this.jInternalFrameDetalleFormTipoConstanteNomi.jMenuItemModificarTipoConstanteNomi.setVisible((this.isVisibilidadCeldaModificarTipoConstanteNomi && this.isPermisoActualizarTipoConstanteNomi));	
			this.jInternalFrameDetalleFormTipoConstanteNomi.jMenuItemActualizarTipoConstanteNomi.setVisible((this.isVisibilidadCeldaActualizarTipoConstanteNomi && this.isPermisoActualizarTipoConstanteNomi));	
			this.jInternalFrameDetalleFormTipoConstanteNomi.jMenuItemEliminarTipoConstanteNomi.setVisible((this.isVisibilidadCeldaEliminarTipoConstanteNomi && this.isPermisoEliminarTipoConstanteNomi));
			this.jInternalFrameDetalleFormTipoConstanteNomi.jMenuItemCancelarTipoConstanteNomi.setVisible(this.isVisibilidadCeldaCancelarTipoConstanteNomi);				
			}
			
			this.jMenuItemGuardarCambiosTipoConstanteNomi.setVisible((this.isVisibilidadCeldaGuardarTipoConstanteNomi && this.isPermisoGuardarCambiosTipoConstanteNomi));						
			this.jMenuItemGuardarCambiosTablaTipoConstanteNomi.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoConstanteNomi && this.isPermisoGuardarCambiosTipoConstanteNomi));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoConstanteNomi=this.jButtonNuevoTipoConstanteNomi.isVisible();
			this.isVisibilidadCeldaDuplicarTipoConstanteNomi=this.jButtonDuplicarTipoConstanteNomi.isVisible();
			this.isVisibilidadCeldaCopiarTipoConstanteNomi=this.jButtonCopiarTipoConstanteNomi.isVisible();
			this.isVisibilidadCeldaVerFormTipoConstanteNomi=this.jButtonVerFormTipoConstanteNomi.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoConstanteNomi=this.jButtonAbrirOrderByTipoConstanteNomi.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoConstanteNomi=this.jButtonNuevoRelacionesTipoConstanteNomi.isVisible();
			this.isVisibilidadCeldaModificarTipoConstanteNomi=this.jButtonModificarTipoConstanteNomi.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoConstanteNomi!=null) {
			this.isVisibilidadCeldaActualizarTipoConstanteNomi=this.jInternalFrameDetalleFormTipoConstanteNomi.jButtonActualizarTipoConstanteNomi.isVisible();
			this.isVisibilidadCeldaEliminarTipoConstanteNomi=this.jInternalFrameDetalleFormTipoConstanteNomi.jButtonEliminarTipoConstanteNomi.isVisible();
			this.isVisibilidadCeldaCancelarTipoConstanteNomi=this.jInternalFrameDetalleFormTipoConstanteNomi.jButtonCancelarTipoConstanteNomi.isVisible();
			this.isVisibilidadCeldaGuardarTipoConstanteNomi=this.jInternalFrameDetalleFormTipoConstanteNomi.jButtonGuardarCambiosTipoConstanteNomi.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoConstanteNomi=this.jButtonGuardarCambiosTablaTipoConstanteNomi.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoConstanteNomi=this.jButtonNuevoToolBarTipoConstanteNomi.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoConstanteNomi=this.jButtonNuevoRelacionesToolBarTipoConstanteNomi.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoConstanteNomi!=null) {
			this.isVisibilidadCeldaModificarTipoConstanteNomi=this.jInternalFrameDetalleFormTipoConstanteNomi.jButtonModificarToolBarTipoConstanteNomi.isVisible();
			this.isVisibilidadCeldaActualizarTipoConstanteNomi=this.jInternalFrameDetalleFormTipoConstanteNomi.jButtonActualizarToolBarTipoConstanteNomi.isVisible();
			this.isVisibilidadCeldaEliminarTipoConstanteNomi=this.jInternalFrameDetalleFormTipoConstanteNomi.jButtonEliminarToolBarTipoConstanteNomi.isVisible();
			this.isVisibilidadCeldaCancelarTipoConstanteNomi=this.jInternalFrameDetalleFormTipoConstanteNomi.jButtonCancelarToolBarTipoConstanteNomi.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoConstanteNomi=this.jButtonGuardarCambiosToolBarTipoConstanteNomi.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoConstanteNomi=this.jButtonGuardarCambiosTablaToolBarTipoConstanteNomi.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoConstanteNomi=this.jMenuItemNuevoTipoConstanteNomi.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoConstanteNomi=this.jMenuItemNuevoRelacionesTipoConstanteNomi.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoConstanteNomi!=null) {
			this.isVisibilidadCeldaModificarTipoConstanteNomi=this.jInternalFrameDetalleFormTipoConstanteNomi.jMenuItemModificarTipoConstanteNomi.isVisible();
			this.isVisibilidadCeldaActualizarTipoConstanteNomi=this.jInternalFrameDetalleFormTipoConstanteNomi.jMenuItemActualizarTipoConstanteNomi.isVisible();
			this.isVisibilidadCeldaEliminarTipoConstanteNomi=this.jInternalFrameDetalleFormTipoConstanteNomi.jMenuItemEliminarTipoConstanteNomi.isVisible();
			this.isVisibilidadCeldaCancelarTipoConstanteNomi=this.jInternalFrameDetalleFormTipoConstanteNomi.jMenuItemCancelarTipoConstanteNomi.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoConstanteNomi=this.jMenuItemGuardarCambiosTipoConstanteNomi.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoConstanteNomi=this.jMenuItemGuardarCambiosTablaTipoConstanteNomi.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoConstanteNomi(Boolean esInicializar) {
		if(TipoConstanteNomiJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipoconstantenomiSessionBean.getConGuardarRelaciones()) {
				//if(this.tipoconstantenomiSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoConstanteNomi();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoConstanteNomi(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoConstanteNomi() {
		this.jButtonNuevoTipoConstanteNomi.setVisible(this.isPermisoNuevoTipoConstanteNomi);			
		this.jButtonDuplicarTipoConstanteNomi.setVisible(this.isPermisoDuplicarTipoConstanteNomi);			
		this.jButtonCopiarTipoConstanteNomi.setVisible(this.isPermisoCopiarTipoConstanteNomi);			
		this.jButtonVerFormTipoConstanteNomi.setVisible(this.isPermisoVerFormTipoConstanteNomi);			
		
		this.jButtonAbrirOrderByTipoConstanteNomi.setVisible(this.isPermisoOrdenTipoConstanteNomi);					
		
		this.jButtonNuevoRelacionesTipoConstanteNomi.setVisible(this.isPermisoNuevoTipoConstanteNomi);			
		
		if(this.jInternalFrameDetalleFormTipoConstanteNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoConstanteNomi.jButtonModificarTipoConstanteNomi.setVisible(this.isPermisoActualizarTipoConstanteNomi);	
			this.jInternalFrameDetalleFormTipoConstanteNomi.jButtonActualizarTipoConstanteNomi.setVisible(this.isPermisoActualizarTipoConstanteNomi);	
			this.jInternalFrameDetalleFormTipoConstanteNomi.jButtonEliminarTipoConstanteNomi.setVisible(this.isPermisoEliminarTipoConstanteNomi);
			this.jInternalFrameDetalleFormTipoConstanteNomi.jButtonCancelarTipoConstanteNomi.setVisible(this.isVisibilidadCeldaCancelarTipoConstanteNomi);						
			this.jInternalFrameDetalleFormTipoConstanteNomi.jButtonGuardarCambiosTipoConstanteNomi.setVisible(this.isPermisoGuardarCambiosTipoConstanteNomi);							
		}
		
		this.jButtonGuardarCambiosTablaTipoConstanteNomi.setVisible(this.isPermisoActualizarTipoConstanteNomi);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoConstanteNomi() {
		this.jInternalFrameDetalleFormTipoConstanteNomi.jButtonModificarTipoConstanteNomi.setVisible(this.isPermisoActualizarTipoConstanteNomi);	
		this.jInternalFrameDetalleFormTipoConstanteNomi.jButtonActualizarTipoConstanteNomi.setVisible(this.isPermisoActualizarTipoConstanteNomi);	
		this.jInternalFrameDetalleFormTipoConstanteNomi.jButtonEliminarTipoConstanteNomi.setVisible(this.isPermisoEliminarTipoConstanteNomi);
		this.jInternalFrameDetalleFormTipoConstanteNomi.jButtonCancelarTipoConstanteNomi.setVisible(this.isVisibilidadCeldaCancelarTipoConstanteNomi);							
		this.jInternalFrameDetalleFormTipoConstanteNomi.jButtonGuardarCambiosTipoConstanteNomi.setVisible((this.isVisibilidadCeldaGuardarTipoConstanteNomi && this.isPermisoGuardarCambiosTipoConstanteNomi));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoConstanteNomi() {
		if(TipoConstanteNomiJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoConstanteNomi();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoConstanteNomi() {
	}
	
	public void jTableDatosTipoConstanteNomiListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoConstanteNomi(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoConstanteNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconstantenomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoConstanteNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoConstanteNomi(this.gettipoconstantenomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoConstanteNomi(this.tipoconstantenomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoconstantenomi =(TipoConstanteNomi) this.tipoconstantenomiLogic.getTipoConstanteNomis().toArray()[this.jTableDatosTipoConstanteNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoconstantenomi =(TipoConstanteNomi) this.tipoconstantenomis.toArray()[this.jTableDatosTipoConstanteNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoconstantenomi==null) {
						this.tipoconstantenomi = new TipoConstanteNomi();
					}

					this.setVariablesFormularioToObjetoActualTipoConstanteNomi(this.tipoconstantenomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoConstanteNomi(this.tipoconstantenomi);
				}

				if(this.tipoconstantenomi.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipoconstantenomi.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoConstanteNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconstantenomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconstantenomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconstantenomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoConstanteNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconstantenomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoConstanteNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoConstanteNomi(this.gettipoconstantenomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoConstanteNomi(this.tipoconstantenomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoconstantenomi =(TipoConstanteNomi) this.tipoconstantenomiLogic.getTipoConstanteNomis().toArray()[this.jTableDatosTipoConstanteNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoconstantenomi =(TipoConstanteNomi) this.tipoconstantenomis.toArray()[this.jTableDatosTipoConstanteNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoconstantenomi==null) {
						this.tipoconstantenomi = new TipoConstanteNomi();
					}

					this.setVariablesFormularioToObjetoActualTipoConstanteNomi(this.tipoconstantenomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoConstanteNomi(this.tipoconstantenomi);
				}

				if(this.tipoconstantenomi.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipoconstantenomi.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoConstanteNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconstantenomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconstantenomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconstantenomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoConstanteNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconstantenomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoConstanteNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoConstanteNomi(this.gettipoconstantenomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoConstanteNomi(this.tipoconstantenomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoconstantenomi =(TipoConstanteNomi) this.tipoconstantenomiLogic.getTipoConstanteNomis().toArray()[this.jTableDatosTipoConstanteNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoconstantenomi =(TipoConstanteNomi) this.tipoconstantenomis.toArray()[this.jTableDatosTipoConstanteNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoconstantenomi==null) {
						this.tipoconstantenomi = new TipoConstanteNomi();
					}

					this.setVariablesFormularioToObjetoActualTipoConstanteNomi(this.tipoconstantenomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoConstanteNomi(this.tipoconstantenomi);
				}

				if(this.tipoconstantenomi.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipoconstantenomi.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoConstanteNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconstantenomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconstantenomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconstantenomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameTipoConstanteNomi() {
		if(this.jInternalFrameDetalleFormTipoConstanteNomi!=null) {
		

		if(this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoConstanteNomi!=null) {
			this.jInternalFrameDetalleFormTipoConstanteNomi.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoConstanteNomi.dispose();
			this.jInternalFrameDetalleFormTipoConstanteNomi=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoConstanteNomi!=null) {
			this.jInternalFrameReporteDinamicoTipoConstanteNomi.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoConstanteNomi.dispose();
			this.jInternalFrameReporteDinamicoTipoConstanteNomi=null;
		}
		
		if(this.jInternalFrameImportacionTipoConstanteNomi!=null) {
			this.jInternalFrameImportacionTipoConstanteNomi.setVisible(false);	    			
			this.jInternalFrameImportacionTipoConstanteNomi.dispose();
			this.jInternalFrameImportacionTipoConstanteNomi=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoConstanteNomi();
			
			TipoConstanteNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoconstantenomi,new Object(),this.tipoconstantenomiParameterGeneral,this.tipoconstantenomiReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoConstanteNomi")) {
				jButtonNuevoTipoConstanteNomiActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoConstanteNomi")) {
				jButtonDuplicarTipoConstanteNomiActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoConstanteNomi")) {
				jButtonCopiarTipoConstanteNomiActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoConstanteNomi")) {
				jButtonVerFormTipoConstanteNomiActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoConstanteNomi")) {
				jButtonNuevoTipoConstanteNomiActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoConstanteNomi")) {
				jButtonDuplicarTipoConstanteNomiActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoConstanteNomi")) {
				jButtonNuevoTipoConstanteNomiActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoConstanteNomi")) {
				jButtonDuplicarTipoConstanteNomiActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoConstanteNomi")) {
				jButtonNuevoTipoConstanteNomiActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoConstanteNomi")) {
				jButtonNuevoTipoConstanteNomiActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoConstanteNomi")) {
				jButtonNuevoTipoConstanteNomiActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoConstanteNomi")) {
				jButtonModificarTipoConstanteNomiActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoConstanteNomi")) {
				jButtonModificarTipoConstanteNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoConstanteNomi")) {
				jButtonModificarTipoConstanteNomiActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoConstanteNomi")) {
				jButtonActualizarTipoConstanteNomiActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoConstanteNomi")) {
				jButtonActualizarTipoConstanteNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoConstanteNomi")) {
				jButtonActualizarTipoConstanteNomiActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoConstanteNomi")) {
				jButtonEliminarTipoConstanteNomiActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoConstanteNomi")) {
				jButtonEliminarTipoConstanteNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoConstanteNomi")) {
				jButtonEliminarTipoConstanteNomiActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoConstanteNomi")) {
				jButtonCancelarTipoConstanteNomiActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoConstanteNomi")) {
				jButtonCancelarTipoConstanteNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoConstanteNomi")) {
				jButtonCancelarTipoConstanteNomiActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoConstanteNomi")) {
				jButtonCerrarTipoConstanteNomiActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoConstanteNomi")) {
				jButtonCerrarTipoConstanteNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoConstanteNomi")) {
				jButtonCerrarTipoConstanteNomiActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoConstanteNomi")) {
				jButtonMostrarOcultarTipoConstanteNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoConstanteNomi")) {
				jButtonCancelarTipoConstanteNomiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoConstanteNomi")) {
				jButtonGuardarCambiosTipoConstanteNomiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoConstanteNomi")) {
				jButtonGuardarCambiosTipoConstanteNomiActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoConstanteNomi")) {
				jButtonCopiarTipoConstanteNomiActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoConstanteNomi")) {
				jButtonVerFormTipoConstanteNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoConstanteNomi")) {
				jButtonGuardarCambiosTipoConstanteNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoConstanteNomi")) {
				jButtonCopiarTipoConstanteNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoConstanteNomi")) {
				jButtonVerFormTipoConstanteNomiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoConstanteNomi")) {
				jButtonGuardarCambiosTipoConstanteNomiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoConstanteNomi")) {
				jButtonGuardarCambiosTipoConstanteNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoConstanteNomi")) {
				jButtonGuardarCambiosTipoConstanteNomiActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoConstanteNomi")) {
				jButtonRecargarInformacionTipoConstanteNomiActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoConstanteNomi")) {
				jButtonRecargarInformacionTipoConstanteNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoConstanteNomi")) {
				jButtonRecargarInformacionTipoConstanteNomiActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoConstanteNomi")) {
				jButtonAnterioresTipoConstanteNomiActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoConstanteNomi")) {
				jButtonAnterioresTipoConstanteNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoConstanteNomi")) {
				jButtonAnterioresTipoConstanteNomiActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoConstanteNomi")) {
				jButtonSiguientesTipoConstanteNomiActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoConstanteNomi")) {
				jButtonSiguientesTipoConstanteNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoConstanteNomi")) {
				jButtonSiguientesTipoConstanteNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoConstanteNomi") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoConstanteNomi")) {
				jButtonAbrirOrderByTipoConstanteNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoConstanteNomi") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoConstanteNomi")) {
				jButtonMostrarOcultarTipoConstanteNomiActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoConstanteNomi")) {
				jButtonNuevoGuardarCambiosTipoConstanteNomiActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoConstanteNomi")) {
				jButtonNuevoGuardarCambiosTipoConstanteNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoConstanteNomi")) {
				jButtonNuevoGuardarCambiosTipoConstanteNomiActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoConstanteNomi")) {
				jButtonCerrarReporteDinamicoTipoConstanteNomiActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoConstanteNomi")) {
				jButtonGenerarReporteDinamicoTipoConstanteNomiActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoConstanteNomi")) {
				
				jButtonGenerarExcelReporteDinamicoTipoConstanteNomiActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoConstanteNomi")) {
				jButtonCerrarImportacionTipoConstanteNomiActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoConstanteNomi")) {
				
				jButtonGenerarImportacionTipoConstanteNomiActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoConstanteNomi")) {
				
				jButtonAbrirImportacionTipoConstanteNomiActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoConstanteNomi")) {
				jComboBoxTiposAccionesTipoConstanteNomiActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoConstanteNomi")) {
				jComboBoxTiposRelacionesTipoConstanteNomiActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoConstanteNomi")) {
				jComboBoxTiposAccionesTipoConstanteNomiActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoConstanteNomi")) {
				
				jComboBoxTiposSeleccionarTipoConstanteNomiActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoConstanteNomi")) {
				jTextFieldValorCampoGeneralTipoConstanteNomiActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoConstanteNomi")) {
				jButtonAbrirOrderByTipoConstanteNomiActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoConstanteNomi")) {
				jButtonAbrirOrderByTipoConstanteNomiActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoConstanteNomi")) {
				jButtonCerrarOrderByTipoConstanteNomiActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoConstanteNomiBusqueda")) {
				this.jButtonidTipoConstanteNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoConstanteNomiBusqueda")) {
				this.jButtoncodigoTipoConstanteNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoConstanteNomiBusqueda")) {
				this.jButtonnombreTipoConstanteNomiBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoConstanteNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoconstantenomi,new Object(),this.tipoconstantenomiParameterGeneral,this.tipoconstantenomiReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoConstanteNomi();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoConstanteNomiActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoconstantenomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoconstantenomi);
				
				TipoConstanteNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoconstantenomi,new Object(),this.tipoconstantenomiParameterGeneral,this.tipoconstantenomiReturnGeneral);
				
				


				
				TipoConstanteNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoconstantenomi,new Object(),this.tipoconstantenomiParameterGeneral,this.tipoconstantenomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoConstanteNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoConstanteNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoConstanteNomi tipoconstantenomiLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipoconstantenomiLocal=this.tipoconstantenomi;
			} else {
				tipoconstantenomiLocal=this.tipoconstantenomiAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoconstantenomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoconstantenomi);
				
				TipoConstanteNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoconstantenomi,new Object(),this.tipoconstantenomiParameterGeneral,this.tipoconstantenomiReturnGeneral);
							
				
				


				
				TipoConstanteNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoconstantenomi,new Object(),this.tipoconstantenomiParameterGeneral,this.tipoconstantenomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoConstanteNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoConstanteNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoConstanteNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoConstanteNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconstantenomiAnterior =(TipoConstanteNomi) this.tipoconstantenomiLogic.getTipoConstanteNomis().toArray()[this.jTableDatosTipoConstanteNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoconstantenomiAnterior =(TipoConstanteNomi) this.tipoconstantenomis.toArray()[this.jTableDatosTipoConstanteNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
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
			
			TipoConstanteNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoconstantenomi,new Object(),this.tipoconstantenomiParameterGeneral,this.tipoconstantenomiReturnGeneral);
			
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
			
			


			
			TipoConstanteNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoconstantenomi,new Object(),this.tipoconstantenomiParameterGeneral,this.tipoconstantenomiReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoConstanteNomiActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoconstantenomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoconstantenomi);
				
				TipoConstanteNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoconstantenomi,new Object(),this.tipoconstantenomiParameterGeneral,this.tipoconstantenomiReturnGeneral);
								
						
				


				
				TipoConstanteNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoconstantenomi,new Object(),this.tipoconstantenomiParameterGeneral,this.tipoconstantenomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoConstanteNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoConstanteNomi.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoconstantenomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoconstantenomi);
				
				TipoConstanteNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoconstantenomi,new Object(),this.tipoconstantenomiParameterGeneral,this.tipoconstantenomiReturnGeneral);
								
				
				


				
				TipoConstanteNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoconstantenomi,new Object(),this.tipoconstantenomiParameterGeneral,this.tipoconstantenomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoConstanteNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoConstanteNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoConstanteNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoConstanteNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconstantenomiAnterior =(TipoConstanteNomi) this.tipoconstantenomiLogic.getTipoConstanteNomis().toArray()[this.jTableDatosTipoConstanteNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoconstantenomiAnterior =(TipoConstanteNomi) this.tipoconstantenomis.toArray()[this.jTableDatosTipoConstanteNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoconstantenomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoconstantenomi);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoConstanteNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoConstanteNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconstantenomiAnterior =(TipoConstanteNomi) this.tipoconstantenomiLogic.getTipoConstanteNomis().toArray()[this.jTableDatosTipoConstanteNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoconstantenomiAnterior =(TipoConstanteNomi) this.tipoconstantenomis.toArray()[this.jTableDatosTipoConstanteNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoConstanteNomiActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoconstantenomi);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoconstantenomi);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoconstantenomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoconstantenomi);
				
				TipoConstanteNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoconstantenomi,new Object(),this.tipoconstantenomiParameterGeneral,this.tipoconstantenomiReturnGeneral);
							
				
				


				
				TipoConstanteNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoconstantenomi,new Object(),this.tipoconstantenomiParameterGeneral,this.tipoconstantenomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoConstanteNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoConstanteNomi.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoConstanteNomiActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoConstanteNomi.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoconstantenomiAnterior =(TipoConstanteNomi) this.tipoconstantenomiLogic.getTipoConstanteNomis().toArray()[this.jTableDatosTipoConstanteNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoconstantenomiAnterior =(TipoConstanteNomi) this.tipoconstantenomis.toArray()[this.jTableDatosTipoConstanteNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
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
			
			TipoConstanteNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoconstantenomi,new Object(),this.tipoconstantenomiParameterGeneral,this.tipoconstantenomiReturnGeneral);
			
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
			
			


			
			TipoConstanteNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoconstantenomi,new Object(),this.tipoconstantenomiParameterGeneral,this.tipoconstantenomiReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoConstanteNomiActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoconstantenomi);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoconstantenomi);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoconstantenomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoconstantenomi);
				
				TipoConstanteNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoconstantenomi,new Object(),this.tipoconstantenomiParameterGeneral,this.tipoconstantenomiReturnGeneral);
								
				
				


				
				TipoConstanteNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoconstantenomi,new Object(),this.tipoconstantenomiParameterGeneral,this.tipoconstantenomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoConstanteNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoConstanteNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoConstanteNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoConstanteNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconstantenomiAnterior =(TipoConstanteNomi) this.tipoconstantenomiLogic.getTipoConstanteNomis().toArray()[this.jTableDatosTipoConstanteNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoconstantenomiAnterior =(TipoConstanteNomi) this.tipoconstantenomis.toArray()[this.jTableDatosTipoConstanteNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoConstanteNomiActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoconstantenomi);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoconstantenomi);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoConstanteNomiActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoconstantenomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoconstantenomi);
				
				TipoConstanteNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoconstantenomi,new Object(),this.tipoconstantenomiParameterGeneral,this.tipoconstantenomiReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoConstanteNomi")) {
					jCheckBoxSeleccionarTodosTipoConstanteNomiItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoConstanteNomi")) {
					jCheckBoxSeleccionadosTipoConstanteNomiItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoConstanteNomi")) {
					
				}
				
				


				
				
				TipoConstanteNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoconstantenomi,new Object(),this.tipoconstantenomiParameterGeneral,this.tipoconstantenomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoConstanteNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoConstanteNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoconstantenomi);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipoconstantenomi);
				
				TipoConstanteNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoconstantenomi,new Object(),this.tipoconstantenomiParameterGeneral,this.tipoconstantenomiReturnGeneral);
												
				
				


				
				
				TipoConstanteNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoconstantenomi,new Object(),this.tipoconstantenomiParameterGeneral,this.tipoconstantenomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoConstanteNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoConstanteNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoConstanteNomiActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoConstanteNomi.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoconstantenomiAnterior =(TipoConstanteNomi) this.tipoconstantenomiLogic.getTipoConstanteNomis().toArray()[this.jTableDatosTipoConstanteNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoconstantenomiAnterior =(TipoConstanteNomi) this.tipoconstantenomis.toArray()[this.jTableDatosTipoConstanteNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoConstanteNomiActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoconstantenomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoconstantenomi);
				
				TipoConstanteNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoconstantenomi,new Object(),this.tipoconstantenomiParameterGeneral,this.tipoconstantenomiReturnGeneral);
				
				
				TipoConstanteNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoconstantenomi,new Object(),this.tipoconstantenomiParameterGeneral,this.tipoconstantenomiReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
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
			
			TipoConstanteNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoconstantenomi,new Object(),this.tipoconstantenomiParameterGeneral,this.tipoconstantenomiReturnGeneral);
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
			
			


			
			TipoConstanteNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoconstantenomi,new Object(),this.tipoconstantenomiParameterGeneral,this.tipoconstantenomiReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoConstanteNomiActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoconstantenomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoconstantenomi);
				
				TipoConstanteNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoconstantenomi,new Object(),this.tipoconstantenomiParameterGeneral,this.tipoconstantenomiReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoConstanteNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoconstantenomi,new Object(),this.tipoconstantenomiParameterGeneral,this.tipoconstantenomiReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoConstanteNomi.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoConstanteNomi.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoconstantenomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoconstantenomi);
				
				TipoConstanteNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoconstantenomi,new Object(),this.tipoconstantenomiParameterGeneral,this.tipoconstantenomiReturnGeneral);
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
				
				


				
				TipoConstanteNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoconstantenomi,new Object(),this.tipoconstantenomiParameterGeneral,this.tipoconstantenomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoConstanteNomi.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoConstanteNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoConstanteNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoConstanteNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconstantenomiAnterior =(TipoConstanteNomi) this.tipoconstantenomiLogic.getTipoConstanteNomis().toArray()[this.jTableDatosTipoConstanteNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoconstantenomiAnterior =(TipoConstanteNomi) this.tipoconstantenomis.toArray()[this.jTableDatosTipoConstanteNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoConstanteNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoconstantenomi,new Object(),this.tipoconstantenomiParameterGeneral,this.tipoconstantenomiReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoConstanteNomi")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoConstanteNomiListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoConstanteNomi.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipoconstantenomi =(TipoConstanteNomi) this.tipoconstantenomiLogic.getTipoConstanteNomis().toArray()[this.jTableDatosTipoConstanteNomi.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipoconstantenomi =(TipoConstanteNomi) this.tipoconstantenomis.toArray()[this.jTableDatosTipoConstanteNomi.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipoconstantenomi);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoConstanteNomi")) {
				
				}
				
				TipoConstanteNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoconstantenomi,new Object(),this.tipoconstantenomiParameterGeneral,this.tipoconstantenomiReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoConstanteNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoconstantenomi,new Object(),this.tipoconstantenomiParameterGeneral,this.tipoconstantenomiReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoConstanteNomi")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoConstanteNomi.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoConstanteNomi")) {
			
			}
			
			TipoConstanteNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoconstantenomi,new Object(),this.tipoconstantenomiParameterGeneral,this.tipoconstantenomiReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoConstanteNomi();
			
			TipoConstanteNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoconstantenomi,new Object(),this.tipoconstantenomiParameterGeneral,this.tipoconstantenomiReturnGeneral);
			
			if(sTipo.equals("NuevoTipoConstanteNomi")) {
				jButtonNuevoTipoConstanteNomiActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoConstanteNomi")) {
				jButtonDuplicarTipoConstanteNomiActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoConstanteNomi")) {
				jButtonCopiarTipoConstanteNomiActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoConstanteNomi")) {
				jButtonVerFormTipoConstanteNomiActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoConstanteNomi")) {
				jButtonNuevoTipoConstanteNomiActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoConstanteNomi")) {
				jButtonModificarTipoConstanteNomiActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoConstanteNomi")) {
				jButtonActualizarTipoConstanteNomiActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoConstanteNomi")) {
				jButtonEliminarTipoConstanteNomiActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoConstanteNomi")) {
				jButtonGuardarCambiosTipoConstanteNomiActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoConstanteNomi")) {
				jButtonCancelarTipoConstanteNomiActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoConstanteNomi")) {
				jButtonCerrarTipoConstanteNomiActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoConstanteNomi")) {
				jButtonGuardarCambiosTipoConstanteNomiActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoConstanteNomi")) {
				jButtonNuevoGuardarCambiosTipoConstanteNomiActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoConstanteNomi")) {
				jButtonAbrirOrderByTipoConstanteNomiActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoConstanteNomi")) {
				jButtonRecargarInformacionTipoConstanteNomiActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoConstanteNomi")) {
				jButtonAnterioresTipoConstanteNomiActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoConstanteNomi")) {
				jButtonSiguientesTipoConstanteNomiActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoConstanteNomiBusqueda")) {
				this.jButtonidTipoConstanteNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoConstanteNomiBusqueda")) {
				this.jButtoncodigoTipoConstanteNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoConstanteNomiBusqueda")) {
				this.jButtonnombreTipoConstanteNomiBusquedaActionPerformed(evt);
			}
			
			TipoConstanteNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoconstantenomi,new Object(),this.tipoconstantenomiParameterGeneral,this.tipoconstantenomiReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoConstanteNomi();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoConstanteNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoconstantenomi,new Object(),this.tipoconstantenomiParameterGeneral,this.tipoconstantenomiReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoConstanteNomi")) {
				closingInternalFrameTipoConstanteNomi();
				
			} else if(sTipo.equals("jButtonCancelarTipoConstanteNomi")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoConstanteNomi = (JInternalFrameBase)evt.getSource();
	            	
	            TipoConstanteNomiBeanSwingJInternalFrame jInternalFrameParent=(TipoConstanteNomiBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoConstanteNomi.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoConstanteNomiActionPerformed(null);
			}
			
			TipoConstanteNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoconstantenomi,new Object(),this.tipoconstantenomiParameterGeneral,this.tipoconstantenomiReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoConstanteNomi(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoConstanteNomi(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoConstanteNomi(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipoconstantenomi)) {
			if(!esControlTabla) {
				if(TipoConstanteNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoConstanteNomi(this.tipoconstantenomi,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoConstanteNomi(this.tipoconstantenomi);			
				}
				
				if(this.tipoconstantenomiSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoConstanteNomi(this.tipoconstantenomi,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoconstantenomiReturnGeneral=tipoconstantenomiLogic.procesarEventosTipoConstanteNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoconstantenomiLogic.getTipoConstanteNomis(),this.tipoconstantenomi,this.tipoconstantenomiParameterGeneral,this.isEsNuevoTipoConstanteNomi,classes);//this.tipoconstantenomiLogic.getTipoConstanteNomi()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoConstanteNomi(this.tipoconstantenomiReturnGeneral,this.tipoconstantenomiBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipoconstantenomiSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoConstanteNomi(classes,this.tipoconstantenomiReturnGeneral,this.tipoconstantenomiBean,false);
					}
						
					if(this.tipoconstantenomiReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoConstanteNomi(this.tipoconstantenomiReturnGeneral.getTipoConstanteNomi());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoConstanteNomi(this.tipoconstantenomiReturnGeneral.getTipoConstanteNomi());	
					}
						
					if(this.tipoconstantenomiReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoConstanteNomi(this.tipoconstantenomiReturnGeneral.getTipoConstanteNomi(),classes);//this.tipoconstantenomiBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoConstanteNomi(this.tipoconstantenomi,classes);//this.tipoconstantenomiBean);									
				}
			
				if(TipoConstanteNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoConstanteNomi(this.tipoconstantenomi,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoConstanteNomi(this.tipoconstantenomi);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipoconstantenomiAnterior!=null) {
						this.tipoconstantenomi=this.tipoconstantenomiAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoconstantenomiReturnGeneral=tipoconstantenomiLogic.procesarEventosTipoConstanteNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoconstantenomiLogic.getTipoConstanteNomis(),this.tipoconstantenomi,this.tipoconstantenomiParameterGeneral,this.isEsNuevoTipoConstanteNomi,classes);//this.tipoconstantenomiLogic.getTipoConstanteNomi()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoconstantenomiSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoconstantenomiSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipoconstantenomiReturnGeneral.getTipoConstanteNomi(),tipoconstantenomiLogic.getTipoConstanteNomis());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipoconstantenomiReturnGeneral.getTipoConstanteNomi(),this.tipoconstantenomis);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoConstanteNomi.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoConstanteNomi.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoConstanteNomi();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoConstanteNomi() throws Exception {
		
		TipoConstanteNomiModel tipoconstantenomiModel=(TipoConstanteNomiModel)this.jTableDatosTipoConstanteNomi.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoconstantenomiModel.tipoconstantenomis=this.tipoconstantenomiLogic.getTipoConstanteNomis();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipoconstantenomiModel.tipoconstantenomis=this.tipoconstantenomis;
		}
		
		
		((TipoConstanteNomiModel) this.jTableDatosTipoConstanteNomi.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoConstanteNomi() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipoconstantenomiAnterior(),this.tipoconstantenomiLogic.getTipoConstanteNomis());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipoconstantenomiAnterior(),this.tipoconstantenomis);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoConstanteNomi();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoConstanteNomi(TipoConstanteNomi tipoconstantenomi,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(ConstanteNomi.class)) {
					this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFrame.constantenomiLogic.setConstanteNomis(tipoconstantenomi.getConstanteNomis());
					this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFrame.inicializarActualizarBindingTablaConstanteNomi(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
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
										
				TipoConstanteNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoconstantenomi,new Object(),generalEntityParameterGeneral,this.tipoconstantenomiReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipoconstantenomiSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoConstanteNomiConstantesFunciones.getClassesRelationshipsOfTipoConstanteNomi(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoConstanteNomiConstantesFunciones.getClassesRelationshipsFromStringsOfTipoConstanteNomi(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoConstanteNomi(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoConstanteNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoconstantenomi,new Object(),generalEntityParameterGeneral,this.tipoconstantenomiReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoConstanteNomi(TipoConstanteNomiBean tipoconstantenomiBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(ConstanteNomi.class)) {
					this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFrame.constantenomiLogic.setConstanteNomis(tipoconstantenomi.getConstanteNomis());
					this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFrame.inicializarActualizarBindingTablaConstanteNomi(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoConstanteNomi(ArrayList<Classe> classes,TipoConstanteNomiReturnGeneral tipoconstantenomiReturnGeneral,TipoConstanteNomiBean tipoconstantenomiBean,Boolean conDefault) throws Exception {
		
			this.tipoconstantenomiBean.setConstanteNomis(tipoconstantenomiReturnGeneral.getTipoConstanteNomi().getConstanteNomis());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoConstanteNomi(TipoConstanteNomi tipoconstantenomi,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(ConstanteNomi.class)) {
					tipoconstantenomi.setConstanteNomis(this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiBeanSwingJInternalFrame.constantenomiLogic.getConstanteNomis());
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
		if(!paraTabla && !this.permiteMantenimiento(this.tipoconstantenomi)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoConstanteNomi = new TipoConstanteNomiDetalleFormJInternalFrame(jDesktopPane,this.tipoconstantenomiSessionBean.getConGuardarRelaciones(),this.tipoconstantenomiSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoConstanteNomi);
		this.jInternalFrameDetalleFormTipoConstanteNomi.setVisible(false);
		this.jInternalFrameDetalleFormTipoConstanteNomi.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoConstanteNomi.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoConstanteNomi.tipoconstantenomiLogic=this.tipoconstantenomiLogic;
		
		this.cargarCombosFrameForeignKeyTipoConstanteNomi("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoConstanteNomi();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoConstanteNomi();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoConstanteNomi("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoConstanteNomi();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoConstanteNomi.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoConstanteNomi"));
		
		this.jInternalFrameDetalleFormTipoConstanteNomi.jButtonModificarTipoConstanteNomi.addActionListener(new ButtonActionListener(this,"ModificarTipoConstanteNomi"));

		
		this.jInternalFrameDetalleFormTipoConstanteNomi.jButtonModificarToolBarTipoConstanteNomi.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoConstanteNomi"));
					
		this.jInternalFrameDetalleFormTipoConstanteNomi.jMenuItemModificarTipoConstanteNomi.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoConstanteNomi"));		
		
		
		
		this.jInternalFrameDetalleFormTipoConstanteNomi.jButtonActualizarTipoConstanteNomi.addActionListener (new ButtonActionListener(this,"ActualizarTipoConstanteNomi"));
		
		
		this.jInternalFrameDetalleFormTipoConstanteNomi.jButtonActualizarToolBarTipoConstanteNomi.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoConstanteNomi"));
						
		this.jInternalFrameDetalleFormTipoConstanteNomi.jMenuItemActualizarTipoConstanteNomi.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoConstanteNomi"));		
		
		
		
		this.jInternalFrameDetalleFormTipoConstanteNomi.jButtonEliminarTipoConstanteNomi.addActionListener (new ButtonActionListener(this,"EliminarTipoConstanteNomi"));
		
		
		this.jInternalFrameDetalleFormTipoConstanteNomi.jButtonEliminarToolBarTipoConstanteNomi.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoConstanteNomi"));
								
		this.jInternalFrameDetalleFormTipoConstanteNomi.jMenuItemEliminarTipoConstanteNomi.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoConstanteNomi"));		
		
		
		
		this.jInternalFrameDetalleFormTipoConstanteNomi.jButtonCancelarTipoConstanteNomi.addActionListener (new ButtonActionListener(this,"CancelarTipoConstanteNomi"));
		
		
		this.jInternalFrameDetalleFormTipoConstanteNomi.jButtonCancelarToolBarTipoConstanteNomi.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoConstanteNomi"));
					
		this.jInternalFrameDetalleFormTipoConstanteNomi.jMenuItemCancelarTipoConstanteNomi.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoConstanteNomi"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoConstanteNomi.jMenuItemDetalleCerrarTipoConstanteNomi.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoConstanteNomi"));		
		
		
		
		this.jInternalFrameDetalleFormTipoConstanteNomi.jButtonGuardarCambiosToolBarTipoConstanteNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoConstanteNomi"));
		
		
		
		this.jInternalFrameDetalleFormTipoConstanteNomi.jButtonGuardarCambiosToolBarTipoConstanteNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoConstanteNomi"));
		
		
		
		this.jInternalFrameDetalleFormTipoConstanteNomi.jComboBoxTiposAccionesFormularioTipoConstanteNomi.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoConstanteNomi"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoConstanteNomi.jButtonidTipoConstanteNomiBusqueda.addActionListener(new ButtonActionListener(this,"idTipoConstanteNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoConstanteNomi.jButtoncodigoTipoConstanteNomiBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoConstanteNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoConstanteNomi.jButtonnombreTipoConstanteNomiBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoConstanteNomiBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoConstanteNomi.jTabbedPaneRelacionesTipoConstanteNomi.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoConstanteNomi"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoConstanteNomi"));
		
		if(this.jInternalFrameDetalleFormTipoConstanteNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoConstanteNomi.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoConstanteNomi"));
		}
		
		this.jTableDatosTipoConstanteNomi.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoConstanteNomi"));
		
		this.jTableDatosTipoConstanteNomi.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoConstanteNomi"));
		
		this.jButtonNuevoTipoConstanteNomi.addActionListener(new ButtonActionListener(this,"NuevoTipoConstanteNomi"));
		
		this.jButtonDuplicarTipoConstanteNomi.addActionListener(new ButtonActionListener(this,"DuplicarTipoConstanteNomi"));
		
		this.jButtonCopiarTipoConstanteNomi.addActionListener(new ButtonActionListener(this,"CopiarTipoConstanteNomi"));
		
		this.jButtonVerFormTipoConstanteNomi.addActionListener(new ButtonActionListener(this,"VerFormTipoConstanteNomi"));
		
		
		this.jButtonNuevoToolBarTipoConstanteNomi.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoConstanteNomi"));
			
		this.jButtonDuplicarToolBarTipoConstanteNomi.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoConstanteNomi"));
			
		this.jMenuItemNuevoTipoConstanteNomi.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoConstanteNomi"));
			
		this.jMenuItemDuplicarTipoConstanteNomi.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoConstanteNomi"));		
		
		
		this.jButtonNuevoRelacionesTipoConstanteNomi.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoConstanteNomi"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoConstanteNomi.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoConstanteNomi"));
			
		this.jMenuItemNuevoRelacionesTipoConstanteNomi.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoConstanteNomi"));		
		
		
		if(this.jInternalFrameDetalleFormTipoConstanteNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoConstanteNomi.jButtonModificarTipoConstanteNomi.addActionListener(new ButtonActionListener(this,"ModificarTipoConstanteNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoConstanteNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoConstanteNomi.jButtonModificarToolBarTipoConstanteNomi.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoConstanteNomi"));
			
			this.jInternalFrameDetalleFormTipoConstanteNomi.jMenuItemModificarTipoConstanteNomi.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoConstanteNomi"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoConstanteNomi!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoConstanteNomi.jButtonActualizarTipoConstanteNomi.addActionListener (new ButtonActionListener(this,"ActualizarTipoConstanteNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoConstanteNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoConstanteNomi.jButtonActualizarToolBarTipoConstanteNomi.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoConstanteNomi"));
				
			this.jInternalFrameDetalleFormTipoConstanteNomi.jMenuItemActualizarTipoConstanteNomi.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoConstanteNomi"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoConstanteNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoConstanteNomi.jButtonEliminarTipoConstanteNomi.addActionListener (new ButtonActionListener(this,"EliminarTipoConstanteNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoConstanteNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoConstanteNomi.jButtonEliminarToolBarTipoConstanteNomi.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoConstanteNomi"));
						
			this.jInternalFrameDetalleFormTipoConstanteNomi.jMenuItemEliminarTipoConstanteNomi.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoConstanteNomi"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoConstanteNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoConstanteNomi.jButtonCancelarTipoConstanteNomi.addActionListener (new ButtonActionListener(this,"CancelarTipoConstanteNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoConstanteNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoConstanteNomi.jButtonCancelarToolBarTipoConstanteNomi.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoConstanteNomi"));
			
			this.jInternalFrameDetalleFormTipoConstanteNomi.jMenuItemCancelarTipoConstanteNomi.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoConstanteNomi"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoConstanteNomi.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoConstanteNomi"));		
		
		
		this.jButtonCerrarTipoConstanteNomi.addActionListener (new ButtonActionListener(this,"CerrarTipoConstanteNomi"));
		
		
		this.jButtonCerrarToolBarTipoConstanteNomi.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoConstanteNomi"));
			
		this.jMenuItemCerrarTipoConstanteNomi.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoConstanteNomi"));
			
		if(this.jInternalFrameDetalleFormTipoConstanteNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoConstanteNomi.jMenuItemDetalleCerrarTipoConstanteNomi.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoConstanteNomi"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoConstanteNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoConstanteNomi.jButtonGuardarCambiosTipoConstanteNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoConstanteNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoConstanteNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoConstanteNomi.jButtonGuardarCambiosToolBarTipoConstanteNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoConstanteNomi"));
		}
		
		this.jButtonCopiarToolBarTipoConstanteNomi.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoConstanteNomi"));
			
		this.jButtonVerFormToolBarTipoConstanteNomi.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoConstanteNomi"));
		
		this.jMenuItemGuardarCambiosTipoConstanteNomi.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoConstanteNomi"));
			
		this.jMenuItemCopiarTipoConstanteNomi.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoConstanteNomi"));		
		
		this.jMenuItemVerFormTipoConstanteNomi.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoConstanteNomi"));		
		
		
		this.jButtonGuardarCambiosTablaTipoConstanteNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoConstanteNomi"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoConstanteNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoConstanteNomi"));
			
		this.jMenuItemGuardarCambiosTablaTipoConstanteNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoConstanteNomi"));		
		
		
		
		this.jButtonRecargarInformacionTipoConstanteNomi.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoConstanteNomi"));
					
		this.jButtonRecargarInformacionToolBarTipoConstanteNomi.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoConstanteNomi"));
		
		this.jMenuItemRecargarInformacionTipoConstanteNomi.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoConstanteNomi"));		
		
		
		
		this.jButtonAnterioresTipoConstanteNomi.addActionListener (new ButtonActionListener(this,"AnterioresTipoConstanteNomi"));
		
		
		this.jButtonAnterioresToolBarTipoConstanteNomi.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoConstanteNomi"));
		
		this.jMenuItemAnterioresTipoConstanteNomi.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoConstanteNomi"));		
		
		
		this.jButtonSiguientesTipoConstanteNomi.addActionListener (new ButtonActionListener(this,"SiguientesTipoConstanteNomi"));
		
		
		this.jButtonSiguientesToolBarTipoConstanteNomi.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoConstanteNomi"));
			
		this.jMenuItemSiguientesTipoConstanteNomi.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoConstanteNomi"));
			
		this.jMenuItemAbrirOrderByTipoConstanteNomi.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoConstanteNomi"));
			
		this.jMenuItemMostrarOcultarTipoConstanteNomi.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoConstanteNomi"));
			
		this.jMenuItemDetalleAbrirOrderByTipoConstanteNomi.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoConstanteNomi"));
			
		this.jMenuItemDetalleMostarOcultarTipoConstanteNomi.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoConstanteNomi"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoConstanteNomi.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoConstanteNomi"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoConstanteNomi.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoConstanteNomi"));
			
		this.jMenuItemNuevoGuardarCambiosTipoConstanteNomi.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoConstanteNomi"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoConstanteNomi.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoConstanteNomi"));

		this.jCheckBoxSeleccionadosTipoConstanteNomi.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoConstanteNomi"));
		
		if(this.jInternalFrameDetalleFormTipoConstanteNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoConstanteNomi.jComboBoxTiposAccionesFormularioTipoConstanteNomi.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoConstanteNomi"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoConstanteNomi.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoConstanteNomi"));
			
		this.jComboBoxTiposAccionesTipoConstanteNomi.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoConstanteNomi"));
					
		this.jComboBoxTiposSeleccionarTipoConstanteNomi.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoConstanteNomi"));
			
		this.jTextFieldValorCampoGeneralTipoConstanteNomi.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoConstanteNomi"));		
		
		
		if(this.jInternalFrameDetalleFormTipoConstanteNomi!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoConstanteNomi.jButtonidTipoConstanteNomiBusqueda.addActionListener(new ButtonActionListener(this,"idTipoConstanteNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoConstanteNomi.jButtoncodigoTipoConstanteNomiBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoConstanteNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoConstanteNomi.jButtonnombreTipoConstanteNomiBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoConstanteNomiBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoConstanteNomi!=null) {
				this.jInternalFrameReporteDinamicoTipoConstanteNomi.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoConstanteNomi"));
				this.jInternalFrameReporteDinamicoTipoConstanteNomi.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoConstanteNomi"));
				this.jInternalFrameReporteDinamicoTipoConstanteNomi.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoConstanteNomi"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoConstanteNomi.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoConstanteNomi"));				
			//this.jButtonGenerarReporteDinamicoTipoConstanteNomi.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoConstanteNomi"));
			//this.jButtonGenerarExcelReporteDinamicoTipoConstanteNomi.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoConstanteNomi"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoConstanteNomi!=null) {
				this.jInternalFrameImportacionTipoConstanteNomi.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoConstanteNomi"));
				this.jInternalFrameImportacionTipoConstanteNomi.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoConstanteNomi"));
				this.jInternalFrameImportacionTipoConstanteNomi.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoConstanteNomi"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoConstanteNomi.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoConstanteNomi"));
			
			this.jButtonAbrirOrderByToolBarTipoConstanteNomi.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoConstanteNomi"));			
			
			if(this.jInternalFrameOrderByTipoConstanteNomi!=null) {
				this.jInternalFrameOrderByTipoConstanteNomi.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoConstanteNomi"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoConstanteNomi!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoConstanteNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoConstanteNomi.jTabbedPaneRelacionesTipoConstanteNomi.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoConstanteNomi"));
		
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
            		closingInternalFrameTipoConstanteNomi();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoConstanteNomi.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoConstanteNomi = (JInternalFrameBase)event.getSource();
	            	
	            TipoConstanteNomiBeanSwingJInternalFrame jInternalFrameParent=(TipoConstanteNomiBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoConstanteNomi.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoConstanteNomiActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoConstanteNomi.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoConstanteNomiListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoConstanteNomi.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoConstanteNomi.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoConstanteNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoConstanteNomiActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoConstanteNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoConstanteNomiActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoConstanteNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoConstanteNomiActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoConstanteNomi";
		inputMap = this.jButtonNuevoTipoConstanteNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoConstanteNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoConstanteNomiActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoConstanteNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoConstanteNomiActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoConstanteNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoConstanteNomiActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoConstanteNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoConstanteNomiActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoConstanteNomi";
		inputMap = this.jButtonNuevoRelacionesTipoConstanteNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoConstanteNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoConstanteNomiActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoConstanteNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoConstanteNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoConstanteNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoConstanteNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoConstanteNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoConstanteNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoConstanteNomi";
		inputMap = this.jButtonModificarTipoConstanteNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoConstanteNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoConstanteNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoConstanteNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoConstanteNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoConstanteNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoConstanteNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoConstanteNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoConstanteNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoConstanteNomi";
		inputMap = this.jButtonActualizarTipoConstanteNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoConstanteNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoConstanteNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoConstanteNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoConstanteNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoConstanteNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoConstanteNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoConstanteNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoConstanteNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoConstanteNomi";
		inputMap = this.jButtonEliminarTipoConstanteNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoConstanteNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoConstanteNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoConstanteNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoConstanteNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoConstanteNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoConstanteNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoConstanteNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoConstanteNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoConstanteNomi";
		inputMap = this.jButtonCancelarTipoConstanteNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoConstanteNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoConstanteNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoConstanteNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoConstanteNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoConstanteNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoConstanteNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoConstanteNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoConstanteNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoConstanteNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoConstanteNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoConstanteNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoConstanteNomi";
		inputMap = this.jButtonCerrarTipoConstanteNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoConstanteNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoConstanteNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoConstanteNomi.jButtonGuardarCambiosTipoConstanteNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoConstanteNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoConstanteNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoConstanteNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoConstanteNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoConstanteNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoConstanteNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoConstanteNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoConstanteNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoConstanteNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoConstanteNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoConstanteNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoConstanteNomi";
		inputMap = this.jInternalFrameDetalleFormTipoConstanteNomi.jButtonGuardarCambiosTipoConstanteNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoConstanteNomi.jButtonGuardarCambiosTipoConstanteNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoConstanteNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoConstanteNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoConstanteNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoConstanteNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoConstanteNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoConstanteNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoConstanteNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoConstanteNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoConstanteNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoConstanteNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoConstanteNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoConstanteNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoConstanteNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoConstanteNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoConstanteNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoConstanteNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoConstanteNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoConstanteNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoConstanteNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoConstanteNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoConstanteNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoConstanteNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoConstanteNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoConstanteNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoConstanteNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoConstanteNomi.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoConstanteNomiItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoConstanteNomi.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoConstanteNomiActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoConstanteNomi.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoConstanteNomiActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoConstanteNomi.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoConstanteNomiActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoConstanteNomi.jButtonidTipoConstanteNomiBusqueda.addActionListener(new ButtonActionListener(this,"idTipoConstanteNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoConstanteNomi.jButtoncodigoTipoConstanteNomiBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoConstanteNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoConstanteNomi.jButtonnombreTipoConstanteNomiBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoConstanteNomiBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoConstanteNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoConstanteNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoConstanteNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoConstanteNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoConstanteNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoConstanteNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoConstanteNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoConstanteNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoConstanteNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoConstanteNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoConstanteNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoConstanteNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoConstanteNomiActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoConstanteNomi.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoConstanteNomi(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoConstanteNomi tipoconstantenomiAux:this.tipoconstantenomiLogic.getTipoConstanteNomis()) {
					tipoconstantenomiAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoConstanteNomi tipoconstantenomiAux:tipoconstantenomis) {
					tipoconstantenomiAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoConstanteNomiItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoConstanteNomi(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoConstanteNomi tipoconstantenomiAux:this.tipoconstantenomiLogic.getTipoConstanteNomis()) {
						tipoconstantenomiAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoConstanteNomi tipoconstantenomiAux:tipoconstantenomis) {
						tipoconstantenomiAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoConstanteNomi tipoconstantenomiAux:this.tipoconstantenomiLogic.getTipoConstanteNomis()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoConstanteNomi tipoconstantenomiAux:tipoconstantenomis) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoConstanteNomi(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoConstanteNomi.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoConstanteNomi.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoConstanteNomi,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoConstanteNomiItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoConstanteNomi(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoConstanteNomi.getSelectedRows();
			
			TipoConstanteNomi tipoconstantenomiLocal=new TipoConstanteNomi();
			
			//this.seleccionarTodosTipoConstanteNomi(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoconstantenomiLocal =(TipoConstanteNomi) this.tipoconstantenomiLogic.getTipoConstanteNomis().toArray()[this.jTableDatosTipoConstanteNomi.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipoconstantenomiLocal =(TipoConstanteNomi) this.tipoconstantenomis.toArray()[this.jTableDatosTipoConstanteNomi.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipoconstantenomiLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoConstanteNomi tipoconstantenomiAux:this.tipoconstantenomiLogic.getTipoConstanteNomis()) {
						tipoconstantenomiAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoConstanteNomi tipoconstantenomiAux:tipoconstantenomis) {
						tipoconstantenomiAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoConstanteNomi(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoConstanteNomi.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoConstanteNomi.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoConstanteNomi,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoConstanteNomiItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoConstanteNomiParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoConstanteNomiActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoConstanteNomi(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoConstanteNomi.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoConstanteNomi tipoconstantenomiAux:this.tipoconstantenomiLogic.getTipoConstanteNomis()) {
				
						if(sTipoSeleccionar.equals(TipoConstanteNomiConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipoconstantenomiAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoConstanteNomiConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoconstantenomiAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoConstanteNomi tipoconstantenomiAux:tipoconstantenomis) {
					
						if(sTipoSeleccionar.equals(TipoConstanteNomiConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipoconstantenomiAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoConstanteNomiConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoconstantenomiAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoConstanteNomi(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoConstanteNomiActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoConstanteNomi(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoConstanteNomi=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoConstanteNomi.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoConstanteNomi.jComboBoxTiposAccionesFormularioTipoConstanteNomi.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoConstanteNomi) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoConstanteNomi(conSplash);
				
					this.generarReporteTipoConstanteNomisSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoConstanteNomi.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoConstanteNomi.jComboBoxTiposAccionesFormularioTipoConstanteNomi.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoConstanteNomisSeleccionados();
				//this.jComboBoxTiposAccionesTipoConstanteNomi.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoConstanteNomisSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoConstanteNomi.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoConstanteNomisSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoConstanteNomi.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoConstanteNomi();
				
				this.exportarTipoConstanteNomisSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoConstanteNomi.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoConstanteNomi.jComboBoxTiposAccionesFormularioTipoConstanteNomi.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoConstanteNomis();
				//this.importarTipoConstanteNomis();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoConstanteNomi.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoConstanteNomi.jComboBoxTiposAccionesFormularioTipoConstanteNomi.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoConstanteNomi();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoConstanteNomisSeleccionados();
				//this.jComboBoxTiposAccionesTipoConstanteNomi.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Constante", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoConstanteNomi();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoConstanteNomi)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoConstanteNomi(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Constante",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoConstanteNomi.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoConstanteNomi.jComboBoxTiposAccionesFormularioTipoConstanteNomi.setSelectedIndex(0);					
				}	
			} 			
			else if(TipoConstanteNomiBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTipoConstanteNomi) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTipoConstanteNomi(conSplash);
					
						//this.actualizarParametrosGeneralTipoConstanteNomi();
						
						this.generarReporteProcesoAccionTipoConstanteNomisSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTipoConstanteNomi.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTipoConstanteNomi.jComboBoxTiposAccionesFormularioTipoConstanteNomi.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TipoConstanteNomiBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo ConstanteS SELECCIONADOS?", "MANTENIMIENTO DE Tipo Constante", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTipoConstanteNomi();
				
						this.actualizarParametrosGeneralTipoConstanteNomi();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tipoconstantenomiReturnGeneral=tipoconstantenomiLogic.procesarAccionTipoConstanteNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tipoconstantenomiLogic.getTipoConstanteNomis(),this.tipoconstantenomiParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTipoConstanteNomiReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoConstanteNomi.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoConstanteNomi.jComboBoxTiposAccionesFormularioTipoConstanteNomi.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoConstanteNomi();
					
					TipoConstanteNomiBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTipoConstanteNomiReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoConstanteNomi.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoConstanteNomi.jComboBoxTiposAccionesFormularioTipoConstanteNomi.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoConstanteNomi(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoConstanteNomiActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoConstanteNomi();
			
			if(this.jInternalFrameDetalleFormTipoConstanteNomi==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoConstanteNomi> tipoconstantenomisSeleccionados=new ArrayList<TipoConstanteNomi>();		
			TipoConstanteNomi tipoconstantenomi=new TipoConstanteNomi();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoConstanteNomi(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoConstanteNomi.getSelectedItem();
			
			
			
			
			tipoconstantenomisSeleccionados=this.getTipoConstanteNomisSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipoconstantenomisSeleccionados.size()==1) {
				for(TipoConstanteNomi tipoconstantenomiAux:tipoconstantenomisSeleccionados) {
					tipoconstantenomi=tipoconstantenomiAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Constante Nomi")) {
					jButtonConstanteNomiActionPerformed(null,rowIndex,true,false,tipoconstantenomi);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoConstanteNomi();
			
      		//this.finishProcessTipoConstanteNomi(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoConstanteNomiReturnGeneral() throws Exception {
		if(this.tipoconstantenomiReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipoconstantenomiReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipoconstantenomiReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipoconstantenomiReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipoconstantenomiReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipoconstantenomiReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoConstanteNomi(false);
		}
		
		if(this.tipoconstantenomiReturnGeneral.getConRetornoLista() || this.tipoconstantenomiReturnGeneral.getConRetornoObjeto()) {
			if(this.tipoconstantenomiReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoconstantenomiLogic.setTipoConstanteNomis(this.tipoconstantenomiReturnGeneral.getTipoConstanteNomis());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipoconstantenomiReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoconstantenomiLogic.setTipoConstanteNomi(this.tipoconstantenomiReturnGeneral.getTipoConstanteNomi());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoConstanteNomi(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoConstanteNomi() throws Exception {
		
		
	}
	
	public ArrayList<TipoConstanteNomi> getTipoConstanteNomisSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoConstanteNomi> tipoconstantenomisSeleccionados=new ArrayList<TipoConstanteNomi>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoConstanteNomi) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoConstanteNomi tipoconstantenomiAux:tipoconstantenomiLogic.getTipoConstanteNomis()) {
					if(tipoconstantenomiAux.getIsSelected()) {
						tipoconstantenomisSeleccionados.add(tipoconstantenomiAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoConstanteNomi tipoconstantenomiAux:this.tipoconstantenomis) {
					if(tipoconstantenomiAux.getIsSelected()) {
						tipoconstantenomisSeleccionados.add(tipoconstantenomiAux);				
					}
				}
			}
			
			if(tipoconstantenomisSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipoconstantenomisSeleccionados.addAll(this.tipoconstantenomiLogic.getTipoConstanteNomis());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipoconstantenomisSeleccionados.addAll(this.tipoconstantenomis);				
					}
				}
			}
		} else {
			tipoconstantenomisSeleccionados.add(this.tipoconstantenomi);
		}
		
		return tipoconstantenomisSeleccionados;
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
	
	public void generarReporteTipoConstanteNomisSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoConstanteNomisSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoConstanteNomisSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoConstanteNomisSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoConstanteNomisSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTipoConstanteNomisSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Constante",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoConstanteNomisSeleccionados() throws Exception {
		ArrayList<TipoConstanteNomi> tipoconstantenomisSeleccionados=new ArrayList<TipoConstanteNomi>();		
		
		tipoconstantenomisSeleccionados=this.getTipoConstanteNomisSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoConstanteNomis("Todos",tipoconstantenomisSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoConstanteNomisSeleccionados() throws Exception {
		ArrayList<TipoConstanteNomi> tipoconstantenomisSeleccionados=new ArrayList<TipoConstanteNomi>();		
		
		tipoconstantenomisSeleccionados=this.getTipoConstanteNomisSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoConstanteNomis("Todos",tipoconstantenomisSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoConstanteNomisSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoConstanteNomi> tipoconstantenomisSeleccionados=new ArrayList<TipoConstanteNomi>();
		
		tipoconstantenomisSeleccionados=this.getTipoConstanteNomisSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoConstanteNomis("Todos",tipoconstantenomisSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoConstanteNomisSeleccionados() throws Exception {
		ArrayList<TipoConstanteNomi> tipoconstantenomisSeleccionados=new ArrayList<TipoConstanteNomi>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoConstanteNomi();
		
		
		tipoconstantenomisSeleccionados=this.getTipoConstanteNomisSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoConstanteNomi();
		
		
		//this.generarReporteTipoConstanteNomis("Todos",tipoconstantenomisSeleccionados ,tipoconstantenomiImplementable,tipoconstantenomiImplementableHome);
	}
	
	public void mostrarImportacionTipoConstanteNomis() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoConstanteNomi();
		
		this.abrirFrameImportacionTipoConstanteNomi();		
		
			
		//this.generarReporteTipoConstanteNomis("Todos",tipoconstantenomisSeleccionados ,tipoconstantenomiImplementable,tipoconstantenomiImplementableHome);
	}
	
	public void importarTipoConstanteNomis() throws Exception {		
	
	}
	
	public void exportarTipoConstanteNomisSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoConstanteNomisSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoConstanteNomisSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoConstanteNomisSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Constante",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoConstanteNomisSeleccionados() throws Exception {
		ArrayList<TipoConstanteNomi> tipoconstantenomisSeleccionados=new ArrayList<TipoConstanteNomi>();		
		
		tipoconstantenomisSeleccionados=this.getTipoConstanteNomisSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoconstantenomi."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoConstanteNomi(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoConstanteNomi tipoconstantenomiAux:tipoconstantenomisSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoConstanteNomi(tipoconstantenomiAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipoconstantenomiAux.setsDetalleGeneralEntityReporte(tipoconstantenomiAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoconstantenomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Constante",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoConstanteNomi(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoConstanteNomiConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoConstanteNomiConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoConstanteNomiConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoConstanteNomiConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoConstanteNomi(TipoConstanteNomi tipoconstantenomi,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipoconstantenomi.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoconstantenomi.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoconstantenomi.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoconstantenomi.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoConstanteNomisSeleccionados() throws Exception {
		ArrayList<TipoConstanteNomi> tipoconstantenomisSeleccionados=new ArrayList<TipoConstanteNomi>();		
		
		tipoconstantenomisSeleccionados=this.getTipoConstanteNomisSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoconstantenomi.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoConstanteNomis");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoConstanteNomi(row);				
				iRow++;
			}				
			
			for(TipoConstanteNomi tipoconstantenomiAux:tipoconstantenomisSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoConstanteNomi(tipoconstantenomiAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoconstantenomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Constante",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoConstanteNomisSeleccionados() throws Exception {
		ArrayList<TipoConstanteNomi> tipoconstantenomisSeleccionados=new ArrayList<TipoConstanteNomi>();		
		
		tipoconstantenomisSeleccionados=this.getTipoConstanteNomisSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoconstantenomi.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipoconstantenomis");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipoconstantenomi");
			//elementRoot.appendChild(element);
		
			for(TipoConstanteNomi tipoconstantenomiAux:tipoconstantenomisSeleccionados) {
				element = document.createElement("tipoconstantenomi");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoConstanteNomi(tipoconstantenomiAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoconstantenomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Constante",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoConstanteNomi(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoConstanteNomiConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoConstanteNomiConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoConstanteNomiConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoConstanteNomiConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoConstanteNomi(TipoConstanteNomi tipoconstantenomi,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipoconstantenomi.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoconstantenomi.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoconstantenomi.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoConstanteNomi(TipoConstanteNomi tipoconstantenomi,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoConstanteNomiConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipoconstantenomi.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoConstanteNomiConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipoconstantenomi.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(TipoConstanteNomiConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipoconstantenomi.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoConstanteNomiConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipoconstantenomi.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoConstanteNomisSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoConstanteNomi> tipoconstantenomisSeleccionados=new ArrayList<TipoConstanteNomi>();
		
		tipoconstantenomisSeleccionados=this.getTipoConstanteNomisSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoConstanteNomi(tipoconstantenomisSeleccionados);
		
		this.generarReporteTipoConstanteNomis("Todos",tipoconstantenomisSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoConstanteNomi(ArrayList<TipoConstanteNomi> tipoconstantenomisSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoConstanteNomi tipoconstantenomiAux:tipoconstantenomisSeleccionados) {
				tipoconstantenomiAux.setsDetalleGeneralEntityReporte(tipoconstantenomiAux.toString());
			
				if(sTipoSeleccionar.equals(TipoConstanteNomiConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipoconstantenomiAux.setsDescripcionGeneralEntityReporte1(tipoconstantenomiAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoConstanteNomiConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipoconstantenomiAux.setsDescripcionGeneralEntityReporte1(tipoconstantenomiAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConstanteNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoConstanteNomi(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoConstanteNomi=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoConstanteNomi=true;
				this.isVisibilidadCeldaGuardarCambiosTipoConstanteNomi=true;
			}
			
			this.isVisibilidadCeldaModificarTipoConstanteNomi=false;
			this.isVisibilidadCeldaActualizarTipoConstanteNomi=false;
			this.isVisibilidadCeldaEliminarTipoConstanteNomi=false;
			this.isVisibilidadCeldaCancelarTipoConstanteNomi=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoConstanteNomi=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoConstanteNomi=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoConstanteNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoConstanteNomi=false;
			this.isVisibilidadCeldaGuardarCambiosTipoConstanteNomi=false;
			this.isVisibilidadCeldaModificarTipoConstanteNomi=false;
			this.isVisibilidadCeldaActualizarTipoConstanteNomi=true;
			this.isVisibilidadCeldaEliminarTipoConstanteNomi=false;
			this.isVisibilidadCeldaCancelarTipoConstanteNomi=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoConstanteNomi=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoConstanteNomi=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoConstanteNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoConstanteNomi=false;
			this.isVisibilidadCeldaGuardarCambiosTipoConstanteNomi=false;
			this.isVisibilidadCeldaModificarTipoConstanteNomi=false;
			this.isVisibilidadCeldaActualizarTipoConstanteNomi=true;
			this.isVisibilidadCeldaEliminarTipoConstanteNomi=true;
			this.isVisibilidadCeldaCancelarTipoConstanteNomi=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoConstanteNomi=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoConstanteNomi=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoConstanteNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoConstanteNomi=false;
			this.isVisibilidadCeldaGuardarCambiosTipoConstanteNomi=false;
			this.isVisibilidadCeldaModificarTipoConstanteNomi=false;
			this.isVisibilidadCeldaActualizarTipoConstanteNomi=true;
			this.isVisibilidadCeldaEliminarTipoConstanteNomi=false;
			this.isVisibilidadCeldaCancelarTipoConstanteNomi=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoConstanteNomi=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoConstanteNomi=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoConstanteNomi=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoConstanteNomi=true;
			this.isVisibilidadCeldaGuardarCambiosTipoConstanteNomi=true;
			this.isVisibilidadCeldaModificarTipoConstanteNomi=false;
			this.isVisibilidadCeldaActualizarTipoConstanteNomi=false;
			this.isVisibilidadCeldaEliminarTipoConstanteNomi=false;
			this.isVisibilidadCeldaCancelarTipoConstanteNomi=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoConstanteNomi=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoConstanteNomi=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoConstanteNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoConstanteNomi=false;
			this.isVisibilidadCeldaGuardarCambiosTipoConstanteNomi=false;
			this.isVisibilidadCeldaActualizarTipoConstanteNomi=false;
			this.isVisibilidadCeldaEliminarTipoConstanteNomi=false;
			this.isVisibilidadCeldaCancelarTipoConstanteNomi=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoConstanteNomi=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoConstanteNomi=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoConstanteNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoConstanteNomi=false;
			this.isVisibilidadCeldaGuardarCambiosTipoConstanteNomi=false;
			this.isVisibilidadCeldaModificarTipoConstanteNomi=true;
			this.isVisibilidadCeldaActualizarTipoConstanteNomi=false;
			this.isVisibilidadCeldaEliminarTipoConstanteNomi=false;
			this.isVisibilidadCeldaCancelarTipoConstanteNomi=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoConstanteNomi=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoConstanteNomi=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoConstanteNomiJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoConstanteNomi=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoConstanteNomi=true;
			this.isVisibilidadCeldaGuardarCambiosTipoConstanteNomi=true;
		} else {
			this.actualizarEstadoPanelsTipoConstanteNomi(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoConstanteNomi=false;
			//this.isVisibilidadCeldaVerFormTipoConstanteNomi=false;
			this.isVisibilidadCeldaDuplicarTipoConstanteNomi=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipoconstantenomiSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoConstanteNomi=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoConstanteNomi=false;
			this.isVisibilidadCeldaGuardarCambiosTipoConstanteNomi=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipoconstantenomiSessionBean.getEsGuardarRelacionado()) {
			if(!tipoconstantenomiSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoConstanteNomi=false;												
			}
			
			this.jButtonCerrarTipoConstanteNomi.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoConstanteNomi=false;
		}
		
		if(!this.permiteMantenimiento(this.tipoconstantenomi)) {
			this.isVisibilidadCeldaActualizarTipoConstanteNomi=false;
			this.isVisibilidadCeldaEliminarTipoConstanteNomi=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoConstanteNomi() {
		this.isVisibilidadCeldaNuevoTipoConstanteNomi=false;
		this.isVisibilidadCeldaGuardarCambiosTipoConstanteNomi=false;
	}
	
	public void actualizarEstadoPanelsTipoConstanteNomi(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoConstanteNomi!=null) {
				this.jScrollPanelDatosEdicionTipoConstanteNomi.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoConstanteNomi!=null) {
				this.jScrollPanelDatosTipoConstanteNomi.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoConstanteNomi!=null) {
				this.jPanelPaginacionTipoConstanteNomi.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoConstanteNomi!=null) {
				this.jPanelParametrosReportesTipoConstanteNomi.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoConstanteNomi!=null) {
				this.jScrollPanelDatosEdicionTipoConstanteNomi.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoConstanteNomi!=null) {
				this.jScrollPanelDatosTipoConstanteNomi.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoConstanteNomi!=null) {
				this.jPanelPaginacionTipoConstanteNomi.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoConstanteNomi!=null) {
				this.jPanelParametrosReportesTipoConstanteNomi.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoConstanteNomi!=null) {
				this.jScrollPanelDatosEdicionTipoConstanteNomi.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosTipoConstanteNomi!=null) {
				this.jScrollPanelDatosTipoConstanteNomi.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoConstanteNomi!=null) {
				this.jPanelPaginacionTipoConstanteNomi.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoConstanteNomi!=null) {
				this.jPanelParametrosReportesTipoConstanteNomi.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoConstanteNomi!=null) {
				this.jScrollPanelDatosEdicionTipoConstanteNomi.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoConstanteNomi!=null) {
				this.jScrollPanelDatosTipoConstanteNomi.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoConstanteNomi!=null) {
				this.jPanelPaginacionTipoConstanteNomi.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoConstanteNomi!=null) {
				this.jPanelParametrosReportesTipoConstanteNomi.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoConstanteNomi!=null) {
				this.jScrollPanelDatosEdicionTipoConstanteNomi.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoConstanteNomi!=null) {
				this.jScrollPanelDatosTipoConstanteNomi.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoConstanteNomi!=null) {
				this.jPanelPaginacionTipoConstanteNomi.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoConstanteNomi!=null) {
				this.jPanelParametrosReportesTipoConstanteNomi.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoConstanteNomi!=null) {
				this.jScrollPanelDatosEdicionTipoConstanteNomi.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoConstanteNomi!=null) {
				this.jScrollPanelDatosTipoConstanteNomi.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoConstanteNomi!=null) {
				this.jPanelPaginacionTipoConstanteNomi.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoConstanteNomi!=null) {
				this.jPanelParametrosReportesTipoConstanteNomi.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoConstanteNomi!=null) {
				this.jScrollPanelDatosEdicionTipoConstanteNomi.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoConstanteNomi!=null) {
				this.jScrollPanelDatosTipoConstanteNomi.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoConstanteNomi!=null) {
				this.jPanelPaginacionTipoConstanteNomi.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoConstanteNomi!=null) {
				this.jPanelParametrosReportesTipoConstanteNomi.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipoconstantenomiSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.tipoconstantenomiSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	

	public String registrarSesionTipoConstanteNomiParaConstanteNomis() throws Exception {
		Boolean isPaginaPopupConstanteNomi=false;

		try {

			if(this.tipoconstantenomiSessionBean==null) {
				this.tipoconstantenomiSessionBean=new TipoConstanteNomiSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiSessionBean==null) {
				this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiSessionBean=new ConstanteNomiSessionBean();
			}

			this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiSessionBean.setsPathNavegacionActual(tipoconstantenomiSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ConstanteNomiConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupConstanteNomi=this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeConstanteNomi(true);
			this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeConstanteNomi(TipoConstanteNomiConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiSessionBean.setisBusquedaDesdeForeignKeySesionTipoConstanteNomi(true);
			this.jInternalFrameDetalleFormTipoConstanteNomi.constantenomiSessionBean.setlidTipoConstanteNomiActual(this.idTipoConstanteNomiActual);

			tipoconstantenomiSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoConstanteNomi(true);
			tipoconstantenomiSessionBean.setlIdTipoConstanteNomiActualForeignKey(this.idTipoConstanteNomiActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoConstanteNomiSessionBean tipoconstantenomiSessionBean=new TipoConstanteNomiSessionBean();
		
		if(this.tipoconstantenomiSessionBean==null) {
			this.tipoconstantenomiSessionBean=new TipoConstanteNomiSessionBean();
		}
		
		this.tipoconstantenomiSessionBean.setsUltimaBusquedaTipoConstanteNomi(this.getsAccionBusqueda());
		this.tipoconstantenomiSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipoconstantenomiSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoConstanteNomiSessionBean tipoconstantenomiSessionBean=new TipoConstanteNomiSessionBean();
		
		if(this.tipoconstantenomiSessionBean==null) {
			this.tipoconstantenomiSessionBean=new TipoConstanteNomiSessionBean();
		}
		
		if(this.tipoconstantenomiSessionBean.getsUltimaBusquedaTipoConstanteNomi()!=null&&!this.tipoconstantenomiSessionBean.getsUltimaBusquedaTipoConstanteNomi().equals("")) {
			this.setsAccionBusqueda(tipoconstantenomiSessionBean.getsUltimaBusquedaTipoConstanteNomi());
			this.setiNumeroPaginacion(tipoconstantenomiSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipoconstantenomiSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.tipoconstantenomiSessionBean.setsUltimaBusquedaTipoConstanteNomi("");
		this.tipoconstantenomiSessionBean.setiNumeroPaginacion(TipoConstanteNomiConstantesFunciones.INUMEROPAGINACION);
		this.tipoconstantenomiSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoConstanteNomi(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoConstanteNomi() {
		this.updateBorderResaltarBusquedasFormularioTipoConstanteNomi();
		this.updateVisibilidadBusquedasFormularioTipoConstanteNomi();
		this.updateHabilitarBusquedasFormularioTipoConstanteNomi();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoConstanteNomi() {					
	}
	
	public void updateVisibilidadBusquedasFormularioTipoConstanteNomi() {
	}
	
	public void updateHabilitarBusquedasFormularioTipoConstanteNomi() {
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
	
	public void updateControlesFormularioTipoConstanteNomi() throws Exception {

		if(this.jInternalFrameDetalleFormTipoConstanteNomi==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoConstanteNomi();
		this.updateVisibilidadResaltarControlesFormularioTipoConstanteNomi();
		this.updateHabilitarResaltarControlesFormularioTipoConstanteNomi();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoConstanteNomi() throws Exception {
		if(this.jInternalFrameDetalleFormTipoConstanteNomi==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipoconstantenomiConstantesFunciones.resaltaridTipoConstanteNomi!=null && this.jInternalFrameDetalleFormTipoConstanteNomi!=null) {this.jInternalFrameDetalleFormTipoConstanteNomi.jTextFieldidTipoConstanteNomi.setBorder(this.tipoconstantenomiConstantesFunciones.resaltaridTipoConstanteNomi);}
		if(this.tipoconstantenomiConstantesFunciones.resaltarcodigoTipoConstanteNomi!=null && this.jInternalFrameDetalleFormTipoConstanteNomi!=null) {this.jInternalFrameDetalleFormTipoConstanteNomi.jTextFieldcodigoTipoConstanteNomi.setBorder(this.tipoconstantenomiConstantesFunciones.resaltarcodigoTipoConstanteNomi);}
		if(this.tipoconstantenomiConstantesFunciones.resaltarnombreTipoConstanteNomi!=null && this.jInternalFrameDetalleFormTipoConstanteNomi!=null) {this.jInternalFrameDetalleFormTipoConstanteNomi.jTextAreanombreTipoConstanteNomi.setBorder(this.tipoconstantenomiConstantesFunciones.resaltarnombreTipoConstanteNomi);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoConstanteNomi() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoConstanteNomi==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoConstanteNomi!=null) {
	
		//this.jInternalFrameDetalleFormTipoConstanteNomi.jTextFieldidTipoConstanteNomi.setVisible(this.tipoconstantenomiConstantesFunciones.mostraridTipoConstanteNomi);
		this.jInternalFrameDetalleFormTipoConstanteNomi.jPanelidTipoConstanteNomi.setVisible(this.tipoconstantenomiConstantesFunciones.mostraridTipoConstanteNomi);
		//this.jInternalFrameDetalleFormTipoConstanteNomi.jTextFieldcodigoTipoConstanteNomi.setVisible(this.tipoconstantenomiConstantesFunciones.mostrarcodigoTipoConstanteNomi);
		this.jInternalFrameDetalleFormTipoConstanteNomi.jPanelcodigoTipoConstanteNomi.setVisible(this.tipoconstantenomiConstantesFunciones.mostrarcodigoTipoConstanteNomi);
		//this.jInternalFrameDetalleFormTipoConstanteNomi.jTextAreanombreTipoConstanteNomi.setVisible(this.tipoconstantenomiConstantesFunciones.mostrarnombreTipoConstanteNomi);
		this.jInternalFrameDetalleFormTipoConstanteNomi.jPanelnombreTipoConstanteNomi.setVisible(this.tipoconstantenomiConstantesFunciones.mostrarnombreTipoConstanteNomi);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoConstanteNomi() throws Exception {
		if(this.jInternalFrameDetalleFormTipoConstanteNomi==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoConstanteNomi!=null) {
	
		this.jInternalFrameDetalleFormTipoConstanteNomi.jTextFieldidTipoConstanteNomi.setEnabled(this.tipoconstantenomiConstantesFunciones.activaridTipoConstanteNomi);
		this.jInternalFrameDetalleFormTipoConstanteNomi.jTextFieldcodigoTipoConstanteNomi.setEnabled(this.tipoconstantenomiConstantesFunciones.activarcodigoTipoConstanteNomi);
		this.jInternalFrameDetalleFormTipoConstanteNomi.jTextAreanombreTipoConstanteNomi.setEnabled(this.tipoconstantenomiConstantesFunciones.activarnombreTipoConstanteNomi);
		}
	}
	
		
}