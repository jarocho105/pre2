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

import com.bydan.erp.nomina.util.DiaFeriadoConstantesFunciones;
import com.bydan.erp.nomina.util.DiaFeriadoParameterReturnGeneral;
//import com.bydan.erp.nomina.util.DiaFeriadoParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.DiaFeriadoBean;
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
public class DiaFeriadoBeanSwingJInternalFrame extends DiaFeriadoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(DiaFeriadoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<DiaFeriado> diaferiadoValidator = new ClassValidator<DiaFeriado>(DiaFeriado.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public DiaFeriado diaferiado;	
	public DiaFeriado diaferiadoAux;
	public DiaFeriado diaferiadoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public DiaFeriado diaferiadoTotales;
	public Long idDiaFeriadoActual;
	public Long iIdNuevoDiaFeriado=0L;
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

	public String sFinalQueryComboMes="";

	public List<Mes> messForeignKey;

	public List<Mes> getmessForeignKey() {
		return messForeignKey;
	}

	public void setmessForeignKey(List<Mes> messForeignKey) {
		this.messForeignKey = messForeignKey;
	}

	//OBJETO FK ACTUAL
	public Mes mesForeignKey;

	public Mes getmesForeignKey() {
		return mesForeignKey;
	}

	public void setmesForeignKey(Mes mesForeignKey) {
		this.mesForeignKey = mesForeignKey;
	}

	public String sFinalQueryComboAnio="";

	public List<Anio> aniosForeignKey;

	public List<Anio> getaniosForeignKey() {
		return aniosForeignKey;
	}

	public void setaniosForeignKey(List<Anio> aniosForeignKey) {
		this.aniosForeignKey = aniosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Anio anioForeignKey;

	public Anio getanioForeignKey() {
		return anioForeignKey;
	}

	public void setanioForeignKey(Anio anioForeignKey) {
		this.anioForeignKey = anioForeignKey;
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
	
	public Boolean isPermisoTodoDiaFeriado;
	public Boolean isPermisoNuevoDiaFeriado;
	public Boolean isPermisoActualizarDiaFeriado;
	public Boolean isPermisoActualizarOriginalDiaFeriado;
	public Boolean isPermisoEliminarDiaFeriado;
	public Boolean isPermisoGuardarCambiosDiaFeriado;
	public Boolean isPermisoConsultaDiaFeriado;
	public Boolean isPermisoBusquedaDiaFeriado;
	public Boolean isPermisoReporteDiaFeriado;
	public Boolean isPermisoPaginacionMedioDiaFeriado;
	public Boolean isPermisoPaginacionAltoDiaFeriado;
	public Boolean isPermisoPaginacionTodoDiaFeriado;
	public Boolean isPermisoCopiarDiaFeriado;
	public Boolean isPermisoVerFormDiaFeriado;
	public Boolean isPermisoDuplicarDiaFeriado;
	public Boolean isPermisoOrdenDiaFeriado;
	
	
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
	
	public DiaFeriadoParameterReturnGeneral diaferiadoReturnGeneral;
	public DiaFeriadoParameterReturnGeneral diaferiadoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoDiaFeriado=false;
	public Boolean esParaAccionDesdeFormularioDiaFeriado=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected DiaFeriadoSessionBeanAdditional diaferiadoSessionBeanAdditional=null;
	
	public DiaFeriadoSessionBeanAdditional getDiaFeriadoSessionBeanAdditional() {
		return this.diaferiadoSessionBeanAdditional;
	}
	
	public void setDiaFeriadoSessionBeanAdditional(DiaFeriadoSessionBeanAdditional diaferiadoSessionBeanAdditional) {
		try {
			this.diaferiadoSessionBeanAdditional=diaferiadoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected DiaFeriadoBeanSwingJInternalFrameAdditional diaferiadoBeanSwingJInternalFrameAdditional=null;
	//public class DiaFeriadoBeanSwingJInternalFrame
	
	public DiaFeriadoBeanSwingJInternalFrameAdditional getDiaFeriadoBeanSwingJInternalFrameAdditional() {
		return this.diaferiadoBeanSwingJInternalFrameAdditional;
	}
	
	public void setDiaFeriadoBeanSwingJInternalFrameAdditional(DiaFeriadoBeanSwingJInternalFrameAdditional diaferiadoBeanSwingJInternalFrameAdditional) {
		try {
			this.diaferiadoBeanSwingJInternalFrameAdditional=diaferiadoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public DiaFeriadoLogic diaferiadoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public DiaFeriado diaferiadoBean;
	public DiaFeriadoConstantesFunciones diaferiadoConstantesFunciones;
	//public DiaFeriadoParameterReturnGeneral diaferiadoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public MesLogic mesLogic;
	public AnioLogic anioLogic;
	
	//PARAMETROS
	
	
	//public List<DiaFeriado> diaferiados;	
	//public List<DiaFeriado> diaferiadosEliminados;
	//public List<DiaFeriado> diaferiadosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoDiaFeriado=false;
	public Boolean isVisibilidadCeldaDuplicarDiaFeriado=true;
	public Boolean isVisibilidadCeldaCopiarDiaFeriado=true;
	public Boolean isVisibilidadCeldaVerFormDiaFeriado=true;
	public Boolean isVisibilidadCeldaOrdenDiaFeriado=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesDiaFeriado=false;
	public Boolean isVisibilidadCeldaModificarDiaFeriado=false;
	public Boolean isVisibilidadCeldaActualizarDiaFeriado=false;
	public Boolean isVisibilidadCeldaEliminarDiaFeriado=false;
	public Boolean isVisibilidadCeldaCancelarDiaFeriado=false;
	public Boolean isVisibilidadCeldaGuardarDiaFeriado=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosDiaFeriado=false;	
	
	
	public Boolean isVisibilidadFK_IdAnio=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdMes=false;
	
	public Long getiIdNuevoDiaFeriado() {
		return this.iIdNuevoDiaFeriado;
	}

	public void setiIdNuevoDiaFeriado(Long iIdNuevoDiaFeriado) {
		this.iIdNuevoDiaFeriado = iIdNuevoDiaFeriado;
	}
	
	public Long getidDiaFeriadoActual() {
		return this.idDiaFeriadoActual;
	}

	public void setidDiaFeriadoActual(Long idDiaFeriadoActual) {
		this.idDiaFeriadoActual = idDiaFeriadoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public DiaFeriado getdiaferiado() {
		return this.diaferiado;
	}

	public void setdiaferiado(DiaFeriado diaferiado) {
		this.diaferiado = diaferiado;
	}
	
	public DiaFeriado getdiaferiadoAux() {
		return this.diaferiadoAux;
	}

	public void setdiaferiadoAux(DiaFeriado diaferiadoAux) {
		this.diaferiadoAux = diaferiadoAux;
	}				
	
	public DiaFeriado getdiaferiadoAnterior() {
		return this.diaferiadoAnterior;
	}

	public void setdiaferiadoAnterior(DiaFeriado diaferiadoAnterior) {
		this.diaferiadoAnterior = diaferiadoAnterior;
	}	
	
	public DiaFeriado getdiaferiadoTotales() {
		return this.diaferiadoTotales;
	}

	public void setdiaferiadoTotales(DiaFeriado diaferiadoTotales) {
		this.diaferiadoTotales = diaferiadoTotales;
	}	
	
	public DiaFeriado getdiaferiadoBean() {
		return this.diaferiadoBean;
	}

	public void setdiaferiadoBean(DiaFeriado diaferiadoBean) {
		this.diaferiadoBean = diaferiadoBean;
	}	
	
	public DiaFeriadoParameterReturnGeneral getdiaferiadoReturnGeneral() {
		return this.diaferiadoReturnGeneral;
	}

	public void setdiaferiadoReturnGeneral(DiaFeriadoParameterReturnGeneral diaferiadoReturnGeneral) {
		this.diaferiadoReturnGeneral = diaferiadoReturnGeneral;
	}	
	
	
	public Long id_anioFK_IdAnio=null;

	public Long getid_anioFK_IdAnio() {
		return this.id_anioFK_IdAnio;
	}

	public void setid_anioFK_IdAnio(Long id_anioFK_IdAnio) {
		this.id_anioFK_IdAnio = id_anioFK_IdAnio;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_mesFK_IdMes=null;

	public Long getid_mesFK_IdMes() {
		return this.id_mesFK_IdMes;
	}

	public void setid_mesFK_IdMes(Long id_mesFK_IdMes) {
		this.id_mesFK_IdMes = id_mesFK_IdMes;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public DiaFeriadoLogic getDiaFeriadoLogic()	{		
		return diaferiadoLogic;
	}

	public void setDiaFeriadoLogic(DiaFeriadoLogic diaferiadoLogic) {
		this.diaferiadoLogic = diaferiadoLogic;
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
	
	public Boolean getIsEsNuevoDiaFeriado() {
		return isEsNuevoDiaFeriado;
	}

	public void setIsEsNuevoDiaFeriado(Boolean isEsNuevoDiaFeriado) {
		this.isEsNuevoDiaFeriado = isEsNuevoDiaFeriado;
	}

	public Boolean getEsParaAccionDesdeFormularioDiaFeriado() {
		return esParaAccionDesdeFormularioDiaFeriado;
	}
	
	public void setEsParaAccionDesdeFormularioDiaFeriado(Boolean esParaAccionDesdeFormularioDiaFeriado) {
		this.esParaAccionDesdeFormularioDiaFeriado = esParaAccionDesdeFormularioDiaFeriado;
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

			if(this.diaferiadoSessionBean==null) {
				this.diaferiadoSessionBean=new DiaFeriadoSessionBean();
			}

			if(!this.diaferiadoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(diaferiadoSessionBean.getlidEmpresaActual());
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

	public void cargarCombosMessForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.messForeignKey=new ArrayList<Mes>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			MesLogic mesLogic=new MesLogic();

			//mesLogic.getMesDataAccess().setIsForForeingKeyData(true);

			if(this.diaferiadoSessionBean==null) {
				this.diaferiadoSessionBean=new DiaFeriadoSessionBean();
			}

			if(!this.diaferiadoSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//mesLogic.getMesDataAccess().setIsForForeingKeyData(true);

					mesLogic.getTodosMessWithConnection(sFinalQuery,new Pagination());

					this.messForeignKey=mesLogic.getMess();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaMes(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					mesLogic.getEntityWithConnection(diaferiadoSessionBean.getlidMesActual());
					this.messForeignKey.add(mesLogic.getMes());
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

	public void cargarCombosAniosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.aniosForeignKey=new ArrayList<Anio>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			AnioLogic anioLogic=new AnioLogic();

			//anioLogic.getAnioDataAccess().setIsForForeingKeyData(true);

			if(this.diaferiadoSessionBean==null) {
				this.diaferiadoSessionBean=new DiaFeriadoSessionBean();
			}

			if(!this.diaferiadoSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//anioLogic.getAnioDataAccess().setIsForForeingKeyData(true);

					anioLogic.getTodosAniosWithConnection(sFinalQuery,new Pagination());

					this.aniosForeignKey=anioLogic.getAnios();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaAnio(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					anioLogic.getEntityWithConnection(diaferiadoSessionBean.getlidAnioActual());
					this.aniosForeignKey.add(anioLogic.getAnio());
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

					if(this.diaferiado!=null) {
						this.diaferiado.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormDiaFeriado!=null) {
						this.jInternalFrameDetalleFormDiaFeriado.jComboBoxid_empresaDiaFeriado.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaDiaFeriado.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormDiaFeriado!=null) {
						if(this.jInternalFrameDetalleFormDiaFeriado.jComboBoxid_empresaDiaFeriado.getItemCount()>0) {
							this.jInternalFrameDetalleFormDiaFeriado.jComboBoxid_empresaDiaFeriado.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaDiaFeriadoGenerico)throws Exception
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
				jComboBoxid_empresaDiaFeriadoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaDiaFeriadoGenerico!=null && jComboBoxid_empresaDiaFeriadoGenerico.getItemCount()>0) {
					jComboBoxid_empresaDiaFeriadoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualMesForeignKey(Long idMesSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Mes  mesTemp=null;

			for(Mes mesAux:messForeignKey) {
				if(mesAux.getId()!=null && mesAux.getId().equals(idMesSeleccionado)) {
					mesTemp=mesAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(mesTemp!=null) {

					if(this.diaferiado!=null) {
						this.diaferiado.setMes(mesTemp);
					}

					if(this.jInternalFrameDetalleFormDiaFeriado!=null) {
						this.jInternalFrameDetalleFormDiaFeriado.jComboBoxid_mesDiaFeriado.setSelectedItem(mesTemp);
					}
				} else {
					//jComboBoxid_mesDiaFeriado.setSelectedItem(mesTemp);
					if(this.jInternalFrameDetalleFormDiaFeriado!=null) {
						if(this.jInternalFrameDetalleFormDiaFeriado.jComboBoxid_mesDiaFeriado.getItemCount()>0) {
							this.jInternalFrameDetalleFormDiaFeriado.jComboBoxid_mesDiaFeriado.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdMes") || sFormularioTipoBusqueda.equals("Todos")){
					if(mesTemp!=null && jComboBoxid_mesFK_IdMesDiaFeriado!=null) {
						jComboBoxid_mesFK_IdMesDiaFeriado.setSelectedItem(mesTemp);
					} else {
						if(jComboBoxid_mesFK_IdMesDiaFeriado!=null) {
							//jComboBoxid_mesFK_IdMesDiaFeriado.setSelectedItem(mesTemp);
							if(jComboBoxid_mesFK_IdMesDiaFeriado.getItemCount()>0) {
								jComboBoxid_mesFK_IdMesDiaFeriado.setSelectedIndex(0);
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

	public String getActualMesForeignKeyDescripcion(Long idMesSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Mes  mesTemp=null;

			for(Mes mesAux:messForeignKey) {
				if(mesAux.getId()!=null && mesAux.getId().equals(idMesSeleccionado)) {
					mesTemp=mesAux;
					break;
				}
			}


			sDescripcion=MesConstantesFunciones.getMesDescripcion(mesTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualMesForeignKeyGenerico(Long idMesSeleccionado,JComboBox jComboBoxid_mesDiaFeriadoGenerico)throws Exception
	{
		try
		{
			Mes  mesTemp=null;

			for(Mes mesAux:messForeignKey) {
				if(mesAux.getId()!=null && mesAux.getId().equals(idMesSeleccionado)) {
					mesTemp=mesAux;
					break;
				}
			}

			if(mesTemp!=null) {
				jComboBoxid_mesDiaFeriadoGenerico.setSelectedItem(mesTemp);
			} else {
				if(jComboBoxid_mesDiaFeriadoGenerico!=null && jComboBoxid_mesDiaFeriadoGenerico.getItemCount()>0) {
					jComboBoxid_mesDiaFeriadoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualAnioForeignKey(Long idAnioSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Anio  anioTemp=null;

			for(Anio anioAux:aniosForeignKey) {
				if(anioAux.getId()!=null && anioAux.getId().equals(idAnioSeleccionado)) {
					anioTemp=anioAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(anioTemp!=null) {

					if(this.diaferiado!=null) {
						this.diaferiado.setAnio(anioTemp);
					}

					if(this.jInternalFrameDetalleFormDiaFeriado!=null) {
						this.jInternalFrameDetalleFormDiaFeriado.jComboBoxid_anioDiaFeriado.setSelectedItem(anioTemp);
					}
				} else {
					//jComboBoxid_anioDiaFeriado.setSelectedItem(anioTemp);
					if(this.jInternalFrameDetalleFormDiaFeriado!=null) {
						if(this.jInternalFrameDetalleFormDiaFeriado.jComboBoxid_anioDiaFeriado.getItemCount()>0) {
							this.jInternalFrameDetalleFormDiaFeriado.jComboBoxid_anioDiaFeriado.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdAnio") || sFormularioTipoBusqueda.equals("Todos")){
					if(anioTemp!=null && jComboBoxid_anioFK_IdAnioDiaFeriado!=null) {
						jComboBoxid_anioFK_IdAnioDiaFeriado.setSelectedItem(anioTemp);
					} else {
						if(jComboBoxid_anioFK_IdAnioDiaFeriado!=null) {
							//jComboBoxid_anioFK_IdAnioDiaFeriado.setSelectedItem(anioTemp);
							if(jComboBoxid_anioFK_IdAnioDiaFeriado.getItemCount()>0) {
								jComboBoxid_anioFK_IdAnioDiaFeriado.setSelectedIndex(0);
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

	public String getActualAnioForeignKeyDescripcion(Long idAnioSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Anio  anioTemp=null;

			for(Anio anioAux:aniosForeignKey) {
				if(anioAux.getId()!=null && anioAux.getId().equals(idAnioSeleccionado)) {
					anioTemp=anioAux;
					break;
				}
			}


			sDescripcion=AnioConstantesFunciones.getAnioDescripcion(anioTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualAnioForeignKeyGenerico(Long idAnioSeleccionado,JComboBox jComboBoxid_anioDiaFeriadoGenerico)throws Exception
	{
		try
		{
			Anio  anioTemp=null;

			for(Anio anioAux:aniosForeignKey) {
				if(anioAux.getId()!=null && anioAux.getId().equals(idAnioSeleccionado)) {
					anioTemp=anioAux;
					break;
				}
			}

			if(anioTemp!=null) {
				jComboBoxid_anioDiaFeriadoGenerico.setSelectedItem(anioTemp);
			} else {
				if(jComboBoxid_anioDiaFeriadoGenerico!=null && jComboBoxid_anioDiaFeriadoGenerico.getItemCount()>0) {
					jComboBoxid_anioDiaFeriadoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(DiaFeriado diaferiado,JComboBox jComboBoxid_empresaDiaFeriadoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaDiaFeriadoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormDiaFeriado.jComboBoxid_empresaDiaFeriado.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaDiaFeriadoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				diaferiado.setid_empresa(empresaAux.getId());
				diaferiado.setempresa_descripcion(DiaFeriadoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				diaferiado.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarMesForeignKey(DiaFeriado diaferiado,JComboBox jComboBoxid_mesDiaFeriadoGenerico)throws Exception
	{
		try
		{
			Mes  mesAux=new Mes();

			if(jComboBoxid_mesDiaFeriadoGenerico==null) {
				mesAux=(Mes)this.jInternalFrameDetalleFormDiaFeriado.jComboBoxid_mesDiaFeriado.getSelectedItem();
			} else {
				mesAux=(Mes)jComboBoxid_mesDiaFeriadoGenerico.getSelectedItem();
			}

			if(mesAux!=null) {
				diaferiado.setid_mes(mesAux.getId());
				diaferiado.setmes_descripcion(DiaFeriadoConstantesFunciones.getMesDescripcion(mesAux));
				diaferiado.setMes(mesAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarAnioForeignKey(DiaFeriado diaferiado,JComboBox jComboBoxid_anioDiaFeriadoGenerico)throws Exception
	{
		try
		{
			Anio  anioAux=new Anio();

			if(jComboBoxid_anioDiaFeriadoGenerico==null) {
				anioAux=(Anio)this.jInternalFrameDetalleFormDiaFeriado.jComboBoxid_anioDiaFeriado.getSelectedItem();
			} else {
				anioAux=(Anio)jComboBoxid_anioDiaFeriadoGenerico.getSelectedItem();
			}

			if(anioAux!=null) {
				diaferiado.setid_anio(anioAux.getId());
				diaferiado.setanio_descripcion(DiaFeriadoConstantesFunciones.getAnioDescripcion(anioAux));
				diaferiado.setAnio(anioAux);			}
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

					if(!DiaFeriadoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDiaFeriado!=null) { 
							this.jInternalFrameDetalleFormDiaFeriado.jComboBoxid_empresaDiaFeriado.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormDiaFeriado.jComboBoxid_empresaDiaFeriado.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDiaFeriado!=null) { 
					}

					if(!DiaFeriadoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameMessForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingMes=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DiaFeriadoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDiaFeriado!=null) { 
							this.jInternalFrameDetalleFormDiaFeriado.jComboBoxid_mesDiaFeriado.removeAllItems();

							for(Mes mes:this.messForeignKey) {
								this.jInternalFrameDetalleFormDiaFeriado.jComboBoxid_mesDiaFeriado.addItem(mes);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDiaFeriado!=null) { 
					}

					if(!DiaFeriadoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdMes") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DiaFeriadoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_mesFK_IdMesDiaFeriado.removeAllItems();

							for(Mes mes:this.messForeignKey) {
								this.jComboBoxid_mesFK_IdMesDiaFeriado.addItem(mes);
							}
						}

						if(!DiaFeriadoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameAniosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingAnio=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DiaFeriadoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDiaFeriado!=null) { 
							this.jInternalFrameDetalleFormDiaFeriado.jComboBoxid_anioDiaFeriado.removeAllItems();

							for(Anio anio:this.aniosForeignKey) {
								this.jInternalFrameDetalleFormDiaFeriado.jComboBoxid_anioDiaFeriado.addItem(anio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDiaFeriado!=null) { 
					}

					if(!DiaFeriadoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdAnio") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DiaFeriadoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_anioFK_IdAnioDiaFeriado.removeAllItems();

							for(Anio anio:this.aniosForeignKey) {
								this.jComboBoxid_anioFK_IdAnioDiaFeriado.addItem(anio);
							}
						}

						if(!DiaFeriadoJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormDiaFeriado!=null) {
							this.jInternalFrameDetalleFormDiaFeriado.jComboBoxid_empresaDiaFeriado.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormDiaFeriado!=null) {
							this.jInternalFrameDetalleFormDiaFeriado.jComboBoxid_empresaDiaFeriado.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameMesForeignKey(Mes mes,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDiaFeriado!=null) {
							this.jInternalFrameDetalleFormDiaFeriado.jComboBoxid_mesDiaFeriado.setSelectedItem(mes);
						}
					} else {
						if(this.jInternalFrameDetalleFormDiaFeriado!=null) {
							this.jInternalFrameDetalleFormDiaFeriado.jComboBoxid_mesDiaFeriado.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_mesFK_IdMesDiaFeriado.setSelectedItem(mes);
						} else {
							this.jComboBoxid_mesFK_IdMesDiaFeriado.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameAnioForeignKey(Anio anio,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDiaFeriado!=null) {
							this.jInternalFrameDetalleFormDiaFeriado.jComboBoxid_anioDiaFeriado.setSelectedItem(anio);
						}
					} else {
						if(this.jInternalFrameDetalleFormDiaFeriado!=null) {
							this.jInternalFrameDetalleFormDiaFeriado.jComboBoxid_anioDiaFeriado.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_anioFK_IdAnioDiaFeriado.setSelectedItem(anio);
						} else {
							this.jComboBoxid_anioFK_IdAnioDiaFeriado.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesDiaFeriado() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			DiaFeriadoConstantesFunciones.refrescarForeignKeysDescripcionesDiaFeriado(this.diaferiadoLogic.getDiaFeriados());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			DiaFeriadoConstantesFunciones.refrescarForeignKeysDescripcionesDiaFeriado(this.diaferiados);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Mes.class));
		classes.add(new Classe(Anio.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//diaferiadoLogic.setDiaFeriados(this.diaferiados);
			diaferiadoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public DiaFeriadoParameterReturnGeneral getDiaFeriadoParameterGeneral() {
		return this.diaferiadoParameterGeneral;
	}
	
	public void setDiaFeriadoParameterGeneral(DiaFeriadoParameterReturnGeneral diaferiadoParameterGeneral) {
		this.diaferiadoParameterGeneral = diaferiadoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoDiaFeriado() {
		return isPermisoTodoDiaFeriado;
	}

	public void setIsPermisoTodoDiaFeriado(Boolean isPermisoTodoDiaFeriado) {
		this.isPermisoTodoDiaFeriado = isPermisoTodoDiaFeriado;
	}

	public Boolean getIsPermisoNuevoDiaFeriado() {
		return isPermisoNuevoDiaFeriado;
	}

	public void setIsPermisoNuevoDiaFeriado(Boolean isPermisoNuevoDiaFeriado) {
		this.isPermisoNuevoDiaFeriado = isPermisoNuevoDiaFeriado;
	}

	public Boolean getIsPermisoActualizarDiaFeriado() {
		return isPermisoActualizarDiaFeriado;
	}

	public void setIsPermisoActualizarDiaFeriado(Boolean isPermisoActualizarDiaFeriado) {
		this.isPermisoActualizarDiaFeriado = isPermisoActualizarDiaFeriado;
	}

	public Boolean getIsPermisoEliminarDiaFeriado() {
		return isPermisoEliminarDiaFeriado;
	}

	public void setIsPermisoEliminarDiaFeriado(Boolean isPermisoEliminarDiaFeriado) {
		this.isPermisoEliminarDiaFeriado = isPermisoEliminarDiaFeriado;
	}

	public Boolean getIsPermisoGuardarCambiosDiaFeriado() {
		return isPermisoGuardarCambiosDiaFeriado;
	}

	public void setIsPermisoGuardarCambiosDiaFeriado(Boolean isPermisoGuardarCambiosDiaFeriado) {
		this.isPermisoGuardarCambiosDiaFeriado = isPermisoGuardarCambiosDiaFeriado;
	}
	
	public Boolean getIsPermisoConsultaDiaFeriado() {
		return isPermisoConsultaDiaFeriado;
	}

	public void setIsPermisoConsultaDiaFeriado(Boolean isPermisoConsultaDiaFeriado) {
		this.isPermisoConsultaDiaFeriado = isPermisoConsultaDiaFeriado;
	}

	public Boolean getIsPermisoBusquedaDiaFeriado() {
		return isPermisoBusquedaDiaFeriado;
	}

	public void setIsPermisoBusquedaDiaFeriado(Boolean isPermisoBusquedaDiaFeriado) {
		this.isPermisoBusquedaDiaFeriado = isPermisoBusquedaDiaFeriado;
	}

	public Boolean getIsPermisoReporteDiaFeriado() {
		return isPermisoReporteDiaFeriado;
	}

	public void setIsPermisoReporteDiaFeriado(Boolean isPermisoReporteDiaFeriado) {
		this.isPermisoReporteDiaFeriado = isPermisoReporteDiaFeriado;
	}
	
	public Boolean getIsPermisoPaginacionMedioDiaFeriado() {
		return isPermisoPaginacionMedioDiaFeriado;
	}

	public void setIsPermisoPaginacionMedioDiaFeriado(Boolean isPermisoPaginacionMedioDiaFeriado) {
		this.isPermisoPaginacionMedioDiaFeriado = isPermisoPaginacionMedioDiaFeriado;
	}
	
	public Boolean getIsPermisoPaginacionTodoDiaFeriado() {
		return isPermisoPaginacionTodoDiaFeriado;
	}

	public void setIsPermisoPaginacionTodoDiaFeriado(Boolean isPermisoPaginacionTodoDiaFeriado) {
		this.isPermisoPaginacionTodoDiaFeriado = isPermisoPaginacionTodoDiaFeriado;
	}
	
	public Boolean getIsPermisoPaginacionAltoDiaFeriado() {
		return isPermisoPaginacionAltoDiaFeriado;
	}

	public void setIsPermisoPaginacionAltoDiaFeriado(Boolean isPermisoPaginacionAltoDiaFeriado) {
		this.isPermisoPaginacionAltoDiaFeriado = isPermisoPaginacionAltoDiaFeriado;
	}
	
	public Boolean getIsPermisoCopiarDiaFeriado() {
		return isPermisoCopiarDiaFeriado;
	}

	public void setIsPermisoCopiarDiaFeriado(Boolean isPermisoCopiarDiaFeriado) {
		this.isPermisoCopiarDiaFeriado = isPermisoCopiarDiaFeriado;
	}
	
	public Boolean getIsPermisoVerFormDiaFeriado() {
		return isPermisoVerFormDiaFeriado;
	}

	public void setIsPermisoVerFormDiaFeriado(Boolean isPermisoVerFormDiaFeriado) {
		this.isPermisoVerFormDiaFeriado = isPermisoVerFormDiaFeriado;
	}
	
	public Boolean getIsPermisoDuplicarDiaFeriado() {
		return isPermisoDuplicarDiaFeriado;
	}

	public void setIsPermisoDuplicarDiaFeriado(Boolean isPermisoDuplicarDiaFeriado) {
		this.isPermisoDuplicarDiaFeriado = isPermisoDuplicarDiaFeriado;
	}
	
	public Boolean getIsPermisoOrdenDiaFeriado() {
		return isPermisoOrdenDiaFeriado;
	}

	public void setIsPermisoOrdenDiaFeriado(Boolean isPermisoOrdenDiaFeriado) {
		this.isPermisoOrdenDiaFeriado = isPermisoOrdenDiaFeriado;
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
	
	public Boolean getIsVisibilidadCeldaNuevoDiaFeriado() {
		return isVisibilidadCeldaNuevoDiaFeriado;
	}

	public void setIsVisibilidadCeldaNuevoDiaFeriado(Boolean isVisibilidadCeldaNuevoDiaFeriado) {
		this.isVisibilidadCeldaNuevoDiaFeriado = isVisibilidadCeldaNuevoDiaFeriado;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarDiaFeriado() {
		return isVisibilidadCeldaDuplicarDiaFeriado;
	}

	public void setIsVisibilidadCeldaDuplicarDiaFeriado(Boolean isVisibilidadCeldaDuplicarDiaFeriado) {
		this.isVisibilidadCeldaDuplicarDiaFeriado = isVisibilidadCeldaDuplicarDiaFeriado;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarDiaFeriado() {
		return isVisibilidadCeldaCopiarDiaFeriado;
	}

	public void setIsVisibilidadCeldaCopiarDiaFeriado(Boolean isVisibilidadCeldaCopiarDiaFeriado) {
		this.isVisibilidadCeldaCopiarDiaFeriado = isVisibilidadCeldaCopiarDiaFeriado;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormDiaFeriado() {
		return isVisibilidadCeldaVerFormDiaFeriado;
	}

	public void setIsVisibilidadCeldaVerFormDiaFeriado(Boolean isVisibilidadCeldaVerFormDiaFeriado) {
		this.isVisibilidadCeldaVerFormDiaFeriado = isVisibilidadCeldaVerFormDiaFeriado;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenDiaFeriado() {
		return isVisibilidadCeldaOrdenDiaFeriado;
	}

	public void setIsVisibilidadCeldaOrdenDiaFeriado(Boolean isVisibilidadCeldaOrdenDiaFeriado) {
		this.isVisibilidadCeldaOrdenDiaFeriado = isVisibilidadCeldaOrdenDiaFeriado;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesDiaFeriado() {
		return isVisibilidadCeldaNuevoRelacionesDiaFeriado;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesDiaFeriado(Boolean isVisibilidadCeldaNuevoRelacionesDiaFeriado) {
		this.isVisibilidadCeldaNuevoRelacionesDiaFeriado = isVisibilidadCeldaNuevoRelacionesDiaFeriado;
	}
	
	public Boolean getIsVisibilidadCeldaModificarDiaFeriado() {
		return isVisibilidadCeldaModificarDiaFeriado;
	}

	public void setIsVisibilidadCeldaModificarDiaFeriado(Boolean isVisibilidadCeldaModificarDiaFeriado) {
		this.isVisibilidadCeldaModificarDiaFeriado = isVisibilidadCeldaModificarDiaFeriado;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarDiaFeriado() {
		return isVisibilidadCeldaActualizarDiaFeriado;
	}

	public void setIsVisibilidadCeldaActualizarDiaFeriado(Boolean isVisibilidadCeldaActualizarDiaFeriado) {
		this.isVisibilidadCeldaActualizarDiaFeriado = isVisibilidadCeldaActualizarDiaFeriado;
	}

	public Boolean getIsVisibilidadCeldaEliminarDiaFeriado() {
		return isVisibilidadCeldaEliminarDiaFeriado;
	}

	public void setIsVisibilidadCeldaEliminarDiaFeriado(Boolean isVisibilidadCeldaEliminarDiaFeriado) {
		this.isVisibilidadCeldaEliminarDiaFeriado = isVisibilidadCeldaEliminarDiaFeriado;
	}

	public Boolean getIsVisibilidadCeldaCancelarDiaFeriado() {
		return isVisibilidadCeldaCancelarDiaFeriado;
	}

	public void setIsVisibilidadCeldaCancelarDiaFeriado(Boolean isVisibilidadCeldaCancelarDiaFeriado) {
		this.isVisibilidadCeldaCancelarDiaFeriado = isVisibilidadCeldaCancelarDiaFeriado;
	}

	public Boolean getIsVisibilidadCeldaGuardarDiaFeriado() {
		return isVisibilidadCeldaGuardarDiaFeriado;
	}

	public void setIsVisibilidadCeldaGuardarDiaFeriado(Boolean isVisibilidadCeldaGuardarDiaFeriado) {
		this.isVisibilidadCeldaGuardarDiaFeriado = isVisibilidadCeldaGuardarDiaFeriado;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosDiaFeriado() {
		return isVisibilidadCeldaGuardarCambiosDiaFeriado;
	}

	public void setIsVisibilidadCeldaGuardarCambiosDiaFeriado(Boolean isVisibilidadCeldaGuardarCambiosDiaFeriado) {
		this.isVisibilidadCeldaGuardarCambiosDiaFeriado = isVisibilidadCeldaGuardarCambiosDiaFeriado;
	}
		
	public DiaFeriadoSessionBean getdiaferiadoSessionBean() {
		return this.diaferiadoSessionBean;
	}
	
	public void setdiaferiadoSessionBean(DiaFeriadoSessionBean diaferiadoSessionBean) {
		this.diaferiadoSessionBean=diaferiadoSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdAnio() {
		return this.isVisibilidadFK_IdAnio;
	}

	public void setisVisibilidadFK_IdAnio(Boolean isVisibilidadFK_IdAnio) {
		this.isVisibilidadFK_IdAnio=isVisibilidadFK_IdAnio;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdMes() {
		return this.isVisibilidadFK_IdMes;
	}

	public void setisVisibilidadFK_IdMes(Boolean isVisibilidadFK_IdMes) {
		this.isVisibilidadFK_IdMes=isVisibilidadFK_IdMes;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysDiaFeriado(DiaFeriado diaferiado)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(diaferiado,null);
				this.setActualParaGuardarMesForeignKey(diaferiado,null);
				this.setActualParaGuardarAnioForeignKey(diaferiado,null);
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
	
	public void bugActualizarReferenciaActual(DiaFeriado diaferiado,DiaFeriado diaferiadoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalDiaFeriado(diaferiado);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		diaferiadoAux.setId(diaferiado.getId());
		diaferiadoAux.setVersionRow(diaferiado.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessDiaFeriado();
		
			int intSelectedRow = this.jTableDatosDiaFeriado.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diaferiado =(DiaFeriado) this.diaferiadoLogic.getDiaFeriados().toArray()[this.jTableDatosDiaFeriado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.diaferiado =(DiaFeriado) this.diaferiados.toArray()[this.jTableDatosDiaFeriado.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(DiaFeriadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualDiaFeriado(this.diaferiado,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysDiaFeriado(this.diaferiado);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = diaferiadoValidator.getInvalidValues(this.diaferiado);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			diaferiadoLogic.setDatosCliente(datosCliente);
			diaferiadoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				diaferiadoAux=new  DiaFeriado();
				
				diaferiadoAux.setIsNew(true);
				diaferiadoAux.setIsChanged(true);
				
				diaferiadoAux.setDiaFeriadoOriginal(this.diaferiado);
				
				diaferiadoAux.setId(this.diaferiado.getId());	
				diaferiadoAux.setVersionRow(this.diaferiado.getVersionRow());	
				diaferiadoAux.setid_empresa(this.diaferiado.getid_empresa());	
				diaferiadoAux.setnombre(this.diaferiado.getnombre());	
				diaferiadoAux.setfecha(this.diaferiado.getfecha());	
				diaferiadoAux.setdia(this.diaferiado.getdia());	
				diaferiadoAux.setid_mes(this.diaferiado.getid_mes());	
				diaferiadoAux.setid_anio(this.diaferiado.getid_anio());	
				diaferiadoAux.setdescripcion(this.diaferiado.getdescripcion());	
				diaferiadoAux.setesta_activo(this.diaferiado.getesta_activo());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.diaferiadoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.diaferiadoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(diaferiadoAux,diaferiadoLogic.getDiaFeriados());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(diaferiadoAux,diaferiados);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.diaferiadoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.diaferiadoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						diaferiadoLogic.saveDiaFeriados();//WithConnection
						//diaferiadoLogic.getSetVersionRowDiaFeriados();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.diaferiado,diaferiadoAux);
					
					this.refrescarForeignKeysDescripcionesDiaFeriado();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.diaferiadoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.diaferiadoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								diaferiadoLogic.saveDiaFeriadoRelaciones(diaferiadoAux);//WithConnection
								//diaferiadoLogic.getSetVersionRowDiaFeriados();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.diaferiado,diaferiadoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.diaferiadoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.diaferiadoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(diaferiadoAux,diaferiadoLogic.getDiaFeriados());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(diaferiadoAux,diaferiados);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.diaferiado,diaferiadoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				diaferiadoAux=new  DiaFeriado();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.diaferiadoSessionBean.getEsGuardarRelacionado() 
					|| (this.diaferiadoSessionBean.getEsGuardarRelacionado() && this.diaferiado.getId()>=0)) {
						
					diaferiadoAux.setIsNew(false);
				}
				
				diaferiadoAux.setIsDeleted(false);
			
				diaferiadoAux.setId(this.diaferiado.getId());	
				diaferiadoAux.setVersionRow(this.diaferiado.getVersionRow());	
				diaferiadoAux.setid_empresa(this.diaferiado.getid_empresa());	
				diaferiadoAux.setnombre(this.diaferiado.getnombre());	
				diaferiadoAux.setfecha(this.diaferiado.getfecha());	
				diaferiadoAux.setdia(this.diaferiado.getdia());	
				diaferiadoAux.setid_mes(this.diaferiado.getid_mes());	
				diaferiadoAux.setid_anio(this.diaferiado.getid_anio());	
				diaferiadoAux.setdescripcion(this.diaferiado.getdescripcion());	
				diaferiadoAux.setesta_activo(this.diaferiado.getesta_activo());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(diaferiadoAux,diaferiadoLogic.getDiaFeriados());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(diaferiadoAux,diaferiados);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.diaferiadoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.diaferiadoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						diaferiadoLogic.saveDiaFeriados();//WithConnection
						//diaferiadoLogic.getSetVersionRowDiaFeriados();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.diaferiado,diaferiadoAux);
					
					this.refrescarForeignKeysDescripcionesDiaFeriado();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.diaferiadoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.diaferiadoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								diaferiadoLogic.saveDiaFeriadoRelaciones(diaferiadoAux);//WithConnection
								//diaferiadoLogic.getSetVersionRowDiaFeriados();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.diaferiado,diaferiadoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.diaferiadoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.diaferiadoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(diaferiadoAux,diaferiadoLogic.getDiaFeriados());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(diaferiadoAux,diaferiados);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.diaferiado,diaferiadoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				diaferiadoAux=new  DiaFeriado();
				
				diaferiadoAux.setIsNew(false);
				diaferiadoAux.setIsChanged(false);
				
				diaferiadoAux.setIsDeleted(true);
				
				diaferiadoAux.setId(this.diaferiado.getId());	
				diaferiadoAux.setVersionRow(this.diaferiado.getVersionRow());	
				diaferiadoAux.setid_empresa(this.diaferiado.getid_empresa());	
				diaferiadoAux.setnombre(this.diaferiado.getnombre());	
				diaferiadoAux.setfecha(this.diaferiado.getfecha());	
				diaferiadoAux.setdia(this.diaferiado.getdia());	
				diaferiadoAux.setid_mes(this.diaferiado.getid_mes());	
				diaferiadoAux.setid_anio(this.diaferiado.getid_anio());	
				diaferiadoAux.setdescripcion(this.diaferiado.getdescripcion());	
				diaferiadoAux.setesta_activo(this.diaferiado.getesta_activo());	
				
				if(this.diaferiadoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.diaferiadoAux.getId()>=0) {	
						this.diaferiadosEliminados.add(diaferiadoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(diaferiadoAux,diaferiadoLogic.getDiaFeriados());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(diaferiadoAux,diaferiados);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.diaferiadoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.diaferiadoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						diaferiadoLogic.saveDiaFeriados();//WithConnection
						//diaferiadoLogic.getSetVersionRowDiaFeriados();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.diaferiadoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.diaferiadoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								diaferiadoLogic.saveDiaFeriadoRelaciones(diaferiadoAux);//WithConnection
								//diaferiadoLogic.getSetVersionRowDiaFeriados();//WithConnection
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
							if(this.diaferiadoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.diaferiadoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(diaferiadoAux,diaferiadoLogic.getDiaFeriados());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(diaferiadoAux,diaferiados);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diaferiadoLogic.getDiaFeriados().addAll(this.diaferiadosEliminados);
					
					diaferiadoLogic.saveDiaFeriados();//WithConnection
					//diaferiadoLogic.getSetVersionRowDiaFeriados();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesDiaFeriado();
				
				this.diaferiadosEliminados= new ArrayList<DiaFeriado>();		
			}
			
			if(this.diaferiadoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.diaferiadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Dia Feriado GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Dia Feriado",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.diaferiado=diaferiadoAux;
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
      		//this.finishProcessDiaFeriado();
      	}
		
	}	
	
	public void actualizarRelaciones(DiaFeriado diaferiadoLocal) throws Exception {
		
		if(this.diaferiadoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(DiaFeriado diaferiadoLocal) throws Exception {	
		if(this.diaferiadoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				diaferiadoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(MesDetalleFormJInternalFrame.class)) {
				MesBeanSwingJInternalFrame mesBeanSwingJInternalFrameLocal=(MesBeanSwingJInternalFrame) ((MesDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				mesBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoMes(mesBeanSwingJInternalFrameLocal.getmes(),true);
				mesBeanSwingJInternalFrameLocal.actualizarLista(mesBeanSwingJInternalFrameLocal.mes,this.messForeignKey);

				mesBeanSwingJInternalFrameLocal.actualizarRelaciones(mesBeanSwingJInternalFrameLocal.mes);

				diaferiadoLocal.setMes(mesBeanSwingJInternalFrameLocal.mes);

				this.addItemDefectoCombosForeignKeyMes();
				this.cargarCombosFrameMessForeignKey("Formulario");
				this.setActualMesForeignKey(mesBeanSwingJInternalFrameLocal.mes.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(AnioDetalleFormJInternalFrame.class)) {
				AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrameLocal=(AnioBeanSwingJInternalFrame) ((AnioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				anioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoAnio(anioBeanSwingJInternalFrameLocal.getanio(),true);
				anioBeanSwingJInternalFrameLocal.actualizarLista(anioBeanSwingJInternalFrameLocal.anio,this.aniosForeignKey);

				anioBeanSwingJInternalFrameLocal.actualizarRelaciones(anioBeanSwingJInternalFrameLocal.anio);

				diaferiadoLocal.setAnio(anioBeanSwingJInternalFrameLocal.anio);

				this.addItemDefectoCombosForeignKeyAnio();
				this.cargarCombosFrameAniosForeignKey("Formulario");
				this.setActualAnioForeignKey(anioBeanSwingJInternalFrameLocal.anio.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarDiaFeriadoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosDiaFeriado.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.diaferiado =(DiaFeriado) this.diaferiadoLogic.getDiaFeriados().toArray()[this.jTableDatosDiaFeriado.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.diaferiado =(DiaFeriado) this.diaferiados.toArray()[this.jTableDatosDiaFeriado.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = diaferiadoValidator.getInvalidValues(this.diaferiado);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(DiaFeriado diaferiado,List<DiaFeriado> diaferiados) throws Exception {
		try	{		
			DiaFeriadoConstantesFunciones.actualizarLista(diaferiado,diaferiados,this.diaferiadoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(DiaFeriado diaferiado,List<DiaFeriado> diaferiados) throws Exception {
		try	{			
			DiaFeriadoConstantesFunciones.actualizarSelectedLista(diaferiado,diaferiados);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<DiaFeriado> diaferiadosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				diaferiadosLocal=this.diaferiadoLogic.getDiaFeriados();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				diaferiadosLocal=this.diaferiados;
			}
			//ARCHITECTURE
		
			for(DiaFeriado diaferiadoLocal:diaferiadosLocal) {
				if(this.permiteMantenimiento(diaferiadoLocal) && diaferiadoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+DiaFeriadoConstantesFunciones.getDiaFeriadoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(DiaFeriadoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDiaFeriado.jLabelid_empresaDiaFeriado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DiaFeriadoConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDiaFeriado.jLabelnombreDiaFeriado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DiaFeriadoConstantesFunciones.FECHA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDiaFeriado.jLabelfechaDiaFeriado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DiaFeriadoConstantesFunciones.DIA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDiaFeriado.jLabeldiaDiaFeriado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DiaFeriadoConstantesFunciones.IDMES)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDiaFeriado.jLabelid_mesDiaFeriado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DiaFeriadoConstantesFunciones.IDANIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDiaFeriado.jLabelid_anioDiaFeriado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DiaFeriadoConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDiaFeriado.jLabeldescripcionDiaFeriado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DiaFeriadoConstantesFunciones.ESTAACTIVO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDiaFeriado.jLabelesta_activoDiaFeriado,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormDiaFeriado!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDiaFeriado.jLabelid_empresaDiaFeriado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDiaFeriado.jLabelnombreDiaFeriado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDiaFeriado.jLabelfechaDiaFeriado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDiaFeriado.jLabeldiaDiaFeriado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDiaFeriado.jLabelid_mesDiaFeriado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDiaFeriado.jLabelid_anioDiaFeriado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDiaFeriado.jLabeldescripcionDiaFeriado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDiaFeriado.jLabelesta_activoDiaFeriado,"");
		
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
		this.iIdNuevoDiaFeriado--;	
		
		
		this.diaferiadoAux=new DiaFeriado();
		
		this.diaferiadoAux.setId(this.iIdNuevoDiaFeriado);
		this.diaferiadoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.diaferiadoLogic.getDiaFeriados().add(this.diaferiadoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.diaferiados.add(this.diaferiadoAux);
		}
		//ARCHITECTURE
		
		this.diaferiado=this.diaferiadoAux;
		
		if(DiaFeriadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioDiaFeriado(this.diaferiado);
			this.setVariablesObjetoActualToFormularioForeignKeyDiaFeriado(this.diaferiado);
		}
				
		//this.setDefaultControlesDiaFeriado();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyDiaFeriado();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyDiaFeriado();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyDiaFeriado();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualDiaFeriado(this.diaferiadoBean,this.diaferiado,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysDiaFeriado(this.diaferiado);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(DiaFeriadoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.diaferiadoSessionBean.getConGuardarRelaciones()) {
			classes=DiaFeriadoConstantesFunciones.getClassesRelationshipsOfDiaFeriado(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.diaferiadoReturnGeneral=diaferiadoLogic.procesarEventosDiaFeriadosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.diaferiadoLogic.getDiaFeriados(),this.diaferiado,this.diaferiadoParameterGeneral,this.isEsNuevoDiaFeriado,classes);//this.diaferiadoLogic.getDiaFeriado()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanDiaFeriado(this.diaferiadoReturnGeneral,this.diaferiadoBean,false);
		
		if(this.diaferiadoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyDiaFeriado(this.diaferiadoReturnGeneral.getDiaFeriado());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioDiaFeriado(this.diaferiadoReturnGeneral.getDiaFeriado());
		}
		
		if(this.diaferiadoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioDiaFeriado(this.diaferiadoReturnGeneral.getDiaFeriado(),classes);//this.diaferiadoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualDiaFeriado(this.diaferiado,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyDiaFeriado();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyDiaFeriado();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			DiaFeriadoBeanSwingJInternalFrameAdditional.RecargarFormDiaFeriado(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingDiaFeriado(false);
						
			if(diaferiadoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(DiaFeriadoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDiaFeriado();
			}
			
			this.actualizarVisualTableDatosDiaFeriado();
			
			this.jTableDatosDiaFeriado.setRowSelectionInterval(this.getIndiceNuevoDiaFeriado(), this.getIndiceNuevoDiaFeriado());
			
			this.seleccionarFilaTablaDiaFeriadoActual();
						
			this.actualizarEstadoCeldasBotonesDiaFeriado("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesDiaFeriado(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormDiaFeriado.jTextFieldnombreDiaFeriado.setEnabled(isHabilitar && this.diaferiadoConstantesFunciones.activarnombreDiaFeriado);
		this.jInternalFrameDetalleFormDiaFeriado.jDateChooserfechaDiaFeriado.setEnabled(isHabilitar && this.diaferiadoConstantesFunciones.activarfechaDiaFeriado);
		this.jInternalFrameDetalleFormDiaFeriado.jTextFielddiaDiaFeriado.setEnabled(isHabilitar && this.diaferiadoConstantesFunciones.activardiaDiaFeriado);
		this.jInternalFrameDetalleFormDiaFeriado.jTextAreadescripcionDiaFeriado.setEnabled(isHabilitar && this.diaferiadoConstantesFunciones.activardescripcionDiaFeriado);
		this.jInternalFrameDetalleFormDiaFeriado.jCheckBoxesta_activoDiaFeriado.setEnabled(isHabilitar && this.diaferiadoConstantesFunciones.activaresta_activoDiaFeriado);	
		//
		this.jInternalFrameDetalleFormDiaFeriado.jComboBoxid_empresaDiaFeriado.setEnabled(isHabilitar && this.diaferiadoConstantesFunciones.activarid_empresaDiaFeriado);
		this.jInternalFrameDetalleFormDiaFeriado.jComboBoxid_mesDiaFeriado.setEnabled(isHabilitar && this.diaferiadoConstantesFunciones.activarid_mesDiaFeriado);
		this.jInternalFrameDetalleFormDiaFeriado.jComboBoxid_anioDiaFeriado.setEnabled(isHabilitar && this.diaferiadoConstantesFunciones.activarid_anioDiaFeriado);
	};
	
	public void setDefaultControlesDiaFeriado() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoDiaFeriado(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.diaferiadoSessionBean.setConGuardarRelaciones(true);			
			this.diaferiadoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormDiaFeriado.jTabbedPaneRelacionesDiaFeriado.setVisible(true);
			
					
		} else {
			//this.diaferiadoSessionBean.setConGuardarRelaciones(false);			
			this.diaferiadoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormDiaFeriado.jTabbedPaneRelacionesDiaFeriado.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoDiaFeriado() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DiaFeriado diaferiadoAux:this.diaferiadoLogic.getDiaFeriados()) {
				if(diaferiadoAux.getId().equals(this.iIdNuevoDiaFeriado)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DiaFeriado diaferiadoAux:this.diaferiados) {
				if(diaferiadoAux.getId().equals(this.iIdNuevoDiaFeriado)) {
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
	
	public int getIndiceActualDiaFeriado(DiaFeriado diaferiado,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DiaFeriado diaferiadoAux:this.diaferiadoLogic.getDiaFeriados()) {
				if(diaferiadoAux.getId().equals(diaferiado.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DiaFeriado diaferiadoAux:this.diaferiados) {
				if(diaferiadoAux.getId().equals(diaferiado.getId())) {
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
	
	public void setCamposBaseDesdeOriginalDiaFeriado(DiaFeriado diaferiadoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DiaFeriado diaferiadoAux:this.diaferiadoLogic.getDiaFeriados()) {
				if(diaferiadoAux.getDiaFeriadoOriginal().getId().equals(diaferiadoOriginal.getId())) {
					existe=true;
					diaferiadoOriginal.setId(diaferiadoAux.getId());
					diaferiadoOriginal.setVersionRow(diaferiadoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DiaFeriado diaferiadoAux:this.diaferiados) {
				if(diaferiadoAux.getDiaFeriadoOriginal().getId().equals(diaferiadoOriginal.getId())) {
					existe=true;
					diaferiadoOriginal.setId(diaferiadoAux.getId());
					diaferiadoOriginal.setVersionRow(diaferiadoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosDiaFeriado(Boolean esParaCancelar) throws Exception {
		diaferiadosAux=new ArrayList<DiaFeriado>();
		diaferiadoAux=new DiaFeriado();
		
		if(!this.diaferiadoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(DiaFeriado diaferiadoAux:this.diaferiadoLogic.getDiaFeriados()) {
					if(diaferiadoAux.getId()<0) {
						diaferiadosAux.add(diaferiadoAux);
					}		
				}
				this.iIdNuevoDiaFeriado=0L;
				this.diaferiadoLogic.getDiaFeriados().removeAll(diaferiadosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DiaFeriado diaferiadoAux:this.diaferiados) {
					if(diaferiadoAux.getId()<0) {
						diaferiadosAux.add(diaferiadoAux);
					}		
				}
				this.iIdNuevoDiaFeriado=0L;
				this.diaferiados.removeAll(diaferiadosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoDiaFeriado 
					&& this.diaferiadoLogic.getDiaFeriados().size()>0
					) {
					diaferiadoAux=this.diaferiadoLogic.getDiaFeriados().get(this.diaferiadoLogic.getDiaFeriados().size() - 1);
				
					if(diaferiadoAux.getId()<0) {
						this.diaferiadoLogic.getDiaFeriados().remove(diaferiadoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoDiaFeriado && this.diaferiados.size()>0) {
					diaferiadoAux=this.diaferiados.get(this.diaferiados.size() - 1);
				
					if(diaferiadoAux.getId()<0) {
						this.diaferiados.remove(diaferiadoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoDiaFeriado(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(diaferiado.getId()<0) {
				this.diaferiadoLogic.getDiaFeriados().remove(this.diaferiado);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(diaferiado.getId()<0) {
				this.diaferiados.remove(this.diaferiado);
			}
		}			
	}
	
	public void setEstadosInicialesDiaFeriado(List<DiaFeriado> diaferiadosAux) throws Exception {
		DiaFeriadoConstantesFunciones.setEstadosInicialesDiaFeriado(diaferiadosAux);
	}
	
	public void setEstadosInicialesDiaFeriado(DiaFeriado diaferiadoAux) throws Exception {
		DiaFeriadoConstantesFunciones.setEstadosInicialesDiaFeriado(diaferiadoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarDiaFeriadoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesDiaFeriado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarDiaFeriadoActual()) {
				if(!this.isEsNuevoDiaFeriado) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesDiaFeriado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoDiaFeriado=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarDiaFeriadoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Dia Feriado ?", "MANTENIMIENTO DE Dia Feriado", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesDiaFeriado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(DiaFeriado diaferiado) throws Exception {
		DiaFeriadoConstantesFunciones.seleccionarAsignar(this.diaferiado,diaferiado);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarDiaFeriado=this.isPermisoActualizarOriginalDiaFeriado;
			
			
			this.seleccionarAsignar(diaferiado);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			DiaFeriadoConstantesFunciones.quitarEspaciosDiaFeriado(this.diaferiado,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesDiaFeriado("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.diaferiadoSessionBean.setsFuncionBusquedaRapida(this.diaferiadoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoDiaFeriado) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosDiaFeriado(esParaCancelar);				
				this.cancelarNuevoDiaFeriado(esParaCancelar);								
			}
			
			this.diaferiado=new DiaFeriado();
			
			this.inicializarDiaFeriado();
			
			this.actualizarEstadoCeldasBotonesDiaFeriado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarDiaFeriado() throws Exception {
		try {
			DiaFeriadoConstantesFunciones.inicializarDiaFeriado(this.diaferiado);
			
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
			FuncionesSwing.manageException(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.diaferiadoLogic.getDiaFeriados().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteDiaFeriados(String sAccionBusqueda,List<DiaFeriado> diaferiadosParaReportes) throws Exception {
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
					sPathReporteFinal="DiaFeriado"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="DiaFeriadoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("DiaFeriadoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="DiaFeriado"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Dia Feriados");		
		parameters.put("busquedapor", DiaFeriadoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceDiaFeriado=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			DiaFeriadoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			DiaFeriadoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceDiaFeriado=new JRBeanArrayDataSource(DiaFeriadoJInternalFrame.TraerDiaFeriadoBeans(diaferiadosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceDiaFeriado);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+DiaFeriadoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+DiaFeriadoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(DiaFeriadoBean.TraerDiaFeriadoBeans(diaferiadosParaReportes).toArray()));
							
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
				this.generarExcelReporteDiaFeriados(sAccionBusqueda,sTipoArchivoReporte,diaferiadosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalDiaFeriados(sAccionBusqueda,sTipoArchivoReporte,diaferiadosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoDiaFeriadoActionPerformed(null);
					//this.generarExcelReporteDiaFeriados(sAccionBusqueda,sTipoArchivoReporte,diaferiadosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalDiaFeriados(sAccionBusqueda,sTipoArchivoReporte,diaferiadosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesDiaFeriados(sAccionBusqueda,sTipoArchivoReporte,diaferiadosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesDiaFeriados(sAccionBusqueda,sTipoArchivoReporte,diaferiadosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteDiaFeriados(String sAccionBusqueda,String sTipoArchivoReporte,List<DiaFeriado> diaferiadosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"diaferiado";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DiaFeriados");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderDiaFeriado("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(DiaFeriado diaferiado : diaferiadosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			DiaFeriadoConstantesFunciones.generarExcelReporteDataDiaFeriado("NORMAL",row,workbook,diaferiado,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.diaferiadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Dia Feriado",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderDiaFeriado(String sTipo,Row row,Workbook workbook) {
		
		DiaFeriadoConstantesFunciones.generarExcelReporteHeaderDiaFeriado(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalDiaFeriados(String sAccionBusqueda,String sTipoArchivoReporte,List<DiaFeriado> diaferiadosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"diaferiado_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DiaFeriados");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(DiaFeriado diaferiado : diaferiadosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(DiaFeriadoConstantesFunciones.getDiaFeriadoDescripcion(diaferiado));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DiaFeriadoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DiaFeriadoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(diaferiado.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DiaFeriadoConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DiaFeriadoConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(diaferiado.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DiaFeriadoConstantesFunciones.LABEL_FECHA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DiaFeriadoConstantesFunciones.LABEL_FECHA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(diaferiado.getfecha());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DiaFeriadoConstantesFunciones.LABEL_DIA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DiaFeriadoConstantesFunciones.LABEL_DIA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(diaferiado.getdia());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DiaFeriadoConstantesFunciones.LABEL_IDMES))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DiaFeriadoConstantesFunciones.LABEL_IDMES);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(diaferiado.getmes_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DiaFeriadoConstantesFunciones.LABEL_IDANIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DiaFeriadoConstantesFunciones.LABEL_IDANIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(diaferiado.getanio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DiaFeriadoConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DiaFeriadoConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(diaferiado.getdescripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DiaFeriadoConstantesFunciones.LABEL_ESTAACTIVO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DiaFeriadoConstantesFunciones.LABEL_ESTAACTIVO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(diaferiado.getesta_activo()));


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.diaferiadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Dia Feriado",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesDiaFeriados(String sAccionBusqueda,String sTipoArchivoReporte,List<DiaFeriado> diaferiadosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<DiaFeriado> diaferiadosRespaldo=null;
		
		classes=DiaFeriadoConstantesFunciones.getClassesRelationshipsOfDiaFeriado(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.diaferiadoLogic.setDatosCliente(this.datosCliente);
		this.diaferiadoLogic.setDatosDeep(this.datosDeep);
		this.diaferiadoLogic.setIsConDeep(true);
		
		diaferiadosRespaldo=this.diaferiadoLogic.getDiaFeriados();
		
		this.diaferiadoLogic.setDiaFeriados(diaferiadosParaReportes);	
		this.diaferiadoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		diaferiadosParaReportes=this.diaferiadoLogic.getDiaFeriados();
		this.diaferiadoLogic.setDiaFeriados(diaferiadosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"diaferiado_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DiaFeriados");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderDiaFeriado("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(DiaFeriado diaferiado : diaferiadosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderDiaFeriado("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			DiaFeriadoConstantesFunciones.generarExcelReporteDataDiaFeriado("NORMAL",row,workbook,diaferiado,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(DiaFeriadoConstantesFunciones.getDiaFeriadoDescripcion(diaferiado));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.diaferiadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Dia Feriado",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoDiaFeriado.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDiaFeriado.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoDiaFeriado.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDiaFeriado.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessDiaFeriado() throws Exception {		
		this.startProcessDiaFeriado(true);
	}
	
	public void startProcessDiaFeriado(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasDiaFeriado ,this.jPanelParametrosReportesDiaFeriado, this.jScrollPanelDatosDiaFeriado,this.jPanelPaginacionDiaFeriado, this.jScrollPanelDatosEdicionDiaFeriado, this.jPanelAccionesDiaFeriado,this.jPanelAccionesFormularioDiaFeriado,this.jmenuBarDiaFeriado,this.jmenuBarDetalleDiaFeriado,this.jTtoolBarDiaFeriado,this.jTtoolBarDetalleDiaFeriado);		
		
		final JTabbedPane jTabbedPaneBusquedasDiaFeriado=this.jTabbedPaneBusquedasDiaFeriado; 
		
		final JPanel jPanelParametrosReportesDiaFeriado=this.jPanelParametrosReportesDiaFeriado;
		//final JScrollPane jScrollPanelDatosDiaFeriado=this.jScrollPanelDatosDiaFeriado;
		final JTable jTableDatosDiaFeriado=this.jTableDatosDiaFeriado;		
		final JPanel jPanelPaginacionDiaFeriado=this.jPanelPaginacionDiaFeriado;
		//final JScrollPane jScrollPanelDatosEdicionDiaFeriado=this.jScrollPanelDatosEdicionDiaFeriado;
		final JPanel jPanelAccionesDiaFeriado=this.jPanelAccionesDiaFeriado;
		
		JPanel jPanelCamposAuxiliarDiaFeriado=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarDiaFeriado=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormDiaFeriado!=null) {
			jPanelCamposAuxiliarDiaFeriado=this.jInternalFrameDetalleFormDiaFeriado.jPanelCamposDiaFeriado;
			jPanelAccionesFormularioAuxiliarDiaFeriado=this.jInternalFrameDetalleFormDiaFeriado.jPanelAccionesFormularioDiaFeriado;
		}
		
		final JPanel jPanelCamposDiaFeriado=jPanelCamposAuxiliarDiaFeriado;
		final JPanel jPanelAccionesFormularioDiaFeriado=jPanelAccionesFormularioAuxiliarDiaFeriado;
		
		
		final JMenuBar jmenuBarDiaFeriado=this.jmenuBarDiaFeriado;
		final JToolBar jTtoolBarDiaFeriado=this.jTtoolBarDiaFeriado;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarDiaFeriado=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarDiaFeriado=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormDiaFeriado!=null) {
			jmenuBarDetalleAuxiliarDiaFeriado=this.jInternalFrameDetalleFormDiaFeriado.jmenuBarDetalleDiaFeriado;
			jTtoolBarDetalleAuxiliarDiaFeriado=this.jInternalFrameDetalleFormDiaFeriado.jTtoolBarDetalleDiaFeriado;
		}
		
		final JMenuBar jmenuBarDetalleDiaFeriado=jmenuBarDetalleAuxiliarDiaFeriado;
		final JToolBar jTtoolBarDetalleDiaFeriado=jTtoolBarDetalleAuxiliarDiaFeriado;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasDiaFeriado;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesDiaFeriado;
			processRunnable.jTableDatos=jTableDatosDiaFeriado;
			processRunnable.jPanelCampos=jPanelCamposDiaFeriado;
			processRunnable.jPanelPaginacion=jPanelPaginacionDiaFeriado;
			processRunnable.jPanelAcciones=jPanelAccionesDiaFeriado;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioDiaFeriado;
			
			
			processRunnable.jmenuBar=jmenuBarDiaFeriado;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleDiaFeriado;
			processRunnable.jTtoolBar=jTtoolBarDiaFeriado;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleDiaFeriado;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasDiaFeriado ,jPanelParametrosReportesDiaFeriado,jTableDatosDiaFeriado, /*jScrollPanelDatosDiaFeriado,*/jPanelCamposDiaFeriado,jPanelPaginacionDiaFeriado, /*jScrollPanelDatosEdicionDiaFeriado,*/ jPanelAccionesDiaFeriado,jPanelAccionesFormularioDiaFeriado,jmenuBarDiaFeriado,jmenuBarDetalleDiaFeriado,jTtoolBarDiaFeriado,jTtoolBarDetalleDiaFeriado);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasDiaFeriado ,jPanelParametrosReportesDiaFeriado, jScrollPanelDatosDiaFeriado,jPanelPaginacionDiaFeriado, jScrollPanelDatosEdicionDiaFeriado, jPanelAccionesDiaFeriado,jPanelAccionesFormularioDiaFeriado,jmenuBarDiaFeriado,jmenuBarDetalleDiaFeriado,jTtoolBarDiaFeriado,jTtoolBarDetalleDiaFeriado);
						
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
	
	public void finishProcessDiaFeriado() {// throws Exception 
		this.finishProcessDiaFeriado(true);
	}
	
	public void finishProcessDiaFeriado(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasDiaFeriado ,this.jPanelParametrosReportesDiaFeriado, this.jScrollPanelDatosDiaFeriado,this.jPanelPaginacionDiaFeriado, this.jScrollPanelDatosEdicionDiaFeriado, this.jPanelAccionesDiaFeriado,this.jPanelAccionesFormularioDiaFeriado,this.jmenuBarDiaFeriado,this.jmenuBarDetalleDiaFeriado,this.jTtoolBarDiaFeriado,this.jTtoolBarDetalleDiaFeriado);		
		
		final JTabbedPane jTabbedPaneBusquedasDiaFeriado=this.jTabbedPaneBusquedasDiaFeriado; 
		
		final JPanel jPanelParametrosReportesDiaFeriado=this.jPanelParametrosReportesDiaFeriado;
		//final JScrollPane jScrollPanelDatosDiaFeriado=this.jScrollPanelDatosDiaFeriado;
		final JTable jTableDatosDiaFeriado=this.jTableDatosDiaFeriado;		
		final JPanel jPanelPaginacionDiaFeriado=this.jPanelPaginacionDiaFeriado;
		//final JScrollPane jScrollPanelDatosEdicionDiaFeriado=this.jScrollPanelDatosEdicionDiaFeriado;
		final JPanel jPanelAccionesDiaFeriado=this.jPanelAccionesDiaFeriado;
		
		JPanel jPanelCamposAuxiliarDiaFeriado=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarDiaFeriado=new JPanel();
		
		if(this.jInternalFrameDetalleFormDiaFeriado!=null) {
			jPanelCamposAuxiliarDiaFeriado=this.jInternalFrameDetalleFormDiaFeriado.jPanelCamposDiaFeriado;
			jPanelAccionesFormularioAuxiliarDiaFeriado=this.jInternalFrameDetalleFormDiaFeriado.jPanelAccionesFormularioDiaFeriado;
		}
		
		final JPanel jPanelCamposDiaFeriado=jPanelCamposAuxiliarDiaFeriado;
		final JPanel jPanelAccionesFormularioDiaFeriado=jPanelAccionesFormularioAuxiliarDiaFeriado;
		
		
		final JMenuBar jmenuBarDiaFeriado=this.jmenuBarDiaFeriado;		
		final JToolBar jTtoolBarDiaFeriado=this.jTtoolBarDiaFeriado;
				
		JMenuBar jmenuBarDetalleAuxiliarDiaFeriado=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarDiaFeriado=new JToolBar();
		
		if(this.jInternalFrameDetalleFormDiaFeriado!=null) {
			jmenuBarDetalleAuxiliarDiaFeriado=this.jInternalFrameDetalleFormDiaFeriado.jmenuBarDetalleDiaFeriado;
			jTtoolBarDetalleAuxiliarDiaFeriado=this.jInternalFrameDetalleFormDiaFeriado.jTtoolBarDetalleDiaFeriado;		
		}
		
		final JMenuBar jmenuBarDetalleDiaFeriado=jmenuBarDetalleAuxiliarDiaFeriado;
		final JToolBar jTtoolBarDetalleDiaFeriado=jTtoolBarDetalleAuxiliarDiaFeriado;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasDiaFeriado;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesDiaFeriado;
			processRunnable.jTableDatos=jTableDatosDiaFeriado;
			processRunnable.jPanelCampos=jPanelCamposDiaFeriado;
			processRunnable.jPanelPaginacion=jPanelPaginacionDiaFeriado;
			processRunnable.jPanelAcciones=jPanelAccionesDiaFeriado;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioDiaFeriado;
			
			
			processRunnable.jmenuBar=jmenuBarDiaFeriado;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleDiaFeriado;
			processRunnable.jTtoolBar=jTtoolBarDiaFeriado;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleDiaFeriado;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasDiaFeriado ,jPanelParametrosReportesDiaFeriado, jTableDatosDiaFeriado,/*jScrollPanelDatosDiaFeriado,*/jPanelCamposDiaFeriado,jPanelPaginacionDiaFeriado, /*jScrollPanelDatosEdicionDiaFeriado,*/ jPanelAccionesDiaFeriado,jPanelAccionesFormularioDiaFeriado,jmenuBarDiaFeriado,jmenuBarDetalleDiaFeriado,jTtoolBarDiaFeriado,jTtoolBarDetalleDiaFeriado));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesDiaFeriado(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarDiaFeriado(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuDiaFeriado(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarDiaFeriado(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarDiaFeriado,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleDiaFeriado,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuDiaFeriado(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarDiaFeriado,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleDiaFeriado,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.diaferiadoConstantesFunciones.getsFinalQueryDiaFeriado();
		String  finalQueryPaginacionTodos=this.diaferiadoConstantesFunciones.getsFinalQueryDiaFeriado();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=DiaFeriadoConstantesFunciones.getArrayColumnasGlobalesNoDiaFeriado(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=DiaFeriadoConstantesFunciones.getArrayColumnasGlobalesDiaFeriado(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,DiaFeriadoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.diaferiadosEliminados= new ArrayList<DiaFeriado>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessDiaFeriado();
		
				///*DiaFeriadoSessionBean*/this.diaferiadoSessionBean=new DiaFeriadoSessionBean();
			
			if(this.diaferiadoSessionBean==null) {
				this.diaferiadoSessionBean=new DiaFeriadoSessionBean();
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
					this.iNumeroPaginacion=DiaFeriadoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=DiaFeriadoConstantesFunciones.getClassesForeignKeysOfDiaFeriado(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/diaferiado."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			diaferiadosAux= new ArrayList<DiaFeriado>();
			
				
			diaferiadoLogic.setDatosCliente(this.datosCliente);
			diaferiadoLogic.setDatosDeep(this.datosDeep);
			diaferiadoLogic.setIsConDeep(true);
			
			
			diaferiadoLogic.getDiaFeriadoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					diaferiadoLogic.getTodosDiaFeriados(finalQueryGlobal,pagination);
					
					//diaferiadoLogic.getTodosDiaFeriadosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(diaferiadoLogic.getDiaFeriados()==null|| diaferiadoLogic.getDiaFeriados().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							diaferiadosAux= new ArrayList<DiaFeriado>();
							diaferiadosAux.addAll(diaferiadoLogic.getDiaFeriados());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							diaferiadosAux= new ArrayList<DiaFeriado>();
							diaferiadosAux.addAll(diaferiados);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							diaferiadoLogic.getTodosDiaFeriados(finalQueryGlobal+"",this.pagination);												
							
							//diaferiadoLogic.getTodosDiaFeriadosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteDiaFeriados("Todos",diaferiadoLogic.getDiaFeriados() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							diaferiadoLogic.setDiaFeriados(new ArrayList<DiaFeriado>());					
							diaferiadoLogic.getDiaFeriados().addAll(diaferiadosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							diaferiados=new ArrayList<DiaFeriado>();
							diaferiados.addAll(diaferiadosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idDiaFeriado=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idDiaFeriado=this.idActual;
				
				} else if(this.idDiaFeriadoActual!=null && this.idDiaFeriadoActual!=0L) {
					idDiaFeriado=idDiaFeriadoActual;
				}
				
					
				this.sDetalleReporte=DiaFeriadoConstantesFunciones.getDetalleIndicePorId(idDiaFeriado);
				
				this.diaferiados=new ArrayList<DiaFeriado>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					diaferiadoLogic.getEntity(idDiaFeriado);
					
					//diaferiadoLogic.getEntityWithConnection(idDiaFeriado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					diaferiadoLogic.setDiaFeriados(new ArrayList<DiaFeriado>());
					diaferiadoLogic.getDiaFeriados().add(diaferiadoLogic.getDiaFeriado());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.diaferiados=new ArrayList<DiaFeriado>();
					this.diaferiados.add(diaferiado);
				}
				
				if(diaferiadoLogic.getDiaFeriado()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdAnio")) {
				this.sDetalleReporte=DiaFeriadoConstantesFunciones.getDetalleIndiceFK_IdAnio(id_anioFK_IdAnio);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					diaferiadoLogic.getDiaFeriadosFK_IdAnio(finalQueryGlobal,pagination,id_anioFK_IdAnio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DiaFeriadoConstantesFunciones.getDetalleIndiceFK_IdAnio(id_anioFK_IdAnio);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DiaFeriadoConstantesFunciones.getDetalleIndiceFK_IdAnio(id_anioFK_IdAnio);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=diaferiadoLogic.getDiaFeriados()==null||diaferiadoLogic.getDiaFeriados().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=diaferiados==null|| diaferiados.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						diaferiadosAux=new ArrayList<DiaFeriado>();
						diaferiadosAux.addAll(diaferiadoLogic.getDiaFeriados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							diaferiadosAux=new ArrayList<DiaFeriado>();
							diaferiadosAux.addAll(diaferiados);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							diaferiadoLogic.getDiaFeriadosFK_IdAnio(finalQueryGlobal,pagination,id_anioFK_IdAnio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DiaFeriadoConstantesFunciones.getDetalleIndiceFK_IdAnio(id_anioFK_IdAnio);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DiaFeriadoConstantesFunciones.getDetalleIndiceFK_IdAnio(id_anioFK_IdAnio);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDiaFeriados("FK_IdAnio",diaferiadoLogic.getDiaFeriados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDiaFeriados("FK_IdAnio",diaferiados);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						diaferiadoLogic.setDiaFeriados(new ArrayList<DiaFeriado>());
						diaferiadoLogic.getDiaFeriados().addAll(diaferiadosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							diaferiados=new ArrayList<DiaFeriado>();
							diaferiados.addAll(diaferiadosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=DiaFeriadoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					diaferiadoLogic.getDiaFeriadosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DiaFeriadoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DiaFeriadoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=diaferiadoLogic.getDiaFeriados()==null||diaferiadoLogic.getDiaFeriados().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=diaferiados==null|| diaferiados.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						diaferiadosAux=new ArrayList<DiaFeriado>();
						diaferiadosAux.addAll(diaferiadoLogic.getDiaFeriados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							diaferiadosAux=new ArrayList<DiaFeriado>();
							diaferiadosAux.addAll(diaferiados);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							diaferiadoLogic.getDiaFeriadosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DiaFeriadoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DiaFeriadoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDiaFeriados("FK_IdEmpresa",diaferiadoLogic.getDiaFeriados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDiaFeriados("FK_IdEmpresa",diaferiados);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						diaferiadoLogic.setDiaFeriados(new ArrayList<DiaFeriado>());
						diaferiadoLogic.getDiaFeriados().addAll(diaferiadosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							diaferiados=new ArrayList<DiaFeriado>();
							diaferiados.addAll(diaferiadosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdMes")) {
				this.sDetalleReporte=DiaFeriadoConstantesFunciones.getDetalleIndiceFK_IdMes(id_mesFK_IdMes);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					diaferiadoLogic.getDiaFeriadosFK_IdMes(finalQueryGlobal,pagination,id_mesFK_IdMes);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DiaFeriadoConstantesFunciones.getDetalleIndiceFK_IdMes(id_mesFK_IdMes);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DiaFeriadoConstantesFunciones.getDetalleIndiceFK_IdMes(id_mesFK_IdMes);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=diaferiadoLogic.getDiaFeriados()==null||diaferiadoLogic.getDiaFeriados().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=diaferiados==null|| diaferiados.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						diaferiadosAux=new ArrayList<DiaFeriado>();
						diaferiadosAux.addAll(diaferiadoLogic.getDiaFeriados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							diaferiadosAux=new ArrayList<DiaFeriado>();
							diaferiadosAux.addAll(diaferiados);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							diaferiadoLogic.getDiaFeriadosFK_IdMes(finalQueryGlobal,pagination,id_mesFK_IdMes);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DiaFeriadoConstantesFunciones.getDetalleIndiceFK_IdMes(id_mesFK_IdMes);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DiaFeriadoConstantesFunciones.getDetalleIndiceFK_IdMes(id_mesFK_IdMes);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDiaFeriados("FK_IdMes",diaferiadoLogic.getDiaFeriados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDiaFeriados("FK_IdMes",diaferiados);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						diaferiadoLogic.setDiaFeriados(new ArrayList<DiaFeriado>());
						diaferiadoLogic.getDiaFeriados().addAll(diaferiadosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							diaferiados=new ArrayList<DiaFeriado>();
							diaferiados.addAll(diaferiadosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesDiaFeriado();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessDiaFeriado();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=diaferiadoLogic.getDiaFeriados().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=diaferiados.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=diaferiadoLogic.getDiaFeriados().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=diaferiados.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(DiaFeriado diaferiado) {
		Boolean permite=true;
		
		if(this.diaferiado.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=DiaFeriadoConstantesFunciones.getOrderByListaDiaFeriado();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=DiaFeriadoConstantesFunciones.getOrderByListaDiaFeriado();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DiaFeriado diaferiado:diaferiadoLogic.getDiaFeriados()) {
				if(diaferiado.getsType().equals(Constantes2.S_TOTALES)) {
					diaferiadoTotales=diaferiado;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DiaFeriado diaferiado:this.diaferiados) {
				if(diaferiado.getsType().equals(Constantes2.S_TOTALES)) {
					diaferiadoTotales=diaferiado;
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
			this.diaferiadoAux=new DiaFeriado();
			this.diaferiadoAux.setsType(Constantes2.S_TOTALES);
			this.diaferiadoAux.setIsNew(false);
			this.diaferiadoAux.setIsChanged(false);
			this.diaferiadoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				DiaFeriadoConstantesFunciones.TotalizarValoresFilaDiaFeriado(this.diaferiadoLogic.getDiaFeriados(),this.diaferiadoAux);
				
				this.diaferiadoLogic.getDiaFeriados().add(this.diaferiadoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				DiaFeriadoConstantesFunciones.TotalizarValoresFilaDiaFeriado(this.diaferiados,this.diaferiadoAux);
				
				this.diaferiados.add(this.diaferiadoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		diaferiadoTotales=new DiaFeriado();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.diaferiadoLogic.getDiaFeriados().remove(diaferiadoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.diaferiados.remove(diaferiadoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		diaferiadoTotales=new DiaFeriado();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DiaFeriado diaferiado:diaferiadoLogic.getDiaFeriados()) {
				if(diaferiado.getsType().equals(Constantes2.S_TOTALES)) {
					diaferiadoTotales=diaferiado;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				DiaFeriadoConstantesFunciones.TotalizarValoresFilaDiaFeriado(this.diaferiadoLogic.getDiaFeriados(),diaferiadoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DiaFeriado diaferiado:this.diaferiados) {
				if(diaferiado.getsType().equals(Constantes2.S_TOTALES)) {
					diaferiadoTotales=diaferiado;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				DiaFeriadoConstantesFunciones.TotalizarValoresFilaDiaFeriado(this.diaferiados,diaferiadoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getDiaFeriadosFK_IdAnio()throws Exception {
		try {
			sAccionBusqueda="FK_IdAnio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDiaFeriadosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDiaFeriadosFK_IdMes()throws Exception {
		try {
			sAccionBusqueda="FK_IdMes";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getDiaFeriadosFK_IdAnio(String sFinalQuery,Long id_anio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					diaferiadoLogic.getDiaFeriadosFK_IdAnio(sFinalQuery,this.pagination,id_anio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDiaFeriadosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					diaferiadoLogic.getDiaFeriadosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDiaFeriadosFK_IdMes(String sFinalQuery,Long id_mes)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					diaferiadoLogic.getDiaFeriadosFK_IdMes(sFinalQuery,this.pagination,id_mes);
				
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
	
	public void inicializarPermisosDiaFeriado() {
		this.isPermisoTodoDiaFeriado=false;
		this.isPermisoNuevoDiaFeriado=false;
		this.isPermisoActualizarDiaFeriado=false;
		this.isPermisoActualizarOriginalDiaFeriado=false;
		this.isPermisoEliminarDiaFeriado=false;
		this.isPermisoGuardarCambiosDiaFeriado=false;
		this.isPermisoConsultaDiaFeriado=false;
		this.isPermisoBusquedaDiaFeriado=false;
		this.isPermisoReporteDiaFeriado=false;		
		this.isPermisoOrdenDiaFeriado=false;		
		this.isPermisoPaginacionMedioDiaFeriado=false;		
		this.isPermisoPaginacionAltoDiaFeriado=false;
		this.isPermisoPaginacionTodoDiaFeriado=false;
		this.isPermisoCopiarDiaFeriado=false;		
		this.isPermisoVerFormDiaFeriado=false;		
		this.isPermisoDuplicarDiaFeriado=false;		
		this.isPermisoOrdenDiaFeriado=false;		
	}
	
	public void setPermisosUsuarioDiaFeriado(Boolean isPermiso) {
		this.isPermisoTodoDiaFeriado=isPermiso;
		this.isPermisoNuevoDiaFeriado=isPermiso;
		this.isPermisoActualizarDiaFeriado=isPermiso;
		this.isPermisoActualizarOriginalDiaFeriado=isPermiso;
		this.isPermisoEliminarDiaFeriado=isPermiso;
		this.isPermisoGuardarCambiosDiaFeriado=isPermiso;
		this.isPermisoConsultaDiaFeriado=isPermiso;
		this.isPermisoBusquedaDiaFeriado=isPermiso;
		this.isPermisoReporteDiaFeriado=isPermiso;
		this.isPermisoOrdenDiaFeriado=isPermiso;		
		this.isPermisoPaginacionMedioDiaFeriado=isPermiso;		
		this.isPermisoPaginacionAltoDiaFeriado=isPermiso;		
		this.isPermisoPaginacionTodoDiaFeriado=isPermiso;		
		this.isPermisoCopiarDiaFeriado=isPermiso;		
		this.isPermisoVerFormDiaFeriado=isPermiso;		
		this.isPermisoDuplicarDiaFeriado=isPermiso;
		this.isPermisoOrdenDiaFeriado=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioDiaFeriado(Boolean isPermiso) {
		//this.isPermisoTodoDiaFeriado=isPermiso;
		this.isPermisoNuevoDiaFeriado=isPermiso;
		this.isPermisoActualizarDiaFeriado=isPermiso;
		this.isPermisoActualizarOriginalDiaFeriado=isPermiso;
		this.isPermisoEliminarDiaFeriado=isPermiso;
		this.isPermisoGuardarCambiosDiaFeriado=isPermiso;
		//this.isPermisoConsultaDiaFeriado=isPermiso;
		//this.isPermisoBusquedaDiaFeriado=isPermiso;
		//this.isPermisoReporteDiaFeriado=isPermiso;
		//this.isPermisoOrdenDiaFeriado=isPermiso;		
		//this.isPermisoPaginacionMedioDiaFeriado=isPermiso;		
		//this.isPermisoPaginacionAltoDiaFeriado=isPermiso;		
		//this.isPermisoPaginacionTodoDiaFeriado=isPermiso;		
		//this.isPermisoCopiarDiaFeriado=isPermiso;		
		//this.isPermisoDuplicarDiaFeriado=isPermiso;
		//this.isPermisoOrdenDiaFeriado=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioDiaFeriadoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(DiaFeriadoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebDiaFeriado(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioDiaFeriadoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioDiaFeriadoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionDiaFeriadoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioDiaFeriadoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioDiaFeriado() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(DiaFeriadoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.diaferiadoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, DiaFeriadoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoDiaFeriado=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarDiaFeriado=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalDiaFeriado=this.isPermisoActualizarDiaFeriado;
			this.isPermisoEliminarDiaFeriado=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosDiaFeriado=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaDiaFeriado=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaDiaFeriado=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoDiaFeriado=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteDiaFeriado=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenDiaFeriado=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioDiaFeriado=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoDiaFeriado=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoDiaFeriado=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarDiaFeriado=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormDiaFeriado=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarDiaFeriado=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenDiaFeriado=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.diaferiadoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosDiaFeriado.setToolTipText(this.jTableDatosDiaFeriado.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioDiaFeriado(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioDiaFeriado(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(DiaFeriadoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(DiaFeriadoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioDiaFeriado() throws Exception {
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
	public void inicializarCombosForeignKeyDiaFeriadoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.messForeignKey=new ArrayList();
				this.aniosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyDiaFeriadoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(DiaFeriadoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyDiaFeriadoListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyMesListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyAnioListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyMesListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.messForeignKey==null||this.messForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=MesConstantesFunciones.getArrayColumnasGlobalesMes(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,MesConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=MesConstantesFunciones.SFINALQUERY;

				this.cargarCombosMessForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyAnioListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.aniosForeignKey==null||this.aniosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=AnioConstantesFunciones.getArrayColumnasGlobalesAnio(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,AnioConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=AnioConstantesFunciones.SFINALQUERY;

				this.cargarCombosAniosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyDiaFeriadoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			DiaFeriadoParameterReturnGeneral diaferiadoReturnGeneral=new DiaFeriadoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.diaferiadoConstantesFunciones.cargarid_empresaDiaFeriado)
					 || (this.esRecargarFks && this.diaferiadoConstantesFunciones.cargarid_empresaDiaFeriado)) {

					if(!this.diaferiadoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+diaferiadoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalMes="";

				if(((this.messForeignKey==null||this.messForeignKey.size()<=0) && this.diaferiadoConstantesFunciones.cargarid_mesDiaFeriado)
					 || (this.esRecargarFks && this.diaferiadoConstantesFunciones.cargarid_mesDiaFeriado)) {

					if(!this.diaferiadoSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=MesConstantesFunciones.getArrayColumnasGlobalesMes(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalMes=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,MesConstantesFunciones.TABLENAME);

						finalQueryGlobalMes=Funciones.GetFinalQueryAppend(finalQueryGlobalMes, "");
						finalQueryGlobalMes+=MesConstantesFunciones.SFINALQUERY;

						//this.cargarCombosMessForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalMes=" WHERE " + ConstantesSql.ID + "="+diaferiadoSessionBean.getlidMesActual();
					}
				} else {
					finalQueryGlobalMes="NONE";
				}


				String finalQueryGlobalAnio="";

				if(((this.aniosForeignKey==null||this.aniosForeignKey.size()<=0) && this.diaferiadoConstantesFunciones.cargarid_anioDiaFeriado)
					 || (this.esRecargarFks && this.diaferiadoConstantesFunciones.cargarid_anioDiaFeriado)) {

					if(!this.diaferiadoSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=AnioConstantesFunciones.getArrayColumnasGlobalesAnio(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalAnio=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,AnioConstantesFunciones.TABLENAME);

						finalQueryGlobalAnio=Funciones.GetFinalQueryAppend(finalQueryGlobalAnio, "");
						finalQueryGlobalAnio+=AnioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosAniosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalAnio=" WHERE " + ConstantesSql.ID + "="+diaferiadoSessionBean.getlidAnioActual();
					}
				} else {
					finalQueryGlobalAnio="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				diaferiadoReturnGeneral=diaferiadoLogic.cargarCombosLoteForeignKeyDiaFeriado(finalQueryGlobalEmpresa,finalQueryGlobalMes,finalQueryGlobalAnio);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=diaferiadoReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalMes.equals("NONE")) {
				this.messForeignKey=diaferiadoReturnGeneral.getmessForeignKey();
			}

			if(!finalQueryGlobalAnio.equals("NONE")) {
				this.aniosForeignKey=diaferiadoReturnGeneral.getaniosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyDiaFeriado()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyMes();
			this.addItemDefectoCombosForeignKeyAnio();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.diaferiadoSessionBean==null) {
				this.diaferiadoSessionBean=new DiaFeriadoSessionBean();
			}

			if(!this.diaferiadoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyMes()throws Exception {
		try {

			if(!this.diaferiadoSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {
				Mes mes=new Mes();
				MesConstantesFunciones.setMesDescripcion(mes,Constantes.SMENSAJE_ESCOJA_OPCION);
				mes.setId(null);

				if(!MesConstantesFunciones.ExisteEnLista(this.messForeignKey,mes,true)) {

					this.messForeignKey.add(0,mes);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyAnio()throws Exception {
		try {

			if(!this.diaferiadoSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {
				Anio anio=new Anio();
				AnioConstantesFunciones.setAnioDescripcion(anio,Constantes.SMENSAJE_ESCOJA_OPCION);
				anio.setId(null);

				if(!AnioConstantesFunciones.ExisteEnLista(this.aniosForeignKey,anio,true)) {

					this.aniosForeignKey.add(0,anio);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyDiaFeriado()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyDiaFeriado(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyDiaFeriado()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
				this.diaferiado.setfecha(this.parametroGeneralUsuario.getfecha_sistema());
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyDiaFeriado();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyDiaFeriado(DiaFeriado diaferiado)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyDiaFeriado(DiaFeriado diaferiado,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyDiaFeriado()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyDiaFeriado()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyDiaFeriado()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyDiaFeriado()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroDiaFeriado()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyDiaFeriado()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameMessForeignKey("Todos");
			this.cargarCombosFrameAniosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyDiaFeriado(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameMessForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameAniosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyDiaFeriado()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormDiaFeriado.jComboBoxid_empresaDiaFeriado!=null && this.jInternalFrameDetalleFormDiaFeriado.jComboBoxid_empresaDiaFeriado.getItemCount()>0) {
				this.jInternalFrameDetalleFormDiaFeriado.jComboBoxid_empresaDiaFeriado.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDiaFeriado.jComboBoxid_mesDiaFeriado!=null && this.jInternalFrameDetalleFormDiaFeriado.jComboBoxid_mesDiaFeriado.getItemCount()>0) {
				this.jInternalFrameDetalleFormDiaFeriado.jComboBoxid_mesDiaFeriado.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDiaFeriado.jComboBoxid_anioDiaFeriado!=null && this.jInternalFrameDetalleFormDiaFeriado.jComboBoxid_anioDiaFeriado.getItemCount()>0) {
				this.jInternalFrameDetalleFormDiaFeriado.jComboBoxid_anioDiaFeriado.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public DiaFeriadoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public DiaFeriadoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public DiaFeriadoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.diaferiadoSessionBean=new DiaFeriadoSessionBean(); 
		this.diaferiadoConstantesFunciones=new DiaFeriadoConstantesFunciones(); 
		this.diaferiadoBean=new DiaFeriado();//(this.diaferiadoConstantesFunciones); 		
		this.diaferiadoReturnGeneral=new DiaFeriadoParameterReturnGeneral(); 
		
		this.diaferiadoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.diaferiadoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public DiaFeriadoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public DiaFeriadoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public DiaFeriadoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessDiaFeriado(true);
			
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
			
			this.diaferiadoConstantesFunciones=new DiaFeriadoConstantesFunciones(); 
			this.diaferiadoBean=new DiaFeriado();//this.diaferiadoConstantesFunciones); 			
			this.diaferiadoReturnGeneral=new DiaFeriadoParameterReturnGeneral(); 
		
			DiaFeriadoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Dia Feriado Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.diaferiado=new DiaFeriado();
			this.diaferiados = new ArrayList<DiaFeriado>();
			this.diaferiadosAux = new ArrayList<DiaFeriado>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diaferiadoLogic=new DiaFeriadoLogic();
				this.diaferiadoLogic.getNewConnexionToDeep("");
			}
			
			//this.diaferiadoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.diaferiadoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormDiaFeriado);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoDiaFeriado!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoDiaFeriado);	
					}
					
					if(this.jInternalFrameImportacionDiaFeriado!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionDiaFeriado);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByDiaFeriado!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByDiaFeriado);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormDiaFeriado!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormDiaFeriado);
				this.jInternalFrameDetalleFormDiaFeriado.setVisible(false);
				this.jInternalFrameDetalleFormDiaFeriado.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoDiaFeriado!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoDiaFeriado);
					this.jInternalFrameReporteDinamicoDiaFeriado.setVisible(false);
					this.jInternalFrameReporteDinamicoDiaFeriado.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionDiaFeriado!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionDiaFeriado);
					this.jInternalFrameImportacionDiaFeriado.setVisible(false);
					this.jInternalFrameImportacionDiaFeriado.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByDiaFeriado!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByDiaFeriado);
					this.jInternalFrameOrderByDiaFeriado.setVisible(false);
					this.jInternalFrameOrderByDiaFeriado.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idDiaFeriadoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=DiaFeriadoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.diaferiadoReturnGeneral=new DiaFeriadoParameterReturnGeneral();
			
			this.diaferiadoParameterGeneral=new DiaFeriadoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.diaferiadoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.diaferiadoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(DiaFeriadoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.diaferiadoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,DiaFeriadoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.diaferiadoSessionBean.getEsGuardarRelacionado(),this.diaferiadoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,DiaFeriadoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.diaferiadoSessionBean.getEsGuardarRelacionado(),this.diaferiadoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoDiaFeriado=false;
			this.isVisibilidadCeldaDuplicarDiaFeriado=true;
			this.isVisibilidadCeldaCopiarDiaFeriado=true;
			this.isVisibilidadCeldaVerFormDiaFeriado=true;
			this.isVisibilidadCeldaOrdenDiaFeriado=true;
			this.isVisibilidadCeldaNuevoRelacionesDiaFeriado=false;
			this.isVisibilidadCeldaModificarDiaFeriado=false;
			this.isVisibilidadCeldaActualizarDiaFeriado=false;
			this.isVisibilidadCeldaEliminarDiaFeriado=false;
			this.isVisibilidadCeldaCancelarDiaFeriado=false;
			this.isVisibilidadCeldaGuardarDiaFeriado=false;
			this.isVisibilidadCeldaGuardarCambiosDiaFeriado=false;
			
			
			this.isVisibilidadFK_IdAnio=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdMes=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesDiaFeriado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosDiaFeriado();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioDiaFeriado(false);
			
			this.setPermisosUsuarioDiaFeriado();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.diaferiadoSessionBean.getEsGuardarRelacionado() 
				|| (this.diaferiadoSessionBean.getEsGuardarRelacionado() && this.diaferiadoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioDiaFeriadoClasesRelacionadas();
			}
			
			if(this.diaferiadoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioDiaFeriadoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!DiaFeriadoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosDiaFeriado();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualDiaFeriado();
			}
			
			if(!this.isPermisoBusquedaDiaFeriado) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasDiaFeriado.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.diaferiadoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioDiaFeriado,this.isPermisoPaginacionMedioDiaFeriado,this.isPermisoPaginacionTodoDiaFeriado);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(DiaFeriadoConstantesFunciones.getTiposSeleccionarDiaFeriado());
				
				this.tiposColumnasSelect=DiaFeriadoConstantesFunciones.getTiposSeleccionarDiaFeriado(true);
				
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
			//if(!this.diaferiadoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioDiaFeriado();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioDiaFeriado(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioDiaFeriado(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesDiaFeriado() ;
			
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
			this.mesLogic=new MesLogic();
			this.anioLogic=new AnioLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				diaferiadoImplementable= (DiaFeriadoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+DiaFeriadoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				diaferiadoImplementableHome= (DiaFeriadoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+DiaFeriadoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.diaferiados= new ArrayList<DiaFeriado>();
			this.diaferiadosEliminados= new ArrayList<DiaFeriado>();
						
			this.isEsNuevoDiaFeriado=false;
			this.esParaAccionDesdeFormularioDiaFeriado=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.messForeignKey=new ArrayList<Mes>() ;
			this.aniosForeignKey=new ArrayList<Anio>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyDiaFeriado(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroDiaFeriado();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.diaferiadoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			DiaFeriadoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=DiaFeriadoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesDiaFeriado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingDiaFeriado(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormDiaFeriado!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioDiaFeriado();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioDiaFeriado();
			}
			
			DiaFeriadoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasDiaFeriado.getTabCount(); i++) {
					this.jTabbedPaneBusquedasDiaFeriado.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasDiaFeriado.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diaferiadoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessDiaFeriado(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga DiaFeriado: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diaferiadoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diaferiadoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectDiaFeriado() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesDiaFeriado")) {
				iIndex=this.jInternalFrameDetalleFormDiaFeriado.jTabbedPaneRelacionesDiaFeriado.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormDiaFeriado.jTabbedPaneRelacionesDiaFeriado.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosDiaFeriado.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessDiaFeriado();	
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
	
	public void cargarCombosForeignKeyDiaFeriado(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyDiaFeriado(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyDiaFeriado(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyDiaFeriadoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyDiaFeriado();
		
		this.cargarCombosFrameForeignKeyDiaFeriado();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyDiaFeriado();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyDiaFeriado();
		}
	}
	
	

	public void cargarCombosForeignKeyMes(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyMesListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyMes();
				this.cargarCombosFrameMessForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaMes(this.messForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyAnio(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyAnioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyAnio();
				this.cargarCombosFrameAniosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaAnio(this.aniosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoDiaFeriadoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.diaferiadoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormDiaFeriado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			DiaFeriadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.diaferiado,new Object(),this.diaferiadoParameterGeneral,this.diaferiadoReturnGeneral);
			
			
			if(jTableDatosDiaFeriado.getRowCount()>=1) {
				jTableDatosDiaFeriado.removeRowSelectionInterval(0, jTableDatosDiaFeriado.getRowCount()-1);						
			}
			
			this.isEsNuevoDiaFeriado=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoDiaFeriado(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesDiaFeriado(true);			
			//this.diaferiado=new DiaFeriado();
			//this.diaferiado.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDiaFeriado(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDiaFeriado() ;
			
			if(DiaFeriadoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDiaFeriado(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.diaferiado);	
			this.actualizarInformacion("INFO_PADRE",false,this.diaferiado);				
			
			DiaFeriadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.diaferiado,new Object(),this.diaferiadoParameterGeneral,this.diaferiadoReturnGeneral);
			
			if(this.diaferiadoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar DiaFeriado: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			DiaFeriadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.diaferiado,new Object(),this.diaferiadoParameterGeneral,this.diaferiadoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarDiaFeriadoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<DiaFeriado> diaferiadosSeleccionados=new ArrayList<DiaFeriado>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosDiaFeriado.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosDiaFeriado.getSelectedRows().length;			
			}
			
			diaferiadosSeleccionados=this.getDiaFeriadosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoDiaFeriado--;			
				//DiaFeriado diaferiadoAux= new DiaFeriado();			
				//diaferiadoAux.setId(this.iIdNuevoDiaFeriado);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//DiaFeriado diaferiadoOrigen=new DiaFeriado();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(DiaFeriado diaferiadoOrigen : diaferiadosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosDiaFeriado.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							diaferiadoOrigen =(DiaFeriado) this.diaferiadoLogic.getDiaFeriados().toArray()[this.jTableDatosDiaFeriado.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							diaferiadoOrigen =(DiaFeriado) this.diaferiados.toArray()[this.jTableDatosDiaFeriado.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaDiaFeriado();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.diaferiado.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosDiaFeriado(diaferiadoOrigen,this.diaferiado,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysDiaFeriado(this.diaferiado);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.diaferiadoLogic.getDiaFeriados().add(this.diaferiadoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.diaferiados.add(this.diaferiadoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaDiaFeriado(false);
				
				this.jTableDatosDiaFeriado.setRowSelectionInterval(this.getIndiceNuevoDiaFeriado(), this.getIndiceNuevoDiaFeriado());
				
				int iLastRow =  this.jTableDatosDiaFeriado.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosDiaFeriado.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosDiaFeriado.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaDiaFeriado(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarDiaFeriadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<DiaFeriado> diaferiadosSeleccionados=new ArrayList<DiaFeriado>();									
		
			DiaFeriado diaferiadoOrigen=new DiaFeriado();
			DiaFeriado diaferiadoDestino=new DiaFeriado();
				
			diaferiadosSeleccionados=this.getDiaFeriadosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosDiaFeriado.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || diaferiadosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosDiaFeriado.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						diaferiadoOrigen =(DiaFeriado) this.diaferiadoLogic.getDiaFeriados().toArray()[this.jTableDatosDiaFeriado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						diaferiadoOrigen =(DiaFeriado) this.diaferiados.toArray()[this.jTableDatosDiaFeriado.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						diaferiadoDestino =(DiaFeriado) this.diaferiadoLogic.getDiaFeriados().toArray()[this.jTableDatosDiaFeriado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						diaferiadoDestino =(DiaFeriado) this.diaferiados.toArray()[this.jTableDatosDiaFeriado.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				diaferiadoOrigen =diaferiadosSeleccionados.get(0);
				diaferiadoDestino =diaferiadosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosDiaFeriado(diaferiadoOrigen,diaferiadoDestino,true,false);
				
				diaferiadoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(diaferiadoDestino,diaferiadoLogic.getDiaFeriados());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(diaferiadoDestino,diaferiados);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaDiaFeriado(false);
				
				//this.jTableDatosDiaFeriado.setRowSelectionInterval(this.getIndiceNuevoDiaFeriado(), this.getIndiceNuevoDiaFeriado());
				
				int iLastRow =  this.jTableDatosDiaFeriado.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosDiaFeriado.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosDiaFeriado.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaDiaFeriado(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormDiaFeriadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormDiaFeriado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormDiaFeriado.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarDiaFeriadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesDiaFeriado.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasDiaFeriado.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesDiaFeriado.setVisible(!isVisible);
			this.jPanelPaginacionDiaFeriado.setVisible(!isVisible);
			this.jPanelAccionesDiaFeriado.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarDiaFeriadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameDiaFeriado();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoDiaFeriadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoDiaFeriado();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionDiaFeriadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionDiaFeriado();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByDiaFeriadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByDiaFeriado();
			
			this.abrirFrameOrderByDiaFeriado();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByDiaFeriadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByDiaFeriado();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleDiaFeriado(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormDiaFeriado);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormDiaFeriado.isMaximum()) {
					this.jInternalFrameDetalleFormDiaFeriado.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormDiaFeriado.setSize(this.jInternalFrameDetalleFormDiaFeriado.iWidthFormulario,this.jInternalFrameDetalleFormDiaFeriado.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormDiaFeriado.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormDiaFeriado.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormDiaFeriado.isMaximum()) {
						this.jInternalFrameDetalleFormDiaFeriado.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormDiaFeriado.jContentPaneDetalleDiaFeriado.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormDiaFeriado.jTabbedPaneRelacionesDiaFeriado.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormDiaFeriado.jContentPaneDetalleDiaFeriado.getWidth(),DiaFeriadoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormDiaFeriado.jTabbedPaneRelacionesDiaFeriado.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormDiaFeriado.jContentPaneDetalleDiaFeriado.getWidth(),DiaFeriadoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormDiaFeriado.jTabbedPaneRelacionesDiaFeriado.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormDiaFeriado.jContentPaneDetalleDiaFeriado.getWidth(),DiaFeriadoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormDiaFeriado.setVisible(true);
	        this.jInternalFrameDetalleFormDiaFeriado.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByDiaFeriado() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByDiaFeriado==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByDiaFeriado=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDiaFeriado,false,this);
				} else {
					this.jInternalFrameOrderByDiaFeriado=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDiaFeriado,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByDiaFeriado);
				this.jInternalFrameOrderByDiaFeriado.setVisible(false);
				this.jInternalFrameOrderByDiaFeriado.setSelected(false);
				
				this.jInternalFrameOrderByDiaFeriado.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByDiaFeriado"));
				
				this.inicializarActualizarBindingTablaOrderByDiaFeriado();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionDiaFeriado() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionDiaFeriado==null) {
				
				this.jInternalFrameImportacionDiaFeriado=new ImportacionJInternalFrame(DiaFeriadoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionDiaFeriado);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionDiaFeriado);
				this.jInternalFrameImportacionDiaFeriado.setVisible(false);
				this.jInternalFrameImportacionDiaFeriado.setSelected(false);


				this.jInternalFrameImportacionDiaFeriado.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionDiaFeriado"));
				this.jInternalFrameImportacionDiaFeriado.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionDiaFeriado"));
				this.jInternalFrameImportacionDiaFeriado.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionDiaFeriado"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoDiaFeriado() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoDiaFeriado==null) {
				this.jInternalFrameReporteDinamicoDiaFeriado=new ReporteDinamicoJInternalFrame(DiaFeriadoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoDiaFeriado);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoDiaFeriado);
				this.jInternalFrameReporteDinamicoDiaFeriado.setVisible(false);
				this.jInternalFrameReporteDinamicoDiaFeriado.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoDiaFeriado.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDiaFeriado"));
				this.jInternalFrameReporteDinamicoDiaFeriado.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDiaFeriado"));
				this.jInternalFrameReporteDinamicoDiaFeriado.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDiaFeriado"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDiaFeriado();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleDiaFeriado() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormDiaFeriado);
			
	       	this.jInternalFrameDetalleFormDiaFeriado.setVisible(false);
	        this.jInternalFrameDetalleFormDiaFeriado.setSelected(false);
			
			//this.jInternalFrameDetalleFormDiaFeriado.dispose();
			//this.jInternalFrameDetalleFormDiaFeriado=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoDiaFeriado() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoDiaFeriado.setVisible(true);
	        this.jInternalFrameReporteDinamicoDiaFeriado.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionDiaFeriado() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionDiaFeriado.setVisible(true);
	        this.jInternalFrameImportacionDiaFeriado.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByDiaFeriado() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByDiaFeriado.setVisible(true);
	        this.jInternalFrameOrderByDiaFeriado.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByDiaFeriado() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByDiaFeriado.setVisible(false);
	        this.jInternalFrameOrderByDiaFeriado.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoDiaFeriado() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoDiaFeriado.setVisible(false);
	        this.jInternalFrameReporteDinamicoDiaFeriado.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionDiaFeriado() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionDiaFeriado.setVisible(false);
	        this.jInternalFrameImportacionDiaFeriado.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarDiaFeriadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarDiaFeriado(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarDiaFeriado(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosDiaFeriado.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesDiaFeriado(true);
			//this.isEsNuevoDiaFeriado=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diaferiado =(DiaFeriado) this.diaferiadoLogic.getDiaFeriados().toArray()[this.jTableDatosDiaFeriado.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.diaferiado =(DiaFeriado) this.diaferiados.toArray()[this.jTableDatosDiaFeriado.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesDiaFeriado("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDiaFeriado(false) ;
			
			if(diaferiadoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(DiaFeriadoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDiaFeriado(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDiaFeriado(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaDiaFeriadoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosDiaFeriado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diaferiado =(DiaFeriado) this.diaferiadoLogic.getDiaFeriados().toArray()[this.jTableDatosDiaFeriado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.diaferiado =(DiaFeriado) this.diaferiados.toArray()[this.jTableDatosDiaFeriado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarDiaFeriado(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormDiaFeriado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosDiaFeriado.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesDiaFeriado(true);
			//this.isEsNuevoDiaFeriado=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diaferiado =(DiaFeriado) this.diaferiadoLogic.getDiaFeriados().toArray()[this.jTableDatosDiaFeriado.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.diaferiado =(DiaFeriado) this.diaferiados.toArray()[this.jTableDatosDiaFeriado.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.diaferiado.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesDiaFeriado("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesDiaFeriado(false) ;
			
			if(DiaFeriadoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDiaFeriado(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDiaFeriado(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaMes(List<Mes> messForeignKey)throws Exception{
		TableColumn tableColumnMes=this.jTableDatosDiaFeriado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDiaFeriado,DiaFeriadoConstantesFunciones.LABEL_IDMES));
		TableCellEditor tableCellEditorMes =tableColumnMes.getCellEditor();

		MesTableCell mesTableCellFk=(MesTableCell)tableCellEditorMes;

		if(mesTableCellFk!=null) {
			mesTableCellFk.setmessForeignKey(messForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDiaFeriado.getSelectedRow();

		//if(intSelectedRow<=0) {
			//mesTableCellFk.setRowActual(intSelectedRow);
			//mesTableCellFk.setmessForeignKeyActual(messForeignKey);
		//}


		if(mesTableCellFk!=null) {
			mesTableCellFk.RecargarMessForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaAnio(List<Anio> aniosForeignKey)throws Exception{
		TableColumn tableColumnAnio=this.jTableDatosDiaFeriado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDiaFeriado,DiaFeriadoConstantesFunciones.LABEL_IDANIO));
		TableCellEditor tableCellEditorAnio =tableColumnAnio.getCellEditor();

		AnioTableCell anioTableCellFk=(AnioTableCell)tableCellEditorAnio;

		if(anioTableCellFk!=null) {
			anioTableCellFk.setaniosForeignKey(aniosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDiaFeriado.getSelectedRow();

		//if(intSelectedRow<=0) {
			//anioTableCellFk.setRowActual(intSelectedRow);
			//anioTableCellFk.setaniosForeignKeyActual(aniosForeignKey);
		//}


		if(anioTableCellFk!=null) {
			anioTableCellFk.RecargarAniosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarDiaFeriadoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diaferiadoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesDiaFeriado(false);
			
			//if(!this.isEsNuevoDiaFeriado) {								
				int intSelectedRow = this.jTableDatosDiaFeriado.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diaferiado =(DiaFeriado) this.diaferiadoLogic.getDiaFeriados().toArray()[this.jTableDatosDiaFeriado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.diaferiado =(DiaFeriado) this.diaferiados.toArray()[this.jTableDatosDiaFeriado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(DiaFeriadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualDiaFeriado(this.diaferiado,true);
				this.setVariablesFormularioToObjetoActualForeignKeysDiaFeriado(this.diaferiado);
				
			}
			
			if(this.permiteMantenimiento(this.diaferiado)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.diaferiadoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoDiaFeriado=true;
					this.inicializarActualizarBindingTablaDiaFeriado(false);
					this.isEsNuevoDiaFeriado=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoDiaFeriado=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoDiaFeriado=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesDiaFeriado(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDiaFeriado(false);
				
				this.habilitarDeshabilitarControlesDiaFeriado(false);
			
												
				
				if(DiaFeriadoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleDiaFeriado();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoDiaFeriadoActionPerformed(evt,diaferiadoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualDiaFeriado(this.diaferiado,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosDiaFeriado.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,diaferiadoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diaferiadoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.diaferiado.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(DiaFeriado.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DiaFeriado.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diaferiadoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diaferiadoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarDiaFeriadoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diaferiadoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosDiaFeriado.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diaferiado =(DiaFeriado) this.diaferiadoLogic.getDiaFeriados().toArray()[this.jTableDatosDiaFeriado.convertRowIndexToModel(intSelectedRow)];
				this.diaferiado.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.diaferiado =(DiaFeriado) this.diaferiados.toArray()[this.jTableDatosDiaFeriado.convertRowIndexToModel(intSelectedRow)];
				this.diaferiado.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.diaferiado)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.diaferiadoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((DiaFeriadoModel) this.jTableDatosDiaFeriado.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoDiaFeriado=true;
				this.inicializarActualizarBindingTablaDiaFeriado(false);
				this.isEsNuevoDiaFeriado=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesDiaFeriado(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDiaFeriado(false);
				
				this.habilitarDeshabilitarControlesDiaFeriado(false);
				
				
				
				if(DiaFeriadoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleDiaFeriado();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diaferiadoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diaferiadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diaferiadoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarDiaFeriadoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosDiaFeriado.getRowCount()>=1) {
				jTableDatosDiaFeriado.removeRowSelectionInterval(0, jTableDatosDiaFeriado.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesDiaFeriado(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaDiaFeriado(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDiaFeriado(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDiaFeriado(false) ;
			
			this.isEsNuevoDiaFeriado=false;
			
			if(DiaFeriadoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleDiaFeriado();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosDiaFeriadoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diaferiadoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingDiaFeriado(false);
				
				//SI ES MANUAL
				if(DiaFeriadoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualDiaFeriado();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diaferiadoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diaferiadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diaferiadoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosDiaFeriadoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoDiaFeriado--;			
			//DiaFeriado diaferiadoAux= new DiaFeriado();			
			//diaferiadoAux.setId(this.iIdNuevoDiaFeriado);
			
			if(this.jInternalFrameDetalleFormDiaFeriado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaDiaFeriado();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysDiaFeriado(this.diaferiado);
			
			this.diaferiado.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.diaferiadoLogic.getDiaFeriados().add(this.diaferiadoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.diaferiados.add(this.diaferiadoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaDiaFeriado(false);
			
			this.jTableDatosDiaFeriado.setRowSelectionInterval(this.getIndiceNuevoDiaFeriado(), this.getIndiceNuevoDiaFeriado());
			
			int iLastRow =  this.jTableDatosDiaFeriado.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosDiaFeriado.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosDiaFeriado.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaDiaFeriado(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionDiaFeriadoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diaferiadoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingDiaFeriado(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDiaFeriado(false);
			
			//SI ES MANUAL
			if(DiaFeriadoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDiaFeriado();
			}
			
			//this.abrirFrameTreeDiaFeriado();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diaferiadoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diaferiadoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diaferiadoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionDiaFeriadoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Dia FeriadoS ?", "MANTENIMIENTO DE Dia Feriado", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionDiaFeriado.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralDiaFeriado();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.diaferiadoReturnGeneral=diaferiadoLogic.procesarImportacionDiaFeriadosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.diaferiadoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarDiaFeriadoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionDiaFeriadoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionDiaFeriado.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionDiaFeriado.setFileImportacion(this.jInternalFrameImportacionDiaFeriado.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionDiaFeriado.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionDiaFeriado.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionDiaFeriado.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionDiaFeriado.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoDiaFeriadoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<DiaFeriado> diaferiadosSeleccionados=new ArrayList<DiaFeriado>();		

		diaferiadosSeleccionados=this.getDiaFeriadosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDiaFeriado.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDiaFeriado.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("DiaFeriadoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"DiaFeriadoBaseDesign.jrxml";
			
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
			
			this.generarReporteDiaFeriados("Todos",diaferiadosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.diaferiadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Dia Feriado",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoDiaFeriado.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDiaFeriado.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case DiaFeriadoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DiaFeriadoConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DiaFeriadoConstantesFunciones.LABEL_FECHA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cha_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cha_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cha_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cha_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DiaFeriadoConstantesFunciones.LABEL_DIA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_a_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_a_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_a_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_a_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DiaFeriadoConstantesFunciones.LABEL_IDMES:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Mes_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Mes_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Mes_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Mes_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DiaFeriadoConstantesFunciones.LABEL_IDANIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Anio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Anio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Anio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Anio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DiaFeriadoConstantesFunciones.LABEL_DESCRIPCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scripcion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scripcion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scripcion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scripcion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DiaFeriadoConstantesFunciones.LABEL_ESTAACTIVO:
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
		
		if(this.jInternalFrameReporteDinamicoDiaFeriado.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoDiaFeriado.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoDiaFeriado.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case DiaFeriadoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case DiaFeriadoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case DiaFeriadoConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoria="fecha";
					break;

				case DiaFeriadoConstantesFunciones.LABEL_DIA:
					sNombreCampoCategoria="dia";
					break;

				case DiaFeriadoConstantesFunciones.LABEL_IDMES:
					sNombreCampoCategoria="id_mes";
					break;

				case DiaFeriadoConstantesFunciones.LABEL_IDANIO:
					sNombreCampoCategoria="id_anio";
					break;

				case DiaFeriadoConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;

				case DiaFeriadoConstantesFunciones.LABEL_ESTAACTIVO:
					sNombreCampoCategoria="esta_activo";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoDiaFeriado.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case DiaFeriadoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case DiaFeriadoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case DiaFeriadoConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoriaValor="fecha";
					break;

				case DiaFeriadoConstantesFunciones.LABEL_DIA:
					sNombreCampoCategoriaValor="dia";
					break;

				case DiaFeriadoConstantesFunciones.LABEL_IDMES:
					sNombreCampoCategoriaValor="id_mes";
					break;

				case DiaFeriadoConstantesFunciones.LABEL_IDANIO:
					sNombreCampoCategoriaValor="id_anio";
					break;

				case DiaFeriadoConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;

				case DiaFeriadoConstantesFunciones.LABEL_ESTAACTIVO:
					sNombreCampoCategoriaValor="esta_activo";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoDiaFeriado.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDiaFeriado.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case DiaFeriadoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case DiaFeriadoConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case DiaFeriadoConstantesFunciones.LABEL_FECHA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha");
					break;

				case DiaFeriadoConstantesFunciones.LABEL_DIA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Dia",sNombreCampoCategoria,sNombreCampoCategoriaValor,"dia");
					break;

				case DiaFeriadoConstantesFunciones.LABEL_IDMES:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Mes",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_mes");
					break;

				case DiaFeriadoConstantesFunciones.LABEL_IDANIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Anio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_anio");
					break;

				case DiaFeriadoConstantesFunciones.LABEL_DESCRIPCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descripcion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descripcion");
					break;

				case DiaFeriadoConstantesFunciones.LABEL_ESTAACTIVO:
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
	
	public void jButtonGenerarExcelReporteDinamicoDiaFeriadoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<DiaFeriado> diaferiadosSeleccionados=new ArrayList<DiaFeriado>();		
		
		diaferiadosSeleccionados=this.getDiaFeriadosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"diaferiado";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("DiaFeriados");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoDiaFeriado.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoDiaFeriado.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case DiaFeriadoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DiaFeriadoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(DiaFeriado diaferiado:diaferiadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(diaferiado.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DiaFeriadoConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DiaFeriadoConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(DiaFeriado diaferiado:diaferiadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(diaferiado.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DiaFeriadoConstantesFunciones.LABEL_FECHA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DiaFeriadoConstantesFunciones.LABEL_FECHA);
					iRow++;

					for(DiaFeriado diaferiado:diaferiadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(diaferiado.getfecha());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DiaFeriadoConstantesFunciones.LABEL_DIA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DiaFeriadoConstantesFunciones.LABEL_DIA);
					iRow++;

					for(DiaFeriado diaferiado:diaferiadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(diaferiado.getdia());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DiaFeriadoConstantesFunciones.LABEL_IDMES:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DiaFeriadoConstantesFunciones.LABEL_IDMES);
					iRow++;

					for(DiaFeriado diaferiado:diaferiadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(diaferiado.getmes_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DiaFeriadoConstantesFunciones.LABEL_IDANIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DiaFeriadoConstantesFunciones.LABEL_IDANIO);
					iRow++;

					for(DiaFeriado diaferiado:diaferiadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(diaferiado.getanio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DiaFeriadoConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DiaFeriadoConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(DiaFeriado diaferiado:diaferiadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(diaferiado.getdescripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DiaFeriadoConstantesFunciones.LABEL_ESTAACTIVO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DiaFeriadoConstantesFunciones.LABEL_ESTAACTIVO);
					iRow++;

					for(DiaFeriado diaferiado:diaferiadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(diaferiado.getesta_activo());
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
			//	this.getFilaCabeceraExportarExcelDiaFeriado(row);				
			//	iRow++;
			//}				
			
			//for(DiaFeriado diaferiadoAux:diaferiadosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelDiaFeriado(diaferiadoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.diaferiadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Dia Feriado",JOptionPane.INFORMATION_MESSAGE);
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
				this.diaferiadoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDiaFeriado(false);
			
			//SI ES MANUAL
			if(DiaFeriadoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDiaFeriado();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diaferiadoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diaferiadoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diaferiadoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresDiaFeriadoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diaferiadoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDiaFeriado(false);
			
			//SI ES MANUAL
			if(DiaFeriadoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualDiaFeriado();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diaferiadoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diaferiadoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diaferiadoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesDiaFeriadoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diaferiadoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDiaFeriado(false);
			
			//SI ES MANUAL
			if(DiaFeriadoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualDiaFeriado();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diaferiadoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diaferiadoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diaferiadoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaDiaFeriado() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosDiaFeriado.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosDiaFeriado.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosDiaFeriado.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosDiaFeriado.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosDiaFeriado.setMinimumSize(dimensionMinimum);
		this.jTableDatosDiaFeriado.setMaximumSize(dimensionMaximum);
		this.jTableDatosDiaFeriado.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingDiaFeriado(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingDiaFeriado(esInicializar,true);
	}
	
	public void inicializarActualizarBindingDiaFeriado(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaDiaFeriado(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesDiaFeriado(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.diaferiadoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasDiaFeriado(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesDiaFeriado(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesDiaFeriado(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !DiaFeriadoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!DiaFeriadoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualDiaFeriado() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaDiaFeriado();
		
		this.inicializarActualizarBindingBotonesManualDiaFeriado(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.diaferiadoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualDiaFeriado();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesDiaFeriado() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualDiaFeriado(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualDiaFeriado(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosDiaFeriado.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosDiaFeriado.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteDiaFeriado.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormDiaFeriado!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormDiaFeriado.jCheckBoxPostAccionNuevoDiaFeriado.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormDiaFeriado.jCheckBoxPostAccionSinCerrarDiaFeriado.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormDiaFeriado.jCheckBoxPostAccionSinMensajeDiaFeriado.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosDiaFeriado.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosDiaFeriado.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteDiaFeriado.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormDiaFeriado!=null) {
				this.jInternalFrameDetalleFormDiaFeriado.jCheckBoxPostAccionNuevoDiaFeriado.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormDiaFeriado.jCheckBoxPostAccionSinCerrarDiaFeriado.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormDiaFeriado.jCheckBoxPostAccionSinMensajeDiaFeriado.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionDiaFeriado.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionDiaFeriado.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormDiaFeriado!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormDiaFeriado.jComboBoxTiposAccionesFormularioDiaFeriado.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesDiaFeriado.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoDiaFeriado!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDiaFeriado.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesDiaFeriado.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesDiaFeriado.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarDiaFeriado.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesDiaFeriado.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoDiaFeriado!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDiaFeriado.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesDiaFeriado.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralDiaFeriado.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesDiaFeriado(Boolean esInicializar) throws Exception {
		try	{	
			if(DiaFeriadoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualDiaFeriado(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesDiaFeriado() throws Exception {
		try	{
			if(DiaFeriadoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualDiaFeriado();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleDiaFeriado() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormDiaFeriado.jComboBoxTiposAccionesFormularioDiaFeriado.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormDiaFeriado.jComboBoxTiposAccionesFormularioDiaFeriado.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualDiaFeriado() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesDiaFeriado.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesDiaFeriado.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesDiaFeriado.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesDiaFeriado.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesDiaFeriado.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesDiaFeriado.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionDiaFeriado.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionDiaFeriado.addItem(reporte);
			}
			
			
			if(!this.diaferiadoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionDiaFeriado.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionDiaFeriado.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesDiaFeriado.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesDiaFeriado.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesDiaFeriado.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesDiaFeriado.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormDiaFeriado!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormDiaFeriado.jComboBoxTiposAccionesFormularioDiaFeriado.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormDiaFeriado.jComboBoxTiposAccionesFormularioDiaFeriado.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarDiaFeriado.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarDiaFeriado.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarDiaFeriado.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDiaFeriado();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDiaFeriado() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoDiaFeriado!=null) {
				this.jInternalFrameReporteDinamicoDiaFeriado.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoDiaFeriado.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoDiaFeriado!=null) {
				this.jInternalFrameReporteDinamicoDiaFeriado.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoDiaFeriado.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoDiaFeriado!=null) {
				
				if(this.jInternalFrameReporteDinamicoDiaFeriado.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoDiaFeriado.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDiaFeriado.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoDiaFeriado.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoDiaFeriado.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDiaFeriado.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualDiaFeriado()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_anioFK_IdAnioDiaFeriado.getSelectedItem()!=null){this.id_anioFK_IdAnio=((Anio)this.jComboBoxid_anioFK_IdAnioDiaFeriado.getSelectedItem()).getId();}
		if(this.jComboBoxid_mesFK_IdMesDiaFeriado.getSelectedItem()!=null){this.id_mesFK_IdMes=((Mes)this.jComboBoxid_mesFK_IdMesDiaFeriado.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasDiaFeriado(Boolean esInicializar) throws Exception {				
		if(DiaFeriadoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualDiaFeriado();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaDiaFeriado() throws Exception {
		this.inicializarActualizarBindingTablaDiaFeriado(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByDiaFeriado() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByDiaFeriado.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByDiaFeriado.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDiaFeriado.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new DiaFeriadoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByDiaFeriado.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDiaFeriado.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new DiaFeriadoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosDiaFeriadoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDiaFeriadoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new DiaFeriadoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByDiaFeriado.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDiaFeriado.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new DiaFeriadoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByDiaFeriado.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaDiaFeriado(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=diaferiadoLogic.getDiaFeriados().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=diaferiados.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(DiaFeriadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosDiaFeriado.setModel(new DiaFeriadoModel(this.diaferiadoLogic.getDiaFeriados(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosDiaFeriado.setModel(new DiaFeriadoModel(this.diaferiados,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByDiaFeriado!=null && this.jInternalFrameOrderByDiaFeriado.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByDiaFeriado();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosDiaFeriado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDiaFeriado,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new DiaFeriadoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+DiaFeriadoConstantesFunciones.SCLASSWEBTITULO,diaferiadoConstantesFunciones.resaltarSeleccionarDiaFeriado,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+DiaFeriadoConstantesFunciones.SCLASSWEBTITULO,diaferiadoConstantesFunciones.resaltarSeleccionarDiaFeriado,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosDiaFeriado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDiaFeriado,DiaFeriadoConstantesFunciones.LABEL_ID));

		if(this.diaferiadoConstantesFunciones.mostraridDiaFeriado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DiaFeriadoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.diaferiadoConstantesFunciones.resaltaridDiaFeriado,this.diaferiadoConstantesFunciones.activaridDiaFeriado,this,true,"idDiaFeriado","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.diaferiadoConstantesFunciones.resaltaridDiaFeriado,this.diaferiadoConstantesFunciones.activaridDiaFeriado,this,true,"idDiaFeriado","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDiaFeriado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDiaFeriado,DiaFeriadoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.diaferiadoConstantesFunciones.mostrarid_empresaDiaFeriado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DiaFeriadoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.diaferiadoConstantesFunciones.resaltarid_empresaDiaFeriado,this,this.diaferiadoConstantesFunciones.activarid_empresaDiaFeriado));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.diaferiadoConstantesFunciones.resaltarid_empresaDiaFeriado,this,this.diaferiadoConstantesFunciones.activarid_empresaDiaFeriado,false,"id_empresaDiaFeriado","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DiaFeriadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDiaFeriado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDiaFeriado,DiaFeriadoConstantesFunciones.LABEL_NOMBRE));

		if(this.diaferiadoConstantesFunciones.mostrarnombreDiaFeriado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DiaFeriadoConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.diaferiadoConstantesFunciones.resaltarnombreDiaFeriado,this.diaferiadoConstantesFunciones.activarnombreDiaFeriado,this,true,"nombreDiaFeriado","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.diaferiadoConstantesFunciones.resaltarnombreDiaFeriado,this.diaferiadoConstantesFunciones.activarnombreDiaFeriado,this,true,"nombreDiaFeriado","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DiaFeriadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDiaFeriado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDiaFeriado,DiaFeriadoConstantesFunciones.LABEL_FECHA));

		if(this.diaferiadoConstantesFunciones.mostrarfechaDiaFeriado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DiaFeriadoConstantesFunciones.LABEL_FECHA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.diaferiadoConstantesFunciones.resaltarfechaDiaFeriado,this.diaferiadoConstantesFunciones.activarfechaDiaFeriado,this,true,"fechaDiaFeriado","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.diaferiadoConstantesFunciones.resaltarfechaDiaFeriado,this.diaferiadoConstantesFunciones.activarfechaDiaFeriado,this,true,"fechaDiaFeriado","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new DiaFeriadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDiaFeriado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDiaFeriado,DiaFeriadoConstantesFunciones.LABEL_DIA));

		if(this.diaferiadoConstantesFunciones.mostrardiaDiaFeriado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DiaFeriadoConstantesFunciones.LABEL_DIA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.diaferiadoConstantesFunciones.resaltardiaDiaFeriado,this.diaferiadoConstantesFunciones.activardiaDiaFeriado,this,true,"diaDiaFeriado","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.diaferiadoConstantesFunciones.resaltardiaDiaFeriado,this.diaferiadoConstantesFunciones.activardiaDiaFeriado,this,true,"diaDiaFeriado","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DiaFeriadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDiaFeriado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDiaFeriado,DiaFeriadoConstantesFunciones.LABEL_IDMES));

		if(this.diaferiadoConstantesFunciones.mostrarid_mesDiaFeriado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DiaFeriadoConstantesFunciones.LABEL_IDMES,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new MesTableCell(this.messForeignKey,this.diaferiadoConstantesFunciones.resaltarid_mesDiaFeriado,this,this.diaferiadoConstantesFunciones.activarid_mesDiaFeriado));
			tableColumn.setCellEditor(new MesTableCell(this.messForeignKey,this.diaferiadoConstantesFunciones.resaltarid_mesDiaFeriado,this,this.diaferiadoConstantesFunciones.activarid_mesDiaFeriado,true,"id_mesDiaFeriado","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DiaFeriadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDiaFeriado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDiaFeriado,DiaFeriadoConstantesFunciones.LABEL_IDANIO));

		if(this.diaferiadoConstantesFunciones.mostrarid_anioDiaFeriado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DiaFeriadoConstantesFunciones.LABEL_IDANIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new AnioTableCell(this.aniosForeignKey,this.diaferiadoConstantesFunciones.resaltarid_anioDiaFeriado,this,this.diaferiadoConstantesFunciones.activarid_anioDiaFeriado));
			tableColumn.setCellEditor(new AnioTableCell(this.aniosForeignKey,this.diaferiadoConstantesFunciones.resaltarid_anioDiaFeriado,this,this.diaferiadoConstantesFunciones.activarid_anioDiaFeriado,true,"id_anioDiaFeriado","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DiaFeriadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDiaFeriado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDiaFeriado,DiaFeriadoConstantesFunciones.LABEL_DESCRIPCION));

		if(this.diaferiadoConstantesFunciones.mostrardescripcionDiaFeriado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DiaFeriadoConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.diaferiadoConstantesFunciones.resaltardescripcionDiaFeriado,this.diaferiadoConstantesFunciones.activardescripcionDiaFeriado,this,true,"descripcionDiaFeriado","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.diaferiadoConstantesFunciones.resaltardescripcionDiaFeriado,this.diaferiadoConstantesFunciones.activardescripcionDiaFeriado,this,true,"descripcionDiaFeriado","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DiaFeriadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDiaFeriado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDiaFeriado,DiaFeriadoConstantesFunciones.LABEL_ESTAACTIVO));

		if(this.diaferiadoConstantesFunciones.mostraresta_activoDiaFeriado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DiaFeriadoConstantesFunciones.LABEL_ESTAACTIVO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.diaferiadoConstantesFunciones.resaltaresta_activoDiaFeriado,this.diaferiadoConstantesFunciones.activaresta_activoDiaFeriado));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.diaferiadoConstantesFunciones.resaltaresta_activoDiaFeriado,this.diaferiadoConstantesFunciones.activaresta_activoDiaFeriado,this,true,"esta_activoDiaFeriado","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DiaFeriadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.diaferiadoSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.diaferiadoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.diaferiadoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosDiaFeriado.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.diaferiadoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.diaferiadoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosDiaFeriado.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarDiaFeriado && this.isPermisoGuardarCambiosDiaFeriado) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.diaferiadoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.diaferiadoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosDiaFeriado.addColumn(tableColumn);
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
			
			this.jTableDatosDiaFeriado.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarDiaFeriado && this.isPermisoGuardarCambiosDiaFeriado) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarDiaFeriado && this.isPermisoGuardarCambiosDiaFeriado) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosDiaFeriado.moveColumn(this.jTableDatosDiaFeriado.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosDiaFeriado.moveColumn(this.jTableDatosDiaFeriado.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosDiaFeriado.moveColumn(this.jTableDatosDiaFeriado.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosDiaFeriado.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosDiaFeriado.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosDiaFeriado,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!DiaFeriadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosDiaFeriado.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosDiaFeriado.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!DiaFeriadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!DiaFeriadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosDiaFeriado.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosDiaFeriado.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosDiaFeriado.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=diaferiadoLogic.getDiaFeriados().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=diaferiados.size()-1;
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
		//this.jTableDatosDiaFeriado.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosDiaFeriado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosDiaFeriado();
			
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
				
				//this.isEsNuevoDiaFeriado=false;
					
				DiaFeriadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.diaferiado,new Object(),this.diaferiadoParameterGeneral,this.diaferiadoReturnGeneral);
			
				if(this.diaferiadoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormDiaFeriado==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosDiaFeriado.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosDiaFeriado.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diaferiado =(DiaFeriado) this.diaferiadoLogic.getDiaFeriados().toArray()[this.jTableDatosDiaFeriado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.diaferiado =(DiaFeriado) this.diaferiados.toArray()[this.jTableDatosDiaFeriado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.diaferiado.getsType().equals("DUPLICADO")
				   || this.diaferiado.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoDiaFeriado=true;
				
				} else {
					this.isEsNuevoDiaFeriado=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.diaferiadoSessionBean.getEsGuardarRelacionado()) {
					if(this.diaferiado.getId()>=0 && !this.diaferiado.getIsNew()) {						
						this.isEsNuevoDiaFeriado=false;
						
					} else {
						this.isEsNuevoDiaFeriado=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoDiaFeriado(esRelaciones);						
				
				this.seleccionarDiaFeriado(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.diaferiado.getId()<0) {
					this.isEsNuevoDiaFeriado=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarDiaFeriado(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarDiaFeriado(evt,rowIndex);
				}	
				
				if(this.diaferiadoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion DiaFeriado: " + this.dDif); 
					}
				}								
				
				DiaFeriadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.diaferiado,new Object(),this.diaferiadoParameterGeneral,this.diaferiadoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarDiaFeriado(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.diaferiado)) {
					if(this.diaferiado.getId()>0) {
						this.diaferiado.setIsDeleted(true);
						
						this.diaferiadosEliminados.add(this.diaferiado);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.diaferiadoLogic.getDiaFeriados().remove(this.diaferiado);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.diaferiados.remove(this.diaferiado);				
					}
					
					
					((DiaFeriadoModel) this.jTableDatosDiaFeriado.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaDiaFeriado(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarDiaFeriado(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoDiaFeriado) {
			
			if(this.jInternalFrameDetalleFormDiaFeriado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosDiaFeriado.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosDiaFeriado.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diaferiado =(DiaFeriado) this.diaferiadoLogic.getDiaFeriados().toArray()[this.jTableDatosDiaFeriado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.diaferiado =(DiaFeriado) this.diaferiados.toArray()[this.jTableDatosDiaFeriado.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(DiaFeriadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioDiaFeriado(this.diaferiado);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.diaferiadoConstantesFunciones.cargarid_empresaDiaFeriado || this.diaferiadoConstantesFunciones.event_dependid_empresaDiaFeriado) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.diaferiado.getid_empresa());
									//this.inicializarActualizarBindingDiaFeriado(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(diaferiado.getEmpresa()!=null) {
							this.empresasForeignKey.add(diaferiado.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.diaferiado.getid_empresa(),false,"Formulario");

					//Mes
					if(!this.diaferiadoConstantesFunciones.cargarid_mesDiaFeriado || this.diaferiadoConstantesFunciones.event_dependid_mesDiaFeriado) {
						//this.cargarCombosMessForeignKeyLista(" where id="+this.diaferiado.getid_mes());
									//this.inicializarActualizarBindingDiaFeriado(false,false);
						this.messForeignKey=new ArrayList<Mes>();

						if(diaferiado.getMes()!=null) {
							this.messForeignKey.add(diaferiado.getMes());
						}

						this.addItemDefectoCombosForeignKeyMes();
						this.cargarCombosFrameMessForeignKey("Todos");
					}
					this.setActualMesForeignKey(this.diaferiado.getid_mes(),false,"Formulario");

					//Anio
					if(!this.diaferiadoConstantesFunciones.cargarid_anioDiaFeriado || this.diaferiadoConstantesFunciones.event_dependid_anioDiaFeriado) {
						//this.cargarCombosAniosForeignKeyLista(" where id="+this.diaferiado.getid_anio());
									//this.inicializarActualizarBindingDiaFeriado(false,false);
						this.aniosForeignKey=new ArrayList<Anio>();

						if(diaferiado.getAnio()!=null) {
							this.aniosForeignKey.add(diaferiado.getAnio());
						}

						this.addItemDefectoCombosForeignKeyAnio();
						this.cargarCombosFrameAniosForeignKey("Todos");
					}
					this.setActualAnioForeignKey(this.diaferiado.getid_anio(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesDiaFeriado("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesDiaFeriado(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDiaFeriado() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoDiaFeriado(DiaFeriado diaferiado) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoDiaFeriado(diaferiado,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoDiaFeriado(DiaFeriado diaferiado,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioDiaFeriado(diaferiado);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyDiaFeriado(diaferiado,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyDiaFeriado(diaferiado);
	}
	
	public void setVariablesObjetoActualToFormularioDiaFeriado(DiaFeriado diaferiado) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormDiaFeriado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormDiaFeriado.jLabelidDiaFeriado.setText(diaferiado.getId().toString());
			this.jInternalFrameDetalleFormDiaFeriado.jTextFieldnombreDiaFeriado.setText(diaferiado.getnombre());
			this.jInternalFrameDetalleFormDiaFeriado.jDateChooserfechaDiaFeriado.setDate(diaferiado.getfecha());
			this.jInternalFrameDetalleFormDiaFeriado.jTextFielddiaDiaFeriado.setText(diaferiado.getdia().toString());
			this.jInternalFrameDetalleFormDiaFeriado.jTextAreadescripcionDiaFeriado.setText(diaferiado.getdescripcion());
			this.jInternalFrameDetalleFormDiaFeriado.jCheckBoxesta_activoDiaFeriado.setSelected(diaferiado.getesta_activo());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,DiaFeriado diaferiadoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,diaferiadoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,DiaFeriado diaferiadoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				diaferiadoLocal=this.diaferiado;
			} else {
				diaferiadoLocal=this.diaferiadoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(diaferiadoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoDiaFeriado(diaferiadoLocal,true);
					
					if(diaferiadoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(diaferiadoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.diaferiadoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(diaferiadoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoDiaFeriado(DiaFeriado diaferiado,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualDiaFeriado(diaferiado,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysDiaFeriado(diaferiado);
	}
	
	public void setVariablesFormularioToObjetoActualDiaFeriado(DiaFeriado diaferiado,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualDiaFeriado(diaferiado,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualDiaFeriado(DiaFeriado diaferiado,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormDiaFeriado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormDiaFeriado.jLabelidDiaFeriado.getText()==null || this.jInternalFrameDetalleFormDiaFeriado.jLabelidDiaFeriado.getText()=="" || this.jInternalFrameDetalleFormDiaFeriado.jLabelidDiaFeriado.getText()=="Id") {
				this.jInternalFrameDetalleFormDiaFeriado.jLabelidDiaFeriado.setText("0");
			}

			if(conColumnasBase) {diaferiado.setId(Long.parseLong(this.jInternalFrameDetalleFormDiaFeriado.jLabelidDiaFeriado.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DiaFeriadoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDiaFeriado.jLabelIdDiaFeriado,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			diaferiado.setnombre(this.jInternalFrameDetalleFormDiaFeriado.jTextFieldnombreDiaFeriado.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DiaFeriadoConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDiaFeriado.jLabelnombreDiaFeriado,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			diaferiado.setfecha(this.jInternalFrameDetalleFormDiaFeriado.jDateChooserfechaDiaFeriado.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DiaFeriadoConstantesFunciones.LABEL_FECHA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDiaFeriado.jLabelfechaDiaFeriado,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			diaferiado.setdia(Integer.parseInt(this.jInternalFrameDetalleFormDiaFeriado.jTextFielddiaDiaFeriado.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DiaFeriadoConstantesFunciones.LABEL_DIA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDiaFeriado.jLabeldiaDiaFeriado,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			diaferiado.setdescripcion(this.jInternalFrameDetalleFormDiaFeriado.jTextAreadescripcionDiaFeriado.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DiaFeriadoConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDiaFeriado.jLabeldescripcionDiaFeriado,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			diaferiado.setesta_activo(this.jInternalFrameDetalleFormDiaFeriado.jCheckBoxesta_activoDiaFeriado.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DiaFeriadoConstantesFunciones.LABEL_ESTAACTIVO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDiaFeriado.jLabelesta_activoDiaFeriado,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualDiaFeriado(DiaFeriado diaferiadoBean,DiaFeriado diaferiado,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosDiaFeriado(DiaFeriado diaferiadoOrigen,DiaFeriado diaferiado,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && diaferiadoOrigen.getId()!=null && !diaferiadoOrigen.getId().equals(0L))) {diaferiado.setId(diaferiadoOrigen.getId());}}
			if(conDefault || (!conDefault && diaferiadoOrigen.getnombre()!=null && !diaferiadoOrigen.getnombre().equals(""))) {diaferiado.setnombre(diaferiadoOrigen.getnombre());}
			if(conDefault || (!conDefault && diaferiadoOrigen.getfecha()!=null && !diaferiadoOrigen.getfecha().equals(new Date()))) {diaferiado.setfecha(diaferiadoOrigen.getfecha());}
			if(conDefault || (!conDefault && diaferiadoOrigen.getdia()!=null && !diaferiadoOrigen.getdia().equals(0))) {diaferiado.setdia(diaferiadoOrigen.getdia());}
			if(conDefault || (!conDefault && diaferiadoOrigen.getdescripcion()!=null && !diaferiadoOrigen.getdescripcion().equals(""))) {diaferiado.setdescripcion(diaferiadoOrigen.getdescripcion());}
			if(conDefault || (!conDefault && diaferiadoOrigen.getesta_activo()!=null && !diaferiadoOrigen.getesta_activo().equals(false))) {diaferiado.setesta_activo(diaferiadoOrigen.getesta_activo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioDiaFeriado(DiaFeriado diaferiado) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormDiaFeriado.jLabelidDiaFeriado.setText(diaferiado.getId().toString());
			this.jInternalFrameDetalleFormDiaFeriado.jTextFieldnombreDiaFeriado.setText(diaferiado.getnombre());
			this.jInternalFrameDetalleFormDiaFeriado.jDateChooserfechaDiaFeriado.setDate(diaferiado.getfecha());
			this.jInternalFrameDetalleFormDiaFeriado.jTextFielddiaDiaFeriado.setText(diaferiado.getdia().toString());
			this.jInternalFrameDetalleFormDiaFeriado.jTextAreadescripcionDiaFeriado.setText(diaferiado.getdescripcion());
			this.jInternalFrameDetalleFormDiaFeriado.jCheckBoxesta_activoDiaFeriado.setSelected(diaferiado.getesta_activo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioDiaFeriado(DiaFeriadoBean diaferiadoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormDiaFeriado.jLabelidDiaFeriado.setText(diaferiadoBean.getId().toString());
			this.jInternalFrameDetalleFormDiaFeriado.jTextFieldnombreDiaFeriado.setText(diaferiadoBean.getnombre());
			this.jInternalFrameDetalleFormDiaFeriado.jDateChooserfechaDiaFeriado.setDate(diaferiadoBean.getfecha());
			this.jInternalFrameDetalleFormDiaFeriado.jTextFielddiaDiaFeriado.setText(diaferiadoBean.getdia().toString());
			this.jInternalFrameDetalleFormDiaFeriado.jTextAreadescripcionDiaFeriado.setText(diaferiadoBean.getdescripcion());
			this.jInternalFrameDetalleFormDiaFeriado.jCheckBoxesta_activoDiaFeriado.setSelected(diaferiadoBean.getesta_activo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanDiaFeriado(DiaFeriadoParameterReturnGeneral diaferiadoReturnGeneral,DiaFeriadoBean diaferiadoBean,Boolean conDefault) throws Exception { 
		try {
			DiaFeriado diaferiadoLocal=new DiaFeriado();
			
			diaferiadoLocal=diaferiadoReturnGeneral.getDiaFeriado();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && diaferiadoLocal.getId()!=null && !diaferiadoLocal.getId().equals(0L))) {diaferiadoBean.setId(diaferiadoLocal.getId());}}
			if(conDefault || (!conDefault && diaferiadoLocal.getnombre()!=null && !diaferiadoLocal.getnombre().equals(""))) {diaferiadoBean.setnombre(diaferiadoLocal.getnombre());}
			if(conDefault || (!conDefault && diaferiadoLocal.getfecha()!=null && !diaferiadoLocal.getfecha().equals(new Date()))) {diaferiadoBean.setfecha(diaferiadoLocal.getfecha());}
			if(conDefault || (!conDefault && diaferiadoLocal.getdia()!=null && !diaferiadoLocal.getdia().equals(0))) {diaferiadoBean.setdia(diaferiadoLocal.getdia());}
			if(conDefault || (!conDefault && diaferiadoLocal.getdescripcion()!=null && !diaferiadoLocal.getdescripcion().equals(""))) {diaferiadoBean.setdescripcion(diaferiadoLocal.getdescripcion());}
			if(conDefault || (!conDefault && diaferiadoLocal.getesta_activo()!=null && !diaferiadoLocal.getesta_activo().equals(false))) {diaferiadoBean.setesta_activo(diaferiadoLocal.getesta_activo());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxDiaFeriadoGenerico(Long idDiaFeriadoSeleccionado,JComboBox jComboBoxDiaFeriado,List<DiaFeriado> diaferiadosLocal)throws Exception {
		try {
			DiaFeriado  diaferiadoTemp=null;

			for(DiaFeriado diaferiadoAux:diaferiadosLocal) {
				if(diaferiadoAux.getId()!=null && diaferiadoAux.getId().equals(idDiaFeriadoSeleccionado)) {
					diaferiadoTemp=diaferiadoAux;
					break;
				}
			}

			jComboBoxDiaFeriado.setSelectedItem(diaferiadoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxDiaFeriadoGenerico(JComboBox jComboBoxDiaFeriado,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxDiaFeriado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxDiaFeriado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxDiaFeriado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxDiaFeriado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxDiaFeriado.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxDiaFeriado.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxDiaFeriado.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxDiaFeriado.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxDiaFeriado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxDiaFeriado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			diaferiado=(DiaFeriado) diaferiadoLogic.getDiaFeriados().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			diaferiado =(DiaFeriado) diaferiados.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!diaferiado.getIsNew() && !diaferiado.getIsChanged() && !diaferiado.getIsDeleted()) {
				sDescripcion=diaferiado.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=diaferiado.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Mes")) {
			//sDescripcion=this.getActualMesForeignKeyDescripcion((Long)value);
			if(!diaferiado.getIsNew() && !diaferiado.getIsChanged() && !diaferiado.getIsDeleted()) {
				sDescripcion=diaferiado.getmes_descripcion();
			} else {
				//sDescripcion=this.getActualMesForeignKeyDescripcion((Long)value);
				sDescripcion=diaferiado.getmes_descripcion();
			}
		}

		if(sTipo.equals("Anio")) {
			//sDescripcion=this.getActualAnioForeignKeyDescripcion((Long)value);
			if(!diaferiado.getIsNew() && !diaferiado.getIsChanged() && !diaferiado.getIsDeleted()) {
				sDescripcion=diaferiado.getanio_descripcion();
			} else {
				//sDescripcion=this.getActualAnioForeignKeyDescripcion((Long)value);
				sDescripcion=diaferiado.getanio_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		DiaFeriado diaferiadoRow=new DiaFeriado();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			diaferiadoRow=(DiaFeriado) diaferiadoLogic.getDiaFeriados().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			diaferiadoRow=(DiaFeriado) diaferiados.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualDiaFeriado(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoDiaFeriado.setVisible((this.isVisibilidadCeldaNuevoDiaFeriado && this.isPermisoNuevoDiaFeriado));			
			this.jButtonDuplicarDiaFeriado.setVisible((this.isVisibilidadCeldaDuplicarDiaFeriado && this.isPermisoDuplicarDiaFeriado));			
			this.jButtonCopiarDiaFeriado.setVisible((this.isVisibilidadCeldaCopiarDiaFeriado && this.isPermisoCopiarDiaFeriado));
			this.jButtonVerFormDiaFeriado.setVisible((this.isVisibilidadCeldaVerFormDiaFeriado && this.isPermisoVerFormDiaFeriado));
			
			this.jButtonAbrirOrderByDiaFeriado.setVisible((this.isVisibilidadCeldaOrdenDiaFeriado && this.isPermisoOrdenDiaFeriado));			
			
			this.jButtonNuevoRelacionesDiaFeriado.setVisible((this.isVisibilidadCeldaNuevoRelacionesDiaFeriado && this.isPermisoNuevoDiaFeriado));			
			this.jButtonNuevoGuardarCambiosDiaFeriado.setVisible((this.isVisibilidadCeldaNuevoDiaFeriado && this.isPermisoNuevoDiaFeriado && this.isPermisoGuardarCambiosDiaFeriado));
			
			if(this.jInternalFrameDetalleFormDiaFeriado!=null) {
			this.jInternalFrameDetalleFormDiaFeriado.jButtonModificarDiaFeriado.setVisible((this.isVisibilidadCeldaModificarDiaFeriado && this.isPermisoActualizarDiaFeriado));	
			this.jInternalFrameDetalleFormDiaFeriado.jButtonActualizarDiaFeriado.setVisible((this.isVisibilidadCeldaActualizarDiaFeriado && this.isPermisoActualizarDiaFeriado));	
			this.jInternalFrameDetalleFormDiaFeriado.jButtonEliminarDiaFeriado.setVisible((this.isVisibilidadCeldaEliminarDiaFeriado && this.isPermisoEliminarDiaFeriado));
			this.jInternalFrameDetalleFormDiaFeriado.jButtonCancelarDiaFeriado.setVisible(this.isVisibilidadCeldaCancelarDiaFeriado);							
			this.jInternalFrameDetalleFormDiaFeriado.jButtonGuardarCambiosDiaFeriado.setVisible((this.isVisibilidadCeldaGuardarDiaFeriado && this.isPermisoGuardarCambiosDiaFeriado));			
			
			}
						
			this.jButtonGuardarCambiosTablaDiaFeriado.setVisible((this.isVisibilidadCeldaGuardarCambiosDiaFeriado && this.isPermisoGuardarCambiosDiaFeriado));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarDiaFeriado.setVisible((this.isVisibilidadCeldaNuevoDiaFeriado && this.isPermisoNuevoDiaFeriado));						
			this.jButtonDuplicarToolBarDiaFeriado.setVisible((this.isVisibilidadCeldaDuplicarDiaFeriado && this.isPermisoDuplicarDiaFeriado));						
			this.jButtonCopiarToolBarDiaFeriado.setVisible((this.isVisibilidadCeldaCopiarDiaFeriado && this.isPermisoCopiarDiaFeriado));			
			this.jButtonVerFormToolBarDiaFeriado.setVisible((this.isVisibilidadCeldaVerFormDiaFeriado && this.isPermisoVerFormDiaFeriado));			
			this.jButtonAbrirOrderByToolBarDiaFeriado.setVisible((this.isVisibilidadCeldaOrdenDiaFeriado && this.isPermisoOrdenDiaFeriado));
			this.jButtonNuevoRelacionesToolBarDiaFeriado.setVisible((this.isVisibilidadCeldaNuevoRelacionesDiaFeriado && this.isPermisoNuevoDiaFeriado));			
			this.jButtonNuevoGuardarCambiosToolBarDiaFeriado.setVisible((this.isVisibilidadCeldaNuevoDiaFeriado && this.isPermisoNuevoDiaFeriado && this.isPermisoGuardarCambiosDiaFeriado));			
			
			if(this.jInternalFrameDetalleFormDiaFeriado!=null) {
			this.jInternalFrameDetalleFormDiaFeriado.jButtonModificarToolBarDiaFeriado.setVisible((this.isVisibilidadCeldaModificarDiaFeriado && this.isPermisoActualizarDiaFeriado));	
			this.jInternalFrameDetalleFormDiaFeriado.jButtonActualizarToolBarDiaFeriado.setVisible((this.isVisibilidadCeldaActualizarDiaFeriado  && this.isPermisoActualizarDiaFeriado));	
			this.jInternalFrameDetalleFormDiaFeriado.jButtonEliminarToolBarDiaFeriado.setVisible((this.isVisibilidadCeldaEliminarDiaFeriado && this.isPermisoEliminarDiaFeriado));
			this.jInternalFrameDetalleFormDiaFeriado.jButtonCancelarToolBarDiaFeriado.setVisible(this.isVisibilidadCeldaCancelarDiaFeriado);				
			this.jInternalFrameDetalleFormDiaFeriado.jButtonGuardarCambiosToolBarDiaFeriado.setVisible((this.isVisibilidadCeldaGuardarDiaFeriado && this.isPermisoGuardarCambiosDiaFeriado));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarDiaFeriado.setVisible((this.isVisibilidadCeldaGuardarCambiosDiaFeriado && this.isPermisoGuardarCambiosDiaFeriado));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoDiaFeriado.setVisible((this.isVisibilidadCeldaNuevoDiaFeriado && this.isPermisoNuevoDiaFeriado));			
			this.jMenuItemDuplicarDiaFeriado.setVisible((this.isVisibilidadCeldaDuplicarDiaFeriado && this.isPermisoDuplicarDiaFeriado));			
			this.jMenuItemCopiarDiaFeriado.setVisible((this.isVisibilidadCeldaCopiarDiaFeriado && this.isPermisoCopiarDiaFeriado));			
			this.jMenuItemVerFormDiaFeriado.setVisible((this.isVisibilidadCeldaVerFormDiaFeriado && this.isPermisoVerFormDiaFeriado));			
			this.jMenuItemAbrirOrderByDiaFeriado.setVisible((this.isVisibilidadCeldaOrdenDiaFeriado && this.isPermisoOrdenDiaFeriado));			
			//this.jMenuItemMostrarOcultarDiaFeriado.setVisible((this.isVisibilidadCeldaOrdenDiaFeriado && this.isPermisoOrdenDiaFeriado));
			this.jMenuItemDetalleAbrirOrderByDiaFeriado.setVisible((this.isVisibilidadCeldaOrdenDiaFeriado && this.isPermisoOrdenDiaFeriado));			
			//this.jMenuItemDetalleMostrarOcultarDiaFeriado.setVisible((this.isVisibilidadCeldaOrdenDiaFeriado && this.isPermisoOrdenDiaFeriado));			
			this.jMenuItemNuevoRelacionesDiaFeriado.setVisible((this.isVisibilidadCeldaNuevoRelacionesDiaFeriado && this.isPermisoNuevoDiaFeriado));			
			this.jMenuItemNuevoGuardarCambiosDiaFeriado.setVisible((this.isVisibilidadCeldaNuevoDiaFeriado && this.isPermisoNuevoDiaFeriado && this.isPermisoGuardarCambiosDiaFeriado));									
			
			if(this.jInternalFrameDetalleFormDiaFeriado!=null) {
			this.jInternalFrameDetalleFormDiaFeriado.jMenuItemModificarDiaFeriado.setVisible((this.isVisibilidadCeldaModificarDiaFeriado && this.isPermisoActualizarDiaFeriado));	
			this.jInternalFrameDetalleFormDiaFeriado.jMenuItemActualizarDiaFeriado.setVisible((this.isVisibilidadCeldaActualizarDiaFeriado && this.isPermisoActualizarDiaFeriado));	
			this.jInternalFrameDetalleFormDiaFeriado.jMenuItemEliminarDiaFeriado.setVisible((this.isVisibilidadCeldaEliminarDiaFeriado && this.isPermisoEliminarDiaFeriado));
			this.jInternalFrameDetalleFormDiaFeriado.jMenuItemCancelarDiaFeriado.setVisible(this.isVisibilidadCeldaCancelarDiaFeriado);				
			}
			
			this.jMenuItemGuardarCambiosDiaFeriado.setVisible((this.isVisibilidadCeldaGuardarDiaFeriado && this.isPermisoGuardarCambiosDiaFeriado));						
			this.jMenuItemGuardarCambiosTablaDiaFeriado.setVisible((this.isVisibilidadCeldaGuardarCambiosDiaFeriado && this.isPermisoGuardarCambiosDiaFeriado));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoDiaFeriado=this.jButtonNuevoDiaFeriado.isVisible();
			this.isVisibilidadCeldaDuplicarDiaFeriado=this.jButtonDuplicarDiaFeriado.isVisible();
			this.isVisibilidadCeldaCopiarDiaFeriado=this.jButtonCopiarDiaFeriado.isVisible();
			this.isVisibilidadCeldaVerFormDiaFeriado=this.jButtonVerFormDiaFeriado.isVisible();
			
			this.isVisibilidadCeldaOrdenDiaFeriado=this.jButtonAbrirOrderByDiaFeriado.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesDiaFeriado=this.jButtonNuevoRelacionesDiaFeriado.isVisible();
			this.isVisibilidadCeldaModificarDiaFeriado=this.jButtonModificarDiaFeriado.isVisible();
			
			if(this.jInternalFrameDetalleFormDiaFeriado!=null) {
			this.isVisibilidadCeldaActualizarDiaFeriado=this.jInternalFrameDetalleFormDiaFeriado.jButtonActualizarDiaFeriado.isVisible();
			this.isVisibilidadCeldaEliminarDiaFeriado=this.jInternalFrameDetalleFormDiaFeriado.jButtonEliminarDiaFeriado.isVisible();
			this.isVisibilidadCeldaCancelarDiaFeriado=this.jInternalFrameDetalleFormDiaFeriado.jButtonCancelarDiaFeriado.isVisible();
			this.isVisibilidadCeldaGuardarDiaFeriado=this.jInternalFrameDetalleFormDiaFeriado.jButtonGuardarCambiosDiaFeriado.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosDiaFeriado=this.jButtonGuardarCambiosTablaDiaFeriado.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoDiaFeriado=this.jButtonNuevoToolBarDiaFeriado.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesDiaFeriado=this.jButtonNuevoRelacionesToolBarDiaFeriado.isVisible();
			
			if(this.jInternalFrameDetalleFormDiaFeriado!=null) {
			this.isVisibilidadCeldaModificarDiaFeriado=this.jInternalFrameDetalleFormDiaFeriado.jButtonModificarToolBarDiaFeriado.isVisible();
			this.isVisibilidadCeldaActualizarDiaFeriado=this.jInternalFrameDetalleFormDiaFeriado.jButtonActualizarToolBarDiaFeriado.isVisible();
			this.isVisibilidadCeldaEliminarDiaFeriado=this.jInternalFrameDetalleFormDiaFeriado.jButtonEliminarToolBarDiaFeriado.isVisible();
			this.isVisibilidadCeldaCancelarDiaFeriado=this.jInternalFrameDetalleFormDiaFeriado.jButtonCancelarToolBarDiaFeriado.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarDiaFeriado=this.jButtonGuardarCambiosToolBarDiaFeriado.isVisible();
			this.isVisibilidadCeldaGuardarCambiosDiaFeriado=this.jButtonGuardarCambiosTablaToolBarDiaFeriado.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoDiaFeriado=this.jMenuItemNuevoDiaFeriado.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesDiaFeriado=this.jMenuItemNuevoRelacionesDiaFeriado.isVisible();
			
			if(this.jInternalFrameDetalleFormDiaFeriado!=null) {
			this.isVisibilidadCeldaModificarDiaFeriado=this.jInternalFrameDetalleFormDiaFeriado.jMenuItemModificarDiaFeriado.isVisible();
			this.isVisibilidadCeldaActualizarDiaFeriado=this.jInternalFrameDetalleFormDiaFeriado.jMenuItemActualizarDiaFeriado.isVisible();
			this.isVisibilidadCeldaEliminarDiaFeriado=this.jInternalFrameDetalleFormDiaFeriado.jMenuItemEliminarDiaFeriado.isVisible();
			this.isVisibilidadCeldaCancelarDiaFeriado=this.jInternalFrameDetalleFormDiaFeriado.jMenuItemCancelarDiaFeriado.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarDiaFeriado=this.jMenuItemGuardarCambiosDiaFeriado.isVisible();
			this.isVisibilidadCeldaGuardarCambiosDiaFeriado=this.jMenuItemGuardarCambiosTablaDiaFeriado.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesDiaFeriado(Boolean esInicializar) {
		if(DiaFeriadoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.diaferiadoSessionBean.getConGuardarRelaciones()) {
				//if(this.diaferiadoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesDiaFeriado();
			}
			
			this.inicializarActualizarBindingBotonesManualDiaFeriado(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualDiaFeriado() {
		this.jButtonNuevoDiaFeriado.setVisible(this.isPermisoNuevoDiaFeriado);			
		this.jButtonDuplicarDiaFeriado.setVisible(this.isPermisoDuplicarDiaFeriado);			
		this.jButtonCopiarDiaFeriado.setVisible(this.isPermisoCopiarDiaFeriado);			
		this.jButtonVerFormDiaFeriado.setVisible(this.isPermisoVerFormDiaFeriado);			
		
		this.jButtonAbrirOrderByDiaFeriado.setVisible(this.isPermisoOrdenDiaFeriado);					
		
		this.jButtonNuevoRelacionesDiaFeriado.setVisible(this.isPermisoNuevoDiaFeriado);			
		
		if(this.jInternalFrameDetalleFormDiaFeriado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDiaFeriado.jButtonModificarDiaFeriado.setVisible(this.isPermisoActualizarDiaFeriado);	
			this.jInternalFrameDetalleFormDiaFeriado.jButtonActualizarDiaFeriado.setVisible(this.isPermisoActualizarDiaFeriado);	
			this.jInternalFrameDetalleFormDiaFeriado.jButtonEliminarDiaFeriado.setVisible(this.isPermisoEliminarDiaFeriado);
			this.jInternalFrameDetalleFormDiaFeriado.jButtonCancelarDiaFeriado.setVisible(this.isVisibilidadCeldaCancelarDiaFeriado);						
			this.jInternalFrameDetalleFormDiaFeriado.jButtonGuardarCambiosDiaFeriado.setVisible(this.isPermisoGuardarCambiosDiaFeriado);							
		}
		
		this.jButtonGuardarCambiosTablaDiaFeriado.setVisible(this.isPermisoActualizarDiaFeriado);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleDiaFeriado() {
		this.jInternalFrameDetalleFormDiaFeriado.jButtonModificarDiaFeriado.setVisible(this.isPermisoActualizarDiaFeriado);	
		this.jInternalFrameDetalleFormDiaFeriado.jButtonActualizarDiaFeriado.setVisible(this.isPermisoActualizarDiaFeriado);	
		this.jInternalFrameDetalleFormDiaFeriado.jButtonEliminarDiaFeriado.setVisible(this.isPermisoEliminarDiaFeriado);
		this.jInternalFrameDetalleFormDiaFeriado.jButtonCancelarDiaFeriado.setVisible(this.isVisibilidadCeldaCancelarDiaFeriado);							
		this.jInternalFrameDetalleFormDiaFeriado.jButtonGuardarCambiosDiaFeriado.setVisible((this.isVisibilidadCeldaGuardarDiaFeriado && this.isPermisoGuardarCambiosDiaFeriado));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosDiaFeriado() {
		if(DiaFeriadoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualDiaFeriado();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesDiaFeriado() {
	}
	
	public void jTableDatosDiaFeriadoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarDiaFeriado(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidDiaFeriadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diaferiadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDiaFeriado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDiaFeriado(this.getdiaferiado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiaFeriado(this.diaferiado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.diaferiado =(DiaFeriado) this.diaferiadoLogic.getDiaFeriados().toArray()[this.jTableDatosDiaFeriado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.diaferiado =(DiaFeriado) this.diaferiados.toArray()[this.jTableDatosDiaFeriado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.diaferiado==null) {
						this.diaferiado = new DiaFeriado();
					}

					this.setVariablesFormularioToObjetoActualDiaFeriado(this.diaferiado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiaFeriado(this.diaferiado);
				}

				if(this.diaferiado.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.diaferiado.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDiaFeriado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diaferiadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diaferiadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diaferiadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaDiaFeriadoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diaferiadoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebDiaFeriado(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDiaFeriado.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDiaFeriado.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDiaFeriado.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diaferiado =(DiaFeriado) this.diaferiadoLogic.getDiaFeriados().toArray()[this.jTableDatosDiaFeriado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.diaferiado =(DiaFeriado) this.diaferiados.toArray()[this.jTableDatosDiaFeriado.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDiaFeriado(this.getdiaferiado(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDiaFeriado(this.diaferiado);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.diaferiadoLogic.getConnexion());

				if(this.diaferiado.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.diaferiado.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDiaFeriado=(TitledBorder)this.jScrollPanelDatosDiaFeriado.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderDiaFeriado.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diaferiadoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diaferiadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diaferiadoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaDiaFeriadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diaferiadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDiaFeriado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDiaFeriado(this.getdiaferiado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiaFeriado(this.diaferiado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.diaferiado =(DiaFeriado) this.diaferiadoLogic.getDiaFeriados().toArray()[this.jTableDatosDiaFeriado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.diaferiado =(DiaFeriado) this.diaferiados.toArray()[this.jTableDatosDiaFeriado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.diaferiado==null) {
						this.diaferiado = new DiaFeriado();
					}

					this.setVariablesFormularioToObjetoActualDiaFeriado(this.diaferiado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiaFeriado(this.diaferiado);
				}

				if(this.diaferiado.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.diaferiado.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDiaFeriado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diaferiadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diaferiadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diaferiadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreDiaFeriadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diaferiadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDiaFeriado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDiaFeriado(this.getdiaferiado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiaFeriado(this.diaferiado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.diaferiado =(DiaFeriado) this.diaferiadoLogic.getDiaFeriados().toArray()[this.jTableDatosDiaFeriado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.diaferiado =(DiaFeriado) this.diaferiados.toArray()[this.jTableDatosDiaFeriado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.diaferiado==null) {
						this.diaferiado = new DiaFeriado();
					}

					this.setVariablesFormularioToObjetoActualDiaFeriado(this.diaferiado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiaFeriado(this.diaferiado);
				}

				if(this.diaferiado.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.diaferiado.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDiaFeriado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diaferiadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diaferiadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diaferiadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfechaDiaFeriadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diaferiadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDiaFeriado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDiaFeriado(this.getdiaferiado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiaFeriado(this.diaferiado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.diaferiado =(DiaFeriado) this.diaferiadoLogic.getDiaFeriados().toArray()[this.jTableDatosDiaFeriado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.diaferiado =(DiaFeriado) this.diaferiados.toArray()[this.jTableDatosDiaFeriado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.diaferiado==null) {
						this.diaferiado = new DiaFeriado();
					}

					this.setVariablesFormularioToObjetoActualDiaFeriado(this.diaferiado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiaFeriado(this.diaferiado);
				}

				if(this.diaferiado.getfecha()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha = '"+Funciones2.getStringPostgresDate(this.diaferiado.getfecha())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDiaFeriado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diaferiadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diaferiadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diaferiadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondiaDiaFeriadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diaferiadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDiaFeriado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDiaFeriado(this.getdiaferiado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiaFeriado(this.diaferiado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.diaferiado =(DiaFeriado) this.diaferiadoLogic.getDiaFeriados().toArray()[this.jTableDatosDiaFeriado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.diaferiado =(DiaFeriado) this.diaferiados.toArray()[this.jTableDatosDiaFeriado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.diaferiado==null) {
						this.diaferiado = new DiaFeriado();
					}

					this.setVariablesFormularioToObjetoActualDiaFeriado(this.diaferiado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiaFeriado(this.diaferiado);
				}

				if(this.diaferiado.getdia()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where dia = "+this.diaferiado.getdia().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDiaFeriado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diaferiadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diaferiadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diaferiadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_mesDiaFeriadoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diaferiadoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisomes=true;

			idTienePermisomes=this.tienePermisosUsuarioEnPaginaWebDiaFeriado(MesConstantesFunciones.CLASSNAME);

			if(idTienePermisomes) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDiaFeriado.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDiaFeriado.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDiaFeriado.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diaferiado =(DiaFeriado) this.diaferiadoLogic.getDiaFeriados().toArray()[this.jTableDatosDiaFeriado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.diaferiado =(DiaFeriado) this.diaferiados.toArray()[this.jTableDatosDiaFeriado.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDiaFeriado(this.getdiaferiado(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDiaFeriado(this.diaferiado);

				this.mesBeanSwingJInternalFrame=new MesBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.mesBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.mesBeanSwingJInternalFrame.getMesLogic().setConnexion(this.diaferiadoLogic.getConnexion());

				if(this.diaferiado.getid_mes()!=null) {
					this.mesBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.mesBeanSwingJInternalFrame.setIdActual(this.diaferiado.getid_mes());
					this.mesBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.mesBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.mesBeanSwingJInternalFrame.inicializarActualizarBindingTablaMes();
				}

				JInternalFrameBase jinternalFrame =this.mesBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDiaFeriado=(TitledBorder)this.jScrollPanelDatosDiaFeriado.getBorder();
				TitledBorder titledBordermes=(TitledBorder)this.mesBeanSwingJInternalFrame.jScrollPanelDatosMes.getBorder();

				titledBordermes.setTitle(titledBorderDiaFeriado.getTitle() + " -> Mes");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diaferiadoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diaferiadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diaferiadoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_mesDiaFeriadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diaferiadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDiaFeriado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDiaFeriado(this.getdiaferiado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiaFeriado(this.diaferiado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.diaferiado =(DiaFeriado) this.diaferiadoLogic.getDiaFeriados().toArray()[this.jTableDatosDiaFeriado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.diaferiado =(DiaFeriado) this.diaferiados.toArray()[this.jTableDatosDiaFeriado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.diaferiado==null) {
						this.diaferiado = new DiaFeriado();
					}

					this.setVariablesFormularioToObjetoActualDiaFeriado(this.diaferiado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiaFeriado(this.diaferiado);
				}

				if(this.diaferiado.getid_mes()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_mes = "+this.diaferiado.getid_mes().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDiaFeriado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diaferiadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diaferiadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diaferiadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_anioDiaFeriadoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diaferiadoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoanio=true;

			idTienePermisoanio=this.tienePermisosUsuarioEnPaginaWebDiaFeriado(AnioConstantesFunciones.CLASSNAME);

			if(idTienePermisoanio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDiaFeriado.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDiaFeriado.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDiaFeriado.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diaferiado =(DiaFeriado) this.diaferiadoLogic.getDiaFeriados().toArray()[this.jTableDatosDiaFeriado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.diaferiado =(DiaFeriado) this.diaferiados.toArray()[this.jTableDatosDiaFeriado.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDiaFeriado(this.getdiaferiado(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDiaFeriado(this.diaferiado);

				this.anioBeanSwingJInternalFrame=new AnioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.anioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.anioBeanSwingJInternalFrame.getAnioLogic().setConnexion(this.diaferiadoLogic.getConnexion());

				if(this.diaferiado.getid_anio()!=null) {
					this.anioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.anioBeanSwingJInternalFrame.setIdActual(this.diaferiado.getid_anio());
					this.anioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.anioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.anioBeanSwingJInternalFrame.inicializarActualizarBindingTablaAnio();
				}

				JInternalFrameBase jinternalFrame =this.anioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDiaFeriado=(TitledBorder)this.jScrollPanelDatosDiaFeriado.getBorder();
				TitledBorder titledBorderanio=(TitledBorder)this.anioBeanSwingJInternalFrame.jScrollPanelDatosAnio.getBorder();

				titledBorderanio.setTitle(titledBorderDiaFeriado.getTitle() + " -> Anio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diaferiadoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diaferiadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diaferiadoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_anioDiaFeriadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diaferiadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDiaFeriado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDiaFeriado(this.getdiaferiado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiaFeriado(this.diaferiado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.diaferiado =(DiaFeriado) this.diaferiadoLogic.getDiaFeriados().toArray()[this.jTableDatosDiaFeriado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.diaferiado =(DiaFeriado) this.diaferiados.toArray()[this.jTableDatosDiaFeriado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.diaferiado==null) {
						this.diaferiado = new DiaFeriado();
					}

					this.setVariablesFormularioToObjetoActualDiaFeriado(this.diaferiado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiaFeriado(this.diaferiado);
				}

				if(this.diaferiado.getid_anio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_anio = "+this.diaferiado.getid_anio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDiaFeriado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diaferiadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diaferiadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diaferiadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionDiaFeriadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diaferiadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDiaFeriado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDiaFeriado(this.getdiaferiado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiaFeriado(this.diaferiado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.diaferiado =(DiaFeriado) this.diaferiadoLogic.getDiaFeriados().toArray()[this.jTableDatosDiaFeriado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.diaferiado =(DiaFeriado) this.diaferiados.toArray()[this.jTableDatosDiaFeriado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.diaferiado==null) {
						this.diaferiado = new DiaFeriado();
					}

					this.setVariablesFormularioToObjetoActualDiaFeriado(this.diaferiado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiaFeriado(this.diaferiado);
				}

				if(this.diaferiado.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.diaferiado.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDiaFeriado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diaferiadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diaferiadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diaferiadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonesta_activoDiaFeriadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diaferiadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDiaFeriado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDiaFeriado(this.getdiaferiado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiaFeriado(this.diaferiado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.diaferiado =(DiaFeriado) this.diaferiadoLogic.getDiaFeriados().toArray()[this.jTableDatosDiaFeriado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.diaferiado =(DiaFeriado) this.diaferiados.toArray()[this.jTableDatosDiaFeriado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.diaferiado==null) {
						this.diaferiado = new DiaFeriado();
					}

					this.setVariablesFormularioToObjetoActualDiaFeriado(this.diaferiado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiaFeriado(this.diaferiado);
				}

				if(this.diaferiado.getesta_activo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where esta_activo = "+this.diaferiado.getesta_activo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDiaFeriado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diaferiadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diaferiadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diaferiadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdAnioDiaFeriadoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diaferiadoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDiaFeriado(false,false);

			this.getDiaFeriadosFK_IdAnio();

			this.inicializarActualizarBindingDiaFeriado(false);

			//if(DiaFeriadoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDiaFeriado(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diaferiadoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diaferiadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diaferiadoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaDiaFeriadoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diaferiadoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDiaFeriado(false,false);

			this.getDiaFeriadosFK_IdEmpresa();

			this.inicializarActualizarBindingDiaFeriado(false);

			//if(DiaFeriadoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDiaFeriado(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diaferiadoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diaferiadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diaferiadoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdMesDiaFeriadoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diaferiadoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDiaFeriado(false,false);

			this.getDiaFeriadosFK_IdMes();

			this.inicializarActualizarBindingDiaFeriado(false);

			//if(DiaFeriadoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDiaFeriado(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diaferiadoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diaferiadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diaferiadoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameDiaFeriado() {
		if(this.jInternalFrameDetalleFormDiaFeriado!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormDiaFeriado!=null) {
			this.jInternalFrameDetalleFormDiaFeriado.setVisible(false);	    			
			this.jInternalFrameDetalleFormDiaFeriado.dispose();
			this.jInternalFrameDetalleFormDiaFeriado=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoDiaFeriado!=null) {
			this.jInternalFrameReporteDinamicoDiaFeriado.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoDiaFeriado.dispose();
			this.jInternalFrameReporteDinamicoDiaFeriado=null;
		}
		
		if(this.jInternalFrameImportacionDiaFeriado!=null) {
			this.jInternalFrameImportacionDiaFeriado.setVisible(false);	    			
			this.jInternalFrameImportacionDiaFeriado.dispose();
			this.jInternalFrameImportacionDiaFeriado=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessDiaFeriado();
			
			DiaFeriadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.diaferiado,new Object(),this.diaferiadoParameterGeneral,this.diaferiadoReturnGeneral);
			
			
			if(sTipo.equals("NuevoDiaFeriado")) {
				jButtonNuevoDiaFeriadoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarDiaFeriado")) {
				jButtonDuplicarDiaFeriadoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarDiaFeriado")) {
				jButtonCopiarDiaFeriadoActionPerformed(evt);
			} else if(sTipo.equals("VerFormDiaFeriado")) {
				jButtonVerFormDiaFeriadoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarDiaFeriado")) {
				jButtonNuevoDiaFeriadoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarDiaFeriado")) {
				jButtonDuplicarDiaFeriadoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoDiaFeriado")) {
				jButtonNuevoDiaFeriadoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarDiaFeriado")) {
				jButtonDuplicarDiaFeriadoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesDiaFeriado")) {
				jButtonNuevoDiaFeriadoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarDiaFeriado")) {
				jButtonNuevoDiaFeriadoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesDiaFeriado")) {
				jButtonNuevoDiaFeriadoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarDiaFeriado")) {
				jButtonModificarDiaFeriadoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarDiaFeriado")) {
				jButtonModificarDiaFeriadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarDiaFeriado")) {
				jButtonModificarDiaFeriadoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarDiaFeriado")) {
				jButtonActualizarDiaFeriadoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarDiaFeriado")) {
				jButtonActualizarDiaFeriadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarDiaFeriado")) {
				jButtonActualizarDiaFeriadoActionPerformed(evt);
			} else if(sTipo.equals("EliminarDiaFeriado")) {
				jButtonEliminarDiaFeriadoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarDiaFeriado")) {
				jButtonEliminarDiaFeriadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarDiaFeriado")) {
				jButtonEliminarDiaFeriadoActionPerformed(evt);
			} else if(sTipo.equals("CancelarDiaFeriado")) {
				jButtonCancelarDiaFeriadoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarDiaFeriado")) {
				jButtonCancelarDiaFeriadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarDiaFeriado")) {
				jButtonCancelarDiaFeriadoActionPerformed(evt);
			} else if(sTipo.equals("CerrarDiaFeriado")) {
				jButtonCerrarDiaFeriadoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarDiaFeriado")) {
				jButtonCerrarDiaFeriadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarDiaFeriado")) {
				jButtonCerrarDiaFeriadoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarDiaFeriado")) {
				jButtonMostrarOcultarDiaFeriadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarDiaFeriado")) {
				jButtonCancelarDiaFeriadoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosDiaFeriado")) {
				jButtonGuardarCambiosDiaFeriadoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarDiaFeriado")) {
				jButtonGuardarCambiosDiaFeriadoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarDiaFeriado")) {
				jButtonCopiarDiaFeriadoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarDiaFeriado")) {
				jButtonVerFormDiaFeriadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosDiaFeriado")) {
				jButtonGuardarCambiosDiaFeriadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarDiaFeriado")) {
				jButtonCopiarDiaFeriadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormDiaFeriado")) {
				jButtonVerFormDiaFeriadoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaDiaFeriado")) {
				jButtonGuardarCambiosDiaFeriadoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarDiaFeriado")) {
				jButtonGuardarCambiosDiaFeriadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaDiaFeriado")) {
				jButtonGuardarCambiosDiaFeriadoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionDiaFeriado")) {
				jButtonRecargarInformacionDiaFeriadoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarDiaFeriado")) {
				jButtonRecargarInformacionDiaFeriadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionDiaFeriado")) {
				jButtonRecargarInformacionDiaFeriadoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresDiaFeriado")) {
				jButtonAnterioresDiaFeriadoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarDiaFeriado")) {
				jButtonAnterioresDiaFeriadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreDiaFeriado")) {
				jButtonAnterioresDiaFeriadoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesDiaFeriado")) {
				jButtonSiguientesDiaFeriadoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarDiaFeriado")) {
				jButtonSiguientesDiaFeriadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesDiaFeriado")) {
				jButtonSiguientesDiaFeriadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByDiaFeriado") || sTipo.equals("MenuItemDetalleAbrirOrderByDiaFeriado")) {
				jButtonAbrirOrderByDiaFeriadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarDiaFeriado") || sTipo.equals("MenuItemDetalleMostrarOcultarDiaFeriado")) {
				jButtonMostrarOcultarDiaFeriadoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosDiaFeriado")) {
				jButtonNuevoGuardarCambiosDiaFeriadoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarDiaFeriado")) {
				jButtonNuevoGuardarCambiosDiaFeriadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosDiaFeriado")) {
				jButtonNuevoGuardarCambiosDiaFeriadoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoDiaFeriado")) {
				jButtonCerrarReporteDinamicoDiaFeriadoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoDiaFeriado")) {
				jButtonGenerarReporteDinamicoDiaFeriadoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoDiaFeriado")) {
				
				jButtonGenerarExcelReporteDinamicoDiaFeriadoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionDiaFeriado")) {
				jButtonCerrarImportacionDiaFeriadoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionDiaFeriado")) {
				
				jButtonGenerarImportacionDiaFeriadoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionDiaFeriado")) {
				
				jButtonAbrirImportacionDiaFeriadoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesDiaFeriado")) {
				jComboBoxTiposAccionesDiaFeriadoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesDiaFeriado")) {
				jComboBoxTiposRelacionesDiaFeriadoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioDiaFeriado")) {
				jComboBoxTiposAccionesDiaFeriadoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarDiaFeriado")) {
				
				jComboBoxTiposSeleccionarDiaFeriadoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralDiaFeriado")) {
				jTextFieldValorCampoGeneralDiaFeriadoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByDiaFeriado")) {
				jButtonAbrirOrderByDiaFeriadoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarDiaFeriado")) {
				jButtonAbrirOrderByDiaFeriadoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByDiaFeriado")) {
				jButtonCerrarOrderByDiaFeriadoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idDiaFeriadoBusqueda")) {
				this.jButtonidDiaFeriadoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaDiaFeriadoUpdate")) {
				this.jButtonid_empresaDiaFeriadoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaDiaFeriadoBusqueda")) {
				this.jButtonid_empresaDiaFeriadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreDiaFeriadoBusqueda")) {
				this.jButtonnombreDiaFeriadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaDiaFeriadoBusqueda")) {
				this.jButtonfechaDiaFeriadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("diaDiaFeriadoBusqueda")) {
				this.jButtondiaDiaFeriadoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mesDiaFeriadoUpdate")) {
				this.jButtonid_mesDiaFeriadoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mesDiaFeriadoBusqueda")) {
				this.jButtonid_mesDiaFeriadoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anioDiaFeriadoUpdate")) {
				this.jButtonid_anioDiaFeriadoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anioDiaFeriadoBusqueda")) {
				this.jButtonid_anioDiaFeriadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionDiaFeriadoBusqueda")) {
				this.jButtondescripcionDiaFeriadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("esta_activoDiaFeriadoBusqueda")) {
				this.jButtonesta_activoDiaFeriadoBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdAnioDiaFeriado")) {
				this.jButtonFK_IdAnioDiaFeriadoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdMesDiaFeriado")) {
				this.jButtonFK_IdMesDiaFeriadoActionPerformed(evt);
			}
			
			;
			
			
			DiaFeriadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.diaferiado,new Object(),this.diaferiadoParameterGeneral,this.diaferiadoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessDiaFeriado();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDiaFeriadoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.diaferiado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.diaferiado);
				
				DiaFeriadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.diaferiado,new Object(),this.diaferiadoParameterGeneral,this.diaferiadoReturnGeneral);
				
				


				
				DiaFeriadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.diaferiado,new Object(),this.diaferiadoParameterGeneral,this.diaferiadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DiaFeriado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DiaFeriado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			DiaFeriado diaferiadoLocal=null;
			
			if(!this.getEsControlTabla()) {
				diaferiadoLocal=this.diaferiado;
			} else {
				diaferiadoLocal=this.diaferiadoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.diaferiado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.diaferiado);
				
				DiaFeriadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.diaferiado,new Object(),this.diaferiadoParameterGeneral,this.diaferiadoReturnGeneral);
							
				
				


				
				DiaFeriadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.diaferiado,new Object(),this.diaferiadoParameterGeneral,this.diaferiadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DiaFeriado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DiaFeriado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDiaFeriadoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDiaFeriado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diaferiadoAnterior =(DiaFeriado) this.diaferiadoLogic.getDiaFeriados().toArray()[this.jTableDatosDiaFeriado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.diaferiadoAnterior =(DiaFeriado) this.diaferiados.toArray()[this.jTableDatosDiaFeriado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
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
			
			DiaFeriadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.diaferiado,new Object(),this.diaferiadoParameterGeneral,this.diaferiadoReturnGeneral);
			
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
			
			


			
			DiaFeriadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.diaferiado,new Object(),this.diaferiadoParameterGeneral,this.diaferiadoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDiaFeriadoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.diaferiado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.diaferiado);
				
				DiaFeriadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.diaferiado,new Object(),this.diaferiadoParameterGeneral,this.diaferiadoReturnGeneral);
								
						
				


				
				DiaFeriadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.diaferiado,new Object(),this.diaferiadoParameterGeneral,this.diaferiadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DiaFeriado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DiaFeriado.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.diaferiado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.diaferiado);
				
				DiaFeriadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.diaferiado,new Object(),this.diaferiadoParameterGeneral,this.diaferiadoReturnGeneral);
								
				
				


				
				DiaFeriadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.diaferiado,new Object(),this.diaferiadoParameterGeneral,this.diaferiadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DiaFeriado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DiaFeriado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDiaFeriadoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDiaFeriado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diaferiadoAnterior =(DiaFeriado) this.diaferiadoLogic.getDiaFeriados().toArray()[this.jTableDatosDiaFeriado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.diaferiadoAnterior =(DiaFeriado) this.diaferiados.toArray()[this.jTableDatosDiaFeriado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.diaferiado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.diaferiado);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDiaFeriadoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDiaFeriado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diaferiadoAnterior =(DiaFeriado) this.diaferiadoLogic.getDiaFeriados().toArray()[this.jTableDatosDiaFeriado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.diaferiadoAnterior =(DiaFeriado) this.diaferiados.toArray()[this.jTableDatosDiaFeriado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDiaFeriadoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.diaferiado);
			
			this.actualizarInformacion("INFO_PADRE",false,this.diaferiado);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.diaferiado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.diaferiado);
				
				DiaFeriadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.diaferiado,new Object(),this.diaferiadoParameterGeneral,this.diaferiadoReturnGeneral);
							
				
				


				
				DiaFeriadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.diaferiado,new Object(),this.diaferiadoParameterGeneral,this.diaferiadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DiaFeriado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DiaFeriado.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDiaFeriadoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosDiaFeriado.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.diaferiadoAnterior =(DiaFeriado) this.diaferiadoLogic.getDiaFeriados().toArray()[this.jTableDatosDiaFeriado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.diaferiadoAnterior =(DiaFeriado) this.diaferiados.toArray()[this.jTableDatosDiaFeriado.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
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
			
			DiaFeriadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.diaferiado,new Object(),this.diaferiadoParameterGeneral,this.diaferiadoReturnGeneral);
			
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
			
			


			
			DiaFeriadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.diaferiado,new Object(),this.diaferiadoParameterGeneral,this.diaferiadoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDiaFeriadoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.diaferiado);
			
			this.actualizarInformacion("INFO_PADRE",false,this.diaferiado);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.diaferiado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.diaferiado);
				
				DiaFeriadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.diaferiado,new Object(),this.diaferiadoParameterGeneral,this.diaferiadoReturnGeneral);
								
				
				


				
				DiaFeriadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.diaferiado,new Object(),this.diaferiadoParameterGeneral,this.diaferiadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DiaFeriado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DiaFeriado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDiaFeriadoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDiaFeriado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diaferiadoAnterior =(DiaFeriado) this.diaferiadoLogic.getDiaFeriados().toArray()[this.jTableDatosDiaFeriado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.diaferiadoAnterior =(DiaFeriado) this.diaferiados.toArray()[this.jTableDatosDiaFeriado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDiaFeriadoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.diaferiado);
			
			this.actualizarInformacion("INFO_PADRE",false,this.diaferiado);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDiaFeriadoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.diaferiado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.diaferiado);
				
				DiaFeriadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.diaferiado,new Object(),this.diaferiadoParameterGeneral,this.diaferiadoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosDiaFeriado")) {
					jCheckBoxSeleccionarTodosDiaFeriadoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosDiaFeriado")) {
					jCheckBoxSeleccionadosDiaFeriadoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarDiaFeriado")) {
					
				}
				
				


				
				
				DiaFeriadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.diaferiado,new Object(),this.diaferiadoParameterGeneral,this.diaferiadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DiaFeriado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DiaFeriado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.diaferiado);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.diaferiado);
				
				DiaFeriadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.diaferiado,new Object(),this.diaferiadoParameterGeneral,this.diaferiadoReturnGeneral);
												
				
				


				
				
				DiaFeriadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.diaferiado,new Object(),this.diaferiadoParameterGeneral,this.diaferiadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DiaFeriado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DiaFeriado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDiaFeriadoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosDiaFeriado.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.diaferiadoAnterior =(DiaFeriado) this.diaferiadoLogic.getDiaFeriados().toArray()[this.jTableDatosDiaFeriado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.diaferiadoAnterior =(DiaFeriado) this.diaferiados.toArray()[this.jTableDatosDiaFeriado.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDiaFeriadoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.diaferiado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.diaferiado);
				
				DiaFeriadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.diaferiado,new Object(),this.diaferiadoParameterGeneral,this.diaferiadoReturnGeneral);
				
				
				DiaFeriadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.diaferiado,new Object(),this.diaferiadoParameterGeneral,this.diaferiadoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
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
			
			DiaFeriadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.diaferiado,new Object(),this.diaferiadoParameterGeneral,this.diaferiadoReturnGeneral);
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
			
			


			
			DiaFeriadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.diaferiado,new Object(),this.diaferiadoParameterGeneral,this.diaferiadoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDiaFeriadoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.diaferiado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.diaferiado);
				
				DiaFeriadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.diaferiado,new Object(),this.diaferiadoParameterGeneral,this.diaferiadoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				DiaFeriadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.diaferiado,new Object(),this.diaferiadoParameterGeneral,this.diaferiadoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DiaFeriado.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DiaFeriado.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.diaferiado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.diaferiado);
				
				DiaFeriadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.diaferiado,new Object(),this.diaferiadoParameterGeneral,this.diaferiadoReturnGeneral);
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
				
				


				
				DiaFeriadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.diaferiado,new Object(),this.diaferiadoParameterGeneral,this.diaferiadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DiaFeriado.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DiaFeriado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDiaFeriadoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDiaFeriado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diaferiadoAnterior =(DiaFeriado) this.diaferiadoLogic.getDiaFeriados().toArray()[this.jTableDatosDiaFeriado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.diaferiadoAnterior =(DiaFeriado) this.diaferiados.toArray()[this.jTableDatosDiaFeriado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				DiaFeriadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.diaferiado,new Object(),this.diaferiadoParameterGeneral,this.diaferiadoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarDiaFeriado")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosDiaFeriadoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosDiaFeriado.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.diaferiado =(DiaFeriado) this.diaferiadoLogic.getDiaFeriados().toArray()[this.jTableDatosDiaFeriado.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.diaferiado =(DiaFeriado) this.diaferiados.toArray()[this.jTableDatosDiaFeriado.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.diaferiado);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarDiaFeriado")) {
				
				}
				
				DiaFeriadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.diaferiado,new Object(),this.diaferiadoParameterGeneral,this.diaferiadoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			DiaFeriadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.diaferiado,new Object(),this.diaferiadoParameterGeneral,this.diaferiadoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarDiaFeriado")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosDiaFeriado.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarDiaFeriado")) {
			
			}
			
			DiaFeriadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.diaferiado,new Object(),this.diaferiadoParameterGeneral,this.diaferiadoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessDiaFeriado();
			
			DiaFeriadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.diaferiado,new Object(),this.diaferiadoParameterGeneral,this.diaferiadoReturnGeneral);
			
			if(sTipo.equals("NuevoDiaFeriado")) {
				jButtonNuevoDiaFeriadoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarDiaFeriado")) {
				jButtonDuplicarDiaFeriadoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarDiaFeriado")) {
				jButtonCopiarDiaFeriadoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormDiaFeriado")) {
				jButtonVerFormDiaFeriadoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesDiaFeriado")) {
				jButtonNuevoDiaFeriadoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarDiaFeriado")) {
				jButtonModificarDiaFeriadoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarDiaFeriado")) {
				jButtonActualizarDiaFeriadoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarDiaFeriado")) {
				jButtonEliminarDiaFeriadoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaDiaFeriado")) {
				jButtonGuardarCambiosDiaFeriadoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarDiaFeriado")) {
				jButtonCancelarDiaFeriadoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarDiaFeriado")) {
				jButtonCerrarDiaFeriadoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosDiaFeriado")) {
				jButtonGuardarCambiosDiaFeriadoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosDiaFeriado")) {
				jButtonNuevoGuardarCambiosDiaFeriadoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByDiaFeriado")) {
				jButtonAbrirOrderByDiaFeriadoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionDiaFeriado")) {
				jButtonRecargarInformacionDiaFeriadoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresDiaFeriado")) {
				jButtonAnterioresDiaFeriadoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesDiaFeriado")) {
				jButtonSiguientesDiaFeriadoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idDiaFeriadoBusqueda")) {
				this.jButtonidDiaFeriadoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaDiaFeriadoUpdate")) {
				this.jButtonid_empresaDiaFeriadoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaDiaFeriadoBusqueda")) {
				this.jButtonid_empresaDiaFeriadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreDiaFeriadoBusqueda")) {
				this.jButtonnombreDiaFeriadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaDiaFeriadoBusqueda")) {
				this.jButtonfechaDiaFeriadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("diaDiaFeriadoBusqueda")) {
				this.jButtondiaDiaFeriadoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mesDiaFeriadoUpdate")) {
				this.jButtonid_mesDiaFeriadoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mesDiaFeriadoBusqueda")) {
				this.jButtonid_mesDiaFeriadoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anioDiaFeriadoUpdate")) {
				this.jButtonid_anioDiaFeriadoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anioDiaFeriadoBusqueda")) {
				this.jButtonid_anioDiaFeriadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionDiaFeriadoBusqueda")) {
				this.jButtondescripcionDiaFeriadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("esta_activoDiaFeriadoBusqueda")) {
				this.jButtonesta_activoDiaFeriadoBusquedaActionPerformed(evt);
			}
			
			DiaFeriadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.diaferiado,new Object(),this.diaferiadoParameterGeneral,this.diaferiadoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessDiaFeriado();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			DiaFeriadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.diaferiado,new Object(),this.diaferiadoParameterGeneral,this.diaferiadoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameDiaFeriado")) {
				closingInternalFrameDiaFeriado();
				
			} else if(sTipo.equals("jButtonCancelarDiaFeriado")) {
				JInternalFrameBase jInternalFrameDetalleFormDiaFeriado = (JInternalFrameBase)evt.getSource();
	            	
	            DiaFeriadoBeanSwingJInternalFrame jInternalFrameParent=(DiaFeriadoBeanSwingJInternalFrame)jInternalFrameDetalleFormDiaFeriado.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarDiaFeriadoActionPerformed(null);
			}
			
			DiaFeriadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.diaferiado,new Object(),this.diaferiadoParameterGeneral,this.diaferiadoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormDiaFeriado(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormDiaFeriado(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormDiaFeriado(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.diaferiado)) {
			if(!esControlTabla) {
				if(DiaFeriadoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualDiaFeriado(this.diaferiado,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysDiaFeriado(this.diaferiado);			
				}
				
				if(this.diaferiadoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualDiaFeriado(this.diaferiado,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.diaferiadoReturnGeneral=diaferiadoLogic.procesarEventosDiaFeriadosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.diaferiadoLogic.getDiaFeriados(),this.diaferiado,this.diaferiadoParameterGeneral,this.isEsNuevoDiaFeriado,classes);//this.diaferiadoLogic.getDiaFeriado()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanDiaFeriado(this.diaferiadoReturnGeneral,this.diaferiadoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.diaferiadoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanDiaFeriado(classes,this.diaferiadoReturnGeneral,this.diaferiadoBean,false);
					}
						
					if(this.diaferiadoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyDiaFeriado(this.diaferiadoReturnGeneral.getDiaFeriado());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioDiaFeriado(this.diaferiadoReturnGeneral.getDiaFeriado());	
					}
						
					if(this.diaferiadoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioDiaFeriado(this.diaferiadoReturnGeneral.getDiaFeriado(),classes);//this.diaferiadoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioDiaFeriado(this.diaferiado,classes);//this.diaferiadoBean);									
				}
			
				if(DiaFeriadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualDiaFeriado(this.diaferiado,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysDiaFeriado(this.diaferiado);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.diaferiadoAnterior!=null) {
						this.diaferiado=this.diaferiadoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.diaferiadoReturnGeneral=diaferiadoLogic.procesarEventosDiaFeriadosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.diaferiadoLogic.getDiaFeriados(),this.diaferiado,this.diaferiadoParameterGeneral,this.isEsNuevoDiaFeriado,classes);//this.diaferiadoLogic.getDiaFeriado()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.diaferiadoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.diaferiadoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.diaferiadoReturnGeneral.getDiaFeriado(),diaferiadoLogic.getDiaFeriados());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.diaferiadoReturnGeneral.getDiaFeriado(),this.diaferiados);
				}
				//ARCHITECTURE
				
				//this.jTableDatosDiaFeriado.repaint();
				
				//((AbstractTableModel) this.jTableDatosDiaFeriado.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosDiaFeriado();
			}
		}
	}
	
	public void actualizarVisualTableDatosDiaFeriado() throws Exception {
		
		DiaFeriadoModel diaferiadoModel=(DiaFeriadoModel)this.jTableDatosDiaFeriado.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			diaferiadoModel.diaferiados=this.diaferiadoLogic.getDiaFeriados();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			diaferiadoModel.diaferiados=this.diaferiados;
		}
		
		
		((DiaFeriadoModel) this.jTableDatosDiaFeriado.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaDiaFeriado() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getdiaferiadoAnterior(),this.diaferiadoLogic.getDiaFeriados());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getdiaferiadoAnterior(),this.diaferiados);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosDiaFeriado();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioDiaFeriado(DiaFeriado diaferiado,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
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
										
				DiaFeriadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.diaferiado,new Object(),generalEntityParameterGeneral,this.diaferiadoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.diaferiadoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=DiaFeriadoConstantesFunciones.getClassesRelationshipsOfDiaFeriado(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=DiaFeriadoConstantesFunciones.getClassesRelationshipsFromStringsOfDiaFeriado(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormDiaFeriado(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				DiaFeriadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.diaferiado,new Object(),generalEntityParameterGeneral,this.diaferiadoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioDiaFeriado(DiaFeriadoBean diaferiadoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanDiaFeriado(ArrayList<Classe> classes,DiaFeriadoReturnGeneral diaferiadoReturnGeneral,DiaFeriadoBean diaferiadoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualDiaFeriado(DiaFeriado diaferiado,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.diaferiado)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormDiaFeriado = new DiaFeriadoDetalleFormJInternalFrame(jDesktopPane,this.diaferiadoSessionBean.getConGuardarRelaciones(),this.diaferiadoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormDiaFeriado);
		this.jInternalFrameDetalleFormDiaFeriado.setVisible(false);
		this.jInternalFrameDetalleFormDiaFeriado.setSelected(false);						
		
		this.jInternalFrameDetalleFormDiaFeriado.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormDiaFeriado.diaferiadoLogic=this.diaferiadoLogic;
		
		this.cargarCombosFrameForeignKeyDiaFeriado("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleDiaFeriado();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleDiaFeriado();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyDiaFeriado("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyDiaFeriado();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormDiaFeriado.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarDiaFeriado"));
		
		this.jInternalFrameDetalleFormDiaFeriado.jButtonModificarDiaFeriado.addActionListener(new ButtonActionListener(this,"ModificarDiaFeriado"));

		
		this.jInternalFrameDetalleFormDiaFeriado.jButtonModificarToolBarDiaFeriado.addActionListener(new ButtonActionListener(this,"ModificarToolBarDiaFeriado"));
					
		this.jInternalFrameDetalleFormDiaFeriado.jMenuItemModificarDiaFeriado.addActionListener(new ButtonActionListener(this,"MenuItemModificarDiaFeriado"));		
		
		
		
		this.jInternalFrameDetalleFormDiaFeriado.jButtonActualizarDiaFeriado.addActionListener (new ButtonActionListener(this,"ActualizarDiaFeriado"));
		
		
		this.jInternalFrameDetalleFormDiaFeriado.jButtonActualizarToolBarDiaFeriado.addActionListener(new ButtonActionListener(this,"ActualizarToolBarDiaFeriado"));
						
		this.jInternalFrameDetalleFormDiaFeriado.jMenuItemActualizarDiaFeriado.addActionListener (new ButtonActionListener(this,"MenuItemActualizarDiaFeriado"));		
		
		
		
		this.jInternalFrameDetalleFormDiaFeriado.jButtonEliminarDiaFeriado.addActionListener (new ButtonActionListener(this,"EliminarDiaFeriado"));
		
		
		this.jInternalFrameDetalleFormDiaFeriado.jButtonEliminarToolBarDiaFeriado.addActionListener (new ButtonActionListener(this,"EliminarToolBarDiaFeriado"));
								
		this.jInternalFrameDetalleFormDiaFeriado.jMenuItemEliminarDiaFeriado.addActionListener (new ButtonActionListener(this,"MenuItemEliminarDiaFeriado"));		
		
		
		
		this.jInternalFrameDetalleFormDiaFeriado.jButtonCancelarDiaFeriado.addActionListener (new ButtonActionListener(this,"CancelarDiaFeriado"));
		
		
		this.jInternalFrameDetalleFormDiaFeriado.jButtonCancelarToolBarDiaFeriado.addActionListener (new ButtonActionListener(this,"CancelarToolBarDiaFeriado"));
					
		this.jInternalFrameDetalleFormDiaFeriado.jMenuItemCancelarDiaFeriado.addActionListener (new ButtonActionListener(this,"MenuItemCancelarDiaFeriado"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormDiaFeriado.jMenuItemDetalleCerrarDiaFeriado.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarDiaFeriado"));		
		
		
		
		this.jInternalFrameDetalleFormDiaFeriado.jButtonGuardarCambiosToolBarDiaFeriado.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDiaFeriado"));
		
		
		
		this.jInternalFrameDetalleFormDiaFeriado.jButtonGuardarCambiosToolBarDiaFeriado.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDiaFeriado"));
		
		
		
		this.jInternalFrameDetalleFormDiaFeriado.jComboBoxTiposAccionesFormularioDiaFeriado.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioDiaFeriado"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiaFeriado.jButtonidDiaFeriadoBusqueda.addActionListener(new ButtonActionListener(this,"idDiaFeriadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDiaFeriado.jButtonid_empresaDiaFeriadoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDiaFeriadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiaFeriado.jButtonid_empresaDiaFeriadoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDiaFeriadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiaFeriado.jButtonnombreDiaFeriadoBusqueda.addActionListener(new ButtonActionListener(this,"nombreDiaFeriadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiaFeriado.jButtonfechaDiaFeriadoBusqueda.addActionListener(new ButtonActionListener(this,"fechaDiaFeriadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiaFeriado.jButtondiaDiaFeriadoBusqueda.addActionListener(new ButtonActionListener(this,"diaDiaFeriadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDiaFeriado.jButtonid_mesDiaFeriadoUpdate.addActionListener(new ButtonActionListener(this,"id_mesDiaFeriadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiaFeriado.jButtonid_mesDiaFeriadoBusqueda.addActionListener(new ButtonActionListener(this,"id_mesDiaFeriadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDiaFeriado.jButtonid_anioDiaFeriadoUpdate.addActionListener(new ButtonActionListener(this,"id_anioDiaFeriadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiaFeriado.jButtonid_anioDiaFeriadoBusqueda.addActionListener(new ButtonActionListener(this,"id_anioDiaFeriadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiaFeriado.jButtondescripcionDiaFeriadoBusqueda.addActionListener(new ButtonActionListener(this,"descripcionDiaFeriadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiaFeriado.jButtonesta_activoDiaFeriadoBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoDiaFeriadoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormDiaFeriado.jTabbedPaneRelacionesDiaFeriado.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesDiaFeriado"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameDiaFeriado"));
		
		if(this.jInternalFrameDetalleFormDiaFeriado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDiaFeriado.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarDiaFeriado"));
		}
		
		this.jTableDatosDiaFeriado.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarDiaFeriado"));
		
		this.jTableDatosDiaFeriado.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarDiaFeriado"));
		
		this.jButtonNuevoDiaFeriado.addActionListener(new ButtonActionListener(this,"NuevoDiaFeriado"));
		
		this.jButtonDuplicarDiaFeriado.addActionListener(new ButtonActionListener(this,"DuplicarDiaFeriado"));
		
		this.jButtonCopiarDiaFeriado.addActionListener(new ButtonActionListener(this,"CopiarDiaFeriado"));
		
		this.jButtonVerFormDiaFeriado.addActionListener(new ButtonActionListener(this,"VerFormDiaFeriado"));
		
		
		this.jButtonNuevoToolBarDiaFeriado.addActionListener(new ButtonActionListener(this,"NuevoToolBarDiaFeriado"));
			
		this.jButtonDuplicarToolBarDiaFeriado.addActionListener(new ButtonActionListener(this,"DuplicarToolBarDiaFeriado"));
			
		this.jMenuItemNuevoDiaFeriado.addActionListener (new ButtonActionListener(this,"MenuItemNuevoDiaFeriado"));
			
		this.jMenuItemDuplicarDiaFeriado.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarDiaFeriado"));		
		
		
		this.jButtonNuevoRelacionesDiaFeriado.addActionListener (new ButtonActionListener(this,"NuevoRelacionesDiaFeriado"));
		
		
		this.jButtonNuevoRelacionesToolBarDiaFeriado.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarDiaFeriado"));
			
		this.jMenuItemNuevoRelacionesDiaFeriado.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesDiaFeriado"));		
		
		
		if(this.jInternalFrameDetalleFormDiaFeriado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDiaFeriado.jButtonModificarDiaFeriado.addActionListener(new ButtonActionListener(this,"ModificarDiaFeriado"));
		}
		
		
		if(this.jInternalFrameDetalleFormDiaFeriado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDiaFeriado.jButtonModificarToolBarDiaFeriado.addActionListener(new ButtonActionListener(this,"ModificarToolBarDiaFeriado"));
			
			this.jInternalFrameDetalleFormDiaFeriado.jMenuItemModificarDiaFeriado.addActionListener(new ButtonActionListener(this,"MenuItemModificarDiaFeriado"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDiaFeriado!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormDiaFeriado.jButtonActualizarDiaFeriado.addActionListener (new ButtonActionListener(this,"ActualizarDiaFeriado"));
		}
		
		
		if(this.jInternalFrameDetalleFormDiaFeriado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDiaFeriado.jButtonActualizarToolBarDiaFeriado.addActionListener(new ButtonActionListener(this,"ActualizarToolBarDiaFeriado"));
				
			this.jInternalFrameDetalleFormDiaFeriado.jMenuItemActualizarDiaFeriado.addActionListener (new ButtonActionListener(this,"MenuItemActualizarDiaFeriado"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDiaFeriado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDiaFeriado.jButtonEliminarDiaFeriado.addActionListener (new ButtonActionListener(this,"EliminarDiaFeriado"));
		}
		
		
		if(this.jInternalFrameDetalleFormDiaFeriado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDiaFeriado.jButtonEliminarToolBarDiaFeriado.addActionListener (new ButtonActionListener(this,"EliminarToolBarDiaFeriado"));
						
			this.jInternalFrameDetalleFormDiaFeriado.jMenuItemEliminarDiaFeriado.addActionListener (new ButtonActionListener(this,"MenuItemEliminarDiaFeriado"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDiaFeriado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDiaFeriado.jButtonCancelarDiaFeriado.addActionListener (new ButtonActionListener(this,"CancelarDiaFeriado"));
		}
		
		
		if(this.jInternalFrameDetalleFormDiaFeriado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDiaFeriado.jButtonCancelarToolBarDiaFeriado.addActionListener (new ButtonActionListener(this,"CancelarToolBarDiaFeriado"));
			
			this.jInternalFrameDetalleFormDiaFeriado.jMenuItemCancelarDiaFeriado.addActionListener (new ButtonActionListener(this,"MenuItemCancelarDiaFeriado"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarDiaFeriado.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarDiaFeriado"));		
		
		
		this.jButtonCerrarDiaFeriado.addActionListener (new ButtonActionListener(this,"CerrarDiaFeriado"));
		
		
		this.jButtonCerrarToolBarDiaFeriado.addActionListener (new ButtonActionListener(this,"CerrarToolBarDiaFeriado"));
			
		this.jMenuItemCerrarDiaFeriado.addActionListener (new ButtonActionListener(this,"MenuItemCerrarDiaFeriado"));
			
		if(this.jInternalFrameDetalleFormDiaFeriado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDiaFeriado.jMenuItemDetalleCerrarDiaFeriado.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarDiaFeriado"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDiaFeriado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDiaFeriado.jButtonGuardarCambiosDiaFeriado.addActionListener (new ButtonActionListener(this,"GuardarCambiosDiaFeriado"));
		}
		
		
		if(this.jInternalFrameDetalleFormDiaFeriado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDiaFeriado.jButtonGuardarCambiosToolBarDiaFeriado.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDiaFeriado"));
		}
		
		this.jButtonCopiarToolBarDiaFeriado.addActionListener (new ButtonActionListener(this,"CopiarToolBarDiaFeriado"));
			
		this.jButtonVerFormToolBarDiaFeriado.addActionListener (new ButtonActionListener(this,"VerFormToolBarDiaFeriado"));
		
		this.jMenuItemGuardarCambiosDiaFeriado.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosDiaFeriado"));
			
		this.jMenuItemCopiarDiaFeriado.addActionListener (new ButtonActionListener(this,"MenuItemCopiarDiaFeriado"));		
		
		this.jMenuItemVerFormDiaFeriado.addActionListener (new ButtonActionListener(this,"MenuItemVerFormDiaFeriado"));		
		
		
		this.jButtonGuardarCambiosTablaDiaFeriado.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaDiaFeriado"));
		
		
		this.jButtonGuardarCambiosTablaToolBarDiaFeriado.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarDiaFeriado"));
			
		this.jMenuItemGuardarCambiosTablaDiaFeriado.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaDiaFeriado"));		
		
		
		
		this.jButtonRecargarInformacionDiaFeriado.addActionListener (new ButtonActionListener(this,"RecargarInformacionDiaFeriado"));
					
		this.jButtonRecargarInformacionToolBarDiaFeriado.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarDiaFeriado"));
		
		this.jMenuItemRecargarInformacionDiaFeriado.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionDiaFeriado"));		
		
		
		
		this.jButtonAnterioresDiaFeriado.addActionListener (new ButtonActionListener(this,"AnterioresDiaFeriado"));
		
		
		this.jButtonAnterioresToolBarDiaFeriado.addActionListener (new ButtonActionListener(this,"AnterioresToolBarDiaFeriado"));
		
		this.jMenuItemAnterioresDiaFeriado.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresDiaFeriado"));		
		
		
		this.jButtonSiguientesDiaFeriado.addActionListener (new ButtonActionListener(this,"SiguientesDiaFeriado"));
		
		
		this.jButtonSiguientesToolBarDiaFeriado.addActionListener (new ButtonActionListener(this,"SiguientesToolBarDiaFeriado"));
			
		this.jMenuItemSiguientesDiaFeriado.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesDiaFeriado"));
			
		this.jMenuItemAbrirOrderByDiaFeriado.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByDiaFeriado"));
			
		this.jMenuItemMostrarOcultarDiaFeriado.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarDiaFeriado"));
			
		this.jMenuItemDetalleAbrirOrderByDiaFeriado.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByDiaFeriado"));
			
		this.jMenuItemDetalleMostarOcultarDiaFeriado.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarDiaFeriado"));		
		
		
		this.jButtonNuevoGuardarCambiosDiaFeriado.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosDiaFeriado"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarDiaFeriado.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarDiaFeriado"));
			
		this.jMenuItemNuevoGuardarCambiosDiaFeriado.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosDiaFeriado"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosDiaFeriado.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosDiaFeriado"));

		this.jCheckBoxSeleccionadosDiaFeriado.addItemListener(new CheckBoxItemListener(this,"SeleccionadosDiaFeriado"));
		
		if(this.jInternalFrameDetalleFormDiaFeriado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDiaFeriado.jComboBoxTiposAccionesFormularioDiaFeriado.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioDiaFeriado"));
		}
		
		
		this.jComboBoxTiposRelacionesDiaFeriado.addActionListener (new ButtonActionListener(this,"TiposRelacionesDiaFeriado"));
			
		this.jComboBoxTiposAccionesDiaFeriado.addActionListener (new ButtonActionListener(this,"TiposAccionesDiaFeriado"));
					
		this.jComboBoxTiposSeleccionarDiaFeriado.addActionListener (new ButtonActionListener(this,"TiposSeleccionarDiaFeriado"));
			
		this.jTextFieldValorCampoGeneralDiaFeriado.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralDiaFeriado"));		
		
		
		if(this.jInternalFrameDetalleFormDiaFeriado!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiaFeriado.jButtonidDiaFeriadoBusqueda.addActionListener(new ButtonActionListener(this,"idDiaFeriadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDiaFeriado.jButtonid_empresaDiaFeriadoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDiaFeriadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiaFeriado.jButtonid_empresaDiaFeriadoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDiaFeriadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiaFeriado.jButtonnombreDiaFeriadoBusqueda.addActionListener(new ButtonActionListener(this,"nombreDiaFeriadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiaFeriado.jButtonfechaDiaFeriadoBusqueda.addActionListener(new ButtonActionListener(this,"fechaDiaFeriadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiaFeriado.jButtondiaDiaFeriadoBusqueda.addActionListener(new ButtonActionListener(this,"diaDiaFeriadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDiaFeriado.jButtonid_mesDiaFeriadoUpdate.addActionListener(new ButtonActionListener(this,"id_mesDiaFeriadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiaFeriado.jButtonid_mesDiaFeriadoBusqueda.addActionListener(new ButtonActionListener(this,"id_mesDiaFeriadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDiaFeriado.jButtonid_anioDiaFeriadoUpdate.addActionListener(new ButtonActionListener(this,"id_anioDiaFeriadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiaFeriado.jButtonid_anioDiaFeriadoBusqueda.addActionListener(new ButtonActionListener(this,"id_anioDiaFeriadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiaFeriado.jButtondescripcionDiaFeriadoBusqueda.addActionListener(new ButtonActionListener(this,"descripcionDiaFeriadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiaFeriado.jButtonesta_activoDiaFeriadoBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoDiaFeriadoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdAnioDiaFeriado.addActionListener(new ButtonActionListener(this,"FK_IdAnioDiaFeriado"));

			this.jButtonFK_IdMesDiaFeriado.addActionListener(new ButtonActionListener(this,"FK_IdMesDiaFeriado"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoDiaFeriado!=null) {
				this.jInternalFrameReporteDinamicoDiaFeriado.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDiaFeriado"));
				this.jInternalFrameReporteDinamicoDiaFeriado.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDiaFeriado"));
				this.jInternalFrameReporteDinamicoDiaFeriado.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDiaFeriado"));
			}
			
			//this.jButtonCerrarReporteDinamicoDiaFeriado.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDiaFeriado"));				
			//this.jButtonGenerarReporteDinamicoDiaFeriado.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDiaFeriado"));
			//this.jButtonGenerarExcelReporteDinamicoDiaFeriado.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDiaFeriado"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionDiaFeriado!=null) {
				this.jInternalFrameImportacionDiaFeriado.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionDiaFeriado"));
				this.jInternalFrameImportacionDiaFeriado.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionDiaFeriado"));
				this.jInternalFrameImportacionDiaFeriado.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionDiaFeriado"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByDiaFeriado.addActionListener (new ButtonActionListener(this,"AbrirOrderByDiaFeriado"));
			
			this.jButtonAbrirOrderByToolBarDiaFeriado.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarDiaFeriado"));			
			
			if(this.jInternalFrameOrderByDiaFeriado!=null) {
				this.jInternalFrameOrderByDiaFeriado.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByDiaFeriado"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormDiaFeriado!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormDiaFeriado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDiaFeriado.jTabbedPaneRelacionesDiaFeriado.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesDiaFeriado"));
		
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
            		closingInternalFrameDiaFeriado();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormDiaFeriado.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormDiaFeriado = (JInternalFrameBase)event.getSource();
	            	
	            DiaFeriadoBeanSwingJInternalFrame jInternalFrameParent=(DiaFeriadoBeanSwingJInternalFrame)jInternalFrameDetalleFormDiaFeriado.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarDiaFeriadoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosDiaFeriado.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosDiaFeriadoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosDiaFeriado.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosDiaFeriado.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoDiaFeriado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDiaFeriadoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarDiaFeriado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDiaFeriadoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoDiaFeriado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDiaFeriadoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoDiaFeriado";
		inputMap = this.jButtonNuevoDiaFeriado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoDiaFeriado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoDiaFeriadoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesDiaFeriado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDiaFeriadoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarDiaFeriado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDiaFeriadoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesDiaFeriado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDiaFeriadoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesDiaFeriado";
		inputMap = this.jButtonNuevoRelacionesDiaFeriado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesDiaFeriado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoDiaFeriadoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarDiaFeriado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDiaFeriadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarDiaFeriado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDiaFeriadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarDiaFeriado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDiaFeriadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarDiaFeriado";
		inputMap = this.jButtonModificarDiaFeriado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarDiaFeriado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarDiaFeriadoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarDiaFeriado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDiaFeriadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarDiaFeriado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDiaFeriadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarDiaFeriado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDiaFeriadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarDiaFeriado";
		inputMap = this.jButtonActualizarDiaFeriado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarDiaFeriado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarDiaFeriadoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarDiaFeriado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDiaFeriadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarDiaFeriado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDiaFeriadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarDiaFeriado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDiaFeriadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarDiaFeriado";
		inputMap = this.jButtonEliminarDiaFeriado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarDiaFeriado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarDiaFeriadoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarDiaFeriado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDiaFeriadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarDiaFeriado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDiaFeriadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarDiaFeriado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDiaFeriadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarDiaFeriado";
		inputMap = this.jButtonCancelarDiaFeriado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarDiaFeriado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarDiaFeriadoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarDiaFeriado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDiaFeriadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarDiaFeriado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDiaFeriadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarDiaFeriado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDiaFeriadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarDiaFeriado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarDiaFeriadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarDiaFeriadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarDiaFeriado";
		inputMap = this.jButtonCerrarDiaFeriado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarDiaFeriado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarDiaFeriadoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormDiaFeriado.jButtonGuardarCambiosDiaFeriado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDiaFeriadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarDiaFeriado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDiaFeriadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosDiaFeriado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDiaFeriadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaDiaFeriado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDiaFeriadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarDiaFeriado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDiaFeriadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaDiaFeriado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDiaFeriadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosDiaFeriado";
		inputMap = this.jInternalFrameDetalleFormDiaFeriado.jButtonGuardarCambiosDiaFeriado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormDiaFeriado.jButtonGuardarCambiosDiaFeriado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosDiaFeriadoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionDiaFeriado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDiaFeriadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarDiaFeriado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDiaFeriadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionDiaFeriado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDiaFeriadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresDiaFeriado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDiaFeriadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarDiaFeriado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDiaFeriadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresDiaFeriado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDiaFeriadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesDiaFeriado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDiaFeriadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarDiaFeriado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDiaFeriadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesDiaFeriado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDiaFeriadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosDiaFeriado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDiaFeriadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarDiaFeriado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDiaFeriadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosDiaFeriado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDiaFeriadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosDiaFeriado.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosDiaFeriadoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesDiaFeriado.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesDiaFeriadoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarDiaFeriado.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarDiaFeriadoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralDiaFeriado.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralDiaFeriadoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiaFeriado.jButtonidDiaFeriadoBusqueda.addActionListener(new ButtonActionListener(this,"idDiaFeriadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDiaFeriado.jButtonid_empresaDiaFeriadoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDiaFeriadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiaFeriado.jButtonid_empresaDiaFeriadoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDiaFeriadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiaFeriado.jButtonnombreDiaFeriadoBusqueda.addActionListener(new ButtonActionListener(this,"nombreDiaFeriadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiaFeriado.jButtonfechaDiaFeriadoBusqueda.addActionListener(new ButtonActionListener(this,"fechaDiaFeriadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiaFeriado.jButtondiaDiaFeriadoBusqueda.addActionListener(new ButtonActionListener(this,"diaDiaFeriadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDiaFeriado.jButtonid_mesDiaFeriadoUpdate.addActionListener(new ButtonActionListener(this,"id_mesDiaFeriadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiaFeriado.jButtonid_mesDiaFeriadoBusqueda.addActionListener(new ButtonActionListener(this,"id_mesDiaFeriadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDiaFeriado.jButtonid_anioDiaFeriadoUpdate.addActionListener(new ButtonActionListener(this,"id_anioDiaFeriadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiaFeriado.jButtonid_anioDiaFeriadoBusqueda.addActionListener(new ButtonActionListener(this,"id_anioDiaFeriadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiaFeriado.jButtondescripcionDiaFeriadoBusqueda.addActionListener(new ButtonActionListener(this,"descripcionDiaFeriadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiaFeriado.jButtonesta_activoDiaFeriadoBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoDiaFeriadoBusqueda"));
		
		
		this.jButtonFK_IdAnioDiaFeriado.addActionListener(new ButtonActionListener(this,"FK_IdAnioDiaFeriado"));

		this.jButtonFK_IdMesDiaFeriado.addActionListener(new ButtonActionListener(this,"FK_IdMesDiaFeriado"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoDiaFeriado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoDiaFeriadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoDiaFeriado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoDiaFeriadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoDiaFeriado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoDiaFeriadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionDiaFeriado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionDiaFeriadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionDiaFeriado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionDiaFeriadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionDiaFeriado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionDiaFeriadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarDiaFeriadoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarDiaFeriado.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosDiaFeriado(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(DiaFeriado diaferiadoAux:this.diaferiadoLogic.getDiaFeriados()) {
					diaferiadoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DiaFeriado diaferiadoAux:diaferiados) {
					diaferiadoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosDiaFeriadoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingDiaFeriado(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(DiaFeriado diaferiadoAux:this.diaferiadoLogic.getDiaFeriados()) {
						diaferiadoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DiaFeriado diaferiadoAux:diaferiados) {
						diaferiadoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(DiaFeriado diaferiadoAux:this.diaferiadoLogic.getDiaFeriados()) {
					
						if(sTipoSeleccionar.equals(DiaFeriadoConstantesFunciones.LABEL_ESTAACTIVO)) {
							existe=true;
							diaferiadoAux.setesta_activo(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DiaFeriado diaferiadoAux:diaferiados) {
						
						if(sTipoSeleccionar.equals(DiaFeriadoConstantesFunciones.LABEL_ESTAACTIVO)) {
							existe=true;
							diaferiadoAux.setesta_activo(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaDiaFeriado(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosDiaFeriado.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosDiaFeriado.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosDiaFeriado,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosDiaFeriadoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingDiaFeriado(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosDiaFeriado.getSelectedRows();
			
			DiaFeriado diaferiadoLocal=new DiaFeriado();
			
			//this.seleccionarTodosDiaFeriado(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					diaferiadoLocal =(DiaFeriado) this.diaferiadoLogic.getDiaFeriados().toArray()[this.jTableDatosDiaFeriado.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					diaferiadoLocal =(DiaFeriado) this.diaferiados.toArray()[this.jTableDatosDiaFeriado.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				diaferiadoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(DiaFeriado diaferiadoAux:this.diaferiadoLogic.getDiaFeriados()) {
						diaferiadoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DiaFeriado diaferiadoAux:diaferiados) {
						diaferiadoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaDiaFeriado(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosDiaFeriado.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosDiaFeriado.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosDiaFeriado,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualDiaFeriadoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarDiaFeriadoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralDiaFeriadoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingDiaFeriado(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralDiaFeriado.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(DiaFeriado diaferiadoAux:this.diaferiadoLogic.getDiaFeriados()) {
				
						if(sTipoSeleccionar.equals(DiaFeriadoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							diaferiadoAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DiaFeriadoConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							diaferiadoAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DiaFeriadoConstantesFunciones.LABEL_DIA)) {
							existe=true;
							diaferiadoAux.setdia(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DiaFeriadoConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							diaferiadoAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DiaFeriado diaferiadoAux:diaferiados) {
					
						if(sTipoSeleccionar.equals(DiaFeriadoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							diaferiadoAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DiaFeriadoConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							diaferiadoAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DiaFeriadoConstantesFunciones.LABEL_DIA)) {
							existe=true;
							diaferiadoAux.setdia(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DiaFeriadoConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							diaferiadoAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaDiaFeriado(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesDiaFeriadoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingDiaFeriado(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioDiaFeriado=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesDiaFeriado.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormDiaFeriado.jComboBoxTiposAccionesFormularioDiaFeriado.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteDiaFeriado) {				
					conSplash=true;//false;										
					
					//this.startProcessDiaFeriado(conSplash);
				
					this.generarReporteDiaFeriadosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDiaFeriado.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDiaFeriado.jComboBoxTiposAccionesFormularioDiaFeriado.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoDiaFeriadosSeleccionados();
				//this.jComboBoxTiposAccionesDiaFeriado.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoDiaFeriadosSeleccionados(false);
				//this.jComboBoxTiposAccionesDiaFeriado.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoDiaFeriadosSeleccionados(true);
				//this.jComboBoxTiposAccionesDiaFeriado.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessDiaFeriado();
				
				this.exportarDiaFeriadosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDiaFeriado.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDiaFeriado.jComboBoxTiposAccionesFormularioDiaFeriado.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionDiaFeriados();
				//this.importarDiaFeriados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDiaFeriado.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDiaFeriado.jComboBoxTiposAccionesFormularioDiaFeriado.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessDiaFeriado();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelDiaFeriadosSeleccionados();
				//this.jComboBoxTiposAccionesDiaFeriado.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Dia Feriado", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessDiaFeriado();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoDiaFeriado)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyDiaFeriado(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Dia Feriado",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDiaFeriado.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDiaFeriado.jComboBoxTiposAccionesFormularioDiaFeriado.setSelectedIndex(0);					
				}	
			} 			
			else if(DiaFeriadoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteDiaFeriado) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessDiaFeriado(conSplash);
					
						//this.actualizarParametrosGeneralDiaFeriado();
						
						this.generarReporteProcesoAccionDiaFeriadosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesDiaFeriado.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormDiaFeriado.jComboBoxTiposAccionesFormularioDiaFeriado.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(DiaFeriadoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Dia FeriadoS SELECCIONADOS?", "MANTENIMIENTO DE Dia Feriado", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessDiaFeriado();
				
						this.actualizarParametrosGeneralDiaFeriado();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.diaferiadoReturnGeneral=diaferiadoLogic.procesarAccionDiaFeriadosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.diaferiadoLogic.getDiaFeriados(),this.diaferiadoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarDiaFeriadoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesDiaFeriado.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormDiaFeriado.jComboBoxTiposAccionesFormularioDiaFeriado.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralDiaFeriado();
					
					DiaFeriadoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarDiaFeriadoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesDiaFeriado.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormDiaFeriado.jComboBoxTiposAccionesFormularioDiaFeriado.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessDiaFeriado(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesDiaFeriadoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessDiaFeriado();
			
			if(this.jInternalFrameDetalleFormDiaFeriado==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<DiaFeriado> diaferiadosSeleccionados=new ArrayList<DiaFeriado>();		
			DiaFeriado diaferiado=new DiaFeriado();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingDiaFeriado(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesDiaFeriado.getSelectedItem();
			
			
			
			
			diaferiadosSeleccionados=this.getDiaFeriadosSeleccionados(true);
			//this.sTipoAccion;
			
			if(diaferiadosSeleccionados.size()==1) {
				for(DiaFeriado diaferiadoAux:diaferiadosSeleccionados) {
					diaferiado=diaferiadoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessDiaFeriado();
			
      		//this.finishProcessDiaFeriado(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarDiaFeriadoReturnGeneral() throws Exception {
		if(this.diaferiadoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.diaferiadoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.diaferiadoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.diaferiadoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.diaferiadoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.diaferiadoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingDiaFeriado(false);
		}
		
		if(this.diaferiadoReturnGeneral.getConRetornoLista() || this.diaferiadoReturnGeneral.getConRetornoObjeto()) {
			if(this.diaferiadoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.diaferiadoLogic.setDiaFeriados(this.diaferiadoReturnGeneral.getDiaFeriados());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.diaferiadoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.diaferiadoLogic.setDiaFeriado(this.diaferiadoReturnGeneral.getDiaFeriado());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingDiaFeriado(false);
		}
	}
	
	public void actualizarParametrosGeneralDiaFeriado() throws Exception {
		
		
	}
	
	public ArrayList<DiaFeriado> getDiaFeriadosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<DiaFeriado> diaferiadosSeleccionados=new ArrayList<DiaFeriado>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioDiaFeriado) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(DiaFeriado diaferiadoAux:diaferiadoLogic.getDiaFeriados()) {
					if(diaferiadoAux.getIsSelected()) {
						diaferiadosSeleccionados.add(diaferiadoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DiaFeriado diaferiadoAux:this.diaferiados) {
					if(diaferiadoAux.getIsSelected()) {
						diaferiadosSeleccionados.add(diaferiadoAux);				
					}
				}
			}
			
			if(diaferiadosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						diaferiadosSeleccionados.addAll(this.diaferiadoLogic.getDiaFeriados());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						diaferiadosSeleccionados.addAll(this.diaferiados);				
					}
				}
			}
		} else {
			diaferiadosSeleccionados.add(this.diaferiado);
		}
		
		return diaferiadosSeleccionados;
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
	
	public void generarReporteDiaFeriadosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalDiaFeriadosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoDiaFeriadosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoDiaFeriadosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoDiaFeriadosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Dia Feriado",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesDiaFeriadosSeleccionados() throws Exception {
		ArrayList<DiaFeriado> diaferiadosSeleccionados=new ArrayList<DiaFeriado>();		
		
		diaferiadosSeleccionados=this.getDiaFeriadosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteDiaFeriados("Todos",diaferiadosSeleccionados);
		
	}	
	
	public void generarReporteNormalDiaFeriadosSeleccionados() throws Exception {
		ArrayList<DiaFeriado> diaferiadosSeleccionados=new ArrayList<DiaFeriado>();		
		
		diaferiadosSeleccionados=this.getDiaFeriadosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteDiaFeriados("Todos",diaferiadosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionDiaFeriadosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<DiaFeriado> diaferiadosSeleccionados=new ArrayList<DiaFeriado>();
		
		diaferiadosSeleccionados=this.getDiaFeriadosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteDiaFeriados("Todos",diaferiadosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoDiaFeriadosSeleccionados() throws Exception {
		ArrayList<DiaFeriado> diaferiadosSeleccionados=new ArrayList<DiaFeriado>();		
		
		
		this.abrirInicializarFrameReporteDinamicoDiaFeriado();
		
		
		diaferiadosSeleccionados=this.getDiaFeriadosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoDiaFeriado();
		
		
		//this.generarReporteDiaFeriados("Todos",diaferiadosSeleccionados ,diaferiadoImplementable,diaferiadoImplementableHome);
	}
	
	public void mostrarImportacionDiaFeriados() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionDiaFeriado();
		
		this.abrirFrameImportacionDiaFeriado();		
		
			
		//this.generarReporteDiaFeriados("Todos",diaferiadosSeleccionados ,diaferiadoImplementable,diaferiadoImplementableHome);
	}
	
	public void importarDiaFeriados() throws Exception {		
	
	}
	
	public void exportarDiaFeriadosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelDiaFeriadosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoDiaFeriadosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlDiaFeriadosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Dia Feriado",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoDiaFeriadosSeleccionados() throws Exception {
		ArrayList<DiaFeriado> diaferiadosSeleccionados=new ArrayList<DiaFeriado>();		
		
		diaferiadosSeleccionados=this.getDiaFeriadosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"diaferiado."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarDiaFeriado(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(DiaFeriado diaferiadoAux:diaferiadosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarDiaFeriado(diaferiadoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//diaferiadoAux.setsDetalleGeneralEntityReporte(diaferiadoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.diaferiadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Dia Feriado",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarDiaFeriado(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=DiaFeriadoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DiaFeriadoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DiaFeriadoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DiaFeriadoConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DiaFeriadoConstantesFunciones.LABEL_FECHA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DiaFeriadoConstantesFunciones.LABEL_DIA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DiaFeriadoConstantesFunciones.LABEL_IDMES;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DiaFeriadoConstantesFunciones.LABEL_IDANIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DiaFeriadoConstantesFunciones.LABEL_DESCRIPCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DiaFeriadoConstantesFunciones.LABEL_ESTAACTIVO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarDiaFeriado(DiaFeriado diaferiado,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=diaferiado.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=diaferiado.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=diaferiado.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=diaferiado.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=diaferiado.getfecha().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=diaferiado.getdia().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=diaferiado.getmes_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=diaferiado.getanio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=diaferiado.getdescripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=diaferiado.getesta_activo().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelDiaFeriadosSeleccionados() throws Exception {
		ArrayList<DiaFeriado> diaferiadosSeleccionados=new ArrayList<DiaFeriado>();		
		
		diaferiadosSeleccionados=this.getDiaFeriadosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"diaferiado.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("DiaFeriados");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelDiaFeriado(row);				
				iRow++;
			}				
			
			for(DiaFeriado diaferiadoAux:diaferiadosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelDiaFeriado(diaferiadoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.diaferiadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Dia Feriado",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlDiaFeriadosSeleccionados() throws Exception {
		ArrayList<DiaFeriado> diaferiadosSeleccionados=new ArrayList<DiaFeriado>();		
		
		diaferiadosSeleccionados=this.getDiaFeriadosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"diaferiado.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("diaferiados");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("diaferiado");
			//elementRoot.appendChild(element);
		
			for(DiaFeriado diaferiadoAux:diaferiadosSeleccionados) {
				element = document.createElement("diaferiado");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlDiaFeriado(diaferiadoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.diaferiadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Dia Feriado",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelDiaFeriado(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(DiaFeriadoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(DiaFeriadoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(DiaFeriadoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(DiaFeriadoConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(DiaFeriadoConstantesFunciones.LABEL_FECHA);
		cell = row.createCell(iColumn++);cell.setCellValue(DiaFeriadoConstantesFunciones.LABEL_DIA);
		cell = row.createCell(iColumn++);cell.setCellValue(DiaFeriadoConstantesFunciones.LABEL_IDMES);
		cell = row.createCell(iColumn++);cell.setCellValue(DiaFeriadoConstantesFunciones.LABEL_IDANIO);
		cell = row.createCell(iColumn++);cell.setCellValue(DiaFeriadoConstantesFunciones.LABEL_DESCRIPCION);
		cell = row.createCell(iColumn++);cell.setCellValue(DiaFeriadoConstantesFunciones.LABEL_ESTAACTIVO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelDiaFeriado(DiaFeriado diaferiado,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(diaferiado.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(diaferiado.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(diaferiado.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(diaferiado.getfecha());
		cell = row.createCell(iColumn++);cell.setCellValue(diaferiado.getdia());
		cell = row.createCell(iColumn++);cell.setCellValue(diaferiado.getmes_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(diaferiado.getanio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(diaferiado.getdescripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(diaferiado.getesta_activo());				
	}
	
	public void setFilaDatosExportarXmlDiaFeriado(DiaFeriado diaferiado,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(DiaFeriadoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(diaferiado.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(DiaFeriadoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(diaferiado.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(DiaFeriadoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(diaferiado.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementnombre = document.createElement(DiaFeriadoConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(diaferiado.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementfecha = document.createElement(DiaFeriadoConstantesFunciones.FECHA);
		elementfecha.appendChild(document.createTextNode(diaferiado.getfecha().toString().trim()));
		element.appendChild(elementfecha);

		Element elementdia = document.createElement(DiaFeriadoConstantesFunciones.DIA);
		elementdia.appendChild(document.createTextNode(diaferiado.getdia().toString().trim()));
		element.appendChild(elementdia);

		Element elementmes_descripcion = document.createElement(DiaFeriadoConstantesFunciones.IDMES);
		elementmes_descripcion.appendChild(document.createTextNode(diaferiado.getmes_descripcion()));
		element.appendChild(elementmes_descripcion);

		Element elementanio_descripcion = document.createElement(DiaFeriadoConstantesFunciones.IDANIO);
		elementanio_descripcion.appendChild(document.createTextNode(diaferiado.getanio_descripcion()));
		element.appendChild(elementanio_descripcion);

		Element elementdescripcion = document.createElement(DiaFeriadoConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(diaferiado.getdescripcion().trim()));
		element.appendChild(elementdescripcion);

		Element elementesta_activo = document.createElement(DiaFeriadoConstantesFunciones.ESTAACTIVO);
		elementesta_activo.appendChild(document.createTextNode(diaferiado.getesta_activo().toString().trim()));
		element.appendChild(elementesta_activo);
	}
	
	public void generarReporteGroupGenericoDiaFeriadosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<DiaFeriado> diaferiadosSeleccionados=new ArrayList<DiaFeriado>();
		
		diaferiadosSeleccionados=this.getDiaFeriadosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoDiaFeriado(diaferiadosSeleccionados);
		
		this.generarReporteDiaFeriados("Todos",diaferiadosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoDiaFeriado(ArrayList<DiaFeriado> diaferiadosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(DiaFeriado diaferiadoAux:diaferiadosSeleccionados) {
				diaferiadoAux.setsDetalleGeneralEntityReporte(diaferiadoAux.toString());
			
				if(sTipoSeleccionar.equals(DiaFeriadoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					diaferiadoAux.setsDescripcionGeneralEntityReporte1(diaferiadoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DiaFeriadoConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					diaferiadoAux.setsDescripcionGeneralEntityReporte1(diaferiadoAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(DiaFeriadoConstantesFunciones.LABEL_FECHA)) {
					existe=true;
					diaferiadoAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(diaferiadoAux.getfecha()));
				}
				 else if(sTipoSeleccionar.equals(DiaFeriadoConstantesFunciones.LABEL_DIA)) {
					existe=true;
					diaferiadoAux.setsDescripcionGeneralEntityReporte1(diaferiadoAux.getdia().toString());
				}
				 else if(sTipoSeleccionar.equals(DiaFeriadoConstantesFunciones.LABEL_IDMES)) {
					existe=true;
					diaferiadoAux.setsDescripcionGeneralEntityReporte1(diaferiadoAux.getmes_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DiaFeriadoConstantesFunciones.LABEL_IDANIO)) {
					existe=true;
					diaferiadoAux.setsDescripcionGeneralEntityReporte1(diaferiadoAux.getanio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DiaFeriadoConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					diaferiadoAux.setsDescripcionGeneralEntityReporte1(diaferiadoAux.getdescripcion());
				}
				 else if(sTipoSeleccionar.equals(DiaFeriadoConstantesFunciones.LABEL_ESTAACTIVO)) {
					existe=true;
					diaferiadoAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(diaferiadoAux.getesta_activo()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiaFeriadoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesDiaFeriado(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoDiaFeriado=true;
				this.isVisibilidadCeldaNuevoRelacionesDiaFeriado=true;
				this.isVisibilidadCeldaGuardarCambiosDiaFeriado=true;
			}
			
			this.isVisibilidadCeldaModificarDiaFeriado=false;
			this.isVisibilidadCeldaActualizarDiaFeriado=false;
			this.isVisibilidadCeldaEliminarDiaFeriado=false;
			this.isVisibilidadCeldaCancelarDiaFeriado=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDiaFeriado=true;
				} else {
					this.isVisibilidadCeldaGuardarDiaFeriado=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoDiaFeriado=false;
			this.isVisibilidadCeldaNuevoRelacionesDiaFeriado=false;
			this.isVisibilidadCeldaGuardarCambiosDiaFeriado=false;
			this.isVisibilidadCeldaModificarDiaFeriado=false;
			this.isVisibilidadCeldaActualizarDiaFeriado=true;
			this.isVisibilidadCeldaEliminarDiaFeriado=false;
			this.isVisibilidadCeldaCancelarDiaFeriado=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDiaFeriado=true;
				} else {
					this.isVisibilidadCeldaGuardarDiaFeriado=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoDiaFeriado=false;
			this.isVisibilidadCeldaNuevoRelacionesDiaFeriado=false;
			this.isVisibilidadCeldaGuardarCambiosDiaFeriado=false;
			this.isVisibilidadCeldaModificarDiaFeriado=false;
			this.isVisibilidadCeldaActualizarDiaFeriado=true;
			this.isVisibilidadCeldaEliminarDiaFeriado=true;
			this.isVisibilidadCeldaCancelarDiaFeriado=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDiaFeriado=true;
				} else {
					this.isVisibilidadCeldaGuardarDiaFeriado=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoDiaFeriado=false;
			this.isVisibilidadCeldaNuevoRelacionesDiaFeriado=false;
			this.isVisibilidadCeldaGuardarCambiosDiaFeriado=false;
			this.isVisibilidadCeldaModificarDiaFeriado=false;
			this.isVisibilidadCeldaActualizarDiaFeriado=true;
			this.isVisibilidadCeldaEliminarDiaFeriado=false;
			this.isVisibilidadCeldaCancelarDiaFeriado=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDiaFeriado=false;
				} else {
					this.isVisibilidadCeldaGuardarDiaFeriado=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoDiaFeriado=true;
			this.isVisibilidadCeldaNuevoRelacionesDiaFeriado=true;
			this.isVisibilidadCeldaGuardarCambiosDiaFeriado=true;
			this.isVisibilidadCeldaModificarDiaFeriado=false;
			this.isVisibilidadCeldaActualizarDiaFeriado=false;
			this.isVisibilidadCeldaEliminarDiaFeriado=false;
			this.isVisibilidadCeldaCancelarDiaFeriado=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDiaFeriado=true;
				} else {
					this.isVisibilidadCeldaGuardarDiaFeriado=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoDiaFeriado=false;
			this.isVisibilidadCeldaNuevoRelacionesDiaFeriado=false;
			this.isVisibilidadCeldaGuardarCambiosDiaFeriado=false;
			this.isVisibilidadCeldaActualizarDiaFeriado=false;
			this.isVisibilidadCeldaEliminarDiaFeriado=false;
			this.isVisibilidadCeldaCancelarDiaFeriado=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDiaFeriado=false;
				} else {
					this.isVisibilidadCeldaGuardarDiaFeriado=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoDiaFeriado=false;
			this.isVisibilidadCeldaNuevoRelacionesDiaFeriado=false;
			this.isVisibilidadCeldaGuardarCambiosDiaFeriado=false;
			this.isVisibilidadCeldaModificarDiaFeriado=true;
			this.isVisibilidadCeldaActualizarDiaFeriado=false;
			this.isVisibilidadCeldaEliminarDiaFeriado=false;
			this.isVisibilidadCeldaCancelarDiaFeriado=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDiaFeriado=false;
				} else {
					this.isVisibilidadCeldaGuardarDiaFeriado=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(DiaFeriadoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoDiaFeriado=true;
			this.isVisibilidadCeldaNuevoRelacionesDiaFeriado=true;
			this.isVisibilidadCeldaGuardarCambiosDiaFeriado=true;
		} else {
			this.actualizarEstadoPanelsDiaFeriado(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarDiaFeriado=false;
			//this.isVisibilidadCeldaVerFormDiaFeriado=false;
			this.isVisibilidadCeldaDuplicarDiaFeriado=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!diaferiadoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesDiaFeriado=false;
		} else {
			this.isVisibilidadCeldaNuevoDiaFeriado=false;
			this.isVisibilidadCeldaGuardarCambiosDiaFeriado=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(diaferiadoSessionBean.getEsGuardarRelacionado()) {
			if(!diaferiadoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesDiaFeriado=false;												
			}
			
			this.jButtonCerrarDiaFeriado.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesDiaFeriado=false;
		}
		
		if(!this.permiteMantenimiento(this.diaferiado)) {
			this.isVisibilidadCeldaActualizarDiaFeriado=false;
			this.isVisibilidadCeldaEliminarDiaFeriado=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesDiaFeriado() {
	}
	
	public void actualizarEstadoPanelsDiaFeriado(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionDiaFeriado!=null) {
				this.jScrollPanelDatosEdicionDiaFeriado.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDiaFeriado!=null) {
				this.jTabbedPaneBusquedasDiaFeriado.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDiaFeriado!=null) {
				this.jScrollPanelDatosDiaFeriado.setVisible(true);
			}
			
			if(this.jPanelPaginacionDiaFeriado!=null) {
				this.jPanelPaginacionDiaFeriado.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDiaFeriado!=null) {
				this.jPanelParametrosReportesDiaFeriado.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionDiaFeriado!=null) {
				this.jScrollPanelDatosEdicionDiaFeriado.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDiaFeriado!=null) {
				this.jTabbedPaneBusquedasDiaFeriado.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosDiaFeriado!=null) {
				this.jScrollPanelDatosDiaFeriado.setVisible(false);
			}
			
			if(this.jPanelPaginacionDiaFeriado!=null) {
				this.jPanelPaginacionDiaFeriado.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDiaFeriado!=null) {
				this.jPanelParametrosReportesDiaFeriado.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionDiaFeriado!=null) {
				this.jScrollPanelDatosEdicionDiaFeriado.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDiaFeriado!=null) {
				this.jTabbedPaneBusquedasDiaFeriado.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosDiaFeriado!=null) {
				this.jScrollPanelDatosDiaFeriado.setVisible(false);
			}
			
			if(this.jPanelPaginacionDiaFeriado!=null) {
				this.jPanelPaginacionDiaFeriado.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDiaFeriado!=null) {
				this.jPanelParametrosReportesDiaFeriado.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionDiaFeriado!=null) {
				this.jScrollPanelDatosEdicionDiaFeriado.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDiaFeriado!=null) {
				this.jTabbedPaneBusquedasDiaFeriado.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosDiaFeriado!=null) {
				this.jScrollPanelDatosDiaFeriado.setVisible(false);
			}
			
			if(this.jPanelPaginacionDiaFeriado!=null) {
				this.jPanelPaginacionDiaFeriado.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDiaFeriado!=null) {
				this.jPanelParametrosReportesDiaFeriado.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionDiaFeriado!=null) {
				this.jScrollPanelDatosEdicionDiaFeriado.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDiaFeriado!=null) {
				this.jTabbedPaneBusquedasDiaFeriado.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDiaFeriado!=null) {
				this.jScrollPanelDatosDiaFeriado.setVisible(true);
			}
			
			if(this.jPanelPaginacionDiaFeriado!=null) {
				this.jPanelPaginacionDiaFeriado.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDiaFeriado!=null) {
				this.jPanelParametrosReportesDiaFeriado.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionDiaFeriado!=null) {
				this.jScrollPanelDatosEdicionDiaFeriado.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDiaFeriado!=null) {
				this.jTabbedPaneBusquedasDiaFeriado.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDiaFeriado!=null) {
				this.jScrollPanelDatosDiaFeriado.setVisible(true);
			}
			
			if(this.jPanelPaginacionDiaFeriado!=null) {
				this.jPanelPaginacionDiaFeriado.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDiaFeriado!=null) {
				this.jPanelParametrosReportesDiaFeriado.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionDiaFeriado!=null) {
				this.jScrollPanelDatosEdicionDiaFeriado.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDiaFeriado!=null) {
				this.jTabbedPaneBusquedasDiaFeriado.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDiaFeriado!=null) {
				this.jScrollPanelDatosDiaFeriado.setVisible(true);
			}
			
			if(this.jPanelPaginacionDiaFeriado!=null) {
				this.jPanelPaginacionDiaFeriado.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDiaFeriado!=null) {
				this.jPanelParametrosReportesDiaFeriado.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.diaferiadoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasDiaFeriado!=null) {
					this.jTabbedPaneBusquedasDiaFeriado.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesDiaFeriado!=null) {
				this.jPanelParametrosReportesDiaFeriado.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.diaferiadoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDiaFeriado!=null) {
				this.jTabbedPaneBusquedasDiaFeriado.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesDiaFeriado!=null) {
				this.jPanelParametrosReportesDiaFeriado.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdAnio=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdAnio) {this.jTabbedPaneBusquedasDiaFeriado.remove(jPanelFK_IdAnioDiaFeriado);}

			this.isVisibilidadFK_IdMes=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdMes) {this.jTabbedPaneBusquedasDiaFeriado.remove(jPanelFK_IdMesDiaFeriado);}
		}
		
	}

	public void setVisibilidadBusquedasParaMes(Boolean isParaMes){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaMesNegation=!isParaMes;

			this.isVisibilidadFK_IdAnio=isParaMesNegation;
			if(!this.isVisibilidadFK_IdAnio) {this.jTabbedPaneBusquedasDiaFeriado.remove(jPanelFK_IdAnioDiaFeriado);}

			this.isVisibilidadFK_IdMes=isParaMes;
			if(!this.isVisibilidadFK_IdMes) {this.jTabbedPaneBusquedasDiaFeriado.remove(jPanelFK_IdMesDiaFeriado);}
		}
		
	}

	public void setVisibilidadBusquedasParaAnio(Boolean isParaAnio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaAnioNegation=!isParaAnio;

			this.isVisibilidadFK_IdAnio=isParaAnio;
			if(!this.isVisibilidadFK_IdAnio) {this.jTabbedPaneBusquedasDiaFeriado.remove(jPanelFK_IdAnioDiaFeriado);}

			this.isVisibilidadFK_IdMes=isParaAnioNegation;
			if(!this.isVisibilidadFK_IdMes) {this.jTabbedPaneBusquedasDiaFeriado.remove(jPanelFK_IdMesDiaFeriado);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//DiaFeriadoSessionBean diaferiadoSessionBean=new DiaFeriadoSessionBean();
		
		if(this.diaferiadoSessionBean==null) {
			this.diaferiadoSessionBean=new DiaFeriadoSessionBean();
		}
		
		this.diaferiadoSessionBean.setsUltimaBusquedaDiaFeriado(this.getsAccionBusqueda());
		this.diaferiadoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.diaferiadoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdAnio")) {
			diaferiadoSessionBean.setid_anio(this.getid_anioFK_IdAnio());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			diaferiadoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdMes")) {
			diaferiadoSessionBean.setid_mes(this.getid_mesFK_IdMes());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//DiaFeriadoSessionBean diaferiadoSessionBean=new DiaFeriadoSessionBean();
		
		if(this.diaferiadoSessionBean==null) {
			this.diaferiadoSessionBean=new DiaFeriadoSessionBean();
		}
		
		if(this.diaferiadoSessionBean.getsUltimaBusquedaDiaFeriado()!=null&&!this.diaferiadoSessionBean.getsUltimaBusquedaDiaFeriado().equals("")) {
			this.setsAccionBusqueda(diaferiadoSessionBean.getsUltimaBusquedaDiaFeriado());
			this.setiNumeroPaginacion(diaferiadoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(diaferiadoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdAnio")) {
				this.setid_anioFK_IdAnio(diaferiadoSessionBean.getid_anio());
				diaferiadoSessionBean.setid_anio(null);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(diaferiadoSessionBean.getid_empresa());
				diaferiadoSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdMes")) {
				this.setid_mesFK_IdMes(diaferiadoSessionBean.getid_mes());
				diaferiadoSessionBean.setid_mes(null);
			}
		}
		
		this.diaferiadoSessionBean.setsUltimaBusquedaDiaFeriado("");
		this.diaferiadoSessionBean.setiNumeroPaginacion(DiaFeriadoConstantesFunciones.INUMEROPAGINACION);
		this.diaferiadoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaDiaFeriado(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioDiaFeriado() {
		this.updateBorderResaltarBusquedasFormularioDiaFeriado();
		this.updateVisibilidadBusquedasFormularioDiaFeriado();
		this.updateHabilitarBusquedasFormularioDiaFeriado();
	}
	
	public void updateBorderResaltarBusquedasFormularioDiaFeriado() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasDiaFeriado.getComponents().length>0) {
	

		if(this.diaferiadoConstantesFunciones.resaltarFK_IdAnioDiaFeriado!=null) {
			index= this.jTabbedPaneBusquedasDiaFeriado.indexOfComponent(this.jPanelFK_IdAnioDiaFeriado);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDiaFeriado.getComponent(index);
				jPanel.setBorder(this.diaferiadoConstantesFunciones.resaltarFK_IdAnioDiaFeriado);
			}
		}

		if(this.diaferiadoConstantesFunciones.resaltarFK_IdMesDiaFeriado!=null) {
			index= this.jTabbedPaneBusquedasDiaFeriado.indexOfComponent(this.jPanelFK_IdMesDiaFeriado);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDiaFeriado.getComponent(index);
				jPanel.setBorder(this.diaferiadoConstantesFunciones.resaltarFK_IdMesDiaFeriado);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioDiaFeriado() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasDiaFeriado.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasDiaFeriado.indexOfComponent(this.jPanelFK_IdAnioDiaFeriado);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDiaFeriado.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.diaferiadoConstantesFunciones.mostrarFK_IdAnioDiaFeriado);
			if(!this.diaferiadoConstantesFunciones.mostrarFK_IdAnioDiaFeriado && index>-1) {
				this.jTabbedPaneBusquedasDiaFeriado.remove(index);
			}

			index= this.jTabbedPaneBusquedasDiaFeriado.indexOfComponent(this.jPanelFK_IdMesDiaFeriado);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDiaFeriado.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.diaferiadoConstantesFunciones.mostrarFK_IdMesDiaFeriado);
			if(!this.diaferiadoConstantesFunciones.mostrarFK_IdMesDiaFeriado && index>-1) {
				this.jTabbedPaneBusquedasDiaFeriado.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioDiaFeriado() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasDiaFeriado.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasDiaFeriado.indexOfComponent(this.jPanelFK_IdAnioDiaFeriado);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDiaFeriado.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.diaferiadoConstantesFunciones.activarFK_IdAnioDiaFeriado);
				this.jTabbedPaneBusquedasDiaFeriado.setEnabledAt(index,this.diaferiadoConstantesFunciones.activarFK_IdAnioDiaFeriado);
			}

			index= this.jTabbedPaneBusquedasDiaFeriado.indexOfComponent(this.jPanelFK_IdMesDiaFeriado);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDiaFeriado.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.diaferiadoConstantesFunciones.activarFK_IdMesDiaFeriado);
				this.jTabbedPaneBusquedasDiaFeriado.setEnabledAt(index,this.diaferiadoConstantesFunciones.activarFK_IdMesDiaFeriado);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaDiaFeriado(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdAnio")) {
			index= this.jTabbedPaneBusquedasDiaFeriado.indexOfComponent(this.jPanelFK_IdAnioDiaFeriado);

			this.jTabbedPaneBusquedasDiaFeriado.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDiaFeriado.getComponent(index);

			this.diaferiadoConstantesFunciones.setResaltarFK_IdAnioDiaFeriado(resaltar);

			jPanel.setBorder(this.diaferiadoConstantesFunciones.resaltarFK_IdAnioDiaFeriado);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdMes")) {
			index= this.jTabbedPaneBusquedasDiaFeriado.indexOfComponent(this.jPanelFK_IdMesDiaFeriado);

			this.jTabbedPaneBusquedasDiaFeriado.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDiaFeriado.getComponent(index);

			this.diaferiadoConstantesFunciones.setResaltarFK_IdMesDiaFeriado(resaltar);

			jPanel.setBorder(this.diaferiadoConstantesFunciones.resaltarFK_IdMesDiaFeriado);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarDiaFeriado.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioDiaFeriado() throws Exception {

		if(this.jInternalFrameDetalleFormDiaFeriado==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioDiaFeriado();
		this.updateVisibilidadResaltarControlesFormularioDiaFeriado();
		this.updateHabilitarResaltarControlesFormularioDiaFeriado();
		
	}
	
	public void updateBorderResaltarControlesFormularioDiaFeriado() throws Exception {
		if(this.jInternalFrameDetalleFormDiaFeriado==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.diaferiadoConstantesFunciones.resaltaridDiaFeriado!=null && this.jInternalFrameDetalleFormDiaFeriado!=null) {this.jInternalFrameDetalleFormDiaFeriado.jLabelidDiaFeriado.setBorder(this.diaferiadoConstantesFunciones.resaltaridDiaFeriado);}
		if(this.diaferiadoConstantesFunciones.resaltarid_empresaDiaFeriado!=null && this.jInternalFrameDetalleFormDiaFeriado!=null) {this.jInternalFrameDetalleFormDiaFeriado.jComboBoxid_empresaDiaFeriado.setBorder(this.diaferiadoConstantesFunciones.resaltarid_empresaDiaFeriado);}
		if(this.diaferiadoConstantesFunciones.resaltarnombreDiaFeriado!=null && this.jInternalFrameDetalleFormDiaFeriado!=null) {this.jInternalFrameDetalleFormDiaFeriado.jTextFieldnombreDiaFeriado.setBorder(this.diaferiadoConstantesFunciones.resaltarnombreDiaFeriado);}
		if(this.diaferiadoConstantesFunciones.resaltarfechaDiaFeriado!=null && this.jInternalFrameDetalleFormDiaFeriado!=null) {this.jInternalFrameDetalleFormDiaFeriado.jDateChooserfechaDiaFeriado.setBorder(this.diaferiadoConstantesFunciones.resaltarfechaDiaFeriado);}
		if(this.diaferiadoConstantesFunciones.resaltardiaDiaFeriado!=null && this.jInternalFrameDetalleFormDiaFeriado!=null) {this.jInternalFrameDetalleFormDiaFeriado.jTextFielddiaDiaFeriado.setBorder(this.diaferiadoConstantesFunciones.resaltardiaDiaFeriado);}
		if(this.diaferiadoConstantesFunciones.resaltarid_mesDiaFeriado!=null && this.jInternalFrameDetalleFormDiaFeriado!=null) {this.jInternalFrameDetalleFormDiaFeriado.jComboBoxid_mesDiaFeriado.setBorder(this.diaferiadoConstantesFunciones.resaltarid_mesDiaFeriado);}
		if(this.diaferiadoConstantesFunciones.resaltarid_anioDiaFeriado!=null && this.jInternalFrameDetalleFormDiaFeriado!=null) {this.jInternalFrameDetalleFormDiaFeriado.jComboBoxid_anioDiaFeriado.setBorder(this.diaferiadoConstantesFunciones.resaltarid_anioDiaFeriado);}
		if(this.diaferiadoConstantesFunciones.resaltardescripcionDiaFeriado!=null && this.jInternalFrameDetalleFormDiaFeriado!=null) {this.jInternalFrameDetalleFormDiaFeriado.jTextAreadescripcionDiaFeriado.setBorder(this.diaferiadoConstantesFunciones.resaltardescripcionDiaFeriado);}
		if(this.diaferiadoConstantesFunciones.resaltaresta_activoDiaFeriado!=null && this.jInternalFrameDetalleFormDiaFeriado!=null) {this.jInternalFrameDetalleFormDiaFeriado.jCheckBoxesta_activoDiaFeriado.setBorderPainted(true);this.jInternalFrameDetalleFormDiaFeriado.jCheckBoxesta_activoDiaFeriado.setBorder(this.diaferiadoConstantesFunciones.resaltaresta_activoDiaFeriado);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioDiaFeriado() throws Exception {		
		if(this.jInternalFrameDetalleFormDiaFeriado==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormDiaFeriado!=null) {
	
		//this.jInternalFrameDetalleFormDiaFeriado.jLabelidDiaFeriado.setVisible(this.diaferiadoConstantesFunciones.mostraridDiaFeriado);
		this.jInternalFrameDetalleFormDiaFeriado.jPanelidDiaFeriado.setVisible(this.diaferiadoConstantesFunciones.mostraridDiaFeriado);
		//this.jInternalFrameDetalleFormDiaFeriado.jComboBoxid_empresaDiaFeriado.setVisible(this.diaferiadoConstantesFunciones.mostrarid_empresaDiaFeriado);
		this.jInternalFrameDetalleFormDiaFeriado.jPanelid_empresaDiaFeriado.setVisible(this.diaferiadoConstantesFunciones.mostrarid_empresaDiaFeriado);
		//this.jInternalFrameDetalleFormDiaFeriado.jTextFieldnombreDiaFeriado.setVisible(this.diaferiadoConstantesFunciones.mostrarnombreDiaFeriado);
		this.jInternalFrameDetalleFormDiaFeriado.jPanelnombreDiaFeriado.setVisible(this.diaferiadoConstantesFunciones.mostrarnombreDiaFeriado);
		//this.jInternalFrameDetalleFormDiaFeriado.jDateChooserfechaDiaFeriado.setVisible(this.diaferiadoConstantesFunciones.mostrarfechaDiaFeriado);
		this.jInternalFrameDetalleFormDiaFeriado.jPanelfechaDiaFeriado.setVisible(this.diaferiadoConstantesFunciones.mostrarfechaDiaFeriado);
		//this.jInternalFrameDetalleFormDiaFeriado.jTextFielddiaDiaFeriado.setVisible(this.diaferiadoConstantesFunciones.mostrardiaDiaFeriado);
		this.jInternalFrameDetalleFormDiaFeriado.jPaneldiaDiaFeriado.setVisible(this.diaferiadoConstantesFunciones.mostrardiaDiaFeriado);
		//this.jInternalFrameDetalleFormDiaFeriado.jComboBoxid_mesDiaFeriado.setVisible(this.diaferiadoConstantesFunciones.mostrarid_mesDiaFeriado);
		this.jInternalFrameDetalleFormDiaFeriado.jPanelid_mesDiaFeriado.setVisible(this.diaferiadoConstantesFunciones.mostrarid_mesDiaFeriado);
		//this.jInternalFrameDetalleFormDiaFeriado.jComboBoxid_anioDiaFeriado.setVisible(this.diaferiadoConstantesFunciones.mostrarid_anioDiaFeriado);
		this.jInternalFrameDetalleFormDiaFeriado.jPanelid_anioDiaFeriado.setVisible(this.diaferiadoConstantesFunciones.mostrarid_anioDiaFeriado);
		//this.jInternalFrameDetalleFormDiaFeriado.jTextAreadescripcionDiaFeriado.setVisible(this.diaferiadoConstantesFunciones.mostrardescripcionDiaFeriado);
		this.jInternalFrameDetalleFormDiaFeriado.jPaneldescripcionDiaFeriado.setVisible(this.diaferiadoConstantesFunciones.mostrardescripcionDiaFeriado);
		//this.jInternalFrameDetalleFormDiaFeriado.jCheckBoxesta_activoDiaFeriado.setVisible(this.diaferiadoConstantesFunciones.mostraresta_activoDiaFeriado);
		this.jInternalFrameDetalleFormDiaFeriado.jPanelesta_activoDiaFeriado.setVisible(this.diaferiadoConstantesFunciones.mostraresta_activoDiaFeriado);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioDiaFeriado() throws Exception {
		if(this.jInternalFrameDetalleFormDiaFeriado==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormDiaFeriado!=null) {
	
		this.jInternalFrameDetalleFormDiaFeriado.jLabelidDiaFeriado.setEnabled(this.diaferiadoConstantesFunciones.activaridDiaFeriado);
		this.jInternalFrameDetalleFormDiaFeriado.jComboBoxid_empresaDiaFeriado.setEnabled(this.diaferiadoConstantesFunciones.activarid_empresaDiaFeriado);
		this.jInternalFrameDetalleFormDiaFeriado.jTextFieldnombreDiaFeriado.setEnabled(this.diaferiadoConstantesFunciones.activarnombreDiaFeriado);
		this.jInternalFrameDetalleFormDiaFeriado.jDateChooserfechaDiaFeriado.setEnabled(this.diaferiadoConstantesFunciones.activarfechaDiaFeriado);
		this.jInternalFrameDetalleFormDiaFeriado.jTextFielddiaDiaFeriado.setEnabled(this.diaferiadoConstantesFunciones.activardiaDiaFeriado);
		this.jInternalFrameDetalleFormDiaFeriado.jComboBoxid_mesDiaFeriado.setEnabled(this.diaferiadoConstantesFunciones.activarid_mesDiaFeriado);
		this.jInternalFrameDetalleFormDiaFeriado.jComboBoxid_anioDiaFeriado.setEnabled(this.diaferiadoConstantesFunciones.activarid_anioDiaFeriado);
		this.jInternalFrameDetalleFormDiaFeriado.jTextAreadescripcionDiaFeriado.setEnabled(this.diaferiadoConstantesFunciones.activardescripcionDiaFeriado);
		this.jInternalFrameDetalleFormDiaFeriado.jCheckBoxesta_activoDiaFeriado.setEnabled(this.diaferiadoConstantesFunciones.activaresta_activoDiaFeriado);
		}
	}
	
		
}