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
package com.bydan.erp.comisiones.presentation.swing.jinternalframes;




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

import com.bydan.erp.comisiones.util.ComisionConfigConstantesFunciones;
import com.bydan.erp.comisiones.util.ComisionConfigParameterReturnGeneral;
//import com.bydan.erp.comisiones.util.ComisionConfigParameterGeneral;
//import com.bydan.erp.comisiones.presentation.report.source.ComisionConfigBean;
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

import com.bydan.erp.comisiones.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.comisiones.resources.reportes.AuxiliarReportes;


import com.bydan.erp.comisiones.util.*;
import com.bydan.erp.comisiones.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.comisiones.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class ComisionConfigBeanSwingJInternalFrame extends ComisionConfigJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ComisionConfigBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ComisionConfig> comisionconfigValidator = new ClassValidator<ComisionConfig>(ComisionConfig.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ComisionConfig comisionconfig;	
	public ComisionConfig comisionconfigAux;
	public ComisionConfig comisionconfigAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ComisionConfig comisionconfigTotales;
	public Long idComisionConfigActual;
	public Long iIdNuevoComisionConfig=0L;
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

	public String sFinalQueryComboTipoComisionConfig="";

	public List<TipoComisionConfig> tipocomisionconfigsForeignKey;

	public List<TipoComisionConfig> gettipocomisionconfigsForeignKey() {
		return tipocomisionconfigsForeignKey;
	}

	public void settipocomisionconfigsForeignKey(List<TipoComisionConfig> tipocomisionconfigsForeignKey) {
		this.tipocomisionconfigsForeignKey = tipocomisionconfigsForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoComisionConfig tipocomisionconfigForeignKey;

	public TipoComisionConfig gettipocomisionconfigForeignKey() {
		return tipocomisionconfigForeignKey;
	}

	public void settipocomisionconfigForeignKey(TipoComisionConfig tipocomisionconfigForeignKey) {
		this.tipocomisionconfigForeignKey = tipocomisionconfigForeignKey;
	}

	public String sFinalQueryComboNivelLinea="";

	public List<NivelLinea> nivellineasForeignKey;

	public List<NivelLinea> getnivellineasForeignKey() {
		return nivellineasForeignKey;
	}

	public void setnivellineasForeignKey(List<NivelLinea> nivellineasForeignKey) {
		this.nivellineasForeignKey = nivellineasForeignKey;
	}

	//OBJETO FK ACTUAL
	public NivelLinea nivellineaForeignKey;

	public NivelLinea getnivellineaForeignKey() {
		return nivellineaForeignKey;
	}

	public void setnivellineaForeignKey(NivelLinea nivellineaForeignKey) {
		this.nivellineaForeignKey = nivellineaForeignKey;
	}

		
	
	
	
	
	

	public Boolean isTienePermisosComisionCate=false;

	public Boolean getIsTienePermisosComisionCate() {
		return isTienePermisosComisionCate;
	}

	public void setIsTienePermisosComisionCate(Boolean isTienePermisosComisionCate) {
		this.isTienePermisosComisionCate= isTienePermisosComisionCate;
	}


	public Boolean isTienePermisosComisionMarca=false;

	public Boolean getIsTienePermisosComisionMarca() {
		return isTienePermisosComisionMarca;
	}

	public void setIsTienePermisosComisionMarca(Boolean isTienePermisosComisionMarca) {
		this.isTienePermisosComisionMarca= isTienePermisosComisionMarca;
	}


	public Boolean isTienePermisosComisionLinea=false;

	public Boolean getIsTienePermisosComisionLinea() {
		return isTienePermisosComisionLinea;
	}

	public void setIsTienePermisosComisionLinea(Boolean isTienePermisosComisionLinea) {
		this.isTienePermisosComisionLinea= isTienePermisosComisionLinea;
	}


	public Boolean isTienePermisosComisionPena=false;

	public Boolean getIsTienePermisosComisionPena() {
		return isTienePermisosComisionPena;
	}

	public void setIsTienePermisosComisionPena(Boolean isTienePermisosComisionPena) {
		this.isTienePermisosComisionPena= isTienePermisosComisionPena;
	}


	public Boolean isTienePermisosComisionGrupo=false;

	public Boolean getIsTienePermisosComisionGrupo() {
		return isTienePermisosComisionGrupo;
	}

	public void setIsTienePermisosComisionGrupo(Boolean isTienePermisosComisionGrupo) {
		this.isTienePermisosComisionGrupo= isTienePermisosComisionGrupo;
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
	
	public Boolean isPermisoTodoComisionConfig;
	public Boolean isPermisoNuevoComisionConfig;
	public Boolean isPermisoActualizarComisionConfig;
	public Boolean isPermisoActualizarOriginalComisionConfig;
	public Boolean isPermisoEliminarComisionConfig;
	public Boolean isPermisoGuardarCambiosComisionConfig;
	public Boolean isPermisoConsultaComisionConfig;
	public Boolean isPermisoBusquedaComisionConfig;
	public Boolean isPermisoReporteComisionConfig;
	public Boolean isPermisoPaginacionMedioComisionConfig;
	public Boolean isPermisoPaginacionAltoComisionConfig;
	public Boolean isPermisoPaginacionTodoComisionConfig;
	public Boolean isPermisoCopiarComisionConfig;
	public Boolean isPermisoVerFormComisionConfig;
	public Boolean isPermisoDuplicarComisionConfig;
	public Boolean isPermisoOrdenComisionConfig;
	
	
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
	
	public ComisionConfigParameterReturnGeneral comisionconfigReturnGeneral;
	public ComisionConfigParameterReturnGeneral comisionconfigParameterGeneral;
	
	

	public ComisionCateLogic comisioncateLogic=null;

	public ComisionCateLogic getComisionCateLogic() {
		return comisioncateLogic;
	}

	public void setComisionCateLogic(ComisionCateLogic comisioncateLogic) {
		this.comisioncateLogic = comisioncateLogic;
	}


	public ComisionMarcaLogic comisionmarcaLogic=null;

	public ComisionMarcaLogic getComisionMarcaLogic() {
		return comisionmarcaLogic;
	}

	public void setComisionMarcaLogic(ComisionMarcaLogic comisionmarcaLogic) {
		this.comisionmarcaLogic = comisionmarcaLogic;
	}


	public ComisionLineaLogic comisionlineaLogic=null;

	public ComisionLineaLogic getComisionLineaLogic() {
		return comisionlineaLogic;
	}

	public void setComisionLineaLogic(ComisionLineaLogic comisionlineaLogic) {
		this.comisionlineaLogic = comisionlineaLogic;
	}


	public ComisionPenaLogic comisionpenaLogic=null;

	public ComisionPenaLogic getComisionPenaLogic() {
		return comisionpenaLogic;
	}

	public void setComisionPenaLogic(ComisionPenaLogic comisionpenaLogic) {
		this.comisionpenaLogic = comisionpenaLogic;
	}


	public ComisionGrupoLogic comisiongrupoLogic=null;

	public ComisionGrupoLogic getComisionGrupoLogic() {
		return comisiongrupoLogic;
	}

	public void setComisionGrupoLogic(ComisionGrupoLogic comisiongrupoLogic) {
		this.comisiongrupoLogic = comisiongrupoLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoComisionConfig=false;
	public Boolean esParaAccionDesdeFormularioComisionConfig=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ComisionConfigSessionBeanAdditional comisionconfigSessionBeanAdditional=null;
	
	public ComisionConfigSessionBeanAdditional getComisionConfigSessionBeanAdditional() {
		return this.comisionconfigSessionBeanAdditional;
	}
	
	public void setComisionConfigSessionBeanAdditional(ComisionConfigSessionBeanAdditional comisionconfigSessionBeanAdditional) {
		try {
			this.comisionconfigSessionBeanAdditional=comisionconfigSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ComisionConfigBeanSwingJInternalFrameAdditional comisionconfigBeanSwingJInternalFrameAdditional=null;
	//public class ComisionConfigBeanSwingJInternalFrame
	
	public ComisionConfigBeanSwingJInternalFrameAdditional getComisionConfigBeanSwingJInternalFrameAdditional() {
		return this.comisionconfigBeanSwingJInternalFrameAdditional;
	}
	
	public void setComisionConfigBeanSwingJInternalFrameAdditional(ComisionConfigBeanSwingJInternalFrameAdditional comisionconfigBeanSwingJInternalFrameAdditional) {
		try {
			this.comisionconfigBeanSwingJInternalFrameAdditional=comisionconfigBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ComisionConfigLogic comisionconfigLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ComisionConfig comisionconfigBean;
	public ComisionConfigConstantesFunciones comisionconfigConstantesFunciones;
	//public ComisionConfigParameterReturnGeneral comisionconfigReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public TipoComisionConfigLogic tipocomisionconfigLogic;
	public NivelLineaLogic nivellineaLogic;
	
	//PARAMETROS
	
	
	//public List<ComisionConfig> comisionconfigs;	
	//public List<ComisionConfig> comisionconfigsEliminados;
	//public List<ComisionConfig> comisionconfigsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoComisionConfig=false;
	public Boolean isVisibilidadCeldaDuplicarComisionConfig=true;
	public Boolean isVisibilidadCeldaCopiarComisionConfig=true;
	public Boolean isVisibilidadCeldaVerFormComisionConfig=true;
	public Boolean isVisibilidadCeldaOrdenComisionConfig=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesComisionConfig=false;
	public Boolean isVisibilidadCeldaModificarComisionConfig=false;
	public Boolean isVisibilidadCeldaActualizarComisionConfig=false;
	public Boolean isVisibilidadCeldaEliminarComisionConfig=false;
	public Boolean isVisibilidadCeldaCancelarComisionConfig=false;
	public Boolean isVisibilidadCeldaGuardarComisionConfig=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosComisionConfig=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdNivelLinea=false;
	public Boolean isVisibilidadFK_IdTipoComisionConfig=false;
	
	public Long getiIdNuevoComisionConfig() {
		return this.iIdNuevoComisionConfig;
	}

	public void setiIdNuevoComisionConfig(Long iIdNuevoComisionConfig) {
		this.iIdNuevoComisionConfig = iIdNuevoComisionConfig;
	}
	
	public Long getidComisionConfigActual() {
		return this.idComisionConfigActual;
	}

	public void setidComisionConfigActual(Long idComisionConfigActual) {
		this.idComisionConfigActual = idComisionConfigActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ComisionConfig getcomisionconfig() {
		return this.comisionconfig;
	}

	public void setcomisionconfig(ComisionConfig comisionconfig) {
		this.comisionconfig = comisionconfig;
	}
	
	public ComisionConfig getcomisionconfigAux() {
		return this.comisionconfigAux;
	}

	public void setcomisionconfigAux(ComisionConfig comisionconfigAux) {
		this.comisionconfigAux = comisionconfigAux;
	}				
	
	public ComisionConfig getcomisionconfigAnterior() {
		return this.comisionconfigAnterior;
	}

	public void setcomisionconfigAnterior(ComisionConfig comisionconfigAnterior) {
		this.comisionconfigAnterior = comisionconfigAnterior;
	}	
	
	public ComisionConfig getcomisionconfigTotales() {
		return this.comisionconfigTotales;
	}

	public void setcomisionconfigTotales(ComisionConfig comisionconfigTotales) {
		this.comisionconfigTotales = comisionconfigTotales;
	}	
	
	public ComisionConfig getcomisionconfigBean() {
		return this.comisionconfigBean;
	}

	public void setcomisionconfigBean(ComisionConfig comisionconfigBean) {
		this.comisionconfigBean = comisionconfigBean;
	}	
	
	public ComisionConfigParameterReturnGeneral getcomisionconfigReturnGeneral() {
		return this.comisionconfigReturnGeneral;
	}

	public void setcomisionconfigReturnGeneral(ComisionConfigParameterReturnGeneral comisionconfigReturnGeneral) {
		this.comisionconfigReturnGeneral = comisionconfigReturnGeneral;
	}	
	
	
	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_nivel_lineaFK_IdNivelLinea=-1L;

	public Long getid_nivel_lineaFK_IdNivelLinea() {
		return this.id_nivel_lineaFK_IdNivelLinea;
	}

	public void setid_nivel_lineaFK_IdNivelLinea(Long id_nivel_lineaFK_IdNivelLinea) {
		this.id_nivel_lineaFK_IdNivelLinea = id_nivel_lineaFK_IdNivelLinea;
	}

	public Long id_tipo_comision_configFK_IdTipoComisionConfig=-1L;

	public Long getid_tipo_comision_configFK_IdTipoComisionConfig() {
		return this.id_tipo_comision_configFK_IdTipoComisionConfig;
	}

	public void setid_tipo_comision_configFK_IdTipoComisionConfig(Long id_tipo_comision_configFK_IdTipoComisionConfig) {
		this.id_tipo_comision_configFK_IdTipoComisionConfig = id_tipo_comision_configFK_IdTipoComisionConfig;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ComisionConfigLogic getComisionConfigLogic()	{		
		return comisionconfigLogic;
	}

	public void setComisionConfigLogic(ComisionConfigLogic comisionconfigLogic) {
		this.comisionconfigLogic = comisionconfigLogic;
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
	
	public Boolean getIsEsNuevoComisionConfig() {
		return isEsNuevoComisionConfig;
	}

	public void setIsEsNuevoComisionConfig(Boolean isEsNuevoComisionConfig) {
		this.isEsNuevoComisionConfig = isEsNuevoComisionConfig;
	}

	public Boolean getEsParaAccionDesdeFormularioComisionConfig() {
		return esParaAccionDesdeFormularioComisionConfig;
	}
	
	public void setEsParaAccionDesdeFormularioComisionConfig(Boolean esParaAccionDesdeFormularioComisionConfig) {
		this.esParaAccionDesdeFormularioComisionConfig = esParaAccionDesdeFormularioComisionConfig;
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

			if(this.comisionconfigSessionBean==null) {
				this.comisionconfigSessionBean=new ComisionConfigSessionBean();
			}

			if(!this.comisionconfigSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(comisionconfigSessionBean.getlidEmpresaActual());
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

	public void cargarCombosTipoComisionConfigsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipocomisionconfigsForeignKey=new ArrayList<TipoComisionConfig>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoComisionConfigLogic tipocomisionconfigLogic=new TipoComisionConfigLogic();

			//tipocomisionconfigLogic.getTipoComisionConfigDataAccess().setIsForForeingKeyData(true);

			if(this.comisionconfigSessionBean==null) {
				this.comisionconfigSessionBean=new ComisionConfigSessionBean();
			}

			if(!this.comisionconfigSessionBean.getisBusquedaDesdeForeignKeySesionTipoComisionConfig()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipocomisionconfigLogic.getTipoComisionConfigDataAccess().setIsForForeingKeyData(true);

					tipocomisionconfigLogic.getTodosTipoComisionConfigsWithConnection(sFinalQuery,new Pagination());

					this.tipocomisionconfigsForeignKey=tipocomisionconfigLogic.getTipoComisionConfigs();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoComisionConfig(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocomisionconfigLogic.getEntityWithConnection(comisionconfigSessionBean.getlidTipoComisionConfigActual());
					this.tipocomisionconfigsForeignKey.add(tipocomisionconfigLogic.getTipoComisionConfig());
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

	public void cargarCombosNivelLineasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.nivellineasForeignKey=new ArrayList<NivelLinea>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			NivelLineaLogic nivellineaLogic=new NivelLineaLogic();

			//nivellineaLogic.getNivelLineaDataAccess().setIsForForeingKeyData(true);

			if(this.comisionconfigSessionBean==null) {
				this.comisionconfigSessionBean=new ComisionConfigSessionBean();
			}

			if(!this.comisionconfigSessionBean.getisBusquedaDesdeForeignKeySesionNivelLinea()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//nivellineaLogic.getNivelLineaDataAccess().setIsForForeingKeyData(true);

					nivellineaLogic.getTodosNivelLineasWithConnection(sFinalQuery,new Pagination());

					this.nivellineasForeignKey=nivellineaLogic.getNivelLineas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaNivelLinea(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					nivellineaLogic.getEntityWithConnection(comisionconfigSessionBean.getlidNivelLineaActual());
					this.nivellineasForeignKey.add(nivellineaLogic.getNivelLinea());
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

					if(this.comisionconfig!=null) {
						this.comisionconfig.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormComisionConfig!=null) {
						this.jInternalFrameDetalleFormComisionConfig.jComboBoxid_empresaComisionConfig.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaComisionConfig.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormComisionConfig!=null) {
						if(this.jInternalFrameDetalleFormComisionConfig.jComboBoxid_empresaComisionConfig.getItemCount()>0) {
							this.jInternalFrameDetalleFormComisionConfig.jComboBoxid_empresaComisionConfig.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaComisionConfigGenerico)throws Exception
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
				jComboBoxid_empresaComisionConfigGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaComisionConfigGenerico!=null && jComboBoxid_empresaComisionConfigGenerico.getItemCount()>0) {
					jComboBoxid_empresaComisionConfigGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoComisionConfigForeignKey(Long idTipoComisionConfigSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoComisionConfig  tipocomisionconfigTemp=null;

			for(TipoComisionConfig tipocomisionconfigAux:tipocomisionconfigsForeignKey) {
				if(tipocomisionconfigAux.getId()!=null && tipocomisionconfigAux.getId().equals(idTipoComisionConfigSeleccionado)) {
					tipocomisionconfigTemp=tipocomisionconfigAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipocomisionconfigTemp!=null) {

					if(this.comisionconfig!=null) {
						this.comisionconfig.setTipoComisionConfig(tipocomisionconfigTemp);
					}

					if(this.jInternalFrameDetalleFormComisionConfig!=null) {
						this.jInternalFrameDetalleFormComisionConfig.jComboBoxid_tipo_comision_configComisionConfig.setSelectedItem(tipocomisionconfigTemp);
					}
				} else {
					//jComboBoxid_tipo_comision_configComisionConfig.setSelectedItem(tipocomisionconfigTemp);
					if(this.jInternalFrameDetalleFormComisionConfig!=null) {
						if(this.jInternalFrameDetalleFormComisionConfig.jComboBoxid_tipo_comision_configComisionConfig.getItemCount()>0) {
							this.jInternalFrameDetalleFormComisionConfig.jComboBoxid_tipo_comision_configComisionConfig.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoComisionConfig") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipocomisionconfigTemp!=null && jComboBoxid_tipo_comision_configFK_IdTipoComisionConfigComisionConfig!=null) {
						jComboBoxid_tipo_comision_configFK_IdTipoComisionConfigComisionConfig.setSelectedItem(tipocomisionconfigTemp);
					} else {
						if(jComboBoxid_tipo_comision_configFK_IdTipoComisionConfigComisionConfig!=null) {
							//jComboBoxid_tipo_comision_configFK_IdTipoComisionConfigComisionConfig.setSelectedItem(tipocomisionconfigTemp);
							if(jComboBoxid_tipo_comision_configFK_IdTipoComisionConfigComisionConfig.getItemCount()>0) {
								jComboBoxid_tipo_comision_configFK_IdTipoComisionConfigComisionConfig.setSelectedIndex(0);
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

	public String getActualTipoComisionConfigForeignKeyDescripcion(Long idTipoComisionConfigSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoComisionConfig  tipocomisionconfigTemp=null;

			for(TipoComisionConfig tipocomisionconfigAux:tipocomisionconfigsForeignKey) {
				if(tipocomisionconfigAux.getId()!=null && tipocomisionconfigAux.getId().equals(idTipoComisionConfigSeleccionado)) {
					tipocomisionconfigTemp=tipocomisionconfigAux;
					break;
				}
			}


			sDescripcion=TipoComisionConfigConstantesFunciones.getTipoComisionConfigDescripcion(tipocomisionconfigTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoComisionConfigForeignKeyGenerico(Long idTipoComisionConfigSeleccionado,JComboBox jComboBoxid_tipo_comision_configComisionConfigGenerico)throws Exception
	{
		try
		{
			TipoComisionConfig  tipocomisionconfigTemp=null;

			for(TipoComisionConfig tipocomisionconfigAux:tipocomisionconfigsForeignKey) {
				if(tipocomisionconfigAux.getId()!=null && tipocomisionconfigAux.getId().equals(idTipoComisionConfigSeleccionado)) {
					tipocomisionconfigTemp=tipocomisionconfigAux;
					break;
				}
			}

			if(tipocomisionconfigTemp!=null) {
				jComboBoxid_tipo_comision_configComisionConfigGenerico.setSelectedItem(tipocomisionconfigTemp);
			} else {
				if(jComboBoxid_tipo_comision_configComisionConfigGenerico!=null && jComboBoxid_tipo_comision_configComisionConfigGenerico.getItemCount()>0) {
					jComboBoxid_tipo_comision_configComisionConfigGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualNivelLineaForeignKey(Long idNivelLineaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			NivelLinea  nivellineaTemp=null;

			for(NivelLinea nivellineaAux:nivellineasForeignKey) {
				if(nivellineaAux.getId()!=null && nivellineaAux.getId().equals(idNivelLineaSeleccionado)) {
					nivellineaTemp=nivellineaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(nivellineaTemp!=null) {

					if(this.comisionconfig!=null) {
						this.comisionconfig.setNivelLinea(nivellineaTemp);
					}

					if(this.jInternalFrameDetalleFormComisionConfig!=null) {
						this.jInternalFrameDetalleFormComisionConfig.jComboBoxid_nivel_lineaComisionConfig.setSelectedItem(nivellineaTemp);
					}
				} else {
					//jComboBoxid_nivel_lineaComisionConfig.setSelectedItem(nivellineaTemp);
					if(this.jInternalFrameDetalleFormComisionConfig!=null) {
						if(this.jInternalFrameDetalleFormComisionConfig.jComboBoxid_nivel_lineaComisionConfig.getItemCount()>0) {
							this.jInternalFrameDetalleFormComisionConfig.jComboBoxid_nivel_lineaComisionConfig.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdNivelLinea") || sFormularioTipoBusqueda.equals("Todos")){
					if(nivellineaTemp!=null && jComboBoxid_nivel_lineaFK_IdNivelLineaComisionConfig!=null) {
						jComboBoxid_nivel_lineaFK_IdNivelLineaComisionConfig.setSelectedItem(nivellineaTemp);
					} else {
						if(jComboBoxid_nivel_lineaFK_IdNivelLineaComisionConfig!=null) {
							//jComboBoxid_nivel_lineaFK_IdNivelLineaComisionConfig.setSelectedItem(nivellineaTemp);
							if(jComboBoxid_nivel_lineaFK_IdNivelLineaComisionConfig.getItemCount()>0) {
								jComboBoxid_nivel_lineaFK_IdNivelLineaComisionConfig.setSelectedIndex(0);
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

	public String getActualNivelLineaForeignKeyDescripcion(Long idNivelLineaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			NivelLinea  nivellineaTemp=null;

			for(NivelLinea nivellineaAux:nivellineasForeignKey) {
				if(nivellineaAux.getId()!=null && nivellineaAux.getId().equals(idNivelLineaSeleccionado)) {
					nivellineaTemp=nivellineaAux;
					break;
				}
			}


			sDescripcion=NivelLineaConstantesFunciones.getNivelLineaDescripcion(nivellineaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualNivelLineaForeignKeyGenerico(Long idNivelLineaSeleccionado,JComboBox jComboBoxid_nivel_lineaComisionConfigGenerico)throws Exception
	{
		try
		{
			NivelLinea  nivellineaTemp=null;

			for(NivelLinea nivellineaAux:nivellineasForeignKey) {
				if(nivellineaAux.getId()!=null && nivellineaAux.getId().equals(idNivelLineaSeleccionado)) {
					nivellineaTemp=nivellineaAux;
					break;
				}
			}

			if(nivellineaTemp!=null) {
				jComboBoxid_nivel_lineaComisionConfigGenerico.setSelectedItem(nivellineaTemp);
			} else {
				if(jComboBoxid_nivel_lineaComisionConfigGenerico!=null && jComboBoxid_nivel_lineaComisionConfigGenerico.getItemCount()>0) {
					jComboBoxid_nivel_lineaComisionConfigGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ComisionConfig comisionconfig,JComboBox jComboBoxid_empresaComisionConfigGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaComisionConfigGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormComisionConfig.jComboBoxid_empresaComisionConfig.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaComisionConfigGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				comisionconfig.setid_empresa(empresaAux.getId());
				comisionconfig.setempresa_descripcion(ComisionConfigConstantesFunciones.getEmpresaDescripcion(empresaAux));
				comisionconfig.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoComisionConfigForeignKey(ComisionConfig comisionconfig,JComboBox jComboBoxid_tipo_comision_configComisionConfigGenerico)throws Exception
	{
		try
		{
			TipoComisionConfig  tipocomisionconfigAux=new TipoComisionConfig();

			if(jComboBoxid_tipo_comision_configComisionConfigGenerico==null) {
				tipocomisionconfigAux=(TipoComisionConfig)this.jInternalFrameDetalleFormComisionConfig.jComboBoxid_tipo_comision_configComisionConfig.getSelectedItem();
			} else {
				tipocomisionconfigAux=(TipoComisionConfig)jComboBoxid_tipo_comision_configComisionConfigGenerico.getSelectedItem();
			}

			if(tipocomisionconfigAux!=null && tipocomisionconfigAux.getId()!=null) {
				comisionconfig.setid_tipo_comision_config(tipocomisionconfigAux.getId());
				comisionconfig.settipocomisionconfig_descripcion(ComisionConfigConstantesFunciones.getTipoComisionConfigDescripcion(tipocomisionconfigAux));
				comisionconfig.setTipoComisionConfig(tipocomisionconfigAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarNivelLineaForeignKey(ComisionConfig comisionconfig,JComboBox jComboBoxid_nivel_lineaComisionConfigGenerico)throws Exception
	{
		try
		{
			NivelLinea  nivellineaAux=new NivelLinea();

			if(jComboBoxid_nivel_lineaComisionConfigGenerico==null) {
				nivellineaAux=(NivelLinea)this.jInternalFrameDetalleFormComisionConfig.jComboBoxid_nivel_lineaComisionConfig.getSelectedItem();
			} else {
				nivellineaAux=(NivelLinea)jComboBoxid_nivel_lineaComisionConfigGenerico.getSelectedItem();
			}

			if(nivellineaAux!=null && nivellineaAux.getId()!=null) {
				comisionconfig.setid_nivel_linea(nivellineaAux.getId());
				comisionconfig.setnivellinea_descripcion(ComisionConfigConstantesFunciones.getNivelLineaDescripcion(nivellineaAux));
				comisionconfig.setNivelLinea(nivellineaAux);			}
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

					if(!ComisionConfigJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormComisionConfig!=null) { 
							this.jInternalFrameDetalleFormComisionConfig.jComboBoxid_empresaComisionConfig.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormComisionConfig.jComboBoxid_empresaComisionConfig.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormComisionConfig!=null) { 
					}

					if(!ComisionConfigJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoComisionConfigsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoComisionConfig=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ComisionConfigJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormComisionConfig!=null) { 
							this.jInternalFrameDetalleFormComisionConfig.jComboBoxid_tipo_comision_configComisionConfig.removeAllItems();

							for(TipoComisionConfig tipocomisionconfig:this.tipocomisionconfigsForeignKey) {
								this.jInternalFrameDetalleFormComisionConfig.jComboBoxid_tipo_comision_configComisionConfig.addItem(tipocomisionconfig);
							}
						}
					}

					if(this.jInternalFrameDetalleFormComisionConfig!=null) { 
					}

					if(!ComisionConfigJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoComisionConfig") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ComisionConfigJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_comision_configFK_IdTipoComisionConfigComisionConfig.removeAllItems();

							for(TipoComisionConfig tipocomisionconfig:this.tipocomisionconfigsForeignKey) {
								this.jComboBoxid_tipo_comision_configFK_IdTipoComisionConfigComisionConfig.addItem(tipocomisionconfig);
							}
						}

						if(!ComisionConfigJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameNivelLineasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingNivelLinea=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ComisionConfigJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormComisionConfig!=null) { 
							this.jInternalFrameDetalleFormComisionConfig.jComboBoxid_nivel_lineaComisionConfig.removeAllItems();

							for(NivelLinea nivellinea:this.nivellineasForeignKey) {
								this.jInternalFrameDetalleFormComisionConfig.jComboBoxid_nivel_lineaComisionConfig.addItem(nivellinea);
							}
						}
					}

					if(this.jInternalFrameDetalleFormComisionConfig!=null) { 
					}

					if(!ComisionConfigJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdNivelLinea") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ComisionConfigJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_nivel_lineaFK_IdNivelLineaComisionConfig.removeAllItems();

							for(NivelLinea nivellinea:this.nivellineasForeignKey) {
								this.jComboBoxid_nivel_lineaFK_IdNivelLineaComisionConfig.addItem(nivellinea);
							}
						}

						if(!ComisionConfigJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormComisionConfig!=null) {
							this.jInternalFrameDetalleFormComisionConfig.jComboBoxid_empresaComisionConfig.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormComisionConfig!=null) {
							this.jInternalFrameDetalleFormComisionConfig.jComboBoxid_empresaComisionConfig.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameTipoComisionConfigForeignKey(TipoComisionConfig tipocomisionconfig,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormComisionConfig!=null) {
							this.jInternalFrameDetalleFormComisionConfig.jComboBoxid_tipo_comision_configComisionConfig.setSelectedItem(tipocomisionconfig);
						}
					} else {
						if(this.jInternalFrameDetalleFormComisionConfig!=null) {
							this.jInternalFrameDetalleFormComisionConfig.jComboBoxid_tipo_comision_configComisionConfig.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_comision_configFK_IdTipoComisionConfigComisionConfig.setSelectedItem(tipocomisionconfig);
						} else {
							this.jComboBoxid_tipo_comision_configFK_IdTipoComisionConfigComisionConfig.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameNivelLineaForeignKey(NivelLinea nivellinea,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormComisionConfig!=null) {
							this.jInternalFrameDetalleFormComisionConfig.jComboBoxid_nivel_lineaComisionConfig.setSelectedItem(nivellinea);
						}
					} else {
						if(this.jInternalFrameDetalleFormComisionConfig!=null) {
							this.jInternalFrameDetalleFormComisionConfig.jComboBoxid_nivel_lineaComisionConfig.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_nivel_lineaFK_IdNivelLineaComisionConfig.setSelectedItem(nivellinea);
						} else {
							this.jComboBoxid_nivel_lineaFK_IdNivelLineaComisionConfig.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesComisionConfig() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ComisionConfigConstantesFunciones.refrescarForeignKeysDescripcionesComisionConfig(this.comisionconfigLogic.getComisionConfigs());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			ComisionConfigConstantesFunciones.refrescarForeignKeysDescripcionesComisionConfig(this.comisionconfigs);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(TipoComisionConfig.class));
		classes.add(new Classe(NivelLinea.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//comisionconfigLogic.setComisionConfigs(this.comisionconfigs);
			comisionconfigLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public ComisionConfigParameterReturnGeneral getComisionConfigParameterGeneral() {
		return this.comisionconfigParameterGeneral;
	}
	
	public void setComisionConfigParameterGeneral(ComisionConfigParameterReturnGeneral comisionconfigParameterGeneral) {
		this.comisionconfigParameterGeneral = comisionconfigParameterGeneral;
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
	
	public Boolean getIsPermisoTodoComisionConfig() {
		return isPermisoTodoComisionConfig;
	}

	public void setIsPermisoTodoComisionConfig(Boolean isPermisoTodoComisionConfig) {
		this.isPermisoTodoComisionConfig = isPermisoTodoComisionConfig;
	}

	public Boolean getIsPermisoNuevoComisionConfig() {
		return isPermisoNuevoComisionConfig;
	}

	public void setIsPermisoNuevoComisionConfig(Boolean isPermisoNuevoComisionConfig) {
		this.isPermisoNuevoComisionConfig = isPermisoNuevoComisionConfig;
	}

	public Boolean getIsPermisoActualizarComisionConfig() {
		return isPermisoActualizarComisionConfig;
	}

	public void setIsPermisoActualizarComisionConfig(Boolean isPermisoActualizarComisionConfig) {
		this.isPermisoActualizarComisionConfig = isPermisoActualizarComisionConfig;
	}

	public Boolean getIsPermisoEliminarComisionConfig() {
		return isPermisoEliminarComisionConfig;
	}

	public void setIsPermisoEliminarComisionConfig(Boolean isPermisoEliminarComisionConfig) {
		this.isPermisoEliminarComisionConfig = isPermisoEliminarComisionConfig;
	}

	public Boolean getIsPermisoGuardarCambiosComisionConfig() {
		return isPermisoGuardarCambiosComisionConfig;
	}

	public void setIsPermisoGuardarCambiosComisionConfig(Boolean isPermisoGuardarCambiosComisionConfig) {
		this.isPermisoGuardarCambiosComisionConfig = isPermisoGuardarCambiosComisionConfig;
	}
	
	public Boolean getIsPermisoConsultaComisionConfig() {
		return isPermisoConsultaComisionConfig;
	}

	public void setIsPermisoConsultaComisionConfig(Boolean isPermisoConsultaComisionConfig) {
		this.isPermisoConsultaComisionConfig = isPermisoConsultaComisionConfig;
	}

	public Boolean getIsPermisoBusquedaComisionConfig() {
		return isPermisoBusquedaComisionConfig;
	}

	public void setIsPermisoBusquedaComisionConfig(Boolean isPermisoBusquedaComisionConfig) {
		this.isPermisoBusquedaComisionConfig = isPermisoBusquedaComisionConfig;
	}

	public Boolean getIsPermisoReporteComisionConfig() {
		return isPermisoReporteComisionConfig;
	}

	public void setIsPermisoReporteComisionConfig(Boolean isPermisoReporteComisionConfig) {
		this.isPermisoReporteComisionConfig = isPermisoReporteComisionConfig;
	}
	
	public Boolean getIsPermisoPaginacionMedioComisionConfig() {
		return isPermisoPaginacionMedioComisionConfig;
	}

	public void setIsPermisoPaginacionMedioComisionConfig(Boolean isPermisoPaginacionMedioComisionConfig) {
		this.isPermisoPaginacionMedioComisionConfig = isPermisoPaginacionMedioComisionConfig;
	}
	
	public Boolean getIsPermisoPaginacionTodoComisionConfig() {
		return isPermisoPaginacionTodoComisionConfig;
	}

	public void setIsPermisoPaginacionTodoComisionConfig(Boolean isPermisoPaginacionTodoComisionConfig) {
		this.isPermisoPaginacionTodoComisionConfig = isPermisoPaginacionTodoComisionConfig;
	}
	
	public Boolean getIsPermisoPaginacionAltoComisionConfig() {
		return isPermisoPaginacionAltoComisionConfig;
	}

	public void setIsPermisoPaginacionAltoComisionConfig(Boolean isPermisoPaginacionAltoComisionConfig) {
		this.isPermisoPaginacionAltoComisionConfig = isPermisoPaginacionAltoComisionConfig;
	}
	
	public Boolean getIsPermisoCopiarComisionConfig() {
		return isPermisoCopiarComisionConfig;
	}

	public void setIsPermisoCopiarComisionConfig(Boolean isPermisoCopiarComisionConfig) {
		this.isPermisoCopiarComisionConfig = isPermisoCopiarComisionConfig;
	}
	
	public Boolean getIsPermisoVerFormComisionConfig() {
		return isPermisoVerFormComisionConfig;
	}

	public void setIsPermisoVerFormComisionConfig(Boolean isPermisoVerFormComisionConfig) {
		this.isPermisoVerFormComisionConfig = isPermisoVerFormComisionConfig;
	}
	
	public Boolean getIsPermisoDuplicarComisionConfig() {
		return isPermisoDuplicarComisionConfig;
	}

	public void setIsPermisoDuplicarComisionConfig(Boolean isPermisoDuplicarComisionConfig) {
		this.isPermisoDuplicarComisionConfig = isPermisoDuplicarComisionConfig;
	}
	
	public Boolean getIsPermisoOrdenComisionConfig() {
		return isPermisoOrdenComisionConfig;
	}

	public void setIsPermisoOrdenComisionConfig(Boolean isPermisoOrdenComisionConfig) {
		this.isPermisoOrdenComisionConfig = isPermisoOrdenComisionConfig;
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
	
	public Boolean getIsVisibilidadCeldaNuevoComisionConfig() {
		return isVisibilidadCeldaNuevoComisionConfig;
	}

	public void setIsVisibilidadCeldaNuevoComisionConfig(Boolean isVisibilidadCeldaNuevoComisionConfig) {
		this.isVisibilidadCeldaNuevoComisionConfig = isVisibilidadCeldaNuevoComisionConfig;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarComisionConfig() {
		return isVisibilidadCeldaDuplicarComisionConfig;
	}

	public void setIsVisibilidadCeldaDuplicarComisionConfig(Boolean isVisibilidadCeldaDuplicarComisionConfig) {
		this.isVisibilidadCeldaDuplicarComisionConfig = isVisibilidadCeldaDuplicarComisionConfig;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarComisionConfig() {
		return isVisibilidadCeldaCopiarComisionConfig;
	}

	public void setIsVisibilidadCeldaCopiarComisionConfig(Boolean isVisibilidadCeldaCopiarComisionConfig) {
		this.isVisibilidadCeldaCopiarComisionConfig = isVisibilidadCeldaCopiarComisionConfig;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormComisionConfig() {
		return isVisibilidadCeldaVerFormComisionConfig;
	}

	public void setIsVisibilidadCeldaVerFormComisionConfig(Boolean isVisibilidadCeldaVerFormComisionConfig) {
		this.isVisibilidadCeldaVerFormComisionConfig = isVisibilidadCeldaVerFormComisionConfig;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenComisionConfig() {
		return isVisibilidadCeldaOrdenComisionConfig;
	}

	public void setIsVisibilidadCeldaOrdenComisionConfig(Boolean isVisibilidadCeldaOrdenComisionConfig) {
		this.isVisibilidadCeldaOrdenComisionConfig = isVisibilidadCeldaOrdenComisionConfig;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesComisionConfig() {
		return isVisibilidadCeldaNuevoRelacionesComisionConfig;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesComisionConfig(Boolean isVisibilidadCeldaNuevoRelacionesComisionConfig) {
		this.isVisibilidadCeldaNuevoRelacionesComisionConfig = isVisibilidadCeldaNuevoRelacionesComisionConfig;
	}
	
	public Boolean getIsVisibilidadCeldaModificarComisionConfig() {
		return isVisibilidadCeldaModificarComisionConfig;
	}

	public void setIsVisibilidadCeldaModificarComisionConfig(Boolean isVisibilidadCeldaModificarComisionConfig) {
		this.isVisibilidadCeldaModificarComisionConfig = isVisibilidadCeldaModificarComisionConfig;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarComisionConfig() {
		return isVisibilidadCeldaActualizarComisionConfig;
	}

	public void setIsVisibilidadCeldaActualizarComisionConfig(Boolean isVisibilidadCeldaActualizarComisionConfig) {
		this.isVisibilidadCeldaActualizarComisionConfig = isVisibilidadCeldaActualizarComisionConfig;
	}

	public Boolean getIsVisibilidadCeldaEliminarComisionConfig() {
		return isVisibilidadCeldaEliminarComisionConfig;
	}

	public void setIsVisibilidadCeldaEliminarComisionConfig(Boolean isVisibilidadCeldaEliminarComisionConfig) {
		this.isVisibilidadCeldaEliminarComisionConfig = isVisibilidadCeldaEliminarComisionConfig;
	}

	public Boolean getIsVisibilidadCeldaCancelarComisionConfig() {
		return isVisibilidadCeldaCancelarComisionConfig;
	}

	public void setIsVisibilidadCeldaCancelarComisionConfig(Boolean isVisibilidadCeldaCancelarComisionConfig) {
		this.isVisibilidadCeldaCancelarComisionConfig = isVisibilidadCeldaCancelarComisionConfig;
	}

	public Boolean getIsVisibilidadCeldaGuardarComisionConfig() {
		return isVisibilidadCeldaGuardarComisionConfig;
	}

	public void setIsVisibilidadCeldaGuardarComisionConfig(Boolean isVisibilidadCeldaGuardarComisionConfig) {
		this.isVisibilidadCeldaGuardarComisionConfig = isVisibilidadCeldaGuardarComisionConfig;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosComisionConfig() {
		return isVisibilidadCeldaGuardarCambiosComisionConfig;
	}

	public void setIsVisibilidadCeldaGuardarCambiosComisionConfig(Boolean isVisibilidadCeldaGuardarCambiosComisionConfig) {
		this.isVisibilidadCeldaGuardarCambiosComisionConfig = isVisibilidadCeldaGuardarCambiosComisionConfig;
	}
		
	public ComisionConfigSessionBean getcomisionconfigSessionBean() {
		return this.comisionconfigSessionBean;
	}
	
	public void setcomisionconfigSessionBean(ComisionConfigSessionBean comisionconfigSessionBean) {
		this.comisionconfigSessionBean=comisionconfigSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdNivelLinea() {
		return this.isVisibilidadFK_IdNivelLinea;
	}

	public void setisVisibilidadFK_IdNivelLinea(Boolean isVisibilidadFK_IdNivelLinea) {
		this.isVisibilidadFK_IdNivelLinea=isVisibilidadFK_IdNivelLinea;
	}

	public Boolean getisVisibilidadFK_IdTipoComisionConfig() {
		return this.isVisibilidadFK_IdTipoComisionConfig;
	}

	public void setisVisibilidadFK_IdTipoComisionConfig(Boolean isVisibilidadFK_IdTipoComisionConfig) {
		this.isVisibilidadFK_IdTipoComisionConfig=isVisibilidadFK_IdTipoComisionConfig;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysComisionConfig(ComisionConfig comisionconfig)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(comisionconfig,null);
				this.setActualParaGuardarTipoComisionConfigForeignKey(comisionconfig,null);
				this.setActualParaGuardarNivelLineaForeignKey(comisionconfig,null);
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
	
	public void bugActualizarReferenciaActual(ComisionConfig comisionconfig,ComisionConfig comisionconfigAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalComisionConfig(comisionconfig);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		comisionconfigAux.setId(comisionconfig.getId());
		comisionconfigAux.setVersionRow(comisionconfig.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessComisionConfig();
		
			int intSelectedRow = this.jTableDatosComisionConfig.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionconfig =(ComisionConfig) this.comisionconfigLogic.getComisionConfigs().toArray()[this.jTableDatosComisionConfig.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.comisionconfig =(ComisionConfig) this.comisionconfigs.toArray()[this.jTableDatosComisionConfig.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(ComisionConfigJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualComisionConfig(this.comisionconfig,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysComisionConfig(this.comisionconfig);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = comisionconfigValidator.getInvalidValues(this.comisionconfig);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			comisionconfigLogic.setDatosCliente(datosCliente);
			comisionconfigLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				comisionconfigAux=new  ComisionConfig();
				
				comisionconfigAux.setIsNew(true);
				comisionconfigAux.setIsChanged(true);
				
				comisionconfigAux.setComisionConfigOriginal(this.comisionconfig);
				
				comisionconfigAux.setId(this.comisionconfig.getId());	
				comisionconfigAux.setVersionRow(this.comisionconfig.getVersionRow());	
				comisionconfigAux.setid_empresa(this.comisionconfig.getid_empresa());	
				comisionconfigAux.setid_tipo_comision_config(this.comisionconfig.getid_tipo_comision_config());	
				comisionconfigAux.setid_nivel_linea(this.comisionconfig.getid_nivel_linea());	
				comisionconfigAux.setcon_vendedor(this.comisionconfig.getcon_vendedor());	
				comisionconfigAux.setcon_ventas(this.comisionconfig.getcon_ventas());	
				comisionconfigAux.setcon_cobros(this.comisionconfig.getcon_cobros());	
				comisionconfigAux.setcon_remesa_transito(this.comisionconfig.getcon_remesa_transito());	
				comisionconfigAux.setcon_penalidad(this.comisionconfig.getcon_penalidad());	
				comisionconfigAux.setcon_abono(this.comisionconfig.getcon_abono());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.comisionconfigSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.comisionconfigSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(comisionconfigAux,comisionconfigLogic.getComisionConfigs());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(comisionconfigAux,comisionconfigs);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.comisionconfigSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.comisionconfigSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						comisionconfigLogic.saveComisionConfigs();//WithConnection
						//comisionconfigLogic.getSetVersionRowComisionConfigs();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.comisionconfig,comisionconfigAux);
					
					this.refrescarForeignKeysDescripcionesComisionConfig();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.comisionconfigSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame.comisioncateLogic.getComisionCates().addAll(this.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame.comisioncatesEliminados);
							this.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame.comisionmarcaLogic.getComisionMarcas().addAll(this.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame.comisionmarcasEliminados);
							this.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame.comisionlineaLogic.getComisionLineas().addAll(this.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame.comisionlineasEliminados);
							this.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame.comisionpenaLogic.getComisionPenas().addAll(this.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame.comisionpenasEliminados);
							this.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame.comisiongrupoLogic.getComisionGrupos().addAll(this.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame.comisiongruposEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame.comisioncates.addAll(this.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame.comisioncatesEliminados);
							this.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame.comisionmarcas.addAll(this.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame.comisionmarcasEliminados);
							this.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame.comisionlineas.addAll(this.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame.comisionlineasEliminados);
							this.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame.comisionpenas.addAll(this.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame.comisionpenasEliminados);
							this.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame.comisiongrupos.addAll(this.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame.comisiongruposEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.comisionconfigSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								comisionconfigLogic.saveComisionConfigRelaciones(comisionconfigAux,this.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame.comisioncateLogic.getComisionCates(),this.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame.comisionmarcaLogic.getComisionMarcas(),this.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame.comisionlineaLogic.getComisionLineas(),this.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame.comisionpenaLogic.getComisionPenas(),this.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame.comisiongrupoLogic.getComisionGrupos());//WithConnection
								//comisionconfigLogic.getSetVersionRowComisionConfigs();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.comisionconfig,comisionconfigAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame.comisioncateLogic.setComisionCates(new ArrayList<ComisionCate>());
							this.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame.comisionmarcaLogic.setComisionMarcas(new ArrayList<ComisionMarca>());
							this.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame.comisionlineaLogic.setComisionLineas(new ArrayList<ComisionLinea>());
							this.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame.comisionpenaLogic.setComisionPenas(new ArrayList<ComisionPena>());
							this.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame.comisiongrupoLogic.setComisionGrupos(new ArrayList<ComisionGrupo>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame.comisioncates= new ArrayList<ComisionCate>();
							this.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame.comisionmarcas= new ArrayList<ComisionMarca>();
							this.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame.comisionlineas= new ArrayList<ComisionLinea>();
							this.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame.comisionpenas= new ArrayList<ComisionPena>();
							this.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame.comisiongrupos= new ArrayList<ComisionGrupo>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame.quitarFilaTotales();}
							comisionconfigAux.setComisionCates(this.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame.comisioncateLogic.getComisionCates());

							if(this.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame.quitarFilaTotales();}
							comisionconfigAux.setComisionMarcas(this.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame.comisionmarcaLogic.getComisionMarcas());

							if(this.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame.quitarFilaTotales();}
							comisionconfigAux.setComisionLineas(this.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame.comisionlineaLogic.getComisionLineas());

							if(this.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame.quitarFilaTotales();}
							comisionconfigAux.setComisionPenas(this.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame.comisionpenaLogic.getComisionPenas());

							if(this.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame.quitarFilaTotales();}
							comisionconfigAux.setComisionGrupos(this.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame.comisiongrupoLogic.getComisionGrupos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.comisionconfigSessionBean.getEstaModoGuardarRelaciones() 
									|| this.comisionconfigSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(comisionconfigAux,comisionconfigLogic.getComisionConfigs());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(comisionconfigAux,comisionconfigs);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.comisionconfig,comisionconfigAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				comisionconfigAux=new  ComisionConfig();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.comisionconfigSessionBean.getEsGuardarRelacionado() 
					|| (this.comisionconfigSessionBean.getEsGuardarRelacionado() && this.comisionconfig.getId()>=0)) {
						
					comisionconfigAux.setIsNew(false);
				}
				
				comisionconfigAux.setIsDeleted(false);
			
				comisionconfigAux.setId(this.comisionconfig.getId());	
				comisionconfigAux.setVersionRow(this.comisionconfig.getVersionRow());	
				comisionconfigAux.setid_empresa(this.comisionconfig.getid_empresa());	
				comisionconfigAux.setid_tipo_comision_config(this.comisionconfig.getid_tipo_comision_config());	
				comisionconfigAux.setid_nivel_linea(this.comisionconfig.getid_nivel_linea());	
				comisionconfigAux.setcon_vendedor(this.comisionconfig.getcon_vendedor());	
				comisionconfigAux.setcon_ventas(this.comisionconfig.getcon_ventas());	
				comisionconfigAux.setcon_cobros(this.comisionconfig.getcon_cobros());	
				comisionconfigAux.setcon_remesa_transito(this.comisionconfig.getcon_remesa_transito());	
				comisionconfigAux.setcon_penalidad(this.comisionconfig.getcon_penalidad());	
				comisionconfigAux.setcon_abono(this.comisionconfig.getcon_abono());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(comisionconfigAux,comisionconfigLogic.getComisionConfigs());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(comisionconfigAux,comisionconfigs);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.comisionconfigSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.comisionconfigSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						comisionconfigLogic.saveComisionConfigs();//WithConnection
						//comisionconfigLogic.getSetVersionRowComisionConfigs();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.comisionconfig,comisionconfigAux);
					
					this.refrescarForeignKeysDescripcionesComisionConfig();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.comisionconfigSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame.comisioncateLogic.getComisionCates().addAll(this.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame.comisioncatesEliminados);
							this.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame.comisionmarcaLogic.getComisionMarcas().addAll(this.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame.comisionmarcasEliminados);
							this.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame.comisionlineaLogic.getComisionLineas().addAll(this.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame.comisionlineasEliminados);
							this.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame.comisionpenaLogic.getComisionPenas().addAll(this.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame.comisionpenasEliminados);
							this.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame.comisiongrupoLogic.getComisionGrupos().addAll(this.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame.comisiongruposEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame.comisioncates.addAll(this.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame.comisioncatesEliminados);
							this.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame.comisionmarcas.addAll(this.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame.comisionmarcasEliminados);
							this.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame.comisionlineas.addAll(this.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame.comisionlineasEliminados);
							this.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame.comisionpenas.addAll(this.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame.comisionpenasEliminados);
							this.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame.comisiongrupos.addAll(this.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame.comisiongruposEliminados);
						}
						//ARCHITECTURE
						
						if(!this.comisionconfigSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								comisionconfigLogic.saveComisionConfigRelaciones(comisionconfigAux,this.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame.comisioncateLogic.getComisionCates(),this.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame.comisionmarcaLogic.getComisionMarcas(),this.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame.comisionlineaLogic.getComisionLineas(),this.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame.comisionpenaLogic.getComisionPenas(),this.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame.comisiongrupoLogic.getComisionGrupos());//WithConnection
								//comisionconfigLogic.getSetVersionRowComisionConfigs();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.comisionconfig,comisionconfigAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame.comisioncateLogic.setComisionCates(new ArrayList<ComisionCate>());
							this.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame.comisionmarcaLogic.setComisionMarcas(new ArrayList<ComisionMarca>());
							this.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame.comisionlineaLogic.setComisionLineas(new ArrayList<ComisionLinea>());
							this.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame.comisionpenaLogic.setComisionPenas(new ArrayList<ComisionPena>());
							this.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame.comisiongrupoLogic.setComisionGrupos(new ArrayList<ComisionGrupo>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame.comisioncates= new ArrayList<ComisionCate>();
							this.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame.comisionmarcas= new ArrayList<ComisionMarca>();
							this.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame.comisionlineas= new ArrayList<ComisionLinea>();
							this.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame.comisionpenas= new ArrayList<ComisionPena>();
							this.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame.comisiongrupos= new ArrayList<ComisionGrupo>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame.quitarFilaTotales();}
							comisionconfigAux.setComisionCates(this.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame.comisioncateLogic.getComisionCates());

							if(this.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame.quitarFilaTotales();}
							comisionconfigAux.setComisionMarcas(this.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame.comisionmarcaLogic.getComisionMarcas());

							if(this.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame.quitarFilaTotales();}
							comisionconfigAux.setComisionLineas(this.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame.comisionlineaLogic.getComisionLineas());

							if(this.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame.quitarFilaTotales();}
							comisionconfigAux.setComisionPenas(this.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame.comisionpenaLogic.getComisionPenas());

							if(this.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame.quitarFilaTotales();}
							comisionconfigAux.setComisionGrupos(this.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame.comisiongrupoLogic.getComisionGrupos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.comisionconfigSessionBean.getEstaModoGuardarRelaciones() 
									|| this.comisionconfigSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(comisionconfigAux,comisionconfigLogic.getComisionConfigs());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(comisionconfigAux,comisionconfigs);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.comisionconfig,comisionconfigAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				comisionconfigAux=new  ComisionConfig();
				
				comisionconfigAux.setIsNew(false);
				comisionconfigAux.setIsChanged(false);
				
				comisionconfigAux.setIsDeleted(true);
				
				comisionconfigAux.setId(this.comisionconfig.getId());	
				comisionconfigAux.setVersionRow(this.comisionconfig.getVersionRow());	
				comisionconfigAux.setid_empresa(this.comisionconfig.getid_empresa());	
				comisionconfigAux.setid_tipo_comision_config(this.comisionconfig.getid_tipo_comision_config());	
				comisionconfigAux.setid_nivel_linea(this.comisionconfig.getid_nivel_linea());	
				comisionconfigAux.setcon_vendedor(this.comisionconfig.getcon_vendedor());	
				comisionconfigAux.setcon_ventas(this.comisionconfig.getcon_ventas());	
				comisionconfigAux.setcon_cobros(this.comisionconfig.getcon_cobros());	
				comisionconfigAux.setcon_remesa_transito(this.comisionconfig.getcon_remesa_transito());	
				comisionconfigAux.setcon_penalidad(this.comisionconfig.getcon_penalidad());	
				comisionconfigAux.setcon_abono(this.comisionconfig.getcon_abono());	
				
				if(this.comisionconfigSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.comisionconfigAux.getId()>=0) {	
						this.comisionconfigsEliminados.add(comisionconfigAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(comisionconfigAux,comisionconfigLogic.getComisionConfigs());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(comisionconfigAux,comisionconfigs);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.comisionconfigSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.comisionconfigSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						comisionconfigLogic.saveComisionConfigs();//WithConnection
						//comisionconfigLogic.getSetVersionRowComisionConfigs();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.comisionconfigSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame.comisioncateLogic.getComisionCates().addAll(this.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame.comisioncatesEliminados);
							this.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame.comisionmarcaLogic.getComisionMarcas().addAll(this.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame.comisionmarcasEliminados);
							this.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame.comisionlineaLogic.getComisionLineas().addAll(this.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame.comisionlineasEliminados);
							this.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame.comisionpenaLogic.getComisionPenas().addAll(this.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame.comisionpenasEliminados);
							this.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame.comisiongrupoLogic.getComisionGrupos().addAll(this.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame.comisiongruposEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame.comisioncates.addAll(this.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame.comisioncatesEliminados);
							this.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame.comisionmarcas.addAll(this.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame.comisionmarcasEliminados);
							this.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame.comisionlineas.addAll(this.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame.comisionlineasEliminados);
							this.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame.comisionpenas.addAll(this.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame.comisionpenasEliminados);
							this.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame.comisiongrupos.addAll(this.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame.comisiongruposEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.comisionconfigSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								comisionconfigLogic.saveComisionConfigRelaciones(comisionconfigAux,this.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame.comisioncateLogic.getComisionCates(),this.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame.comisionmarcaLogic.getComisionMarcas(),this.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame.comisionlineaLogic.getComisionLineas(),this.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame.comisionpenaLogic.getComisionPenas(),this.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame.comisiongrupoLogic.getComisionGrupos());//WithConnection
								//comisionconfigLogic.getSetVersionRowComisionConfigs();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame.comisioncateLogic.setComisionCates(new ArrayList<ComisionCate>());
							this.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame.comisionmarcaLogic.setComisionMarcas(new ArrayList<ComisionMarca>());
							this.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame.comisionlineaLogic.setComisionLineas(new ArrayList<ComisionLinea>());
							this.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame.comisionpenaLogic.setComisionPenas(new ArrayList<ComisionPena>());
							this.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame.comisiongrupoLogic.setComisionGrupos(new ArrayList<ComisionGrupo>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame.comisioncates= new ArrayList<ComisionCate>();
							this.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame.comisionmarcas= new ArrayList<ComisionMarca>();
							this.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame.comisionlineas= new ArrayList<ComisionLinea>();
							this.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame.comisionpenas= new ArrayList<ComisionPena>();
							this.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame.comisiongrupos= new ArrayList<ComisionGrupo>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame.quitarFilaTotales();}
							comisionconfigAux.setComisionCates(this.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame.comisioncateLogic.getComisionCates());

							if(this.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame.quitarFilaTotales();}
							comisionconfigAux.setComisionMarcas(this.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame.comisionmarcaLogic.getComisionMarcas());

							if(this.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame.quitarFilaTotales();}
							comisionconfigAux.setComisionLineas(this.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame.comisionlineaLogic.getComisionLineas());

							if(this.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame.quitarFilaTotales();}
							comisionconfigAux.setComisionPenas(this.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame.comisionpenaLogic.getComisionPenas());

							if(this.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame.quitarFilaTotales();}
							comisionconfigAux.setComisionGrupos(this.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame.comisiongrupoLogic.getComisionGrupos());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.comisionconfigSessionBean.getEstaModoGuardarRelaciones() 
								|| this.comisionconfigSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(comisionconfigAux,comisionconfigLogic.getComisionConfigs());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(comisionconfigAux,comisionconfigs);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionconfigLogic.getComisionConfigs().addAll(this.comisionconfigsEliminados);
					
					comisionconfigLogic.saveComisionConfigs();//WithConnection
					//comisionconfigLogic.getSetVersionRowComisionConfigs();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesComisionConfig();
				
				this.comisionconfigsEliminados= new ArrayList<ComisionConfig>();		
			}
			
			if(this.comisionconfigSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comisionconfigSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Comision Config GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Comision Config",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.comisionconfig=comisionconfigAux;
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
      		//this.finishProcessComisionConfig();
      	}
		
	}	
	
	public void actualizarRelaciones(ComisionConfig comisionconfigLocal) throws Exception {
		
		if(this.comisionconfigSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				comisionconfigLocal.setComisionCates(this.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame.comisioncateLogic.getComisionCates());
				comisionconfigLocal.setComisionMarcas(this.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame.comisionmarcaLogic.getComisionMarcas());
				comisionconfigLocal.setComisionLineas(this.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame.comisionlineaLogic.getComisionLineas());
				comisionconfigLocal.setComisionPenas(this.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame.comisionpenaLogic.getComisionPenas());
				comisionconfigLocal.setComisionGrupos(this.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame.comisiongrupoLogic.getComisionGrupos());
			
			} else {
			
				comisionconfigLocal.setComisionCates(this.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame.comisioncates);
				comisionconfigLocal.setComisionMarcas(this.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame.comisionmarcas);
				comisionconfigLocal.setComisionLineas(this.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame.comisionlineas);
				comisionconfigLocal.setComisionPenas(this.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame.comisionpenas);
				comisionconfigLocal.setComisionGrupos(this.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame.comisiongrupos);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ComisionConfig comisionconfigLocal) throws Exception {	
		if(this.comisionconfigSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				comisionconfigLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoComisionConfigDetalleFormJInternalFrame.class)) {
				TipoComisionConfigBeanSwingJInternalFrame tipocomisionconfigBeanSwingJInternalFrameLocal=(TipoComisionConfigBeanSwingJInternalFrame) ((TipoComisionConfigDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipocomisionconfigBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoComisionConfig(tipocomisionconfigBeanSwingJInternalFrameLocal.gettipocomisionconfig(),true);
				tipocomisionconfigBeanSwingJInternalFrameLocal.actualizarLista(tipocomisionconfigBeanSwingJInternalFrameLocal.tipocomisionconfig,this.tipocomisionconfigsForeignKey);

				tipocomisionconfigBeanSwingJInternalFrameLocal.actualizarRelaciones(tipocomisionconfigBeanSwingJInternalFrameLocal.tipocomisionconfig);

				comisionconfigLocal.setTipoComisionConfig(tipocomisionconfigBeanSwingJInternalFrameLocal.tipocomisionconfig);

				this.addItemDefectoCombosForeignKeyTipoComisionConfig();
				this.cargarCombosFrameTipoComisionConfigsForeignKey("Formulario");
				this.setActualTipoComisionConfigForeignKey(tipocomisionconfigBeanSwingJInternalFrameLocal.tipocomisionconfig.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(NivelLineaDetalleFormJInternalFrame.class)) {
				NivelLineaBeanSwingJInternalFrame nivellineaBeanSwingJInternalFrameLocal=(NivelLineaBeanSwingJInternalFrame) ((NivelLineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				nivellineaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoNivelLinea(nivellineaBeanSwingJInternalFrameLocal.getnivellinea(),true);
				nivellineaBeanSwingJInternalFrameLocal.actualizarLista(nivellineaBeanSwingJInternalFrameLocal.nivellinea,this.nivellineasForeignKey);

				nivellineaBeanSwingJInternalFrameLocal.actualizarRelaciones(nivellineaBeanSwingJInternalFrameLocal.nivellinea);

				comisionconfigLocal.setNivelLinea(nivellineaBeanSwingJInternalFrameLocal.nivellinea);

				this.addItemDefectoCombosForeignKeyNivelLinea();
				this.cargarCombosFrameNivelLineasForeignKey("Formulario");
				this.setActualNivelLineaForeignKey(nivellineaBeanSwingJInternalFrameLocal.nivellinea.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarComisionConfigActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosComisionConfig.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.comisionconfig =(ComisionConfig) this.comisionconfigLogic.getComisionConfigs().toArray()[this.jTableDatosComisionConfig.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.comisionconfig =(ComisionConfig) this.comisionconfigs.toArray()[this.jTableDatosComisionConfig.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = comisionconfigValidator.getInvalidValues(this.comisionconfig);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ComisionConfig comisionconfig,List<ComisionConfig> comisionconfigs) throws Exception {
		try	{		
			ComisionConfigConstantesFunciones.actualizarLista(comisionconfig,comisionconfigs,this.comisionconfigSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(ComisionConfig comisionconfig,List<ComisionConfig> comisionconfigs) throws Exception {
		try	{			
			ComisionConfigConstantesFunciones.actualizarSelectedLista(comisionconfig,comisionconfigs);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ComisionConfig> comisionconfigsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				comisionconfigsLocal=this.comisionconfigLogic.getComisionConfigs();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				comisionconfigsLocal=this.comisionconfigs;
			}
			//ARCHITECTURE
		
			for(ComisionConfig comisionconfigLocal:comisionconfigsLocal) {
				if(this.permiteMantenimiento(comisionconfigLocal) && comisionconfigLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ComisionConfigConstantesFunciones.getComisionConfigLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ComisionConfigConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisionConfig.jLabelid_empresaComisionConfig,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComisionConfigConstantesFunciones.IDTIPOCOMISIONCONFIG)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisionConfig.jLabelid_tipo_comision_configComisionConfig,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComisionConfigConstantesFunciones.IDNIVELLINEA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisionConfig.jLabelid_nivel_lineaComisionConfig,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComisionConfigConstantesFunciones.CONVENDEDOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisionConfig.jLabelcon_vendedorComisionConfig,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComisionConfigConstantesFunciones.CONVENTAS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisionConfig.jLabelcon_ventasComisionConfig,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComisionConfigConstantesFunciones.CONCOBROS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisionConfig.jLabelcon_cobrosComisionConfig,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComisionConfigConstantesFunciones.CONREMESATRANSITO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisionConfig.jLabelcon_remesa_transitoComisionConfig,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComisionConfigConstantesFunciones.CONPENALIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisionConfig.jLabelcon_penalidadComisionConfig,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComisionConfigConstantesFunciones.CONABONO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisionConfig.jLabelcon_abonoComisionConfig,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormComisionConfig!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComisionConfig.jLabelid_empresaComisionConfig,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComisionConfig.jLabelid_tipo_comision_configComisionConfig,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComisionConfig.jLabelid_nivel_lineaComisionConfig,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComisionConfig.jLabelcon_vendedorComisionConfig,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComisionConfig.jLabelcon_ventasComisionConfig,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComisionConfig.jLabelcon_cobrosComisionConfig,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComisionConfig.jLabelcon_remesa_transitoComisionConfig,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComisionConfig.jLabelcon_penalidadComisionConfig,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComisionConfig.jLabelcon_abonoComisionConfig,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("ComisionCate")) {
			if(this.comisionconfig==null) {
				this.comisionconfig= new ComisionConfig();
			}

			if(this.comisionconfigSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoComisionConfig
				this.setVariablesFormularioToObjetoActualComisionConfig(this.comisionconfig,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysComisionConfig(this.comisionconfig);

				this.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame.getcomisioncate().setComisionConfig(this.comisionconfig);
			}

			return;
		}
		 else  if(sTipo.equals("ComisionMarca")) {
			if(this.comisionconfig==null) {
				this.comisionconfig= new ComisionConfig();
			}

			if(this.comisionconfigSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoComisionConfig
				this.setVariablesFormularioToObjetoActualComisionConfig(this.comisionconfig,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysComisionConfig(this.comisionconfig);

				this.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame.getcomisionmarca().setComisionConfig(this.comisionconfig);
			}

			return;
		}
		 else  if(sTipo.equals("ComisionLinea")) {
			if(this.comisionconfig==null) {
				this.comisionconfig= new ComisionConfig();
			}

			if(this.comisionconfigSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoComisionConfig
				this.setVariablesFormularioToObjetoActualComisionConfig(this.comisionconfig,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysComisionConfig(this.comisionconfig);

				this.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame.getcomisionlinea().setComisionConfig(this.comisionconfig);
			}

			return;
		}
		 else  if(sTipo.equals("ComisionPena")) {
			if(this.comisionconfig==null) {
				this.comisionconfig= new ComisionConfig();
			}

			if(this.comisionconfigSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoComisionConfig
				this.setVariablesFormularioToObjetoActualComisionConfig(this.comisionconfig,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysComisionConfig(this.comisionconfig);

				this.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame.getcomisionpena().setComisionConfig(this.comisionconfig);
			}

			return;
		}
		 else  if(sTipo.equals("ComisionGrupo")) {
			if(this.comisionconfig==null) {
				this.comisionconfig= new ComisionConfig();
			}

			if(this.comisionconfigSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoComisionConfig
				this.setVariablesFormularioToObjetoActualComisionConfig(this.comisionconfig,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysComisionConfig(this.comisionconfig);

				this.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame.getcomisiongrupo().setComisionConfig(this.comisionconfig);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoComisionConfig--;	
		
		
		this.comisionconfigAux=new ComisionConfig();
		
		this.comisionconfigAux.setId(this.iIdNuevoComisionConfig);
		this.comisionconfigAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.comisionconfigLogic.getComisionConfigs().add(this.comisionconfigAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.comisionconfigs.add(this.comisionconfigAux);
		}
		//ARCHITECTURE
		
		this.comisionconfig=this.comisionconfigAux;
		
		if(ComisionConfigJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioComisionConfig(this.comisionconfig);
			this.setVariablesObjetoActualToFormularioForeignKeyComisionConfig(this.comisionconfig);
		}
				
		//this.setDefaultControlesComisionConfig();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyComisionConfig();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyComisionConfig();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyComisionConfig();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualComisionConfig(this.comisionconfigBean,this.comisionconfig,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysComisionConfig(this.comisionconfig);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(ComisionConfigConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.comisionconfigSessionBean.getConGuardarRelaciones()) {
			classes=ComisionConfigConstantesFunciones.getClassesRelationshipsOfComisionConfig(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.comisionconfigReturnGeneral=comisionconfigLogic.procesarEventosComisionConfigsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.comisionconfigLogic.getComisionConfigs(),this.comisionconfig,this.comisionconfigParameterGeneral,this.isEsNuevoComisionConfig,classes);//this.comisionconfigLogic.getComisionConfig()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanComisionConfig(this.comisionconfigReturnGeneral,this.comisionconfigBean,false);
		
		if(this.comisionconfigReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyComisionConfig(this.comisionconfigReturnGeneral.getComisionConfig());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioComisionConfig(this.comisionconfigReturnGeneral.getComisionConfig());
		}
		
		if(this.comisionconfigReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioComisionConfig(this.comisionconfigReturnGeneral.getComisionConfig(),classes);//this.comisionconfigBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualComisionConfig(this.comisionconfig,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyComisionConfig();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyComisionConfig();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ComisionConfigBeanSwingJInternalFrameAdditional.RecargarFormComisionConfig(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingComisionConfig(false);
						
			if(comisionconfigSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame.comisioncateSessionBean.getEsGuardarRelacionado() && ComisionCateJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonComisionCateActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame.comisionmarcaSessionBean.getEsGuardarRelacionado() && ComisionMarcaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonComisionMarcaActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame.comisionlineaSessionBean.getEsGuardarRelacionado() && ComisionLineaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonComisionLineaActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame.comisionpenaSessionBean.getEsGuardarRelacionado() && ComisionPenaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonComisionPenaActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame.comisiongrupoSessionBean.getEsGuardarRelacionado() && ComisionGrupoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonComisionGrupoActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(ComisionConfigJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualComisionConfig();
			}
			
			this.actualizarVisualTableDatosComisionConfig();
			
			this.jTableDatosComisionConfig.setRowSelectionInterval(this.getIndiceNuevoComisionConfig(), this.getIndiceNuevoComisionConfig());
			
			this.seleccionarFilaTablaComisionConfigActual();
						
			this.actualizarEstadoCeldasBotonesComisionConfig("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesComisionConfig(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormComisionConfig.jCheckBoxcon_vendedorComisionConfig.setEnabled(isHabilitar && this.comisionconfigConstantesFunciones.activarcon_vendedorComisionConfig);
		this.jInternalFrameDetalleFormComisionConfig.jCheckBoxcon_ventasComisionConfig.setEnabled(isHabilitar && this.comisionconfigConstantesFunciones.activarcon_ventasComisionConfig);
		this.jInternalFrameDetalleFormComisionConfig.jCheckBoxcon_cobrosComisionConfig.setEnabled(isHabilitar && this.comisionconfigConstantesFunciones.activarcon_cobrosComisionConfig);
		this.jInternalFrameDetalleFormComisionConfig.jCheckBoxcon_remesa_transitoComisionConfig.setEnabled(isHabilitar && this.comisionconfigConstantesFunciones.activarcon_remesa_transitoComisionConfig);
		this.jInternalFrameDetalleFormComisionConfig.jCheckBoxcon_penalidadComisionConfig.setEnabled(isHabilitar && this.comisionconfigConstantesFunciones.activarcon_penalidadComisionConfig);
		this.jInternalFrameDetalleFormComisionConfig.jCheckBoxcon_abonoComisionConfig.setEnabled(isHabilitar && this.comisionconfigConstantesFunciones.activarcon_abonoComisionConfig);	
		//
		this.jInternalFrameDetalleFormComisionConfig.jComboBoxid_empresaComisionConfig.setEnabled(isHabilitar && this.comisionconfigConstantesFunciones.activarid_empresaComisionConfig);
		this.jInternalFrameDetalleFormComisionConfig.jComboBoxid_tipo_comision_configComisionConfig.setEnabled(isHabilitar && this.comisionconfigConstantesFunciones.activarid_tipo_comision_configComisionConfig);
		this.jInternalFrameDetalleFormComisionConfig.jComboBoxid_nivel_lineaComisionConfig.setEnabled(isHabilitar && this.comisionconfigConstantesFunciones.activarid_nivel_lineaComisionConfig);
	};
	
	public void setDefaultControlesComisionConfig() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoComisionConfig(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.comisionconfigSessionBean.setConGuardarRelaciones(true);			
			this.comisionconfigSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormComisionConfig.jTabbedPaneRelacionesComisionConfig.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame.comisioncateSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame.comisionmarcaSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame.comisionlineaSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame.comisionpenaSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame.comisiongrupoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.comisionconfigSessionBean.setConGuardarRelaciones(false);			
			this.comisionconfigSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormComisionConfig.jTabbedPaneRelacionesComisionConfig.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame.comisioncateSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame.comisionmarcaSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame.comisionlineaSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame.comisionpenaSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame.comisiongrupoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoComisionConfig() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ComisionConfig comisionconfigAux:this.comisionconfigLogic.getComisionConfigs()) {
				if(comisionconfigAux.getId().equals(this.iIdNuevoComisionConfig)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ComisionConfig comisionconfigAux:this.comisionconfigs) {
				if(comisionconfigAux.getId().equals(this.iIdNuevoComisionConfig)) {
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
	
	public int getIndiceActualComisionConfig(ComisionConfig comisionconfig,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ComisionConfig comisionconfigAux:this.comisionconfigLogic.getComisionConfigs()) {
				if(comisionconfigAux.getId().equals(comisionconfig.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ComisionConfig comisionconfigAux:this.comisionconfigs) {
				if(comisionconfigAux.getId().equals(comisionconfig.getId())) {
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
	
	public void setCamposBaseDesdeOriginalComisionConfig(ComisionConfig comisionconfigOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ComisionConfig comisionconfigAux:this.comisionconfigLogic.getComisionConfigs()) {
				if(comisionconfigAux.getComisionConfigOriginal().getId().equals(comisionconfigOriginal.getId())) {
					existe=true;
					comisionconfigOriginal.setId(comisionconfigAux.getId());
					comisionconfigOriginal.setVersionRow(comisionconfigAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ComisionConfig comisionconfigAux:this.comisionconfigs) {
				if(comisionconfigAux.getComisionConfigOriginal().getId().equals(comisionconfigOriginal.getId())) {
					existe=true;
					comisionconfigOriginal.setId(comisionconfigAux.getId());
					comisionconfigOriginal.setVersionRow(comisionconfigAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosComisionConfig(Boolean esParaCancelar) throws Exception {
		comisionconfigsAux=new ArrayList<ComisionConfig>();
		comisionconfigAux=new ComisionConfig();
		
		if(!this.comisionconfigSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ComisionConfig comisionconfigAux:this.comisionconfigLogic.getComisionConfigs()) {
					if(comisionconfigAux.getId()<0) {
						comisionconfigsAux.add(comisionconfigAux);
					}		
				}
				this.iIdNuevoComisionConfig=0L;
				this.comisionconfigLogic.getComisionConfigs().removeAll(comisionconfigsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ComisionConfig comisionconfigAux:this.comisionconfigs) {
					if(comisionconfigAux.getId()<0) {
						comisionconfigsAux.add(comisionconfigAux);
					}		
				}
				this.iIdNuevoComisionConfig=0L;
				this.comisionconfigs.removeAll(comisionconfigsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoComisionConfig 
					&& this.comisionconfigLogic.getComisionConfigs().size()>0
					) {
					comisionconfigAux=this.comisionconfigLogic.getComisionConfigs().get(this.comisionconfigLogic.getComisionConfigs().size() - 1);
				
					if(comisionconfigAux.getId()<0) {
						this.comisionconfigLogic.getComisionConfigs().remove(comisionconfigAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoComisionConfig && this.comisionconfigs.size()>0) {
					comisionconfigAux=this.comisionconfigs.get(this.comisionconfigs.size() - 1);
				
					if(comisionconfigAux.getId()<0) {
						this.comisionconfigs.remove(comisionconfigAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoComisionConfig(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(comisionconfig.getId()<0) {
				this.comisionconfigLogic.getComisionConfigs().remove(this.comisionconfig);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(comisionconfig.getId()<0) {
				this.comisionconfigs.remove(this.comisionconfig);
			}
		}			
	}
	
	public void setEstadosInicialesComisionConfig(List<ComisionConfig> comisionconfigsAux) throws Exception {
		ComisionConfigConstantesFunciones.setEstadosInicialesComisionConfig(comisionconfigsAux);
	}
	
	public void setEstadosInicialesComisionConfig(ComisionConfig comisionconfigAux) throws Exception {
		ComisionConfigConstantesFunciones.setEstadosInicialesComisionConfig(comisionconfigAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarComisionConfigActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesComisionConfig("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarComisionConfigActual()) {
				if(!this.isEsNuevoComisionConfig) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesComisionConfig("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoComisionConfig=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarComisionConfigActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Comision Config ?", "MANTENIMIENTO DE Comision Config", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesComisionConfig("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ComisionConfig comisionconfig) throws Exception {
		ComisionConfigConstantesFunciones.seleccionarAsignar(this.comisionconfig,comisionconfig);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarComisionConfig=this.isPermisoActualizarOriginalComisionConfig;
			
			
			this.seleccionarAsignar(comisionconfig);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ComisionConfigConstantesFunciones.quitarEspaciosComisionConfig(this.comisionconfig,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesComisionConfig("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.comisionconfigSessionBean.setsFuncionBusquedaRapida(this.comisionconfigSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoComisionConfig) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosComisionConfig(esParaCancelar);				
				this.cancelarNuevoComisionConfig(esParaCancelar);								
			}
			
			this.comisionconfig=new ComisionConfig();
			
			this.inicializarComisionConfig();
			
			this.actualizarEstadoCeldasBotonesComisionConfig("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarComisionConfig() throws Exception {
		try {
			ComisionConfigConstantesFunciones.inicializarComisionConfig(this.comisionconfig);
			
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
			FuncionesSwing.manageException(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.comisionconfigLogic.getComisionConfigs().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteComisionConfigs(String sAccionBusqueda,List<ComisionConfig> comisionconfigsParaReportes) throws Exception {
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
					sPathReporteFinal="ComisionConfig"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ComisionConfigMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ComisionConfigMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ComisionConfig"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Comision Configes");		
		parameters.put("busquedapor", ComisionConfigConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(ComisionCate.class));
			classes.add(new Classe(ComisionMarca.class));
			classes.add(new Classe(ComisionLinea.class));
			classes.add(new Classe(ComisionPena.class));
			classes.add(new Classe(ComisionGrupo.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					ComisionConfigLogic comisionconfigLogicAuxiliar=new ComisionConfigLogic();
					comisionconfigLogicAuxiliar.setDatosCliente(comisionconfigLogic.getDatosCliente());				
					comisionconfigLogicAuxiliar.setComisionConfigs(comisionconfigsParaReportes);
					
					comisionconfigLogicAuxiliar.cargarRelacionesLoteForeignKeyComisionConfigWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					comisionconfigsParaReportes=comisionconfigLogicAuxiliar.getComisionConfigs();
					
					//comisionconfigLogic.getNewConnexionToDeep();
					
					//for (ComisionConfig comisionconfig:comisionconfigsParaReportes) {
					//	comisionconfigLogic.deepLoad(comisionconfig, false, DeepLoadType.INCLUDE, classes);
					//}						
					//comisionconfigLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//comisionconfigLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileComisionCate = AuxiliarReportes.class.getResourceAsStream("ComisionCateDetalleRelacionesDesign.jasper");
			parameters.put("subreport_comisioncate", reportFileComisionCate);

			InputStream reportFileComisionMarca = AuxiliarReportes.class.getResourceAsStream("ComisionMarcaDetalleRelacionesDesign.jasper");
			parameters.put("subreport_comisionmarca", reportFileComisionMarca);

			InputStream reportFileComisionLinea = AuxiliarReportes.class.getResourceAsStream("ComisionLineaDetalleRelacionesDesign.jasper");
			parameters.put("subreport_comisionlinea", reportFileComisionLinea);

			InputStream reportFileComisionPena = AuxiliarReportes.class.getResourceAsStream("ComisionPenaDetalleRelacionesDesign.jasper");
			parameters.put("subreport_comisionpena", reportFileComisionPena);

			InputStream reportFileComisionGrupo = AuxiliarReportes.class.getResourceAsStream("ComisionGrupoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_comisiongrupo", reportFileComisionGrupo);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceComisionConfig=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ComisionConfigConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ComisionConfigConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceComisionConfig=new JRBeanArrayDataSource(ComisionConfigJInternalFrame.TraerComisionConfigBeans(comisionconfigsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceComisionConfig);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ComisionConfigConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ComisionConfigConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ComisionConfigBean.TraerComisionConfigBeans(comisionconfigsParaReportes).toArray()));
							
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
				this.generarExcelReporteComisionConfigs(sAccionBusqueda,sTipoArchivoReporte,comisionconfigsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalComisionConfigs(sAccionBusqueda,sTipoArchivoReporte,comisionconfigsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoComisionConfigActionPerformed(null);
					//this.generarExcelReporteComisionConfigs(sAccionBusqueda,sTipoArchivoReporte,comisionconfigsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalComisionConfigs(sAccionBusqueda,sTipoArchivoReporte,comisionconfigsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesComisionConfigs(sAccionBusqueda,sTipoArchivoReporte,comisionconfigsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesComisionConfigs(sAccionBusqueda,sTipoArchivoReporte,comisionconfigsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteComisionConfigs(String sAccionBusqueda,String sTipoArchivoReporte,List<ComisionConfig> comisionconfigsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"comisionconfig";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ComisionConfigs");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderComisionConfig("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ComisionConfig comisionconfig : comisionconfigsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ComisionConfigConstantesFunciones.generarExcelReporteDataComisionConfig("NORMAL",row,workbook,comisionconfig,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comisionconfigSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comision Config",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderComisionConfig(String sTipo,Row row,Workbook workbook) {
		
		ComisionConfigConstantesFunciones.generarExcelReporteHeaderComisionConfig(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalComisionConfigs(String sAccionBusqueda,String sTipoArchivoReporte,List<ComisionConfig> comisionconfigsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"comisionconfig_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ComisionConfigs");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ComisionConfig comisionconfig : comisionconfigsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ComisionConfigConstantesFunciones.getComisionConfigDescripcion(comisionconfig));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComisionConfigConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComisionConfigConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comisionconfig.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComisionConfigConstantesFunciones.LABEL_IDTIPOCOMISIONCONFIG))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComisionConfigConstantesFunciones.LABEL_IDTIPOCOMISIONCONFIG);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comisionconfig.gettipocomisionconfig_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComisionConfigConstantesFunciones.LABEL_IDNIVELLINEA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComisionConfigConstantesFunciones.LABEL_IDNIVELLINEA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comisionconfig.getnivellinea_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComisionConfigConstantesFunciones.LABEL_CONVENDEDOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComisionConfigConstantesFunciones.LABEL_CONVENDEDOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(comisionconfig.getcon_vendedor()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComisionConfigConstantesFunciones.LABEL_CONVENTAS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComisionConfigConstantesFunciones.LABEL_CONVENTAS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(comisionconfig.getcon_ventas()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComisionConfigConstantesFunciones.LABEL_CONCOBROS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComisionConfigConstantesFunciones.LABEL_CONCOBROS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(comisionconfig.getcon_cobros()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComisionConfigConstantesFunciones.LABEL_CONREMESATRANSITO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComisionConfigConstantesFunciones.LABEL_CONREMESATRANSITO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(comisionconfig.getcon_remesa_transito()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComisionConfigConstantesFunciones.LABEL_CONPENALIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComisionConfigConstantesFunciones.LABEL_CONPENALIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(comisionconfig.getcon_penalidad()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComisionConfigConstantesFunciones.LABEL_CONABONO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComisionConfigConstantesFunciones.LABEL_CONABONO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(comisionconfig.getcon_abono()));


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comisionconfigSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comision Config",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesComisionConfigs(String sAccionBusqueda,String sTipoArchivoReporte,List<ComisionConfig> comisionconfigsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ComisionConfig> comisionconfigsRespaldo=null;
		
		classes=ComisionConfigConstantesFunciones.getClassesRelationshipsOfComisionConfig(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.comisionconfigLogic.setDatosCliente(this.datosCliente);
		this.comisionconfigLogic.setDatosDeep(this.datosDeep);
		this.comisionconfigLogic.setIsConDeep(true);
		
		comisionconfigsRespaldo=this.comisionconfigLogic.getComisionConfigs();
		
		this.comisionconfigLogic.setComisionConfigs(comisionconfigsParaReportes);	
		this.comisionconfigLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		comisionconfigsParaReportes=this.comisionconfigLogic.getComisionConfigs();
		this.comisionconfigLogic.setComisionConfigs(comisionconfigsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"comisionconfig_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ComisionConfigs");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderComisionConfig("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ComisionConfig comisionconfig : comisionconfigsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderComisionConfig("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ComisionConfigConstantesFunciones.generarExcelReporteDataComisionConfig("NORMAL",row,workbook,comisionconfig,cellStyleDataAux);
		
			
			


				//ComisionCate
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ComisionCateConstantesFunciones.SCLASSWEBTITULO))) {

				if(comisionconfig.getComisionCates()!=null && comisionconfig.getComisionCates().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ComisionCateConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ComisionCateConstantesFunciones.generarExcelReporteHeaderComisionCate("RELACIONADO",row,workbook);
				}

				if(comisionconfig.getComisionCates()!=null) {
					i2=0;
					for(ComisionCate comisioncate : comisionconfig.getComisionCates()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						ComisionCateConstantesFunciones.generarExcelReporteDataComisionCate("RELACIONADO",row,workbook,comisioncate,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//ComisionMarca
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ComisionMarcaConstantesFunciones.SCLASSWEBTITULO))) {

				if(comisionconfig.getComisionMarcas()!=null && comisionconfig.getComisionMarcas().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ComisionMarcaConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ComisionMarcaConstantesFunciones.generarExcelReporteHeaderComisionMarca("RELACIONADO",row,workbook);
				}

				if(comisionconfig.getComisionMarcas()!=null) {
					i2=0;
					for(ComisionMarca comisionmarca : comisionconfig.getComisionMarcas()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						ComisionMarcaConstantesFunciones.generarExcelReporteDataComisionMarca("RELACIONADO",row,workbook,comisionmarca,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//ComisionLinea
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ComisionLineaConstantesFunciones.SCLASSWEBTITULO))) {

				if(comisionconfig.getComisionLineas()!=null && comisionconfig.getComisionLineas().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ComisionLineaConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ComisionLineaConstantesFunciones.generarExcelReporteHeaderComisionLinea("RELACIONADO",row,workbook);
				}

				if(comisionconfig.getComisionLineas()!=null) {
					i2=0;
					for(ComisionLinea comisionlinea : comisionconfig.getComisionLineas()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						ComisionLineaConstantesFunciones.generarExcelReporteDataComisionLinea("RELACIONADO",row,workbook,comisionlinea,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//ComisionPena
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ComisionPenaConstantesFunciones.SCLASSWEBTITULO))) {

				if(comisionconfig.getComisionPenas()!=null && comisionconfig.getComisionPenas().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ComisionPenaConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ComisionPenaConstantesFunciones.generarExcelReporteHeaderComisionPena("RELACIONADO",row,workbook);
				}

				if(comisionconfig.getComisionPenas()!=null) {
					i2=0;
					for(ComisionPena comisionpena : comisionconfig.getComisionPenas()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						ComisionPenaConstantesFunciones.generarExcelReporteDataComisionPena("RELACIONADO",row,workbook,comisionpena,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//ComisionGrupo
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ComisionGrupoConstantesFunciones.SCLASSWEBTITULO))) {

				if(comisionconfig.getComisionGrupos()!=null && comisionconfig.getComisionGrupos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ComisionGrupoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ComisionGrupoConstantesFunciones.generarExcelReporteHeaderComisionGrupo("RELACIONADO",row,workbook);
				}

				if(comisionconfig.getComisionGrupos()!=null) {
					i2=0;
					for(ComisionGrupo comisiongrupo : comisionconfig.getComisionGrupos()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						ComisionGrupoConstantesFunciones.generarExcelReporteDataComisionGrupo("RELACIONADO",row,workbook,comisiongrupo,cellStyleDataAuxHijo);
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
		cell.setCellValue(ComisionConfigConstantesFunciones.getComisionConfigDescripcion(comisionconfig));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comisionconfigSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comision Config",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoComisionConfig.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoComisionConfig.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoComisionConfig.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoComisionConfig.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessComisionConfig() throws Exception {		
		this.startProcessComisionConfig(true);
	}
	
	public void startProcessComisionConfig(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasComisionConfig ,this.jPanelParametrosReportesComisionConfig, this.jScrollPanelDatosComisionConfig,this.jPanelPaginacionComisionConfig, this.jScrollPanelDatosEdicionComisionConfig, this.jPanelAccionesComisionConfig,this.jPanelAccionesFormularioComisionConfig,this.jmenuBarComisionConfig,this.jmenuBarDetalleComisionConfig,this.jTtoolBarComisionConfig,this.jTtoolBarDetalleComisionConfig);		
		
		final JTabbedPane jTabbedPaneBusquedasComisionConfig=this.jTabbedPaneBusquedasComisionConfig; 
		
		final JPanel jPanelParametrosReportesComisionConfig=this.jPanelParametrosReportesComisionConfig;
		//final JScrollPane jScrollPanelDatosComisionConfig=this.jScrollPanelDatosComisionConfig;
		final JTable jTableDatosComisionConfig=this.jTableDatosComisionConfig;		
		final JPanel jPanelPaginacionComisionConfig=this.jPanelPaginacionComisionConfig;
		//final JScrollPane jScrollPanelDatosEdicionComisionConfig=this.jScrollPanelDatosEdicionComisionConfig;
		final JPanel jPanelAccionesComisionConfig=this.jPanelAccionesComisionConfig;
		
		JPanel jPanelCamposAuxiliarComisionConfig=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarComisionConfig=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormComisionConfig!=null) {
			jPanelCamposAuxiliarComisionConfig=this.jInternalFrameDetalleFormComisionConfig.jPanelCamposComisionConfig;
			jPanelAccionesFormularioAuxiliarComisionConfig=this.jInternalFrameDetalleFormComisionConfig.jPanelAccionesFormularioComisionConfig;
		}
		
		final JPanel jPanelCamposComisionConfig=jPanelCamposAuxiliarComisionConfig;
		final JPanel jPanelAccionesFormularioComisionConfig=jPanelAccionesFormularioAuxiliarComisionConfig;
		
		
		final JMenuBar jmenuBarComisionConfig=this.jmenuBarComisionConfig;
		final JToolBar jTtoolBarComisionConfig=this.jTtoolBarComisionConfig;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarComisionConfig=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarComisionConfig=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormComisionConfig!=null) {
			jmenuBarDetalleAuxiliarComisionConfig=this.jInternalFrameDetalleFormComisionConfig.jmenuBarDetalleComisionConfig;
			jTtoolBarDetalleAuxiliarComisionConfig=this.jInternalFrameDetalleFormComisionConfig.jTtoolBarDetalleComisionConfig;
		}
		
		final JMenuBar jmenuBarDetalleComisionConfig=jmenuBarDetalleAuxiliarComisionConfig;
		final JToolBar jTtoolBarDetalleComisionConfig=jTtoolBarDetalleAuxiliarComisionConfig;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasComisionConfig;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesComisionConfig;
			processRunnable.jTableDatos=jTableDatosComisionConfig;
			processRunnable.jPanelCampos=jPanelCamposComisionConfig;
			processRunnable.jPanelPaginacion=jPanelPaginacionComisionConfig;
			processRunnable.jPanelAcciones=jPanelAccionesComisionConfig;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioComisionConfig;
			
			
			processRunnable.jmenuBar=jmenuBarComisionConfig;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleComisionConfig;
			processRunnable.jTtoolBar=jTtoolBarComisionConfig;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleComisionConfig;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasComisionConfig ,jPanelParametrosReportesComisionConfig,jTableDatosComisionConfig, /*jScrollPanelDatosComisionConfig,*/jPanelCamposComisionConfig,jPanelPaginacionComisionConfig, /*jScrollPanelDatosEdicionComisionConfig,*/ jPanelAccionesComisionConfig,jPanelAccionesFormularioComisionConfig,jmenuBarComisionConfig,jmenuBarDetalleComisionConfig,jTtoolBarComisionConfig,jTtoolBarDetalleComisionConfig);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasComisionConfig ,jPanelParametrosReportesComisionConfig, jScrollPanelDatosComisionConfig,jPanelPaginacionComisionConfig, jScrollPanelDatosEdicionComisionConfig, jPanelAccionesComisionConfig,jPanelAccionesFormularioComisionConfig,jmenuBarComisionConfig,jmenuBarDetalleComisionConfig,jTtoolBarComisionConfig,jTtoolBarDetalleComisionConfig);
						
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
	
	public void finishProcessComisionConfig() {// throws Exception 
		this.finishProcessComisionConfig(true);
	}
	
	public void finishProcessComisionConfig(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasComisionConfig ,this.jPanelParametrosReportesComisionConfig, this.jScrollPanelDatosComisionConfig,this.jPanelPaginacionComisionConfig, this.jScrollPanelDatosEdicionComisionConfig, this.jPanelAccionesComisionConfig,this.jPanelAccionesFormularioComisionConfig,this.jmenuBarComisionConfig,this.jmenuBarDetalleComisionConfig,this.jTtoolBarComisionConfig,this.jTtoolBarDetalleComisionConfig);		
		
		final JTabbedPane jTabbedPaneBusquedasComisionConfig=this.jTabbedPaneBusquedasComisionConfig; 
		
		final JPanel jPanelParametrosReportesComisionConfig=this.jPanelParametrosReportesComisionConfig;
		//final JScrollPane jScrollPanelDatosComisionConfig=this.jScrollPanelDatosComisionConfig;
		final JTable jTableDatosComisionConfig=this.jTableDatosComisionConfig;		
		final JPanel jPanelPaginacionComisionConfig=this.jPanelPaginacionComisionConfig;
		//final JScrollPane jScrollPanelDatosEdicionComisionConfig=this.jScrollPanelDatosEdicionComisionConfig;
		final JPanel jPanelAccionesComisionConfig=this.jPanelAccionesComisionConfig;
		
		JPanel jPanelCamposAuxiliarComisionConfig=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarComisionConfig=new JPanel();
		
		if(this.jInternalFrameDetalleFormComisionConfig!=null) {
			jPanelCamposAuxiliarComisionConfig=this.jInternalFrameDetalleFormComisionConfig.jPanelCamposComisionConfig;
			jPanelAccionesFormularioAuxiliarComisionConfig=this.jInternalFrameDetalleFormComisionConfig.jPanelAccionesFormularioComisionConfig;
		}
		
		final JPanel jPanelCamposComisionConfig=jPanelCamposAuxiliarComisionConfig;
		final JPanel jPanelAccionesFormularioComisionConfig=jPanelAccionesFormularioAuxiliarComisionConfig;
		
		
		final JMenuBar jmenuBarComisionConfig=this.jmenuBarComisionConfig;		
		final JToolBar jTtoolBarComisionConfig=this.jTtoolBarComisionConfig;
				
		JMenuBar jmenuBarDetalleAuxiliarComisionConfig=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarComisionConfig=new JToolBar();
		
		if(this.jInternalFrameDetalleFormComisionConfig!=null) {
			jmenuBarDetalleAuxiliarComisionConfig=this.jInternalFrameDetalleFormComisionConfig.jmenuBarDetalleComisionConfig;
			jTtoolBarDetalleAuxiliarComisionConfig=this.jInternalFrameDetalleFormComisionConfig.jTtoolBarDetalleComisionConfig;		
		}
		
		final JMenuBar jmenuBarDetalleComisionConfig=jmenuBarDetalleAuxiliarComisionConfig;
		final JToolBar jTtoolBarDetalleComisionConfig=jTtoolBarDetalleAuxiliarComisionConfig;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasComisionConfig;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesComisionConfig;
			processRunnable.jTableDatos=jTableDatosComisionConfig;
			processRunnable.jPanelCampos=jPanelCamposComisionConfig;
			processRunnable.jPanelPaginacion=jPanelPaginacionComisionConfig;
			processRunnable.jPanelAcciones=jPanelAccionesComisionConfig;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioComisionConfig;
			
			
			processRunnable.jmenuBar=jmenuBarComisionConfig;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleComisionConfig;
			processRunnable.jTtoolBar=jTtoolBarComisionConfig;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleComisionConfig;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasComisionConfig ,jPanelParametrosReportesComisionConfig, jTableDatosComisionConfig,/*jScrollPanelDatosComisionConfig,*/jPanelCamposComisionConfig,jPanelPaginacionComisionConfig, /*jScrollPanelDatosEdicionComisionConfig,*/ jPanelAccionesComisionConfig,jPanelAccionesFormularioComisionConfig,jmenuBarComisionConfig,jmenuBarDetalleComisionConfig,jTtoolBarComisionConfig,jTtoolBarDetalleComisionConfig));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesComisionConfig(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarComisionConfig(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuComisionConfig(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarComisionConfig(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarComisionConfig,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleComisionConfig,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuComisionConfig(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarComisionConfig,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleComisionConfig,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.comisionconfigConstantesFunciones.getsFinalQueryComisionConfig();
		String  finalQueryPaginacionTodos=this.comisionconfigConstantesFunciones.getsFinalQueryComisionConfig();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ComisionConfigConstantesFunciones.getArrayColumnasGlobalesNoComisionConfig(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ComisionConfigConstantesFunciones.getArrayColumnasGlobalesComisionConfig(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ComisionConfigConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.comisionconfigsEliminados= new ArrayList<ComisionConfig>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessComisionConfig();
		
				///*ComisionConfigSessionBean*/this.comisionconfigSessionBean=new ComisionConfigSessionBean();
			
			if(this.comisionconfigSessionBean==null) {
				this.comisionconfigSessionBean=new ComisionConfigSessionBean();
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
					this.iNumeroPaginacion=ComisionConfigConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ComisionConfigConstantesFunciones.getClassesForeignKeysOfComisionConfig(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/comisionconfig."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			comisionconfigsAux= new ArrayList<ComisionConfig>();
			
				
			comisionconfigLogic.setDatosCliente(this.datosCliente);
			comisionconfigLogic.setDatosDeep(this.datosDeep);
			comisionconfigLogic.setIsConDeep(true);
			
			
			comisionconfigLogic.getComisionConfigDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					comisionconfigLogic.getTodosComisionConfigs(finalQueryGlobal,pagination);
					
					//comisionconfigLogic.getTodosComisionConfigsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(comisionconfigLogic.getComisionConfigs()==null|| comisionconfigLogic.getComisionConfigs().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							comisionconfigsAux= new ArrayList<ComisionConfig>();
							comisionconfigsAux.addAll(comisionconfigLogic.getComisionConfigs());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							comisionconfigsAux= new ArrayList<ComisionConfig>();
							comisionconfigsAux.addAll(comisionconfigs);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							comisionconfigLogic.getTodosComisionConfigs(finalQueryGlobal+"",this.pagination);												
							
							//comisionconfigLogic.getTodosComisionConfigsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteComisionConfigs("Todos",comisionconfigLogic.getComisionConfigs() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							comisionconfigLogic.setComisionConfigs(new ArrayList<ComisionConfig>());					
							comisionconfigLogic.getComisionConfigs().addAll(comisionconfigsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							comisionconfigs=new ArrayList<ComisionConfig>();
							comisionconfigs.addAll(comisionconfigsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idComisionConfig=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idComisionConfig=this.idActual;
				
				} else if(this.idComisionConfigActual!=null && this.idComisionConfigActual!=0L) {
					idComisionConfig=idComisionConfigActual;
				}
				
					
				this.sDetalleReporte=ComisionConfigConstantesFunciones.getDetalleIndicePorId(idComisionConfig);
				
				this.comisionconfigs=new ArrayList<ComisionConfig>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					comisionconfigLogic.getEntity(idComisionConfig);
					
					//comisionconfigLogic.getEntityWithConnection(idComisionConfig);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					comisionconfigLogic.setComisionConfigs(new ArrayList<ComisionConfig>());
					comisionconfigLogic.getComisionConfigs().add(comisionconfigLogic.getComisionConfig());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.comisionconfigs=new ArrayList<ComisionConfig>();
					this.comisionconfigs.add(comisionconfig);
				}
				
				if(comisionconfigLogic.getComisionConfig()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=ComisionConfigConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					comisionconfigLogic.getComisionConfigsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ComisionConfigConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ComisionConfigConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=comisionconfigLogic.getComisionConfigs()==null||comisionconfigLogic.getComisionConfigs().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=comisionconfigs==null|| comisionconfigs.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						comisionconfigsAux=new ArrayList<ComisionConfig>();
						comisionconfigsAux.addAll(comisionconfigLogic.getComisionConfigs());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							comisionconfigsAux=new ArrayList<ComisionConfig>();
							comisionconfigsAux.addAll(comisionconfigs);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							comisionconfigLogic.getComisionConfigsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ComisionConfigConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ComisionConfigConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteComisionConfigs("FK_IdEmpresa",comisionconfigLogic.getComisionConfigs());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteComisionConfigs("FK_IdEmpresa",comisionconfigs);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						comisionconfigLogic.setComisionConfigs(new ArrayList<ComisionConfig>());
						comisionconfigLogic.getComisionConfigs().addAll(comisionconfigsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							comisionconfigs=new ArrayList<ComisionConfig>();
							comisionconfigs.addAll(comisionconfigsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdNivelLinea")) {
				this.sDetalleReporte=ComisionConfigConstantesFunciones.getDetalleIndiceFK_IdNivelLinea(id_nivel_lineaFK_IdNivelLinea);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					comisionconfigLogic.getComisionConfigsFK_IdNivelLinea(finalQueryGlobal,pagination,id_nivel_lineaFK_IdNivelLinea);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ComisionConfigConstantesFunciones.getDetalleIndiceFK_IdNivelLinea(id_nivel_lineaFK_IdNivelLinea);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ComisionConfigConstantesFunciones.getDetalleIndiceFK_IdNivelLinea(id_nivel_lineaFK_IdNivelLinea);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=comisionconfigLogic.getComisionConfigs()==null||comisionconfigLogic.getComisionConfigs().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=comisionconfigs==null|| comisionconfigs.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						comisionconfigsAux=new ArrayList<ComisionConfig>();
						comisionconfigsAux.addAll(comisionconfigLogic.getComisionConfigs());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							comisionconfigsAux=new ArrayList<ComisionConfig>();
							comisionconfigsAux.addAll(comisionconfigs);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							comisionconfigLogic.getComisionConfigsFK_IdNivelLinea(finalQueryGlobal,pagination,id_nivel_lineaFK_IdNivelLinea);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ComisionConfigConstantesFunciones.getDetalleIndiceFK_IdNivelLinea(id_nivel_lineaFK_IdNivelLinea);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ComisionConfigConstantesFunciones.getDetalleIndiceFK_IdNivelLinea(id_nivel_lineaFK_IdNivelLinea);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteComisionConfigs("FK_IdNivelLinea",comisionconfigLogic.getComisionConfigs());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteComisionConfigs("FK_IdNivelLinea",comisionconfigs);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						comisionconfigLogic.setComisionConfigs(new ArrayList<ComisionConfig>());
						comisionconfigLogic.getComisionConfigs().addAll(comisionconfigsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							comisionconfigs=new ArrayList<ComisionConfig>();
							comisionconfigs.addAll(comisionconfigsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoComisionConfig")) {
				this.sDetalleReporte=ComisionConfigConstantesFunciones.getDetalleIndiceFK_IdTipoComisionConfig(id_tipo_comision_configFK_IdTipoComisionConfig);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					comisionconfigLogic.getComisionConfigsFK_IdTipoComisionConfig(finalQueryGlobal,pagination,id_tipo_comision_configFK_IdTipoComisionConfig);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ComisionConfigConstantesFunciones.getDetalleIndiceFK_IdTipoComisionConfig(id_tipo_comision_configFK_IdTipoComisionConfig);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ComisionConfigConstantesFunciones.getDetalleIndiceFK_IdTipoComisionConfig(id_tipo_comision_configFK_IdTipoComisionConfig);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=comisionconfigLogic.getComisionConfigs()==null||comisionconfigLogic.getComisionConfigs().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=comisionconfigs==null|| comisionconfigs.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						comisionconfigsAux=new ArrayList<ComisionConfig>();
						comisionconfigsAux.addAll(comisionconfigLogic.getComisionConfigs());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							comisionconfigsAux=new ArrayList<ComisionConfig>();
							comisionconfigsAux.addAll(comisionconfigs);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							comisionconfigLogic.getComisionConfigsFK_IdTipoComisionConfig(finalQueryGlobal,pagination,id_tipo_comision_configFK_IdTipoComisionConfig);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ComisionConfigConstantesFunciones.getDetalleIndiceFK_IdTipoComisionConfig(id_tipo_comision_configFK_IdTipoComisionConfig);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ComisionConfigConstantesFunciones.getDetalleIndiceFK_IdTipoComisionConfig(id_tipo_comision_configFK_IdTipoComisionConfig);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteComisionConfigs("FK_IdTipoComisionConfig",comisionconfigLogic.getComisionConfigs());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteComisionConfigs("FK_IdTipoComisionConfig",comisionconfigs);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						comisionconfigLogic.setComisionConfigs(new ArrayList<ComisionConfig>());
						comisionconfigLogic.getComisionConfigs().addAll(comisionconfigsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							comisionconfigs=new ArrayList<ComisionConfig>();
							comisionconfigs.addAll(comisionconfigsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesComisionConfig();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessComisionConfig();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=comisionconfigLogic.getComisionConfigs().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=comisionconfigs.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=comisionconfigLogic.getComisionConfigs().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=comisionconfigs.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ComisionConfig comisionconfig) {
		Boolean permite=true;
		
		if(this.comisionconfig.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ComisionConfigConstantesFunciones.getOrderByListaComisionConfig();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ComisionConfigConstantesFunciones.getOrderByListaComisionConfig();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ComisionConfig comisionconfig:comisionconfigLogic.getComisionConfigs()) {
				if(comisionconfig.getsType().equals(Constantes2.S_TOTALES)) {
					comisionconfigTotales=comisionconfig;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ComisionConfig comisionconfig:this.comisionconfigs) {
				if(comisionconfig.getsType().equals(Constantes2.S_TOTALES)) {
					comisionconfigTotales=comisionconfig;
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
			this.comisionconfigAux=new ComisionConfig();
			this.comisionconfigAux.setsType(Constantes2.S_TOTALES);
			this.comisionconfigAux.setIsNew(false);
			this.comisionconfigAux.setIsChanged(false);
			this.comisionconfigAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ComisionConfigConstantesFunciones.TotalizarValoresFilaComisionConfig(this.comisionconfigLogic.getComisionConfigs(),this.comisionconfigAux);
				
				this.comisionconfigLogic.getComisionConfigs().add(this.comisionconfigAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ComisionConfigConstantesFunciones.TotalizarValoresFilaComisionConfig(this.comisionconfigs,this.comisionconfigAux);
				
				this.comisionconfigs.add(this.comisionconfigAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		comisionconfigTotales=new ComisionConfig();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.comisionconfigLogic.getComisionConfigs().remove(comisionconfigTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.comisionconfigs.remove(comisionconfigTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		comisionconfigTotales=new ComisionConfig();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ComisionConfig comisionconfig:comisionconfigLogic.getComisionConfigs()) {
				if(comisionconfig.getsType().equals(Constantes2.S_TOTALES)) {
					comisionconfigTotales=comisionconfig;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ComisionConfigConstantesFunciones.TotalizarValoresFilaComisionConfig(this.comisionconfigLogic.getComisionConfigs(),comisionconfigTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ComisionConfig comisionconfig:this.comisionconfigs) {
				if(comisionconfig.getsType().equals(Constantes2.S_TOTALES)) {
					comisionconfigTotales=comisionconfig;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ComisionConfigConstantesFunciones.TotalizarValoresFilaComisionConfig(this.comisionconfigs,comisionconfigTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getComisionConfigsFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getComisionConfigsFK_IdNivelLinea()throws Exception {
		try {
			sAccionBusqueda="FK_IdNivelLinea";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getComisionConfigsFK_IdTipoComisionConfig()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoComisionConfig";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getComisionConfigsFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					comisionconfigLogic.getComisionConfigsFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getComisionConfigsFK_IdNivelLinea(String sFinalQuery,Long id_nivel_linea)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					comisionconfigLogic.getComisionConfigsFK_IdNivelLinea(sFinalQuery,this.pagination,id_nivel_linea);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getComisionConfigsFK_IdTipoComisionConfig(String sFinalQuery,Long id_tipo_comision_config)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					comisionconfigLogic.getComisionConfigsFK_IdTipoComisionConfig(sFinalQuery,this.pagination,id_tipo_comision_config);
				
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
	
	public void inicializarPermisosComisionConfig() {
		this.isPermisoTodoComisionConfig=false;
		this.isPermisoNuevoComisionConfig=false;
		this.isPermisoActualizarComisionConfig=false;
		this.isPermisoActualizarOriginalComisionConfig=false;
		this.isPermisoEliminarComisionConfig=false;
		this.isPermisoGuardarCambiosComisionConfig=false;
		this.isPermisoConsultaComisionConfig=false;
		this.isPermisoBusquedaComisionConfig=false;
		this.isPermisoReporteComisionConfig=false;		
		this.isPermisoOrdenComisionConfig=false;		
		this.isPermisoPaginacionMedioComisionConfig=false;		
		this.isPermisoPaginacionAltoComisionConfig=false;
		this.isPermisoPaginacionTodoComisionConfig=false;
		this.isPermisoCopiarComisionConfig=false;		
		this.isPermisoVerFormComisionConfig=false;		
		this.isPermisoDuplicarComisionConfig=false;		
		this.isPermisoOrdenComisionConfig=false;		
	}
	
	public void setPermisosUsuarioComisionConfig(Boolean isPermiso) {
		this.isPermisoTodoComisionConfig=isPermiso;
		this.isPermisoNuevoComisionConfig=isPermiso;
		this.isPermisoActualizarComisionConfig=isPermiso;
		this.isPermisoActualizarOriginalComisionConfig=isPermiso;
		this.isPermisoEliminarComisionConfig=isPermiso;
		this.isPermisoGuardarCambiosComisionConfig=isPermiso;
		this.isPermisoConsultaComisionConfig=isPermiso;
		this.isPermisoBusquedaComisionConfig=isPermiso;
		this.isPermisoReporteComisionConfig=isPermiso;
		this.isPermisoOrdenComisionConfig=isPermiso;		
		this.isPermisoPaginacionMedioComisionConfig=isPermiso;		
		this.isPermisoPaginacionAltoComisionConfig=isPermiso;		
		this.isPermisoPaginacionTodoComisionConfig=isPermiso;		
		this.isPermisoCopiarComisionConfig=isPermiso;		
		this.isPermisoVerFormComisionConfig=isPermiso;		
		this.isPermisoDuplicarComisionConfig=isPermiso;
		this.isPermisoOrdenComisionConfig=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioComisionConfig(Boolean isPermiso) {
		//this.isPermisoTodoComisionConfig=isPermiso;
		this.isPermisoNuevoComisionConfig=isPermiso;
		this.isPermisoActualizarComisionConfig=isPermiso;
		this.isPermisoActualizarOriginalComisionConfig=isPermiso;
		this.isPermisoEliminarComisionConfig=isPermiso;
		this.isPermisoGuardarCambiosComisionConfig=isPermiso;
		//this.isPermisoConsultaComisionConfig=isPermiso;
		//this.isPermisoBusquedaComisionConfig=isPermiso;
		//this.isPermisoReporteComisionConfig=isPermiso;
		//this.isPermisoOrdenComisionConfig=isPermiso;		
		//this.isPermisoPaginacionMedioComisionConfig=isPermiso;		
		//this.isPermisoPaginacionAltoComisionConfig=isPermiso;		
		//this.isPermisoPaginacionTodoComisionConfig=isPermiso;		
		//this.isPermisoCopiarComisionConfig=isPermiso;		
		//this.isPermisoDuplicarComisionConfig=isPermiso;
		//this.isPermisoOrdenComisionConfig=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioComisionConfigClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(ComisionCateConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(ComisionMarcaConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(ComisionLineaConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(ComisionPenaConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(ComisionGrupoConstantesFunciones.SNOMBREOPCION);
		
		if(ComisionConfigJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosComisionCate=false;
		this.isTienePermisosComisionCate=this.verificarGetPermisosUsuarioOpcionComisionConfigClaseRelacionada(this.opcionsRelacionadas,ComisionCateConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosComisionMarca=false;
		this.isTienePermisosComisionMarca=this.verificarGetPermisosUsuarioOpcionComisionConfigClaseRelacionada(this.opcionsRelacionadas,ComisionMarcaConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosComisionLinea=false;
		this.isTienePermisosComisionLinea=this.verificarGetPermisosUsuarioOpcionComisionConfigClaseRelacionada(this.opcionsRelacionadas,ComisionLineaConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosComisionPena=false;
		this.isTienePermisosComisionPena=this.verificarGetPermisosUsuarioOpcionComisionConfigClaseRelacionada(this.opcionsRelacionadas,ComisionPenaConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosComisionGrupo=false;
		this.isTienePermisosComisionGrupo=this.verificarGetPermisosUsuarioOpcionComisionConfigClaseRelacionada(this.opcionsRelacionadas,ComisionGrupoConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebComisionConfig(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioComisionConfigClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosComisionCate=conPermiso;
		this.isTienePermisosComisionMarca=conPermiso;
		this.isTienePermisosComisionLinea=conPermiso;
		this.isTienePermisosComisionPena=conPermiso;
		this.isTienePermisosComisionGrupo=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioComisionConfigClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionComisionConfigClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioComisionConfigClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosComisionCate && this.jInternalFrameDetalleFormComisionConfig!=null && this.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormComisionConfig.jTabbedPaneRelacionesComisionConfig.remove(this.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosComisionMarca && this.jInternalFrameDetalleFormComisionConfig!=null && this.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormComisionConfig.jTabbedPaneRelacionesComisionConfig.remove(this.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosComisionLinea && this.jInternalFrameDetalleFormComisionConfig!=null && this.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormComisionConfig.jTabbedPaneRelacionesComisionConfig.remove(this.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosComisionPena && this.jInternalFrameDetalleFormComisionConfig!=null && this.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormComisionConfig.jTabbedPaneRelacionesComisionConfig.remove(this.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosComisionGrupo && this.jInternalFrameDetalleFormComisionConfig!=null && this.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormComisionConfig.jTabbedPaneRelacionesComisionConfig.remove(this.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioComisionConfig() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ComisionConfigJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.comisionconfigSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ComisionConfigConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoComisionConfig=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarComisionConfig=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalComisionConfig=this.isPermisoActualizarComisionConfig;
			this.isPermisoEliminarComisionConfig=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosComisionConfig=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaComisionConfig=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaComisionConfig=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoComisionConfig=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteComisionConfig=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenComisionConfig=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioComisionConfig=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoComisionConfig=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoComisionConfig=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarComisionConfig=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormComisionConfig=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarComisionConfig=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenComisionConfig=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.comisionconfigSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosComisionConfig.setToolTipText(this.jTableDatosComisionConfig.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioComisionConfig(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioComisionConfig(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ComisionConfigJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ComisionConfigJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioComisionConfig() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosComisionCate && this.comisionconfigConstantesFunciones.mostrarComisionCateComisionConfig && !ComisionConfigConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Comision Cate");
			reporte.setsDescripcion("Comision Cate");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosComisionMarca && this.comisionconfigConstantesFunciones.mostrarComisionMarcaComisionConfig && !ComisionConfigConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Comision Marca");
			reporte.setsDescripcion("Comision Marca");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosComisionLinea && this.comisionconfigConstantesFunciones.mostrarComisionLineaComisionConfig && !ComisionConfigConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Comision Linea");
			reporte.setsDescripcion("Comision Linea");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosComisionPena && this.comisionconfigConstantesFunciones.mostrarComisionPenaComisionConfig && !ComisionConfigConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Penalidad Comision");
			reporte.setsDescripcion("Penalidad Comision");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosComisionGrupo && this.comisionconfigConstantesFunciones.mostrarComisionGrupoComisionConfig && !ComisionConfigConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Comision Grupo");
			reporte.setsDescripcion("Comision Grupo");
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
	public void inicializarCombosForeignKeyComisionConfigListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.tipocomisionconfigsForeignKey=new ArrayList();
				this.nivellineasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyComisionConfigListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ComisionConfigJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyComisionConfigListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoComisionConfigListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyNivelLineaListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyTipoComisionConfigListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipocomisionconfigsForeignKey==null||this.tipocomisionconfigsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoComisionConfigConstantesFunciones.getArrayColumnasGlobalesTipoComisionConfig(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoComisionConfigConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoComisionConfigConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoComisionConfigsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyNivelLineaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.nivellineasForeignKey==null||this.nivellineasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=NivelLineaConstantesFunciones.getArrayColumnasGlobalesNivelLinea(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,NivelLineaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=NivelLineaConstantesFunciones.SFINALQUERY;

				this.cargarCombosNivelLineasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyComisionConfigListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			ComisionConfigParameterReturnGeneral comisionconfigReturnGeneral=new ComisionConfigParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.comisionconfigConstantesFunciones.cargarid_empresaComisionConfig)
					 || (this.esRecargarFks && this.comisionconfigConstantesFunciones.cargarid_empresaComisionConfig)) {

					if(!this.comisionconfigSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+comisionconfigSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalTipoComisionConfig="";

				if(((this.tipocomisionconfigsForeignKey==null||this.tipocomisionconfigsForeignKey.size()<=0) && this.comisionconfigConstantesFunciones.cargarid_tipo_comision_configComisionConfig)
					 || (this.esRecargarFks && this.comisionconfigConstantesFunciones.cargarid_tipo_comision_configComisionConfig)) {

					if(!this.comisionconfigSessionBean.getisBusquedaDesdeForeignKeySesionTipoComisionConfig()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoComisionConfigConstantesFunciones.getArrayColumnasGlobalesTipoComisionConfig(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoComisionConfig=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoComisionConfigConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoComisionConfig=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoComisionConfig, "");
						finalQueryGlobalTipoComisionConfig+=TipoComisionConfigConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoComisionConfigsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoComisionConfig=" WHERE " + ConstantesSql.ID + "="+comisionconfigSessionBean.getlidTipoComisionConfigActual();
					}
				} else {
					finalQueryGlobalTipoComisionConfig="NONE";
				}


				String finalQueryGlobalNivelLinea="";

				if(((this.nivellineasForeignKey==null||this.nivellineasForeignKey.size()<=0) && this.comisionconfigConstantesFunciones.cargarid_nivel_lineaComisionConfig)
					 || (this.esRecargarFks && this.comisionconfigConstantesFunciones.cargarid_nivel_lineaComisionConfig)) {

					if(!this.comisionconfigSessionBean.getisBusquedaDesdeForeignKeySesionNivelLinea()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=NivelLineaConstantesFunciones.getArrayColumnasGlobalesNivelLinea(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalNivelLinea=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,NivelLineaConstantesFunciones.TABLENAME);

						finalQueryGlobalNivelLinea=Funciones.GetFinalQueryAppend(finalQueryGlobalNivelLinea, "");
						finalQueryGlobalNivelLinea+=NivelLineaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosNivelLineasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalNivelLinea=" WHERE " + ConstantesSql.ID + "="+comisionconfigSessionBean.getlidNivelLineaActual();
					}
				} else {
					finalQueryGlobalNivelLinea="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				comisionconfigReturnGeneral=comisionconfigLogic.cargarCombosLoteForeignKeyComisionConfig(finalQueryGlobalEmpresa,finalQueryGlobalTipoComisionConfig,finalQueryGlobalNivelLinea);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=comisionconfigReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalTipoComisionConfig.equals("NONE")) {
				this.tipocomisionconfigsForeignKey=comisionconfigReturnGeneral.gettipocomisionconfigsForeignKey();
			}

			if(!finalQueryGlobalNivelLinea.equals("NONE")) {
				this.nivellineasForeignKey=comisionconfigReturnGeneral.getnivellineasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyComisionConfig()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyTipoComisionConfig();
			this.addItemDefectoCombosForeignKeyNivelLinea();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.comisionconfigSessionBean==null) {
				this.comisionconfigSessionBean=new ComisionConfigSessionBean();
			}

			if(!this.comisionconfigSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyTipoComisionConfig()throws Exception {
		try {

			if(!this.comisionconfigSessionBean.getisBusquedaDesdeForeignKeySesionTipoComisionConfig()) {
				TipoComisionConfig tipocomisionconfig=new TipoComisionConfig();
				TipoComisionConfigConstantesFunciones.setTipoComisionConfigDescripcion(tipocomisionconfig,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipocomisionconfig.setId(null);

				if(!TipoComisionConfigConstantesFunciones.ExisteEnLista(this.tipocomisionconfigsForeignKey,tipocomisionconfig,true)) {

					this.tipocomisionconfigsForeignKey.add(0,tipocomisionconfig);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyNivelLinea()throws Exception {
		try {

			if(!this.comisionconfigSessionBean.getisBusquedaDesdeForeignKeySesionNivelLinea()) {
				NivelLinea nivellinea=new NivelLinea();
				NivelLineaConstantesFunciones.setNivelLineaDescripcion(nivellinea,Constantes.SMENSAJE_ESCOJA_OPCION);
				nivellinea.setId(null);

				if(!NivelLineaConstantesFunciones.ExisteEnLista(this.nivellineasForeignKey,nivellinea,true)) {

					this.nivellineasForeignKey.add(0,nivellinea);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyComisionConfig()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyComisionConfig(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyComisionConfig()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyComisionConfig();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyComisionConfig(ComisionConfig comisionconfig)throws Exception {	
		try {
			
			this.setActualTipoComisionConfigForeignKey(comisionconfig.getid_tipo_comision_config(),false,"Formulario");
			this.setActualNivelLineaForeignKey(comisionconfig.getid_nivel_linea(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyComisionConfig(ComisionConfig comisionconfig,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyComisionConfig()throws Exception {	
		try {
			
			this.setActualTipoComisionConfigForeignKey(this.comisionconfigConstantesFunciones.getid_tipo_comision_config(),false,"Formulario");
			this.setActualNivelLineaForeignKey(this.comisionconfigConstantesFunciones.getid_nivel_linea(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyComisionConfig()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyComisionConfig()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyComisionConfig()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroComisionConfig()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyComisionConfig()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameTipoComisionConfigsForeignKey("Todos");
			this.cargarCombosFrameNivelLineasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyComisionConfig(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoComisionConfigsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameNivelLineasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyComisionConfig()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormComisionConfig.jComboBoxid_empresaComisionConfig!=null && this.jInternalFrameDetalleFormComisionConfig.jComboBoxid_empresaComisionConfig.getItemCount()>0) {
				this.jInternalFrameDetalleFormComisionConfig.jComboBoxid_empresaComisionConfig.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormComisionConfig.jComboBoxid_tipo_comision_configComisionConfig!=null && this.jInternalFrameDetalleFormComisionConfig.jComboBoxid_tipo_comision_configComisionConfig.getItemCount()>0) {
				this.jInternalFrameDetalleFormComisionConfig.jComboBoxid_tipo_comision_configComisionConfig.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormComisionConfig.jComboBoxid_nivel_lineaComisionConfig!=null && this.jInternalFrameDetalleFormComisionConfig.jComboBoxid_nivel_lineaComisionConfig.getItemCount()>0) {
				this.jInternalFrameDetalleFormComisionConfig.jComboBoxid_nivel_lineaComisionConfig.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public ComisionConfigBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ComisionConfigBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ComisionConfigBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.comisionconfigSessionBean=new ComisionConfigSessionBean(); 
		this.comisionconfigConstantesFunciones=new ComisionConfigConstantesFunciones(); 
		this.comisionconfigBean=new ComisionConfig();//(this.comisionconfigConstantesFunciones); 		
		this.comisionconfigReturnGeneral=new ComisionConfigParameterReturnGeneral(); 
		
		this.comisionconfigSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.comisionconfigSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ComisionConfigBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ComisionConfigBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ComisionConfigBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessComisionConfig(true);
			
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
			
			this.comisionconfigConstantesFunciones=new ComisionConfigConstantesFunciones(); 
			this.comisionconfigBean=new ComisionConfig();//this.comisionconfigConstantesFunciones); 			
			this.comisionconfigReturnGeneral=new ComisionConfigParameterReturnGeneral(); 
		
			ComisionConfigBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Comision Config Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.comisionconfig=new ComisionConfig();
			this.comisionconfigs = new ArrayList<ComisionConfig>();
			this.comisionconfigsAux = new ArrayList<ComisionConfig>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionconfigLogic=new ComisionConfigLogic();
				this.comisionconfigLogic.getNewConnexionToDeep("");
			}
			
			//this.comisionconfigSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.comisionconfigSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormComisionConfig);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoComisionConfig!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoComisionConfig);	
					}
					
					if(this.jInternalFrameImportacionComisionConfig!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionComisionConfig);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByComisionConfig!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByComisionConfig);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormComisionConfig!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormComisionConfig);
				this.jInternalFrameDetalleFormComisionConfig.setVisible(false);
				this.jInternalFrameDetalleFormComisionConfig.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoComisionConfig!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoComisionConfig);
					this.jInternalFrameReporteDinamicoComisionConfig.setVisible(false);
					this.jInternalFrameReporteDinamicoComisionConfig.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionComisionConfig!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionComisionConfig);
					this.jInternalFrameImportacionComisionConfig.setVisible(false);
					this.jInternalFrameImportacionComisionConfig.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByComisionConfig!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByComisionConfig);
					this.jInternalFrameOrderByComisionConfig.setVisible(false);
					this.jInternalFrameOrderByComisionConfig.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idComisionConfigActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ComisionConfigConstantesFunciones.INUMEROPAGINACION;
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
			
			this.comisionconfigReturnGeneral=new ComisionConfigParameterReturnGeneral();
			
			this.comisionconfigParameterGeneral=new ComisionConfigParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.comisionconfigLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.comisionconfigSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ComisionConfigJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.comisionconfigSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(ComisionCateConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(ComisionMarcaConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(ComisionLineaConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(ComisionPenaConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(ComisionGrupoConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ComisionConfigConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.comisionconfigSessionBean.getEsGuardarRelacionado(),this.comisionconfigSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ComisionConfigConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.comisionconfigSessionBean.getEsGuardarRelacionado(),this.comisionconfigSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoComisionConfig=false;
			this.isVisibilidadCeldaDuplicarComisionConfig=true;
			this.isVisibilidadCeldaCopiarComisionConfig=true;
			this.isVisibilidadCeldaVerFormComisionConfig=true;
			this.isVisibilidadCeldaOrdenComisionConfig=true;
			this.isVisibilidadCeldaNuevoRelacionesComisionConfig=false;
			this.isVisibilidadCeldaModificarComisionConfig=false;
			this.isVisibilidadCeldaActualizarComisionConfig=false;
			this.isVisibilidadCeldaEliminarComisionConfig=false;
			this.isVisibilidadCeldaCancelarComisionConfig=false;
			this.isVisibilidadCeldaGuardarComisionConfig=false;
			this.isVisibilidadCeldaGuardarCambiosComisionConfig=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdNivelLinea=true;
			this.isVisibilidadFK_IdTipoComisionConfig=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesComisionConfig("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosComisionConfig();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioComisionConfig(false);
			
			this.setPermisosUsuarioComisionConfig();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.comisionconfigSessionBean.getEsGuardarRelacionado() 
				|| (this.comisionconfigSessionBean.getEsGuardarRelacionado() && this.comisionconfigSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioComisionConfigClasesRelacionadas();
			}
			
			if(this.comisionconfigSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioComisionConfigClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ComisionConfigJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosComisionConfig();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualComisionConfig();
			}
			
			if(!this.isPermisoBusquedaComisionConfig) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasComisionConfig.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.comisionconfigSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioComisionConfig,this.isPermisoPaginacionMedioComisionConfig,this.isPermisoPaginacionTodoComisionConfig);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ComisionConfigConstantesFunciones.getTiposSeleccionarComisionConfig());
				
				this.tiposColumnasSelect=ComisionConfigConstantesFunciones.getTiposSeleccionarComisionConfig(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectComisionConfig();				
				//this.tiposRelacionesSelect=ComisionConfigConstantesFunciones.getTiposRelacionesComisionConfig(true);
				
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
			//if(!this.comisionconfigSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioComisionConfig();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioComisionConfig(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioComisionConfig(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesComisionConfig() ;
			
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
			
			
			this.comisioncateLogic=new ComisionCateLogic();
			this.comisionmarcaLogic=new ComisionMarcaLogic();
			this.comisionlineaLogic=new ComisionLineaLogic();
			this.comisionpenaLogic=new ComisionPenaLogic();
			this.comisiongrupoLogic=new ComisionGrupoLogic(); 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			this.tipocomisionconfigLogic=new TipoComisionConfigLogic();
			this.nivellineaLogic=new NivelLineaLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				comisionconfigImplementable= (ComisionConfigImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ComisionConfigConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				comisionconfigImplementableHome= (ComisionConfigImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ComisionConfigConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.comisionconfigs= new ArrayList<ComisionConfig>();
			this.comisionconfigsEliminados= new ArrayList<ComisionConfig>();
						
			this.isEsNuevoComisionConfig=false;
			this.esParaAccionDesdeFormularioComisionConfig=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.tipocomisionconfigsForeignKey=new ArrayList<TipoComisionConfig>() ;
			this.nivellineasForeignKey=new ArrayList<NivelLinea>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyComisionConfig(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroComisionConfig();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.comisionconfigSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ComisionConfigBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ComisionConfigConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesComisionConfig("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingComisionConfig(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormComisionConfig!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioComisionConfig();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioComisionConfig();
			}
			
			ComisionConfigBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasComisionConfig.getTabCount(); i++) {
					this.jTabbedPaneBusquedasComisionConfig.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasComisionConfig.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionconfigLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessComisionConfig(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ComisionConfig: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionconfigLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionconfigLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectComisionConfig() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(ComisionCateConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ComisionCateConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(ComisionMarcaConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ComisionMarcaConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(ComisionLineaConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ComisionLineaConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(ComisionPenaConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ComisionPenaConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(ComisionGrupoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ComisionGrupoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesComisionConfig")) {
				iIndex=this.jInternalFrameDetalleFormComisionConfig.jTabbedPaneRelacionesComisionConfig.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormComisionConfig.jTabbedPaneRelacionesComisionConfig.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosComisionConfig.getSelectedRow();	
				
				

				if(sTitle.equals("Comision Cates")) {
					if(!ComisionCateJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessComisionConfig();

						this.cargarParteTabPanelRelacionadaComisionCate(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Comision Grupos")) {
					if(!ComisionGrupoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessComisionConfig();

						this.cargarParteTabPanelRelacionadaComisionGrupo(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Comision Lineas")) {
					if(!ComisionLineaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessComisionConfig();

						this.cargarParteTabPanelRelacionadaComisionLinea(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Comision Marcas")) {
					if(!ComisionMarcaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessComisionConfig();

						this.cargarParteTabPanelRelacionadaComisionMarca(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Penalidad Comisions")) {
					if(!ComisionPenaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessComisionConfig();

						this.cargarParteTabPanelRelacionadaComisionPena(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessComisionConfig();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaComisionCate(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormComisionConfig.cargarSessionConBeanSwingJInternalFrameComisionCate(false,true,iIndex);
		this.jButtonComisionCateActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaComisionCate();

		//this.jTabbedPaneRelacionesComisionConfig.updateUI();
		//this.jTabbedPaneRelacionesComisionConfig.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesComisionConfig.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaComisionGrupo(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormComisionConfig.cargarSessionConBeanSwingJInternalFrameComisionGrupo(false,true,iIndex);
		this.jButtonComisionGrupoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaComisionGrupo();

		//this.jTabbedPaneRelacionesComisionConfig.updateUI();
		//this.jTabbedPaneRelacionesComisionConfig.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesComisionConfig.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaComisionLinea(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormComisionConfig.cargarSessionConBeanSwingJInternalFrameComisionLinea(false,true,iIndex);
		this.jButtonComisionLineaActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaComisionLinea();

		//this.jTabbedPaneRelacionesComisionConfig.updateUI();
		//this.jTabbedPaneRelacionesComisionConfig.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesComisionConfig.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaComisionMarca(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormComisionConfig.cargarSessionConBeanSwingJInternalFrameComisionMarca(false,true,iIndex);
		this.jButtonComisionMarcaActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaComisionMarca();

		//this.jTabbedPaneRelacionesComisionConfig.updateUI();
		//this.jTabbedPaneRelacionesComisionConfig.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesComisionConfig.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaComisionPena(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormComisionConfig.cargarSessionConBeanSwingJInternalFrameComisionPena(false,true,iIndex);
		this.jButtonComisionPenaActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaComisionPena();

		//this.jTabbedPaneRelacionesComisionConfig.updateUI();
		//this.jTabbedPaneRelacionesComisionConfig.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesComisionConfig.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("ComisionCate")) {
				int row=this.jTableDatosComisionConfig.getSelectedRow();
				jButtonComisionCateActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("ComisionMarca")) {
				int row=this.jTableDatosComisionConfig.getSelectedRow();
				jButtonComisionMarcaActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("ComisionLinea")) {
				int row=this.jTableDatosComisionConfig.getSelectedRow();
				jButtonComisionLineaActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("ComisionPena")) {
				int row=this.jTableDatosComisionConfig.getSelectedRow();
				jButtonComisionPenaActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("ComisionGrupo")) {
				int row=this.jTableDatosComisionConfig.getSelectedRow();
				jButtonComisionGrupoActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.comisionconfigSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Comision Cate")) {

					if(this.isTienePermisosComisionCate && this.comisionconfigConstantesFunciones.mostrarComisionCateComisionConfig && !ComisionConfigConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Comision Cates"+"("+ComisionCateConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Comision Cates");

						if(comisionconfigConstantesFunciones.resaltarComisionCateComisionConfig!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(comisionconfigConstantesFunciones.resaltarComisionCateComisionConfig);
						}

						jmenuItem.setEnabled(this.comisionconfigConstantesFunciones.activarComisionCateComisionConfig);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"ComisionCate"));

						

						this.jInternalFrameDetalleFormComisionConfig.jmenuDetalleComisionConfig.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Comision Marca")) {

					if(this.isTienePermisosComisionMarca && this.comisionconfigConstantesFunciones.mostrarComisionMarcaComisionConfig && !ComisionConfigConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Comision Marcas"+"("+ComisionMarcaConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Comision Marcas");

						if(comisionconfigConstantesFunciones.resaltarComisionMarcaComisionConfig!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(comisionconfigConstantesFunciones.resaltarComisionMarcaComisionConfig);
						}

						jmenuItem.setEnabled(this.comisionconfigConstantesFunciones.activarComisionMarcaComisionConfig);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"ComisionMarca"));

						

						this.jInternalFrameDetalleFormComisionConfig.jmenuDetalleComisionConfig.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Comision Linea")) {

					if(this.isTienePermisosComisionLinea && this.comisionconfigConstantesFunciones.mostrarComisionLineaComisionConfig && !ComisionConfigConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Comision Lineas"+"("+ComisionLineaConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Comision Lineas");

						if(comisionconfigConstantesFunciones.resaltarComisionLineaComisionConfig!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(comisionconfigConstantesFunciones.resaltarComisionLineaComisionConfig);
						}

						jmenuItem.setEnabled(this.comisionconfigConstantesFunciones.activarComisionLineaComisionConfig);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"ComisionLinea"));

						

						this.jInternalFrameDetalleFormComisionConfig.jmenuDetalleComisionConfig.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Penalidad Comision")) {

					if(this.isTienePermisosComisionPena && this.comisionconfigConstantesFunciones.mostrarComisionPenaComisionConfig && !ComisionConfigConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Penalidad Comisions"+"("+ComisionPenaConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Penalidad Comisions");

						if(comisionconfigConstantesFunciones.resaltarComisionPenaComisionConfig!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(comisionconfigConstantesFunciones.resaltarComisionPenaComisionConfig);
						}

						jmenuItem.setEnabled(this.comisionconfigConstantesFunciones.activarComisionPenaComisionConfig);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"ComisionPena"));

						

						this.jInternalFrameDetalleFormComisionConfig.jmenuDetalleComisionConfig.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Comision Grupo")) {

					if(this.isTienePermisosComisionGrupo && this.comisionconfigConstantesFunciones.mostrarComisionGrupoComisionConfig && !ComisionConfigConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Comision Grupos"+"("+ComisionGrupoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Comision Grupos");

						if(comisionconfigConstantesFunciones.resaltarComisionGrupoComisionConfig!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(comisionconfigConstantesFunciones.resaltarComisionGrupoComisionConfig);
						}

						jmenuItem.setEnabled(this.comisionconfigConstantesFunciones.activarComisionGrupoComisionConfig);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"ComisionGrupo"));

						

						this.jInternalFrameDetalleFormComisionConfig.jmenuDetalleComisionConfig.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyComisionConfig(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyComisionConfig(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyComisionConfig(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyComisionConfigListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyComisionConfig();
		
		this.cargarCombosFrameForeignKeyComisionConfig();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyComisionConfig();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyComisionConfig();
		}
	}
	
	

	public void cargarCombosForeignKeyTipoComisionConfig(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoComisionConfigListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoComisionConfig();
				this.cargarCombosFrameTipoComisionConfigsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoComisionConfig(this.tipocomisionconfigsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyNivelLinea(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyNivelLineaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyNivelLinea();
				this.cargarCombosFrameNivelLineasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaNivelLinea(this.nivellineasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoComisionConfigActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.comisionconfigSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormComisionConfig==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ComisionConfigBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.comisionconfig,new Object(),this.comisionconfigParameterGeneral,this.comisionconfigReturnGeneral);
			
			
			if(jTableDatosComisionConfig.getRowCount()>=1) {
				jTableDatosComisionConfig.removeRowSelectionInterval(0, jTableDatosComisionConfig.getRowCount()-1);						
			}
			
			this.isEsNuevoComisionConfig=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoComisionConfig(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesComisionConfig(true);			
			//this.comisionconfig=new ComisionConfig();
			//this.comisionconfig.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesComisionConfig(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualComisionConfig() ;
			
			if(ComisionConfigJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleComisionConfig(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.comisionconfig);	
			this.actualizarInformacion("INFO_PADRE",false,this.comisionconfig);				
			
			ComisionConfigBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.comisionconfig,new Object(),this.comisionconfigParameterGeneral,this.comisionconfigReturnGeneral);
			
			if(this.comisionconfigSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ComisionConfig: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ComisionConfigBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.comisionconfig,new Object(),this.comisionconfigParameterGeneral,this.comisionconfigReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarComisionConfigActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ComisionConfig> comisionconfigsSeleccionados=new ArrayList<ComisionConfig>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosComisionConfig.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosComisionConfig.getSelectedRows().length;			
			}
			
			comisionconfigsSeleccionados=this.getComisionConfigsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoComisionConfig--;			
				//ComisionConfig comisionconfigAux= new ComisionConfig();			
				//comisionconfigAux.setId(this.iIdNuevoComisionConfig);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ComisionConfig comisionconfigOrigen=new ComisionConfig();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ComisionConfig comisionconfigOrigen : comisionconfigsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosComisionConfig.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							comisionconfigOrigen =(ComisionConfig) this.comisionconfigLogic.getComisionConfigs().toArray()[this.jTableDatosComisionConfig.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							comisionconfigOrigen =(ComisionConfig) this.comisionconfigs.toArray()[this.jTableDatosComisionConfig.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaComisionConfig();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.comisionconfig.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosComisionConfig(comisionconfigOrigen,this.comisionconfig,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysComisionConfig(this.comisionconfig);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.comisionconfigLogic.getComisionConfigs().add(this.comisionconfigAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.comisionconfigs.add(this.comisionconfigAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaComisionConfig(false);
				
				this.jTableDatosComisionConfig.setRowSelectionInterval(this.getIndiceNuevoComisionConfig(), this.getIndiceNuevoComisionConfig());
				
				int iLastRow =  this.jTableDatosComisionConfig.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosComisionConfig.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosComisionConfig.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaComisionConfig(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarComisionConfigActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ComisionConfig> comisionconfigsSeleccionados=new ArrayList<ComisionConfig>();									
		
			ComisionConfig comisionconfigOrigen=new ComisionConfig();
			ComisionConfig comisionconfigDestino=new ComisionConfig();
				
			comisionconfigsSeleccionados=this.getComisionConfigsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosComisionConfig.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || comisionconfigsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosComisionConfig.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						comisionconfigOrigen =(ComisionConfig) this.comisionconfigLogic.getComisionConfigs().toArray()[this.jTableDatosComisionConfig.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						comisionconfigOrigen =(ComisionConfig) this.comisionconfigs.toArray()[this.jTableDatosComisionConfig.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						comisionconfigDestino =(ComisionConfig) this.comisionconfigLogic.getComisionConfigs().toArray()[this.jTableDatosComisionConfig.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						comisionconfigDestino =(ComisionConfig) this.comisionconfigs.toArray()[this.jTableDatosComisionConfig.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				comisionconfigOrigen =comisionconfigsSeleccionados.get(0);
				comisionconfigDestino =comisionconfigsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosComisionConfig(comisionconfigOrigen,comisionconfigDestino,true,false);
				
				comisionconfigDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(comisionconfigDestino,comisionconfigLogic.getComisionConfigs());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(comisionconfigDestino,comisionconfigs);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaComisionConfig(false);
				
				//this.jTableDatosComisionConfig.setRowSelectionInterval(this.getIndiceNuevoComisionConfig(), this.getIndiceNuevoComisionConfig());
				
				int iLastRow =  this.jTableDatosComisionConfig.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosComisionConfig.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosComisionConfig.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaComisionConfig(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormComisionConfigActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormComisionConfig==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormComisionConfig.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarComisionConfigActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesComisionConfig.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasComisionConfig.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesComisionConfig.setVisible(!isVisible);
			this.jPanelPaginacionComisionConfig.setVisible(!isVisible);
			this.jPanelAccionesComisionConfig.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarComisionConfigActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameComisionConfig();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoComisionConfigActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoComisionConfig();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionComisionConfigActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionComisionConfig();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByComisionConfigActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByComisionConfig();
			
			this.abrirFrameOrderByComisionConfig();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByComisionConfigActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByComisionConfig();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleComisionConfig(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormComisionConfig);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormComisionConfig.isMaximum()) {
					this.jInternalFrameDetalleFormComisionConfig.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormComisionConfig.setSize(this.jInternalFrameDetalleFormComisionConfig.iWidthFormulario,this.jInternalFrameDetalleFormComisionConfig.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormComisionConfig.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormComisionConfig.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormComisionConfig.isMaximum()) {
						this.jInternalFrameDetalleFormComisionConfig.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormComisionConfig.jContentPaneDetalleComisionConfig.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormComisionConfig.jTabbedPaneRelacionesComisionConfig.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormComisionConfig.jContentPaneDetalleComisionConfig.getWidth(),ComisionConfigConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormComisionConfig.jTabbedPaneRelacionesComisionConfig.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormComisionConfig.jContentPaneDetalleComisionConfig.getWidth(),ComisionConfigConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormComisionConfig.jTabbedPaneRelacionesComisionConfig.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormComisionConfig.jContentPaneDetalleComisionConfig.getWidth(),ComisionConfigConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(ComisionCateJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaComisionCate();
					}

					if(ComisionGrupoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaComisionGrupo();
					}

					if(ComisionLineaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaComisionLinea();
					}

					if(ComisionMarcaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaComisionMarca();
					}

					if(ComisionPenaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaComisionPena();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormComisionConfig.setVisible(true);
	        this.jInternalFrameDetalleFormComisionConfig.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByComisionConfig() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByComisionConfig==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByComisionConfig=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByComisionConfig,false,this);
				} else {
					this.jInternalFrameOrderByComisionConfig=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByComisionConfig,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByComisionConfig);
				this.jInternalFrameOrderByComisionConfig.setVisible(false);
				this.jInternalFrameOrderByComisionConfig.setSelected(false);
				
				this.jInternalFrameOrderByComisionConfig.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByComisionConfig"));
				
				this.inicializarActualizarBindingTablaOrderByComisionConfig();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionComisionConfig() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionComisionConfig==null) {
				
				this.jInternalFrameImportacionComisionConfig=new ImportacionJInternalFrame(ComisionConfigConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionComisionConfig);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionComisionConfig);
				this.jInternalFrameImportacionComisionConfig.setVisible(false);
				this.jInternalFrameImportacionComisionConfig.setSelected(false);


				this.jInternalFrameImportacionComisionConfig.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionComisionConfig"));
				this.jInternalFrameImportacionComisionConfig.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionComisionConfig"));
				this.jInternalFrameImportacionComisionConfig.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionComisionConfig"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoComisionConfig() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoComisionConfig==null) {
				this.jInternalFrameReporteDinamicoComisionConfig=new ReporteDinamicoJInternalFrame(ComisionConfigConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoComisionConfig);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoComisionConfig);
				this.jInternalFrameReporteDinamicoComisionConfig.setVisible(false);
				this.jInternalFrameReporteDinamicoComisionConfig.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoComisionConfig.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoComisionConfig"));
				this.jInternalFrameReporteDinamicoComisionConfig.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoComisionConfig"));
				this.jInternalFrameReporteDinamicoComisionConfig.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoComisionConfig"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualComisionConfig();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaComisionCate() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame.jScrollPanelDatosComisionCate.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormComisionConfig.jContentPaneDetalleComisionConfig.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame.jScrollPanelDatosComisionCate.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame.jScrollPanelDatosComisionCate.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame.jScrollPanelDatosComisionCate.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaComisionGrupo() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame.jScrollPanelDatosComisionGrupo.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormComisionConfig.jContentPaneDetalleComisionConfig.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame.jScrollPanelDatosComisionGrupo.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame.jScrollPanelDatosComisionGrupo.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame.jScrollPanelDatosComisionGrupo.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaComisionLinea() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame.jScrollPanelDatosComisionLinea.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormComisionConfig.jContentPaneDetalleComisionConfig.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame.jScrollPanelDatosComisionLinea.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame.jScrollPanelDatosComisionLinea.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame.jScrollPanelDatosComisionLinea.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaComisionMarca() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame.jScrollPanelDatosComisionMarca.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormComisionConfig.jContentPaneDetalleComisionConfig.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame.jScrollPanelDatosComisionMarca.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame.jScrollPanelDatosComisionMarca.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame.jScrollPanelDatosComisionMarca.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaComisionPena() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame.jScrollPanelDatosComisionPena.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormComisionConfig.jContentPaneDetalleComisionConfig.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame.jScrollPanelDatosComisionPena.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame.jScrollPanelDatosComisionPena.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame.jScrollPanelDatosComisionPena.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleComisionConfig() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormComisionConfig);
			
	       	this.jInternalFrameDetalleFormComisionConfig.setVisible(false);
	        this.jInternalFrameDetalleFormComisionConfig.setSelected(false);
			
			//this.jInternalFrameDetalleFormComisionConfig.dispose();
			//this.jInternalFrameDetalleFormComisionConfig=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoComisionConfig() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoComisionConfig.setVisible(true);
	        this.jInternalFrameReporteDinamicoComisionConfig.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionComisionConfig() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionComisionConfig.setVisible(true);
	        this.jInternalFrameImportacionComisionConfig.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByComisionConfig() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByComisionConfig.setVisible(true);
	        this.jInternalFrameOrderByComisionConfig.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByComisionConfig() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByComisionConfig.setVisible(false);
	        this.jInternalFrameOrderByComisionConfig.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoComisionConfig() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoComisionConfig.setVisible(false);
	        this.jInternalFrameReporteDinamicoComisionConfig.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionComisionConfig() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionComisionConfig.setVisible(false);
	        this.jInternalFrameImportacionComisionConfig.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarComisionConfigActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarComisionConfig(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarComisionConfig(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosComisionConfig.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesComisionConfig(true);
			//this.isEsNuevoComisionConfig=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionconfig =(ComisionConfig) this.comisionconfigLogic.getComisionConfigs().toArray()[this.jTableDatosComisionConfig.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.comisionconfig =(ComisionConfig) this.comisionconfigs.toArray()[this.jTableDatosComisionConfig.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesComisionConfig("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesComisionConfig(false) ;
			
			if(comisionconfigSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame.comisioncateSessionBean.getEsGuardarRelacionado() && ComisionCateJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonComisionCateActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame.comisionmarcaSessionBean.getEsGuardarRelacionado() && ComisionMarcaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonComisionMarcaActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame.comisionlineaSessionBean.getEsGuardarRelacionado() && ComisionLineaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonComisionLineaActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame.comisionpenaSessionBean.getEsGuardarRelacionado() && ComisionPenaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonComisionPenaActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame.comisiongrupoSessionBean.getEsGuardarRelacionado() && ComisionGrupoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonComisionGrupoActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(ComisionConfigJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleComisionConfig(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualComisionConfig(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaComisionConfigActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosComisionConfig.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionconfig =(ComisionConfig) this.comisionconfigLogic.getComisionConfigs().toArray()[this.jTableDatosComisionConfig.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comisionconfig =(ComisionConfig) this.comisionconfigs.toArray()[this.jTableDatosComisionConfig.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarComisionConfig(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormComisionConfig==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosComisionConfig.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesComisionConfig(true);
			//this.isEsNuevoComisionConfig=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionconfig =(ComisionConfig) this.comisionconfigLogic.getComisionConfigs().toArray()[this.jTableDatosComisionConfig.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.comisionconfig =(ComisionConfig) this.comisionconfigs.toArray()[this.jTableDatosComisionConfig.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.comisionconfig.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesComisionConfig("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesComisionConfig(false) ;
			
			if(ComisionConfigJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleComisionConfig(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualComisionConfig(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaTipoComisionConfig(List<TipoComisionConfig> tipocomisionconfigsForeignKey)throws Exception{
		TableColumn tableColumnTipoComisionConfig=this.jTableDatosComisionConfig.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionConfig,ComisionConfigConstantesFunciones.LABEL_IDTIPOCOMISIONCONFIG));
		TableCellEditor tableCellEditorTipoComisionConfig =tableColumnTipoComisionConfig.getCellEditor();

		TipoComisionConfigTableCell tipocomisionconfigTableCellFk=(TipoComisionConfigTableCell)tableCellEditorTipoComisionConfig;

		if(tipocomisionconfigTableCellFk!=null) {
			tipocomisionconfigTableCellFk.settipocomisionconfigsForeignKey(tipocomisionconfigsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosComisionConfig.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipocomisionconfigTableCellFk.setRowActual(intSelectedRow);
			//tipocomisionconfigTableCellFk.settipocomisionconfigsForeignKeyActual(tipocomisionconfigsForeignKey);
		//}


		if(tipocomisionconfigTableCellFk!=null) {
			tipocomisionconfigTableCellFk.RecargarTipoComisionConfigsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaNivelLinea(List<NivelLinea> nivellineasForeignKey)throws Exception{
		TableColumn tableColumnNivelLinea=this.jTableDatosComisionConfig.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionConfig,ComisionConfigConstantesFunciones.LABEL_IDNIVELLINEA));
		TableCellEditor tableCellEditorNivelLinea =tableColumnNivelLinea.getCellEditor();

		NivelLineaTableCell nivellineaTableCellFk=(NivelLineaTableCell)tableCellEditorNivelLinea;

		if(nivellineaTableCellFk!=null) {
			nivellineaTableCellFk.setnivellineasForeignKey(nivellineasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosComisionConfig.getSelectedRow();

		//if(intSelectedRow<=0) {
			//nivellineaTableCellFk.setRowActual(intSelectedRow);
			//nivellineaTableCellFk.setnivellineasForeignKeyActual(nivellineasForeignKey);
		//}


		if(nivellineaTableCellFk!=null) {
			nivellineaTableCellFk.RecargarNivelLineasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarComisionConfigActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionconfigLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesComisionConfig(false);
			
			//if(!this.isEsNuevoComisionConfig) {								
				int intSelectedRow = this.jTableDatosComisionConfig.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionconfig =(ComisionConfig) this.comisionconfigLogic.getComisionConfigs().toArray()[this.jTableDatosComisionConfig.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.comisionconfig =(ComisionConfig) this.comisionconfigs.toArray()[this.jTableDatosComisionConfig.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ComisionConfigJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualComisionConfig(this.comisionconfig,true);
				this.setVariablesFormularioToObjetoActualForeignKeysComisionConfig(this.comisionconfig);
				
			}
			
			if(this.permiteMantenimiento(this.comisionconfig)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.comisionconfigSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoComisionConfig=true;
					this.inicializarActualizarBindingTablaComisionConfig(false);
					this.isEsNuevoComisionConfig=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoComisionConfig=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoComisionConfig=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesComisionConfig(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualComisionConfig(false);
				
				this.habilitarDeshabilitarControlesComisionConfig(false);
			
												
				
				if(ComisionConfigJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleComisionConfig();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoComisionConfigActionPerformed(evt,comisionconfigSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualComisionConfig(this.comisionconfig,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosComisionConfig.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,comisionconfigSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionconfigLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.comisionconfig.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ComisionConfig.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComisionConfig.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionconfigLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionconfigLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarComisionConfigActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionconfigLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosComisionConfig.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionconfig =(ComisionConfig) this.comisionconfigLogic.getComisionConfigs().toArray()[this.jTableDatosComisionConfig.convertRowIndexToModel(intSelectedRow)];
				this.comisionconfig.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.comisionconfig =(ComisionConfig) this.comisionconfigs.toArray()[this.jTableDatosComisionConfig.convertRowIndexToModel(intSelectedRow)];
				this.comisionconfig.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.comisionconfig)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.comisionconfigSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ComisionConfigModel) this.jTableDatosComisionConfig.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoComisionConfig=true;
				this.inicializarActualizarBindingTablaComisionConfig(false);
				this.isEsNuevoComisionConfig=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesComisionConfig(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualComisionConfig(false);
				
				this.habilitarDeshabilitarControlesComisionConfig(false);
				
				
				
				if(ComisionConfigJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleComisionConfig();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionconfigLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionconfigLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionconfigLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarComisionConfigActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosComisionConfig.getRowCount()>=1) {
				jTableDatosComisionConfig.removeRowSelectionInterval(0, jTableDatosComisionConfig.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesComisionConfig(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaComisionConfig(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesComisionConfig(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualComisionConfig(false) ;
			
			this.isEsNuevoComisionConfig=false;
			
			if(ComisionConfigJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleComisionConfig();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosComisionConfigActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionconfigLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingComisionConfig(false);
				
				//SI ES MANUAL
				if(ComisionConfigJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualComisionConfig();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionconfigLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionconfigLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionconfigLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosComisionConfigActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoComisionConfig--;			
			//ComisionConfig comisionconfigAux= new ComisionConfig();			
			//comisionconfigAux.setId(this.iIdNuevoComisionConfig);
			
			if(this.jInternalFrameDetalleFormComisionConfig==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaComisionConfig();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysComisionConfig(this.comisionconfig);
			
			this.comisionconfig.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.comisionconfigLogic.getComisionConfigs().add(this.comisionconfigAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.comisionconfigs.add(this.comisionconfigAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaComisionConfig(false);
			
			this.jTableDatosComisionConfig.setRowSelectionInterval(this.getIndiceNuevoComisionConfig(), this.getIndiceNuevoComisionConfig());
			
			int iLastRow =  this.jTableDatosComisionConfig.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosComisionConfig.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosComisionConfig.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaComisionConfig(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionComisionConfigActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionconfigLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingComisionConfig(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingComisionConfig(false);
			
			//SI ES MANUAL
			if(ComisionConfigJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualComisionConfig();
			}
			
			//this.abrirFrameTreeComisionConfig();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionconfigLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionconfigLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionconfigLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionComisionConfigActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Comision ConfigES ?", "MANTENIMIENTO DE Comision Config", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionComisionConfig.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralComisionConfig();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.comisionconfigReturnGeneral=comisionconfigLogic.procesarImportacionComisionConfigsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.comisionconfigParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarComisionConfigReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionComisionConfigActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionComisionConfig.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionComisionConfig.setFileImportacion(this.jInternalFrameImportacionComisionConfig.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionComisionConfig.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionComisionConfig.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionComisionConfig.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionComisionConfig.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoComisionConfigActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ComisionConfig> comisionconfigsSeleccionados=new ArrayList<ComisionConfig>();		

		comisionconfigsSeleccionados=this.getComisionConfigsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoComisionConfig.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoComisionConfig.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ComisionConfigBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ComisionConfigBaseDesign.jrxml";
			
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
			
			this.generarReporteComisionConfigs("Todos",comisionconfigsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comisionconfigSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comision Config",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoComisionConfig.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoComisionConfig.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ComisionConfigConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComisionConfigConstantesFunciones.LABEL_IDTIPOCOMISIONCONFIG:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoComisionConfig_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoComisionConfig_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoComisionConfig_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoComisionConfig_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComisionConfigConstantesFunciones.LABEL_IDNIVELLINEA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_NivelLinea_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_NivelLinea_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_NivelLinea_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_NivelLinea_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComisionConfigConstantesFunciones.LABEL_CONVENDEDOR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_nVendedor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_nVendedor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_nVendedor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_nVendedor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComisionConfigConstantesFunciones.LABEL_CONVENTAS:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_nVentas_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_nVentas_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_nVentas_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_nVentas_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComisionConfigConstantesFunciones.LABEL_CONCOBROS:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_nCobros_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_nCobros_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_nCobros_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_nCobros_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComisionConfigConstantesFunciones.LABEL_CONREMESATRANSITO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_nRemesaTransito_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_nRemesaTransito_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_nRemesaTransito_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_nRemesaTransito_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComisionConfigConstantesFunciones.LABEL_CONPENALIDAD:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_nPenalidad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_nPenalidad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_nPenalidad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_nPenalidad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComisionConfigConstantesFunciones.LABEL_CONABONO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_nAbono_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_nAbono_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_nAbono_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_nAbono_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoComisionConfig.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoComisionConfig.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoComisionConfig.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ComisionConfigConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case ComisionConfigConstantesFunciones.LABEL_IDTIPOCOMISIONCONFIG:
					sNombreCampoCategoria="id_tipo_comision_config";
					break;

				case ComisionConfigConstantesFunciones.LABEL_IDNIVELLINEA:
					sNombreCampoCategoria="id_nivel_linea";
					break;

				case ComisionConfigConstantesFunciones.LABEL_CONVENDEDOR:
					sNombreCampoCategoria="con_vendedor";
					break;

				case ComisionConfigConstantesFunciones.LABEL_CONVENTAS:
					sNombreCampoCategoria="con_ventas";
					break;

				case ComisionConfigConstantesFunciones.LABEL_CONCOBROS:
					sNombreCampoCategoria="con_cobros";
					break;

				case ComisionConfigConstantesFunciones.LABEL_CONREMESATRANSITO:
					sNombreCampoCategoria="con_remesa_transito";
					break;

				case ComisionConfigConstantesFunciones.LABEL_CONPENALIDAD:
					sNombreCampoCategoria="con_penalidad";
					break;

				case ComisionConfigConstantesFunciones.LABEL_CONABONO:
					sNombreCampoCategoria="con_abono";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoComisionConfig.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ComisionConfigConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case ComisionConfigConstantesFunciones.LABEL_IDTIPOCOMISIONCONFIG:
					sNombreCampoCategoriaValor="id_tipo_comision_config";
					break;

				case ComisionConfigConstantesFunciones.LABEL_IDNIVELLINEA:
					sNombreCampoCategoriaValor="id_nivel_linea";
					break;

				case ComisionConfigConstantesFunciones.LABEL_CONVENDEDOR:
					sNombreCampoCategoriaValor="con_vendedor";
					break;

				case ComisionConfigConstantesFunciones.LABEL_CONVENTAS:
					sNombreCampoCategoriaValor="con_ventas";
					break;

				case ComisionConfigConstantesFunciones.LABEL_CONCOBROS:
					sNombreCampoCategoriaValor="con_cobros";
					break;

				case ComisionConfigConstantesFunciones.LABEL_CONREMESATRANSITO:
					sNombreCampoCategoriaValor="con_remesa_transito";
					break;

				case ComisionConfigConstantesFunciones.LABEL_CONPENALIDAD:
					sNombreCampoCategoriaValor="con_penalidad";
					break;

				case ComisionConfigConstantesFunciones.LABEL_CONABONO:
					sNombreCampoCategoriaValor="con_abono";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoComisionConfig.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoComisionConfig.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ComisionConfigConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case ComisionConfigConstantesFunciones.LABEL_IDTIPOCOMISIONCONFIG:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Configuracion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_comision_config");
					break;

				case ComisionConfigConstantesFunciones.LABEL_IDNIVELLINEA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nivel Linea",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_nivel_linea");
					break;

				case ComisionConfigConstantesFunciones.LABEL_CONVENDEDOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Con Vendedor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"con_vendedor");
					break;

				case ComisionConfigConstantesFunciones.LABEL_CONVENTAS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Con Ventas",sNombreCampoCategoria,sNombreCampoCategoriaValor,"con_ventas");
					break;

				case ComisionConfigConstantesFunciones.LABEL_CONCOBROS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Con Cobros",sNombreCampoCategoria,sNombreCampoCategoriaValor,"con_cobros");
					break;

				case ComisionConfigConstantesFunciones.LABEL_CONREMESATRANSITO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Con Remesa Transito",sNombreCampoCategoria,sNombreCampoCategoriaValor,"con_remesa_transito");
					break;

				case ComisionConfigConstantesFunciones.LABEL_CONPENALIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Con Penalidad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"con_penalidad");
					break;

				case ComisionConfigConstantesFunciones.LABEL_CONABONO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Con Abono",sNombreCampoCategoria,sNombreCampoCategoriaValor,"con_abono");
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
	
	public void jButtonGenerarExcelReporteDinamicoComisionConfigActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ComisionConfig> comisionconfigsSeleccionados=new ArrayList<ComisionConfig>();		
		
		comisionconfigsSeleccionados=this.getComisionConfigsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"comisionconfig";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ComisionConfigs");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoComisionConfig.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoComisionConfig.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ComisionConfigConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComisionConfigConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ComisionConfig comisionconfig:comisionconfigsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comisionconfig.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComisionConfigConstantesFunciones.LABEL_IDTIPOCOMISIONCONFIG:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComisionConfigConstantesFunciones.LABEL_IDTIPOCOMISIONCONFIG);
					iRow++;

					for(ComisionConfig comisionconfig:comisionconfigsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comisionconfig.gettipocomisionconfig_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComisionConfigConstantesFunciones.LABEL_IDNIVELLINEA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComisionConfigConstantesFunciones.LABEL_IDNIVELLINEA);
					iRow++;

					for(ComisionConfig comisionconfig:comisionconfigsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comisionconfig.getnivellinea_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComisionConfigConstantesFunciones.LABEL_CONVENDEDOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComisionConfigConstantesFunciones.LABEL_CONVENDEDOR);
					iRow++;

					for(ComisionConfig comisionconfig:comisionconfigsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comisionconfig.getcon_vendedor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComisionConfigConstantesFunciones.LABEL_CONVENTAS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComisionConfigConstantesFunciones.LABEL_CONVENTAS);
					iRow++;

					for(ComisionConfig comisionconfig:comisionconfigsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comisionconfig.getcon_ventas());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComisionConfigConstantesFunciones.LABEL_CONCOBROS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComisionConfigConstantesFunciones.LABEL_CONCOBROS);
					iRow++;

					for(ComisionConfig comisionconfig:comisionconfigsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comisionconfig.getcon_cobros());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComisionConfigConstantesFunciones.LABEL_CONREMESATRANSITO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComisionConfigConstantesFunciones.LABEL_CONREMESATRANSITO);
					iRow++;

					for(ComisionConfig comisionconfig:comisionconfigsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comisionconfig.getcon_remesa_transito());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComisionConfigConstantesFunciones.LABEL_CONPENALIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComisionConfigConstantesFunciones.LABEL_CONPENALIDAD);
					iRow++;

					for(ComisionConfig comisionconfig:comisionconfigsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comisionconfig.getcon_penalidad());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComisionConfigConstantesFunciones.LABEL_CONABONO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComisionConfigConstantesFunciones.LABEL_CONABONO);
					iRow++;

					for(ComisionConfig comisionconfig:comisionconfigsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comisionconfig.getcon_abono());
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
			//	this.getFilaCabeceraExportarExcelComisionConfig(row);				
			//	iRow++;
			//}				
			
			//for(ComisionConfig comisionconfigAux:comisionconfigsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelComisionConfig(comisionconfigAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comisionconfigSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comision Config",JOptionPane.INFORMATION_MESSAGE);
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
				this.comisionconfigLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingComisionConfig(false);
			
			//SI ES MANUAL
			if(ComisionConfigJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualComisionConfig();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionconfigLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionconfigLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionconfigLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresComisionConfigActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionconfigLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingComisionConfig(false);
			
			//SI ES MANUAL
			if(ComisionConfigJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualComisionConfig();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionconfigLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionconfigLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionconfigLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesComisionConfigActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionconfigLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingComisionConfig(false);
			
			//SI ES MANUAL
			if(ComisionConfigJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualComisionConfig();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionconfigLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionconfigLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionconfigLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaComisionConfig() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosComisionConfig.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosComisionConfig.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosComisionConfig.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosComisionConfig.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosComisionConfig.setMinimumSize(dimensionMinimum);
		this.jTableDatosComisionConfig.setMaximumSize(dimensionMaximum);
		this.jTableDatosComisionConfig.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingComisionConfig(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingComisionConfig(esInicializar,true);
	}
	
	public void inicializarActualizarBindingComisionConfig(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaComisionConfig(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesComisionConfig(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.comisionconfigSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasComisionConfig(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesComisionConfig(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesComisionConfig(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ComisionConfigJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ComisionConfigJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualComisionConfig() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaComisionConfig();
		
		this.inicializarActualizarBindingBotonesManualComisionConfig(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.comisionconfigSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualComisionConfig();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesComisionConfig() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualComisionConfig(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualComisionConfig(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosComisionConfig.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosComisionConfig.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteComisionConfig.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormComisionConfig!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormComisionConfig.jCheckBoxPostAccionNuevoComisionConfig.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormComisionConfig.jCheckBoxPostAccionSinCerrarComisionConfig.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormComisionConfig.jCheckBoxPostAccionSinMensajeComisionConfig.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosComisionConfig.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosComisionConfig.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteComisionConfig.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormComisionConfig!=null) {
				this.jInternalFrameDetalleFormComisionConfig.jCheckBoxPostAccionNuevoComisionConfig.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormComisionConfig.jCheckBoxPostAccionSinCerrarComisionConfig.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormComisionConfig.jCheckBoxPostAccionSinMensajeComisionConfig.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionComisionConfig.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionComisionConfig.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormComisionConfig!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormComisionConfig.jComboBoxTiposAccionesFormularioComisionConfig.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesComisionConfig.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoComisionConfig!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoComisionConfig.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesComisionConfig.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesComisionConfig.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarComisionConfig.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesComisionConfig.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoComisionConfig!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoComisionConfig.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesComisionConfig.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralComisionConfig.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesComisionConfig(Boolean esInicializar) throws Exception {
		try	{	
			if(ComisionConfigJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualComisionConfig(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesComisionConfig() throws Exception {
		try	{
			if(ComisionConfigJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualComisionConfig();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleComisionConfig() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormComisionConfig.jComboBoxTiposAccionesFormularioComisionConfig.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormComisionConfig.jComboBoxTiposAccionesFormularioComisionConfig.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualComisionConfig() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesComisionConfig.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesComisionConfig.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesComisionConfig.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesComisionConfig.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesComisionConfig.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesComisionConfig.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionComisionConfig.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionComisionConfig.addItem(reporte);
			}
			
			
			if(!this.comisionconfigSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionComisionConfig.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionComisionConfig.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesComisionConfig.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesComisionConfig.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesComisionConfig.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesComisionConfig.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormComisionConfig!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormComisionConfig.jComboBoxTiposAccionesFormularioComisionConfig.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormComisionConfig.jComboBoxTiposAccionesFormularioComisionConfig.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarComisionConfig.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarComisionConfig.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarComisionConfig.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualComisionConfig();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualComisionConfig() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoComisionConfig!=null) {
				this.jInternalFrameReporteDinamicoComisionConfig.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoComisionConfig.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoComisionConfig!=null) {
				this.jInternalFrameReporteDinamicoComisionConfig.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoComisionConfig.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoComisionConfig!=null) {
				
				if(this.jInternalFrameReporteDinamicoComisionConfig.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoComisionConfig.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoComisionConfig.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoComisionConfig.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoComisionConfig.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoComisionConfig.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualComisionConfig()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_nivel_lineaFK_IdNivelLineaComisionConfig.getSelectedItem()!=null){this.id_nivel_lineaFK_IdNivelLinea=((NivelLinea)this.jComboBoxid_nivel_lineaFK_IdNivelLineaComisionConfig.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_comision_configFK_IdTipoComisionConfigComisionConfig.getSelectedItem()!=null){this.id_tipo_comision_configFK_IdTipoComisionConfig=((TipoComisionConfig)this.jComboBoxid_tipo_comision_configFK_IdTipoComisionConfigComisionConfig.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasComisionConfig(Boolean esInicializar) throws Exception {				
		if(ComisionConfigJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualComisionConfig();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaComisionConfig() throws Exception {
		this.inicializarActualizarBindingTablaComisionConfig(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByComisionConfig() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByComisionConfig.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByComisionConfig.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByComisionConfig.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ComisionConfigPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByComisionConfig.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByComisionConfig.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ComisionConfigPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosComisionConfigOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionConfigOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ComisionConfigPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByComisionConfig.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByComisionConfig.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ComisionConfigPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByComisionConfig.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaComisionConfig(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=comisionconfigLogic.getComisionConfigs().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=comisionconfigs.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ComisionConfigJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosComisionConfig.setModel(new ComisionConfigModel(this.comisionconfigLogic.getComisionConfigs(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosComisionConfig.setModel(new ComisionConfigModel(this.comisionconfigs,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByComisionConfig!=null && this.jInternalFrameOrderByComisionConfig.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByComisionConfig();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosComisionConfig.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionConfig,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ComisionConfigPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ComisionConfigConstantesFunciones.SCLASSWEBTITULO,comisionconfigConstantesFunciones.resaltarSeleccionarComisionConfig,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ComisionConfigConstantesFunciones.SCLASSWEBTITULO,comisionconfigConstantesFunciones.resaltarSeleccionarComisionConfig,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosComisionConfig.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionConfig,ComisionConfigConstantesFunciones.LABEL_ID));

		if(this.comisionconfigConstantesFunciones.mostraridComisionConfig && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComisionConfigConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.comisionconfigConstantesFunciones.resaltaridComisionConfig,this.comisionconfigConstantesFunciones.activaridComisionConfig,this,true,"idComisionConfig","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comisionconfigConstantesFunciones.resaltaridComisionConfig,this.comisionconfigConstantesFunciones.activaridComisionConfig,this,true,"idComisionConfig","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComisionConfig.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionConfig,ComisionConfigConstantesFunciones.LABEL_IDEMPRESA));

		if(this.comisionconfigConstantesFunciones.mostrarid_empresaComisionConfig && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComisionConfigConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.comisionconfigConstantesFunciones.resaltarid_empresaComisionConfig,this,this.comisionconfigConstantesFunciones.activarid_empresaComisionConfig));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.comisionconfigConstantesFunciones.resaltarid_empresaComisionConfig,this,this.comisionconfigConstantesFunciones.activarid_empresaComisionConfig,false,"id_empresaComisionConfig","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ComisionConfigPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComisionConfig.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionConfig,ComisionConfigConstantesFunciones.LABEL_IDTIPOCOMISIONCONFIG));

		if(this.comisionconfigConstantesFunciones.mostrarid_tipo_comision_configComisionConfig && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComisionConfigConstantesFunciones.LABEL_IDTIPOCOMISIONCONFIG,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoComisionConfigTableCell(this.tipocomisionconfigsForeignKey,this.comisionconfigConstantesFunciones.resaltarid_tipo_comision_configComisionConfig,this,this.comisionconfigConstantesFunciones.activarid_tipo_comision_configComisionConfig));
			tableColumn.setCellEditor(new TipoComisionConfigTableCell(this.tipocomisionconfigsForeignKey,this.comisionconfigConstantesFunciones.resaltarid_tipo_comision_configComisionConfig,this,this.comisionconfigConstantesFunciones.activarid_tipo_comision_configComisionConfig,true,"id_tipo_comision_configComisionConfig","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ComisionConfigPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComisionConfig.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionConfig,ComisionConfigConstantesFunciones.LABEL_IDNIVELLINEA));

		if(this.comisionconfigConstantesFunciones.mostrarid_nivel_lineaComisionConfig && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComisionConfigConstantesFunciones.LABEL_IDNIVELLINEA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new NivelLineaTableCell(this.nivellineasForeignKey,this.comisionconfigConstantesFunciones.resaltarid_nivel_lineaComisionConfig,this,this.comisionconfigConstantesFunciones.activarid_nivel_lineaComisionConfig));
			tableColumn.setCellEditor(new NivelLineaTableCell(this.nivellineasForeignKey,this.comisionconfigConstantesFunciones.resaltarid_nivel_lineaComisionConfig,this,this.comisionconfigConstantesFunciones.activarid_nivel_lineaComisionConfig,true,"id_nivel_lineaComisionConfig","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ComisionConfigPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComisionConfig.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionConfig,ComisionConfigConstantesFunciones.LABEL_CONVENDEDOR));

		if(this.comisionconfigConstantesFunciones.mostrarcon_vendedorComisionConfig && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComisionConfigConstantesFunciones.LABEL_CONVENDEDOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.comisionconfigConstantesFunciones.resaltarcon_vendedorComisionConfig,this.comisionconfigConstantesFunciones.activarcon_vendedorComisionConfig));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.comisionconfigConstantesFunciones.resaltarcon_vendedorComisionConfig,this.comisionconfigConstantesFunciones.activarcon_vendedorComisionConfig,this,true,"con_vendedorComisionConfig","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ComisionConfigPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComisionConfig.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionConfig,ComisionConfigConstantesFunciones.LABEL_CONVENTAS));

		if(this.comisionconfigConstantesFunciones.mostrarcon_ventasComisionConfig && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComisionConfigConstantesFunciones.LABEL_CONVENTAS,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.comisionconfigConstantesFunciones.resaltarcon_ventasComisionConfig,this.comisionconfigConstantesFunciones.activarcon_ventasComisionConfig));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.comisionconfigConstantesFunciones.resaltarcon_ventasComisionConfig,this.comisionconfigConstantesFunciones.activarcon_ventasComisionConfig,this,true,"con_ventasComisionConfig","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ComisionConfigPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComisionConfig.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionConfig,ComisionConfigConstantesFunciones.LABEL_CONCOBROS));

		if(this.comisionconfigConstantesFunciones.mostrarcon_cobrosComisionConfig && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComisionConfigConstantesFunciones.LABEL_CONCOBROS,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.comisionconfigConstantesFunciones.resaltarcon_cobrosComisionConfig,this.comisionconfigConstantesFunciones.activarcon_cobrosComisionConfig));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.comisionconfigConstantesFunciones.resaltarcon_cobrosComisionConfig,this.comisionconfigConstantesFunciones.activarcon_cobrosComisionConfig,this,true,"con_cobrosComisionConfig","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ComisionConfigPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComisionConfig.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionConfig,ComisionConfigConstantesFunciones.LABEL_CONREMESATRANSITO));

		if(this.comisionconfigConstantesFunciones.mostrarcon_remesa_transitoComisionConfig && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComisionConfigConstantesFunciones.LABEL_CONREMESATRANSITO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.comisionconfigConstantesFunciones.resaltarcon_remesa_transitoComisionConfig,this.comisionconfigConstantesFunciones.activarcon_remesa_transitoComisionConfig));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.comisionconfigConstantesFunciones.resaltarcon_remesa_transitoComisionConfig,this.comisionconfigConstantesFunciones.activarcon_remesa_transitoComisionConfig,this,true,"con_remesa_transitoComisionConfig","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ComisionConfigPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComisionConfig.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionConfig,ComisionConfigConstantesFunciones.LABEL_CONPENALIDAD));

		if(this.comisionconfigConstantesFunciones.mostrarcon_penalidadComisionConfig && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComisionConfigConstantesFunciones.LABEL_CONPENALIDAD,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.comisionconfigConstantesFunciones.resaltarcon_penalidadComisionConfig,this.comisionconfigConstantesFunciones.activarcon_penalidadComisionConfig));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.comisionconfigConstantesFunciones.resaltarcon_penalidadComisionConfig,this.comisionconfigConstantesFunciones.activarcon_penalidadComisionConfig,this,true,"con_penalidadComisionConfig","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ComisionConfigPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComisionConfig.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionConfig,ComisionConfigConstantesFunciones.LABEL_CONABONO));

		if(this.comisionconfigConstantesFunciones.mostrarcon_abonoComisionConfig && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComisionConfigConstantesFunciones.LABEL_CONABONO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.comisionconfigConstantesFunciones.resaltarcon_abonoComisionConfig,this.comisionconfigConstantesFunciones.activarcon_abonoComisionConfig));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.comisionconfigConstantesFunciones.resaltarcon_abonoComisionConfig,this.comisionconfigConstantesFunciones.activarcon_abonoComisionConfig,this,true,"con_abonoComisionConfig","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ComisionConfigPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.comisionconfigSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosComisionCate && this.comisionconfigConstantesFunciones.mostrarComisionCateComisionConfig && !ComisionConfigConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Comision Cates");
				tableColumn.setHeaderValue("Comision Cates");
				tableColumn.setCellRenderer(new ComisionCateTableCell(comisionconfigConstantesFunciones.resaltarComisionCateComisionConfig,this,this.comisionconfigConstantesFunciones.activarComisionCateComisionConfig));
				tableColumn.setCellEditor(new ComisionCateTableCell(comisionconfigConstantesFunciones.resaltarComisionCateComisionConfig,this,this.comisionconfigConstantesFunciones.activarComisionCateComisionConfig));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosComisionConfig.addColumn(tableColumn);
			}

			if(this.isTienePermisosComisionMarca && this.comisionconfigConstantesFunciones.mostrarComisionMarcaComisionConfig && !ComisionConfigConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Comision Marcas");
				tableColumn.setHeaderValue("Comision Marcas");
				tableColumn.setCellRenderer(new ComisionMarcaTableCell(comisionconfigConstantesFunciones.resaltarComisionMarcaComisionConfig,this,this.comisionconfigConstantesFunciones.activarComisionMarcaComisionConfig));
				tableColumn.setCellEditor(new ComisionMarcaTableCell(comisionconfigConstantesFunciones.resaltarComisionMarcaComisionConfig,this,this.comisionconfigConstantesFunciones.activarComisionMarcaComisionConfig));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosComisionConfig.addColumn(tableColumn);
			}

			if(this.isTienePermisosComisionLinea && this.comisionconfigConstantesFunciones.mostrarComisionLineaComisionConfig && !ComisionConfigConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Comision Lineas");
				tableColumn.setHeaderValue("Comision Lineas");
				tableColumn.setCellRenderer(new ComisionLineaTableCell(comisionconfigConstantesFunciones.resaltarComisionLineaComisionConfig,this,this.comisionconfigConstantesFunciones.activarComisionLineaComisionConfig));
				tableColumn.setCellEditor(new ComisionLineaTableCell(comisionconfigConstantesFunciones.resaltarComisionLineaComisionConfig,this,this.comisionconfigConstantesFunciones.activarComisionLineaComisionConfig));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosComisionConfig.addColumn(tableColumn);
			}

			if(this.isTienePermisosComisionPena && this.comisionconfigConstantesFunciones.mostrarComisionPenaComisionConfig && !ComisionConfigConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Penalidad Comisions");
				tableColumn.setHeaderValue("Penalidad Comisions");
				tableColumn.setCellRenderer(new ComisionPenaTableCell(comisionconfigConstantesFunciones.resaltarComisionPenaComisionConfig,this,this.comisionconfigConstantesFunciones.activarComisionPenaComisionConfig));
				tableColumn.setCellEditor(new ComisionPenaTableCell(comisionconfigConstantesFunciones.resaltarComisionPenaComisionConfig,this,this.comisionconfigConstantesFunciones.activarComisionPenaComisionConfig));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosComisionConfig.addColumn(tableColumn);
			}

			if(this.isTienePermisosComisionGrupo && this.comisionconfigConstantesFunciones.mostrarComisionGrupoComisionConfig && !ComisionConfigConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Comision Grupos");
				tableColumn.setHeaderValue("Comision Grupos");
				tableColumn.setCellRenderer(new ComisionGrupoTableCell(comisionconfigConstantesFunciones.resaltarComisionGrupoComisionConfig,this,this.comisionconfigConstantesFunciones.activarComisionGrupoComisionConfig));
				tableColumn.setCellEditor(new ComisionGrupoTableCell(comisionconfigConstantesFunciones.resaltarComisionGrupoComisionConfig,this,this.comisionconfigConstantesFunciones.activarComisionGrupoComisionConfig));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosComisionConfig.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.comisionconfigSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.comisionconfigSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosComisionConfig.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.comisionconfigSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.comisionconfigSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosComisionConfig.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarComisionConfig && this.isPermisoGuardarCambiosComisionConfig) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.comisionconfigSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.comisionconfigSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosComisionConfig.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.comisionconfigSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosComisionConfig.addColumn(tableColumn);
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
			
			this.jTableDatosComisionConfig.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarComisionConfig && this.isPermisoGuardarCambiosComisionConfig) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.comisionconfigSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarComisionConfig && this.isPermisoGuardarCambiosComisionConfig) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosComisionConfig.moveColumn(this.jTableDatosComisionConfig.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosComisionConfig.moveColumn(this.jTableDatosComisionConfig.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.comisionconfigSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosComisionConfig.moveColumn(this.jTableDatosComisionConfig.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosComisionConfig.moveColumn(this.jTableDatosComisionConfig.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosComisionConfig.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosComisionConfig.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosComisionConfig,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ComisionConfigJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosComisionConfig.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosComisionConfig.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ComisionConfigJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ComisionConfigJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosComisionConfig.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosComisionConfig.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosComisionConfig.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=comisionconfigLogic.getComisionConfigs().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=comisionconfigs.size()-1;
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
		//this.jTableDatosComisionConfig.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosComisionConfig.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosComisionConfig();
			
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
				
				//this.isEsNuevoComisionConfig=false;
					
				ComisionConfigBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.comisionconfig,new Object(),this.comisionconfigParameterGeneral,this.comisionconfigReturnGeneral);
			
				if(this.comisionconfigSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormComisionConfig==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosComisionConfig.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosComisionConfig.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionconfig =(ComisionConfig) this.comisionconfigLogic.getComisionConfigs().toArray()[this.jTableDatosComisionConfig.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comisionconfig =(ComisionConfig) this.comisionconfigs.toArray()[this.jTableDatosComisionConfig.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.comisionconfig.getsType().equals("DUPLICADO")
				   || this.comisionconfig.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoComisionConfig=true;
				
				} else {
					this.isEsNuevoComisionConfig=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.comisionconfigSessionBean.getEsGuardarRelacionado()) {
					if(this.comisionconfig.getId()>=0 && !this.comisionconfig.getIsNew()) {						
						this.isEsNuevoComisionConfig=false;
						
					} else {
						this.isEsNuevoComisionConfig=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoComisionConfig(esRelaciones);						
				
				this.seleccionarComisionConfig(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.comisionconfig.getId()<0) {
					this.isEsNuevoComisionConfig=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarComisionConfig(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarComisionConfig(evt,rowIndex);
				}	
				
				if(this.comisionconfigSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ComisionConfig: " + this.dDif); 
					}
				}								
				
				ComisionConfigBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.comisionconfig,new Object(),this.comisionconfigParameterGeneral,this.comisionconfigReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarComisionConfig(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.comisionconfig)) {
					if(this.comisionconfig.getId()>0) {
						this.comisionconfig.setIsDeleted(true);
						
						this.comisionconfigsEliminados.add(this.comisionconfig);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.comisionconfigLogic.getComisionConfigs().remove(this.comisionconfig);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.comisionconfigs.remove(this.comisionconfig);				
					}
					
					
					((ComisionConfigModel) this.jTableDatosComisionConfig.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaComisionConfig(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarComisionConfig(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoComisionConfig) {
			
			if(this.jInternalFrameDetalleFormComisionConfig==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosComisionConfig.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosComisionConfig.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionconfig =(ComisionConfig) this.comisionconfigLogic.getComisionConfigs().toArray()[this.jTableDatosComisionConfig.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comisionconfig =(ComisionConfig) this.comisionconfigs.toArray()[this.jTableDatosComisionConfig.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ComisionConfigJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioComisionConfig(this.comisionconfig);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.comisionconfigConstantesFunciones.cargarid_empresaComisionConfig || this.comisionconfigConstantesFunciones.event_dependid_empresaComisionConfig) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.comisionconfig.getid_empresa());
									//this.inicializarActualizarBindingComisionConfig(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(comisionconfig.getEmpresa()!=null) {
							this.empresasForeignKey.add(comisionconfig.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.comisionconfig.getid_empresa(),false,"Formulario");

					//TipoComisionConfig
					if(!this.comisionconfigConstantesFunciones.cargarid_tipo_comision_configComisionConfig || this.comisionconfigConstantesFunciones.event_dependid_tipo_comision_configComisionConfig) {
						//this.cargarCombosTipoComisionConfigsForeignKeyLista(" where id="+this.comisionconfig.getid_tipo_comision_config());
									//this.inicializarActualizarBindingComisionConfig(false,false);
						this.tipocomisionconfigsForeignKey=new ArrayList<TipoComisionConfig>();

						if(comisionconfig.getTipoComisionConfig()!=null) {
							this.tipocomisionconfigsForeignKey.add(comisionconfig.getTipoComisionConfig());
						}

						this.addItemDefectoCombosForeignKeyTipoComisionConfig();
						this.cargarCombosFrameTipoComisionConfigsForeignKey("Todos");
					}
					this.setActualTipoComisionConfigForeignKey(this.comisionconfig.getid_tipo_comision_config(),false,"Formulario");

					//NivelLinea
					if(!this.comisionconfigConstantesFunciones.cargarid_nivel_lineaComisionConfig || this.comisionconfigConstantesFunciones.event_dependid_nivel_lineaComisionConfig) {
						//this.cargarCombosNivelLineasForeignKeyLista(" where id="+this.comisionconfig.getid_nivel_linea());
									//this.inicializarActualizarBindingComisionConfig(false,false);
						this.nivellineasForeignKey=new ArrayList<NivelLinea>();

						if(comisionconfig.getNivelLinea()!=null) {
							this.nivellineasForeignKey.add(comisionconfig.getNivelLinea());
						}

						this.addItemDefectoCombosForeignKeyNivelLinea();
						this.cargarCombosFrameNivelLineasForeignKey("Todos");
					}
					this.setActualNivelLineaForeignKey(this.comisionconfig.getid_nivel_linea(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesComisionConfig("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesComisionConfig(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualComisionConfig() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoComisionConfig(ComisionConfig comisionconfig) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoComisionConfig(comisionconfig,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoComisionConfig(ComisionConfig comisionconfig,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioComisionConfig(comisionconfig);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyComisionConfig(comisionconfig,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyComisionConfig(comisionconfig);
	}
	
	public void setVariablesObjetoActualToFormularioComisionConfig(ComisionConfig comisionconfig) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormComisionConfig==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormComisionConfig.jLabelidComisionConfig.setText(comisionconfig.getId().toString());
			this.jInternalFrameDetalleFormComisionConfig.jCheckBoxcon_vendedorComisionConfig.setSelected(comisionconfig.getcon_vendedor());
			this.jInternalFrameDetalleFormComisionConfig.jCheckBoxcon_ventasComisionConfig.setSelected(comisionconfig.getcon_ventas());
			this.jInternalFrameDetalleFormComisionConfig.jCheckBoxcon_cobrosComisionConfig.setSelected(comisionconfig.getcon_cobros());
			this.jInternalFrameDetalleFormComisionConfig.jCheckBoxcon_remesa_transitoComisionConfig.setSelected(comisionconfig.getcon_remesa_transito());
			this.jInternalFrameDetalleFormComisionConfig.jCheckBoxcon_penalidadComisionConfig.setSelected(comisionconfig.getcon_penalidad());
			this.jInternalFrameDetalleFormComisionConfig.jCheckBoxcon_abonoComisionConfig.setSelected(comisionconfig.getcon_abono());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ComisionConfig comisionconfigLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,comisionconfigLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ComisionConfig comisionconfigLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				comisionconfigLocal=this.comisionconfig;
			} else {
				comisionconfigLocal=this.comisionconfigAnterior;
			}
		}
		
		if(this.permiteMantenimiento(comisionconfigLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoComisionConfig(comisionconfigLocal,true);
					
					if(comisionconfigSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(comisionconfigLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.comisionconfigSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(comisionconfigLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoComisionConfig(ComisionConfig comisionconfig,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualComisionConfig(comisionconfig,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysComisionConfig(comisionconfig);
	}
	
	public void setVariablesFormularioToObjetoActualComisionConfig(ComisionConfig comisionconfig,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualComisionConfig(comisionconfig,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualComisionConfig(ComisionConfig comisionconfig,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormComisionConfig==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormComisionConfig.jLabelidComisionConfig.getText()==null || this.jInternalFrameDetalleFormComisionConfig.jLabelidComisionConfig.getText()=="" || this.jInternalFrameDetalleFormComisionConfig.jLabelidComisionConfig.getText()=="Id") {
				this.jInternalFrameDetalleFormComisionConfig.jLabelidComisionConfig.setText("0");
			}

			if(conColumnasBase) {comisionconfig.setId(Long.parseLong(this.jInternalFrameDetalleFormComisionConfig.jLabelidComisionConfig.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComisionConfigConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisionConfig.jLabelIdComisionConfig,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comisionconfig.setcon_vendedor(this.jInternalFrameDetalleFormComisionConfig.jCheckBoxcon_vendedorComisionConfig.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComisionConfigConstantesFunciones.LABEL_CONVENDEDOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisionConfig.jLabelcon_vendedorComisionConfig,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comisionconfig.setcon_ventas(this.jInternalFrameDetalleFormComisionConfig.jCheckBoxcon_ventasComisionConfig.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComisionConfigConstantesFunciones.LABEL_CONVENTAS+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisionConfig.jLabelcon_ventasComisionConfig,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comisionconfig.setcon_cobros(this.jInternalFrameDetalleFormComisionConfig.jCheckBoxcon_cobrosComisionConfig.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComisionConfigConstantesFunciones.LABEL_CONCOBROS+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisionConfig.jLabelcon_cobrosComisionConfig,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comisionconfig.setcon_remesa_transito(this.jInternalFrameDetalleFormComisionConfig.jCheckBoxcon_remesa_transitoComisionConfig.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComisionConfigConstantesFunciones.LABEL_CONREMESATRANSITO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisionConfig.jLabelcon_remesa_transitoComisionConfig,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comisionconfig.setcon_penalidad(this.jInternalFrameDetalleFormComisionConfig.jCheckBoxcon_penalidadComisionConfig.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComisionConfigConstantesFunciones.LABEL_CONPENALIDAD+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisionConfig.jLabelcon_penalidadComisionConfig,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comisionconfig.setcon_abono(this.jInternalFrameDetalleFormComisionConfig.jCheckBoxcon_abonoComisionConfig.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComisionConfigConstantesFunciones.LABEL_CONABONO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisionConfig.jLabelcon_abonoComisionConfig,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualComisionConfig(ComisionConfig comisionconfigBean,ComisionConfig comisionconfig,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && comisionconfigBean.getid_tipo_comision_config()!=null && !comisionconfigBean.getid_tipo_comision_config().equals(-1L))) {comisionconfig.setid_tipo_comision_config(comisionconfigBean.getid_tipo_comision_config());}
			if(conDefault || (!conDefault && comisionconfigBean.getid_nivel_linea()!=null && !comisionconfigBean.getid_nivel_linea().equals(-1L))) {comisionconfig.setid_nivel_linea(comisionconfigBean.getid_nivel_linea());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosComisionConfig(ComisionConfig comisionconfigOrigen,ComisionConfig comisionconfig,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && comisionconfigOrigen.getId()!=null && !comisionconfigOrigen.getId().equals(0L))) {comisionconfig.setId(comisionconfigOrigen.getId());}}
			if(conDefault || (!conDefault && comisionconfigOrigen.getid_tipo_comision_config()!=null && !comisionconfigOrigen.getid_tipo_comision_config().equals(-1L))) {comisionconfig.setid_tipo_comision_config(comisionconfigOrigen.getid_tipo_comision_config());}
			if(conDefault || (!conDefault && comisionconfigOrigen.getid_nivel_linea()!=null && !comisionconfigOrigen.getid_nivel_linea().equals(-1L))) {comisionconfig.setid_nivel_linea(comisionconfigOrigen.getid_nivel_linea());}
			if(conDefault || (!conDefault && comisionconfigOrigen.getcon_vendedor()!=null && !comisionconfigOrigen.getcon_vendedor().equals(false))) {comisionconfig.setcon_vendedor(comisionconfigOrigen.getcon_vendedor());}
			if(conDefault || (!conDefault && comisionconfigOrigen.getcon_ventas()!=null && !comisionconfigOrigen.getcon_ventas().equals(false))) {comisionconfig.setcon_ventas(comisionconfigOrigen.getcon_ventas());}
			if(conDefault || (!conDefault && comisionconfigOrigen.getcon_cobros()!=null && !comisionconfigOrigen.getcon_cobros().equals(false))) {comisionconfig.setcon_cobros(comisionconfigOrigen.getcon_cobros());}
			if(conDefault || (!conDefault && comisionconfigOrigen.getcon_remesa_transito()!=null && !comisionconfigOrigen.getcon_remesa_transito().equals(false))) {comisionconfig.setcon_remesa_transito(comisionconfigOrigen.getcon_remesa_transito());}
			if(conDefault || (!conDefault && comisionconfigOrigen.getcon_penalidad()!=null && !comisionconfigOrigen.getcon_penalidad().equals(false))) {comisionconfig.setcon_penalidad(comisionconfigOrigen.getcon_penalidad());}
			if(conDefault || (!conDefault && comisionconfigOrigen.getcon_abono()!=null && !comisionconfigOrigen.getcon_abono().equals(false))) {comisionconfig.setcon_abono(comisionconfigOrigen.getcon_abono());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioComisionConfig(ComisionConfig comisionconfig) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormComisionConfig.jLabelidComisionConfig.setText(comisionconfig.getId().toString());
			this.jInternalFrameDetalleFormComisionConfig.jCheckBoxcon_vendedorComisionConfig.setSelected(comisionconfig.getcon_vendedor());
			this.jInternalFrameDetalleFormComisionConfig.jCheckBoxcon_ventasComisionConfig.setSelected(comisionconfig.getcon_ventas());
			this.jInternalFrameDetalleFormComisionConfig.jCheckBoxcon_cobrosComisionConfig.setSelected(comisionconfig.getcon_cobros());
			this.jInternalFrameDetalleFormComisionConfig.jCheckBoxcon_remesa_transitoComisionConfig.setSelected(comisionconfig.getcon_remesa_transito());
			this.jInternalFrameDetalleFormComisionConfig.jCheckBoxcon_penalidadComisionConfig.setSelected(comisionconfig.getcon_penalidad());
			this.jInternalFrameDetalleFormComisionConfig.jCheckBoxcon_abonoComisionConfig.setSelected(comisionconfig.getcon_abono());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioComisionConfig(ComisionConfigBean comisionconfigBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormComisionConfig.jLabelidComisionConfig.setText(comisionconfigBean.getId().toString());
			this.jInternalFrameDetalleFormComisionConfig.jCheckBoxcon_vendedorComisionConfig.setSelected(comisionconfigBean.getcon_vendedor());
			this.jInternalFrameDetalleFormComisionConfig.jCheckBoxcon_ventasComisionConfig.setSelected(comisionconfigBean.getcon_ventas());
			this.jInternalFrameDetalleFormComisionConfig.jCheckBoxcon_cobrosComisionConfig.setSelected(comisionconfigBean.getcon_cobros());
			this.jInternalFrameDetalleFormComisionConfig.jCheckBoxcon_remesa_transitoComisionConfig.setSelected(comisionconfigBean.getcon_remesa_transito());
			this.jInternalFrameDetalleFormComisionConfig.jCheckBoxcon_penalidadComisionConfig.setSelected(comisionconfigBean.getcon_penalidad());
			this.jInternalFrameDetalleFormComisionConfig.jCheckBoxcon_abonoComisionConfig.setSelected(comisionconfigBean.getcon_abono());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanComisionConfig(ComisionConfigParameterReturnGeneral comisionconfigReturnGeneral,ComisionConfigBean comisionconfigBean,Boolean conDefault) throws Exception { 
		try {
			ComisionConfig comisionconfigLocal=new ComisionConfig();
			
			comisionconfigLocal=comisionconfigReturnGeneral.getComisionConfig();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && comisionconfigLocal.getId()!=null && !comisionconfigLocal.getId().equals(0L))) {comisionconfigBean.setId(comisionconfigLocal.getId());}}
			if(conDefault || (!conDefault && comisionconfigLocal.getid_tipo_comision_config()!=null && !comisionconfigLocal.getid_tipo_comision_config().equals(-1L))) {comisionconfigBean.setid_tipo_comision_config(comisionconfigLocal.getid_tipo_comision_config());}
			if(conDefault || (!conDefault && comisionconfigLocal.getid_nivel_linea()!=null && !comisionconfigLocal.getid_nivel_linea().equals(-1L))) {comisionconfigBean.setid_nivel_linea(comisionconfigLocal.getid_nivel_linea());}
			if(conDefault || (!conDefault && comisionconfigLocal.getcon_vendedor()!=null && !comisionconfigLocal.getcon_vendedor().equals(false))) {comisionconfigBean.setcon_vendedor(comisionconfigLocal.getcon_vendedor());}
			if(conDefault || (!conDefault && comisionconfigLocal.getcon_ventas()!=null && !comisionconfigLocal.getcon_ventas().equals(false))) {comisionconfigBean.setcon_ventas(comisionconfigLocal.getcon_ventas());}
			if(conDefault || (!conDefault && comisionconfigLocal.getcon_cobros()!=null && !comisionconfigLocal.getcon_cobros().equals(false))) {comisionconfigBean.setcon_cobros(comisionconfigLocal.getcon_cobros());}
			if(conDefault || (!conDefault && comisionconfigLocal.getcon_remesa_transito()!=null && !comisionconfigLocal.getcon_remesa_transito().equals(false))) {comisionconfigBean.setcon_remesa_transito(comisionconfigLocal.getcon_remesa_transito());}
			if(conDefault || (!conDefault && comisionconfigLocal.getcon_penalidad()!=null && !comisionconfigLocal.getcon_penalidad().equals(false))) {comisionconfigBean.setcon_penalidad(comisionconfigLocal.getcon_penalidad());}
			if(conDefault || (!conDefault && comisionconfigLocal.getcon_abono()!=null && !comisionconfigLocal.getcon_abono().equals(false))) {comisionconfigBean.setcon_abono(comisionconfigLocal.getcon_abono());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxComisionConfigGenerico(Long idComisionConfigSeleccionado,JComboBox jComboBoxComisionConfig,List<ComisionConfig> comisionconfigsLocal)throws Exception {
		try {
			ComisionConfig  comisionconfigTemp=null;

			for(ComisionConfig comisionconfigAux:comisionconfigsLocal) {
				if(comisionconfigAux.getId()!=null && comisionconfigAux.getId().equals(idComisionConfigSeleccionado)) {
					comisionconfigTemp=comisionconfigAux;
					break;
				}
			}

			jComboBoxComisionConfig.setSelectedItem(comisionconfigTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxComisionConfigGenerico(JComboBox jComboBoxComisionConfig,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxComisionConfig.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxComisionConfig.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxComisionConfig.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxComisionConfig.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxComisionConfig.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxComisionConfig.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxComisionConfig.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxComisionConfig.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxComisionConfig.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxComisionConfig.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("ComisionCate")) {
			jButtonComisionCateActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("ComisionMarca")) {
			jButtonComisionMarcaActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("ComisionLinea")) {
			jButtonComisionLineaActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("ComisionPena")) {
			jButtonComisionPenaActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("ComisionGrupo")) {
			jButtonComisionGrupoActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			comisionconfig=(ComisionConfig) comisionconfigLogic.getComisionConfigs().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			comisionconfig =(ComisionConfig) comisionconfigs.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!comisionconfig.getIsNew() && !comisionconfig.getIsChanged() && !comisionconfig.getIsDeleted()) {
				sDescripcion=comisionconfig.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=comisionconfig.getempresa_descripcion();
			}
		}

		if(sTipo.equals("TipoComisionConfig")) {
			//sDescripcion=this.getActualTipoComisionConfigForeignKeyDescripcion((Long)value);
			if(!comisionconfig.getIsNew() && !comisionconfig.getIsChanged() && !comisionconfig.getIsDeleted()) {
				sDescripcion=comisionconfig.gettipocomisionconfig_descripcion();
			} else {
				//sDescripcion=this.getActualTipoComisionConfigForeignKeyDescripcion((Long)value);
				sDescripcion=comisionconfig.gettipocomisionconfig_descripcion();
			}
		}

		if(sTipo.equals("NivelLinea")) {
			//sDescripcion=this.getActualNivelLineaForeignKeyDescripcion((Long)value);
			if(!comisionconfig.getIsNew() && !comisionconfig.getIsChanged() && !comisionconfig.getIsDeleted()) {
				sDescripcion=comisionconfig.getnivellinea_descripcion();
			} else {
				//sDescripcion=this.getActualNivelLineaForeignKeyDescripcion((Long)value);
				sDescripcion=comisionconfig.getnivellinea_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ComisionConfig comisionconfigRow=new ComisionConfig();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			comisionconfigRow=(ComisionConfig) comisionconfigLogic.getComisionConfigs().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			comisionconfigRow=(ComisionConfig) comisionconfigs.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonComisionCateActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,ComisionConfig comisionconfig) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormComisionConfig==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionconfigLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comisionconfig = (ComisionConfig)this.comisionconfigLogic.getComisionConfigs().toArray()[this.jTableDatosComisionConfig.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.comisionconfig = (ComisionConfig)this.comisionconfigs.toArray()[this.jTableDatosComisionConfig.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(comisionconfig!=null) {
						this.comisionconfig = comisionconfig;
					} else {
						this.comisionconfig = new ComisionConfig();
					}
				}

				if(this.isTienePermisosComisionCate && this.permiteMantenimiento(this.comisionconfig)) {
					ComisionCateBeanSwingJInternalFrame comisioncateBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFramePopup=new ComisionCateBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						comisioncateBeanSwingJInternalFrame=this.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFramePopup;
					} else {
						comisioncateBeanSwingJInternalFrame=this.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame;
					}

					List<ComisionConfig> comisionconfigs=new ArrayList<ComisionConfig>();
					comisionconfigs.add(this.comisionconfig);
					if(!esRelacionado) {
						//comisioncateBeanSwingJInternalFrame.comisioncateSessionBean.setConGuardarRelaciones(false);
						//comisioncateBeanSwingJInternalFrame.comisioncateSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					comisioncateBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormComisionConfig.cargarComisionCateBeanSwingJInternalFrame(comisionconfigs,this.comisionconfig,comisioncateBeanSwingJInternalFrame,/*conInicializar,*/comisioncateBeanSwingJInternalFrame.comisioncateSessionBean.getConGuardarRelaciones(),comisioncateBeanSwingJInternalFrame.comisioncateSessionBean.getEsGuardarRelacionado());
					comisioncateBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						comisioncateBeanSwingJInternalFrame.actualizarEstadoPanelsComisionCate("no_relacionado");

						comisioncateBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ComisionCateConstantesFunciones.ITAMANIOFILATABLA + (ComisionCateConstantesFunciones.ITAMANIOFILATABLA/2));

						comisioncateBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderComisionConfig=(TitledBorder)this.jScrollPanelDatosComisionConfig.getBorder();
						TitledBorder titledBorderComisionCate=(TitledBorder)comisioncateBeanSwingJInternalFrame.jScrollPanelDatosComisionCate.getBorder();

						titledBorderComisionCate.setTitle(titledBorderComisionConfig.getTitle() + " -> Comision Cate");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,comisioncateBeanSwingJInternalFrame);
						}

						comisioncateBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(comisioncateBeanSwingJInternalFrame);

						comisioncateBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.comisionconfigSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Comision Cate",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionconfigLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionconfigLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionconfigLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonComisionMarcaActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,ComisionConfig comisionconfig) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormComisionConfig==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionconfigLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comisionconfig = (ComisionConfig)this.comisionconfigLogic.getComisionConfigs().toArray()[this.jTableDatosComisionConfig.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.comisionconfig = (ComisionConfig)this.comisionconfigs.toArray()[this.jTableDatosComisionConfig.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(comisionconfig!=null) {
						this.comisionconfig = comisionconfig;
					} else {
						this.comisionconfig = new ComisionConfig();
					}
				}

				if(this.isTienePermisosComisionMarca && this.permiteMantenimiento(this.comisionconfig)) {
					ComisionMarcaBeanSwingJInternalFrame comisionmarcaBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFramePopup=new ComisionMarcaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						comisionmarcaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFramePopup;
					} else {
						comisionmarcaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame;
					}

					List<ComisionConfig> comisionconfigs=new ArrayList<ComisionConfig>();
					comisionconfigs.add(this.comisionconfig);
					if(!esRelacionado) {
						//comisionmarcaBeanSwingJInternalFrame.comisionmarcaSessionBean.setConGuardarRelaciones(false);
						//comisionmarcaBeanSwingJInternalFrame.comisionmarcaSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					comisionmarcaBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormComisionConfig.cargarComisionMarcaBeanSwingJInternalFrame(comisionconfigs,this.comisionconfig,comisionmarcaBeanSwingJInternalFrame,/*conInicializar,*/comisionmarcaBeanSwingJInternalFrame.comisionmarcaSessionBean.getConGuardarRelaciones(),comisionmarcaBeanSwingJInternalFrame.comisionmarcaSessionBean.getEsGuardarRelacionado());
					comisionmarcaBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						comisionmarcaBeanSwingJInternalFrame.actualizarEstadoPanelsComisionMarca("no_relacionado");

						comisionmarcaBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ComisionMarcaConstantesFunciones.ITAMANIOFILATABLA + (ComisionMarcaConstantesFunciones.ITAMANIOFILATABLA/2));

						comisionmarcaBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderComisionConfig=(TitledBorder)this.jScrollPanelDatosComisionConfig.getBorder();
						TitledBorder titledBorderComisionMarca=(TitledBorder)comisionmarcaBeanSwingJInternalFrame.jScrollPanelDatosComisionMarca.getBorder();

						titledBorderComisionMarca.setTitle(titledBorderComisionConfig.getTitle() + " -> Comision Marca");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,comisionmarcaBeanSwingJInternalFrame);
						}

						comisionmarcaBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(comisionmarcaBeanSwingJInternalFrame);

						comisionmarcaBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.comisionconfigSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Comision Marca",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionconfigLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionconfigLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionconfigLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonComisionLineaActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,ComisionConfig comisionconfig) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormComisionConfig==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionconfigLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comisionconfig = (ComisionConfig)this.comisionconfigLogic.getComisionConfigs().toArray()[this.jTableDatosComisionConfig.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.comisionconfig = (ComisionConfig)this.comisionconfigs.toArray()[this.jTableDatosComisionConfig.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(comisionconfig!=null) {
						this.comisionconfig = comisionconfig;
					} else {
						this.comisionconfig = new ComisionConfig();
					}
				}

				if(this.isTienePermisosComisionLinea && this.permiteMantenimiento(this.comisionconfig)) {
					ComisionLineaBeanSwingJInternalFrame comisionlineaBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFramePopup=new ComisionLineaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						comisionlineaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFramePopup;
					} else {
						comisionlineaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame;
					}

					List<ComisionConfig> comisionconfigs=new ArrayList<ComisionConfig>();
					comisionconfigs.add(this.comisionconfig);
					if(!esRelacionado) {
						//comisionlineaBeanSwingJInternalFrame.comisionlineaSessionBean.setConGuardarRelaciones(false);
						//comisionlineaBeanSwingJInternalFrame.comisionlineaSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					comisionlineaBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormComisionConfig.cargarComisionLineaBeanSwingJInternalFrame(comisionconfigs,this.comisionconfig,comisionlineaBeanSwingJInternalFrame,/*conInicializar,*/comisionlineaBeanSwingJInternalFrame.comisionlineaSessionBean.getConGuardarRelaciones(),comisionlineaBeanSwingJInternalFrame.comisionlineaSessionBean.getEsGuardarRelacionado());
					comisionlineaBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						comisionlineaBeanSwingJInternalFrame.actualizarEstadoPanelsComisionLinea("no_relacionado");

						comisionlineaBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ComisionLineaConstantesFunciones.ITAMANIOFILATABLA + (ComisionLineaConstantesFunciones.ITAMANIOFILATABLA/2));

						comisionlineaBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderComisionConfig=(TitledBorder)this.jScrollPanelDatosComisionConfig.getBorder();
						TitledBorder titledBorderComisionLinea=(TitledBorder)comisionlineaBeanSwingJInternalFrame.jScrollPanelDatosComisionLinea.getBorder();

						titledBorderComisionLinea.setTitle(titledBorderComisionConfig.getTitle() + " -> Comision Linea");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,comisionlineaBeanSwingJInternalFrame);
						}

						comisionlineaBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(comisionlineaBeanSwingJInternalFrame);

						comisionlineaBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.comisionconfigSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Comision Linea",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionconfigLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionconfigLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionconfigLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonComisionPenaActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,ComisionConfig comisionconfig) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormComisionConfig==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionconfigLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comisionconfig = (ComisionConfig)this.comisionconfigLogic.getComisionConfigs().toArray()[this.jTableDatosComisionConfig.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.comisionconfig = (ComisionConfig)this.comisionconfigs.toArray()[this.jTableDatosComisionConfig.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(comisionconfig!=null) {
						this.comisionconfig = comisionconfig;
					} else {
						this.comisionconfig = new ComisionConfig();
					}
				}

				if(this.isTienePermisosComisionPena && this.permiteMantenimiento(this.comisionconfig)) {
					ComisionPenaBeanSwingJInternalFrame comisionpenaBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFramePopup=new ComisionPenaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						comisionpenaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFramePopup;
					} else {
						comisionpenaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame;
					}

					List<ComisionConfig> comisionconfigs=new ArrayList<ComisionConfig>();
					comisionconfigs.add(this.comisionconfig);
					if(!esRelacionado) {
						//comisionpenaBeanSwingJInternalFrame.comisionpenaSessionBean.setConGuardarRelaciones(false);
						//comisionpenaBeanSwingJInternalFrame.comisionpenaSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					comisionpenaBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormComisionConfig.cargarComisionPenaBeanSwingJInternalFrame(comisionconfigs,this.comisionconfig,comisionpenaBeanSwingJInternalFrame,/*conInicializar,*/comisionpenaBeanSwingJInternalFrame.comisionpenaSessionBean.getConGuardarRelaciones(),comisionpenaBeanSwingJInternalFrame.comisionpenaSessionBean.getEsGuardarRelacionado());
					comisionpenaBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						comisionpenaBeanSwingJInternalFrame.actualizarEstadoPanelsComisionPena("no_relacionado");

						comisionpenaBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ComisionPenaConstantesFunciones.ITAMANIOFILATABLA + (ComisionPenaConstantesFunciones.ITAMANIOFILATABLA/2));

						comisionpenaBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderComisionConfig=(TitledBorder)this.jScrollPanelDatosComisionConfig.getBorder();
						TitledBorder titledBorderComisionPena=(TitledBorder)comisionpenaBeanSwingJInternalFrame.jScrollPanelDatosComisionPena.getBorder();

						titledBorderComisionPena.setTitle(titledBorderComisionConfig.getTitle() + " -> Penalidad Comision");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,comisionpenaBeanSwingJInternalFrame);
						}

						comisionpenaBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(comisionpenaBeanSwingJInternalFrame);

						comisionpenaBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.comisionconfigSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Penalidad Comision",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionconfigLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionconfigLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionconfigLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonComisionGrupoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,ComisionConfig comisionconfig) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormComisionConfig==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionconfigLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comisionconfig = (ComisionConfig)this.comisionconfigLogic.getComisionConfigs().toArray()[this.jTableDatosComisionConfig.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.comisionconfig = (ComisionConfig)this.comisionconfigs.toArray()[this.jTableDatosComisionConfig.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(comisionconfig!=null) {
						this.comisionconfig = comisionconfig;
					} else {
						this.comisionconfig = new ComisionConfig();
					}
				}

				if(this.isTienePermisosComisionGrupo && this.permiteMantenimiento(this.comisionconfig)) {
					ComisionGrupoBeanSwingJInternalFrame comisiongrupoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFramePopup=new ComisionGrupoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						comisiongrupoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFramePopup;
					} else {
						comisiongrupoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame;
					}

					List<ComisionConfig> comisionconfigs=new ArrayList<ComisionConfig>();
					comisionconfigs.add(this.comisionconfig);
					if(!esRelacionado) {
						//comisiongrupoBeanSwingJInternalFrame.comisiongrupoSessionBean.setConGuardarRelaciones(false);
						//comisiongrupoBeanSwingJInternalFrame.comisiongrupoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					comisiongrupoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormComisionConfig.cargarComisionGrupoBeanSwingJInternalFrame(comisionconfigs,this.comisionconfig,comisiongrupoBeanSwingJInternalFrame,/*conInicializar,*/comisiongrupoBeanSwingJInternalFrame.comisiongrupoSessionBean.getConGuardarRelaciones(),comisiongrupoBeanSwingJInternalFrame.comisiongrupoSessionBean.getEsGuardarRelacionado());
					comisiongrupoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						comisiongrupoBeanSwingJInternalFrame.actualizarEstadoPanelsComisionGrupo("no_relacionado");

						comisiongrupoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ComisionGrupoConstantesFunciones.ITAMANIOFILATABLA + (ComisionGrupoConstantesFunciones.ITAMANIOFILATABLA/2));

						comisiongrupoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderComisionConfig=(TitledBorder)this.jScrollPanelDatosComisionConfig.getBorder();
						TitledBorder titledBorderComisionGrupo=(TitledBorder)comisiongrupoBeanSwingJInternalFrame.jScrollPanelDatosComisionGrupo.getBorder();

						titledBorderComisionGrupo.setTitle(titledBorderComisionConfig.getTitle() + " -> Comision Grupo");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,comisiongrupoBeanSwingJInternalFrame);
						}

						comisiongrupoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(comisiongrupoBeanSwingJInternalFrame);

						comisiongrupoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.comisionconfigSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Comision Grupo",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionconfigLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionconfigLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionconfigLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualComisionConfig(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoComisionConfig.setVisible((this.isVisibilidadCeldaNuevoComisionConfig && this.isPermisoNuevoComisionConfig));			
			this.jButtonDuplicarComisionConfig.setVisible((this.isVisibilidadCeldaDuplicarComisionConfig && this.isPermisoDuplicarComisionConfig));			
			this.jButtonCopiarComisionConfig.setVisible((this.isVisibilidadCeldaCopiarComisionConfig && this.isPermisoCopiarComisionConfig));
			this.jButtonVerFormComisionConfig.setVisible((this.isVisibilidadCeldaVerFormComisionConfig && this.isPermisoVerFormComisionConfig));
			
			this.jButtonAbrirOrderByComisionConfig.setVisible((this.isVisibilidadCeldaOrdenComisionConfig && this.isPermisoOrdenComisionConfig));			
			
			this.jButtonNuevoRelacionesComisionConfig.setVisible((this.isVisibilidadCeldaNuevoRelacionesComisionConfig && this.isPermisoNuevoComisionConfig));			
			this.jButtonNuevoGuardarCambiosComisionConfig.setVisible((this.isVisibilidadCeldaNuevoComisionConfig && this.isPermisoNuevoComisionConfig && this.isPermisoGuardarCambiosComisionConfig));
			
			if(this.jInternalFrameDetalleFormComisionConfig!=null) {
			this.jInternalFrameDetalleFormComisionConfig.jButtonModificarComisionConfig.setVisible((this.isVisibilidadCeldaModificarComisionConfig && this.isPermisoActualizarComisionConfig));	
			this.jInternalFrameDetalleFormComisionConfig.jButtonActualizarComisionConfig.setVisible((this.isVisibilidadCeldaActualizarComisionConfig && this.isPermisoActualizarComisionConfig));	
			this.jInternalFrameDetalleFormComisionConfig.jButtonEliminarComisionConfig.setVisible((this.isVisibilidadCeldaEliminarComisionConfig && this.isPermisoEliminarComisionConfig));
			this.jInternalFrameDetalleFormComisionConfig.jButtonCancelarComisionConfig.setVisible(this.isVisibilidadCeldaCancelarComisionConfig);							
			this.jInternalFrameDetalleFormComisionConfig.jButtonGuardarCambiosComisionConfig.setVisible((this.isVisibilidadCeldaGuardarComisionConfig && this.isPermisoGuardarCambiosComisionConfig));			
			
			}
						
			this.jButtonGuardarCambiosTablaComisionConfig.setVisible((this.isVisibilidadCeldaGuardarCambiosComisionConfig && this.isPermisoGuardarCambiosComisionConfig));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarComisionConfig.setVisible((this.isVisibilidadCeldaNuevoComisionConfig && this.isPermisoNuevoComisionConfig));						
			this.jButtonDuplicarToolBarComisionConfig.setVisible((this.isVisibilidadCeldaDuplicarComisionConfig && this.isPermisoDuplicarComisionConfig));						
			this.jButtonCopiarToolBarComisionConfig.setVisible((this.isVisibilidadCeldaCopiarComisionConfig && this.isPermisoCopiarComisionConfig));			
			this.jButtonVerFormToolBarComisionConfig.setVisible((this.isVisibilidadCeldaVerFormComisionConfig && this.isPermisoVerFormComisionConfig));			
			this.jButtonAbrirOrderByToolBarComisionConfig.setVisible((this.isVisibilidadCeldaOrdenComisionConfig && this.isPermisoOrdenComisionConfig));
			this.jButtonNuevoRelacionesToolBarComisionConfig.setVisible((this.isVisibilidadCeldaNuevoRelacionesComisionConfig && this.isPermisoNuevoComisionConfig));			
			this.jButtonNuevoGuardarCambiosToolBarComisionConfig.setVisible((this.isVisibilidadCeldaNuevoComisionConfig && this.isPermisoNuevoComisionConfig && this.isPermisoGuardarCambiosComisionConfig));			
			
			if(this.jInternalFrameDetalleFormComisionConfig!=null) {
			this.jInternalFrameDetalleFormComisionConfig.jButtonModificarToolBarComisionConfig.setVisible((this.isVisibilidadCeldaModificarComisionConfig && this.isPermisoActualizarComisionConfig));	
			this.jInternalFrameDetalleFormComisionConfig.jButtonActualizarToolBarComisionConfig.setVisible((this.isVisibilidadCeldaActualizarComisionConfig  && this.isPermisoActualizarComisionConfig));	
			this.jInternalFrameDetalleFormComisionConfig.jButtonEliminarToolBarComisionConfig.setVisible((this.isVisibilidadCeldaEliminarComisionConfig && this.isPermisoEliminarComisionConfig));
			this.jInternalFrameDetalleFormComisionConfig.jButtonCancelarToolBarComisionConfig.setVisible(this.isVisibilidadCeldaCancelarComisionConfig);				
			this.jInternalFrameDetalleFormComisionConfig.jButtonGuardarCambiosToolBarComisionConfig.setVisible((this.isVisibilidadCeldaGuardarComisionConfig && this.isPermisoGuardarCambiosComisionConfig));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarComisionConfig.setVisible((this.isVisibilidadCeldaGuardarCambiosComisionConfig && this.isPermisoGuardarCambiosComisionConfig));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoComisionConfig.setVisible((this.isVisibilidadCeldaNuevoComisionConfig && this.isPermisoNuevoComisionConfig));			
			this.jMenuItemDuplicarComisionConfig.setVisible((this.isVisibilidadCeldaDuplicarComisionConfig && this.isPermisoDuplicarComisionConfig));			
			this.jMenuItemCopiarComisionConfig.setVisible((this.isVisibilidadCeldaCopiarComisionConfig && this.isPermisoCopiarComisionConfig));			
			this.jMenuItemVerFormComisionConfig.setVisible((this.isVisibilidadCeldaVerFormComisionConfig && this.isPermisoVerFormComisionConfig));			
			this.jMenuItemAbrirOrderByComisionConfig.setVisible((this.isVisibilidadCeldaOrdenComisionConfig && this.isPermisoOrdenComisionConfig));			
			//this.jMenuItemMostrarOcultarComisionConfig.setVisible((this.isVisibilidadCeldaOrdenComisionConfig && this.isPermisoOrdenComisionConfig));
			this.jMenuItemDetalleAbrirOrderByComisionConfig.setVisible((this.isVisibilidadCeldaOrdenComisionConfig && this.isPermisoOrdenComisionConfig));			
			//this.jMenuItemDetalleMostrarOcultarComisionConfig.setVisible((this.isVisibilidadCeldaOrdenComisionConfig && this.isPermisoOrdenComisionConfig));			
			this.jMenuItemNuevoRelacionesComisionConfig.setVisible((this.isVisibilidadCeldaNuevoRelacionesComisionConfig && this.isPermisoNuevoComisionConfig));			
			this.jMenuItemNuevoGuardarCambiosComisionConfig.setVisible((this.isVisibilidadCeldaNuevoComisionConfig && this.isPermisoNuevoComisionConfig && this.isPermisoGuardarCambiosComisionConfig));									
			
			if(this.jInternalFrameDetalleFormComisionConfig!=null) {
			this.jInternalFrameDetalleFormComisionConfig.jMenuItemModificarComisionConfig.setVisible((this.isVisibilidadCeldaModificarComisionConfig && this.isPermisoActualizarComisionConfig));	
			this.jInternalFrameDetalleFormComisionConfig.jMenuItemActualizarComisionConfig.setVisible((this.isVisibilidadCeldaActualizarComisionConfig && this.isPermisoActualizarComisionConfig));	
			this.jInternalFrameDetalleFormComisionConfig.jMenuItemEliminarComisionConfig.setVisible((this.isVisibilidadCeldaEliminarComisionConfig && this.isPermisoEliminarComisionConfig));
			this.jInternalFrameDetalleFormComisionConfig.jMenuItemCancelarComisionConfig.setVisible(this.isVisibilidadCeldaCancelarComisionConfig);				
			}
			
			this.jMenuItemGuardarCambiosComisionConfig.setVisible((this.isVisibilidadCeldaGuardarComisionConfig && this.isPermisoGuardarCambiosComisionConfig));						
			this.jMenuItemGuardarCambiosTablaComisionConfig.setVisible((this.isVisibilidadCeldaGuardarCambiosComisionConfig && this.isPermisoGuardarCambiosComisionConfig));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoComisionConfig=this.jButtonNuevoComisionConfig.isVisible();
			this.isVisibilidadCeldaDuplicarComisionConfig=this.jButtonDuplicarComisionConfig.isVisible();
			this.isVisibilidadCeldaCopiarComisionConfig=this.jButtonCopiarComisionConfig.isVisible();
			this.isVisibilidadCeldaVerFormComisionConfig=this.jButtonVerFormComisionConfig.isVisible();
			
			this.isVisibilidadCeldaOrdenComisionConfig=this.jButtonAbrirOrderByComisionConfig.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesComisionConfig=this.jButtonNuevoRelacionesComisionConfig.isVisible();
			this.isVisibilidadCeldaModificarComisionConfig=this.jButtonModificarComisionConfig.isVisible();
			
			if(this.jInternalFrameDetalleFormComisionConfig!=null) {
			this.isVisibilidadCeldaActualizarComisionConfig=this.jInternalFrameDetalleFormComisionConfig.jButtonActualizarComisionConfig.isVisible();
			this.isVisibilidadCeldaEliminarComisionConfig=this.jInternalFrameDetalleFormComisionConfig.jButtonEliminarComisionConfig.isVisible();
			this.isVisibilidadCeldaCancelarComisionConfig=this.jInternalFrameDetalleFormComisionConfig.jButtonCancelarComisionConfig.isVisible();
			this.isVisibilidadCeldaGuardarComisionConfig=this.jInternalFrameDetalleFormComisionConfig.jButtonGuardarCambiosComisionConfig.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosComisionConfig=this.jButtonGuardarCambiosTablaComisionConfig.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoComisionConfig=this.jButtonNuevoToolBarComisionConfig.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesComisionConfig=this.jButtonNuevoRelacionesToolBarComisionConfig.isVisible();
			
			if(this.jInternalFrameDetalleFormComisionConfig!=null) {
			this.isVisibilidadCeldaModificarComisionConfig=this.jInternalFrameDetalleFormComisionConfig.jButtonModificarToolBarComisionConfig.isVisible();
			this.isVisibilidadCeldaActualizarComisionConfig=this.jInternalFrameDetalleFormComisionConfig.jButtonActualizarToolBarComisionConfig.isVisible();
			this.isVisibilidadCeldaEliminarComisionConfig=this.jInternalFrameDetalleFormComisionConfig.jButtonEliminarToolBarComisionConfig.isVisible();
			this.isVisibilidadCeldaCancelarComisionConfig=this.jInternalFrameDetalleFormComisionConfig.jButtonCancelarToolBarComisionConfig.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarComisionConfig=this.jButtonGuardarCambiosToolBarComisionConfig.isVisible();
			this.isVisibilidadCeldaGuardarCambiosComisionConfig=this.jButtonGuardarCambiosTablaToolBarComisionConfig.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoComisionConfig=this.jMenuItemNuevoComisionConfig.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesComisionConfig=this.jMenuItemNuevoRelacionesComisionConfig.isVisible();
			
			if(this.jInternalFrameDetalleFormComisionConfig!=null) {
			this.isVisibilidadCeldaModificarComisionConfig=this.jInternalFrameDetalleFormComisionConfig.jMenuItemModificarComisionConfig.isVisible();
			this.isVisibilidadCeldaActualizarComisionConfig=this.jInternalFrameDetalleFormComisionConfig.jMenuItemActualizarComisionConfig.isVisible();
			this.isVisibilidadCeldaEliminarComisionConfig=this.jInternalFrameDetalleFormComisionConfig.jMenuItemEliminarComisionConfig.isVisible();
			this.isVisibilidadCeldaCancelarComisionConfig=this.jInternalFrameDetalleFormComisionConfig.jMenuItemCancelarComisionConfig.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarComisionConfig=this.jMenuItemGuardarCambiosComisionConfig.isVisible();
			this.isVisibilidadCeldaGuardarCambiosComisionConfig=this.jMenuItemGuardarCambiosTablaComisionConfig.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesComisionConfig(Boolean esInicializar) {
		if(ComisionConfigJInternalFrame.ISBINDING_MANUAL) {			
			if(this.comisionconfigSessionBean.getConGuardarRelaciones()) {
				//if(this.comisionconfigSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesComisionConfig();
			}
			
			this.inicializarActualizarBindingBotonesManualComisionConfig(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualComisionConfig() {
		this.jButtonNuevoComisionConfig.setVisible(this.isPermisoNuevoComisionConfig);			
		this.jButtonDuplicarComisionConfig.setVisible(this.isPermisoDuplicarComisionConfig);			
		this.jButtonCopiarComisionConfig.setVisible(this.isPermisoCopiarComisionConfig);			
		this.jButtonVerFormComisionConfig.setVisible(this.isPermisoVerFormComisionConfig);			
		
		this.jButtonAbrirOrderByComisionConfig.setVisible(this.isPermisoOrdenComisionConfig);					
		
		this.jButtonNuevoRelacionesComisionConfig.setVisible(this.isPermisoNuevoComisionConfig);			
		
		if(this.jInternalFrameDetalleFormComisionConfig!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisionConfig.jButtonModificarComisionConfig.setVisible(this.isPermisoActualizarComisionConfig);	
			this.jInternalFrameDetalleFormComisionConfig.jButtonActualizarComisionConfig.setVisible(this.isPermisoActualizarComisionConfig);	
			this.jInternalFrameDetalleFormComisionConfig.jButtonEliminarComisionConfig.setVisible(this.isPermisoEliminarComisionConfig);
			this.jInternalFrameDetalleFormComisionConfig.jButtonCancelarComisionConfig.setVisible(this.isVisibilidadCeldaCancelarComisionConfig);						
			this.jInternalFrameDetalleFormComisionConfig.jButtonGuardarCambiosComisionConfig.setVisible(this.isPermisoGuardarCambiosComisionConfig);							
		}
		
		this.jButtonGuardarCambiosTablaComisionConfig.setVisible(this.isPermisoActualizarComisionConfig);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleComisionConfig() {
		this.jInternalFrameDetalleFormComisionConfig.jButtonModificarComisionConfig.setVisible(this.isPermisoActualizarComisionConfig);	
		this.jInternalFrameDetalleFormComisionConfig.jButtonActualizarComisionConfig.setVisible(this.isPermisoActualizarComisionConfig);	
		this.jInternalFrameDetalleFormComisionConfig.jButtonEliminarComisionConfig.setVisible(this.isPermisoEliminarComisionConfig);
		this.jInternalFrameDetalleFormComisionConfig.jButtonCancelarComisionConfig.setVisible(this.isVisibilidadCeldaCancelarComisionConfig);							
		this.jInternalFrameDetalleFormComisionConfig.jButtonGuardarCambiosComisionConfig.setVisible((this.isVisibilidadCeldaGuardarComisionConfig && this.isPermisoGuardarCambiosComisionConfig));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosComisionConfig() {
		if(ComisionConfigJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualComisionConfig();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesComisionConfig() {
	}
	
	public void jTableDatosComisionConfigListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarComisionConfig(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidComisionConfigBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionconfigLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionConfig.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComisionConfig(this.getcomisionconfig(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionConfig(this.comisionconfig);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comisionconfig =(ComisionConfig) this.comisionconfigLogic.getComisionConfigs().toArray()[this.jTableDatosComisionConfig.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comisionconfig =(ComisionConfig) this.comisionconfigs.toArray()[this.jTableDatosComisionConfig.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comisionconfig==null) {
						this.comisionconfig = new ComisionConfig();
					}

					this.setVariablesFormularioToObjetoActualComisionConfig(this.comisionconfig,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionConfig(this.comisionconfig);
				}

				if(this.comisionconfig.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.comisionconfig.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComisionConfig(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionconfigLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionconfigLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionconfigLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaComisionConfigUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionconfigLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebComisionConfig(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionConfig.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosComisionConfig.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosComisionConfig.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionconfig =(ComisionConfig) this.comisionconfigLogic.getComisionConfigs().toArray()[this.jTableDatosComisionConfig.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.comisionconfig =(ComisionConfig) this.comisionconfigs.toArray()[this.jTableDatosComisionConfig.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualComisionConfig(this.getcomisionconfig(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysComisionConfig(this.comisionconfig);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.comisionconfigLogic.getConnexion());

				if(this.comisionconfig.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.comisionconfig.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderComisionConfig=(TitledBorder)this.jScrollPanelDatosComisionConfig.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderComisionConfig.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionconfigLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionconfigLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionconfigLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaComisionConfigBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionconfigLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionConfig.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComisionConfig(this.getcomisionconfig(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionConfig(this.comisionconfig);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comisionconfig =(ComisionConfig) this.comisionconfigLogic.getComisionConfigs().toArray()[this.jTableDatosComisionConfig.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comisionconfig =(ComisionConfig) this.comisionconfigs.toArray()[this.jTableDatosComisionConfig.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comisionconfig==null) {
						this.comisionconfig = new ComisionConfig();
					}

					this.setVariablesFormularioToObjetoActualComisionConfig(this.comisionconfig,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionConfig(this.comisionconfig);
				}

				if(this.comisionconfig.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.comisionconfig.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComisionConfig(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionconfigLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionconfigLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionconfigLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_comision_configComisionConfigUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionconfigLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipocomisionconfig=true;

			idTienePermisotipocomisionconfig=this.tienePermisosUsuarioEnPaginaWebComisionConfig(TipoComisionConfigConstantesFunciones.CLASSNAME);

			if(idTienePermisotipocomisionconfig) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionConfig.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosComisionConfig.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosComisionConfig.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionconfig =(ComisionConfig) this.comisionconfigLogic.getComisionConfigs().toArray()[this.jTableDatosComisionConfig.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.comisionconfig =(ComisionConfig) this.comisionconfigs.toArray()[this.jTableDatosComisionConfig.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualComisionConfig(this.getcomisionconfig(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysComisionConfig(this.comisionconfig);

				this.tipocomisionconfigBeanSwingJInternalFrame=new TipoComisionConfigBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipocomisionconfigBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipocomisionconfigBeanSwingJInternalFrame.getTipoComisionConfigLogic().setConnexion(this.comisionconfigLogic.getConnexion());

				if(this.comisionconfig.getid_tipo_comision_config()!=null) {
					this.tipocomisionconfigBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipocomisionconfigBeanSwingJInternalFrame.setIdActual(this.comisionconfig.getid_tipo_comision_config());
					this.tipocomisionconfigBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipocomisionconfigBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipocomisionconfigBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoComisionConfig();
				}

				JInternalFrameBase jinternalFrame =this.tipocomisionconfigBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderComisionConfig=(TitledBorder)this.jScrollPanelDatosComisionConfig.getBorder();
				TitledBorder titledBordertipocomisionconfig=(TitledBorder)this.tipocomisionconfigBeanSwingJInternalFrame.jScrollPanelDatosTipoComisionConfig.getBorder();

				titledBordertipocomisionconfig.setTitle(titledBorderComisionConfig.getTitle() + " -> Tipo Comision Config");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionconfigLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionconfigLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionconfigLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_comision_configComisionConfigBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionconfigLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionConfig.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComisionConfig(this.getcomisionconfig(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionConfig(this.comisionconfig);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comisionconfig =(ComisionConfig) this.comisionconfigLogic.getComisionConfigs().toArray()[this.jTableDatosComisionConfig.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comisionconfig =(ComisionConfig) this.comisionconfigs.toArray()[this.jTableDatosComisionConfig.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comisionconfig==null) {
						this.comisionconfig = new ComisionConfig();
					}

					this.setVariablesFormularioToObjetoActualComisionConfig(this.comisionconfig,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionConfig(this.comisionconfig);
				}

				if(this.comisionconfig.getid_tipo_comision_config()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_comision_config = "+this.comisionconfig.getid_tipo_comision_config().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComisionConfig(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionconfigLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionconfigLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionconfigLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_nivel_lineaComisionConfigUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionconfigLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisonivellinea=true;

			idTienePermisonivellinea=this.tienePermisosUsuarioEnPaginaWebComisionConfig(NivelLineaConstantesFunciones.CLASSNAME);

			if(idTienePermisonivellinea) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionConfig.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosComisionConfig.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosComisionConfig.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionconfig =(ComisionConfig) this.comisionconfigLogic.getComisionConfigs().toArray()[this.jTableDatosComisionConfig.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.comisionconfig =(ComisionConfig) this.comisionconfigs.toArray()[this.jTableDatosComisionConfig.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualComisionConfig(this.getcomisionconfig(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysComisionConfig(this.comisionconfig);

				this.nivellineaBeanSwingJInternalFrame=new NivelLineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.nivellineaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.nivellineaBeanSwingJInternalFrame.getNivelLineaLogic().setConnexion(this.comisionconfigLogic.getConnexion());

				if(this.comisionconfig.getid_nivel_linea()!=null) {
					this.nivellineaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.nivellineaBeanSwingJInternalFrame.setIdActual(this.comisionconfig.getid_nivel_linea());
					this.nivellineaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.nivellineaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.nivellineaBeanSwingJInternalFrame.inicializarActualizarBindingTablaNivelLinea();
				}

				JInternalFrameBase jinternalFrame =this.nivellineaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderComisionConfig=(TitledBorder)this.jScrollPanelDatosComisionConfig.getBorder();
				TitledBorder titledBordernivellinea=(TitledBorder)this.nivellineaBeanSwingJInternalFrame.jScrollPanelDatosNivelLinea.getBorder();

				titledBordernivellinea.setTitle(titledBorderComisionConfig.getTitle() + " -> Nivel Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionconfigLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionconfigLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionconfigLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_nivel_lineaComisionConfigBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionconfigLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionConfig.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComisionConfig(this.getcomisionconfig(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionConfig(this.comisionconfig);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comisionconfig =(ComisionConfig) this.comisionconfigLogic.getComisionConfigs().toArray()[this.jTableDatosComisionConfig.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comisionconfig =(ComisionConfig) this.comisionconfigs.toArray()[this.jTableDatosComisionConfig.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comisionconfig==null) {
						this.comisionconfig = new ComisionConfig();
					}

					this.setVariablesFormularioToObjetoActualComisionConfig(this.comisionconfig,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionConfig(this.comisionconfig);
				}

				if(this.comisionconfig.getid_nivel_linea()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_nivel_linea = "+this.comisionconfig.getid_nivel_linea().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComisionConfig(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionconfigLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionconfigLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionconfigLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncon_vendedorComisionConfigBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionconfigLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionConfig.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComisionConfig(this.getcomisionconfig(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionConfig(this.comisionconfig);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comisionconfig =(ComisionConfig) this.comisionconfigLogic.getComisionConfigs().toArray()[this.jTableDatosComisionConfig.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comisionconfig =(ComisionConfig) this.comisionconfigs.toArray()[this.jTableDatosComisionConfig.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comisionconfig==null) {
						this.comisionconfig = new ComisionConfig();
					}

					this.setVariablesFormularioToObjetoActualComisionConfig(this.comisionconfig,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionConfig(this.comisionconfig);
				}

				if(this.comisionconfig.getcon_vendedor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where con_vendedor = "+this.comisionconfig.getcon_vendedor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComisionConfig(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionconfigLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionconfigLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionconfigLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncon_ventasComisionConfigBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionconfigLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionConfig.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComisionConfig(this.getcomisionconfig(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionConfig(this.comisionconfig);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comisionconfig =(ComisionConfig) this.comisionconfigLogic.getComisionConfigs().toArray()[this.jTableDatosComisionConfig.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comisionconfig =(ComisionConfig) this.comisionconfigs.toArray()[this.jTableDatosComisionConfig.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comisionconfig==null) {
						this.comisionconfig = new ComisionConfig();
					}

					this.setVariablesFormularioToObjetoActualComisionConfig(this.comisionconfig,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionConfig(this.comisionconfig);
				}

				if(this.comisionconfig.getcon_ventas()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where con_ventas = "+this.comisionconfig.getcon_ventas().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComisionConfig(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionconfigLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionconfigLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionconfigLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncon_cobrosComisionConfigBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionconfigLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionConfig.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComisionConfig(this.getcomisionconfig(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionConfig(this.comisionconfig);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comisionconfig =(ComisionConfig) this.comisionconfigLogic.getComisionConfigs().toArray()[this.jTableDatosComisionConfig.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comisionconfig =(ComisionConfig) this.comisionconfigs.toArray()[this.jTableDatosComisionConfig.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comisionconfig==null) {
						this.comisionconfig = new ComisionConfig();
					}

					this.setVariablesFormularioToObjetoActualComisionConfig(this.comisionconfig,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionConfig(this.comisionconfig);
				}

				if(this.comisionconfig.getcon_cobros()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where con_cobros = "+this.comisionconfig.getcon_cobros().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComisionConfig(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionconfigLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionconfigLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionconfigLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncon_remesa_transitoComisionConfigBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionconfigLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionConfig.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComisionConfig(this.getcomisionconfig(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionConfig(this.comisionconfig);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comisionconfig =(ComisionConfig) this.comisionconfigLogic.getComisionConfigs().toArray()[this.jTableDatosComisionConfig.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comisionconfig =(ComisionConfig) this.comisionconfigs.toArray()[this.jTableDatosComisionConfig.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comisionconfig==null) {
						this.comisionconfig = new ComisionConfig();
					}

					this.setVariablesFormularioToObjetoActualComisionConfig(this.comisionconfig,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionConfig(this.comisionconfig);
				}

				if(this.comisionconfig.getcon_remesa_transito()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where con_remesa_transito = "+this.comisionconfig.getcon_remesa_transito().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComisionConfig(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionconfigLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionconfigLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionconfigLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncon_penalidadComisionConfigBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionconfigLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionConfig.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComisionConfig(this.getcomisionconfig(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionConfig(this.comisionconfig);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comisionconfig =(ComisionConfig) this.comisionconfigLogic.getComisionConfigs().toArray()[this.jTableDatosComisionConfig.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comisionconfig =(ComisionConfig) this.comisionconfigs.toArray()[this.jTableDatosComisionConfig.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comisionconfig==null) {
						this.comisionconfig = new ComisionConfig();
					}

					this.setVariablesFormularioToObjetoActualComisionConfig(this.comisionconfig,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionConfig(this.comisionconfig);
				}

				if(this.comisionconfig.getcon_penalidad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where con_penalidad = "+this.comisionconfig.getcon_penalidad().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComisionConfig(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionconfigLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionconfigLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionconfigLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncon_abonoComisionConfigBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionconfigLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionConfig.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComisionConfig(this.getcomisionconfig(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionConfig(this.comisionconfig);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comisionconfig =(ComisionConfig) this.comisionconfigLogic.getComisionConfigs().toArray()[this.jTableDatosComisionConfig.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comisionconfig =(ComisionConfig) this.comisionconfigs.toArray()[this.jTableDatosComisionConfig.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comisionconfig==null) {
						this.comisionconfig = new ComisionConfig();
					}

					this.setVariablesFormularioToObjetoActualComisionConfig(this.comisionconfig,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionConfig(this.comisionconfig);
				}

				if(this.comisionconfig.getcon_abono()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where con_abono = "+this.comisionconfig.getcon_abono().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComisionConfig(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionconfigLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionconfigLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionconfigLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaComisionConfigActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionconfigLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingComisionConfig(false,false);

			this.getComisionConfigsFK_IdEmpresa();

			this.inicializarActualizarBindingComisionConfig(false);

			//if(ComisionConfigBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingComisionConfig(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionconfigLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionconfigLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionconfigLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdNivelLineaComisionConfigActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionconfigLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingComisionConfig(false,false);

			this.getComisionConfigsFK_IdNivelLinea();

			this.inicializarActualizarBindingComisionConfig(false);

			//if(ComisionConfigBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingComisionConfig(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionconfigLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionconfigLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionconfigLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoComisionConfigComisionConfigActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionconfigLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingComisionConfig(false,false);

			this.getComisionConfigsFK_IdTipoComisionConfig();

			this.inicializarActualizarBindingComisionConfig(false);

			//if(ComisionConfigBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingComisionConfig(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionconfigLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionconfigLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionconfigLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameComisionConfig() {
		if(this.jInternalFrameDetalleFormComisionConfig!=null) {
		

		if(this.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormComisionConfig!=null) {
			this.jInternalFrameDetalleFormComisionConfig.setVisible(false);	    			
			this.jInternalFrameDetalleFormComisionConfig.dispose();
			this.jInternalFrameDetalleFormComisionConfig=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoComisionConfig!=null) {
			this.jInternalFrameReporteDinamicoComisionConfig.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoComisionConfig.dispose();
			this.jInternalFrameReporteDinamicoComisionConfig=null;
		}
		
		if(this.jInternalFrameImportacionComisionConfig!=null) {
			this.jInternalFrameImportacionComisionConfig.setVisible(false);	    			
			this.jInternalFrameImportacionComisionConfig.dispose();
			this.jInternalFrameImportacionComisionConfig=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessComisionConfig();
			
			ComisionConfigBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comisionconfig,new Object(),this.comisionconfigParameterGeneral,this.comisionconfigReturnGeneral);
			
			
			if(sTipo.equals("NuevoComisionConfig")) {
				jButtonNuevoComisionConfigActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarComisionConfig")) {
				jButtonDuplicarComisionConfigActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarComisionConfig")) {
				jButtonCopiarComisionConfigActionPerformed(evt);
			} else if(sTipo.equals("VerFormComisionConfig")) {
				jButtonVerFormComisionConfigActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarComisionConfig")) {
				jButtonNuevoComisionConfigActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarComisionConfig")) {
				jButtonDuplicarComisionConfigActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoComisionConfig")) {
				jButtonNuevoComisionConfigActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarComisionConfig")) {
				jButtonDuplicarComisionConfigActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesComisionConfig")) {
				jButtonNuevoComisionConfigActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarComisionConfig")) {
				jButtonNuevoComisionConfigActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesComisionConfig")) {
				jButtonNuevoComisionConfigActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarComisionConfig")) {
				jButtonModificarComisionConfigActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarComisionConfig")) {
				jButtonModificarComisionConfigActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarComisionConfig")) {
				jButtonModificarComisionConfigActionPerformed(evt);
			} else if(sTipo.equals("ActualizarComisionConfig")) {
				jButtonActualizarComisionConfigActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarComisionConfig")) {
				jButtonActualizarComisionConfigActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarComisionConfig")) {
				jButtonActualizarComisionConfigActionPerformed(evt);
			} else if(sTipo.equals("EliminarComisionConfig")) {
				jButtonEliminarComisionConfigActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarComisionConfig")) {
				jButtonEliminarComisionConfigActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarComisionConfig")) {
				jButtonEliminarComisionConfigActionPerformed(evt);
			} else if(sTipo.equals("CancelarComisionConfig")) {
				jButtonCancelarComisionConfigActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarComisionConfig")) {
				jButtonCancelarComisionConfigActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarComisionConfig")) {
				jButtonCancelarComisionConfigActionPerformed(evt);
			} else if(sTipo.equals("CerrarComisionConfig")) {
				jButtonCerrarComisionConfigActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarComisionConfig")) {
				jButtonCerrarComisionConfigActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarComisionConfig")) {
				jButtonCerrarComisionConfigActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarComisionConfig")) {
				jButtonMostrarOcultarComisionConfigActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarComisionConfig")) {
				jButtonCancelarComisionConfigActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosComisionConfig")) {
				jButtonGuardarCambiosComisionConfigActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarComisionConfig")) {
				jButtonGuardarCambiosComisionConfigActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarComisionConfig")) {
				jButtonCopiarComisionConfigActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarComisionConfig")) {
				jButtonVerFormComisionConfigActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosComisionConfig")) {
				jButtonGuardarCambiosComisionConfigActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarComisionConfig")) {
				jButtonCopiarComisionConfigActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormComisionConfig")) {
				jButtonVerFormComisionConfigActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaComisionConfig")) {
				jButtonGuardarCambiosComisionConfigActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarComisionConfig")) {
				jButtonGuardarCambiosComisionConfigActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaComisionConfig")) {
				jButtonGuardarCambiosComisionConfigActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionComisionConfig")) {
				jButtonRecargarInformacionComisionConfigActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarComisionConfig")) {
				jButtonRecargarInformacionComisionConfigActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionComisionConfig")) {
				jButtonRecargarInformacionComisionConfigActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresComisionConfig")) {
				jButtonAnterioresComisionConfigActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarComisionConfig")) {
				jButtonAnterioresComisionConfigActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreComisionConfig")) {
				jButtonAnterioresComisionConfigActionPerformed(evt);
			} else if(sTipo.equals("SiguientesComisionConfig")) {
				jButtonSiguientesComisionConfigActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarComisionConfig")) {
				jButtonSiguientesComisionConfigActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesComisionConfig")) {
				jButtonSiguientesComisionConfigActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByComisionConfig") || sTipo.equals("MenuItemDetalleAbrirOrderByComisionConfig")) {
				jButtonAbrirOrderByComisionConfigActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarComisionConfig") || sTipo.equals("MenuItemDetalleMostrarOcultarComisionConfig")) {
				jButtonMostrarOcultarComisionConfigActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosComisionConfig")) {
				jButtonNuevoGuardarCambiosComisionConfigActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarComisionConfig")) {
				jButtonNuevoGuardarCambiosComisionConfigActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosComisionConfig")) {
				jButtonNuevoGuardarCambiosComisionConfigActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoComisionConfig")) {
				jButtonCerrarReporteDinamicoComisionConfigActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoComisionConfig")) {
				jButtonGenerarReporteDinamicoComisionConfigActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoComisionConfig")) {
				
				jButtonGenerarExcelReporteDinamicoComisionConfigActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionComisionConfig")) {
				jButtonCerrarImportacionComisionConfigActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionComisionConfig")) {
				
				jButtonGenerarImportacionComisionConfigActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionComisionConfig")) {
				
				jButtonAbrirImportacionComisionConfigActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesComisionConfig")) {
				jComboBoxTiposAccionesComisionConfigActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesComisionConfig")) {
				jComboBoxTiposRelacionesComisionConfigActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioComisionConfig")) {
				jComboBoxTiposAccionesComisionConfigActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarComisionConfig")) {
				
				jComboBoxTiposSeleccionarComisionConfigActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralComisionConfig")) {
				jTextFieldValorCampoGeneralComisionConfigActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByComisionConfig")) {
				jButtonAbrirOrderByComisionConfigActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarComisionConfig")) {
				jButtonAbrirOrderByComisionConfigActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByComisionConfig")) {
				jButtonCerrarOrderByComisionConfigActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idComisionConfigBusqueda")) {
				this.jButtonidComisionConfigBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaComisionConfigUpdate")) {
				this.jButtonid_empresaComisionConfigUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaComisionConfigBusqueda")) {
				this.jButtonid_empresaComisionConfigBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_comision_configComisionConfigUpdate")) {
				this.jButtonid_tipo_comision_configComisionConfigUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_comision_configComisionConfigBusqueda")) {
				this.jButtonid_tipo_comision_configComisionConfigBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_nivel_lineaComisionConfigUpdate")) {
				this.jButtonid_nivel_lineaComisionConfigUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_nivel_lineaComisionConfigBusqueda")) {
				this.jButtonid_nivel_lineaComisionConfigBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_vendedorComisionConfigBusqueda")) {
				this.jButtoncon_vendedorComisionConfigBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_ventasComisionConfigBusqueda")) {
				this.jButtoncon_ventasComisionConfigBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_cobrosComisionConfigBusqueda")) {
				this.jButtoncon_cobrosComisionConfigBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_remesa_transitoComisionConfigBusqueda")) {
				this.jButtoncon_remesa_transitoComisionConfigBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_penalidadComisionConfigBusqueda")) {
				this.jButtoncon_penalidadComisionConfigBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_abonoComisionConfigBusqueda")) {
				this.jButtoncon_abonoComisionConfigBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdNivelLineaComisionConfig")) {
				this.jButtonFK_IdNivelLineaComisionConfigActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoComisionConfigComisionConfig")) {
				this.jButtonFK_IdTipoComisionConfigComisionConfigActionPerformed(evt);
			}
			
			;
			
			
			ComisionConfigBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comisionconfig,new Object(),this.comisionconfigParameterGeneral,this.comisionconfigReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessComisionConfig();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaComisionConfigActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comisionconfig);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comisionconfig);
				
				ComisionConfigBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionconfig,new Object(),this.comisionconfigParameterGeneral,this.comisionconfigReturnGeneral);
				
				


				
				ComisionConfigBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionconfig,new Object(),this.comisionconfigParameterGeneral,this.comisionconfigReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComisionConfig.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComisionConfig.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ComisionConfig comisionconfigLocal=null;
			
			if(!this.getEsControlTabla()) {
				comisionconfigLocal=this.comisionconfig;
			} else {
				comisionconfigLocal=this.comisionconfigAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comisionconfig);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comisionconfig);
				
				ComisionConfigBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionconfig,new Object(),this.comisionconfigParameterGeneral,this.comisionconfigReturnGeneral);
							
				
				


				
				ComisionConfigBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionconfig,new Object(),this.comisionconfigParameterGeneral,this.comisionconfigReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComisionConfig.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComisionConfig.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComisionConfigActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosComisionConfig.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionconfigAnterior =(ComisionConfig) this.comisionconfigLogic.getComisionConfigs().toArray()[this.jTableDatosComisionConfig.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comisionconfigAnterior =(ComisionConfig) this.comisionconfigs.toArray()[this.jTableDatosComisionConfig.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
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
			
			ComisionConfigBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionconfig,new Object(),this.comisionconfigParameterGeneral,this.comisionconfigReturnGeneral);
			
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
			
			


			
			ComisionConfigBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionconfig,new Object(),this.comisionconfigParameterGeneral,this.comisionconfigReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaComisionConfigActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comisionconfig);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comisionconfig);
				
				ComisionConfigBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionconfig,new Object(),this.comisionconfigParameterGeneral,this.comisionconfigReturnGeneral);
								
						
				


				
				ComisionConfigBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionconfig,new Object(),this.comisionconfigParameterGeneral,this.comisionconfigReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComisionConfig.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComisionConfig.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comisionconfig);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comisionconfig);
				
				ComisionConfigBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionconfig,new Object(),this.comisionconfigParameterGeneral,this.comisionconfigReturnGeneral);
								
				
				


				
				ComisionConfigBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionconfig,new Object(),this.comisionconfigParameterGeneral,this.comisionconfigReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComisionConfig.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComisionConfig.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComisionConfigActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosComisionConfig.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionconfigAnterior =(ComisionConfig) this.comisionconfigLogic.getComisionConfigs().toArray()[this.jTableDatosComisionConfig.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comisionconfigAnterior =(ComisionConfig) this.comisionconfigs.toArray()[this.jTableDatosComisionConfig.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comisionconfig);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comisionconfig);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComisionConfigActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosComisionConfig.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionconfigAnterior =(ComisionConfig) this.comisionconfigLogic.getComisionConfigs().toArray()[this.jTableDatosComisionConfig.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comisionconfigAnterior =(ComisionConfig) this.comisionconfigs.toArray()[this.jTableDatosComisionConfig.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComisionConfigActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.comisionconfig);
			
			this.actualizarInformacion("INFO_PADRE",false,this.comisionconfig);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comisionconfig);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comisionconfig);
				
				ComisionConfigBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionconfig,new Object(),this.comisionconfigParameterGeneral,this.comisionconfigReturnGeneral);
							
				
				


				
				ComisionConfigBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionconfig,new Object(),this.comisionconfigParameterGeneral,this.comisionconfigReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComisionConfig.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComisionConfig.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaComisionConfigActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosComisionConfig.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comisionconfigAnterior =(ComisionConfig) this.comisionconfigLogic.getComisionConfigs().toArray()[this.jTableDatosComisionConfig.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.comisionconfigAnterior =(ComisionConfig) this.comisionconfigs.toArray()[this.jTableDatosComisionConfig.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
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
			
			ComisionConfigBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionconfig,new Object(),this.comisionconfigParameterGeneral,this.comisionconfigReturnGeneral);
			
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
			
			


			
			ComisionConfigBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionconfig,new Object(),this.comisionconfigParameterGeneral,this.comisionconfigReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComisionConfigActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.comisionconfig);
			
			this.actualizarInformacion("INFO_PADRE",false,this.comisionconfig);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comisionconfig);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comisionconfig);
				
				ComisionConfigBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionconfig,new Object(),this.comisionconfigParameterGeneral,this.comisionconfigReturnGeneral);
								
				
				


				
				ComisionConfigBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionconfig,new Object(),this.comisionconfigParameterGeneral,this.comisionconfigReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComisionConfig.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComisionConfig.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComisionConfigActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosComisionConfig.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionconfigAnterior =(ComisionConfig) this.comisionconfigLogic.getComisionConfigs().toArray()[this.jTableDatosComisionConfig.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comisionconfigAnterior =(ComisionConfig) this.comisionconfigs.toArray()[this.jTableDatosComisionConfig.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComisionConfigActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.comisionconfig);
			
			this.actualizarInformacion("INFO_PADRE",false,this.comisionconfig);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaComisionConfigActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comisionconfig);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comisionconfig);
				
				ComisionConfigBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comisionconfig,new Object(),this.comisionconfigParameterGeneral,this.comisionconfigReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosComisionConfig")) {
					jCheckBoxSeleccionarTodosComisionConfigItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosComisionConfig")) {
					jCheckBoxSeleccionadosComisionConfigItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarComisionConfig")) {
					
				}
				
				


				
				
				ComisionConfigBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comisionconfig,new Object(),this.comisionconfigParameterGeneral,this.comisionconfigReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComisionConfig.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComisionConfig.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.comisionconfig);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.comisionconfig);
				
				ComisionConfigBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comisionconfig,new Object(),this.comisionconfigParameterGeneral,this.comisionconfigReturnGeneral);
												
				
				


				
				
				ComisionConfigBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comisionconfig,new Object(),this.comisionconfigParameterGeneral,this.comisionconfigReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComisionConfig.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComisionConfig.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaComisionConfigActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosComisionConfig.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comisionconfigAnterior =(ComisionConfig) this.comisionconfigLogic.getComisionConfigs().toArray()[this.jTableDatosComisionConfig.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.comisionconfigAnterior =(ComisionConfig) this.comisionconfigs.toArray()[this.jTableDatosComisionConfig.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaComisionConfigActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comisionconfig);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comisionconfig);
				
				ComisionConfigBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comisionconfig,new Object(),this.comisionconfigParameterGeneral,this.comisionconfigReturnGeneral);
				
				
				ComisionConfigBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comisionconfig,new Object(),this.comisionconfigParameterGeneral,this.comisionconfigReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
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
			
			ComisionConfigBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.comisionconfig,new Object(),this.comisionconfigParameterGeneral,this.comisionconfigReturnGeneral);
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
			
			


			
			ComisionConfigBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionconfig,new Object(),this.comisionconfigParameterGeneral,this.comisionconfigReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaComisionConfigActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comisionconfig);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comisionconfig);
				
				ComisionConfigBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.comisionconfig,new Object(),this.comisionconfigParameterGeneral,this.comisionconfigReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ComisionConfigBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionconfig,new Object(),this.comisionconfigParameterGeneral,this.comisionconfigReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComisionConfig.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComisionConfig.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comisionconfig);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comisionconfig);
				
				ComisionConfigBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.comisionconfig,new Object(),this.comisionconfigParameterGeneral,this.comisionconfigReturnGeneral);
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
				
				


				
				ComisionConfigBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionconfig,new Object(),this.comisionconfigParameterGeneral,this.comisionconfigReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComisionConfig.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComisionConfig.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComisionConfigActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosComisionConfig.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionconfigAnterior =(ComisionConfig) this.comisionconfigLogic.getComisionConfigs().toArray()[this.jTableDatosComisionConfig.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comisionconfigAnterior =(ComisionConfig) this.comisionconfigs.toArray()[this.jTableDatosComisionConfig.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ComisionConfigBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionconfig,new Object(),this.comisionconfigParameterGeneral,this.comisionconfigReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarComisionConfig")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosComisionConfigListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosComisionConfig.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.comisionconfig =(ComisionConfig) this.comisionconfigLogic.getComisionConfigs().toArray()[this.jTableDatosComisionConfig.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.comisionconfig =(ComisionConfig) this.comisionconfigs.toArray()[this.jTableDatosComisionConfig.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.comisionconfig);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarComisionConfig")) {
				
				}
				
				ComisionConfigBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionconfig,new Object(),this.comisionconfigParameterGeneral,this.comisionconfigReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ComisionConfigBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.comisionconfig,new Object(),this.comisionconfigParameterGeneral,this.comisionconfigReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarComisionConfig")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosComisionConfig.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarComisionConfig")) {
			
			}
			
			ComisionConfigBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.comisionconfig,new Object(),this.comisionconfigParameterGeneral,this.comisionconfigReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessComisionConfig();
			
			ComisionConfigBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comisionconfig,new Object(),this.comisionconfigParameterGeneral,this.comisionconfigReturnGeneral);
			
			if(sTipo.equals("NuevoComisionConfig")) {
				jButtonNuevoComisionConfigActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarComisionConfig")) {
				jButtonDuplicarComisionConfigActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarComisionConfig")) {
				jButtonCopiarComisionConfigActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormComisionConfig")) {
				jButtonVerFormComisionConfigActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesComisionConfig")) {
				jButtonNuevoComisionConfigActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarComisionConfig")) {
				jButtonModificarComisionConfigActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarComisionConfig")) {
				jButtonActualizarComisionConfigActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarComisionConfig")) {
				jButtonEliminarComisionConfigActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaComisionConfig")) {
				jButtonGuardarCambiosComisionConfigActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarComisionConfig")) {
				jButtonCancelarComisionConfigActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarComisionConfig")) {
				jButtonCerrarComisionConfigActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosComisionConfig")) {
				jButtonGuardarCambiosComisionConfigActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosComisionConfig")) {
				jButtonNuevoGuardarCambiosComisionConfigActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByComisionConfig")) {
				jButtonAbrirOrderByComisionConfigActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionComisionConfig")) {
				jButtonRecargarInformacionComisionConfigActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresComisionConfig")) {
				jButtonAnterioresComisionConfigActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesComisionConfig")) {
				jButtonSiguientesComisionConfigActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idComisionConfigBusqueda")) {
				this.jButtonidComisionConfigBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaComisionConfigUpdate")) {
				this.jButtonid_empresaComisionConfigUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaComisionConfigBusqueda")) {
				this.jButtonid_empresaComisionConfigBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_comision_configComisionConfigUpdate")) {
				this.jButtonid_tipo_comision_configComisionConfigUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_comision_configComisionConfigBusqueda")) {
				this.jButtonid_tipo_comision_configComisionConfigBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_nivel_lineaComisionConfigUpdate")) {
				this.jButtonid_nivel_lineaComisionConfigUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_nivel_lineaComisionConfigBusqueda")) {
				this.jButtonid_nivel_lineaComisionConfigBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_vendedorComisionConfigBusqueda")) {
				this.jButtoncon_vendedorComisionConfigBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_ventasComisionConfigBusqueda")) {
				this.jButtoncon_ventasComisionConfigBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_cobrosComisionConfigBusqueda")) {
				this.jButtoncon_cobrosComisionConfigBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_remesa_transitoComisionConfigBusqueda")) {
				this.jButtoncon_remesa_transitoComisionConfigBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_penalidadComisionConfigBusqueda")) {
				this.jButtoncon_penalidadComisionConfigBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_abonoComisionConfigBusqueda")) {
				this.jButtoncon_abonoComisionConfigBusquedaActionPerformed(evt);
			}
			
			ComisionConfigBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comisionconfig,new Object(),this.comisionconfigParameterGeneral,this.comisionconfigReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessComisionConfig();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ComisionConfigBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.comisionconfig,new Object(),this.comisionconfigParameterGeneral,this.comisionconfigReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameComisionConfig")) {
				closingInternalFrameComisionConfig();
				
			} else if(sTipo.equals("jButtonCancelarComisionConfig")) {
				JInternalFrameBase jInternalFrameDetalleFormComisionConfig = (JInternalFrameBase)evt.getSource();
	            	
	            ComisionConfigBeanSwingJInternalFrame jInternalFrameParent=(ComisionConfigBeanSwingJInternalFrame)jInternalFrameDetalleFormComisionConfig.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarComisionConfigActionPerformed(null);
			}
			
			ComisionConfigBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.comisionconfig,new Object(),this.comisionconfigParameterGeneral,this.comisionconfigReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormComisionConfig(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormComisionConfig(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormComisionConfig(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.comisionconfig)) {
			if(!esControlTabla) {
				if(ComisionConfigJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualComisionConfig(this.comisionconfig,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionConfig(this.comisionconfig);			
				}
				
				if(this.comisionconfigSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualComisionConfig(this.comisionconfig,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.comisionconfigReturnGeneral=comisionconfigLogic.procesarEventosComisionConfigsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.comisionconfigLogic.getComisionConfigs(),this.comisionconfig,this.comisionconfigParameterGeneral,this.isEsNuevoComisionConfig,classes);//this.comisionconfigLogic.getComisionConfig()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanComisionConfig(this.comisionconfigReturnGeneral,this.comisionconfigBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.comisionconfigSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanComisionConfig(classes,this.comisionconfigReturnGeneral,this.comisionconfigBean,false);
					}
						
					if(this.comisionconfigReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyComisionConfig(this.comisionconfigReturnGeneral.getComisionConfig());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioComisionConfig(this.comisionconfigReturnGeneral.getComisionConfig());	
					}
						
					if(this.comisionconfigReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioComisionConfig(this.comisionconfigReturnGeneral.getComisionConfig(),classes);//this.comisionconfigBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioComisionConfig(this.comisionconfig,classes);//this.comisionconfigBean);									
				}
			
				if(ComisionConfigJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualComisionConfig(this.comisionconfig,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionConfig(this.comisionconfig);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.comisionconfigAnterior!=null) {
						this.comisionconfig=this.comisionconfigAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.comisionconfigReturnGeneral=comisionconfigLogic.procesarEventosComisionConfigsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.comisionconfigLogic.getComisionConfigs(),this.comisionconfig,this.comisionconfigParameterGeneral,this.isEsNuevoComisionConfig,classes);//this.comisionconfigLogic.getComisionConfig()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.comisionconfigSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.comisionconfigSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.comisionconfigReturnGeneral.getComisionConfig(),comisionconfigLogic.getComisionConfigs());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.comisionconfigReturnGeneral.getComisionConfig(),this.comisionconfigs);
				}
				//ARCHITECTURE
				
				//this.jTableDatosComisionConfig.repaint();
				
				//((AbstractTableModel) this.jTableDatosComisionConfig.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosComisionConfig();
			}
		}
	}
	
	public void actualizarVisualTableDatosComisionConfig() throws Exception {
		
		ComisionConfigModel comisionconfigModel=(ComisionConfigModel)this.jTableDatosComisionConfig.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			comisionconfigModel.comisionconfigs=this.comisionconfigLogic.getComisionConfigs();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			comisionconfigModel.comisionconfigs=this.comisionconfigs;
		}
		
		
		((ComisionConfigModel) this.jTableDatosComisionConfig.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaComisionConfig() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getcomisionconfigAnterior(),this.comisionconfigLogic.getComisionConfigs());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getcomisionconfigAnterior(),this.comisionconfigs);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosComisionConfig();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioComisionConfig(ComisionConfig comisionconfig,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(ComisionCate.class)) {
					this.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame.comisioncateLogic.setComisionCates(comisionconfig.getComisionCates());
					this.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame.inicializarActualizarBindingTablaComisionCate(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ComisionMarca.class)) {
					this.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame.comisionmarcaLogic.setComisionMarcas(comisionconfig.getComisionMarcas());
					this.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame.inicializarActualizarBindingTablaComisionMarca(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ComisionLinea.class)) {
					this.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame.comisionlineaLogic.setComisionLineas(comisionconfig.getComisionLineas());
					this.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame.inicializarActualizarBindingTablaComisionLinea(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ComisionPena.class)) {
					this.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame.comisionpenaLogic.setComisionPenas(comisionconfig.getComisionPenas());
					this.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame.inicializarActualizarBindingTablaComisionPena(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ComisionGrupo.class)) {
					this.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame.comisiongrupoLogic.setComisionGrupos(comisionconfig.getComisionGrupos());
					this.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame.inicializarActualizarBindingTablaComisionGrupo(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
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
										
				ComisionConfigBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.comisionconfig,new Object(),generalEntityParameterGeneral,this.comisionconfigReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.comisionconfigSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ComisionConfigConstantesFunciones.getClassesRelationshipsOfComisionConfig(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ComisionConfigConstantesFunciones.getClassesRelationshipsFromStringsOfComisionConfig(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormComisionConfig(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ComisionConfigBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.comisionconfig,new Object(),generalEntityParameterGeneral,this.comisionconfigReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioComisionConfig(ComisionConfigBean comisionconfigBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(ComisionCate.class)) {
					this.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame.comisioncateLogic.setComisionCates(comisionconfig.getComisionCates());
					this.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame.inicializarActualizarBindingTablaComisionCate(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ComisionMarca.class)) {
					this.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame.comisionmarcaLogic.setComisionMarcas(comisionconfig.getComisionMarcas());
					this.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame.inicializarActualizarBindingTablaComisionMarca(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ComisionLinea.class)) {
					this.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame.comisionlineaLogic.setComisionLineas(comisionconfig.getComisionLineas());
					this.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame.inicializarActualizarBindingTablaComisionLinea(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ComisionPena.class)) {
					this.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame.comisionpenaLogic.setComisionPenas(comisionconfig.getComisionPenas());
					this.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame.inicializarActualizarBindingTablaComisionPena(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ComisionGrupo.class)) {
					this.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame.comisiongrupoLogic.setComisionGrupos(comisionconfig.getComisionGrupos());
					this.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame.inicializarActualizarBindingTablaComisionGrupo(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanComisionConfig(ArrayList<Classe> classes,ComisionConfigReturnGeneral comisionconfigReturnGeneral,ComisionConfigBean comisionconfigBean,Boolean conDefault) throws Exception {
		
			this.comisionconfigBean.setComisionCates(comisionconfigReturnGeneral.getComisionConfig().getComisionCates());
			this.comisionconfigBean.setComisionMarcas(comisionconfigReturnGeneral.getComisionConfig().getComisionMarcas());
			this.comisionconfigBean.setComisionLineas(comisionconfigReturnGeneral.getComisionConfig().getComisionLineas());
			this.comisionconfigBean.setComisionPenas(comisionconfigReturnGeneral.getComisionConfig().getComisionPenas());
			this.comisionconfigBean.setComisionGrupos(comisionconfigReturnGeneral.getComisionConfig().getComisionGrupos());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualComisionConfig(ComisionConfig comisionconfig,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(ComisionCate.class)) {
					comisionconfig.setComisionCates(this.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame.comisioncateLogic.getComisionCates());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ComisionMarca.class)) {
					comisionconfig.setComisionMarcas(this.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame.comisionmarcaLogic.getComisionMarcas());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ComisionLinea.class)) {
					comisionconfig.setComisionLineas(this.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame.comisionlineaLogic.getComisionLineas());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ComisionPena.class)) {
					comisionconfig.setComisionPenas(this.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame.comisionpenaLogic.getComisionPenas());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ComisionGrupo.class)) {
					comisionconfig.setComisionGrupos(this.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame.comisiongrupoLogic.getComisionGrupos());
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
		if(!paraTabla && !this.permiteMantenimiento(this.comisionconfig)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormComisionConfig = new ComisionConfigDetalleFormJInternalFrame(jDesktopPane,this.comisionconfigSessionBean.getConGuardarRelaciones(),this.comisionconfigSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormComisionConfig);
		this.jInternalFrameDetalleFormComisionConfig.setVisible(false);
		this.jInternalFrameDetalleFormComisionConfig.setSelected(false);						
		
		this.jInternalFrameDetalleFormComisionConfig.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormComisionConfig.comisionconfigLogic=this.comisionconfigLogic;
		
		this.cargarCombosFrameForeignKeyComisionConfig("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleComisionConfig();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleComisionConfig();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyComisionConfig("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyComisionConfig();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormComisionConfig.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarComisionConfig"));
		
		this.jInternalFrameDetalleFormComisionConfig.jButtonModificarComisionConfig.addActionListener(new ButtonActionListener(this,"ModificarComisionConfig"));

		
		this.jInternalFrameDetalleFormComisionConfig.jButtonModificarToolBarComisionConfig.addActionListener(new ButtonActionListener(this,"ModificarToolBarComisionConfig"));
					
		this.jInternalFrameDetalleFormComisionConfig.jMenuItemModificarComisionConfig.addActionListener(new ButtonActionListener(this,"MenuItemModificarComisionConfig"));		
		
		
		
		this.jInternalFrameDetalleFormComisionConfig.jButtonActualizarComisionConfig.addActionListener (new ButtonActionListener(this,"ActualizarComisionConfig"));
		
		
		this.jInternalFrameDetalleFormComisionConfig.jButtonActualizarToolBarComisionConfig.addActionListener(new ButtonActionListener(this,"ActualizarToolBarComisionConfig"));
						
		this.jInternalFrameDetalleFormComisionConfig.jMenuItemActualizarComisionConfig.addActionListener (new ButtonActionListener(this,"MenuItemActualizarComisionConfig"));		
		
		
		
		this.jInternalFrameDetalleFormComisionConfig.jButtonEliminarComisionConfig.addActionListener (new ButtonActionListener(this,"EliminarComisionConfig"));
		
		
		this.jInternalFrameDetalleFormComisionConfig.jButtonEliminarToolBarComisionConfig.addActionListener (new ButtonActionListener(this,"EliminarToolBarComisionConfig"));
								
		this.jInternalFrameDetalleFormComisionConfig.jMenuItemEliminarComisionConfig.addActionListener (new ButtonActionListener(this,"MenuItemEliminarComisionConfig"));		
		
		
		
		this.jInternalFrameDetalleFormComisionConfig.jButtonCancelarComisionConfig.addActionListener (new ButtonActionListener(this,"CancelarComisionConfig"));
		
		
		this.jInternalFrameDetalleFormComisionConfig.jButtonCancelarToolBarComisionConfig.addActionListener (new ButtonActionListener(this,"CancelarToolBarComisionConfig"));
					
		this.jInternalFrameDetalleFormComisionConfig.jMenuItemCancelarComisionConfig.addActionListener (new ButtonActionListener(this,"MenuItemCancelarComisionConfig"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormComisionConfig.jMenuItemDetalleCerrarComisionConfig.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarComisionConfig"));		
		
		
		
		this.jInternalFrameDetalleFormComisionConfig.jButtonGuardarCambiosToolBarComisionConfig.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarComisionConfig"));
		
		
		
		this.jInternalFrameDetalleFormComisionConfig.jButtonGuardarCambiosToolBarComisionConfig.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarComisionConfig"));
		
		
		
		this.jInternalFrameDetalleFormComisionConfig.jComboBoxTiposAccionesFormularioComisionConfig.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioComisionConfig"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionConfig.jButtonidComisionConfigBusqueda.addActionListener(new ButtonActionListener(this,"idComisionConfigBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionConfig.jButtonid_empresaComisionConfigUpdate.addActionListener(new ButtonActionListener(this,"id_empresaComisionConfigUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionConfig.jButtonid_empresaComisionConfigBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaComisionConfigBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionConfig.jButtonid_tipo_comision_configComisionConfigUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_comision_configComisionConfigUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionConfig.jButtonid_tipo_comision_configComisionConfigBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_comision_configComisionConfigBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionConfig.jButtonid_nivel_lineaComisionConfigUpdate.addActionListener(new ButtonActionListener(this,"id_nivel_lineaComisionConfigUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionConfig.jButtonid_nivel_lineaComisionConfigBusqueda.addActionListener(new ButtonActionListener(this,"id_nivel_lineaComisionConfigBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionConfig.jButtoncon_vendedorComisionConfigBusqueda.addActionListener(new ButtonActionListener(this,"con_vendedorComisionConfigBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionConfig.jButtoncon_ventasComisionConfigBusqueda.addActionListener(new ButtonActionListener(this,"con_ventasComisionConfigBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionConfig.jButtoncon_cobrosComisionConfigBusqueda.addActionListener(new ButtonActionListener(this,"con_cobrosComisionConfigBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionConfig.jButtoncon_remesa_transitoComisionConfigBusqueda.addActionListener(new ButtonActionListener(this,"con_remesa_transitoComisionConfigBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionConfig.jButtoncon_penalidadComisionConfigBusqueda.addActionListener(new ButtonActionListener(this,"con_penalidadComisionConfigBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionConfig.jButtoncon_abonoComisionConfigBusqueda.addActionListener(new ButtonActionListener(this,"con_abonoComisionConfigBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormComisionConfig.jTabbedPaneRelacionesComisionConfig.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesComisionConfig"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameComisionConfig"));
		
		if(this.jInternalFrameDetalleFormComisionConfig!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisionConfig.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarComisionConfig"));
		}
		
		this.jTableDatosComisionConfig.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarComisionConfig"));
		
		this.jTableDatosComisionConfig.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarComisionConfig"));
		
		this.jButtonNuevoComisionConfig.addActionListener(new ButtonActionListener(this,"NuevoComisionConfig"));
		
		this.jButtonDuplicarComisionConfig.addActionListener(new ButtonActionListener(this,"DuplicarComisionConfig"));
		
		this.jButtonCopiarComisionConfig.addActionListener(new ButtonActionListener(this,"CopiarComisionConfig"));
		
		this.jButtonVerFormComisionConfig.addActionListener(new ButtonActionListener(this,"VerFormComisionConfig"));
		
		
		this.jButtonNuevoToolBarComisionConfig.addActionListener(new ButtonActionListener(this,"NuevoToolBarComisionConfig"));
			
		this.jButtonDuplicarToolBarComisionConfig.addActionListener(new ButtonActionListener(this,"DuplicarToolBarComisionConfig"));
			
		this.jMenuItemNuevoComisionConfig.addActionListener (new ButtonActionListener(this,"MenuItemNuevoComisionConfig"));
			
		this.jMenuItemDuplicarComisionConfig.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarComisionConfig"));		
		
		
		this.jButtonNuevoRelacionesComisionConfig.addActionListener (new ButtonActionListener(this,"NuevoRelacionesComisionConfig"));
		
		
		this.jButtonNuevoRelacionesToolBarComisionConfig.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarComisionConfig"));
			
		this.jMenuItemNuevoRelacionesComisionConfig.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesComisionConfig"));		
		
		
		if(this.jInternalFrameDetalleFormComisionConfig!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisionConfig.jButtonModificarComisionConfig.addActionListener(new ButtonActionListener(this,"ModificarComisionConfig"));
		}
		
		
		if(this.jInternalFrameDetalleFormComisionConfig!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisionConfig.jButtonModificarToolBarComisionConfig.addActionListener(new ButtonActionListener(this,"ModificarToolBarComisionConfig"));
			
			this.jInternalFrameDetalleFormComisionConfig.jMenuItemModificarComisionConfig.addActionListener(new ButtonActionListener(this,"MenuItemModificarComisionConfig"));		
		}
		
		
		if(this.jInternalFrameDetalleFormComisionConfig!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormComisionConfig.jButtonActualizarComisionConfig.addActionListener (new ButtonActionListener(this,"ActualizarComisionConfig"));
		}
		
		
		if(this.jInternalFrameDetalleFormComisionConfig!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisionConfig.jButtonActualizarToolBarComisionConfig.addActionListener(new ButtonActionListener(this,"ActualizarToolBarComisionConfig"));
				
			this.jInternalFrameDetalleFormComisionConfig.jMenuItemActualizarComisionConfig.addActionListener (new ButtonActionListener(this,"MenuItemActualizarComisionConfig"));		
		}
		
		
		if(this.jInternalFrameDetalleFormComisionConfig!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisionConfig.jButtonEliminarComisionConfig.addActionListener (new ButtonActionListener(this,"EliminarComisionConfig"));
		}
		
		
		if(this.jInternalFrameDetalleFormComisionConfig!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisionConfig.jButtonEliminarToolBarComisionConfig.addActionListener (new ButtonActionListener(this,"EliminarToolBarComisionConfig"));
						
			this.jInternalFrameDetalleFormComisionConfig.jMenuItemEliminarComisionConfig.addActionListener (new ButtonActionListener(this,"MenuItemEliminarComisionConfig"));		
		}
		
		
		if(this.jInternalFrameDetalleFormComisionConfig!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisionConfig.jButtonCancelarComisionConfig.addActionListener (new ButtonActionListener(this,"CancelarComisionConfig"));
		}
		
		
		if(this.jInternalFrameDetalleFormComisionConfig!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisionConfig.jButtonCancelarToolBarComisionConfig.addActionListener (new ButtonActionListener(this,"CancelarToolBarComisionConfig"));
			
			this.jInternalFrameDetalleFormComisionConfig.jMenuItemCancelarComisionConfig.addActionListener (new ButtonActionListener(this,"MenuItemCancelarComisionConfig"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarComisionConfig.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarComisionConfig"));		
		
		
		this.jButtonCerrarComisionConfig.addActionListener (new ButtonActionListener(this,"CerrarComisionConfig"));
		
		
		this.jButtonCerrarToolBarComisionConfig.addActionListener (new ButtonActionListener(this,"CerrarToolBarComisionConfig"));
			
		this.jMenuItemCerrarComisionConfig.addActionListener (new ButtonActionListener(this,"MenuItemCerrarComisionConfig"));
			
		if(this.jInternalFrameDetalleFormComisionConfig!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisionConfig.jMenuItemDetalleCerrarComisionConfig.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarComisionConfig"));		
		}
		
		
		if(this.jInternalFrameDetalleFormComisionConfig!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisionConfig.jButtonGuardarCambiosComisionConfig.addActionListener (new ButtonActionListener(this,"GuardarCambiosComisionConfig"));
		}
		
		
		if(this.jInternalFrameDetalleFormComisionConfig!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisionConfig.jButtonGuardarCambiosToolBarComisionConfig.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarComisionConfig"));
		}
		
		this.jButtonCopiarToolBarComisionConfig.addActionListener (new ButtonActionListener(this,"CopiarToolBarComisionConfig"));
			
		this.jButtonVerFormToolBarComisionConfig.addActionListener (new ButtonActionListener(this,"VerFormToolBarComisionConfig"));
		
		this.jMenuItemGuardarCambiosComisionConfig.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosComisionConfig"));
			
		this.jMenuItemCopiarComisionConfig.addActionListener (new ButtonActionListener(this,"MenuItemCopiarComisionConfig"));		
		
		this.jMenuItemVerFormComisionConfig.addActionListener (new ButtonActionListener(this,"MenuItemVerFormComisionConfig"));		
		
		
		this.jButtonGuardarCambiosTablaComisionConfig.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaComisionConfig"));
		
		
		this.jButtonGuardarCambiosTablaToolBarComisionConfig.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarComisionConfig"));
			
		this.jMenuItemGuardarCambiosTablaComisionConfig.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaComisionConfig"));		
		
		
		
		this.jButtonRecargarInformacionComisionConfig.addActionListener (new ButtonActionListener(this,"RecargarInformacionComisionConfig"));
					
		this.jButtonRecargarInformacionToolBarComisionConfig.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarComisionConfig"));
		
		this.jMenuItemRecargarInformacionComisionConfig.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionComisionConfig"));		
		
		
		
		this.jButtonAnterioresComisionConfig.addActionListener (new ButtonActionListener(this,"AnterioresComisionConfig"));
		
		
		this.jButtonAnterioresToolBarComisionConfig.addActionListener (new ButtonActionListener(this,"AnterioresToolBarComisionConfig"));
		
		this.jMenuItemAnterioresComisionConfig.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresComisionConfig"));		
		
		
		this.jButtonSiguientesComisionConfig.addActionListener (new ButtonActionListener(this,"SiguientesComisionConfig"));
		
		
		this.jButtonSiguientesToolBarComisionConfig.addActionListener (new ButtonActionListener(this,"SiguientesToolBarComisionConfig"));
			
		this.jMenuItemSiguientesComisionConfig.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesComisionConfig"));
			
		this.jMenuItemAbrirOrderByComisionConfig.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByComisionConfig"));
			
		this.jMenuItemMostrarOcultarComisionConfig.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarComisionConfig"));
			
		this.jMenuItemDetalleAbrirOrderByComisionConfig.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByComisionConfig"));
			
		this.jMenuItemDetalleMostarOcultarComisionConfig.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarComisionConfig"));		
		
		
		this.jButtonNuevoGuardarCambiosComisionConfig.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosComisionConfig"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarComisionConfig.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarComisionConfig"));
			
		this.jMenuItemNuevoGuardarCambiosComisionConfig.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosComisionConfig"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosComisionConfig.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosComisionConfig"));

		this.jCheckBoxSeleccionadosComisionConfig.addItemListener(new CheckBoxItemListener(this,"SeleccionadosComisionConfig"));
		
		if(this.jInternalFrameDetalleFormComisionConfig!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisionConfig.jComboBoxTiposAccionesFormularioComisionConfig.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioComisionConfig"));
		}
		
		
		this.jComboBoxTiposRelacionesComisionConfig.addActionListener (new ButtonActionListener(this,"TiposRelacionesComisionConfig"));
			
		this.jComboBoxTiposAccionesComisionConfig.addActionListener (new ButtonActionListener(this,"TiposAccionesComisionConfig"));
					
		this.jComboBoxTiposSeleccionarComisionConfig.addActionListener (new ButtonActionListener(this,"TiposSeleccionarComisionConfig"));
			
		this.jTextFieldValorCampoGeneralComisionConfig.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralComisionConfig"));		
		
		
		if(this.jInternalFrameDetalleFormComisionConfig!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionConfig.jButtonidComisionConfigBusqueda.addActionListener(new ButtonActionListener(this,"idComisionConfigBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionConfig.jButtonid_empresaComisionConfigUpdate.addActionListener(new ButtonActionListener(this,"id_empresaComisionConfigUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionConfig.jButtonid_empresaComisionConfigBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaComisionConfigBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionConfig.jButtonid_tipo_comision_configComisionConfigUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_comision_configComisionConfigUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionConfig.jButtonid_tipo_comision_configComisionConfigBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_comision_configComisionConfigBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionConfig.jButtonid_nivel_lineaComisionConfigUpdate.addActionListener(new ButtonActionListener(this,"id_nivel_lineaComisionConfigUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionConfig.jButtonid_nivel_lineaComisionConfigBusqueda.addActionListener(new ButtonActionListener(this,"id_nivel_lineaComisionConfigBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionConfig.jButtoncon_vendedorComisionConfigBusqueda.addActionListener(new ButtonActionListener(this,"con_vendedorComisionConfigBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionConfig.jButtoncon_ventasComisionConfigBusqueda.addActionListener(new ButtonActionListener(this,"con_ventasComisionConfigBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionConfig.jButtoncon_cobrosComisionConfigBusqueda.addActionListener(new ButtonActionListener(this,"con_cobrosComisionConfigBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionConfig.jButtoncon_remesa_transitoComisionConfigBusqueda.addActionListener(new ButtonActionListener(this,"con_remesa_transitoComisionConfigBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionConfig.jButtoncon_penalidadComisionConfigBusqueda.addActionListener(new ButtonActionListener(this,"con_penalidadComisionConfigBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionConfig.jButtoncon_abonoComisionConfigBusqueda.addActionListener(new ButtonActionListener(this,"con_abonoComisionConfigBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdNivelLineaComisionConfig.addActionListener(new ButtonActionListener(this,"FK_IdNivelLineaComisionConfig"));

			this.jButtonFK_IdTipoComisionConfigComisionConfig.addActionListener(new ButtonActionListener(this,"FK_IdTipoComisionConfigComisionConfig"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoComisionConfig!=null) {
				this.jInternalFrameReporteDinamicoComisionConfig.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoComisionConfig"));
				this.jInternalFrameReporteDinamicoComisionConfig.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoComisionConfig"));
				this.jInternalFrameReporteDinamicoComisionConfig.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoComisionConfig"));
			}
			
			//this.jButtonCerrarReporteDinamicoComisionConfig.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoComisionConfig"));				
			//this.jButtonGenerarReporteDinamicoComisionConfig.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoComisionConfig"));
			//this.jButtonGenerarExcelReporteDinamicoComisionConfig.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoComisionConfig"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionComisionConfig!=null) {
				this.jInternalFrameImportacionComisionConfig.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionComisionConfig"));
				this.jInternalFrameImportacionComisionConfig.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionComisionConfig"));
				this.jInternalFrameImportacionComisionConfig.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionComisionConfig"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByComisionConfig.addActionListener (new ButtonActionListener(this,"AbrirOrderByComisionConfig"));
			
			this.jButtonAbrirOrderByToolBarComisionConfig.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarComisionConfig"));			
			
			if(this.jInternalFrameOrderByComisionConfig!=null) {
				this.jInternalFrameOrderByComisionConfig.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByComisionConfig"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormComisionConfig!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormComisionConfig!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisionConfig.jTabbedPaneRelacionesComisionConfig.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesComisionConfig"));
		
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
            		closingInternalFrameComisionConfig();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormComisionConfig.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormComisionConfig = (JInternalFrameBase)event.getSource();
	            	
	            ComisionConfigBeanSwingJInternalFrame jInternalFrameParent=(ComisionConfigBeanSwingJInternalFrame)jInternalFrameDetalleFormComisionConfig.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarComisionConfigActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosComisionConfig.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosComisionConfigListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosComisionConfig.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosComisionConfig.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoComisionConfig.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoComisionConfigActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarComisionConfig.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoComisionConfigActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoComisionConfig.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoComisionConfigActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoComisionConfig";
		inputMap = this.jButtonNuevoComisionConfig.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoComisionConfig.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoComisionConfigActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesComisionConfig.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoComisionConfigActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarComisionConfig.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoComisionConfigActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesComisionConfig.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoComisionConfigActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesComisionConfig";
		inputMap = this.jButtonNuevoRelacionesComisionConfig.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesComisionConfig.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoComisionConfigActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarComisionConfig.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarComisionConfigActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarComisionConfig.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarComisionConfigActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarComisionConfig.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarComisionConfigActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarComisionConfig";
		inputMap = this.jButtonModificarComisionConfig.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarComisionConfig.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarComisionConfigActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarComisionConfig.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarComisionConfigActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarComisionConfig.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarComisionConfigActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarComisionConfig.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarComisionConfigActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarComisionConfig";
		inputMap = this.jButtonActualizarComisionConfig.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarComisionConfig.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarComisionConfigActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarComisionConfig.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarComisionConfigActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarComisionConfig.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarComisionConfigActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarComisionConfig.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarComisionConfigActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarComisionConfig";
		inputMap = this.jButtonEliminarComisionConfig.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarComisionConfig.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarComisionConfigActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarComisionConfig.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarComisionConfigActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarComisionConfig.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarComisionConfigActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarComisionConfig.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarComisionConfigActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarComisionConfig";
		inputMap = this.jButtonCancelarComisionConfig.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarComisionConfig.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarComisionConfigActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarComisionConfig.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarComisionConfigActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarComisionConfig.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarComisionConfigActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarComisionConfig.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarComisionConfigActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarComisionConfig.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarComisionConfigActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarComisionConfigActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarComisionConfig";
		inputMap = this.jButtonCerrarComisionConfig.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarComisionConfig.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarComisionConfigActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormComisionConfig.jButtonGuardarCambiosComisionConfig.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosComisionConfigActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarComisionConfig.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosComisionConfigActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosComisionConfig.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosComisionConfigActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaComisionConfig.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosComisionConfigActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarComisionConfig.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosComisionConfigActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaComisionConfig.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosComisionConfigActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosComisionConfig";
		inputMap = this.jInternalFrameDetalleFormComisionConfig.jButtonGuardarCambiosComisionConfig.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormComisionConfig.jButtonGuardarCambiosComisionConfig.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosComisionConfigActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionComisionConfig.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionComisionConfigActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarComisionConfig.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionComisionConfigActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionComisionConfig.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionComisionConfigActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresComisionConfig.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresComisionConfigActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarComisionConfig.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresComisionConfigActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresComisionConfig.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresComisionConfigActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesComisionConfig.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesComisionConfigActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarComisionConfig.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesComisionConfigActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesComisionConfig.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesComisionConfigActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosComisionConfig.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosComisionConfigActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarComisionConfig.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosComisionConfigActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosComisionConfig.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosComisionConfigActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosComisionConfig.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosComisionConfigItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesComisionConfig.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesComisionConfigActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarComisionConfig.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarComisionConfigActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralComisionConfig.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralComisionConfigActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionConfig.jButtonidComisionConfigBusqueda.addActionListener(new ButtonActionListener(this,"idComisionConfigBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionConfig.jButtonid_empresaComisionConfigUpdate.addActionListener(new ButtonActionListener(this,"id_empresaComisionConfigUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionConfig.jButtonid_empresaComisionConfigBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaComisionConfigBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionConfig.jButtonid_tipo_comision_configComisionConfigUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_comision_configComisionConfigUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionConfig.jButtonid_tipo_comision_configComisionConfigBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_comision_configComisionConfigBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionConfig.jButtonid_nivel_lineaComisionConfigUpdate.addActionListener(new ButtonActionListener(this,"id_nivel_lineaComisionConfigUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionConfig.jButtonid_nivel_lineaComisionConfigBusqueda.addActionListener(new ButtonActionListener(this,"id_nivel_lineaComisionConfigBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionConfig.jButtoncon_vendedorComisionConfigBusqueda.addActionListener(new ButtonActionListener(this,"con_vendedorComisionConfigBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionConfig.jButtoncon_ventasComisionConfigBusqueda.addActionListener(new ButtonActionListener(this,"con_ventasComisionConfigBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionConfig.jButtoncon_cobrosComisionConfigBusqueda.addActionListener(new ButtonActionListener(this,"con_cobrosComisionConfigBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionConfig.jButtoncon_remesa_transitoComisionConfigBusqueda.addActionListener(new ButtonActionListener(this,"con_remesa_transitoComisionConfigBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionConfig.jButtoncon_penalidadComisionConfigBusqueda.addActionListener(new ButtonActionListener(this,"con_penalidadComisionConfigBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionConfig.jButtoncon_abonoComisionConfigBusqueda.addActionListener(new ButtonActionListener(this,"con_abonoComisionConfigBusqueda"));
		
		
		this.jButtonFK_IdNivelLineaComisionConfig.addActionListener(new ButtonActionListener(this,"FK_IdNivelLineaComisionConfig"));

		this.jButtonFK_IdTipoComisionConfigComisionConfig.addActionListener(new ButtonActionListener(this,"FK_IdTipoComisionConfigComisionConfig"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoComisionConfig.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoComisionConfigActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoComisionConfig.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoComisionConfigActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoComisionConfig.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoComisionConfigActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionComisionConfig.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionComisionConfigActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionComisionConfig.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionComisionConfigActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionComisionConfig.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionComisionConfigActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarComisionConfigActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarComisionConfig.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosComisionConfig(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ComisionConfig comisionconfigAux:this.comisionconfigLogic.getComisionConfigs()) {
					comisionconfigAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ComisionConfig comisionconfigAux:comisionconfigs) {
					comisionconfigAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosComisionConfigItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingComisionConfig(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ComisionConfig comisionconfigAux:this.comisionconfigLogic.getComisionConfigs()) {
						comisionconfigAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ComisionConfig comisionconfigAux:comisionconfigs) {
						comisionconfigAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ComisionConfig comisionconfigAux:this.comisionconfigLogic.getComisionConfigs()) {
					
						if(sTipoSeleccionar.equals(ComisionConfigConstantesFunciones.LABEL_CONVENDEDOR)) {
							existe=true;
							comisionconfigAux.setcon_vendedor(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(ComisionConfigConstantesFunciones.LABEL_CONVENTAS)) {
							existe=true;
							comisionconfigAux.setcon_ventas(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(ComisionConfigConstantesFunciones.LABEL_CONCOBROS)) {
							existe=true;
							comisionconfigAux.setcon_cobros(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(ComisionConfigConstantesFunciones.LABEL_CONREMESATRANSITO)) {
							existe=true;
							comisionconfigAux.setcon_remesa_transito(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(ComisionConfigConstantesFunciones.LABEL_CONPENALIDAD)) {
							existe=true;
							comisionconfigAux.setcon_penalidad(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(ComisionConfigConstantesFunciones.LABEL_CONABONO)) {
							existe=true;
							comisionconfigAux.setcon_abono(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ComisionConfig comisionconfigAux:comisionconfigs) {
						
						if(sTipoSeleccionar.equals(ComisionConfigConstantesFunciones.LABEL_CONVENDEDOR)) {
							existe=true;
							comisionconfigAux.setcon_vendedor(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(ComisionConfigConstantesFunciones.LABEL_CONVENTAS)) {
							existe=true;
							comisionconfigAux.setcon_ventas(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(ComisionConfigConstantesFunciones.LABEL_CONCOBROS)) {
							existe=true;
							comisionconfigAux.setcon_cobros(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(ComisionConfigConstantesFunciones.LABEL_CONREMESATRANSITO)) {
							existe=true;
							comisionconfigAux.setcon_remesa_transito(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(ComisionConfigConstantesFunciones.LABEL_CONPENALIDAD)) {
							existe=true;
							comisionconfigAux.setcon_penalidad(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(ComisionConfigConstantesFunciones.LABEL_CONABONO)) {
							existe=true;
							comisionconfigAux.setcon_abono(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaComisionConfig(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosComisionConfig.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosComisionConfig.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosComisionConfig,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosComisionConfigItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingComisionConfig(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosComisionConfig.getSelectedRows();
			
			ComisionConfig comisionconfigLocal=new ComisionConfig();
			
			//this.seleccionarTodosComisionConfig(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					comisionconfigLocal =(ComisionConfig) this.comisionconfigLogic.getComisionConfigs().toArray()[this.jTableDatosComisionConfig.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					comisionconfigLocal =(ComisionConfig) this.comisionconfigs.toArray()[this.jTableDatosComisionConfig.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				comisionconfigLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ComisionConfig comisionconfigAux:this.comisionconfigLogic.getComisionConfigs()) {
						comisionconfigAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ComisionConfig comisionconfigAux:comisionconfigs) {
						comisionconfigAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaComisionConfig(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosComisionConfig.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosComisionConfig.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosComisionConfig,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualComisionConfigItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarComisionConfigParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralComisionConfigActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingComisionConfig(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralComisionConfig.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ComisionConfig comisionconfigAux:this.comisionconfigLogic.getComisionConfigs()) {
				
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ComisionConfig comisionconfigAux:comisionconfigs) {
					
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaComisionConfig(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesComisionConfigActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingComisionConfig(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioComisionConfig=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesComisionConfig.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormComisionConfig.jComboBoxTiposAccionesFormularioComisionConfig.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteComisionConfig) {				
					conSplash=true;//false;										
					
					//this.startProcessComisionConfig(conSplash);
				
					this.generarReporteComisionConfigsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesComisionConfig.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormComisionConfig.jComboBoxTiposAccionesFormularioComisionConfig.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoComisionConfigsSeleccionados();
				//this.jComboBoxTiposAccionesComisionConfig.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoComisionConfigsSeleccionados(false);
				//this.jComboBoxTiposAccionesComisionConfig.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoComisionConfigsSeleccionados(true);
				//this.jComboBoxTiposAccionesComisionConfig.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessComisionConfig();
				
				this.exportarComisionConfigsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesComisionConfig.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormComisionConfig.jComboBoxTiposAccionesFormularioComisionConfig.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionComisionConfigs();
				//this.importarComisionConfigs();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesComisionConfig.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormComisionConfig.jComboBoxTiposAccionesFormularioComisionConfig.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessComisionConfig();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelComisionConfigsSeleccionados();
				//this.jComboBoxTiposAccionesComisionConfig.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Comision Config", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessComisionConfig();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoComisionConfig)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyComisionConfig(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Comision Config",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesComisionConfig.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormComisionConfig.jComboBoxTiposAccionesFormularioComisionConfig.setSelectedIndex(0);					
				}	
			} 			
			else if(ComisionConfigBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteComisionConfig) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessComisionConfig(conSplash);
					
						//this.actualizarParametrosGeneralComisionConfig();
						
						this.generarReporteProcesoAccionComisionConfigsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesComisionConfig.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormComisionConfig.jComboBoxTiposAccionesFormularioComisionConfig.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ComisionConfigBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Comision ConfigES SELECCIONADOS?", "MANTENIMIENTO DE Comision Config", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessComisionConfig();
				
						this.actualizarParametrosGeneralComisionConfig();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.comisionconfigReturnGeneral=comisionconfigLogic.procesarAccionComisionConfigsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.comisionconfigLogic.getComisionConfigs(),this.comisionconfigParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarComisionConfigReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesComisionConfig.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormComisionConfig.jComboBoxTiposAccionesFormularioComisionConfig.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralComisionConfig();
					
					ComisionConfigBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarComisionConfigReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesComisionConfig.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormComisionConfig.jComboBoxTiposAccionesFormularioComisionConfig.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessComisionConfig(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesComisionConfigActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessComisionConfig();
			
			if(this.jInternalFrameDetalleFormComisionConfig==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ComisionConfig> comisionconfigsSeleccionados=new ArrayList<ComisionConfig>();		
			ComisionConfig comisionconfig=new ComisionConfig();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingComisionConfig(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesComisionConfig.getSelectedItem();
			
			
			
			
			comisionconfigsSeleccionados=this.getComisionConfigsSeleccionados(true);
			//this.sTipoAccion;
			
			if(comisionconfigsSeleccionados.size()==1) {
				for(ComisionConfig comisionconfigAux:comisionconfigsSeleccionados) {
					comisionconfig=comisionconfigAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Comision Cate")) {
					jButtonComisionCateActionPerformed(null,rowIndex,true,false,comisionconfig);
				}
				else if(this.sTipoRelacion.equals("Comision Marca")) {
					jButtonComisionMarcaActionPerformed(null,rowIndex,true,false,comisionconfig);
				}
				else if(this.sTipoRelacion.equals("Comision Linea")) {
					jButtonComisionLineaActionPerformed(null,rowIndex,true,false,comisionconfig);
				}
				else if(this.sTipoRelacion.equals("Penalidad Comision")) {
					jButtonComisionPenaActionPerformed(null,rowIndex,true,false,comisionconfig);
				}
				else if(this.sTipoRelacion.equals("Comision Grupo")) {
					jButtonComisionGrupoActionPerformed(null,rowIndex,true,false,comisionconfig);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessComisionConfig();
			
      		//this.finishProcessComisionConfig(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarComisionConfigReturnGeneral() throws Exception {
		if(this.comisionconfigReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.comisionconfigReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.comisionconfigReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.comisionconfigReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.comisionconfigReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.comisionconfigReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingComisionConfig(false);
		}
		
		if(this.comisionconfigReturnGeneral.getConRetornoLista() || this.comisionconfigReturnGeneral.getConRetornoObjeto()) {
			if(this.comisionconfigReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.comisionconfigLogic.setComisionConfigs(this.comisionconfigReturnGeneral.getComisionConfigs());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.comisionconfigReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.comisionconfigLogic.setComisionConfig(this.comisionconfigReturnGeneral.getComisionConfig());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingComisionConfig(false);
		}
	}
	
	public void actualizarParametrosGeneralComisionConfig() throws Exception {
		
		
	}
	
	public ArrayList<ComisionConfig> getComisionConfigsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ComisionConfig> comisionconfigsSeleccionados=new ArrayList<ComisionConfig>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioComisionConfig) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ComisionConfig comisionconfigAux:comisionconfigLogic.getComisionConfigs()) {
					if(comisionconfigAux.getIsSelected()) {
						comisionconfigsSeleccionados.add(comisionconfigAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ComisionConfig comisionconfigAux:this.comisionconfigs) {
					if(comisionconfigAux.getIsSelected()) {
						comisionconfigsSeleccionados.add(comisionconfigAux);				
					}
				}
			}
			
			if(comisionconfigsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						comisionconfigsSeleccionados.addAll(this.comisionconfigLogic.getComisionConfigs());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						comisionconfigsSeleccionados.addAll(this.comisionconfigs);				
					}
				}
			}
		} else {
			comisionconfigsSeleccionados.add(this.comisionconfig);
		}
		
		return comisionconfigsSeleccionados;
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
	
	public void generarReporteComisionConfigsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalComisionConfigsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoComisionConfigsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoComisionConfigsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoComisionConfigsSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesComisionConfigsSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Comision Config",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesComisionConfigsSeleccionados() throws Exception {
		ArrayList<ComisionConfig> comisionconfigsSeleccionados=new ArrayList<ComisionConfig>();		
		
		comisionconfigsSeleccionados=this.getComisionConfigsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteComisionConfigs("Todos",comisionconfigsSeleccionados);
		
	}	
	
	public void generarReporteNormalComisionConfigsSeleccionados() throws Exception {
		ArrayList<ComisionConfig> comisionconfigsSeleccionados=new ArrayList<ComisionConfig>();		
		
		comisionconfigsSeleccionados=this.getComisionConfigsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteComisionConfigs("Todos",comisionconfigsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionComisionConfigsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ComisionConfig> comisionconfigsSeleccionados=new ArrayList<ComisionConfig>();
		
		comisionconfigsSeleccionados=this.getComisionConfigsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteComisionConfigs("Todos",comisionconfigsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoComisionConfigsSeleccionados() throws Exception {
		ArrayList<ComisionConfig> comisionconfigsSeleccionados=new ArrayList<ComisionConfig>();		
		
		
		this.abrirInicializarFrameReporteDinamicoComisionConfig();
		
		
		comisionconfigsSeleccionados=this.getComisionConfigsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoComisionConfig();
		
		
		//this.generarReporteComisionConfigs("Todos",comisionconfigsSeleccionados ,comisionconfigImplementable,comisionconfigImplementableHome);
	}
	
	public void mostrarImportacionComisionConfigs() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionComisionConfig();
		
		this.abrirFrameImportacionComisionConfig();		
		
			
		//this.generarReporteComisionConfigs("Todos",comisionconfigsSeleccionados ,comisionconfigImplementable,comisionconfigImplementableHome);
	}
	
	public void importarComisionConfigs() throws Exception {		
	
	}
	
	public void exportarComisionConfigsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelComisionConfigsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoComisionConfigsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlComisionConfigsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Comision Config",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoComisionConfigsSeleccionados() throws Exception {
		ArrayList<ComisionConfig> comisionconfigsSeleccionados=new ArrayList<ComisionConfig>();		
		
		comisionconfigsSeleccionados=this.getComisionConfigsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"comisionconfig."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarComisionConfig(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ComisionConfig comisionconfigAux:comisionconfigsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarComisionConfig(comisionconfigAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//comisionconfigAux.setsDetalleGeneralEntityReporte(comisionconfigAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comisionconfigSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comision Config",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarComisionConfig(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ComisionConfigConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComisionConfigConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComisionConfigConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComisionConfigConstantesFunciones.LABEL_IDTIPOCOMISIONCONFIG;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComisionConfigConstantesFunciones.LABEL_IDNIVELLINEA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComisionConfigConstantesFunciones.LABEL_CONVENDEDOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComisionConfigConstantesFunciones.LABEL_CONVENTAS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComisionConfigConstantesFunciones.LABEL_CONCOBROS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComisionConfigConstantesFunciones.LABEL_CONREMESATRANSITO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComisionConfigConstantesFunciones.LABEL_CONPENALIDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComisionConfigConstantesFunciones.LABEL_CONABONO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarComisionConfig(ComisionConfig comisionconfig,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=comisionconfig.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=comisionconfig.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=comisionconfig.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comisionconfig.gettipocomisionconfig_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comisionconfig.getnivellinea_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comisionconfig.getcon_vendedor().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comisionconfig.getcon_ventas().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comisionconfig.getcon_cobros().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comisionconfig.getcon_remesa_transito().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comisionconfig.getcon_penalidad().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comisionconfig.getcon_abono().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelComisionConfigsSeleccionados() throws Exception {
		ArrayList<ComisionConfig> comisionconfigsSeleccionados=new ArrayList<ComisionConfig>();		
		
		comisionconfigsSeleccionados=this.getComisionConfigsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"comisionconfig.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ComisionConfigs");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelComisionConfig(row);				
				iRow++;
			}				
			
			for(ComisionConfig comisionconfigAux:comisionconfigsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelComisionConfig(comisionconfigAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comisionconfigSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comision Config",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlComisionConfigsSeleccionados() throws Exception {
		ArrayList<ComisionConfig> comisionconfigsSeleccionados=new ArrayList<ComisionConfig>();		
		
		comisionconfigsSeleccionados=this.getComisionConfigsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"comisionconfig.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("comisionconfigs");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("comisionconfig");
			//elementRoot.appendChild(element);
		
			for(ComisionConfig comisionconfigAux:comisionconfigsSeleccionados) {
				element = document.createElement("comisionconfig");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlComisionConfig(comisionconfigAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comisionconfigSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comision Config",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelComisionConfig(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ComisionConfigConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ComisionConfigConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ComisionConfigConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ComisionConfigConstantesFunciones.LABEL_IDTIPOCOMISIONCONFIG);
		cell = row.createCell(iColumn++);cell.setCellValue(ComisionConfigConstantesFunciones.LABEL_IDNIVELLINEA);
		cell = row.createCell(iColumn++);cell.setCellValue(ComisionConfigConstantesFunciones.LABEL_CONVENDEDOR);
		cell = row.createCell(iColumn++);cell.setCellValue(ComisionConfigConstantesFunciones.LABEL_CONVENTAS);
		cell = row.createCell(iColumn++);cell.setCellValue(ComisionConfigConstantesFunciones.LABEL_CONCOBROS);
		cell = row.createCell(iColumn++);cell.setCellValue(ComisionConfigConstantesFunciones.LABEL_CONREMESATRANSITO);
		cell = row.createCell(iColumn++);cell.setCellValue(ComisionConfigConstantesFunciones.LABEL_CONPENALIDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(ComisionConfigConstantesFunciones.LABEL_CONABONO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelComisionConfig(ComisionConfig comisionconfig,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(comisionconfig.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(comisionconfig.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(comisionconfig.gettipocomisionconfig_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(comisionconfig.getnivellinea_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(comisionconfig.getcon_vendedor());
		cell = row.createCell(iColumn++);cell.setCellValue(comisionconfig.getcon_ventas());
		cell = row.createCell(iColumn++);cell.setCellValue(comisionconfig.getcon_cobros());
		cell = row.createCell(iColumn++);cell.setCellValue(comisionconfig.getcon_remesa_transito());
		cell = row.createCell(iColumn++);cell.setCellValue(comisionconfig.getcon_penalidad());
		cell = row.createCell(iColumn++);cell.setCellValue(comisionconfig.getcon_abono());				
	}
	
	public void setFilaDatosExportarXmlComisionConfig(ComisionConfig comisionconfig,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ComisionConfigConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(comisionconfig.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ComisionConfigConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(comisionconfig.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ComisionConfigConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(comisionconfig.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementtipocomisionconfig_descripcion = document.createElement(ComisionConfigConstantesFunciones.IDTIPOCOMISIONCONFIG);
		elementtipocomisionconfig_descripcion.appendChild(document.createTextNode(comisionconfig.gettipocomisionconfig_descripcion()));
		element.appendChild(elementtipocomisionconfig_descripcion);

		Element elementnivellinea_descripcion = document.createElement(ComisionConfigConstantesFunciones.IDNIVELLINEA);
		elementnivellinea_descripcion.appendChild(document.createTextNode(comisionconfig.getnivellinea_descripcion()));
		element.appendChild(elementnivellinea_descripcion);

		Element elementcon_vendedor = document.createElement(ComisionConfigConstantesFunciones.CONVENDEDOR);
		elementcon_vendedor.appendChild(document.createTextNode(comisionconfig.getcon_vendedor().toString().trim()));
		element.appendChild(elementcon_vendedor);

		Element elementcon_ventas = document.createElement(ComisionConfigConstantesFunciones.CONVENTAS);
		elementcon_ventas.appendChild(document.createTextNode(comisionconfig.getcon_ventas().toString().trim()));
		element.appendChild(elementcon_ventas);

		Element elementcon_cobros = document.createElement(ComisionConfigConstantesFunciones.CONCOBROS);
		elementcon_cobros.appendChild(document.createTextNode(comisionconfig.getcon_cobros().toString().trim()));
		element.appendChild(elementcon_cobros);

		Element elementcon_remesa_transito = document.createElement(ComisionConfigConstantesFunciones.CONREMESATRANSITO);
		elementcon_remesa_transito.appendChild(document.createTextNode(comisionconfig.getcon_remesa_transito().toString().trim()));
		element.appendChild(elementcon_remesa_transito);

		Element elementcon_penalidad = document.createElement(ComisionConfigConstantesFunciones.CONPENALIDAD);
		elementcon_penalidad.appendChild(document.createTextNode(comisionconfig.getcon_penalidad().toString().trim()));
		element.appendChild(elementcon_penalidad);

		Element elementcon_abono = document.createElement(ComisionConfigConstantesFunciones.CONABONO);
		elementcon_abono.appendChild(document.createTextNode(comisionconfig.getcon_abono().toString().trim()));
		element.appendChild(elementcon_abono);
	}
	
	public void generarReporteGroupGenericoComisionConfigsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ComisionConfig> comisionconfigsSeleccionados=new ArrayList<ComisionConfig>();
		
		comisionconfigsSeleccionados=this.getComisionConfigsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoComisionConfig(comisionconfigsSeleccionados);
		
		this.generarReporteComisionConfigs("Todos",comisionconfigsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoComisionConfig(ArrayList<ComisionConfig> comisionconfigsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ComisionConfig comisionconfigAux:comisionconfigsSeleccionados) {
				comisionconfigAux.setsDetalleGeneralEntityReporte(comisionconfigAux.toString());
			
				if(sTipoSeleccionar.equals(ComisionConfigConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					comisionconfigAux.setsDescripcionGeneralEntityReporte1(comisionconfigAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ComisionConfigConstantesFunciones.LABEL_IDTIPOCOMISIONCONFIG)) {
					existe=true;
					comisionconfigAux.setsDescripcionGeneralEntityReporte1(comisionconfigAux.gettipocomisionconfig_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ComisionConfigConstantesFunciones.LABEL_IDNIVELLINEA)) {
					existe=true;
					comisionconfigAux.setsDescripcionGeneralEntityReporte1(comisionconfigAux.getnivellinea_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ComisionConfigConstantesFunciones.LABEL_CONVENDEDOR)) {
					existe=true;
					comisionconfigAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(comisionconfigAux.getcon_vendedor()));
				}
				 else if(sTipoSeleccionar.equals(ComisionConfigConstantesFunciones.LABEL_CONVENTAS)) {
					existe=true;
					comisionconfigAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(comisionconfigAux.getcon_ventas()));
				}
				 else if(sTipoSeleccionar.equals(ComisionConfigConstantesFunciones.LABEL_CONCOBROS)) {
					existe=true;
					comisionconfigAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(comisionconfigAux.getcon_cobros()));
				}
				 else if(sTipoSeleccionar.equals(ComisionConfigConstantesFunciones.LABEL_CONREMESATRANSITO)) {
					existe=true;
					comisionconfigAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(comisionconfigAux.getcon_remesa_transito()));
				}
				 else if(sTipoSeleccionar.equals(ComisionConfigConstantesFunciones.LABEL_CONPENALIDAD)) {
					existe=true;
					comisionconfigAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(comisionconfigAux.getcon_penalidad()));
				}
				 else if(sTipoSeleccionar.equals(ComisionConfigConstantesFunciones.LABEL_CONABONO)) {
					existe=true;
					comisionconfigAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(comisionconfigAux.getcon_abono()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionConfigConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesComisionConfig(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoComisionConfig=true;
				this.isVisibilidadCeldaNuevoRelacionesComisionConfig=true;
				this.isVisibilidadCeldaGuardarCambiosComisionConfig=true;
			}
			
			this.isVisibilidadCeldaModificarComisionConfig=false;
			this.isVisibilidadCeldaActualizarComisionConfig=false;
			this.isVisibilidadCeldaEliminarComisionConfig=false;
			this.isVisibilidadCeldaCancelarComisionConfig=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarComisionConfig=true;
				} else {
					this.isVisibilidadCeldaGuardarComisionConfig=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoComisionConfig=false;
			this.isVisibilidadCeldaNuevoRelacionesComisionConfig=false;
			this.isVisibilidadCeldaGuardarCambiosComisionConfig=false;
			this.isVisibilidadCeldaModificarComisionConfig=false;
			this.isVisibilidadCeldaActualizarComisionConfig=true;
			this.isVisibilidadCeldaEliminarComisionConfig=false;
			this.isVisibilidadCeldaCancelarComisionConfig=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarComisionConfig=true;
				} else {
					this.isVisibilidadCeldaGuardarComisionConfig=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoComisionConfig=false;
			this.isVisibilidadCeldaNuevoRelacionesComisionConfig=false;
			this.isVisibilidadCeldaGuardarCambiosComisionConfig=false;
			this.isVisibilidadCeldaModificarComisionConfig=false;
			this.isVisibilidadCeldaActualizarComisionConfig=true;
			this.isVisibilidadCeldaEliminarComisionConfig=true;
			this.isVisibilidadCeldaCancelarComisionConfig=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarComisionConfig=true;
				} else {
					this.isVisibilidadCeldaGuardarComisionConfig=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoComisionConfig=false;
			this.isVisibilidadCeldaNuevoRelacionesComisionConfig=false;
			this.isVisibilidadCeldaGuardarCambiosComisionConfig=false;
			this.isVisibilidadCeldaModificarComisionConfig=false;
			this.isVisibilidadCeldaActualizarComisionConfig=true;
			this.isVisibilidadCeldaEliminarComisionConfig=false;
			this.isVisibilidadCeldaCancelarComisionConfig=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarComisionConfig=false;
				} else {
					this.isVisibilidadCeldaGuardarComisionConfig=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoComisionConfig=true;
			this.isVisibilidadCeldaNuevoRelacionesComisionConfig=true;
			this.isVisibilidadCeldaGuardarCambiosComisionConfig=true;
			this.isVisibilidadCeldaModificarComisionConfig=false;
			this.isVisibilidadCeldaActualizarComisionConfig=false;
			this.isVisibilidadCeldaEliminarComisionConfig=false;
			this.isVisibilidadCeldaCancelarComisionConfig=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarComisionConfig=true;
				} else {
					this.isVisibilidadCeldaGuardarComisionConfig=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoComisionConfig=false;
			this.isVisibilidadCeldaNuevoRelacionesComisionConfig=false;
			this.isVisibilidadCeldaGuardarCambiosComisionConfig=false;
			this.isVisibilidadCeldaActualizarComisionConfig=false;
			this.isVisibilidadCeldaEliminarComisionConfig=false;
			this.isVisibilidadCeldaCancelarComisionConfig=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarComisionConfig=false;
				} else {
					this.isVisibilidadCeldaGuardarComisionConfig=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoComisionConfig=false;
			this.isVisibilidadCeldaNuevoRelacionesComisionConfig=false;
			this.isVisibilidadCeldaGuardarCambiosComisionConfig=false;
			this.isVisibilidadCeldaModificarComisionConfig=true;
			this.isVisibilidadCeldaActualizarComisionConfig=false;
			this.isVisibilidadCeldaEliminarComisionConfig=false;
			this.isVisibilidadCeldaCancelarComisionConfig=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarComisionConfig=false;
				} else {
					this.isVisibilidadCeldaGuardarComisionConfig=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ComisionConfigJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoComisionConfig=true;
			this.isVisibilidadCeldaNuevoRelacionesComisionConfig=true;
			this.isVisibilidadCeldaGuardarCambiosComisionConfig=true;
		} else {
			this.actualizarEstadoPanelsComisionConfig(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarComisionConfig=false;
			//this.isVisibilidadCeldaVerFormComisionConfig=false;
			this.isVisibilidadCeldaDuplicarComisionConfig=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!comisionconfigSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesComisionConfig=false;
		} else {
			this.isVisibilidadCeldaNuevoComisionConfig=false;
			this.isVisibilidadCeldaGuardarCambiosComisionConfig=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(comisionconfigSessionBean.getEsGuardarRelacionado()) {
			if(!comisionconfigSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesComisionConfig=false;												
			}
			
			this.jButtonCerrarComisionConfig.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesComisionConfig=false;
		}
		
		if(!this.permiteMantenimiento(this.comisionconfig)) {
			this.isVisibilidadCeldaActualizarComisionConfig=false;
			this.isVisibilidadCeldaEliminarComisionConfig=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesComisionConfig() {
		this.isVisibilidadCeldaNuevoComisionConfig=false;
		this.isVisibilidadCeldaGuardarCambiosComisionConfig=false;
	}
	
	public void actualizarEstadoPanelsComisionConfig(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionComisionConfig!=null) {
				this.jScrollPanelDatosEdicionComisionConfig.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComisionConfig!=null) {
				this.jTabbedPaneBusquedasComisionConfig.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosComisionConfig!=null) {
				this.jScrollPanelDatosComisionConfig.setVisible(true);
			}
			
			if(this.jPanelPaginacionComisionConfig!=null) {
				this.jPanelPaginacionComisionConfig.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesComisionConfig!=null) {
				this.jPanelParametrosReportesComisionConfig.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionComisionConfig!=null) {
				this.jScrollPanelDatosEdicionComisionConfig.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComisionConfig!=null) {
				this.jTabbedPaneBusquedasComisionConfig.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosComisionConfig!=null) {
				this.jScrollPanelDatosComisionConfig.setVisible(false);
			}
			
			if(this.jPanelPaginacionComisionConfig!=null) {
				this.jPanelPaginacionComisionConfig.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesComisionConfig!=null) {
				this.jPanelParametrosReportesComisionConfig.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionComisionConfig!=null) {
				this.jScrollPanelDatosEdicionComisionConfig.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComisionConfig!=null) {
				this.jTabbedPaneBusquedasComisionConfig.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosComisionConfig!=null) {
				this.jScrollPanelDatosComisionConfig.setVisible(false);
			}
			
			if(this.jPanelPaginacionComisionConfig!=null) {
				this.jPanelPaginacionComisionConfig.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesComisionConfig!=null) {
				this.jPanelParametrosReportesComisionConfig.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionComisionConfig!=null) {
				this.jScrollPanelDatosEdicionComisionConfig.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComisionConfig!=null) {
				this.jTabbedPaneBusquedasComisionConfig.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosComisionConfig!=null) {
				this.jScrollPanelDatosComisionConfig.setVisible(false);
			}
			
			if(this.jPanelPaginacionComisionConfig!=null) {
				this.jPanelPaginacionComisionConfig.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesComisionConfig!=null) {
				this.jPanelParametrosReportesComisionConfig.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionComisionConfig!=null) {
				this.jScrollPanelDatosEdicionComisionConfig.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComisionConfig!=null) {
				this.jTabbedPaneBusquedasComisionConfig.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosComisionConfig!=null) {
				this.jScrollPanelDatosComisionConfig.setVisible(true);
			}
			
			if(this.jPanelPaginacionComisionConfig!=null) {
				this.jPanelPaginacionComisionConfig.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesComisionConfig!=null) {
				this.jPanelParametrosReportesComisionConfig.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionComisionConfig!=null) {
				this.jScrollPanelDatosEdicionComisionConfig.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComisionConfig!=null) {
				this.jTabbedPaneBusquedasComisionConfig.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosComisionConfig!=null) {
				this.jScrollPanelDatosComisionConfig.setVisible(true);
			}
			
			if(this.jPanelPaginacionComisionConfig!=null) {
				this.jPanelPaginacionComisionConfig.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesComisionConfig!=null) {
				this.jPanelParametrosReportesComisionConfig.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionComisionConfig!=null) {
				this.jScrollPanelDatosEdicionComisionConfig.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComisionConfig!=null) {
				this.jTabbedPaneBusquedasComisionConfig.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosComisionConfig!=null) {
				this.jScrollPanelDatosComisionConfig.setVisible(true);
			}
			
			if(this.jPanelPaginacionComisionConfig!=null) {
				this.jPanelPaginacionComisionConfig.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesComisionConfig!=null) {
				this.jPanelParametrosReportesComisionConfig.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.comisionconfigSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasComisionConfig!=null) {
					this.jTabbedPaneBusquedasComisionConfig.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesComisionConfig!=null) {
				this.jPanelParametrosReportesComisionConfig.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.comisionconfigSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComisionConfig!=null) {
				this.jTabbedPaneBusquedasComisionConfig.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesComisionConfig!=null) {
				this.jPanelParametrosReportesComisionConfig.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdNivelLinea=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdNivelLinea) {this.jTabbedPaneBusquedasComisionConfig.remove(jPanelFK_IdNivelLineaComisionConfig);}

			this.isVisibilidadFK_IdTipoComisionConfig=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoComisionConfig) {this.jTabbedPaneBusquedasComisionConfig.remove(jPanelFK_IdTipoComisionConfigComisionConfig);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoComisionConfig(Boolean isParaTipoComisionConfig){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoComisionConfigNegation=!isParaTipoComisionConfig;

			this.isVisibilidadFK_IdNivelLinea=isParaTipoComisionConfigNegation;
			if(!this.isVisibilidadFK_IdNivelLinea) {this.jTabbedPaneBusquedasComisionConfig.remove(jPanelFK_IdNivelLineaComisionConfig);}

			this.isVisibilidadFK_IdTipoComisionConfig=isParaTipoComisionConfig;
			if(!this.isVisibilidadFK_IdTipoComisionConfig) {this.jTabbedPaneBusquedasComisionConfig.remove(jPanelFK_IdTipoComisionConfigComisionConfig);}
		}
		
	}

	public void setVisibilidadBusquedasParaNivelLinea(Boolean isParaNivelLinea){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaNivelLineaNegation=!isParaNivelLinea;

			this.isVisibilidadFK_IdNivelLinea=isParaNivelLinea;
			if(!this.isVisibilidadFK_IdNivelLinea) {this.jTabbedPaneBusquedasComisionConfig.remove(jPanelFK_IdNivelLineaComisionConfig);}

			this.isVisibilidadFK_IdTipoComisionConfig=isParaNivelLineaNegation;
			if(!this.isVisibilidadFK_IdTipoComisionConfig) {this.jTabbedPaneBusquedasComisionConfig.remove(jPanelFK_IdTipoComisionConfigComisionConfig);}
		}
		
	}
	
	

	public String registrarSesionComisionConfigParaComisionCates() throws Exception {
		Boolean isPaginaPopupComisionCate=false;

		try {

			if(this.comisionconfigSessionBean==null) {
				this.comisionconfigSessionBean=new ComisionConfigSessionBean();
			}

			if(this.jInternalFrameDetalleFormComisionConfig.comisioncateSessionBean==null) {
				this.jInternalFrameDetalleFormComisionConfig.comisioncateSessionBean=new ComisionCateSessionBean();
			}

			this.jInternalFrameDetalleFormComisionConfig.comisioncateSessionBean.setsPathNavegacionActual(comisionconfigSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ComisionCateConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormComisionConfig.comisioncateSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupComisionCate=this.jInternalFrameDetalleFormComisionConfig.comisioncateSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormComisionConfig.comisioncateSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeComisionCate(true);
			this.jInternalFrameDetalleFormComisionConfig.comisioncateSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeComisionCate(ComisionConfigConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormComisionConfig.comisioncateSessionBean.setisBusquedaDesdeForeignKeySesionComisionConfig(true);
			this.jInternalFrameDetalleFormComisionConfig.comisioncateSessionBean.setlidComisionConfigActual(this.idComisionConfigActual);

			comisionconfigSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyComisionConfig(true);
			comisionconfigSessionBean.setlIdComisionConfigActualForeignKey(this.idComisionConfigActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionComisionConfigParaComisionMarcas() throws Exception {
		Boolean isPaginaPopupComisionMarca=false;

		try {

			if(this.comisionconfigSessionBean==null) {
				this.comisionconfigSessionBean=new ComisionConfigSessionBean();
			}

			if(this.jInternalFrameDetalleFormComisionConfig.comisionmarcaSessionBean==null) {
				this.jInternalFrameDetalleFormComisionConfig.comisionmarcaSessionBean=new ComisionMarcaSessionBean();
			}

			this.jInternalFrameDetalleFormComisionConfig.comisionmarcaSessionBean.setsPathNavegacionActual(comisionconfigSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ComisionMarcaConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormComisionConfig.comisionmarcaSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupComisionMarca=this.jInternalFrameDetalleFormComisionConfig.comisionmarcaSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormComisionConfig.comisionmarcaSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeComisionMarca(true);
			this.jInternalFrameDetalleFormComisionConfig.comisionmarcaSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeComisionMarca(ComisionConfigConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormComisionConfig.comisionmarcaSessionBean.setisBusquedaDesdeForeignKeySesionComisionConfig(true);
			this.jInternalFrameDetalleFormComisionConfig.comisionmarcaSessionBean.setlidComisionConfigActual(this.idComisionConfigActual);

			comisionconfigSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyComisionConfig(true);
			comisionconfigSessionBean.setlIdComisionConfigActualForeignKey(this.idComisionConfigActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionComisionConfigParaComisionLineas() throws Exception {
		Boolean isPaginaPopupComisionLinea=false;

		try {

			if(this.comisionconfigSessionBean==null) {
				this.comisionconfigSessionBean=new ComisionConfigSessionBean();
			}

			if(this.jInternalFrameDetalleFormComisionConfig.comisionlineaSessionBean==null) {
				this.jInternalFrameDetalleFormComisionConfig.comisionlineaSessionBean=new ComisionLineaSessionBean();
			}

			this.jInternalFrameDetalleFormComisionConfig.comisionlineaSessionBean.setsPathNavegacionActual(comisionconfigSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ComisionLineaConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormComisionConfig.comisionlineaSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupComisionLinea=this.jInternalFrameDetalleFormComisionConfig.comisionlineaSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormComisionConfig.comisionlineaSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeComisionLinea(true);
			this.jInternalFrameDetalleFormComisionConfig.comisionlineaSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeComisionLinea(ComisionConfigConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormComisionConfig.comisionlineaSessionBean.setisBusquedaDesdeForeignKeySesionComisionConfig(true);
			this.jInternalFrameDetalleFormComisionConfig.comisionlineaSessionBean.setlidComisionConfigActual(this.idComisionConfigActual);

			comisionconfigSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyComisionConfig(true);
			comisionconfigSessionBean.setlIdComisionConfigActualForeignKey(this.idComisionConfigActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionComisionConfigParaComisionPenas() throws Exception {
		Boolean isPaginaPopupComisionPena=false;

		try {

			if(this.comisionconfigSessionBean==null) {
				this.comisionconfigSessionBean=new ComisionConfigSessionBean();
			}

			if(this.jInternalFrameDetalleFormComisionConfig.comisionpenaSessionBean==null) {
				this.jInternalFrameDetalleFormComisionConfig.comisionpenaSessionBean=new ComisionPenaSessionBean();
			}

			this.jInternalFrameDetalleFormComisionConfig.comisionpenaSessionBean.setsPathNavegacionActual(comisionconfigSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ComisionPenaConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormComisionConfig.comisionpenaSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupComisionPena=this.jInternalFrameDetalleFormComisionConfig.comisionpenaSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormComisionConfig.comisionpenaSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeComisionPena(true);
			this.jInternalFrameDetalleFormComisionConfig.comisionpenaSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeComisionPena(ComisionConfigConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormComisionConfig.comisionpenaSessionBean.setisBusquedaDesdeForeignKeySesionComisionConfig(true);
			this.jInternalFrameDetalleFormComisionConfig.comisionpenaSessionBean.setlidComisionConfigActual(this.idComisionConfigActual);

			comisionconfigSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyComisionConfig(true);
			comisionconfigSessionBean.setlIdComisionConfigActualForeignKey(this.idComisionConfigActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionComisionConfigParaComisionGrupos() throws Exception {
		Boolean isPaginaPopupComisionGrupo=false;

		try {

			if(this.comisionconfigSessionBean==null) {
				this.comisionconfigSessionBean=new ComisionConfigSessionBean();
			}

			if(this.jInternalFrameDetalleFormComisionConfig.comisiongrupoSessionBean==null) {
				this.jInternalFrameDetalleFormComisionConfig.comisiongrupoSessionBean=new ComisionGrupoSessionBean();
			}

			this.jInternalFrameDetalleFormComisionConfig.comisiongrupoSessionBean.setsPathNavegacionActual(comisionconfigSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ComisionGrupoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormComisionConfig.comisiongrupoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupComisionGrupo=this.jInternalFrameDetalleFormComisionConfig.comisiongrupoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormComisionConfig.comisiongrupoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeComisionGrupo(true);
			this.jInternalFrameDetalleFormComisionConfig.comisiongrupoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeComisionGrupo(ComisionConfigConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormComisionConfig.comisiongrupoSessionBean.setisBusquedaDesdeForeignKeySesionComisionConfig(true);
			this.jInternalFrameDetalleFormComisionConfig.comisiongrupoSessionBean.setlidComisionConfigActual(this.idComisionConfigActual);

			comisionconfigSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyComisionConfig(true);
			comisionconfigSessionBean.setlIdComisionConfigActualForeignKey(this.idComisionConfigActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//ComisionConfigSessionBean comisionconfigSessionBean=new ComisionConfigSessionBean();
		
		if(this.comisionconfigSessionBean==null) {
			this.comisionconfigSessionBean=new ComisionConfigSessionBean();
		}
		
		this.comisionconfigSessionBean.setsUltimaBusquedaComisionConfig(this.getsAccionBusqueda());
		this.comisionconfigSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.comisionconfigSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			comisionconfigSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdNivelLinea")) {
			comisionconfigSessionBean.setid_nivel_linea(this.getid_nivel_lineaFK_IdNivelLinea());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoComisionConfig")) {
			comisionconfigSessionBean.setid_tipo_comision_config(this.getid_tipo_comision_configFK_IdTipoComisionConfig());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//ComisionConfigSessionBean comisionconfigSessionBean=new ComisionConfigSessionBean();
		
		if(this.comisionconfigSessionBean==null) {
			this.comisionconfigSessionBean=new ComisionConfigSessionBean();
		}
		
		if(this.comisionconfigSessionBean.getsUltimaBusquedaComisionConfig()!=null&&!this.comisionconfigSessionBean.getsUltimaBusquedaComisionConfig().equals("")) {
			this.setsAccionBusqueda(comisionconfigSessionBean.getsUltimaBusquedaComisionConfig());
			this.setiNumeroPaginacion(comisionconfigSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(comisionconfigSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(comisionconfigSessionBean.getid_empresa());
				comisionconfigSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdNivelLinea")) {
				this.setid_nivel_lineaFK_IdNivelLinea(comisionconfigSessionBean.getid_nivel_linea());
				comisionconfigSessionBean.setid_nivel_linea(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoComisionConfig")) {
				this.setid_tipo_comision_configFK_IdTipoComisionConfig(comisionconfigSessionBean.getid_tipo_comision_config());
				comisionconfigSessionBean.setid_tipo_comision_config(-1L);
			}
		}
		
		this.comisionconfigSessionBean.setsUltimaBusquedaComisionConfig("");
		this.comisionconfigSessionBean.setiNumeroPaginacion(ComisionConfigConstantesFunciones.INUMEROPAGINACION);
		this.comisionconfigSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaComisionConfig(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioComisionConfig() {
		this.updateBorderResaltarBusquedasFormularioComisionConfig();
		this.updateVisibilidadBusquedasFormularioComisionConfig();
		this.updateHabilitarBusquedasFormularioComisionConfig();
	}
	
	public void updateBorderResaltarBusquedasFormularioComisionConfig() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasComisionConfig.getComponents().length>0) {
	

		if(this.comisionconfigConstantesFunciones.resaltarFK_IdNivelLineaComisionConfig!=null) {
			index= this.jTabbedPaneBusquedasComisionConfig.indexOfComponent(this.jPanelFK_IdNivelLineaComisionConfig);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasComisionConfig.getComponent(index);
				jPanel.setBorder(this.comisionconfigConstantesFunciones.resaltarFK_IdNivelLineaComisionConfig);
			}
		}

		if(this.comisionconfigConstantesFunciones.resaltarFK_IdTipoComisionConfigComisionConfig!=null) {
			index= this.jTabbedPaneBusquedasComisionConfig.indexOfComponent(this.jPanelFK_IdTipoComisionConfigComisionConfig);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasComisionConfig.getComponent(index);
				jPanel.setBorder(this.comisionconfigConstantesFunciones.resaltarFK_IdTipoComisionConfigComisionConfig);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioComisionConfig() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasComisionConfig.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasComisionConfig.indexOfComponent(this.jPanelFK_IdNivelLineaComisionConfig);
			jPanel=(JPanel)this.jTabbedPaneBusquedasComisionConfig.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.comisionconfigConstantesFunciones.mostrarFK_IdNivelLineaComisionConfig);
			if(!this.comisionconfigConstantesFunciones.mostrarFK_IdNivelLineaComisionConfig && index>-1) {
				this.jTabbedPaneBusquedasComisionConfig.remove(index);
			}

			index= this.jTabbedPaneBusquedasComisionConfig.indexOfComponent(this.jPanelFK_IdTipoComisionConfigComisionConfig);
			jPanel=(JPanel)this.jTabbedPaneBusquedasComisionConfig.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.comisionconfigConstantesFunciones.mostrarFK_IdTipoComisionConfigComisionConfig);
			if(!this.comisionconfigConstantesFunciones.mostrarFK_IdTipoComisionConfigComisionConfig && index>-1) {
				this.jTabbedPaneBusquedasComisionConfig.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioComisionConfig() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasComisionConfig.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasComisionConfig.indexOfComponent(this.jPanelFK_IdNivelLineaComisionConfig);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasComisionConfig.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.comisionconfigConstantesFunciones.activarFK_IdNivelLineaComisionConfig);
				this.jTabbedPaneBusquedasComisionConfig.setEnabledAt(index,this.comisionconfigConstantesFunciones.activarFK_IdNivelLineaComisionConfig);
			}

			index= this.jTabbedPaneBusquedasComisionConfig.indexOfComponent(this.jPanelFK_IdTipoComisionConfigComisionConfig);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasComisionConfig.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.comisionconfigConstantesFunciones.activarFK_IdTipoComisionConfigComisionConfig);
				this.jTabbedPaneBusquedasComisionConfig.setEnabledAt(index,this.comisionconfigConstantesFunciones.activarFK_IdTipoComisionConfigComisionConfig);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaComisionConfig(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdNivelLinea")) {
			index= this.jTabbedPaneBusquedasComisionConfig.indexOfComponent(this.jPanelFK_IdNivelLineaComisionConfig);

			this.jTabbedPaneBusquedasComisionConfig.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasComisionConfig.getComponent(index);

			this.comisionconfigConstantesFunciones.setResaltarFK_IdNivelLineaComisionConfig(resaltar);

			jPanel.setBorder(this.comisionconfigConstantesFunciones.resaltarFK_IdNivelLineaComisionConfig);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoComisionConfig")) {
			index= this.jTabbedPaneBusquedasComisionConfig.indexOfComponent(this.jPanelFK_IdTipoComisionConfigComisionConfig);

			this.jTabbedPaneBusquedasComisionConfig.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasComisionConfig.getComponent(index);

			this.comisionconfigConstantesFunciones.setResaltarFK_IdTipoComisionConfigComisionConfig(resaltar);

			jPanel.setBorder(this.comisionconfigConstantesFunciones.resaltarFK_IdTipoComisionConfigComisionConfig);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarComisionConfig.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioComisionConfig() throws Exception {

		if(this.jInternalFrameDetalleFormComisionConfig==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioComisionConfig();
		this.updateVisibilidadResaltarControlesFormularioComisionConfig();
		this.updateHabilitarResaltarControlesFormularioComisionConfig();
		
	}
	
	public void updateBorderResaltarControlesFormularioComisionConfig() throws Exception {
		if(this.jInternalFrameDetalleFormComisionConfig==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.comisionconfigConstantesFunciones.resaltaridComisionConfig!=null && this.jInternalFrameDetalleFormComisionConfig!=null) {this.jInternalFrameDetalleFormComisionConfig.jLabelidComisionConfig.setBorder(this.comisionconfigConstantesFunciones.resaltaridComisionConfig);}
		if(this.comisionconfigConstantesFunciones.resaltarid_empresaComisionConfig!=null && this.jInternalFrameDetalleFormComisionConfig!=null) {this.jInternalFrameDetalleFormComisionConfig.jComboBoxid_empresaComisionConfig.setBorder(this.comisionconfigConstantesFunciones.resaltarid_empresaComisionConfig);}
		if(this.comisionconfigConstantesFunciones.resaltarid_tipo_comision_configComisionConfig!=null && this.jInternalFrameDetalleFormComisionConfig!=null) {this.jInternalFrameDetalleFormComisionConfig.jComboBoxid_tipo_comision_configComisionConfig.setBorder(this.comisionconfigConstantesFunciones.resaltarid_tipo_comision_configComisionConfig);}
		if(this.comisionconfigConstantesFunciones.resaltarid_nivel_lineaComisionConfig!=null && this.jInternalFrameDetalleFormComisionConfig!=null) {this.jInternalFrameDetalleFormComisionConfig.jComboBoxid_nivel_lineaComisionConfig.setBorder(this.comisionconfigConstantesFunciones.resaltarid_nivel_lineaComisionConfig);}
		if(this.comisionconfigConstantesFunciones.resaltarcon_vendedorComisionConfig!=null && this.jInternalFrameDetalleFormComisionConfig!=null) {this.jInternalFrameDetalleFormComisionConfig.jCheckBoxcon_vendedorComisionConfig.setBorderPainted(true);this.jInternalFrameDetalleFormComisionConfig.jCheckBoxcon_vendedorComisionConfig.setBorder(this.comisionconfigConstantesFunciones.resaltarcon_vendedorComisionConfig);}
		if(this.comisionconfigConstantesFunciones.resaltarcon_ventasComisionConfig!=null && this.jInternalFrameDetalleFormComisionConfig!=null) {this.jInternalFrameDetalleFormComisionConfig.jCheckBoxcon_ventasComisionConfig.setBorderPainted(true);this.jInternalFrameDetalleFormComisionConfig.jCheckBoxcon_ventasComisionConfig.setBorder(this.comisionconfigConstantesFunciones.resaltarcon_ventasComisionConfig);}
		if(this.comisionconfigConstantesFunciones.resaltarcon_cobrosComisionConfig!=null && this.jInternalFrameDetalleFormComisionConfig!=null) {this.jInternalFrameDetalleFormComisionConfig.jCheckBoxcon_cobrosComisionConfig.setBorderPainted(true);this.jInternalFrameDetalleFormComisionConfig.jCheckBoxcon_cobrosComisionConfig.setBorder(this.comisionconfigConstantesFunciones.resaltarcon_cobrosComisionConfig);}
		if(this.comisionconfigConstantesFunciones.resaltarcon_remesa_transitoComisionConfig!=null && this.jInternalFrameDetalleFormComisionConfig!=null) {this.jInternalFrameDetalleFormComisionConfig.jCheckBoxcon_remesa_transitoComisionConfig.setBorderPainted(true);this.jInternalFrameDetalleFormComisionConfig.jCheckBoxcon_remesa_transitoComisionConfig.setBorder(this.comisionconfigConstantesFunciones.resaltarcon_remesa_transitoComisionConfig);}
		if(this.comisionconfigConstantesFunciones.resaltarcon_penalidadComisionConfig!=null && this.jInternalFrameDetalleFormComisionConfig!=null) {this.jInternalFrameDetalleFormComisionConfig.jCheckBoxcon_penalidadComisionConfig.setBorderPainted(true);this.jInternalFrameDetalleFormComisionConfig.jCheckBoxcon_penalidadComisionConfig.setBorder(this.comisionconfigConstantesFunciones.resaltarcon_penalidadComisionConfig);}
		if(this.comisionconfigConstantesFunciones.resaltarcon_abonoComisionConfig!=null && this.jInternalFrameDetalleFormComisionConfig!=null) {this.jInternalFrameDetalleFormComisionConfig.jCheckBoxcon_abonoComisionConfig.setBorderPainted(true);this.jInternalFrameDetalleFormComisionConfig.jCheckBoxcon_abonoComisionConfig.setBorder(this.comisionconfigConstantesFunciones.resaltarcon_abonoComisionConfig);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioComisionConfig() throws Exception {		
		if(this.jInternalFrameDetalleFormComisionConfig==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormComisionConfig!=null) {
	
		//this.jInternalFrameDetalleFormComisionConfig.jLabelidComisionConfig.setVisible(this.comisionconfigConstantesFunciones.mostraridComisionConfig);
		this.jInternalFrameDetalleFormComisionConfig.jPanelidComisionConfig.setVisible(this.comisionconfigConstantesFunciones.mostraridComisionConfig);
		//this.jInternalFrameDetalleFormComisionConfig.jComboBoxid_empresaComisionConfig.setVisible(this.comisionconfigConstantesFunciones.mostrarid_empresaComisionConfig);
		this.jInternalFrameDetalleFormComisionConfig.jPanelid_empresaComisionConfig.setVisible(this.comisionconfigConstantesFunciones.mostrarid_empresaComisionConfig);
		//this.jInternalFrameDetalleFormComisionConfig.jComboBoxid_tipo_comision_configComisionConfig.setVisible(this.comisionconfigConstantesFunciones.mostrarid_tipo_comision_configComisionConfig);
		this.jInternalFrameDetalleFormComisionConfig.jPanelid_tipo_comision_configComisionConfig.setVisible(this.comisionconfigConstantesFunciones.mostrarid_tipo_comision_configComisionConfig);
		//this.jInternalFrameDetalleFormComisionConfig.jComboBoxid_nivel_lineaComisionConfig.setVisible(this.comisionconfigConstantesFunciones.mostrarid_nivel_lineaComisionConfig);
		this.jInternalFrameDetalleFormComisionConfig.jPanelid_nivel_lineaComisionConfig.setVisible(this.comisionconfigConstantesFunciones.mostrarid_nivel_lineaComisionConfig);
		//this.jInternalFrameDetalleFormComisionConfig.jCheckBoxcon_vendedorComisionConfig.setVisible(this.comisionconfigConstantesFunciones.mostrarcon_vendedorComisionConfig);
		this.jInternalFrameDetalleFormComisionConfig.jPanelcon_vendedorComisionConfig.setVisible(this.comisionconfigConstantesFunciones.mostrarcon_vendedorComisionConfig);
		//this.jInternalFrameDetalleFormComisionConfig.jCheckBoxcon_ventasComisionConfig.setVisible(this.comisionconfigConstantesFunciones.mostrarcon_ventasComisionConfig);
		this.jInternalFrameDetalleFormComisionConfig.jPanelcon_ventasComisionConfig.setVisible(this.comisionconfigConstantesFunciones.mostrarcon_ventasComisionConfig);
		//this.jInternalFrameDetalleFormComisionConfig.jCheckBoxcon_cobrosComisionConfig.setVisible(this.comisionconfigConstantesFunciones.mostrarcon_cobrosComisionConfig);
		this.jInternalFrameDetalleFormComisionConfig.jPanelcon_cobrosComisionConfig.setVisible(this.comisionconfigConstantesFunciones.mostrarcon_cobrosComisionConfig);
		//this.jInternalFrameDetalleFormComisionConfig.jCheckBoxcon_remesa_transitoComisionConfig.setVisible(this.comisionconfigConstantesFunciones.mostrarcon_remesa_transitoComisionConfig);
		this.jInternalFrameDetalleFormComisionConfig.jPanelcon_remesa_transitoComisionConfig.setVisible(this.comisionconfigConstantesFunciones.mostrarcon_remesa_transitoComisionConfig);
		//this.jInternalFrameDetalleFormComisionConfig.jCheckBoxcon_penalidadComisionConfig.setVisible(this.comisionconfigConstantesFunciones.mostrarcon_penalidadComisionConfig);
		this.jInternalFrameDetalleFormComisionConfig.jPanelcon_penalidadComisionConfig.setVisible(this.comisionconfigConstantesFunciones.mostrarcon_penalidadComisionConfig);
		//this.jInternalFrameDetalleFormComisionConfig.jCheckBoxcon_abonoComisionConfig.setVisible(this.comisionconfigConstantesFunciones.mostrarcon_abonoComisionConfig);
		this.jInternalFrameDetalleFormComisionConfig.jPanelcon_abonoComisionConfig.setVisible(this.comisionconfigConstantesFunciones.mostrarcon_abonoComisionConfig);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioComisionConfig() throws Exception {
		if(this.jInternalFrameDetalleFormComisionConfig==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormComisionConfig!=null) {
	
		this.jInternalFrameDetalleFormComisionConfig.jLabelidComisionConfig.setEnabled(this.comisionconfigConstantesFunciones.activaridComisionConfig);
		this.jInternalFrameDetalleFormComisionConfig.jComboBoxid_empresaComisionConfig.setEnabled(this.comisionconfigConstantesFunciones.activarid_empresaComisionConfig);
		this.jInternalFrameDetalleFormComisionConfig.jComboBoxid_tipo_comision_configComisionConfig.setEnabled(this.comisionconfigConstantesFunciones.activarid_tipo_comision_configComisionConfig);
		this.jInternalFrameDetalleFormComisionConfig.jComboBoxid_nivel_lineaComisionConfig.setEnabled(this.comisionconfigConstantesFunciones.activarid_nivel_lineaComisionConfig);
		this.jInternalFrameDetalleFormComisionConfig.jCheckBoxcon_vendedorComisionConfig.setEnabled(this.comisionconfigConstantesFunciones.activarcon_vendedorComisionConfig);
		this.jInternalFrameDetalleFormComisionConfig.jCheckBoxcon_ventasComisionConfig.setEnabled(this.comisionconfigConstantesFunciones.activarcon_ventasComisionConfig);
		this.jInternalFrameDetalleFormComisionConfig.jCheckBoxcon_cobrosComisionConfig.setEnabled(this.comisionconfigConstantesFunciones.activarcon_cobrosComisionConfig);
		this.jInternalFrameDetalleFormComisionConfig.jCheckBoxcon_remesa_transitoComisionConfig.setEnabled(this.comisionconfigConstantesFunciones.activarcon_remesa_transitoComisionConfig);
		this.jInternalFrameDetalleFormComisionConfig.jCheckBoxcon_penalidadComisionConfig.setEnabled(this.comisionconfigConstantesFunciones.activarcon_penalidadComisionConfig);
		this.jInternalFrameDetalleFormComisionConfig.jCheckBoxcon_abonoComisionConfig.setEnabled(this.comisionconfigConstantesFunciones.activarcon_abonoComisionConfig);
		}
	}
	
		
}